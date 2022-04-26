package tr.dev.comtetition;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PracticeSort {

	    public static void main(String[] args) throws Exception {

	    	//時間計測開始
	    	long start = System.currentTimeMillis();

	        // Mapの宣言
	        Map<Integer, String> mMap = new HashMap<Integer, String>();

	        // Mapにデータを格納
	        mMap.put( 1, "apple");
	        mMap.put( 23, "orange");
	        mMap.put( 4, "pineapple");
	        mMap.put( 5, "Strawberry");
	        mMap.put( 3, "melon");

	        // キーでソートする
	        Set<Integer> itemIdSet = mMap.keySet();
	        Object[] mapkey = mMap.keySet().toArray();
	        System.out.println(itemIdSet);
	        System.out.println(mapkey.toString());
	        //Arrays.sort(mapkey);


	        for (Object nKey : mapkey) {
	        	Integer.parseInt(nKey.toString());
	            System.out.println("OBJ" + nKey);
	        }

	        for (Integer nKey : mMap.keySet()) {
	            System.out.println(mMap.get(nKey));
	        }

	        //時間計測終了
	    	long end = System.currentTimeMillis();
	    	System.out.println((end - start)  + "ms");
	    }
}
