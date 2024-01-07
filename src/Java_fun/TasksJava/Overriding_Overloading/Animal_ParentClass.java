package Java_fun.TasksJava.Overriding_Overloading;

public abstract  class Animal_ParentClass {

    public String name;
    public String breed;
    public int age;
    public String size;


    public Animal_ParentClass(String name, String breed, int age, String  size){

        this.name = name;
        this.breed = breed;
        this.age = age;
        this.size = size;

    }

    public abstract void dan();




    public void eat(){
        System.out.println(name + "is eating");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", size='" + size + '\'' +
                '}';
    }

}
