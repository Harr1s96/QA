package library;


public class Book extends Item {

    @Override
    public void checkInItem() {
        // TODO Auto-generated method stub

        System.out.println("Book checked in");

    }

    @Override
    public void checkOutItem() {
        // TODO Auto-generated method stub

        System.out.println("Book is checked out");

    }

    public void read() {

        System.out.println("Reading");
    }


}