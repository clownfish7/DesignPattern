package com.clownfish7.responsibilitychain;

/**
 * @author You
 * @create 2019-07-28 0:20
 */
public class CollegeApprover extends Approver {

    public CollegeApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getPrice() <= 10000) {
            System.out.println("请求编号id: " + request.getId() + " 被" + this.name + "处理");
        } else {
            approver.processRequest(request);
        }
    }
}
