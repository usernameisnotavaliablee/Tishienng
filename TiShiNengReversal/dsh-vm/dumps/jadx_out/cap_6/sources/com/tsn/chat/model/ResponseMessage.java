package com.tsn.chat.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ResponseMessage {
    private byte controlType;
    private java.lang.String datas;

    public ResponseMessage(byte r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.controlType = r1
            r0.datas = r2
            return
    }

    public byte getControlType() {
            r1 = this;
            byte r0 = r1.controlType
            return r0
    }

    public java.lang.String getDatas() {
            r1 = this;
            java.lang.String r0 = r1.datas
            return r0
    }

    public void setControlType(byte r1) {
            r0 = this;
            r0.controlType = r1
            return
    }

    public void setDatas(java.lang.String r1) {
            r0 = this;
            r0.datas = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ResponseMessage [controlType="
            r0.<init>(r1)
            byte r1 = r2.controlType
            r0.append(r1)
            java.lang.String r1 = ", datas="
            r0.append(r1)
            java.lang.String r1 = r2.datas
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
