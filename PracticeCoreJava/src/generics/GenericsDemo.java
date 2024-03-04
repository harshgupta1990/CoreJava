package generics;

import java.util.ArrayList;

class Container<T extends Integer>
{
	T value;
	
	void show()
	{
		System.out.println(value.getClass().getName());
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	public void demo(ArrayList<? extends T> obj)
	{
		
	}
	

	public void demo1(ArrayList<? super T> obj)
	{
		
	}
}

public class GenericsDemo {

	public static void main(String[] args) {
		
		Container<Integer> obj = new Container<>();
		obj.value=10;
		obj.show();
		
		obj.demo(new ArrayList<Integer>());
		
		obj.demo1(new ArrayList<Number>());
		
	}

}
