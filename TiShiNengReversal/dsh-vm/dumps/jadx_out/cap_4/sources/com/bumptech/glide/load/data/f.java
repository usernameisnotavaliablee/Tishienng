package com.bumptech.glide.load.data;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class f {
    private static final com.bumptech.glide.load.data.e.a<?> b = null;
    private final java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.data.e.a<?>> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements com.bumptech.glide.load.data.e.a<java.lang.Object> {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.data.e.a
        @androidx.annotation.NonNull
        public java.lang.Class<java.lang.Object> a() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Not implemented"
                r0.<init>(r1)
                throw r0
        }

        @Override // com.bumptech.glide.load.data.e.a
        @androidx.annotation.NonNull
        public com.bumptech.glide.load.data.e<java.lang.Object> b(@androidx.annotation.NonNull java.lang.Object r2) {
                r1 = this;
                com.bumptech.glide.load.data.f$b r0 = new com.bumptech.glide.load.data.f$b
                r0.<init>(r2)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class b implements com.bumptech.glide.load.data.e<java.lang.Object> {
        private final java.lang.Object a;

        b(@androidx.annotation.NonNull java.lang.Object r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        @Override // com.bumptech.glide.load.data.e
        @androidx.annotation.NonNull
        public java.lang.Object a() {
                r1 = this;
                java.lang.Object r0 = r1.a
                return r0
        }

        @Override // com.bumptech.glide.load.data.e
        public void b() {
                r0 = this;
                return
        }
    }

    static {
            com.bumptech.glide.load.data.f$a r0 = new com.bumptech.glide.load.data.f$a
            r0.<init>()
            com.bumptech.glide.load.data.f.b = r0
            return
    }

    public f() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.a = r0
            return
    }

    @androidx.annotation.NonNull
    public synchronized <T> com.bumptech.glide.load.data.e<T> a(@androidx.annotation.NonNull T r6) {
            r5 = this;
            monitor-enter(r5)
            com.bumptech.glide.util.k.d(r6)     // Catch: java.lang.Throwable -> L38
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.data.e$a<?>> r0 = r5.a     // Catch: java.lang.Throwable -> L38
            java.lang.Class r1 = r6.getClass()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L38
            com.bumptech.glide.load.data.e$a r0 = (com.bumptech.glide.load.data.e.a) r0     // Catch: java.lang.Throwable -> L38
            if (r0 != 0) goto L3a
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.data.e$a<?>> r1 = r5.a     // Catch: java.lang.Throwable -> L38
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L38
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L38
        L1c:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L38
            if (r2 == 0) goto L3a
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L38
            com.bumptech.glide.load.data.e$a r2 = (com.bumptech.glide.load.data.e.a) r2     // Catch: java.lang.Throwable -> L38
            java.lang.Class r3 = r2.a()     // Catch: java.lang.Throwable -> L38
            java.lang.Class r4 = r6.getClass()     // Catch: java.lang.Throwable -> L38
            boolean r3 = r3.isAssignableFrom(r4)     // Catch: java.lang.Throwable -> L38
            if (r3 == 0) goto L1c
            r0 = r2
            goto L3a
        L38:
            r6 = move-exception
            goto L44
        L3a:
            if (r0 != 0) goto L3e
            com.bumptech.glide.load.data.e$a<?> r0 = com.bumptech.glide.load.data.f.b     // Catch: java.lang.Throwable -> L38
        L3e:
            com.bumptech.glide.load.data.e r6 = r0.b(r6)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r5)
            return r6
        L44:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L38
            throw r6
    }

    public synchronized void b(@androidx.annotation.NonNull com.bumptech.glide.load.data.e.a<?> r3) {
            r2 = this;
            monitor-enter(r2)
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.data.e$a<?>> r0 = r2.a     // Catch: java.lang.Throwable -> Lc
            java.lang.Class r1 = r3.a()     // Catch: java.lang.Throwable -> Lc
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        Lc:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r3
    }
}
