package com.sun.mail.pop3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class h extends java.io.ByteArrayOutputStream {
    public h(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public java.io.InputStream a() {
            r4 = this;
            javax.mail.util.SharedByteArrayInputStream r0 = new javax.mail.util.SharedByteArrayInputStream
            byte[] r1 = r4.buf
            r2 = 0
            int r3 = r4.count
            r0.<init>(r1, r2, r3)
            return r0
    }
}
