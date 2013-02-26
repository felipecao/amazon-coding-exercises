package com.amazon.exercise.athlete.domain;

/**
 * Created with IntelliJ IDEA.
 * User: felipe
 * Date: 2/24/13
 * Time: 11:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class Athlete {
    private Integer mass;
    private Integer strength;
    private Athlete athleteAboveMe;

    public Athlete(Integer mass, Integer strength) {
        this.mass = mass;
        this.strength = strength;
    }

    public Integer getMass() {
        return mass;
    }

    //-- FIXME? are the methods below inherent to an athlete? Or are they use-case specific? --//

    public Boolean canHandleTheTowerAboveMe(){
        return (totalWeightOverMyShoulders() <= strength);
    }

    // FIXME? should it raise a CantHandleThisTowerException when, upon someone climbing, the weight becomes unsustainable?
    public void climb(Athlete anAthlete){
        if(!anAthlete.equals(this)) {
            if(null == athleteAboveMe){
                athleteAboveMe = anAthlete;
            }
            else{
                athleteAboveMe.climb(anAthlete);
            }
        }
    }

    private Integer totalWeightOverMyShoulders(){
        if(null != athleteAboveMe){
            return athleteAboveMe.getMass() + athleteAboveMe.totalWeightOverMyShoulders();
        }
        return 0;
    }
}
