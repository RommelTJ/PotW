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
        String initialBarrels = "Barrels: {";
        for (int i=0; i<array.length; i++){
            if (i==(array.length-1)) {
                initialBarrels += array[i]+"}";
            } else {
                initialBarrels += array[i] + ", ";
            }
        }
        System.out.println(initialBarrels);
        solve(array);
    }

    private static void solve(int[] barrels) {
        for (int i = 0; i < barrels.length; i++) {
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
            if (totalVolume%3==0) {
                int firstRestaurantVol = totalVolume/3;
                System.out.println("Beer barrel is " + barrels[i]);
                findNumbers(barrels, 0, 0, firstRestaurantVol, "");
                System.out.println("The second restaurant took the remaining barrels");
                break;
            }
        }
    }

    public static String findNumbers(int[] list, int index, int current, int goal, String result)
    {
        if (list.length < index || current>goal)
            return result;
        for (int i = index; i < list.length; i++) {
            if (current + list[i] == goal)   {
                result = "The first restaurant took Barrels: {"+result +", "+list[i]+"}";
                System.out.println(result);

                return result;
            }
            else if (current + list[i] < goal) {
                findNumbers(list, i + 1, current + list[i], goal, result + list[i]);
            }
        }
        return result;
    }

}
