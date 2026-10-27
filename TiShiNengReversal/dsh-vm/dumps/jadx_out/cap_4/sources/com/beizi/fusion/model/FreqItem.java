package com.beizi.fusion.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class FreqItem {

    @com.beizi.fusion.model.JsonNode(key = "componentType")
    private int componentType;

    @com.beizi.fusion.model.JsonNode(key = "count")
    private int count;

    @com.beizi.fusion.model.JsonNode(key = "eventCode")
    private java.lang.String eventCode;

    @com.beizi.fusion.model.JsonNode(key = "interval")
    private long interval;

    public FreqItem() {
            r2 = this;
            r2.<init>()
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2.interval = r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            r2.count = r0
            return
    }

    public int getComponentType() {
            r1 = this;
            int r0 = r1.componentType
            return r0
    }

    public int getCount() {
            r1 = this;
            int r0 = r1.count
            return r0
    }

    public java.lang.String getEventCode() {
            r1 = this;
            java.lang.String r0 = r1.eventCode
            return r0
    }

    public long getInterval() {
            r2 = this;
            long r0 = r2.interval
            return r0
    }

    public void setComponentType(int r1) {
            r0 = this;
            r0.componentType = r1
            return
    }

    public void setCount(int r1) {
            r0 = this;
            r0.count = r1
            return
    }

    public void setEventCode(java.lang.String r1) {
            r0 = this;
            r0.eventCode = r1
            return
    }

    public void setInterval(long r1) {
            r0 = this;
            r0.interval = r1
            return
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "FreqItem{interval="
            r0.append(r1)
            long r1 = r3.interval
            r0.append(r1)
            java.lang.String r1 = ", count="
            r0.append(r1)
            int r1 = r3.count
            r0.append(r1)
            java.lang.String r1 = ", eventCode='"
            r0.append(r1)
            java.lang.String r1 = r3.eventCode
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r1 = ", componentType="
            r0.append(r1)
            int r1 = r3.componentType
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
