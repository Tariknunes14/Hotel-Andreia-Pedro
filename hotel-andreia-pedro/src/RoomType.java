public enum RoomType {
    SINGLE(150,"Single Room"),
    DOUBLE(250,"Double Room"),
    SUITE(350,"SUITE Room");

//	enum PriceTable {
//        100,
//		150,
//		250
//	}

    private int basePrice;
    private String displayName;


    RoomType(int basePrice, String displayName) {
        this.basePrice = basePrice;
        this.displayName = displayName;
    }

//    public RoomType values() {
//        return RoomType;
//    };

    public int getBasePrice() {
        return basePrice;
    }


    public String getDisplayName() {
        return displayName;
    }

    public RoomType valueOf() {
        if(displayName.equals("Single Room")){
           return RoomType.SINGLE;
        }
        if(displayName.equals("Double Room")){
            return RoomType.DOUBLE;
        }
        if(displayName.equals("SUITE Room")){
            return RoomType.SUITE;
        }
        return null;
    }

}
