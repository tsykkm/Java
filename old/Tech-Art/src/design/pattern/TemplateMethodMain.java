package design.pattern;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TemplateMethodMain {
	public static void main(String[] args){
		//subject
		//玄関
		AlertMachine door = new AlertMachine();
		//裏門
		AlertMachine backDoor = new AlertMachine();

		//各通知先のインスタンス

		//玄関.attach(各通知先のインスタンス)

		//alert


	}
}

//単にリストを管理するクラス
class Subject02 {
    private List observers02 = new ArrayList();
    //登録
    public void attach(Observer02 o) {
        observers02.add(o);
    }
    public void detach(Observer02 o) {
        observers02.remove(o);
    }
    public void notifyObservers() {
        Iterator i = observers02.iterator();
        while (i.hasNext())
        	((Observer02)i.next()).update(this);
	}
}
// --------------
interface Observer02 {
    void update(Subject02 theChangeSubject);
}
class AlertMachine extends Subject02 {

	//getMessage

	//getLocation

    public void alert() {
    	//各社や機器に警報通知
        notifyObservers();
	}
}
// --------------

//右側のサブクラス
class AntiCrimeAlerm implements Observer02 {
    private AlertMachine alertMachine;
    //コンストラクタ
    public AntiCrimeAlerm(AlertMachine alertMachine) {
        this.alertMachine = alertMachine;
    }
    public void update(Subject02 theChangeSubject) {
        if (theChangeSubject == alertMachine)
        	alert();
    }
    public void alert() {
		// 通知
		System.out.println("侵入者です1");
	}
}

class ServiceCompany implements Observer02 {
    private AlertMachine alertMachine;
    //コンストラクタ
    public ServiceCompany(AlertMachine alertMachine) {
        this.alertMachine = alertMachine;
    }
    public void update(Subject02 theChangeSubject) {
        if (theChangeSubject == alertMachine)
        	alert();
    }
    public void alert() {
		 // 通知
		 System.out.println("侵入者です2");
	}
}

class CellPhone implements Observer02 {
    private AlertMachine alertMachine;
    //コンストクタ
    public CellPhone(AlertMachine alertMachine) {
        this.alertMachine = alertMachine;
    }
    public void update(Subject02 theChangeSubject) {
        if (theChangeSubject == alertMachine)
        	alert();
    }
    public void alert() {
		 // 通知
    	System.out.println("侵入者です3");
	}
}