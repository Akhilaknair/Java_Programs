public class ArrayCommon {

    public static void FindCommon(int[] A1, int[] A2, int[] A3) {

        boolean found = false;

        for (int num1 : A1) {
            for (int num2 : A2) {
                if (num1 == num2) {
                    for (int num3 : A3) {
                        if (num1 == num3) {
                            found = true;
                            System.out.print(num3 + " ");
                        }
                    }
                }
            }
        }
        if(found==false)System.out.println("nothing common !");

    }

    public static void main(String[] args) {

        int[] A1 = { 1, 2, 3, 4, 5, 6, 7 };
        int[] A2 = { 5, 6, 7, 8, 9, 10, 11 };
        int[] A3 = { 0, 5, 12, 13, 14, 15, 7 };

        FindCommon(A1, A2, A3);
    }

}
