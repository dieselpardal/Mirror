import org.junit.Test;

import java.awt.*;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;

public class MirrorTest {



    @Test
    public void testCFocus() {
        Tool tool = mock(Tool.class);
        Graphics graphics= mock(Graphics.class);
        Mirror mirror = spy(new Mirror(tool));
        doCallRealMethod().when(tool).addGraphics(any(Graphics.class));
        doCallRealMethod().when(mirror).focus(any(double.class), any(double.class),any(double.class),any(double.class));
        tool.addGraphics(graphics);
        mirror.focus(1,2,3,4);
        verify(mirror,times(1)).focus(1,2,3,4);
    }


}
