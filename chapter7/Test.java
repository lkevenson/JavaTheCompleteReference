// Objects may be passed to methods
public class Test {
    int a, b;

    Test() {
    }

    Test(int i) {
        a = i;
    }

    Test(int i, int j) {
        a = i;
        b = j;
    }

    // return true if o is equal to the invoking object
    boolean equalTo(Test o) {
        return (o.a == a && o.b == b) ? true : false;
    }

    // Primitive types are passed by value.
    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }

    // Pass on object
    void meth(Test o) {
        o.a *= 2;
        o.b /= 2;
    }

    // Returning an object
    Test incByTen() {
        Test temp = new Test(a + 10);
        return temp;
    }
}
