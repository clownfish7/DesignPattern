package com.clownfish7.responsibilitychain;

/**
 * @author You
 * @create 2019-07-28 0:22
 */
public class Client {
    public static void main(String[] args) {
        PurchaseRequest purchaseRequest = new PurchaseRequest(1, 1, 31000, 1);

        DepartmentApprover 张主任 = new DepartmentApprover("张主任");
        CollegeApprover 李院长 = new CollegeApprover("李院长");
        ViceSchoolMasterApprover 王副校长 = new ViceSchoolMasterApprover("王副校长");
        SchoolMasterApprover 余校长 = new SchoolMasterApprover("余校长");

        张主任.setApprover(李院长);
        李院长.setApprover(王副校长);
        王副校长.setApprover(余校长);

        张主任.processRequest(purchaseRequest);
    }
}
