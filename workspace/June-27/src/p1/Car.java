package p1;

public class Car {

	int h;
	int w;

	public Car() {
		this.h = 5;
		this.w = 10;
	}
	
	public Car(int x, int y) {
		this.h = x;
		this.w = y;
	}

	public static void main(String[] args) {
		Car fords = new Car();
		System.out.println("INITIAL -> " + "Hight : " + fords.h + " and Width : " + fords.w);

		fords.h = 10;
		fords.w = 20;
		System.out.println("MODIFIED -> " + "Hight : " + fords.h + " and Width : " + fords.w);

		Car tata = new Car(30, 50);
		System.out.println("INITIAL -> " + "Hight : " + tata.h + " and Width : " + tata.w);

		Car hundai = new Car();
		System.out.println("INITIAL -> " + "Hight : " + hundai.h + " and Width : " + hundai.w);
	}

}
