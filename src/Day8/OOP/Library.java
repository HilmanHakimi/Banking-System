package Day8.OOP;

public class Library {
    public static void main(String[] args) {
        //create library items
        Book book1 = new Book("The lord of the ring", "J.R Morgan", "Fantasy", "945689498");
        Journal journal = new Journal("Scientific American", "Science", "2024-05", "82674746");
        //create a member
        Member member1 = new Member("john doe", 12345);

        //Display information about library items before buying
        System.out.println("Library items details before borrow");
        System.out.println(book1.getDetails());
        System.out.println(journal.getDetails());

        //display member information
        System.out.println("\nMember info");
        System.out.println(member1.getMemberInfo());

        //borrow items
        if(member1.borrowItem(book1)){
            System.out.println("\n" + member1.getName()+" borrowed "+book1.getName());

        }
        if(member1.borrowItem(journal)){
            System.out.println("\n" + member1.getName()+" borrowed "+journal.getName());
        }

        //display information about library items after borrowing
        System.out.println("\nLibrary items details after borrow");
        System.out.println(book1.getDetails());
        System.out.println(journal.getDetails());

        //return items
        member1.returnItem(book1);
        member1.returnItem(journal);

        //display information about library items after returning
        System.out.println("\nLibrary item details after return");
        System.out.println(book1.getDetails());
        System.out.println(journal.getDetails());
    }
}
