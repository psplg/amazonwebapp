package com.amazon.amazonwebapp.dataprovider;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import com.amazon.amazonwebapp.enums.DriverType;

public class ConfigFileReader {

	private Properties properties;
	private final String propertyFilePath="configs\\configuration.properties";
	private File file; 
	public ConfigFileReader() {
		BufferedReader bufferedReader;
		try {
			file = new File(propertyFilePath);
			bufferedReader = new BufferedReader(new FileReader(file));
			properties = new Properties();
			try {
				properties.load(bufferedReader);
				bufferedReader.close();				
			} catch (IOException ioException) {
				// TODO: handle exception
				ioException.printStackTrace();
			}
		}
		catch(FileNotFoundException fileNotFoundException)
		{
			fileNotFoundException.printStackTrace();
		}
				
	}
	
	public String getBaseURL()
	{
		String baseURL = properties.getProperty("baseURL");
		if(baseURL!=null)return baseURL;
		else
			throw new RuntimeException("Base URL not set");
	}
	
	public DriverType getBrowser()
	{
		String browserName = properties.getProperty("browser");		
		
		if(browserName == null||browserName.equalsIgnoreCase("chrome"))					
			return DriverType.CHROME;
		else if (browserName.equalsIgnoreCase("Firefox"))
			return DriverType.FIREFOX;
		else if (browserName.equalsIgnoreCase("InternetExplorer"))
			return DriverType.INTERNETEXLPORER;
		else			
			throw new RuntimeException("Browser not supported");
			
		}
	
	public boolean getBrowserWindowSize()
	{
		String windowSize = properties.getProperty("maximizeWindow");
		if(windowSize!=null)
			return Boolean.valueOf(windowSize);
		return true;
	}
}
