package com.bumptech.glide.load.data;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class i extends com.bumptech.glide.load.data.l<android.os.ParcelFileDescriptor> {
    public i(android.content.ContentResolver r1, android.net.Uri r2) {
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

    @Override // com.bumptech.glide.load.data.l
    protected /* bridge */ /* synthetic */ void d(android.os.ParcelFileDescriptor r1) throws java.io.IOException {
            r0 = this;
            android.os.ParcelFileDescriptor r1 = (android.os.ParcelFileDescriptor) r1
            r0.f(r1)
            return
    }

    @Override // com.bumptech.glide.load.data.l
    protected /* bridge */ /* synthetic */ android.os.ParcelFileDescriptor e(android.net.Uri r1, android.content.ContentResolver r2) throws java.io.FileNotFoundException {
            r0 = this;
            android.os.ParcelFileDescriptor r1 = r0.g(r1, r2)
            return r1
    }

    protected void f(android.os.ParcelFileDescriptor r1) throws java.io.IOException {
            r0 = this;
            r1.close()
            return
    }

    protected android.os.ParcelFileDescriptor g(android.net.Uri r3, android.content.ContentResolver r4) throws java.io.FileNotFoundException {
            r2 = this;
            java.lang.String r0 = "r"
            android.content.res.AssetFileDescriptor r4 = r4.openAssetFileDescriptor(r3, r0)
            if (r4 == 0) goto Ld
            android.os.ParcelFileDescriptor r3 = r4.getParcelFileDescriptor()
            return r3
        Ld:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "FileDescriptor is null for: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }
}
