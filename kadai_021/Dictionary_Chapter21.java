package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	
	
	public HashMap<String,String> dictionary = new HashMap<String,String>();
	
	public Dictionary_Chapter21(){
		
	
	
	
	
	
	String[] key ={"apple","peach","banana","lemon","pear","kiwi","strawberry","grape","muscat","cherry"};
	String[] val = {"りんご","桃","バナナ","レモン","梨","キウィ","いちご","ぶどう","マスカット","さくらんぼ"};
	
	for(int i = 0; i < key.length; i++) {
		
		dictionary.put(key[i], val[i]);
	}
	}
	
	
	
	
	public void checkDictionary(String key) {
	
	
		
		if (dictionary.containsKey(key)) {
            System.out.println(
                key + "の意味は" + dictionary.get(key)
            );
        } else {
            System.out.println(
                key + "は辞書に存在しません");
} 

    
    
	}
	}

	
	

