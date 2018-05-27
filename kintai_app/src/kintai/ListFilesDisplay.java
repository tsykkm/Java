package kintai;

import java.io.File;

public class ListFilesDisplay {
	public static void main(String[] args) {

		File f = new File("/Users/kumetoshiyuki/Downloads/");
		showFilePath(f);




	}


	private static void showFilePath(File path) {
		File[] fileArray = path.listFiles();
		if (fileArray == null) {
			return;
		}

		for(File f : fileArray) {
			System.out.println(f);
			if (f.isDirectory()) {
				System.out.println("-----");
				showFilePath(f);
			}
		}
	}
}
