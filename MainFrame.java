import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
    MainFrame(){

        Font font = new Font("Roboto",Font.BOLD,30);
        Font newfont = new Font("Roboto",Font.BOLD,26);
        //Font regularFont = new Font("Roboto",Font.BOLD,30);

        //Navbar=============
        JLabel navBar = new JLabel();
        navBar.setLayout(null);
        navBar.setText("Main Frame Panel");
        navBar.setFont(font);
        navBar.setBounds(250, 2, 450, 50);
        navBar.setForeground(Color.WHITE);

        JPanel navbar = new JPanel();
        navbar.setLayout(null);
        navbar.setBackground(Color.RED);
        navbar.setBounds(0, 2, 840, 60);
        navbar.add(navBar);
        //Navbar=============

        // Client Panel===========
        JLabel clientLabel = new JLabel();
        clientLabel.setLayout(null);
        clientLabel.setText("Visit Client Panel");
        clientLabel.setFont(newfont);
        clientLabel.setBounds(30, 10, 280, 50);
        clientLabel.setForeground(Color.WHITE);

        JButton clientButton = new JButton();
        clientButton.setLayout(null);
        clientButton.setText("Client Side..");
        clientButton.setFont(newfont);
        clientButton.setBackground(Color.BLACK);
        clientButton.setForeground(Color.WHITE);
        clientButton.setBounds(50, 150, 200, 50);
        
        JPanel clientPanel = new JPanel();
        clientPanel.setLayout(null);
        clientPanel.setBackground(Color.RED);
        clientPanel.setBounds(20, 100, 300, 300);
        clientPanel.add(clientLabel);
        clientPanel.add(clientButton);

        clientButton.addActionListener((e)->{
            System.out.println("Client Button Clicked..");
            new Client();
            this.setVisible(false);
        });
        // Client Panel===========

        // Admin Panel================
        JLabel adminLabel = new JLabel();
        adminLabel.setLayout(null);
        adminLabel.setText("Visit Admin Panel");
        adminLabel.setFont(newfont);
        adminLabel.setBounds(30, 10, 280, 50);
        adminLabel.setForeground(Color.WHITE);

        JButton admintButton = new JButton();
        admintButton.setLayout(null);
        admintButton.setText("Admin Side..");
        admintButton.setFont(newfont);
        admintButton.setBackground(Color.BLACK);
        admintButton.setForeground(Color.WHITE);
        admintButton.setBounds(50, 150, 200, 50);
        admintButton.addActionListener((e)->{
           // new Admin();
            this.setVisible(false);
        });
        
        JPanel adminPanel = new JPanel();
        adminPanel.setLayout(null);
        adminPanel.setBackground(Color.BLUE);
        adminPanel.setBounds(480, 100, 300, 300);
        adminPanel.add(adminLabel);
        adminPanel.add(admintButton);

        // Admin Panel================
      
        this.setSize(850,650);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Main Frame..");
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(navbar);
        this.add(clientPanel);
        this.add(adminPanel);
        this.setVisible(true);
    }
    
}
