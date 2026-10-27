package xyz.adscope.amps.model.config.request;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSExtModel {
    private int isLogReq;

    public AMPSExtModel() {
            r0 = this;
            r0.<init>()
            return
    }

    public int getIsLogReq() {
            r1 = this;
            int r0 = r1.isLogReq
            return r0
    }

    public void setIsLogReq(int r1) {
            r0 = this;
            r0.isLogReq = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "{\"isLogReq\":"
            r0.append(r1)
            int r1 = r2.isLogReq
            r0.append(r1)
            java.lang.String r1 = "} "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
