package functional.lambda;

public class SampleLambda2 {

	public static void main(String[] args) {
		// ラムダ式で書かれたコード：() -> System.out.println("Hello Lambda!")
        Runnable r = () -> System.out.println("Hello Lambda!");
        r.run();
	}

}
