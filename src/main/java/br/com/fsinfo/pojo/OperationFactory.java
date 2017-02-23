package br.com.fsinfo.pojo;

import br.com.util.Commands;

public class OperationFactory {

	public static AbstractOperation getOperation(String command){
		
		command = command.toUpperCase();
		
		if(command.equals(Commands.READ.name())){
			return new ReadOperation(Commands.READ);
		}else if(command.equals(Commands.COPY.name())){
			return new CopyOperation(Commands.COPY);
		} else {			
			return new UnknownOperation(Commands.UNKNOWN);		
		}	
	}
	
}
