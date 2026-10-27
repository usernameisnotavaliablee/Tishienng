package xyz.adscope.amps.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSError {
    private java.lang.String code;
    private java.lang.String message;

    public AMPSError(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.code = r1
            r0.message = r2
            return
    }

    public java.lang.String getCode() {
            r1 = this;
            java.lang.String r0 = r1.code
            return r0
    }

    public java.lang.String getMessage() {
            r1 = this;
            java.lang.String r0 = r1.message
            return r0
    }

    public void setCode(java.lang.String r1) {
            r0 = this;
            r0.code = r1
            return
    }

    public void setMessage(java.lang.String r1) {
            r0 = this;
            r0.message = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "{\"code\":\""
            r0.append(r1)
            java.lang.String r1 = r2.code
            r0.append(r1)
            java.lang.String r1 = "\", \"message\":\""
            r0.append(r1)
            java.lang.String r1 = r2.message
            r0.append(r1)
            java.lang.String r1 = "\""
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
