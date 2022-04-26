package oo.changepractice.before;

public class RegacyMain {
	public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();

        Drink drink = vm.buy(500, Drink.COKE);
        int charge = vm.refund();

        if (drink != null && drink.getDrink() == Drink.COKE) {
            System.out.println("コーラを購入しました。");
            System.out.println("おつりは " + charge + " 円です。");
        } else {
            throw new RuntimeException("コーラ買えんかった(´ﾟдﾟ｀)");
        }
	}
}
