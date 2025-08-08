package com.nit.main;


public class App {
	
	public int sum(int a, int b)
	{
		return a+b;
	}
	
    public static void main(String[] args) {
      
    	App a1=new App();
        int result=a1.sum(10, 20);
        
        System.out.println("addition is :"+result);
    	
    }
}
