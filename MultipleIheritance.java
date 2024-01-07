package Detyra4A;
import java.io.*;

// Shembull me Multiple Inheritance

class Parent1 {
	void fun() {
	System.out.println("Parent1");
	}
}

class Parent2 {
	void fun() {
	System.out.println("Parent2");
	}
}

class Test extends Parent1{
	public static void main(String args[]) {
	Test t = new Test();
	t.fun();
	}
}
