import java.util.*;
class IteratorDemo{
public static void main(String args[]){

ArrayList l=new ArrayList();
for(int i=0; i<=10; i++){
l.add(i);
System.out.println(l);

Iterator it=l.iterator();
while(it.hasNext()){
Integer I=(Integer)it.next();
if(I%2==0)
System.out.println(I);

else
it.remove();
}
System.out.println(l);
}
}
}