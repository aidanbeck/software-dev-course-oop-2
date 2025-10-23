package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class LemonadeTests {
    @Test
    public void testCreateLemonade() {
        Lemonade lemonade = new Lemonade();
        assertEquals(4, lemonade.getLemons());
        assertEquals(2, lemonade.getSugar());
        assertEquals(3, lemonade.getIce());
    }

    @Test
    public void testCreateLemonadeWithArgs() {
        Lemonade lemonade = new Lemonade(5, 3, 4);
        assertEquals(5, lemonade.getLemons());
        assertEquals(3, lemonade.getSugar());
        assertEquals(4, lemonade.getIce());
    }

    @Test
    public void testGettersAndSetters() {
        Lemonade lemonade = new Lemonade();
        lemonade.setLemons(5);
        lemonade.setSugar(3);
        lemonade.setIce(4);
        assertEquals(5, lemonade.getLemons());
        assertEquals(3, lemonade.getSugar());
        assertEquals(4, lemonade.getIce());
    }

    @Test
    public void testMix() {
        Lemonade lemonade1 = new Lemonade(5, 3, 4);
        Lemonade lemonade2 = new Lemonade(3, 2, 1);
        Lemonade lemonade3 = Lemonade.mix(lemonade1, lemonade2);
        assertEquals(8, lemonade3.getLemons());
        assertEquals(5, lemonade3.getSugar());
        assertEquals(5, lemonade3.getIce());
    }

    @Test
    public void testMixEdgeCases() {
        Lemonade lemonade1 = new Lemonade();
        assertEquals(null, lemonade1.getLemons());
        assertEquals(null, lemonade1.getSugar());
        assertEquals(null, lemonade1.getIce());
    }
}
