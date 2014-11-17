package com.csust.simpleSingleton;
	/**
	 * @author Administrator
	 *12. 单实例Singleton 示例
	 */
	public class SimpleSingleton {  
    private static SimpleSingleton singleInstance =  new SimpleSingleton();  
  
    //Marking default constructor private  
    //to avoid direct instantiation.  
    private SimpleSingleton() {  
    }  
  
    //Get instance for class SimpleSingleton  
    public static SimpleSingleton getInstance() {  
  
        return singleInstance;  
    }  
//	//Call the method from Singleton:  
//	SimpleSingleton.INSTANCE.doSomething(); 
  //另一种实现
    public enum SimpleSingleton01 {  
        INSTANCE;  
        public void doSomething() {  
        }  
    }
} 

  
