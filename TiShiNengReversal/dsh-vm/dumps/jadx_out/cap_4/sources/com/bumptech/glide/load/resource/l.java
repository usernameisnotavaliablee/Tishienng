package com.bumptech.glide.load.resource;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class l<T> implements com.bumptech.glide.load.engine.u<T> {
    protected final T a;

    public l(@androidx.annotation.NonNull T r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.bumptech.glide.util.k.d(r1)
            r0.a = r1
            return
    }

    @Override // com.bumptech.glide.load.engine.u
    @androidx.annotation.NonNull
    public java.lang.Class<T> a() {
            r1 = this;
            T r0 = r1.a
            java.lang.Class r0 = r0.getClass()
            return r0
    }

    @Override // com.bumptech.glide.load.engine.u
    @androidx.annotation.NonNull
    public final T get() {
            r1 = this;
            T r0 = r1.a
            return r0
    }

    @Override // com.bumptech.glide.load.engine.u
    public final int getSize() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.bumptech.glide.load.engine.u
    public void recycle() {
            r0 = this;
            return
    }
}
