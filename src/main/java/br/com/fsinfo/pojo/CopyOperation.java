package br.com.fsinfo.pojo;

import br.com.util.Commands;

public class CopyOperation extends AbstractOperation implements Operation {
		
	public CopyOperation(Commands command){
		super(command);
	}
	
	public void doOperation() {
		System.out.println("Copy");
	}
	
}
