package com.ctc;

import java.util.Arrays;
import java.util.HashMap;

public class Row {

    //  Manhattan Middle: Row 1 Column 6
    public int best = 5;

    //  this HashMap tells us where the longest subsequence is and how long it is in the row
    HashMap<Integer, Integer> whereAndQuantity = new HashMap<Integer, Integer>();

    public int[] seats = new int[11];


    public Row(){ }

    public boolean reserveSeat(int sNumber){

        if(this.seats[sNumber] == 0){
            this.seats[sNumber] = 1;
            findLongestSequence();
            return true;
        }else{
            return false;
        }
    }


    //to do:
    public void findLongestSequence() {

        int acc = 0;
        int nOfSeats = 0;
        int location = -1; //index of first element
        int[] nOfSeatsTemp = new int[11];   //maximum possible length
        int[] locationTemp = new int[11];   //maximum possible length
        Arrays.fill(locationTemp, -1);

        for (int i = 0; i < seats.length; i++) {
            if (this.seats[i] == 0) {
                nOfSeatsTemp[acc] += 1;
                //  only update location when it's the first one
                if (locationTemp[acc] == -1) {
                    locationTemp[acc] = i;
                }else{
                    //  whenever a seat is found, increment accumulator
                    acc++;
                }
            }
        }

        for(int j = 0; j < nOfSeatsTemp.length; j++){
            if(nOfSeatsTemp[j] > nOfSeats){
                nOfSeats = nOfSeatsTemp[j];
                location = locationTemp[j];
            }
        }

        if (nOfSeats != 0 && location != -1) {
            whereAndQuantity.clear();
            whereAndQuantity.put(location, nOfSeats);
        }

    }

}
