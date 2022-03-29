import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public void initialize(user user) {
        JPanel infoPanel = new JPanel();
        infoPanel.setLayout(new GridLayout(0, 2, 5, 5));
        infoPanel.setBorder(BorderFactory.createEmptyBorder(30, 50, 30, 50));
        infoPanel.add(new JLabel("Id"));
        infoPanel.add(new JLabel(user.id));
        infoPanel.add(new JLabel("Username"));
        infoPanel.add(new JLabel(user.username));
        infoPanel.add(new JLabel("Password"));
        infoPanel.add(new JLabel(user.password));
        infoPanel.add(new JLabel("Email"));
        infoPanel.add(new JLabel(user.email));
        infoPanel.add(new JLabel("Phone"));
        infoPanel.add(new JLabel(user.phone));
        infoPanel.add(new JLabel("Country"));
        infoPanel.add(new JLabel(user.country));
        infoPanel.add(new JLabel("Postcode"));
        infoPanel.add(new JLabel(user.postcode));
        infoPanel.add(new JLabel("Name"));
        infoPanel.add(new JLabel(user.name));
        infoPanel.add(new JLabel("Address"));
        infoPanel.add(new JLabel(user.address));

        Component[] labels = infoPanel.getComponents();
        for (int i = 0; i < labels.length; i++) {
            labels[i].setFont(new Font("Segoe print", Font.BOLD, 18));
        }

        add(infoPanel, BorderLayout.NORTH);

        setTitle("Dashboard");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(1100, 650);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
