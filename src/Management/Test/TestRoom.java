package Management.Test;

import Management.Data.DataRoom;
import Management.Model.Hotel;
import Management.Model.Room;

import java.util.ArrayList;

public class TestRoom {
    public static void main(String []args ){
        DataRoom dtRoom = new DataRoom();
        ArrayList<Room> list = new ArrayList<Room>();

        list = dtRoom.dataRoom();
        /*
        for(int i = 0 ; i < list.size() ; i++)
            System.out.println(list.get(i).toString());
        */
        /*
        for(Room r: list){
            System.out.println(r.toString());
        }
        */

        Hotel h = new Hotel("H0001","Duc Trong Hotel","273 An Duong Vuong",list);

        System.out.println(h.toString());

    }
}
