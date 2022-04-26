package basic.inheritance;

public class Child extends Parent{
    public String fieldB = "field B";

    @Override
    public String methodA() { // 親クラスのメソッドをオーバーライドする。
        return "method A in Child Overrided";
    }

    public String methodB() {
	return "method B";
    }
}
