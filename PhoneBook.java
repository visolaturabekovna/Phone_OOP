package Phone1;

import java.util.ArrayList;

public class PhoneBook {
    private ArrayList<Contact> telNumList=new ArrayList<Contact>();
    public PhoneBook(){}
    void add(Contact c){
        telNumList.add(c);
    }
    public  String toString(){
       return telNumList.toString();
    }

    public Contact getFirst(){
        return telNumList.getFirst();
    }
    public Contact remove(int id){
        Contact temp=telNumList.get(id);
        telNumList.remove(id);
        return temp;
    }
    public void search(String name){
//        int id=telNumList.indexOf(name);
//        if(id==-1) System.out.println("Bunday kontakt yoq");
//        else System.out.println(telNumList.get(id).toString());

        for(Contact c:telNumList){
            if(c.getName()==name){
                System.out.println(c.toString());
                break;
            }
        }
    }
}
