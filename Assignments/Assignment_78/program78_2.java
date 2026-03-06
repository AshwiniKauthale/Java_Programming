

import java.util.*;

class program78_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Invalid_Votes = 0;
        int No_Votes = 0;
        int Valid_Vote = 0;
        int no = 0;

        System.out.println("Number of Votes N");
        No_Votes = sobj.nextInt();

        if(No_Votes < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int ID[] = new int[No_Votes];

        System.out.println("Enter Voters IDs");

        for(int i = 0; i < No_Votes; i++)
        {
            no = sobj.nextInt();
            if(i < 0)
            {
                System.out.println("Invalid Input");
                return;
            }
            ID[i] = no;

        }

        int[] Arr = Arrays.stream(ID).distinct().toArray();

        Invalid_Votes = ID.length - Arr.length;

        Valid_Vote = ID.length - Invalid_Votes;

        System.out.println("Valid Votes : "+ Valid_Vote);
        System.out.println("Rejected Duplicate Votes :" + Invalid_Votes);

        sobj.close();
    }
}

/*
    An online election system stores votes by voter ID. Every voter can vote only once. If the same ID appears again, the vote must be rejected and counted as duplicate.

    Input:

        Number of votes N
        N voter IDs

    Validations:

        N >= 0
        IDs must be non-negative integers

    Expected Output:

    Valid Votes:<count>
    Rejected Duplicate Votes: <count>
*/