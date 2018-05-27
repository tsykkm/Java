package tr.dev.comtetition;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class PracticeTreeSet {

	public static void main(String[] args) {

		//時間計測開始
    	long start = System.currentTimeMillis();
    	System.out.println("--START---");

		String fileName = "/Users/kumetoshiyuki/Downloads/test01.csv";

	    try {
	        File f = new File(fileName);
	        BufferedReader br = new BufferedReader(new FileReader(f));

	        String line;
	        HashMap<Integer, String> map = new HashMap<Integer, String>();
	        List<Integer> linkedList = new LinkedList<>();
	        int i = 0;

	        //TreeSetに格納
	        while ((line = br.readLine()) != null) {
	          String[] data = line.split(",");
	          if (i != 0) {
	        	  //キーを数値型に変換
		          Integer valueNum = Integer.parseInt(data[0]);
		          map.put(valueNum, line);
		          linkedList.add(valueNum);
	          }
	          i++;
	        }

	        for (Integer a : linkedList) {
	        	System.out.println(a);
	        }

	        System.out.println("-------");

	        Integer sss;
	        Integer ttt;
	        for (int n = 0; n < linkedList.size(); n++) {
	            for (int m = linkedList.size()-1; m > n; m--) {
	            	// 上の方が大きいときは互いに入れ替え
	            	if (linkedList.get(m) < linkedList.get(m-1)) {
	            		System.out.println(linkedList.get(m));
	            		sss = linkedList.get(m-1);
	            		linkedList.remove(m-1);

	            		ttt = linkedList.get(m);
	            		linkedList.remove(m);

	            		linkedList.add(m-1, ttt);
	            		linkedList.add(m, sss);
	            	}
	            }
	            //System.out.println("ooooooo");
	            //表示
	            System.out.println(linkedList.get(n));
	        }

	        br.close();


	      } catch (IOException e) {
	        System.out.println(e);
	      }

        //時間計測終了
    	long end = System.currentTimeMillis();
    	System.out.println("TIME:" + (end - start)  + "ms");
	}
}
