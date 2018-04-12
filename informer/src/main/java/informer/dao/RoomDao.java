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
public interface RoomDao extends BaseDao<Room>{
	
	List<Room> getList();

}
