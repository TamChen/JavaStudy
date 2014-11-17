package com.csust.simpleSingleton;
	/**
	 * @author Administrator
	 *12. ��ʵ��Singleton ʾ��
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
  //��һ��ʵ��
    public enum SimpleSingleton01 {  
        INSTANCE;  
        public void doSomething() {  
        }  
    }
} 

  
