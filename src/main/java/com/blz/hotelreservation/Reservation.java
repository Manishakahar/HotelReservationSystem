package com.blz.hotelreservation;

public class Reservation {

    String hotelName;
    private int regularWeekDay;
    private int regularWeekEnd;
    private int rewardeeWeekDay;
    private int rewardeeWeekEnd;

    Reservation(String name) {
        this.hotelName = name;
    }

    public int getRegularWeekDay() {
        return regularWeekDay;
    }
    public void setRewardeeWeekDay(int rewardeeWeekDay) {
        this.rewardeeWeekDay = rewardeeWeekDay;
    }

    public int getRewardeeWeekEnd() {
        return rewardeeWeekEnd;
    }

    public void setRewardeeWeekEnd(int rewardeeWeekEnd) {
        this.rewardeeWeekEnd = rewardeeWeekEnd;
    }
    private static void initialise(Hotel[] myHotel) {
        for (int x = 0; x < myHotel.length; x++) {
            myHotel[x].setName("nobody");
        }

    }
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation System");
        initialise(Hotel);
    }
}
