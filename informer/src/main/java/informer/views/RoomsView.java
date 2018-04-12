/**
 * 
 */
package informer.views;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import informer.services.RoomService;

/**
 * @author firsachi
 *
 */
@ManagedBean(name = "roomsView")
@ViewScoped
public class RoomsView {
	
	private List<RoomView> rooms;
	
	@ManagedProperty(value = "#{roomService}")
	private RoomService roomService;

	public List<RoomView> getRooms() {
		this.rooms = roomService.getList();
		return rooms;
	}

	public void setRooms(List<RoomView> rooms) {
		this.rooms = rooms;
	}
	
	public void setRoomService(RoomService roomService) {
		this.roomService = roomService;
	}

}
