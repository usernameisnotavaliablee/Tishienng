package org.hamcrest.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class c<T> implements org.hamcrest.l {
    private T a;

    public c(T r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // org.hamcrest.l
    public void describeTo(org.hamcrest.g r2) {
            r1 = this;
            T r0 = r1.a
            r2.c(r0)
            return
    }
}
