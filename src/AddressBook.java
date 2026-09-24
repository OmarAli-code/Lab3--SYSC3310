import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> people;

    public AddressBook(){
        this.people = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy1){
        this.people.add(buddy1);
    }
    public void removeBuddy(BuddyInfo buddy1){
        people.remove(buddy1);
    }

    public static void main(String[] args){
        System.out.println("Address Books");
        BuddyInfo newBuddy = new BuddyInfo("OMAR",19);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(newBuddy);
        addressBook.removeBuddy(newBuddy);

    }


}
