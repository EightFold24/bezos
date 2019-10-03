package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;

public class Main extends JFrame implements ActionListener {

    private JMenuBar jmb;
    private JMenu  products , orders, system;
    private JMenuItem  makeOrder, addProducts, viewProducts, removeProducts, exitSystem;
    private static HashMap<String, Double> productsMap = new HashMap<String, Double> ();
    private static HashMap<String, Double> orderMap = new HashMap<String, Double> ();
    JButton btnCustomer, btnAdmin;


    public Main() //constructor
    {
        getContentPane().setLayout(new GridBagLayout());

        productsMap.put("T-Shirt" , 50.00);
        productsMap.put("Shirt" , 105.00);
        productsMap.put("Polo Shirt" , 75.00);
        productsMap.put("Jeans" , 150.00);

        btnCustomer = new JButton("Customer");
        btnCustomer.addActionListener(this);
        addComp(btnCustomer,2,1,1,1,0,0);

        btnAdmin = new JButton("Admin");
        btnAdmin.addActionListener(this);
        addComp(btnAdmin,2,2,1,1,0,0);

        products = new JMenu("Products");
        addProducts = new JMenuItem("Add Products");
        addProducts.addActionListener(this);
        addProducts.setVisible(false);
        products.add(addProducts);

        removeProducts = new JMenuItem("Remove Products");
        removeProducts.addActionListener(this);
        removeProducts.setVisible(false);
        products.add(removeProducts);

        viewProducts = new JMenuItem("View Products");
        viewProducts.addActionListener(this);
        viewProducts.setVisible(false);
        products.add(viewProducts);

        orders = new JMenu("Orders");
        makeOrder = new JMenuItem("Make Orders");
        makeOrder.addActionListener(this);
        makeOrder.setVisible(false);
        orders.add(makeOrder);

        system = new JMenu("System");
        exitSystem = new JMenuItem("Exit System");
        exitSystem.addActionListener(this);
        system.add(exitSystem);

        jmb = new JMenuBar();
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
        if (e.getSource() == btnAdmin)
        {
            makeOrder.setVisible(true);
            viewProducts.setVisible(true);
            addProducts.setVisible(true);
            removeProducts.setVisible(true);
        }
        if (e.getSource() == btnCustomer)
        {
            makeOrder.setVisible(true);
        }
        if(e.getSource() == addProducts) {
            AddProducts frm = new AddProducts(productsMap);
            frm.setVisible(true);
            frm.setSize(1000, 700);
        }
        if(e.getSource() == viewProducts) {
            ViewProducts frm = new ViewProducts(productsMap);
            frm.setVisible(true);
            frm.setSize(1000, 700);
        }
        if(e.getSource() == removeProducts) {
            RemoveProducts frm = new RemoveProducts();
            frm.setVisible(true);
            frm.setSize(1000, 700);
        }
        if(e.getSource() == makeOrder)
        {
            Order frm = new Order();
            frm.setVisible(true);
            frm.setSize(1000, 700);
        }
        if(e.getSource() == exitSystem)
        {
            System.exit(0);
        }
    }
}
