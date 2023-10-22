package Management.Test;

import Management.Data.DataRoom;
import Management.Model.Hotel;
import Management.Model.Room;

import java.util.ArrayList;

public class TestRoom {
    public static void main(String []args ){
//        DataRoom dtRoom = new DataRoom();
//        ArrayList<Room> list = new ArrayList<Room>();
//
//        list = dtRoom.dataRoom();
        /*
        for(int i = 0 ; i < list.size() ; i++)
            System.out.println(list.get(i).toString());
        */

//        System.out.println("Danh sách các phòng: ");
//        for(Room r: list){
//            System.out.println(r.toString());
//        }
//        Hotel h = new Hotel("H0001","Duc Trong Hotel","273 An Duong Vuong",list);

//        System.out.println(h.toString());
//  Thêm Phòng và Xuất danh sách phòng
        Room r= new Room();
        ArrayList<Room> list = new ArrayList<Room>();
        list = r.addRoom();

        System.out.println("Danh sách các phòng: ");
        for(Room ro: list){
            System.out.println(ro.toString());
       }
        System.out.println();

//   Thông tin khách sạn
        System.out.println("Thong tin khach san: ");
        Hotel h= new Hotel("H001","Duc Trong Hotel","An Duong Vuong",list);
        System.out.println(h.toString());
        System.out.println();

//    Tìm ID phòng và xóa phòng
        list=r.deleteRoom(list);
        System.out.println("Danh sách các phòng sau khi xoa: ");
        for(Room ro: list){
            System.out.println(ro.toString());
        }
        System.out.println();

//        Chỉnh sửa thông tin phòng
        list=r.editRoom(list);
        System.out.println("Danh sach phong sau khi chinh sua: ");
        for(Room ro:list){
            System.out.println(ro.toString());
        }

    }
}
