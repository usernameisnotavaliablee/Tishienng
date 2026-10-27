package com.beizi.fusion.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ChannelBidResult {
    private java.lang.String bidType;
    private java.lang.String channelName;
    private double ecpm;
    private int reason;

    public ChannelBidResult() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.lang.String getBidType() {
            r1 = this;
            java.lang.String r0 = r1.bidType
            return r0
    }

    public java.lang.String getChannelName() {
            r1 = this;
            java.lang.String r0 = r1.channelName
            return r0
    }

    public double getEcpm() {
            r2 = this;
            double r0 = r2.ecpm
            return r0
    }

    public int getReason() {
            r1 = this;
            int r0 = r1.reason
            return r0
    }

    public void setBidType(java.lang.String r1) {
            r0 = this;
            r0.bidType = r1
            return
    }

    public void setChannelName(java.lang.String r1) {
            r0 = this;
            r0.channelName = r1
            return
    }

    public void setEcpm(double r1) {
            r0 = this;
            r0.ecpm = r1
            return
    }

    public void setReason(int r1) {
            r0 = this;
            r0.reason = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ChannelBidResult{ecpm="
            r0.append(r1)
            double r1 = r3.ecpm
            r0.append(r1)
            java.lang.String r1 = ", channelName='"
            r0.append(r1)
            java.lang.String r1 = r3.channelName
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r2 = ", bidType='"
            r0.append(r2)
            java.lang.String r2 = r3.bidType
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = ", reason="
            r0.append(r1)
            int r1 = r3.reason
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
