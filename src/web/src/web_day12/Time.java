package web_day12;

public class Time {
    private int hour, minute,second;


    Time(int hour, int minute, int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour >23){
            return;
        }
        this.hour = hour;
    }

    public void setMinute(int minute) {
        if (minute <0 || minute >59){
            return;
        }
        this.minute = minute;
    }

    public void setSecond(int second) {
        if (second <0  || second > 59) return;
        this.second = second;
    }
}
