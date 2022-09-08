import java.awt.Color;
import java.awt.Font;
//import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class Admin extends JFrame {
   
    Admin(double val){
        Font font = new Font("Roboto",Font.BOLD,30);
        Font newfont = new Font("Roboto",Font.BOLD,26);
        //Font regularFont = new Font("Roboto",Font.BOLD,20);

        Stock totalProStock = new Stock();
        double totalStockQtyDbl = totalProStock.totalStock;
        String totalStockQtyStr = Double.toString(totalStockQtyDbl);

         //NavbAR=========
         JLabel navBar = new JLabel();
         navBar.setLayout(null);
         navBar.setText("Admin Frame Panel");
         navBar.setFont(font);
         navBar.setBounds(250, 2, 450, 50);
         navBar.setForeground(Color.WHITE);
         
         JPanel navbar = new JPanel();
         navbar.setLayout(null);
         navbar.setBackground(Color.GREEN);
         navbar.setBounds(0, 2, 840, 60);
         navbar.add(navBar);
         //NavbAR=========

         //MainPanel---------------
         JLabel productStocksText = new JLabel();
         productStocksText.setLayout(null);
         productStocksText.setText("Total Stocks");
         productStocksText.setFont(newfont);
         productStocksText.setBounds(30, 100, 450, 50);
         productStocksText.setForeground(Color.WHITE);

         JTextArea productStocksTextArea = new JTextArea();
         productStocksTextArea.setLayout(null);
         productStocksTextArea.setBorder(new EmptyBorder(10, 10, 10, 10));
         productStocksTextArea.setFont(newfont);
         productStocksTextArea.setBounds(250, 110, 200, 40);
         productStocksTextArea.setText(totalStockQtyStr);

         JLabel productLeftStocksText = new JLabel();
         productLeftStocksText.setLayout(null);
         productLeftStocksText.setText("Left Stocks");
         productLeftStocksText.setFont(newfont);
         productLeftStocksText.setBounds(30, 200, 450, 50);
         productLeftStocksText.setForeground(Color.WHITE);

         JTextArea productLeftStocksTextArea = new JTextArea();
         productLeftStocksTextArea.setLayout(null);
         productLeftStocksTextArea.setBorder(new EmptyBorder(10, 10, 10, 10));
         productLeftStocksTextArea.setFont(newfont);
         productLeftStocksTextArea.setBounds(250, 210, 200, 40);
         productLeftStocksTextArea.setText(String.valueOf(val));

         JPanel mainPanel = new JPanel();
         mainPanel.setLayout(null);
         mainPanel.setBackground(Color.BLUE);
         mainPanel.setBounds(100, 100, 600, 400);
         mainPanel.add(productStocksText);
         mainPanel.add(productLeftStocksText);
         mainPanel.add(productStocksTextArea);
         mainPanel.add(productLeftStocksTextArea);
         //MainPanel---------------

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
