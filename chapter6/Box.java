class Box {
    double width;
    double height;
    double depth;


    // display volume of box
    void volume() {
        System.out.print("Volume is ");
        System.out.println(width * height * depth);
    }

    // compute and return volume
    double volume2() {
        return width * height * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}