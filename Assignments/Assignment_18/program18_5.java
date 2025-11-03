
class Logic {

    public void checkSign(int iNo) {
        if (iNo == 0) {
            System.out.println(iNo + " is a zero");
        } else if (iNo < 0) {
            System.out.println(iNo + " is a negative number");
        } else {
            System.out.println(iNo + " is a positive number");
        }
    }
}

// Time Complixity = O(N)

class program18_5 {

    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.checkSign(-8);
    }
}
