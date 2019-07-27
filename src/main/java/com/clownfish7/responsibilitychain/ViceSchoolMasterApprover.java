package com.clownfish7.responsibilitychain;

/**
 * @author You
 * @create 2019-07-28 0:21
 */
public class ViceSchoolMasterApprover extends Approver {

    public ViceSchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getPrice() <= 30000) {
            System.out.println("请求编号id: " + request.getId() + " 被" + this.name + "处理");
        } else {
            approver.processRequest(request);
        }
    }
}
