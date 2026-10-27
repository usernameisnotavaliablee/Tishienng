package org.apache.commons.net.ftp.parser;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ParserInitializationException extends java.lang.RuntimeException {
    private static final long serialVersionUID = 5563335279583210658L;

    public ParserInitializationException(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public ParserInitializationException(java.lang.String r1, java.lang.Throwable r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @java.lang.Deprecated
    public java.lang.Throwable getRootCause() {
            r1 = this;
            java.lang.Throwable r0 = super.getCause()
            return r0
    }
}
