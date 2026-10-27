package com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class GLView extends android.opengl.GLSurfaceView {

    @org.jetbrains.annotations.NotNull
    private final java.lang.Object a;
    private boolean b;
    private boolean c;
    private int d;
    private int e;

    @org.jetbrains.annotations.Nullable
    private com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.c f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements android.opengl.GLSurfaceView.Renderer {
        final /* synthetic */ com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView a;

        a(com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(javax.microedition.khronos.opengles.GL10 r4) {
                r3 = this;
                java.lang.String r0 = "gl"
                kotlin.jvm.internal.g0.p(r4, r0)
                com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView r4 = r3.a
                boolean r4 = com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView.e(r4)
                if (r4 != 0) goto Le
                return
            Le:
                com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView r4 = r3.a
                com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.c r4 = com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView.d(r4)
                kotlin.jvm.internal.g0.m(r4)
                com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView r0 = r3.a
                int r0 = com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView.f(r0)
                com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView r1 = r3.a
                int r1 = com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView.c(r1)
                com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView r2 = r3.a
                int r2 = com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView.b(r2)
                r4.g(r0, r1, r2)
                return
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(javax.microedition.khronos.opengles.GL10 r2, int r3, int r4) {
                r1 = this;
                java.lang.String r0 = "gl"
                kotlin.jvm.internal.g0.p(r2, r0)
                com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView r2 = r1.a
                com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView.k(r2, r3)
                com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView r2 = r1.a
                com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView.h(r2, r4)
                return
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(javax.microedition.khronos.opengles.GL10 r2, javax.microedition.khronos.egl.EGLConfig r3) {
                r1 = this;
                java.lang.String r0 = "gl"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r2 = "config"
                kotlin.jvm.internal.g0.p(r3, r2)
                com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView r2 = r1.a
                boolean r2 = com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView.e(r2)
                if (r2 != 0) goto L2f
                com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView r2 = r1.a
                r3 = 1
                com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView.j(r2, r3)
                com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView r2 = r1.a
                com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.c r3 = new com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.c
                r3.<init>()
                com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView.i(r2, r3)
                com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView r2 = r1.a
                com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.c r2 = com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView.d(r2)
                kotlin.jvm.internal.g0.m(r2)
                r2.c()
                goto L3b
            L2f:
                com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView r2 = r1.a
                com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.c r2 = com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView.d(r2)
                kotlin.jvm.internal.g0.m(r2)
                r2.f()
            L3b:
                com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView r2 = r1.a
                com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.c r2 = com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView.d(r2)
                kotlin.jvm.internal.g0.m(r2)
                r2.h()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class b implements android.opengl.GLSurfaceView.EGLConfigChooser {
        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.opengl.GLSurfaceView.EGLConfigChooser
        @org.jetbrains.annotations.NotNull
        public javax.microedition.khronos.egl.EGLConfig chooseConfig(@org.jetbrains.annotations.NotNull javax.microedition.khronos.egl.EGL10 r12, @org.jetbrains.annotations.NotNull javax.microedition.khronos.egl.EGLDisplay r13) {
                r11 = this;
                java.lang.String r0 = "egl"
                kotlin.jvm.internal.g0.p(r12, r0)
                java.lang.String r0 = "display"
                kotlin.jvm.internal.g0.p(r13, r0)
                r0 = 9
                int[] r3 = new int[r0]
                r3 = {x008c: FILL_ARRAY_DATA , data: [12324, 4, 12323, 4, 12322, 4, 12352, 4, 12344} // fill-array
                r0 = 1
                int[] r6 = new int[r0]
                r4 = 0
                r5 = 0
                r1 = r12
                r2 = r13
                r1.eglChooseConfig(r2, r3, r4, r5, r6)
                r12 = 0
                r5 = r6[r12]
                if (r5 <= 0) goto L84
                javax.microedition.khronos.egl.EGLConfig[] r4 = new javax.microedition.khronos.egl.EGLConfig[r5]
                r1.eglChooseConfig(r2, r3, r4, r5, r6)
                r13 = 0
            L26:
                if (r13 >= r5) goto L7e
                r3 = r4[r13]
                int[] r6 = new int[r0]
                r7 = 12325(0x3025, float:1.7271E-41)
                boolean r7 = r1.eglGetConfigAttrib(r2, r3, r7, r6)
                if (r7 == 0) goto L37
                r7 = r6[r12]
                goto L38
            L37:
                r7 = 0
            L38:
                r8 = 16
                if (r7 >= r8) goto L3d
                goto L7b
            L3d:
                r7 = 12324(0x3024, float:1.727E-41)
                boolean r7 = r1.eglGetConfigAttrib(r2, r3, r7, r6)
                if (r7 == 0) goto L48
                r7 = r6[r12]
                goto L49
            L48:
                r7 = 0
            L49:
                r8 = 12323(0x3023, float:1.7268E-41)
                boolean r8 = r1.eglGetConfigAttrib(r2, r3, r8, r6)
                if (r8 == 0) goto L54
                r8 = r6[r12]
                goto L55
            L54:
                r8 = 0
            L55:
                r9 = 12322(0x3022, float:1.7267E-41)
                boolean r9 = r1.eglGetConfigAttrib(r2, r3, r9, r6)
                if (r9 == 0) goto L60
                r9 = r6[r12]
                goto L61
            L60:
                r9 = 0
            L61:
                r10 = 12321(0x3021, float:1.7265E-41)
                boolean r10 = r1.eglGetConfigAttrib(r2, r3, r10, r6)
                if (r10 == 0) goto L6c
                r6 = r6[r12]
                goto L6d
            L6c:
                r6 = 0
            L6d:
                r10 = 8
                if (r7 != r10) goto L7b
                if (r8 != r10) goto L7b
                if (r9 != r10) goto L7b
                if (r6 != 0) goto L7b
                kotlin.jvm.internal.g0.m(r3)
                return r3
            L7b:
                int r13 = r13 + 1
                goto L26
            L7e:
                r12 = r4[r12]
                kotlin.jvm.internal.g0.m(r12)
                return r12
            L84:
                java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                java.lang.String r13 = "fail to choose EGL configs"
                r12.<init>(r13)
                throw r12
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class c implements android.opengl.GLSurfaceView.EGLContextFactory {

        @org.jetbrains.annotations.NotNull
        public static final com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView.c.a a = null;
        private static final int b = 0;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static final class a {
            private a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public /* synthetic */ a(kotlin.jvm.internal.v r1) {
                    r0 = this;
                    r0.<init>()
                    return
            }
        }

        static {
                com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView$c$a r0 = new com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView$c$a
                r1 = 0
                r0.<init>(r1)
                com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView.c.a = r0
                r0 = 12440(0x3098, float:1.7432E-41)
                com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView.c.b = r0
                return
        }

        public c() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.opengl.GLSurfaceView.EGLContextFactory
        @org.jetbrains.annotations.NotNull
        public javax.microedition.khronos.egl.EGLContext createContext(@org.jetbrains.annotations.NotNull javax.microedition.khronos.egl.EGL10 r4, @org.jetbrains.annotations.NotNull javax.microedition.khronos.egl.EGLDisplay r5, @org.jetbrains.annotations.NotNull javax.microedition.khronos.egl.EGLConfig r6) {
                r3 = this;
                java.lang.String r0 = "egl"
                kotlin.jvm.internal.g0.p(r4, r0)
                java.lang.String r0 = "display"
                kotlin.jvm.internal.g0.p(r5, r0)
                java.lang.String r0 = "eglConfig"
                kotlin.jvm.internal.g0.p(r6, r0)
                int r0 = com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView.c.b
                r1 = 3
                r2 = 12344(0x3038, float:1.7298E-41)
                int[] r0 = new int[]{r0, r1, r2}
                javax.microedition.khronos.egl.EGLContext r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
                javax.microedition.khronos.egl.EGLContext r4 = r4.eglCreateContext(r5, r6, r1, r0)
                java.lang.String r5 = "eglCreateContext(...)"
                kotlin.jvm.internal.g0.o(r4, r5)
                return r4
        }

        @Override // android.opengl.GLSurfaceView.EGLContextFactory
        public void destroyContext(@org.jetbrains.annotations.NotNull javax.microedition.khronos.egl.EGL10 r2, @org.jetbrains.annotations.NotNull javax.microedition.khronos.egl.EGLDisplay r3, @org.jetbrains.annotations.NotNull javax.microedition.khronos.egl.EGLContext r4) {
                r1 = this;
                java.lang.String r0 = "egl"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "display"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "context"
                kotlin.jvm.internal.g0.p(r4, r0)
                r2.eglDestroyContext(r3, r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class d implements android.opengl.GLSurfaceView.EGLWindowSurfaceFactory {
        final /* synthetic */ com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView a;

        public d(com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.opengl.GLSurfaceView.EGLWindowSurfaceFactory
        @org.jetbrains.annotations.Nullable
        public javax.microedition.khronos.egl.EGLSurface createWindowSurface(@org.jetbrains.annotations.NotNull javax.microedition.khronos.egl.EGL10 r2, @org.jetbrains.annotations.NotNull javax.microedition.khronos.egl.EGLDisplay r3, @org.jetbrains.annotations.NotNull javax.microedition.khronos.egl.EGLConfig r4, @org.jetbrains.annotations.NotNull java.lang.Object r5) {
                r1 = this;
                java.lang.String r0 = "egl"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "display"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "config"
                kotlin.jvm.internal.g0.p(r4, r0)
                java.lang.String r0 = "nativeWindow"
                kotlin.jvm.internal.g0.p(r5, r0)
                r0 = 0
                javax.microedition.khronos.egl.EGLSurface r2 = r2.eglCreateWindowSurface(r3, r4, r5, r0)     // Catch: java.lang.IllegalArgumentException -> L1a
                return r2
            L1a:
                return r0
        }

        @Override // android.opengl.GLSurfaceView.EGLWindowSurfaceFactory
        public void destroySurface(@org.jetbrains.annotations.NotNull javax.microedition.khronos.egl.EGL10 r2, @org.jetbrains.annotations.NotNull javax.microedition.khronos.egl.EGLDisplay r3, @org.jetbrains.annotations.NotNull javax.microedition.khronos.egl.EGLSurface r4) {
                r1 = this;
                java.lang.String r0 = "egl"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "display"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "surface"
                kotlin.jvm.internal.g0.p(r4, r0)
                com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView r0 = r1.a
                com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView.g(r0)
                r2.eglDestroySurface(r3, r4)
                return
        }
    }

    public GLView(@org.jetbrains.annotations.NotNull android.content.Context r2) {
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>(r2)
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r1.a = r2
            r2 = 1
            r1.d = r2
            r1.e = r2
            com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView$c r0 = new com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView$c
            r0.<init>()
            r1.setEGLContextFactory(r0)
            com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView$d r0 = new com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView$d
            r0.<init>(r1)
            r1.setEGLWindowSurfaceFactory(r0)
            com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView$b r0 = new com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView$b
            r0.<init>()
            r1.setEGLConfigChooser(r0)
            com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView$a r0 = new com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView$a
            r0.<init>(r1)
            r1.setRenderer(r0)
            r1.setZOrderMediaOverlay(r2)
            return
    }

    private final int a() {
            r3 = this;
            android.content.Context r0 = r3.getContext()
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            java.lang.String r1 = "null cannot be cast to non-null type android.view.WindowManager"
            kotlin.jvm.internal.g0.n(r0, r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            int r0 = r0.getRotation()
            r1 = 0
            if (r0 == 0) goto L2f
            r2 = 1
            if (r0 == r2) goto L2c
            r2 = 2
            if (r0 == r2) goto L29
            r2 = 3
            if (r0 == r2) goto L26
            return r1
        L26:
            r0 = 270(0x10e, float:3.78E-43)
            return r0
        L29:
            r0 = 180(0xb4, float:2.52E-43)
            return r0
        L2c:
            r0 = 90
            return r0
        L2f:
            return r1
    }

    public static final /* synthetic */ int b(com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView r0) {
            int r0 = r0.a()
            return r0
    }

    public static final /* synthetic */ int c(com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView r0) {
            int r0 = r0.e
            return r0
    }

    public static final /* synthetic */ com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.c d(com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView r0) {
            com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.c r0 = r0.f
            return r0
    }

    public static final /* synthetic */ boolean e(com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView r0) {
            boolean r0 = r0.c
            return r0
    }

    public static final /* synthetic */ int f(com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView r0) {
            int r0 = r0.d
            return r0
    }

    public static final /* synthetic */ void g(com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView r0) {
            r0.l()
            return
    }

    private final android.app.Activity getActivity() {
            r2 = this;
            android.content.Context r0 = r2.getContext()
        L4:
            boolean r1 = r0 instanceof android.content.ContextWrapper
            if (r1 == 0) goto L16
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto Lf
            android.app.Activity r0 = (android.app.Activity) r0
            return r0
        Lf:
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            goto L4
        L16:
            r0 = 0
            return r0
    }

    public static final /* synthetic */ void h(com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView r0, int r1) {
            r0.e = r1
            return
    }

    public static final /* synthetic */ void i(com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView r0, com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.c r1) {
            r0.f = r1
            return
    }

    public static final /* synthetic */ void j(com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView r0, boolean r1) {
            r0.c = r1
            return
    }

    public static final /* synthetic */ void k(com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView r0, int r1) {
            r0.d = r1
            return
    }

    private final void l() {
            r3 = this;
            java.lang.Object r0 = r3.a
            monitor-enter(r0)
            boolean r1 = r3.b     // Catch: java.lang.Throwable -> L25
            kotlin.n1 r2 = kotlin.n1.a     // Catch: java.lang.Throwable -> L25
            monitor-exit(r0)
            boolean r0 = r3.c
            if (r0 == 0) goto L24
            if (r1 == 0) goto L24
            r0 = 0
            r3.c = r0
            com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.c r0 = r3.f
            kotlin.jvm.internal.g0.m(r0)
            r0.i()
            com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.c r0 = r3.f
            kotlin.jvm.internal.g0.m(r0)
            r0.b()
            r0 = 0
            r3.f = r0
        L24:
            return
        L25:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
            r2 = this;
            android.app.Activity r0 = r2.getActivity()
            if (r0 == 0) goto L16
            boolean r0 = r0.isFinishing()
            java.lang.Object r1 = r2.a
            monitor-enter(r1)
            r2.b = r0     // Catch: java.lang.Throwable -> L13
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)
            goto L16
        L13:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L16:
            cn.easyar.Engine.onPause()
            super.onPause()
            return
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
            r0 = this;
            super.onResume()
            cn.easyar.Engine.onResume()
            return
    }
}
