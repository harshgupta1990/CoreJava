package designpatterns.factory;

public class FactoryMain {

	public static void main(String[] args) {

		OperatingSystemFactory osf= new OperatingSystemFactory();
		OS os = osf.getInstance("closed35");
		os.spec();

	}

}
