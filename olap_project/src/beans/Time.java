package beans;

import java.sql.Date;

public class Time {
    private int timeKey;
    private Date date;
    private String dayOfWeek;
    private int dayNumberInMonth;
    private int dayNumberOverall;
    private int weekNumberInYear;
    private int weekNumberOverall;
    private String month;
    private int quarter;
    private String fiscalPeriod;
    private int year;
    private String holidayFlag;

    public int getTimeKey() {
        return timeKey;
    }

    public void setTimeKey(int timeKey) {
        this.timeKey = timeKey;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public int getDayNumberInMonth() {
        return dayNumberInMonth;
    }

    public void setDayNumberInMonth(int dayNumberInMonth) {
        this.dayNumberInMonth = dayNumberInMonth;
    }

    public int getDayNumberOverall() {
        return dayNumberOverall;
    }

    public void setDayNumberOverall(int dayNumberOverall) {
        this.dayNumberOverall = dayNumberOverall;
    }

    public int getWeekNumberInYear() {
        return weekNumberInYear;
    }

    public void setWeekNumberInYear(int weekNumberInYear) {
        this.weekNumberInYear = weekNumberInYear;
    }

    public int getWeekNumberOverall() {
        return weekNumberOverall;
    }

    public void setWeekNumberOverall(int weekNumberOverall) {
        this.weekNumberOverall = weekNumberOverall;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getQuarter() {
        return quarter;
    }

    public void setQuarter(int quarter) {
        this.quarter = quarter;
    }

    public String getFiscalPeriod() {
        return fiscalPeriod;
    }

    public void setFiscalPeriod(String fiscalPeriod) {
        this.fiscalPeriod = fiscalPeriod;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getHolidayFlag() {
        return holidayFlag;
    }

    public void setHolidayFlag(String holidayFlag) {
        this.holidayFlag = holidayFlag;
    }
}
