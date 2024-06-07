package assignment;

public class Area {

	int l;
	int b;

	void setDim(int len, int brd) {
		l = len;
		b = brd;
	}

	void getArea() {

		int ar = l * b;
		System.out.println("Area = " + ar);
	}
	
	public static void main(String[] args) {
		Area  a = new Area();
		
		a.setDim(33, 87);
		a.getArea();
	}

}
