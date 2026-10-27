package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class k3<T, V> {
    public final java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Class<V> f2430b;

    public k3(java.lang.Class<V> r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.a = r2
            r0.f2430b = r1
            return
    }

    public static <T, V> com.acse.ottn.k3<T, V> a(java.lang.Class<T> r1, java.lang.Class<V> r2, java.lang.String r3) {
            com.acse.ottn.p3 r0 = new com.acse.ottn.p3
            r0.<init>(r1, r2, r3)
            return r0
    }

    public abstract V a(T r1);

    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public void a(T r2, V r3) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Property "
            r3.append(r0)
            java.lang.String r0 = r1.a()
            r3.append(r0)
            java.lang.String r0 = " is read-only"
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    public java.lang.Class<V> b() {
            r1 = this;
            java.lang.Class<V> r0 = r1.f2430b
            return r0
    }

    public boolean c() {
            r1 = this;
            r0 = 0
            return r0
    }
}
