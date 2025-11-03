
class Logic {

    public void checkLeapYear(int iYear) {
        if ((iYear % 4) == 0) {
            System.out.println(iYear + " is a leap year.");
        } else {
            System.out.println(iYear + " is not a leap year.");
        }
    }
}

// Time Complixity = O(1)

class program19_1 {

    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.checkLeapYear(2024);
    }
}
