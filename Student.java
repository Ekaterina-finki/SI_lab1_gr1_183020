class Student {
	String index;
	String firstName;
	String lastName;

	List<Integer> labPoints = new List<Integer>();

	Student(String index, String firstName, String lastName, List<Intsger> labPoints){
	this.index=index;
	this.firstName=first.Name;
	this.lastName=lastName;
	this.labPoints = labPoints;

	}
	void setList(List<Integer> l){
		labpoints = l;
	}
	void setIndex(String i) {
  		index=i;
 		 }
	void setFirstName(String fn) {
  		firstName=fn;
 		 }
	void setLastName(String ln) {
  		lastName=ln;
 		 }
 	List<Integer> get(){
		return labPoints;
		}
	String getIndex(){
		return index;
		}
	String getFirstName(){
		return firstName;
		}
	String getLastName(){
		return lastName;
		}


	public double getAverage() {
		ListNode<Integer> tmp  labPoints.first;
		int zbir = 0;
		While(tmp!=null)
		{
			Zbir += tmp;
			Tmp = tmp.succ;
		}
		Return zbir/labPoints.lenght;
	}

	public boolean hasSignature() {
		ListNode<Integer> tmp  labPoints.first;
		int brojac = 0;
		While(tmp!=null)
		{
			Brojac++;
			Tmp = tmp.succ;
		}
		If(brojac >=8){
			Return true;
		}
		else{
		return false;
		}
	}
}
