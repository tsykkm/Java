import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Exam64 {
public static void main(String[] args){

	SecurityDevice frontSecurityDevice = new SecurityDevice("玄関");
	SecurityDevice backSecurityDevice = new SecurityDevice("裏門");
	
	Alarm myAlarm = new Alarm(frontSecurityDevice);
	SecurtyService mySecurtyService= new SecurtyService(frontSecurityDevice);
	MobilePhone myMobilePhone= new MobilePhone(frontSecurityDevice);

	frontSecurityDevice.attach(myAlarm);
	frontSecurityDevice.attach(mySecurtyService);
	frontSecurityDevice.attach(myMobilePhone);
	
	backSecurityDevice.attach(myAlarm);
	backSecurityDevice.attach(myMobilePhone);
	
	frontSecurityDevice.detect();
	
	backSecurityDevice.detect();

}
}

class Subject {
    private List observers = new ArrayList();
    public void attach(Observer o) {
        observers.add(o);
    }
    public void detach(Observer o) {
        observers.remove(o);
    }
    public void notifyObservers() {
    	observers.forEach(observer -> ((Observer)observer).update(this));

// 拡張for
//	   	for (Object observer : observers) {
//    		((Observer)observer).update(this);
//    	}

//// 元のIterator
////        Iterator i = observers.iterator();
////        while (i.hasNext())
////       	((Observer)i.next()).update(this);

	} 
}
interface Observer {
    void update(Subject theChangeSubject);
}
class SecurityDevice extends Subject {
	String location;
	public SecurityDevice(String location) {
		this.location = location;
	}
    public void detect() {
        notifyObservers();
	} 
	public String getMessage() {
		return "異常検知";
	}
	public String getLocation() {
		return location;
	}
}

class Alarm implements Observer {
    private SecurityDevice subject;
    public Alarm(SecurityDevice subject) {
        this.subject = subject;
    }
    public void update(Subject theChangeSubject) {
    	subject = (SecurityDevice) theChangeSubject;
		display();
    }
    public void display() {
		 System.out.println("アラーム:"+subject.getMessage()+":"+subject.getLocation());
	} 
}
class SecurtyService implements Observer {
    private SecurityDevice subject;
    public SecurtyService(SecurityDevice subject) {
        this.subject = subject;
    }
    public void update(Subject theChangeSubject) {
        subject = (SecurityDevice) theChangeSubject;
        call();
    }
    public void call() {
		 System.out.println("警備出動:"+subject.getMessage()+":"+subject.getLocation());
	} 
}
class MobilePhone implements Observer {
    private SecurityDevice subject;
    public MobilePhone(SecurityDevice subject) {
        this.subject = subject;
    }
    public void update(Subject theChangeSubject) {
        subject = (SecurityDevice) theChangeSubject;
        display();
    }
    public void display() {
		 System.out.println("侵入者通報:"+subject.getMessage()+":"+subject.getLocation());
	} 
}