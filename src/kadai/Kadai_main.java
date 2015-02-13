package kadai;

import kadai.Kadai_view;


import java.sql.ResultSet;
import java.sql.SQLException;

import kadai.Kadai_Controller;
import kadai.Kadai_view;
import kadai.MySQL;

public class Kadai_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kadai_Controller controller = new Kadai_Controller();
		Kadai_view frame = new Kadai_view(controller);
		frame.setBounds(5,5,655,455);
		frame.setVisible(true);
		
	
		
	}
	
}
