/**
 * 
 */
package informer.views;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * @author firsachi
 *
 */
@ManagedBean
@ViewScoped
public class RoomView {
	
	private int id;
	private String numberRoom;
	private boolean disable;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumberRoom() {
		return numberRoom;
	}
	public void setNumberRoom(String numberRoom) {
		this.numberRoom = numberRoom;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (disable ? 1231 : 1237);
		result = prime * result + id;
		result = prime * result + ((numberRoom == null) ? 0 : numberRoom.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RoomView other = (RoomView) obj;
		if (disable != other.disable)
			return false;
		if (id != other.id)
			return false;
		if (numberRoom == null) {
			if (other.numberRoom != null)
				return false;
		} else if (!numberRoom.equals(other.numberRoom))
			return false;
		return true;
	}
	public boolean isDisable() {
		return disable;
	}
	public void setDisable(boolean disable) {
		this.disable = disable;
	}
	
	@Override
	public String toString() {
		return "RoomView [id=" + id + ", numberRoom=" + numberRoom + ", disable=" + disable + "]";
	}
	
	

}
