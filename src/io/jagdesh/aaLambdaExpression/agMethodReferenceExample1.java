package io.jagdesh.aaLambdaExpression;

public class agMethodReferenceExample1 {

	public static void main(String[] args) {
		
		Thread t = new Thread(agMethodReferenceExample1::printMessage);	//	() -> method()
		//	agMethodReferenceExample1::printMessage === () -> printMessage()
		t.start();
		
	}
	
	public static void printMessage() {
		System.out.println("Hello");
	}
	
}
