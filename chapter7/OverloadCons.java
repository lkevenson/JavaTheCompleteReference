public class OverloadCons {
    public static void main(String[] args) {
        Box2 myBox1 = new Box2(10,20,15);
        Box2 myBox2 = new Box2();
        Box2 myCube = new Box2(7);

         double vol;

         // get volume of first box
        vol = myBox1.volume();
        System.out.println("Volume of myBox1 is " + vol);

        // get volume of second box
        vol = myBox2.volume();
        System.out.println("Volume of myBox2 is " + vol);

        // get volume of cube
        vol = myCube.volume();
        System.out.println("Volume of myCube is " + vol);

    }
}
