package com.amazon.amazonwebapp.managers;

import com.amazon.amazonwebapp.dataprovider.ConfigFileReader;

public class FileReaderManager {
	private static FileReaderManager fileReaderManager = new FileReaderManager();
	private static ConfigFileReader configFileReader;

	private FileReaderManager() {		
		// this private constructor used to restrict other classes from instantiating this class
	} 
	
	public static FileReaderManager getInstance() {
		return fileReaderManager;
	}
	
	public ConfigFileReader getConfigReader() {
		return (configFileReader == null)? new ConfigFileReader():configFileReader;
	}
}
