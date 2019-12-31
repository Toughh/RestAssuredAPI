package enumType;

public enum CardType {
	VISA("VISA", "4444333322221111", "123", "0521"),
    MASTER("MASTER", "5120790000000018", "123", "0521"),
    AMEX("AMEX", "345678901234564", "1234", "0521"),
    MAESTRO("MAESTRO", "5641821000010028", "123", "0521"),
    UATP("UATP", "135412345678911", "123", "0521"),
    THREED("THREED", "5123456789012346", "123", "0521"),
	INDIAN_CARD("INDIAN_CARD", "4005550000000001", "123", "0521"),
    JCB("JCB", "3528000700000000", "123", "0521");
	
	private String cardName;
	private String cardNumber;
	private String cardCVN;
	private String cardExpiryDate;
	
	CardType(String cardName, String cardNumber, String cardCVN, String cardExpiryDate) {
		this.cardName=cardName;
		this.cardNumber=cardNumber;
		this.cardCVN=cardCVN;
		this.cardExpiryDate=cardExpiryDate;
	}
	
	public String getCardName() {
		return cardName;
	}
	
	public String getCardNumber() {
		return cardNumber;
	}
	
	public String getCardCVN() {
		return cardCVN;
	}
	
	public String getCardExpiryDate() {
		return cardExpiryDate;
	}
}

