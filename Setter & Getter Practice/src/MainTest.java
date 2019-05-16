 public class MainTest {
	
	public static void main(String[] args) {
		Main self = new Main(); // Creating object instance
		
		self.setName("Nabeel");
		
		Main self2 = new Main("Syed");
		//self2.setName("Syed");
		
		Main self3 = new Main();
		self3.setName("Test");
		
		Main[] list = new Main[3]; // Array of objects
		
		list[0] = self;
		list[1] = self2;
		list[2] = self3;
		
		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i].getName());
		}
	}
}