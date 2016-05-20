package com.yc.vote.entity;

import java.io.Serializable;

public class Option implements Serializable{
	private static final long serialVersionUID = -4962166407435529415L;

	private int voId;

    private String vooption;
    
    private int vsId;

    public int getVsId() {
		return vsId;
	}

	public void setVsId(int vsId) {
		this.vsId = vsId;
	}

	private int voorder;

    public int getVoId() {
		return voId;
	}

	public void setVoId(int voId) {
		this.voId = voId;
	}

	public String getVooption() {
        return vooption;
    }

    public void setVooption(String vooption) {
        this.vooption = vooption == null ? null : vooption.trim();
    }

    public int getVoorder() {
        return voorder;
    }

    public void setVoorder(int voorder) {
        this.voorder = voorder;
    }
    
    

	public Option() {
		super();
	}
	
	public Option(String vooption, int vsId, int voorder) {
		super();
		this.vooption = vooption;
		this.vsId = vsId;
		this.voorder = voorder;
	}

	@Override
	public String toString() {
		return "\nOption [voId=" + voId + ", vooption=" + vooption + ", vsId="
				+ vsId + ", voorder=" + voorder + "]";
	}
    
}