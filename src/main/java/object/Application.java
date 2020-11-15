package object;

public class Application {
    public static void main(String[] args) {
        Person xperson = new Person("Yanik", "Schuppli", 31, true);
        Address xaddress = new Address("Walzmühle", 10, 8500, "Frauenfeld");

        Person yperson = new Person("Yanik", "Schuppli", 31, false);
        Address yaddress = new Address("Walzmühle", 10, 8500, "Frauenfeld");

        xperson.setAddress(xaddress);
        System.out.println(xperson);
        yperson.setAddress(yaddress);
        System.out.println(yperson);

        System.out.println(xperson.equals(yperson));
    }

}
