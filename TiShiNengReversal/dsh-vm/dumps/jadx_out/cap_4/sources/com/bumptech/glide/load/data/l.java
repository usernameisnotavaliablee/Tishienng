package com.bumptech.glide.load.data;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class l<T> implements com.bumptech.glide.load.data.d<T> {
    private static final java.lang.String d = "LocalUriFetcher";
    private final android.net.Uri a;
    private final android.content.ContentResolver b;
    private T c;

    public l(android.content.ContentResolver r1, android.net.Uri r2) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.a = r2
            return
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
            r1 = this;
            T r0 = r1.c
            if (r0 == 0) goto L7
            r1.d(r0)     // Catch: java.io.IOException -> L7
        L7:
            return
    }

    @Override // com.bumptech.glide.load.data.d
    public final void c(@androidx.annotation.NonNull com.bumptech.glide.Priority r3, @androidx.annotation.NonNull com.bumptech.glide.load.data.d.a<? super T> r4) {
            r2 = this;
            android.net.Uri r3 = r2.a     // Catch: java.io.FileNotFoundException -> Le
            android.content.ContentResolver r0 = r2.b     // Catch: java.io.FileNotFoundException -> Le
            java.lang.Object r3 = r2.e(r3, r0)     // Catch: java.io.FileNotFoundException -> Le
            r2.c = r3     // Catch: java.io.FileNotFoundException -> Le
            r4.d(r3)     // Catch: java.io.FileNotFoundException -> Le
            return
        Le:
            r3 = move-exception
            java.lang.String r0 = "LocalUriFetcher"
            r1 = 3
            android.util.Log.isLoggable(r0, r1)
            r4.e(r3)
            return
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
            r0 = this;
            return
    }

    protected abstract void d(T r1) throws java.io.IOException;

    protected abstract T e(android.net.Uri r1, android.content.ContentResolver r2) throws java.io.FileNotFoundException;

    @Override // com.bumptech.glide.load.data.d
    @androidx.annotation.NonNull
    public com.bumptech.glide.load.DataSource getDataSource() {
            r1 = this;
            com.bumptech.glide.load.DataSource r0 = com.bumptech.glide.load.DataSource.LOCAL
            return r0
    }
}
