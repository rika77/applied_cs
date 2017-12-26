import java.util.*;
import java.io.*;

public class csv_read {

    public static void main(String args[]) {

        try {
            //ファイルを読み込む
            FileReader fr = new FileReader("iso_country_code.csv");
            BufferedReader br = new BufferedReader(fr);

            //読み込んだファイルを１行ずつ処理する
		//code country_nameのみ取り出したい
            String line;
            StringTokenizer token;
            while ((line = br.readLine()) != null) {
                //区切り文字","で分割する
		String array[] = line.split(",");
                //分割した文字を画面出力する

		System.out.println(array[10].substring(1,array[10].length()-1));	//substringはfor delete ""
		System.out.println(array[8].substring(1,array[8].length()-1));
                System.out.println("**********");
            }

            //終了処理
            br.close();

        } catch (IOException ex) {
            //例外発生時処理
            ex.printStackTrace();
        }
    }

}
