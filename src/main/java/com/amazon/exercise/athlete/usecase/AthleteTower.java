package com.amazon.exercise.athlete.usecase;

import com.amazon.exercise.athlete.domain.Athlete;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: felipe
 * Date: 2/24/13
 * Time: 11:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class AthleteTower {

    private List<Athlete> athletes;

    public AthleteTower(List<Athlete> athletes) {
        this.athletes = athletes;
    }

    public Integer maxNumberOfAthletes(){
        Integer counter = 0;
        Athlete first = null;

        for(Athlete athlete: athletes){

            if(null == first){
                first = athlete;
            }
            else{
                first.climb(athlete);
            }

            // FIXME?
            // should it raise on exception on line 32, when a new person on tower makes it unsustainable?
            // or is this ok?
            if(first.canHandleTheTowerAboveMe()){
                counter++;
            }
            else {
                return counter;
            }

        }

        return null;
    }

}
