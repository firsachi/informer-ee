/**
 * 
 */
package informer.views;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.validation.constraints.Size;

import informer.services.RoomService;

/**
 * @author firsachi
 *
 */
@ManagedBean(name = "roomsView")
@RequestScoped
public class RoomsView {
	
	private List<RoomView> rooms;
	
	@Size(min = 3, max=3, message = "Please enter a valid username (3 characters)")
	private String roomNumber;
	
	@ManagedProperty(value = "#{roomService}")
	private RoomService roomService;

	public List<RoomView> getRooms() {
		this.rooms = roomService.getList();
		System.out.println(rooms.size());
		return rooms;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public void setRooms(List<RoomView> rooms) {
		this.rooms = rooms;
	}
	
	public void setRoomService(RoomService roomService) {
		this.roomService = roomService;
	}
	
	public void add() {
		System.out.println(new RoomView(getRoomNumber()));
	}
	
	public void save(RoomView roomView) {
		
	}

}
