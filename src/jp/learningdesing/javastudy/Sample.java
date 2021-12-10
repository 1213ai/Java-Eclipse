package jp.learningdesing.javastudy;
//↑パッケージ宣言（ユニークにする。例えば、ドメイン名を逆に並べてユニークにしたり。）

//↓はクラス（javaのプログラムを作る ＝ クラスを作る（クラス ＝ フィールド ＋ メソッド））
public class Sample {
/*
 * 複数の行に及ぶ時に使用するコメント
 * Sampleは、”Hello Eclipse!”と表示するプログラムです。
 * Eclipseを使用してコードを記入しています。
 */
	
/** Javadoc形式（ジャバドック形式）※コードを書いた人だったりを書いたりする。
 * author: ai
 * @param args
 */
	public static void main(String[] args) {
		// 単一行で使用するコメント
		//↓次の行で、コンソールに文字列を出力します。
		System.out.println("こんにちは、エクリプス！");
	}

}

/*
 * mainメソッドについて
 * javaアプリケーション　→　JVM（java仮想マシン）　→ 起動するクラスmainメソッドを探しにいきます。
 */

