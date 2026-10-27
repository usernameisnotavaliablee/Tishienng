package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class z1<T> extends com.acse.ottn.k3<T, java.lang.Integer> {
    public z1(java.lang.String r2) {
            r1 = this;
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            r1.<init>(r0, r2)
            return
    }

    public abstract void a(T r1, int r2);

    /* renamed from: a, reason: avoid collision after fix types in other method */
    public final void a2(T r1, java.lang.Integer r2) {
            r0 = this;
            r2.intValue()
            r0.a2(r1, r2)
            return
    }

    @Override // com.acse.ottn.k3
    public /* bridge */ /* synthetic */ void a(java.lang.Object r1, java.lang.Integer r2) {
            r0 = this;
            java.lang.Integer r2 = (java.lang.Integer) r2
            r0.a2(r1, r2)
            return
    }
}
