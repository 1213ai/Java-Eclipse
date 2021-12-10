package jp.learningdesing.javastudy;


class Staff {
	String name;
	int staffid;
	String email;
	
	public void sayhello() {
		System.out.println("Hello " + this.name);
		//thisはクラスの中のフィールドを参照するときに使用する 		
	}
}

//↓クラスを定義（※クラス = プログラムの部品のテンプレート、型）

//（クラス ＝ フィールド（データを格納） ＋ メソッド（処理を記述））

public class Staffinfo {

	public static void main(String[] args) {
		//↑メソッドの定義
		/*
		 * public「他のクラスからアクセス可」	
		 * static「クラスから直接呼び出せる、インスタンスから呼び出せない」
		 * void「返り値のタイプ」string型等を.今回は何も値を返さないためvoidが使用される
		 * main(Sring[] args)「メソッド名（引数＝パラメータ）」argsという配列型の引数を持つ
		 */
		Staff yamada = new Staff();
        //↑インスタンスを生成する（※インスタンス = テンプレートから作った実際の部品、型で出来た物）
		yamada.name = "Taro Yamada";
		
		yamada.sayhello();
		
//		System.out.println(yamada.name);
/*
 * 出力先を変えて(PCのディスプレイ、スマホだったり）指定し、様々なプログラムを作成していく
 */
	}

}
