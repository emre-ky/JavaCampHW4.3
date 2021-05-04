import java.rmi.RemoteException;

public interface ValidationService {
	
	boolean validation (Gamer gamer) throws RemoteException;

}
