package chapterone.enums;

public class DeclareEnum {

    public enum CoffeeSize {
        BIG,
        HUGE,
        OVERWHELMING
    };

    public static void main(String[] args) {
        CoffeeSize bigSizeCoffee = CoffeeSize.BIG;
        System.out.println(bigSizeCoffee);
        System.out.println(bigSizeCoffee.getClass().getTypeName());
        String hugeSizeCoffee = CoffeeSize.HUGE.toString();
        System.out.println(hugeSizeCoffee);
        System.out.println(hugeSizeCoffee.getClass().getTypeName());

        OuterEnum bigSizeCoffeeFromOuterEnum = OuterEnum.BIG;
        System.out.println(bigSizeCoffeeFromOuterEnum);
        System.out.println('b' + 'i' + 't');
    }
}
