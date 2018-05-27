package kintai;
public class ForTest {

    public static void main(String[] args){
    	int a = 8;
        method01(a);
    }

    public static void method01(int a){
    	int b = a + 5;
        method02();
    }

    public static void method02(){
    	try{
	    	int[] intArray = new int[]{27,31,36,40};

	        String str = method03();
	        System.out.println(str + "hoge");
	        Integer c = 10/0; //Exception発生
	        int aryNum = intArray[-4];

	        //System.out.println("配列の値：" + aryNum);
	        System.out.println("終了");
    	}catch(ArithmeticException e){
    		System.out.println("実行エラー発生" + e);
    	}
    }

    public static String method03(){
    	String funcStr = "スタックの勉強";
    	method04();
        return funcStr;
    }

    public static void method04(){
    	int c = 7;
    	System.out.println("fuga");
    }
}
