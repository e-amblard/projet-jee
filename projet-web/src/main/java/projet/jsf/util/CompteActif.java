package projet.jsf.util;

import static projet.commun.dto.Roles.ADMINISTRATEUR;
import static projet.commun.dto.Roles.UTILISATEUR;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import projet.jsf.data.Compte;

@SuppressWarnings("serial")
@SessionScoped
@Named
public class CompteActif extends Compte {
	
	public boolean isLoggedIn() {
		return getPseudo() != null;
	}	
	
	public boolean isUtilisateur() {
		return isLoggedIn() && isInRole( UTILISATEUR );
	}
	
	public boolean isAdmininstrateur() {
		return isLoggedIn() && isInRole( ADMINISTRATEUR );
	}

	public String disconnect() {
	    UtilJsf.sessionInvalidate();
        UtilJsf.messageInfo( "Vous avez été déconnecté" );
	    return "connexion";
	}

}
