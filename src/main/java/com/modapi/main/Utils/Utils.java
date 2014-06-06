package com.modapi.main.Utils;

import org.apache.logging.log4j.Level;

import com.modapi.main.helper.LogHandler;

import cpw.mods.fml.common.Loader;

class Utils {

	static void findMod(String Mod) 
	{
		
		if(Loader.isModLoaded(Mod)==true)
		{
			LogHandler.log(Level.INFO, Mod+" is Loaded");
			
		}else{
			
			LogHandler.log(Level.INFO, Mod+" is not Loaded");
		}
	}

}
