package com.bumptech.glide.load.data;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class h extends com.bumptech.glide.load.data.b<android.os.ParcelFileDescriptor> {
    public h(android.content.res.AssetManager r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // com.bumptech.glide.load.data.d
    @androidx.annotation.NonNull
    public java.lang.Class<android.os.ParcelFileDescriptor> a() {
            r1 = this;
            java.lang.Class<android.os.ParcelFileDescriptor> r0 = android.os.ParcelFileDescriptor.class
            return r0
    }

    @Override // com.bumptech.glide.load.data.b
    protected /* bridge */ /* synthetic */ void d(android.os.ParcelFileDescriptor r1) throws java.io.IOException {
            r0 = this;
            android.os.ParcelFileDescriptor r1 = (android.os.ParcelFileDescriptor) r1
            r0.f(r1)
            return
    }

    @Override // com.bumptech.glide.load.data.b
    protected /* bridge */ /* synthetic */ android.os.ParcelFileDescriptor e(android.content.res.AssetManager r1, java.lang.String r2) throws java.io.IOException {
            r0 = this;
            android.os.ParcelFileDescriptor r1 = r0.g(r1, r2)
            return r1
    }

    protected void f(android.os.ParcelFileDescriptor r1) throws java.io.IOException {
            r0 = this;
            r1.close()
            return
    }

    protected android.os.ParcelFileDescriptor g(android.content.res.AssetManager r1, java.lang.String r2) throws java.io.IOException {
            r0 = this;
            android.content.res.AssetFileDescriptor r1 = r1.openFd(r2)
            android.os.ParcelFileDescriptor r1 = r1.getParcelFileDescriptor()
            return r1
    }
}
