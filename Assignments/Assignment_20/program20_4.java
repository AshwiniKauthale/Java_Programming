
class Logic {

    public void findLargestDigit(int iNo) {
        int iDigit = 0;
        int iLargest = 0;

        while (iNo != 0) {
            iDigit = iNo % 10;
            if (iDigit > iLargest) {
                iLargest = iDigit;
            }
            iNo = iNo / 10;
        }
        System.out.println("Largest digit is : " + iLargest);
    }
}

// Time Complixity = O(N)

class program20_4 {

    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.findLargestDigit(83429);
    }
}
