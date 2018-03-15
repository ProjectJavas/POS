/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DLL;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Panhavuth
 */
public class SubDefaultTableModel extends DefaultTableModel{
    public void removeAllRows(){
        while(this.getRowCount()>0)
            this.removeRow(0);
    }
    public void removeSelectedRows(JTable table){
        int index[]=table.getSelectedRows();
        for(int i=0;i<index.length;i++)
            this.removeRow(index[i]-i);
    }
    private boolean editCell=false;
    public boolean isCellEditable(int r, int c){
       
            return isEditCell();
        
    }

    /**
     * @return the editCell
     */
    public boolean isEditCell() {
        return editCell;
    }

    /**
     * @param editCell the editCell to set
     */
    public void setEditCell(boolean editCell) {
        this.editCell = editCell;
    }
    
}
