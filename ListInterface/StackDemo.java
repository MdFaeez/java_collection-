import java.util.*;
class StackDemo{
public static void main(String args[]){
Stack s=new Stack();
s.push("a");
s.push("b");
s.push("c");
s.pop();
s.peek();
System.out.println(s);
System.out.println(s.search("a"));
System.out.println(s.search("z"));
}
}