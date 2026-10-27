package com.bumptech.glide.load.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class t implements com.bumptech.glide.load.a<java.io.InputStream> {
    private static final java.lang.String b = "StreamEncoder";
    private final com.bumptech.glide.load.engine.bitmap_recycle.b a;

    public t(com.bumptech.glide.load.engine.bitmap_recycle.b r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // com.bumptech.glide.load.a
    public /* bridge */ /* synthetic */ boolean a(@androidx.annotation.NonNull java.io.InputStream r1, @androidx.annotation.NonNull java.io.File r2, @androidx.annotation.NonNull com.bumptech.glide.load.f r3) {
            r0 = this;
            java.io.InputStream r1 = (java.io.InputStream) r1
            boolean r1 = r0.c(r1, r2, r3)
            return r1
    }

    public boolean c(@androidx.annotation.NonNull java.io.InputStream r4, @androidx.annotation.NonNull java.io.File r5, @androidx.annotation.NonNull com.bumptech.glide.load.f r6) {
            r3 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.b r6 = r3.a
            r0 = 65536(0x10000, float:9.1835E-41)
            java.lang.Class<byte[]> r1 = byte[].class
            java.lang.Object r6 = r6.c(r0, r1)
            byte[] r6 = (byte[]) r6
            r0 = 0
            r1 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L32
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L32
        L13:
            int r5 = r4.read(r6)     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L21
            r1 = -1
            if (r5 == r1) goto L23
            r2.write(r6, r0, r5)     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L21
            goto L13
        L1e:
            r4 = move-exception
            r1 = r2
            goto L43
        L21:
            r1 = r2
            goto L32
        L23:
            r2.close()     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L21
            r2.close()     // Catch: java.io.IOException -> L29
        L29:
            com.bumptech.glide.load.engine.bitmap_recycle.b r4 = r3.a
            r4.put(r6)
            r0 = 1
            goto L42
        L30:
            r4 = move-exception
            goto L43
        L32:
            java.lang.String r4 = "StreamEncoder"
            r5 = 3
            android.util.Log.isLoggable(r4, r5)     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L3d
            r1.close()     // Catch: java.io.IOException -> L3d
        L3d:
            com.bumptech.glide.load.engine.bitmap_recycle.b r4 = r3.a
            r4.put(r6)
        L42:
            return r0
        L43:
            if (r1 == 0) goto L48
            r1.close()     // Catch: java.io.IOException -> L48
        L48:
            com.bumptech.glide.load.engine.bitmap_recycle.b r5 = r3.a
            r5.put(r6)
            throw r4
    }
}
