package net.gordon.tb2.bean.parking;

import net.gordon.tb2.R;

/**
 * Status des parkings de Nantes.
 * 
 * @author romain
 * 
 */
public enum ParkingPublicStatut {
	//@formatter:off
		INVALIDE(	0, R.string.parking_invalide, 	R.color.parking_state_undefined), 
		FERME(		1, R.string.parking_ferme, 		R.color.parking_state_closed), 
		ABONNES(	2, R.string.parking_abonne, 	R.color.parking_state_subscriber), 
		OUVERT(		5, R.string.parking, 			R.color.parking_state_blue);
	//@formatter:on

	private int value;
	private int titleRes;
	private int colorRes;

	private ParkingPublicStatut(int value, int titleRes, int colorRes) {
		this.value = value;
		this.titleRes = titleRes;
		this.colorRes = colorRes;
	}

	public int getValue() {
		return value;
	}

	public int getTitleRes() {
		return titleRes;
	}

	public int getColorRes() {
		return colorRes;
	}

}
