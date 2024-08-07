public class OverloadCons2 {
    public static void main(String[] args) {
        // create boxes using the various constructors

        Box2 myBox1 = new Box2(10, 20, 15);
        Box2 myBox2 = new Box2();
        Box2 myCube = new Box2(7);

        Box2 myClone = new Box2(myBox1); // create copy of myBox1;

        double vol;

        // get volume of first box
        vol = myBox1.volume();
        System.out.println("Volume of myBox1 is " + vol);

        // get volume of second box
        vol = myBox2.volume();
        System.out.println("Volume of myBox2 is " + vol);

        // get volume of cube
        vol = myCube.volume();
        System.out.println("Volume of cube is " + vol);

        // get volume of clone
        vol = myBox1.volume();
        System.out.println("Volume of clone is " + vol);
    }
}
