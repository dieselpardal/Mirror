public class Calculus {


    public double convertRadianoToGrau(double rad) {
        return 360*rad/(Math.PI*2);
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + (Math.pow(y2 - y1, 2)));
    }

    public double radiano(double x1, double y1, double x2, double y2) {
        double zX = x2-x1;
        double zY = -y2+y1;
        if((zX==0) && (y2>y1)) return Math.PI*3/2;
        double rad = Math.atan(zY/zX);
        if( x2<x1) { rad= Math.PI + rad;} else
        if((y2>y1) && (x2>x1)) {rad= Math.PI*2+rad;}
        return rad;
    }

    public boolean isColision(double pX, double pY, double cx, double cy) {
        double ray_circle= Calculus.distance(cx,cy,cx+100,cy);
        double two=Calculus.distance(pX,pY,cx,cy);
        return two<ray_circle ;
    }
}
