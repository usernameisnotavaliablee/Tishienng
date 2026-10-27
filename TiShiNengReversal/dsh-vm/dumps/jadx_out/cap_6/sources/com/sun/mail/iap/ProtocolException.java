package com.sun.mail.iap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ProtocolException extends java.lang.Exception {
    private static final long serialVersionUID = -4360500807971797439L;
    protected transient com.sun.mail.iap.g response;

    public ProtocolException() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.response = r0
            return
    }

    public ProtocolException(com.sun.mail.iap.g r2) {
            r1 = this;
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            r1.response = r2
            return
    }

    public ProtocolException(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.response = r1
            return
    }

    public com.sun.mail.iap.g getResponse() {
            r1 = this;
            com.sun.mail.iap.g r0 = r1.response
            return r0
    }
}
