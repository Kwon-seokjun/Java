package java_day02;

public class Hello0311 {
	// ����ʵ�(Field) - Ŭ������ ���, Ŭ������ �������� ������.
	static String name = "ȫ�浿";
	static String job = "���α׷���";
	// static�� �����̴�.
	// �Ӽ�, ����, attribute, argument, parameter, params, args ...
	
	// behavior, method, function, ���, �Լ��� ����� �ǹ��̴�.
	static int sum(int a, int b) {
		return a + b;
	}
	// �ּ� : Ŭ������ ����� static����� not-static����� �ִ�.
	// static ����� Ŭ���� ������ ����̰�
	// non-static����� ��ü(instance) ���� ����̴�.
	// ��ü�� Ŭ���ø� �̿��ؼ� ���� �� �ִ�.
	// Ŭ������ ��ü�� ����� ���ؼ� �ʿ��ϴ�.
	// Ŭ���� -> ��ü ����.
	// non-static ����� ��ü ����̹Ƿ� ��ü�� �� ����� ��� ����.
	
	// non-static���� �޼ҵ� ����
	void printInfo() {
		// non-static ��� �޼ҵ忡�� static ��� ȣ�� ����.
		System.out.println("���� " + name);
		System.out.println("���� " + job);
	}
	
	// ���� ����Ű : Ctrl + F11
	public static void main(String[] args) {
		// �������� (local variable) - �Լ� ���ο� ���� �� ����
		// ���� : static ����� static ����� ȣ�� �����ϴ�.
		//int i = sum(10, 20);
		
		// main�Լ����� ��� �ʵ� ����
		System.out.println("Name : " + name);
		System.out.println("Job : " +job);
		System.out.println("Hello World!");
		
	}
}
