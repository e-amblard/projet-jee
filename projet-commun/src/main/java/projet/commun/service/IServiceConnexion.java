package projet.commun.service;

import projet.commun.dto.DtoCompte;


public interface IServiceConnexion {

	DtoCompte	sessionUtilisateurOuvrir( String pseudo, String motDePasse );

	void		sessionUtilisateurFermer();

}
