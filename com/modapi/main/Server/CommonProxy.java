package com.modapi.main.Server;

import org.apache.logging.log4j.Level;

import com.modapi.main.helper.LogHandler;

import cpw.mods.fml.common.Loader;

public class CommonProxy 
{
	
	
	public void preInit()
	{
		//findMods();
	}

	public void load() 
	{
	    
	}
	
	public void postInit()
	{
	   
	}
	public static boolean findMod(String Mod, Boolean mod,String name){
		
		if(Loader.isModLoaded(Mod)==true)
		{
			LogHandler.log(Level.INFO, Mod+" Is a mod");
			
		}else{
			
			LogHandler.log(Level.INFO, "Looking For Fake "+ Mod);
		}
		
		return mod;
		

	}
	
}
