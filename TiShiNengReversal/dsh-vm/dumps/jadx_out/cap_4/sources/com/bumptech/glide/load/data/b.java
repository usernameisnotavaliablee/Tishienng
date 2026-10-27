package com.bumptech.glide.load.data;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class b<T> implements com.bumptech.glide.load.data.d<T> {
    private static final java.lang.String d = "AssetPathFetcher";
    private final java.lang.String a;
    private final android.content.res.AssetManager b;
    private T c;

    public b(android.content.res.AssetManager r1, java.lang.String r2) {
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
            if (r0 != 0) goto L5
            goto L8
        L5:
            r1.d(r0)     // Catch: java.io.IOException -> L8
        L8:
            return
    }

    @Override // com.bumptech.glide.load.data.d
    public void c(@androidx.annotation.NonNull com.bumptech.glide.Priority r3, @androidx.annotation.NonNull com.bumptech.glide.load.data.d.a<? super T> r4) {
            r2 = this;
            android.content.res.AssetManager r3 = r2.b     // Catch: java.io.IOException -> Le
            java.lang.String r0 = r2.a     // Catch: java.io.IOException -> Le
            java.lang.Object r3 = r2.e(r3, r0)     // Catch: java.io.IOException -> Le
            r2.c = r3     // Catch: java.io.IOException -> Le
            r4.d(r3)     // Catch: java.io.IOException -> Le
            return
        Le:
            r3 = move-exception
            java.lang.String r0 = "AssetPathFetcher"
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

    protected abstract T e(android.content.res.AssetManager r1, java.lang.String r2) throws java.io.IOException;

    @Override // com.bumptech.glide.load.data.d
    @androidx.annotation.NonNull
    public com.bumptech.glide.load.DataSource getDataSource() {
            r1 = this;
            com.bumptech.glide.load.DataSource r0 = com.bumptech.glide.load.DataSource.LOCAL
            return r0
    }
}
