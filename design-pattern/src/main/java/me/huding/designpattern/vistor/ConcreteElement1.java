package me.huding.designpattern.vistor;

public class ConcreteElement1 extends Element {

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub

	}

}
