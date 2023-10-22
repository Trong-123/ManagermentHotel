package Management.Service.IService;

import Management.Model.Room;

import java.util.ArrayList;

public interface IRoomService {
    public ArrayList<Room> add();
    public Room getId(String id);

    public ArrayList<Room> getList();

    public Room delete(String id);

    public ArrayList<Room> update(ArrayList<Room> roomList);
    public  Room find(String id, ArrayList<Room> list);
}
