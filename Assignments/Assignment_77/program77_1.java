import java.util.*;

class program77_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int days;
        int medicineBill;
        int consultationFee;
        String wardType;
        String insured;

        double roomCharge = 0;
        double totalBill = 0;
        double insuranceCover = 0;
        double finalPay = 0;

        System.out.println("Enter number of days:");
        days = sobj.nextInt();

        System.out.println("Enter ward type (Normal/ICU):");
        wardType = sobj.next();

        System.out.println("Enter medicine bill:");
        medicineBill = sobj.nextInt();

        System.out.println("Enter consultation fee:");
        consultationFee = sobj.nextInt();

        System.out.println("Is patient insured (Yes/No):");
        insured = sobj.next();

        // Room charge calculation
        if(wardType.equals("Normal"))
        {
            roomCharge = days * 2000;
        }
        else if(wardType.equals("ICU"))
        {
            roomCharge = days * 5000;
        }

        // Total bill
        totalBill = roomCharge + medicineBill + consultationFee;

        // Insurance calculation
        if(insured.equals("Yes"))
        {
            double cover = totalBill * 0.70;

            if(cover > 50000)
            {
                insuranceCover = 50000;
            }
            else
            {
                insuranceCover = cover;
            }
        }

        finalPay = totalBill - insuranceCover;

        System.out.println("Total Bill: " + totalBill);
        System.out.println("Insurance Cover: " + insuranceCover);
        System.out.println("Final Amount to Pay: " + finalPay);
    }
}