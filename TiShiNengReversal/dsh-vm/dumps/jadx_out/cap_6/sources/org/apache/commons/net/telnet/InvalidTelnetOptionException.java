package org.apache.commons.net.telnet;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class InvalidTelnetOptionException extends java.lang.Exception {
    private static final long serialVersionUID = -2516777155928793597L;
    private final java.lang.String msg;
    private final int optionCode;

    public InvalidTelnetOptionException(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.optionCode = r2
            r0.msg = r1
            return
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.msg
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            int r1 = r2.optionCode
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
