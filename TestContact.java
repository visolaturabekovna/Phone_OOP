package Phone1;

public class TestContact {
    public static void main(String[] args) {
        Contact myC1=new Contact();
        Contact myC2=new Contact("Zilola","+998915478695");
        Contact myC3=new Contact("Mehrinoz","+998902365147");

        myC1.setName("Aziza");
        myC1.setPhoneNumber("+998931234567");
        PhoneBook myPhone=new PhoneBook();
        myPhone.add(myC1);
        myPhone.add(myC2);
        myPhone.add(myC3);


        //System.out.println(myPhone.getFirst());
        myPhone.search("Aziza");
        myPhone.search("Zilola");

    }
}
