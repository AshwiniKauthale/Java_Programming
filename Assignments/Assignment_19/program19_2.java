
class Logic {

    void displayGrade(int iMarks) {
        if (iMarks >= 90) {
            System.out.println("Grade A");
        } else if (iMarks >= 80) {
            System.out.println("Grade B");
        } else if (iMarks >= 70) {
            System.out.println("Grade C");
        } else if (iMarks >= 60) {
            System.out.println("Grade D");
        } else if (iMarks >= 50) {
            System.out.println("Grade E");
        } else {
            System.out.println("Grade F");
        }
    }
}

// Time Complixity = O(1)

class program19_2 {

    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.displayGrade(82);
    }
}
