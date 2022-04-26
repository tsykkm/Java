package basic.inheritance;

public class ExecMain {
	public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.fieldA); // field A
        System.out.println(child.fieldB); // field B
        System.out.println(child.methodA()); // method A in Child Overrided
        System.out.println(child.methodB()); // method B

        System.out.println("----");

        Parent parent = new Child();
		System.out.println(parent.fieldA); // field A
//		親クラスからフィールドやメソッドの定義を継承する（コードの再利用）
//		子クラスが親クラスの型を持っているが、実行時の振る舞いは代入されているインスタンスで決まる（ポリモーフィズム）
//		この型の継承とポリモーフィズムということに着目すると、もともとの親クラスのメソッドの実装は不要になる
		System.out.println(parent.methodA()); // method A in Child
	}
}
