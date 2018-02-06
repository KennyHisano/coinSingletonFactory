package coinfactory;

public  class Tx extends TxAbstract {
	
	private String sender;
	private String sendee;
	private float value;
	Tx(String sender,String sendee, float value){
		this.sender = sender;
		this.sendee = sendee;
		this.value = value;
	}
	@Override
	protected void checkSender() {
		// TODO Auto-generated method stub
		
	}
	@Override
	protected void checkSendee() {
		// TODO Auto-generated method stub
		
	}
	@Override
	protected void checkValue() {
		// TODO Auto-generated method stub
		
	}
	

}
