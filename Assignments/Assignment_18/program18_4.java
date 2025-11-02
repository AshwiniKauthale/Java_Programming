
class Logic {

    void sumEvenOddDigits(int iNo) {

        int iDigit = 0;
        int iSumOdd = 0;
        int iSumEven = 0;

        while (iNo != 0) {
            iDigit = iNo % 10;
            if ((iDigit % 2) == 0) {
                iSumEven = iSumEven + iDigit;
            } else {
                iSumOdd = iSumOdd + iDigit;
            }

            iNo = iNo / 10;
        }
        System.out.println("Sum of Even numbers is : " + iSumEven);
        System.out.println("Sum of Odd numbers is : " + iSumOdd);
    }
}

// Time Complixity = O(N)

class program18_4 {

    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.sumEvenOddDigits(123456);
    }
}
