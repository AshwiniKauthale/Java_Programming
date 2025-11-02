
class Logic {

    void countFactors(int iNo) {
        int iCnt = 0;
        int iCount = 0;

        for (iCnt = 1; iCnt <= iNo / 2; iCnt++) {
            if ((iNo % iCnt) == 0) {
                iCount++;
            }
        }
        System.out.println("Total Factors are : " + iCount);
    }
}

// Time Complixity = O(N/2)

class program21_4 {

    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.countFactors(20);
    }
}
