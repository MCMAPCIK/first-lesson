public class QuadrilateralArea {
    public static void main(String[] args) {
        double x1 = 0;
        double y1 = 1;

        double x2 = 2;
        double y2 = 3;

        double x3 = 4;
        double y3 = 5;

        double x4 = 6;
        double y4 = 7;

        System.out.println("Площадь четырёхугольника равна " + areaOfQuadrilateral(x1, y1, x2, y2, x3, y3, x4, y4));
    }

    private static double triangleArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        return Math.abs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1)) / 2;
    }

    private static double areaOfQuadrilateral(double x1, double y1, double x2, double y2,
                                              double x3, double y3, double x4, double y4) {
        return triangleArea(x1, y1, x2, y2, x3, y3) + triangleArea(x2, y2, x3, y3, x4, y4);
    }
}
