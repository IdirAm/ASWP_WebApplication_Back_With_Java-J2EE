package com.project.aswp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "full_clem")
public class Clem {

	@Id
	@Column(name = "id_clem")
	private int id_clem;

	private String id;

	private String milestone;

	private String auteur;

	private boolean is_in_clem;

	private int num;

	private String eqm;

	private String lot;

	private String activity;

	private String producer;

	private String outcome;

	private String deliverable;

	private String attendu;

	private String livrable;

	public Clem() {
		super();
	}

	public Clem(int id_clem, String id, String milestone, String auteur, boolean is_in_clem, int num, String eqm, String lot,
			String activity, String producer, String outcome, String deliverable, String attendu, String livrable) {
		super();
		this.id_clem = id_clem;
		this.id = id;
		this.milestone = milestone;
		this.auteur = auteur;
		this.is_in_clem = is_in_clem;
		this.num = num;
		this.eqm = eqm;
		this.lot = lot;
		this.activity = activity;
		this.producer = producer;
		this.outcome = outcome;
		this.deliverable = deliverable;
		this.attendu = attendu;
		this.livrable = livrable;
	}

	public int getId_clem() {
		return id_clem;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMilestone() {
		return milestone;
	}

	public void setMilestone(String milestone) {
		this.milestone = milestone;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public boolean isIs_in_clem() {
		return is_in_clem;
	}

	public void setIs_in_clem(boolean is_in_clem) {
		this.is_in_clem = is_in_clem;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getEqm() {
		return eqm;
	}

	public void setEqm(String eqm) {
		this.eqm = eqm;
	}

	public String getLot() {
		return lot;
	}

	public void setLot(String lot) {
		this.lot = lot;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getOutcome() {
		return outcome;
	}

	public void setOutcome(String outcome) {
		this.outcome = outcome;
	}

	public String getDeliverable() {
		return deliverable;
	}

	public void setDeliverable(String deliverable) {
		this.deliverable = deliverable;
	}

	public String getAttendu() {
		return attendu;
	}

	public void setAttendu(String attendu) {
		this.attendu = attendu;
	}

	public String getLivrable() {
		return livrable;
	}

	public void setLivrable(String livrable) {
		this.livrable = livrable;
	}

}
