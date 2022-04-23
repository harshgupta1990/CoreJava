package designpatterns.factory;

public class OperatingSystemFactory {
	
		public OS getInstance(String str)
		{
			if(str=="open")
			{
				return new Android(); 
			}
			else if(str=="closed")
			{
				return new IOS();
			}
			else return new Windows();
				
		}
}
