package com.yedam.nestedClasses;

class A {
	A() {
		System.out.println("A객체가 생섬됨.");
	}

	// 인스턴스 멤버 클래스
	int field;

	public class B {
		B() {
			System.out.println("B객체가 생성됨");
		}

		int field;

//	static int feild2;
		void method1() {
			System.out.println("method2() 호출됨.");
		}
	}

	// 정적 클래스
	static class C {
		C() {
			System.out.println("B객체가 생성됨");
		}

		int field;

		void method1() {
			System.out.println("method1() 호출됨.");
		}

	}
//	static void method2() {System.out.println("method2() 호출됨.");}

// 로컬 클래스
//void method1()
	class D {
 int field;

	void method() {
		System.out.println("method1() 호출됨.");
	}

	D d = new D();d.field1=10;d.method1();
}

	public class Main {
		public static void main(String[] args) {
			A a = new A();

			A.B c = a.new B();
			b.field1 = 5;
			b.method1();

			A.C c = new A.C();
			// 정적 멤버 클래스의 인스턴스 필드 (메소드)
			c.field1 = 10;
			c.method1();
			// 정적 멤버 클래스의 정적 필드 (메소드)
			A.C.filed2 = 10;
			A.C.method2();

			a.method();
		}
	}
}