public class TestStack {
    public static void main(String[] args) {
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();

        // push some numbers onto the stack
        for (int i = 0; i < 10; i++) stack1.push(i);
        for (int i = 0; i < 10; i++) stack2.push(i);

        // pop those numbers of the stack
        System.out.println("Stack in stack1: ");
        for (int i = 0; i < 10; i++)
            System.out.println(stack1.pop());


        System.out.println("Stack in stack2: ");
        for (int i = 0; i < 10; i++)
            System.out.println(stack2.pop());
    }
}
