import java.util.Scanner;

public class cubeofArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cube[] = new int[10];
		System.out.println("Enter 10 array elements");
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			System.out.println("Cube of Numbers :");
			cube[i] = arr[i] * arr[i] * arr[i];
			System.out.println(cube[i]);

		}
	}
}
