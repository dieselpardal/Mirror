
import javax.swing.*;
class Start  extends JFrame {
    Start() {
        add(new Panel());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 800;
        int height = 600;
        setSize(width, height);
        setTitle("TESTE ESPELHO - DIESEL");
        setResizable(true);
        setLocationRelativeTo(null);
        setVisible(true);
    }

}
