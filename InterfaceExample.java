
class ABC {
	public void abc() {
		System.out.println("A class abc method");
	}
}

class B {
	public void abc() {
		System.out.println("B class abc method");
	}
}

class InterfaceExample extends ABC, B{
	InterfaceExample ie = new InterfaceExample();
		ie.abc();

}
