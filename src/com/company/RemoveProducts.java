package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RemoveProducts extends JFrame implements ActionListener {

    private JMenuBar jmb;
    private JMenu customers, products, orders, system;
    private JMenuItem addCustomer, removeCustomer, makeOrders, addProducts, removeProducts, exitSystem;

    JLabel lblHeading, lblProdNo, lblMessage;
    JTextField txtProdNo, txtProdDesc, txtProdPrice;
    JButton btnRemove;

    public RemoveProducts()//Constructor
    {
        getContentPane().setLayout(new GridBagLayout());

        setUndecorated(true);

        lblHeading = new JLabel("Remove Product",JLabel.CENTER);
        lblHeading.setFont(new Font("Serif", Font.BOLD,30));
        addComp(lblHeading,0,0,4,1,1,1);

        lblProdNo = new JLabel("Product No: ");
        addComp(lblProdNo,0,1,1,1,1,1);
        txtProdNo = new JTextField(6);
        addComp(txtProdNo,1,1,2,1,1,1);

        lblMessage = new JLabel("Message");
        addComp(lblMessage,2,2,1,1,1,1);

        btnRemove = new JButton("Remove Product");
        addComp(btnRemove,2,3,1,1,1,1);


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

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
