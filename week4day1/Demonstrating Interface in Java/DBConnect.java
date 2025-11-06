package week4day1;

public class DBConnect implements DatabseConnection{

	@Override
	public void connect() {
		System.out.println("Connect to DB");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnect from DB");
	}

	@Override
	public void executeUpdate() {
		System.out.println("Executed update");
	}
	
	
	public static void main(String[] args) {
		DBConnect db = new DBConnect();
		db.connect();
		db.disconnect();
		db.executeUpdate();
	}
	
	

}
