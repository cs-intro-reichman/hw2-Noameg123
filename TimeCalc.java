public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0]; //השעה
        int minutesToAdd = Integer.parseInt(args[1]); //כמה דקות להוסיף
        int time_minutes = Integer.parseInt(time.substring(3, 5)); //דקות בשעה בקלט
        int time_hours = Integer.parseInt(time.substring(0, 2)); //דקות בשעה בקלט
        int hours_add = minutesToAdd / 60;   // כמה שעות שלמות
        int minutes_add = minutesToAdd % 60; // השארית - הדקות
        int new_minutes = time_minutes + minutes_add;
        int new_hour = (time_hours + hours_add) %24;
        new_hour += new_minutes / 60;   // כל 60 דקות -> שעה
        new_minutes = new_minutes % 60; // השארית
        String formatted_hours = String.format("%02d", new_hour);
        String formatted_minutes = String.format("%02d", new_minutes);
        System.out.println(formatted_hours + ":" + formatted_minutes);
    }
}
