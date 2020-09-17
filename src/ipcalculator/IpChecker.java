/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipcalculator;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Asus
 */
public class IpChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("www.polinema.ac.id");
            InetAddress address2 = InetAddress.getByName("113.6.41.77");
            System.out.println("" + address.getHostAddress());
            System.out.println("" + address2.getHostName());
            if (address.equals(address2)) {
                System.out.println("Alamat Sama");
            }else{
                System.out.println("Alamat tidak sama");
            }
        } catch (UnknownHostException e) {
            Logger.getLogger(IpChecker.class.getName()).log(Level.SEVERE, null,e);
        }
    }
    
}
