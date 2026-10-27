package com.bumptech.glide.provider;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class f {
    private final java.util.List<com.bumptech.glide.provider.f.a<?>> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class a<T> {
        private final java.lang.Class<T> a;
        final com.bumptech.glide.load.h<T> b;

        a(@androidx.annotation.NonNull java.lang.Class<T> r1, @androidx.annotation.NonNull com.bumptech.glide.load.h<T> r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        boolean a(@androidx.annotation.NonNull java.lang.Class<?> r2) {
                r1 = this;
                java.lang.Class<T> r0 = r1.a
                boolean r2 = r0.isAssignableFrom(r2)
                return r2
        }
    }

    public f() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a = r0
            return
    }

    public synchronized <Z> void a(@androidx.annotation.NonNull java.lang.Class<Z> r3, @androidx.annotation.NonNull com.bumptech.glide.load.h<Z> r4) {
            r2 = this;
            monitor-enter(r2)
            java.util.List<com.bumptech.glide.provider.f$a<?>> r0 = r2.a     // Catch: java.lang.Throwable -> Ld
            com.bumptech.glide.provider.f$a r1 = new com.bumptech.glide.provider.f$a     // Catch: java.lang.Throwable -> Ld
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Ld
            r0.add(r1)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)
            return
        Ld:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            throw r3
    }

    @androidx.annotation.Nullable
    public synchronized <Z> com.bumptech.glide.load.h<Z> b(@androidx.annotation.NonNull java.lang.Class<Z> r5) {
            r4 = this;
            monitor-enter(r4)
            java.util.List<com.bumptech.glide.provider.f$a<?>> r0 = r4.a     // Catch: java.lang.Throwable -> L1c
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L1c
            r1 = 0
        L8:
            if (r1 >= r0) goto L21
            java.util.List<com.bumptech.glide.provider.f$a<?>> r2 = r4.a     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L1c
            com.bumptech.glide.provider.f$a r2 = (com.bumptech.glide.provider.f.a) r2     // Catch: java.lang.Throwable -> L1c
            boolean r3 = r2.a(r5)     // Catch: java.lang.Throwable -> L1c
            if (r3 == 0) goto L1e
            com.bumptech.glide.load.h<T> r5 = r2.b     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r4)
            return r5
        L1c:
            r5 = move-exception
            goto L24
        L1e:
            int r1 = r1 + 1
            goto L8
        L21:
            monitor-exit(r4)
            r5 = 0
            return r5
        L24:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1c
            throw r5
    }

    public synchronized <Z> void c(@androidx.annotation.NonNull java.lang.Class<Z> r3, @androidx.annotation.NonNull com.bumptech.glide.load.h<Z> r4) {
            r2 = this;
            monitor-enter(r2)
            java.util.List<com.bumptech.glide.provider.f$a<?>> r0 = r2.a     // Catch: java.lang.Throwable -> Le
            com.bumptech.glide.provider.f$a r1 = new com.bumptech.glide.provider.f$a     // Catch: java.lang.Throwable -> Le
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Le
            r3 = 0
            r0.add(r3, r1)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r2)
            return
        Le:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
            throw r3
    }
}
