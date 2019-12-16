/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.Interface.interfaceDao;
import org.reunion.bean.Duree;
import org.reunion.bean.Groupereunion;
import org.reunion.bean.Invitation;
import org.reunion.bean.Note;
import org.reunion.bean.Notecnej;
import org.reunion.bean.Participer;
import org.reunion.bean.Personne;
import org.reunion.bean.Personnelcnej;
import org.reunion.bean.Pole;
import org.reunion.bean.Recevoir;
import org.reunion.bean.Reunion;
import org.reunion.bean.Structure;

/**
 *
 * @author root
 */
public class reuniondao implements interfaceDao{
 
    private final EntityManager em;
    private final EntityManagerFactory emf;
   
    public reuniondao() {
    emf=Persistence.createEntityManagerFactory("reunionPU");
    em=emf.createEntityManager();
    }

    
    
    @Override
    public void addStructure(Structure structure) {
        try {
        em.getTransaction().begin();
        em.persist(structure);
        em.getTransaction().commit();   
        } catch (Exception e) {
            e.printStackTrace();
        }

    
    }

    @Override
    public void addReunion(Reunion reunion) {
  try {
        em.getTransaction().begin();
        em.persist(reunion);
        em.getTransaction().commit();   
        } catch (Exception e) {
            e.printStackTrace();
        }    }

    @Override
    public void addNote(Note note) {
  try {
        em.getTransaction().begin();
        em.persist(note);
        em.getTransaction().commit();   
        } catch (Exception e) {
            e.printStackTrace();
        }    }

    @Override
    public void addPole(Pole pole) {
  try {
        em.getTransaction().begin();
        em.persist(pole);
        em.getTransaction().commit();   
        } catch (Exception e) {
            e.printStackTrace();
        }    }

    @Override
    public void addGroupereunion(Groupereunion groupereunion) {
  try {
        em.getTransaction().begin();
        em.persist(groupereunion);
        em.getTransaction().commit();   
        } catch (Exception e) {
            e.printStackTrace();
        }    }

    @Override
    public void addDuree(Duree duree) {
  try {
        em.getTransaction().begin();
        em.persist(duree);
        em.getTransaction().commit();   
        } catch (Exception e) {
            e.printStackTrace();
        }    }

    @Override
    public void addInvitation(Invitation invitation) {
  try {
        em.getTransaction().begin();
        em.persist(invitation);
        em.getTransaction().commit();   
        } catch (Exception e) {
            e.printStackTrace();
        }    }

    @Override
    public void addRecevoir(Recevoir recevoir) {
  try {
        em.getTransaction().begin();
        em.persist(recevoir);
        em.getTransaction().commit();   
        } catch (Exception e) {
            e.printStackTrace();
        }    }

    @Override
    public void addPersonnecnej(Personnelcnej personnelcnej) {
  try {
        em.getTransaction().begin();
        em.persist(personnelcnej);
        em.getTransaction().commit();   
        } catch (Exception e) {
            e.printStackTrace();
        }    }

    @Override
    public void addNotecnej(Notecnej notecnej) {
  try {
        em.getTransaction().begin();
        em.persist(notecnej);
        em.getTransaction().commit();   
        } catch (Exception e) {
            e.printStackTrace();
        }    }

    @Override
    public void addParticiper(Participer participer) {
  try {
        em.getTransaction().begin();
        em.persist(participer);
        em.getTransaction().commit();   
        } catch (Exception e) {
            e.printStackTrace();
        }    }

    @Override
    public void updateStructure(Structure structure) {
  try {
        em.getTransaction().begin();
        em.merge(structure);
        em.getTransaction().commit();   
        } catch (Exception e) {
            e.printStackTrace();
        }    }

    @Override
    public void updateReunion(Reunion reunion) {
  try {
        em.getTransaction().begin();
        em.merge(reunion);
        em.getTransaction().commit();   
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }

    @Override
    public void updateNote(Note note) {
  try {
        em.getTransaction().begin();
        em.merge(note);
        em.getTransaction().commit();   
        } catch (Exception e) {
            e.printStackTrace();
        }     }

    @Override
    public void updatePole(Pole pole) {
  try {
        em.getTransaction().begin();
        em.merge(pole);
        em.getTransaction().commit();   
        } catch (Exception e) {
            e.printStackTrace();
        }     }

    @Override
    public void updateGroupereunion(Groupereunion groupereunion) {
  try {
        em.getTransaction().begin();
        em.merge(groupereunion);
        em.getTransaction().commit();   
        } catch (Exception e) {
            e.printStackTrace();
        }     }

    @Override
    public void updateDuree(Duree duree) {
  try {
        em.getTransaction().begin();
        em.merge(duree);
        em.getTransaction().commit();   
        } catch (Exception e) {
            e.printStackTrace();
        }     }

    @Override
    public void updateInvitation(Invitation invitation) {
  try {
        em.getTransaction().begin();
        em.merge(invitation);
        em.getTransaction().commit();   
        } catch (Exception e) {
            e.printStackTrace();
        }     }

    @Override
    public void updateRecevoir(Recevoir recevoir) {
  try {
        em.getTransaction().begin();
        em.merge(recevoir);
        em.getTransaction().commit();   
        } catch (Exception e) {
            e.printStackTrace();
        }     }

    @Override
    public void updatePersonnecnej(Personnelcnej personnelcnej) {
  try {
        em.getTransaction().begin();
        em.merge(personnelcnej);
        em.getTransaction().commit();   
        } catch (Exception e) {
            e.printStackTrace();
        }     }

    @Override
    public void updateNotecnej(Notecnej notecnej) {
  try {
        em.getTransaction().begin();
        em.merge(notecnej);
        em.getTransaction().commit();   
        } catch (Exception e) {
            e.printStackTrace();
        }     }

    @Override
    public void updateParticiper(Participer participer) {
  try {
        em.getTransaction().begin();
        em.merge(participer);
        em.getTransaction().commit();   
        } catch (Exception e) {
            e.printStackTrace();
        }     }

    @Override
    public void deleteStructure(Structure structure) {
  try {
        em.getTransaction().begin();
        em.remove(em.merge(structure));
        em.getTransaction().commit();   
        } catch (Exception e) {
            e.printStackTrace();
        }     }

    @Override
    public void deleteReunion(Reunion reunion) {
 try {
        em.getTransaction().begin();
        em.remove(em.merge(reunion));
        em.getTransaction().commit();   
        } catch (Exception e) {
            e.printStackTrace();
        }     }

    @Override
    public void deleteNote(Note note) {
 try {
        em.getTransaction().begin();
        em.remove(em.merge(note));
        em.getTransaction().commit();   
        } catch (Exception e) {
            e.printStackTrace();
        }     }

    @Override
    public void deletePole(Pole pole) {
 try {
        em.getTransaction().begin();
        em.remove(em.merge(pole));
        em.getTransaction().commit();   
        } catch (Exception e) {
            e.printStackTrace();
        }     }

    @Override
    public void deleteGroupereunion(Groupereunion groupereunion) {
 try {
        em.getTransaction().begin();
        em.remove(em.merge(groupereunion));
        em.getTransaction().commit();   
        } catch (Exception e) {
            e.printStackTrace();
        }     }

    @Override
    public void deleteDuree(Duree duree) {
 try {
        em.getTransaction().begin();
        em.remove(em.merge(duree));
        em.getTransaction().commit();   
        } catch (Exception e) {
            e.printStackTrace();
        }     }

    @Override
    public void deleteInvitation(Invitation invitation) {
 try {
        em.getTransaction().begin();
        em.remove(em.merge(invitation));
        em.getTransaction().commit();   
        } catch (Exception e) {
            e.printStackTrace();
        }     }

    @Override
    public void deleteRecevoir(Recevoir recevoir) {
 try {
        em.getTransaction().begin();
        em.remove(em.merge(recevoir));
        em.getTransaction().commit();   
        } catch (Exception e) {
            e.printStackTrace();
        }     }

    @Override
    public void deletePersonnecnej(Personnelcnej personnelcnej) {
 try {
        em.getTransaction().begin();
        em.remove(em.merge(personnelcnej));
        em.getTransaction().commit();   
        } catch (Exception e) {
            e.printStackTrace();
        }     }

    @Override
    public void deleteNotecnej(Notecnej notecnej) {
 try {
        em.getTransaction().begin();
        em.remove(em.merge(notecnej));
        em.getTransaction().commit();   
        } catch (Exception e) {
            e.printStackTrace();
        }     }

    @Override
    public void deleteParticiper(Participer participer) {
 try {
        em.getTransaction().begin();
        em.remove(em.merge(participer));
        em.getTransaction().commit();   
        } catch (Exception e) {
            e.printStackTrace();
        }     }

    @Override
    public void addPersonne(Personne personne) {
 try {
        em.getTransaction().begin();
        em.remove(em.merge(personne));
        em.getTransaction().commit();   
        } catch (Exception e) {
            e.printStackTrace();
        }     }

    @Override
    public void updatePersonne(Personne personne) {
 try {
        em.getTransaction().begin();
        em.remove(em.merge(personne));
        em.getTransaction().commit();   
        } catch (Exception e) {
            e.printStackTrace();
        }     }

    @Override
    public void deletePersonne(Personne personne) {
 try {
        em.getTransaction().begin();
        em.remove(em.merge(personne));
        em.getTransaction().commit();   
        } catch (Exception e) {
            e.printStackTrace();
        }     }
    
}
