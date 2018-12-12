import java.awt.*;

public class Mirror {
    private Tool tool;
    private double pX =0, pY=0;
    Calculus calculus = new Calculus();

    public Mirror(Tool tool) {
        this.tool = tool;
    }

    public void focus(double x1, double y1, double x2, double y2) {

        this.tool.line(x1,y1,x2,y2, Color.blue);
        if (!this.calculus.isColision(x2,y2,this.tool.getHalfWidth() ,this.tool.getHalfHeight()) )
            light(x1,y1,x2,y2);
    }

    private void light(double x1, double y1, double x2, double y2) {
        double p= this.calculus.radiano(x1, y1,  x2, y2);
        double mX = Math.cos(p);
        double mY = -Math.sin(p);
        this.pX=x2;
        this.pY=y2;
        //double GRAU = this.calculus.convertRadianoToGrau(p);

        //System.out.println("G="+GRAU+"  Radiano=" + p +  "    ");
        while (!((this.pX<=0) || (this.pY<=0) || (this.pX>=800) || (this.pY>=600))) {
            this.tool.circle(this.pX, this.pY, Color.red, 1);
            if( this.calculus.isColision(this.pX,this.pY,this.tool.getHalfWidth() ,this.tool.getHalfHeight())) {
                this.tool.line(this.tool.getHalfWidth() ,this.tool.getHalfHeight(),this.pX, this.pY,Color.CYAN);
                double PC = this.calculus.radiano(this.tool.getHalfWidth() ,this.tool.getHalfHeight(),this.pX, this.pY);
                double DF =  PC*2-p;
                mX = -Math.cos( DF);
                mY = Math.sin( DF);
                //System.out.println("DF="+convertRadianoToGrau(DF) +  "    ");
            }

            this.pX += mX;
            this.pY += mY;
            //System.out.println("pX=" + pX + "   mX=" + mX + "  pY=" + pY + "   mY=" + mY + " ");

        }
    }


}
