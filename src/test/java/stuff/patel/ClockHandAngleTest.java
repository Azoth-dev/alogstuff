package stuff.patel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClockHandAngleTest {

    @Test
    public void test30Digree(){

        assertEquals(ClockHandAngle.findAngle(1,15),52.5);
        assertEquals(ClockHandAngle.findAnglePatel(1,15),52.5);

        assertEquals(ClockHandAngle.findAngle(1,15),ClockHandAngle.findAnglePatel(1,15));
        assertEquals(ClockHandAngle.findAngle(11,15),ClockHandAngle.findAnglePatel(11,15));
        assertEquals(ClockHandAngle.findAngle(1,60),ClockHandAngle.findAnglePatel(1,60));
        assertEquals(ClockHandAngle.findAngle(7,5),ClockHandAngle.findAnglePatel(7,5));
        assertEquals(ClockHandAngle.findAngle(7,0),ClockHandAngle.findAnglePatel(7,0));
        assertEquals(ClockHandAngle.findAngle(0,0),ClockHandAngle.findAnglePatel(0,0));
        assertEquals(ClockHandAngle.findAngle(0,12),ClockHandAngle.findAnglePatel(0,12));
    }

//    @Test
//    public void test0Degree(){
//
//    }
//
//    @Test
//    public void test270Degree(){
//
//    }
//
//    @Test
//    public void test180Degree(){
//
//    }
//
//    @Test
//    public void test360Degree(){
//
//    }

}