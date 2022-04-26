public class Exam63 {
public static void main(String[] args){

	VendingMachine vendingMachine = new VendingMachine();
	TicketingMachine ticketingMachine = new TicketingMachine();
	
	Machine machine;
	
	if (args[0] == "1") {
		machine = vendingMachine;
	}
	else {
		machine = ticketingMachine;
	}
	
	//.....
	machine.buy();
	//.....

}
}

abstract class Machine {
	public int confirmPrice() {
		int price = 150;
		System.out.println("商品価格の確認"+price);
		return price;
    }
    public int confirmInputMoney() {
    	int money = 200;
		System.out.println("入金額の確認"+money);
		return money;
	}
	public void returnCoins() {
    	int coin = 50;
		System.out.println("おつりを出す"+coin);
	}
    public final void buy() {
    	int price;
        price = confirmInputMoney() - confirmPrice();
        putProduct(price);
        returnCoins();
    }
    public abstract void putProduct(int i);
}
class VendingMachine extends Machine {
	public void putProduct(int i) {
		 System.out.println("飲料販売機" + i);
	} 
}
class TicketingMachine extends Machine {
	public void putProduct(int i) {
		 System.out.println("切符販売機"+ i);
	} 
}
