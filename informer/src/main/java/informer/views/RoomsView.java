/**
 * 
 */
package informer.views;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * @author firsachi
 *
 */
@ManagedBean(name = "roomsView")
@ViewScoped
public class RoomsView {
	
	private List<RoomView> rooms;

	public List<RoomView> getRooms() {
		rooms = new ArrayList<>();
		RoomView room = new RoomView();
		room.setId(1);
		room.setNumberRoom("101");
		rooms.add(room);
		room = new RoomView();
		room.setId(2);
		room.setNumberRoom("102");
		rooms.add(room);
		return rooms;
	}

	public void setRooms(List<RoomView> rooms) {
		this.rooms = rooms;
	}
	
	

}
