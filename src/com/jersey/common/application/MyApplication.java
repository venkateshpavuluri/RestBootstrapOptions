package com.jersey.common.application;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.jb.resources.NetBanking;
//@ApplicationPath("/api")
public class MyApplication extends Application{
	Set<Object>  set;
	
	public MyApplication()
	{
		set=new HashSet<>();
		set.add(new NetBanking());
	}
	
	public Set<Object> getSingletons()
	{
		return set;
		
	}

}
