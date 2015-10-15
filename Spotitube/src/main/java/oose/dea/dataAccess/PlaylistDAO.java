package oose.dea.dataaccess;

import oose.dea.entities.Playlist;
import oose.dea.entities.Track;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wijnand on 6-10-2015.
 */
public class PlaylistDAO {

    private EntityManager em;
    public PlaylistDAO() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("spotitubetest");
        this.em = emf.createEntityManager();
    }
    /**
     * @param playlist
     */
    protected void create(Playlist playlist) {
        System.out.println(playlist.getOwner());
        System.out.println(playlist.getName());
        em.getTransaction();
        em.persist(playlist);
        em.getTransaction().commit();
    }

    /**
     * @param playlist
     */
    protected void update(Playlist playlist) {

    }


    /**
     * @param name
     */
    protected void delete(String name) {
        Playlist playlist = getByName(name);
        playlist.delete();
    }

    /**
     * @param playlist
     */
    protected void delete(Playlist playlist) {

    }

    /**
     * @param name
     * @return Playlist
     */
    protected Playlist getByName(String name) {
        return new Playlist();
    }

    /**
     * @param owner
     * @return ArrayList<Playlist>
     */
    protected List<Playlist> getByOwner(String owner) {
        return new ArrayList<Playlist>();
    }

    /**
     * @return ArrayList<Playlist>
     */
    protected List<Playlist> getAll() {
        return new ArrayList<Playlist>();
    }

    protected void addTrackToPlaylist(Playlist playlist, Track track) {
        playlist.addTrack(track);
    }


}
