import java.util.List;

public class Recursion {
	/**
	 * Remove duplicate consecutive items from a list, changing the list parameter.
	 * For example, if list = { a, b, b, b, c, b, c, c} then after calling unique
	 * the list will contain {a, b, c, b, c}. Only consecutive duplicates are
	 * removed. Objects are compared using their own equals method.
	 * 
	 * @param list of any kind of object. The elements are not null.
	 * @return reference to the list parameter with consecutive duplicates removed.
	 */
	public static List<String> unique(List<String> list) {
		if (list.size() == 1)
			return list;

		if (list.get(0) != list.get(1)) {
			unique(list.subList(1, list.size()));
		} else {
			list.remove(0);
			unique(list);
		}
		return list;
	}

	/**
	 * Calculate fibonacci number using recursive.
	 * 
	 * @param n the number to find fibonacci
	 * @return fibonacci number of n
	 */
	public static long fibonacci(int n) {
		return helper(0, 1, n);
	}

	/**
	 * Helper method for fibonacci().
	 * 
	 * @param a the first number
	 * @param b the second number
	 * @param n the number to find fibonacci
	 * @return fibonacci number of n
	 */
	public static long helper(int a, int b, int n) {
		if (n == 0)
			return a;
		return helper(b, a + b, n - 1);
	}
}