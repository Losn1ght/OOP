package version3;

public class MyDate {

    private int month;
    private int day;
    private int year;

    public MyDate(){

    }

    public MyDate(int month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void display(){
        System.out.println(this);
    }

    @Override
    public String toString(){
        return String.format("Date: %d/%d/%d", month, day, year);
    }
}



