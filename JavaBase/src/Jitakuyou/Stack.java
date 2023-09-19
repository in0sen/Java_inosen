package Jitakuyou;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack {

	public static void main(String[] args) {
		Deque<String> stack = new ArrayDeque<>();
		//スタックに入れる
		stack.push("a");
		stack.push("b");
		stack.push("c");
		
		//スタックの中のすべてを見ることができる
		System.out.println(stack);
		
		//スタックの中にあるものを見る
		System.out.println(stack.peek());
		
		//スタックの中から取り出す
		System.out.println(stack.pop());
		//pop と同じ stack.pollFirst();
		
		System.out.println(stack);
		
	}
}