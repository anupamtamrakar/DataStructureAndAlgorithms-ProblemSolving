class Flower  {     }
public class ClassCastException_Sample extends Flower
{
  public static void main(String args[])
  {
    Flower f = new Flower();;
    ClassCastException_Sample r = new ClassCastException_Sample();
				
    // f = r;
 
    r = (ClassCastException_Sample) f;
  }
}