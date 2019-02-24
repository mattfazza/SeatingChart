package com.ctc;

public class SeatingChartDriver {

    public static void main(String[] args){

        Row  myRow = new Row();

        myRow.reserveSeat(1);
        myRow.reserveSeat(2);
        myRow.reserveSeat(3);
        myRow.reserveSeat(6);
        myRow.reserveSeat(7);
        myRow.reserveSeat(8);

        for(int i = 0; i < myRow.seats.length; i++){
            System.out.println(myRow.seats[i]);
        }

        System.out.println(myRow.whereAndQuantity);
    }
}
