package sef.module9.activity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Implementation of a Radar
 */
public class RadarImpl implements Radar {
	private List<RadarContact> radarContactList;

	/**
	 * Constructs a new Radar
	 */
	public RadarImpl() {
		radarContactList = new ArrayList<>();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sef.module8.activity.Radar#addContact(sef.module8.activity.RadarContact)
	 */
	public RadarContact addContact(RadarContact contact) {

		RadarContact tempContact = contact;

		boolean isSimilar = false;

		int counter;
		if (contact == null) {
			return tempContact;
		}

		for (counter = 0; counter < this.getContactCount(); counter++) {
			if (radarContactList.get(counter).getContactID().equals(contact.getContactID())) {

				radarContactList.get(counter).setBearing(contact.getBearing());

				radarContactList.get(counter).setDistance(contact.getDistance());

				isSimilar = true;

				break;

			}
		}

		if (!isSimilar) {
			radarContactList.add(tempContact);

		}

		return tempContact;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sef.module8.activity.Radar#getContact(java.lang.String)
	 */
	public RadarContact getContact(String id) {

		if (id == null || id.equals(""))
			return null;

		RadarContact tempContact = null;

		for (RadarContact contact : radarContactList) {
			if (contact.getContactID().equals(id)) {
				tempContact = contact;
				break;
			}
		}

		return tempContact;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sef.module8.activity.Radar#getContactCount()
	 */
	public int getContactCount() {

		return radarContactList.size();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sef.module8.activity.Radar#removeContact(java.lang.String)
	 */
	public RadarContact removeContact(String id) {
		if (id == null || id.equals(""))
			return null;

		RadarContact tempContact = null;

		for (RadarContact contact : radarContactList) {
			if (contact.getContactID().equals(id)) {
				tempContact = contact;
				radarContactList.remove(contact);
			}
		}
		return tempContact;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sef.module8.activity.Radar#returnContacts()
	 */
	public List<RadarContact> returnContacts() {
		List<RadarContact> tempRadarContact = new ArrayList<>();
		tempRadarContact.addAll(radarContactList);
		return tempRadarContact;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sef.module8.activity.Radar#returnContacts(java.util.Comparator)
	 */
	public List<RadarContact> returnContacts(Comparator<RadarContact> comparator) {
		Collections.sort(radarContactList, comparator);
		List<RadarContact> subRadarContactList = new ArrayList<>();

		subRadarContactList.addAll(radarContactList);

		return subRadarContactList;
	}

}
