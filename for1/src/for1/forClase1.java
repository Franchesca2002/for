package for1;

public class forClase1 {

	public static void main(String[] args) {
		int n =20;
		int a = 0, b =2;
		
		for (int i =1; i <= n; i++) {
			System.out.println(a);
			int temp = a;
			a = b;
			b = temp + b;
		}

	}

}
