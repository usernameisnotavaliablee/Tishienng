package io.netty.handler.codec;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class UnsupportedMessageTypeException extends io.netty.handler.codec.CodecException {
    private static final long serialVersionUID = 2799598826487038726L;

    public UnsupportedMessageTypeException() {
            r0 = this;
            r0.<init>()
            return
    }

    public UnsupportedMessageTypeException(java.lang.Object r1, java.lang.Class<?>... r2) {
            r0 = this;
            if (r1 != 0) goto L5
            java.lang.String r1 = "null"
            goto Ld
        L5:
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
        Ld:
            java.lang.String r1 = message(r1, r2)
            r0.<init>(r1)
            return
    }

    public UnsupportedMessageTypeException(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public UnsupportedMessageTypeException(java.lang.String r1, java.lang.Throwable r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public UnsupportedMessageTypeException(java.lang.Throwable r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private static java.lang.String message(java.lang.String r3, java.lang.Class<?>... r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            if (r4 == 0) goto L36
            int r3 = r4.length
            if (r3 <= 0) goto L36
            java.lang.String r3 = " (expected: "
            r0.append(r3)
            r3 = 0
            r3 = r4[r3]
            java.lang.String r3 = r3.getName()
            r0.append(r3)
            r3 = 1
        L1a:
            int r1 = r4.length
            if (r3 >= r1) goto L31
            r1 = r4[r3]
            if (r1 != 0) goto L22
            goto L31
        L22:
            java.lang.String r2 = ", "
            r0.append(r2)
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            int r3 = r3 + 1
            goto L1a
        L31:
            r3 = 41
            r0.append(r3)
        L36:
            java.lang.String r3 = r0.toString()
            return r3
    }
}
