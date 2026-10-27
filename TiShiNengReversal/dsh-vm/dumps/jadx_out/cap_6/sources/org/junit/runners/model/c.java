package org.junit.runners.model;

import org.junit.runners.model.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class c<T extends org.junit.runners.model.c<T>> implements org.junit.runners.model.a {
    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract java.lang.Class<?> a();

    protected abstract int b();

    public abstract java.lang.String c();

    public boolean d() {
            r1 = this;
            int r0 = r1.b()
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
            return r0
    }

    boolean e(java.util.List<T> r2) {
            r1 = this;
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r2.next()
            org.junit.runners.model.c r0 = (org.junit.runners.model.c) r0
            boolean r0 = r1.f(r0)
            if (r0 == 0) goto L4
            r2 = 1
            return r2
        L18:
            r2 = 0
            return r2
    }

    abstract boolean f(T r1);

    public boolean g() {
            r1 = this;
            int r0 = r1.b()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            return r0
    }

    public abstract java.lang.Class<?> getType();
}
