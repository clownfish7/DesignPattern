package com.clownfish7.responsibilitychain;

/**
 * @author You
 * @create 2019-07-28 0:13
 */
public abstract class Approver {
    protected Approver approver;
    protected String name;

    public Approver(String name) {
        this.name = name;
    }

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    public abstract void processRequest(PurchaseRequest request);
}
