package com.clownfish7.adapter.classadapter;

/**
 * @author yzy
 * @classname VoltageAdapter
 * @description TODO
 * @create 2019-07-26 10:04
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

    @Override
    public int output5V() {
        int srcV = output220V();
        int dstV = srcV / 44;
        return dstV;
    }
}
