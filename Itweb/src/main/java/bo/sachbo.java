package bo;

import java.util.ArrayList;

import bean.sachbean;
import dao.sachdao;

public class sachbo {
	sachdao sdao = new sachdao();
	ArrayList<sachbean> ds;
	
	public ArrayList<sachbean> getSach() {
		ds = sdao.getSach();
		return ds;
	}
	
	public ArrayList<sachbean> TimMa(String ma){
	   	ArrayList<sachbean> tam= new ArrayList<sachbean>();
//	   	ArrayList<sachbean> ds= getSach();
	   	for(sachbean s: ds)
	   		if(s.getMaloai().equals(ma))
	   			tam.add(s);
	   	return tam;
    }
	
	public ArrayList<sachbean> Tim(String key){
   	 	ArrayList<sachbean> tam= new ArrayList<sachbean>();
//   	 	ArrayList<sachbean> ds= getSach();
   	 	for(sachbean s: ds)
   	 		if(s.getTensach().toLowerCase().trim().contains(key.toLowerCase().trim()) || s.getTacgia().toLowerCase().trim().contains(key.toLowerCase().trim())||s.getMaloai().toLowerCase().trim().contains(key.toLowerCase().trim()))
   	 			tam.add(s);
   	 	return tam;
    }
}
