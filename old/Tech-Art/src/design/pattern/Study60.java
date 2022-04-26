package design.pattern;
public class Study60 {
	public static void main(String[] args){

//		MyView myView = new MyView();
//		myView.display();

		//演習問題
		LetsBuySomething drink = new LetsBuySomething();
		LetsBuySomething ticket = new LetsBuySomething();

		//インスタンスでで切り替え(分岐)
		LetsBuySomething hoge = drink;

		//触らない
		hoge.buyProduct(3);
	}
}

abstract class View {
	public void setFocus() {
		// 描画状態(色やフォントなど)の設定
		int local = 1;
		System.out.println("設定");
    }
    public void resetFocus() {
    	int focus = 1;
		// 描画状態の解除
		System.out.println("解除");
	}
    //ここがtempleteクラス
    public final void display() {
        setFocus();
        doDisplay();
        resetFocus();
    }
    public abstract void doDisplay();
}
//サブクラス
class MyView extends View {
	public void doDisplay() {
		 // 描画の実行
		 System.out.println("描画");
	}
}

//演習問題
abstract class AutoDispenser {
	public void displayPrice() {
		// 価格表示
		System.out.println("¥120");
    }
    public void showPayment() {
		// 入金額確認
		System.out.println("入金額確認");
	}
    public void outputCharge() {
		// お釣り
		System.out.println("ポカリスエットです");
	}
    //ここがtempleteクラス
    public final void getProduct(int price) {
    	displayPrice();
    	showPayment();
    	//動的な機能はabstract
    	buyProduct(price);
    	outputCharge();
    }
    public abstract void buyProduct(int value);
}

//サブクラス
class LetsBuySomething extends AutoDispenser {
	public void buyProduct(int price) {
		 // 商品を出す()
		if (price > 120){
			System.out.println("商品です");
		} else {
			System.out.println("金額が足りません");
		}
	}
}
