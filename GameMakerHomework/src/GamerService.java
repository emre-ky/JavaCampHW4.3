import java.rmi.RemoteException;

public interface GamerService {

	void add(Gamer gamer) throws RemoteException;

	void updateAccount(Gamer gamer);

	void deleteAccount(Gamer gamer);
	
}
