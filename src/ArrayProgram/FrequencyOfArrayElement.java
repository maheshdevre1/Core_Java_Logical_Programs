package ArrayProgram;

import java.util.HashMap;
import java.util.Map;
import java.lang.Integer;
import java.math.BigInteger;

public class FrequencyOfArrayElement {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 10, 30, 20, 40, 10, 30, 40, 50 };
		Map<Integer, Integer> map = new HashMap<>();
		for (int a : arr) {
			if (map.containsKey(a)) {
				int value = map.get(a);
				map.put(a, value + 1);

			} else {
				map.put(a, 1);
			}
		}

		System.out.println(map);

	}

}
