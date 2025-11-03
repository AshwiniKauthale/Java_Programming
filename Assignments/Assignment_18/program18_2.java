
class Logic {

    public void printEvenNumbers(int iNo) {
        int iCnt = 0;

        for (iCnt = 1; iCnt <= iNo; iCnt++) {
            if ((iCnt % 2) == 0) {
                System.out.println(iCnt);
            }
        }
    }
}

// Time Complixity = O(N)

class program18_2 {

    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.printEvenNumbers(20);
    }
}
