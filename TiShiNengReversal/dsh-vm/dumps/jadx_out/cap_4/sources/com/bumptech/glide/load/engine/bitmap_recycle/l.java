package com.bumptech.glide.load.engine.bitmap_recycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class l implements com.bumptech.glide.load.engine.bitmap_recycle.e {
    private static final java.lang.String k = "LruBitmapPool";

    /* renamed from: l, reason: collision with root package name */
    private static final android.graphics.Bitmap.Config f393l = null;
    private final com.bumptech.glide.load.engine.bitmap_recycle.m a;
    private final java.util.Set<android.graphics.Bitmap.Config> b;
    private final long c;
    private final com.bumptech.glide.load.engine.bitmap_recycle.l.a d;
    private long e;
    private long f;
    private int g;
    private int h;
    private int i;
    private int j;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private interface a {
        void a(android.graphics.Bitmap r1);

        void b(android.graphics.Bitmap r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class b implements com.bumptech.glide.load.engine.bitmap_recycle.l.a {
        b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.l.a
        public void a(android.graphics.Bitmap r1) {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.l.a
        public void b(android.graphics.Bitmap r1) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class c implements com.bumptech.glide.load.engine.bitmap_recycle.l.a {
        private final java.util.Set<android.graphics.Bitmap> a;

        private c() {
                r1 = this;
                r1.<init>()
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                java.util.Set r0 = java.util.Collections.synchronizedSet(r0)
                r1.a = r0
                return
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.l.a
        public void a(android.graphics.Bitmap r4) {
                r3 = this;
                java.util.Set<android.graphics.Bitmap> r0 = r3.a
                boolean r0 = r0.contains(r4)
                if (r0 != 0) goto Le
                java.util.Set<android.graphics.Bitmap> r0 = r3.a
                r0.add(r4)
                return
            Le:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Can't add already added bitmap: "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r2 = " ["
                r1.append(r2)
                int r2 = r4.getWidth()
                r1.append(r2)
                java.lang.String r2 = "x"
                r1.append(r2)
                int r4 = r4.getHeight()
                r1.append(r4)
                java.lang.String r4 = "]"
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.l.a
        public void b(android.graphics.Bitmap r2) {
                r1 = this;
                java.util.Set<android.graphics.Bitmap> r0 = r1.a
                boolean r0 = r0.contains(r2)
                if (r0 == 0) goto Le
                java.util.Set<android.graphics.Bitmap> r0 = r1.a
                r0.remove(r2)
                return
            Le:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "Cannot remove bitmap not in tracker"
                r2.<init>(r0)
                throw r2
        }
    }

    static {
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            com.bumptech.glide.load.engine.bitmap_recycle.l.f393l = r0
            return
    }

    public l(long r3) {
            r2 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.m r0 = o()
            java.util.Set r1 = n()
            r2.<init>(r3, r0, r1)
            return
    }

    l(long r1, com.bumptech.glide.load.engine.bitmap_recycle.m r3, java.util.Set<android.graphics.Bitmap.Config> r4) {
            r0 = this;
            r0.<init>()
            r0.c = r1
            r0.e = r1
            r0.a = r3
            r0.b = r4
            com.bumptech.glide.load.engine.bitmap_recycle.l$b r1 = new com.bumptech.glide.load.engine.bitmap_recycle.l$b
            r1.<init>()
            r0.d = r1
            return
    }

    public l(long r2, java.util.Set<android.graphics.Bitmap.Config> r4) {
            r1 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.m r0 = o()
            r1.<init>(r2, r0, r4)
            return
    }

    @android.annotation.TargetApi(26)
    private static void g(android.graphics.Bitmap.Config r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 >= r1) goto L7
            goto Ld
        L7:
            android.graphics.Bitmap$Config r0 = com.bumptech.glide.load.engine.bitmap_recycle.k.a()
            if (r3 == r0) goto Le
        Ld:
            return
        Le:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot create a mutable Bitmap with config: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @androidx.annotation.NonNull
    private static android.graphics.Bitmap h(int r0, int r1, @androidx.annotation.Nullable android.graphics.Bitmap.Config r2) {
            if (r2 == 0) goto L3
            goto L5
        L3:
            android.graphics.Bitmap$Config r2 = com.bumptech.glide.load.engine.bitmap_recycle.l.f393l
        L5:
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            return r0
    }

    private void i() {
            r2 = this;
            java.lang.String r0 = "LruBitmapPool"
            r1 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 == 0) goto Lc
            r2.j()
        Lc:
            return
    }

    private void j() {
            r1 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.m r0 = r1.a
            java.util.Objects.toString(r0)
            return
    }

    private void k() {
            r2 = this;
            long r0 = r2.e
            r2.u(r0)
            return
    }

    @android.annotation.TargetApi(26)
    private static java.util.Set<android.graphics.Bitmap.Config> n() {
            java.util.HashSet r0 = new java.util.HashSet
            android.graphics.Bitmap$Config[] r1 = android.graphics.Bitmap.Config.values()
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 0
            r0.add(r2)
            r2 = 26
            if (r1 < r2) goto L1e
            android.graphics.Bitmap$Config r1 = com.bumptech.glide.load.engine.bitmap_recycle.k.a()
            r0.remove(r1)
        L1e:
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            return r0
    }

    private static com.bumptech.glide.load.engine.bitmap_recycle.m o() {
            com.bumptech.glide.load.engine.bitmap_recycle.q r0 = new com.bumptech.glide.load.engine.bitmap_recycle.q
            r0.<init>()
            return r0
    }

    @androidx.annotation.Nullable
    private synchronized android.graphics.Bitmap p(int r6, int r7, @androidx.annotation.Nullable android.graphics.Bitmap.Config r8) {
            r5 = this;
            monitor-enter(r5)
            g(r8)     // Catch: java.lang.Throwable -> L21
            com.bumptech.glide.load.engine.bitmap_recycle.m r0 = r5.a     // Catch: java.lang.Throwable -> L21
            if (r8 == 0) goto La
            r1 = r8
            goto Lc
        La:
            android.graphics.Bitmap$Config r1 = com.bumptech.glide.load.engine.bitmap_recycle.l.f393l     // Catch: java.lang.Throwable -> L21
        Lc:
            android.graphics.Bitmap r0 = r0.e(r6, r7, r1)     // Catch: java.lang.Throwable -> L21
            if (r0 != 0) goto L2a
            java.lang.String r1 = "LruBitmapPool"
            r2 = 3
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L23
            com.bumptech.glide.load.engine.bitmap_recycle.m r1 = r5.a     // Catch: java.lang.Throwable -> L21
            r1.a(r6, r7, r8)     // Catch: java.lang.Throwable -> L21
            goto L23
        L21:
            r6 = move-exception
            goto L57
        L23:
            int r1 = r5.h     // Catch: java.lang.Throwable -> L21
            int r1 = r1 + 1
            r5.h = r1     // Catch: java.lang.Throwable -> L21
            goto L44
        L2a:
            int r1 = r5.g     // Catch: java.lang.Throwable -> L21
            int r1 = r1 + 1
            r5.g = r1     // Catch: java.lang.Throwable -> L21
            long r1 = r5.f     // Catch: java.lang.Throwable -> L21
            com.bumptech.glide.load.engine.bitmap_recycle.m r3 = r5.a     // Catch: java.lang.Throwable -> L21
            int r3 = r3.b(r0)     // Catch: java.lang.Throwable -> L21
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L21
            long r1 = r1 - r3
            r5.f = r1     // Catch: java.lang.Throwable -> L21
            com.bumptech.glide.load.engine.bitmap_recycle.l$a r1 = r5.d     // Catch: java.lang.Throwable -> L21
            r1.b(r0)     // Catch: java.lang.Throwable -> L21
            t(r0)     // Catch: java.lang.Throwable -> L21
        L44:
            java.lang.String r1 = "LruBitmapPool"
            r2 = 2
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L52
            com.bumptech.glide.load.engine.bitmap_recycle.m r1 = r5.a     // Catch: java.lang.Throwable -> L21
            r1.a(r6, r7, r8)     // Catch: java.lang.Throwable -> L21
        L52:
            r5.i()     // Catch: java.lang.Throwable -> L21
            monitor-exit(r5)
            return r0
        L57:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L21
            throw r6
    }

    @android.annotation.TargetApi(19)
    private static void r(android.graphics.Bitmap r1) {
            r0 = 1
            r1.setPremultiplied(r0)
            return
    }

    private static void t(android.graphics.Bitmap r1) {
            r0 = 1
            r1.setHasAlpha(r0)
            r(r1)
            return
    }

    private synchronized void u(long r6) {
            r5 = this;
            monitor-enter(r5)
        L1:
            long r0 = r5.f     // Catch: java.lang.Throwable -> L1c
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 <= 0) goto L50
            com.bumptech.glide.load.engine.bitmap_recycle.m r0 = r5.a     // Catch: java.lang.Throwable -> L1c
            android.graphics.Bitmap r0 = r0.removeLast()     // Catch: java.lang.Throwable -> L1c
            if (r0 != 0) goto L24
            java.lang.String r6 = "LruBitmapPool"
            r7 = 5
            boolean r6 = android.util.Log.isLoggable(r6, r7)     // Catch: java.lang.Throwable -> L1c
            if (r6 == 0) goto L1e
            r5.j()     // Catch: java.lang.Throwable -> L1c
            goto L1e
        L1c:
            r6 = move-exception
            goto L52
        L1e:
            r6 = 0
            r5.f = r6     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r5)
            return
        L24:
            com.bumptech.glide.load.engine.bitmap_recycle.l$a r1 = r5.d     // Catch: java.lang.Throwable -> L1c
            r1.b(r0)     // Catch: java.lang.Throwable -> L1c
            long r1 = r5.f     // Catch: java.lang.Throwable -> L1c
            com.bumptech.glide.load.engine.bitmap_recycle.m r3 = r5.a     // Catch: java.lang.Throwable -> L1c
            int r3 = r3.b(r0)     // Catch: java.lang.Throwable -> L1c
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L1c
            long r1 = r1 - r3
            r5.f = r1     // Catch: java.lang.Throwable -> L1c
            int r1 = r5.j     // Catch: java.lang.Throwable -> L1c
            int r1 = r1 + 1
            r5.j = r1     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = "LruBitmapPool"
            r2 = 3
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L49
            com.bumptech.glide.load.engine.bitmap_recycle.m r1 = r5.a     // Catch: java.lang.Throwable -> L1c
            r1.c(r0)     // Catch: java.lang.Throwable -> L1c
        L49:
            r5.i()     // Catch: java.lang.Throwable -> L1c
            r0.recycle()     // Catch: java.lang.Throwable -> L1c
            goto L1
        L50:
            monitor-exit(r5)
            return
        L52:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L1c
            throw r6
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    @android.annotation.SuppressLint({"InlinedApi"})
    public void a(int r5) {
            r4 = this;
            java.lang.String r0 = "LruBitmapPool"
            r1 = 3
            android.util.Log.isLoggable(r0, r1)
            r0 = 40
            if (r5 >= r0) goto L28
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            r2 = 20
            if (r0 < r1) goto L15
            if (r5 < r2) goto L15
            goto L28
        L15:
            if (r5 >= r2) goto L1d
            r0 = 15
            if (r5 != r0) goto L1c
            goto L1d
        L1c:
            return
        L1d:
            long r0 = r4.getMaxSize()
            r2 = 2
            long r0 = r0 / r2
            r4.u(r0)
            return
        L28:
            r4.b()
            return
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public void b() {
            r2 = this;
            java.lang.String r0 = "LruBitmapPool"
            r1 = 3
            android.util.Log.isLoggable(r0, r1)
            r0 = 0
            r2.u(r0)
            return
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public synchronized void c(float r3) {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.c     // Catch: java.lang.Throwable -> L12
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L12
            float r0 = r0 * r3
            int r3 = java.lang.Math.round(r0)     // Catch: java.lang.Throwable -> L12
            long r0 = (long) r3     // Catch: java.lang.Throwable -> L12
            r2.e = r0     // Catch: java.lang.Throwable -> L12
            r2.k()     // Catch: java.lang.Throwable -> L12
            monitor-exit(r2)
            return
        L12:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            throw r3
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public synchronized void d(android.graphics.Bitmap r7) {
            r6 = this;
            monitor-enter(r6)
            if (r7 == 0) goto L84
            boolean r0 = r7.isRecycled()     // Catch: java.lang.Throwable -> L54
            if (r0 != 0) goto L7c
            boolean r0 = r7.isMutable()     // Catch: java.lang.Throwable -> L54
            r1 = 2
            if (r0 == 0) goto L5e
            com.bumptech.glide.load.engine.bitmap_recycle.m r0 = r6.a     // Catch: java.lang.Throwable -> L54
            int r0 = r0.b(r7)     // Catch: java.lang.Throwable -> L54
            long r2 = (long) r0     // Catch: java.lang.Throwable -> L54
            long r4 = r6.e     // Catch: java.lang.Throwable -> L54
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L5e
            java.util.Set<android.graphics.Bitmap$Config> r0 = r6.b     // Catch: java.lang.Throwable -> L54
            android.graphics.Bitmap$Config r2 = r7.getConfig()     // Catch: java.lang.Throwable -> L54
            boolean r0 = r0.contains(r2)     // Catch: java.lang.Throwable -> L54
            if (r0 != 0) goto L2a
            goto L5e
        L2a:
            com.bumptech.glide.load.engine.bitmap_recycle.m r0 = r6.a     // Catch: java.lang.Throwable -> L54
            int r0 = r0.b(r7)     // Catch: java.lang.Throwable -> L54
            com.bumptech.glide.load.engine.bitmap_recycle.m r2 = r6.a     // Catch: java.lang.Throwable -> L54
            r2.d(r7)     // Catch: java.lang.Throwable -> L54
            com.bumptech.glide.load.engine.bitmap_recycle.l$a r2 = r6.d     // Catch: java.lang.Throwable -> L54
            r2.a(r7)     // Catch: java.lang.Throwable -> L54
            int r2 = r6.i     // Catch: java.lang.Throwable -> L54
            int r2 = r2 + 1
            r6.i = r2     // Catch: java.lang.Throwable -> L54
            long r2 = r6.f     // Catch: java.lang.Throwable -> L54
            long r4 = (long) r0     // Catch: java.lang.Throwable -> L54
            long r2 = r2 + r4
            r6.f = r2     // Catch: java.lang.Throwable -> L54
            java.lang.String r0 = "LruBitmapPool"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> L54
            if (r0 == 0) goto L56
            com.bumptech.glide.load.engine.bitmap_recycle.m r0 = r6.a     // Catch: java.lang.Throwable -> L54
            r0.c(r7)     // Catch: java.lang.Throwable -> L54
            goto L56
        L54:
            r7 = move-exception
            goto L8c
        L56:
            r6.i()     // Catch: java.lang.Throwable -> L54
            r6.k()     // Catch: java.lang.Throwable -> L54
            monitor-exit(r6)
            return
        L5e:
            java.lang.String r0 = "LruBitmapPool"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> L54
            if (r0 == 0) goto L77
            com.bumptech.glide.load.engine.bitmap_recycle.m r0 = r6.a     // Catch: java.lang.Throwable -> L54
            r0.c(r7)     // Catch: java.lang.Throwable -> L54
            r7.isMutable()     // Catch: java.lang.Throwable -> L54
            java.util.Set<android.graphics.Bitmap$Config> r0 = r6.b     // Catch: java.lang.Throwable -> L54
            android.graphics.Bitmap$Config r1 = r7.getConfig()     // Catch: java.lang.Throwable -> L54
            r0.contains(r1)     // Catch: java.lang.Throwable -> L54
        L77:
            r7.recycle()     // Catch: java.lang.Throwable -> L54
            monitor-exit(r6)
            return
        L7c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L54
            java.lang.String r0 = "Cannot pool recycled bitmap"
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L54
            throw r7     // Catch: java.lang.Throwable -> L54
        L84:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L54
            java.lang.String r0 = "Bitmap must not be null"
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L54
            throw r7     // Catch: java.lang.Throwable -> L54
        L8c:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L54
            throw r7
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    @androidx.annotation.NonNull
    public android.graphics.Bitmap e(int r2, int r3, android.graphics.Bitmap.Config r4) {
            r1 = this;
            android.graphics.Bitmap r0 = r1.p(r2, r3, r4)
            if (r0 == 0) goto Lb
            r2 = 0
            r0.eraseColor(r2)
            return r0
        Lb:
            android.graphics.Bitmap r2 = h(r2, r3, r4)
            return r2
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    @androidx.annotation.NonNull
    public android.graphics.Bitmap f(int r2, int r3, android.graphics.Bitmap.Config r4) {
            r1 = this;
            android.graphics.Bitmap r0 = r1.p(r2, r3, r4)
            if (r0 != 0) goto Lb
            android.graphics.Bitmap r2 = h(r2, r3, r4)
            return r2
        Lb:
            return r0
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public long getMaxSize() {
            r2 = this;
            long r0 = r2.e
            return r0
    }

    public long l() {
            r2 = this;
            int r0 = r2.j
            long r0 = (long) r0
            return r0
    }

    public long m() {
            r2 = this;
            long r0 = r2.f
            return r0
    }

    public long q() {
            r2 = this;
            int r0 = r2.g
            long r0 = (long) r0
            return r0
    }

    public long s() {
            r2 = this;
            int r0 = r2.h
            long r0 = (long) r0
            return r0
    }
}
