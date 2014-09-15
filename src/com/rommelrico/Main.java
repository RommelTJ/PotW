package com.rommelrico;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[6];
        array[0] = 15;
        array[1] = 31;
        array[2] = 19;
        array[3] = 20;
        array[4] = 16;
        array[5] = 18;
        System.out.println(solve(array));
    }

    private static String solve(int[] barrels) {
        for (int i = 0; i < barrels.length; i++) {
            System.out.println("Beer barrel is " + barrels[i]);
            int totalVolume = 0;
            switch (i) {
                case 0:
                    totalVolume = barrels[1] + barrels[2] + barrels[3] + barrels[4] + barrels[5];
                    break;
                case 1:
                    totalVolume = barrels[0] + barrels[2] + barrels[3] + barrels[4] + barrels[5];
                    break;
                case 2:
                    totalVolume = barrels[1] + barrels[0] + barrels[3] + barrels[4] + barrels[5];
                    break;
                case 3:
                    totalVolume = barrels[1] + barrels[2] + barrels[0] + barrels[4] + barrels[5];
                    break;
                case 4:
                    totalVolume = barrels[1] + barrels[2] + barrels[3] + barrels[0] + barrels[5];
                    break;
                case 5:
                    totalVolume = barrels[1] + barrels[2] + barrels[3] + barrels[4] + barrels[0];
                    break;
                default:
                    break;
            }
            System.out.println("Total Volume: "+totalVolume);
            int thirdVolume = totalVolume/3;
            System.out.println(thirdVolume);
        }
        return "Solution not found.";
    }

}
