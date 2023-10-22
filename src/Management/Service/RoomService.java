package Management.Service;

import Management.Data.DataRoom;
import Management.Model.Room;
import Management.Service.IService.IRoomService;

import java.util.ArrayList;
import java.util.Scanner;

public class RoomService implements IRoomService {
    private ArrayList<Room> room;

    public RoomService(){
        this.room = new DataRoom().dataRoom();
    }

    public RoomService(ArrayList<Room> room){
        this.room = room;
    }


    @Override
    public Room getId(String id) {
        return null;
    }

    @Override
    public ArrayList<Room> getList() {

        return this.room;
    }
    @Override
    public ArrayList<Room> add() {
        Scanner reader=new Scanner(System.in);
        ArrayList<Room> roomList= new ArrayList<>();
        System.out.print("Nhap so luong phong can them: ");
        int n=reader.nextInt();
        reader.nextLine();
        for(int i=0;i<n;i++){
            while(true) {
                Room room = new Room();
                System.out.print("Nhap id phong: ");
                room.setId(reader.nextLine());
                System.out.print("Nhap ten phong: ");
                room.setName(reader.nextLine());
                System.out.print("Nhap gia phong: ");
                room.setPrice(reader.nextFloat());
                reader.nextLine();
                System.out.print("Nhap loai phong: ");
                room.setType(reader.nextLine());
                if(room!=null) {
                    roomList.add(room);
                    this.room.add(room);
                    break;
                }
            }

        }
        return roomList;
    }
    @Override
    public  Room find(String id, ArrayList<Room> list){
        Room r = new Room();
        for(Room r1: list)
            if(r1.getId().equals(id))
                return r1;
        return null;
    }

    @Override
    public Room delete(String id){
        Room r1 = new RoomService().find(id,room);
      if( r1 == null) {
          System.err.println("Khong Tim Thay");
          return null;
      }
      this.room.remove(r1);

      return r1; // xoa xong hết trả về th đã xóa để in ra màn hình
    }

    @Override
    public ArrayList<Room> update(ArrayList<Room> roomList) {
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
                    System.out.println("1.Sua ten phong");
                    System.out.println("2.Sua gia phong");
                    System.out.println("3.Sua loai phong");
                    System.out.println("4.Ket thuc chinh sua");
                    choose=reader.nextInt();
                    reader.nextLine();
                    switch(choose){
                        case 1:
                            System.out.print("new Name: ");
                            room.setName(reader.nextLine());
                            break;
                        case 2:
                            System.out.print("new Price: ");
                            room.setPrice(reader.nextFloat());
                            break;
                        case 3:
                            System.out.print("new Type: ");
                            room.setType(reader.nextLine());
                            break;
                        case 4:
                            System.out.println("Ket thuc chinh sua!!!");
                            break;
                        default:
                            System.out.println("Lua chon khong hop le!");
                    }
                } while(choose!=4);
                roomList.add(room);
                return roomList;
            }
        }
        System.out.print("Khong tim thay ID phong!!!");
        return roomList;
    }

    public static void main(String[] args){
        RoomService rs= new RoomService();
        ArrayList<Room> list= new ArrayList<Room>();
//        list =rs.getList();
//        for(Room r: list){
//            System.out.println(r.toString());
//        }
//        System.out.println("--------------------------------------------------------------");
//         rs.delete("ROOM0001");
//        for(Room r: list){
//            System.out.println(r.toString());
//        }

//        System.out.println("--------------------------------------------------------------");
//        list= rs.add();
//        System.out.println("--------------------------------------------------------------");
//        System.out.println("Danh sach phong sau khi them: ");
//        for(Room r: list){
//            System.out.println(r.toString());
//        }
//        System.out.println("--------------------------------------------------------------");
//        list= rs.update(list);
//        System.out.println("--------------------------------------------------------------");
//        System.out.println("Danh sach phong sau khi update: ");
//        for(Room r: list){
//            System.out.println(r.toString());
//        }




    }

    public ArrayList<Room> getRoom() {
        return room;
    }

    public void setRoom(ArrayList<Room> room) {
        this.room = room;
    }
}
