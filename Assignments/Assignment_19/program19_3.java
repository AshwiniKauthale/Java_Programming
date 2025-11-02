
class Logic {

    void checkDivisible(int iNo) {

        if (((iNo % 5) == 0) && ((iNo % 11) == 0)) {
            System.out.println(iNo + " is divisible by both 5 & 11");
        } else {
            System.out.println(iNo + " is not divisible by both 5 & 11");
        }
    }
}

// Time Complixity = O(1)

class program19_3 {

    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.checkDivisible(55);
    }
}
