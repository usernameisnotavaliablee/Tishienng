package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"NewApi"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class y extends android.view.TextureView implements android.view.TextureView.SurfaceTextureListener {
    private static final com.amap.api.col.3l.y.j l = null;
    private final java.lang.ref.WeakReference<com.amap.api.col.p0003l.y> a;

    /* renamed from: b, reason: collision with root package name */
    private com.amap.api.col.3l.y.i f4213b;

    /* renamed from: c, reason: collision with root package name */
    private android.opengl.GLSurfaceView.Renderer f4214c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4215d;

    /* renamed from: e, reason: collision with root package name */
    private com.amap.api.col.3l.y.e f4216e;

    /* renamed from: f, reason: collision with root package name */
    private com.amap.api.col.3l.y.f f4217f;

    /* renamed from: g, reason: collision with root package name */
    private com.amap.api.col.3l.y.g f4218g;

    /* renamed from: h, reason: collision with root package name */
    private com.amap.api.col.3l.y.k f4219h;

    /* renamed from: i, reason: collision with root package name */
    private int f4220i;

    /* renamed from: j, reason: collision with root package name */
    private int f4221j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f4222k;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private abstract class a implements com.amap.api.col.3l.y.e {
        protected int[] a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.y f4223b;

        public a(com.amap.api.col.p0003l.y r1, int[] r2) {
                r0 = this;
                r0.f4223b = r1
                r0.<init>()
                int[] r1 = r0.b(r2)
                r0.a = r1
                return
        }

        private int[] b(int[] r6) {
                r5 = this;
                com.amap.api.col.3l.y r0 = r5.f4223b
                int r0 = com.amap.api.col.p0003l.y.a(r0)
                r1 = 2
                if (r0 == r1) goto L13
                com.amap.api.col.3l.y r0 = r5.f4223b
                int r0 = com.amap.api.col.p0003l.y.a(r0)
                r2 = 3
                if (r0 == r2) goto L13
                return r6
            L13:
                int r0 = r6.length
                int r2 = r0 + 2
                int[] r2 = new int[r2]
                int r3 = r0 + (-1)
                r4 = 0
                java.lang.System.arraycopy(r6, r4, r2, r4, r3)
                r6 = 12352(0x3040, float:1.7309E-41)
                r2[r3] = r6
                com.amap.api.col.3l.y r6 = r5.f4223b
                int r6 = com.amap.api.col.p0003l.y.a(r6)
                if (r6 != r1) goto L2e
                r6 = 4
                r2[r0] = r6
                goto L32
            L2e:
                r6 = 64
                r2[r0] = r6
            L32:
                int r0 = r0 + 1
                r6 = 12344(0x3038, float:1.7298E-41)
                r2[r0] = r6
                return r2
        }

        abstract javax.microedition.khronos.egl.EGLConfig a(javax.microedition.khronos.egl.EGL10 r1, javax.microedition.khronos.egl.EGLDisplay r2, javax.microedition.khronos.egl.EGLConfig[] r3);

        @Override // com.amap.api.col.3l.y.e
        public javax.microedition.khronos.egl.EGLConfig chooseConfig(javax.microedition.khronos.egl.EGL10 r8, javax.microedition.khronos.egl.EGLDisplay r9) {
                r7 = this;
                r0 = 1
                int[] r6 = new int[r0]
                int[] r3 = r7.a
                r4 = 0
                r5 = 0
                r1 = r8
                r2 = r9
                boolean r8 = r1.eglChooseConfig(r2, r3, r4, r5, r6)
                if (r8 == 0) goto L3d
                r8 = 0
                r5 = r6[r8]
                if (r5 <= 0) goto L35
                javax.microedition.khronos.egl.EGLConfig[] r4 = new javax.microedition.khronos.egl.EGLConfig[r5]
                int[] r3 = r7.a
                boolean r8 = r1.eglChooseConfig(r2, r3, r4, r5, r6)
                if (r8 == 0) goto L2d
                javax.microedition.khronos.egl.EGLConfig r8 = r7.a(r1, r2, r4)
                if (r8 == 0) goto L25
                return r8
            L25:
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                java.lang.String r9 = "No config chosen"
                r8.<init>(r9)
                throw r8
            L2d:
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                java.lang.String r9 = "eglChooseConfig#2 failed"
                r8.<init>(r9)
                throw r8
            L35:
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                java.lang.String r9 = "No configs match configSpec"
                r8.<init>(r9)
                throw r8
            L3d:
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                java.lang.String r9 = "eglChooseConfig failed"
                r8.<init>(r9)
                throw r8
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class b extends com.amap.api.col.3l.y.a {

        /* renamed from: c, reason: collision with root package name */
        private int[] f4224c;

        /* renamed from: d, reason: collision with root package name */
        protected int f4225d;

        /* renamed from: e, reason: collision with root package name */
        protected int f4226e;

        /* renamed from: f, reason: collision with root package name */
        protected int f4227f;

        /* renamed from: g, reason: collision with root package name */
        protected int f4228g;

        /* renamed from: h, reason: collision with root package name */
        protected int f4229h;

        /* renamed from: i, reason: collision with root package name */
        protected int f4230i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.y f4231j;

        public b(com.amap.api.col.p0003l.y r2) {
                r1 = this;
                r1.f4231j = r2
                r0 = 13
                int[] r0 = new int[r0]
                r0 = {x0024: FILL_ARRAY_DATA , data: [12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 16, 12326, 0, 12344} // fill-array
                r1.<init>(r2, r0)
                r2 = 1
                int[] r2 = new int[r2]
                r1.f4224c = r2
                r2 = 8
                r1.f4225d = r2
                r1.f4226e = r2
                r1.f4227f = r2
                r2 = 0
                r1.f4228g = r2
                r0 = 16
                r1.f4229h = r0
                r1.f4230i = r2
                return
        }

        private int c(javax.microedition.khronos.egl.EGL10 r2, javax.microedition.khronos.egl.EGLDisplay r3, javax.microedition.khronos.egl.EGLConfig r4, int r5) {
                r1 = this;
                int[] r0 = r1.f4224c
                boolean r2 = r2.eglGetConfigAttrib(r3, r4, r5, r0)
                r3 = 0
                if (r2 == 0) goto Le
                int[] r2 = r1.f4224c
                r2 = r2[r3]
                return r2
            Le:
                return r3
        }

        @Override // com.amap.api.col.3l.y.a
        public final javax.microedition.khronos.egl.EGLConfig a(javax.microedition.khronos.egl.EGL10 r9, javax.microedition.khronos.egl.EGLDisplay r10, javax.microedition.khronos.egl.EGLConfig[] r11) {
                r8 = this;
                int r0 = r11.length
                r1 = 0
            L2:
                if (r1 >= r0) goto L46
                r2 = r11[r1]
                r3 = 12325(0x3025, float:1.7271E-41)
                int r3 = r8.c(r9, r10, r2, r3)
                r4 = 12326(0x3026, float:1.7272E-41)
                int r4 = r8.c(r9, r10, r2, r4)
                int r5 = r8.f4229h
                if (r3 < r5) goto L43
                int r3 = r8.f4230i
                if (r4 < r3) goto L43
                r3 = 12324(0x3024, float:1.727E-41)
                int r3 = r8.c(r9, r10, r2, r3)
                r4 = 12323(0x3023, float:1.7268E-41)
                int r4 = r8.c(r9, r10, r2, r4)
                r5 = 12322(0x3022, float:1.7267E-41)
                int r5 = r8.c(r9, r10, r2, r5)
                r6 = 12321(0x3021, float:1.7265E-41)
                int r6 = r8.c(r9, r10, r2, r6)
                int r7 = r8.f4225d
                if (r3 != r7) goto L43
                int r3 = r8.f4226e
                if (r4 != r3) goto L43
                int r3 = r8.f4227f
                if (r5 != r3) goto L43
                int r3 = r8.f4228g
                if (r6 != r3) goto L43
                return r2
            L43:
                int r1 = r1 + 1
                goto L2
            L46:
                r9 = 0
                return r9
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class c implements com.amap.api.col.3l.y.f {
        final /* synthetic */ com.amap.api.col.p0003l.y a;

        private c(com.amap.api.col.p0003l.y r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ c(com.amap.api.col.p0003l.y r1, byte r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.amap.api.col.3l.y.f
        public final javax.microedition.khronos.egl.EGLContext createContext(javax.microedition.khronos.egl.EGL10 r4, javax.microedition.khronos.egl.EGLDisplay r5, javax.microedition.khronos.egl.EGLConfig r6) {
                r3 = this;
                r0 = 3
                int[] r0 = new int[r0]
                r1 = 0
                r2 = 12440(0x3098, float:1.7432E-41)
                r0[r1] = r2
                com.amap.api.col.3l.y r1 = r3.a
                int r1 = com.amap.api.col.p0003l.y.a(r1)
                r2 = 1
                r0[r2] = r1
                r1 = 2
                r2 = 12344(0x3038, float:1.7298E-41)
                r0[r1] = r2
                com.amap.api.col.3l.y r1 = r3.a
                int r1 = com.amap.api.col.p0003l.y.a(r1)
                if (r1 == 0) goto L1f
                goto L20
            L1f:
                r0 = 0
            L20:
                javax.microedition.khronos.egl.EGLContext r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
                javax.microedition.khronos.egl.EGLContext r4 = r4.eglCreateContext(r5, r6, r1, r0)
                return r4
        }

        @Override // com.amap.api.col.3l.y.f
        public final void destroyContext(javax.microedition.khronos.egl.EGL10 r2, javax.microedition.khronos.egl.EGLDisplay r3, javax.microedition.khronos.egl.EGLContext r4) {
                r1 = this;
                boolean r0 = r2.eglDestroyContext(r3, r4)
                if (r0 != 0) goto L15
                java.util.Objects.toString(r3)
                java.util.Objects.toString(r4)
                java.lang.String r3 = "eglDestroyContex"
                int r2 = r2.eglGetError()
                com.amap.api.col.3l.y.h.c(r3, r2)
            L15:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class d implements com.amap.api.col.3l.y.g {
        private d() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ d(byte r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.amap.api.col.3l.y.g
        public final javax.microedition.khronos.egl.EGLSurface a(javax.microedition.khronos.egl.EGL10 r2, javax.microedition.khronos.egl.EGLDisplay r3, javax.microedition.khronos.egl.EGLConfig r4, java.lang.Object r5) {
                r1 = this;
                r0 = 0
                javax.microedition.khronos.egl.EGLSurface r2 = r2.eglCreateWindowSurface(r3, r4, r5, r0)     // Catch: java.lang.IllegalArgumentException -> L6
                return r2
            L6:
                return r0
        }

        @Override // com.amap.api.col.3l.y.g
        public final void b(javax.microedition.khronos.egl.EGL10 r1, javax.microedition.khronos.egl.EGLDisplay r2, javax.microedition.khronos.egl.EGLSurface r3) {
                r0 = this;
                r1.eglDestroySurface(r2, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface e {
        javax.microedition.khronos.egl.EGLConfig chooseConfig(javax.microedition.khronos.egl.EGL10 r1, javax.microedition.khronos.egl.EGLDisplay r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface f {
        javax.microedition.khronos.egl.EGLContext createContext(javax.microedition.khronos.egl.EGL10 r1, javax.microedition.khronos.egl.EGLDisplay r2, javax.microedition.khronos.egl.EGLConfig r3);

        void destroyContext(javax.microedition.khronos.egl.EGL10 r1, javax.microedition.khronos.egl.EGLDisplay r2, javax.microedition.khronos.egl.EGLContext r3);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface g {
        javax.microedition.khronos.egl.EGLSurface a(javax.microedition.khronos.egl.EGL10 r1, javax.microedition.khronos.egl.EGLDisplay r2, javax.microedition.khronos.egl.EGLConfig r3, java.lang.Object r4);

        void b(javax.microedition.khronos.egl.EGL10 r1, javax.microedition.khronos.egl.EGLDisplay r2, javax.microedition.khronos.egl.EGLSurface r3);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class h {
        private java.lang.ref.WeakReference<com.amap.api.col.p0003l.y> a;

        /* renamed from: b, reason: collision with root package name */
        javax.microedition.khronos.egl.EGL10 f4232b;

        /* renamed from: c, reason: collision with root package name */
        javax.microedition.khronos.egl.EGLDisplay f4233c;

        /* renamed from: d, reason: collision with root package name */
        javax.microedition.khronos.egl.EGLSurface f4234d;

        /* renamed from: e, reason: collision with root package name */
        javax.microedition.khronos.egl.EGLConfig f4235e;

        /* renamed from: f, reason: collision with root package name */
        javax.microedition.khronos.egl.EGLContext f4236f;

        public h(java.lang.ref.WeakReference<com.amap.api.col.p0003l.y> r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        private void b(java.lang.String r2) {
                r1 = this;
                javax.microedition.khronos.egl.EGL10 r0 = r1.f4232b
                int r0 = r0.eglGetError()
                c(r2, r0)
                return
        }

        public static void c(java.lang.String r0, int r1) {
                java.lang.String r0 = e(r0, r1)
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>(r0)
                throw r1
        }

        public static void d(java.lang.String r0, java.lang.String r1, int r2) {
                e(r1, r2)
                return
        }

        private static java.lang.String e(java.lang.String r1, int r2) {
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " failed: "
                r0.append(r1)
                r0.append(r2)
                java.lang.String r1 = r0.toString()
                return r1
        }

        private void k() {
                r4 = this;
                javax.microedition.khronos.egl.EGLSurface r0 = r4.f4234d
                if (r0 == 0) goto L2b
                javax.microedition.khronos.egl.EGLSurface r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE
                if (r0 == r1) goto L2b
                javax.microedition.khronos.egl.EGL10 r0 = r4.f4232b
                javax.microedition.khronos.egl.EGLDisplay r2 = r4.f4233c
                javax.microedition.khronos.egl.EGLContext r3 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
                r0.eglMakeCurrent(r2, r1, r1, r3)
                java.lang.ref.WeakReference<com.amap.api.col.3l.y> r0 = r4.a
                java.lang.Object r0 = r0.get()
                com.amap.api.col.3l.y r0 = (com.amap.api.col.p0003l.y) r0
                if (r0 == 0) goto L28
                com.amap.api.col.3l.y$g r0 = com.amap.api.col.p0003l.y.i(r0)
                javax.microedition.khronos.egl.EGL10 r1 = r4.f4232b
                javax.microedition.khronos.egl.EGLDisplay r2 = r4.f4233c
                javax.microedition.khronos.egl.EGLSurface r3 = r4.f4234d
                r0.b(r1, r2, r3)
            L28:
                r0 = 0
                r4.f4234d = r0
            L2b:
                return
        }

        public final void a() {
                r5 = this;
                javax.microedition.khronos.egl.EGL r0 = javax.microedition.khronos.egl.EGLContext.getEGL()
                javax.microedition.khronos.egl.EGL10 r0 = (javax.microedition.khronos.egl.EGL10) r0
                r5.f4232b = r0
                java.lang.Object r1 = javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY
                javax.microedition.khronos.egl.EGLDisplay r0 = r0.eglGetDisplay(r1)
                r5.f4233c = r0
                javax.microedition.khronos.egl.EGLDisplay r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY
                if (r0 == r1) goto L67
                r1 = 2
                int[] r1 = new int[r1]
                javax.microedition.khronos.egl.EGL10 r2 = r5.f4232b
                boolean r0 = r2.eglInitialize(r0, r1)
                if (r0 == 0) goto L5f
                java.lang.ref.WeakReference<com.amap.api.col.3l.y> r0 = r5.a
                java.lang.Object r0 = r0.get()
                com.amap.api.col.3l.y r0 = (com.amap.api.col.p0003l.y) r0
                r1 = 0
                if (r0 != 0) goto L2f
                r5.f4235e = r1
                r5.f4236f = r1
                goto L4d
            L2f:
                com.amap.api.col.3l.y$e r2 = com.amap.api.col.p0003l.y.e(r0)
                javax.microedition.khronos.egl.EGL10 r3 = r5.f4232b
                javax.microedition.khronos.egl.EGLDisplay r4 = r5.f4233c
                javax.microedition.khronos.egl.EGLConfig r2 = r2.chooseConfig(r3, r4)
                r5.f4235e = r2
                com.amap.api.col.3l.y$f r0 = com.amap.api.col.p0003l.y.g(r0)
                javax.microedition.khronos.egl.EGL10 r2 = r5.f4232b
                javax.microedition.khronos.egl.EGLDisplay r3 = r5.f4233c
                javax.microedition.khronos.egl.EGLConfig r4 = r5.f4235e
                javax.microedition.khronos.egl.EGLContext r0 = r0.createContext(r2, r3, r4)
                r5.f4236f = r0
            L4d:
                javax.microedition.khronos.egl.EGLContext r0 = r5.f4236f
                if (r0 == 0) goto L55
                javax.microedition.khronos.egl.EGLContext r2 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
                if (r0 != r2) goto L5c
            L55:
                r5.f4236f = r1
                java.lang.String r0 = "createContext"
                r5.b(r0)
            L5c:
                r5.f4234d = r1
                return
            L5f:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.String r1 = "eglInitialize failed"
                r0.<init>(r1)
                throw r0
            L67:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.String r1 = "eglGetDisplay failed"
                r0.<init>(r1)
                throw r0
        }

        public final boolean f() {
                r5 = this;
                javax.microedition.khronos.egl.EGL10 r0 = r5.f4232b
                if (r0 == 0) goto L6d
                javax.microedition.khronos.egl.EGLDisplay r0 = r5.f4233c
                if (r0 == 0) goto L65
                javax.microedition.khronos.egl.EGLConfig r0 = r5.f4235e
                if (r0 == 0) goto L5d
                r5.k()
                java.lang.ref.WeakReference<com.amap.api.col.3l.y> r0 = r5.a
                java.lang.Object r0 = r0.get()
                com.amap.api.col.3l.y r0 = (com.amap.api.col.p0003l.y) r0
                if (r0 == 0) goto L2e
                com.amap.api.col.3l.y$g r1 = com.amap.api.col.p0003l.y.i(r0)
                javax.microedition.khronos.egl.EGL10 r2 = r5.f4232b
                javax.microedition.khronos.egl.EGLDisplay r3 = r5.f4233c
                javax.microedition.khronos.egl.EGLConfig r4 = r5.f4235e
                android.graphics.SurfaceTexture r0 = r0.getSurfaceTexture()
                javax.microedition.khronos.egl.EGLSurface r0 = r1.a(r2, r3, r4, r0)
                r5.f4234d = r0
                goto L31
            L2e:
                r0 = 0
                r5.f4234d = r0
            L31:
                javax.microedition.khronos.egl.EGLSurface r0 = r5.f4234d
                r1 = 0
                if (r0 == 0) goto L57
                javax.microedition.khronos.egl.EGLSurface r2 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE
                if (r0 != r2) goto L3b
                goto L57
            L3b:
                javax.microedition.khronos.egl.EGL10 r2 = r5.f4232b
                javax.microedition.khronos.egl.EGLDisplay r3 = r5.f4233c
                javax.microedition.khronos.egl.EGLContext r4 = r5.f4236f
                boolean r0 = r2.eglMakeCurrent(r3, r0, r0, r4)
                if (r0 != 0) goto L55
                javax.microedition.khronos.egl.EGL10 r0 = r5.f4232b
                int r0 = r0.eglGetError()
                java.lang.String r2 = "EGLHelper"
                java.lang.String r3 = "eglMakeCurrent"
                d(r2, r3, r0)
                return r1
            L55:
                r0 = 1
                return r0
            L57:
                javax.microedition.khronos.egl.EGL10 r0 = r5.f4232b
                r0.eglGetError()
                return r1
            L5d:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.String r1 = "mEglConfig not initialized"
                r0.<init>(r1)
                throw r0
            L65:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.String r1 = "eglDisplay not initialized"
                r0.<init>(r1)
                throw r0
            L6d:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.String r1 = "egl not initialized"
                r0.<init>(r1)
                throw r0
        }

        final javax.microedition.khronos.opengles.GL g() {
                r4 = this;
                javax.microedition.khronos.egl.EGLContext r0 = r4.f4236f
                javax.microedition.khronos.opengles.GL r0 = r0.getGL()
                java.lang.ref.WeakReference<com.amap.api.col.3l.y> r1 = r4.a
                java.lang.Object r1 = r1.get()
                com.amap.api.col.3l.y r1 = (com.amap.api.col.p0003l.y) r1
                if (r1 == 0) goto L43
                com.amap.api.col.3l.y$k r2 = com.amap.api.col.p0003l.y.k(r1)
                if (r2 == 0) goto L1e
                com.amap.api.col.3l.y$k r0 = com.amap.api.col.p0003l.y.k(r1)
                javax.microedition.khronos.opengles.GL r0 = r0.a()
            L1e:
                int r2 = com.amap.api.col.p0003l.y.m(r1)
                r2 = r2 & 3
                if (r2 == 0) goto L43
                int r2 = com.amap.api.col.p0003l.y.m(r1)
                r3 = 1
                r2 = r2 & r3
                if (r2 == 0) goto L2f
                goto L30
            L2f:
                r3 = 0
            L30:
                int r1 = com.amap.api.col.p0003l.y.m(r1)
                r1 = r1 & 2
                if (r1 == 0) goto L3e
                com.amap.api.col.3l.y$l r1 = new com.amap.api.col.3l.y$l
                r1.<init>()
                goto L3f
            L3e:
                r1 = 0
            L3f:
                javax.microedition.khronos.opengles.GL r0 = android.opengl.GLDebugHelper.wrap(r0, r3, r1)
            L43:
                return r0
        }

        public final int h() {
                r3 = this;
                javax.microedition.khronos.egl.EGL10 r0 = r3.f4232b
                javax.microedition.khronos.egl.EGLDisplay r1 = r3.f4233c
                javax.microedition.khronos.egl.EGLSurface r2 = r3.f4234d
                boolean r0 = r0.eglSwapBuffers(r1, r2)
                if (r0 != 0) goto L13
                javax.microedition.khronos.egl.EGL10 r0 = r3.f4232b
                int r0 = r0.eglGetError()
                return r0
            L13:
                r0 = 12288(0x3000, float:1.7219E-41)
                return r0
        }

        public final void i() {
                r0 = this;
                r0.k()
                return
        }

        public final void j() {
                r5 = this;
                javax.microedition.khronos.egl.EGLContext r0 = r5.f4236f
                r1 = 0
                if (r0 == 0) goto L1e
                java.lang.ref.WeakReference<com.amap.api.col.3l.y> r0 = r5.a
                java.lang.Object r0 = r0.get()
                com.amap.api.col.3l.y r0 = (com.amap.api.col.p0003l.y) r0
                if (r0 == 0) goto L1c
                com.amap.api.col.3l.y$f r0 = com.amap.api.col.p0003l.y.g(r0)
                javax.microedition.khronos.egl.EGL10 r2 = r5.f4232b
                javax.microedition.khronos.egl.EGLDisplay r3 = r5.f4233c
                javax.microedition.khronos.egl.EGLContext r4 = r5.f4236f
                r0.destroyContext(r2, r3, r4)
            L1c:
                r5.f4236f = r1
            L1e:
                javax.microedition.khronos.egl.EGLDisplay r0 = r5.f4233c
                if (r0 == 0) goto L29
                javax.microedition.khronos.egl.EGL10 r2 = r5.f4232b
                r2.eglTerminate(r0)
                r5.f4233c = r1
            L29:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class i extends java.lang.Thread {
        private boolean a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f4237b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f4238c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f4239d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f4240e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f4241f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f4242g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f4243h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f4244i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f4245j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f4246k;
        private int l;
        private int m;
        private int n;
        private boolean o;
        private boolean p;
        private java.util.ArrayList<java.lang.Runnable> q;
        private boolean r;
        private com.amap.api.col.3l.y.h s;
        private java.lang.ref.WeakReference<com.amap.api.col.p0003l.y> t;

        i(java.lang.ref.WeakReference<com.amap.api.col.p0003l.y> r3) {
                r2 = this;
                r2.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.q = r0
                r0 = 1
                r2.r = r0
                r1 = 0
                r2.l = r1
                r2.m = r1
                r2.o = r0
                r2.n = r0
                r2.t = r3
                return
        }

        static /* synthetic */ boolean e(com.amap.api.col.3l.y.i r1) {
                r0 = 1
                r1.f4237b = r0
                return r0
        }

        private void o() {
                r1 = this;
                boolean r0 = r1.f4244i
                if (r0 == 0) goto Lc
                r0 = 0
                r1.f4244i = r0
                com.amap.api.col.3l.y$h r0 = r1.s
                r0.i()
            Lc:
                return
        }

        private void p() {
                r1 = this;
                boolean r0 = r1.f4243h
                if (r0 == 0) goto L13
                com.amap.api.col.3l.y$h r0 = r1.s
                r0.j()
                r0 = 0
                r1.f4243h = r0
                com.amap.api.col.3l.y$j r0 = com.amap.api.col.p0003l.y.j()
                r0.g(r1)
            L13:
                return
        }

        private void q() throws java.lang.InterruptedException {
                r16 = this;
                r1 = r16
                com.amap.api.col.3l.y$h r0 = new com.amap.api.col.3l.y$h
                java.lang.ref.WeakReference<com.amap.api.col.3l.y> r2 = r1.t
                r0.<init>(r2)
                r1.s = r0
                r0 = 0
                r1.f4243h = r0
                r1.f4244i = r0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
            L1b:
                r14 = 0
            L1c:
                com.amap.api.col.3l.y$j r15 = com.amap.api.col.p0003l.y.j()     // Catch: java.lang.Throwable -> L157
                monitor-enter(r15)     // Catch: java.lang.Throwable -> L157
            L21:
                boolean r2 = r1.a     // Catch: java.lang.Throwable -> L36
                if (r2 == 0) goto L39
                monitor-exit(r15)     // Catch: java.lang.Throwable -> L36
                com.amap.api.col.3l.y$j r2 = com.amap.api.col.p0003l.y.j()
                monitor-enter(r2)
                r1.o()     // Catch: java.lang.Throwable -> L33
                r1.p()     // Catch: java.lang.Throwable -> L33
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L33
                return
            L33:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L33
                throw r0
            L36:
                r0 = move-exception
                goto L21d
            L39:
                java.util.ArrayList<java.lang.Runnable> r2 = r1.q     // Catch: java.lang.Throwable -> L36
                boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L36
                if (r2 != 0) goto L4e
                java.util.ArrayList<java.lang.Runnable> r2 = r1.q     // Catch: java.lang.Throwable -> L36
                r14 = 0
                java.lang.Object r2 = r2.remove(r14)     // Catch: java.lang.Throwable -> L36
                r14 = r2
                java.lang.Runnable r14 = (java.lang.Runnable) r14     // Catch: java.lang.Throwable -> L36
                r2 = 0
                goto L14e
            L4e:
                boolean r2 = r1.f4239d     // Catch: java.lang.Throwable -> L36
                boolean r0 = r1.f4238c     // Catch: java.lang.Throwable -> L36
                if (r2 == r0) goto L5e
                r1.f4239d = r0     // Catch: java.lang.Throwable -> L36
                com.amap.api.col.3l.y$j r2 = com.amap.api.col.p0003l.y.j()     // Catch: java.lang.Throwable -> L36
                r2.notifyAll()     // Catch: java.lang.Throwable -> L36
                goto L5f
            L5e:
                r0 = 0
            L5f:
                boolean r2 = r1.f4246k     // Catch: java.lang.Throwable -> L36
                if (r2 == 0) goto L6d
                r1.o()     // Catch: java.lang.Throwable -> L36
                r1.p()     // Catch: java.lang.Throwable -> L36
                r2 = 0
                r1.f4246k = r2     // Catch: java.lang.Throwable -> L36
                r5 = 1
            L6d:
                if (r3 == 0) goto L76
                r1.o()     // Catch: java.lang.Throwable -> L36
                r1.p()     // Catch: java.lang.Throwable -> L36
                r3 = 0
            L76:
                if (r0 == 0) goto L7f
                boolean r2 = r1.f4244i     // Catch: java.lang.Throwable -> L36
                if (r2 == 0) goto L7f
                r1.o()     // Catch: java.lang.Throwable -> L36
            L7f:
                if (r0 == 0) goto La4
                boolean r2 = r1.f4243h     // Catch: java.lang.Throwable -> L36
                if (r2 == 0) goto La4
                java.lang.ref.WeakReference<com.amap.api.col.3l.y> r2 = r1.t     // Catch: java.lang.Throwable -> L36
                java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L36
                com.amap.api.col.3l.y r2 = (com.amap.api.col.p0003l.y) r2     // Catch: java.lang.Throwable -> L36
                if (r2 != 0) goto L91
                r2 = 0
                goto L95
            L91:
                boolean r2 = com.amap.api.col.p0003l.y.o(r2)     // Catch: java.lang.Throwable -> L36
            L95:
                if (r2 == 0) goto La1
                com.amap.api.col.3l.y$j r2 = com.amap.api.col.p0003l.y.j()     // Catch: java.lang.Throwable -> L36
                boolean r2 = r2.c()     // Catch: java.lang.Throwable -> L36
                if (r2 == 0) goto La4
            La1:
                r1.p()     // Catch: java.lang.Throwable -> L36
            La4:
                if (r0 == 0) goto Lb5
                com.amap.api.col.3l.y$j r0 = com.amap.api.col.p0003l.y.j()     // Catch: java.lang.Throwable -> L36
                boolean r0 = r0.d()     // Catch: java.lang.Throwable -> L36
                if (r0 == 0) goto Lb5
                com.amap.api.col.3l.y$h r0 = r1.s     // Catch: java.lang.Throwable -> L36
                r0.j()     // Catch: java.lang.Throwable -> L36
            Lb5:
                boolean r0 = r1.f4240e     // Catch: java.lang.Throwable -> L36
                if (r0 != 0) goto Ld1
                boolean r0 = r1.f4242g     // Catch: java.lang.Throwable -> L36
                if (r0 != 0) goto Ld1
                boolean r0 = r1.f4244i     // Catch: java.lang.Throwable -> L36
                if (r0 == 0) goto Lc4
                r1.o()     // Catch: java.lang.Throwable -> L36
            Lc4:
                r0 = 1
                r1.f4242g = r0     // Catch: java.lang.Throwable -> L36
                r2 = 0
                r1.f4241f = r2     // Catch: java.lang.Throwable -> L36
                com.amap.api.col.3l.y$j r0 = com.amap.api.col.p0003l.y.j()     // Catch: java.lang.Throwable -> L36
                r0.notifyAll()     // Catch: java.lang.Throwable -> L36
            Ld1:
                boolean r0 = r1.f4240e     // Catch: java.lang.Throwable -> L36
                if (r0 == 0) goto Le3
                boolean r0 = r1.f4242g     // Catch: java.lang.Throwable -> L36
                if (r0 == 0) goto Le3
                r2 = 0
                r1.f4242g = r2     // Catch: java.lang.Throwable -> L36
                com.amap.api.col.3l.y$j r0 = com.amap.api.col.p0003l.y.j()     // Catch: java.lang.Throwable -> L36
                r0.notifyAll()     // Catch: java.lang.Throwable -> L36
            Le3:
                if (r4 == 0) goto Lf1
                r0 = 1
                r1.p = r0     // Catch: java.lang.Throwable -> L36
                com.amap.api.col.3l.y$j r0 = com.amap.api.col.p0003l.y.j()     // Catch: java.lang.Throwable -> L36
                r0.notifyAll()     // Catch: java.lang.Throwable -> L36
                r4 = 0
                r13 = 0
            Lf1:
                boolean r0 = r1.s()     // Catch: java.lang.Throwable -> L36
                if (r0 == 0) goto L213
                boolean r0 = r1.f4243h     // Catch: java.lang.Throwable -> L36
                if (r0 != 0) goto L123
                if (r5 == 0) goto Lff
                r5 = 0
                goto L123
            Lff:
                com.amap.api.col.3l.y$j r0 = com.amap.api.col.p0003l.y.j()     // Catch: java.lang.Throwable -> L36
                boolean r0 = r0.e(r1)     // Catch: java.lang.Throwable -> L36
                if (r0 == 0) goto L123
                com.amap.api.col.3l.y$h r0 = r1.s     // Catch: java.lang.Throwable -> L36 java.lang.RuntimeException -> L11a
                r0.a()     // Catch: java.lang.Throwable -> L36 java.lang.RuntimeException -> L11a
                r0 = 1
                r1.f4243h = r0     // Catch: java.lang.Throwable -> L36
                com.amap.api.col.3l.y$j r0 = com.amap.api.col.p0003l.y.j()     // Catch: java.lang.Throwable -> L36
                r0.notifyAll()     // Catch: java.lang.Throwable -> L36
                r7 = 1
                goto L123
            L11a:
                r0 = move-exception
                com.amap.api.col.3l.y$j r2 = com.amap.api.col.p0003l.y.j()     // Catch: java.lang.Throwable -> L36
                r2.g(r1)     // Catch: java.lang.Throwable -> L36
                throw r0     // Catch: java.lang.Throwable -> L36
            L123:
                boolean r0 = r1.f4243h     // Catch: java.lang.Throwable -> L36
                if (r0 == 0) goto L131
                boolean r0 = r1.f4244i     // Catch: java.lang.Throwable -> L36
                if (r0 != 0) goto L131
                r0 = 1
                r1.f4244i = r0     // Catch: java.lang.Throwable -> L36
                r8 = 1
                r9 = 1
                r10 = 1
            L131:
                boolean r0 = r1.f4244i     // Catch: java.lang.Throwable -> L36
                if (r0 == 0) goto L213
                boolean r0 = r1.r     // Catch: java.lang.Throwable -> L36
                if (r0 == 0) goto L144
                int r11 = r1.l     // Catch: java.lang.Throwable -> L36
                int r12 = r1.m     // Catch: java.lang.Throwable -> L36
                r2 = 0
                r1.r = r2     // Catch: java.lang.Throwable -> L36
                r8 = 1
                r10 = 1
                r13 = 1
                goto L145
            L144:
                r2 = 0
            L145:
                r1.o = r2     // Catch: java.lang.Throwable -> L36
                com.amap.api.col.3l.y$j r0 = com.amap.api.col.p0003l.y.j()     // Catch: java.lang.Throwable -> L36
                r0.notifyAll()     // Catch: java.lang.Throwable -> L36
            L14e:
                monitor-exit(r15)     // Catch: java.lang.Throwable -> L36
                if (r14 == 0) goto L15a
                r14.run()     // Catch: java.lang.Throwable -> L157
                r0 = 0
                goto L1b
            L157:
                r0 = move-exception
                goto L21f
            L15a:
                if (r8 == 0) goto L191
                com.amap.api.col.3l.y$h r0 = r1.s     // Catch: java.lang.Throwable -> L157
                boolean r0 = r0.f()     // Catch: java.lang.Throwable -> L157
                if (r0 == 0) goto L179
                com.amap.api.col.3l.y$j r8 = com.amap.api.col.p0003l.y.j()     // Catch: java.lang.Throwable -> L157
                monitor-enter(r8)     // Catch: java.lang.Throwable -> L157
                r0 = 1
                r1.f4245j = r0     // Catch: java.lang.Throwable -> L176
                com.amap.api.col.3l.y$j r0 = com.amap.api.col.p0003l.y.j()     // Catch: java.lang.Throwable -> L176
                r0.notifyAll()     // Catch: java.lang.Throwable -> L176
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L176
                r8 = 0
                goto L191
            L176:
                r0 = move-exception
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L176
                throw r0     // Catch: java.lang.Throwable -> L157
            L179:
                com.amap.api.col.3l.y$j r15 = com.amap.api.col.p0003l.y.j()     // Catch: java.lang.Throwable -> L157
                monitor-enter(r15)     // Catch: java.lang.Throwable -> L157
                r0 = 1
                r1.f4245j = r0     // Catch: java.lang.Throwable -> L18e
                r1.f4241f = r0     // Catch: java.lang.Throwable -> L18e
                com.amap.api.col.3l.y$j r0 = com.amap.api.col.p0003l.y.j()     // Catch: java.lang.Throwable -> L18e
                r0.notifyAll()     // Catch: java.lang.Throwable -> L18e
                monitor-exit(r15)     // Catch: java.lang.Throwable -> L18e
            L18b:
                r0 = 0
                goto L1c
            L18e:
                r0 = move-exception
                monitor-exit(r15)     // Catch: java.lang.Throwable -> L18e
                throw r0     // Catch: java.lang.Throwable -> L157
            L191:
                if (r9 == 0) goto L1a4
                com.amap.api.col.3l.y$h r0 = r1.s     // Catch: java.lang.Throwable -> L157
                javax.microedition.khronos.opengles.GL r0 = r0.g()     // Catch: java.lang.Throwable -> L157
                javax.microedition.khronos.opengles.GL10 r0 = (javax.microedition.khronos.opengles.GL10) r0     // Catch: java.lang.Throwable -> L157
                com.amap.api.col.3l.y$j r6 = com.amap.api.col.p0003l.y.j()     // Catch: java.lang.Throwable -> L157
                r6.b(r0)     // Catch: java.lang.Throwable -> L157
                r6 = r0
                r9 = 0
            L1a4:
                if (r7 == 0) goto L1bc
                java.lang.ref.WeakReference<com.amap.api.col.3l.y> r0 = r1.t     // Catch: java.lang.Throwable -> L157
                java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L157
                com.amap.api.col.3l.y r0 = (com.amap.api.col.p0003l.y) r0     // Catch: java.lang.Throwable -> L157
                if (r0 == 0) goto L1bb
                android.opengl.GLSurfaceView$Renderer r0 = com.amap.api.col.p0003l.y.p(r0)     // Catch: java.lang.Throwable -> L157
                com.amap.api.col.3l.y$h r7 = r1.s     // Catch: java.lang.Throwable -> L157
                javax.microedition.khronos.egl.EGLConfig r7 = r7.f4235e     // Catch: java.lang.Throwable -> L157
                r0.onSurfaceCreated(r6, r7)     // Catch: java.lang.Throwable -> L157
            L1bb:
                r7 = 0
            L1bc:
                if (r10 == 0) goto L1d0
                java.lang.ref.WeakReference<com.amap.api.col.3l.y> r0 = r1.t     // Catch: java.lang.Throwable -> L157
                java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L157
                com.amap.api.col.3l.y r0 = (com.amap.api.col.p0003l.y) r0     // Catch: java.lang.Throwable -> L157
                if (r0 == 0) goto L1cf
                android.opengl.GLSurfaceView$Renderer r0 = com.amap.api.col.p0003l.y.p(r0)     // Catch: java.lang.Throwable -> L157
                r0.onSurfaceChanged(r6, r11, r12)     // Catch: java.lang.Throwable -> L157
            L1cf:
                r10 = 0
            L1d0:
                java.lang.ref.WeakReference<com.amap.api.col.3l.y> r0 = r1.t     // Catch: java.lang.Throwable -> L157
                java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L157
                com.amap.api.col.3l.y r0 = (com.amap.api.col.p0003l.y) r0     // Catch: java.lang.Throwable -> L157
                if (r0 == 0) goto L1e1
                android.opengl.GLSurfaceView$Renderer r0 = com.amap.api.col.p0003l.y.p(r0)     // Catch: java.lang.Throwable -> L157
                r0.onDrawFrame(r6)     // Catch: java.lang.Throwable -> L157
            L1e1:
                com.amap.api.col.3l.y$h r0 = r1.s     // Catch: java.lang.Throwable -> L157
                int r0 = r0.h()     // Catch: java.lang.Throwable -> L157
                r15 = 12288(0x3000, float:1.7219E-41)
                if (r0 == r15) goto L20d
                r15 = 12302(0x300e, float:1.7239E-41)
                if (r0 == r15) goto L20a
                java.lang.String r15 = "GLThread"
                java.lang.String r2 = "eglSwapBuffers"
                com.amap.api.col.3l.y.h.d(r15, r2, r0)     // Catch: java.lang.Throwable -> L157
                com.amap.api.col.3l.y$j r2 = com.amap.api.col.p0003l.y.j()     // Catch: java.lang.Throwable -> L157
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L157
                r0 = 1
                r1.f4241f = r0     // Catch: java.lang.Throwable -> L207
                com.amap.api.col.3l.y$j r15 = com.amap.api.col.p0003l.y.j()     // Catch: java.lang.Throwable -> L207
                r15.notifyAll()     // Catch: java.lang.Throwable -> L207
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L207
                goto L20e
            L207:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L207
                throw r0     // Catch: java.lang.Throwable -> L157
            L20a:
                r0 = 1
                r3 = 1
                goto L20e
            L20d:
                r0 = 1
            L20e:
                if (r13 == 0) goto L18b
                r4 = 1
                goto L18b
            L213:
                com.amap.api.col.3l.y$j r0 = com.amap.api.col.p0003l.y.j()     // Catch: java.lang.Throwable -> L36
                r0.wait()     // Catch: java.lang.Throwable -> L36
                r0 = 0
                goto L21
            L21d:
                monitor-exit(r15)     // Catch: java.lang.Throwable -> L36
                throw r0     // Catch: java.lang.Throwable -> L157
            L21f:
                com.amap.api.col.3l.y$j r2 = com.amap.api.col.p0003l.y.j()
                monitor-enter(r2)
                r1.o()     // Catch: java.lang.Throwable -> L22c
                r1.p()     // Catch: java.lang.Throwable -> L22c
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L22c
                throw r0
            L22c:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L22c
                throw r0
        }

        private boolean r() {
                r1 = this;
                boolean r0 = r1.f4243h
                if (r0 == 0) goto L10
                boolean r0 = r1.f4244i
                if (r0 == 0) goto L10
                boolean r0 = r1.s()
                if (r0 == 0) goto L10
                r0 = 1
                return r0
            L10:
                r0 = 0
                return r0
        }

        private boolean s() {
                r2 = this;
                boolean r0 = r2.f4239d
                if (r0 != 0) goto L1e
                boolean r0 = r2.f4240e
                if (r0 == 0) goto L1e
                boolean r0 = r2.f4241f
                if (r0 != 0) goto L1e
                int r0 = r2.l
                if (r0 <= 0) goto L1e
                int r0 = r2.m
                if (r0 <= 0) goto L1e
                boolean r0 = r2.o
                r1 = 1
                if (r0 != 0) goto L1d
                int r0 = r2.n
                if (r0 != r1) goto L1e
            L1d:
                return r1
            L1e:
                r0 = 0
                return r0
        }

        public final int a() {
                r2 = this;
                com.amap.api.col.3l.y$j r0 = com.amap.api.col.p0003l.y.j()
                monitor-enter(r0)
                int r1 = r2.n     // Catch: java.lang.Throwable -> L9
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
                return r1
            L9:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
                throw r1
        }

        public final void b(int r2) {
                r1 = this;
                if (r2 < 0) goto L18
                r0 = 1
                if (r2 > r0) goto L18
                com.amap.api.col.3l.y$j r0 = com.amap.api.col.p0003l.y.j()
                monitor-enter(r0)
                r1.n = r2     // Catch: java.lang.Throwable -> L15
                com.amap.api.col.3l.y$j r2 = com.amap.api.col.p0003l.y.j()     // Catch: java.lang.Throwable -> L15
                r2.notifyAll()     // Catch: java.lang.Throwable -> L15
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
                return
            L15:
                r2 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
                throw r2
            L18:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "renderMode"
                r2.<init>(r0)
                throw r2
        }

        public final void c(int r2, int r3) {
                r1 = this;
                com.amap.api.col.3l.y$j r0 = com.amap.api.col.p0003l.y.j()
                monitor-enter(r0)
                r1.l = r2     // Catch: java.lang.Throwable -> L32
                r1.m = r3     // Catch: java.lang.Throwable -> L32
                r2 = 1
                r1.r = r2     // Catch: java.lang.Throwable -> L32
                r1.o = r2     // Catch: java.lang.Throwable -> L32
                r2 = 0
                r1.p = r2     // Catch: java.lang.Throwable -> L32
                com.amap.api.col.3l.y$j r2 = com.amap.api.col.p0003l.y.j()     // Catch: java.lang.Throwable -> L32
                r2.notifyAll()     // Catch: java.lang.Throwable -> L32
            L18:
                boolean r2 = r1.f4237b     // Catch: java.lang.Throwable -> L32
                if (r2 != 0) goto L3c
                boolean r2 = r1.f4239d     // Catch: java.lang.Throwable -> L32
                if (r2 != 0) goto L3c
                boolean r2 = r1.p     // Catch: java.lang.Throwable -> L32
                if (r2 != 0) goto L3c
                boolean r2 = r1.r()     // Catch: java.lang.Throwable -> L32
                if (r2 == 0) goto L3c
                com.amap.api.col.3l.y$j r2 = com.amap.api.col.p0003l.y.j()     // Catch: java.lang.Throwable -> L32 java.lang.InterruptedException -> L34
                r2.wait()     // Catch: java.lang.Throwable -> L32 java.lang.InterruptedException -> L34
                goto L18
            L32:
                r2 = move-exception
                goto L3e
            L34:
                java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L32
                r2.interrupt()     // Catch: java.lang.Throwable -> L32
                goto L18
            L3c:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
                return
            L3e:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
                throw r2
        }

        public final void d(java.lang.Runnable r3) {
                r2 = this;
                if (r3 == 0) goto L18
                com.amap.api.col.3l.y$j r0 = com.amap.api.col.p0003l.y.j()
                monitor-enter(r0)
                java.util.ArrayList<java.lang.Runnable> r1 = r2.q     // Catch: java.lang.Throwable -> L15
                r1.add(r3)     // Catch: java.lang.Throwable -> L15
                com.amap.api.col.3l.y$j r3 = com.amap.api.col.p0003l.y.j()     // Catch: java.lang.Throwable -> L15
                r3.notifyAll()     // Catch: java.lang.Throwable -> L15
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
                return
            L15:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
                throw r3
            L18:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "r must not be null"
                r3.<init>(r0)
                throw r3
        }

        public final void f() {
                r2 = this;
                com.amap.api.col.3l.y$j r0 = com.amap.api.col.p0003l.y.j()
                monitor-enter(r0)
                r1 = 1
                r2.o = r1     // Catch: java.lang.Throwable -> L11
                com.amap.api.col.3l.y$j r1 = com.amap.api.col.p0003l.y.j()     // Catch: java.lang.Throwable -> L11
                r1.notifyAll()     // Catch: java.lang.Throwable -> L11
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
                return
            L11:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
                throw r1
        }

        public final void g() {
                r2 = this;
                com.amap.api.col.3l.y$j r0 = com.amap.api.col.p0003l.y.j()
                monitor-enter(r0)
                r1 = 1
                r2.f4240e = r1     // Catch: java.lang.Throwable -> L26
                r1 = 0
                r2.f4245j = r1     // Catch: java.lang.Throwable -> L26
                com.amap.api.col.3l.y$j r1 = com.amap.api.col.p0003l.y.j()     // Catch: java.lang.Throwable -> L26
                r1.notifyAll()     // Catch: java.lang.Throwable -> L26
            L12:
                boolean r1 = r2.f4242g     // Catch: java.lang.Throwable -> L26
                if (r1 == 0) goto L30
                boolean r1 = r2.f4245j     // Catch: java.lang.Throwable -> L26
                if (r1 != 0) goto L30
                boolean r1 = r2.f4237b     // Catch: java.lang.Throwable -> L26
                if (r1 != 0) goto L30
                com.amap.api.col.3l.y$j r1 = com.amap.api.col.p0003l.y.j()     // Catch: java.lang.Throwable -> L26 java.lang.InterruptedException -> L28
                r1.wait()     // Catch: java.lang.Throwable -> L26 java.lang.InterruptedException -> L28
                goto L12
            L26:
                r1 = move-exception
                goto L32
            L28:
                java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L26
                r1.interrupt()     // Catch: java.lang.Throwable -> L26
                goto L12
            L30:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
                return
            L32:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
                throw r1
        }

        public final void h() {
                r4 = this;
                com.amap.api.col.3l.y$j r0 = com.amap.api.col.p0003l.y.j()
                monitor-enter(r0)
                r1 = 0
                r4.f4240e = r1     // Catch: java.lang.Throwable -> L25
                com.amap.api.col.3l.y$j r1 = com.amap.api.col.p0003l.y.j()     // Catch: java.lang.Throwable -> L25
                r1.notifyAll()     // Catch: java.lang.Throwable -> L25
            Lf:
                boolean r1 = r4.f4242g     // Catch: java.lang.Throwable -> L25
                if (r1 != 0) goto L39
                boolean r1 = r4.f4237b     // Catch: java.lang.Throwable -> L25
                if (r1 != 0) goto L39
                boolean r1 = com.amap.api.maps.MapsInitializer.getTextureViewDestorySync()     // Catch: java.lang.Throwable -> L25 java.lang.InterruptedException -> L31
                if (r1 == 0) goto L27
                com.amap.api.col.3l.y$j r1 = com.amap.api.col.p0003l.y.j()     // Catch: java.lang.Throwable -> L25 java.lang.InterruptedException -> L31
                r1.wait()     // Catch: java.lang.Throwable -> L25 java.lang.InterruptedException -> L31
                goto Lf
            L25:
                r1 = move-exception
                goto L3b
            L27:
                com.amap.api.col.3l.y$j r1 = com.amap.api.col.p0003l.y.j()     // Catch: java.lang.Throwable -> L25 java.lang.InterruptedException -> L31
                r2 = 2000(0x7d0, double:9.88E-321)
                r1.wait(r2)     // Catch: java.lang.Throwable -> L25 java.lang.InterruptedException -> L31
                goto Lf
            L31:
                java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L25
                r1.interrupt()     // Catch: java.lang.Throwable -> L25
                goto Lf
            L39:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
                return
            L3b:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
                throw r1
        }

        public final void i() {
                r4 = this;
                com.amap.api.col.3l.y$j r0 = com.amap.api.col.p0003l.y.j()
                monitor-enter(r0)
                r1 = 1
                r4.f4238c = r1     // Catch: java.lang.Throwable -> L25
                com.amap.api.col.3l.y$j r1 = com.amap.api.col.p0003l.y.j()     // Catch: java.lang.Throwable -> L25
                r1.notifyAll()     // Catch: java.lang.Throwable -> L25
            Lf:
                boolean r1 = r4.f4237b     // Catch: java.lang.Throwable -> L25
                if (r1 != 0) goto L39
                boolean r1 = r4.f4239d     // Catch: java.lang.Throwable -> L25
                if (r1 != 0) goto L39
                boolean r1 = com.amap.api.maps.MapsInitializer.getTextureViewDestorySync()     // Catch: java.lang.Throwable -> L25 java.lang.InterruptedException -> L31
                if (r1 == 0) goto L27
                com.amap.api.col.3l.y$j r1 = com.amap.api.col.p0003l.y.j()     // Catch: java.lang.Throwable -> L25 java.lang.InterruptedException -> L31
                r1.wait()     // Catch: java.lang.Throwable -> L25 java.lang.InterruptedException -> L31
                goto Lf
            L25:
                r1 = move-exception
                goto L3b
            L27:
                com.amap.api.col.3l.y$j r1 = com.amap.api.col.p0003l.y.j()     // Catch: java.lang.Throwable -> L25 java.lang.InterruptedException -> L31
                r2 = 2000(0x7d0, double:9.88E-321)
                r1.wait(r2)     // Catch: java.lang.Throwable -> L25 java.lang.InterruptedException -> L31
                goto Lf
            L31:
                java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L25
                r1.interrupt()     // Catch: java.lang.Throwable -> L25
                goto Lf
            L39:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
                return
            L3b:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
                throw r1
        }

        public final void j() {
                r3 = this;
                com.amap.api.col.3l.y$j r0 = com.amap.api.col.p0003l.y.j()
                monitor-enter(r0)
                r1 = 0
                r3.f4238c = r1     // Catch: java.lang.Throwable -> L28
                r2 = 1
                r3.o = r2     // Catch: java.lang.Throwable -> L28
                r3.p = r1     // Catch: java.lang.Throwable -> L28
                com.amap.api.col.3l.y$j r1 = com.amap.api.col.p0003l.y.j()     // Catch: java.lang.Throwable -> L28
                r1.notifyAll()     // Catch: java.lang.Throwable -> L28
            L14:
                boolean r1 = r3.f4237b     // Catch: java.lang.Throwable -> L28
                if (r1 != 0) goto L32
                boolean r1 = r3.f4239d     // Catch: java.lang.Throwable -> L28
                if (r1 == 0) goto L32
                boolean r1 = r3.p     // Catch: java.lang.Throwable -> L28
                if (r1 != 0) goto L32
                com.amap.api.col.3l.y$j r1 = com.amap.api.col.p0003l.y.j()     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L2a
                r1.wait()     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L2a
                goto L14
            L28:
                r1 = move-exception
                goto L34
            L2a:
                java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L28
                r1.interrupt()     // Catch: java.lang.Throwable -> L28
                goto L14
            L32:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
                return
            L34:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
                throw r1
        }

        public final void k() {
                r2 = this;
                com.amap.api.col.3l.y$j r0 = com.amap.api.col.p0003l.y.j()
                monitor-enter(r0)
                r1 = 1
                r2.a = r1     // Catch: java.lang.Throwable -> L1b
                com.amap.api.col.3l.y$j r1 = com.amap.api.col.p0003l.y.j()     // Catch: java.lang.Throwable -> L1b
                r1.notifyAll()     // Catch: java.lang.Throwable -> L1b
            Lf:
                boolean r1 = r2.f4237b     // Catch: java.lang.Throwable -> L1b
                if (r1 != 0) goto L25
                com.amap.api.col.3l.y$j r1 = com.amap.api.col.p0003l.y.j()     // Catch: java.lang.Throwable -> L1b java.lang.InterruptedException -> L1d
                r1.wait()     // Catch: java.lang.Throwable -> L1b java.lang.InterruptedException -> L1d
                goto Lf
            L1b:
                r1 = move-exception
                goto L27
            L1d:
                java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L1b
                r1.interrupt()     // Catch: java.lang.Throwable -> L1b
                goto Lf
            L25:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
                return
            L27:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
                throw r1
        }

        public final void l() {
                r1 = this;
                r0 = 1
                r1.f4246k = r0
                com.amap.api.col.3l.y$j r0 = com.amap.api.col.p0003l.y.j()
                r0.notifyAll()
                return
        }

        public final int m() {
                r2 = this;
                com.amap.api.col.3l.y$j r0 = com.amap.api.col.p0003l.y.j()
                monitor-enter(r0)
                int r1 = r2.l     // Catch: java.lang.Throwable -> L9
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
                return r1
            L9:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
                throw r1
        }

        public final int n() {
                r2 = this;
                com.amap.api.col.3l.y$j r0 = com.amap.api.col.p0003l.y.j()
                monitor-enter(r0)
                int r1 = r2.m     // Catch: java.lang.Throwable -> L9
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
                return r1
            L9:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
                throw r1
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "GLThread "
                r0.<init>(r1)
                long r1 = r3.getId()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.setName(r0)
                r3.q()     // Catch: java.lang.InterruptedException -> L18 java.lang.Throwable -> L20
            L18:
                com.amap.api.col.3l.y$j r0 = com.amap.api.col.p0003l.y.j()
                r0.a(r3)
                return
            L20:
                r0 = move-exception
                com.amap.api.col.3l.y$j r1 = com.amap.api.col.p0003l.y.j()
                r1.a(r3)
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class j {

        /* renamed from: g, reason: collision with root package name */
        private static java.lang.String f4247g = "GLThreadManager";
        private boolean a;

        /* renamed from: b, reason: collision with root package name */
        private int f4248b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f4249c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f4250d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f4251e;

        /* renamed from: f, reason: collision with root package name */
        private com.amap.api.col.3l.y.i f4252f;

        static {
                return
        }

        private j() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ j(byte r1) {
                r0 = this;
                r0.<init>()
                return
        }

        private void f() {
                r1 = this;
                boolean r0 = r1.a
                if (r0 != 0) goto Ld
                r0 = 131072(0x20000, float:1.83671E-40)
                r1.f4248b = r0
                r0 = 1
                r1.f4250d = r0
                r1.a = r0
            Ld:
                return
        }

        public final synchronized void a(com.amap.api.col.3l.y.i r2) {
                r1 = this;
                monitor-enter(r1)
                com.amap.api.col.3l.y.i.e(r2)     // Catch: java.lang.Throwable -> Lc
                com.amap.api.col.3l.y$i r0 = r1.f4252f     // Catch: java.lang.Throwable -> Lc
                if (r0 != r2) goto Le
                r2 = 0
                r1.f4252f = r2     // Catch: java.lang.Throwable -> Lc
                goto Le
            Lc:
                r2 = move-exception
                goto L13
            Le:
                r1.notifyAll()     // Catch: java.lang.Throwable -> Lc
                monitor-exit(r1)
                return
            L13:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
                throw r2
        }

        public final synchronized void b(javax.microedition.khronos.opengles.GL10 r4) {
                r3 = this;
                monitor-enter(r3)
                boolean r0 = r3.f4249c     // Catch: java.lang.Throwable -> L24
                if (r0 != 0) goto L2d
                if (r4 == 0) goto L2d
                r3.f()     // Catch: java.lang.Throwable -> L24
                r0 = 7937(0x1f01, float:1.1122E-41)
                java.lang.String r4 = r4.glGetString(r0)     // Catch: java.lang.Throwable -> L24
                int r0 = r3.f4248b     // Catch: java.lang.Throwable -> L24
                r1 = 131072(0x20000, float:1.83671E-40)
                r2 = 1
                if (r0 >= r1) goto L26
                java.lang.String r0 = "Q3Dimension MSM7500 "
                boolean r4 = r4.startsWith(r0)     // Catch: java.lang.Throwable -> L24
                r4 = r4 ^ r2
                r3.f4250d = r4     // Catch: java.lang.Throwable -> L24
                r3.notifyAll()     // Catch: java.lang.Throwable -> L24
                goto L26
            L24:
                r4 = move-exception
                goto L2f
            L26:
                boolean r4 = r3.f4250d     // Catch: java.lang.Throwable -> L24
                r4 = r4 ^ r2
                r3.f4251e = r4     // Catch: java.lang.Throwable -> L24
                r3.f4249c = r2     // Catch: java.lang.Throwable -> L24
            L2d:
                monitor-exit(r3)
                return
            L2f:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
                throw r4
        }

        public final synchronized boolean c() {
                r1 = this;
                monitor-enter(r1)
                boolean r0 = r1.f4251e     // Catch: java.lang.Throwable -> L5
                monitor-exit(r1)
                return r0
            L5:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
                throw r0
        }

        public final synchronized boolean d() {
                r1 = this;
                monitor-enter(r1)
                r1.f()     // Catch: java.lang.Throwable -> Ld
                boolean r0 = r1.f4250d     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r1)
                if (r0 != 0) goto Lb
                r0 = 1
                return r0
            Lb:
                r0 = 0
                return r0
            Ld:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
                throw r0
        }

        public final boolean e(com.amap.api.col.3l.y.i r3) {
                r2 = this;
                com.amap.api.col.3l.y$i r0 = r2.f4252f
                r1 = 1
                if (r0 == r3) goto L19
                if (r0 != 0) goto L8
                goto L19
            L8:
                r2.f()
                boolean r3 = r2.f4250d
                if (r3 == 0) goto L10
                return r1
            L10:
                com.amap.api.col.3l.y$i r3 = r2.f4252f
                if (r3 == 0) goto L17
                r3.l()
            L17:
                r3 = 0
                return r3
            L19:
                r2.f4252f = r3
                r2.notifyAll()
                return r1
        }

        public final void g(com.amap.api.col.3l.y.i r2) {
                r1 = this;
                com.amap.api.col.3l.y$i r0 = r1.f4252f
                if (r0 != r2) goto L7
                r2 = 0
                r1.f4252f = r2
            L7:
                r1.notifyAll()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface k {
        javax.microedition.khronos.opengles.GL a();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class l extends java.io.Writer {
        private java.lang.StringBuilder a;

        l() {
                r1 = this;
                r1.<init>()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1.a = r0
                return
        }

        private void a() {
                r3 = this;
                java.lang.StringBuilder r0 = r3.a
                int r0 = r0.length()
                if (r0 <= 0) goto L17
                java.lang.StringBuilder r0 = r3.a
                r0.toString()
                java.lang.StringBuilder r0 = r3.a
                r1 = 0
                int r2 = r0.length()
                r0.delete(r1, r2)
            L17:
                return
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
                r0 = this;
                r0.a()
                return
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
                r0 = this;
                r0.a()
                return
        }

        @Override // java.io.Writer
        public final void write(char[] r4, int r5, int r6) {
                r3 = this;
                r0 = 0
            L1:
                if (r0 >= r6) goto L17
                int r1 = r5 + r0
                char r1 = r4[r1]
                r2 = 10
                if (r1 != r2) goto Lf
                r3.a()
                goto L14
            Lf:
                java.lang.StringBuilder r2 = r3.a
                r2.append(r1)
            L14:
                int r0 = r0 + 1
                goto L1
            L17:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class m extends com.amap.api.col.3l.y.b {

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.y f4253k;

        public m(com.amap.api.col.p0003l.y r1) {
                r0 = this;
                r0.f4253k = r1
                r0.<init>(r1)
                return
        }
    }

    static {
            com.amap.api.col.3l.y$j r0 = new com.amap.api.col.3l.y$j
            r1 = 0
            r0.<init>(r1)
            com.amap.api.col.p0003l.y.l = r0
            return
    }

    public y(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            r1.a = r2
            r1.b()
            return
    }

    static /* synthetic */ int a(com.amap.api.col.p0003l.y r0) {
            int r0 = r0.f4221j
            return r0
    }

    private void b() {
            r0 = this;
            r0.setSurfaceTextureListener(r0)
            return
    }

    static /* synthetic */ com.amap.api.col.3l.y.e e(com.amap.api.col.p0003l.y r0) {
            com.amap.api.col.3l.y$e r0 = r0.f4216e
            return r0
    }

    static /* synthetic */ com.amap.api.col.3l.y.f g(com.amap.api.col.p0003l.y r0) {
            com.amap.api.col.3l.y$f r0 = r0.f4217f
            return r0
    }

    static /* synthetic */ com.amap.api.col.3l.y.g i(com.amap.api.col.p0003l.y r0) {
            com.amap.api.col.3l.y$g r0 = r0.f4218g
            return r0
    }

    static /* synthetic */ com.amap.api.col.3l.y.j j() {
            com.amap.api.col.3l.y$j r0 = com.amap.api.col.p0003l.y.l
            return r0
    }

    static /* synthetic */ com.amap.api.col.3l.y.k k(com.amap.api.col.p0003l.y r0) {
            com.amap.api.col.3l.y$k r0 = r0.f4219h
            return r0
    }

    private void l() {
            r2 = this;
            com.amap.api.col.3l.y$i r0 = r2.f4213b
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "setRenderer has already been called for this instance."
            r0.<init>(r1)
            throw r0
    }

    static /* synthetic */ int m(com.amap.api.col.p0003l.y r0) {
            int r0 = r0.f4220i
            return r0
    }

    private static boolean n() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 >= r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    static /* synthetic */ boolean o(com.amap.api.col.p0003l.y r0) {
            boolean r0 = r0.f4222k
            return r0
    }

    static /* synthetic */ android.opengl.GLSurfaceView.Renderer p(com.amap.api.col.p0003l.y r0) {
            android.opengl.GLSurfaceView$Renderer r0 = r0.f4214c
            return r0
    }

    public final void c(com.amap.api.col.3l.y.e r1) {
            r0 = this;
            r0.l()
            r0.f4216e = r1
            return
    }

    public final void d(com.amap.api.col.3l.y.f r1) {
            r0 = this;
            r0.l()
            r0.f4217f = r1
            return
    }

    public void f() {
            r1 = this;
            com.amap.api.col.3l.y$i r0 = r1.f4213b
            r0.i()
            return
    }

    protected void finalize() throws java.lang.Throwable {
            r1 = this;
            com.amap.api.col.3l.y$i r0 = r1.f4213b     // Catch: java.lang.Throwable -> L8
            if (r0 == 0) goto La
            r0.k()     // Catch: java.lang.Throwable -> L8
            goto La
        L8:
            r0 = move-exception
            goto Le
        La:
            super.finalize()
            return
        Le:
            super.finalize()
            throw r0
    }

    public int getRenderMode() {
            r1 = this;
            com.amap.api.col.3l.y$i r0 = r1.f4213b
            int r0 = r0.a()
            return r0
    }

    public void h() {
            r1 = this;
            com.amap.api.col.3l.y$i r0 = r1.f4213b
            r0.j()
            return
    }

    @Override // android.view.TextureView, android.view.View
    protected void onAttachedToWindow() {
            r4 = this;
            super.onAttachedToWindow()
            boolean r0 = r4.f4215d
            if (r0 == 0) goto L29
            android.opengl.GLSurfaceView$Renderer r0 = r4.f4214c
            if (r0 == 0) goto L29
            com.amap.api.col.3l.y$i r0 = r4.f4213b
            r1 = 1
            if (r0 == 0) goto L15
            int r0 = r0.a()
            goto L16
        L15:
            r0 = 1
        L16:
            com.amap.api.col.3l.y$i r2 = new com.amap.api.col.3l.y$i
            java.lang.ref.WeakReference<com.amap.api.col.3l.y> r3 = r4.a
            r2.<init>(r3)
            r4.f4213b = r2
            if (r0 == r1) goto L24
            r2.b(r0)
        L24:
            com.amap.api.col.3l.y$i r0 = r4.f4213b
            r0.start()
        L29:
            r0 = 0
            r4.f4215d = r0
            return
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            com.amap.api.col.3l.y$i r0 = r1.f4213b
            if (r0 == 0) goto L7
            r0.k()
        L7:
            r0 = 1
            r1.f4215d = r0
            super.onDetachedFromWindow()
            return
    }

    @Override // android.view.View
    protected void onLayout(boolean r4, int r5, int r6, int r7, int r8) {
            r3 = this;
            android.graphics.SurfaceTexture r0 = r3.getSurfaceTexture()
            int r1 = r7 - r5
            int r2 = r8 - r6
            r3.onSurfaceTextureSizeChanged(r0, r1, r2)
            super.onLayout(r4, r5, r6, r7, r8)
            return
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture r2, int r3, int r4) {
            r1 = this;
            com.amap.api.col.3l.y$i r0 = r1.f4213b
            r0.g()
            boolean r0 = n()
            if (r0 != 0) goto L28
            boolean r0 = com.amap.api.maps.MapsInitializer.getTextureSizeChangedInvoked()
            if (r0 == 0) goto L12
            goto L28
        L12:
            com.amap.api.col.3l.y$i r0 = r1.f4213b
            int r0 = r0.m()
            if (r0 != r3) goto L24
            com.amap.api.col.3l.y$i r0 = r1.f4213b
            int r0 = r0.n()
            if (r0 == r4) goto L23
            goto L24
        L23:
            return
        L24:
            r1.onSurfaceTextureSizeChanged(r2, r3, r4)
            return
        L28:
            r1.onSurfaceTextureSizeChanged(r2, r3, r4)
            return
    }

    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture r1) {
            r0 = this;
            com.amap.api.col.3l.y$i r1 = r0.f4213b
            r1.h()
            r1 = 1
            return r1
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture r1, int r2, int r3) {
            r0 = this;
            com.amap.api.col.3l.y$i r1 = r0.f4213b
            r1.c(r2, r3)
            return
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture r1) {
            r0 = this;
            return
    }

    public void queueEvent(java.lang.Runnable r2) {
            r1 = this;
            com.amap.api.col.3l.y$i r0 = r1.f4213b
            r0.d(r2)
            return
    }

    public void requestRender() {
            r1 = this;
            com.amap.api.col.3l.y$i r0 = r1.f4213b
            r0.f()
            return
    }

    public void setRenderMode(int r2) {
            r1 = this;
            com.amap.api.col.3l.y$i r0 = r1.f4213b
            r0.b(r2)
            return
    }

    public void setRenderer(android.opengl.GLSurfaceView.Renderer r3) {
            r2 = this;
            r2.l()
            com.amap.api.col.3l.y$e r0 = r2.f4216e
            if (r0 != 0) goto Le
            com.amap.api.col.3l.y$m r0 = new com.amap.api.col.3l.y$m
            r0.<init>(r2)
            r2.f4216e = r0
        Le:
            com.amap.api.col.3l.y$f r0 = r2.f4217f
            r1 = 0
            if (r0 != 0) goto L1a
            com.amap.api.col.3l.y$c r0 = new com.amap.api.col.3l.y$c
            r0.<init>(r2, r1)
            r2.f4217f = r0
        L1a:
            com.amap.api.col.3l.y$g r0 = r2.f4218g
            if (r0 != 0) goto L25
            com.amap.api.col.3l.y$d r0 = new com.amap.api.col.3l.y$d
            r0.<init>(r1)
            r2.f4218g = r0
        L25:
            r2.f4214c = r3
            com.amap.api.col.3l.y$i r3 = new com.amap.api.col.3l.y$i
            java.lang.ref.WeakReference<com.amap.api.col.3l.y> r0 = r2.a
            r3.<init>(r0)
            r2.f4213b = r3
            r3.start()
            return
    }
}
