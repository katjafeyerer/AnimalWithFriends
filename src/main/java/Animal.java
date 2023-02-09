public class Animal {
    private String species;
    private String name;
    private int age;
    private String animalLoud;


    public Animal(String species, String name, int age, String animalLoud) {
        this.species = species;
        this.name = name;
        setAge(age);
        this.animalLoud = animalLoud;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public String getAnimalLoud() {
        return animalLoud;
    }

    public void setAnimalLoud(String animalLoud) {
        this.animalLoud = animalLoud;
    }

    public String giveAnimalLoud() {
        return getAnimalLoud();
    }

    public String getNameAndAge() {
        return "Name: " + getName() + " Alter: " + getAge();
    }

    public String ageCategory() {
        if (age > 4) {
            return "old animal";
        }
        else if(age >2){
            return "young animal";
        }
        else{
            return "baby animal";
        }

    }
}
