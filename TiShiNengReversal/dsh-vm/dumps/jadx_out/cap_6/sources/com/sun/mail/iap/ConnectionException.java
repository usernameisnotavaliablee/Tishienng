package com.sun.mail.iap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ConnectionException extends com.sun.mail.iap.ProtocolException {
    private static final long serialVersionUID = 5749739604257464727L;
    private transient com.sun.mail.iap.f p;

    public ConnectionException() {
            r0 = this;
            r0.<init>()
            return
    }

    public ConnectionException(com.sun.mail.iap.f r1, com.sun.mail.iap.g r2) {
            r0 = this;
            r0.<init>(r2)
            r0.p = r1
            return
    }

    public ConnectionException(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public com.sun.mail.iap.f getProtocol() {
            r1 = this;
            com.sun.mail.iap.f r0 = r1.p
            return r0
    }
}
