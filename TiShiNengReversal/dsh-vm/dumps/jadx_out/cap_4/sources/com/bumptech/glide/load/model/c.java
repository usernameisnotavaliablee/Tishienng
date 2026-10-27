package com.bumptech.glide.load.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class c implements com.bumptech.glide.load.a<java.nio.ByteBuffer> {
    private static final java.lang.String a = "ByteBufferEncoder";

    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bumptech.glide.load.a
    public /* bridge */ /* synthetic */ boolean a(@androidx.annotation.NonNull java.nio.ByteBuffer r1, @androidx.annotation.NonNull java.io.File r2, @androidx.annotation.NonNull com.bumptech.glide.load.f r3) {
            r0 = this;
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            boolean r1 = r0.c(r1, r2, r3)
            return r1
    }

    public boolean c(@androidx.annotation.NonNull java.nio.ByteBuffer r1, @androidx.annotation.NonNull java.io.File r2, @androidx.annotation.NonNull com.bumptech.glide.load.f r3) {
            r0 = this;
            com.bumptech.glide.util.a.e(r1, r2)     // Catch: java.io.IOException -> L5
            r1 = 1
            return r1
        L5:
            java.lang.String r1 = "ByteBufferEncoder"
            r2 = 3
            android.util.Log.isLoggable(r1, r2)
            r1 = 0
            return r1
    }
}
