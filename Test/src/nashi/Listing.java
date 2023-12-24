package nashi;

import java.util.ArrayList;
import java.util.Iterator;

public class Listing {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			ArrayList<String> names = new ArrayList<String>();
			names.add("白川郷");
			names.add("銀山温泉");
			names.add(1);//例外発生
			Iterator<String> it = names.iterator();
			while (it.hasNext()) {
				String e = it.next();
				System.out.println(e);
			}
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

}
