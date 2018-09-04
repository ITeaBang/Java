package method1;

public class Main {

	public static void main(String[] args) {
		Task.display();

		int x = 10;
		//메소드에게 value형의 데이터를 넘겨주었습니다.
		//절대로 넘겨준 데이터에 변화가 일어나지 않습니다.
		Task.incValue(x);
		System.out.println(x); //10

		int[] ar = { 100, 200 };
		//메소드에게 reference형의 데이터를 넘겨주었습니다.
		//넘겨준 데이터에 변화가 발생할 수 있습니다.
		//이런 경우는 document를 읽어보거나 데이터를 확인해보아야 합니다.
		Task.incReference(ar);
		System.out.println(ar[0]); //101, 참조형의 결과는 마지막에 확인할 것
		
		Task task = new Task();
		System.out.println(task.sum(100));
		
		System.out.println(task.fiboNoRecurision(10));
	}

}
