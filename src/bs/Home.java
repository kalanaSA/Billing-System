package bs;

import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Home extends javax.swing.JFrame {

    ChildBilling numberOnly = new ChildBilling();
    
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;

    public Home() {
        initComponents();
        conn = DBconnect.connect();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Billing system");
        setAutoRequestFocus(false);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        mainPanel.setBackground(new java.awt.Color(54, 33, 89));

        jPanel1.setBackground(new java.awt.Color(54, 33, 89));

        jLabel8.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 50)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("BILLING SYSTEM");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("X");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("_");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/if_bill_416404.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(85, 65, 118));

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Chrome");
        jCheckBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("Copper");
        jCheckBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox3.setText("Plastic");
        jCheckBox3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox4.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox4.setText("Travel");
        jCheckBox4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jCheckBox5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox5.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox5.setText("Labour");
        jCheckBox5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Discount");

        buttonGroup1.add(jCheckBox6);
        jCheckBox6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox6.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox6.setSelected(true);
        jCheckBox6.setText("0%");
        jCheckBox6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        buttonGroup1.add(jCheckBox7);
        jCheckBox7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox7.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox7.setText("5%");
        jCheckBox7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        buttonGroup1.add(jCheckBox8);
        jCheckBox8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox8.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox8.setText("10%");
        jCheckBox8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        buttonGroup1.add(jCheckBox9);
        jCheckBox9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox9.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox9.setText("15%");
        jCheckBox9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox9ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jCheckBox10);
        jCheckBox10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox10.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox10.setText("20%");
        jCheckBox10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        buttonGroup1.add(jCheckBox11);
        jCheckBox11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox11.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox11.setText("30%");
        jCheckBox11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Total Cost of Items :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total Cost of Labour:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Total Cost of Mileage:");

        jCheckBox12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox12.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox12.setText("Taxable");
        jCheckBox12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jCheckBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox12ActionPerformed(evt);
            }
        });

        jCheckBox13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox13.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox13.setText("VAT");
        jCheckBox13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jCheckBox13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox13ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tax              :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sub Total    :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total            :");

        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });

        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });

        jTextField5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });

        jTextField6.setEditable(false);
        jTextField6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });

        jTextField7.setEditable(false);
        jTextField7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField7KeyTyped(evt);
            }
        });

        jTextField8.setEditable(false);
        jTextField8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField8KeyTyped(evt);
            }
        });

        jTextField9.setEditable(false);
        jTextField9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField9KeyTyped(evt);
            }
        });

        jTextField10.setEditable(false);
        jTextField10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        jTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField10KeyTyped(evt);
            }
        });

        jTextField11.setEditable(false);
        jTextField11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        jTextField11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField11KeyTyped(evt);
            }
        });

        jTextField12.setEditable(false);
        jTextField12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        jTextField12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField12KeyTyped(evt);
            }
        });

        jTextField13.setEditable(false);
        jTextField13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        jTextField13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField13KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jCheckBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCheckBox8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox11)
                            .addComponent(jCheckBox10))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addComponent(jCheckBox12, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCheckBox13, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jCheckBox1)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBox2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox3)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox4)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox5)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField6)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCheckBox12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCheckBox13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField10))))
                .addGap(30, 30, 30)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox6)
                            .addComponent(jCheckBox9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox7)
                            .addComponent(jCheckBox10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox8)
                            .addComponent(jCheckBox11)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        jPanel4.setBackground(new java.awt.Color(54, 33, 89));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Total");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Reset");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Reciept");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("Exit");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setText("History");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton5))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(945, 656));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox9ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        
        if(jCheckBox4.isSelected()){
            jTextField4.setEnabled(true);
            jTextField4.setText("");
            jTextField4.requestFocus();

        }else{
            jTextField4.setEditable(false);
            jTextField4.setText("");
            
        }
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        ChildBilling CostOfItem = new ChildBilling();
        
        double ItemTax ,iSubtotal ,iTotal ,VAT;
        
        CostOfItem.Chrome = CostOfItem.pChrome * Double.parseDouble(jTextField1.getText());
        CostOfItem.Copper = CostOfItem.pCopper * Double.parseDouble(jTextField2.getText());
        CostOfItem.Plastic = CostOfItem.pPlastic * Double.parseDouble(jTextField3.getText());
        CostOfItem.Travel = CostOfItem.pTravel * Double.parseDouble(jTextField4.getText());
        CostOfItem.Labour = CostOfItem.pLabour * Double.parseDouble(jTextField5.getText());
       
        //-------------if discount 0% --------------------------------
        if(jCheckBox6.isSelected()){
         
            iSubtotal = CostOfItem.GetAmount();
            ItemTax = CostOfItem.cFindTax(iSubtotal);
            VAT = CostOfItem.cFindVAT(ItemTax);
            iTotal = iSubtotal + ItemTax + VAT;   
            
            
            String SubTotal = String.format("Rs% .2f",iSubtotal);
            jTextField12.setText(SubTotal);
            
            String Tax = String.format("Rs% .2f",ItemTax);
            jTextField11.setText(Tax);
            jTextField9.setText(SubTotal);
            
            String cVAT = String.format("Rs% .2f",VAT);
            jTextField10.setText(cVAT);
            
            String Total = String.format("Rs% .2f",iTotal);
            jTextField13.setText(Total);
            
            jTextField8.setText(String.format("Rs% .2f", CostOfItem.Travel));
            jTextField7.setText(String.format("Rs% .2f", CostOfItem.Labour));
            jTextField6.setText(String.format("Rs% .2f", CostOfItem.Chrome + CostOfItem.Copper + CostOfItem.Plastic ));
            
        
        }
        
        //-------------id discount 5% --------------------------------
        if(jCheckBox7.isSelected()){
         
            iSubtotal = CostOfItem.GetAmount();
            iSubtotal = iSubtotal-((iSubtotal*5)/100);
            ItemTax = CostOfItem.cFindTax(iSubtotal);
            VAT = CostOfItem.cFindVAT(ItemTax);
            iTotal = iSubtotal + ItemTax + VAT;   
            
            //subtotal
            String SubTotal = String.format("Rs% .2f",iSubtotal);
            jTextField12.setText(SubTotal);
            //tax
            String Tax = String.format("Rs% .2f",ItemTax);
            jTextField11.setText(Tax); 
            jTextField9.setText(SubTotal); //taxable           
            //vat
            String cVAT = String.format("Rs% .2f",VAT);
            jTextField10.setText(cVAT);
            //Total
            String Total = String.format("Rs% .2f",iTotal);
            jTextField13.setText(Total);
            
            jTextField8.setText(String.format("Rs% .2f", CostOfItem.Travel));  //total cost of travel
            jTextField7.setText(String.format("Rs% .2f", CostOfItem.Labour));  //total cost of labour
            jTextField6.setText(String.format("Rs% .2f", CostOfItem.Chrome + CostOfItem.Copper + CostOfItem.Plastic )); //total cost of items
            
        
        }
        
        //-------------id discount 10% --------------------------------
        if(jCheckBox8.isSelected()){
         
            iSubtotal = CostOfItem.GetAmount();
            iSubtotal = iSubtotal-((iSubtotal*10)/100);
            ItemTax = CostOfItem.cFindTax(iSubtotal);
            VAT = CostOfItem.cFindVAT(ItemTax);
            iTotal = iSubtotal + ItemTax + VAT;   
            
            //subtotal
            String SubTotal = String.format("Rs% .2f",iSubtotal);
            jTextField12.setText(SubTotal);
            //tax
            String Tax = String.format("Rs% .2f",ItemTax);
            jTextField11.setText(Tax); 
            jTextField9.setText(SubTotal); //taxable           
            //vat
            String cVAT = String.format("Rs% .2f",VAT);
            jTextField10.setText(cVAT);
            //Total
            String Total = String.format("Rs% .2f",iTotal);
            jTextField13.setText(Total);
            
            jTextField8.setText(String.format("Rs% .2f", CostOfItem.Travel));  //total cost of travel
            jTextField7.setText(String.format("Rs% .2f", CostOfItem.Labour));  //total cost of labour
            jTextField6.setText(String.format("Rs% .2f", CostOfItem.Chrome + CostOfItem.Copper + CostOfItem.Plastic )); //total cost of items
            
        
        }
        
        //-------------id discount 15% --------------------------------
        if(jCheckBox9.isSelected()){
         
            iSubtotal = CostOfItem.GetAmount();
            iSubtotal = iSubtotal-((iSubtotal*15)/100);
            ItemTax = CostOfItem.cFindTax(iSubtotal);
            VAT = CostOfItem.cFindVAT(ItemTax);
            iTotal = iSubtotal + ItemTax + VAT;   
            
            //subtotal
            String SubTotal = String.format("Rs% .2f",iSubtotal);
            jTextField12.setText(SubTotal);
            //tax
            String Tax = String.format("Rs% .2f",ItemTax);
            jTextField11.setText(Tax); 
            jTextField9.setText(SubTotal); //taxable           
            //vat
            String cVAT = String.format("Rs% .2f",VAT);
            jTextField10.setText(cVAT);
            //Total
            String Total = String.format("Rs% .2f",iTotal);
            jTextField13.setText(Total);
            
            jTextField8.setText(String.format("Rs% .2f", CostOfItem.Travel));  //total cost of travel
            jTextField7.setText(String.format("Rs% .2f", CostOfItem.Labour));  //total cost of labour
            jTextField6.setText(String.format("Rs% .2f", CostOfItem.Chrome + CostOfItem.Copper + CostOfItem.Plastic )); //total cost of items
            
        
        }
        
        //-------------id discount 20% --------------------------------
        if(jCheckBox10.isSelected()){
         
            iSubtotal = CostOfItem.GetAmount();
            iSubtotal = iSubtotal-((iSubtotal*20)/100);
            ItemTax = CostOfItem.cFindTax(iSubtotal);
            VAT = CostOfItem.cFindVAT(ItemTax);
            iTotal = iSubtotal + ItemTax + VAT;   
            
            //subtotal
            String SubTotal = String.format("Rs% .2f",iSubtotal);
            jTextField12.setText(SubTotal);
            //tax
            String Tax = String.format("Rs% .2f",ItemTax);
            jTextField11.setText(Tax); 
            jTextField9.setText(SubTotal); //taxable           
            //vat
            String cVAT = String.format("Rs% .2f",VAT);
            jTextField10.setText(cVAT);
            //Total
            String Total = String.format("Rs% .2f",iTotal);
            jTextField13.setText(Total);
            
            jTextField8.setText(String.format("Rs% .2f", CostOfItem.Travel));  //total cost of travel
            jTextField7.setText(String.format("Rs% .2f", CostOfItem.Labour));  //total cost of labour
            jTextField6.setText(String.format("Rs% .2f", CostOfItem.Chrome + CostOfItem.Copper + CostOfItem.Plastic )); //total cost of items
            
        
        }
        
        //-------------id discount 30% --------------------------------
        if(jCheckBox11.isSelected()){
         
            iSubtotal = CostOfItem.GetAmount();
            iSubtotal = iSubtotal-((iSubtotal*30)/100);
            ItemTax = CostOfItem.cFindTax(iSubtotal);
            VAT = CostOfItem.cFindVAT(ItemTax);
            iTotal = iSubtotal + ItemTax + VAT;   
            
            //subtotal
            String SubTotal = String.format("Rs% .2f",iSubtotal);
            jTextField12.setText(SubTotal);
            //tax
            String Tax = String.format("Rs% .2f",ItemTax);
            jTextField11.setText(Tax); 
            jTextField9.setText(SubTotal); //taxable           
            //vat
            String cVAT = String.format("Rs% .2f",VAT);
            jTextField10.setText(cVAT);
            //Total
            String Total = String.format("Rs% .2f",iTotal);
            jTextField13.setText(Total);
            
            jTextField8.setText(String.format("Rs% .2f", CostOfItem.Travel));  //total cost of travel
            jTextField7.setText(String.format("Rs% .2f", CostOfItem.Labour));  //total cost of labour
            jTextField6.setText(String.format("Rs% .2f", CostOfItem.Chrome + CostOfItem.Copper + CostOfItem.Plastic )); //total cost of items
            
        
        }
       
        //----------------------------------------------------
        JTextField clearText =null;
            for(Component c:jPanel2.getComponents()){
                if(c.getClass().toString().contains("javax.swing.JTextField")){
                    clearText = (JTextField)c;
                    clearText.setEnabled(true);
        
                }
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        ChildBilling iExit = new ChildBilling();
        
        try{
        iExit.iExitSystem();
           
        }catch(NumberFormatException e){
            
                JOptionPane.showMessageDialog(null, "Billing System Error");
                        
            }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
 
        try{
            numberOnly.NumbersOnly(evt);
        
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Billing System Error");
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
         try{
            numberOnly.NumbersOnly(evt);
        
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Billing System Error");
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        try{
            numberOnly.NumbersOnly(evt);
        
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Billing System Error");
        }
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
         try{
            numberOnly.NumbersOnly(evt);
        
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Billing System Error");
        }
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        try{
            numberOnly.NumbersOnly(evt);
        
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Billing System Error");
        }
    }//GEN-LAST:event_jTextField5KeyTyped

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
         try{
            numberOnly.NumbersOnly(evt);
        
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Billing System Error");
        }
    }//GEN-LAST:event_jTextField6KeyTyped

    private void jTextField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyTyped
         try{
            numberOnly.NumbersOnly(evt);
        
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Billing System Error");
        }
    }//GEN-LAST:event_jTextField7KeyTyped

    private void jTextField8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyTyped
        try{
            numberOnly.NumbersOnly(evt);
        
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Billing System Error");
        }
    }//GEN-LAST:event_jTextField8KeyTyped

    private void jTextField9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyTyped
         try{
            numberOnly.NumbersOnly(evt);
        
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Billing System Error");
        }
    }//GEN-LAST:event_jTextField9KeyTyped

    private void jTextField10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyTyped
        try{
            numberOnly.NumbersOnly(evt);
        
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Billing System Error");
        }
    }//GEN-LAST:event_jTextField10KeyTyped

    private void jTextField11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField11KeyTyped
        try{
            numberOnly.NumbersOnly(evt);
        
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Billing System Error");
        }
    }//GEN-LAST:event_jTextField11KeyTyped

    private void jTextField12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField12KeyTyped
         try{
            numberOnly.NumbersOnly(evt);
        
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Billing System Error");
        }
    }//GEN-LAST:event_jTextField12KeyTyped

    private void jTextField13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField13KeyTyped
         try{
            numberOnly.NumbersOnly(evt);
        
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Billing System Error");
        }
    }//GEN-LAST:event_jTextField13KeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        //receipt generate jTextField
        jTextArea1.setText("");
        
        //JTextFields in jPanel2-------------------------
        JTextField clearText =null;
        for(Component c:jPanel2.getComponents()){
            if(c.getClass().toString().contains("javax.swing.JTextField")){
                clearText = (JTextField)c;
                clearText.setText("0");
                clearText.setEnabled(false);
            
            }
        }
        
        //JCheckBoxes in jPanel2------------------------
        JCheckBox checkers = null;
        for(Component q:jPanel2.getComponents()){
            if(q.getClass().toString().contains("javax.swing.JCheckBox")){
                checkers = (JCheckBox)q;
                checkers.setSelected(false);
            }
        }
        
        //buttonGroup1 in jPanel2
        buttonGroup1.clearSelection();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
                
//--------------JTextFields in jPanel2-------------------------
        JTextField clearText =null;
        for(Component c:jPanel2.getComponents()){
            if(c.getClass().toString().contains("javax.swing.JTextField")){
                clearText = (JTextField)c;
                clearText.setText("0");
                clearText.setEnabled(false);
            
            }
        }
    }//GEN-LAST:event_formWindowActivated

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        
        if(jCheckBox1.isSelected()){
            jTextField1.setEnabled(true);
            jTextField1.setText("");
            jTextField1.requestFocus();

        }else{
            jTextField1.setEditable(false);
            jTextField1.setText("");
            
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        
        if(jCheckBox2.isSelected()){
            jTextField2.setEnabled(true);
            jTextField2.setText("");
            jTextField2.requestFocus();

        }else{
            jTextField2.setEditable(false);
            jTextField2.setText("");
            
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        
        if(jCheckBox3.isSelected()){
            jTextField3.setEnabled(true);
            jTextField3.setText("");
            jTextField3.requestFocus();

        }else{
            jTextField3.setEditable(false);
            jTextField3.setText("");
            
        }
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        
        if(jCheckBox5.isSelected()){
            jTextField5.setEnabled(true);
            jTextField5.setText("");
            jTextField5.requestFocus();

        }else{
            jTextField5.setEditable(false);
            jTextField5.setText("");
            
        }
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox12ActionPerformed

        if(jCheckBox12.isSelected()){
            jTextField9.setEnabled(true);
            jTextField9.setText("");
            jTextField9.requestFocus();

        }else{
            jTextField9.setEditable(false);
            jTextField9.setText("");
            
        }
    }//GEN-LAST:event_jCheckBox12ActionPerformed

    private void jCheckBox13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox13ActionPerformed

        if(jCheckBox13.isSelected()){
            jTextField10.setEnabled(true);
            jTextField10.setText("");
            jTextField10.requestFocus();

        }else{
            jTextField10.setEditable(false);
            jTextField10.setText("");
            
        }
    }//GEN-LAST:event_jCheckBox13ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        int refs = 1325 + (int) (Math.random()*4238);
        String ref = Integer.toString(refs);
        
        Calendar timer =  Calendar.getInstance();
        timer.getTime();
        SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
        tTime.format(timer.getTime());
        SimpleDateFormat tDate = new SimpleDateFormat("dd-MM-yyyy");
        tDate.format(timer.getTime());
        
            jTextArea1.append("\tBilling System:\n" + 
                    "Reference:\t\t\t" + refs + 
                    
                    "\n===========================================\n" + 
                    "Chrome:\t\t\t" + jTextField1.getText() + "\n\n" + 
                    "Copper:\t\t\t" + jTextField2.getText() + "\n\n" + 
                    "Plastic:\t\t\t" + jTextField3.getText() + "\n\n" + 
                    "Travel:\t\t\t" + jTextField4.getText() + "\n\n" + 
                    "Labour:\t\t\t" + jTextField5.getText() + "\n" +
                    "=============================================" + "\n\n" + 
                    
                    "Tax:\t\t\t" + jTextField11.getText() + "\n" +
                    "Sub Total:\t\t\t" + jTextField12.getText() + "\n" +
                    "Total:\t\t\t" + jTextField13.getText() + "\n\n" + 
                    "=============================================" + 
                    "\nDate: " + tDate.format(timer.getTime()) + 
                    "\nTime: " + tTime.format(timer.getTime()) + 
                    "\n\n\n\tThank you!"
                    );
            
            
            //for save details in db
            
            String sql ="INSERT INTO details(id,chrome,copper,plastic,travel,labour,totalCostofItems,"
                    + "totalCostofLabour,totalCostofMileage,taxable,vat,tax,subTotal,total) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
            try{
                pst = conn.prepareStatement(sql);
                pst.setString(1, ref);
                pst.setString(2, jTextField1.getText());
                pst.setString(3, jTextField2.getText());
                pst.setString(4, jTextField3.getText());
                pst.setString(5, jTextField4.getText());
                pst.setString(6, jTextField5.getText());
                pst.setString(7, jTextField6.getText());
                pst.setString(8, jTextField7.getText());
                pst.setString(9, jTextField8.getText());
                pst.setString(10, jTextField9.getText());
                pst.setString(11, jTextField10.getText());
                pst.setString(12, jTextField11.getText());
                pst.setString(13, jTextField12.getText());
                pst.setString(14, jTextField13.getText()); 
                pst.execute();
   
            
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
 
            }
  
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Details d = new Details();
        d.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
