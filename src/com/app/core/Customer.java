package com.app.core;

public class Customer {
	private Integer cid;
	private String name;
	private String addr;
	
	 
	public Customer(Integer cid, String name, String addr) {
		super();
		this.cid = cid;
		this.name = name;
		this.addr = addr;
	}
	
	
	public boolean equals(Object obj) {
		Customer cm=(Customer) obj;
		if(this.cid==cm.cid && this.name==cm.name &&this.addr==cm.addr)
		return true;
		return false;
		
	}
	
	
	public int hashCode() {
		return(this.cid.hashCode()+this.name.hashCode()+this.addr.hashCode());
	}


	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", addr=" + addr + "]";
	}
	
	
	

}
