/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.project.hotel.management;
import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Dinith
 */
public class Predict {
    
    public Float PredictPay(String room,String Service1,String Service2,String Service3,String Service4,String Service5,String Service6,int days) {
        DBConnect conn=new DBConnect();
        Connection cp=conn.connect();
       
        try{
            Statement s5=cp.createStatement();
            ResultSet rsroom=s5.executeQuery("select charges from rooms where rno='"+room+"'");
            ResultSet rsService1=s5.executeQuery("select charges from service where sid='"+Service1+"'");
            ResultSet rsService2=s5.executeQuery("select charges from service where sid='"+Service2+"'");
            ResultSet rsService3=s5.executeQuery("select charges from service where sid='"+Service3+"'");
            ResultSet rsService4=s5.executeQuery("select charges from service where sid='"+Service4+"'");
            ResultSet rsService5=s5.executeQuery("select charges from service where sid='"+Service5+"'");
            ResultSet rsService6=s5.executeQuery("select charges from service where sid='"+Service6+"'");
          
            Float roomcharge=0f,servicecharge1=0f,servicecharge2=0f,servicecharge3=0f,servicecharge4=0f,servicecharge5=0f,servicecharge6=0f;
            while (rsroom.next()){
                roomcharge=rsroom.getFloat(1);
            }
            while(rsService1.next()){
                servicecharge1=rsService1.getFloat(1);
                 if (servicecharge1.isNaN()){
                    servicecharge1=0f;
                }
            }
              while(rsService2.next()){
                servicecharge2=rsService2.getFloat(1);
                if (servicecharge2.isNaN()){
                    servicecharge2=0f;
                }
            }
                while(rsService3.next()){
                servicecharge3=rsService3.getFloat(1);
                 if (servicecharge3.isNaN()){
                    servicecharge3=0f;
                }
                }
                  while(rsService4.next()){
                servicecharge4=rsService4.getFloat(1);
                 if (servicecharge4.isNaN()){
                    servicecharge4=0f;
                }
                
                  }
                    while(rsService5.next()){
                servicecharge5=rsService5.getFloat(1);
                     if (servicecharge5.isNaN()){
                    servicecharge5=0f;
                }
                    }  
                    while(rsService6.next()){
                servicecharge6=rsService6.getFloat(1);
                     if (servicecharge6.isNaN()){
                    servicecharge6=0f;
                }
                    }
            
        Float totpred=roomcharge;
        
        }
        catch(SQLException e){
            
        }
        Float totpred = null;
        
        return totpred;
    }
}
