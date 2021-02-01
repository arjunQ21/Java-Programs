import java.awt.* ;
import java.applet.* ;

/*
<applet code="BarChart" height=400 width=400></applet>
*/

public class BarChart extends Applet{
    static final int unitLength = 2 ;
    static final int squareSide = 10 * unitLength ;
    static final int canvasHeight = 400 ;
    static final int canvasWidth = 400 ;
    static final int axesOffset = squareSide * 2 ;

    public void init(){

    }

    public void paint(Graphics g){
        g.drawString("Graph", 20, 20) ;
        drawGridLines(g) ;
        drawAxes(g) ;
        drawCharts(g) ;
    }

    public void drawCharts(Graphics g){
        int[] chartHeight = new int[2] ;
        // Suppose men = 55 and women = 84
        chartHeight[0] = 55 ;
        chartHeight[1] = 84 ;
        for(int i = 0 ; i < chartHeight.length ; i++){
            g.fillRect( 
                axesOffset + (2*i+1)* squareSide ,
                canvasHeight - axesOffset - chartHeight[i]*unitLength,
                squareSide, 
                chartHeight[i]*unitLength
            ) ;
            
        }
    }

    public void drawAxes(Graphics g){
        g.setColor(Color.black) ;
        g.drawLine(axesOffset, 0, axesOffset, canvasHeight) ;
        g.drawLine(0,  canvasHeight - axesOffset, canvasWidth,canvasHeight - axesOffset) ;

        //making axes lines thicker by drawing a line below and left of two axes
        g.drawLine(axesOffset-1, 0, axesOffset-1, canvasHeight) ;
        g.drawLine(0,  canvasHeight - axesOffset -1, canvasWidth,canvasHeight - axesOffset -1) ;
    }

    public void drawGridLines(Graphics g){
        g.setColor(Color.gray) ;
        int xCovered, yCovered ;
        xCovered = yCovered = 0 ;
        while(true){
            xCovered += squareSide ;
            yCovered += squareSide ;
            if(xCovered > canvasWidth) break ;
            if(yCovered > canvasHeight) break ;
            System.out.println("x: "+ xCovered + ", y: "+ yCovered) ;
            g.drawLine(xCovered, 0, xCovered, canvasHeight) ;
            g.drawLine(0, yCovered, canvasWidth, yCovered) ;
        }
    }


}