package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ViewProducts extends JFrame implements ActionListener  {
    private JMenuBar jmb;
    private JMenu customers, products , orders, system;
    private JMenuItem addCustomer, removeCustomer, makeOrders, addProducts, removeProducts, exitSystem;
    JLabel lblHeading, lblProName, lblProPrice;
    JTextArea areaProducts, TxtProPrice;
    int count =0;
    public static HashMap hm;


    public ViewProducts(HashMap temp) //Constructor
    {
        getContentPane().setLayout(new GridBagLayout());
        setUndecorated(true);

        hm=temp;

        lblHeading = new JLabel("Products", JLabel.CENTER);
        lblHeading.setFont(new Font("Serif", Font.BOLD, 30));
        addComp(lblHeading, 0, 0, 4, 1, 1, 1);
        areaProducts = new JTextArea();
        addComp(areaProducts,0,2,1,1,1,1);
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
    @Override
    public void actionPerformed(ActionEvent e)
    {
       /* Iterator it = mp.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
            it.remove(); // avoids a ConcurrentModificationException
        }*/
    }
    public static void main(String[] args)
    {

        Iterator it = hm.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
            it.remove(); // avoids a ConcurrentModificationException
        }

    }
}


