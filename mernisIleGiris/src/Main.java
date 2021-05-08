import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Main {


public static void main(String[] args) throws RemoteException{
	
	KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
	
	boolean result = kpsPublic.TCKimlikNoDogrula(
			Long.parseLong("1234123232323"),
					"Engin",
					"Demirog",
					1993 //Dogum Yili
			);
			
	System.out.println("dogrulama: " + (result ? "basarili" : "basarisiz"));

	}

}