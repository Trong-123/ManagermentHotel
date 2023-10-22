package Management.Model;
import java.util.Scanner;
import java.util.ArrayList;

public class Room {
    private String id;
    private String name;
    private float price;
    private String type;

    public Room() {
    }

    public Room(String id, String name, float price, String type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
    }
//    Function addRoom
    public ArrayList<Room> addRoom(){
        Scanner reader=new Scanner(System.in);
        ArrayList<Room> roomList= new ArrayList<>();
        System.out.print("Nhap so luong phong can them: ");
        int n=reader.nextInt();
        reader.nextLine();
        for(int i=0;i<n;i++){
            Room room= new Room();
            System.out.print("Nhap id phong: ");
            room.setId(reader.nextLine());
            System.out.print("Nhap ten phong: ");
            room.setName(reader.nextLine());
            System.out.print("Nhap gia phong: ");
            room.setPrice(reader.nextFloat());
            reader.nextLine();
            System.out.print("Nhap loai phong: ");
            room.setType(reader.nextLine());

            roomList.add(room);
        }
        return roomList;
    }
//    Function deleteRoom
    public ArrayList<Room> deleteRoom(ArrayList<Room> roomList){
        Scanner reader=new Scanner(System.in);
        System.out.print("Nhap id phong can xoa: ");
        String idNeedDelete= reader.nextLine();
        for(Room room: roomList){
            if(room.getId().equals(idNeedDelete)){
                roomList.remove(room);
                return roomList;
            }
        }
        System.out.println("Khong tim thay ID phong!!!");
        return roomList;
    }
//    Chình sửa thông tin phòng
    public ArrayList<Room> editRoom(ArrayList<Room> roomList){
        Scanner reader=new Scanner(System.in);
        System.out.print("Nhap ID phong can chinh sua: ");
        String idNeedEdit=reader.nextLine();
        for(Room room:roomList){
            if(idNeedEdit.equals(room.getId())){
//                Xóa phòng cần chỉnh sửa trước, sau khi chỉnh sửa thì add vào lại listRoom
                roomList.remove(room);
                int choose;
                do{
                    System.out.println("Chon thong tin can chinh sua: ");
                    System.out.println("1.Sua id phong");
                    System.out.println("2.Sua ten phong");
                    System.out.println("3.Sua gia phong");
                    System.out.println("4.Sua loai phong");
                    System.out.println("5.Ket thuc chinh sua");
                    choose=reader.nextInt();
                    reader.nextLine();
                    switch(choose){
                        case 1:
                            System.out.print("new ID: ");
                            room.setId(reader.nextLine());
                            break;
                        case 2:
                            System.out.print("new Name: ");
                            room.setName(reader.nextLine());
                            break;
                        case 3:
                            System.out.print("new Price: ");
                            room.setPrice(reader.nextFloat());
                            break;
                        case 4:
                            System.out.print("new Type: ");
                            room.setType(reader.nextLine());
                            break;
                        case 5:
                            System.out.println("Ket thuc chinh sua!!!");
                            break;
                        default:
                            System.out.println("Lua chon khong hop le!");
                    }
                } while(choose!=5);
                roomList.add(room);
                return roomList;
            }
        }
        System.out.print("Khong tim thay ID phong!!!");
        return roomList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                '}';
    }
}
