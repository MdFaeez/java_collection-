import java.util.LinkedList;
class LinkedListDemo1{
public static void main(String args[]){
LinkedList l=new LinkedList();
l.add("core");
l.add("java");
l.add("advance");
l.add("node");
l.add("script");
l.set(1,"faeez");
l.removeLast();
l.removeFirst();
l.addFirst("adding");
l.addLast("lastadd");
//l.remove();

System.out.println(l);
}
}