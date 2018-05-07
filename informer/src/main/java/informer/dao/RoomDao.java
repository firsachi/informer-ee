/**
 * 
 */
package informer.dao;

import java.util.List;

import informer.entities.Room;


/**
 * @author firsov
 *
 */
public interface RoomDao{
	
	boolean add(Room room);
	
	List<Room> getList();

}
