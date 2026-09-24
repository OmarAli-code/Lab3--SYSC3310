public class BuddyInfo {


    private String name;
    private int age;

    public BuddyInfo(){
        this.name = "homer";
        this.age = 45;
    }

    public BuddyInfo(String name,int age){
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    static void main() {
        BuddyInfo buddy1 = new BuddyInfo("omar",20);
        System.out.println("hello" + " " + buddy1.getName());
    }
}
