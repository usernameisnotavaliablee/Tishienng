package com.bumptech.glide.provider;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class b {
    private final java.util.List<com.bumptech.glide.load.ImageHeaderParser> a;

    public b() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a = r0
            return
    }

    public synchronized void a(@androidx.annotation.NonNull com.bumptech.glide.load.ImageHeaderParser r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r1.a     // Catch: java.lang.Throwable -> L8
            r0.add(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r2
    }

    @androidx.annotation.NonNull
    public synchronized java.util.List<com.bumptech.glide.load.ImageHeaderParser> b() {
            r1 = this;
            monitor-enter(r1)
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r1.a     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }
}
