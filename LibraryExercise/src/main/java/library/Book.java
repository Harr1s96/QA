package library;


public class Book extends Item implements Readables {

    public Book() {

        super();
    }

    @Override
    public void checkInItem() {
        // TODO Auto-generated method stub

        System.out.println("Book checked in");

    }

    @Override
    public void checkOutItem() {
        // TODO Auto-generated method stub

        System.out.println("Book checked out");

    }

    @Override
    public void read() {
        // TODO Auto-generated method stub
        System.out.println("Reading");

    }


}