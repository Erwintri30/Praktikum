package Vet2;

public class pantheraLeo {
    private String id;
    private String colour;
    private String gender;
    private int yearOfBirth;

    void playId(String id) {

    }

    public void setId(String inputId) { // setter
        id = inputId;
    }

    public String getId() { // getter
        return id;
    }

    public void setColour(String inputColour) {
        colour = inputColour;
    }

    public String getColour() {
        return colour;
    }

    public String eat() {
        return "hau hau hau";
    }

    public String roar() {
        return "iyaaaaaaa";
    }

    public int getYear() {
        return yearOfBirth;
    }

}
