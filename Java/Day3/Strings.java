package Day3;

public class Strings {
    public static void main(String[] args){
        String greeting = "Hello";
        String name = "Alice";
        String message = greeting + ", " + name + "!";
        System.out.println(message);
    }
    public void additionalcall(){
        System.out.println("This is an additional method in the Strings class.");
    }
    @Override
    public String toString(){
        return "This is the Strings class.";
    }
}
