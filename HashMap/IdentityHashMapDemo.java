import java.util.*;
class HashMapDemo{
public static void main(String args[]){
IdentityHashMap m=new IdentityHashMap();
Integer i1=new Integer(10);
Integer i2=new Integer(10);
m.put(i1,"rao");
m.put(i2,"musa");
System.out.println(m);
System.out.println(i1==i2);
}
}