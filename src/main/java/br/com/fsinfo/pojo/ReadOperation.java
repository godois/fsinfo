package br.com.fsinfo.pojo;

import java.io.File;

import br.com.util.Commands;

public class ReadOperation extends AbstractOperation implements Operation {

	public ReadOperation(Commands command){
		super(command);
	}

	
	public void doOperation() {
		if (this.getFromPath()!=null && !this.getFromPath().equals("")){
			File path = new File(getFromPath());
			recursiveRead(path);
		}
	}

	private void recursiveRead(File directory){
		if(directory.isDirectory()){
			for (File file : directory.listFiles()) {
				System.out.println(file.getName());
				if(file.isDirectory()){
					recursiveRead(file);	
				}				
			}
		}		
	}
	
}
