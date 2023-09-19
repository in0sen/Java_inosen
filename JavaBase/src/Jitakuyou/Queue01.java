package Jitakuyou;

import java.util.ArrayDeque;
import java.util.Queue;

public class Queue01 {

	public static void main(String[] args) {
		Queue<String> queue = new ArrayDeque<>();
		//キューに入れる
		queue.add("a");
		queue.add("b");
		queue.add("c");

		//キューに入っているものをすべて表示する
		System.out.println(queue);

		//キューの中に残したまま出力する
		System.out.println(queue.peek());

		//キューの中に残さず出力する
		System.out.println(queue.poll());
	}

}
