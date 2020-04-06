package test1;

import java.util.Stack;

public class StackTest {
	Stack<Integer> stack1=new Stack<>();
	Stack<Integer> stack2=new Stack<>();
	
	public void push(int node) {
		stack1.push(new Integer(node));
	}
	
	public int pop() {
		if(stack1.empty()) {
			while(!stack1.empty()) {
				stack2.push(stack1.pop());
			}
		}
		if(stack2.empty())
			 System.out.println("stack1 is empty!");
		int aa=stack1.pop().intValue();
		return  aa;
		
	}
	
	public static void main(String[] args) {
		StackTest stacktest=new StackTest();
		stacktest.push(11);
		stacktest.push(22);
		int a=stacktest.pop();
		System.out.println(a);
	}
}
