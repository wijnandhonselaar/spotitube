package oose.dea.dataaccess;

import com.google.inject.Inject;
import oose.dea.entities.Track;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wijnand on 15-10-2015.
 */
public class TrackDAO {
    @Inject
    private EntityManager em;
    public TrackDAO() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("spotitubetest");
        this.em = emf.createEntityManager();
    }
    /**
     * @return List<Track> all tracks
     */
    protected List<Track> getAll() {
        return new ArrayList<>();
    }

    /**
     * @param title
     * @return Track
     */
    protected Track getByTitle(String title) {
        return new Track();
    }

    /**
     * @param title
     * @return Track
     */
    protected Track getByPerformer(String title) {
        return new Track();
    }
}
