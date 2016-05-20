package com.yc.vote.entity;

import org.springframework.stereotype.Component;

@Component("user")
public class User {
	private int vuid;
	
    private String vuemail;

    private String vuusername;

    private String vupassword;

    private Integer vustatus;

    private int vuversion;
    

    public int getVuid() {
		return vuid;
	}

	public void setVuid(int vuid) {
		this.vuid = vuid;
	}

	public String getVuemail() {
		return vuemail;
	}

	public void setVuemail(String vuemail) {
		this.vuemail = vuemail;
	}

	public String getVuusername() {
        return vuusername;
    }

    public void setVuusername(String vuusername) {
        this.vuusername = vuusername == null ? null : vuusername.trim();
    }

    public String getVupassword() {
        return vupassword;
    }

    public void setVupassword(String vupassword) {
        this.vupassword = vupassword == null ? null : vupassword.trim();
    }
    
    public Integer getVustatus() {
        return vustatus;
    }

    public void setVustatus(Integer vustatus) {
        this.vustatus = vustatus;
    }

    public int getVuversion() {
        return vuversion;
    }

    public void setVuversion(int vuversion) {
        this.vuversion = vuversion;
    }

	@Override
	public String toString() {
		return "User [vuid=" + vuid + ", vuemail=" + vuemail + ", vuusername="
				+ vuusername + ", vupassword=" + vupassword + ", vustatus="
				+ vustatus + ", vuversion=" + vuversion + "]";
	}
}