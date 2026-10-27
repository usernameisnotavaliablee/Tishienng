package com.sun.mail.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class BEncoderStream extends com.sun.mail.util.BASE64EncoderStream {
    public BEncoderStream(java.io.OutputStream r2) {
            r1 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.<init>(r2, r0)
            return
    }

    public static int encodedLength(byte[] r0) {
            int r0 = r0.length
            int r0 = r0 + 2
            int r0 = r0 / 3
            int r0 = r0 * 4
            return r0
    }
}
