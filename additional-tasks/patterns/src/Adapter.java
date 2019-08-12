public class Adapter {
    public static void main(String[] args) {
        VectorPainter redPainter = new RasterToVectorPainterAdapter(new RedRasterPainter());
        redPainter.drawCircle();
        redPainter.drawSquare();
        VectorPainter greenPainter = new RasterToVectorPainterAdapter(new GreenRasterPainter());
        greenPainter.drawCircle();
        greenPainter.drawSquare();
    }
}

class RasterToVectorPainterAdapter implements VectorPainter {
    private final RasterPainter painter;
    public RasterToVectorPainterAdapter(RasterPainter painter) {
        this.painter = painter;
    }
    public void drawCircle() {
        painter.drawRasterCircle();
    }
    public void drawSquare() {
        painter.drawRasterSquare();
    }
}

interface VectorPainter {
    void drawCircle();
    void drawSquare();
}
interface RasterPainter {
    void drawRasterCircle();
    void drawRasterSquare();
}
class RedRasterPainter implements RasterPainter {
    public void drawRasterCircle() {
        System.out.println("Red raster circle");
    }
    public void drawRasterSquare() {
        System.out.println("Red raster square");
    }
}
class GreenRasterPainter implements RasterPainter {
    public void drawRasterCircle() {
        System.out.println("Green raster circle");
    }
    public void drawRasterSquare() {
        System.out.println("Green raster square");
    }
}
