package design.template;

/**
 * -- ポイント --
 * ・
 * ・大枠の手順に変更がない場合 TemplateMethod パターンの利用価値が高くなります
 * ・抽象メソッドに処理を定義しておけば、具象クラスを何個も作った時の修正時にこのクラスだけ直せば良い
 * ・抽象クラスのdisplay() -> 具象クラスのopen(),print(),close()
 * https://qiita.com/shoheiyokoyama/items/c2ce16b4f492cd014d50
 */
public abstract class AbstractDisplay {
	// サブクラスに実装を任せる
	public abstract void open();
	public abstract void print();
	public abstract void close();
	// このメソッドは抽象クラスで定義(mainから呼び出す)
	public final void display() { // オーバーライドをする必要がなければ、final修飾子のような宣言をする
		open();
		for (int i = 0; i < 5; i++) {
			print();
		}
		close();
	}
}
