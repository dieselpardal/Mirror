import org.junit.Test;

import java.awt.*;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.*;


public class ToolTest {
    @Test
    public void testCLS() {
        Tool tool = mock(Tool.class);
        Graphics graphics= mock(Graphics.class);
        doCallRealMethod().when(tool).addGraphics(any(Graphics.class));
        doCallRealMethod().when(tool).cls();
        tool.addGraphics(graphics);
        tool.cls();
        verify(tool,times(1)).cls();
    }

    @Test
    public void testWrite() {
        Tool tool = mock(Tool.class);
        Graphics graphics= mock(Graphics.class);
        doCallRealMethod().when(tool).addGraphics(any(Graphics.class));
        doCallRealMethod().when(tool).write(any(double.class), any(double.class),any(String.class));
        tool.addGraphics(graphics);
        tool.write(10,10,"Test");
        verify(tool,times(1)).write(10,10,"Test");
    }

    @Test
    public void testLine() {
        Tool tool = mock(Tool.class);
        Graphics graphics= mock(Graphics.class);
        doCallRealMethod().when(tool).addGraphics(any(Graphics.class));
        doCallRealMethod().when(tool).line(any(double.class), any(double.class),any(double.class),any(double.class),any(Color.class));
        tool.addGraphics(graphics);
        tool.line(10,10,20,20,Color.red);
        verify(tool,times(1)).line(10,10,20,20,Color.red);
    }

    @Test
    public void testCircle() {
        Tool tool = mock(Tool.class);
        Graphics graphics= mock(Graphics.class);
        doCallRealMethod().when(tool).addGraphics(any(Graphics.class));
        doCallRealMethod().when(tool).circle(any(double.class), any(double.class),any(Color.class),any(double.class));
        tool.addGraphics(graphics);
        tool.circle(10,10,Color.red, 100);
        verify(tool,times(1)).circle(10,10,Color.red, 100);
    }

    @Test
    public void testStep() {
        Tool tool = new Tool();
        tool.addStep();
        assertEquals(tool.getStep(),1);
    }
    @Test
    public void testSize() {
        Tool tool = new Tool();
        tool.setSize(100,300);
        assertEquals(tool.getWidth(), 100);
        assertEquals(tool.getHeight(),300);
    }

    @Test
    public void testHalfSize() {
        Tool tool = new Tool();
        tool.setSize(100,300);
        assertEquals(tool.getHalfWidth(), 50.0);
        assertEquals(tool.getHalfHeight(),150.0);
    }

}
