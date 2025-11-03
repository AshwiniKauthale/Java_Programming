
class Logic {

    public void productOfDigits(int iNo) {
        int iDigit = 0;
        int iProduct = 0;

        iProduct = 1;

        while (iNo != 0) {
            iDigit = iNo % 10;
            iProduct *= iDigit;
            iNo = iNo / 10;
        }
        System.out.println("Product of digit is : " + iProduct);
    }
}

// Time Complixity = O(N)

class program21_1 {

    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.productOfDigits(234);
    }
}
