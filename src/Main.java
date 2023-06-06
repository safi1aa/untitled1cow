public class Main {
    public static void main(String[] args) {

        Cow cow = new Cow();
        cow.name = "cow";
        cow.breed = "black-and-white";
        cow.color = "black and white";
        cow.weight = 420;
        cow.age = 14;

        Cow cow1 = new Cow();
        cow1.name = "cow";
        cow1.breed = "Kholmogorskaya";
        cow1.color = "black and white";
        cow1.weight = 500;
        cow1.age = 10;

        Cow cow2 = new Cow();
        cow2.name = "cow";
        cow2.breed = "Kazakh white-headed";
        cow2.color = "brown white";
        cow2.weight = 520;
        cow2.age = 13;

        System.out.println(" Name: " + cow.name + "\n" + " Breed: " + cow.breed + "\n" + " Color: " + cow.color + " Weight: " + cow.weight + "\n" + " Age: " + cow.age);
        System.out.println(" Name: " + cow1.name + "\n" + " Breed: " + cow1.breed + "\n" + " Color: " + cow1.color + " Weight: " + cow1.weight + "\n" + " Age: " + cow1.age);
        System.out.println("Name: " + cow2.name + "\n" + "Breeed: " + cow2.breed + "\n" + "Color: " + cow2.color + "\n" + "Weight: " + cow2.weight + "\n" + "Age: " + cow2.age);
        System.out.println(cow1);
        System.out.println(cow);
        System.out.println(cow2);


    }
}