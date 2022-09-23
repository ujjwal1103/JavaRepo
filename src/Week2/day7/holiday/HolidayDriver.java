package Week2.day7.holiday;

public class HolidayDriver {
    public static void main(String[] args) {
        Holiday [] holidays = new Holiday[2];
        holidays[0] = new Holiday("Independence Day",15,"August");
        holidays[1] = new Holiday("Republic Day",26,"January");
        boolean isSameMonth=  holidays[0].isSameMonth(holidays[1]);
        System.out.println(isSameMonth);
        System.out.println(Holiday.avgDate(holidays));
    }
}
