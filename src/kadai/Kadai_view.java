package kadai;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;



public class Kadai_view extends Frame implements ActionListener,WindowListener {
	
	public Kadai_view(Kadai_Controller controller) {
		// TODO Auto-generated constructor stub
		addWindowListener(this);
		setTitle("Kadai");
		setLayout(new FlowLayout(FlowLayout.CENTER));
		int year,number;
		String name;
		ResultSet rs;

		MySQL mysql = new MySQL();

		rs = mysql.selectAll();


		try {
			while(rs.next()){
			        year = rs.getInt("year");
			        number = rs.getInt("number");
			        
			        add(new Label("year:"+year));
			        add(new Label("number:"+number));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		setTitle("Graph");

		DefaultCategoryDataset data = new DefaultCategoryDataset();

		data.addValue(597, "S University", "2010");
		data.addValue(826, "S University", "2011");
		data.addValue(647, "S University", "2012");
		data.addValue(941, "S University", "2013");
		data.addValue(723, "S University", "2014");
		


		JFreeChart chart = 
				ChartFactory.createLineChart("Applicants for entrance",
                               "years",
                               "mans",
                               data,
                               PlotOrientation.VERTICAL,
                               true,
                               false,
                               false);

		ChartPanel cpanel = new ChartPanel(chart);
		add(cpanel, BorderLayout.CENTER);
}

	



	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
