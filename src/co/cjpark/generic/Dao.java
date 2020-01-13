package co.cjpark.generic;

import java.util.List;

public abstract class Dao {
	

	public abstract <E> List<E> allSelect();
	public abstract <E> E select(E t);
}
