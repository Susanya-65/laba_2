package com.company;

import java.util.Random;

public class PassGen {
    public String getPass(int length) {
        String result = "";
        int f=0;
        Random rand = new Random();
        for(int i=0;i<length;i++) {
            switch(rand.nextInt(5)) {
                case 0: case 1: {
                   f = rand.nextInt(10);
                    result+=f;
                    break;
                }
                case 2: {
                    f = rand.nextInt(25)+65;
                    result+=(char)f;
                    break;
                }
                case 3: {
                    f = rand.nextInt(25)+97;
                    result+=(char)f;
                    break;
                }
                case 4: {
                    result+="_";
                    break;
                }
            }
        }
        return result;
    }
}
