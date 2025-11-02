
class Logic {

    void findSmallestDigit(int iNo) {
        int iDigit = 0;
        int iSmallest = 9;

        while (iNo != 0) {
            iDigit = iNo % 10;
            if (iDigit < iSmallest) {
                iSmallest = iDigit;
            }
            iNo = iNo / 10;
        }
        System.out.println("Largest digit is : " + iSmallest);
    }
}

// Time Complixity = O(N)

class program20_5 {

    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.findSmallestDigit(83429);
    }
}
