import java.util.ArrayList;

public class ListFlour {
    private ArrayList<ListFlour> listF;

    public ListFlour() {
        this.listF = new ArrayList<>();
    }

    public ListFlour(ArrayList<ListFlour> listF) {
        this.listF = listF;
    }

    // 1.	Thêm bột vào danh sách.
    public void addFlour(ListFlour lf) {

        this.listF.add(lf);
    }

    //		2.	In danh sách bột ra màn hình.
    public void printflour() {
        for (ListFlour flour : listF) {
            System.out.println(flour);
        }
    }

    //		3.	Xóa một phần tử bột ra khỏi danh sách dựa trên mã thịt.
    public boolean removeFlour(CrispyFlour f) {
        return this.listF.remove(f);
    }
}
