/**@author wuebk - Tyler Wuebke;
 * Class : CIS175 Spring 2021
 * Feb 18, 2021
 */
package model;

/**
 * @author wuebk
 *
 */
public class EarthToMars {
	private double earthWeight;
	private double marsWeight;
	
	
	
	
	public EarthToMars() {
		super();
	}
	
	public EarthToMars(double earthWeight) {
		super();
		this.setEarthWeight(earthWeight);
		this.setMarsWeight(earthWeight * 0.375);
	}
	
	public double convertToMars(double earthWeight) {
		double convertedM;
		convertedM = earthWeight * marsWeight;
		
		return convertedM;
	}

	public double getEarthWeight() {
		return earthWeight;
	}

	public void setEarthWeight(double earthWeight) {
		this.earthWeight = earthWeight;
	}

	public double getMarsWeight() {
		return marsWeight;
	}

	public void setMarsWeight(double marsWeight) {
		this.marsWeight = marsWeight;
	}
	
	@Override
	public String toString() {
		return "Earth to Mars Weight : Earth Weight = " + this.earthWeight + " Mars Weight : " + this.marsWeight;
	}


}
