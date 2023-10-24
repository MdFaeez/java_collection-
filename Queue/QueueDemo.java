import java.util.*;
    class QueueDemo {

	public native void m1();
	
	public static void main(String args[]) {
		
	Queue q=new ArrayDeque();
	Queue qq=new LinkedList();
	
	qq.add(20);
	qq.add(40);
	qq.add(50);
	qq.add(60);
	qq.add(70);
	qq.remove();
	System.out.println(qq);
	
	q.add(20);
	q.add(30);
	q.add(40);
	q.add(50);
	q.add(60);
	System.out.println(q);
	q.remove();
	System.out.println(q);
	}
}
