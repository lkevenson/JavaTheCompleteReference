// Objects may be passed to methods
public class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    // return true if o is equal to the invoking object
    boolean equalTo(Test o) {
        return (o.a == a && o.b == b) ? true : false;
    }
}
