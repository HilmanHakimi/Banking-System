package Day8.OOP;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private final String name;
    private final int memberId;
    private final List<LibraryItem> borrowedItems;

    public Member(String name, int memberId){
        this.name = name;
        this.memberId = memberId;
        this.borrowedItems = new ArrayList<>();
    }

    public String getName(){
        return name;
    }
    public int getMemberId(){
        return memberId;
    }
    public List<LibraryItem> getBorrowedItems(){
        return borrowedItems;
    }
    public String getMemberInfo(){
        return "name: "+getName()+"\nMember Id: "+getMemberId();
    }
    public boolean borrowItem(LibraryItem item){
        if(item.isAvailable()) {
            borrowedItems.add(item);
            item.borrowItem();
            return true;
        }else{
            return false;
        }
    }
    public void returnItem(LibraryItem item){
        borrowedItems.remove(item);
        item.returnItem();
    }


}
