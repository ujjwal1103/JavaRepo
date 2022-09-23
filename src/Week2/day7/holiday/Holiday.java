package Week2.day7.holiday;

public class Holiday {
    private String  name;
    private int day;
    private String month;

    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    boolean isSameMonth(Holiday holiday){
        return this.month == holiday.month;
    }

    static double avgDate(Holiday[] holidays){
        int sum = 0;
        for(Holiday holiday:holidays){
            sum +=holiday.day;
        }
        return sum/holidays.length;
    }


}
