
/*
 Demonstrate the if

 Call the file "IfExample.java"
 */
class IfExample {
    public static void main(String[] args) {
        int x, y;
        x = 10;
        y = 20;

        if (x < y) System.out.println(" x is less than y");

        x = x * 2;
        if (x == y) System.out.println("x now equal to y");

        x = x * 2;
        if (x > y) System.out.println("x now is greater than y");

        // This won't display anything
        if (x == y) System.out.println("Ypu won't see this");
    }
}
