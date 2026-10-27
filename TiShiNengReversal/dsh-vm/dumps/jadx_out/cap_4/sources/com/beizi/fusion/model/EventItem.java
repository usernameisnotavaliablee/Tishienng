package com.beizi.fusion.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class EventItem {
    private java.lang.String channel;
    private java.lang.String code;
    private java.lang.String spaceId;
    private java.lang.String timeStamp;

    public EventItem() {
            r0 = this;
            r0.<init>()
            return
    }

    public EventItem(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.code = r1
            r0.timeStamp = r2
            r0.channel = r3
            r0.spaceId = r4
            return
    }

    public java.lang.String getChannel() {
            r1 = this;
            java.lang.String r0 = r1.channel
            return r0
    }

    public java.lang.String getCode() {
            r1 = this;
            java.lang.String r0 = r1.code
            return r0
    }

    public java.lang.String getSpaceId() {
            r1 = this;
            java.lang.String r0 = r1.spaceId
            return r0
    }

    public java.lang.String getTimeStamp() {
            r1 = this;
            java.lang.String r0 = r1.timeStamp
            return r0
    }

    public void setChannel(java.lang.String r1) {
            r0 = this;
            r0.channel = r1
            return
    }

    public void setCode(java.lang.String r1) {
            r0 = this;
            r0.code = r1
            return
    }

    public void setSpaceId(java.lang.String r1) {
            r0 = this;
            r0.spaceId = r1
            return
    }

    public void setTimeStamp(java.lang.String r1) {
            r0 = this;
            r0.timeStamp = r1
            return
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "EventItem{code='"
            r0.append(r1)
            java.lang.String r1 = r3.code
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r2 = ", timeStamp='"
            r0.append(r2)
            java.lang.String r2 = r3.timeStamp
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", channel='"
            r0.append(r2)
            java.lang.String r2 = r3.channel
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", spaceId='"
            r0.append(r2)
            java.lang.String r2 = r3.spaceId
            r0.append(r2)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
