import java.util.*;
class TreeSetDemo{
public static void main(String args[]){
TreeSet m=new TreeSet();
m.add("a");
m.add("f");
m.add("n");
m.add("z");
System.out.println("a".compareTo("f"));
System.out.println("f".compareTo("z"));
System.out.println("a".compareTo("n"));
System.out.println("z".compareTo("f"));

}
}