package Constructor;

public class Charger_Class {   // Early Instantiation using the Constructor
	
	private  String charger_type;
	
	public String GetCharger_type() {
		
		return charger_type;
	}
	
   public void SetCharger(String CH_TYPE ) {
		
		charger_type = CH_TYPE;
	
	}
	
	public Charger_Class (String CH_TYPE) {
		
		charger_type = CH_TYPE;
	}
	

}
