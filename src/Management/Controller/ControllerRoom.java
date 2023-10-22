package Management.Controller;

import Management.Model.Room;
import Management.Service.RoomService;

import java.util.ArrayList;
import java.util.Scanner;

public class ControllerRoom {
    private RoomService roomService;
    public ControllerRoom(){

    }
    public ControllerRoom (RoomService roomService){
        this.roomService = roomService;
    }

   public Room ControllerDelete(String id){
        return this.roomService.delete(id);
   }
   public ArrayList<Room> ControllerAdd(){
        return this.roomService.add();
   }
   public ArrayList<Room> list(){
        ArrayList <Room> list = this.roomService.getList();
        return list;
   }
   public static void main(String[] args){
        ControllerRoom cr= new ControllerRoom(new RoomService());

        cr.ControllerAdd();
        System.err.println("Danh sach da them la");
       for ( Room r: cr.list()){
           System.out.println(r.toString());
       }
       System.out.println("_______________________________");
        System.out.print("Nhap ID phong can xoa: ");
       Scanner reader=new Scanner(System.in);
       String id = reader.nextLine();
       cr.ControllerDelete(id);
       System.out.println("_______________________________");
       for ( Room r: cr.list()){
           System.out.println(r.toString());
       }



   }

}
