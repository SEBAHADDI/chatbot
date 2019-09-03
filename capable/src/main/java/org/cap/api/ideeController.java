package org.cap.api;

import java.util.ArrayList;
import java.util.List;


import javax.validation.Valid;

import org.cap.entities.Collaborateur;
import org.cap.entities.Equipe;
import org.cap.entities.Idee;
import org.cap.entities.IdeeGenerale;
import org.cap.entities.Immobilier;
import org.cap.entities.Logistique;
import org.cap.entities.Population;
import org.cap.entities.Vote;
import org.cap.repository.CollaborateurRepository;
import org.cap.repository.EquipeRepository;
import org.cap.repository.IdeeRepository;
import org.cap.repository.ImmobilierRepository;
import org.cap.repository.LogistiqueRepository;
import org.cap.repository.PopulationRepository;
import org.cap.repository.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ideeController {
	 @Autowired
	  private IdeeRepository ideeRepository;
	 @Autowired
	  private CollaborateurRepository collaborateurRepository;
	 @Autowired
	  private ImmobilierRepository immobilierRepository;
	 @Autowired
	  private PopulationRepository populationRepository;
	 @Autowired
	  private LogistiqueRepository logistiqueRepository;
	 @Autowired
	  private EquipeRepository equipeRepository;
	 @Autowired
	  private VoteRepository voteRepository;

	 // METHODE DE TEST
	 @RequestMapping(value = "/test", method = RequestMethod.GET)
	 public List<Idee> gettest() {
	   
		 List<Idee> idees = ideeRepository.findAll();
		 ArrayList<Collaborateur> collaborateurs = new ArrayList<Collaborateur>();
		 
		 /*for(Idee i : idees){
			 String id_coll = i.getId_collaborateur();
			 Collaborateur col = collaborateurRepository.Findcolbyid(id_coll);
			 collaborateurs.add(col);
			 
			 
		 }
		 return collaborateurs;*/
		 
		 return idees;
	 }
	 
	 @RequestMapping(value = "/getallidees", method = RequestMethod.GET)
	 public List<Idee> getAllidees() {
	   return ideeRepository.findAll();
	 }
	 @RequestMapping(value = "/getallcol", method = RequestMethod.GET)
	 public List<Collaborateur> getAllcol() {
	   return collaborateurRepository.findAll();
	 }
	 @RequestMapping(value = "/getallimm", method = RequestMethod.GET)
	 public List<Immobilier> getAllimm() {
	   return immobilierRepository.findAll();
	 }
	 
	 // CREER NOUVELLE IDEE
	 @RequestMapping(value = "/createidee", method = RequestMethod.POST)
	 public void createIdee(@Valid @RequestBody IdeeGenerale ideegenerale) {
		 Idee idee = new Idee();
		 Population population = new Population();
		 Logistique logistique = new Logistique();
		 Equipe equipe = new Equipe();
		 
		 // POPULATION
		 population.setTranche1(ideegenerale.getTranche1());
		 population.setTranche2(ideegenerale.getTranche2());
		 population.setAnciennete(ideegenerale.getAnciennete());
		 population.setEtat(ideegenerale.getEtat());
		 population.setCommentaire(ideegenerale.getPopulation_commentaire());
		 populationRepository.save(population);
		 
		 // LOGISTIQUE
		 logistique.setCommentaire(ideegenerale.getLogistique_commentaire());
		 logistique.setImmobiliers(ideegenerale.getImmobiliers());
		 logistiqueRepository.save(logistique);
		 
		 // EQUIPE
		 equipe.setTitre(ideegenerale.getEquipe_titre());
		 equipe.setCollaborateurs(ideegenerale.getCollaborateurs());
		 equipeRepository.save(equipe);
		 
		 // IDEE
		 idee.setTitre(ideegenerale.getIdee_titre());
		 idee.setDescription(ideegenerale.getIdee_description());
		 idee.setCommentaire(ideegenerale.getIdee_commentaire());
		 idee.setEstimation(ideegenerale.getEstimation());
		 idee.setComplexite(ideegenerale.getComplexite());
		 idee.setEcheance(ideegenerale.getEcheance());
		 
		 idee.setId_collaborateur(ideegenerale.getId_collaborateur());
		 idee.setId_population(population.getId());
		 idee.setId_logistique(logistique.getId());
		 idee.setId_equipe(equipe.getId());
		 
		   ideeRepository.save(idee);
		 }
	 
	 @RequestMapping(value = "/createcol", method = RequestMethod.POST)
	 public void createCollaborateur(@Valid @RequestBody Collaborateur Collaborateur) {
	   //Collaborateur.setId(ObjectId.get());
	   collaborateurRepository.save(Collaborateur);
	 }
	 
	 @RequestMapping(value = "/createimm", method = RequestMethod.POST)
	 public void createImmobilier(@Valid @RequestBody Immobilier immobilier) {
	   immobilierRepository.save(immobilier);
	 }
	 
	 @RequestMapping(value = "/createpop", method = RequestMethod.POST)
	 public void createPopulation(@Valid @RequestBody Population population) {
	   populationRepository.save(population);
	 }
	 
	 @RequestMapping(value = "/createequipe", method = RequestMethod.POST)
	 public void createLogistique(@Valid @RequestBody Logistique logistique) {
	   logistiqueRepository.save(logistique);
	 }
	 
	 @RequestMapping(value = "/createlog", method = RequestMethod.POST)
	 public void createEquipe(@Valid @RequestBody Equipe equipe) {
	   equipeRepository.save(equipe);
	 }

	 @RequestMapping(value = "/createvote", method = RequestMethod.POST)
	 public void createEquipe(@Valid @RequestBody Vote vote) {
	   voteRepository.save(vote);
	 }

}
