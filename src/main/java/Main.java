public class Main {



    public static void main(String[] args) {

        Customer part1customer = new Customer("Tom","Ballyhaunis","08764444","1000000",true);
        System.out.println(part1customer);


        Customer part2customer = new Customer();
        part2customer.setName("John");
        part2customer.setAddress("Ballinrobe");
        part2customer.setNumber("08538388");
        part2customer.setCustomerNum("2000000");
        part2customer.setMailingList(true);
        System.out.println(part2customer);
    }
}
