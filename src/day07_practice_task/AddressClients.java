package day07_practice_task;

public class AddressClients {

    public static void main(String[] args) {

        Address address = new Address();


        address.Number= 7925;
        address.street="Jones Branch Dr";
        address.city="McLean";
        address.state="VA";
        address.zipcode="22012";

        System.out.println( address.Number + " " + address.street + "\n " + address.city + " " +address.state + " , " + address.zipcode );





    }


}
