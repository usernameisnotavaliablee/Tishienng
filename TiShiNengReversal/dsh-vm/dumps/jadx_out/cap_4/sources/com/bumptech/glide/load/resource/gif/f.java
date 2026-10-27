package com.bumptech.glide.load.resource.gif;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class f {
    private final com.bumptech.glide.gifdecoder.GifDecoder a;
    private final android.os.Handler b;
    private final java.util.List<com.bumptech.glide.load.resource.gif.f.b> c;
    final com.bumptech.glide.i d;
    private final com.bumptech.glide.load.engine.bitmap_recycle.e e;
    private boolean f;
    private boolean g;
    private boolean h;
    private com.bumptech.glide.h<android.graphics.Bitmap> i;
    private com.bumptech.glide.load.resource.gif.f.a j;
    private boolean k;

    /* renamed from: l, reason: collision with root package name */
    private com.bumptech.glide.load.resource.gif.f.a f465l;

    /* renamed from: m, reason: collision with root package name */
    private android.graphics.Bitmap f466m;

    /* renamed from: n, reason: collision with root package name */
    private com.bumptech.glide.load.i<android.graphics.Bitmap> f467n;

    /* renamed from: o, reason: collision with root package name */
    private com.bumptech.glide.load.resource.gif.f.a f468o;

    /* renamed from: p, reason: collision with root package name */
    @androidx.annotation.Nullable
    private com.bumptech.glide.load.resource.gif.f.d f469p;

    /* renamed from: q, reason: collision with root package name */
    private int f470q;

    /* renamed from: r, reason: collision with root package name */
    private int f471r;

    /* renamed from: s, reason: collision with root package name */
    private int f472s;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.VisibleForTesting
    static class a extends com.bumptech.glide.request.target.e<android.graphics.Bitmap> {
        private final android.os.Handler d;
        final int e;
        private final long f;
        private android.graphics.Bitmap g;

        a(android.os.Handler r1, int r2, long r3) {
                r0 = this;
                r0.<init>()
                r0.d = r1
                r0.e = r2
                r0.f = r3
                return
        }

        android.graphics.Bitmap a() {
                r1 = this;
                android.graphics.Bitmap r0 = r1.g
                return r0
        }

        public void c(@androidx.annotation.NonNull android.graphics.Bitmap r3, @androidx.annotation.Nullable com.bumptech.glide.request.transition.f<? super android.graphics.Bitmap> r4) {
                r2 = this;
                r2.g = r3
                android.os.Handler r3 = r2.d
                r4 = 1
                android.os.Message r3 = r3.obtainMessage(r4, r2)
                android.os.Handler r4 = r2.d
                long r0 = r2.f
                r4.sendMessageAtTime(r3, r0)
                return
        }

        @Override // com.bumptech.glide.request.target.p
        public void g(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
                r0 = this;
                r1 = 0
                r0.g = r1
                return
        }

        @Override // com.bumptech.glide.request.target.p
        public /* bridge */ /* synthetic */ void h(@androidx.annotation.NonNull java.lang.Object r1, @androidx.annotation.Nullable com.bumptech.glide.request.transition.f r2) {
                r0 = this;
                android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
                r0.c(r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        void a();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class c implements android.os.Handler.Callback {
        static final int b = 1;
        static final int c = 2;
        final /* synthetic */ com.bumptech.glide.load.resource.gif.f a;

        c(com.bumptech.glide.load.resource.gif.f r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message r3) {
                r2 = this;
                int r0 = r3.what
                r1 = 1
                if (r0 != r1) goto Lf
                java.lang.Object r3 = r3.obj
                com.bumptech.glide.load.resource.gif.f$a r3 = (com.bumptech.glide.load.resource.gif.f.a) r3
                com.bumptech.glide.load.resource.gif.f r0 = r2.a
                r0.o(r3)
                return r1
            Lf:
                r1 = 2
                if (r0 != r1) goto L1d
                java.lang.Object r3 = r3.obj
                com.bumptech.glide.load.resource.gif.f$a r3 = (com.bumptech.glide.load.resource.gif.f.a) r3
                com.bumptech.glide.load.resource.gif.f r0 = r2.a
                com.bumptech.glide.i r0 = r0.d
                r0.z(r3)
            L1d:
                r3 = 0
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.VisibleForTesting
    interface d {
        void a();
    }

    f(com.bumptech.glide.b r9, com.bumptech.glide.gifdecoder.GifDecoder r10, int r11, int r12, com.bumptech.glide.load.i<android.graphics.Bitmap> r13, android.graphics.Bitmap r14) {
            r8 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.e r1 = r9.h()
            android.content.Context r0 = r9.getContext()
            com.bumptech.glide.i r2 = com.bumptech.glide.b.D(r0)
            android.content.Context r9 = r9.getContext()
            com.bumptech.glide.i r9 = com.bumptech.glide.b.D(r9)
            com.bumptech.glide.h r5 = k(r9, r11, r12)
            r4 = 0
            r0 = r8
            r3 = r10
            r6 = r13
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    f(com.bumptech.glide.load.engine.bitmap_recycle.e r2, com.bumptech.glide.i r3, com.bumptech.glide.gifdecoder.GifDecoder r4, android.os.Handler r5, com.bumptech.glide.h<android.graphics.Bitmap> r6, com.bumptech.glide.load.i<android.graphics.Bitmap> r7, android.graphics.Bitmap r8) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.c = r0
            r1.d = r3
            if (r5 != 0) goto L1c
            android.os.Handler r5 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            com.bumptech.glide.load.resource.gif.f$c r0 = new com.bumptech.glide.load.resource.gif.f$c
            r0.<init>(r1)
            r5.<init>(r3, r0)
        L1c:
            r1.e = r2
            r1.b = r5
            r1.i = r6
            r1.a = r4
            r1.q(r7, r8)
            return
    }

    private static com.bumptech.glide.load.c g() {
            com.bumptech.glide.signature.e r0 = new com.bumptech.glide.signature.e
            double r1 = java.lang.Math.random()
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r0.<init>(r1)
            return r0
    }

    private static com.bumptech.glide.h<android.graphics.Bitmap> k(com.bumptech.glide.i r2, int r3, int r4) {
            com.bumptech.glide.h r2 = r2.u()
            com.bumptech.glide.load.engine.j r0 = com.bumptech.glide.load.engine.j.b
            com.bumptech.glide.request.h r0 = com.bumptech.glide.request.h.Z0(r0)
            r1 = 1
            com.bumptech.glide.request.a r0 = r0.S0(r1)
            com.bumptech.glide.request.h r0 = (com.bumptech.glide.request.h) r0
            com.bumptech.glide.request.a r0 = r0.I0(r1)
            com.bumptech.glide.request.h r0 = (com.bumptech.glide.request.h) r0
            com.bumptech.glide.request.a r3 = r0.x0(r3, r4)
            com.bumptech.glide.h r2 = r2.V0(r3)
            return r2
    }

    private void n() {
            r5 = this;
            boolean r0 = r5.f
            if (r0 == 0) goto L68
            boolean r0 = r5.g
            if (r0 == 0) goto L9
            goto L68
        L9:
            boolean r0 = r5.h
            r1 = 1
            if (r0 == 0) goto L22
            com.bumptech.glide.load.resource.gif.f$a r0 = r5.f468o
            r2 = 0
            if (r0 != 0) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            java.lang.String r3 = "Pending target must be null when starting from the first frame"
            com.bumptech.glide.util.k.a(r0, r3)
            com.bumptech.glide.gifdecoder.GifDecoder r0 = r5.a
            r0.d()
            r5.h = r2
        L22:
            com.bumptech.glide.load.resource.gif.f$a r0 = r5.f468o
            if (r0 == 0) goto L2d
            r1 = 0
            r5.f468o = r1
            r5.o(r0)
            return
        L2d:
            r5.g = r1
            com.bumptech.glide.gifdecoder.GifDecoder r0 = r5.a
            int r0 = r0.m()
            long r1 = android.os.SystemClock.uptimeMillis()
            long r3 = (long) r0
            long r1 = r1 + r3
            com.bumptech.glide.gifdecoder.GifDecoder r0 = r5.a
            r0.i()
            com.bumptech.glide.load.resource.gif.f$a r0 = new com.bumptech.glide.load.resource.gif.f$a
            android.os.Handler r3 = r5.b
            com.bumptech.glide.gifdecoder.GifDecoder r4 = r5.a
            int r4 = r4.e()
            r0.<init>(r3, r4, r1)
            r5.f465l = r0
            com.bumptech.glide.h<android.graphics.Bitmap> r0 = r5.i
            com.bumptech.glide.load.c r1 = g()
            com.bumptech.glide.request.h r1 = com.bumptech.glide.request.h.q1(r1)
            com.bumptech.glide.h r0 = r0.V0(r1)
            com.bumptech.glide.gifdecoder.GifDecoder r1 = r5.a
            com.bumptech.glide.h r0 = r0.u1(r1)
            com.bumptech.glide.load.resource.gif.f$a r1 = r5.f465l
            r0.j1(r1)
        L68:
            return
    }

    private void p() {
            r2 = this;
            android.graphics.Bitmap r0 = r2.f466m
            if (r0 == 0) goto Lc
            com.bumptech.glide.load.engine.bitmap_recycle.e r1 = r2.e
            r1.d(r0)
            r0 = 0
            r2.f466m = r0
        Lc:
            return
    }

    private void t() {
            r1 = this;
            boolean r0 = r1.f
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1.f = r0
            r0 = 0
            r1.k = r0
            r1.n()
            return
    }

    private void u() {
            r1 = this;
            r0 = 0
            r1.f = r0
            return
    }

    void a() {
            r3 = this;
            java.util.List<com.bumptech.glide.load.resource.gif.f$b> r0 = r3.c
            r0.clear()
            r3.p()
            r3.u()
            com.bumptech.glide.load.resource.gif.f$a r0 = r3.j
            r1 = 0
            if (r0 == 0) goto L17
            com.bumptech.glide.i r2 = r3.d
            r2.z(r0)
            r3.j = r1
        L17:
            com.bumptech.glide.load.resource.gif.f$a r0 = r3.f465l
            if (r0 == 0) goto L22
            com.bumptech.glide.i r2 = r3.d
            r2.z(r0)
            r3.f465l = r1
        L22:
            com.bumptech.glide.load.resource.gif.f$a r0 = r3.f468o
            if (r0 == 0) goto L2d
            com.bumptech.glide.i r2 = r3.d
            r2.z(r0)
            r3.f468o = r1
        L2d:
            com.bumptech.glide.gifdecoder.GifDecoder r0 = r3.a
            r0.clear()
            r0 = 1
            r3.k = r0
            return
    }

    java.nio.ByteBuffer b() {
            r1 = this;
            com.bumptech.glide.gifdecoder.GifDecoder r0 = r1.a
            java.nio.ByteBuffer r0 = r0.getData()
            java.nio.ByteBuffer r0 = r0.asReadOnlyBuffer()
            return r0
    }

    android.graphics.Bitmap c() {
            r1 = this;
            com.bumptech.glide.load.resource.gif.f$a r0 = r1.j
            if (r0 == 0) goto L9
            android.graphics.Bitmap r0 = r0.a()
            return r0
        L9:
            android.graphics.Bitmap r0 = r1.f466m
            return r0
    }

    int d() {
            r1 = this;
            com.bumptech.glide.load.resource.gif.f$a r0 = r1.j
            if (r0 == 0) goto L7
            int r0 = r0.e
            return r0
        L7:
            r0 = -1
            return r0
    }

    android.graphics.Bitmap e() {
            r1 = this;
            android.graphics.Bitmap r0 = r1.f466m
            return r0
    }

    int f() {
            r1 = this;
            com.bumptech.glide.gifdecoder.GifDecoder r0 = r1.a
            int r0 = r0.j()
            return r0
    }

    com.bumptech.glide.load.i<android.graphics.Bitmap> h() {
            r1 = this;
            com.bumptech.glide.load.i<android.graphics.Bitmap> r0 = r1.f467n
            return r0
    }

    int i() {
            r1 = this;
            int r0 = r1.f472s
            return r0
    }

    int j() {
            r1 = this;
            com.bumptech.glide.gifdecoder.GifDecoder r0 = r1.a
            int r0 = r0.l()
            return r0
    }

    int l() {
            r2 = this;
            com.bumptech.glide.gifdecoder.GifDecoder r0 = r2.a
            int r0 = r0.g()
            int r1 = r2.f470q
            int r0 = r0 + r1
            return r0
    }

    int m() {
            r1 = this;
            int r0 = r1.f471r
            return r0
    }

    @androidx.annotation.VisibleForTesting
    void o(com.bumptech.glide.load.resource.gif.f.a r4) {
            r3 = this;
            com.bumptech.glide.load.resource.gif.f$d r0 = r3.f469p
            if (r0 == 0) goto L7
            r0.a()
        L7:
            r0 = 0
            r3.g = r0
            boolean r0 = r3.k
            r1 = 2
            if (r0 == 0) goto L19
            android.os.Handler r0 = r3.b
            android.os.Message r4 = r0.obtainMessage(r1, r4)
            r4.sendToTarget()
            return
        L19:
            boolean r0 = r3.f
            if (r0 != 0) goto L2e
            boolean r0 = r3.h
            if (r0 == 0) goto L2b
            android.os.Handler r0 = r3.b
            android.os.Message r4 = r0.obtainMessage(r1, r4)
            r4.sendToTarget()
            return
        L2b:
            r3.f468o = r4
            return
        L2e:
            android.graphics.Bitmap r0 = r4.a()
            if (r0 == 0) goto L5e
            r3.p()
            com.bumptech.glide.load.resource.gif.f$a r0 = r3.j
            r3.j = r4
            java.util.List<com.bumptech.glide.load.resource.gif.f$b> r4 = r3.c
            int r4 = r4.size()
            int r4 = r4 + (-1)
        L43:
            if (r4 < 0) goto L53
            java.util.List<com.bumptech.glide.load.resource.gif.f$b> r2 = r3.c
            java.lang.Object r2 = r2.get(r4)
            com.bumptech.glide.load.resource.gif.f$b r2 = (com.bumptech.glide.load.resource.gif.f.b) r2
            r2.a()
            int r4 = r4 + (-1)
            goto L43
        L53:
            if (r0 == 0) goto L5e
            android.os.Handler r4 = r3.b
            android.os.Message r4 = r4.obtainMessage(r1, r0)
            r4.sendToTarget()
        L5e:
            r3.n()
            return
    }

    void q(com.bumptech.glide.load.i<android.graphics.Bitmap> r3, android.graphics.Bitmap r4) {
            r2 = this;
            java.lang.Object r0 = com.bumptech.glide.util.k.d(r3)
            com.bumptech.glide.load.i r0 = (com.bumptech.glide.load.i) r0
            r2.f467n = r0
            java.lang.Object r0 = com.bumptech.glide.util.k.d(r4)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r2.f466m = r0
            com.bumptech.glide.h<android.graphics.Bitmap> r0 = r2.i
            com.bumptech.glide.request.h r1 = new com.bumptech.glide.request.h
            r1.<init>()
            com.bumptech.glide.request.a r3 = r1.L0(r3)
            com.bumptech.glide.h r3 = r0.V0(r3)
            r2.i = r3
            int r3 = com.bumptech.glide.util.l.h(r4)
            r2.f470q = r3
            int r3 = r4.getWidth()
            r2.f471r = r3
            int r3 = r4.getHeight()
            r2.f472s = r3
            return
    }

    void r() {
            r3 = this;
            boolean r0 = r3.f
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = "Can't restart a running animation"
            com.bumptech.glide.util.k.a(r0, r2)
            r3.h = r1
            com.bumptech.glide.load.resource.gif.f$a r0 = r3.f468o
            if (r0 == 0) goto L17
            com.bumptech.glide.i r1 = r3.d
            r1.z(r0)
            r0 = 0
            r3.f468o = r0
        L17:
            return
    }

    @androidx.annotation.VisibleForTesting
    void s(@androidx.annotation.Nullable com.bumptech.glide.load.resource.gif.f.d r1) {
            r0 = this;
            r0.f469p = r1
            return
    }

    void v(com.bumptech.glide.load.resource.gif.f.b r3) {
            r2 = this;
            boolean r0 = r2.k
            if (r0 != 0) goto L25
            java.util.List<com.bumptech.glide.load.resource.gif.f$b> r0 = r2.c
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L1d
            java.util.List<com.bumptech.glide.load.resource.gif.f$b> r0 = r2.c
            boolean r0 = r0.isEmpty()
            java.util.List<com.bumptech.glide.load.resource.gif.f$b> r1 = r2.c
            r1.add(r3)
            if (r0 == 0) goto L1c
            r2.t()
        L1c:
            return
        L1d:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot subscribe twice in a row"
            r3.<init>(r0)
            throw r3
        L25:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot subscribe to a cleared frame loader"
            r3.<init>(r0)
            throw r3
    }

    void w(com.bumptech.glide.load.resource.gif.f.b r2) {
            r1 = this;
            java.util.List<com.bumptech.glide.load.resource.gif.f$b> r0 = r1.c
            r0.remove(r2)
            java.util.List<com.bumptech.glide.load.resource.gif.f$b> r2 = r1.c
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L10
            r1.u()
        L10:
            return
    }
}
