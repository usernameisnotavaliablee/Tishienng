package com.acse.ottn.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ShowWindowModel {
    private java.lang.String appName;
    private long shawWindowTime;
    private java.lang.String showBigWindowData;
    private int showSmailWindowSize;

    public ShowWindowModel() {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = ""
            r2.appName = r0
            r2.showBigWindowData = r0
            r0 = 0
            r2.showSmailWindowSize = r0
            r0 = 0
            r2.shawWindowTime = r0
            return
    }

    public java.lang.String getAppName() {
            r1 = this;
            java.lang.String r0 = r1.appName
            return r0
    }

    public long getShawWindowTime() {
            r2 = this;
            long r0 = r2.shawWindowTime
            return r0
    }

    public java.lang.String getShowBigWindowData() {
            r1 = this;
            java.lang.String r0 = r1.showBigWindowData
            return r0
    }

    public int getShowSmailWindowSize() {
            r1 = this;
            int r0 = r1.showSmailWindowSize
            return r0
    }

    public void setAppName(java.lang.String r1) {
            r0 = this;
            r0.appName = r1
            return
    }

    public void setShawWindowTime(long r1) {
            r0 = this;
            r0.shawWindowTime = r1
            return
    }

    public void setShowBigWindowData(java.lang.String r1) {
            r0 = this;
            r0.showBigWindowData = r1
            return
    }

    public void setShowSmailWindowSize(int r1) {
            r0 = this;
            r0.showSmailWindowSize = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ShowWindowModel{appName='"
            r0.append(r1)
            java.lang.String r1 = r3.appName
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r2 = ", showBigWindowData='"
            r0.append(r2)
            java.lang.String r2 = r3.showBigWindowData
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = ", showSmailWindowSize="
            r0.append(r1)
            int r1 = r3.showSmailWindowSize
            r0.append(r1)
            java.lang.String r1 = ", shawWindowTime="
            r0.append(r1)
            long r1 = r3.shawWindowTime
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
