/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Huynh Gia Phuc - CE181933
 */
public class Order {
    private int OID;
    private int CUSID;
    private int EmpID;
    private String DateOfOrder;
    private String Status;

    public Order(int OID, int CUSID, int EmpID, String DateOfOrder, String Status) {
        this.OID = OID;
        this.CUSID = CUSID;
        this.EmpID = EmpID;
        this.DateOfOrder = DateOfOrder;
        this.Status = Status;
    }

    

    public int getOID() {
        return OID;
    }

    public void setOID(int OID) {
        this.OID = OID;
    }

    public int getCUSID() {
        return CUSID;
    }

    public void setCUSID(int CUSID) {
        this.CUSID = CUSID;
    }

    public int getEmpID() {
        return EmpID;
    }

    public void setEmpID(int EmpID) {
        this.EmpID = EmpID;
    }

    public String getDateOfOrder() {
        return DateOfOrder;
    }

    public void setDateOfOrder(String DateOfOrder) {
        this.DateOfOrder = DateOfOrder;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
    
    
}
