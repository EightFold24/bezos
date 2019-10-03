package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Main extends JFrame implements ActionListener {

    private JMenuBar jmb;
    private JMenu products , orders, system;
    private JMenuItem makeOrders, addProducts, removeProducts, viewProducts, alterProducts,  exitSystem;
    private JButton btnCustomer, btnAdmin;

    public Main() //constructor
    {
        getContentPane().setLayout(new GridBagLayout());

        btnCustomer = new JButton("Customer");
        btnCustomer.addActionListener(this);
        addComp(btnCustomer,2,1,1,1,0,0);

        btnAdmin = new JButton("Admin");
        btnAdmin.addActionListener(this);
        addComp(btnAdmin,2,2,1,1,0,0);



        // Menu

        products = new JMenu("Products");
        addProducts = new JMenuItem("Add Products");
        products.add(addProducts);


        removeProducts = new JMenuItem("Remove Products");
        removeProducts.addActionListener(this);
        products.add(removeProducts);

        viewProducts = new JMenuItem("View Products");
        viewProducts.addActionListener(this);
        products.add(viewProducts);

        alterProducts = new JMenuItem("Alter Products");
        alterProducts.addActionListener(this);
        products.add(alterProducts);

        orders = new JMenu("Orders");
        makeOrders = new JMenuItem("Make Orders");
        //addCustomer.addActionListener(this);
        orders.add(makeOrders);

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
        if(e.getSource() == exitSystem)
        {
            System.exit(0);
        }
        if(e.getSource() == addProducts)
        {
            AddProducts frm1 = new AddProducts();
            frm1.setSize(1000, 700);
            frm1.show();
        }
        if(e.getSource() == btnAdmin){
            addProducts.enable(true);
            addProducts.show();
            removeProducts.enable(true);
            alterProducts.enable(true);
            viewProducts.hide();
            makeOrders.hide();

            if(e.getSource() == addProducts)
            {
                AddProducts frm1 = new AddProducts();
                frm1.setSize(1000, 700);
                frm1.setVisible(true);
            }
        }
        if(e.getSource() == btnCustomer){
            addProducts.hide();
            removeProducts.hide();
            alterProducts.hide();
            viewProducts.enable(true);
            makeOrders.enable(true);
        }
    }
}
