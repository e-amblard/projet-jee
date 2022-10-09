package projet.ejb.dao;

import java.util.List;

import projet.ejb.data.Compte;


public interface IDaoCompte {

	int			inserer( Compte compte );

	void 		modifier( Compte compte );

	void 		supprimer( int idCompte );

	Compte 		retrouver( int idCompte );

	List<Compte> listerTout();

	Compte 		validerAuthentification( String pseudo, String motDePasse );

	boolean 	verifierUnicitePseudo( String pseudo, int idCompte );

}
