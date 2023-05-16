package ASSIGNMENT3;

public class Q2 {
        public static void main(String[] args) {
            String[] favoriteColors = {"blue", "green", "orange", "purple"};

            try {
                String color = favoriteColors[4];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Index out of bounds");
            }
            try {
                favoriteColors[2] = null;
            } catch (NullPointerException e) {
                System.out.println("Error: Null value not allowed");
            }
            for (String color : favoriteColors) {
                if (color != null) {
                    System.out.println(color);
                }
            }
        }
    }