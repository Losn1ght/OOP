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
        this.hours = (hours <= 12 && hours > 0) ? hours : this.hours;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = (minutes < 60 && minutes >= 0) ? minutes : this.minutes;
    }


    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = (seconds < 60 && seconds >= 0) ? seconds : this.seconds;
    }

    public boolean isPM(){ return isPM; }

    public void setPM(boolean isPM){ this.isPM = isPM;}


    // tick by second
    public void tickbySec(){
        seconds++;
        if(this.seconds > 59){
            this.seconds = 0;
            tickMin();
        }
    }


    // tick by minute
    public void tickMin(){
        minutes++;
        if(this.minutes > 59){
            this.minutes = 0;
            tickHour();
        }
    }

    // tick by hour
    public void tickHour(){
        hours++;
        if(this.hours > 12){
            this.hours = 0;
            this.isPM = !isPM;
        }
    }



    // advance time
    public void advanceTime(int seconds) {
        this.seconds += seconds;

        this.minutes += this.seconds / 60;
        this.seconds = this.seconds % 60;

        this.hours += this.minutes / 60;
        this.minutes = this.seconds % 60;

        if (this.hours > 12) {
            this.isPM = !this.isPM;
            this.hours -= 12;
            this.hours = this.hours % 12;
        }

        if(this.hours == 0){
            this.hours = 12;
        }

    }


    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d %s", hours, minutes, seconds, (isPM) ? "PM" : "AM");
    }


}


