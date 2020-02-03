package gr.codehub.NewCollege.demo.util;

public class Util {
    private static int autoNumber = 1000;
    public static  String randomName(String prefix){
        autoNumber++;
        return prefix + " " + (int)(Math.random()*899 + 100) + autoNumber;

    }

    public static int randomInt(int from , int to){
        return (int)(Math.random()*(to - from) + from);
    }
}
