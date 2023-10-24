import java.util.*;
class TreeSetDemo{
public static void main(String args[]){
TreeSet t=new TreeSet(new MyComparator());
t.add("rao");
t.add("musa");
t.add("shad");
t.add("faeez");
System.out.println(t);
}
}
class MyComparator implements Comparator{
public int compare(Object obj1,Object obj2){
String s1=obj1.toString();
String s2=(String)obj2;
return s2.compareTo(s1);
//return -s1.compareTo(s2);
}
}