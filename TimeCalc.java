public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0]; // השעה
        int minutesToAdd = Integer.parseInt(args[1]); // כמה דקות להוסיף

        int time_minutes = Integer.parseInt(time.substring(3, 5)); // דקות
        int time_hours = Integer.parseInt(time.substring(0, 2));   // שעות

        int hours_add = minutesToAdd / 60;
        int minutes_add = minutesToAdd % 60;

        int new_minutes = time_minutes + minutes_add;
        int new_hour = time_hours + hours_add + (new_minutes / 60);
        new_minutes = new_minutes % 60;
        new_hour = new_hour % 24;

        String formatted_hours = String.format("%02d", new_hour);
        String formatted_minutes = String.format("%02d", new_minutes);

        System.out.println(formatted_hours + ":" + formatted_minutes);
    }
}
