public class PassObjRef {
    public static void main(String[] args) {
        Test ob = new Test(15, 20);

        System.out.println("a and b before call: " + ob.a + " " + ob.b);


        ob.meth(ob);

        System.out.println("a and b before call: " + ob.a + " " + ob.b);
    }
}
