package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Main extends JFrame implements ActionListener {

    private JMenuBar jmb;
    private JMenu customers, products , orders, system;
    private JMenuItem addCustomer, removeCustomer, makeOrders, addProducts, removeProducts, exitSystem;

    public Main() //constructor
    {
        getContentPane().setLayout(new GridBagLayout());


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
        addProducts.addActionListener(this);
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
        exitSystem.addActionListener(this);
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

        Main frm = new Main();
        frm.setSize(1000, 700);
        frm.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == addProducts) {
            AddProducts frm = new AddProducts();
            frm.setVisible(true);
            frm.setSize(1000, 700);
        }
        if(e.getSource() == exitSystem)
        {
            System.exit(0);
        }
    }
}
