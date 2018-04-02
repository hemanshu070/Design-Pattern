package singleton_Pattern;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		
		//SingleObject object1 = new SingleObject();
		SingleObject object = SingleObject.getInstance();
		object.showMessage();
		// TODO Auto-generated method stub
     
	}

}
