/**
 * 
 */
package informer.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author firsov
 *
 */
@Entity
@Table(name = "room")
public class Room implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5731474998778526861L;
	
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "number_room", nullable = false, length = 3)
    private int numberRoom;
	
	@Column(name = "disable", nullable = false, columnDefinition = "boolean default false")
	private boolean disable;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumberRoom() {
		return numberRoom;
	}

	public void setNumberRoom(int numberRoom) {
		this.numberRoom = numberRoom;
	}

	public boolean isDisable() {
		return disable;
	}

	public void setDisable(boolean disable) {
		this.disable = disable;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (disable ? 1231 : 1237);
		result = prime * result + id;
		result = prime * result + numberRoom;
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
		Room other = (Room) obj;
		if (disable != other.disable)
			return false;
		if (id != other.id)
			return false;
		if (numberRoom != other.numberRoom)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Room [id=" + id + ", numberRoom=" + numberRoom + ", disable=" + disable + "]";
	}
	
	
}
