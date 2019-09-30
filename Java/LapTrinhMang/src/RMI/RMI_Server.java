package RMI;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author NguyenTuanVu
 */
public class RMI_Server {

	public RMI_Server() {
		try {
			MyMath myMath = new MyMath();
			System.out.println("Server ready...");
			// Đăng ký cổng
			LocateRegistry.createRegistry(1985);
			Registry registry = LocateRegistry.getRegistry(1985);
			// Đưa ra cổng
			registry.rebind("/MyMath", myMath);
		} catch (RemoteException ex) {

		}
	}

	public static void main(String[] args) {
		RMI_Server rMI_Server = new RMI_Server();

	}

}
