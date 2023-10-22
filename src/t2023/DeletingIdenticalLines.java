package t2023;

public class DeletingIdenticalLines {
	public static void main(String[] args) {
		String[] array = new String[]{"Hello", "Hello", "World", "Java", "Tasks", "World"};
		delLine(array);

		for (String a : array) {
			System.out.print(a + " ");
		}
	}

	public static void delLine(String[] array) {
		for (int i = 0; i < array.length; i++) {
			String temp = array[i];
			if (array[i] != null) {
				for (int j = i + 1; j < array.length; j++) {
					if (temp.equals(array[j])) {
						array[i] = null;
						array[j] = null;
					}
				}
			}
		}
	}

}
