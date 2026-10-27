package org.junit.internal.runners.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class b {
    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.lang.Object a() throws java.lang.Throwable {
            r1 = this;
            java.lang.Object r0 = r1.b()     // Catch: java.lang.reflect.InvocationTargetException -> L5
            return r0
        L5:
            r0 = move-exception
            java.lang.Throwable r0 = r0.getTargetException()
            throw r0
    }

    protected abstract java.lang.Object b() throws java.lang.Throwable;
}
