import java.time.LocalDate;
import java.util.Scanner;

public class MaterialManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListMeat listMeat = new ListMeat();
        ListFlour listFlour = new ListFlour();
        int choice = 0;
        do {
            System.out.println("Menu---------");
            System.out.println("Vui lòng chọn chức năng: ");
            System.out.println("1.	Thêm thịt vào danh sách.\n"
                    + "2.	Thêm bột vào danh sách.\n"
                    + "3.	In danh sách thịt ra màn hình.\n"
                    + "4.	In danh sách bột ra màn hình.\n"
                    + "5.	Xóa một loại thịt ra khỏi danh sách dựa id sản phẩm.\n"
                    + "6.	Xóa một loại thịt ra khỏi danh sách dựa id sản phẩm.\n"
                    + "0.   Thoát khỏi chương trình");
            choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
//				1.	Thêm thịt vào danh sách.
                System.out.println("Nhập mã thịt: ");
                String id = sc.nextLine();
                System.out.println("Nhập loại thịt: ");
                String name = sc.nextLine();
                System.out.println("Nhập hạn sử dụng: ");
                LocalDate manufacturingDate = LocalDate.ofEpochDay(sc.nextInt());
                System.out.println("Nhập giá: ");
                int cost = sc.nextInt();
                System.out.println("nhập số lượng thịt: ");
                double weight = sc.nextDouble();
                Meat m = new Meat(id,name,manufacturingDate,cost,weight);
                listMeat.addMeat(m);

            } else if (choice == 3) {
//				3.	In danh sách thịt ra màn hình.
                listMeat.printMeat();
            }
        } while (choice != 0) ;
        }
    }


