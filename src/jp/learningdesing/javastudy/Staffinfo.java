package jp.learningdesing.javastudy;


class Staff {
	String name;
	int staffid;
	String email;
	
	public void sayhello() {
		System.out.println("Hello " + this.name);
		//thisはクラスの中のフィールドを参照するときに使用する 		
	}

	public Staff(String name, int staffid, String email) {
		super();
		this.name = name;
		this.staffid = staffid;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStaffid() {
		return staffid;
	}

	public void setStaffid(int staffid) {
		this.staffid = staffid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}

class RemoteStaff extends Staff {
	public String location;
	public RemoteStaff(String name, int staffid, String email) {
		super(name, staffid, email);
	}
	
}

public class Staffinfo {

	public static void main(String[] args) {
		//↑メソッドの定義
		/*
		 * public「他のクラスからアクセス可」	
		 * static「クラスから直接呼び出せる、インスタンスから呼び出せない」
		 * void「返り値のタイプ」string型等を.今回は何も値を返さないためvoidが使用される
		 * main(Sring[] args)「メソッド名（引数＝パラメータ）」argsという配列型の引数を持つ
		 */
		Staff yamada = new Staff("Taro Yamada",12345,"yamada@co.jp");
        //↑インスタンスを生成する（※インスタンス = テンプレートから作った実際の部品、型で出来た物）
		//yamada.name = "Taro Yamada";
		//yamada.sayhello();
		RemoteStaff tanaka = new RemoteStaff("Hnako Tnaka",123456,"tanaka@abc.co.jp");
		tanaka.location = "大阪";
		
		System.out.println("【社員情報】");
		System.out.println("氏名：　" + yamada.getName());
		System.out.println("社員番号：　" + yamada.getStaffid());
		System.out.println("Email： " + yamada.getEmail());
		
		System.out.println("【社員情報】");
		System.out.println("氏名：　" + tanaka.getName());
		System.out.println("社員番号：　" + tanaka.getStaffid());
		System.out.println("Email： " + tanaka.getEmail());
		System.out.println("勤務地: " + tanaka.location);
/*
 * 出力先を変えて(PCのディスプレイ、スマホだったり）指定し、様々なプログラムを作成していく
 */
	}

}
