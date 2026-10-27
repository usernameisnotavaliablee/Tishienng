package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class k1<T> extends com.acse.ottn.k3<T, java.lang.Float> {
    public k1(java.lang.String r2) {
            r1 = this;
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            r1.<init>(r0, r2)
            return
    }

    public abstract void a(T r1, float r2);

    /* renamed from: a, reason: avoid collision after fix types in other method */
    public final void a2(T r1, java.lang.Float r2) {
            r0 = this;
            float r2 = r2.floatValue()
            r0.a(r1, r2)
            return
    }

    @Override // com.acse.ottn.k3
    public /* bridge */ /* synthetic */ void a(java.lang.Object r1, java.lang.Float r2) {
            r0 = this;
            java.lang.Float r2 = (java.lang.Float) r2
            r0.a2(r1, r2)
            return
    }
}
