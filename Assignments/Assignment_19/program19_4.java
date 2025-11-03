
class Logic {

    public void printDigits(int iNo) {

        String s = Integer.toString(iNo);

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }
}

// Time Complixity = O(N)

class program19_4 {

    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.printDigits(9876);
    }
}
