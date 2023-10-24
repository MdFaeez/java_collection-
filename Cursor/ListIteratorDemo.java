import java.util.*;
class ListIteratorDemo{
public static void main(String args[]){

LinkedList l=new LinkedList();
l.add("one");
l.add("two");
l.add("three");
l.add("four");
System.out.println(l);

ListIterator lit=l.listIterator();
while(lit.hasNext()){
String s=(String)lit.next();
if(s.equals("one")){
lit.remove();
}
else if(s.equals("four")){
lit.add("musa");
}
}
System.out.println(l);
}
}