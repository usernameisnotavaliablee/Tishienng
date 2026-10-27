package org.apache.commons.net.io;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class CopyStreamException extends java.io.IOException {
    private static final long serialVersionUID = -2602899129433221532L;
    private final long totalBytesTransferred;

    public CopyStreamException(java.lang.String r1, long r2, java.io.IOException r4) {
            r0 = this;
            r0.<init>(r1)
            r0.initCause(r4)
            r0.totalBytesTransferred = r2
            return
    }

    public java.io.IOException getIOException() {
            r1 = this;
            java.lang.Throwable r0 = r1.getCause()
            java.io.IOException r0 = (java.io.IOException) r0
            return r0
    }

    public long getTotalBytesTransferred() {
            r2 = this;
            long r0 = r2.totalBytesTransferred
            return r0
    }
}
