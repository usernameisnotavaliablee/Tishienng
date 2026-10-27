package com.tsn.chat.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class RequestMessage {
    private byte controlType;
    private java.lang.String datas;
    private byte header;
    private int length;

    public RequestMessage() {
            r0 = this;
            r0.<init>()
            return
    }

    public RequestMessage(int r2, byte r3, java.lang.String r4) {
            r1 = this;
            r1.<init>()
            r0 = -2
            r1.header = r0
            r1.length = r2
            r1.controlType = r3
            r1.datas = r4
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

    public byte getHeader() {
            r1 = this;
            byte r0 = r1.header
            return r0
    }

    public int getLength() {
            r1 = this;
            int r0 = r1.length
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

    public void setHeader(byte r1) {
            r0 = this;
            r0.header = r1
            return
    }

    public void setLength(int r1) {
            r0 = this;
            r0.length = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RequestMessage [header="
            r0.<init>(r1)
            byte r1 = r2.header
            r0.append(r1)
            java.lang.String r1 = ", length="
            r0.append(r1)
            int r1 = r2.length
            r0.append(r1)
            java.lang.String r1 = ", controlType="
            r0.append(r1)
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
