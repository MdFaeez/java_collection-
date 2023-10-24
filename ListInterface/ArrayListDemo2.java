import java.util.*;
class ArrayListDemo{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
List l=new ArrayList();
//System.out.println("enter some number");
//while(s.hasNextLine()){
//l.add(s.nextLine());
//}
System.out.println(s);
l.add("Musa");
l.add("Shad");
l.add("Faeez");
System.out.println(l);
l.add(1,"Rao");
l.add(3,"Rehman");
l.add(5,"Rehman");
System.out.println(l);
l.remove(2);
System.out.println(l);

for(int i=0; i<l.size(); i++){
if(!l.get(i).equals("Faeez"))
{
System.out.println(l.get(i));
}

}


}
}