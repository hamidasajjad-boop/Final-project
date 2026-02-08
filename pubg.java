public class pubg {
    //attributes;

    String name = "Ebram";
    String gender ="Male";
    int age = 17;

    //behaviour

    public void run()
    {
        System.out.println("RUNNNNNNN!!!!");
    }

    public static void main(String[] args) 
    {
     pubg characters = new pubg();
     pubg pets = new pubg();
    characters.run();
    System.out.println(pets.gender);
    }
}
