class Activity{
    public static void main(String[] args){
        
        Dog dog = new Dog();
        dog.setName ("Symone");

        System.out.println(dog.showName());
        dog.bark();

        dog.setNumber(3);
        System.out.println(dog.showNumber());

        String mukhang_aso[] = {"Symone","Angelo","David"};
        dog.setPuppies(mukhang_aso);
        System.out.println(dog.showPuppies());
    }
}