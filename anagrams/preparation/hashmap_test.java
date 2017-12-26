import java.util.*;

public class hashmap_test {
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	String a = sc.next();

	HashMap<String,String> map = new HashMap<String,String>();

	map.put("りんご", "apple");
	map.put("ぶどう", "grapes");

	if (map.containsKey(a)){
	  System.out.println(map.get(a));
	}else{
	  System.out.println("指定したキーは存在しません");
	}
	}
}
