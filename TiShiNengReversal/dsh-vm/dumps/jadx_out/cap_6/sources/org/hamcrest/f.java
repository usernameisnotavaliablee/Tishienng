package org.hamcrest;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class f<T> extends org.hamcrest.o<T> {
    private final java.lang.String c;

    public f(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L8
            r1.c = r2
            return
        L8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Description must be non null!"
            r2.<init>(r0)
            throw r2
    }

    @Override // org.hamcrest.l
    public final void describeTo(org.hamcrest.g r2) {
            r1 = this;
            java.lang.String r0 = r1.c
            r2.b(r0)
            return
    }
}
