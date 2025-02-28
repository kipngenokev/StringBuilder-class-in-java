public class Main {
    public static void main(String[] args) {
       String helloWorld ="Hello"+ " World";
       helloWorld.concat(" and goodbye");
       StringBuilder helloWorldBuilder=new StringBuilder("Hello"+ " World");
       helloWorldBuilder.append(" and Goodbye");
       printInformation(helloWorld);
       printInformation(helloWorldBuilder);

       StringBuilder emptystart= new StringBuilder();
       emptystart.append("a".repeat(27));
       StringBuilder emptyStart32 = new StringBuilder(32);
       emptyStart32.append("a".repeat(17));
       printInformation(emptystart);
       printInformation(emptyStart32);

        StringBuilder builderPlus=new StringBuilder("Hello"+ " World");
        builderPlus.append(" and Goodbye");

        builderPlus.deleteCharAt(16).insert(16,'g');
        System.out.println(builderPlus);

        builderPlus.replace(16,17,"x");
        System.out.println(builderPlus);

        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus);
    }
    public static void printInformation(String string) {
        System.out.println("String ="+string);
        System.out.println("Length ="+string.length());

    }

    public static void printInformation(StringBuilder builder){
        System.out.println("StringBuilder="+builder);
        System.out.println("StringBuilder length ="+builder.length());
        System.out.println("capacity="+builder.capacity());
    }
}