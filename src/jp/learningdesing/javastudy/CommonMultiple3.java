package jp.learningdesing.javastudy;

public class CommonMultiple3 {

	public static void main(String[] args) {
		//2または3の倍数以外の数を表示する
		int i = 1; 
		while (i < 20) {
			if(!((i % 2 == 0) && (i % 3 == 0))) {
				//NOT演算子の適用例
				System.out.println(i);
			}
			i++; //インクリメント演算子
		}

	}

}
