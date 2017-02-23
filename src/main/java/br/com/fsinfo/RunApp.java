package br.com.fsinfo;

import javax.swing.JOptionPane;

import br.com.fsinfo.pojo.AbstractOperation;
import br.com.fsinfo.pojo.Operation;
import br.com.fsinfo.pojo.OperationFactory;
import br.com.util.Commands;

public class RunApp {

	public static void main(String[] args) {
		
		String strUpperOperation = JOptionPane.showInputDialog("Please, what's the file operation do you want to proceed: Tape READ/COPY");		
		
		if(strUpperOperation != null && !strUpperOperation.equals("")){
			
			AbstractOperation ops = OperationFactory.getOperation(strUpperOperation.toUpperCase());		

			AuxiliarParameter aux = new AuxiliarParameter();
			
			aux.receiveAuxiliaryParameters(ops);
			
			ops.doOperation();
		}
		System.exit(0);
	}
}

class AuxiliarParameter {
	
	public void receiveAuxiliaryParameters(AbstractOperation ops){
		if (ops.getCommand().equals(Commands.READ)){
			String strUpperOperation = JOptionPane.showInputDialog("Please, insert de PATH to read");
			ops.setFromPath(strUpperOperation);
		} else if (ops.getCommand().equals(Commands.COPY)){			
			String fromPath = JOptionPane.showInputDialog("Please, insert the File FROM PATH to copy.");
			String toPath = JOptionPane.showInputDialog("Please, insert the File TO PATH to copy.");
			ops.setFromPath(fromPath);
			ops.setToPath(toPath);			
		}		
	}
	
}
