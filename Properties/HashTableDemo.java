import java.util.*;
class HashTableDemo{
public static void main(String args[]){
HashTable h=new HashTable();
h.put(new Temp(5),"A");
h.put(new Temp(2),"B");
h.put(new Temp(6),"C");
h.put(new Temp(15),"P");
h.put(new Temp(23),"E");
h.put(new Temp(16),"F");

//h.put("rao",null);
System.out.println(h);
}
}

class Temp{
int i;
Temp(int i){
this.i=i;
}
public int 
}