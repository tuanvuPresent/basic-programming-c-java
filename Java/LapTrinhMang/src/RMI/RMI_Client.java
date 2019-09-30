package RMI;

import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author NguyenTuanVu
 */
public class RMI_Client {

    static String ip = "LocalHost";
    static int port = 1985;

    public static void main(String[] args) {
        try {
            //đăng ký cổng
            Registry registry = LocateRegistry.getRegistry(ip, port);
            TinhTong tinhTong = (TinhTong) registry.lookup("/MyMath");
            //Gọi hàm từ server
            System.out.println("" + tinhTong.add(3, 4));
            System.out.println("" + tinhTong.add(10, 4));
            System.out.println("" + tinhTong.add(6, 4));
            System.out.println("" + tinhTong.add(5, 4));
        } catch (RemoteException ex) {
            System.out.println("không gọi được hàm");
        } catch (NotBoundException ex) {

        }
    }
}
