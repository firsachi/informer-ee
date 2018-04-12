/**
 * 
 */
package informer.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import informer.dao.RoomDao;
import informer.services.transformer.RoomTransformer;
import informer.views.RoomView;

/**
 * @author firsov
 *
 */
@ManagedBean(name = "roomService")
@SessionScoped
public class RoomService {

	@EJB
	private RoomDao roomDao;

	@EJB
	private RoomTransformer roomTransformer;

	public List<RoomView> getList() {
		List<RoomView> rooms = new ArrayList<>();
		rooms = roomDao.getList().stream().map((entity) -> roomTransformer.entityMOdel(entity))
				.collect(Collectors.toList());
		return rooms;
	}
}
