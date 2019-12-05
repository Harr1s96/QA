package library;


public class Journal extends Item implements Readables {

    public Journal() {

        super();
    }

    @Override
    public void read() {
        // TODO Auto-generated method stub
        String subscriptionDate = this.getCheckInTime();

        System.out.println("The subscription starts from " + subscriptionDate);

    }

    @Override
    public void checkInItem() {
        // TODO Auto-generated method stub

    }

    @Override
    public void checkOutItem() {
        // TODO Auto-generated method stub

    }


}