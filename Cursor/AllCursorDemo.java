import java.util.*;
class CursorDemo{
public static void main(String args[]){

Vector v=new Vector();
Enumeration e=v.elements();
Iterator it=v.iterator();
ListIterator lit=v.listIterator();

System.out.println(e.getClass().getName());
System.out.println(it.getClass().getName());
System.out.println(lit.getClass().getName());
}
}