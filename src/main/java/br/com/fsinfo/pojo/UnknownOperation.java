package br.com.fsinfo.pojo;

import br.com.util.Commands;

public class UnknownOperation extends AbstractOperation implements Operation {

	public UnknownOperation(Commands command){
		super(command);
	}

	
	public void doOperation() {
		System.out.println("Do nothing");
	}

}
