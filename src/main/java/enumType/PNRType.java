package enumType;

public enum PNRType {
	REVENUE("REVENUE"),
	STAFF("STAFF_PNR"),
	GROUP("GROUP_PNR"),
	SPLIT_PNR("SPLIT_PARTY_PNR"),
	PNR_WITH_CHAUFFEUR_DRIVE("PNR_WITH_CHAUFFEUR_DRIVE"),
    JTOP_PNR("JTOP_PNR"),
    UMNR("UMNR"),
    GDS("GDS"),
    REVENUE_CASH_MILES("REVENUE_CASH_MILES"),
    BUSINESS_REWARD_REVENUE("BUSINESS_REWARD_REVENUE"),
    WAITLIST("WAITLIST"),
    WAITLIST_PA("WAITLIST_PA"),
    WAITLIST_PB("WAITLIST_PB"),
    WAITLIST_PC("WAITLIST_PC"),
    WAITLIST_PD("WAITLIST_PD"),
    REDEMPTION("REDEMPTION");
	
	private String type;
	
	private PNRType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}
}
