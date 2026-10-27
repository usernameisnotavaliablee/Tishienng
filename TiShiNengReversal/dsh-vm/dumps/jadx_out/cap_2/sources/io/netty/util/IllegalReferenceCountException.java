package io.netty.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class IllegalReferenceCountException extends java.lang.IllegalStateException {
    private static final long serialVersionUID = -2507492394288153468L;

    public IllegalReferenceCountException() {
            r0 = this;
            r0.<init>()
            return
    }

    public IllegalReferenceCountException(int r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "refCnt: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            return
    }

    public IllegalReferenceCountException(int r3, int r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "refCnt: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = ", "
            r0.append(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            if (r4 <= 0) goto L26
            r3.<init>()
            java.lang.String r1 = "increment: "
            r3.append(r1)
        L1e:
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            goto L30
        L26:
            r3.<init>()
            java.lang.String r1 = "decrement: "
            r3.append(r1)
            int r4 = -r4
            goto L1e
        L30:
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            return
    }

    public IllegalReferenceCountException(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public IllegalReferenceCountException(java.lang.String r1, java.lang.Throwable r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public IllegalReferenceCountException(java.lang.Throwable r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }
}
