import java.util.*;

public class country_code {
	public static void main(String args[]){
	
	HashMap<String,String> map = new HashMap<String,String>();
	
	
	

	
	Scanner sc = new Scanner(System.in);
	String a = sc.next();


	map.put("りんご", "apple");
	map.put("ぶどう", "grapes");

	if (map.containsKey(a)){
	  System.out.println(map.get(a));
	}else{
	  System.out.println("指定したキーは存在しません");
	}
	}
}
