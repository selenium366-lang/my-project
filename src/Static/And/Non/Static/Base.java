package Static.And.Non.Static;

public class Base {
	static {
	System.out.println("static block - base");
	}
	{
		System.out.println("Instance block - base");

	}
		Base(){
		System.out.println("Constructor - base");
	}



}

