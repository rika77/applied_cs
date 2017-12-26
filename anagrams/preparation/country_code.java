import java.util.*;
import java.io.*;

public class country_code {
	public static void main(String args[]){

	//hashmap<country_code, country_name>	
	HashMap<String,String> map = new HashMap<String,String>();
	// read from .csv
	try {
		FileReader fr = new FileReader("iso_country_code.csv");
		BufferedReader br = new BufferedReader(fr);

		String line;
		StringTokenizer token;

		while((line = br.readLine())!=null) {
			String array[] = line.split(",");

			map.put(array[10].substring(1,array[10].length() - 1), array[8].substring(1,array[8].length() - 1 ));
		}
		br.close();
	} catch (IOException ex) {
		ex.printStackTrace();
	}

	//逆引き用の双方向map作成
	//保留	

	Scanner sc = new Scanner(System.in);
	String a = sc.next();


	//|a| == 3 -> it's CODE!
//	if (a.length() == 3) {


	if (map.containsKey(a)){
	  System.out.println(map.get(a));
	}else{
	  System.out.println("Not exist");
	}


	//else it can be country_name -> return code!
	//1:1だからできる
/*	else {
	if (re_map.containsKey(a)){
	  System.out.println(map.get(a));
	} else{
	  System.out.println("Not exist");
	}
	}
*/	
	}
}
