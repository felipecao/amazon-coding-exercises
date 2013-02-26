package com.amazon.exercise.athlete.domain;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: felipe
 * Date: 2/24/13
 * Time: 11:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class AthleteTest {

    @Test
    public void ifMyStrengthIs2ICanHandleTwoGuysWeighting1(){
        Athlete me = new Athlete(1, 2);
        Athlete one = new Athlete(1, 1);
        Athlete two = new Athlete(1, 1);

        me.climb(one);
        me.climb(two);

        assertTrue(me.canHandleTheTowerAboveMe());
    }

    @Test
    public void ifMyStrengthIs2ICannotHandleThreeGuysWeighting1(){
        Athlete me = new Athlete(1, 2);
        Athlete one = new Athlete(1, 1);
        Athlete two = new Athlete(1, 1);
        Athlete three = new Athlete(1, 1);

        me.climb(one);
        me.climb(two);
        me.climb(three);

        assertFalse(me.canHandleTheTowerAboveMe());
    }
}
