package com.autonavi.base.amap.mapcore;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class LinkInfo {
    private int length;
    private int state;
    private int time;

    public LinkInfo() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.state = r0
            r1.time = r0
            r1.length = r0
            return
    }

    public int getLength() {
            r1 = this;
            int r0 = r1.length
            return r0
    }

    public int getState() {
            r1 = this;
            int r0 = r1.state
            return r0
    }

    public int getTime() {
            r1 = this;
            int r0 = r1.time
            return r0
    }

    public void setLength(int r1) {
            r0 = this;
            r0.length = r1
            return
    }

    public void setState(int r1) {
            r0 = this;
            r0.state = r1
            return
    }

    public void setTime(int r1) {
            r0 = this;
            r0.time = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "状态："
            r0.append(r1)
            int r1 = r3.state
            r0.append(r1)
            java.lang.String r1 = "|"
            r0.append(r1)
            java.lang.String r2 = "时间："
            r0.append(r2)
            int r2 = r3.time
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = "长度："
            r0.append(r1)
            int r1 = r3.length
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
