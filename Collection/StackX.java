import java.util.*;
class StackX
{
    public static void main(String A[])
    {
        Stack<String> animal = new Stack<>();

        animal.push("lion");
        animal.push("cat");
        animal.push("dog");
        animal.push("tiger");

        System.out.println("Stack : "+ animal);

        System.out.println(animal.peek());

        animal.pop();

        System.out.println("Stack : "+ animal);

        System.out.println(animal.peek());

    }
}