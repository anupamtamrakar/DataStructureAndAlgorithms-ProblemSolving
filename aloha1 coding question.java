import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    // Installation List
    static ArrayList<String> il = new ArrayList<String>();

    // Dependency Hashmap
    static HashMap<String, ArrayList<String>> dm = new HashMap<String, ArrayList<String>>();

    /*
     * Complete the function below.
     */

    static void doIt(String[] input) {

    }

    static void depend(String[] str, String _input_item) {

        System.out.println(_input_item);
        ArrayList<String> dl = new ArrayList<String>();
        for (int i = 2; i < str.length; i++) {
            String str1 = str[i];
            List li = dm.get(str1);
            if (li != null && li.contains(str[1]))
                System.out.println(str1 + " depends on " + str[1] + ", ignoring command");
            else
                dl.add(str[i]);
        }
        dm.put(str[1], dl);

    }

    static void install(String[] str, String _input_item) {
        System.out.println(_input_item);
        List<String> li = dm.get(str[1]);
        if(li != null){
            for (String s : li) {
                if (!il.contains(s)) {
                    for(String dependencyString : li){
                        if(!il.contains(dependencyString)){
                            System.out.println("Installing " + dependencyString);
                            il.add(dependencyString);
                        }
                    }
                    if(!il.contains(s)){
                        System.out.println("Installing " + s);
                        il.add(s);
                    }
                }

            }
            if(!il.contains(str[1])){
                System.out.println("Installing " + str[1]);
                    il.add(str[1]);
            }
            else{
                System.out.println(str[1] + " is already installed");
            }

        }
        else{ 
            if(!il.contains(str[1])){
                    System.out.println("Installing " + str[1]);
                    il.add(str[1]);
            }

        }
    }

    static void remove(String[] str, String _input_item) {
        System.out.println(_input_item);
        int flag = 0;
        if(!il.contains(str[1]))
            System.out.println(str[1] + " is not installed");
        else{
			
            for (Map.Entry<String, ArrayList<String>> entry : dm.entrySet()){
                List<String> removeList = entry.getValue();
                if(removeList.contains(str[1])){
                    System.out.println(str[1] + " is still needed");
                    flag =1;
                    break;
                }
            }
            
            if(flag == 0){
                System.out.println("Removing " + str[1]);
                il.remove(str[1]);
                dm.remove(str[1]);
            }
            List<String> dependencyList = dm.get(str[1]);
            if(dependencyList !=null){
                for(String strDep : dependencyList){
                    if(il.contains(strDep)){
                            for (Map.Entry<String, ArrayList<String>> entry : dm.entrySet()){
                                List<String> removeList = entry.getValue();
                                    if(removeList.contains(strDep)){
                                        flag =1;
                                        break;
                                    }
                            }
                        if(flag == 0){
                            System.out.println("Removing " + strDep);
                            il.remove(strDep);
                            dm.remove(strDep);
                        }
                    }
                }
            }
			else
			{
				System.out.println("Removing " + strDep);
                il.remove(strDep);
                dm.remove(strDep);
			}
			
        }
    }

    static void list(String input){
        System.out.println("LIST");
        for(String st : il){
            System.out.println(st);
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int _input_size = 0;
        _input_size = Integer.parseInt(in.nextLine().trim());
        String[] _input = new String[_input_size];
        String _input_item;
        for (int _input_i = 0; _input_i < _input_size; _input_i++) {
            try {
                _input_item = in.nextLine();
            } catch (Exception e) {
                _input_item = null;
            }
            _input[_input_i] = _input_item;

            String[] str = _input_item.split(" ");
           /* for(String st : str)
                System.out.print(st + " ");
            System.out.println();*/
            // Depend command
            if (str.length > 1 && str[0].equals("DEPEND")) {

                depend(str, _input_item);
            } else if (str.length == 2 && str[0].equals("INSTALL"))
                install(str, _input_item);

            else if (str.length == 2 && str[0].equals("REMOVE"))
                remove(str, _input_item);
            else if(_input_item.equals("LIST"))
                list(_input_item);
            else
                System.out.println("END");
        }

        doIt(_input);

    }
}


/* Input --

DEPEND TELNET TCPIP NETCARD
DEPEND TCPIP NETCARD
DEPEND NETCARD TCPIP
DEPEND DNS TCPIP NETCARD
DEPEND BROWSER TCPIP HTML
INSTALL NETCARD
INSTALL TELNET
INSTALL foo
REMOVE NETCARD
INSTALL BROWSER
INSTALL DNS
LIST
REMOVE TELNET
REMOVE NETCARD
REMOVE DNS
REMOVE NETCARD
INSTALL NETCARD
REMOVE TCPIP
REMOVE BROWSER
REMOVE TCPIP
LIST
END

*/

/* Expected output - 

DEPEND TELNET TCPIP NETCARD
DEPEND TCPIP NETCARD
DEPEND NETCARD TCPIP
TCPIP depends on NETCARD, ignoring command
DEPEND DNS TCPIP NETCARD
DEPEND BROWSER TCPIP HTML
INSTALL NETCARD
Installing NETCARD
INSTALL TELNET
Installing TCPIP
Installing TELNET
INSTALL foo
Installing foo
REMOVE NETCARD
NETCARD is still needed
INSTALL BROWSER
Installing HTML
Installing BROWSER
INSTALL DNS
Installing DNS
LIST
NETCARD
TCPIP
TELNET
foo
HTML
BROWSER
DNS
REMOVE TELNET
Removing TELNET
REMOVE NETCARD
NETCARD is still needed
REMOVE DNS
Removing DNS
REMOVE NETCARD
NETCARD is still needed
INSTALL NETCARD
NETCARD is already installed
REMOVE TCPIP
TCPIP is still needed
NETCARD is still needed
REMOVE BROWSER
Removing BROWSER
REMOVE TCPIP
Removing TCPIP
LIST
NETCARD
foo
HTML
END

*/
