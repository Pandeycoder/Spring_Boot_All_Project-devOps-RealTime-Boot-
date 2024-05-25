package linkedlist;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		
		Stack<Integer> s=new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		
		System.out.println(s);
		
		System.out.println(s.peek());
		System.out.println(s.pop());
		
		s.push(500);
		System.out.println(s);
		
	}
}
