package design.pattern;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Study61 {
public static void main(String[] args){
	//subject
	ClockTimer myClockTimer = new ClockTimer();
	//object
	DigitalClock myDigitalClock = new DigitalClock(myClockTimer);
	//ここで複数のインスタンスを突っ込む
	myClockTimer.attach(myDigitalClock);
	myClockTimer.tick();

}
}

//単にリストを管理するクラス
class Subject {
    private List observers = new ArrayList();
    //登録
    public void attach(Observer o) {
        observers.add(o);
    }
    public void detach(Observer o) {
        observers.remove(o);
    }
    public void notifyObservers() {
        Iterator i = observers.iterator();
        while (i.hasNext())
        	((Observer)i.next()).update(this);
	}
}
interface Observer {
    void update(Subject theChangeSubject);
}
class ClockTimer extends Subject {
    public int getHour() {
		// 時を返す
		return 8;
	}
	public int getMinute() {
		// 分を返す
		return 30;
    }
    public int getSecond() {
		// 秒を返す
		return 45;
		}
    public void tick() {
        notifyObservers();
	}
}
class DigitalClock implements Observer {
    private ClockTimer subject;
    public DigitalClock(ClockTimer subject) {
        this.subject = subject;
    }
    public void update(Subject theChangeSubject) {
        if (theChangeSubject == subject)
            draw();
    }
    public void draw() {
		int hour = subject.getHour();
		int minute = subject.getMinute();
		int second = subject.getSecond();
		 // 時刻を描画する
		 System.out.println(hour + ":" + minute + ":" + second);
	}
}