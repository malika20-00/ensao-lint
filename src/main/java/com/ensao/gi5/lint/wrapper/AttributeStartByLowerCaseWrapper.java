package com.ensao.gi5.lint.wrapper;



import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.expr.SimpleName;

public class AttributeStartByLowerCaseWrapper {
	private final String fieldName;
	private final int line;
	
	public AttributeStartByLowerCaseWrapper(String fieldName) {
		this.fieldName = fieldName;
		this.line = 0;
	}
	public AttributeStartByLowerCaseWrapper(FieldDeclaration fieldName) {
		this.fieldName = fieldName.toString();
		this.line = fieldName.getBegin().map(p ->p.line).orElse(-1);

	}
	public AttributeStartByLowerCaseWrapper(SimpleName fieldName) {
		this.fieldName = fieldName.toString();
		this.line = fieldName.getBegin().map(p ->p.line).orElse(-1);
	}
	
	
	@Override
	public String toString() {
		return fieldName;
	}
	public String getFieldName() {
		return this.fieldName;
	}
	public int getLine() {
		return this.line;
	}

}
