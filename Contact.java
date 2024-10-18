package Phone1;

public class Contact  {
    private int id;
    private static int currentId=0;
    private  String name;
    private String phoneNumber;
    public Contact(){
        this("noName","000");
    }
    public Contact( String name,String phoneNumber){
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.id=currentId++;
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
