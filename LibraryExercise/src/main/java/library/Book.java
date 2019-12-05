package library;


public class Book extends Item implements Readables {

    public Book(String name, String checkInTime) {

        super();
        this.setItemName(name);
        this.setCheckInTime(checkInTime);
    }

    @Override
    public void checkInItem(String date) {
        // TODO Auto-generated method stub
        this.setCheckOutTime(date);

        System.out.println("Book checked in");

    }

    @Override
    public void checkOutItem() {
        // TODO Auto-generated method stub
        String dueDate = this.getCheckOutTime(); 

        System.out.println("Book needs to be checked out on " + dueDate);

    }

    @Override
    public void read() {
        // TODO Auto-generated method stub
        System.out.println("Reading");

    }


}