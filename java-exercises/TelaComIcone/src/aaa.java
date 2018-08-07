
import java.awt.*;
import java.net.*;
import javax.swing.*;
public class aaa extends JPanel {
    private Image image;
    public aaa() {
        this.initialize();
    }
    protected void initialize() {
        this.image = this.getImage("background.gif");
        this.setLayout(new BorderLayout());
    }
    public Image getImage(String path) {
        URL imageURL = getClass().getResource(path);
        if (imageURL == null)
            return null;
        return new ImageIcon(imageURL).getImage();
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Dimension dDesktop = this.getSize();
        double width = dDesktop.getWidth();
        double height = dDesktop.getHeight();
        Image background = new ImageIcon(this.image.getScaledInstance(
                (int) width, (int) height, 1)).getImage();
        g.drawImage(background, 0, 0, this);
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new aaa());
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}