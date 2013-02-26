package com.amazon.exercise.athlete.usecase;

import com.amazon.exercise.athlete.domain.Athlete;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * <b>Coding exercise:</b>
 * Every athlete is characterized by his mass 'm' (in kg) and strength 's' (in kg). You are to find the maximum number
 * of athletes that can form a tower standing one upon another. An athlete can hold a tower of athletes with total mass
 * equal to his strength or less than his strength. Input contains the number of athletes n and their parameters. These
 * inputs can be assumed to be passed as arguments (Integer n and List<Pair<Integer, Integer>> parameterList) appropriate
 * for your language of choice.
 */
public class AthleteTowerTest {
    private AthleteTower athleteTower;

    @Test
    public void inTheOriginalExampleMaxNumberIs2(){
        athleteTower = new AthleteTower(new ArrayList<Athlete>(){{
            add(new Athlete(3, 4));
            add(new Athlete(2, 2));
            add(new Athlete(7, 6));
            add(new Athlete(4, 5));
        }});

        Integer max = athleteTower.maxNumberOfAthletes();

        assertNotNull(max);
        assertEquals(new Integer(2), max);
    }

    @Test
    public void whenFirstGuyIsStr9AndSecondGuyIsStr7MaxTowerIs3(){
        athleteTower = new AthleteTower(new ArrayList<Athlete>(){{
            add(new Athlete(3, 9));
            add(new Athlete(2, 7));
            add(new Athlete(7, 6));
            add(new Athlete(4, 5));
        }});

        Integer max = athleteTower.maxNumberOfAthletes();

        assertNotNull(max);
        assertEquals(new Integer(3), max);
    }
}
