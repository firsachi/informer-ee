/**
 * 
 */
package informer.views;

import java.util.List;

import javax.annotation.PostConstruct;
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
	
	@PostConstruct
	public void init() {
		this.rooms = roomService.getList();
	}

	public List<RoomView> getRooms() {
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
		RoomView roomView = new RoomView(getRoomNumber());
		roomView.setId(3);
		
		this.rooms.add(roomView);
		
		System.out.println(rooms);
	}
	
	public void save(RoomView roomView) {
		
	}

}
