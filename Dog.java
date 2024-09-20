class Dog{
    String name;
    boolean isMale;
    int numofpuppies;
    String lisfofpuppies[] = new String[3];

    public void setName(String dogName){
        name = dogName;
    }
    public String showName(){
        return name;
    }
    public void bark(){
        System.out.println("woof! woof!"); 
    }
    public void setNumber(int numpuppies){
        numofpuppies = numpuppies;
    }
    public int showNumber(){
        return numofpuppies;
    }
    public void setPuppies(String listpuppies[]){
        lisfofpuppies = listpuppies;
    }
    public String[] showPuppies(){
        return lisfofpuppies;
    }
}