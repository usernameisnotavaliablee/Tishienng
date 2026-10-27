package com.bumptech.glide.load.data;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface d<T> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a<T> {
        void d(@androidx.annotation.Nullable T r1);

        void e(@androidx.annotation.NonNull java.lang.Exception r1);
    }

    @androidx.annotation.NonNull
    java.lang.Class<T> a();

    void b();

    void c(@androidx.annotation.NonNull com.bumptech.glide.Priority r1, @androidx.annotation.NonNull com.bumptech.glide.load.data.d.a<? super T> r2);

    void cancel();

    @androidx.annotation.NonNull
    com.bumptech.glide.load.DataSource getDataSource();
}
