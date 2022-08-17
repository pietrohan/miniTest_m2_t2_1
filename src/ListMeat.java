import java.util.ArrayList;

public class ListMeat implements Comparable<ListMeat> {
    private ArrayList<Meat> listM;

    public ListMeat() {
        this.listM = new ArrayList<>();
    }

    public ListMeat(ArrayList<Meat> listM) {
        this.listM = listM;
    }

    // 1.	Thêm thịt vào danh sách.
    public void addMeat(Meat m) {

        this.listM.add(m);
    }

    //		2.	In danh sách thịt ra màn hình.
    public void printMeat() {
        for (Meat meat : listM) {
            System.out.println(meat);
        }
    }

    //		3.	Xóa một phần tử thịt ra khỏi danh sách dựa trên mã thịt.
    public boolean removeMeat(Meat m) {
        return this.listM.remove(m);
    }

    @Override
    public int compareTo(ListMeat o) {
        return 0;
    }
}