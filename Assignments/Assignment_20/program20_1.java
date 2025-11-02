
class Logic {

    void sumEvenNumbers(int iNo) {

        int iCnt = 0;
        int iSum = 0;

        for (iCnt = 1; iCnt <= iNo; iCnt++) {
            if ((iCnt % 2) == 0) {
                iSum += iCnt;
            }
        }
        System.out.println(iSum + " is the sum of all even numbers up to " + iNo);
    }
}

// Time Complixity = O(N)

class program20_1 {

    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.sumEvenNumbers(10);
    }
}
