/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Group_B9A_4;

public class bookTable{
    private int tableID;
    private boolean tableAvilable;


    public bookTable(int tableID, boolean tableAvilable) {
        this.tableID = tableID;
        this.tableAvilable = tableAvilable;
    }

    public int getTableID() {
        return tableID;
    }

    public void setTableID(int tableID) {
        this.tableID = tableID;
    }

    public boolean isTableAvailable() {
        return tableAvilable;
    }

    public void setisTableAvailable(boolean tableAvilable) {
        this.tableAvilable = tableAvilable;
    }
}