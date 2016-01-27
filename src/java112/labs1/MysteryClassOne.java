package java112.labs1;

public class MysteryClassOne {

    public static void main (String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        MysteryClassOne demo = new MysteryClassOne();
        System.out.println(demo.mysteryMethodOne());
    }

    public int mysteryMethodOne() {
        return 1;

    }

}
