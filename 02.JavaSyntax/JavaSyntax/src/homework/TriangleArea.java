package homework;

public class TriangleArea {
	public static long triangleArea(int aA1, int aA2, int bB1, int bB2, int cC1, int cC2) {

		long area = ((aA1*(bB2 - cC2)) + (bB1*(cC2 - aA2)) + (cC1*(aA2 - bB2))) / 2;
		
		if (area < 0) {
			return area * -1;
		} 

		return area;
	}
}
