package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class Order extends JFrame implements ActionListener
{
    private static HashMap<String, Double> productsMap = new HashMap<String, Double> ();
    private static HashMap<String, Double> orderMap = new HashMap<String, Double> ();
    JTextField txtQuantiy, txtProduct;
    JLabel lblHeading, lblQuantity, lblProduct;
    JButton btnReceipt;

    public Order() //constructor
    {
        getContentPane().setLayout(new GridBagLayout());
        setUndecorated(true);

        productsMap.put("T-Shirt" , 50.00);
        productsMap.put("Shirt" , 105.00);
        productsMap.put("Polo Shirt" , 75.00);
        productsMap.put("Jeans" , 150.00);

        lblHeading = new JLabel("Order",JLabel.CENTER);
        lblHeading.setFont(new Font("Serif", Font.BOLD,30));
        addComp(lblHeading,0,0,4,1,1,1);

        lblProduct = new JLabel("Product ");
        addComp(lblProduct,0,1,1,1,1,1);
        txtProduct = new JTextField(6);
        addComp(txtProduct,1,1,2,1,1,1);

        lblQuantity = new JLabel("Quantity ");
        addComp(lblQuantity,0,2,1,1,1,1);
        txtQuantiy = new JTextField(6);
        addComp(txtQuantiy,1,2,2,1,1,1);

        btnReceipt = new JButton("Receipt");
        btnReceipt.addActionListener(this);
        addComp(btnReceipt,1,3,2,1,1,1);
    }

    private void addComp(Component c, int gridX, int gridY, int width, int height, int weightX, int weightY)
    {
        GridBagConstraints gc = new GridBagConstraints();
        gc.fill = GridBagConstraints.BOTH;
        gc.insets = new Insets(5,5,5,5);
        gc.gridx = gridX;
        gc.gridy = gridY;
        gc.gridwidth = width;
        gc.gridheight = height;
        gc.weightx = weightX;
        gc.weighty = weightY;

        getContentPane().add(c, gc);
    }

    public static void main(String[] args)
    {

        Order frm = new Order();
        frm.setSize(1000, 700);
        frm.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == btnReceipt)
        {
            System.out.println("The Product Value is: " + productsMap.get(txtProduct.getText()));
            System.out.println("The Quantity is: " + txtQuantiy.getText());
            System.out.println("The Order Value is: " + (productsMap.get(txtProduct.getText())* Integer.parseInt(txtQuantiy.getText())));
        }
    }
}
