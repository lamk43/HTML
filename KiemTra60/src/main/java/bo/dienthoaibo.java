package bo;

import java.util.ArrayList;

import bean.Dienthoaibean;
import dao.Dienthoaidao;
public class dienthoaibo {
	Dienthoaidao sdao = new Dienthoaidao();
	ArrayList<Dienthoaibean> ds;
	
	public ArrayList<Dienthoaibean> getDienthoai() {
		ds = sdao.getDienthoai();
		return ds;
	}
	public ArrayList<Dienthoaibean> Tim(String key){
   	 	ArrayList<Dienthoaibean> tam= new ArrayList<Dienthoaibean>();
   	 	for(Dienthoaibean s: ds)
   	 		if(s.getTendidong().toLowerCase().trim().contains(key.toLowerCase().trim()))
   	 		tam.add(s);
   	 	return tam;
    }
}
