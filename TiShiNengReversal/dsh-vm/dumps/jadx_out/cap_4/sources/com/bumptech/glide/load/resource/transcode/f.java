package com.bumptech.glide.load.resource.transcode;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class f {
    private final java.util.List<com.bumptech.glide.load.resource.transcode.f.a<?, ?>> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class a<Z, R> {
        private final java.lang.Class<Z> a;
        private final java.lang.Class<R> b;
        final com.bumptech.glide.load.resource.transcode.e<Z, R> c;

        a(@androidx.annotation.NonNull java.lang.Class<Z> r1, @androidx.annotation.NonNull java.lang.Class<R> r2, @androidx.annotation.NonNull com.bumptech.glide.load.resource.transcode.e<Z, R> r3) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r3
                return
        }

        public boolean a(@androidx.annotation.NonNull java.lang.Class<?> r2, @androidx.annotation.NonNull java.lang.Class<?> r3) {
                r1 = this;
                java.lang.Class<Z> r0 = r1.a
                boolean r2 = r0.isAssignableFrom(r2)
                if (r2 == 0) goto L12
                java.lang.Class<R> r2 = r1.b
                boolean r2 = r3.isAssignableFrom(r2)
                if (r2 == 0) goto L12
                r2 = 1
                return r2
            L12:
                r2 = 0
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

    @androidx.annotation.NonNull
    public synchronized <Z, R> com.bumptech.glide.load.resource.transcode.e<Z, R> a(@androidx.annotation.NonNull java.lang.Class<Z> r4, @androidx.annotation.NonNull java.lang.Class<R> r5) {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r5.isAssignableFrom(r4)     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto Lf
            com.bumptech.glide.load.resource.transcode.e r4 = com.bumptech.glide.load.resource.transcode.g.b()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r3)
            return r4
        Ld:
            r4 = move-exception
            goto L4a
        Lf:
            java.util.List<com.bumptech.glide.load.resource.transcode.f$a<?, ?>> r0 = r3.a     // Catch: java.lang.Throwable -> Ld
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Ld
        L15:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> Ld
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> Ld
            com.bumptech.glide.load.resource.transcode.f$a r1 = (com.bumptech.glide.load.resource.transcode.f.a) r1     // Catch: java.lang.Throwable -> Ld
            boolean r2 = r1.a(r4, r5)     // Catch: java.lang.Throwable -> Ld
            if (r2 == 0) goto L15
            com.bumptech.glide.load.resource.transcode.e<Z, R> r4 = r1.c     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r3)
            return r4
        L2b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Ld
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld
            r1.<init>()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r2 = "No transcoder registered to transcode from "
            r1.append(r2)     // Catch: java.lang.Throwable -> Ld
            r1.append(r4)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r4 = " to "
            r1.append(r4)     // Catch: java.lang.Throwable -> Ld
            r1.append(r5)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> Ld
            r0.<init>(r4)     // Catch: java.lang.Throwable -> Ld
            throw r0     // Catch: java.lang.Throwable -> Ld
        L4a:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Ld
            throw r4
    }

    @androidx.annotation.NonNull
    public synchronized <Z, R> java.util.List<java.lang.Class<R>> b(@androidx.annotation.NonNull java.lang.Class<Z> r4, @androidx.annotation.NonNull java.lang.Class<R> r5) {
            r3 = this;
            monitor-enter(r3)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L11
            r0.<init>()     // Catch: java.lang.Throwable -> L11
            boolean r1 = r5.isAssignableFrom(r4)     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L13
            r0.add(r5)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r3)
            return r0
        L11:
            r4 = move-exception
            goto L31
        L13:
            java.util.List<com.bumptech.glide.load.resource.transcode.f$a<?, ?>> r1 = r3.a     // Catch: java.lang.Throwable -> L11
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L11
        L19:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L11
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L11
            com.bumptech.glide.load.resource.transcode.f$a r2 = (com.bumptech.glide.load.resource.transcode.f.a) r2     // Catch: java.lang.Throwable -> L11
            boolean r2 = r2.a(r4, r5)     // Catch: java.lang.Throwable -> L11
            if (r2 == 0) goto L19
            r0.add(r5)     // Catch: java.lang.Throwable -> L11
            goto L19
        L2f:
            monitor-exit(r3)
            return r0
        L31:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L11
            throw r4
    }

    public synchronized <Z, R> void c(@androidx.annotation.NonNull java.lang.Class<Z> r3, @androidx.annotation.NonNull java.lang.Class<R> r4, @androidx.annotation.NonNull com.bumptech.glide.load.resource.transcode.e<Z, R> r5) {
            r2 = this;
            monitor-enter(r2)
            java.util.List<com.bumptech.glide.load.resource.transcode.f$a<?, ?>> r0 = r2.a     // Catch: java.lang.Throwable -> Ld
            com.bumptech.glide.load.resource.transcode.f$a r1 = new com.bumptech.glide.load.resource.transcode.f$a     // Catch: java.lang.Throwable -> Ld
            r1.<init>(r3, r4, r5)     // Catch: java.lang.Throwable -> Ld
            r0.add(r1)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)
            return
        Ld:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            throw r3
    }
}
