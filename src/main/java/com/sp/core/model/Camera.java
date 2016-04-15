package com.sp.core.model;

import org.springframework.beans.factory.FactoryBean;

public class Camera {

	private String vendor;
	private String resolution;
	private String sim;
	private Sim ssim;
	public String getSim() {
		return sim;
	}

	public void setSim(String sim) {
		this.sim = sim;
	}

	public Sim getSsim() {
		return ssim;
	}

	public void setSsim(Sim ssim) {
		this.ssim = ssim;
	}

	public Camera() {
		System.out.println("_@)@()#CAMERA DC)(@(@(@(");
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	@Override
	public String toString() {
		return "Camera [vendor=" + vendor + ", resolution=" + resolution
				+ ", sim=" + sim + ", ssim=" + ssim + "]";
	}

}
