package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class MultiValueSet<C> {
    private java.util.Set<C> mSet;

    public MultiValueSet() {
            r1 = this;
            r1.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.mSet = r0
            return
    }

    public void addAll(@androidx.annotation.NonNull java.util.List<C> r2) {
            r1 = this;
            java.util.Set<C> r0 = r1.mSet
            r0.addAll(r2)
            return
    }

    @androidx.annotation.NonNull
    public abstract androidx.camera.core.impl.MultiValueSet<C> clone();

    @androidx.annotation.NonNull
    /* renamed from: clone */
    public /* bridge */ /* synthetic */ java.lang.Object mo13clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            androidx.camera.core.impl.MultiValueSet r0 = r1.clone()
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.List<C> getAllItems() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Set<C> r1 = r2.mSet
            r0.<init>(r1)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }
}
