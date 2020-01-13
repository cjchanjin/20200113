package co.cjpark.overloading;

public class Calculator {
	public int sum (int n, int m) {
		return n+m;
	}
	
	public int sum (int n, int m, int c) {
		return n+m+ c;
	}
	
	public float sum (float x, float y) {		//메소드 overloading :  동일 함수를 전달하되 타입을 달리 함.
		return x + y;
	}																 
	
	public int multy (int n, int m) {
		return n*m;
	}
	
	public float multy ( float x, float y) {
		return x*y;
	}

	public double sum(double d, double e) {
		return d*e;
	}
	
//	@Override								//동일 클래스 내에서 override 반복 불가
//	public int sum(int n, int m)	{
//		return n+m+10;
//	}
	
}
