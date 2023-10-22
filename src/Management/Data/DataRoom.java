package Management.Data;

import Management.Model.Room;

import java.util.ArrayList;

public class DataRoom {

    public  ArrayList<Room> dataRoom(){
        ArrayList<Room> list = new ArrayList<>();
        Room r = new Room("ROOM0001","phong 0001",350000,"A01");
        Room r1 = new Room("ROOM0002","phong 0002",850000,"A02");
        Room r2 = new Room("ROOM0003","phong 0003",350002,"A03");
        Room r3 = new Room("ROOM0004","phong 0004",850005,"A04");
        Room r4 = new Room("ROOM0005","phong 0005",350001,"A05");
        Room r5 = new Room("ROOM0006","phong 0006",850002,"A06");
        list.add(r);
        list.add(r1);
        list.add(r2);
        list.add(r3);
        list.add(r4);
        list.add(r5);
        return list;
    }
}
