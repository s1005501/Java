package chapter5.ThrowAndThrows.throws範例;

// Throws
// throws是method"可能"會拋出錯誤的聲明，錯誤由呼叫它的人來做處理
// 實際用法是把throws exception的型態加在method的變數()後面，格式如下:
// public void method名稱(變數) throws exception型態1, exception型態2{}
// throws可以處理多種錯誤，以逗號(,)隔開不同類型的錯誤即可
public class ThrowsExample {
	
	public static void throwsFunction() throws ArithmeticException  {		
		System.out.println(10 / 0);		
	} 
	
    public static void main(String[] args)  {
    	try {
    		throwsFunction();
    	}catch(ArithmeticException e) {
    		System.out.println("測試throws: " + e);
    	}  
    }
}
