package Day8;

class NotImmutable{
    private final StringBuilder builder;
    public NotImmutable(StringBuilder b){
        this.builder = new StringBuilder(b);//Create a new StringBuilder objects
    }

    public StringBuilder getBuilder() {
        return new StringBuilder(builder);//defensive copy
    }

//    public String getValue() {
//        return builder.toString();
//
//    }
}

public class ImmutableDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Initial ");
        NotImmutable problem = new NotImmutable(sb);
        sb.append("added_more ");
        StringBuilder gotBuilder = problem.getBuilder();
        gotBuilder.append("Added_even_more");
        System.out.println(problem.getBuilder());
    }
}