package projet.jsf.data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@SuppressWarnings("serial")
public class Categorie implements Serializable {

	
	// Champs

    private Integer        	id;
    
	@NotBlank( message = "Le libellé doit être renseigné")
	@Size(max=25, message = "Valeur trop longue pour le libellé : 25 car. maxi" )
    private String      	libelle;
	
	private LocalDate		debut;
    
    
    // Constructeurs
    
    public Categorie() {
	}

    public Categorie(Integer id, String libelle) {
		super();
		this.id = id;
		this.libelle = libelle;
	}
    
    
    // Getters & setters

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    
    public LocalDate getDebut() {
		return debut;
	}
    
    public void setDebut(LocalDate debut) {
		this.debut = debut;
	}

    
    // toString()
    
	@Override
	public String toString() {
		return libelle;
	}

	
	// hashCode() & equals()

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		var other = (Categorie) obj;
		return Objects.equals(id, other.id);
	}

}
