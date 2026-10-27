package com.bumptech.glide.provider;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class a {
    private final java.util.List<com.bumptech.glide.provider.a.C0033a<?>> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.bumptech.glide.provider.a$a, reason: collision with other inner class name */
    private static final class C0033a<T> {
        private final java.lang.Class<T> a;
        final com.bumptech.glide.load.a<T> b;

        C0033a(@androidx.annotation.NonNull java.lang.Class<T> r1, @androidx.annotation.NonNull com.bumptech.glide.load.a<T> r2) {
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

    public a() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a = r0
            return
    }

    public synchronized <T> void a(@androidx.annotation.NonNull java.lang.Class<T> r3, @androidx.annotation.NonNull com.bumptech.glide.load.a<T> r4) {
            r2 = this;
            monitor-enter(r2)
            java.util.List<com.bumptech.glide.provider.a$a<?>> r0 = r2.a     // Catch: java.lang.Throwable -> Ld
            com.bumptech.glide.provider.a$a r1 = new com.bumptech.glide.provider.a$a     // Catch: java.lang.Throwable -> Ld
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
    public synchronized <T> com.bumptech.glide.load.a<T> b(@androidx.annotation.NonNull java.lang.Class<T> r4) {
            r3 = this;
            monitor-enter(r3)
            java.util.List<com.bumptech.glide.provider.a$a<?>> r0 = r3.a     // Catch: java.lang.Throwable -> L1d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1d
        L7:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L1d
            com.bumptech.glide.provider.a$a r1 = (com.bumptech.glide.provider.a.C0033a) r1     // Catch: java.lang.Throwable -> L1d
            boolean r2 = r1.a(r4)     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L7
            com.bumptech.glide.load.a<T> r4 = r1.b     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)
            return r4
        L1d:
            r4 = move-exception
            goto L22
        L1f:
            monitor-exit(r3)
            r4 = 0
            return r4
        L22:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            throw r4
    }

    public synchronized <T> void c(@androidx.annotation.NonNull java.lang.Class<T> r3, @androidx.annotation.NonNull com.bumptech.glide.load.a<T> r4) {
            r2 = this;
            monitor-enter(r2)
            java.util.List<com.bumptech.glide.provider.a$a<?>> r0 = r2.a     // Catch: java.lang.Throwable -> Le
            com.bumptech.glide.provider.a$a r1 = new com.bumptech.glide.provider.a$a     // Catch: java.lang.Throwable -> Le
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
