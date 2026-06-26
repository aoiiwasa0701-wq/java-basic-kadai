package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	
	
	public HashMap<String,String> dictionary = new HashMap<String,String>();
	
	
	
	public Dictionary_Chapter21(){
		
		
		
	
	
	
	
	
	String[] keys ={"apple","peach","banana","lemon","pear","kiwi","strawberry","grape","muscat","cherry"};
	String[] vals = {"りんご","桃","バナナ","レモン","梨","キウィ","いちご","ぶどう","マスカット","さくらんぼ"};
	
	
	
	for(int i = 0; i < keys.length; i++) {
		
		dictionary.put(keys[i], vals[i]);
	}
	}
	
	
	
	
	public void checkDictionary(String[] words) {
		for (int i = 0; i < words.length; i++) {
		String result =dictionary.get(words[i]);
		
		if (result != null) {
            System.out.println(words[i] + "の意味は" + result);
        } else {
            System.out.println(words[i] + "は辞書に存在しません");
		
		
			
			
} 

    
    
	}
	}
}

	
	

