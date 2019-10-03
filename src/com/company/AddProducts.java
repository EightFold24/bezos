package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddProducts extends JFrame implements ActionListener {

    private JMenuBar jmb;
    private JMenu customers, products , orders, system;
    private JMenuItem addCustomer, removeCustomer, makeOrders, addProducts, removeProducts, exitSystem;

    JLabel lblHeading, lblProdNo, lblProdDesc, lblProdPrice;
    JTextField txtProdNo, txtProdDesc, txtProdPrice;

    public AddProducts() //Constructor
    {
        getContentPane().setLayout(new GridBagLayout());

        setUndecorated(true);

        lblHeading = new JLabel("Add Product",JLabel.CENTER);
        lblHeading.setFont(new Font("Serif", Font.BOLD,30));
        addComp(lblHeading,0,0,4,1,1,1);

        lblProdNo = new JLabel("Product No: ");
        addComp(lblProdNo,0,1,1,1,1,1);
        txtProdNo = new JTextField(6);
        addComp(txtProdNo,1,1,2,1,1,1);

        lblProdDesc = new JLabel("Product Description: ");
        addComp(lblProdDesc,0,2,1,1,1,1);
        txtProdDesc = new JTextField(100);
        addComp(txtProdDesc,1,2,2,1,2,1);

        lblProdPrice = new JLabel("Product Price: ");
        addComp(lblProdPrice,0,3,1,1,1,1);
        txtProdPrice = new JTextField(20);
        addComp(txtProdPrice,1,3,1,1,3,1);

        // Menu
        customers = new JMenu("Customers");
        addCustomer = new JMenuItem("Add Customer");
        //addCustomer.addActionListener(this);
        customers.add(addCustomer);

        removeCustomer = new JMenuItem("Remove Customer");
        //removeCustomer.addActionListener(this);
        customers.add(removeCustomer);

        products = new JMenu("Products");
        addProducts = new JMenuItem("Add Products");
        //addCustomer.addActionListener(this);
        products.add(addProducts);

        removeProducts = new JMenuItem("Remove Products");
        //addCustomer.addActionListener(this);
        products.add(removeProducts);

        orders = new JMenu("Orders");
        makeOrders = new JMenuItem("Make Orders");
        //addCustomer.addActionListener(this);
        products.add(makeOrders);

        system = new JMenu("System");
        exitSystem = new JMenuItem("Exit System");
        //addCustomer.addActionListener(this);
        system.add(exitSystem);

        jmb = new JMenuBar();
        jmb.add(customers);
        jmb.add(products);
        jmb.add(orders);
        jmb.add(system);
        setJMenuBar(jmb);
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
        // TODO Auto-generated method stub
        AddProducts frm = new AddProducts();
        frm.setSize(1000, 700);
        frm.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
