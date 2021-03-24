package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int minutes, int seconds){
        if(minutes >= 0 || (seconds >=0 && seconds <=59)){
            //Calculate how many hours, minutes, and seconds equal the minutes and seconds passed to this method
                // return that value as string in format "XXh YYm ZZs"
            int hours = minutes / 60;
            int remainderMinutes = minutes % 60;
            return  hours + "h " + remainderMinutes + "m " + seconds + "s";
        }
        else{
            return "Invalid Value";
        }
    }

    public static String getDurationString(int seconds){
        if(seconds >=0){
            int minutes = seconds / 60;
            int remainingMinutes = seconds % 60;
            return getDurationString(minutes, remainingMinutes);
        }
        else{
            return "Invalid Value";
        }
    }
}
