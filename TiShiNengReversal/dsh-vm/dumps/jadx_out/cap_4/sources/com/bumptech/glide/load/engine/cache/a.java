package com.bumptech.glide.load.engine.cache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface a {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.bumptech.glide.load.engine.cache.a$a, reason: collision with other inner class name */
    public interface InterfaceC0019a {
        public static final int a = 262144000;
        public static final java.lang.String b = "image_manager_disk_cache";

        @androidx.annotation.Nullable
        com.bumptech.glide.load.engine.cache.a build();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        boolean a(@androidx.annotation.NonNull java.io.File r1);
    }

    void a(com.bumptech.glide.load.c r1, com.bumptech.glide.load.engine.cache.a.b r2);

    @androidx.annotation.Nullable
    java.io.File b(com.bumptech.glide.load.c r1);

    void clear();

    void delete(com.bumptech.glide.load.c r1);
}
