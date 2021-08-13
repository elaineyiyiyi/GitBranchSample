package GitBrancApp;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("1st Version");
		Math cMath =new Math();
		System.out.print(cMath.add(10, 5));

	}

}

class Math{
	int add(int a, int b) {
		return a+b;
	}
}
;