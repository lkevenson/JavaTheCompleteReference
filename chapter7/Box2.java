/* Here, Box defines three constructors to initialize
    the dimensions of a box various ways.
 */
public class Box2 {
    double width;
    double height;
    double depth;

    // constructor used when all dimensions specified
    Box2(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // constructor used when cube is created
    Box2() {
        width = -1;
        height = -1;
        depth = -1;
    }

    // constructor used when cube is created
    Box2(double len) {
        width = height = depth = len;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }


}
