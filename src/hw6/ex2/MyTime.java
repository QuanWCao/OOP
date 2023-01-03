package hw6.ex2;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime() {

        this(0, 0, 0);
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {
            throw new IllegalArgumentException("Invalid hour");
        }
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException("Invalid minute");
        }
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second < 0 || second > 59) {
            throw new IllegalArgumentException("Invalid second");
        }
        this.second = second;
    }

    public String toString() {
        String hour;
        String minute;
        String second;

        if (this.hour < 10) {
            hour = "0" + String.valueOf(this.hour);
        } else {
            hour = String.valueOf(this.hour);
        }

        if (this.minute < 10) {
            minute = "0" + String.valueOf(this.minute);
        } else {
            minute = String.valueOf(this.minute);
        }

        if (this.second < 10) {
            second = "0" + String.valueOf(this.second);
        } else {
            second = String.valueOf(this.second);
        }

        return hour + ":" + minute + ":" + second;
    }

    public MyTime nextSecond() {
        second++;
        if (second >= 60) {
            second = 0;
            minute++;
            if (minute >= 60) {
                minute = 0;
                hour++;
                if (hour >= 24) {
                    hour = 0;
                }
            }
        }
        return this;
    }

    public MyTime nextMinute() {
        minute++;
        if (minute >= 60) {
            minute = 0;
            hour++;
            if (hour >= 24) {
                hour = 0;
            }
        }
        return this;
    }

    public MyTime nextHour() {
        hour++;
        if (hour >= 24) {
            hour = 0;
        }
        return this;
    }

    public MyTime previousSecond() {
        second--;
        if (second <= -1) {
            second = 59;
            minute--;
            if (minute <= -1) {
                minute = 59;
                hour--;
                if (hour <= -1) {
                    hour = 23;
                }
            }
        }
        return this;
    }

    public MyTime previousMinute() {
        minute--;
        if (minute <= -1) {
            minute = 59;
            hour--;
            if (hour <= -1) {
                hour = 23;
            }
        }
        return this;
    }

    public MyTime previousHour() {
        hour--;
        if (hour <= -1) {
            hour = 23;
        }
        return this;
    }
}