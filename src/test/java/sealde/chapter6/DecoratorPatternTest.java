package sealde.chapter6;

import org.junit.Test;

/**
 * Created by sealde on 8/4/17.
 */
public class DecoratorPatternTest {
    @Test
    public void decoratorTest() {
        Person person = new Person("阿狸");

        System.out.println("第一套装扮:");

        BigTrouser bigTrouser = new BigTrouser();
        Suit suit = new Suit();
        LeatherShoes leatherShoes = new LeatherShoes();

        bigTrouser.decorate(person);
        suit.decorate(bigTrouser);
        leatherShoes.decorate(suit);
        leatherShoes.show();

        System.out.println("第二套装扮:");

        Sneakers sneakers = new Sneakers();
        Tie tie = new Tie();
        TShirts tShirts = new TShirts();

        sneakers.decorate(person);
        tie.decorate(sneakers);
        tShirts.decorate(tie);
        tShirts.show();

        System.out.println("第三套装扮:");

        Suit suit1 = new Suit();
        LeatherShoes leatherShoes1 = new LeatherShoes();
        Tie tie1 = new Tie();
        TShirts tShirts1 = new TShirts();

        suit1.decorate(person);
        leatherShoes1.decorate(suit1);
        tie1.decorate(leatherShoes1);
        tShirts1.decorate(tie1);
        tShirts1.show();
    }
}
