package stuff.patel;

/**
 * This class provides utility to meaure angle between hr and min hand at any given point in time
 */
public class ClockHandAngle {

    public static double findAngle(int hour, int minute) {

        //calculate hr hand angle from the origin
        double hrHandAngle=(hour*60+minute)*.5;

        //calculate min  hand angle from the origin
        double minHandAngle=minute*6;

        //dff between
        if(Math.abs(hrHandAngle-minHandAngle)>180){
            return 360-Math.abs(hrHandAngle-minHandAngle);
        }else
            return Math.abs(hrHandAngle-minHandAngle);
    }

    public static double findAnglePatel(int hour, int minute) {
        // in 60 mins, it takes 360 degree. so for a 1 min = 360/60 = 6 degree
        double minAngle = minute * 6;

        // in 12 hours, it takes 360 degree. so for 1 hour = 360/12 = 30 degree
        double hourAngle = hour * 30;

        //but when it is 1.20, hour hand doesn't be on exact 1, and would be slightly crossed 1 (when it is 1.30, hour hand would be in between 1 and 2.)
        //So you need to find out the exact position of the hour hand and the angle it covered between a single hour.
        //that is you need to find the angle hour hand makes for each minute passes.
        //we already know 1 hour angle = 30 degree
        //In 1 hour, we have 60 minutes, so in each minute, how much angle hour hand makes = 30/60 = 1/2.
        double hourAngleForEachMinute = minute/2.0; //minute * 1/2; (divided by 2.0 to make it divide in double context)

        //Final hour angle would be hourAngle + hourAngleForEachMinute
        double finalHourAngle = hourAngle + hourAngleForEachMinute;

        double angle = Math.abs(finalHourAngle - minAngle);

        //analog clock is round, so clock hands make two angles, one in interior and one is exterior, Since we are told to return smaller angle we return minimum one.
        return Math.min(angle, 360-angle);
    }
}




