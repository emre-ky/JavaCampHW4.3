import java.rmi.RemoteException;

public class GamerManager implements GamerService{
	
	
	ValidationService validation;

	public GamerManager(ValidationService validation) {
		super();
		this.validation = validation;
	}

	@Override
	public void add(Gamer gamer) throws RemoteException {
		
		if (validation.validation(gamer)) {
			
			System.out.println("Eklendi : "+gamer.getFirstName());}
		
	
		else {
			
			System.out.println("Hata ");
			
			
			
		}
		
		
			
			
			
	
			
			
		
		
		
		
		
	}

	@Override
	public void updateAccount(Gamer gamer) {
		
		
	}

	@Override
	public void deleteAccount(Gamer gamer) {

		
	}

}
