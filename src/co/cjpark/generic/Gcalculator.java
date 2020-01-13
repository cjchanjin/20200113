package co.cjpark.generic;

public class Gcalculator<T> {		//generic 타입 표시 <T>
	public <T extends Number> double sum(T t1, T t2) {		//T가 가지고 있는 타입은 number 타입으로 제한한다. 
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		return v1 + v2;
		
	}

}
