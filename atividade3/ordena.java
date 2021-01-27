import java.util.Arrays;
public class Ordena {
			public static void main(String[] args) {
			if (args != null && args.length > 0) {
				int[] nums = new int[args.length];
				for (int i = 0; i < args.length; i++) {
					nums[i] = Integer.parseInt(args[i]);
				}
				Arrays.sort(nums);
				System.out.println("array ordenado: ");
				for (int numero : nums) {
					System.out.print(numero + " ");
				}
			}
		}
	}
