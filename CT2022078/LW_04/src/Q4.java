import java.util.Scanner;

class Owner {

    private String ownerName;
    private String phoneNo;

    public Owner(){
        ownerName = "Unknown";
        phoneNo = "No_Number";
    }

    public Owner(String ownerName,String phoneNo){
        ownerName = ownerName;
        phoneNo = phoneNo;
    }

    public String getOwnerName(){
        return  ownerName;
    }
    public String getPhoneNo(){
        return  phoneNo;
    }

    public void setOwnerName(String name) {
        ownerName = name;
    }
    public void setPhoneNo(String num) {
        phoneNo = num;
    }
}

class Bicycle {

    private Owner owner;

    public Bicycle(){
        Owner owner = new Owner();
    }
    public Bicycle(String name,String num){
        Owner owner = new Owner(name,num);
    }

    public Owner getOwner(){
        return  owner;
    }
    public void setOwner(Owner owner){
        this.owner = owner;
    }
}

public class Q4 {

    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("If you need Bicycle,Enter owner name : ");
        String Ownername = scanner.nextLine();
        Bicycle bicycle = new Bicycle();
        Owner owner  = new Owner();
        bicycle.setOwner(owner);

        owner.setOwnerName(Ownername);

        System.out.println("Enter owner phone number : ");
        String phonenum = scanner.nextLine();
        owner.setPhoneNo(phonenum);

        System.out.println("Owner name : " + bicycle.getOwner().getOwnerName());
        System.out.println("phone number: " + bicycle.getOwner().getPhoneNo());
    }
}
