package com.projet.train.entities;

public class Trip {

	//fields
	int custumerId;
	char stationStart;
	char stationEnd;
	String startedJourneyAt;//convertir vers type date !!!!!
	int constInCents;
	char zoneFrom;
	char zoneTo;

	
	//constructors
	public Trip() {
		super();
	}
	
	

	public Trip(int custumerId) {
		super();
		this.custumerId = custumerId;
	}

	public Trip(int custumerId, char stationStart, char stationEnd) {
		super();
		this.custumerId = custumerId;
		this.stationStart = stationStart;
		this.stationEnd = stationEnd;
	}
	


	public Trip(int custumerId, char stationStart, char stationEnd, char zoneFrom, char zoneTo) {
		super();
		this.custumerId = custumerId;
		this.stationStart = stationStart;
		this.stationEnd = stationEnd;
		this.zoneFrom = zoneFrom;
		this.zoneTo = zoneTo;
	}



	public Trip(int custumerId, char stationStart, char stationEnd, int constInCents, char zoneFrom, char zoneTo) {
		super();
		this.custumerId = custumerId;
		this.stationStart = stationStart;
		this.stationEnd = stationEnd;
		this.constInCents = constInCents;
		this.zoneFrom = zoneFrom;
		this.zoneTo = zoneTo;
	}



	public Trip(int custumerId, char stationStart, char stationEnd, String startedJourneyAt, int constInCents,
			char zoneFrom, char zoneTo) {
		super();
		this.custumerId = custumerId;
		this.stationStart = stationStart;
		this.stationEnd = stationEnd;
		this.startedJourneyAt = startedJourneyAt;
		this.constInCents = constInCents;
		this.zoneFrom = zoneFrom;
		this.zoneTo = zoneTo;
	}

	
	
	//getters & setters
	public int getCustumerId() {
		return custumerId;
	}

	public void setCustumerId(int custumerId) {
		this.custumerId = custumerId;
	}

	public char getStationStart() {
		return stationStart;
	}

	public void setStationStart(char stationStart) {
		this.stationStart = stationStart;
	}

	public char getStationEnd() {
		return stationEnd;
	}

	public void setStationEnd(char stationEnd) {
		this.stationEnd = stationEnd;
	}

	public String getStartedJourneyAt() {
		return startedJourneyAt;
	}

	public void setStartedJourneyAt(String startedJourneyAt) {
		this.startedJourneyAt = startedJourneyAt;
	}

	public int getConstInCents() {
		return constInCents;
	}

	public void setConstInCents(int constInCents) {
		this.constInCents = constInCents;
	}

	public char getZoneFrom() {
		return zoneFrom;
	}

	public void setZoneFrom(char zoneFrom) {
		this.zoneFrom = zoneFrom;
	}

	public char getZoneTo() {
		return zoneTo;
	}

	public void setZoneTo(char zoneTo) {
		this.zoneTo = zoneTo;
	}
	
	
	
	
}
