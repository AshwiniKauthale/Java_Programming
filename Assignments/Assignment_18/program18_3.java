
class Logic {

    void printOddNumbers(int iNo) {
        int iCnt = 0;

        for (iCnt = 1; iCnt <= iNo; iCnt++) {
            if ((iCnt % 2) != 0) {
                System.out.println(iCnt);
            }
        }
    }
}

// Time Complixity = O(1)

class program18_3 {

    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.printOddNumbers(20);
    }
}
