public class Main {
    public static void main(String[] args) {
        String[][] myStrings = new String[5][];
        myStrings[0] = new String[4];
        myStrings[1] = new String[3];
        int[][][] myInts = new int[2][3][4];

        myInts[0][2][3] = 16;

        for (int i = 0; i < myInts.length; i++) {
            for (int j = 0; j < myInts[i].length; j++) {
                for (int k = 0; k < myInts[i][j].length; k++) {

                }
            }
        }

    }
}