import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class Client extends JFrame {
    public double leftStocksDbl;
    Client(){

        Font font = new Font("Roboto",Font.BOLD,30);
        Font newfont = new Font("Roboto",Font.BOLD,26);
        Font regularFont = new Font("Roboto",Font.BOLD,20);

        Stock tStocks = new Stock();
        


        //NavbAR=========
        JLabel navBar = new JLabel();
        navBar.setLayout(null);
        navBar.setText("Client Frame Panel");
        navBar.setFont(font);
        navBar.setBounds(250, 2, 450, 50);
        navBar.setForeground(Color.WHITE);

        JPanel navbar = new JPanel();
        navbar.setLayout(null);
        navbar.setBackground(Color.RED);
        navbar.setBounds(0, 2, 840, 60);
        navbar.add(navBar);
        //NavbAR=========

        //Main Panel------------
        JLabel mainPanelText = new JLabel();
        mainPanelText.setLayout(null);
        mainPanelText.setText("Place your Order here..");
        mainPanelText.setFont(font);
        mainPanelText.setBounds(150, 20, 450, 50);
        mainPanelText.setForeground(Color.WHITE);

        JLabel errorText = new JLabel();
        errorText.setLayout(null);
        errorText.setText("OOPS 404 Error !");
        errorText.setFont(font);
        errorText.setBounds(150, 280, 450, 50);
        errorText.setForeground(Color.RED);
        errorText.setVisible(false);

        JLabel productQtyText = new JLabel();
        productQtyText.setLayout(null);
        productQtyText.setText("Enter the Product Quantity");
        productQtyText.setFont(regularFont);
        productQtyText.setBounds(30, 100, 450, 50);
        productQtyText.setForeground(Color.WHITE);

        JTextArea productQtyTextArea = new JTextArea();
        productQtyTextArea.setLayout(null);
        productQtyTextArea.setBorder(new EmptyBorder(10, 10, 10, 10));
        productQtyTextArea.setFont(newfont);
        productQtyTextArea.setBounds(300, 110, 200, 40);

        JButton placeorder = new JButton();
        placeorder.setLayout(null);
        placeorder.setText("Place Order");
        placeorder.setFont(newfont);
        placeorder.setBackground(Color.BLACK);
        placeorder.setForeground(Color.WHITE);
        placeorder.setBounds(150, 200, 200, 50);

        placeorder.addActionListener((e)->{
            String productQtyStr = productQtyTextArea.getText();
            double productQtyDBl = Double.parseDouble(productQtyStr);
            if(productQtyDBl>10){
                errorText.setVisible(true);
            }else{
                System.out.println("Product Qty is: "+productQtyDBl);
                leftStocksDbl = tStocks.totalStock-productQtyDBl;
                new Admin(leftStocksDbl);
                this.setVisible(false);
            };
            
        });

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBackground(Color.BLUE);
        mainPanel.setBounds(40, 80, 600, 400);
        mainPanel.add(mainPanelText);
        mainPanel.add(productQtyText);
        mainPanel.add(productQtyTextArea);
        mainPanel.add(placeorder);
        mainPanel.add(errorText);
        
        //Main Panel-------------

        this.setSize(850,650);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Client Frame");
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(navbar);
        this.add(mainPanel);
        this.setVisible(true);
    }
}
