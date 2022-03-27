package com.eugene.dev;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String genID = "PID" + generate();
        System.out.println(genID);

    }
        /*generate new number*/
        public static int generate() {
            int randNum = (int) Math.round(Math.random() * 100);
            return randNum;

    }
}
