import java.util.*;
public class HashMapDemo {
public static void main(String args[]) {
	
HashMap m=new HashMap();
m.put("musa",101);
m.put("rao",102);
m.put("faeez",103);
m.put("shad",104);
System.out.println(m);
m.put("faeezyy",1000);
System.out.println("asdfghjkl"+m);

Set s=m.keySet();
System.out.println(s);
Collection c=m.values();
System.out.println(c);

Set s1=m.entrySet();
System.out.println(s1);

Iterator itr=s1.iterator();
while(itr.hasNext()){
Map.Entry m1=(Map.Entry)itr.next();	
System.out.println(m1.getKey()+" "+m1.getValue());

if(m1.getKey().equals("musa")){
m1.setValue(10000);	
}
String str="rao";

str.hashCode();

System.out.println(str);


}
System.out.println(m);
}
}
