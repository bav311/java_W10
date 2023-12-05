package t2023;

public class SumNumber {
	public static void main(String[] args) {
		System.out.println(getSum(546));
	}
	public static int getSum(int num) {
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}
}
