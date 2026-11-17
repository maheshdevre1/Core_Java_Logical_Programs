package AllDSA;

import java.util.Arrays;

public class Test {

	public int maxArea(int[] height) {
		int maxArea = 0;
		for(int i=0; i<height.length; i++) {
			for(int j=i+1; j<height.length; j++) {
				int hei = Math.min(height[i], height[j]);
				int width = j-i;
				int area = hei * width;
				
				if(area> maxArea) {
					maxArea = area;
				}
			}
			
		}
		
		return maxArea;

	}

	public static void main(String[] args) {
		int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

		Test p = new Test();
		int area = p.maxArea(height);
		System.out.println(area);

	}

}
