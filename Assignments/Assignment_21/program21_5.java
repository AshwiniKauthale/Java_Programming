
class Logic {

    public void printDivisibleBy2and3(int iNo) {
        int iCnt = 0;

        for (iCnt = 1; iCnt <= iNo; iCnt++) {
            if (((iCnt % 2) == 0) && ((iCnt % 3) == 0)) {
                System.out.println(iCnt);

            }
        }
    }
}

// Time Complixity = O(N)

class program21_5 {

    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.printDivisibleBy2and3(30);
    }
}
