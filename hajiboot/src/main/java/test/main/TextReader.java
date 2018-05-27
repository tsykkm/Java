package test.main;

public class TextReader {
	void open(String name) {
		System.out.println("ファイルをopenしました");
	}

	void close() {
		System.out.println("ファイルをcloseしました");
	}

	//1文字読み込む
	public char read() {
		// 処理
		return 0;
	}

	public int getCount(TextReader rd){
		return 1;
	}
}
