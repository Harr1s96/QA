package library;

public abstract class Item {

    private String checkInTime;
    private String checkOutTime;
    private String itemName; 

    public Item() {
        
        super();
    }


    public abstract void checkInItem();

    public abstract void checkOutItem();

    /**
     * @param checkInTime the checkInTime to set
     */
    public void setCheckInTime(String checkInTime) {
        this.checkInTime = checkInTime;
    }

    /**
     * @param checkOutTime the checkOutTime to set
     */
    public void setCheckOutTime(String checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    /**
     * @param itemName the itemName to set
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * @return the itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @return the checkInTime
     */
    public String getCheckInTime() {
        return checkInTime;
    }

    /**
     * @return the checkOutTime
     */
    public String getCheckOutTime() {
        return checkOutTime;
    }

    
}