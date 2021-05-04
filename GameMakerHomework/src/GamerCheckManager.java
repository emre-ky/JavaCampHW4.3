import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class GamerCheckManager implements ValidationService {

	@Override
	public boolean validation(Gamer gamer) throws RemoteException {
		
		KPSPublicSoap kpsPublicSoap = new KPSPublicSoapProxy();
		
		return kpsPublicSoap.TCKimlikNoDogrula(gamer.getNationalIdentity(), gamer.getFirstName().toUpperCase(), gamer.getLastName().toUpperCase(), gamer.getBirthDate());
		
		
		
		
		
		
		
	}

}
