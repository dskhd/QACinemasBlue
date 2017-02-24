/*//
 * Created by Martyn Green
*/
package qacinema.service.managers;

import java.util.List;
import qacinema.data.viewentities.RolesView;


public interface RolesViewManager {
	public List<RolesView> findFilmsByActor(String actorName);
	public List<RolesView> findActorsByFilmTitle(String filmTitle);
	}
