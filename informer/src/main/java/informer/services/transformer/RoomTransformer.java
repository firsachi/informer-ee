package informer.services.transformer;

import javax.ejb.Stateless;

import informer.entities.Room;
import informer.views.RoomView;

@Stateless
public class RoomTransformer {
	
	public Room viewEntity(RoomView model) {
		Room entity = new Room();
		entity.setId(model.getId());
		entity.setNumberRoom(new Integer(model.getNumberRoom()));
		entity.setDisable(model.isDisable());
		return entity;
	}
	
	public RoomView entityMOdel(Room entity) {
		RoomView model = new RoomView();
		model.setId(entity.getId());
		model.setNumberRoom(Integer.toString(entity.getNumberRoom()));
		model.setDisable(entity.isDisable());
		return model;
	}

	
}
