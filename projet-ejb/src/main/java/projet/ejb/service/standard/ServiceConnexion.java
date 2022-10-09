package projet.ejb.service.standard;

import static javax.ejb.TransactionAttributeType.NOT_SUPPORTED;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.inject.Inject;

import projet.commun.dto.DtoCompte;
import projet.commun.service.IServiceConnexion;
import projet.ejb.dao.IDaoCompte;
import projet.ejb.data.mapper.IMapperEjb;

@Stateless
@Remote
public class ServiceConnexion implements IServiceConnexion {

	// Champs
	@Inject
	private IMapperEjb mapper;
	@Inject
	private IDaoCompte daoCompte;

	// Actions

	@Override
	@TransactionAttribute(NOT_SUPPORTED)
	public DtoCompte sessionUtilisateurOuvrir(String pseudo, String motDePasse) {
		DtoCompte compte = mapper.map(daoCompte.validerAuthentification(pseudo, motDePasse));
		return compte;
	}

	@Override
	@TransactionAttribute(NOT_SUPPORTED)
	public void sessionUtilisateurFermer() {
	}

}
