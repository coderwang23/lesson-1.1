public class Dog {
    /*
       static variables
       instance variables
       constructors
       getter/setter methods
       other methods
       helper methods
     */

    private String dogBreed;
    private String dogName;

    private String ownersName;
    private int dogAge;
    private int dogWeight;

    public Dog() {
        dogBreed = "Golden Retriever";
        dogName = "Christine";
        ownersName = "Hong Xi";
        dogAge = 15;
        dogWeight = 400;
    }
    public Dog(String dogBreed, String dogName,String ownersName, int dogAge, int dogWeight) {
        this.dogBreed = dogBreed;
        this.dogName = dogName;
        this.ownersName = ownersName;
        this.dogAge = dogAge;
        this.dogWeight = dogWeight;

    }
    public String getDogBreed() {
        return dogBreed;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }
    public String getOwnersName() {
        return ownersName;
    }

    public void setOwnersName(String ownersName) {
        this.dogName = ownersName;
    }

    public int getDogAge() {
        return dogAge;
    }

    public void setAge(int dogAge) {
        this.dogAge = dogAge;
    }

    public int getDogWeight() {
        return dogWeight;
    }

    public void setWeight(int dogWeight) {
        this.dogWeight = dogWeight;
    }
//eating method
    public void eat() {
        System.out.println(dogName + " eats fish");
    }
    public void barks(int barks) {
        System.out.println("The dog barks " + barks + " times" );
    }
    public void rolls(int rolls) {
        System.out.println("The dog rolls " + rolls + "times");
    }
    public String toString() {
        return "Dog Breed: " + dogBreed + ", Dog Name: " + dogName + ", Owner: " + ownersName + ", Dog Age" + dogAge + "Dog Weight" + dogWeight;
        }

   /* public void barks() {
        bark++;
    }

    public void ageByYears(int years) {
        age += years;
    */

}
