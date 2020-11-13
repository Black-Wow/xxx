/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;



import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import net.proteanit.sql.DbUtils;
import projectex.LoginForm;

/**
 *
 * @author abdullah
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
   
    public Admin() {
        initComponents();
        jPanel2.setBackground(new Color(255,255,255,200));
        
       jLabel8.setVisible(false);
       jLabel8.setEnabled(false);
       jPanel36.setVisible(true);
       jPanel36.setEnabled(true);
         
         jPanel15.setBackground(new Color(0,0,0,0));
         close_pro.setBackground(new Color(0,0,0,0));
         mini_pro.setBackground(new Color(0,0,0,0));
        /* jTextField1.setBackground(new Color(0,0,0,0));
         jTextField2.setBackground(new Color(0,0,0,0));
         jTextField3.setBackground(new Color(0,0,0,0));
         jTextField4.setBackground(new Color(0,0,0,0));
         jTextField5.setBackground(new Color(0,0,0,0));
         jTextField6.setBackground(new Color(0,0,0,0));
         jTextField7.setBackground(new Color(0,0,0,0));
         jTextField8.setBackground(new Color(0,0,0,0));
         
        */
       
         // jTextField12.setBackground(new Color(0,0,0,100));
          //jTextField13.setBackground(new Color(0,0,0,100));
          
       // jTextField15.setBackground(new Color(0,0,0,2));
       
       
          Displyt1();
       
          Displyt2();
          
          TableTrack();
          employee_table();
          
    } 
    
    
    public void search_in_orders(){
     try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from trackdb  where user_id=? or order_state=?";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ps.setString(1, order_search.getText());
            ps.setString(2, order_search.getText());

            ResultSet rs= ps.executeQuery();

            if (rs.next()) {
                rs= ps.executeQuery();

                Table_track.setModel(DbUtils.resultSetToTableModel(rs));

            }else{

                JOptionPane.showMessageDialog(null, "User id OR order state  Not Exits");

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }                                         

    private Image ScaledImage(Image img , int w ,int h){
      BufferedImage resizeimg=new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 =resizeimg.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(img, 0, 0,w,h,null);
        
        return resizeimg;
        
    }
 
    public void addItem(){
      //  String name = jTextField9.getText();
        int price =Integer.parseInt(Product_name.getText());
        int qty = Integer.parseInt(Product_price.getText());
        int total = price*qty;
       
        
    }
    
    private void Update(){
         String sql= "select * from register  ";
        
        
       
          try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
           PreparedStatement ps ;
           ps=conn.prepareStatement(sql);
           ResultSet rs =ps.executeQuery(sql);
          jTable1.setModel(DbUtils.resultSetToTableModel(rs));
           
          } catch (Exception e) { 
              JOptionPane.showMessageDialog(null, e);
          }
      
     
            
      
        
    }
    
     
    
       public void Displyt1(){ 
              
             
          try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
           String sql="select * from register";
           PreparedStatement ps ;
           ps=conn.prepareStatement(sql);
           ResultSet rs =ps.executeQuery();
           jTable1.setModel(DbUtils.resultSetToTableModel(rs)); 
           
          } catch (Exception e) { 
              JOptionPane.showMessageDialog(null, e);
          }
      
     
            
      }
       public void employee_table(){ 
              
             
          try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
           String sql="select * from employeedb";
           PreparedStatement ps ;
           ps=conn.prepareStatement(sql);
           ResultSet rs =ps.executeQuery();
           employeeDB_table.setModel(DbUtils.resultSetToTableModel(rs)); 
           
          } catch (Exception e) { 
              JOptionPane.showMessageDialog(null, e);
          }
      
   
      }
        public void Displyt2(){ 
              
             
          try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
           String sql="select * from product";
           PreparedStatement ps ;
           ps=conn.prepareStatement(sql);
           ResultSet rs =ps.executeQuery();
           tbProduct.setModel(DbUtils.resultSetToTableModel(rs)); 
           
          } catch (Exception e) { 
              JOptionPane.showMessageDialog(null, e);
          }
      
   
      }
         
        
          
          public void TableTrack(){ 
              
             
          try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
           String sql="SELECT \n" +
"trackdb.order_id,\n" +
"trackdb.user_id,\n" +
"register.name,\n" +
"trackdb.Order_details,\n" +
"trackdb.adress,\n" +
"trackdb.order_total,\n" +
"trackdb.payment_method,\n" +
"trackdb.order_state,\n" +
"trackdb.date\n" +
"from register\n" +
"inner join trackdb\n" +
"ON register.register_id=trackdb.user_id ";
           PreparedStatement ps ;
           ps=conn.prepareStatement(sql);
           ResultSet rs =ps.executeQuery();
           Table_track.setModel(DbUtils.resultSetToTableModel(rs)); 
           
          } catch (Exception e) { 
              JOptionPane.showMessageDialog(null, e);
          }
      
     
            
      }
    // background color code
    public void backgroundcolor(){
        Color c = jColorChooser1.showDialog(null, "Background",getBackground() );
      kGradientPanel1.setkStartColor(c);
      kGradientPanel3.setkStartColor(c);
      kGradientPanel3.setkEndColor(c);
      kGradientPanel2.setkStartColor(c);
      jPanel2.setBackground(c);
       Home.setBackground(c);
       employee.setBackground(c);
       user.setBackground(c);
       Login.setBackground(c);
       track.setBackground(c);
       Product.setBackground(c);
       employee.setBackground(c);
       btnHome.setBackground(c);
       btnLogin.setBackground(c);
       btnProduct.setBackground(c);
            btnSettings.setBackground(c);
            btnTrack.setBackground(c);
            btnUser.setBackground(c);
            btnEmployee.setBackground(c);
            menu.setBackground(c);
            jPanel36.setBackground(c);
            jPanel37.setBackground(c);
            jPanel15.setBackground(c);
            jPanel11.setBackground(c);
             jPanel1.setBackground(c);
      
    
    
    }
public void menuopen(){
           new Thread() {
           @Override
           public void run() { 
               try {
                   
              
               for (int i = 0; i < 220; i++) {
                   Thread.sleep(2);
                    jPanel11.setSize(i,700);
                   
                   } 
              
                   
               
               } catch (Exception e) {
               } 
               
           } 
           
           
       }.start();
         
           
    }
    
    //close menu
    public void menuclose(){
         new Thread() {
           @Override
           public void run() { 
               try {
                   
              Thread.sleep(2);
               for (int i = 220; i >=0; i--) {
                   Thread.sleep(2);
                    jPanel11.setSize(i,700);
                   
                   } 
              
                   
               
               } catch (Exception e) {
               } 
               
           } 
           
           
       }.start();
        
      jLabel32.setVisible(true);
      jLabel33.setVisible(false);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jColorChooser1 = new javax.swing.JColorChooser();
        jPanel1 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        btnHome = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        btnSettings = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        btnTrack = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        btnProduct = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        btnUser = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        btnEmployee = new javax.swing.JPanel();
        btnEmploye = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Home = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        employee = new javax.swing.JPanel();
        kGradientPanel12 = new keeptoo.KGradientPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        employeeDB_table = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        kGradientPanel13 = new keeptoo.KGradientPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        employee_id = new javax.swing.JTextField();
        employee_Name = new javax.swing.JTextField();
        employee_Phone = new javax.swing.JTextField();
        employee_Email = new javax.swing.JTextField();
        InsertProduct3 = new javax.swing.JButton();
        updateProduct3 = new javax.swing.JButton();
        deleteProduct3 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        employee_Password = new javax.swing.JTextField();
        employee_Username = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        employee_Address = new javax.swing.JTextField();
        user = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        Insert = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        jTextField15 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        kGradientPanel5 = new keeptoo.KGradientPanel();
        Login = new javax.swing.JPanel();
        kGradientPanel10 = new keeptoo.KGradientPanel();
        kGradientPanel11 = new keeptoo.KGradientPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        InsertProduct2 = new javax.swing.JButton();
        updateProduct2 = new javax.swing.JButton();
        deleteProduct2 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel27 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbProduct2 = new javax.swing.JTable();
        Product = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbProduct = new javax.swing.JTable();
        kGradientPanel6 = new keeptoo.KGradientPanel();
        kGradientPanel18 = new keeptoo.KGradientPanel();
        jTextField37 = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        jLabel62 = new javax.swing.JLabel();
        kGradientPanel7 = new keeptoo.KGradientPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        Product_name = new javax.swing.JTextField();
        Product_price = new javax.swing.JTextField();
        InsertProduct = new javax.swing.JButton();
        updateProduct = new javax.swing.JButton();
        deleteProduct = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        SelectedPhoto = new javax.swing.JLabel();
        Product_category = new javax.swing.JComboBox<>();
        mPhotoPath = new javax.swing.JTextField();
        Product_id = new javax.swing.JTextField();
        Product_qty = new javax.swing.JTextField();
        settings = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbProduct1 = new javax.swing.JTable();
        kGradientPanel8 = new keeptoo.KGradientPanel();
        kGradientPanel9 = new keeptoo.KGradientPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        InsertProduct1 = new javax.swing.JButton();
        updateProduct1 = new javax.swing.JButton();
        deleteProduct1 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel26 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        track = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        kGradientPanel15 = new keeptoo.KGradientPanel();
        updateProduct4 = new javax.swing.JButton();
        deleteProduct4 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        bill_text_area = new javax.swing.JTextArea();
        jComboBox1 = new javax.swing.JComboBox<>();
        lbl_Order_Id = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bill_amount = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        order_search = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        Table_track = new javax.swing.JTable();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        close_pro = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        mini_pro = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDialog1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDialog1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(0, 0, 0));

        kGradientPanel3.setBackground(new java.awt.Color(0, 153, 255));
        kGradientPanel3.setkEndColor(new java.awt.Color(0, 0, 0));
        kGradientPanel3.setkGradientFocus(400);
        kGradientPanel3.setkStartColor(new java.awt.Color(0, 0, 0));

        btnHome.setBackground(new java.awt.Color(0, 0, 0));
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEnterd(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExit(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mousePress(evt);
            }
        });

        jLabel27.setBackground(new java.awt.Color(170, 0, 0));
        jLabel27.setFont(new java.awt.Font("Javanese Text", 1, 22)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 204, 102));
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Home_25px.png"))); // NOI18N
        jLabel27.setText("     Home");

        javax.swing.GroupLayout btnHomeLayout = new javax.swing.GroupLayout(btnHome);
        btnHome.setLayout(btnHomeLayout);
        btnHomeLayout.setHorizontalGroup(
            btnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        btnHomeLayout.setVerticalGroup(
            btnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnHomeLayout.createSequentialGroup()
                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        btnSettings.setBackground(new java.awt.Color(0, 0, 0));
        btnSettings.setForeground(new java.awt.Color(255, 255, 255));
        btnSettings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEnterd(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExit(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mousePress(evt);
            }
        });

        jLabel28.setBackground(new java.awt.Color(102, 0, 102));
        jLabel28.setFont(new java.awt.Font("Javanese Text", 1, 22)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 204, 102));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel28.setIcon(new javax.swing.ImageIcon("D:\\resize\\settings (1).png")); // NOI18N
        jLabel28.setText(" Setting");
        jLabel28.setMaximumSize(new java.awt.Dimension(150, 150));

        javax.swing.GroupLayout btnSettingsLayout = new javax.swing.GroupLayout(btnSettings);
        btnSettings.setLayout(btnSettingsLayout);
        btnSettingsLayout.setHorizontalGroup(
            btnSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnSettingsLayout.setVerticalGroup(
            btnSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
        );

        btnTrack.setBackground(new java.awt.Color(0, 0, 0));
        btnTrack.setForeground(new java.awt.Color(255, 255, 255));
        btnTrack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEnterd(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExit(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mousePress(evt);
            }
        });

        jLabel29.setBackground(new java.awt.Color(102, 0, 102));
        jLabel29.setFont(new java.awt.Font("Javanese Text", 1, 22)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 204, 102));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel29.setIcon(new javax.swing.ImageIcon("D:\\resize\\location.png")); // NOI18N
        jLabel29.setText("Track");
        jLabel29.setMaximumSize(new java.awt.Dimension(150, 150));

        javax.swing.GroupLayout btnTrackLayout = new javax.swing.GroupLayout(btnTrack);
        btnTrack.setLayout(btnTrackLayout);
        btnTrackLayout.setHorizontalGroup(
            btnTrackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnTrackLayout.setVerticalGroup(
            btnTrackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
        );

        btnProduct.setBackground(new java.awt.Color(0, 0, 0));
        btnProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEnterd(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExit(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mousePress(evt);
            }
        });

        jLabel30.setBackground(new java.awt.Color(170, 0, 0));
        jLabel30.setFont(new java.awt.Font("Javanese Text", 1, 22)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 204, 102));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel30.setIcon(new javax.swing.ImageIcon("D:\\resize\\delevery (1).png")); // NOI18N
        jLabel30.setText("Product");
        jLabel30.setMaximumSize(new java.awt.Dimension(150, 150));

        javax.swing.GroupLayout btnProductLayout = new javax.swing.GroupLayout(btnProduct);
        btnProduct.setLayout(btnProductLayout);
        btnProductLayout.setHorizontalGroup(
            btnProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnProductLayout.setVerticalGroup(
            btnProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
        );

        btnLogin.setBackground(new java.awt.Color(0, 0, 0));
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEnterd(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExit(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mousePress(evt);
            }
        });

        jLabel31.setBackground(new java.awt.Color(170, 0, 0));
        jLabel31.setFont(new java.awt.Font("Javanese Text", 1, 22)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 204, 102));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel31.setIcon(new javax.swing.ImageIcon("D:\\resize\\iconfinder_Login Manager_7261 (1).png")); // NOI18N
        jLabel31.setText(" Login");
        jLabel31.setMaximumSize(new java.awt.Dimension(150, 150));

        javax.swing.GroupLayout btnLoginLayout = new javax.swing.GroupLayout(btnLogin);
        btnLogin.setLayout(btnLoginLayout);
        btnLoginLayout.setHorizontalGroup(
            btnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        btnLoginLayout.setVerticalGroup(
            btnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
        );

        btnUser.setBackground(new java.awt.Color(0, 0, 0));
        btnUser.setForeground(new java.awt.Color(255, 255, 255));
        btnUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEnterd(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExit(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mousePress(evt);
            }
        });

        jLabel32.setBackground(new java.awt.Color(170, 0, 0));
        jLabel32.setFont(new java.awt.Font("Javanese Text", 1, 22)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 204, 102));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel32.setIcon(new javax.swing.ImageIcon("D:\\resize\\user (1).png")); // NOI18N
        jLabel32.setText(" User");
        jLabel32.setMaximumSize(new java.awt.Dimension(150, 150));

        javax.swing.GroupLayout btnUserLayout = new javax.swing.GroupLayout(btnUser);
        btnUser.setLayout(btnUserLayout);
        btnUserLayout.setHorizontalGroup(
            btnUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnUserLayout.createSequentialGroup()
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnUserLayout.setVerticalGroup(
            btnUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
        );

        btnEmployee.setBackground(new java.awt.Color(0, 0, 0));
        btnEmployee.setForeground(new java.awt.Color(255, 255, 255));
        btnEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEnterd(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExit(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mousePress(evt);
            }
        });

        btnEmploye.setBackground(new java.awt.Color(170, 0, 0));
        btnEmploye.setFont(new java.awt.Font("Javanese Text", 1, 22)); // NOI18N
        btnEmploye.setForeground(new java.awt.Color(255, 204, 102));
        btnEmploye.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEmploye.setIcon(new javax.swing.ImageIcon("D:\\resize\\empolyee (1).png")); // NOI18N
        btnEmploye.setText(" Employee");
        btnEmploye.setMaximumSize(new java.awt.Dimension(150, 150));

        javax.swing.GroupLayout btnEmployeeLayout = new javax.swing.GroupLayout(btnEmployee);
        btnEmployee.setLayout(btnEmployeeLayout);
        btnEmployeeLayout.setHorizontalGroup(
            btnEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEmploye, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnEmployeeLayout.setVerticalGroup(
            btnEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEmploye, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
        );

        jPanel36.setBackground(new java.awt.Color(0, 0, 0));
        jPanel36.setForeground(new java.awt.Color(255, 255, 255));

        jPanel37.setBackground(new java.awt.Color(0, 0, 0));
        jPanel37.setForeground(new java.awt.Color(255, 255, 255));
        jPanel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEnterd(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExit(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel37MousePressed(evt);
            }
        });

        jLabel35.setBackground(new java.awt.Color(170, 0, 0));
        jLabel35.setFont(new java.awt.Font("Javanese Text", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 204, 102));
        jLabel35.setIcon(new javax.swing.ImageIcon("D:\\resize\\color.png")); // NOI18N
        jLabel35.setText("  Background Color");

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel15.setBackground(new java.awt.Color(0, 0, 0));
        jPanel15.setForeground(new java.awt.Color(255, 255, 255));
        jPanel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEnterd(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExit(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mousePress(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Javanese Text", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 204, 102));
        jLabel36.setIcon(new javax.swing.ImageIcon("D:\\resize\\shutdown-icon.png")); // NOI18N
        jLabel36.setText("  Log out");
        jLabel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel36MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menu.setBackground(new java.awt.Color(0, 0, 0));
        menu.setForeground(new java.awt.Color(255, 255, 255));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon("D:\\resize\\Downloads-black-icon.png")); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });
        menu.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon("D:\\resize\\G12-Load-Up-icon.png")); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel10MousePressed(evt);
            }
        });
        menu.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 50));

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(btnSettings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTrack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(btnEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel3Layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTrack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSettings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 690));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.CardLayout());

        Home.setBackground(new java.awt.Color(204, 0, 51));

        kGradientPanel1.setBackground(new java.awt.Color(204, 255, 204));
        kGradientPanel1.setkEndColor(new java.awt.Color(0, 0, 0));
        kGradientPanel1.setkGradientFocus(1200);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 0, 0));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\resize\\127412176-x-z-x-z-logo-initial-vector-mark-initial-letter-x-z-x-z-luxury-art-vector-mark-logo-rose-gold-silver-removebg-preview.png")); // NOI18N
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel5.setFont(new java.awt.Font("Javanese Text", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Shopping Center");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(196, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(Home, "card2");

        employee.setBackground(new java.awt.Color(255, 255, 255));
        employee.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel12.setkEndColor(new java.awt.Color(204, 0, 0));
        kGradientPanel12.setkGradientFocus(1200);
        kGradientPanel12.setkStartColor(new java.awt.Color(0, 0, 0));
        kGradientPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        employeeDB_table.setAutoCreateRowSorter(true);
        employeeDB_table.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        employeeDB_table.setFont(new java.awt.Font("Traditional Arabic", 0, 14)); // NOI18N
        employeeDB_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        employeeDB_table.setGridColor(new java.awt.Color(255, 51, 0));
        employeeDB_table.setRequestFocusEnabled(false);
        employeeDB_table.setRowHeight(22);
        employeeDB_table.setSelectionBackground(new java.awt.Color(204, 204, 0));
        employeeDB_table.setSelectionForeground(new java.awt.Color(255, 0, 0));
        employeeDB_table.setShowGrid(false);
        employeeDB_table.setSurrendersFocusOnKeystroke(true);
        employeeDB_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeeDB_tableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(employeeDB_table);

        kGradientPanel12.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 470, 650));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel13.setkEndColor(new java.awt.Color(51, 51, 51));
        kGradientPanel13.setkStartColor(new java.awt.Color(255, 255, 255));
        kGradientPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel45.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("ID");
        jLabel45.setAlignmentX(5.0F);
        jLabel45.setAlignmentY(1.5F);
        kGradientPanel13.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 121, 30));

        jLabel46.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Name");
        jLabel46.setAlignmentX(5.0F);
        jLabel46.setAlignmentY(1.5F);
        kGradientPanel13.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 121, 30));

        jLabel47.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Phone");
        jLabel47.setAlignmentX(5.0F);
        jLabel47.setAlignmentY(1.5F);
        kGradientPanel13.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 121, 30));

        jLabel48.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Email");
        jLabel48.setAlignmentX(5.0F);
        jLabel48.setAlignmentY(1.5F);
        kGradientPanel13.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 121, 30));

        jLabel49.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Username");
        jLabel49.setAlignmentX(5.0F);
        jLabel49.setAlignmentY(1.5F);
        kGradientPanel13.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 121, 30));

        employee_id.setBackground(new java.awt.Color(0, 204, 204));
        employee_id.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        employee_id.setForeground(new java.awt.Color(51, 0, 0));
        employee_id.setAlignmentX(5.0F);
        employee_id.setAlignmentY(1.5F);
        employee_id.setBorder(null);
        employee_id.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        kGradientPanel13.add(employee_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 280, 30));

        employee_Name.setBackground(new java.awt.Color(0, 204, 204));
        employee_Name.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        employee_Name.setForeground(new java.awt.Color(51, 0, 0));
        employee_Name.setAlignmentX(5.0F);
        employee_Name.setAlignmentY(1.5F);
        employee_Name.setBorder(null);
        kGradientPanel13.add(employee_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 280, 30));

        employee_Phone.setBackground(new java.awt.Color(0, 204, 204));
        employee_Phone.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        employee_Phone.setForeground(new java.awt.Color(51, 0, 0));
        employee_Phone.setAlignmentX(5.0F);
        employee_Phone.setAlignmentY(1.5F);
        employee_Phone.setBorder(null);
        kGradientPanel13.add(employee_Phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 280, 30));

        employee_Email.setBackground(new java.awt.Color(0, 204, 204));
        employee_Email.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        employee_Email.setForeground(new java.awt.Color(51, 0, 0));
        employee_Email.setAlignmentX(5.0F);
        employee_Email.setAlignmentY(1.5F);
        employee_Email.setBorder(null);
        employee_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employee_EmailActionPerformed(evt);
            }
        });
        kGradientPanel13.add(employee_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 280, 30));

        InsertProduct3.setBackground(new java.awt.Color(51, 0, 51));
        InsertProduct3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        InsertProduct3.setText("Add");
        InsertProduct3.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        InsertProduct3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertProduct3ActionPerformed(evt);
            }
        });
        kGradientPanel13.add(InsertProduct3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 130, 40));

        updateProduct3.setBackground(new java.awt.Color(51, 0, 51));
        updateProduct3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        updateProduct3.setText("Update");
        updateProduct3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        updateProduct3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateProduct3ActionPerformed(evt);
            }
        });
        kGradientPanel13.add(updateProduct3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 540, 130, 40));

        deleteProduct3.setBackground(new java.awt.Color(51, 0, 51));
        deleteProduct3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        deleteProduct3.setText("Delete");
        deleteProduct3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        deleteProduct3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteProduct3ActionPerformed(evt);
            }
        });
        kGradientPanel13.add(deleteProduct3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 540, 130, 40));

        jButton13.setBackground(new java.awt.Color(51, 0, 51));
        jButton13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton13.setText("Print");
        jButton13.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        kGradientPanel13.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 410, 40));

        jLabel51.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("Password");
        jLabel51.setAlignmentX(5.0F);
        jLabel51.setAlignmentY(1.5F);
        kGradientPanel13.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 121, 30));

        employee_Password.setBackground(new java.awt.Color(0, 204, 204));
        employee_Password.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        employee_Password.setForeground(new java.awt.Color(51, 0, 0));
        employee_Password.setAlignmentX(5.0F);
        employee_Password.setAlignmentY(1.5F);
        employee_Password.setBorder(null);
        employee_Password.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        kGradientPanel13.add(employee_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 280, 30));

        employee_Username.setBackground(new java.awt.Color(0, 204, 204));
        employee_Username.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        employee_Username.setForeground(new java.awt.Color(51, 0, 0));
        employee_Username.setAlignmentX(5.0F);
        employee_Username.setAlignmentY(1.5F);
        employee_Username.setBorder(null);
        employee_Username.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        kGradientPanel13.add(employee_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 280, 30));

        jLabel52.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("Address");
        jLabel52.setAlignmentX(5.0F);
        jLabel52.setAlignmentY(1.5F);
        kGradientPanel13.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 121, 30));

        employee_Address.setBackground(new java.awt.Color(0, 204, 204));
        employee_Address.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        employee_Address.setForeground(new java.awt.Color(51, 0, 0));
        employee_Address.setAlignmentX(5.0F);
        employee_Address.setAlignmentY(1.5F);
        employee_Address.setBorder(null);
        employee_Address.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        kGradientPanel13.add(employee_Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 280, 30));

        jPanel3.add(kGradientPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 650));

        kGradientPanel12.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 650));

        employee.add(kGradientPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 650));

        jPanel2.add(employee, "card3");

        user.setBackground(new java.awt.Color(0, 0, 0));
        user.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel23.setBackground(new java.awt.Color(51, 0, 51));
        jPanel23.setAlignmentX(5.0F);
        jPanel23.setAlignmentY(1.5F);

        jLabel12.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setAlignmentX(5.0F);
        jLabel12.setAlignmentY(1.5F);

        jLabel13.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setAlignmentX(5.0F);
        jLabel13.setAlignmentY(1.5F);

        jLabel14.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setAlignmentX(5.0F);
        jLabel14.setAlignmentY(1.5F);

        jLabel15.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setAlignmentX(5.0F);
        jLabel15.setAlignmentY(1.5F);

        jLabel16.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setAlignmentX(5.0F);
        jLabel16.setAlignmentY(1.5F);

        jLabel17.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setAlignmentX(5.0F);
        jLabel17.setAlignmentY(1.5F);

        jTextField1.setBackground(new java.awt.Color(0, 153, 153));
        jTextField1.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setAlignmentX(5.0F);
        jTextField1.setAlignmentY(1.5F);
        jTextField1.setBorder(null);

        jTextField2.setBackground(new java.awt.Color(0, 153, 153));
        jTextField2.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setAlignmentX(5.0F);
        jTextField2.setAlignmentY(1.5F);
        jTextField2.setBorder(null);

        jTextField3.setBackground(new java.awt.Color(0, 153, 153));
        jTextField3.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setAlignmentX(5.0F);
        jTextField3.setAlignmentY(1.5F);
        jTextField3.setBorder(null);

        jTextField4.setBackground(new java.awt.Color(0, 153, 153));
        jTextField4.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setAlignmentX(5.0F);
        jTextField4.setAlignmentY(1.5F);
        jTextField4.setBorder(null);

        jTextField5.setBackground(new java.awt.Color(0, 153, 153));
        jTextField5.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setAlignmentX(5.0F);
        jTextField5.setAlignmentY(1.5F);
        jTextField5.setBorder(null);

        jTextField6.setBackground(new java.awt.Color(0, 153, 153));
        jTextField6.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setAlignmentX(1.5F);
        jTextField6.setAlignmentY(1.5F);
        jTextField6.setAutoscrolls(false);
        jTextField6.setBorder(null);

        Insert.setBackground(new java.awt.Color(0, 204, 204));
        Insert.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Insert.setText("Insert");
        Insert.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 204, 204));
        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton2.setText("Update");
        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 204, 204));
        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton3.setText("Delete");
        jButton3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 204, 204));
        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton4.setText("Print");
        jButton4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jTextField7.setBackground(new java.awt.Color(0, 153, 153));
        jTextField7.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));
        jTextField7.setAlignmentX(1.5F);
        jTextField7.setAlignmentY(1.5F);
        jTextField7.setAutoscrolls(false);
        jTextField7.setBorder(null);
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jTextField8.setBackground(new java.awt.Color(0, 153, 153));
        jTextField8.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(255, 255, 255));
        jTextField8.setAlignmentX(1.5F);
        jTextField8.setAlignmentY(1.5F);
        jTextField8.setAutoscrolls(false);
        jTextField8.setBorder(null);

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(77, 77, 77)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(188, 188, 188))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        user.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 920, 310));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTable1.setFont(new java.awt.Font("Traditional Arabic", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(255, 51, 0));
        jTable1.setRequestFocusEnabled(false);
        jTable1.setRowHeight(22);
        jTable1.setSelectionBackground(new java.awt.Color(204, 204, 0));
        jTable1.setSelectionForeground(new java.awt.Color(255, 0, 0));
        jTable1.setShowGrid(false);
        jTable1.setSurrendersFocusOnKeystroke(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        user.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 920, 290));

        kGradientPanel4.setkEndColor(new java.awt.Color(153, 0, 0));
        kGradientPanel4.setkGradientFocus(1400);
        kGradientPanel4.setkStartColor(new java.awt.Color(0, 0, 0));

        jTextField15.setBackground(new java.awt.Color(0, 0, 0));
        jTextField15.setFont(new java.awt.Font("Traditional Arabic", 0, 20)); // NOI18N
        jTextField15.setForeground(new java.awt.Color(255, 255, 255));
        jTextField15.setText("Search");
        jTextField15.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField15.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField15FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField15FocusLost(evt);
            }
        });
        jTextField15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField15KeyPressed(evt);
            }
        });

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Search_25px_2.png"))); // NOI18N
        jLabel24.setText("  ");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 255, 255));
        jButton1.setText("Search");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.setRequestFocusEnabled(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEnterd(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExit(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 483, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField15, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        user.add(kGradientPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 50));

        kGradientPanel5.setkEndColor(new java.awt.Color(204, 0, 0));
        kGradientPanel5.setkGradientFocus(1200);
        kGradientPanel5.setkStartColor(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout kGradientPanel5Layout = new javax.swing.GroupLayout(kGradientPanel5);
        kGradientPanel5.setLayout(kGradientPanel5Layout);
        kGradientPanel5Layout.setHorizontalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 920, Short.MAX_VALUE)
        );
        kGradientPanel5Layout.setVerticalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        user.add(kGradientPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 920, 610));

        jPanel2.add(user, "card4");

        Login.setBackground(new java.awt.Color(255, 255, 255));

        kGradientPanel10.setkEndColor(new java.awt.Color(204, 0, 0));
        kGradientPanel10.setkGradientFocus(1200);
        kGradientPanel10.setkStartColor(new java.awt.Color(0, 0, 0));
        kGradientPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel11.setkEndColor(new java.awt.Color(102, 204, 255));
        kGradientPanel11.setkStartColor(new java.awt.Color(0, 0, 0));

        jLabel39.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Pro_Id");
        jLabel39.setAlignmentX(5.0F);
        jLabel39.setAlignmentY(1.5F);

        jLabel40.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Name");
        jLabel40.setAlignmentX(5.0F);
        jLabel40.setAlignmentY(1.5F);

        jLabel41.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Price");
        jLabel41.setAlignmentX(5.0F);
        jLabel41.setAlignmentY(1.5F);

        jLabel42.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("qty");
        jLabel42.setAlignmentX(5.0F);
        jLabel42.setAlignmentY(1.5F);

        jLabel43.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Category");
        jLabel43.setAlignmentX(5.0F);
        jLabel43.setAlignmentY(1.5F);

        jTextField20.setBackground(new java.awt.Color(0, 204, 204));
        jTextField20.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jTextField20.setForeground(new java.awt.Color(51, 0, 0));
        jTextField20.setAlignmentX(5.0F);
        jTextField20.setAlignmentY(1.5F);
        jTextField20.setBorder(null);
        jTextField20.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        jTextField21.setBackground(new java.awt.Color(0, 204, 204));
        jTextField21.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jTextField21.setForeground(new java.awt.Color(51, 0, 0));
        jTextField21.setAlignmentX(5.0F);
        jTextField21.setAlignmentY(1.5F);
        jTextField21.setBorder(null);

        jTextField22.setBackground(new java.awt.Color(0, 204, 204));
        jTextField22.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jTextField22.setForeground(new java.awt.Color(51, 0, 0));
        jTextField22.setAlignmentX(5.0F);
        jTextField22.setAlignmentY(1.5F);
        jTextField22.setBorder(null);

        jTextField23.setBackground(new java.awt.Color(0, 204, 204));
        jTextField23.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jTextField23.setForeground(new java.awt.Color(51, 0, 0));
        jTextField23.setAlignmentX(5.0F);
        jTextField23.setAlignmentY(1.5F);
        jTextField23.setBorder(null);

        InsertProduct2.setBackground(new java.awt.Color(51, 0, 51));
        InsertProduct2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        InsertProduct2.setText("Insert");
        InsertProduct2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        InsertProduct2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertProduct2ActionPerformed(evt);
            }
        });

        updateProduct2.setBackground(new java.awt.Color(51, 0, 51));
        updateProduct2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        updateProduct2.setText("Update");
        updateProduct2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        updateProduct2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateProduct2ActionPerformed(evt);
            }
        });

        deleteProduct2.setBackground(new java.awt.Color(51, 0, 51));
        deleteProduct2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        deleteProduct2.setText("Delete");
        deleteProduct2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        deleteProduct2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteProduct2ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(51, 0, 51));
        jButton11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton11.setText("Print");
        jButton11.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jButton12.setText("jButton8");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel44.setBackground(new java.awt.Color(255, 255, 255));
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setMaximumSize(new java.awt.Dimension(220, 200));

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
            .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
        );

        jTextField24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField24ActionPerformed(evt);
            }
        });

        jComboBox3.setBackground(new java.awt.Color(0, 204, 204));
        jComboBox3.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Electronic", "Furniture", "Clothes", "Shoes" }));

        javax.swing.GroupLayout kGradientPanel11Layout = new javax.swing.GroupLayout(kGradientPanel11);
        kGradientPanel11.setLayout(kGradientPanel11Layout);
        kGradientPanel11Layout.setHorizontalGroup(
            kGradientPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel11Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(kGradientPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel11Layout.createSequentialGroup()
                        .addGroup(kGradientPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel11Layout.createSequentialGroup()
                                .addGroup(kGradientPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(updateProduct2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(InsertProduct2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(deleteProduct2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(120, 120, 120)
                                .addGroup(kGradientPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(kGradientPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField23, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField22, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField21, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField20)
                            .addComponent(jComboBox3, 0, 231, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(kGradientPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField24, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel11Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton12)
                        .addGap(69, 69, 69)))
                .addGap(49, 49, 49))
        );
        kGradientPanel11Layout.setVerticalGroup(
            kGradientPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel11Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(kGradientPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(kGradientPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(kGradientPanel11Layout.createSequentialGroup()
                            .addComponent(InsertProduct2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(updateProduct2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(deleteProduct2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(kGradientPanel11Layout.createSequentialGroup()
                            .addGroup(kGradientPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(kGradientPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(kGradientPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(kGradientPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(kGradientPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox3))))
                    .addGroup(kGradientPanel11Layout.createSequentialGroup()
                        .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton12)
                .addContainerGap())
        );

        kGradientPanel10.add(kGradientPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 321, -1, -1));

        tbProduct2.setAutoCreateRowSorter(true);
        tbProduct2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tbProduct2.setFont(new java.awt.Font("Traditional Arabic", 0, 14)); // NOI18N
        tbProduct2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbProduct2.setGridColor(new java.awt.Color(255, 51, 0));
        tbProduct2.setRequestFocusEnabled(false);
        tbProduct2.setRowHeight(22);
        tbProduct2.setSelectionBackground(new java.awt.Color(204, 204, 0));
        tbProduct2.setSelectionForeground(new java.awt.Color(255, 0, 0));
        tbProduct2.setShowGrid(false);
        tbProduct2.setSurrendersFocusOnKeystroke(true);
        tbProduct2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProduct2MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbProduct2);

        kGradientPanel10.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 920, 280));

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login);
        Login.setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kGradientPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kGradientPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(Login, "card5");

        Product.setBackground(new java.awt.Color(0, 0, 0));
        Product.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbProduct.setAutoCreateRowSorter(true);
        tbProduct.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tbProduct.setFont(new java.awt.Font("Traditional Arabic", 0, 14)); // NOI18N
        tbProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbProduct.setGridColor(new java.awt.Color(255, 51, 0));
        tbProduct.setRequestFocusEnabled(false);
        tbProduct.setRowHeight(22);
        tbProduct.setSelectionBackground(new java.awt.Color(204, 204, 0));
        tbProduct.setSelectionForeground(new java.awt.Color(255, 0, 0));
        tbProduct.setShowGrid(false);
        tbProduct.setSurrendersFocusOnKeystroke(true);
        tbProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProductMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbProduct);

        Product.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 920, 280));

        kGradientPanel6.setkEndColor(new java.awt.Color(204, 0, 0));
        kGradientPanel6.setkGradientFocus(1200);
        kGradientPanel6.setkStartColor(new java.awt.Color(0, 0, 0));
        kGradientPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel18.setkEndColor(new java.awt.Color(153, 0, 0));
        kGradientPanel18.setkGradientFocus(1400);
        kGradientPanel18.setkStartColor(new java.awt.Color(0, 0, 0));

        jTextField37.setBackground(new java.awt.Color(0, 0, 0));
        jTextField37.setFont(new java.awt.Font("Traditional Arabic", 0, 20)); // NOI18N
        jTextField37.setForeground(new java.awt.Color(255, 255, 255));
        jTextField37.setText("Search");
        jTextField37.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField37.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField37FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField37FocusLost(evt);
            }
        });
        jTextField37.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField37KeyPressed(evt);
            }
        });

        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Search_25px_2.png"))); // NOI18N
        jLabel61.setText("  ");

        jButton17.setBackground(new java.awt.Color(0, 0, 0));
        jButton17.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jButton17.setForeground(new java.awt.Color(153, 255, 255));
        jButton17.setText("Search");
        jButton17.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton17.setRequestFocusEnabled(false);
        jButton17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton17mouseEnterd(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton17mouseExit(evt);
            }
        });
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jLabel62.setText("jLabel1");
        jLabel62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel62MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel18Layout = new javax.swing.GroupLayout(kGradientPanel18);
        kGradientPanel18.setLayout(kGradientPanel18Layout);
        kGradientPanel18Layout.setHorizontalGroup(
            kGradientPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel18Layout.createSequentialGroup()
                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 483, Short.MAX_VALUE)
                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        kGradientPanel18Layout.setVerticalGroup(
            kGradientPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(kGradientPanel18Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(kGradientPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        kGradientPanel6.add(kGradientPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 50));

        kGradientPanel7.setkEndColor(new java.awt.Color(102, 0, 102));
        kGradientPanel7.setkStartColor(new java.awt.Color(0, 0, 0));

        jLabel18.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Pro_Id");
        jLabel18.setAlignmentX(5.0F);
        jLabel18.setAlignmentY(1.5F);

        jLabel19.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Name");
        jLabel19.setAlignmentX(5.0F);
        jLabel19.setAlignmentY(1.5F);

        jLabel20.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Price");
        jLabel20.setAlignmentX(5.0F);
        jLabel20.setAlignmentY(1.5F);

        jLabel22.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Category");
        jLabel22.setAlignmentX(5.0F);
        jLabel22.setAlignmentY(1.5F);

        Product_name.setBackground(new java.awt.Color(0, 204, 204));
        Product_name.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        Product_name.setForeground(new java.awt.Color(51, 0, 0));
        Product_name.setAlignmentX(5.0F);
        Product_name.setAlignmentY(1.5F);
        Product_name.setBorder(null);

        Product_price.setBackground(new java.awt.Color(0, 204, 204));
        Product_price.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        Product_price.setForeground(new java.awt.Color(51, 0, 0));
        Product_price.setAlignmentX(5.0F);
        Product_price.setAlignmentY(1.5F);
        Product_price.setBorder(null);

        InsertProduct.setBackground(new java.awt.Color(0, 204, 204));
        InsertProduct.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        InsertProduct.setText("Insert");
        InsertProduct.setBorder(new javax.swing.border.MatteBorder(null));
        InsertProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertProductActionPerformed(evt);
            }
        });

        updateProduct.setBackground(new java.awt.Color(0, 204, 204));
        updateProduct.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        updateProduct.setText("Update");
        updateProduct.setBorder(new javax.swing.border.MatteBorder(null));
        updateProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateProductActionPerformed(evt);
            }
        });

        deleteProduct.setBackground(new java.awt.Color(0, 204, 204));
        deleteProduct.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        deleteProduct.setText("Delete");
        deleteProduct.setBorder(new javax.swing.border.MatteBorder(null));
        deleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteProductActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 204, 204));
        jButton7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton7.setText("Print");
        jButton7.setBorder(new javax.swing.border.MatteBorder(null));

        jButton8.setBackground(new java.awt.Color(153, 0, 0));
        jButton8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Add_Camera_20px.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        SelectedPhoto.setBackground(new java.awt.Color(255, 255, 255));
        SelectedPhoto.setForeground(new java.awt.Color(255, 255, 255));
        SelectedPhoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SelectedPhoto.setMaximumSize(new java.awt.Dimension(220, 200));

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SelectedPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SelectedPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Product_category.setBackground(new java.awt.Color(0, 204, 204));
        Product_category.setForeground(new java.awt.Color(255, 255, 255));
        Product_category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "E", "F", "C", "G" }));

        mPhotoPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mPhotoPathActionPerformed(evt);
            }
        });

        Product_id.setBackground(new java.awt.Color(0, 204, 204));
        Product_id.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        Product_id.setForeground(new java.awt.Color(51, 0, 0));
        Product_id.setAlignmentX(5.0F);
        Product_id.setAlignmentY(1.5F);
        Product_id.setBorder(null);

        Product_qty.setBackground(new java.awt.Color(0, 204, 204));
        Product_qty.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        Product_qty.setForeground(new java.awt.Color(51, 0, 0));
        Product_qty.setAlignmentX(5.0F);
        Product_qty.setAlignmentY(1.5F);
        Product_qty.setBorder(null);

        javax.swing.GroupLayout kGradientPanel7Layout = new javax.swing.GroupLayout(kGradientPanel7);
        kGradientPanel7.setLayout(kGradientPanel7Layout);
        kGradientPanel7Layout.setHorizontalGroup(
            kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel7Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InsertProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Product_price, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(Product_name, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Product_id, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(kGradientPanel7Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Product_qty)
                            .addComponent(Product_category, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32)
                .addGroup(kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel7Layout.createSequentialGroup()
                        .addComponent(mPhotoPath, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton8)))
                .addGap(30, 30, 30))
        );
        kGradientPanel7Layout.setVerticalGroup(
            kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel7Layout.createSequentialGroup()
                        .addComponent(InsertProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updateProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel7Layout.createSequentialGroup()
                        .addGroup(kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(kGradientPanel7Layout.createSequentialGroup()
                                .addComponent(Product_id, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Product_name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Product_price, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Product_category, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, kGradientPanel7Layout.createSequentialGroup()
                                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mPhotoPath))
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(Product_qty, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
        );

        kGradientPanel6.add(kGradientPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 920, 320));

        Product.add(kGradientPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 650));

        jPanel2.add(Product, "card7");

        settings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbProduct1.setAutoCreateRowSorter(true);
        tbProduct1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tbProduct1.setFont(new java.awt.Font("Traditional Arabic", 0, 14)); // NOI18N
        tbProduct1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbProduct1.setGridColor(new java.awt.Color(255, 51, 0));
        tbProduct1.setRequestFocusEnabled(false);
        tbProduct1.setRowHeight(22);
        tbProduct1.setSelectionBackground(new java.awt.Color(204, 204, 0));
        tbProduct1.setSelectionForeground(new java.awt.Color(255, 0, 0));
        tbProduct1.setShowGrid(false);
        tbProduct1.setSurrendersFocusOnKeystroke(true);
        tbProduct1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProduct1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbProduct1);

        settings.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 920, 280));

        kGradientPanel8.setkEndColor(new java.awt.Color(204, 0, 0));
        kGradientPanel8.setkGradientFocus(1200);
        kGradientPanel8.setkStartColor(new java.awt.Color(0, 0, 0));

        kGradientPanel9.setkEndColor(new java.awt.Color(102, 0, 102));
        kGradientPanel9.setkStartColor(new java.awt.Color(0, 0, 0));

        jLabel23.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Pro_Id");
        jLabel23.setAlignmentX(5.0F);
        jLabel23.setAlignmentY(1.5F);

        jLabel26.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Name");
        jLabel26.setAlignmentX(5.0F);
        jLabel26.setAlignmentY(1.5F);

        jLabel33.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Price");
        jLabel33.setAlignmentX(5.0F);
        jLabel33.setAlignmentY(1.5F);

        jLabel34.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("qty");
        jLabel34.setAlignmentX(5.0F);
        jLabel34.setAlignmentY(1.5F);

        jLabel37.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Category");
        jLabel37.setAlignmentX(5.0F);
        jLabel37.setAlignmentY(1.5F);

        jTextField13.setBackground(new java.awt.Color(0, 204, 204));
        jTextField13.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(51, 0, 0));
        jTextField13.setAlignmentX(5.0F);
        jTextField13.setAlignmentY(1.5F);
        jTextField13.setBorder(null);
        jTextField13.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        jTextField16.setBackground(new java.awt.Color(0, 204, 204));
        jTextField16.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jTextField16.setForeground(new java.awt.Color(51, 0, 0));
        jTextField16.setAlignmentX(5.0F);
        jTextField16.setAlignmentY(1.5F);
        jTextField16.setBorder(null);

        jTextField17.setBackground(new java.awt.Color(0, 204, 204));
        jTextField17.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jTextField17.setForeground(new java.awt.Color(51, 0, 0));
        jTextField17.setAlignmentX(5.0F);
        jTextField17.setAlignmentY(1.5F);
        jTextField17.setBorder(null);

        jTextField18.setBackground(new java.awt.Color(0, 204, 204));
        jTextField18.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jTextField18.setForeground(new java.awt.Color(51, 0, 0));
        jTextField18.setAlignmentX(5.0F);
        jTextField18.setAlignmentY(1.5F);
        jTextField18.setBorder(null);

        InsertProduct1.setBackground(new java.awt.Color(51, 0, 51));
        InsertProduct1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        InsertProduct1.setText("Insert");
        InsertProduct1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        InsertProduct1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertProduct1ActionPerformed(evt);
            }
        });

        updateProduct1.setBackground(new java.awt.Color(51, 0, 51));
        updateProduct1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        updateProduct1.setText("Update");
        updateProduct1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        updateProduct1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateProduct1ActionPerformed(evt);
            }
        });

        deleteProduct1.setBackground(new java.awt.Color(51, 0, 51));
        deleteProduct1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        deleteProduct1.setText("Delete");
        deleteProduct1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        deleteProduct1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteProduct1ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(51, 0, 51));
        jButton9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton9.setText("Print");
        jButton9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jButton10.setBackground(new java.awt.Color(153, 0, 0));
        jButton10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton10.setText("Select Image");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel38.setBackground(new java.awt.Color(255, 255, 255));
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setMaximumSize(new java.awt.Dimension(220, 200));

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
        );

        jTextField19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField19ActionPerformed(evt);
            }
        });

        jComboBox2.setBackground(new java.awt.Color(0, 204, 204));
        jComboBox2.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Electronic", "Furniture", "Clothes", "Shoes" }));

        javax.swing.GroupLayout kGradientPanel9Layout = new javax.swing.GroupLayout(kGradientPanel9);
        kGradientPanel9.setLayout(kGradientPanel9Layout);
        kGradientPanel9Layout.setHorizontalGroup(
            kGradientPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel9Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(kGradientPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateProduct1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InsertProduct1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteProduct1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(kGradientPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(kGradientPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField18)
                    .addComponent(jTextField17, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField16, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox2, 0, 250, Short.MAX_VALUE))
                .addGap(58, 58, 58)
                .addGroup(kGradientPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton10)
                .addGap(60, 60, 60))
        );
        kGradientPanel9Layout.setVerticalGroup(
            kGradientPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel9Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(kGradientPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel9Layout.createSequentialGroup()
                        .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(kGradientPanel9Layout.createSequentialGroup()
                            .addGroup(kGradientPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(kGradientPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(kGradientPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(kGradientPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(kGradientPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(kGradientPanel9Layout.createSequentialGroup()
                            .addComponent(InsertProduct1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(updateProduct1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(deleteProduct1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout kGradientPanel8Layout = new javax.swing.GroupLayout(kGradientPanel8);
        kGradientPanel8.setLayout(kGradientPanel8Layout);
        kGradientPanel8Layout.setHorizontalGroup(
            kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kGradientPanel8Layout.setVerticalGroup(
            kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel8Layout.createSequentialGroup()
                .addGap(0, 316, Short.MAX_VALUE)
                .addComponent(kGradientPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        settings.add(kGradientPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 650));

        jPanel2.add(settings, "card8");

        track.setBackground(new java.awt.Color(255, 255, 255));
        track.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel15.setkEndColor(new java.awt.Color(102, 0, 102));
        kGradientPanel15.setkStartColor(new java.awt.Color(0, 0, 0));

        updateProduct4.setBackground(new java.awt.Color(51, 0, 51));
        updateProduct4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        updateProduct4.setText("Update");
        updateProduct4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        updateProduct4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateProduct4ActionPerformed(evt);
            }
        });

        deleteProduct4.setBackground(new java.awt.Color(51, 0, 51));
        deleteProduct4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        deleteProduct4.setText("Delete");
        deleteProduct4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        deleteProduct4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteProduct4ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(51, 0, 51));
        jButton15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton15.setText("Print");
        jButton15.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        bill_text_area.setColumns(20);
        bill_text_area.setRows(5);
        jScrollPane7.setViewportView(bill_text_area);

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "PickUp", "IN Transit", "Reached Destinition", "Out for Delivery", "Complated" }));

        lbl_Order_Id.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Order_Id.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        lbl_Order_Id.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Order_Id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Order Id :");

        jLabel6.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Total amount ");

        bill_amount.setFont(new java.awt.Font("Traditional Arabic", 0, 14)); // NOI18N
        bill_amount.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Search_25px_2.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        order_search.setBackground(new java.awt.Color(102, 102, 102));
        order_search.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        order_search.setForeground(new java.awt.Color(204, 204, 204));
        order_search.setText("Search by user_id Or order state");
        order_search.setBorder(null);
        order_search.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                order_searchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                order_searchFocusLost(evt);
            }
        });
        order_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order_searchActionPerformed(evt);
            }
        });
        order_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                order_searchKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel15Layout = new javax.swing.GroupLayout(kGradientPanel15);
        kGradientPanel15.setLayout(kGradientPanel15Layout);
        kGradientPanel15Layout.setHorizontalGroup(
            kGradientPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel15Layout.createSequentialGroup()
                .addGroup(kGradientPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel15Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(kGradientPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel15Layout.createSequentialGroup()
                                .addComponent(updateProduct4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(deleteProduct4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel15Layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel15Layout.createSequentialGroup()
                        .addGroup(kGradientPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, kGradientPanel15Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(order_search))
                            .addGroup(kGradientPanel15Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_Order_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bill_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)))
                .addContainerGap())
        );
        kGradientPanel15Layout.setVerticalGroup(
            kGradientPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(order_search, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(59, 59, 59)
                .addGroup(kGradientPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(lbl_Order_Id, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, kGradientPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(bill_amount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateProduct4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteProduct4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab1", kGradientPanel15);

        track.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 650));

        Table_track.setAutoCreateRowSorter(true);
        Table_track.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Table_track.setFont(new java.awt.Font("Traditional Arabic", 0, 14)); // NOI18N
        Table_track.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Table_track.setGridColor(new java.awt.Color(255, 51, 0));
        Table_track.setRequestFocusEnabled(false);
        Table_track.setRowHeight(22);
        Table_track.setSelectionBackground(new java.awt.Color(204, 204, 0));
        Table_track.setSelectionForeground(new java.awt.Color(255, 0, 0));
        Table_track.setShowGrid(false);
        Table_track.setSurrendersFocusOnKeystroke(true);
        Table_track.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_trackMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(Table_track);

        track.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 461, 650));

        jPanel2.add(track, "card6");

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 39, 920, 650));

        kGradientPanel2.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setkEndColor(new java.awt.Color(0, 0, 0));
        kGradientPanel2.setkGradientFocus(1400);
        kGradientPanel2.setkStartColor(new java.awt.Color(0, 0, 0));

        close_pro.setBackground(new java.awt.Color(0, 0, 0));
        close_pro.setForeground(new java.awt.Color(0, 153, 153));
        close_pro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEnterd(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExit(evt);
            }
        });

        javax.swing.GroupLayout close_proLayout = new javax.swing.GroupLayout(close_pro);
        close_pro.setLayout(close_proLayout);
        close_proLayout.setHorizontalGroup(
            close_proLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(close_proLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        close_proLayout.setVerticalGroup(
            close_proLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        mini_pro.setBackground(new java.awt.Color(0, 0, 0));
        mini_pro.setForeground(new java.awt.Color(0, 153, 153));
        mini_pro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEnterd(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExit(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout mini_proLayout = new javax.swing.GroupLayout(mini_pro);
        mini_pro.setLayout(mini_proLayout);
        mini_proLayout.setHorizontalGroup(
            mini_proLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mini_proLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        mini_proLayout.setVerticalGroup(
            mini_proLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addGap(0, 820, Short.MAX_VALUE)
                .addComponent(mini_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(close_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(close_pro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mini_pro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 920, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//color exit
    private void mouseExit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseExit
        if(evt.getSource()==close_pro) {
            close_pro.setBackground(new Color(0,0,0));
        }
        if(evt.getSource()==mini_pro) {
            mini_pro.setBackground(new Color(0,0,0));
        }
        if(evt.getSource()==btnHome) {
            btnHome.setBackground(new Color(0,0,0));
        }
        if(evt.getSource()==btnEmployee) {
            btnEmployee.setBackground(new Color(0,0,0));
        }
        if(evt.getSource()==btnUser){
            btnUser.setBackground(new Color(0,0,0));
        }
        if(evt.getSource()==btnLogin) {
            btnLogin.setBackground(new Color(0,0,0));
        }
        if(evt.getSource()==btnSettings) {
            btnSettings.setBackground(new Color(0,0,0));
        }
        if(evt.getSource()==btnProduct){
            btnProduct.setBackground(new Color(0,0,0));
        }
        if(evt.getSource()==btnTrack) {
            btnTrack.setBackground(new Color(0,0,0));
        }
       
          if(evt.getSource()==jPanel37) {
            jPanel37.setBackground(new Color(0,0,0));
        }
          if(evt.getSource()==jPanel15) {
            jPanel15.setBackground(new Color(0,0,0));
            
        }
          // if(evt.getSource()==jButton1) {
        //    jButton1.setBackground(new Color(0,0,0));
      //  }
        
    }//GEN-LAST:event_mouseExit
//color enterd
    private void mouseEnterd(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseEnterd
        if(evt.getSource()==close_pro) {
            close_pro.setBackground(new Color(155,102,0));
        }
        if(evt.getSource()==mini_pro) {
            mini_pro.setBackground(new Color(155,102,0));
        }
        if(evt.getSource()==btnEmployee) {
            btnEmployee.setBackground(new Color(155,102,0));
        }
        if(evt.getSource()==btnHome) {
            btnHome.setBackground(new Color(155,102,0));
        }
       
        if(evt.getSource()==btnUser) {
            btnUser.setBackground(new Color(155,102,0));
        }
        if(evt.getSource()==btnLogin) {
            btnLogin.setBackground(new Color(155,102,0));
        }
        if(evt.getSource()==btnProduct){
            btnProduct.setBackground(new Color(155,102,0));
        }
         if(evt.getSource()==btnTrack) {
            btnTrack.setBackground(new Color(155,102,0));
        }
        if(evt.getSource()==btnSettings) {
            btnSettings.setBackground(new Color(155,102,0));
        }
         
          if(evt.getSource()==jPanel37) {
            jPanel37.setBackground(new Color(155,102,0));
        }
           if(evt.getSource()==jPanel15) {
            jPanel15.setBackground(new Color(155,102,0));
        }
          // if(evt.getSource()==jButton1) {
         //   jButton1.setBackground(new Color(0,0,0));
       // }
    }//GEN-LAST:event_mouseEnterd

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       
       int Srow =jTable1.getSelectedRow();
       
       jTextField1.setText(jTable1.getValueAt(Srow, 1).toString());
       jTextField2.setText(jTable1.getValueAt(Srow, 2).toString());
       jTextField3.setText(jTable1.getValueAt(Srow, 3).toString());
       jTextField4.setText(jTable1.getValueAt(Srow, 4).toString());
       jTextField5.setText(jTable1.getValueAt(Srow, 5).toString());
       jTextField6.setText(jTable1.getValueAt(Srow, 6).toString());
       jTextField8.setText(jTable1.getValueAt(Srow, 7).toString());
       
       
       
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int s= JOptionPane.showConfirmDialog(null, "Do you want to Delete","Delete",JOptionPane.YES_NO_OPTION);
        if (s==0) {
            
        
        try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
           String sql = "delete from register where username =?";
           PreparedStatement ps ;
           ps=conn.prepareStatement(sql);
           ps.setString(1,jTextField2.getText());
           ps.executeUpdate();
               
          Displyt1();
         JOptionPane.showMessageDialog(null, "secuss");
         
                   
          } catch (Exception e) { 
              JOptionPane.showMessageDialog(null, e);
          }
      }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertActionPerformed
        try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
           String sql = "insert into register values(?,?,?,?,?,?,?,?)";
           PreparedStatement ps ;
           ps=conn.prepareStatement(sql);
            PreparedStatement ps1=conn.prepareStatement("select max(register_id)+1 from register");
            ResultSet rs1=ps1.executeQuery();
            String id_reg="";
            if(rs1.next()){
                id_reg =rs1.getString(1);
            }
           ps.setString(1, id_reg);
           ps.setString(2, jTextField1.getText());
           ps.setString(3, jTextField2.getText());
           ps.setString(4, jTextField3.getText());
           ps.setString(5, jTextField4.getText());
           ps.setString(6, jTextField5.getText());
           ps.setString(7, jTextField6.getText());
           ps.setString(8, jTextField8.getText());
       
         ps.executeUpdate();
         JOptionPane.showMessageDialog(null, "secuss");
                  Displyt1();
           
          } catch (Exception e) { 
              JOptionPane.showMessageDialog(null, e);
          }
      
     
            
      
    }//GEN-LAST:event_InsertActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
           String sql = "update  register set name=? , password=? , confirmPassword=? , email=? ,  qeuastion=? , answer=? where username ='"+jTextField2.getText()+"' ";
           PreparedStatement ps ;
           ps=conn.prepareStatement(sql);
           ps.setString(1, jTextField1.getText());
          
          
          
           ps.setString(2, jTextField3.getText());
           ps.setString(3, jTextField4.getText());
           ps.setString(4, jTextField5.getText());
           ps.setString(5, jTextField6.getText());
           ps.setString(6, jTextField8.getText());
       
          
                
                ps.executeUpdate();
         Displyt1();
         JOptionPane.showMessageDialog(null, "secuss");
         
           
          } catch (Exception e) { 
              JOptionPane.showMessageDialog(null, e);
          }
      
     
            
    }//GEN-LAST:event_jButton2ActionPerformed

    private void mousePress(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mousePress
         if(evt.getSource()==btnHome){
            employee.setVisible(false);
            user.setVisible(false);
            Login.setVisible(false);
            track.setVisible(false);
            Product.setVisible(false);
            settings.setVisible(false);
            Home.setVisible(true);
        }
        if(evt.getSource()==btnEmployee){
            employee.setVisible(true);
            user.setVisible(false);
            Login.setVisible(false);
            track.setVisible(false);
            Product.setVisible(false);
            settings.setVisible(false);
            Home.setVisible(false);
        }

        if(evt.getSource()==btnUser){
            employee.setVisible(false);
            user.setVisible(true);
            Login.setVisible(false);
            track.setVisible(false);
            Product.setVisible(false);
            settings.setVisible(false);
            Home.setVisible(false);
        }
        if(evt.getSource()==btnLogin){
            employee.setVisible(false);
            user.setVisible(false);
            Login.setVisible(true);
            track.setVisible(false);
            Product.setVisible(false);
            settings.setVisible(false);
            Home.setVisible(false);
        }
        if(evt.getSource()==btnProduct){
            employee.setVisible(false);
            user.setVisible(false);
            Login.setVisible(false);
            track.setVisible(false);
            Product.setVisible(true);
            settings.setVisible(false);
            Home.setVisible(false);
        }
        if(evt.getSource()==btnTrack){
            employee.setVisible(false);
            user.setVisible(false);
            Login.setVisible(false);
            track.setVisible(true);
            Product.setVisible(false);
            settings.setVisible(false);
            Home.setVisible(false);
        }
        if(evt.getSource()==btnSettings){
            employee.setVisible(false);
            user.setVisible(false);
            Login.setVisible(false);
            track.setVisible(false);
            Product.setVisible(false);
            settings.setVisible(true);
            Home.setVisible(false);
        }
                                       
    }//GEN-LAST:event_mousePress

    private void jPanel37MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel37MousePressed
       backgroundcolor();
    }//GEN-LAST:event_jPanel37MousePressed

    private void mPhotoPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mPhotoPathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mPhotoPathActionPerformed
 boolean imageChooser = false;
    String path;
//insert image into database  in display into label
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
           
    
        JFileChooser fc= new JFileChooser();
        FileNameExtensionFilter fnef=new FileNameExtensionFilter("images", "png","jpg","jpeg");
        fc.addChoosableFileFilter(fnef);
        fc.showOpenDialog(null);
        File fl=fc.getSelectedFile();
        filename=fl.getAbsolutePath();
        ImageIcon ii=new ImageIcon(filename);
        Image image=ii.getImage().getScaledInstance(235, 200, java.awt.Image.SCALE_SMOOTH);
        SelectedPhoto.setIcon(ii);
        try {
            
       
            File file= new File(filename);
            FileInputStream fis= new FileInputStream(file);
            ByteArrayOutputStream baos=new ByteArrayOutputStream();
            byte[] buf =new byte[1024];
            for(int readnum;(readnum=fis.read(buf))!=-1;){
            baos.write(buf,0,readnum);

            }
            img=baos.toByteArray();

        } catch (Exception e) {
        }     
       
    }//GEN-LAST:event_jButton8ActionPerformed

    private void deleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteProductActionPerformed
        int s= JOptionPane.showConfirmDialog(null, "Do you want to Delete","Delete",JOptionPane.YES_NO_OPTION);
        if (s==0) {

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
                String sql = "delete from product where Product_id =?";
                PreparedStatement ps ;
                ps=conn.prepareStatement(sql);
                ps.setString(1,Product_id.getText());
                ps.executeUpdate();

                Displyt2();
                JOptionPane.showMessageDialog(null, "secuss");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_deleteProductActionPerformed

    private void updateProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateProductActionPerformed
     try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "update  product set product_name=? , product_price=?  ,product_category=? , product_img=? where product_id ='"+Product_id.getText()+"' ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);

            ps.setString(1, Product_name.getText());
            ps.setString(2, Product_price.getText());
           
            ps.setString(3, Product_category.getSelectedItem().toString());
            ps.setBytes(4,img);

            ps.executeUpdate();
            Home.home h= new Home.home();

            Displyt2();
            JOptionPane.showMessageDialog(null, "secuss");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_updateProductActionPerformed

    private void InsertProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertProductActionPerformed

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "insert into product values(?,?,?,?,?)";
            PreparedStatement ps1=conn.prepareStatement("select max(Product_id)+1 from product");
            ResultSet rs1=ps1.executeQuery();
            String id_no="";
            if(rs1.next()){
                id_no =rs1.getString(1);
            }
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ps.setString(1, id_no); 
            ps.setString(2, Product_name.getText());
            ps.setString(3, Product_price.getText());
            ps.setString(4, Product_category.getSelectedItem().toString());
            ps.setBytes(5,img);

            ps.executeUpdate();

            Displyt2();
            JOptionPane.showMessageDialog(null, "secuss");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_InsertProductActionPerformed

    private void tbProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProductMouseClicked

        int Srow =tbProduct.getSelectedRow();
        
      Product_id.setText(tbProduct.getValueAt(Srow, 0).toString());
      Product_name.setText(tbProduct.getValueAt(Srow, 1).toString());
      Product_price.setText(tbProduct.getValueAt(Srow, 2).toString());
       
      Product_category.setSelectedItem(tbProduct.getValueAt(Srow, 3).toString());

        byte[] byteArray = (byte[]) tbProduct.getValueAt(Srow, 4);
        if (tbProduct.getValueAt(Srow,4) ==null) {
            SelectedPhoto.setText("No image");
            SelectedPhoto.setIcon(null);
        }else{
            try (ByteArrayInputStream bais = new ByteArrayInputStream(byteArray)) {
                BufferedImage bImg = ImageIO.read(bais);
                ImageIcon icon = new ImageIcon(bImg);
                SelectedPhoto.setIcon(icon);
                SelectedPhoto.setText("");
                mPhotoPath.setText(filename);
            } catch (IOException ex) {

            }
        }

    }//GEN-LAST:event_tbProductMouseClicked

    private void tbProduct2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProduct2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbProduct2MouseClicked

    private void InsertProduct2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertProduct2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InsertProduct2ActionPerformed

    private void updateProduct2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateProduct2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateProduct2ActionPerformed

    private void deleteProduct2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteProduct2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteProduct2ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jTextField24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField24ActionPerformed

    private void InsertProduct3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertProduct3ActionPerformed
 try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
           String sql = "insert into employeeDB values(?,?,?,?,?,?,?)";
           PreparedStatement ps ;
           ps=conn.prepareStatement(sql);
            PreparedStatement ps1=conn.prepareStatement("select max(employeeDB_id)+1 from employeeDB");
            ResultSet rs1=ps1.executeQuery();
            String employeeDB_id="";
            if(rs1.next()){
               employeeDB_id =rs1.getString(1);
            }
            if (employee_id.getText().isEmpty()) {
           ps.setString(1, employeeDB_id);
            }else{
           ps.setString(1, employee_id.getText());
            }
            
           ps.setString(2, employee_Name.getText());
           ps.setString(3, employee_Username.getText());
           ps.setString(4, employee_Password.getText());
           ps.setString(5, employee_Phone.getText());
           ps.setString(6, employee_Email.getText());
           ps.setString(7, employee_Address.getText());
       
         ps.executeUpdate();
         JOptionPane.showMessageDialog(null, "secuss");
                  employee_table();
           
          } catch (Exception e) { 
              JOptionPane.showMessageDialog(null, e);
          }
              
    }//GEN-LAST:event_InsertProduct3ActionPerformed

    private void updateProduct3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateProduct3ActionPerformed
       try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "update  employeeDB set employeeDB_username=?,employeeDB_name=? , employeeDB_password=?  ,employeeDB_phone=?, employeeDB_email=?,employeeDB_address=? where employeeDB_id='"+employee_id.getText()+"' ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);

           ps.setString(1, employee_Name.getText());
           ps.setString(2, employee_Username.getText());
           ps.setString(3, employee_Password.getText());
           ps.setString(4, employee_Phone.getText());
           ps.setString(5, employee_Email.getText());
           ps.setString(6, employee_Address.getText());
       
            ps.executeUpdate();
            Home.home h= new Home.home();

           employee_table();
            JOptionPane.showMessageDialog(null, "secuss");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_updateProduct3ActionPerformed

    private void deleteProduct3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteProduct3ActionPerformed
 int s= JOptionPane.showConfirmDialog(null, "Do you want to Delete","Delete",JOptionPane.YES_NO_OPTION);
        if (s==0) {
            
        
        try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
           String sql = "delete from employeedb where employeedb_id =?";
           PreparedStatement ps ;
           ps=conn.prepareStatement(sql);
           ps.setString(1,employee_id.getText());
           ps.executeUpdate();
               
           
         JOptionPane.showMessageDialog(null, "secuss");
         employee_table();
                   
          } catch (Exception e) { 
              JOptionPane.showMessageDialog(null, e);
          }
      }
    }//GEN-LAST:event_deleteProduct3ActionPerformed

    private void employeeDB_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeDB_tableMouseClicked
         int row=employeeDB_table.getSelectedRow();
     employee_id.setText(employeeDB_table.getValueAt(row, 0).toString());
       employee_Name.setText(employeeDB_table.getValueAt(row, 1).toString());
       employee_Username.setText(employeeDB_table.getValueAt(row, 2).toString());
       employee_Password.setText(employeeDB_table.getValueAt(row, 3).toString());
         employee_Phone.setText(employeeDB_table.getValueAt(row, 4).toString());
           employee_Email.setText(employeeDB_table.getValueAt(row, 5).toString());
             employee_Address.setText(employeeDB_table.getValueAt(row, 6).toString());
    }//GEN-LAST:event_employeeDB_tableMouseClicked

    private void Table_trackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_trackMouseClicked
      int row=Table_track.getSelectedRow();
      bill_text_area.setText(Table_track.getValueAt(row, 3).toString());
       lbl_Order_Id.setText(Table_track.getValueAt(row, 0).toString());
       jComboBox1.setSelectedItem(Table_track.getValueAt(row, 7).toString());
       bill_amount.setText(Table_track.getValueAt(row, 5).toString());
    }//GEN-LAST:event_Table_trackMouseClicked

    private void jLabel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MousePressed
        jLabel10.setVisible(false);
        jLabel10.setEnabled(false);
        jLabel8.setVisible(true);
        jLabel8.setEnabled(true);
        jPanel36.setVisible(false);
        jPanel36.setEnabled(false);
    }//GEN-LAST:event_jLabel10MousePressed

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
        ImageIcon ii = new ImageIcon(getClass().getResource("/img/G12-Load-Up-icon.png"));
        jLabel10.setIcon(ii);
        jLabel10.setVisible(true);
        jLabel10.setEnabled(true);
        jLabel8.setVisible(false);
        jLabel8.setEnabled(false);
        jPanel36.setVisible(true);
        jPanel36.setEnabled(true);
    }//GEN-LAST:event_jLabel8MousePressed

    private void jTextField19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField19ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void deleteProduct1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteProduct1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteProduct1ActionPerformed

    private void updateProduct1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateProduct1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateProduct1ActionPerformed

    private void InsertProduct1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertProduct1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InsertProduct1ActionPerformed

    private void tbProduct1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProduct1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbProduct1MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Displyt1();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from register  where register_id=?";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ps.setString(1, jTextField15.getText());

            ResultSet rs= ps.executeQuery();

            if (rs.next()) {
                rs= ps.executeQuery();

                jTable1.setModel(DbUtils.resultSetToTableModel(rs));

            }else{

                JOptionPane.showMessageDialog(null, "Product ID Not Exits");

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField15KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField15KeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
                String sql = "select * from register  where register_id=?";
                PreparedStatement ps ;
                ps=conn.prepareStatement(sql);
                ps.setString(1, jTextField15.getText());

                ResultSet rs= ps.executeQuery();

                if (rs.next()) {
                    rs= ps.executeQuery();

                    jTable1.setModel(DbUtils.resultSetToTableModel(rs));

                }else{

                    JOptionPane.showMessageDialog(null, "Product ID Not Exits");

                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jTextField15KeyPressed

    private void jTextField15FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField15FocusLost
        if (jTextField15.getText().equals("")) {
            jTextField15.setText("Search");
            jTextField15.setForeground(new Color(153,153,153));

        }
    }//GEN-LAST:event_jTextField15FocusLost

    private void jTextField15FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField15FocusGained
        if (jTextField15.getText().equals("Search")) {
            jTextField15.setText("");
            jTextField15.setForeground(new Color(255,255,255));

        }
    }//GEN-LAST:event_jTextField15FocusGained

    private void jTextField37FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField37FocusGained
        if (jTextField37.getText().equals("Search")) {
            jTextField37.setText("");
            jTextField37.setForeground(new Color(255,255,255));

        }
    }//GEN-LAST:event_jTextField37FocusGained

    private void jTextField37FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField37FocusLost
        if (jTextField37.getText().equals("")) {
            jTextField37.setText("Search");
            jTextField37.setForeground(new Color(153,153,153));

        }
    }//GEN-LAST:event_jTextField37FocusLost

    private void jTextField37KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField37KeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
                String sql = "select * from register  where register_id=?";
                PreparedStatement ps ;
                ps=conn.prepareStatement(sql);
                ps.setString(1, jTextField15.getText());

                ResultSet rs= ps.executeQuery();

                if (rs.next()) {
                    rs= ps.executeQuery();

                    jTable1.setModel(DbUtils.resultSetToTableModel(rs));

                }else{

                    JOptionPane.showMessageDialog(null, "Product ID Not Exits");

                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jTextField37KeyPressed

    private void jButton17mouseEnterd(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton17mouseEnterd
        if(evt.getSource()==close_pro) {
            close_pro.setBackground(new Color(155,102,0));
        }
        if(evt.getSource()==mini_pro) {
            mini_pro.setBackground(new Color(155,102,0));
        }
        if(evt.getSource()==btnEmployee) {
            btnEmployee.setBackground(new Color(155,102,0));
        }
        if(evt.getSource()==btnHome) {
            btnHome.setBackground(new Color(155,102,0));
        }

        if(evt.getSource()==btnUser) {
            btnUser.setBackground(new Color(155,102,0));
        }
        if(evt.getSource()==btnLogin) {
            btnLogin.setBackground(new Color(155,102,0));
        }
        if(evt.getSource()==btnProduct){
            btnProduct.setBackground(new Color(155,102,0));
        }
        if(evt.getSource()==btnTrack) {
            btnTrack.setBackground(new Color(155,102,0));
        }
        if(evt.getSource()==btnSettings) {
            btnSettings.setBackground(new Color(155,102,0));
        }

        if(evt.getSource()==jPanel37) {
            jPanel37.setBackground(new Color(155,102,0));
        }
        if(evt.getSource()==jPanel15) {
            jPanel15.setBackground(new Color(155,102,0));
        }
        if(evt.getSource()==jButton1) {
            jButton1.setBackground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jButton17mouseEnterd

    private void jButton17mouseExit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton17mouseExit
        if(evt.getSource()==close_pro) {
            close_pro.setBackground(new Color(0,0,0));
        }
        if(evt.getSource()==mini_pro) {
            mini_pro.setBackground(new Color(0,0,0));
        }
        if(evt.getSource()==btnHome) {
            btnHome.setBackground(new Color(0,0,0));
        }
        if(evt.getSource()==btnEmployee) {
            btnEmployee.setBackground(new Color(0,0,0));
        }
        if(evt.getSource()==btnUser){
            btnUser.setBackground(new Color(0,0,0));
        }
        if(evt.getSource()==btnLogin) {
            btnLogin.setBackground(new Color(0,0,0));
        }
        if(evt.getSource()==btnSettings) {
            btnSettings.setBackground(new Color(0,0,0));
        }
        if(evt.getSource()==btnProduct){
            btnProduct.setBackground(new Color(0,0,0));
        }
        if(evt.getSource()==btnTrack) {
            btnTrack.setBackground(new Color(0,0,0));
        }

        if(evt.getSource()==jPanel37) {
            jPanel37.setBackground(new Color(0,0,0));
        }
        if(evt.getSource()==jPanel15) {
            jPanel15.setBackground(new Color(0,0,0));

        }
        if(evt.getSource()==jButton1) {
            jButton1.setBackground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jButton17mouseExit

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from register  where register_id=?";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ps.setString(1, jTextField15.getText());

            ResultSet rs= ps.executeQuery();

            if (rs.next()) {
                rs= ps.executeQuery();

                jTable1.setModel(DbUtils.resultSetToTableModel(rs));

            }else{

                JOptionPane.showMessageDialog(null, "Product ID Not Exits");

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jLabel62MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel62MouseClicked
        Displyt1();
    }//GEN-LAST:event_jLabel62MouseClicked

    private void jLabel36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseClicked
LoginForm lg= new LoginForm();
lg.setVisible(true);
this.dispose();
    }//GEN-LAST:event_jLabel36MouseClicked

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void deleteProduct4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteProduct4ActionPerformed
       int s= JOptionPane.showConfirmDialog(null, "Do you want to Delete","Delete",JOptionPane.YES_NO_OPTION);
        if (s==0) {
            
        
        try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
           String sql = "delete from trackdb where order_id =?";
           PreparedStatement ps ;
           ps=conn.prepareStatement(sql);
           ps.setString(1,lbl_Order_Id.getText());
           ps.executeUpdate();
               
          Displyt1();
         JOptionPane.showMessageDialog(null, "secuss");
         
                   
          } catch (Exception e) { 
              JOptionPane.showMessageDialog(null, e);
          }
      }
    }//GEN-LAST:event_deleteProduct4ActionPerformed

    private void updateProduct4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateProduct4ActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "update  trackdb set order_state=? where order_id ='"+lbl_Order_Id.getText()+"' ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
      
            ps.setString(1, jComboBox1.getSelectedItem().toString());
            ps.executeUpdate();
           

            TableTrack();
            JOptionPane.showMessageDialog(null, "secuss");
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_updateProduct4ActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
       search_in_orders();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void order_searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_order_searchKeyPressed
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
           search_in_orders();
        }
    }//GEN-LAST:event_order_searchKeyPressed

    private void order_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_order_searchActionPerformed

    private void order_searchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_order_searchFocusLost
      order_search.setText("Search by user_id Or order");
    }//GEN-LAST:event_order_searchFocusLost

    private void order_searchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_order_searchFocusGained
      order_search.setText("");
    }//GEN-LAST:event_order_searchFocusGained

    private void employee_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employee_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employee_EmailActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Home;
    private javax.swing.JButton Insert;
    private javax.swing.JButton InsertProduct;
    private javax.swing.JButton InsertProduct1;
    private javax.swing.JButton InsertProduct2;
    private javax.swing.JButton InsertProduct3;
    private javax.swing.JPanel Login;
    private javax.swing.JPanel Product;
    private javax.swing.JComboBox<String> Product_category;
    private javax.swing.JTextField Product_id;
    private javax.swing.JTextField Product_name;
    private javax.swing.JTextField Product_price;
    private javax.swing.JTextField Product_qty;
    private javax.swing.JLabel SelectedPhoto;
    private javax.swing.JTable Table_track;
    private javax.swing.JLabel bill_amount;
    private javax.swing.JTextArea bill_text_area;
    private javax.swing.JLabel btnEmploye;
    private javax.swing.JPanel btnEmployee;
    private javax.swing.JPanel btnHome;
    private javax.swing.JPanel btnLogin;
    private javax.swing.JPanel btnProduct;
    private javax.swing.JPanel btnSettings;
    private javax.swing.JPanel btnTrack;
    private javax.swing.JPanel btnUser;
    private javax.swing.JPanel close_pro;
    private javax.swing.JButton deleteProduct;
    private javax.swing.JButton deleteProduct1;
    private javax.swing.JButton deleteProduct2;
    private javax.swing.JButton deleteProduct3;
    private javax.swing.JButton deleteProduct4;
    private javax.swing.JPanel employee;
    private javax.swing.JTable employeeDB_table;
    private javax.swing.JTextField employee_Address;
    private javax.swing.JTextField employee_Email;
    private javax.swing.JTextField employee_Name;
    private javax.swing.JTextField employee_Password;
    private javax.swing.JTextField employee_Phone;
    private javax.swing.JTextField employee_Username;
    private javax.swing.JTextField employee_id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel10;
    private keeptoo.KGradientPanel kGradientPanel11;
    private keeptoo.KGradientPanel kGradientPanel12;
    private keeptoo.KGradientPanel kGradientPanel13;
    private keeptoo.KGradientPanel kGradientPanel15;
    private keeptoo.KGradientPanel kGradientPanel18;
    private keeptoo.KGradientPanel kGradientPanel2;
    private keeptoo.KGradientPanel kGradientPanel3;
    private keeptoo.KGradientPanel kGradientPanel4;
    private keeptoo.KGradientPanel kGradientPanel5;
    private keeptoo.KGradientPanel kGradientPanel6;
    private keeptoo.KGradientPanel kGradientPanel7;
    private keeptoo.KGradientPanel kGradientPanel8;
    private keeptoo.KGradientPanel kGradientPanel9;
    private javax.swing.JLabel lbl_Order_Id;
    private javax.swing.JTextField mPhotoPath;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel mini_pro;
    private javax.swing.JTextField order_search;
    private javax.swing.JPanel settings;
    private javax.swing.JTable tbProduct;
    private javax.swing.JTable tbProduct1;
    private javax.swing.JTable tbProduct2;
    private javax.swing.JPanel track;
    private javax.swing.JButton updateProduct;
    private javax.swing.JButton updateProduct1;
    private javax.swing.JButton updateProduct2;
    private javax.swing.JButton updateProduct3;
    private javax.swing.JButton updateProduct4;
    private javax.swing.JPanel user;
    // End of variables declaration//GEN-END:variables
byte[] img =null;
String filename=null;
}
