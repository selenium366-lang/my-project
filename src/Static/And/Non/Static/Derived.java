package Static.And.Non.Static;

public class Derived extends Base {

	static {
		System.out.println("static block - Derived");
		}
		{
			System.out.println("Instance block - Derived");
			
		}
			Derived(){
			System.out.println("Constructor - Derived");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Derived();

	}

}
