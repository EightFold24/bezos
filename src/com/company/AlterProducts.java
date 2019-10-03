package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AlterProducts extends JFrame implements ActionListener {

    private JMenuBar jmb;
    private JMenu customers, products , orders, system;
    private JMenuItem addCustomer, removeCustomer, makeOrders, addProducts, removeProducts, exitSystem;

    JLabel lblHeading, lblProdToChange, lblProdDesc, lblProdPrice;
    JTextField txtProdToChange, txtProdDesc, txtProdPrice;

    public AlterProducts() //Constructor
    {
        getContentPane().setLayout(new GridBagLayout());

        setUndecorated(true);

        lblHeading = new JLabel("Alter Product",JLabel.CENTER);
        lblHeading.setFont(new Font("Serif", Font.BOLD,30));
        addComp(lblHeading,0,0,4,1,1,1);

        lblProdToChange = new JLabel("Product to be changed: ");
        addComp(lblProdToChange,0,2,1,1,1,1);
        txtProdToChange = new JTextField(6);
        addComp(txtProdToChange,1,2,2,1,1,1);

        lblProdDesc = new JLabel("Product Description:");
        addComp(lblProdDesc,0,3,1,1,1,1);
        txtProdDesc = new JTextField(6);
        addComp(txtProdDesc,1,3,2,1,1,1);

        lblProdPrice = new JLabel("Product Price:");
        addComp(lblProdPrice,0,4,1,1,1,1);
        txtProdPrice = new JTextField(6);
        addComp(txtProdPrice,1,4,2,1,1,1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

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
}
