package test;

public class TestMe {

	public static void main(String[] args) {
	
		System.out.println(add(10,20));
		
		homePageTesting();
		
		cartPageTesting();

		
	}
	
	private static void cartPageTesting() {
		System.out.println("Cart page testing done succesfully!!!");
		
	}

	//Add comment to function
	private static int add(int a, int b){
		
		
		return a+b;
		
		
	}
	
	private static void homePageTesting(){
		
		System.out.println("Home page testing done succefully");
	}

}
