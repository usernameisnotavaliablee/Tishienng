package com.bumptech.glide.load.engine;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class e<DataType> implements com.bumptech.glide.load.engine.cache.a.b {
    private final com.bumptech.glide.load.a<DataType> a;
    private final DataType b;
    private final com.bumptech.glide.load.f c;

    e(com.bumptech.glide.load.a<DataType> r1, DataType r2, com.bumptech.glide.load.f r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    @Override // com.bumptech.glide.load.engine.cache.a.b
    public boolean a(@androidx.annotation.NonNull java.io.File r4) {
            r3 = this;
            com.bumptech.glide.load.a<DataType> r0 = r3.a
            DataType r1 = r3.b
            com.bumptech.glide.load.f r2 = r3.c
            boolean r4 = r0.a(r1, r4, r2)
            return r4
    }
}
