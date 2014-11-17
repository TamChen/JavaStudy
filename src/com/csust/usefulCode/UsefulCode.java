package com.csust.usefulCode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.commons.lang.ArrayUtils;

public class UsefulCode {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ParseException 
	 * 1. �ַ��������͵��໥ת��
	 * 2. ���ļ�ĩβ�������
	 * 3. �õ���ǰ����������
	 * 4. ת�ַ���������
	 * 6. �� Java util.Date ת�� sql.Date
	 * 9. ���� JSON ��ʽ������
	 * 11. HTTP ��������
	 * 14. �г��ļ���Ŀ¼
	 * 17. �� Array ת���� Map 
	 * 19. ���ʹ����ݵ�HTTP ����
	 * 20. �ı�����Ĵ�С
	 */
	public static void main(String[] args) throws IOException, ParseException {
	    //1. �ַ��������͵��໥ת��
		String a = String.valueOf(2);   //integer to numeric string  
		int i = Integer.parseInt(a); //numeric string to an int 

		//2. ���ļ�ĩβ�������
		BufferedWriter out = null;  
		try {  
		    out = new BufferedWriter(new FileWriter("filename", true));  
		    out.write("aString");  
		} catch (IOException e) {  
		    // error processing code  
		} finally {  
		    if (out != null) {  
		        out.close();  
		    }  
		} 
		
		//3. �õ���ǰ����������
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		
		//4. ת�ַ���������
//		java.util.Date = java.text.DateFormat.getDateInstance().parse(date String); 

		SimpleDateFormat format = new SimpleDateFormat( "dd.MM.yyyy" );  
		Date date = format.parse("12.25.2014"); 
		
//		6. �� Java util.Date ת�� sql.Date
		java.util.Date utilDate = new java.util.Date();  
		java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime()); 

//		9. ���� JSON ��ʽ������
//         ����fastJson.jar�ļ����н���

//		11. HTTP ��������
  
		System.getProperties().put("http.proxyHost", "someProxyURL");  
		System.getProperties().put("http.proxyPort", "someProxyPort");  
		System.getProperties().put("http.proxyUser", "someUserName");  
		System.getProperties().put("http.proxyPassword", "somePassword"); 

//		14. �г��ļ���Ŀ¼

		File dir = new File("directoryName");  
		  String[] children = dir.list();  
		  if (children == null) {  
		      // Either dir does not exist or is not a directory  
		  } else {  
		      for (int j=0; j < children.length; j++) {  
		          // Get filename of file or directory  
		          String filename = children[j];  
		      }  
		  }  
		  
		  // It is also possible to filter the list of returned files.  
		  // This example does not return any files that start with `.'.  
		  FilenameFilter filter = new FilenameFilter() {  
		      public boolean accept(File dir, String name) {  
		          return !name.startsWith(".");  
		      }  
		  };  
		  children = dir.list(filter);  
		  
		  // The list of files can also be retrieved as File objects  
		  File[] files = dir.listFiles();  
		  
		  // This filter only returns directories  
		  FileFilter fileFilter = new FileFilter() {  
		      public boolean accept(File file) {  
		          return file.isDirectory();  
		      }  
		  };  
		  files = dir.listFiles(fileFilter); 
		  
//		17. �� Array ת���� Map 
		    String[][] countries = { { "United States", "New York" }, { "United Kingdom", "London" },  
		        { "Netherland", "Amsterdam" }, { "Japan", "Tokyo" }, { "France", "Paris" } };  
		    Map countryCapitals = ArrayUtils.toMap(countries);  
		    System.out.println("Capital of Japan is " + countryCapitals.get("Japan"));  
		    System.out.println("Capital of France is " + countryCapitals.get("France"));  

//		19. ���ʹ����ݵ�HTTP ����
		        try {  
		            URL my_url = new URL("http://coolshell.cn/");  
		            BufferedReader br = new BufferedReader(new InputStreamReader(my_url.openStream()));  
		            String strTemp = "";  
		            while(null != (strTemp = br.readLine())){  
		            System.out.println(strTemp);  
		        }  
		        } catch (Exception ex) {  
		            ex.printStackTrace();  
		        }  
		 
//		20. �ı�����Ĵ�С

		/** 
		* Reallocates an array with a new size, and copies the contents 
		* of the old array to the new array. 
		* @param oldArray  the old array, to be reallocated. 
		* @param newSize   the new array size. 
		* @return          A new array with the same contents. 
		*/ 

		// Test routine for resizeArray().  
		   int[] b= {1,2,3};  
		    b= (int[])resizeArray(b,5);  
		   b[3] = 4;  
		   b[4] = 5;  
		   for (int f=0; f<a.length(); f++)  
		      System.out.println (b[i]);  

}
	private static Object resizeArray (Object oldArray, int newSize) {  
		   int oldSize = java.lang.reflect.Array.getLength(oldArray);  
		   Class elementType = oldArray.getClass().getComponentType();  
		   Object newArray = java.lang.reflect.Array.newInstance(  
		         elementType,newSize);  
		   int preserveLength = Math.min(oldSize,newSize);  
		   if (preserveLength > 0)  
		      System.arraycopy (oldArray,0,newArray,0,preserveLength);  
		   return newArray;  
		}  
		  
}
