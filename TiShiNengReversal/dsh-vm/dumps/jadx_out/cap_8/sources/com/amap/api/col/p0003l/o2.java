package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class o2 {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a extends com.amap.api.col.p0003l.m2 {

        /* renamed from: h, reason: collision with root package name */
        private static int f3721h = 4;
        protected int a;

        /* renamed from: b, reason: collision with root package name */
        protected int f3722b;

        /* renamed from: c, reason: collision with root package name */
        protected int f3723c;

        /* renamed from: d, reason: collision with root package name */
        protected int f3724d;

        /* renamed from: e, reason: collision with root package name */
        protected int f3725e;

        /* renamed from: f, reason: collision with root package name */
        protected int f3726f;

        /* renamed from: g, reason: collision with root package name */
        private int[] f3727g;

        static {
                return
        }

        public a(int r2, int r3, int r4) {
                r1 = this;
                r1.<init>()
                r0 = 1
                int[] r0 = new int[r0]
                r1.f3727g = r0
                r1.a = r2
                r1.f3722b = r3
                r1.f3723c = r4
                r2 = 0
                r1.f3724d = r2
                r2 = 16
                r1.f3725e = r2
                r2 = 8
                r1.f3726f = r2
                return
        }

        private int a(javax.microedition.khronos.egl.EGL10 r2, javax.microedition.khronos.egl.EGLDisplay r3, javax.microedition.khronos.egl.EGLConfig r4, int r5) {
                r1 = this;
                int[] r0 = r1.f3727g
                boolean r2 = r2.eglGetConfigAttrib(r3, r4, r5, r0)
                r3 = 0
                if (r2 == 0) goto Le
                int[] r2 = r1.f3727g
                r2 = r2[r3]
                return r2
            Le:
                return r3
        }

        private com.amap.api.col.3l.o2.c b(javax.microedition.khronos.egl.EGL10 r17, javax.microedition.khronos.egl.EGLDisplay r18) {
                r16 = this;
                r0 = r16
                com.amap.api.col.3l.o2$c r1 = new com.amap.api.col.3l.o2$c
                r2 = 0
                r1.<init>(r2)
                r3 = 1
                int[] r6 = r0.d(r3)
                r1.a = r6
                r8 = 0
                int[] r9 = r1.f3728b
                r7 = 0
                r4 = r17
                r5 = r18
                r4.eglChooseConfig(r5, r6, r7, r8, r9)
                int[] r3 = r1.f3728b
                r3 = r3[r2]
                if (r3 > 0) goto L38
                int[] r12 = r0.d(r2)
                r1.a = r12
                r14 = 0
                int[] r15 = r1.f3728b
                r13 = 0
                r10 = r17
                r11 = r18
                r10.eglChooseConfig(r11, r12, r13, r14, r15)
                int[] r3 = r1.f3728b
                r2 = r3[r2]
                if (r2 > 0) goto L38
                r1 = 0
            L38:
                return r1
        }

        private javax.microedition.khronos.egl.EGLConfig c(javax.microedition.khronos.egl.EGL10 r9, javax.microedition.khronos.egl.EGLDisplay r10, javax.microedition.khronos.egl.EGLConfig[] r11) {
                r8 = this;
                int r0 = r11.length
                r1 = 0
            L2:
                if (r1 >= r0) goto L46
                r2 = r11[r1]
                r3 = 12325(0x3025, float:1.7271E-41)
                int r3 = r8.a(r9, r10, r2, r3)
                r4 = 12326(0x3026, float:1.7272E-41)
                int r4 = r8.a(r9, r10, r2, r4)
                int r5 = r8.f3725e
                if (r3 < r5) goto L43
                int r3 = r8.f3726f
                if (r4 < r3) goto L43
                r3 = 12324(0x3024, float:1.727E-41)
                int r3 = r8.a(r9, r10, r2, r3)
                r4 = 12323(0x3023, float:1.7268E-41)
                int r4 = r8.a(r9, r10, r2, r4)
                r5 = 12322(0x3022, float:1.7267E-41)
                int r5 = r8.a(r9, r10, r2, r5)
                r6 = 12321(0x3021, float:1.7265E-41)
                int r6 = r8.a(r9, r10, r2, r6)
                int r7 = r8.a
                if (r3 != r7) goto L43
                int r3 = r8.f3722b
                if (r4 != r3) goto L43
                int r3 = r8.f3723c
                if (r5 != r3) goto L43
                int r3 = r8.f3724d
                if (r6 != r3) goto L43
                return r2
            L43:
                int r1 = r1 + 1
                goto L2
            L46:
                r9 = 0
                return r9
        }

        private int[] d(boolean r19) {
                r18 = this;
                r0 = r18
                int r2 = r0.a
                int r4 = r0.f3722b
                int r6 = r0.f3723c
                int r8 = r0.f3724d
                int r10 = r0.f3725e
                int r12 = r0.f3726f
                int r16 = com.amap.api.col.3l.o2.a.f3721h
                r17 = 12344(0x3038, float:1.7298E-41)
                r1 = 12324(0x3024, float:1.727E-41)
                r3 = 12323(0x3023, float:1.7268E-41)
                r5 = 12322(0x3022, float:1.7267E-41)
                r7 = 12321(0x3021, float:1.7265E-41)
                r9 = 12325(0x3025, float:1.7271E-41)
                r11 = 12326(0x3026, float:1.7272E-41)
                r13 = 12338(0x3032, float:1.7289E-41)
                r15 = 12352(0x3040, float:1.7309E-41)
                r14 = r19
                int[] r1 = new int[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17}
                return r1
        }

        @Override // com.amap.api.col.p0003l.m2, android.opengl.GLSurfaceView.EGLConfigChooser, com.amap.api.col.3l.y.e
        public final javax.microedition.khronos.egl.EGLConfig chooseConfig(javax.microedition.khronos.egl.EGL10 r14, javax.microedition.khronos.egl.EGLDisplay r15) {
                r13 = this;
                com.amap.api.col.3l.o2$c r0 = r13.b(r14, r15)
                if (r0 == 0) goto L3f
                int[] r3 = r0.a
                if (r3 != 0) goto Lb
                goto L3f
            Lb:
                int[] r6 = r0.f3728b
                r0 = 0
                r5 = r6[r0]
                javax.microedition.khronos.egl.EGLConfig[] r4 = new javax.microedition.khronos.egl.EGLConfig[r5]
                r1 = r14
                r2 = r15
                r1.eglChooseConfig(r2, r3, r4, r5, r6)
                javax.microedition.khronos.egl.EGLConfig r14 = r13.c(r1, r2, r4)
                if (r14 != 0) goto L3e
                r15 = 8
                r13.a = r15
                r13.f3722b = r15
                r13.f3723c = r15
                com.amap.api.col.3l.o2$c r15 = r13.b(r1, r2)
                if (r15 == 0) goto L3e
                int[] r9 = r15.a
                if (r9 == 0) goto L3e
                int[] r12 = r15.f3728b
                r11 = r12[r0]
                javax.microedition.khronos.egl.EGLConfig[] r10 = new javax.microedition.khronos.egl.EGLConfig[r11]
                r7 = r1
                r8 = r2
                r7.eglChooseConfig(r8, r9, r10, r11, r12)
                javax.microedition.khronos.egl.EGLConfig r14 = r13.c(r1, r2, r10)
            L3e:
                return r14
            L3f:
                r14 = 0
                return r14
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class b extends com.amap.api.col.p0003l.n2 {
        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.amap.api.col.p0003l.n2, android.opengl.GLSurfaceView.EGLContextFactory, com.amap.api.col.3l.y.f
        public final javax.microedition.khronos.egl.EGLContext createContext(javax.microedition.khronos.egl.EGL10 r4, javax.microedition.khronos.egl.EGLDisplay r5, javax.microedition.khronos.egl.EGLConfig r6) {
                r3 = this;
                r0 = 12344(0x3038, float:1.7298E-41)
                r1 = 12440(0x3098, float:1.7432E-41)
                r2 = 2
                int[] r0 = new int[]{r1, r2, r0}     // Catch: java.lang.Throwable -> L10
                javax.microedition.khronos.egl.EGLContext r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT     // Catch: java.lang.Throwable -> L10
                javax.microedition.khronos.egl.EGLContext r4 = r4.eglCreateContext(r5, r6, r1, r0)     // Catch: java.lang.Throwable -> L10
                return r4
            L10:
                r4 = 0
                return r4
        }

        @Override // com.amap.api.col.p0003l.n2, android.opengl.GLSurfaceView.EGLContextFactory, com.amap.api.col.3l.y.f
        public final void destroyContext(javax.microedition.khronos.egl.EGL10 r1, javax.microedition.khronos.egl.EGLDisplay r2, javax.microedition.khronos.egl.EGLContext r3) {
                r0 = this;
                r1.eglDestroyContext(r2, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class c {
        public int[] a;

        /* renamed from: b, reason: collision with root package name */
        public int[] f3728b;

        private c() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.a = r0
                r0 = 1
                int[] r0 = new int[r0]
                r1.f3728b = r0
                return
        }

        /* synthetic */ c(byte r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public o2() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(com.autonavi.base.amap.api.mapcore.IGLSurfaceView r1, int r2, int r3, int r4) {
            com.amap.api.col.3l.o2$b r0 = new com.amap.api.col.3l.o2$b
            r0.<init>()
            r1.setEGLContextFactory(r0)
            com.amap.api.col.3l.o2$a r0 = new com.amap.api.col.3l.o2$a
            r0.<init>(r2, r3, r4)
            r1.setEGLConfigChooser(r0)
            return
    }
}
