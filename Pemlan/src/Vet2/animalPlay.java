package Vet2;

public class animalPlay {
    public static void main(String[] args) {
        pantheraLeo lion;
        lion = new pantheraLeo();
        System.out.println(lion.eat());
        lion.setId("L1");
        System.out.println(lion.getId());
        lion.setColour("negrow");
        System.out.println("warna nya " + lion.getColour());
        pantheraLeo lion2;
        lion2 = new pantheraLeo();
        System.out.println(lion.roar());

    }

}
