/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import logica.Proponente;
import persistencia.exceptions.NonexistentEntityException;
import persistencia.exceptions.PreexistingEntityException;

import javax.persistence.Persistence;

/**
 *
 * @author Juanpi
 */
public class proponenteJpaController implements Serializable {

    public proponenteJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public proponenteJpaController(){
    emf = Persistence.createEntityManagerFactory("culturartePU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Proponente proponente) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(proponente);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findproponente(proponente.getNickname()) != null) {
                throw new PreexistingEntityException("proponente " + proponente + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Proponente proponente) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            proponente = em.merge(proponente);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = proponente.getNickname();
                if (findproponente(id) == null) {
                    throw new NonexistentEntityException("The proponente with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Proponente proponente;
            try {
                proponente = em.getReference(Proponente.class, id);
                proponente.getNickname();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The proponente with id " + id + " no longer exists.", enfe);
            }
            em.remove(proponente);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Proponente> findproponenteEntities() {
        return findproponenteEntities(true, -1, -1);
    }

    public List<Proponente> findproponenteEntities(int maxResults, int firstResult) {
        return findproponenteEntities(false, maxResults, firstResult);
    }

    private List<Proponente> findproponenteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Proponente.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Proponente findproponente(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Proponente.class, id);
        } finally {
            em.close();
        }
    }

    public int getproponenteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Proponente> rt = cq.from(Proponente.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
