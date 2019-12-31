package requestBody;

import org.json.JSONObject;
import enumType.*;

public class Requestbody {
	
	JSONObject requestParams = new JSONObject();
	
	public Requestbody() {
	}
	
	public String bodyToSend() {
		requestParams.put("enivironment", Environment.UAT);
		requestParams.put("pnrType", PNRType.REVENUE);
		requestParams.put("cabinClass", "Y");
		requestParams.put("offLinePayment", "");
		requestParams.put("staffTicketType", "");
		requestParams.put("noOfPnr", "1");
		requestParams.put("flightNumber", "EK0856");
		requestParams.put("departureDate", "31mar20");
		requestParams.put("route", "KWI-DXB");
		requestParams.put("pointOfSale", "KWI");
		requestParams.put("adultPaxCount", "1");
		requestParams.put("childpaxcount", "0");
		requestParams.put("infantonlappaxcount", "0");
		requestParams.put("infantonseatpaxcount", "0");
		requestParams.put("ffp", "EK518943095");
		requestParams.put("personId", "");
		requestParams.put("mobileNumber", "");
		requestParams.put("emailId", "");
		requestParams.put("milesToSpend", "");
		requestParams.put("specialSSR", "");
		requestParams.put("mealssrindicator", "");
		requestParams.put("formOfPayment", "");
		requestParams.put("ccType", CardType.VISA.getCardName());
		requestParams.put("ccNumber", CardType.VISA.getCardCVN());
		requestParams.put("ccExpiry", CardType.VISA.getCardExpiryDate());
		requestParams.put("issueeticketindicator", "true");
		requestParams.put("holdMyFare", "false");
		requestParams.put("docSSR", "");
		
		return requestParams.toString();
	}
}
