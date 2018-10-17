
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marcs
 */
public class KniffelBL extends AbstractTableModel{
    
    private ArrayList<Kniffel> liste = new ArrayList();
    private String [] colnames = {"Spiel","Wahl","Punkte"};

    public void add(Kniffel k){
        liste.add(k);
        
        fireTableDataChanged();
    }
    
    @Override
    public int getRowCount() {
        return liste.size();
    }

    @Override
    public int getColumnCount() {
        return colnames.length;
    }
    
    @Override
        public String getColumnName(int column) {
        return colnames[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Kniffel k = liste.get(rowIndex);
        switch(rowIndex){
            case 0: return ""+k.getGame();
            case 1: return ""+k.isChoice();
            case 2: return ""+k.getPoints();
            default: return "???";
            
        }
    }
    
}
