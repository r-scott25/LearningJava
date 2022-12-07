public class Triangle {

//    Below: Class/Static variables - will remain the same for all instances of the class - accessed with the class name ( i.e. Triangle.numOfSides )//
    static int numOFSides = 3;

//    Not shown here: Class/Static Method - accessed using the class name ( i.e. Math.pow() )

//    Below: Instance Variables - can change with each instance of the class - accessed with the instance itself (i.e. triangleA.base) //
    double base;
    double height;
    double sideLenOne;
    double sideLenTwo;
    double sideLenThree;

//    Below: Constructor Method
    public Triangle(double base, double height, double sideLenOne, double sideLenTwo, double sideLenThree) {
        this.base = base;
        this.height = height;
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
        this.sideLenThree = sideLenThree;
    }
//    Instance Function / Nonstatic Method - accessed using the instance of the class ( i.e. triangleA.findArea() )
    public double findArea() {
       return (this.base * this.height) / 2;
    }
}

////// See Main class file for instance of the Triangle class //////
