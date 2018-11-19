/* Design file system with following commands
   DIR
   MKDIR
   CD
   UP
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
/*
 * Complete the function below.
 */
     class Node {
        public Node parent;
        public List<Node> child
        public String value;
        public Node(String val) {
            this.value = val;
            child = new ArrayList<>();
            parent = null;
        }
    }

    public static void mkdir(String value, Node parent) {
        System.out.println("Command: mkdir " + value);

        if(searchNode(value) != null)
            System.out.println("Subdirectory already exists");

        Node newNode = new Node(value);
        newNode.parent = parent.value;
        parent.child.add(newNode);
    }

    public static Node getcurParent(String currDirPath){
            String []str = currDirPath.split("/");
            int len = str.length;
            Node current = searchNode(str[len-1]);
            return current.parent; 
    }

    public static Node searchNode(String node){
        Node temp_root = root;
        if(temp_root.value == node)
            return temp_root;
        else{
                while(temp_root.child != null){
                    for (Node node1 : temp_root.child) {
                        if (node1.value.equals(node)) {
                            return node1;
                        }
                    }
                    temp_root = temp_root.child.child;
                }
            return null;
    }
        }
    }

    public static void callDirToChange(String cd){
        System.out.println("Command: cd " + cd);
        Node n = searchNode(cd);
        if(n == null)
            System.out.println("Subdirectory does not exist");
        else
            currentDir = n;
    }

    public static void Updirectory(){
        System.out.println("Command: up");
        currentDir = currentDir.parent;
    }

    public static void showDirectory(){
        System.out.println("Command: dir");

        System.out.println("Directory of " + currentDir.value + "\" )l
        String dirUrl ;
        Node cur = currentDir;
        while(currentDir != null){
        dirUrl = currentDir.value + "\" 

        }
        if(currentDir.child == null)
            System.out.println("No subdirectories");

        
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int _input_size = 0;
        _input_size = Integer.parseInt(in.nextLine().trim());
        String[] _input = new String[_input_size];
        String _input_item;
        for(int _input_i = 0; _input_i < _input_size; _input_i++) {
            try {
                _input_item = in.nextLine();
            } catch (Exception e) {
                _input_item = null;
            }
            _input[_input_i] = _input_item;
            
            String currDirPath;
            Node currentDir = root;
            //root node
            Node root = new Node("root");
            currDirPath = root.value + "/";
            
            if(_input[_input_i] == "dir"){
                showDirectory();
            }
            else if(_input_item == "up")
            {
                Updirectory()
            }
            else{
                String [] str = _input_item.split(" ");
                if(str[0] == "mkdir" && str.length == 2){
                    String dirName = str[1];
                    mkdir(dirName, getcurParent(currDirPath));
                   

                }
                else if(str[0] == "cd" && str.length ==2){
                    String DirToChange = str[1];
                    callDirToChange(DirToChange);
                }
                else{
                    System.out.println("Invalid command");
                }

            }
            
        }      
    }
}

// Sorted linked list

     
/*    private void insertNode(Node nodeToInsertAfter, Node newNode) {
        Node tmpNode;
        if (nodeToInsertAfter == null) {
            this.head.prev = newNode;
            tmpNode  = this.head;
            this.head = newNode;
            this.head.next = tmpNode;
            if (this.size <= 1) {
                this.tail = tmpNode;
                this.tail.next = null;
            }
        } else if (nodeToInsertAfter.next == null) {
            newNode.prev = nodeToInsertAfter;
            nodeToInsertAfter.next = newNode;
            this.tail = newNode;
        } else {
            Node prevNode, nextNode;
            prevNode = nodeToInsertAfter;
            nextNode = nodeToInsertAfter.next;
            prevNode.next = newNode;
            newNode.prev = prevNode;
            newNode.next = nextNode;
            nextNode.prev = newNode;
        }
        this.size++;
    }
    

    // Find the node that the new node will be inserted after it

    private Node findNodeToInsertAfter(Node newNode) {
        Node curNode = this.head;
        if (newNode.value < curNode.value) {import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
/*
 * Complete the function below.
 */
     class Node {
        public Node parent;
        public List<Node> child
        public String value;
        public Node(String val) {
            this.value = val;
            child = new ArrayList<>();
            parent = null;
        }
    }

    public static void mkdir(String value, Node parent) {
        System.out.println("Command: mkdir " + value);

        if(searchNode(value) != null)
            System.out.println("Subdirectory already exists");

        Node newNode = new Node(value);
        newNode.parent = parent.value;
        parent.child.add(newNode);
    }

    public static Node getcurParent(String currDirPath){
            String []str = currDirPath.split("/");
            int len = str.length;
            Node current = searchNode(str[len-1]);
            return current.parent; 
    }

    public static Node searchNode(String node){
        Node temp_root = root;
        if(temp_root.value == node)
            return temp_root;
        else{
                while(temp_root.child != null){
                    for (Node node1 : temp_root.child) {
                        if (node1.value.equals(node)) {
                            return node1;
                        }
                    }
                    temp_root = temp_root.child.child;
                }
            return null;
    }
        }
    }

    public static void callDirToChange(String cd){
        System.out.println("Command: cd " + cd);
        Node n = searchNode(cd);
        if(n == null)
            System.out.println("Subdirectory does not exist");
        else
            currentDir = n;
    }

    public static void Updirectory(){
        System.out.println("Command: up");
        currentDir = currentDir.parent;
    }

    public static void showDirectory(){
        System.out.println("Command: dir");

        String dirUrl ="";
        Node cur = currentDir;
        while(cur != null){
            dirUrl = cur.value + "\" + dirUrl;
            cur = cur.parent;
        }
        
        System.out.println("Directory of " + dirUrl );
        
        if(currentDir.child == null)
            System.out.println("No subdirectories");
        else{
            for (Node node1 : currentDir.child) {
                System.out.print(node1.value + " ");
                }
        }
        
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int _input_size = 0;
        _input_size = Integer.parseInt(in.nextLine().trim());
        String[] _input = new String[_input_size];
        String _input_item;
        for(int _input_i = 0; _input_i < _input_size; _input_i++) {
            try {
                _input_item = in.nextLine();
            } catch (Exception e) {
                _input_item = null;
            }
            _input[_input_i] = _input_item;
            
            String currDirPath;
            Node currentDir = root;
            //root node
            Node root = new Node("root");
            currDirPath = root.value + "/";
            
            if(_input[_input_i] == "dir"){
                showDirectory();
            }
            else if(_input_item == "up")
            {
                Updirectory()
            }
            else{
                String [] str = _input_item.split(" ");
                if(str[0] == "mkdir" && str.length == 2){
                    String dirName = str[1];
                    mkdir(dirName, getcurParent(currDirPath));
                   

                }
                else if(str[0] == "cd" && str.length ==2){
                    String DirToChange = str[1];
                    callDirToChange(DirToChange);
                }
                else{
                    System.out.println("Invalid command");
                }

            }
            
        }      
    }
}

// Sorted linked list

     
/*    private void insertNode(Node nodeToInsertAfter, Node newNode) {
        Node tmpNode;
        if (nodeToInsertAfter == null) {
            this.head.prev = newNode;
            tmpNode  = this.head;
            this.head = newNode;
            this.head.next = tmpNode;
            if (this.size <= 1) {
                this.tail = tmpNode;
                this.tail.next = null;
            }
        } else if (nodeToInsertAfter.next == null) {
            newNode.prev = nodeToInsertAfter;
            nodeToInsertAfter.next = newNode;
            this.tail = newNode;
        } else {
            Node prevNode, nextNode;
            prevNode = nodeToInsertAfter;
            nextNode = nodeToInsertAfter.next;
            prevNode.next = newNode;
            newNode.prev = prevNode;
            newNode.next = nextNode;
            nextNode.prev = newNode;
        }
        this.size++;
    }
    

    // Find the node that the new node will be inserted after it

    private Node findNodeToInsertAfter(Node newNode) {
        Node curNode = this.head;
        if (newNode.value < curNode.value) {
            return null;
        }
        while(curNode.next != null) {
            if (newNode.value == curNode.value) {
                return curNode;
            }
            else if (newNode.value > curNode.value && newNode.value < curNode.next.value) {
                return curNode;
            }
            curNode = curNode.next;
        }
        return curNode;
    }
     */


     


            return null;
        }
        while(curNode.next != null) {
            if (newNode.value == curNode.value) {
                return curNode;
            }
            else if (newNode.value > curNode.value && newNode.value < curNode.next.value) {
                return curNode;
            }
            curNode = curNode.next;
        }
        return curNode;
    }
     */


     

