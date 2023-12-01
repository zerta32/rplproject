package datapegawai;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ControllerPegawai {
 ArrayList<pegawaibaru> ArrayData;
 DefaultTableModel tablelist;
 
 public ControllerPegawai(){
     ArrayData = new ArrayList<pegawaibaru>();
 }
 public void InsertData (String nama, String nim, int umur, int gaji){
     pegawaibaru peg = new pegawaibaru(nama,nim,umur,gaji);
     ArrayData.add(peg);    
 }
public DefaultTableModel showData(){
    String[] kolom = {"Nama", "NIK", "Umur", "Gaji"};
    Object[][] objData = new Object [ArrayData.size()][4];
    int i = 0;
    
    for (pegawaibaru n : ArrayData){
        String[] arrData = {n.getNama(), n.getNik(), String.valueOf(n.umur),String.valueOf(n.gaji) };
        objData[i] = arrData;
        i++;
    }
    tablelist = new DefaultTableModel (objData, kolom){
        public boolean inCellEditTable(int rowIndex, int colIndex){
        return false;   
    }
     
    
};
    return tablelist;
}
}