package design.factory;

public class Main {
	public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("Œ‹é_");
        Product card2 = factory.create("‚Æ‚Þ‚ç");
        Product card3 = factory.create("²“¡‰ÔŽq");
        card1.use();
        card2.use();
        card3.use();
	}
}
