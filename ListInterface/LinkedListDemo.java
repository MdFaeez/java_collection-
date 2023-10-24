import java.util.*;
class LinkedListDemo{
public static void main(String args[]){
LinkedList l=new LinkedList();
l.add("rao");
l.add(30);
l.add("rao");
l.set(0,"musa");
l.add(0,"rao");
l.removeLast();
l.addFirst("faeez");
System.out.println(l);//[faeez,rao,musa,30,]
System.out.println(l.get(2));
}

}