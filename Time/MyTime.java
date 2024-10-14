package org.example;

public class MyTime {

    private int hours;
    private int minutes;
    private int seconds;
    private boolean isPM;

    public MyTime() {

    }

    public MyTime(int hrs, int min, int sec, boolean isPM ){
        setHours(hrs);
        setMinutes(min);
        setSeconds(sec);
        this.isPM = isPM;
    }


    public void setHours(int hours) {
        this.hours = (hours <= 12 && hours > 0) ? hours : 12;
    }

    public int getHours() {
        return this.hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = (minutes < 60 && minutes >= 0) ? minutes : 0;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = (seconds < 60 && seconds >= 0) ? seconds : 0;
    }

    public boolean isPM(){ return isPM; }

    public void setPM(boolean PM){ isPM = PM;}


    // tick by second
    public void tickbySec(){
        this.seconds++;
        if(this.seconds >= 60){
            this.seconds = 0;
            tickMin();
        }
    }


    // tick by minute
    public void tickMin(){
        this.minutes++;
        if(this.minutes >= 60){
            this.minutes = 0;
            tickHour();
        }
    }

    // tick by hour
    public void tickHour(){
        this.hours++;
        if(this.hours > 12){
            this.hours = 1;
            toggleMeredian();
        }
    }

    // tick by meredian
    public void toggleMeredian(){
        isPM = !isPM;
    }


    // advance time
    public void advanceTime(int seconds) {
        int totalSeconds = this.seconds + seconds;
        this.seconds = totalSeconds % 60;

        int totalMinutes = this.minutes + totalSeconds / 60;
        this.minutes = totalMinutes % 60;

        int totalHours = this.hours + totalMinutes / 60;
        this.hours = totalHours % 12;

        if(this.hours == 0){
            this.hours = 12;
        }

        if (totalHours >= 12) {
            toggleMeredian();
        }
    }


    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d %s", hours, minutes, seconds, isPM ? "PM" : "AM");
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.hours;
        hash = 89 * hash + this.minutes;
        hash = 89 * hash + this.seconds;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MyTime other = (MyTime) obj;
        if (this.hours != other.hours) {
            return false;
        }
        if (this.minutes != other.minutes) {
            return false;
        }
        return this.seconds == other.seconds;
    }
}
