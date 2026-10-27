package com.qq.e.mediation.interfaces;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public interface IBaseAd {
    int getECPM();

    java.util.Map<java.lang.String, java.lang.Object> getExtraInfo();

    java.lang.String getReqId();

    void sendLossNotification(int r1, int r2, java.lang.String r3);

    void sendWinNotification(int r1);

    void setBidECPM(int r1);

    void setPayload(java.lang.String r1);
}
