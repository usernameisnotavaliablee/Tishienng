package com.bumptech.glide.load.data;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class m extends com.bumptech.glide.load.data.b<java.io.InputStream> {
    public m(android.content.res.AssetManager r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // com.bumptech.glide.load.data.d
    @androidx.annotation.NonNull
    public java.lang.Class<java.io.InputStream> a() {
            r1 = this;
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
            return r0
    }

    @Override // com.bumptech.glide.load.data.b
    protected /* bridge */ /* synthetic */ void d(java.io.InputStream r1) throws java.io.IOException {
            r0 = this;
            java.io.InputStream r1 = (java.io.InputStream) r1
            r0.f(r1)
            return
    }

    @Override // com.bumptech.glide.load.data.b
    protected /* bridge */ /* synthetic */ java.io.InputStream e(android.content.res.AssetManager r1, java.lang.String r2) throws java.io.IOException {
            r0 = this;
            java.io.InputStream r1 = r0.g(r1, r2)
            return r1
    }

    protected void f(java.io.InputStream r1) throws java.io.IOException {
            r0 = this;
            r1.close()
            return
    }

    protected java.io.InputStream g(android.content.res.AssetManager r1, java.lang.String r2) throws java.io.IOException {
            r0 = this;
            java.io.InputStream r1 = r1.open(r2)
            return r1
    }
}
