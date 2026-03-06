import java.util.*;

class program79_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int N = 0;
        int M = 0;

        int TotalMarks = 0;
        int MaxMarks = 0;
        int MaxIndax = 0;

        System.out.println("Number of Students");
        N = sobj.nextInt();

        System.out.println("Number of Subjects");
        M = sobj.nextInt();

        if(N <= 0 || M <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int Arr[][] = new int[N][M];
        int i = 0;
        int j = 0;

        System.out.println("Enter Marks");

        for(i = 0; i < N; i++)
        {
            System.out.println("Marks of Student : "+ (i+1));

            for(j = 0; j < M; j++)
            {
                Arr[i][j] = sobj.nextInt();

                if(Arr[i][j] < 0 || Arr[i][j] > 100)
                {
                    System.out.println("Invalid Input");
                    return;
                }
            }
        }

        // Calculate total marks

        System.out.println("Student Totals:");
        for(i = 0; i < N; i++)
        {
            TotalMarks = 0;
            for(j = 0; j < M; j++)
            {
                TotalMarks = TotalMarks + Arr[i][j];
            }
            System.out.println("Student : "+(i + 1)+" : "+TotalMarks);

            if(TotalMarks > MaxMarks)
            {
                MaxIndax = i;
            }
        }

        System.out.println("Topper : Student "+MaxIndax);

        // Average Marks of each student

        int TotalMarksOfSubject = 0;
        float AverageMarks = 0.0f;

        System.out.println("Subject Averages :");

        for(j = 0; j < M; j++)
        {
            TotalMarksOfSubject = 0;
            for(i = 0; i < N; i++)
            {
                TotalMarksOfSubject = TotalMarksOfSubject + Arr[i][j];
            }

            AverageMarks = (float)TotalMarksOfSubject / N;

            System.out.println("Subject "+(j + 1)+" : "+AverageMarks);
        }

        // Find Out Failed Student
        boolean bFlag = false;

        System.out.println("Students Failed :");

        for(i = 0; i < N; i++)
        {
            for(j = 0; j < M; j++)
            {
                if(Arr[i][j] < 35)
                {
                    System.out.println("Student "+(i + 1));
                }
            }
        }

        sobj.close();
    }
}

/*
    Design a Java application that analyzes student performance using a 2D matrix.

    A college stores marks of students in multiple subjects using a matrix:

    Rows represent students.
    Columns represent subjects.

    Your program must analyze academic performance based on this matrix.

    Requirements:

    Your program should:
    Calculate total marks of each student.
    Identify the topper (student with highest total).
    Calculate average marks for each subject.
    Print students who failed in any subject (marks < 35).

    Input Format:
    First line: Integer N (number of students)
    Second line: Integer M (number of subjects)
    Next N lines: M integers each (marks of each student)

    Validations:
    N > 0
    M > 0
    Each mark must be between 0 and 100
    If invalid input is found, print:
    
    Invalid Input

    Output Format:

    Student Totals:
    Student 1:
    Student 2:
    ...

    Topper: Student <index>
    Subject Averages:
    Subject 1:<avg>
    Subject 2:<avg>
    ...

    Students Failed:
    <Student number>

    Sample Input:
    3
    3
    80 70 60
    90 85 88
    30 40 50

    Sample Output:

    Student Totals:
    Student 1: 210
    Student 2: 263
    Student 3: 120

    Topper: Student 2

    Subject Averages:
    Subject 1: 66.67
    Subject 2: 65.00
    Subject 3: 66.00

    Students Failed:
    Student 3
*/