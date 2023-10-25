package Management.Service.IService;

import Management.Model.Room;

import java.util.ArrayList;

public interface IRoomService {
    public ArrayList<Room> addRoom();
    public Room getId(String id);

    public ArrayList<Room> getList();

    public Room deleteRoom(String id);

    public ArrayList<Room> updateRoom(ArrayList<Room> roomList);
    public  Room findRoom(String id, ArrayList<Room> roomList);
}
