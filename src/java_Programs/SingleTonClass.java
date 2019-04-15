package java_Programs;

public class SingleTonClass {
	
	private static SingleTonClass single_instance = null; 
	  
    // variable of type String 
    public String s; 
  
    // private constructor restricted to this class itself 
    private SingleTonClass() 
    { 
        s = "Hello I am a string part of Singleton class"; 
    } 
  
    // static method to create instance of Singleton class 
    public static SingleTonClass getInstance() 
    { 
        if (single_instance == null) 
            single_instance = new SingleTonClass(); 
  
        return single_instance; 
    } 

}
