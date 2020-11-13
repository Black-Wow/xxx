/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Home;

import AppPackage.AnimationClass;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author abdullah
 */
public class home extends javax.swing.JFrame {
    AnimationClass ac =new AnimationClass();
    
    /**
     * Creates new form home
     */
    public home() {
        
        
       slidershow();
        
      initComponents();
        jPanel4.setSize(400,600);
       
        jTextField1.setBackground(new Color(0,0,0,2));
         MenuBar.setSize(200,800);
        
         jPanel9.setBackground(new Color(0,0,0,50));
      
         pnHome.setBackground(new Color(0,0,0,0));
         pnFurniture.setBackground(new Color(0,0,0,0));
         pnClothes.setBackground(new Color(0,0,0,0));
         pnShoes.setBackground(new Color(0,0,0,0));
         pnHelp.setBackground(new Color(0,0,0,0));
         pnCart.setBackground(new Color(0,0,0,0));
         PnElectronic.setBackground(new Color(0,0,0,0));
       
          pn_add_card.setVisible(false);
          Product_Info.setVisible(false);
         slidershow1();
        item1();
        item2();
        item3();
        item4();
        item5();
        item6();
        item7();
        item8();
        item9();
        item10();
        item11();
        item12();
        F_item1(); 
        F_item2();
        F_item3();
        F_item4();
        F_item5();
        F_item6();
        F_item7();
        F_item8();
        F_item9();
        F_item10();
        F_item11();
        F_item12();
        C_item1();
        C_item2();
        C_item3();
        C_item4();
        C_item5();
        C_item6();
        C_item7();
        C_item8();
        C_item9();
        C_item10();
        C_item11();
        C_item12();
        G_item1();
        G_item2();
        G_item3();
        G_item4();
        G_item5();
        G_item6();
        G_item7();
        G_item9();
        G_item10();
        G_item11();
        G_item12();
        
     Displyt1();  
     TableTrack();
                                  
    }
        public void sp1(){
           new Thread() {
           @Override
           public void run() { 
               try {
                   
                  if(jTextField2.getText().equals("Pending")) {
               for (int i = 0; i < 1; i++) {
                   Thread.sleep(2);
                   filler1.setSize(i,2);
                   } 
                  }
                  
                   if(jTextField2.getText().equals("IN Transit")) { 
               for (int i = 0; i < 130; i++) {
                   Thread.sleep(2);
                   filler1.setSize(i,2);
                   }  
                   }
                   
                   if(jTextField2.getText().equals("Reached Destinition")) {
               for (int i = 130; i < 265; i++) {
                   Thread.sleep(2);
                   filler1.setSize(i,2);
                   }  
                  }
                   
                   if(jTextField2.getText().equals("Out for Delivery")) {
               for (int i = 265; i < 400; i++) {
                   Thread.sleep(2);
                   filler1.setSize(i,2);
                   }  
                }
                   if(jTextField2.getText().equals("Complated")) {
               for (int i = 400; i < 530; i++) {
                   Thread.sleep(2);
                   filler1.setSize(i,2);
                   }  
                }
               } catch (Exception e) {
               }
           }
       }.start();      
    } 
     
  
       
   
   
     
    
    
    public void sss(){
         if(jTextField2.getText().equals("Pending")){
           jPanel61.setBackground(Color.green);
           jPanel62.setBackground(Color.WHITE);
             jPanel63.setBackground(Color.WHITE);  
             jPanel64.setBackground(Color.WHITE);
               jPanel65.setBackground(Color.WHITE);
              
              sp1();
       }
         
 
        
        
        if(jTextField2.getText().equals("IN Transit")){
           jPanel61.setBackground(Color.green);
           jPanel62.setBackground(Color.GREEN);
             jPanel63.setBackground(Color.WHITE);  
             jPanel64.setBackground(Color.WHITE);
             jPanel65.setBackground(Color.WHITE);
             sp1();
                     }
        if(jTextField2.getText().equals("Reached Destinition")){
          jPanel61.setBackground(Color.green);
           jPanel62.setBackground(Color.GREEN);
             jPanel63.setBackground(Color.GREEN);  
             jPanel64.setBackground(Color.WHITE);
             jPanel65.setBackground(Color.WHITE);
           sp1();
        }
        if(jTextField2.getText().equals("Out for Delivery")){
           jPanel1.setBackground(Color.GREEN);
           jPanel2.setBackground(Color.GREEN);
             jPanel3.setBackground(Color.GREEN);  
             jPanel4.setBackground(Color.GREEN);
               jPanel5.setBackground(Color.WHITE);
               sp1();
        }
        if(jTextField2.getText().equals("Complated")){
           jPanel1.setBackground(Color.green);
           jPanel2.setBackground(Color.GREEN);
             jPanel3.setBackground(Color.GREEN);  
             jPanel4.setBackground(Color.GREEN);
            jPanel5.setBackground(Color.GREEN);
            sp1();
        }
        
    }
  
    
   public void TableTrack(){ 
              
             
          try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
           String sql="SELECT \n" +
"trackdb.order_id,\n" +
"register.name,\n" +
"trackdb.Order_details,\n" +
"trackdb.order_total,\n" +
"trackdb.order_state\n" +
"from register\n" +
"inner join trackdb\n" +
"ON register.register_id=trackdb.user_id where user_id ='"+ User_id.getText()+"'";
            PreparedStatement ps ; 
           ps=conn.prepareStatement(sql);
           ResultSet rs =ps.executeQuery();
           order_table_details.setModel(DbUtils.resultSetToTableModel(rs)); 
           
          } catch (Exception e) { 
              JOptionPane.showMessageDialog(null, e);
          }
      
     
            
      }
    public void track(){
              try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
          
           String s1="select * from trackdb where user_id=?";
           PreparedStatement ps ;
           ps=conn.prepareStatement(s1);
                
                  ps.setString(1, jTextField1.getText());
              ResultSet rs =ps.executeQuery();
                  if (rs.next()==false) {
                      
                  }else{
                String s =  rs.getString("order_state");
                  
                     
                      Payment_mhthod_rv.setText(s);
                  }
                  
                
           
          } catch (Exception e) { 
              JOptionPane.showMessageDialog(null, e);
          }
    
    }
    public void Displyt1(){ 
              
             
          try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
           String sql="select * from addressdb where  user_id=?";
           PreparedStatement ps ;
           ps=conn.prepareStatement(sql);
           ps.setString(1, User_id.getText());
           ResultSet rs =ps.executeQuery();
           jTable1.setModel(DbUtils.resultSetToTableModel(rs)); 
           
          } catch (Exception e) { 
              JOptionPane.showMessageDialog(null, e);
          }
      
     
            
      }
  

    public void Adress(){
        txt_Area_For_Address1.getWrapStyleWord();
        txt_Area_For_Address1.getLineWrap();
         txt_Area_For_Address1.setText(txt_Area_For_Address1.getText() +txt_Adrs_Name.getText()+ "\n  " + txt_Adrs_House_Street.getText()+ ",  " +txt_Adrs_City.getText()+ ", "+txt_Adrs_State.getText()+", " +txt_Adrs_Pin.getText() + " \n "+txt_Adrs_Country.getText()+" \n Phone: "+txt_Adrs_Phone.getText()+"");
    }
    
    
 public void bill20(){
    DefaultTableModel model = new DefaultTableModel(); 
        model = (DefaultTableModel)Cart_Table.getModel(); 
           Text_Area_For_Bill.setText(Text_Area_For_Bill.getText()+"*******************************************************************************************************************\n");
           Text_Area_For_Bill.setText(Text_Area_For_Bill.getText()+"                                                          PosBill                                                  \n");
           Text_Area_For_Bill.setText(Text_Area_For_Bill.getText()+"*******************************************************************************************************************\n\n\n");
           Text_Area_For_Bill.setText(Text_Area_For_Bill.getText() +"Item name"+ "             			       " + "   Quantity \t" + "            price "+ "	        amount" +"\n");
           Text_Area_For_Bill.setText(Text_Area_For_Bill.getText()+"-------------------------------------------------------------------------------------------------------------------\n");
         
         for(int i = 0 ; i<model.getRowCount() ;i++)
        {
            String item_name1 =(String)model.getValueAt(i, 1);
             String item_price =(String)model.getValueAt(i, 2);
            String item_quntity =(String)model.getValueAt(i, 3);
            String total_ammount =(String)model.getValueAt(i, 4);
            
            
                                                        
            Text_Area_For_Bill.setText(Text_Area_For_Bill.getText()+"\n\n");
            Text_Area_For_Bill.setText(Text_Area_For_Bill.getText() + item_name1+ "             			" + item_quntity+ "    	     " +item_price+ "	     "+total_ammount + "");
             
        }
          
        String total = total_tot.getText(); 
        Text_Area_For_Bill.setText(Text_Area_For_Bill.getText() +"                                        \n");
         Text_Area_For_Bill.setText(Text_Area_For_Bill.getText()+"\n-------------------------------------------------------------------------------------------------------------------\n");
        
         Text_Area_For_Bill.setText(Text_Area_For_Bill.getText()+"----------------------------------------- Total Ammount : ----------------------------------------------------\n\n");
          
         
          
         
         Text_Area_For_Bill.setText(Text_Area_For_Bill.getText()+"-------------------------------------------"+total +"-----------------------------------------------------------------\n");
 }
 
 
 
 
 
 
 
 
 
 
 
 
       
    
    
    byte b[] = null;
    public void item1(){
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=1 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
           
            ResultSet rs =  ps.executeQuery();       
              if (rs.next() ==false) {
                   JOptionPane.showMessageDialog(null, "Not found"); 
              }else{
                  String item_n=rs.getString("Product_name");
                    String item_p=rs.getString("Product_price");
                    b= rs.getBytes("Product_img");
                   
                  item1_name.setText(item_n);
                  item1_price.setText(item_p);
                  item1_img.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b)));
                  
                          
              } 

        } catch (Exception e) {
            
        } 
          
    }
    
   public void item2(){
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=2 ";
           
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
           
            ResultSet rs =  ps.executeQuery();

              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{
                  String item_n=rs.getString("Product_name");
                   String item_p=rs.getString("Product_price");
                    b= rs.getBytes("Product_img");
                  item2_name.setText(item_n);
                  item2_price.setText(item_p);
                   item2_img.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b)));
                  
                          
              } 

        } catch (Exception e) {
            
        } 
          
    }

    public void item3(){
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=3  ";
           
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
           
            ResultSet rs =  ps.executeQuery();

              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{
                  String item_n=rs.getString("Product_name");
                    String item_p=rs.getString("Product_price");
                    b= rs.getBytes("Product_img");
                  item3_name.setText(item_n);
                  item3_price.setText(item_p);
                   item3_img.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b)));
                  
                          
              } 

        } catch (Exception e) {
            
        } 
          
    }

     public void item4(){
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=4  ";
           
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
           
            ResultSet rs =  ps.executeQuery();

              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{
                  String item_n=rs.getString("Product_name");
                    String item_p=rs.getString("Product_price");
                    b= rs.getBytes("Product_img");
                  item4_name.setText(item_n);
                  item4_price.setText(item_p);
                   item4_img.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b)));
                  
                          
              } 

        } catch (Exception e) {
            
        } 
          
    }

       public void item5(){
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=5 ";
           
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
           
            ResultSet rs =  ps.executeQuery();

              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{
                  String item_n=rs.getString("Product_name");
                    String item_p=rs.getString("Product_price");
                    b= rs.getBytes("Product_img");
                  item5_name.setText(item_n);
                  item5_price.setText(item_p);
                   item5_img.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b)));
                  
                          
              } 

        } catch (Exception e) {
            
        } 
          
    }

       public void item6(){
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=6  ";
           
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
           
            ResultSet rs =  ps.executeQuery();

              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{
                  String item_n=rs.getString("Product_name");
                    String item_p=rs.getString("Product_price");
                    b= rs.getBytes("Product_img");
                  item6_name.setText(item_n);
                  item6_price.setText(item_p);
                   item6_img.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b)));
                  
                          
              } 

        } catch (Exception e) {
            
        }    
          
    }
       public void item7(){
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=7  ";
           
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
           
            ResultSet rs =  ps.executeQuery();

              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{
                  String item_n=rs.getString("Product_name");
                    String item_p=rs.getString("Product_price");
                    b= rs.getBytes("Product_img");
                  item7_name.setText(item_n);
                  item7_price.setText(item_p);
                   item7_img.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b)));
                  
                          
              } 

        } catch (Exception e) {
            
        } 
          
          
    }
       public void item8(){
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=8 ";
           
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
           
            ResultSet rs =  ps.executeQuery();

              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{
                  String item_n=rs.getString("Product_name");
                    String item_p=rs.getString("Product_price");
                    b= rs.getBytes("Product_img");
                  item8_name.setText(item_n);
                  item8_price.setText(item_p);
                   item8_img.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b)));
                  
                          
              } 

        } catch (Exception e) {
            
        } 
          
          
    }
        public void item9(){
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=9 ";
           
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
           
            ResultSet rs =  ps.executeQuery();

              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{
                  String item_n=rs.getString("Product_name");
                    String item_p=rs.getString("Product_price");
                    b= rs.getBytes("Product_img");
                  item9_name.setText(item_n);
                  item9_price.setText(item_p);
                   item9_img.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b)));
                  
                          
              } 

        } catch (Exception e) {
            
        } 
          
          
    }
         public void item10(){
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=10 ";
           
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
           
            ResultSet rs =  ps.executeQuery();

              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{
                  String item_n=rs.getString("Product_name");
                    String item_p=rs.getString("Product_price");
                    b= rs.getBytes("Product_img");
                  item10_name.setText(item_n);
                  item10_price.setText(item_p);
                   item10_img.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b)));
                  
                          
              } 

        } catch (Exception e) {
            
        } 
          
          
    }
          public void item11(){
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=11 ";
           
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
           
            ResultSet rs =  ps.executeQuery();

              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{
                  String item_n=rs.getString("Product_name");
                    String item_p=rs.getString("Product_price");
                    b= rs.getBytes("Product_img");
                  item11_name.setText(item_n);
                  item11_price.setText(item_p);
                   item11_img.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b)));
                  
                          
              } 

        } catch (Exception e) {
            
        } 
          
          
    }
         public void item12(){
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=12 ";
           
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
           
            ResultSet rs =  ps.executeQuery();

              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{
                  String item_n=rs.getString("Product_name");
                    String item_p=rs.getString("Product_price");
                    b= rs.getBytes("Product_img");
                  item12_name.setText(item_n);
                  item12_price.setText(item_p);
                   item12_img.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b)));
                  
                          
              } 

        } catch (Exception e) {
            
        } 
          
          
    }

    /// this is furniture items 
         //important
           
            public void F_item1(){
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=13 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
           
            ResultSet rs =  ps.executeQuery();       
              if (rs.next() ==false) {
                   JOptionPane.showMessageDialog(null, "Not found"); 
              }else{
                  String item_n=rs.getString("Product_name");
                    String item_p=rs.getString("Product_price");
                    b= rs.getBytes("Product_img");
                   
                  item1_name1.setText(item_n);
                  item1_price1.setText(item_p);
                  item1_img1.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b)));
                  
                          
              } 

        } catch (Exception e) {
            
        } 
          
    }
             public void  F_item2(){
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=14";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
           
            ResultSet rs =  ps.executeQuery();       
              if (rs.next() ==false) {
                   JOptionPane.showMessageDialog(null, "Not found"); 
              }else{
                  String item_n=rs.getString("Product_name");
                    String item_p=rs.getString("Product_price");
                    b= rs.getBytes("Product_img");
                   
                  item2_name1.setText(item_n);
                  item2_price1.setText(item_p);
                  item2_img1.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b)));
                  
                          
              } 

        } catch (Exception e) {
            
        } 
          
    }
              public void F_item3(){
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=15 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
           
            ResultSet rs =  ps.executeQuery();       
              if (rs.next() ==false) {
                   JOptionPane.showMessageDialog(null, "Not found"); 
              }else{
                  String item_n=rs.getString("Product_name");
                    String item_p=rs.getString("Product_price");
                    b= rs.getBytes("Product_img");
                   
                  item3_name1.setText(item_n);
                  item3_price1.setText(item_p);
                  item3_img1.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b)));
                  
                          
              } 

        } catch (Exception e) {
            
        } 
          
    }
               public void F_item4(){
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=16 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
           
            ResultSet rs =  ps.executeQuery();       
              if (rs.next() ==false) {
                   JOptionPane.showMessageDialog(null, "Not found"); 
              }else{
                  String item_n=rs.getString("Product_name");
                    String item_p=rs.getString("Product_price");
                    b= rs.getBytes("Product_img");
                   
                  item4_name1.setText(item_n);
                  item4_price1.setText(item_p);
                  item4_img1.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b)));
                  
                          
              } 

        } catch (Exception e) {
            
        } 
          
    }
                public void F_item5(){
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=17 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
           
            ResultSet rs =  ps.executeQuery();       
              if (rs.next() ==false) {
                   JOptionPane.showMessageDialog(null, "Not found"); 
              }else{
                  String item_n=rs.getString("Product_name");
                    String item_p=rs.getString("Product_price");
                    b= rs.getBytes("Product_img");
                   
                  item5_name1.setText(item_n);
                  item5_price1.setText(item_p);
                  item5_img1.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b)));
                  
                          
              } 

        } catch (Exception e) {
            
        } 
          
    }
                 public void F_item6(){
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=18 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
           
            ResultSet rs =  ps.executeQuery();       
              if (rs.next() ==false) {
                   JOptionPane.showMessageDialog(null, "Not found"); 
              }else{
                  String item_n=rs.getString("Product_name");
                    String item_p=rs.getString("Product_price");
                    b= rs.getBytes("Product_img");
                   
                  item6_name1.setText(item_n);
                  item6_price1.setText(item_p);
                  item6_img1.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b)));
                  
                          
              } 

        } catch (Exception e) {
            
        } 
          
    } public void F_item7(){
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=19 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
           
            ResultSet rs =  ps.executeQuery();       
              if (rs.next() ==false) {
                   JOptionPane.showMessageDialog(null, "Not found"); 
              }else{
                  String item_n=rs.getString("Product_name");
                    String item_p=rs.getString("Product_price");
                    b= rs.getBytes("Product_img");
                   
                  item7_name1.setText(item_n);
                  item7_price1.setText(item_p);
                  item7_img1.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b)));
                  
                          
              } 

        } catch (Exception e) {
            
        } 
          
    } public void F_item8(){
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=20 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
           
            ResultSet rs =  ps.executeQuery();       
              if (rs.next() ==false) {
                   JOptionPane.showMessageDialog(null, "Not found"); 
              }else{
                  String item_n=rs.getString("Product_name");
                    String item_p=rs.getString("Product_price");
                    b= rs.getBytes("Product_img");
                   
                  item8_name1.setText(item_n);
                  item8_price1.setText(item_p);
                  item8_img1.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b)));
                  
                          
              } 

        } catch (Exception e) {
            
        } 
          
    }
     public void F_item9(){
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=21 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
           
            ResultSet rs =  ps.executeQuery();       
              if (rs.next() ==false) {
                   JOptionPane.showMessageDialog(null, "Not found"); 
              }else{
                  String item_n=rs.getString("Product_name");
                    String item_p=rs.getString("Product_price");
                    b= rs.getBytes("Product_img");
                   
                  item9_name1.setText(item_n);
                  item9_price1.setText(item_p);
                  item9_img1.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b)));
                  
                          
              } 

        } catch (Exception e) {
            
        } 
          
    }
      public void F_item10(){
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=22 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
           
            ResultSet rs =  ps.executeQuery();       
              if (rs.next() ==false) {
                   JOptionPane.showMessageDialog(null, "Not found"); 
              }else{
                  String item_n=rs.getString("Product_name");
                    String item_p=rs.getString("Product_price");
                    b= rs.getBytes("Product_img");
                   
                  item10_name1.setText(item_n);
                  item10_price1.setText(item_p);
                  item10_img1.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b)));
                  
                          
              } 

        } catch (Exception e) {
            
        } 
          
    }
       public void F_item11(){
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=23 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
           
            ResultSet rs =  ps.executeQuery();       
              if (rs.next() ==false) {
                   JOptionPane.showMessageDialog(null, "Not found"); 
              }else{
                  String item_n=rs.getString("Product_name");
                    String item_p=rs.getString("Product_price");
                    b= rs.getBytes("Product_img");
                   
                  item11_name1.setText(item_n);
                  item11_price1.setText(item_p);
                  item11_img1.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b)));
                  
                          
              } 

        } catch (Exception e) {
            
        } 
          
    } public void F_item12(){
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=24 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
           
            ResultSet rs =  ps.executeQuery();       
              if (rs.next() ==false) {
                   JOptionPane.showMessageDialog(null, "Not found"); 
              }else{
                  String item_n=rs.getString("Product_name");
                    String item_p=rs.getString("Product_price");
                    b= rs.getBytes("Product_img");
                   
                  item12_name1.setText(item_n);
                  item12_price1.setText(item_p);
                  item12_img1.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b)));
                  
                          
              } 

        } catch (Exception e) {
            
        } 
          
    } 
       
    
    
    
         public void C_item1(){
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=25";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
           
            ResultSet rs =  ps.executeQuery();       
              if (rs.next() ==false) {
                   JOptionPane.showMessageDialog(null, "Not found"); 
              }else{
                  String item_n=rs.getString("Product_name");
                    String item_p=rs.getString("Product_price");
                    b= rs.getBytes("Product_img");
                   
                  item1_name2.setText(item_n);
                  item1_price2.setText(item_p);
                  item1_img2.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b)));
                  
                          
              } 

        } catch (Exception e) {
            
        } 
          
    }
             public void  C_item2(){
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=26";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
           
            ResultSet rs =  ps.executeQuery();       
              if (rs.next() ==false) {
                   JOptionPane.showMessageDialog(null, "Not found"); 
              }else{
                  String item_n=rs.getString("Product_name");
                    String item_p=rs.getString("Product_price");
                    b= rs.getBytes("Product_img");
                   
                  item2_name2.setText(item_n);
                  item2_price2.setText(item_p);
                  item2_img2.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b)));
                  
                          
              } 

        } catch (Exception e) {
            
        } 
          
    }
              public void C_item3(){
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=27 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
           
            ResultSet rs =  ps.executeQuery();       
              if (rs.next() ==false) {
                   JOptionPane.showMessageDialog(null, "Not found"); 
              }else{
                  String item_n=rs.getString("Product_name");
                    String item_p=rs.getString("Product_price");
                    b= rs.getBytes("Product_img");
                   
                  item3_name2.setText(item_n);
                  item3_price2.setText(item_p);
                  item3_img2.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b)));
                  
                          
              } 

        } catch (Exception e) {
            
        } 
          
    }
               public void C_item4(){
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=28 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
           
            ResultSet rs =  ps.executeQuery();       
              if (rs.next() ==false) {
                   JOptionPane.showMessageDialog(null, "Not found"); 
              }else{
                  String item_n=rs.getString("Product_name");
                    String item_p=rs.getString("Product_price");
                    b= rs.getBytes("Product_img");
                   
                  item4_name2.setText(item_n);
                  item4_price2.setText(item_p);
                  item4_img2.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b)));
                  
                          
              } 

        } catch (Exception e) {
            
        } 
          
    }
                public void C_item5(){
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=29 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
           
            ResultSet rs =  ps.executeQuery();       
              if (rs.next() ==false) {
                   JOptionPane.showMessageDialog(null, "Not found"); 
              }else{
                  String item_n=rs.getString("Product_name");
                    String item_p=rs.getString("Product_price");
                    b= rs.getBytes("Product_img");
                   
                  item5_name2.setText(item_n);
                  item5_price2.setText(item_p);
                  item5_img2.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b)));
                  
                          
              } 

        } catch (Exception e) {
            
        } 
          
    }
                 public void C_item6(){
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=30 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
           
            ResultSet rs =  ps.executeQuery();       
              if (rs.next() ==false) {
                   JOptionPane.showMessageDialog(null, "Not found"); 
              }else{
                  String item_n=rs.getString("Product_name");
                    String item_p=rs.getString("Product_price");
                    b= rs.getBytes("Product_img");
                   
                  item6_name2.setText(item_n);
                  item6_price2.setText(item_p);
                  item6_img2.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b)));
                  
                          
              } 

        } catch (Exception e) {
            
        } 
          
    } public void C_item7(){
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=31 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
           
            ResultSet rs =  ps.executeQuery();       
              if (rs.next() ==false) {
                   JOptionPane.showMessageDialog(null, "Not found"); 
              }else{
                  String item_n=rs.getString("Product_name");
                    String item_p=rs.getString("Product_price");
                    b= rs.getBytes("Product_img");
                   
                  item7_name2.setText(item_n);
                  item7_price2.setText(item_p);
                  item7_img2.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b)));
                  
                          
              } 

        } catch (Exception e) {
            
        } 
          
    } public void C_item8(){
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=32 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
           
            ResultSet rs =  ps.executeQuery();       
              if (rs.next() ==false) {
                   JOptionPane.showMessageDialog(null, "Not found"); 
              }else{
                  String item_n=rs.getString("Product_name");
                    String item_p=rs.getString("Product_price");
                    b= rs.getBytes("Product_img");
                   
                  item8_name2.setText(item_n);
                  item8_price2.setText(item_p);
                  item8_img2.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b)));
                  
                          
              } 

        } catch (Exception e) {
            
        } 
          
    }
     public void C_item9(){
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=33 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
           
            ResultSet rs =  ps.executeQuery();       
              if (rs.next() ==false) {
                   JOptionPane.showMessageDialog(null, "Not found"); 
              }else{
                  String item_n=rs.getString("Product_name");
                    String item_p=rs.getString("Product_price");
                    b= rs.getBytes("Product_img");
                   
                  item9_name2.setText(item_n);
                  item9_price2.setText(item_p);
                  item9_img2.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b)));
                  
                          
              } 

        } catch (Exception e) {
            
        } 
          
    }
      public void C_item10(){
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=34 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
           
            ResultSet rs =  ps.executeQuery();       
              if (rs.next() ==false) {
                   JOptionPane.showMessageDialog(null, "Not found"); 
              }else{
                  String item_n=rs.getString("Product_name");
                    String item_p=rs.getString("Product_price");
                    b= rs.getBytes("Product_img");
                   
                  item10_name2.setText(item_n);
                  item10_price2.setText(item_p);
                  item10_img2.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b)));
                  
                          
              } 

        } catch (Exception e) {
            
        } 
          
    }
       public void C_item11(){
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=35 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
           
            ResultSet rs =  ps.executeQuery();       
              if (rs.next() ==false) {
                   JOptionPane.showMessageDialog(null, "Not found"); 
              }else{
                  String item_n=rs.getString("Product_name");
                    String item_p=rs.getString("Product_price");
                    b= rs.getBytes("Product_img");
                   
                  item11_name2.setText(item_n);
                  item11_price2.setText(item_p);
                  item11_img2.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b)));
                  
                          
              } 

        } catch (Exception e) {
            
        } 
          
    } public void C_item12(){
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=36 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
           
            ResultSet rs =  ps.executeQuery();       
              if (rs.next() ==false) {
                   JOptionPane.showMessageDialog(null, "Not found"); 
              }else{
                  String item_n=rs.getString("Product_name");
                    String item_p=rs.getString("Product_price");
                    b= rs.getBytes("Product_img");
                   
                  item12_name2.setText(item_n);
                  item12_price2.setText(item_p);
                  item12_img2.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b)));
                  
                          
              } 

        } catch (Exception e) {
            
        } 
          
    } 
    
    
    
      public void G_item1(){
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=37";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
           
            ResultSet rs =  ps.executeQuery();       
              if (rs.next() ==false) {
                   JOptionPane.showMessageDialog(null, "Not found"); 
              }else{
                  String item_n=rs.getString("Product_name");
                    String item_p=rs.getString("Product_price");
                    b= rs.getBytes("Product_img");
                   
                  item1_name3.setText(item_n);
                  item1_price3.setText(item_p);
                  item1_img3.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b)));
                  
                          
              } 

        } catch (Exception e) {
            
        } 
          
    }
             public void  G_item2(){
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=38";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
           
            ResultSet rs =  ps.executeQuery();       
              if (rs.next() ==false) {
                   JOptionPane.showMessageDialog(null, "Not found"); 
              }else{
                  String item_n=rs.getString("Product_name");
                    String item_p=rs.getString("Product_price");
                    b= rs.getBytes("Product_img");
                   
                  item2_name3.setText(item_n);
                  item2_price3.setText(item_p);
                  item2_img3.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b)));
                  
                          
              } 

        } catch (Exception e) {
            
        } 
          
    }
              public void G_item3(){
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=39 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
           
            ResultSet rs =  ps.executeQuery();       
              if (rs.next() ==false) {
                   JOptionPane.showMessageDialog(null, "Not found"); 
              }else{
                  String item_n=rs.getString("Product_name");
                    String item_p=rs.getString("Product_price");
                    b= rs.getBytes("Product_img");
                   
                  item3_name3.setText(item_n);
                  item3_price3.setText(item_p);
                  item3_img3.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b)));
                  
                          
              } 

        } catch (Exception e) {
            
        } 
          
    }
               public void G_item4(){
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=40 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
           
            ResultSet rs =  ps.executeQuery();       
              if (rs.next() ==false) {
                   JOptionPane.showMessageDialog(null, "Not found"); 
              }else{
                  String item_n=rs.getString("Product_name");
                    String item_p=rs.getString("Product_price");
                    b= rs.getBytes("Product_img");
                   
                  item4_name3.setText(item_n);
                  item4_price3.setText(item_p);
                  item4_img3.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b)));
                  
                          
              } 

        } catch (Exception e) {
            
        } 
          
    }
                public void G_item5(){
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=41 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
           
            ResultSet rs =  ps.executeQuery();       
              if (rs.next() ==false) {
                   JOptionPane.showMessageDialog(null, "Not found"); 
              }else{
                  String item_n=rs.getString("Product_name");
                    String item_p=rs.getString("Product_price");
                    b= rs.getBytes("Product_img");
                   
                  item5_name3.setText(item_n);
                  item5_price3.setText(item_p);
                  item5_img3.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b)));
                  
                          
              } 

        } catch (Exception e) {
            
        } 
          
    }
                 public void G_item6(){
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=42 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
           
            ResultSet rs =  ps.executeQuery();       
              if (rs.next() ==false) {
                   JOptionPane.showMessageDialog(null, "Not found"); 
              }else{
                  String item_n=rs.getString("Product_name");
                    String item_p=rs.getString("Product_price");
                    b= rs.getBytes("Product_img");
                   
                  item6_name3.setText(item_n);
                  item6_price3.setText(item_p);
                  item6_img3.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b)));
                  
                          
              } 

        } catch (Exception e) {
            
        } 
          
    } public void G_item7(){
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=43 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
           
            ResultSet rs =  ps.executeQuery();       
              if (rs.next() ==false) {
                   JOptionPane.showMessageDialog(null, "Not found"); 
              }else{
                  String item_n=rs.getString("Product_name");
                    String item_p=rs.getString("Product_price");
                    b= rs.getBytes("Product_img");
                   
                  item7_name3.setText(item_n);
                  item7_price3.setText(item_p);
                  item7_img3.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b)));
                  
                          
              } 

        } catch (Exception e) {
            
        } 
          
    } public void G_item8(){
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=44";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
           
            ResultSet rs =  ps.executeQuery();       
              if (rs.next() ==false) {
                   JOptionPane.showMessageDialog(null, "Not found"); 
              }else{
                  String item_n=rs.getString("Product_name");
                    String item_p=rs.getString("Product_price");
                    b= rs.getBytes("Product_img");
                   
                  item8_name3.setText(item_n);
                  item8_price3.setText(item_p);
                  item8_img3.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b)));
                  
                          
              } 

        } catch (Exception e) {
            
        } 
          
    }
     public void G_item9(){
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=45 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
           
            ResultSet rs =  ps.executeQuery();       
              if (rs.next() ==false) {
                   JOptionPane.showMessageDialog(null, "Not found"); 
              }else{
                  String item_n=rs.getString("Product_name");
                    String item_p=rs.getString("Product_price");
                    b= rs.getBytes("Product_img");
                   
                  item9_name3.setText(item_n);
                  item9_price3.setText(item_p);
                  item9_img3.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b)));
                  
                          
              } 

        } catch (Exception e) {
            
        } 
          
    }
      public void G_item10(){
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=46 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
           
            ResultSet rs =  ps.executeQuery();       
              if (rs.next() ==false) {
                   JOptionPane.showMessageDialog(null, "Not found"); 
              }else{
                  String item_n=rs.getString("Product_name");
                    String item_p=rs.getString("Product_price");
                    b= rs.getBytes("Product_img");
                   
                  item10_name3.setText(item_n);
                  item10_price3.setText(item_p);
                  item10_img3.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b)));
                  
                          
              } 

        } catch (Exception e) {
            
        } 
          
    }
       public void G_item11(){
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=47 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
           
            ResultSet rs =  ps.executeQuery();       
              if (rs.next() ==false) {
                   JOptionPane.showMessageDialog(null, "Not found"); 
              }else{
                  String item_n=rs.getString("Product_name");
                    String item_p=rs.getString("Product_price");
                    b= rs.getBytes("Product_img");
                   
                  item11_name3.setText(item_n);
                  item11_price3.setText(item_p);
                  item11_img3.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b)));
                  
                          
              } 

        } catch (Exception e) {
            
        } 
          
    } public void G_item12(){
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=48 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
           
            ResultSet rs =  ps.executeQuery();       
              if (rs.next() ==false) {
                   JOptionPane.showMessageDialog(null, "Not found"); 
              }else{
                  String item_n=rs.getString("Product_name");
                    String item_p=rs.getString("Product_price");
                    b= rs.getBytes("Product_img");
                   
                  item12_name3.setText(item_n);
                  item12_price3.setText(item_p);
                  item12_img3.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b)));
                  
                          
              } 

        } catch (Exception e) {
            
        } 
          
    } 
    
                 
    
    
    
    
    /*
    //open menu
    public void menuopen(){
           new Thread() {
           @Override
           public void run() { 
               try {
                   
              
               for (int i = 0; i < 200; i++) {
                   Thread.sleep(2);
                   jPanel5.setSize(170,i);
                   
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
               for (int i = 200; i >=0; i--) {
                   Thread.sleep(2);
                    jPanel5.setSize(170,i);
                   
                   } 
              
                   
               
               } catch (Exception e) {
               } 
               
           } 
           
           
       }.start();
        
     
    }*/
    
    
    
    //slider show 1
    public void slidershow(){
        
        new Thread() 
        { 
            int nb;
            @Override
            public void run() {
                
                try {
                    while (true) {                        
                        
                  
                    switch(nb){
                        case 0: 
                            
                            
                            Thread.sleep(5000);
                            ac.jLabelXLeft(0, -720, 30, 10, jLabel2);
                            ac.jLabelXLeft(720, 0, 30, 10, jLabel3);
                            ac.jLabelXLeft(1440, 720, 30, 10, jLabel9);
                            nb=1;
                            break;
                        case 1:
                            Thread.sleep(3000);
                            ac.jLabelXLeft(-720, -1440, 30, 10, jLabel2);
                            ac.jLabelXLeft(0, -720, 30, 10, jLabel3);
                            ac.jLabelXLeft(720, 0, 30, 10, jLabel9);
                            nb=2;
                            break;
                        case 2: 
                            //ImageIcon II= new ImageIcon(getClass().getResource("/img/Back.png"));
                            //jLabel1.setIcon(II);
                            Thread.sleep(3000);
                            ac.jLabelXRight(-1440, -720, 30, 10, jLabel2);
                            ac.jLabelXRight(-720, 0, 30, 10, jLabel3);
                            ac.jLabelXRight(1440, 720, 30, 10, jLabel9);
                            nb=3;
                            break;
                        case 3:
                            Thread.sleep(3000);
                            ac.jLabelXRight(-720, 0, 30, 10, jLabel2);
                            ac.jLabelXRight(0, 720, 30, 10, jLabel3);
                            ac.jLabelXRight(720, 1440, 30, 10, jLabel9);
                            nb=4;
                            break;
                        case 4: 
                            
                            
                            Thread.sleep(2000);
                            ac.jLabelXLeft(0, -720, 30, 10, jLabel2);
                            ac.jLabelXLeft(720, 0, 30, 10, jLabel3);
                            ac.jLabelXLeft(1440, 720, 30, 10, jLabel9);
                            nb=5;
                            break;
                        case 5:
                            Thread.sleep(3000);
                            ac.jLabelXLeft(-720, -1440, 30, 10, jLabel2);
                            ac.jLabelXLeft(0, -720, 30, 10, jLabel3);
                            ac.jLabelXLeft(720, 0, 30, 10, jLabel9);
                            nb=6;
                            break;
                        case 6: 
                            //ImageIcon II= new ImageIcon(getClass().getResource("/img/Back.png"));
                            //jLabel1.setIcon(II);
                            Thread.sleep(3000);
                            ac.jLabelXRight(-1440, -720, 30, 10, jLabel2);
                            ac.jLabelXRight(-720, 0, 30, 10, jLabel3);
                            ac.jLabelXRight(1440, 720, 30, 10, jLabel9);
                            nb=7;
                            break;
                        case 7:
                            Thread.sleep(3000);
                            ac.jLabelXRight(-720, 0, 30, 10, jLabel2);
                            ac.jLabelXRight(0, 720, 30, 10, jLabel3);
                            ac.jLabelXRight(720, 1440, 30, 10, jLabel9);
                            nb=8;
                            break;
                        case 8: 
                            
                            
                            Thread.sleep(2000);
                            ac.jLabelXLeft(0, -720, 30, 10, jLabel2);
                            ac.jLabelXLeft(720, 0, 30, 10, jLabel3);
                            ac.jLabelXLeft(1440, 720, 30, 10, jLabel9);
                            nb=9;
                            break;
                        case 9:
                            Thread.sleep(3000);
                            ac.jLabelXLeft(-720, -1440, 30, 10, jLabel2);
                            ac.jLabelXLeft(0, -720, 30, 10, jLabel3);
                            ac.jLabelXLeft(720, 0, 30, 10, jLabel9);
                            nb=10;
                            break;
                        case 10: 
                            //ImageIcon II= new ImageIcon(getClass().getResource("/img/Back.png"));
                            //jLabel1.setIcon(II);
                            Thread.sleep(3000);
                            ac.jLabelXRight(-1440, -720, 30, 10, jLabel2);
                            ac.jLabelXRight(-720, 0, 30, 10, jLabel3);
                            ac.jLabelXRight(1440, 720, 30, 10, jLabel9);
                            nb=11;
                            break;
                        case 11:
                            Thread.sleep(3000);
                            ac.jLabelXRight(-720, 0, 30, 10, jLabel2);
                            ac.jLabelXRight(0, 720, 30, 10, jLabel3);
                            ac.jLabelXRight(720, 1440, 30, 10, jLabel9);
                            nb=12;
                            break;
                        
                        
                    } 
                    }
                } catch (Exception e) {
                }
            }
        }.start();
    }
       
    
    //slider show 2
    public void slidershow1(){
        
        new Thread() 
        { 
            int nb;
            @Override
            public void run() {
                
                try {
                    while (true) {                        
                        
                  
                    switch(nb){
                        case 0: 
                             
                            Thread.sleep(2000);
                            ac.jLabelXLeft(0, -1090, 20, 10, jLabel10);
                            ac.jLabelXLeft(1090, 0, 20, 10, jLabel11);
                            
                            nb=1;
                            break;
                        case 1:
                          //  ImageIcon II2= new ImageIcon(getClass().getResource("/img/Back.png"));
                           // jLabel10.setIcon(II2);
                            Thread.sleep(3000);
                            
                            ac.jLabelXRight(-1090, 0, 20, 10, jLabel10);
                            ac.jLabelXRight(0, 1090, 20, 10, jLabel11);
                            nb=2;
                            break;
                       case 2: 
                           // ImageIcon Ii3= new ImageIcon(getClass().getResource("/img/Back.png"));
                           // jLabel10.setIcon(Ii3);
                            Thread.sleep(3000);
                            
                            ac.jLabelXLeft(0, -1090, 20, 10, jLabel10);
                            ac.jLabelXLeft(1090, 0, 20, 10, jLabel11);
                            nb=3;
                            break;
                        case 3:
                            // ImageIcon II4= new ImageIcon(getClass().getResource("/img/Back.png"));
                           // jLabel11.setIcon(II4);
                            
                            Thread.sleep(3000);
                            ac.jLabelXRight(-1090, 0, 20, 10, jLabel10);
                            ac.jLabelXRight(0, 1090, 20, 10, jLabel11);
                            
                            nb=4;
                            break;
                         case 4: 
                            //ImageIcon II= new ImageIcon(getClass().getResource("/img/Back.png"));
                            //jLabel1.setIcon(II);
                            Thread.sleep(3000);
                            
                            ac.jLabelXLeft(0, -1090, 20, 10, jLabel10);
                            ac.jLabelXLeft(1090, 0, 20, 10, jLabel11);
                            nb=5;
                            break;
                        case 5:
                            Thread.sleep(3000);
                            ac.jLabelXRight(-1090, 0, 20, 10, jLabel10);
                            ac.jLabelXRight(0, 1090, 20, 10, jLabel11);
                            
                            nb=6;
                            break;
                         case 6: 
                            //ImageIcon II= new ImageIcon(getClass().getResource("/img/Back.png"));
                            //jLabel1.setIcon(II);
                            Thread.sleep(3000);
                            
                            ac.jLabelXLeft(0, -1090, 20, 10, jLabel10);
                            ac.jLabelXLeft(1090, 0, 20, 10, jLabel11);
                            nb=7;
                            break;
                        case 7:
                            Thread.sleep(3000);
                            ac.jLabelXRight(-1090, 0, 20, 10, jLabel10);
                            ac.jLabelXRight(0, 1090, 20, 10, jLabel11);
                            
                            nb=8;
                            break;
                        
                    } 
                    }
                } catch (Exception e) {
                }
            }
        }.start();
    }
    
    
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        MenuBar = new javax.swing.JPanel();
        pnHome = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        pnFurniture = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        pnClothes = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        pnShoes = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        pnCart = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        PnElectronic = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        icon_lbl = new javax.swing.JLabel();
        pnHelp = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Home = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Eletronic = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        kGradientPanel6 = new keeptoo.KGradientPanel();
        jPanel22 = new javax.swing.JPanel();
        item5_name = new javax.swing.JLabel();
        item5_price = new javax.swing.JLabel();
        item5_img = new javax.swing.JLabel();
        jSpinner_item5 = new javax.swing.JSpinner();
        item5_btn = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        item2_img = new javax.swing.JLabel();
        item2_name = new javax.swing.JLabel();
        item2_price = new javax.swing.JLabel();
        jSpinner_item2 = new javax.swing.JSpinner();
        item2_btn = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        item3_img = new javax.swing.JLabel();
        item3_name = new javax.swing.JLabel();
        item3_price = new javax.swing.JLabel();
        item3_btn = new javax.swing.JButton();
        jSpinner_item3 = new javax.swing.JSpinner();
        jPanel12 = new javax.swing.JPanel();
        item4_img = new javax.swing.JLabel();
        item4_name = new javax.swing.JLabel();
        item4_price = new javax.swing.JLabel();
        jSpinner_item4 = new javax.swing.JSpinner();
        item4_btn = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        item1_img = new javax.swing.JLabel();
        item1_name = new javax.swing.JLabel();
        item1_price = new javax.swing.JLabel();
        item1_btn = new javax.swing.JButton();
        jSpinner_item1 = new javax.swing.JSpinner();
        jPanel15 = new javax.swing.JPanel();
        item6_img = new javax.swing.JLabel();
        item6_price = new javax.swing.JLabel();
        item6_name = new javax.swing.JLabel();
        jSpinner_item6 = new javax.swing.JSpinner();
        item6_btn = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        item7_img = new javax.swing.JLabel();
        item7_name = new javax.swing.JLabel();
        item7_price = new javax.swing.JLabel();
        item7_btn = new javax.swing.JButton();
        jSpinner_item7 = new javax.swing.JSpinner();
        jPanel17 = new javax.swing.JPanel();
        item8_img = new javax.swing.JLabel();
        item8_name = new javax.swing.JLabel();
        item8_price = new javax.swing.JLabel();
        jSpinner_item8 = new javax.swing.JSpinner();
        item8_btn = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        item10_img = new javax.swing.JLabel();
        item10_name = new javax.swing.JLabel();
        item10_price = new javax.swing.JLabel();
        jSpinner_item10 = new javax.swing.JSpinner();
        item10_btn = new javax.swing.JButton();
        jPanel29 = new javax.swing.JPanel();
        item11_img = new javax.swing.JLabel();
        item11_name = new javax.swing.JLabel();
        item11_price = new javax.swing.JLabel();
        item11_btn = new javax.swing.JButton();
        jSpinner_item11 = new javax.swing.JSpinner();
        jPanel30 = new javax.swing.JPanel();
        item12_img = new javax.swing.JLabel();
        item12_name = new javax.swing.JLabel();
        item12_price = new javax.swing.JLabel();
        jSpinner_item12 = new javax.swing.JSpinner();
        item12_btn = new javax.swing.JButton();
        jPanel31 = new javax.swing.JPanel();
        item9_img = new javax.swing.JLabel();
        item9_name = new javax.swing.JLabel();
        item9_price = new javax.swing.JLabel();
        item9_btn = new javax.swing.JButton();
        jSpinner_item9 = new javax.swing.JSpinner();
        Furniture = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        kGradientPanel7 = new keeptoo.KGradientPanel();
        jPanel23 = new javax.swing.JPanel();
        item5_name1 = new javax.swing.JLabel();
        item5_price1 = new javax.swing.JLabel();
        item5_img1 = new javax.swing.JLabel();
        jSpinner_F_item5 = new javax.swing.JSpinner();
        btn_F_item5 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        item2_img1 = new javax.swing.JLabel();
        item2_name1 = new javax.swing.JLabel();
        item2_price1 = new javax.swing.JLabel();
        jSpinner_F_item2 = new javax.swing.JSpinner();
        btn_F_item2 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        item3_img1 = new javax.swing.JLabel();
        item3_name1 = new javax.swing.JLabel();
        item3_price1 = new javax.swing.JLabel();
        btn_F_item3 = new javax.swing.JButton();
        jSpinner_F_item3 = new javax.swing.JSpinner();
        jPanel19 = new javax.swing.JPanel();
        item4_img1 = new javax.swing.JLabel();
        item4_name1 = new javax.swing.JLabel();
        item4_price1 = new javax.swing.JLabel();
        jSpinner_F_item4 = new javax.swing.JSpinner();
        btn_F_item4 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        item1_img1 = new javax.swing.JLabel();
        item1_name1 = new javax.swing.JLabel();
        item1_price1 = new javax.swing.JLabel();
        btn_F_item1 = new javax.swing.JButton();
        jSpinner_F_item1 = new javax.swing.JSpinner();
        jPanel21 = new javax.swing.JPanel();
        item6_img1 = new javax.swing.JLabel();
        item6_price1 = new javax.swing.JLabel();
        item6_name1 = new javax.swing.JLabel();
        jSpinner_F_item6 = new javax.swing.JSpinner();
        btn_F_item6 = new javax.swing.JButton();
        jPanel24 = new javax.swing.JPanel();
        item7_img1 = new javax.swing.JLabel();
        item7_name1 = new javax.swing.JLabel();
        item7_price1 = new javax.swing.JLabel();
        btn_F_item7 = new javax.swing.JButton();
        jSpinner_F_item7 = new javax.swing.JSpinner();
        jPanel26 = new javax.swing.JPanel();
        item8_img1 = new javax.swing.JLabel();
        item8_name1 = new javax.swing.JLabel();
        item8_price1 = new javax.swing.JLabel();
        jSpinner_F_item8 = new javax.swing.JSpinner();
        btn_F_item8 = new javax.swing.JButton();
        jPanel27 = new javax.swing.JPanel();
        item10_img1 = new javax.swing.JLabel();
        item10_name1 = new javax.swing.JLabel();
        item10_price1 = new javax.swing.JLabel();
        jSpinner_F_item10 = new javax.swing.JSpinner();
        btn_F_item10 = new javax.swing.JButton();
        jPanel32 = new javax.swing.JPanel();
        item11_img1 = new javax.swing.JLabel();
        item11_name1 = new javax.swing.JLabel();
        item11_price1 = new javax.swing.JLabel();
        btn_F_item11 = new javax.swing.JButton();
        jSpinner_F_item11 = new javax.swing.JSpinner();
        jPanel33 = new javax.swing.JPanel();
        item12_img1 = new javax.swing.JLabel();
        item12_name1 = new javax.swing.JLabel();
        item12_price1 = new javax.swing.JLabel();
        jSpinner_F_item12 = new javax.swing.JSpinner();
        btn_F_item12 = new javax.swing.JButton();
        jPanel34 = new javax.swing.JPanel();
        item9_img1 = new javax.swing.JLabel();
        item9_name1 = new javax.swing.JLabel();
        item9_price1 = new javax.swing.JLabel();
        btn_F_item9 = new javax.swing.JButton();
        jSpinner_F_item9 = new javax.swing.JSpinner();
        Clothes = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        kGradientPanel8 = new keeptoo.KGradientPanel();
        jPanel28 = new javax.swing.JPanel();
        item5_name2 = new javax.swing.JLabel();
        item5_price2 = new javax.swing.JLabel();
        item5_img2 = new javax.swing.JLabel();
        jSpinner_C_item5 = new javax.swing.JSpinner();
        btn_C_item5 = new javax.swing.JButton();
        jPanel35 = new javax.swing.JPanel();
        item2_img2 = new javax.swing.JLabel();
        item2_name2 = new javax.swing.JLabel();
        item2_price2 = new javax.swing.JLabel();
        jSpinner_C_item2 = new javax.swing.JSpinner();
        btn_C_item2 = new javax.swing.JButton();
        jPanel36 = new javax.swing.JPanel();
        item3_img2 = new javax.swing.JLabel();
        item3_name2 = new javax.swing.JLabel();
        item3_price2 = new javax.swing.JLabel();
        btn_C_item3 = new javax.swing.JButton();
        jSpinner_C_item3 = new javax.swing.JSpinner();
        jPanel37 = new javax.swing.JPanel();
        item4_img2 = new javax.swing.JLabel();
        item4_name2 = new javax.swing.JLabel();
        item4_price2 = new javax.swing.JLabel();
        jSpinner_C_item4 = new javax.swing.JSpinner();
        btn_C_item4 = new javax.swing.JButton();
        jPanel38 = new javax.swing.JPanel();
        item1_img2 = new javax.swing.JLabel();
        item1_name2 = new javax.swing.JLabel();
        item1_price2 = new javax.swing.JLabel();
        btn_C_item1 = new javax.swing.JButton();
        jSpinner_C_item1 = new javax.swing.JSpinner();
        jPanel39 = new javax.swing.JPanel();
        item6_img2 = new javax.swing.JLabel();
        item6_price2 = new javax.swing.JLabel();
        item6_name2 = new javax.swing.JLabel();
        jSpinner_C_item6 = new javax.swing.JSpinner();
        btn_C_item6 = new javax.swing.JButton();
        jPanel40 = new javax.swing.JPanel();
        item7_img2 = new javax.swing.JLabel();
        item7_name2 = new javax.swing.JLabel();
        item7_price2 = new javax.swing.JLabel();
        btn_C_item7 = new javax.swing.JButton();
        jSpinner_C_item7 = new javax.swing.JSpinner();
        jPanel41 = new javax.swing.JPanel();
        item8_img2 = new javax.swing.JLabel();
        item8_name2 = new javax.swing.JLabel();
        item8_price2 = new javax.swing.JLabel();
        jSpinner_C_item8 = new javax.swing.JSpinner();
        btn_C_item8 = new javax.swing.JButton();
        jPanel42 = new javax.swing.JPanel();
        item10_img2 = new javax.swing.JLabel();
        item10_name2 = new javax.swing.JLabel();
        item10_price2 = new javax.swing.JLabel();
        jSpinner_C_item10 = new javax.swing.JSpinner();
        btn_C_item10 = new javax.swing.JButton();
        jPanel43 = new javax.swing.JPanel();
        item11_img2 = new javax.swing.JLabel();
        item11_name2 = new javax.swing.JLabel();
        item11_price2 = new javax.swing.JLabel();
        btn_C_item11 = new javax.swing.JButton();
        jSpinner_C_item11 = new javax.swing.JSpinner();
        jPanel44 = new javax.swing.JPanel();
        item12_img2 = new javax.swing.JLabel();
        item12_name2 = new javax.swing.JLabel();
        item12_price2 = new javax.swing.JLabel();
        jSpinner_C_item12 = new javax.swing.JSpinner();
        btn_C_item12 = new javax.swing.JButton();
        jPanel45 = new javax.swing.JPanel();
        item9_img2 = new javax.swing.JLabel();
        item9_name2 = new javax.swing.JLabel();
        item9_price2 = new javax.swing.JLabel();
        btn_C_item9 = new javax.swing.JButton();
        jSpinner_C_item9 = new javax.swing.JSpinner();
        Games = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        kGradientPanel9 = new keeptoo.KGradientPanel();
        jPanel46 = new javax.swing.JPanel();
        item5_name3 = new javax.swing.JLabel();
        item5_price3 = new javax.swing.JLabel();
        item5_img3 = new javax.swing.JLabel();
        jSpinner_G_item5 = new javax.swing.JSpinner();
        btn_G_item5 = new javax.swing.JButton();
        jPanel47 = new javax.swing.JPanel();
        item2_img3 = new javax.swing.JLabel();
        item2_name3 = new javax.swing.JLabel();
        item2_price3 = new javax.swing.JLabel();
        jSpinner_G_item2 = new javax.swing.JSpinner();
        btn_G_item2 = new javax.swing.JButton();
        jPanel48 = new javax.swing.JPanel();
        item3_img3 = new javax.swing.JLabel();
        item3_name3 = new javax.swing.JLabel();
        item3_price3 = new javax.swing.JLabel();
        btn_G_item3 = new javax.swing.JButton();
        jSpinner_G_item3 = new javax.swing.JSpinner();
        jPanel49 = new javax.swing.JPanel();
        item4_img3 = new javax.swing.JLabel();
        item4_name3 = new javax.swing.JLabel();
        item4_price3 = new javax.swing.JLabel();
        jSpinner_G_item4 = new javax.swing.JSpinner();
        btn_G_item4 = new javax.swing.JButton();
        jPanel50 = new javax.swing.JPanel();
        item1_img3 = new javax.swing.JLabel();
        item1_name3 = new javax.swing.JLabel();
        item1_price3 = new javax.swing.JLabel();
        btn_G_item1 = new javax.swing.JButton();
        jSpinner_G_item1 = new javax.swing.JSpinner();
        jPanel51 = new javax.swing.JPanel();
        item6_img3 = new javax.swing.JLabel();
        item6_price3 = new javax.swing.JLabel();
        item6_name3 = new javax.swing.JLabel();
        jSpinner_G_item6 = new javax.swing.JSpinner();
        btn_G_item6 = new javax.swing.JButton();
        jPanel52 = new javax.swing.JPanel();
        item7_img3 = new javax.swing.JLabel();
        item7_name3 = new javax.swing.JLabel();
        item7_price3 = new javax.swing.JLabel();
        btn_G_item7 = new javax.swing.JButton();
        jSpinner_G_item7 = new javax.swing.JSpinner();
        jPanel53 = new javax.swing.JPanel();
        item8_img3 = new javax.swing.JLabel();
        item8_name3 = new javax.swing.JLabel();
        item8_price3 = new javax.swing.JLabel();
        jSpinner_G_item8 = new javax.swing.JSpinner();
        btn_G_item8 = new javax.swing.JButton();
        jPanel54 = new javax.swing.JPanel();
        item10_img3 = new javax.swing.JLabel();
        item10_name3 = new javax.swing.JLabel();
        item10_price3 = new javax.swing.JLabel();
        jSpinner_G_item10 = new javax.swing.JSpinner();
        btn_G_item10 = new javax.swing.JButton();
        jPanel55 = new javax.swing.JPanel();
        item11_img3 = new javax.swing.JLabel();
        item11_name3 = new javax.swing.JLabel();
        item11_price3 = new javax.swing.JLabel();
        btn_G_item11 = new javax.swing.JButton();
        jSpinner_G_item11 = new javax.swing.JSpinner();
        jPanel56 = new javax.swing.JPanel();
        item12_img3 = new javax.swing.JLabel();
        item12_name3 = new javax.swing.JLabel();
        item12_price3 = new javax.swing.JLabel();
        jSpinner_G_item12 = new javax.swing.JSpinner();
        btn_G_item12 = new javax.swing.JButton();
        jPanel57 = new javax.swing.JPanel();
        item9_img3 = new javax.swing.JLabel();
        item9_name3 = new javax.swing.JLabel();
        item9_price3 = new javax.swing.JLabel();
        btn_G_item9 = new javax.swing.JButton();
        jSpinner_G_item9 = new javax.swing.JSpinner();
        Cart = new javax.swing.JPanel();
        Product_Info = new javax.swing.JPanel();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        id = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        qty = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        total = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        User_id = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Order_State = new javax.swing.JTextField();
        img_icon = new javax.swing.JLabel();
        NAME_OF_USER = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Cart_Table = new javax.swing.JTable();
        jCheckBox1 = new javax.swing.JCheckBox();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        jLabel13 = new javax.swing.JLabel();
        total_tot = new javax.swing.JLabel();
        Go_to_address_btn = new javax.swing.JButton();
        Help = new javax.swing.JPanel();
        kGradientPanel5 = new keeptoo.KGradientPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        Address_pn = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        kGradientPanel10 = new keeptoo.KGradientPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        txt_Area_For_Address1 = new javax.swing.JTextArea();
        txt_User_Name_For_Address = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        txt_Adrs_Name = new javax.swing.JTextField();
        txt_Adrs_Pin = new javax.swing.JTextField();
        txt_Adrs_Phone = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        txt_Adrs_House_Street = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        txt_Adrs_City = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        txt_Adrs_State = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Go_to_delivery_btn = new javax.swing.JButton();
        txt_Adrs_Country = new javax.swing.JTextField();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_Add_address = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        Back_to_cart = new javax.swing.JLabel();
        Delivery_option = new javax.swing.JPanel();
        kGradientPanel11 = new keeptoo.KGradientPanel();
        jLabel47 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel52 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jRadio_permium = new javax.swing.JRadioButton();
        service_type_premium = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel76 = new javax.swing.JLabel();
        service_price_premium = new javax.swing.JLabel();
        service_time_premium = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jRadio_gold = new javax.swing.JRadioButton();
        service_type_gold = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel78 = new javax.swing.JLabel();
        service_price_gold = new javax.swing.JLabel();
        service_time_gold = new javax.swing.JLabel();
        jPanel58 = new javax.swing.JPanel();
        jRadio_silver = new javax.swing.JRadioButton();
        service_type_silver = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel80 = new javax.swing.JLabel();
        service_time_silver = new javax.swing.JLabel();
        service_price_silver = new javax.swing.JLabel();
        Go_to_payment_btn = new javax.swing.JButton();
        Back_to_address = new javax.swing.JLabel();
        Payment_pn = new javax.swing.JPanel();
        kGradientPanel12 = new keeptoo.KGradientPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel55 = new javax.swing.JLabel();
        jRadio_cash_payment = new javax.swing.JRadioButton();
        jRadio_cradit_payment = new javax.swing.JRadioButton();
        pn_add_card = new javax.swing.JPanel();
        txt_card_no = new javax.swing.JTextField();
        txt_name_on_card = new javax.swing.JTextField();
        card_expire_month = new javax.swing.JComboBox<>();
        card_expire_year = new javax.swing.JComboBox<>();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        Go_to_place_order_btn = new javax.swing.JButton();
        Back_to_delivery = new javax.swing.JLabel();
        place_order_pn = new javax.swing.JPanel();
        jPanel59 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        txt_address_reviw = new javax.swing.JTextArea();
        Payment_mhthod_rv = new javax.swing.JLabel();
        jPanel60 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        Text_Area_For_Bill = new javax.swing.JTextArea();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jPanel63 = new javax.swing.JPanel();
        service_type = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        jLabel89 = new javax.swing.JLabel();
        service_time = new javax.swing.JLabel();
        service_price = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel70 = new javax.swing.JLabel();
        Item_count = new javax.swing.JLabel();
        delivery_price = new javax.swing.JLabel();
        total_price_rview = new javax.swing.JLabel();
        subtotal_revw = new javax.swing.JLabel();
        Place_order_btn = new javax.swing.JButton();
        Back_to_payment = new javax.swing.JLabel();
        myorder_pn = new javax.swing.JPanel();
        jPanel61 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jPanel62 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jPanel64 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jPanel65 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jPanel66 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(2, 0), new java.awt.Dimension(2, 0), new java.awt.Dimension(2, 32767));
        jPanel67 = new javax.swing.JPanel();
        kGradientPanel13 = new keeptoo.KGradientPanel();
        jTextField2 = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel68 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        order_table_details = new javax.swing.JTable();
        jPanel69 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        order_table_details1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 0, 51));
        kGradientPanel1.setkGradientFocus(1500);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 0, 0));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuBar.setBackground(new java.awt.Color(0, 0, 0));

        pnHome.setBackground(new java.awt.Color(0, 0, 0));
        pnHome.addMouseListener(new java.awt.event.MouseAdapter() {
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

        jLabel18.setFont(new java.awt.Font("Traditional Arabic", 0, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Home_25px.png"))); // NOI18N
        jLabel18.setText("     Home");

        javax.swing.GroupLayout pnHomeLayout = new javax.swing.GroupLayout(pnHome);
        pnHome.setLayout(pnHomeLayout);
        pnHomeLayout.setHorizontalGroup(
            pnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        pnHomeLayout.setVerticalGroup(
            pnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        pnFurniture.setBackground(new java.awt.Color(0, 0, 0));
        pnFurniture.addMouseListener(new java.awt.event.MouseAdapter() {
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

        jLabel19.setFont(new java.awt.Font("Traditional Arabic", 0, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Home_25px.png"))); // NOI18N
        jLabel19.setText("    Furniture");

        javax.swing.GroupLayout pnFurnitureLayout = new javax.swing.GroupLayout(pnFurniture);
        pnFurniture.setLayout(pnFurnitureLayout);
        pnFurnitureLayout.setHorizontalGroup(
            pnFurnitureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        pnFurnitureLayout.setVerticalGroup(
            pnFurnitureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        pnClothes.setBackground(new java.awt.Color(0, 0, 0));
        pnClothes.addMouseListener(new java.awt.event.MouseAdapter() {
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

        jLabel20.setFont(new java.awt.Font("Traditional Arabic", 0, 20)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Home_25px.png"))); // NOI18N
        jLabel20.setText("     Clothes");

        javax.swing.GroupLayout pnClothesLayout = new javax.swing.GroupLayout(pnClothes);
        pnClothes.setLayout(pnClothesLayout);
        pnClothesLayout.setHorizontalGroup(
            pnClothesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        pnClothesLayout.setVerticalGroup(
            pnClothesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        pnShoes.setBackground(new java.awt.Color(0, 0, 0));
        pnShoes.addMouseListener(new java.awt.event.MouseAdapter() {
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

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Traditional Arabic", 0, 20)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Home_25px.png"))); // NOI18N
        jLabel21.setText("    Games");

        javax.swing.GroupLayout pnShoesLayout = new javax.swing.GroupLayout(pnShoes);
        pnShoes.setLayout(pnShoesLayout);
        pnShoesLayout.setHorizontalGroup(
            pnShoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        pnShoesLayout.setVerticalGroup(
            pnShoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        pnCart.setBackground(new java.awt.Color(0, 0, 0));
        pnCart.addMouseListener(new java.awt.event.MouseAdapter() {
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

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Traditional Arabic", 0, 20)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Home_25px.png"))); // NOI18N
        jLabel23.setText("    Cart");

        javax.swing.GroupLayout pnCartLayout = new javax.swing.GroupLayout(pnCart);
        pnCart.setLayout(pnCartLayout);
        pnCartLayout.setHorizontalGroup(
            pnCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        pnCartLayout.setVerticalGroup(
            pnCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        PnElectronic.setBackground(new java.awt.Color(0, 0, 0));
        PnElectronic.addMouseListener(new java.awt.event.MouseAdapter() {
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

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Traditional Arabic", 0, 20)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Home_25px.png"))); // NOI18N
        jLabel24.setText("    Eelectronic");

        javax.swing.GroupLayout PnElectronicLayout = new javax.swing.GroupLayout(PnElectronic);
        PnElectronic.setLayout(PnElectronicLayout);
        PnElectronicLayout.setHorizontalGroup(
            PnElectronicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnElectronicLayout.createSequentialGroup()
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PnElectronicLayout.setVerticalGroup(
            PnElectronicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        icon_lbl.setBackground(new java.awt.Color(255, 255, 255));
        icon_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_lbl.setIcon(new javax.swing.ImageIcon("D:\\resize\\127412176-x-z-x-z-logo-initial-vector-mark-initial-letter-x-z-x-z-luxury-art-vector-mark-logo-rose-gold-silver-removebg-preview (3).png")); // NOI18N

        pnHelp.setBackground(new java.awt.Color(0, 0, 0));
        pnHelp.addMouseListener(new java.awt.event.MouseAdapter() {
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

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Traditional Arabic", 0, 20)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Home_25px.png"))); // NOI18N
        jLabel22.setText("    Hlep");

        javax.swing.GroupLayout pnHelpLayout = new javax.swing.GroupLayout(pnHelp);
        pnHelp.setLayout(pnHelpLayout);
        pnHelpLayout.setHorizontalGroup(
            pnHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        pnHelpLayout.setVerticalGroup(
            pnHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout MenuBarLayout = new javax.swing.GroupLayout(MenuBar);
        MenuBar.setLayout(MenuBarLayout);
        MenuBarLayout.setHorizontalGroup(
            MenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PnElectronic, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pnFurniture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pnClothes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pnShoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pnCart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnHelp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        MenuBarLayout.setVerticalGroup(
            MenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuBarLayout.createSequentialGroup()
                .addComponent(icon_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PnElectronic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnFurniture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnClothes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnShoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnCart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        kGradientPanel1.add(MenuBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 790));

        jPanel4.setLayout(new java.awt.CardLayout());

        Home.setBackground(new java.awt.Color(0, 0, 0));
        Home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel2.setkEndColor(new java.awt.Color(0, 0, 0));
        kGradientPanel2.setkStartColor(new java.awt.Color(0, 0, 0));

        jLabel7.setFont(new java.awt.Font("Traditional Arabic", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Stay Update on Latest Offers");

        jLabel6.setFont(new java.awt.Font("Traditional Arabic", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 102));
        jLabel6.setText("Shopping App");

        jLabel5.setFont(new java.awt.Font("Vijaya", 1, 100)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\resize\\127412176-x-z-x-z-logo-initial-vector-mark-initial-letter-x-z-x-z-luxury-art-vector-mark-logo-rose-gold-silver-removebg-preview (3).png")); // NOI18N

        jTextField1.setBackground(new java.awt.Color(102, 0, 0));
        jTextField1.setFont(new java.awt.Font("Traditional Arabic", 0, 20)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Search");
        jTextField1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Search_25px_2.png"))); // NOI18N
        jLabel4.setText("  ");

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51))
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)))
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        jPanel6.add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 378, -1));

        Home.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 307));

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\resize\\s (1).png")); // NOI18N
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 307));
        jLabel2.getAccessibleContext().setAccessibleDescription("");

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\resize\\v.png")); // NOI18N
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 720, 307));

        jLabel9.setIcon(new javax.swing.ImageIcon("D:\\resize\\q.png")); // NOI18N
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 0, 720, 307));

        Home.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 720, 307));

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel9.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 480));

        jLabel10.setIcon(new javax.swing.ImageIcon("D:\\resize\\pexels-photo-325153.png")); // NOI18N
        jPanel8.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 500));

        jLabel11.setIcon(new javax.swing.ImageIcon("D:\\resize\\pexels-ylanite-koppens-934064.png")); // NOI18N
        jLabel11.setText("jLabel11");
        jPanel8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 0, 1090, 490));

        Home.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 1100, 480));

        jPanel4.add(Home, "card2");

        Eletronic.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setBackground(new java.awt.Color(255, 51, 0));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(1060, 1085));

        kGradientPanel6.setBackground(new java.awt.Color(255, 0, 51));
        kGradientPanel6.setForeground(new java.awt.Color(0, 204, 204));
        kGradientPanel6.setkEndColor(new java.awt.Color(204, 255, 204));
        kGradientPanel6.setkGradientFocus(1500);
        kGradientPanel6.setkStartColor(new java.awt.Color(0, 0, 0));
        kGradientPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel22.setBackground(new java.awt.Color(250, 250, 250));

        item5_name.setFont(new java.awt.Font("Georgia Pro Cond Semibold", 0, 14)); // NOI18N

        item5_price.setFont(new java.awt.Font("Georgia Pro Cond Semibold", 0, 14)); // NOI18N

        jSpinner_item5.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner_item5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                stateChange(evt);
            }
        });

        item5_btn.setBackground(new java.awt.Color(204, 255, 102));
        item5_btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        item5_btn.setText("Add to Cart");
        item5_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Electronic_mouse_clicked_(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(item5_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(item5_price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner_item5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(item5_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(item5_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addComponent(item5_img, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item5_name, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(item5_price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSpinner_item5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item5_btn)
                .addGap(4, 4, 4))
        );

        kGradientPanel6.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 235, 313));

        jPanel10.setBackground(new java.awt.Color(250, 250, 250));

        item2_name.setFont(new java.awt.Font("Georgia Pro Cond Semibold", 0, 14)); // NOI18N

        item2_price.setFont(new java.awt.Font("Georgia Pro Cond Semibold", 0, 14)); // NOI18N

        jSpinner_item2.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner_item2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                stateChange(evt);
            }
        });

        item2_btn.setBackground(new java.awt.Color(204, 255, 102));
        item2_btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        item2_btn.setText("Add to Cart");
        item2_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Electronic_mouse_clicked_(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(item2_img, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(item2_name, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(item2_price, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner_item2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(item2_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(item2_img, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item2_name, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinner_item2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item2_price, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item2_btn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kGradientPanel6.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 235, 313));

        jPanel11.setBackground(new java.awt.Color(250, 250, 250));

        item3_name.setFont(new java.awt.Font("Georgia Pro Cond Semibold", 0, 14)); // NOI18N

        item3_price.setFont(new java.awt.Font("Georgia Pro Cond Semibold", 0, 14)); // NOI18N

        item3_btn.setBackground(new java.awt.Color(204, 255, 102));
        item3_btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        item3_btn.setText("Add to Cart");
        item3_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Electronic_mouse_clicked_(evt);
            }
        });

        jSpinner_item3.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner_item3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                stateChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(item3_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(item3_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(item3_price, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner_item3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(item3_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(item3_img, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item3_name, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(item3_price, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner_item3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(item3_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        kGradientPanel6.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 235, 313));

        jPanel12.setBackground(new java.awt.Color(250, 250, 250));

        item4_name.setFont(new java.awt.Font("Georgia Pro Cond Semibold", 0, 14)); // NOI18N

        item4_price.setFont(new java.awt.Font("Georgia Pro Cond Semibold", 0, 14)); // NOI18N

        jSpinner_item4.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner_item4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                stateChange(evt);
            }
        });

        item4_btn.setBackground(new java.awt.Color(204, 255, 102));
        item4_btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        item4_btn.setText("Add to Cart");
        item4_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Electronic_mouse_clicked_(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(item4_img, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(item4_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(item4_price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner_item4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(item4_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(item4_img, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item4_name, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(item4_price, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner_item4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(item4_btn)
                .addGap(23, 23, 23))
        );

        kGradientPanel6.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 60, 235, 313));

        jPanel14.setBackground(new java.awt.Color(250, 250, 250));

        item1_name.setFont(new java.awt.Font("Georgia Pro Cond Semibold", 0, 14)); // NOI18N

        item1_price.setFont(new java.awt.Font("Georgia Pro Cond Semibold", 0, 14)); // NOI18N

        item1_btn.setBackground(new java.awt.Color(204, 255, 102));
        item1_btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        item1_btn.setText("Add to Cart");
        item1_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Electronic_mouse_clicked_(evt);
            }
        });

        jSpinner_item1.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner_item1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                stateChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(item1_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(item1_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item1_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel14Layout.createSequentialGroup()
                        .addComponent(item1_price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner_item1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(item1_img, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(item1_name, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSpinner_item1)
                    .addComponent(item1_price, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item1_btn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kGradientPanel6.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 235, 313));

        jPanel15.setBackground(new java.awt.Color(250, 250, 250));

        item6_price.setFont(new java.awt.Font("Georgia Pro Cond Semibold", 0, 14)); // NOI18N

        item6_name.setFont(new java.awt.Font("Georgia Pro Cond Semibold", 0, 14)); // NOI18N

        jSpinner_item6.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner_item6.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                stateChange(evt);
            }
        });

        item6_btn.setBackground(new java.awt.Color(204, 255, 102));
        item6_btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        item6_btn.setText("Add to Cart");
        item6_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Electronic_mouse_clicked_(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(item6_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(item6_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(item6_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel15Layout.createSequentialGroup()
                                .addComponent(item6_price, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner_item6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(item6_img, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(item6_name, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(item6_price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSpinner_item6, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item6_btn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kGradientPanel6.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 235, 313));

        jPanel16.setBackground(new java.awt.Color(250, 250, 250));

        item7_name.setFont(new java.awt.Font("Georgia Pro Cond Semibold", 0, 14)); // NOI18N

        item7_price.setFont(new java.awt.Font("Georgia Pro Cond Semibold", 0, 14)); // NOI18N

        item7_btn.setBackground(new java.awt.Color(204, 255, 102));
        item7_btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        item7_btn.setText("Add to Cart");
        item7_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Electronic_mouse_clicked_(evt);
            }
        });

        jSpinner_item7.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner_item7.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                stateChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(item7_img, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel16Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(item7_price, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner_item7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(item7_btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(item7_name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(item7_img, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item7_name, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(item7_price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSpinner_item7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item7_btn)
                .addGap(7, 7, 7))
        );

        kGradientPanel6.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 235, 313));

        jPanel17.setBackground(new java.awt.Color(250, 250, 250));

        item8_name.setFont(new java.awt.Font("Georgia Pro Cond Semibold", 0, 14)); // NOI18N

        item8_price.setFont(new java.awt.Font("Georgia Pro Cond Semibold", 0, 14)); // NOI18N

        jSpinner_item8.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner_item8.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                stateChange(evt);
            }
        });

        item8_btn.setBackground(new java.awt.Color(204, 255, 102));
        item8_btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        item8_btn.setText("Add to Cart");
        item8_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Electronic_mouse_clicked_(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(item8_img, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(item8_price, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner_item8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(item8_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(item8_name, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(item8_img, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item8_name, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(item8_price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSpinner_item8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item8_btn)
                .addGap(5, 5, 5))
        );

        kGradientPanel6.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 410, 235, 313));

        jPanel25.setBackground(new java.awt.Color(250, 250, 250));

        item10_name.setFont(new java.awt.Font("Georgia Pro Cond Semibold", 0, 14)); // NOI18N

        item10_price.setFont(new java.awt.Font("Georgia Pro Cond Semibold", 0, 14)); // NOI18N

        jSpinner_item10.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner_item10.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                stateChange(evt);
            }
        });

        item10_btn.setBackground(new java.awt.Color(204, 255, 102));
        item10_btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        item10_btn.setText("Add to Cart");
        item10_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Electronic_mouse_clicked_(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(item10_img, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel25Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(item10_price, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner_item10, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(item10_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item10_name, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addComponent(item10_img, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item10_name, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(item10_price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSpinner_item10, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item10_btn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kGradientPanel6.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 760, 235, 313));

        jPanel29.setBackground(new java.awt.Color(250, 250, 250));

        item11_name.setFont(new java.awt.Font("Georgia Pro Cond Semibold", 0, 14)); // NOI18N

        item11_price.setFont(new java.awt.Font("Georgia Pro Cond Semibold", 0, 14)); // NOI18N

        item11_btn.setBackground(new java.awt.Color(204, 255, 102));
        item11_btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        item11_btn.setText("Add to Cart");
        item11_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Electronic_mouse_clicked_(evt);
            }
        });

        jSpinner_item11.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner_item11.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                stateChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(item11_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(item11_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(item11_price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner_item11, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(item11_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addComponent(item11_img, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item11_name, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(item11_price, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jSpinner_item11, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(item11_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        kGradientPanel6.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 760, 235, 313));

        jPanel30.setBackground(new java.awt.Color(250, 250, 250));

        item12_name.setFont(new java.awt.Font("Georgia Pro Cond Semibold", 0, 14)); // NOI18N

        item12_price.setFont(new java.awt.Font("Georgia Pro Cond Semibold", 0, 14)); // NOI18N

        jSpinner_item12.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner_item12.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                stateChange(evt);
            }
        });

        item12_btn.setBackground(new java.awt.Color(204, 255, 102));
        item12_btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        item12_btn.setText("Add to Cart");
        item12_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Electronic_mouse_clicked_(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(item12_img, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(item12_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(item12_price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner_item12, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(item12_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addComponent(item12_img, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item12_name, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(item12_price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSpinner_item12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(item12_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        kGradientPanel6.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 760, 235, 313));

        jPanel31.setBackground(new java.awt.Color(250, 250, 250));

        item9_name.setFont(new java.awt.Font("Georgia Pro Cond Semibold", 0, 14)); // NOI18N

        item9_price.setFont(new java.awt.Font("Georgia Pro Cond Semibold", 0, 14)); // NOI18N

        item9_btn.setBackground(new java.awt.Color(204, 255, 102));
        item9_btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        item9_btn.setText("Add to Cart");
        item9_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Electronic_mouse_clicked_(evt);
            }
        });

        jSpinner_item9.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner_item9.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                stateChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(item9_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(item9_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel31Layout.createSequentialGroup()
                        .addComponent(item9_price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner_item9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(item9_btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addComponent(item9_img, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(item9_name, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSpinner_item9)
                    .addComponent(item9_price, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item9_btn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kGradientPanel6.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 760, 235, 313));

        jScrollPane2.setViewportView(kGradientPanel6);

        javax.swing.GroupLayout EletronicLayout = new javax.swing.GroupLayout(Eletronic);
        Eletronic.setLayout(EletronicLayout);
        EletronicLayout.setHorizontalGroup(
            EletronicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EletronicLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1090, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        EletronicLayout.setVerticalGroup(
            EletronicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
        );

        jPanel4.add(Eletronic, "card3");

        jScrollPane4.setBackground(new java.awt.Color(255, 51, 0));

        kGradientPanel7.setBackground(new java.awt.Color(255, 0, 51));
        kGradientPanel7.setForeground(new java.awt.Color(0, 204, 204));
        kGradientPanel7.setkEndColor(new java.awt.Color(204, 255, 204));
        kGradientPanel7.setkGradientFocus(1500);
        kGradientPanel7.setkStartColor(new java.awt.Color(0, 0, 0));
        kGradientPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel23.setBackground(new java.awt.Color(250, 250, 250));

        jSpinner_F_item5.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner_F_item5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                state_change_for_F_item(evt);
            }
        });

        btn_F_item5.setBackground(new java.awt.Color(204, 255, 102));
        btn_F_item5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_F_item5.setText("Add to Cart");
        btn_F_item5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_f_item_mouse_clicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(item5_price1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner_F_item5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(btn_F_item5, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(item5_name1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(item5_img1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addComponent(item5_img1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item5_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(item5_price1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSpinner_F_item5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_F_item5)
                .addGap(4, 4, 4))
        );

        kGradientPanel7.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 235, 313));

        jPanel13.setBackground(new java.awt.Color(250, 250, 250));

        jSpinner_F_item2.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner_F_item2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                state_change_for_F_item(evt);
            }
        });

        btn_F_item2.setBackground(new java.awt.Color(204, 255, 102));
        btn_F_item2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_F_item2.setText("Add to Cart");
        btn_F_item2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_f_item_mouse_clicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(item2_img1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel13Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(item2_price1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(jSpinner_F_item2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(item2_name1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_F_item2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(item2_img1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item2_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(item2_price1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSpinner_F_item2, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_F_item2)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        kGradientPanel7.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 235, 313));

        jPanel18.setBackground(new java.awt.Color(250, 250, 250));

        btn_F_item3.setBackground(new java.awt.Color(204, 255, 102));
        btn_F_item3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_F_item3.setText("Add to Cart");
        btn_F_item3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_f_item_mouse_clicked(evt);
            }
        });

        jSpinner_F_item3.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner_F_item3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                state_change_for_F_item(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(item3_img1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(item3_name1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(item3_price1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner_F_item3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(btn_F_item3, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(item3_img1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item3_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(item3_price1, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jSpinner_F_item3, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_F_item3)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        kGradientPanel7.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 235, 313));

        jPanel19.setBackground(new java.awt.Color(250, 250, 250));

        jSpinner_F_item4.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner_F_item4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                state_change_for_F_item(evt);
            }
        });

        btn_F_item4.setBackground(new java.awt.Color(204, 255, 102));
        btn_F_item4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_F_item4.setText("Add to Cart");
        btn_F_item4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_f_item_mouse_clicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(item4_img1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(item4_price1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner_F_item4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(btn_F_item4, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(item4_name1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(item4_img1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item4_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(item4_price1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSpinner_F_item4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_F_item4)
                .addGap(5, 5, 5))
        );

        kGradientPanel7.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 60, 235, 313));

        jPanel20.setBackground(new java.awt.Color(250, 250, 250));

        item1_img1.setBackground(new java.awt.Color(255, 255, 255));

        item1_name1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        item1_price1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btn_F_item1.setBackground(new java.awt.Color(204, 255, 102));
        btn_F_item1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_F_item1.setText("Add to Cart");
        btn_F_item1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_f_item_mouse_clicked(evt);
            }
        });

        jSpinner_F_item1.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner_F_item1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                state_change_for_F_item(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(item1_name1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addComponent(item1_price1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner_F_item1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_F_item1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addComponent(item1_img1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(item1_img1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item1_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSpinner_F_item1)
                    .addComponent(item1_price1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_F_item1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kGradientPanel7.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 235, 313));

        jPanel21.setBackground(new java.awt.Color(250, 250, 250));

        jSpinner_F_item6.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner_F_item6.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                state_change_for_F_item(evt);
            }
        });

        btn_F_item6.setBackground(new java.awt.Color(204, 255, 102));
        btn_F_item6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_F_item6.setText("Add to Cart");
        btn_F_item6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_f_item_mouse_clicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(item6_img1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(item6_price1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner_F_item6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(item6_name1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_F_item6, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(item6_img1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(item6_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(item6_price1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSpinner_F_item6, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_F_item6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kGradientPanel7.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 235, 313));

        jPanel24.setBackground(new java.awt.Color(250, 250, 250));

        btn_F_item7.setBackground(new java.awt.Color(204, 255, 102));
        btn_F_item7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_F_item7.setText("Add to Cart");
        btn_F_item7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_f_item_mouse_clicked(evt);
            }
        });

        jSpinner_F_item7.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner_F_item7.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                state_change_for_F_item(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addComponent(item7_img1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(item7_name1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel24Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(item7_price1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner_F_item7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_F_item7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addComponent(item7_img1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item7_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(item7_price1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSpinner_F_item7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_F_item7)
                .addGap(7, 7, 7))
        );

        kGradientPanel7.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 235, 313));

        jPanel26.setBackground(new java.awt.Color(250, 250, 250));

        jSpinner_F_item8.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner_F_item8.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                state_change_for_F_item(evt);
            }
        });

        btn_F_item8.setBackground(new java.awt.Color(204, 255, 102));
        btn_F_item8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_F_item8.setText("Add to Cart");
        btn_F_item8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_f_item_mouse_clicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(item8_img1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item8_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_F_item8, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addComponent(item8_price1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner_F_item8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addComponent(item8_img1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item8_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(item8_price1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSpinner_F_item8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_F_item8)
                .addGap(5, 5, 5))
        );

        kGradientPanel7.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 410, 235, 313));

        jPanel27.setBackground(new java.awt.Color(250, 250, 250));

        jSpinner_F_item10.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner_F_item10.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                state_change_for_F_item(evt);
            }
        });

        btn_F_item10.setBackground(new java.awt.Color(204, 255, 102));
        btn_F_item10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_F_item10.setText("Add to Cart");
        btn_F_item10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_f_item_mouse_clicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(item10_img1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel27Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(item10_price1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(jSpinner_F_item10, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(item10_name1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_F_item10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addComponent(item10_img1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item10_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(item10_price1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSpinner_F_item10, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_F_item10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kGradientPanel7.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 760, 235, 313));

        jPanel32.setBackground(new java.awt.Color(250, 250, 250));

        btn_F_item11.setBackground(new java.awt.Color(204, 255, 102));
        btn_F_item11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_F_item11.setText("Add to Cart");
        btn_F_item11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_f_item_mouse_clicked(evt);
            }
        });
        btn_F_item11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_F_item11ActionPerformed(evt);
            }
        });

        jSpinner_F_item11.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner_F_item11.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                state_change_for_F_item(evt);
            }
        });

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(item11_img1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(item11_name1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_F_item11, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addGroup(jPanel32Layout.createSequentialGroup()
                                .addComponent(item11_price1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner_F_item11, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addComponent(item11_img1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item11_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(item11_price1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSpinner_F_item11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_F_item11)
                .addContainerGap())
        );

        kGradientPanel7.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 760, 235, 313));

        jPanel33.setBackground(new java.awt.Color(250, 250, 250));

        jSpinner_F_item12.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner_F_item12.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                state_change_for_F_item(evt);
            }
        });

        btn_F_item12.setBackground(new java.awt.Color(204, 255, 102));
        btn_F_item12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_F_item12.setText("Add to Cart");
        btn_F_item12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_f_item_mouse_clicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(item12_img1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(item12_name1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel33Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_F_item12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel33Layout.createSequentialGroup()
                                .addComponent(item12_price1, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner_F_item12, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addComponent(item12_img1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item12_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinner_F_item12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item12_price1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_F_item12)
                .addContainerGap())
        );

        kGradientPanel7.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 760, 235, 313));

        jPanel34.setBackground(new java.awt.Color(250, 250, 250));

        item9_name1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        item9_price1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btn_F_item9.setBackground(new java.awt.Color(204, 255, 102));
        btn_F_item9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_F_item9.setText("Add to Cart");
        btn_F_item9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_f_item_mouse_clicked(evt);
            }
        });
        btn_F_item9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_F_item9ActionPerformed(evt);
            }
        });

        jSpinner_F_item9.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner_F_item9.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                state_change_for_F_item(evt);
            }
        });

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(item9_img1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(item9_name1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_F_item9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel34Layout.createSequentialGroup()
                                .addComponent(item9_price1, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner_F_item9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addComponent(item9_img1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(item9_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSpinner_F_item9)
                    .addComponent(item9_price1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_F_item9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kGradientPanel7.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 760, 235, 313));

        jScrollPane4.setViewportView(kGradientPanel7);

        javax.swing.GroupLayout FurnitureLayout = new javax.swing.GroupLayout(Furniture);
        Furniture.setLayout(FurnitureLayout);
        FurnitureLayout.setHorizontalGroup(
            FurnitureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FurnitureLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1090, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FurnitureLayout.setVerticalGroup(
            FurnitureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FurnitureLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel4.add(Furniture, "card5");

        jScrollPane5.setBackground(new java.awt.Color(255, 51, 0));

        kGradientPanel8.setBackground(new java.awt.Color(255, 0, 51));
        kGradientPanel8.setForeground(new java.awt.Color(0, 204, 204));
        kGradientPanel8.setkEndColor(new java.awt.Color(204, 255, 204));
        kGradientPanel8.setkGradientFocus(1500);
        kGradientPanel8.setkStartColor(new java.awt.Color(0, 0, 0));
        kGradientPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel28.setBackground(new java.awt.Color(250, 250, 250));

        jSpinner_C_item5.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner_C_item5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                State_Change_For_C_Item(evt);
            }
        });

        btn_C_item5.setBackground(new java.awt.Color(204, 255, 102));
        btn_C_item5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_C_item5.setText("Add to Cart");
        btn_C_item5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_C_item_mouse_clicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(item5_price2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner_C_item5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(btn_C_item5, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(item5_name2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(item5_img2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addComponent(item5_img2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item5_name2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(item5_price2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSpinner_C_item5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_C_item5)
                .addGap(4, 4, 4))
        );

        kGradientPanel8.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 235, 313));

        jPanel35.setBackground(new java.awt.Color(250, 250, 250));

        jSpinner_C_item2.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner_C_item2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                State_Change_For_C_Item(evt);
            }
        });

        btn_C_item2.setBackground(new java.awt.Color(204, 255, 102));
        btn_C_item2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_C_item2.setText("Add to Cart");
        btn_C_item2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_C_item_mouse_clicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(item2_img2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel35Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(item2_price2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(jSpinner_C_item2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(item2_name2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_C_item2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addComponent(item2_img2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item2_name2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(item2_price2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSpinner_C_item2, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_C_item2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kGradientPanel8.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 235, 313));

        jPanel36.setBackground(new java.awt.Color(250, 250, 250));

        btn_C_item3.setBackground(new java.awt.Color(204, 255, 102));
        btn_C_item3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_C_item3.setText("Add to Cart");
        btn_C_item3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_C_item_mouse_clicked(evt);
            }
        });

        jSpinner_C_item3.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner_C_item3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                State_Change_For_C_Item(evt);
            }
        });

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(item3_img2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(item3_name2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addComponent(item3_price2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner_C_item3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addComponent(btn_C_item3, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addComponent(item3_img2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item3_name2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(item3_price2, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jSpinner_C_item3, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_C_item3)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        kGradientPanel8.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 235, 313));

        jPanel37.setBackground(new java.awt.Color(250, 250, 250));

        jSpinner_C_item4.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner_C_item4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                State_Change_For_C_Item(evt);
            }
        });

        btn_C_item4.setBackground(new java.awt.Color(204, 255, 102));
        btn_C_item4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_C_item4.setText("Add to Cart");
        btn_C_item4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_C_item_mouse_clicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(item4_img2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addComponent(item4_price2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner_C_item4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addComponent(btn_C_item4, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(item4_name2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addComponent(item4_img2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item4_name2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(item4_price2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSpinner_C_item4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_C_item4)
                .addGap(23, 23, 23))
        );

        kGradientPanel8.add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 60, 235, 313));

        jPanel38.setBackground(new java.awt.Color(250, 250, 250));

        item1_name2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        item1_price2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btn_C_item1.setBackground(new java.awt.Color(204, 255, 102));
        btn_C_item1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_C_item1.setText("Add to Cart");
        btn_C_item1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_C_item_mouse_clicked(evt);
            }
        });

        jSpinner_C_item1.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner_C_item1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                State_Change_For_C_Item(evt);
            }
        });

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(item1_img2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(item1_name2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel38Layout.createSequentialGroup()
                                .addComponent(item1_price2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner_C_item1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_C_item1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addComponent(item1_img2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(item1_name2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSpinner_C_item1)
                    .addComponent(item1_price2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_C_item1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kGradientPanel8.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 235, 313));

        jPanel39.setBackground(new java.awt.Color(250, 250, 250));

        jSpinner_C_item6.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner_C_item6.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                State_Change_For_C_Item(evt);
            }
        });

        btn_C_item6.setBackground(new java.awt.Color(204, 255, 102));
        btn_C_item6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_C_item6.setText("Add to Cart");
        btn_C_item6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_C_item_mouse_clicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(item6_img2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(item6_price2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner_C_item6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(item6_name2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel39Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_C_item6, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addComponent(item6_img2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(item6_name2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(item6_price2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSpinner_C_item6, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_C_item6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kGradientPanel8.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 235, 313));

        jPanel40.setBackground(new java.awt.Color(250, 250, 250));

        btn_C_item7.setBackground(new java.awt.Color(204, 255, 102));
        btn_C_item7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_C_item7.setText("Add to Cart");
        btn_C_item7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_C_item_mouse_clicked(evt);
            }
        });

        jSpinner_C_item7.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner_C_item7.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                State_Change_For_C_Item(evt);
            }
        });

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addComponent(item7_img2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(item7_name2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel40Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(item7_price2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner_C_item7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_C_item7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addComponent(item7_img2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item7_name2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(item7_price2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSpinner_C_item7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_C_item7)
                .addGap(7, 7, 7))
        );

        kGradientPanel8.add(jPanel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 235, 313));

        jPanel41.setBackground(new java.awt.Color(250, 250, 250));

        jSpinner_C_item8.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner_C_item8.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                State_Change_For_C_Item(evt);
            }
        });

        btn_C_item8.setBackground(new java.awt.Color(204, 255, 102));
        btn_C_item8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_C_item8.setText("Add to Cart");
        btn_C_item8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_C_item_mouse_clicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(item8_img2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel41Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(item8_price2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner_C_item8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_C_item8, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(item8_name2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addComponent(item8_img2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item8_name2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(item8_price2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSpinner_C_item8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_C_item8)
                .addGap(5, 5, 5))
        );

        kGradientPanel8.add(jPanel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 410, 235, 313));

        jPanel42.setBackground(new java.awt.Color(250, 250, 250));

        jSpinner_C_item10.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner_C_item10.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                State_Change_For_C_Item(evt);
            }
        });

        btn_C_item10.setBackground(new java.awt.Color(204, 255, 102));
        btn_C_item10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_C_item10.setText("Add to Cart");
        btn_C_item10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_C_item_mouse_clicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(item10_img2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel42Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(item10_price2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(jSpinner_C_item10, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(item10_name2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_C_item10, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addComponent(item10_img2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item10_name2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(item10_price2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSpinner_C_item10, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_C_item10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kGradientPanel8.add(jPanel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 760, 235, 313));

        jPanel43.setBackground(new java.awt.Color(250, 250, 250));

        btn_C_item11.setBackground(new java.awt.Color(204, 255, 102));
        btn_C_item11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_C_item11.setText("Add to Cart");
        btn_C_item11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_C_item_mouse_clicked(evt);
            }
        });

        jSpinner_C_item11.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner_C_item11.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                State_Change_For_C_Item(evt);
            }
        });

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(item11_img2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(item11_name2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addComponent(item11_price2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner_C_item11, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addComponent(btn_C_item11, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addComponent(item11_img2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item11_name2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(item11_price2, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jSpinner_C_item11, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_C_item11)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        kGradientPanel8.add(jPanel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 760, 235, 313));

        jPanel44.setBackground(new java.awt.Color(250, 250, 250));

        jSpinner_C_item12.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner_C_item12.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                State_Change_For_C_Item(evt);
            }
        });

        btn_C_item12.setBackground(new java.awt.Color(204, 255, 102));
        btn_C_item12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_C_item12.setText("Add to Cart");
        btn_C_item12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_C_item_mouse_clicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(item12_img2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addComponent(item12_price2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner_C_item12, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addComponent(btn_C_item12, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(item12_name2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addComponent(item12_img2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item12_name2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(item12_price2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSpinner_C_item12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_C_item12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        kGradientPanel8.add(jPanel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 760, 235, 313));

        jPanel45.setBackground(new java.awt.Color(250, 250, 250));

        item9_name2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        item9_price2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btn_C_item9.setBackground(new java.awt.Color(204, 255, 102));
        btn_C_item9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_C_item9.setText("Add to Cart");
        btn_C_item9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_C_item_mouse_clicked(evt);
            }
        });

        jSpinner_C_item9.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner_C_item9.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                State_Change_For_C_Item(evt);
            }
        });

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(item9_img2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(item9_name2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel45Layout.createSequentialGroup()
                                .addComponent(item9_price2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner_C_item9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_C_item9, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addComponent(item9_img2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(item9_name2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSpinner_C_item9)
                    .addComponent(item9_price2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_C_item9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kGradientPanel8.add(jPanel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 760, 235, 313));

        jScrollPane5.setViewportView(kGradientPanel8);

        javax.swing.GroupLayout ClothesLayout = new javax.swing.GroupLayout(Clothes);
        Clothes.setLayout(ClothesLayout);
        ClothesLayout.setHorizontalGroup(
            ClothesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClothesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1090, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ClothesLayout.setVerticalGroup(
            ClothesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
        );

        jPanel4.add(Clothes, "card6");

        jScrollPane6.setBackground(new java.awt.Color(255, 51, 0));

        kGradientPanel9.setBackground(new java.awt.Color(255, 0, 51));
        kGradientPanel9.setForeground(new java.awt.Color(0, 204, 204));
        kGradientPanel9.setkEndColor(new java.awt.Color(204, 255, 204));
        kGradientPanel9.setkGradientFocus(1500);
        kGradientPanel9.setkStartColor(new java.awt.Color(0, 0, 0));
        kGradientPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel46.setBackground(new java.awt.Color(250, 250, 250));

        jSpinner_G_item5.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner_G_item5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                State_Change_For_G_Item(evt);
            }
        });

        btn_G_item5.setBackground(new java.awt.Color(204, 255, 102));
        btn_G_item5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_G_item5.setText("Add to Cart");
        btn_G_item5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_G_item_mouse_clicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel46Layout.createSequentialGroup()
                        .addComponent(item5_price3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner_G_item5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel46Layout.createSequentialGroup()
                        .addComponent(btn_G_item5, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(item5_name3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(item5_img3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addComponent(item5_img3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item5_name3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(item5_price3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSpinner_G_item5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_G_item5)
                .addGap(4, 4, 4))
        );

        kGradientPanel9.add(jPanel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 235, 313));

        jPanel47.setBackground(new java.awt.Color(250, 250, 250));

        jSpinner_G_item2.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner_G_item2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                State_Change_For_G_Item(evt);
            }
        });

        btn_G_item2.setBackground(new java.awt.Color(204, 255, 102));
        btn_G_item2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_G_item2.setText("Add to Cart");
        btn_G_item2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_G_item_mouse_clicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(item2_img3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel47Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(item2_price3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(jSpinner_G_item2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(item2_name3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_G_item2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addComponent(item2_img3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item2_name3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(item2_price3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSpinner_G_item2, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_G_item2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kGradientPanel9.add(jPanel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 235, 313));

        jPanel48.setBackground(new java.awt.Color(250, 250, 250));

        btn_G_item3.setBackground(new java.awt.Color(204, 255, 102));
        btn_G_item3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_G_item3.setText("Add to Cart");
        btn_G_item3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_G_item_mouse_clicked(evt);
            }
        });

        jSpinner_G_item3.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner_G_item3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                State_Change_For_G_Item(evt);
            }
        });

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(item3_img3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(item3_name3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel48Layout.createSequentialGroup()
                        .addComponent(item3_price3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner_G_item3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel48Layout.createSequentialGroup()
                        .addComponent(btn_G_item3, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addComponent(item3_img3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item3_name3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(item3_price3, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jSpinner_G_item3, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_G_item3)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        kGradientPanel9.add(jPanel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 235, 313));

        jPanel49.setBackground(new java.awt.Color(250, 250, 250));

        jSpinner_G_item4.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner_G_item4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                State_Change_For_G_Item(evt);
            }
        });

        btn_G_item4.setBackground(new java.awt.Color(204, 255, 102));
        btn_G_item4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_G_item4.setText("Add to Cart");
        btn_G_item4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_G_item_mouse_clicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(item4_img3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel49Layout.createSequentialGroup()
                        .addComponent(item4_price3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner_G_item4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel49Layout.createSequentialGroup()
                        .addComponent(btn_G_item4, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(item4_name3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addComponent(item4_img3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item4_name3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(item4_price3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSpinner_G_item4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_G_item4)
                .addGap(23, 23, 23))
        );

        kGradientPanel9.add(jPanel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 60, 235, 313));

        jPanel50.setBackground(new java.awt.Color(250, 250, 250));

        item1_name3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        item1_price3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btn_G_item1.setBackground(new java.awt.Color(204, 255, 102));
        btn_G_item1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_G_item1.setText("Add to Cart");
        btn_G_item1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_G_item_mouse_clicked(evt);
            }
        });

        jSpinner_G_item1.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner_G_item1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                State_Change_For_G_Item(evt);
            }
        });

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(item1_img3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(item1_name3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel50Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel50Layout.createSequentialGroup()
                                .addComponent(item1_price3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner_G_item1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_G_item1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addComponent(item1_img3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(item1_name3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSpinner_G_item1)
                    .addComponent(item1_price3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_G_item1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kGradientPanel9.add(jPanel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 235, 313));

        jPanel51.setBackground(new java.awt.Color(250, 250, 250));

        jSpinner_G_item6.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner_G_item6.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                State_Change_For_G_Item(evt);
            }
        });

        btn_G_item6.setBackground(new java.awt.Color(204, 255, 102));
        btn_G_item6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_G_item6.setText("Add to Cart");
        btn_G_item6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_G_item_mouse_clicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(item6_img3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel51Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(item6_price3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner_G_item6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(item6_name3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel51Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_G_item6, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addComponent(item6_img3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(item6_name3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(item6_price3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSpinner_G_item6, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_G_item6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kGradientPanel9.add(jPanel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 235, 313));

        jPanel52.setBackground(new java.awt.Color(250, 250, 250));

        btn_G_item7.setBackground(new java.awt.Color(204, 255, 102));
        btn_G_item7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_G_item7.setText("Add to Cart");
        btn_G_item7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_G_item_mouse_clicked(evt);
            }
        });

        jSpinner_G_item7.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner_G_item7.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                State_Change_For_G_Item(evt);
            }
        });

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addComponent(item7_img3, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel52Layout.createSequentialGroup()
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(item7_name3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel52Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel52Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(item7_price3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner_G_item7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_G_item7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addComponent(item7_img3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item7_name3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(item7_price3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSpinner_G_item7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_G_item7)
                .addGap(7, 7, 7))
        );

        kGradientPanel9.add(jPanel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 235, 313));

        jPanel53.setBackground(new java.awt.Color(250, 250, 250));

        jSpinner_G_item8.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner_G_item8.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                State_Change_For_G_Item(evt);
            }
        });

        btn_G_item8.setBackground(new java.awt.Color(204, 255, 102));
        btn_G_item8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_G_item8.setText("Add to Cart");
        btn_G_item8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_G_item_mouse_clicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(item8_img3, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel53Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel53Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(item8_price3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner_G_item8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_G_item8, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(item8_name3, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addComponent(item8_img3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item8_name3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(item8_price3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSpinner_G_item8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_G_item8)
                .addGap(5, 5, 5))
        );

        kGradientPanel9.add(jPanel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 410, 235, 313));

        jPanel54.setBackground(new java.awt.Color(250, 250, 250));

        jSpinner_G_item10.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner_G_item10.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                State_Change_For_G_Item(evt);
            }
        });

        btn_G_item10.setBackground(new java.awt.Color(204, 255, 102));
        btn_G_item10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_G_item10.setText("Add to Cart");
        btn_G_item10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_G_item_mouse_clicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(item10_img3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel54Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(item10_price3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(jSpinner_G_item10, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(item10_name3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_G_item10, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addComponent(item10_img3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item10_name3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(item10_price3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSpinner_G_item10, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_G_item10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kGradientPanel9.add(jPanel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 760, 235, 313));

        jPanel55.setBackground(new java.awt.Color(250, 250, 250));

        btn_G_item11.setBackground(new java.awt.Color(204, 255, 102));
        btn_G_item11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_G_item11.setText("Add to Cart");
        btn_G_item11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_G_item_mouse_clicked(evt);
            }
        });

        jSpinner_G_item11.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner_G_item11.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                State_Change_For_G_Item(evt);
            }
        });

        javax.swing.GroupLayout jPanel55Layout = new javax.swing.GroupLayout(jPanel55);
        jPanel55.setLayout(jPanel55Layout);
        jPanel55Layout.setHorizontalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(item11_img3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(item11_name3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel55Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel55Layout.createSequentialGroup()
                        .addComponent(item11_price3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner_G_item11, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel55Layout.createSequentialGroup()
                        .addComponent(btn_G_item11, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel55Layout.setVerticalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel55Layout.createSequentialGroup()
                .addComponent(item11_img3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item11_name3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(item11_price3, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jSpinner_G_item11, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_G_item11)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        kGradientPanel9.add(jPanel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 760, 235, 313));

        jPanel56.setBackground(new java.awt.Color(250, 250, 250));

        jSpinner_G_item12.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner_G_item12.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                State_Change_For_G_Item(evt);
            }
        });

        btn_G_item12.setBackground(new java.awt.Color(204, 255, 102));
        btn_G_item12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_G_item12.setText("Add to Cart");
        btn_G_item12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_G_item_mouse_clicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(item12_img3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel56Layout.createSequentialGroup()
                        .addComponent(item12_price3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner_G_item12, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel56Layout.createSequentialGroup()
                        .addComponent(btn_G_item12, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(item12_name3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addComponent(item12_img3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item12_name3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(item12_price3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSpinner_G_item12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_G_item12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        kGradientPanel9.add(jPanel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 760, 235, 313));

        jPanel57.setBackground(new java.awt.Color(250, 250, 250));

        item9_name3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        item9_price3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btn_G_item9.setBackground(new java.awt.Color(204, 255, 102));
        btn_G_item9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_G_item9.setText("Add to Cart");
        btn_G_item9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_G_item_mouse_clicked(evt);
            }
        });

        jSpinner_G_item9.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner_G_item9.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                State_Change_For_G_Item(evt);
            }
        });

        javax.swing.GroupLayout jPanel57Layout = new javax.swing.GroupLayout(jPanel57);
        jPanel57.setLayout(jPanel57Layout);
        jPanel57Layout.setHorizontalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(item9_img3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(item9_name3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel57Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel57Layout.createSequentialGroup()
                                .addComponent(item9_price3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner_G_item9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_G_item9, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel57Layout.setVerticalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addComponent(item9_img3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(item9_name3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSpinner_G_item9)
                    .addComponent(item9_price3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_G_item9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kGradientPanel9.add(jPanel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 760, 235, 313));

        jScrollPane6.setViewportView(kGradientPanel9);

        javax.swing.GroupLayout GamesLayout = new javax.swing.GroupLayout(Games);
        Games.setLayout(GamesLayout);
        GamesLayout.setHorizontalGroup(
            GamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GamesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 1090, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        GamesLayout.setVerticalGroup(
            GamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
        );

        jPanel4.add(Games, "card7");

        Cart.setPreferredSize(new java.awt.Dimension(1190, 914));
        Cart.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Product_Info.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel3.setkEndColor(new java.awt.Color(0, 0, 0));
        kGradientPanel3.setkStartColor(new java.awt.Color(255, 204, 102));

        id.setFont(new java.awt.Font("Traditional Arabic", 0, 14)); // NOI18N

        price.setFont(new java.awt.Font("Traditional Arabic", 0, 14)); // NOI18N

        qty.setFont(new java.awt.Font("Traditional Arabic", 0, 14)); // NOI18N

        name.setFont(new java.awt.Font("Traditional Arabic", 0, 14)); // NOI18N

        total.setFont(new java.awt.Font("Traditional Arabic", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jLabel1.setText("Product_price");

        jLabel8.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jLabel8.setText("Product_ID");

        jLabel12.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jLabel12.setText("Total ");

        jLabel16.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jLabel16.setText("Product_Name");

        jLabel17.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jLabel17.setText("Product_Qty");

        jLabel35.setFont(new java.awt.Font("Traditional Arabic", 0, 24)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("ITEM INFORMATION");

        User_id.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        User_id.setText("1");
        User_id.setEnabled(false);
        User_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                User_idActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jLabel14.setText("User_ID");

        jLabel15.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jLabel15.setText("Order_State");

        Order_State.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Order_State.setText("Pending");
        Order_State.setEnabled(false);
        Order_State.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Order_StateActionPerformed(evt);
            }
        });

        NAME_OF_USER.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        NAME_OF_USER.setEnabled(false);
        NAME_OF_USER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NAME_OF_USERActionPerformed(evt);
            }
        });

        jLabel71.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jLabel71.setText("User_ID");

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(NAME_OF_USER, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(img_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(User_id, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(price, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Order_State, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(qty, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(kGradientPanel3Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(User_id, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Order_State)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(img_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NAME_OF_USER, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        Product_Info.add(kGradientPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 790));

        Cart.add(Product_Info, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, -1));

        Cart_Table.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Cart_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product_ID", "Name", "Price", "Qty", "Total"
            }
        ));
        Cart_Table.setRowHeight(26);
        jScrollPane1.setViewportView(Cart_Table);

        Cart.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 790));

        jCheckBox1.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jCheckBox1.setText("Show");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        Cart.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 750, -1, -1));

        kGradientPanel4.setkEndColor(new java.awt.Color(250, 250, 250));
        kGradientPanel4.setkStartColor(new java.awt.Color(250, 250, 250));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Subtotal :");

        total_tot.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N

        Go_to_address_btn.setBackground(new java.awt.Color(255, 204, 102));
        Go_to_address_btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Go_to_address_btn.setText("Place your order");
        Go_to_address_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Go_to_address_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Go_to_address_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(total_tot, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(total_tot, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(Go_to_address_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Cart.add(kGradientPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 200, 220));

        jPanel4.add(Cart, "card4");

        kGradientPanel5.setkEndColor(new java.awt.Color(0, 204, 204));
        kGradientPanel5.setkGradientFocus(2200);
        kGradientPanel5.setkStartColor(new java.awt.Color(102, 0, 0));
        kGradientPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab_phon_img/snapchat.png"))); // NOI18N
        kGradientPanel5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 138, 70, 70));

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab_phon_img/instgram.png"))); // NOI18N
        kGradientPanel5.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 243, 70, 70));

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab_phon_img/facebook.png"))); // NOI18N
        kGradientPanel5.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 350, 70, 70));

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab_phon_img/twitter.png"))); // NOI18N
        kGradientPanel5.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 457, 70, 70));

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab_phon_img/gmail.png"))); // NOI18N
        kGradientPanel5.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 568, -1, -1));
        kGradientPanel5.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 243, 500, 70));
        kGradientPanel5.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 138, 500, 70));
        kGradientPanel5.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 457, 500, 70));
        kGradientPanel5.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 568, 500, 70));
        kGradientPanel5.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 350, 500, 70));

        jButton13.setText("jButton13");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        kGradientPanel5.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(791, 300, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(jTable2);

        kGradientPanel5.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, -1, -1));

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        kGradientPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 370, -1, -1));

        javax.swing.GroupLayout HelpLayout = new javax.swing.GroupLayout(Help);
        Help.setLayout(HelpLayout);
        HelpLayout.setHorizontalGroup(
            HelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 1102, Short.MAX_VALUE)
        );
        HelpLayout.setVerticalGroup(
            HelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
        );

        jPanel4.add(Help, "card8");

        Address_pn.setBackground(new java.awt.Color(255, 255, 255));
        Address_pn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        kGradientPanel10.setkEndColor(new java.awt.Color(0, 51, 51));
        kGradientPanel10.setkStartColor(new java.awt.Color(51, 51, 0));
        kGradientPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_Area_For_Address1.setColumns(20);
        txt_Area_For_Address1.setRows(5);
        jScrollPane9.setViewportView(txt_Area_For_Address1);

        kGradientPanel10.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 194, 320, 135));

        txt_User_Name_For_Address.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        txt_User_Name_For_Address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_User_Name_For_AddressActionPerformed(evt);
            }
        });
        kGradientPanel10.add(txt_User_Name_For_Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 156, 320, 40));

        jLabel43.setBackground(new java.awt.Color(210, 210, 210));
        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(75, 75, 75));
        jLabel43.setText("Select delivery adrress");
        kGradientPanel10.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 79, 405, 60));

        jLabel42.setBackground(new java.awt.Color(210, 210, 210));
        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(75, 75, 75));
        jLabel42.setText("Add a new address");
        kGradientPanel10.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 453, 405, 60));
        kGradientPanel10.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 135, 814, 10));
        kGradientPanel10.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 437, 814, 10));

        txt_Adrs_Name.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        txt_Adrs_Name.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        kGradientPanel10.add(txt_Adrs_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 557, 396, 30));

        txt_Adrs_Pin.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        txt_Adrs_Pin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        kGradientPanel10.add(txt_Adrs_Pin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 703, 396, 30));

        txt_Adrs_Phone.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        txt_Adrs_Phone.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        kGradientPanel10.add(txt_Adrs_Phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 630, 396, 30));

        jLabel44.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Mobile Number :");
        kGradientPanel10.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 593, 396, 31));

        jLabel45.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Town / City");
        kGradientPanel10.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 812, 396, 31));

        jLabel46.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("PIN Code");
        kGradientPanel10.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 666, 396, 31));

        txt_Adrs_House_Street.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        txt_Adrs_House_Street.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        kGradientPanel10.add(txt_Adrs_House_Street, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 776, 396, 30));

        jLabel48.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Flat, House no, Area, Street");
        kGradientPanel10.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 739, 396, 31));

        txt_Adrs_City.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        txt_Adrs_City.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txt_Adrs_City.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Adrs_CityActionPerformed(evt);
            }
        });
        kGradientPanel10.add(txt_Adrs_City, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 849, 396, 30));

        jLabel49.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Full Name :");
        kGradientPanel10.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 520, 396, 31));

        jLabel50.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("State / Province / Region");
        kGradientPanel10.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 885, 396, 31));

        txt_Adrs_State.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        txt_Adrs_State.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txt_Adrs_State.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Adrs_StateActionPerformed(evt);
            }
        });
        kGradientPanel10.add(txt_Adrs_State, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 922, 396, 30));

        jLabel51.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("Country / Region");
        kGradientPanel10.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 958, 396, 31));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton1.setText("Edit");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        kGradientPanel10.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 90, 33));

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton4.setText("Delete");
        kGradientPanel10.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 90, 33));

        Go_to_delivery_btn.setBackground(new java.awt.Color(255, 204, 153));
        Go_to_delivery_btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Go_to_delivery_btn.setText("Delivery to this address ");
        Go_to_delivery_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Go_to_delivery_btnActionPerformed(evt);
            }
        });
        kGradientPanel10.add(Go_to_delivery_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 288, 40));

        txt_Adrs_Country.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        txt_Adrs_Country.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txt_Adrs_Country.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Adrs_CountryActionPerformed(evt);
            }
        });
        kGradientPanel10.add(txt_Adrs_Country, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 995, 396, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(jTable1);

        kGradientPanel10.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 156, 485, 270));

        btn_Add_address.setBackground(new java.awt.Color(255, 204, 153));
        btn_Add_address.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_Add_address.setText("Show and Add");
        btn_Add_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Add_addressActionPerformed(evt);
            }
        });
        kGradientPanel10.add(btn_Add_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 1058, 154, 38));

        jButton7.setText("Add");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        kGradientPanel10.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 90, 33));

        Back_to_cart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Back.png"))); // NOI18N
        Back_to_cart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Back_to_cartMouseClicked(evt);
            }
        });
        kGradientPanel10.add(Back_to_cart, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jScrollPane8.setViewportView(kGradientPanel10);

        javax.swing.GroupLayout Address_pnLayout = new javax.swing.GroupLayout(Address_pn);
        Address_pn.setLayout(Address_pnLayout);
        Address_pnLayout.setHorizontalGroup(
            Address_pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Address_pnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 1096, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Address_pnLayout.setVerticalGroup(
            Address_pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
        );

        jPanel4.add(Address_pn, "card9");

        kGradientPanel11.setFocusable(false);
        kGradientPanel11.setkEndColor(new java.awt.Color(51, 51, 0));
        kGradientPanel11.setkStartColor(new java.awt.Color(0, 51, 0));
        kGradientPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel47.setBackground(new java.awt.Color(210, 210, 210));
        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(75, 75, 75));
        jLabel47.setText("Select delivery adrress");
        kGradientPanel11.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 79, 405, 60));
        kGradientPanel11.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 135, 814, 10));
        kGradientPanel11.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 814, 10));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane11.setViewportView(jTextArea1);

        kGradientPanel11.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 420, -1));

        jLabel52.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("Choose a delivery speed");
        kGradientPanel11.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 230, 40));

        jRadio_permium.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jRadio_permium.setOpaque(false);
        jRadio_permium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_service_type_action(evt);
            }
        });

        service_type_premium.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        service_type_premium.setText("Service Type: PREMIUM");

        jLabel75.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLabel75.setText("Delivery Time: ");

        jLabel76.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLabel76.setText("Price:");

        service_price_premium.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        service_price_premium.setText("200");

        service_time_premium.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        service_time_premium.setText("2 days");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(service_type_premium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadio_permium, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator12)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel75)
                                    .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(service_time_premium, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(service_price_premium, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 23, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(service_type_premium, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadio_permium, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(service_time_premium, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel76, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(service_price_premium, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        kGradientPanel11.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 520, 230, 140));

        jRadio_gold.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jRadio_gold.setOpaque(false);
        jRadio_gold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_service_type_action(evt);
            }
        });

        service_type_gold.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        service_type_gold.setText("Service Type: GOLD");

        jLabel77.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLabel77.setText("Delivery Time: ");

        jLabel78.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLabel78.setText("Price:");

        service_price_gold.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        service_price_gold.setText("100");

        service_time_gold.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        service_time_gold.setText("3 days");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(service_type_gold, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadio_gold, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(service_time_gold, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(service_price_gold, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(31, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(service_type_gold, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadio_gold, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel77, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(service_time_gold, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(service_price_gold, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        kGradientPanel11.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 520, 230, 140));

        jRadio_silver.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jRadio_silver.setOpaque(false);
        jRadio_silver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_service_type_action(evt);
            }
        });

        service_type_silver.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        service_type_silver.setText("Service Type: SILVER");

        jLabel79.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLabel79.setText("Delivery Time: ");

        jLabel80.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLabel80.setText("Price:");

        service_time_silver.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        service_time_silver.setText("5 days");

        service_price_silver.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        service_price_silver.setText("50");

        javax.swing.GroupLayout jPanel58Layout = new javax.swing.GroupLayout(jPanel58);
        jPanel58.setLayout(jPanel58Layout);
        jPanel58Layout.setHorizontalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator14)
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel58Layout.createSequentialGroup()
                        .addComponent(service_type_silver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadio_silver, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel58Layout.createSequentialGroup()
                        .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel58Layout.createSequentialGroup()
                                .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(service_time_silver, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel58Layout.createSequentialGroup()
                                .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(service_price_silver, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 31, Short.MAX_VALUE))))
        );
        jPanel58Layout.setVerticalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jRadio_silver, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(service_type_silver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel79, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel58Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(service_time_silver, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(service_price_silver, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        kGradientPanel11.add(jPanel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 520, 230, 140));

        Go_to_payment_btn.setText("jButton9");
        Go_to_payment_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Go_to_payment_btnActionPerformed(evt);
            }
        });
        kGradientPanel11.add(Go_to_payment_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 720, -1, -1));

        Back_to_address.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Back.png"))); // NOI18N
        Back_to_address.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Back_to_addressMouseClicked(evt);
            }
        });
        kGradientPanel11.add(Back_to_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        javax.swing.GroupLayout Delivery_optionLayout = new javax.swing.GroupLayout(Delivery_option);
        Delivery_option.setLayout(Delivery_optionLayout);
        Delivery_optionLayout.setHorizontalGroup(
            Delivery_optionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Delivery_optionLayout.createSequentialGroup()
                .addComponent(kGradientPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Delivery_optionLayout.setVerticalGroup(
            Delivery_optionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Delivery_optionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kGradientPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.add(Delivery_option, "card10");

        kGradientPanel12.setkEndColor(new java.awt.Color(0, 102, 51));
        kGradientPanel12.setkStartColor(new java.awt.Color(0, 153, 102));
        kGradientPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel53.setBackground(new java.awt.Color(210, 210, 210));
        jLabel53.setFont(new java.awt.Font("Segoe UI Semibold", 0, 28)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(75, 75, 75));
        jLabel53.setText("Select delivery adrress");
        kGradientPanel12.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 405, 60));

        jLabel54.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel54.setText("Pay faster for all your shopping needs with ZX Shopping Pay balance");
        kGradientPanel12.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 722, -1));

        jSeparator6.setBackground(new java.awt.Color(50, 50, 50));
        kGradientPanel12.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 262, 767, 10));

        jSeparator7.setBackground(new java.awt.Color(50, 50, 50));
        kGradientPanel12.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 664, 10));

        jSeparator8.setBackground(new java.awt.Color(50, 50, 50));
        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        kGradientPanel12.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 265, 11, 370));

        jSeparator9.setBackground(new java.awt.Color(50, 50, 50));
        jSeparator9.setOrientation(javax.swing.SwingConstants.VERTICAL);
        kGradientPanel12.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 265, -1, 370));

        jSeparator10.setBackground(new java.awt.Color(50, 50, 50));
        kGradientPanel12.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 634, 767, 10));

        jLabel55.setBackground(new java.awt.Color(50, 50, 50));
        jLabel55.setFont(new java.awt.Font("Segoe UI Semibold", 1, 22)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(40, 40, 40));
        jLabel55.setText("Seelect payment method");
        kGradientPanel12.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 284, 280, 50));

        jRadio_cash_payment.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        jRadio_cash_payment.setText("Pay on Delivery");
        jRadio_cash_payment.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jRadio_cash_payment.setOpaque(false);
        jRadio_cash_payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadio_cash_paymentActionPerformed(evt);
            }
        });
        kGradientPanel12.add(jRadio_cash_payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 560, 570, 30));

        jRadio_cradit_payment.setBackground(new java.awt.Color(248, 252, 245));
        jRadio_cradit_payment.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        jRadio_cradit_payment.setText(" Debit / Credit / ATM Card");
        jRadio_cradit_payment.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jRadio_cradit_payment.setOpaque(false);
        jRadio_cradit_payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadio_cradit_paymentActionPerformed(evt);
            }
        });
        kGradientPanel12.add(jRadio_cradit_payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 570, 30));

        pn_add_card.setBackground(new java.awt.Color(248, 252, 245));
        pn_add_card.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txt_card_no.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txt_name_on_card.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        card_expire_month.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        card_expire_month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        card_expire_year.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        card_expire_year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "230" }));

        jLabel56.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel56.setText("Card number");

        jLabel57.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel57.setText("Name on card");

        jLabel58.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel58.setText("Expiry date");

        javax.swing.GroupLayout pn_add_cardLayout = new javax.swing.GroupLayout(pn_add_card);
        pn_add_card.setLayout(pn_add_cardLayout);
        pn_add_cardLayout.setHorizontalGroup(
            pn_add_cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_add_cardLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(124, 124, 124))
            .addGroup(pn_add_cardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_add_cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_add_cardLayout.createSequentialGroup()
                        .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_add_cardLayout.createSequentialGroup()
                        .addComponent(txt_name_on_card, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txt_card_no, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(card_expire_month, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(card_expire_year, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_add_cardLayout.setVerticalGroup(
            pn_add_cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_add_cardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_add_cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pn_add_cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_add_cardLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pn_add_cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pn_add_cardLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel58)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_add_cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_name_on_card, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_card_no, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pn_add_cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(card_expire_year, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(card_expire_month, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        kGradientPanel12.add(pn_add_card, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 570, 140));

        Go_to_place_order_btn.setText("jButton10");
        Go_to_place_order_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Go_to_place_order_btnActionPerformed(evt);
            }
        });
        kGradientPanel12.add(Go_to_place_order_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(819, 703, 120, 30));

        Back_to_delivery.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Back.png"))); // NOI18N
        Back_to_delivery.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Back_to_deliveryMouseClicked(evt);
            }
        });
        kGradientPanel12.add(Back_to_delivery, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        javax.swing.GroupLayout Payment_pnLayout = new javax.swing.GroupLayout(Payment_pn);
        Payment_pn.setLayout(Payment_pnLayout);
        Payment_pnLayout.setHorizontalGroup(
            Payment_pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Payment_pnLayout.createSequentialGroup()
                .addComponent(kGradientPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Payment_pnLayout.setVerticalGroup(
            Payment_pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.add(Payment_pn, "card11");

        place_order_pn.setBackground(new java.awt.Color(255, 204, 153));
        place_order_pn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel59.setBackground(new java.awt.Color(255, 255, 255));
        jPanel59.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel59.setForeground(new java.awt.Color(255, 255, 255));
        jPanel59.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel64.setBackground(new java.awt.Color(255, 255, 255));
        jLabel64.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel64.setText("Shipping address");
        jPanel59.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 12, 250, -1));

        jLabel65.setBackground(new java.awt.Color(255, 255, 255));
        jLabel65.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel65.setText("Payment method");
        jPanel59.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 127, -1));

        jScrollPane12.setBackground(new java.awt.Color(255, 255, 255));

        txt_address_reviw.setEditable(false);
        txt_address_reviw.setColumns(20);
        txt_address_reviw.setForeground(new java.awt.Color(0, 102, 102));
        txt_address_reviw.setLineWrap(true);
        txt_address_reviw.setRows(5);
        txt_address_reviw.setWrapStyleWord(true);
        txt_address_reviw.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane12.setViewportView(txt_address_reviw);

        jPanel59.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 40, 250, 230));

        Payment_mhthod_rv.setBackground(new java.awt.Color(255, 255, 255));
        Payment_mhthod_rv.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jPanel59.add(Payment_mhthod_rv, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 130, 40));

        place_order_pn.add(jPanel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 107, 780, 304));

        jPanel60.setBackground(new java.awt.Color(255, 255, 255));
        jPanel60.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel60.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane13.setBackground(new java.awt.Color(255, 255, 255));

        Text_Area_For_Bill.setColumns(20);
        Text_Area_For_Bill.setForeground(new java.awt.Color(0, 102, 102));
        Text_Area_For_Bill.setRows(5);
        Text_Area_For_Bill.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane13.setViewportView(Text_Area_For_Bill);

        jPanel60.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 47, 730, 280));

        jTextField3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(0, 102, 102));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("Order details");
        jTextField3.setBorder(null);
        jPanel60.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 720, 28));

        jTextField4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(0, 102, 102));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("Delivery speed");
        jTextField4.setBorder(null);
        jPanel60.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 220, 30));

        jPanel63.setBackground(new java.awt.Color(255, 255, 255));
        jPanel63.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel63.setForeground(new java.awt.Color(0, 102, 102));

        service_type.setBackground(new java.awt.Color(255, 255, 255));
        service_type.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

        jLabel88.setBackground(new java.awt.Color(255, 255, 255));
        jLabel88.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLabel88.setText("Delivery Time: ");

        jLabel89.setBackground(new java.awt.Color(255, 255, 255));
        jLabel89.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLabel89.setText("Price:");

        service_time.setBackground(new java.awt.Color(255, 255, 255));
        service_time.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N

        service_price.setBackground(new java.awt.Color(255, 255, 255));
        service_price.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N

        javax.swing.GroupLayout jPanel63Layout = new javax.swing.GroupLayout(jPanel63);
        jPanel63.setLayout(jPanel63Layout);
        jPanel63Layout.setHorizontalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel63Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(service_type, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addGroup(jPanel63Layout.createSequentialGroup()
                        .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(service_time, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                    .addGroup(jPanel63Layout.createSequentialGroup()
                        .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(service_price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSeparator15, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel63Layout.setVerticalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel63Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(service_type, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(service_time, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(service_price, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        jPanel60.add(jPanel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 50, -1, 277));

        place_order_pn.add(jPanel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 429, 1055, 340));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(2, 2, 2)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel66.setBackground(new java.awt.Color(255, 255, 255));
        jLabel66.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(50, 50, 50));
        jLabel66.setText("Order Summary");
        jPanel3.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 203, 31));

        jLabel67.setBackground(new java.awt.Color(255, 255, 255));
        jLabel67.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(20, 20, 20));
        jLabel67.setText("Delivery:");
        jPanel3.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 110, 29));

        jLabel68.setBackground(new java.awt.Color(255, 255, 255));
        jLabel68.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(20, 20, 20));
        jLabel68.setText("Number of items");
        jPanel3.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 110, 29));

        jLabel69.setBackground(new java.awt.Color(255, 255, 255));
        jLabel69.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(20, 20, 20));
        jLabel69.setText("Total:");
        jPanel3.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 110, 29));
        jPanel3.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 203, -1));

        jLabel70.setBackground(new java.awt.Color(255, 255, 255));
        jLabel70.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(153, 0, 0));
        jLabel70.setText("Order Total:");
        jPanel3.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, 37));

        Item_count.setBackground(new java.awt.Color(255, 255, 255));
        Item_count.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Item_count.setForeground(new java.awt.Color(20, 20, 20));
        Item_count.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(Item_count, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 90, 29));

        delivery_price.setBackground(new java.awt.Color(255, 255, 255));
        delivery_price.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        delivery_price.setForeground(new java.awt.Color(20, 20, 20));
        delivery_price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(delivery_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 90, 29));

        total_price_rview.setBackground(new java.awt.Color(255, 255, 255));
        total_price_rview.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        total_price_rview.setForeground(new java.awt.Color(20, 20, 20));
        total_price_rview.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(total_price_rview, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 90, 29));

        subtotal_revw.setBackground(new java.awt.Color(255, 255, 255));
        subtotal_revw.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        subtotal_revw.setForeground(new java.awt.Color(153, 0, 0));
        jPanel3.add(subtotal_revw, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 115, 37));

        Place_order_btn.setBackground(new java.awt.Color(255, 204, 153));
        Place_order_btn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Place_order_btn.setText("Place your order");
        Place_order_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Place_order_btnActionPerformed(evt);
            }
        });
        jPanel3.add(Place_order_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 200, 50));

        place_order_pn.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 110, 260, 300));

        Back_to_payment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Back.png"))); // NOI18N
        Back_to_payment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Back_to_paymentMouseClicked(evt);
            }
        });
        place_order_pn.add(Back_to_payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jPanel4.add(place_order_pn, "card12");

        myorder_pn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel61.setBackground(new java.awt.Color(255, 255, 255));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pending (1) (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel61Layout = new javax.swing.GroupLayout(jPanel61);
        jPanel61.setLayout(jPanel61Layout);
        jPanel61Layout.setHorizontalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel61Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel34))
        );
        jPanel61Layout.setVerticalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel61Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel34))
        );

        myorder_pn.add(jPanel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 730, -1, -1));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/in transit.png"))); // NOI18N

        javax.swing.GroupLayout jPanel62Layout = new javax.swing.GroupLayout(jPanel62);
        jPanel62.setLayout(jPanel62Layout);
        jPanel62Layout.setHorizontalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel62Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel38))
        );
        jPanel62Layout.setVerticalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel62Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel38))
        );

        myorder_pn.add(jPanel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 730, -1, -1));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/deliveryed (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel64Layout = new javax.swing.GroupLayout(jPanel64);
        jPanel64.setLayout(jPanel64Layout);
        jPanel64Layout.setHorizontalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel64Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel39))
        );
        jPanel64Layout.setVerticalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel64Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel39))
        );

        myorder_pn.add(jPanel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 730, -1, -1));

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/out for delivery (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel65Layout = new javax.swing.GroupLayout(jPanel65);
        jPanel65.setLayout(jPanel65Layout);
        jPanel65Layout.setHorizontalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel65Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel40))
        );
        jPanel65Layout.setVerticalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel65Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel40))
        );

        myorder_pn.add(jPanel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 730, -1, -1));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/reached destinatrion (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel66Layout = new javax.swing.GroupLayout(jPanel66);
        jPanel66.setLayout(jPanel66Layout);
        jPanel66Layout.setHorizontalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel66Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel41))
        );
        jPanel66Layout.setVerticalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel66Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel41))
        );

        myorder_pn.add(jPanel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 730, -1, -1));

        filler1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 5));
        filler1.setFocusTraversalPolicyProvider(true);
        filler1.setForeground(new java.awt.Color(51, 255, 0));
        myorder_pn.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 750, -1, 0));

        jTextField2.setText("Pending");
        jTextField2.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField2CaretUpdate(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel13Layout = new javax.swing.GroupLayout(kGradientPanel13);
        kGradientPanel13.setLayout(kGradientPanel13Layout);
        kGradientPanel13Layout.setHorizontalGroup(
            kGradientPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel13Layout.createSequentialGroup()
                .addGap(0, 462, Short.MAX_VALUE)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        kGradientPanel13Layout.setVerticalGroup(
            kGradientPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel13Layout.createSequentialGroup()
                .addGap(0, 700, Short.MAX_VALUE)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel67Layout = new javax.swing.GroupLayout(jPanel67);
        jPanel67.setLayout(jPanel67Layout);
        jPanel67Layout.setHorizontalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel67Layout.setVerticalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        myorder_pn.add(jPanel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 570, 720));

        jTabbedPane1.setBackground(new java.awt.Color(102, 51, 255));
        jTabbedPane1.setForeground(new java.awt.Color(51, 51, 51));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

        order_table_details.setBackground(new java.awt.Color(204, 255, 204));
        order_table_details.setFont(new java.awt.Font("Traditional Arabic", 0, 24)); // NOI18N
        order_table_details.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        order_table_details.setCellSelectionEnabled(true);
        order_table_details.setDragEnabled(true);
        order_table_details.setFocusable(false);
        order_table_details.setRequestFocusEnabled(false);
        order_table_details.setRowHeight(35);
        order_table_details.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                order_table_detailsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(order_table_details);

        javax.swing.GroupLayout jPanel68Layout = new javax.swing.GroupLayout(jPanel68);
        jPanel68.setLayout(jPanel68Layout);
        jPanel68Layout.setHorizontalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
        );
        jPanel68Layout.setVerticalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("State", jPanel68);

        order_table_details1.setBackground(new java.awt.Color(204, 255, 204));
        order_table_details1.setFont(new java.awt.Font("Traditional Arabic", 0, 24)); // NOI18N
        order_table_details1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        order_table_details1.setCellSelectionEnabled(true);
        order_table_details1.setDragEnabled(true);
        order_table_details1.setFocusable(false);
        order_table_details1.setRequestFocusEnabled(false);
        order_table_details1.setRowHeight(35);
        order_table_details1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                order_table_details1MouseClicked(evt);
            }
        });
        jScrollPane14.setViewportView(order_table_details1);

        javax.swing.GroupLayout jPanel69Layout = new javax.swing.GroupLayout(jPanel69);
        jPanel69.setLayout(jPanel69Layout);
        jPanel69Layout.setHorizontalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
        );
        jPanel69Layout.setVerticalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Complated", jPanel69);

        myorder_pn.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 720));

        jPanel4.add(myorder_pn, "card13");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1090, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        if (jTextField1.getText().equals("Search")) {
            jTextField1.setText("");
            jTextField1.setForeground(new Color(255,255,255));

        }
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        if (jTextField1.getText().equals("")) {
            jTextField1.setText("Search");
            jTextField1.setForeground(new Color(153,153,153));

        }

    }//GEN-LAST:event_jTextField1FocusLost


    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
           
            Product_Info.setVisible(true);
            jScrollPane1.setVisible(false);
            jCheckBox1.setForeground(Color.red);
        }else{
            
         Product_Info.setVisible(false);
            jScrollPane1.setVisible(true);
          jCheckBox1.setForeground(Color.black); 
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void Place_order_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Place_order_btnActionPerformed
           
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
           String sql = "insert into trackdb values(?,?,?,?,?,?,?,?,?) ";
           String idmax= "select max(Order_id)+1 from trackdb";
           java.util.Date date=new java.util.Date();
        
	   java.sql.Timestamp sqlTime=new java.sql.Timestamp(date.getTime());
            PreparedStatement pst1 = conn.prepareStatement(idmax);
             String id_track="" ;
             ResultSet rs = pst1.executeQuery();
           
           if(rs.next())
           {
              id_track= rs.getString(1);
              
            }
           
            PreparedStatement ps ;
         ps=conn.prepareStatement(sql);
         ps.setString(1, id_track);
         ps.setString(2, NAME_OF_USER.getText());
         ps.setString(3, User_id.getText());
         ps.setString(4, Text_Area_For_Bill.getText());
         ps.setString(5, txt_address_reviw.getText());
         ps.setString(6, subtotal_revw.getText());
         ps.setString(7,Order_State.getText());
         ps.setString(8, Payment_mhthod_rv.getText());
         ps.setTimestamp(9, sqlTime);
        
         ps.executeUpdate();
          JOptionPane.showMessageDialog(null, "Your order is placed");
            
             }catch(Exception e){
                 
            } 
         if (evt.getSource()==Place_order_btn) {
            Home.setVisible(false);
            Eletronic.setVisible(false);
            Furniture.setVisible(false);
            Clothes.setVisible(false);
            Games.setVisible(false);
            Help.setVisible(false);
            Cart.setVisible(false);
             Address_pn.setVisible(false);
            Delivery_option.setVisible(false);
            Payment_pn.setVisible(false);
            place_order_pn.setVisible(false);
             myorder_pn.setVisible(true);
        }  
     
     
    }//GEN-LAST:event_Place_order_btnActionPerformed

    private void stateChange(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_stateChange


        
        //11111111111111111111111111111111111//
        
        if (evt.getSource()==  jSpinner_item1) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=1 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                    b =rs.getBytes("product_img");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);
               img_icon.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b))); 
              } 
        } catch (Exception e) { 
        }     
          
        int qtyn=Integer.parseInt(jSpinner_item1.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_item1.getValue().toString());
        total.setText((String.valueOf(tot)));
      
         
        
         jSpinner_item2.setValue(0);
         jSpinner_item3.setValue(0); 
         jSpinner_item4.setValue(0);
         jSpinner_item5.setValue(0);
         jSpinner_item6.setValue(0);
         jSpinner_item7.setValue(0);
         jSpinner_item8.setValue(0);
         jSpinner_item9.setValue(0);
         jSpinner_item10.setValue(0);
         jSpinner_item11.setValue(0);
         jSpinner_item12.setValue(0);
        }
        
            
          
            
       
       //2222222222222222222222222222222//
          if (evt.getSource()==  jSpinner_item2) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id= 2";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);         
              } 
        } catch (Exception e) { 
        }  
        int qtyn=Integer.parseInt(jSpinner_item2.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_item2.getValue().toString());
        total.setText((String.valueOf(tot)));
        jSpinner_item1.setValue(0);
         
         jSpinner_item3.setValue(0); 
         jSpinner_item4.setValue(0);
         jSpinner_item5.setValue(0);
         jSpinner_item6.setValue(0);
         jSpinner_item7.setValue(0);
         jSpinner_item8.setValue(0);
         jSpinner_item9.setValue(0);
         jSpinner_item10.setValue(0);
         jSpinner_item11.setValue(0);
         jSpinner_item12.setValue(0);
        }
          
          //333333333333333333333333333///
             if (evt.getSource()==  jSpinner_item3) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=3 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);         
              } 
        } catch (Exception e) { 
        }  
        int qtyn=Integer.parseInt(jSpinner_item3.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_item3.getValue().toString());
        total.setText((String.valueOf(tot)));
        jSpinner_item1.setValue(0);
         jSpinner_item2.setValue(0);
          
         jSpinner_item4.setValue(0);
         jSpinner_item5.setValue(0);
         jSpinner_item6.setValue(0);
         jSpinner_item7.setValue(0);
         jSpinner_item8.setValue(0);
         jSpinner_item9.setValue(0);
         jSpinner_item10.setValue(0);
         jSpinner_item11.setValue(0);
         jSpinner_item12.setValue(0);
        }
             
             //444444444444444444444//
            if (evt.getSource()==  jSpinner_item4) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=4 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);         
              } 
        } catch (Exception e) { 
        }  
        int qtyn=Integer.parseInt(jSpinner_item4.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_item4.getValue().toString());
        total.setText((String.valueOf(tot)));
       jSpinner_item1.setValue(0);
         jSpinner_item2.setValue(0);
         jSpinner_item3.setValue(0); 
          
         jSpinner_item5.setValue(0);
         jSpinner_item6.setValue(0);
         jSpinner_item7.setValue(0);
         jSpinner_item8.setValue(0);
         jSpinner_item9.setValue(0);
         jSpinner_item10.setValue(0);
         jSpinner_item11.setValue(0);
         jSpinner_item12.setValue(0);
        }
            
       ///5555555555555555555555555555555555555///
        if (evt.getSource()==  jSpinner_item5) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=5 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);         
              } 
        } catch (Exception e) { 
        }  
        int qtyn=Integer.parseInt(jSpinner_item5.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_item5.getValue().toString());
        total.setText((String.valueOf(tot)));
         jSpinner_item1.setValue(0);
         jSpinner_item2.setValue(0);
         jSpinner_item3.setValue(0); 
         jSpinner_item4.setValue(0);
        
         jSpinner_item6.setValue(0);
         jSpinner_item7.setValue(0);
         jSpinner_item8.setValue(0);
         jSpinner_item9.setValue(0);
         jSpinner_item10.setValue(0);
         jSpinner_item11.setValue(0);
         jSpinner_item12.setValue(0);
        }
        ///666666666666666666666666666666///
         if (evt.getSource()==  jSpinner_item6) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=6 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);         
              } 
        } catch (Exception e) { 
        }  
        int qtyn=Integer.parseInt(jSpinner_item6.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_item6.getValue().toString());
        total.setText((String.valueOf(tot)));
        jSpinner_item1.setValue(0);
         jSpinner_item2.setValue(0);
         jSpinner_item3.setValue(0); 
         jSpinner_item4.setValue(0);
         jSpinner_item5.setValue(0);
          
         jSpinner_item7.setValue(0);
         jSpinner_item8.setValue(0);
         jSpinner_item9.setValue(0);
         jSpinner_item10.setValue(0);
         jSpinner_item11.setValue(0);
         jSpinner_item12.setValue(0);
        }
         //77777777777777777777777777777777777777777//
          if (evt.getSource()==  jSpinner_item7) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=7 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);         
              } 
        } catch (Exception e) { 
        }  
        int qtyn=Integer.parseInt(jSpinner_item7.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_item7.getValue().toString());
        total.setText((String.valueOf(tot)));
        jSpinner_item1.setValue(0);
         jSpinner_item2.setValue(0);
         jSpinner_item3.setValue(0); 
         jSpinner_item4.setValue(0);
         jSpinner_item5.setValue(0);
         jSpinner_item6.setValue(0);
         
         jSpinner_item8.setValue(0);
         jSpinner_item9.setValue(0);
         jSpinner_item10.setValue(0);
         jSpinner_item11.setValue(0);
         jSpinner_item12.setValue(0);
        }
          //888888888888888888888888888888888888//
           if (evt.getSource()==  jSpinner_item8) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=8 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);         
              } 
        } catch (Exception e) { 
        }  
        int qtyn=Integer.parseInt(jSpinner_item8.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_item8.getValue().toString());
        total.setText((String.valueOf(tot)));
       jSpinner_item1.setValue(0);
         jSpinner_item2.setValue(0);
         jSpinner_item3.setValue(0); 
         jSpinner_item4.setValue(0);
         jSpinner_item5.setValue(0);
         jSpinner_item6.setValue(0);
         jSpinner_item7.setValue(0);
          
         jSpinner_item9.setValue(0);
         jSpinner_item10.setValue(0);
         jSpinner_item11.setValue(0);
         jSpinner_item12.setValue(0);
        }
           //99999999999999999999999999999999999999999//
            if (evt.getSource()==  jSpinner_item9) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=9 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);         
              } 
        } catch (Exception e) { 
        }  
        int qtyn=Integer.parseInt(jSpinner_item9.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_item9.getValue().toString());
        total.setText((String.valueOf(tot)));
         jSpinner_item1.setValue(0);
         jSpinner_item2.setValue(0);
         jSpinner_item3.setValue(0); 
         jSpinner_item4.setValue(0);
         jSpinner_item5.setValue(0);
         jSpinner_item6.setValue(0);
         jSpinner_item7.setValue(0);
         jSpinner_item8.setValue(0);
          
         jSpinner_item10.setValue(0);
         jSpinner_item11.setValue(0);
         jSpinner_item12.setValue(0);
        }
            //10101010101010101010101010101010//
             if (evt.getSource()==  jSpinner_item10) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=10 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);         
              } 
        } catch (Exception e) { 
        }  
        int qtyn=Integer.parseInt(jSpinner_item10.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_item10.getValue().toString());
        total.setText((String.valueOf(tot)));
      jSpinner_item1.setValue(0);
         jSpinner_item2.setValue(0);
         jSpinner_item3.setValue(0); 
         jSpinner_item4.setValue(0);
         jSpinner_item5.setValue(0);
         jSpinner_item6.setValue(0);
         jSpinner_item7.setValue(0);
         jSpinner_item8.setValue(0);
         jSpinner_item9.setValue(0);
         
         jSpinner_item11.setValue(0);
         jSpinner_item12.setValue(0);
        }
             //11/11/11/11/11/11/11/11/
              if (evt.getSource()==  jSpinner_item11) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=11 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);         
              } 
        } catch (Exception e) { 
        }  
        int qtyn=Integer.parseInt(jSpinner_item11.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_item11.getValue().toString());
        total.setText((String.valueOf(tot)));
         jSpinner_item1.setValue(0);
         jSpinner_item2.setValue(0);
         jSpinner_item3.setValue(0); 
         jSpinner_item4.setValue(0);
         jSpinner_item5.setValue(0);
         jSpinner_item6.setValue(0);
         jSpinner_item7.setValue(0);
         jSpinner_item8.setValue(0);
         jSpinner_item9.setValue(0);
         jSpinner_item10.setValue(0);
        
         jSpinner_item12.setValue(0);
        }
              //121212121212121212121212121212121212//
               if (evt.getSource()==  jSpinner_item12) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=12 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);         
              } 
        } catch (Exception e) { 
        }  
        int qtyn=Integer.parseInt(jSpinner_item12.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_item12.getValue().toString());
        total.setText((String.valueOf(tot)));
       jSpinner_item1.setValue(0);
         jSpinner_item2.setValue(0);
         jSpinner_item3.setValue(0); 
         jSpinner_item4.setValue(0);
         jSpinner_item5.setValue(0);
         jSpinner_item6.setValue(0);
         jSpinner_item7.setValue(0);
         jSpinner_item8.setValue(0);
         jSpinner_item9.setValue(0);
         jSpinner_item10.setValue(0);
         jSpinner_item11.setValue(0);
        
        }
    }//GEN-LAST:event_stateChange

    private void Order_StateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Order_StateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Order_StateActionPerformed

    private void User_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_User_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_User_idActionPerformed

    private void Electronic_mouse_clicked_(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Electronic_mouse_clicked_
        //item11//
        int rowcount = Cart_Table.getRowCount()+1;
        String sa= ""+rowcount;
        if (evt.getSource()==item1_btn) {
           if (Integer.parseInt(jSpinner_item1.getValue().toString()) <= 0) {
                JOptionPane.showMessageDialog(null, "nothing selected");
            }else{
               
            DefaultTableModel md = new DefaultTableModel();
            md = (DefaultTableModel) Cart_Table.getModel();
            md.addRow(new Object[]{
            id.getText(),
            name.getText(),
            price.getText(),
            qty.getText(),
            total.getText(),
           
              
                  });
            int sum = 0;
for(int i = 0; i <Cart_Table.getRowCount(); i++)
{
sum = sum + Integer.parseInt(Cart_Table.getValueAt(i, 4).toString());
}
total_tot.setText(Integer.toString(sum));
Item_count.setText(sa);
       jSpinner_item1.setValue(0);     
       }  
    }
        //item222//
        if (evt.getSource()==item2_btn) {
        if (Integer.parseInt(jSpinner_item2.getValue().toString()) <= 0) {
                JOptionPane.showMessageDialog(null, "nothing selected");
            }else{
               
            DefaultTableModel md = new DefaultTableModel();
            md = (DefaultTableModel) Cart_Table.getModel();
            md.addRow(new Object[]{
            id.getText(),
            name.getText(),
            price.getText(),
            qty.getText(),
            total.getText(),
                  });
            int sum = 0;
for(int i = 0; i <Cart_Table.getRowCount(); i++)
{
sum = sum + Integer.parseInt(Cart_Table.getValueAt(i, 4).toString());
}
total_tot.setText(Integer.toString(sum));
       jSpinner_item2.setValue(0);  
       Item_count.setText(sa);
       }  
    }
        
        //item3///
        if (evt.getSource()==item3_btn) {
           if (Integer.parseInt(jSpinner_item3.getValue().toString()) <= 0) {
                JOptionPane.showMessageDialog(null, "nothing selected");
            }else{
               
            DefaultTableModel md = new DefaultTableModel();
            md = (DefaultTableModel) Cart_Table.getModel();
            md.addRow(new Object[]{
            id.getText(),
            name.getText(),
            price.getText(),
            qty.getText(),
            total.getText(),
                  });
            int sum = 0;
for(int i = 0; i <Cart_Table.getRowCount(); i++)
{
sum = sum + Integer.parseInt(Cart_Table.getValueAt(i, 4).toString());
}
total_tot.setText(Integer.toString(sum));
Item_count.setText(sa);
       jSpinner_item3.setValue(0);     
       } 
    }
           
           ///item4///
           if (evt.getSource()==item4_btn) {
              if (Integer.parseInt(jSpinner_item4.getValue().toString()) <= 0) {
                JOptionPane.showMessageDialog(null, "nothing selected");
            }else{
               
            DefaultTableModel md = new DefaultTableModel();
            md = (DefaultTableModel) Cart_Table.getModel();
            md.addRow(new Object[]{
            id.getText(),
            name.getText(),
            price.getText(),
            qty.getText(),
            total.getText(),
                  });
            int sum = 0;
for(int i = 0; i <Cart_Table.getRowCount(); i++)
{
sum = sum + Integer.parseInt(Cart_Table.getValueAt(i, 4).toString());
}
total_tot.setText(Integer.toString(sum));
Item_count.setText(sa);
       jSpinner_item4.setValue(0);     
       }  
    }
             //item5//
             if (evt.getSource()==item5_btn) {
            if (Integer.parseInt(jSpinner_item5.getValue().toString()) <= 0) {
             JOptionPane.showMessageDialog(null, "nothing selected");
            }else{
               
            DefaultTableModel md = new DefaultTableModel();
            md = (DefaultTableModel) Cart_Table.getModel();
            md.addRow(new Object[]{
            id.getText(),
            name.getText(),
            price.getText(),
            qty.getText(),
            total.getText(),
                  });
            int sum = 0;
for(int i = 0; i <Cart_Table.getRowCount(); i++)
{
sum = sum + Integer.parseInt(Cart_Table.getValueAt(i, 4).toString());
}
total_tot.setText(Integer.toString(sum));
Item_count.setText(sa);
       jSpinner_item5.setValue(0);     
       }  
    }
                 //item6//
                 if (evt.getSource()==item6_btn) {
            if (Integer.parseInt(jSpinner_item6.getValue().toString()) <= 0) {
            JOptionPane.showMessageDialog(null, "nothing selected");
            }else{
               
            DefaultTableModel md = new DefaultTableModel();
            md = (DefaultTableModel) Cart_Table.getModel();
            md.addRow(new Object[]{
            id.getText(),
            name.getText(),
            price.getText(),
            qty.getText(),
            total.getText(),
                  });
            int sum = 0;
for(int i = 0; i <Cart_Table.getRowCount(); i++)
{
sum = sum + Integer.parseInt(Cart_Table.getValueAt(i, 4).toString());
}
total_tot.setText(Integer.toString(sum));
Item_count.setText(sa);
       jSpinner_item6.setValue(0);     
       } 
    }
                    ///item7//
                    if (evt.getSource()==item7_btn) {
            if (Integer.parseInt(jSpinner_item7.getValue().toString()) <= 0) {
            JOptionPane.showMessageDialog(null, "nothing selected");
            }else{
               
            DefaultTableModel md = new DefaultTableModel();
            md = (DefaultTableModel) Cart_Table.getModel();
            md.addRow(new Object[]{
            id.getText(),
            name.getText(),
            price.getText(),
            qty.getText(),
            total.getText(),
                  });
            int sum = 0;
for(int i = 0; i <Cart_Table.getRowCount(); i++)
{
sum = sum + Integer.parseInt(Cart_Table.getValueAt(i, 4).toString());
}
total_tot.setText(Integer.toString(sum));
Item_count.setText(sa);
       jSpinner_item7.setValue(0);     
       }  
    }
                       //item8
                       if (evt.getSource()==item8_btn) {
            if (Integer.parseInt(jSpinner_item8.getValue().toString()) <= 0) {
            JOptionPane.showMessageDialog(null, "nothing selected");
            }else{
               
            DefaultTableModel md = new DefaultTableModel();
            md = (DefaultTableModel) Cart_Table.getModel();
            md.addRow(new Object[]{
            id.getText(),
            name.getText(),
            price.getText(),
            qty.getText(),
            total.getText(),
                  });
            int sum = 0;
for(int i = 0; i <Cart_Table.getRowCount(); i++)
{
sum = sum + Integer.parseInt(Cart_Table.getValueAt(i, 4).toString());
}
total_tot.setText(Integer.toString(sum));
       jSpinner_item8.setValue(0);     
       }  
    }
          //item9//
          if (evt.getSource()==item9_btn) {
            if (Integer.parseInt(jSpinner_item9.getValue().toString()) <= 0) {
            JOptionPane.showMessageDialog(null, "nothing selected");
            }else{
               
            DefaultTableModel md = new DefaultTableModel();
            md = (DefaultTableModel) Cart_Table.getModel();
            md.addRow(new Object[]{
            id.getText(),
            name.getText(),
            price.getText(),
            qty.getText(),
            total.getText(),
                  });
            int sum = 0;
for(int i = 0; i <Cart_Table.getRowCount(); i++)
{
sum = sum + Integer.parseInt(Cart_Table.getValueAt(i, 4).toString());
}
total_tot.setText(Integer.toString(sum));
Item_count.setText(sa);
       jSpinner_item9.setValue(0);     
       }  
    }
             //item10//
             if (evt.getSource()==item10_btn) {
            if (Integer.parseInt(jSpinner_item10.getValue().toString()) <= 0) {
            JOptionPane.showMessageDialog(null, "nothing selected");
            }else{
               
            DefaultTableModel md = new DefaultTableModel();
            md = (DefaultTableModel) Cart_Table.getModel();
            md.addRow(new Object[]{
            id.getText(),
            name.getText(),
            price.getText(),
            qty.getText(),
            total.getText(),
                  });
            int sum = 0;
for(int i = 0; i <Cart_Table.getRowCount(); i++)
{
sum = sum + Integer.parseInt(Cart_Table.getValueAt(i, 4).toString());
}
total_tot.setText(Integer.toString(sum));
Item_count.setText(sa);
       jSpinner_item10.setValue(0);     
       }  
    }
                
              //item11//
          if (evt.getSource()==item11_btn) {
               if(Integer.parseInt(jSpinner_item11.getValue().toString()) <= 0) {
            JOptionPane.showMessageDialog(null, "nothing selected");
               }
               else{
            DefaultTableModel md = new DefaultTableModel();
            md = (DefaultTableModel) Cart_Table.getModel();
            md.addRow(new Object[]{
            id.getText(),
            name.getText(),
            price.getText(),
            qty.getText(),
            total.getText(),
                  });
            int sum = 0;
for(int i = 0; i <Cart_Table.getRowCount(); i++)
{
sum = sum + Integer.parseInt(Cart_Table.getValueAt(i, 4).toString());
}
total_tot.setText(Integer.toString(sum));
Item_count.setText(sa);
       jSpinner_item11.setValue(0);     
               } 
    }
         
           //item12//
           if (evt.getSource()==item12_btn) {

               if(Integer.parseInt(jSpinner_item12.getValue().toString()) <= 0) {
            JOptionPane.showMessageDialog(null, "nothing selected");
               }else{
            DefaultTableModel md = new DefaultTableModel();
            md = (DefaultTableModel) Cart_Table.getModel();
            md.addRow(new Object[]{
            id.getText(),
            name.getText(),
            price.getText(),
            qty.getText(),
            total.getText(),
                  });
            int sum = 0;
for(int i = 0; i <Cart_Table.getRowCount(); i++)
{
sum = sum + Integer.parseInt(Cart_Table.getValueAt(i, 4).toString());
}
total_tot.setText(Integer.toString(sum));
Item_count.setText(sa);
       jSpinner_item12.setValue(0);  
       
          } 
           }
           
      
    }//GEN-LAST:event_Electronic_mouse_clicked_

//cart shopping
    
    private void mousePress(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mousePress
        if (evt.getSource()==PnElectronic) {
            Home.setVisible(false);
            Eletronic.setVisible(true);
            Furniture.setVisible(false);
            Clothes.setVisible(false);
            Games.setVisible(false);
            Help.setVisible(false);
            Cart.setVisible(false);
             Address_pn.setVisible(false);
            Delivery_option.setVisible(false);
            Payment_pn.setVisible(false);
            place_order_pn.setVisible(false);
             myorder_pn.setVisible(false);
        }
        if (evt.getSource()==pnHome) {
            Home.setVisible(true);
            Eletronic.setVisible(false);
            Furniture.setVisible(false);
            Clothes.setVisible(false);
            Games.setVisible(false);
            Help.setVisible(false);
            Cart.setVisible(false);
            Address_pn.setVisible(false);
            Delivery_option.setVisible(false);
            Payment_pn.setVisible(false);
            place_order_pn.setVisible(false);
             myorder_pn.setVisible(false);

        }
          if (evt.getSource()==pnFurniture) {
            Home.setVisible(false);
            Eletronic.setVisible(false);
             Furniture.setVisible(true);
             Clothes.setVisible(false);
              Games.setVisible(false);
               Help.setVisible(false);
            Cart.setVisible(false);
            Address_pn.setVisible(false);
            Delivery_option.setVisible(false);
            Payment_pn.setVisible(false);
            place_order_pn.setVisible(false);
             myorder_pn.setVisible(false);

        }
            if (evt.getSource()==pnClothes) {
            Home.setVisible(false);
            Eletronic.setVisible(false);
            Furniture.setVisible(false);
            Clothes.setVisible(true);
            Games.setVisible(false);
            Help.setVisible(false);
            Cart.setVisible(false);
             Address_pn.setVisible(false);
            Delivery_option.setVisible(false);
            Payment_pn.setVisible(false);
            place_order_pn.setVisible(false);
             myorder_pn.setVisible(false);
          

        }
            if (evt.getSource()==pnShoes) {
            Home.setVisible(false);
            Eletronic.setVisible(false);
            Furniture.setVisible(false);
            Clothes.setVisible(false);
            Games.setVisible(true);
            Help.setVisible(false);
            Cart.setVisible(false);
             Address_pn.setVisible(false);
            Delivery_option.setVisible(false);
            Payment_pn.setVisible(false);
            place_order_pn.setVisible(false);
            myorder_pn.setVisible(false);

        }
            if (evt.getSource()==pnHelp) {
                TableTrack();
            Home.setVisible(false);
            Eletronic.setVisible(false); 
            Furniture.setVisible(false);
            Clothes.setVisible(false);
            Games.setVisible(false);
            Help.setVisible(true);
            Cart.setVisible(false);
             Address_pn.setVisible(false);
            Delivery_option.setVisible(false);
            Payment_pn.setVisible(false);
            place_order_pn.setVisible(false);
             myorder_pn.setVisible(false);
        }
          
        if (evt.getSource()==pnCart) {
            Home.setVisible(false);
            Eletronic.setVisible(false);
            Furniture.setVisible(false);
            Clothes.setVisible(false);
            Games.setVisible(false);
            Help.setVisible(false);
            Cart.setVisible(true);
            Address_pn.setVisible(false);
            Delivery_option.setVisible(false);
            Payment_pn.setVisible(false);
            place_order_pn.setVisible(false);
            myorder_pn.setVisible(false);
        }

    }//GEN-LAST:event_mousePress

    private void mouseExit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseExit
        if(evt.getSource()==pnHome) {
            pnHome.setBackground(new Color(0,0,0));
        }
        if(evt.getSource()==pnFurniture) {
            pnFurniture.setBackground(new Color(0,0,0));
        }
        if(evt.getSource()==PnElectronic) {
            PnElectronic.setBackground(new Color(0,0,0));
        }
        if(evt.getSource()==pnClothes) {
            pnClothes.setBackground(new Color(0,0,0));
        }
        if(evt.getSource()==pnHelp){
            pnHelp.setBackground(new Color(0,0,0));
        }
        if(evt.getSource()==pnShoes) {
            pnShoes.setBackground(new Color(0,0,0));
        }
        if(evt.getSource()==pnCart) {
            pnCart.setBackground(new Color(0,0,0));
        }

    }//GEN-LAST:event_mouseExit

    private void mouseEnterd(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseEnterd

        if(evt.getSource()==pnHelp) {
            pnHelp.setBackground(new Color(155,102,0));
        }
        if(evt.getSource()==pnHome) {
            pnHome.setBackground(new Color(155,102,0));
        }
        if(evt.getSource()==pnClothes) {
            pnClothes.setBackground(new Color(155,102,0));
        }
        if(evt.getSource()==PnElectronic) {
            PnElectronic.setBackground(new Color(155,102,0));
        }

        if(evt.getSource()==pnFurniture) {
            pnFurniture.setBackground(new Color(155,102,0));
        }
        if(evt.getSource()==pnCart) {
            pnCart.setBackground(new Color(155,102,0));
        }
        if(evt.getSource()==pnShoes){
            pnShoes.setBackground(new Color(155,102,0));
        }
    }//GEN-LAST:event_mouseEnterd

    private void txt_User_Name_For_AddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_User_Name_For_AddressActionPerformed
     
    }//GEN-LAST:event_txt_User_Name_For_AddressActionPerformed

    private void txt_Adrs_CityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Adrs_CityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Adrs_CityActionPerformed

    private void txt_Adrs_StateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Adrs_StateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Adrs_StateActionPerformed

    private void txt_Adrs_CountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Adrs_CountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Adrs_CountryActionPerformed

    private void btn_Add_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Add_addressActionPerformed
    
        Adress();
        
          String sql = "insert into AddressDB values(?,?,?,?,?,?,?,?,?,?)";    
               
        try {

       
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            
           
            PreparedStatement pst1 = conn.prepareStatement("select max(Addressdb_id)+1 from AddressDB");
            ResultSet rs = pst1.executeQuery();
            String id_adrs="" ;
           if(rs.next())
           {
              id_adrs= rs.getString(1);
            }
           
        PreparedStatement ps =conn.prepareStatement(sql);
        ps.setString(1, id_adrs); 
        ps.setString(2, User_id.getText());
        ps.setString(3, txt_Adrs_Name.getText());
        ps.setString(4,txt_Adrs_Phone.getText());
        ps.setString(5, txt_Adrs_Pin.getText());
        ps.setString(6,txt_Adrs_House_Street.getText());
        ps.setString(7, txt_Adrs_City.getText());
        ps.setString(8, txt_Adrs_State.getText());
        ps.setString(9, txt_Adrs_Country.getText());
        ps.setString(10, txt_Area_For_Address1.getText());
         
       
               
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"Address Added");
             
            
       
            
    } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }

                                           

   
        
    }//GEN-LAST:event_btn_Add_addressActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
      int row=jTable1.getSelectedRow();
       txt_User_Name_For_Address.setText(jTable1.getValueAt(row, 2).toString());
      txt_Area_For_Address1.setText(jTable1.getValueAt(row, 9).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void Go_to_delivery_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Go_to_delivery_btnActionPerformed
          
         if (txt_Area_For_Address1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Select Address");
        }else{
           jTextArea1.setText(txt_Area_For_Address1.getText()); 
          if (evt.getSource()==Go_to_delivery_btn) {
            Home.setVisible(false);
            Eletronic.setVisible(false);
            Furniture.setVisible(false);
            Clothes.setVisible(false);
            Games.setVisible(false);
            Help.setVisible(false);
            Cart.setVisible(false);
            Address_pn.setVisible(false);
            Delivery_option.setVisible(true);
             
            Payment_pn.setVisible(false);
            place_order_pn.setVisible(false);
             myorder_pn.setVisible(false);
        }  
         }
     

    }//GEN-LAST:event_Go_to_delivery_btnActionPerformed

    private void jRadio_cradit_paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadio_cradit_paymentActionPerformed
        if (jRadio_cradit_payment.isSelected() == true) {
           
            pn_add_card.setVisible(true);
             jRadio_cradit_payment.setBackground(new Color(248,252,245));
           jRadio_cradit_payment.setOpaque(true);
           jRadio_cash_payment.setSelected(false);
        }else{
            
            
            pn_add_card.setVisible(false);
            jRadio_cradit_payment.setOpaque(false);
         
            
        }
    }//GEN-LAST:event_jRadio_cradit_paymentActionPerformed

    private void Go_to_payment_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Go_to_payment_btnActionPerformed

        if (jRadio_gold.isSelected() ==false && jRadio_permium.isSelected() ==false && jRadio_silver.isSelected() ==false) {
            JOptionPane.showMessageDialog(null, "Select your service");
        }else{
        if (jRadio_permium.isSelected()==true) {
            service_type.setText(service_type_premium.getText());
            service_price.setText(service_price_premium.getText());
            service_time.setText(service_time_premium.getText());
            
        }else
            if (jRadio_gold.isSelected()==true) {
            service_type.setText(service_type_gold.getText());
            service_price.setText(service_price_gold.getText());
            service_time.setText(service_time_gold.getText());
            
        }else if (jRadio_silver.isSelected()==true) {
            service_type.setText(service_type_silver.getText());
            service_price.setText(service_price_silver.getText());
            service_time.setText(service_time_silver.getText());
            
            
        } 
        delivery_price.setText(service_price.getText());
        
        if (evt.getSource()==Go_to_payment_btn) {
            Home.setVisible(false);
            Eletronic.setVisible(false);
            Furniture.setVisible(false);
            Clothes.setVisible(false);
            Games.setVisible(false);
            Help.setVisible(false);
            Cart.setVisible(false);
            Address_pn.setVisible(false);
            Delivery_option.setVisible(false);
            Payment_pn.setVisible(true);
             myorder_pn.setVisible(false);
            place_order_pn.setVisible(false);
        }  
        }
    }//GEN-LAST:event_Go_to_payment_btnActionPerformed

    private void jRadio_cash_paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadio_cash_paymentActionPerformed
          if (jRadio_cash_payment.isSelected() == true) {
           
          pn_add_card.setSize(680,0);
          pn_add_card.setVisible(false);
          jRadio_cradit_payment.setOpaque(false);
          jRadio_cradit_payment.setSelected(false);
        }
    }//GEN-LAST:event_jRadio_cash_paymentActionPerformed

    private void Back_to_deliveryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back_to_deliveryMouseClicked
         if (evt.getSource()==Back_to_delivery) {
            Home.setVisible(false);
            Eletronic.setVisible(false);
            Furniture.setVisible(false);
            Clothes.setVisible(false);
            Games.setVisible(false);
            Help.setVisible(false);
            Cart.setVisible(false);
            Address_pn.setVisible(false);
            Delivery_option.setVisible(true);
            Payment_pn.setVisible(false);
            place_order_pn.setVisible(false);
             myorder_pn.setVisible(false);
        }  
         
     
    }//GEN-LAST:event_Back_to_deliveryMouseClicked

    private void Back_to_addressMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back_to_addressMouseClicked
      if (evt.getSource()==Back_to_address) {
            Home.setVisible(false);
            Eletronic.setVisible(false);
            Furniture.setVisible(false);
            Clothes.setVisible(false);
            Games.setVisible(false);
            Help.setVisible(false);
            Cart.setVisible(false);
            Address_pn.setVisible(true);
            Delivery_option.setVisible(false);
            Payment_pn.setVisible(false);
            place_order_pn.setVisible(false);
             myorder_pn.setVisible(false);
        }  
    }//GEN-LAST:event_Back_to_addressMouseClicked

    private void Back_to_cartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back_to_cartMouseClicked
         if (evt.getSource()==Back_to_cart) {
            Home.setVisible(false);
            Eletronic.setVisible(false);
            Furniture.setVisible(false);
            Clothes.setVisible(false);
            Games.setVisible(false);
            Help.setVisible(false);
            Cart.setVisible(true);
            Address_pn.setVisible(false);
            Delivery_option.setVisible(false);
            Payment_pn.setVisible(false);
            place_order_pn.setVisible(false);
             myorder_pn.setVisible(false);
        }  
    }//GEN-LAST:event_Back_to_cartMouseClicked

    private void Go_to_place_order_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Go_to_place_order_btnActionPerformed
bill20();
 
        if (jRadio_cash_payment.isSelected()==false && jRadio_cradit_payment.isSelected() == false  ) {
         JOptionPane.showMessageDialog(null, "Select Payment method ");
         
        }else if (jRadio_cradit_payment.isSelected()==true  && txt_name_on_card.getText().isEmpty() ==true && txt_card_no.getText().isEmpty() ==true) {
             JOptionPane.showMessageDialog(null, "Please enter crdit card details");
        }else{

        if (jRadio_cradit_payment.isSelected()==true ) {
         Payment_mhthod_rv.setText("Crdit card");
           
        }else{
          
            Payment_mhthod_rv.setText("Pay on delivery");
            }
        
            if (evt.getSource() == Go_to_place_order_btn) {                           
            Home.setVisible(false);
            Eletronic.setVisible(false);
            Furniture.setVisible(false);
            Clothes.setVisible(false);
            Games.setVisible(false);
            Help.setVisible(false);
            Cart.setVisible(false);
            Address_pn.setVisible(false);
            Delivery_option.setVisible(false);
            Payment_pn.setVisible(false);
            place_order_pn.setVisible(true);
            myorder_pn.setVisible(false);
            txt_address_reviw.setText(txt_Area_For_Address1.getText());             
            delivery_price.setText(service_price.getText());
            total_price_rview.setText(total_tot.getText());
            int del=Integer.parseInt(delivery_price.getText());
            int pra=Integer.parseInt(total_price_rview.getText());
            int sub = del +pra; 
            subtotal_revw.setText(Integer.toString(sub));
            }
        }
    }//GEN-LAST:event_Go_to_place_order_btnActionPerformed

    private void order_table_detailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_order_table_detailsMouseClicked
        int row=order_table_details.getSelectedRow();
        jTextField2.setText((String) order_table_details.getValueAt(row, 4));// TODO add your handling code here:
    }//GEN-LAST:event_order_table_detailsMouseClicked

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
       if (evt.getSource()==jButton13) {
            Home.setVisible(false);
            Eletronic.setVisible(false);
            Furniture.setVisible(false);
            Clothes.setVisible(false);
            Games.setVisible(false);
            Help.setVisible(false);
            Cart.setVisible(false);
            Address_pn.setVisible(false);
            Delivery_option.setVisible(false);
            Payment_pn.setVisible(false);
            place_order_pn.setVisible(false);
            place_order_pn.setVisible(false);
              myorder_pn.setVisible(true);
       
       }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void radio_service_type_action(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_service_type_action
        if (evt.getSource() == jRadio_permium) {
            jRadio_permium.setSelected(true);
            jRadio_gold.setSelected(false);
            jRadio_silver.setSelected(false);
            
        } if (evt.getSource() == jRadio_gold) {
            jRadio_permium.setSelected(false);
            jRadio_gold.setSelected(true);
            jRadio_silver.setSelected(false);
            
        } if (evt.getSource() == jRadio_silver) {
            jRadio_permium.setSelected(false);
            jRadio_gold.setSelected(false);
            jRadio_silver.setSelected(true);
            
        }
    }//GEN-LAST:event_radio_service_type_action

    private void Back_to_paymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back_to_paymentMouseClicked
        if (evt.getSource()==Back_to_payment) {
            Home.setVisible(false);
            Eletronic.setVisible(false);
            Furniture.setVisible(false);
            Clothes.setVisible(false);
            Games.setVisible(false);
            Help.setVisible(false);
            Cart.setVisible(false);
            Address_pn.setVisible(false);
            Delivery_option.setVisible(false);
            Payment_pn.setVisible(true);
            place_order_pn.setVisible(false);
            place_order_pn.setVisible(false);
              myorder_pn.setVisible(false);
       
       }
    }//GEN-LAST:event_Back_to_paymentMouseClicked

    private void Go_to_address_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Go_to_address_btnActionPerformed
      if (evt.getSource()==Go_to_address_btn) {
            Home.setVisible(false);
            Eletronic.setVisible(false);
            Furniture.setVisible(false);
            Clothes.setVisible(false);
            Games.setVisible(false);
            Help.setVisible(false);
            Cart.setVisible(false);
            Delivery_option.setVisible(false);
            Address_pn.setVisible(true);
             
            Payment_pn.setVisible(false);
            place_order_pn.setVisible(true);
            myorder_pn.setVisible(false);
        }     
    }//GEN-LAST:event_Go_to_address_btnActionPerformed

    private void state_change_for_F_item(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_state_change_for_F_item
   
        
        //11111111111111111111111111111111111//
        
        if (evt.getSource()==  jSpinner_F_item1) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=13 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                    b =rs.getBytes("product_img");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);
               img_icon.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b))); 
              } 
        } catch (Exception e) { 
        }     
          
        int qtyn=Integer.parseInt(jSpinner_F_item1.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_F_item1.getValue().toString());
        total.setText((String.valueOf(tot)));
      
         
        
       
         jSpinner_F_item2.setValue(0); 
         jSpinner_F_item3.setValue(0);
         jSpinner_F_item4.setValue(0);
         jSpinner_F_item5.setValue(0); 
         jSpinner_F_item6.setValue(0);  
         jSpinner_F_item7.setValue(0);
         jSpinner_F_item8.setValue(0); 
         jSpinner_F_item9.setValue(0);
         jSpinner_F_item10.setValue(0);
         jSpinner_F_item11.setValue(0); 
         jSpinner_F_item12.setValue(0);
        }
        
           
        if (evt.getSource()==  jSpinner_F_item2) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=14 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                    b =rs.getBytes("product_img");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);
               img_icon.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b))); 
              } 
        } catch (Exception e) { 
        }     
          
        int qtyn=Integer.parseInt(jSpinner_F_item2.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_F_item2.getValue().toString());
        total.setText((String.valueOf(tot)));
      
         
        
         jSpinner_F_item1.setValue(0);
    
         jSpinner_F_item3.setValue(0);
         jSpinner_F_item4.setValue(0);
         jSpinner_F_item5.setValue(0); 
         jSpinner_F_item6.setValue(0);  
         jSpinner_F_item7.setValue(0);
         jSpinner_F_item8.setValue(0); 
         jSpinner_F_item9.setValue(0);
         jSpinner_F_item10.setValue(0);
         jSpinner_F_item11.setValue(0); 
         jSpinner_F_item12.setValue(0);
        }
           
        if (evt.getSource()==  jSpinner_F_item3) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=15 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                    b =rs.getBytes("product_img");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);
               img_icon.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b))); 
              } 
        } catch (Exception e) { 
        }     
          
        int qtyn=Integer.parseInt(jSpinner_F_item3.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_F_item3.getValue().toString());
        total.setText((String.valueOf(tot)));
      
         
        
         jSpinner_F_item1.setValue(0);
         jSpinner_F_item2.setValue(0); 
         
         jSpinner_F_item4.setValue(0);
         jSpinner_F_item5.setValue(0); 
         jSpinner_F_item6.setValue(0);  
         jSpinner_F_item7.setValue(0);
         jSpinner_F_item8.setValue(0); 
         jSpinner_F_item9.setValue(0);
         jSpinner_F_item10.setValue(0);
         jSpinner_F_item11.setValue(0); 
         jSpinner_F_item12.setValue(0);
        }
           
        if (evt.getSource()==  jSpinner_F_item4) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=16 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                    b =rs.getBytes("product_img");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);
               img_icon.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b))); 
              } 
        } catch (Exception e) { 
        }     
          
        int qtyn=Integer.parseInt(jSpinner_F_item4.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_F_item4.getValue().toString());
        total.setText((String.valueOf(tot)));
      
         
        
         jSpinner_F_item1.setValue(0);
         jSpinner_F_item2.setValue(0); 
         jSpinner_F_item3.setValue(0);
        
         jSpinner_F_item5.setValue(0); 
         jSpinner_F_item6.setValue(0);  
         jSpinner_F_item7.setValue(0);
         jSpinner_F_item8.setValue(0); 
         jSpinner_F_item9.setValue(0);
         jSpinner_F_item10.setValue(0);
         jSpinner_F_item11.setValue(0); 
         jSpinner_F_item12.setValue(0);
        }
           
        if (evt.getSource()==  jSpinner_F_item5) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=17 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                    b =rs.getBytes("product_img");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);
               img_icon.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b))); 
              } 
        } catch (Exception e) { 
        }     
          
        int qtyn=Integer.parseInt(jSpinner_F_item5.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_F_item5.getValue().toString());
        total.setText((String.valueOf(tot)));
      
         
        
         jSpinner_F_item1.setValue(0);
         jSpinner_F_item2.setValue(0); 
         jSpinner_F_item3.setValue(0);
         jSpinner_F_item4.setValue(0);
  
         jSpinner_F_item6.setValue(0);  
         jSpinner_F_item7.setValue(0);
         jSpinner_F_item8.setValue(0); 
         jSpinner_F_item9.setValue(0);
         jSpinner_F_item10.setValue(0);
         jSpinner_F_item11.setValue(0); 
         jSpinner_F_item12.setValue(0);
        }
           
        if (evt.getSource()==  jSpinner_F_item6) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=18 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                    b =rs.getBytes("product_img");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);
               img_icon.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b))); 
              } 
        } catch (Exception e) { 
        }     
          
        int qtyn=Integer.parseInt(jSpinner_F_item6.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_F_item6.getValue().toString());
        total.setText((String.valueOf(tot)));
      
         
        
         jSpinner_F_item1.setValue(0);
         jSpinner_F_item2.setValue(0); 
         jSpinner_F_item3.setValue(0);
         jSpinner_F_item4.setValue(0);
         jSpinner_F_item5.setValue(0); 
      
         jSpinner_F_item7.setValue(0);
         jSpinner_F_item8.setValue(0); 
         jSpinner_F_item9.setValue(0);
         jSpinner_F_item10.setValue(0);
         jSpinner_F_item11.setValue(0); 
         jSpinner_F_item12.setValue(0);
        }
           
        if (evt.getSource()==  jSpinner_F_item7) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=19 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                    b =rs.getBytes("product_img");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);
               img_icon.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b))); 
              } 
        } catch (Exception e) { 
        }     
          
        int qtyn=Integer.parseInt(jSpinner_F_item7.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_F_item7.getValue().toString());
        total.setText((String.valueOf(tot)));
      
         
        
         jSpinner_F_item1.setValue(0);
         jSpinner_F_item2.setValue(0); 
         jSpinner_F_item3.setValue(0);
         jSpinner_F_item4.setValue(0);
         jSpinner_F_item5.setValue(0); 
         jSpinner_F_item6.setValue(0);  
      
         jSpinner_F_item8.setValue(0); 
         jSpinner_F_item9.setValue(0);
         jSpinner_F_item10.setValue(0);
         jSpinner_F_item11.setValue(0); 
         jSpinner_F_item12.setValue(0);
        }   
        if (evt.getSource()==  jSpinner_F_item8) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=20 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                    b =rs.getBytes("product_img");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);
               img_icon.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b))); 
              } 
        } catch (Exception e) { 
        }     
          
        int qtyn=Integer.parseInt(jSpinner_F_item8.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_F_item8.getValue().toString());
        total.setText((String.valueOf(tot)));
      
         
        
         jSpinner_F_item1.setValue(0);
         jSpinner_F_item2.setValue(0); 
         jSpinner_F_item3.setValue(0);
         jSpinner_F_item4.setValue(0);
         jSpinner_F_item5.setValue(0); 
         jSpinner_F_item6.setValue(0);  
         jSpinner_F_item7.setValue(0);
       
         jSpinner_F_item9.setValue(0);
         jSpinner_F_item10.setValue(0);
         jSpinner_F_item11.setValue(0); 
         jSpinner_F_item12.setValue(0);
        }   
        if (evt.getSource()==  jSpinner_F_item9) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=21 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                    b =rs.getBytes("product_img");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);
               img_icon.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b))); 
              } 
        } catch (Exception e) { 
        }     
          
        int qtyn=Integer.parseInt(jSpinner_F_item9.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_F_item9.getValue().toString());
        total.setText((String.valueOf(tot)));
      
         
        
         jSpinner_F_item1.setValue(0);
         jSpinner_F_item2.setValue(0); 
         jSpinner_F_item3.setValue(0);
         jSpinner_F_item4.setValue(0);
         jSpinner_F_item5.setValue(0); 
         jSpinner_F_item6.setValue(0);  
         jSpinner_F_item7.setValue(0);
         jSpinner_F_item8.setValue(0); 
     
         jSpinner_F_item10.setValue(0);
         jSpinner_F_item11.setValue(0); 
         jSpinner_F_item12.setValue(0);
        }   
        if (evt.getSource()==  jSpinner_F_item10) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=22 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                    b =rs.getBytes("product_img");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);
               img_icon.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b))); 
              } 
        } catch (Exception e) { 
        }     
          
        int qtyn=Integer.parseInt(jSpinner_F_item10.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_F_item10.getValue().toString());
        total.setText((String.valueOf(tot)));
      
         
        
         jSpinner_F_item1.setValue(0);
         jSpinner_F_item2.setValue(0); 
         jSpinner_F_item3.setValue(0);
         jSpinner_F_item4.setValue(0);
         jSpinner_F_item5.setValue(0); 
         jSpinner_F_item6.setValue(0);  
         jSpinner_F_item7.setValue(0);
         jSpinner_F_item8.setValue(0); 
         jSpinner_F_item9.setValue(0);
  
         jSpinner_F_item11.setValue(0); 
         jSpinner_F_item12.setValue(0);
        }   
        if (evt.getSource()==  jSpinner_F_item11) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=23 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                    b =rs.getBytes("product_img");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);
               img_icon.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b))); 
              } 
        } catch (Exception e) { 
        }     
          
        int qtyn=Integer.parseInt(jSpinner_F_item11.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_F_item11.getValue().toString());
        total.setText((String.valueOf(tot)));
      
         
        
         jSpinner_F_item1.setValue(0);
         jSpinner_F_item2.setValue(0); 
         jSpinner_F_item3.setValue(0);
         jSpinner_F_item4.setValue(0);
         jSpinner_F_item5.setValue(0); 
         jSpinner_F_item6.setValue(0);  
         jSpinner_F_item7.setValue(0);
         jSpinner_F_item8.setValue(0); 
         jSpinner_F_item9.setValue(0);
         jSpinner_F_item10.setValue(0);
        
         jSpinner_F_item12.setValue(0);
        }   
        if (evt.getSource()==  jSpinner_F_item12) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=24 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                    b =rs.getBytes("product_img");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);
               img_icon.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b))); 
              } 
        } catch (Exception e) { 
        }     
          
        int qtyn=Integer.parseInt(jSpinner_F_item12.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_F_item12.getValue().toString());
        total.setText((String.valueOf(tot)));
      
         
        
         jSpinner_F_item1.setValue(0);
         jSpinner_F_item2.setValue(0); 
         jSpinner_F_item3.setValue(0);
         jSpinner_F_item4.setValue(0);
         jSpinner_F_item5.setValue(0); 
         jSpinner_F_item6.setValue(0);  
         jSpinner_F_item7.setValue(0);
         jSpinner_F_item8.setValue(0); 
         jSpinner_F_item9.setValue(0);
         jSpinner_F_item10.setValue(0);
         jSpinner_F_item11.setValue(0); 
      
        }   
   
            
    }//GEN-LAST:event_state_change_for_F_item

    private void btn_F_item11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_F_item11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_F_item11ActionPerformed

    private void btn_F_item9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_F_item9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_F_item9ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
TableModel modal =Cart_Table.getModel();
        int[] indexs =Cart_Table.getSelectedRows();
        Object[] row =new Object[5];
        DefaultTableModel modal2=(DefaultTableModel) jTable2.getModel();
        for (int i = 0; i < indexs.length; i++) {
          row[0]=modal.getValueAt(indexs[i],0);
          row[0]=modal.getValueAt(indexs[i],1);
          row[0]=modal.getValueAt(indexs[i],2);
          row[0]=modal.getValueAt(indexs[i],3);
          row[0]=modal.getValueAt(indexs[i],4);
          modal2.addRow(row);
          
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_f_item_mouse_clicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_f_item_mouse_clicked
       //item11//
        int rowcount = Cart_Table.getRowCount()+1;
        String sa= ""+rowcount;
        if (evt.getSource()==btn_F_item1) {
           if (Integer.parseInt(jSpinner_F_item1.getValue().toString()) <= 0) {
                JOptionPane.showMessageDialog(null, "nothing selected");
            }else{
               
            DefaultTableModel md = new DefaultTableModel();
            md = (DefaultTableModel) Cart_Table.getModel();
            md.addRow(new Object[]{
            id.getText(),
            name.getText(),
            price.getText(),
            qty.getText(),
            total.getText(),
           
              
                  });
            int sum = 0;
for(int i = 0; i <Cart_Table.getRowCount(); i++)
{
sum = sum + Integer.parseInt(Cart_Table.getValueAt(i, 4).toString());
}
total_tot.setText(Integer.toString(sum));
Item_count.setText(sa);
       jSpinner_F_item1.setValue(0);     
       }  
    }
        //item222//
        if (evt.getSource()==btn_F_item2) {
        if (Integer.parseInt(jSpinner_F_item2.getValue().toString()) <= 0) {
                JOptionPane.showMessageDialog(null, "nothing selected");
            }else{
               
            DefaultTableModel md = new DefaultTableModel();
            md = (DefaultTableModel) Cart_Table.getModel();
            md.addRow(new Object[]{
            id.getText(),
            name.getText(),
            price.getText(),
            qty.getText(),
            total.getText(),
                  });
            int sum = 0;
for(int i = 0; i <Cart_Table.getRowCount(); i++)
{
sum = sum + Integer.parseInt(Cart_Table.getValueAt(i, 4).toString());
}
total_tot.setText(Integer.toString(sum));
       jSpinner_F_item2.setValue(0);  
       Item_count.setText(sa);
       }  
    }
        
        //item3///
        if (evt.getSource()==btn_F_item3) {
           if (Integer.parseInt(jSpinner_F_item3.getValue().toString()) <= 0) {
                JOptionPane.showMessageDialog(null, "nothing selected");
            }else{
               
            DefaultTableModel md = new DefaultTableModel();
            md = (DefaultTableModel) Cart_Table.getModel();
            md.addRow(new Object[]{
            id.getText(),
            name.getText(),
            price.getText(),
            qty.getText(),
            total.getText(),
                  });
            int sum = 0;
for(int i = 0; i <Cart_Table.getRowCount(); i++)
{
sum = sum + Integer.parseInt(Cart_Table.getValueAt(i, 4).toString());
}
total_tot.setText(Integer.toString(sum));
Item_count.setText(sa);
       jSpinner_F_item3.setValue(0);     
       } 
    }
           
           ///item4///
           if (evt.getSource()==btn_F_item4) {
              if (Integer.parseInt(jSpinner_F_item4.getValue().toString()) <= 0) {
                JOptionPane.showMessageDialog(null, "nothing selected");
            }else{
               
            DefaultTableModel md = new DefaultTableModel();
            md = (DefaultTableModel) Cart_Table.getModel();
            md.addRow(new Object[]{
            id.getText(),
            name.getText(),
            price.getText(),
            qty.getText(),
            total.getText(),
                  });
            int sum = 0;
for(int i = 0; i <Cart_Table.getRowCount(); i++)
{
sum = sum + Integer.parseInt(Cart_Table.getValueAt(i, 4).toString());
}
total_tot.setText(Integer.toString(sum));
Item_count.setText(sa);
       jSpinner_F_item4.setValue(0);     
       }  
    }
             //item5//
             if (evt.getSource()==btn_F_item5) {
            if (Integer.parseInt(jSpinner_F_item5.getValue().toString()) <= 0) {
             JOptionPane.showMessageDialog(null, "nothing selected");
            }else{
               
            DefaultTableModel md = new DefaultTableModel();
            md = (DefaultTableModel) Cart_Table.getModel();
            md.addRow(new Object[]{
            id.getText(),
            name.getText(),
            price.getText(),
            qty.getText(),
            total.getText(),
                  });
            int sum = 0;
for(int i = 0; i <Cart_Table.getRowCount(); i++)
{
sum = sum + Integer.parseInt(Cart_Table.getValueAt(i, 4).toString());
}
total_tot.setText(Integer.toString(sum));
Item_count.setText(sa);
       jSpinner_F_item5.setValue(0);     
       }  
    }
                 //item6//
                 if (evt.getSource()==btn_F_item6) {
            if (Integer.parseInt(jSpinner_F_item6.getValue().toString()) <= 0) {
            JOptionPane.showMessageDialog(null, "nothing selected");
            }else{
               
            DefaultTableModel md = new DefaultTableModel();
            md = (DefaultTableModel) Cart_Table.getModel();
            md.addRow(new Object[]{
            id.getText(),
            name.getText(),
            price.getText(),
            qty.getText(),
            total.getText(),
                  });
            int sum = 0;
for(int i = 0; i <Cart_Table.getRowCount(); i++)
{
sum = sum + Integer.parseInt(Cart_Table.getValueAt(i, 4).toString());
}
total_tot.setText(Integer.toString(sum));
Item_count.setText(sa);
       jSpinner_F_item6.setValue(0);     
       } 
    }
                    ///item7//
                    if (evt.getSource()==btn_F_item7) {
            if (Integer.parseInt(jSpinner_F_item7.getValue().toString()) <= 0) {
            JOptionPane.showMessageDialog(null, "nothing selected");
            }else{
               
            DefaultTableModel md = new DefaultTableModel();
            md = (DefaultTableModel) Cart_Table.getModel();
            md.addRow(new Object[]{
            id.getText(),
            name.getText(),
            price.getText(),
            qty.getText(),
            total.getText(),
                  });
            int sum = 0;
for(int i = 0; i <Cart_Table.getRowCount(); i++)
{
sum = sum + Integer.parseInt(Cart_Table.getValueAt(i, 4).toString());
}
total_tot.setText(Integer.toString(sum));
Item_count.setText(sa);
       jSpinner_F_item7.setValue(0);     
       }  
    }
                       //item8
                       if (evt.getSource()==btn_F_item8) {
            if (Integer.parseInt(jSpinner_F_item8.getValue().toString()) <= 0) {
            JOptionPane.showMessageDialog(null, "nothing selected");
            }else{
               
            DefaultTableModel md = new DefaultTableModel();
            md = (DefaultTableModel) Cart_Table.getModel();
            md.addRow(new Object[]{
            id.getText(),
            name.getText(),
            price.getText(),
            qty.getText(),
            total.getText(),
                  });
            int sum = 0;
for(int i = 0; i <Cart_Table.getRowCount(); i++)
{
sum = sum + Integer.parseInt(Cart_Table.getValueAt(i, 4).toString());
}
total_tot.setText(Integer.toString(sum));
      jSpinner_F_item8.setValue(0);   
      Item_count.setText(sa);
       }  
    }
          //item9//
          if (evt.getSource()==btn_F_item9) {
            if (Integer.parseInt(jSpinner_F_item9.getValue().toString()) <= 0) {
            JOptionPane.showMessageDialog(null, "nothing selected");
            }else{
               
            DefaultTableModel md = new DefaultTableModel();
            md = (DefaultTableModel) Cart_Table.getModel();
            md.addRow(new Object[]{
            id.getText(),
            name.getText(),
            price.getText(),
            qty.getText(),
            total.getText(),
                  });
            int sum = 0;
for(int i = 0; i <Cart_Table.getRowCount(); i++)
{
sum = sum + Integer.parseInt(Cart_Table.getValueAt(i, 4).toString());
}
total_tot.setText(Integer.toString(sum));
Item_count.setText(sa);
     jSpinner_F_item9.setValue(0);     
       }  
    }
             //item10//
             if (evt.getSource()==btn_F_item10) {
            if (Integer.parseInt(jSpinner_F_item10.getValue().toString()) <= 0) {
            JOptionPane.showMessageDialog(null, "nothing selected");
            }else{
               
            DefaultTableModel md = new DefaultTableModel();
            md = (DefaultTableModel) Cart_Table.getModel();
            md.addRow(new Object[]{
            id.getText(),
            name.getText(),
            price.getText(),
            qty.getText(),
            total.getText(),
                  });
            int sum = 0;
for(int i = 0; i <Cart_Table.getRowCount(); i++)
{
sum = sum + Integer.parseInt(Cart_Table.getValueAt(i, 4).toString());
}
total_tot.setText(Integer.toString(sum));
Item_count.setText(sa);
     jSpinner_F_item10.setValue(0);     
       }  
    }
                
              //item11//
          if (evt.getSource()==btn_F_item11) {
               if(Integer.parseInt(jSpinner_F_item11.getValue().toString()) <= 0) {
            JOptionPane.showMessageDialog(null, "nothing selected");
               }
               else{
            DefaultTableModel md = new DefaultTableModel();
            md = (DefaultTableModel) Cart_Table.getModel();
            md.addRow(new Object[]{
            id.getText(),
            name.getText(),
            price.getText(),
            qty.getText(),
            total.getText(),
                  });
            int sum = 0;
for(int i = 0; i <Cart_Table.getRowCount(); i++)
{
sum = sum + Integer.parseInt(Cart_Table.getValueAt(i, 4).toString());
}
total_tot.setText(Integer.toString(sum));
Item_count.setText(sa);
      jSpinner_F_item11.setValue(0);     
               } 
    }
         
           //item12//
           if (evt.getSource()==btn_F_item12) {

               if(Integer.parseInt(jSpinner_F_item12.getValue().toString()) <= 0) {
            JOptionPane.showMessageDialog(null, "nothing selected");
               }else{
            DefaultTableModel md = new DefaultTableModel();
            md = (DefaultTableModel) Cart_Table.getModel();
            md.addRow(new Object[]{
            id.getText(),
            name.getText(),
            price.getText(),
            qty.getText(),
            total.getText(),
                  });
            int sum = 0;
for(int i = 0; i <Cart_Table.getRowCount(); i++)
{
sum = sum + Integer.parseInt(Cart_Table.getValueAt(i, 4).toString());
}
total_tot.setText(Integer.toString(sum));
Item_count.setText(sa);
       jSpinner_F_item12.setValue(0);  
       
          } 
           }
    }//GEN-LAST:event_btn_f_item_mouse_clicked

    private void State_Change_For_C_Item(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_State_Change_For_C_Item

           if (evt.getSource()==  jSpinner_C_item1) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=25 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                    b =rs.getBytes("product_img");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);
               img_icon.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b))); 
              } 
        } catch (Exception e) { 
        }     
          
        int qtyn=Integer.parseInt(jSpinner_C_item1.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_C_item1.getValue().toString());
        total.setText((String.valueOf(tot)));
      
         
  
         jSpinner_C_item2.setValue(0); 
         jSpinner_C_item3.setValue(0);
         jSpinner_C_item4.setValue(0); 
         jSpinner_C_item5.setValue(0); 
         jSpinner_C_item6.setValue(0);
         jSpinner_C_item7.setValue(0); 
         jSpinner_C_item8.setValue(0); 
         jSpinner_C_item9.setValue(0);
         jSpinner_C_item10.setValue(0); 
         jSpinner_C_item11.setValue(0); 
         jSpinner_C_item12.setValue(0);
        }   if (evt.getSource()==  jSpinner_C_item2) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=26 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                    b =rs.getBytes("product_img");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);
               img_icon.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b))); 
              } 
        } catch (Exception e) { 
        }     
          
        int qtyn=Integer.parseInt(jSpinner_C_item2.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_C_item2.getValue().toString());
        total.setText((String.valueOf(tot)));
      
         
        
         jSpinner_C_item1.setValue(0); 
    
         jSpinner_C_item3.setValue(0);
         jSpinner_C_item4.setValue(0); 
         jSpinner_C_item5.setValue(0); 
         jSpinner_C_item6.setValue(0);
         jSpinner_C_item7.setValue(0); 
         jSpinner_C_item8.setValue(0); 
         jSpinner_C_item9.setValue(0);
         jSpinner_C_item10.setValue(0); 
         jSpinner_C_item11.setValue(0); 
         jSpinner_C_item12.setValue(0);
        }   if (evt.getSource()==  jSpinner_C_item3) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=27 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                    b =rs.getBytes("product_img");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);
               img_icon.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b))); 
              } 
        } catch (Exception e) { 
        }     
          
        int qtyn=Integer.parseInt(jSpinner_C_item3.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_C_item3.getValue().toString());
        total.setText((String.valueOf(tot)));
      
         
        
         jSpinner_C_item1.setValue(0); 
         jSpinner_C_item2.setValue(0); 
       
         jSpinner_C_item4.setValue(0); 
         jSpinner_C_item5.setValue(0); 
         jSpinner_C_item6.setValue(0);
         jSpinner_C_item7.setValue(0); 
         jSpinner_C_item8.setValue(0); 
         jSpinner_C_item9.setValue(0);
         jSpinner_C_item10.setValue(0); 
         jSpinner_C_item11.setValue(0); 
         jSpinner_C_item12.setValue(0);
        }   if (evt.getSource()==  jSpinner_C_item4) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=28 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                    b =rs.getBytes("product_img");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);
               img_icon.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b))); 
              } 
        } catch (Exception e) { 
        }     
          
        int qtyn=Integer.parseInt(jSpinner_C_item4.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_C_item4.getValue().toString());
        total.setText((String.valueOf(tot)));
      
         
        
         jSpinner_C_item1.setValue(0); 
         jSpinner_C_item2.setValue(0); 
         jSpinner_C_item3.setValue(0);
      
         jSpinner_C_item5.setValue(0); 
         jSpinner_C_item6.setValue(0);
         jSpinner_C_item7.setValue(0); 
         jSpinner_C_item8.setValue(0); 
         jSpinner_C_item9.setValue(0);
         jSpinner_C_item10.setValue(0); 
         jSpinner_C_item11.setValue(0); 
         jSpinner_C_item12.setValue(0);
        }   if (evt.getSource()==  jSpinner_C_item5) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=29 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                    b =rs.getBytes("product_img");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);
               img_icon.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b))); 
              } 
        } catch (Exception e) { 
        }     
          
        int qtyn=Integer.parseInt(jSpinner_C_item5.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_C_item5.getValue().toString());
        total.setText((String.valueOf(tot)));
      
         
        
         jSpinner_C_item1.setValue(0); 
         jSpinner_C_item2.setValue(0); 
         jSpinner_C_item3.setValue(0);
         jSpinner_C_item4.setValue(0); 
        
         jSpinner_C_item6.setValue(0);
         jSpinner_C_item7.setValue(0); 
         jSpinner_C_item8.setValue(0); 
         jSpinner_C_item9.setValue(0);
         jSpinner_C_item10.setValue(0); 
         jSpinner_C_item11.setValue(0); 
         jSpinner_C_item12.setValue(0);
        }   if (evt.getSource()==  jSpinner_C_item6) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=30 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                    b =rs.getBytes("product_img");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);
               img_icon.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b))); 
              } 
        } catch (Exception e) { 
        }     
          
        int qtyn=Integer.parseInt(jSpinner_C_item6.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_C_item6.getValue().toString());
        total.setText((String.valueOf(tot)));
      
         
        
         jSpinner_C_item1.setValue(0); 
         jSpinner_C_item2.setValue(0); 
         jSpinner_C_item3.setValue(0);
         jSpinner_C_item4.setValue(0); 
         jSpinner_C_item5.setValue(0); 
          
         jSpinner_C_item7.setValue(0); 
         jSpinner_C_item8.setValue(0); 
         jSpinner_C_item9.setValue(0);
         jSpinner_C_item10.setValue(0); 
         jSpinner_C_item11.setValue(0); 
         jSpinner_C_item12.setValue(0);
        }   if (evt.getSource()==  jSpinner_C_item7) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=31 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                    b =rs.getBytes("product_img");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);
               img_icon.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b))); 
              } 
        } catch (Exception e) { 
        }     
          
        int qtyn=Integer.parseInt(jSpinner_C_item7.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_C_item7.getValue().toString());
        total.setText((String.valueOf(tot)));
      
         
        
         jSpinner_C_item1.setValue(0); 
         jSpinner_C_item2.setValue(0); 
         jSpinner_C_item3.setValue(0);
         jSpinner_C_item4.setValue(0); 
         jSpinner_C_item5.setValue(0); 
         jSpinner_C_item6.setValue(0);
        
         jSpinner_C_item8.setValue(0); 
         jSpinner_C_item9.setValue(0);
         jSpinner_C_item10.setValue(0); 
         jSpinner_C_item11.setValue(0); 
         jSpinner_C_item12.setValue(0);
        }   if (evt.getSource()==  jSpinner_C_item8) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=32 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                    b =rs.getBytes("product_img");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);
               img_icon.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b))); 
              } 
        } catch (Exception e) { 
        }     
          
        int qtyn=Integer.parseInt(jSpinner_C_item8.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_C_item8.getValue().toString());
        total.setText((String.valueOf(tot)));
      
         
        
         jSpinner_C_item1.setValue(0); 
         jSpinner_C_item2.setValue(0); 
         jSpinner_C_item3.setValue(0);
         jSpinner_C_item4.setValue(0); 
         jSpinner_C_item5.setValue(0); 
         jSpinner_C_item6.setValue(0);
         jSpinner_C_item7.setValue(0); 
        
         jSpinner_C_item9.setValue(0);
         jSpinner_C_item10.setValue(0); 
         jSpinner_C_item11.setValue(0); 
         jSpinner_C_item12.setValue(0);
        }   if (evt.getSource()==   jSpinner_C_item9) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=33 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                    b =rs.getBytes("product_img");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);
               img_icon.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b))); 
              } 
        } catch (Exception e) { 
        }     
          
        int qtyn=Integer.parseInt( jSpinner_C_item9.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText( jSpinner_C_item9.getValue().toString());
        total.setText((String.valueOf(tot)));
      
         
        
         jSpinner_C_item1.setValue(0); 
         jSpinner_C_item2.setValue(0); 
         jSpinner_C_item3.setValue(0);
         jSpinner_C_item4.setValue(0); 
         jSpinner_C_item5.setValue(0); 
         jSpinner_C_item6.setValue(0);
         jSpinner_C_item7.setValue(0); 
         jSpinner_C_item8.setValue(0); 
          
         jSpinner_C_item10.setValue(0); 
         jSpinner_C_item11.setValue(0); 
         jSpinner_C_item12.setValue(0);
        }   if (evt.getSource()==   jSpinner_C_item10) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=34 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                    b =rs.getBytes("product_img");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);
               img_icon.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b))); 
              } 
        } catch (Exception e) { 
        }     
          
        int qtyn=Integer.parseInt( jSpinner_C_item10.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText( jSpinner_C_item10.getValue().toString());
        total.setText((String.valueOf(tot)));
      
         
        
         jSpinner_C_item1.setValue(0); 
         jSpinner_C_item2.setValue(0); 
         jSpinner_C_item3.setValue(0);
         jSpinner_C_item4.setValue(0); 
         jSpinner_C_item5.setValue(0); 
         jSpinner_C_item6.setValue(0);
         jSpinner_C_item7.setValue(0); 
         jSpinner_C_item8.setValue(0); 
         jSpinner_C_item9.setValue(0);
         
         jSpinner_C_item11.setValue(0); 
         jSpinner_C_item12.setValue(0);
        }   if (evt.getSource()==  jSpinner_C_item11) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=35 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                    b =rs.getBytes("product_img");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);
               img_icon.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b))); 
              } 
        } catch (Exception e) { 
        }     
          
        int qtyn=Integer.parseInt(jSpinner_C_item11.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_C_item11.getValue().toString());
        total.setText((String.valueOf(tot)));
      
         
        
         jSpinner_C_item1.setValue(0); 
         jSpinner_C_item2.setValue(0); 
         jSpinner_C_item3.setValue(0);
         jSpinner_C_item4.setValue(0); 
         jSpinner_C_item5.setValue(0); 
         jSpinner_C_item6.setValue(0);
         jSpinner_C_item7.setValue(0); 
         jSpinner_C_item8.setValue(0); 
         jSpinner_C_item9.setValue(0);
         jSpinner_C_item10.setValue(0); 
      
         jSpinner_C_item12.setValue(0);
        }   if (evt.getSource()==  jSpinner_C_item12) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=36 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                    b =rs.getBytes("product_img");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);
               img_icon.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b))); 
              } 
        } catch (Exception e) { 
        }     
          
        int qtyn=Integer.parseInt(jSpinner_C_item12.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_C_item12.getValue().toString());
        total.setText((String.valueOf(tot)));
      
         
        
         jSpinner_C_item1.setValue(0); 
         jSpinner_C_item2.setValue(0); 
         jSpinner_C_item3.setValue(0);
         jSpinner_C_item4.setValue(0); 
         jSpinner_C_item5.setValue(0); 
         jSpinner_C_item6.setValue(0);
         jSpinner_C_item7.setValue(0); 
         jSpinner_C_item8.setValue(0); 
         jSpinner_C_item9.setValue(0);
         jSpinner_C_item10.setValue(0); 
         jSpinner_C_item11.setValue(0); 
       
        }
    }//GEN-LAST:event_State_Change_For_C_Item

    private void btn_C_item_mouse_clicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_C_item_mouse_clicked
       int rowcount = Cart_Table.getRowCount()+1;
        String sa= ""+rowcount;
        if (evt.getSource()==btn_C_item1) {
           if (Integer.parseInt(jSpinner_C_item1.getValue().toString()) <= 0) {
                JOptionPane.showMessageDialog(null, "nothing selected");
            }else{
               
            DefaultTableModel md = new DefaultTableModel();
            md = (DefaultTableModel) Cart_Table.getModel();
            md.addRow(new Object[]{
            id.getText(),
            name.getText(),
            price.getText(),
            qty.getText(),
            total.getText(),
           
              
                  });
            int sum = 0;
for(int i = 0; i <Cart_Table.getRowCount(); i++)
{
sum = sum + Integer.parseInt(Cart_Table.getValueAt(i, 4).toString());
}
total_tot.setText(Integer.toString(sum));
Item_count.setText(sa);
       jSpinner_C_item1.setValue(0);     
       }  
    }
        //item222//
        if (evt.getSource()==btn_C_item2) {
        if (Integer.parseInt(jSpinner_C_item2.getValue().toString()) <= 0) {
                JOptionPane.showMessageDialog(null, "nothing selected");
            }else{
               
            DefaultTableModel md = new DefaultTableModel();
            md = (DefaultTableModel) Cart_Table.getModel();
            md.addRow(new Object[]{
            id.getText(),
            name.getText(),
            price.getText(),
            qty.getText(),
            total.getText(),
                  });
            int sum = 0;
for(int i = 0; i <Cart_Table.getRowCount(); i++)
{
sum = sum + Integer.parseInt(Cart_Table.getValueAt(i, 4).toString());
}
total_tot.setText(Integer.toString(sum));
       jSpinner_C_item2.setValue(0);  
       Item_count.setText(sa);
       }  
    }
        
        //item3///
        if (evt.getSource()==btn_C_item3) {
           if (Integer.parseInt(jSpinner_C_item3.getValue().toString()) <= 0) {
                JOptionPane.showMessageDialog(null, "nothing selected");
            }else{
               
            DefaultTableModel md = new DefaultTableModel();
            md = (DefaultTableModel) Cart_Table.getModel();
            md.addRow(new Object[]{
            id.getText(),
            name.getText(),
            price.getText(),
            qty.getText(),
            total.getText(),
                  });
            int sum = 0;
for(int i = 0; i <Cart_Table.getRowCount(); i++)
{
sum = sum + Integer.parseInt(Cart_Table.getValueAt(i, 4).toString());
}
total_tot.setText(Integer.toString(sum));
Item_count.setText(sa);
       jSpinner_C_item3.setValue(0);     
       } 
    }
           
           ///item4///
           if (evt.getSource()==btn_C_item4) {
              if (Integer.parseInt(jSpinner_C_item4.getValue().toString()) <= 0) {
                JOptionPane.showMessageDialog(null, "nothing selected");
            }else{
               
            DefaultTableModel md = new DefaultTableModel();
            md = (DefaultTableModel) Cart_Table.getModel();
            md.addRow(new Object[]{
            id.getText(),
            name.getText(),
            price.getText(),
            qty.getText(),
            total.getText(),
                  });
            int sum = 0;
for(int i = 0; i <Cart_Table.getRowCount(); i++)
{
sum = sum + Integer.parseInt(Cart_Table.getValueAt(i, 4).toString());
}
total_tot.setText(Integer.toString(sum));
Item_count.setText(sa);
       jSpinner_C_item4.setValue(0);     
       }  
    }
             //item5//
             if (evt.getSource()==btn_C_item5) {
            if (Integer.parseInt(jSpinner_C_item5.getValue().toString()) <= 0) {
             JOptionPane.showMessageDialog(null, "nothing selected");
            }else{
               
            DefaultTableModel md = new DefaultTableModel();
            md = (DefaultTableModel) Cart_Table.getModel();
            md.addRow(new Object[]{
            id.getText(),
            name.getText(),
            price.getText(),
            qty.getText(),
            total.getText(),
                  });
            int sum = 0;
for(int i = 0; i <Cart_Table.getRowCount(); i++)
{
sum = sum + Integer.parseInt(Cart_Table.getValueAt(i, 4).toString());
}
total_tot.setText(Integer.toString(sum));
Item_count.setText(sa);
       jSpinner_C_item5.setValue(0);     
       }  
    }
                 //item6//
                 if (evt.getSource()==btn_C_item6) {
            if (Integer.parseInt(jSpinner_C_item6.getValue().toString()) <= 0) {
            JOptionPane.showMessageDialog(null, "nothing selected");
            }else{
               
            DefaultTableModel md = new DefaultTableModel();
            md = (DefaultTableModel) Cart_Table.getModel();
            md.addRow(new Object[]{
            id.getText(),
            name.getText(),
            price.getText(),
            qty.getText(),
            total.getText(),
                  });
            int sum = 0;
for(int i = 0; i <Cart_Table.getRowCount(); i++)
{
sum = sum + Integer.parseInt(Cart_Table.getValueAt(i, 4).toString());
}
total_tot.setText(Integer.toString(sum));
Item_count.setText(sa);
       jSpinner_C_item6.setValue(0);     
       } 
    }
                    ///item7//
                    if (evt.getSource()==btn_C_item7) {
            if (Integer.parseInt(jSpinner_C_item7.getValue().toString()) <= 0) {
            JOptionPane.showMessageDialog(null, "nothing selected");
            }else{
               
            DefaultTableModel md = new DefaultTableModel();
            md = (DefaultTableModel) Cart_Table.getModel();
            md.addRow(new Object[]{
            id.getText(),
            name.getText(),
            price.getText(),
            qty.getText(),
            total.getText(),
                  });
            int sum = 0;
for(int i = 0; i <Cart_Table.getRowCount(); i++)
{
sum = sum + Integer.parseInt(Cart_Table.getValueAt(i, 4).toString());
}
total_tot.setText(Integer.toString(sum));
Item_count.setText(sa);
       jSpinner_C_item7.setValue(0);     
       }  
    }
                       //item8
                       if (evt.getSource()==btn_C_item8) {
            if (Integer.parseInt(jSpinner_C_item8.getValue().toString()) <= 0) {
            JOptionPane.showMessageDialog(null, "nothing selected");
            }else{
               
            DefaultTableModel md = new DefaultTableModel();
            md = (DefaultTableModel) Cart_Table.getModel();
            md.addRow(new Object[]{
            id.getText(),
            name.getText(),
            price.getText(),
            qty.getText(),
            total.getText(),
                  });
            int sum = 0;
for(int i = 0; i <Cart_Table.getRowCount(); i++)
{
sum = sum + Integer.parseInt(Cart_Table.getValueAt(i, 4).toString());
}
total_tot.setText(Integer.toString(sum));
      jSpinner_C_item8.setValue(0);     
      Item_count.setText(sa);
       }  
    }
          //item9//
          if (evt.getSource()==btn_C_item9) {
            if (Integer.parseInt(jSpinner_C_item9.getValue().toString()) <= 0) {
            JOptionPane.showMessageDialog(null, "nothing selected");
            }else{
               
            DefaultTableModel md = new DefaultTableModel();
            md = (DefaultTableModel) Cart_Table.getModel();
            md.addRow(new Object[]{
            id.getText(),
            name.getText(),
            price.getText(),
            qty.getText(),
            total.getText(),
                  });
            int sum = 0;
for(int i = 0; i <Cart_Table.getRowCount(); i++)
{
sum = sum + Integer.parseInt(Cart_Table.getValueAt(i, 4).toString());
}
total_tot.setText(Integer.toString(sum));
Item_count.setText(sa);
     jSpinner_C_item9.setValue(0);     
       }  
    }
             //item10//
             if (evt.getSource()==btn_C_item10) {
            if (Integer.parseInt(jSpinner_C_item10.getValue().toString()) <= 0) {
            JOptionPane.showMessageDialog(null, "nothing selected");
            }else{
               
            DefaultTableModel md = new DefaultTableModel();
            md = (DefaultTableModel) Cart_Table.getModel();
            md.addRow(new Object[]{
            id.getText(),
            name.getText(),
            price.getText(),
            qty.getText(),
            total.getText(),
                  });
            int sum = 0;
for(int i = 0; i <Cart_Table.getRowCount(); i++)
{
sum = sum + Integer.parseInt(Cart_Table.getValueAt(i, 4).toString());
}
total_tot.setText(Integer.toString(sum));
Item_count.setText(sa);
     jSpinner_C_item10.setValue(0);     
       }  
    }
                
              //item11//
          if (evt.getSource()==btn_C_item11) {
               if(Integer.parseInt(jSpinner_C_item11.getValue().toString()) <= 0) {
            JOptionPane.showMessageDialog(null, "nothing selected");
               }
               else{
            DefaultTableModel md = new DefaultTableModel();
            md = (DefaultTableModel) Cart_Table.getModel();
            md.addRow(new Object[]{
            id.getText(),
            name.getText(),
            price.getText(),
            qty.getText(),
            total.getText(),
                  });
            int sum = 0;
for(int i = 0; i <Cart_Table.getRowCount(); i++)
{
sum = sum + Integer.parseInt(Cart_Table.getValueAt(i, 4).toString());
}
total_tot.setText(Integer.toString(sum));
Item_count.setText(sa);
      jSpinner_C_item11.setValue(0);     
               } 
    }
         
           //item12//
           if (evt.getSource()==btn_C_item12) {

               if(Integer.parseInt(jSpinner_C_item12.getValue().toString()) <= 0) {
            JOptionPane.showMessageDialog(null, "nothing selected");
               }else{
            DefaultTableModel md = new DefaultTableModel();
            md = (DefaultTableModel) Cart_Table.getModel();
            md.addRow(new Object[]{
            id.getText(),
            name.getText(),
            price.getText(),
            qty.getText(),
            total.getText(),
                  });
            int sum = 0;
for(int i = 0; i <Cart_Table.getRowCount(); i++)
{
sum = sum + Integer.parseInt(Cart_Table.getValueAt(i, 4).toString());
}
total_tot.setText(Integer.toString(sum));
Item_count.setText(sa);
       jSpinner_C_item12.setValue(0);  
       
          } 
           }
    }//GEN-LAST:event_btn_C_item_mouse_clicked

    private void State_Change_For_G_Item(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_State_Change_For_G_Item
           if (evt.getSource()==  jSpinner_G_item1) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=37 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
             if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                    b =rs.getBytes("product_img");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);
               img_icon.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b))); 
              } 
        } catch (Exception e) { 
        }     
          
        int qtyn=Integer.parseInt(jSpinner_G_item1.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_G_item1.getValue().toString());
        total.setText((String.valueOf(tot)));
      
         
        
       
         
          jSpinner_G_item2.setValue(0); 
          jSpinner_G_item3.setValue(0); 
          jSpinner_G_item4.setValue(0); 
          jSpinner_G_item5.setValue(0); 
          jSpinner_G_item6.setValue(0); 
          jSpinner_G_item7.setValue(0); 
          jSpinner_G_item8.setValue(0); 
          jSpinner_G_item9.setValue(0); 
          jSpinner_G_item10.setValue(0); 
          jSpinner_G_item11.setValue(0); 
          jSpinner_G_item12.setValue(0); 
           
        }
          if (evt.getSource()==  jSpinner_G_item2) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=38 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
             if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                    b =rs.getBytes("product_img");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);
               img_icon.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b))); 
              } 
        } catch (Exception e) { 
        }     
          
        int qtyn=Integer.parseInt(jSpinner_G_item2.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_G_item2.getValue().toString());
        total.setText((String.valueOf(tot)));
      
         
        
       
          jSpinner_G_item1.setValue(0); 
          
          jSpinner_G_item3.setValue(0); 
          jSpinner_G_item4.setValue(0); 
          jSpinner_G_item5.setValue(0); 
          jSpinner_G_item6.setValue(0); 
          jSpinner_G_item7.setValue(0); 
          jSpinner_G_item8.setValue(0); 
          jSpinner_G_item9.setValue(0); 
          jSpinner_G_item10.setValue(0); 
          jSpinner_G_item11.setValue(0); 
          jSpinner_G_item12.setValue(0); 
           
        }if (evt.getSource()==  jSpinner_G_item3) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=39 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
             if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                    b =rs.getBytes("product_img");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);
               img_icon.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b))); 
              } 
        } catch (Exception e) { 
        }     
          
        int qtyn=Integer.parseInt(jSpinner_G_item3.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_G_item3.getValue().toString());
        total.setText((String.valueOf(tot)));
      
         
        
       
          jSpinner_G_item1.setValue(0); 
          jSpinner_G_item2.setValue(0); 
          
          jSpinner_G_item4.setValue(0); 
          jSpinner_G_item5.setValue(0); 
          jSpinner_G_item6.setValue(0); 
          jSpinner_G_item7.setValue(0); 
          jSpinner_G_item8.setValue(0); 
          jSpinner_G_item9.setValue(0); 
          jSpinner_G_item10.setValue(0); 
          jSpinner_G_item11.setValue(0); 
          jSpinner_G_item12.setValue(0); 
           
        }if (evt.getSource()==  jSpinner_G_item4) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=40 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
             if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                    b =rs.getBytes("product_img");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);
               img_icon.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b))); 
              } 
        } catch (Exception e) { 
        }     
          
        int qtyn=Integer.parseInt(jSpinner_G_item4.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_G_item4.getValue().toString());
        total.setText((String.valueOf(tot)));
      
         
        
       
          jSpinner_G_item1.setValue(0); 
          jSpinner_G_item2.setValue(0); 
          jSpinner_G_item3.setValue(0); 
 
          jSpinner_G_item5.setValue(0); 
          jSpinner_G_item6.setValue(0); 
          jSpinner_G_item7.setValue(0); 
          jSpinner_G_item8.setValue(0); 
          jSpinner_G_item9.setValue(0); 
          jSpinner_G_item10.setValue(0); 
          jSpinner_G_item11.setValue(0); 
          jSpinner_G_item12.setValue(0); 
           
        }if (evt.getSource()==  jSpinner_G_item5) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=41 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
             if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                    b =rs.getBytes("product_img");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);
               img_icon.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b))); 
              } 
        } catch (Exception e) { 
        }     
          
        int qtyn=Integer.parseInt(jSpinner_G_item5.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_G_item5.getValue().toString());
        total.setText((String.valueOf(tot)));
      
         
        
       
          jSpinner_G_item1.setValue(0); 
          jSpinner_G_item2.setValue(0); 
          jSpinner_G_item3.setValue(0); 
          jSpinner_G_item4.setValue(0); 
  
          jSpinner_G_item6.setValue(0); 
          jSpinner_G_item7.setValue(0); 
          jSpinner_G_item8.setValue(0); 
          jSpinner_G_item9.setValue(0); 
          jSpinner_G_item10.setValue(0); 
          jSpinner_G_item11.setValue(0); 
          jSpinner_G_item12.setValue(0); 
           
        }if (evt.getSource()==  jSpinner_G_item6) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=42 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
             if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                    b =rs.getBytes("product_img");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);
               img_icon.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b))); 
              } 
        } catch (Exception e) { 
        }     
          
        int qtyn=Integer.parseInt(jSpinner_G_item6.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_G_item6.getValue().toString());
        total.setText((String.valueOf(tot)));
      
         
        
       
          jSpinner_G_item1.setValue(0); 
          jSpinner_G_item2.setValue(0); 
          jSpinner_G_item3.setValue(0); 
          jSpinner_G_item4.setValue(0); 
          jSpinner_G_item5.setValue(0); 
           
          jSpinner_G_item7.setValue(0); 
          jSpinner_G_item8.setValue(0); 
          jSpinner_G_item9.setValue(0); 
          jSpinner_G_item10.setValue(0); 
          jSpinner_G_item11.setValue(0); 
          jSpinner_G_item12.setValue(0); 
           
        }if (evt.getSource()==  jSpinner_G_item7) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=43 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
             if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                    b =rs.getBytes("product_img");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);
               img_icon.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b))); 
              } 
        } catch (Exception e) { 
        }     
          
        int qtyn=Integer.parseInt(jSpinner_G_item7.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_G_item7.getValue().toString());
        total.setText((String.valueOf(tot)));
      
         
        
       
          jSpinner_G_item1.setValue(0); 
          jSpinner_G_item2.setValue(0); 
          jSpinner_G_item3.setValue(0); 
          jSpinner_G_item4.setValue(0); 
          jSpinner_G_item5.setValue(0); 
          jSpinner_G_item6.setValue(0); 
  
          jSpinner_G_item8.setValue(0); 
          jSpinner_G_item9.setValue(0); 
          jSpinner_G_item10.setValue(0); 
          jSpinner_G_item11.setValue(0); 
          jSpinner_G_item12.setValue(0); 
           
        }if (evt.getSource()==  jSpinner_G_item8) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=44 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
             if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                    b =rs.getBytes("product_img");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);
               img_icon.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b))); 
              } 
        } catch (Exception e) { 
        }     
          
        int qtyn=Integer.parseInt(jSpinner_G_item8.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_G_item8.getValue().toString());
        total.setText((String.valueOf(tot)));
      
         
        
       
          jSpinner_G_item1.setValue(0); 
          jSpinner_G_item2.setValue(0); 
          jSpinner_G_item3.setValue(0); 
          jSpinner_G_item4.setValue(0); 
          jSpinner_G_item5.setValue(0); 
          jSpinner_G_item6.setValue(0); 
          jSpinner_G_item7.setValue(0); 
    
          jSpinner_G_item9.setValue(0); 
          jSpinner_G_item10.setValue(0); 
          jSpinner_G_item11.setValue(0); 
          jSpinner_G_item12.setValue(0); 
           
        }if (evt.getSource()==  jSpinner_G_item9) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=45 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
             if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                    b =rs.getBytes("product_img");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);
               img_icon.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b))); 
              } 
        } catch (Exception e) { 
        }     
          
        int qtyn=Integer.parseInt(jSpinner_G_item9.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_G_item9.getValue().toString());
        total.setText((String.valueOf(tot)));
      
         
        
       
          jSpinner_G_item1.setValue(0); 
          jSpinner_G_item2.setValue(0); 
          jSpinner_G_item3.setValue(0); 
          jSpinner_G_item4.setValue(0); 
          jSpinner_G_item5.setValue(0); 
          jSpinner_G_item6.setValue(0); 
          jSpinner_G_item7.setValue(0); 
          jSpinner_G_item8.setValue(0); 
           
          jSpinner_G_item10.setValue(0); 
          jSpinner_G_item11.setValue(0); 
          jSpinner_G_item12.setValue(0); 
           
        }if (evt.getSource()==  jSpinner_G_item10) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=46 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
             if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                    b =rs.getBytes("product_img");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);
               img_icon.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b))); 
              } 
        } catch (Exception e) { 
        }     
          
        int qtyn=Integer.parseInt(jSpinner_G_item10.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_G_item10.getValue().toString());
        total.setText((String.valueOf(tot)));
      
         
        
       
          jSpinner_G_item1.setValue(0); 
          jSpinner_G_item2.setValue(0); 
          jSpinner_G_item3.setValue(0); 
          jSpinner_G_item4.setValue(0); 
          jSpinner_G_item5.setValue(0); 
          jSpinner_G_item6.setValue(0); 
          jSpinner_G_item7.setValue(0); 
          jSpinner_G_item8.setValue(0); 
          jSpinner_G_item9.setValue(0); 
         
          jSpinner_G_item11.setValue(0); 
          jSpinner_G_item12.setValue(0); 
           
        }if (evt.getSource()==  jSpinner_G_item11) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=47 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
             if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                    b =rs.getBytes("product_img");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);
               img_icon.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b))); 
              } 
        } catch (Exception e) { 
        }     
          
        int qtyn=Integer.parseInt(jSpinner_G_item11.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_G_item11.getValue().toString());
        total.setText((String.valueOf(tot)));
      
         
        
       
          jSpinner_G_item1.setValue(0); 
          jSpinner_G_item2.setValue(0); 
          jSpinner_G_item3.setValue(0); 
          jSpinner_G_item4.setValue(0); 
          jSpinner_G_item5.setValue(0); 
          jSpinner_G_item6.setValue(0); 
          jSpinner_G_item7.setValue(0); 
          jSpinner_G_item8.setValue(0); 
          jSpinner_G_item9.setValue(0); 
          jSpinner_G_item10.setValue(0); 
         
          jSpinner_G_item12.setValue(0); 
           
        }if (evt.getSource()==  jSpinner_G_item12) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=48";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
             if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                    b =rs.getBytes("product_img");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);
               img_icon.setIcon(new ImageIcon (Toolkit.getDefaultToolkit().createImage(b))); 
              } 
        } catch (Exception e) { 
        }     
          
        int qtyn=Integer.parseInt(jSpinner_G_item12.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_G_item12.getValue().toString());
        total.setText((String.valueOf(tot)));
      
         
        
       
          jSpinner_G_item1.setValue(0); 
          jSpinner_G_item2.setValue(0); 
          jSpinner_G_item3.setValue(0); 
          jSpinner_G_item4.setValue(0); 
          jSpinner_G_item5.setValue(0); 
          jSpinner_G_item6.setValue(0); 
          jSpinner_G_item7.setValue(0); 
          jSpinner_G_item8.setValue(0); 
          jSpinner_G_item9.setValue(0); 
          jSpinner_G_item10.setValue(0); 
          jSpinner_G_item11.setValue(0); 
         
           
        }
    }//GEN-LAST:event_State_Change_For_G_Item

    private void btn_G_item_mouse_clicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_G_item_mouse_clicked
    int rowcount = Cart_Table.getRowCount()+1;
        String sa= ""+rowcount;
        if (evt.getSource()==btn_G_item1) {
           if (Integer.parseInt(jSpinner_G_item1.getValue().toString()) <= 0) {
                JOptionPane.showMessageDialog(null, "nothing selected");
            }else{
               
            DefaultTableModel md = new DefaultTableModel();
            md = (DefaultTableModel) Cart_Table.getModel();
            md.addRow(new Object[]{
            id.getText(),
            name.getText(),
            price.getText(),
            qty.getText(),
            total.getText(),
           
              
                  });
            int sum = 0;
for(int i = 0; i <Cart_Table.getRowCount(); i++)
{
sum = sum + Integer.parseInt(Cart_Table.getValueAt(i, 4).toString());
}
total_tot.setText(Integer.toString(sum));
Item_count.setText(sa);
       jSpinner_G_item1.setValue(0);     
       }  
    }
        //item222//
        if (evt.getSource()==btn_G_item2) {
        if (Integer.parseInt(jSpinner_G_item2.getValue().toString()) <= 0) {
                JOptionPane.showMessageDialog(null, "nothing selected");
            }else{
               
            DefaultTableModel md = new DefaultTableModel();
            md = (DefaultTableModel) Cart_Table.getModel();
            md.addRow(new Object[]{
            id.getText(),
            name.getText(),
            price.getText(),
            qty.getText(),
            total.getText(),
                  });
            int sum = 0;
for(int i = 0; i <Cart_Table.getRowCount(); i++)
{
sum = sum + Integer.parseInt(Cart_Table.getValueAt(i, 4).toString());
}
total_tot.setText(Integer.toString(sum));
       jSpinner_G_item2.setValue(0);  
       Item_count.setText(sa);
       }  
    }
        
        //item3///
        if (evt.getSource()==btn_G_item3) {
           if (Integer.parseInt(jSpinner_G_item3.getValue().toString()) <= 0) {
                JOptionPane.showMessageDialog(null, "nothing selected");
            }else{
               
            DefaultTableModel md = new DefaultTableModel();
            md = (DefaultTableModel) Cart_Table.getModel();
            md.addRow(new Object[]{
            id.getText(),
            name.getText(),
            price.getText(),
            qty.getText(),
            total.getText(),
                  });
            int sum = 0;
for(int i = 0; i <Cart_Table.getRowCount(); i++)
{
sum = sum + Integer.parseInt(Cart_Table.getValueAt(i, 4).toString());
}
total_tot.setText(Integer.toString(sum));
Item_count.setText(sa);
       jSpinner_G_item3.setValue(0);     
       } 
    }
           
           ///item4///
           if (evt.getSource()==btn_G_item4) {
              if (Integer.parseInt(jSpinner_G_item4.getValue().toString()) <= 0) {
                JOptionPane.showMessageDialog(null, "nothing selected");
            }else{
               
            DefaultTableModel md = new DefaultTableModel();
            md = (DefaultTableModel) Cart_Table.getModel();
            md.addRow(new Object[]{
            id.getText(),
            name.getText(),
            price.getText(),
            qty.getText(),
            total.getText(),
                  });
            int sum = 0;
for(int i = 0; i <Cart_Table.getRowCount(); i++)
{
sum = sum + Integer.parseInt(Cart_Table.getValueAt(i, 4).toString());
}
total_tot.setText(Integer.toString(sum));
Item_count.setText(sa);
       jSpinner_G_item4.setValue(0);     
       }  
    }
             //item5//
             if (evt.getSource()==btn_G_item5) {
            if (Integer.parseInt(jSpinner_G_item5.getValue().toString()) <= 0) {
             JOptionPane.showMessageDialog(null, "nothing selected");
            }else{
               
            DefaultTableModel md = new DefaultTableModel();
            md = (DefaultTableModel) Cart_Table.getModel();
            md.addRow(new Object[]{
            id.getText(),
            name.getText(),
            price.getText(),
            qty.getText(),
            total.getText(),
                  });
            int sum = 0;
for(int i = 0; i <Cart_Table.getRowCount(); i++)
{
sum = sum + Integer.parseInt(Cart_Table.getValueAt(i, 4).toString());
}
total_tot.setText(Integer.toString(sum));
Item_count.setText(sa);
       jSpinner_G_item5.setValue(0);     
       }  
    }
                 //item6//
                 if (evt.getSource()==btn_G_item6) {
            if (Integer.parseInt(jSpinner_G_item6.getValue().toString()) <= 0) {
            JOptionPane.showMessageDialog(null, "nothing selected");
            }else{
               
            DefaultTableModel md = new DefaultTableModel();
            md = (DefaultTableModel) Cart_Table.getModel();
            md.addRow(new Object[]{
            id.getText(),
            name.getText(),
            price.getText(),
            qty.getText(),
            total.getText(),
                  });
            int sum = 0;
for(int i = 0; i <Cart_Table.getRowCount(); i++)
{
sum = sum + Integer.parseInt(Cart_Table.getValueAt(i, 4).toString());
}
total_tot.setText(Integer.toString(sum));
Item_count.setText(sa);
       jSpinner_G_item6.setValue(0);     
       } 
    }
                    ///item7//
                    if (evt.getSource()==btn_G_item7) {
            if (Integer.parseInt(jSpinner_G_item7.getValue().toString()) <= 0) {
            JOptionPane.showMessageDialog(null, "nothing selected");
            }else{
               
            DefaultTableModel md = new DefaultTableModel();
            md = (DefaultTableModel) Cart_Table.getModel();
            md.addRow(new Object[]{
            id.getText(),
            name.getText(),
            price.getText(),
            qty.getText(),
            total.getText(),
                  });
            int sum = 0;
for(int i = 0; i <Cart_Table.getRowCount(); i++)
{
sum = sum + Integer.parseInt(Cart_Table.getValueAt(i, 4).toString());
}
total_tot.setText(Integer.toString(sum));
Item_count.setText(sa);
       jSpinner_G_item7.setValue(0);     
       }  
    }
                       //item8
                       if (evt.getSource()==btn_G_item8) {
            if (Integer.parseInt(  jSpinner_G_item8.getValue().toString()) <= 0) {
            JOptionPane.showMessageDialog(null, "nothing selected");
            }else{
               
            DefaultTableModel md = new DefaultTableModel();
            md = (DefaultTableModel) Cart_Table.getModel();
            md.addRow(new Object[]{
            id.getText(),
            name.getText(),
            price.getText(),
            qty.getText(),
            total.getText(),
                  });
            int sum = 0;
for(int i = 0; i <Cart_Table.getRowCount(); i++)
{
sum = sum + Integer.parseInt(Cart_Table.getValueAt(i, 4).toString());
}
total_tot.setText(Integer.toString(sum));
        jSpinner_G_item8.setValue(0);   
        Item_count.setText(sa);
       }  
    }
          //item9//
          if (evt.getSource()==btn_G_item9) {
            if (Integer.parseInt(  jSpinner_G_item9.getValue().toString()) <= 0) {
            JOptionPane.showMessageDialog(null, "nothing selected");
            }else{
               
            DefaultTableModel md = new DefaultTableModel();
            md = (DefaultTableModel) Cart_Table.getModel();
            md.addRow(new Object[]{
            id.getText(),
            name.getText(),
            price.getText(),
            qty.getText(),
            total.getText(),
                  });
            int sum = 0;
for(int i = 0; i <Cart_Table.getRowCount(); i++)
{
sum = sum + Integer.parseInt(Cart_Table.getValueAt(i, 4).toString());
}
total_tot.setText(Integer.toString(sum));
Item_count.setText(sa);
       jSpinner_G_item9.setValue(0);     
       }  
    }
             //item10//
             if (evt.getSource()==btn_G_item10) {
            if (Integer.parseInt(  jSpinner_G_item10.getValue().toString()) <= 0) {
            JOptionPane.showMessageDialog(null, "nothing selected");
            }else{
               
            DefaultTableModel md = new DefaultTableModel();
            md = (DefaultTableModel) Cart_Table.getModel();
            md.addRow(new Object[]{
            id.getText(),
            name.getText(),
            price.getText(),
            qty.getText(),
            total.getText(),
                  });
            int sum = 0;
for(int i = 0; i <Cart_Table.getRowCount(); i++)
{
sum = sum + Integer.parseInt(Cart_Table.getValueAt(i, 4).toString());
}
total_tot.setText(Integer.toString(sum));
Item_count.setText(sa);
       jSpinner_G_item10.setValue(0);     
       }  
    }
                
              //item11//
          if (evt.getSource()==btn_G_item11) {
               if(Integer.parseInt( jSpinner_G_item11.getValue().toString()) <= 0) {
            JOptionPane.showMessageDialog(null, "nothing selected");
               }
               else{
            DefaultTableModel md = new DefaultTableModel();
            md = (DefaultTableModel) Cart_Table.getModel();
            md.addRow(new Object[]{
            id.getText(),
            name.getText(),
            price.getText(),
            qty.getText(),
            total.getText(),
                  });
            int sum = 0;
for(int i = 0; i <Cart_Table.getRowCount(); i++)
{
sum = sum + Integer.parseInt(Cart_Table.getValueAt(i, 4).toString());
}
total_tot.setText(Integer.toString(sum));
Item_count.setText(sa);
       jSpinner_G_item11.setValue(0);     
               } 
    }
         
           //item12//
           if (evt.getSource()==btn_G_item12) {

               if(Integer.parseInt( jSpinner_G_item12.getValue().toString()) <= 0) {
            JOptionPane.showMessageDialog(null, "nothing selected");
               }else{
            DefaultTableModel md = new DefaultTableModel();
            md = (DefaultTableModel) Cart_Table.getModel();
            md.addRow(new Object[]{
            id.getText(),
            name.getText(),
            price.getText(),
            qty.getText(),
            total.getText(),
                  });
            int sum = 0;
for(int i = 0; i <Cart_Table.getRowCount(); i++)
{
sum = sum + Integer.parseInt(Cart_Table.getValueAt(i, 4).toString());
}
total_tot.setText(Integer.toString(sum));
Item_count.setText(sa);
       jSpinner_G_item12.setValue(0);  
       
          } 
           }
    }//GEN-LAST:event_btn_G_item_mouse_clicked

    private void jTextField2CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField2CaretUpdate
        sss();
    }//GEN-LAST:event_jTextField2CaretUpdate

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void order_table_details1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_order_table_details1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_order_table_details1MouseClicked

    private void NAME_OF_USERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NAME_OF_USERActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NAME_OF_USERActionPerformed

    
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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Address_pn;
    private javax.swing.JLabel Back_to_address;
    private javax.swing.JLabel Back_to_cart;
    private javax.swing.JLabel Back_to_delivery;
    private javax.swing.JLabel Back_to_payment;
    private javax.swing.JPanel Cart;
    private javax.swing.JTable Cart_Table;
    private javax.swing.JPanel Clothes;
    private javax.swing.JPanel Delivery_option;
    private javax.swing.JPanel Eletronic;
    private javax.swing.JPanel Furniture;
    private javax.swing.JPanel Games;
    private javax.swing.JButton Go_to_address_btn;
    private javax.swing.JButton Go_to_delivery_btn;
    private javax.swing.JButton Go_to_payment_btn;
    private javax.swing.JButton Go_to_place_order_btn;
    private javax.swing.JPanel Help;
    private javax.swing.JPanel Home;
    private javax.swing.JLabel Item_count;
    private javax.swing.JPanel MenuBar;
    public static javax.swing.JTextField NAME_OF_USER;
    private javax.swing.JTextField Order_State;
    private javax.swing.JLabel Payment_mhthod_rv;
    private javax.swing.JPanel Payment_pn;
    private javax.swing.JButton Place_order_btn;
    private javax.swing.JPanel PnElectronic;
    private javax.swing.JPanel Product_Info;
    private javax.swing.JTextArea Text_Area_For_Bill;
    public static javax.swing.JTextField User_id;
    private javax.swing.JButton btn_Add_address;
    private javax.swing.JButton btn_C_item1;
    private javax.swing.JButton btn_C_item10;
    private javax.swing.JButton btn_C_item11;
    private javax.swing.JButton btn_C_item12;
    private javax.swing.JButton btn_C_item2;
    private javax.swing.JButton btn_C_item3;
    private javax.swing.JButton btn_C_item4;
    private javax.swing.JButton btn_C_item5;
    private javax.swing.JButton btn_C_item6;
    private javax.swing.JButton btn_C_item7;
    private javax.swing.JButton btn_C_item8;
    private javax.swing.JButton btn_C_item9;
    private javax.swing.JButton btn_F_item1;
    private javax.swing.JButton btn_F_item10;
    private javax.swing.JButton btn_F_item11;
    private javax.swing.JButton btn_F_item12;
    private javax.swing.JButton btn_F_item2;
    private javax.swing.JButton btn_F_item3;
    private javax.swing.JButton btn_F_item4;
    private javax.swing.JButton btn_F_item5;
    private javax.swing.JButton btn_F_item6;
    private javax.swing.JButton btn_F_item7;
    private javax.swing.JButton btn_F_item8;
    private javax.swing.JButton btn_F_item9;
    private javax.swing.JButton btn_G_item1;
    private javax.swing.JButton btn_G_item10;
    private javax.swing.JButton btn_G_item11;
    private javax.swing.JButton btn_G_item12;
    private javax.swing.JButton btn_G_item2;
    private javax.swing.JButton btn_G_item3;
    private javax.swing.JButton btn_G_item4;
    private javax.swing.JButton btn_G_item5;
    private javax.swing.JButton btn_G_item6;
    private javax.swing.JButton btn_G_item7;
    private javax.swing.JButton btn_G_item8;
    private javax.swing.JButton btn_G_item9;
    private javax.swing.JComboBox<String> card_expire_month;
    private javax.swing.JComboBox<String> card_expire_year;
    private javax.swing.JLabel delivery_price;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel icon_lbl;
    private javax.swing.JTextField id;
    private javax.swing.JLabel img_icon;
    private javax.swing.JButton item10_btn;
    private javax.swing.JLabel item10_img;
    private javax.swing.JLabel item10_img1;
    private javax.swing.JLabel item10_img2;
    private javax.swing.JLabel item10_img3;
    private javax.swing.JLabel item10_name;
    private javax.swing.JLabel item10_name1;
    private javax.swing.JLabel item10_name2;
    private javax.swing.JLabel item10_name3;
    private javax.swing.JLabel item10_price;
    private javax.swing.JLabel item10_price1;
    private javax.swing.JLabel item10_price2;
    private javax.swing.JLabel item10_price3;
    private javax.swing.JButton item11_btn;
    private javax.swing.JLabel item11_img;
    private javax.swing.JLabel item11_img1;
    private javax.swing.JLabel item11_img2;
    private javax.swing.JLabel item11_img3;
    private javax.swing.JLabel item11_name;
    private javax.swing.JLabel item11_name1;
    private javax.swing.JLabel item11_name2;
    private javax.swing.JLabel item11_name3;
    private javax.swing.JLabel item11_price;
    private javax.swing.JLabel item11_price1;
    private javax.swing.JLabel item11_price2;
    private javax.swing.JLabel item11_price3;
    private javax.swing.JButton item12_btn;
    private javax.swing.JLabel item12_img;
    private javax.swing.JLabel item12_img1;
    private javax.swing.JLabel item12_img2;
    private javax.swing.JLabel item12_img3;
    private javax.swing.JLabel item12_name;
    private javax.swing.JLabel item12_name1;
    private javax.swing.JLabel item12_name2;
    private javax.swing.JLabel item12_name3;
    private javax.swing.JLabel item12_price;
    private javax.swing.JLabel item12_price1;
    private javax.swing.JLabel item12_price2;
    private javax.swing.JLabel item12_price3;
    private javax.swing.JButton item1_btn;
    private javax.swing.JLabel item1_img;
    private javax.swing.JLabel item1_img1;
    private javax.swing.JLabel item1_img2;
    private javax.swing.JLabel item1_img3;
    private javax.swing.JLabel item1_name;
    private javax.swing.JLabel item1_name1;
    private javax.swing.JLabel item1_name2;
    private javax.swing.JLabel item1_name3;
    private javax.swing.JLabel item1_price;
    private javax.swing.JLabel item1_price1;
    private javax.swing.JLabel item1_price2;
    private javax.swing.JLabel item1_price3;
    private javax.swing.JButton item2_btn;
    private javax.swing.JLabel item2_img;
    private javax.swing.JLabel item2_img1;
    private javax.swing.JLabel item2_img2;
    private javax.swing.JLabel item2_img3;
    private javax.swing.JLabel item2_name;
    private javax.swing.JLabel item2_name1;
    private javax.swing.JLabel item2_name2;
    private javax.swing.JLabel item2_name3;
    private javax.swing.JLabel item2_price;
    private javax.swing.JLabel item2_price1;
    private javax.swing.JLabel item2_price2;
    private javax.swing.JLabel item2_price3;
    private javax.swing.JButton item3_btn;
    private javax.swing.JLabel item3_img;
    private javax.swing.JLabel item3_img1;
    private javax.swing.JLabel item3_img2;
    private javax.swing.JLabel item3_img3;
    private javax.swing.JLabel item3_name;
    private javax.swing.JLabel item3_name1;
    private javax.swing.JLabel item3_name2;
    private javax.swing.JLabel item3_name3;
    private javax.swing.JLabel item3_price;
    private javax.swing.JLabel item3_price1;
    private javax.swing.JLabel item3_price2;
    private javax.swing.JLabel item3_price3;
    private javax.swing.JButton item4_btn;
    private javax.swing.JLabel item4_img;
    private javax.swing.JLabel item4_img1;
    private javax.swing.JLabel item4_img2;
    private javax.swing.JLabel item4_img3;
    private javax.swing.JLabel item4_name;
    private javax.swing.JLabel item4_name1;
    private javax.swing.JLabel item4_name2;
    private javax.swing.JLabel item4_name3;
    private javax.swing.JLabel item4_price;
    private javax.swing.JLabel item4_price1;
    private javax.swing.JLabel item4_price2;
    private javax.swing.JLabel item4_price3;
    private javax.swing.JButton item5_btn;
    private javax.swing.JLabel item5_img;
    private javax.swing.JLabel item5_img1;
    private javax.swing.JLabel item5_img2;
    private javax.swing.JLabel item5_img3;
    private javax.swing.JLabel item5_name;
    private javax.swing.JLabel item5_name1;
    private javax.swing.JLabel item5_name2;
    private javax.swing.JLabel item5_name3;
    private javax.swing.JLabel item5_price;
    private javax.swing.JLabel item5_price1;
    private javax.swing.JLabel item5_price2;
    private javax.swing.JLabel item5_price3;
    private javax.swing.JButton item6_btn;
    private javax.swing.JLabel item6_img;
    private javax.swing.JLabel item6_img1;
    private javax.swing.JLabel item6_img2;
    private javax.swing.JLabel item6_img3;
    private javax.swing.JLabel item6_name;
    private javax.swing.JLabel item6_name1;
    private javax.swing.JLabel item6_name2;
    private javax.swing.JLabel item6_name3;
    private javax.swing.JLabel item6_price;
    private javax.swing.JLabel item6_price1;
    private javax.swing.JLabel item6_price2;
    private javax.swing.JLabel item6_price3;
    private javax.swing.JButton item7_btn;
    private javax.swing.JLabel item7_img;
    private javax.swing.JLabel item7_img1;
    private javax.swing.JLabel item7_img2;
    private javax.swing.JLabel item7_img3;
    private javax.swing.JLabel item7_name;
    private javax.swing.JLabel item7_name1;
    private javax.swing.JLabel item7_name2;
    private javax.swing.JLabel item7_name3;
    private javax.swing.JLabel item7_price;
    private javax.swing.JLabel item7_price1;
    private javax.swing.JLabel item7_price2;
    private javax.swing.JLabel item7_price3;
    private javax.swing.JButton item8_btn;
    private javax.swing.JLabel item8_img;
    private javax.swing.JLabel item8_img1;
    private javax.swing.JLabel item8_img2;
    private javax.swing.JLabel item8_img3;
    private javax.swing.JLabel item8_name;
    private javax.swing.JLabel item8_name1;
    private javax.swing.JLabel item8_name2;
    private javax.swing.JLabel item8_name3;
    private javax.swing.JLabel item8_price;
    private javax.swing.JLabel item8_price1;
    private javax.swing.JLabel item8_price2;
    private javax.swing.JLabel item8_price3;
    private javax.swing.JButton item9_btn;
    private javax.swing.JLabel item9_img;
    private javax.swing.JLabel item9_img1;
    private javax.swing.JLabel item9_img2;
    private javax.swing.JLabel item9_img3;
    private javax.swing.JLabel item9_name;
    private javax.swing.JLabel item9_name1;
    private javax.swing.JLabel item9_name2;
    private javax.swing.JLabel item9_name3;
    private javax.swing.JLabel item9_price;
    private javax.swing.JLabel item9_price1;
    private javax.swing.JLabel item9_price2;
    private javax.swing.JLabel item9_price3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
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
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel68;
    private javax.swing.JPanel jPanel69;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadio_cash_payment;
    private javax.swing.JRadioButton jRadio_cradit_payment;
    private javax.swing.JRadioButton jRadio_gold;
    private javax.swing.JRadioButton jRadio_permium;
    private javax.swing.JRadioButton jRadio_silver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JSpinner jSpinner_C_item1;
    private javax.swing.JSpinner jSpinner_C_item10;
    private javax.swing.JSpinner jSpinner_C_item11;
    private javax.swing.JSpinner jSpinner_C_item12;
    private javax.swing.JSpinner jSpinner_C_item2;
    private javax.swing.JSpinner jSpinner_C_item3;
    private javax.swing.JSpinner jSpinner_C_item4;
    private javax.swing.JSpinner jSpinner_C_item5;
    private javax.swing.JSpinner jSpinner_C_item6;
    private javax.swing.JSpinner jSpinner_C_item7;
    private javax.swing.JSpinner jSpinner_C_item8;
    private javax.swing.JSpinner jSpinner_C_item9;
    private javax.swing.JSpinner jSpinner_F_item1;
    private javax.swing.JSpinner jSpinner_F_item10;
    private javax.swing.JSpinner jSpinner_F_item11;
    private javax.swing.JSpinner jSpinner_F_item12;
    private javax.swing.JSpinner jSpinner_F_item2;
    private javax.swing.JSpinner jSpinner_F_item3;
    private javax.swing.JSpinner jSpinner_F_item4;
    private javax.swing.JSpinner jSpinner_F_item5;
    private javax.swing.JSpinner jSpinner_F_item6;
    private javax.swing.JSpinner jSpinner_F_item7;
    private javax.swing.JSpinner jSpinner_F_item8;
    private javax.swing.JSpinner jSpinner_F_item9;
    private javax.swing.JSpinner jSpinner_G_item1;
    private javax.swing.JSpinner jSpinner_G_item10;
    private javax.swing.JSpinner jSpinner_G_item11;
    private javax.swing.JSpinner jSpinner_G_item12;
    private javax.swing.JSpinner jSpinner_G_item2;
    private javax.swing.JSpinner jSpinner_G_item3;
    private javax.swing.JSpinner jSpinner_G_item4;
    private javax.swing.JSpinner jSpinner_G_item5;
    private javax.swing.JSpinner jSpinner_G_item6;
    private javax.swing.JSpinner jSpinner_G_item7;
    private javax.swing.JSpinner jSpinner_G_item8;
    private javax.swing.JSpinner jSpinner_G_item9;
    private javax.swing.JSpinner jSpinner_item1;
    private javax.swing.JSpinner jSpinner_item10;
    private javax.swing.JSpinner jSpinner_item11;
    private javax.swing.JSpinner jSpinner_item12;
    private javax.swing.JSpinner jSpinner_item2;
    private javax.swing.JSpinner jSpinner_item3;
    private javax.swing.JSpinner jSpinner_item4;
    private javax.swing.JSpinner jSpinner_item5;
    private javax.swing.JSpinner jSpinner_item6;
    private javax.swing.JSpinner jSpinner_item7;
    private javax.swing.JSpinner jSpinner_item8;
    private javax.swing.JSpinner jSpinner_item9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel10;
    private keeptoo.KGradientPanel kGradientPanel11;
    private keeptoo.KGradientPanel kGradientPanel12;
    private keeptoo.KGradientPanel kGradientPanel13;
    private keeptoo.KGradientPanel kGradientPanel2;
    private keeptoo.KGradientPanel kGradientPanel3;
    private keeptoo.KGradientPanel kGradientPanel4;
    private keeptoo.KGradientPanel kGradientPanel5;
    private keeptoo.KGradientPanel kGradientPanel6;
    private keeptoo.KGradientPanel kGradientPanel7;
    private keeptoo.KGradientPanel kGradientPanel8;
    private keeptoo.KGradientPanel kGradientPanel9;
    private javax.swing.JPanel myorder_pn;
    private javax.swing.JTextField name;
    private javax.swing.JTable order_table_details;
    private javax.swing.JTable order_table_details1;
    private javax.swing.JPanel place_order_pn;
    private javax.swing.JPanel pnCart;
    private javax.swing.JPanel pnClothes;
    private javax.swing.JPanel pnFurniture;
    private javax.swing.JPanel pnHelp;
    private javax.swing.JPanel pnHome;
    private javax.swing.JPanel pnShoes;
    private javax.swing.JPanel pn_add_card;
    private javax.swing.JTextField price;
    private javax.swing.JTextField qty;
    private javax.swing.JLabel service_price;
    private javax.swing.JLabel service_price_gold;
    private javax.swing.JLabel service_price_premium;
    private javax.swing.JLabel service_price_silver;
    private javax.swing.JLabel service_time;
    private javax.swing.JLabel service_time_gold;
    private javax.swing.JLabel service_time_premium;
    private javax.swing.JLabel service_time_silver;
    private javax.swing.JLabel service_type;
    private javax.swing.JLabel service_type_gold;
    private javax.swing.JLabel service_type_premium;
    private javax.swing.JLabel service_type_silver;
    private javax.swing.JLabel subtotal_revw;
    private javax.swing.JTextField total;
    private javax.swing.JLabel total_price_rview;
    private javax.swing.JLabel total_tot;
    private javax.swing.JTextField txt_Adrs_City;
    private javax.swing.JTextField txt_Adrs_Country;
    private javax.swing.JTextField txt_Adrs_House_Street;
    private javax.swing.JTextField txt_Adrs_Name;
    private javax.swing.JTextField txt_Adrs_Phone;
    private javax.swing.JTextField txt_Adrs_Pin;
    private javax.swing.JTextField txt_Adrs_State;
    private javax.swing.JTextArea txt_Area_For_Address1;
    private javax.swing.JTextField txt_User_Name_For_Address;
    private javax.swing.JTextArea txt_address_reviw;
    private javax.swing.JTextField txt_card_no;
    private javax.swing.JTextField txt_name_on_card;
    // End of variables declaration//GEN-END:variables
byte[] img =null;
String filename=null;

}

