public class SingleDimensionArr {
    public static void main(String[] args) {
        // * create 5 program which uses signle dimension array
        // * 1. create an array of 5 elements and print them
        int[] arr = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // * 2. create an array of 5 elements and print the sum of all elements
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of all elements: " + sum);
        // * 3. create an array of 5 elements and print the largest element
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Largest element: " + max);
        // * 4. create an array of 5 elements and print the smallest element
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Smallest element: " + min);
        // * 5. create an array of 5 elements and print the average of all elements
        double avg = (double) sum / arr.length;
        System.out.println("Average of all elements: " + avg);

        // * create 5 program using multi dimension array which used 2D as well as 3D array and should be different from single dimension array
        // * 1. create a 2D array of 3x3 and print them
        int[][] arr2D = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }
        // * 2. create a 2D array of 3x3 and print the sum of all elements
        sum = 0;
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                sum += arr2D[i][j];
            }
        }
        System.out.println("Sum of all elements: " + sum);
        // * 3. create a 2D array of 3x3 and print it on screen and also print the largest element

        max = arr2D[0][0];
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                if (arr2D[i][j] > max) {
                    max = arr2D[i][j];
                    System.out.print(arr2D[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("Largest element: " + max);
        // * 4. create a 2D array of 3x3 and print it on screen and also print the smallest element

        min = arr2D[0][0];
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                if (arr2D[i][j] < min) {
                    min = arr2D[i][j];
                    System.out.print(arr2D[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("Smallest element: " + min);
        // * 5. create a 2D array of 3x3 and print it on screen and also print the average of all elements
        sum = 0;
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                sum += arr2D[i][j];
            }
        }
        avg = (double) sum / (arr2D.length * arr2D[0].length);
        System.out.println("Average of all elements: " + avg);
        
        
       
        
        
      



    }
}
