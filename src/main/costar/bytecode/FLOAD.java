package costar.bytecode;

import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;
import starlib.formula.Variable;
import starlib.formula.expression.Expression;

public class FLOAD extends gov.nasa.jpf.jvm.bytecode.FLOAD {
	
	public FLOAD(int localVarIndex) {
		super(localVarIndex);
	}
	
	@Override
	public Instruction execute(ThreadInfo ti) {
		StackFrame sf = ti.getModifiableTopFrame();
		Object sym_v = sf.getLocalAttr(index);
		
		if (sym_v != null && sym_v instanceof gov.nasa.jpf.constraints.api.Expression<?>) {
			String name = ((gov.nasa.jpf.constraints.api.Expression<?>) sym_v).toString(0);
			Expression exp = new Variable(name, "float");
			sf.setLocalAttr(index, exp);
		}
		
		return super.execute(ti);
	}

}
