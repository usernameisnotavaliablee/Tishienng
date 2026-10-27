package com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class BGRenderer {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String a;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String b;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String c;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String d;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String e;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String f;

    @org.jetbrains.annotations.NotNull
    private final byte[] g;

    @org.jetbrains.annotations.NotNull
    private com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer.FrameShader h;
    private boolean i;

    @org.jetbrains.annotations.Nullable
    private javax.microedition.khronos.egl.EGLContext j;
    private int k;

    /* renamed from: l, reason: collision with root package name */
    private final java.nio.IntBuffer f1456l;

    /* renamed from: m, reason: collision with root package name */
    private final java.nio.IntBuffer f1457m;

    /* renamed from: n, reason: collision with root package name */
    private final java.nio.IntBuffer f1458n;

    /* renamed from: o, reason: collision with root package name */
    private final java.nio.IntBuffer f1459o;

    /* renamed from: p, reason: collision with root package name */
    private int f1460p;

    /* renamed from: q, reason: collision with root package name */
    private int f1461q;

    /* renamed from: r, reason: collision with root package name */
    private final java.nio.IntBuffer f1462r;

    /* renamed from: s, reason: collision with root package name */
    private final java.nio.IntBuffer f1463s;

    /* renamed from: t, reason: collision with root package name */
    private final java.nio.IntBuffer f1464t;

    /* renamed from: u, reason: collision with root package name */
    private int f1465u;

    /* renamed from: v, reason: collision with root package name */
    @org.jetbrains.annotations.Nullable
    private cn.easyar.Vec2I f1466v;

    /* renamed from: w, reason: collision with root package name */
    @org.jetbrains.annotations.Nullable
    private byte[] f1467w;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum FrameShader extends java.lang.Enum<com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer.FrameShader> {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
        private static final /* synthetic */ com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer.FrameShader[] $VALUES = null;
        public static final com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer.FrameShader RGB = null;
        public static final com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer.FrameShader YUV = null;

        private static final /* synthetic */ com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer.FrameShader[] $values() {
                r0 = 2
                com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer$FrameShader[] r0 = new com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer.FrameShader[r0]
                com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer$FrameShader r1 = com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer.FrameShader.RGB
                r2 = 0
                r0[r2] = r1
                com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer$FrameShader r1 = com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer.FrameShader.YUV
                r2 = 1
                r0[r2] = r1
                return r0
        }

        static {
                com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer$FrameShader r0 = new com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer$FrameShader
                java.lang.String r1 = "RGB"
                r2 = 0
                r0.<init>(r1, r2)
                com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer.FrameShader.RGB = r0
                com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer$FrameShader r0 = new com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer$FrameShader
                java.lang.String r1 = "YUV"
                r2 = 1
                r0.<init>(r1, r2)
                com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer.FrameShader.YUV = r0
                com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer$FrameShader[] r0 = $values()
                com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer.FrameShader.$VALUES = r0
                kotlin.enums.a r0 = kotlin.enums.c.c(r0)
                com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer.FrameShader.$ENTRIES = r0
                return
        }

        FrameShader(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @org.jetbrains.annotations.NotNull
        public static kotlin.enums.a<com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer.FrameShader> getEntries() {
                kotlin.enums.a r0 = com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer.FrameShader.$ENTRIES
                return r0
        }

        public static com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer.FrameShader valueOf(java.lang.String r1) {
                java.lang.Class<com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer$FrameShader> r0 = com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer.FrameShader.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer$FrameShader r1 = (com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer.FrameShader) r1
                return r1
        }

        public static com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer.FrameShader[] values() {
                com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer$FrameShader[] r0 = com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer.FrameShader.$VALUES
                java.lang.Object r0 = r0.clone()
                com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer$FrameShader[] r0 = (com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer.FrameShader[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a = null;

        static {
                com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer$FrameShader[] r0 = com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer.FrameShader.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer$FrameShader r1 = com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer.FrameShader.RGB     // Catch: java.lang.NoSuchFieldError -> L10
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
            L10:
                com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer$FrameShader r1 = com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer.FrameShader.YUV     // Catch: java.lang.NoSuchFieldError -> L19
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
            L19:
                com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer.a.a = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    public BGRenderer() {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "attribute vec4 coord;\nattribute vec2 texCoord;\nvarying vec2 texc;\n\nvoid main(void)\n{\n    gl_Position = coord;\n    texc = texCoord;\n}\n\n"
            r2.a = r0
            java.lang.String r0 = "#ifdef GL_ES\nprecision mediump float;\n#endif\nuniform sampler2D texture;\nvarying vec2 texc;\n\nvoid main(void)\n{\n    gl_FragColor = texture2D(texture, texc).bgra;\n}\n\n"
            r2.b = r0
            java.lang.String r0 = "#ifdef GL_ES\nprecision mediump float;\n#endif\nuniform sampler2D texture;\nvarying vec2 texc;\n\nvoid main(void)\n{\n    gl_FragColor = texture2D(texture, texc);\n}\n\n"
            r2.c = r0
            java.lang.String r0 = "#ifdef GL_ES\nprecision highp float;\n#endif\nuniform sampler2D texture;\nuniform sampler2D u_texture;\nuniform sampler2D v_texture;\nvarying vec2 texc;\n\nvoid main(void)\n{\n    float cb = texture2D(u_texture, texc).r - 0.5;\n    float cr = texture2D(v_texture, texc).r - 0.5;\n    vec3 ycbcr = vec3(texture2D(texture, texc).r, cb, cr);\n    vec3 rgb = mat3(1, 1, 1,\n        0, -0.344, 1.772,\n        1.402, -0.714, 0) * ycbcr;\n    gl_FragColor = vec4(rgb, 1.0);\n}\n\n"
            r2.d = r0
            java.lang.String r0 = "#ifdef GL_ES\nprecision highp float;\n#endif\nuniform sampler2D texture;\nuniform sampler2D uv_texture;\nvarying vec2 texc;\n\nvoid main(void)\n{\n    vec2 cbcr = texture2D(uv_texture, texc).ra - vec2(0.5, 0.5);\n    vec3 ycbcr = vec3(texture2D(texture, texc).r, cbcr);\n    vec3 rgb = mat3(1.0, 1.0, 1.0,\n        0.0, -0.344, 1.772,\n        1.402, -0.714, 0.0) * ycbcr;\n    gl_FragColor = vec4(rgb, 1.0);\n}\n\n"
            r2.e = r0
            java.lang.String r0 = "#ifdef GL_ES\nprecision highp float;\n#endif\nuniform sampler2D texture;\nuniform sampler2D uv_texture;\nvarying vec2 texc;\n\nvoid main(void)\n{\n    vec2 cbcr = texture2D(uv_texture, texc).ar - vec2(0.5, 0.5);\n    vec3 ycbcr = vec3(texture2D(texture, texc).r, cbcr);\n    vec3 rgb = mat3(1, 1, 1,\n        0, -0.344, 1.772,\n        1.402, -0.714, 0.0) * ycbcr;\n    gl_FragColor = vec4(rgb, 1.0);\n}\n\n"
            r2.f = r0
            r0 = 24
            byte[] r0 = new byte[r0]
            r0 = {x005a: FILL_ARRAY_DATA , data: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 127, 127, 127, 127, 127, 127, 127, 127} // fill-array
            r2.g = r0
            com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer$FrameShader r0 = com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer.FrameShader.RGB
            r2.h = r0
            r0 = 1
            java.nio.IntBuffer r1 = java.nio.IntBuffer.allocate(r0)
            r2.f1456l = r1
            java.nio.IntBuffer r1 = java.nio.IntBuffer.allocate(r0)
            r2.f1457m = r1
            java.nio.IntBuffer r1 = java.nio.IntBuffer.allocate(r0)
            r2.f1458n = r1
            java.nio.IntBuffer r1 = java.nio.IntBuffer.allocate(r0)
            r2.f1459o = r1
            r1 = -1
            r2.f1460p = r1
            r2.f1461q = r1
            java.nio.IntBuffer r1 = java.nio.IntBuffer.allocate(r0)
            r2.f1462r = r1
            java.nio.IntBuffer r1 = java.nio.IntBuffer.allocate(r0)
            r2.f1463s = r1
            java.nio.IntBuffer r0 = java.nio.IntBuffer.allocate(r0)
            r2.f1464t = r0
            return
    }

    private final void b(int r4) {
            r3 = this;
            boolean r0 = r3.i
            if (r0 != 0) goto L5
            return
        L5:
            javax.microedition.khronos.egl.EGL r0 = javax.microedition.khronos.egl.EGLContext.getEGL()
            java.lang.String r1 = "null cannot be cast to non-null type javax.microedition.khronos.egl.EGL10"
            kotlin.jvm.internal.g0.n(r0, r1)
            javax.microedition.khronos.egl.EGL10 r0 = (javax.microedition.khronos.egl.EGL10) r0
            javax.microedition.khronos.egl.EGLContext r0 = r0.eglGetCurrentContext()
            javax.microedition.khronos.egl.EGLContext r1 = r3.j
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L61
            int r0 = r3.k
            android.opengl.GLES20.glDeleteProgram(r0)
            java.nio.IntBuffer r0 = r3.f1462r
            r1 = 1
            android.opengl.GLES20.glDeleteBuffers(r1, r0)
            java.nio.IntBuffer r0 = r3.f1463s
            android.opengl.GLES20.glDeleteBuffers(r1, r0)
            java.nio.IntBuffer r0 = r3.f1464t
            android.opengl.GLES20.glDeleteFramebuffers(r1, r0)
            java.nio.IntBuffer r0 = r3.f1456l
            android.opengl.GLES20.glDeleteTextures(r1, r0)
            com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer$FrameShader r0 = r3.h
            int[] r2 = com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer.a.a
            int r0 = r0.ordinal()
            r0 = r2[r0]
            if (r0 == r1) goto L61
            r2 = 2
            if (r0 != r2) goto L5b
            if (r4 == r2) goto L55
            r0 = 3
            if (r4 == r0) goto L55
            java.nio.IntBuffer r4 = r3.f1458n
            android.opengl.GLES20.glDeleteTextures(r1, r4)
            java.nio.IntBuffer r4 = r3.f1459o
            android.opengl.GLES20.glDeleteTextures(r1, r4)
            goto L61
        L55:
            java.nio.IntBuffer r4 = r3.f1457m
            android.opengl.GLES20.glDeleteTextures(r1, r4)
            goto L61
        L5b:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        L61:
            r4 = 0
            r3.i = r4
            return
    }

    private final boolean c(int r12) {
            r11 = this;
            r0 = 0
            if (r12 != 0) goto L4
            return r0
        L4:
            javax.microedition.khronos.egl.EGL r1 = javax.microedition.khronos.egl.EGLContext.getEGL()
            java.lang.String r2 = "null cannot be cast to non-null type javax.microedition.khronos.egl.EGL10"
            kotlin.jvm.internal.g0.n(r1, r2)
            javax.microedition.khronos.egl.EGL10 r1 = (javax.microedition.khronos.egl.EGL10) r1
            javax.microedition.khronos.egl.EGLContext r1 = r1.eglGetCurrentContext()
            r11.j = r1
            int r1 = android.opengl.GLES20.glCreateProgram()
            r11.k = r1
            r1 = 35633(0x8b31, float:4.9932E-41)
            int r1 = android.opengl.GLES20.glCreateShader(r1)
            java.lang.String r2 = r11.a
            android.opengl.GLES20.glShaderSource(r1, r2)
            android.opengl.GLES20.glCompileShader(r1)
            r2 = 35632(0x8b30, float:4.9931E-41)
            int r2 = android.opengl.GLES20.glCreateShader(r2)
            switch(r12) {
                case 1: goto L5d;
                case 2: goto L53;
                case 3: goto L49;
                case 4: goto L3f;
                case 5: goto L3f;
                case 6: goto L5d;
                case 7: goto L35;
                case 8: goto L5d;
                case 9: goto L35;
                default: goto L34;
            }
        L34:
            goto L66
        L35:
            com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer$FrameShader r3 = com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer.FrameShader.RGB
            r11.h = r3
            java.lang.String r3 = r11.b
            android.opengl.GLES20.glShaderSource(r2, r3)
            goto L66
        L3f:
            com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer$FrameShader r3 = com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer.FrameShader.YUV
            r11.h = r3
            java.lang.String r3 = r11.d
            android.opengl.GLES20.glShaderSource(r2, r3)
            goto L66
        L49:
            com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer$FrameShader r3 = com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer.FrameShader.YUV
            r11.h = r3
            java.lang.String r3 = r11.e
            android.opengl.GLES20.glShaderSource(r2, r3)
            goto L66
        L53:
            com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer$FrameShader r3 = com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer.FrameShader.YUV
            r11.h = r3
            java.lang.String r3 = r11.f
            android.opengl.GLES20.glShaderSource(r2, r3)
            goto L66
        L5d:
            com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer$FrameShader r3 = com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer.FrameShader.RGB
            r11.h = r3
            java.lang.String r3 = r11.c
            android.opengl.GLES20.glShaderSource(r2, r3)
        L66:
            android.opengl.GLES20.glCompileShader(r2)
            int r3 = r11.k
            android.opengl.GLES20.glAttachShader(r3, r1)
            int r3 = r11.k
            android.opengl.GLES20.glAttachShader(r3, r2)
            r3 = 1
            java.nio.IntBuffer r4 = java.nio.IntBuffer.allocate(r3)
            r5 = 35713(0x8b81, float:5.0045E-41)
            android.opengl.GLES20.glGetShaderiv(r1, r5, r4)
            int r4 = r4.get(r0)
            if (r4 != 0) goto L87
            android.opengl.GLES20.glGetShaderInfoLog(r1)
        L87:
            java.nio.IntBuffer r4 = java.nio.IntBuffer.allocate(r3)
            android.opengl.GLES20.glGetShaderiv(r2, r5, r4)
            int r4 = r4.get(r0)
            if (r4 != 0) goto L97
            android.opengl.GLES20.glGetShaderInfoLog(r2)
        L97:
            int r4 = r11.k
            android.opengl.GLES20.glLinkProgram(r4)
            android.opengl.GLES20.glDeleteShader(r1)
            android.opengl.GLES20.glDeleteShader(r2)
            java.nio.IntBuffer r4 = java.nio.IntBuffer.allocate(r3)
            int r5 = r11.k
            r6 = 35714(0x8b82, float:5.0046E-41)
            android.opengl.GLES20.glGetProgramiv(r5, r6, r4)
            int r4 = r11.k
            android.opengl.GLES20.glUseProgram(r4)
            int r4 = r11.k
            java.lang.String r5 = "coord"
            int r4 = android.opengl.GLES20.glGetAttribLocation(r4, r5)
            r11.f1460p = r4
            int r4 = r11.k
            java.lang.String r5 = "texCoord"
            int r4 = android.opengl.GLES20.glGetAttribLocation(r4, r5)
            r11.f1461q = r4
            android.opengl.GLES20.glDeleteShader(r1)
            android.opengl.GLES20.glDeleteShader(r2)
            java.nio.IntBuffer r1 = r11.f1462r
            android.opengl.GLES20.glGenBuffers(r3, r1)
            java.nio.IntBuffer r1 = r11.f1462r
            int r1 = r1.get(r0)
            r2 = 34962(0x8892, float:4.8992E-41)
            android.opengl.GLES20.glBindBuffer(r2, r1)
            r1 = 12
            float[] r1 = new float[r1]
            r1 = {x01f0: FILL_ARRAY_DATA , data: [-1082130432, -1082130432, 0, 1065353216, -1082130432, 0, 1065353216, 1065353216, 0, -1082130432, 1065353216, 0} // fill-array
            java.nio.FloatBuffer r1 = java.nio.FloatBuffer.wrap(r1)
            r4 = 35048(0x88e8, float:4.9113E-41)
            r5 = 48
            android.opengl.GLES20.glBufferData(r2, r5, r1, r4)
            java.nio.IntBuffer r1 = r11.f1463s
            android.opengl.GLES20.glGenBuffers(r3, r1)
            java.nio.IntBuffer r1 = r11.f1463s
            int r1 = r1.get(r0)
            android.opengl.GLES20.glBindBuffer(r2, r1)
            r1 = 8
            float[] r1 = new float[r1]
            r1 = {x020c: FILL_ARRAY_DATA , data: [0, 1065353216, 1065353216, 1065353216, 1065353216, 0, 0, 0} // fill-array
            java.nio.FloatBuffer r1 = java.nio.FloatBuffer.wrap(r1)
            r4 = 35044(0x88e4, float:4.9107E-41)
            r5 = 32
            android.opengl.GLES20.glBufferData(r2, r5, r1, r4)
            int r1 = r11.k
            java.lang.String r2 = "texture"
            int r1 = android.opengl.GLES20.glGetUniformLocation(r1, r2)
            android.opengl.GLES20.glUniform1i(r1, r0)
            java.nio.IntBuffer r1 = r11.f1456l
            android.opengl.GLES20.glGenTextures(r3, r1)
            java.nio.IntBuffer r1 = r11.f1456l
            int r1 = r1.get(r0)
            r2 = 3553(0xde1, float:4.979E-42)
            android.opengl.GLES20.glBindTexture(r2, r1)
            r1 = 10241(0x2801, float:1.435E-41)
            r4 = 9729(0x2601, float:1.3633E-41)
            android.opengl.GLES20.glTexParameteri(r2, r1, r4)
            r5 = 10240(0x2800, float:1.4349E-41)
            android.opengl.GLES20.glTexParameteri(r2, r5, r4)
            r6 = 10242(0x2802, float:1.4352E-41)
            r7 = 33071(0x812f, float:4.6342E-41)
            android.opengl.GLES20.glTexParameteri(r2, r6, r7)
            r8 = 10243(0x2803, float:1.4354E-41)
            android.opengl.GLES20.glTexParameteri(r2, r8, r7)
            com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer$FrameShader r9 = r11.h
            int[] r10 = com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer.a.a
            int r9 = r9.ordinal()
            r9 = r10[r9]
            if (r9 == r3) goto L1d1
            r10 = 2
            if (r9 != r10) goto L1cb
            if (r12 == r10) goto L1a5
            r9 = 3
            if (r12 == r9) goto L1a5
            int r12 = r11.k
            java.lang.String r9 = "u_texture"
            int r12 = android.opengl.GLES20.glGetUniformLocation(r12, r9)
            android.opengl.GLES20.glUniform1i(r12, r3)
            java.nio.IntBuffer r12 = r11.f1458n
            android.opengl.GLES20.glGenTextures(r3, r12)
            java.nio.IntBuffer r12 = r11.f1458n
            int r12 = r12.get(r0)
            android.opengl.GLES20.glBindTexture(r2, r12)
            android.opengl.GLES20.glTexParameteri(r2, r1, r4)
            android.opengl.GLES20.glTexParameteri(r2, r5, r4)
            android.opengl.GLES20.glTexParameteri(r2, r6, r7)
            android.opengl.GLES20.glTexParameteri(r2, r8, r7)
            int r12 = r11.k
            java.lang.String r9 = "v_texture"
            int r12 = android.opengl.GLES20.glGetUniformLocation(r12, r9)
            android.opengl.GLES20.glUniform1i(r12, r10)
            java.nio.IntBuffer r12 = r11.f1459o
            android.opengl.GLES20.glGenTextures(r3, r12)
            java.nio.IntBuffer r12 = r11.f1459o
            int r12 = r12.get(r0)
            android.opengl.GLES20.glBindTexture(r2, r12)
            android.opengl.GLES20.glTexParameteri(r2, r1, r4)
            android.opengl.GLES20.glTexParameteri(r2, r5, r4)
            android.opengl.GLES20.glTexParameteri(r2, r6, r7)
            android.opengl.GLES20.glTexParameteri(r2, r8, r7)
            goto L1d1
        L1a5:
            int r12 = r11.k
            java.lang.String r9 = "uv_texture"
            int r12 = android.opengl.GLES20.glGetUniformLocation(r12, r9)
            android.opengl.GLES20.glUniform1i(r12, r3)
            java.nio.IntBuffer r12 = r11.f1457m
            android.opengl.GLES20.glGenTextures(r3, r12)
            java.nio.IntBuffer r12 = r11.f1457m
            int r12 = r12.get(r0)
            android.opengl.GLES20.glBindTexture(r2, r12)
            android.opengl.GLES20.glTexParameteri(r2, r1, r4)
            android.opengl.GLES20.glTexParameteri(r2, r5, r4)
            android.opengl.GLES20.glTexParameteri(r2, r6, r7)
            android.opengl.GLES20.glTexParameteri(r2, r8, r7)
            goto L1d1
        L1cb:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        L1d1:
            java.nio.IntBuffer r12 = r11.f1464t
            android.opengl.GLES20.glGenFramebuffers(r3, r12)
            r11.i = r3
            return r3
    }

    private final cn.easyar.p0 d(cn.easyar.Matrix44F r10, cn.easyar.p0 r11) {
            r9 = this;
            cn.easyar.p0 r0 = new cn.easyar.p0
            r1 = 0
            r0.<init>(r1, r1, r1, r1)
            r1 = 0
            r2 = 0
        L8:
            r3 = 4
            if (r2 >= r3) goto L28
            r4 = 0
        Lc:
            if (r4 >= r3) goto L25
            float[] r5 = r0.data
            r6 = r5[r2]
            float[] r7 = r10.data
            int r8 = r2 * 4
            int r8 = r8 + r4
            r7 = r7[r8]
            float[] r8 = r11.data
            r8 = r8[r4]
            float r7 = r7 * r8
            float r6 = r6 + r7
            r5[r2] = r6
            int r4 = r4 + 1
            goto Lc
        L25:
            int r2 = r2 + 1
            goto L8
        L28:
            return r0
    }

    private final void f(int r22, int r23, int r24, int r25, int r26, java.nio.ByteBuffer r27, int r28) {
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r25
            r9 = r27
            r3 = r28
            r4 = 3
            r5 = 5
            r10 = 3314(0xcf2, float:4.644E-42)
            r11 = 0
            r6 = 1
            r7 = 4
            r8 = 2
            if (r3 == 0) goto La4
            if (r3 == r6) goto L19
            if (r3 == r8) goto L19
            goto L1f
        L19:
            com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer$FrameShader r12 = r0.h
            com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer$FrameShader r13 = com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer.FrameShader.YUV
            if (r12 == r13) goto L20
        L1f:
            return
        L20:
            int r12 = r2 / 2
            android.opengl.GLES20.glPixelStorei(r10, r12)
            if (r1 == r8) goto L63
            if (r1 == r4) goto L63
            r4 = 6409(0x1909, float:8.981E-42)
            if (r1 == r7) goto L4d
            if (r1 != r5) goto L47
            if (r3 == r6) goto L3c
            if (r3 != r8) goto L36
            int r1 = r2 * r26
            goto L41
        L36:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L3c:
            int r1 = r2 * r26
            int r1 = r1 * 5
            int r1 = r1 / r7
        L41:
            int r2 = r2 * r26
            int r2 = r2 / r7
        L44:
            r14 = 6409(0x1909, float:8.981E-42)
            goto L6b
        L47:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L4d:
            if (r3 == r6) goto L5d
            if (r3 != r8) goto L57
            int r1 = r2 * r26
            int r1 = r1 * 5
            int r1 = r1 / r7
            goto L5f
        L57:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L5d:
            int r1 = r2 * r26
        L5f:
            int r2 = r2 * r26
            int r2 = r2 / r7
            goto L44
        L63:
            int r1 = r2 * r26
            int r2 = r1 / 2
            r4 = 6410(0x190a, float:8.982E-42)
            r14 = 6410(0x190a, float:8.982E-42)
        L6b:
            byte[] r3 = r0.f1467w
            if (r3 == 0) goto L75
            kotlin.jvm.internal.g0.m(r3)
            int r3 = r3.length
            if (r3 == r2) goto L79
        L75:
            byte[] r2 = new byte[r2]
            r0.f1467w = r2
        L79:
            r9.position(r1)
            byte[] r1 = r0.f1467w
            kotlin.jvm.internal.g0.m(r1)
            r9.get(r1)
            r9.position(r11)
            int r15 = r23 / 2
            int r16 = r24 / 2
            byte[] r1 = r0.f1467w
            kotlin.jvm.internal.g0.m(r1)
            java.nio.ByteBuffer r20 = java.nio.ByteBuffer.wrap(r1)
            r12 = 3553(0xde1, float:4.979E-42)
            r13 = 0
            r17 = 0
            r19 = 5121(0x1401, float:7.176E-42)
            r18 = r14
            android.opengl.GLES20.glTexImage2D(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            android.opengl.GLES20.glPixelStorei(r10, r11)
            return
        La4:
            android.opengl.GLES20.glPixelStorei(r10, r2)
            com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer$FrameShader r2 = r0.h
            int[] r3 = com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer.a.a
            int r2 = r2.ordinal()
            r2 = r3[r2]
            if (r2 == r6) goto Lef
            if (r2 != r8) goto Le9
            if (r1 == r8) goto Ld6
            if (r1 == r4) goto Ld6
            if (r1 == r7) goto Ld6
            if (r1 == r5) goto Ld6
            byte[] r1 = r0.g
            java.nio.ByteBuffer r20 = java.nio.ByteBuffer.wrap(r1)
            r12 = 3553(0xde1, float:4.979E-42)
            r13 = 0
            r14 = 6409(0x1909, float:8.981E-42)
            r15 = 4
            r16 = 4
            r17 = 0
            r18 = 6409(0x1909, float:8.981E-42)
            r19 = 5121(0x1401, float:7.176E-42)
            android.opengl.GLES20.glTexImage2D(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L164
        Ld6:
            r7 = 6409(0x1909, float:8.981E-42)
            r8 = 5121(0x1401, float:7.176E-42)
            r1 = 3553(0xde1, float:4.979E-42)
            r2 = 0
            r3 = 6409(0x1909, float:8.981E-42)
            r6 = 0
            r4 = r23
            r5 = r24
            android.opengl.GLES20.glTexImage2D(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto L164
        Le9:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        Lef:
            r2 = 3553(0xde1, float:4.979E-42)
            if (r1 == 0) goto L161
            if (r1 == r6) goto L14d
            switch(r1) {
                case 6: goto L139;
                case 7: goto L125;
                case 8: goto L111;
                case 9: goto Lfd;
                default: goto Lf8;
            }
        Lf8:
            android.opengl.GLES20.glBindTexture(r2, r11)
            goto L164
        Lfd:
            r7 = 6408(0x1908, float:8.98E-42)
            r8 = 5121(0x1401, float:7.176E-42)
            r1 = 3553(0xde1, float:4.979E-42)
            r2 = 0
            r3 = 6408(0x1908, float:8.98E-42)
            r6 = 0
            r4 = r23
            r5 = r24
            r9 = r27
            android.opengl.GLES20.glTexImage2D(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto L164
        L111:
            r7 = 6408(0x1908, float:8.98E-42)
            r8 = 5121(0x1401, float:7.176E-42)
            r1 = 3553(0xde1, float:4.979E-42)
            r2 = 0
            r3 = 6408(0x1908, float:8.98E-42)
            r6 = 0
            r4 = r23
            r5 = r24
            r9 = r27
            android.opengl.GLES20.glTexImage2D(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto L164
        L125:
            r7 = 6407(0x1907, float:8.978E-42)
            r8 = 5121(0x1401, float:7.176E-42)
            r1 = 3553(0xde1, float:4.979E-42)
            r2 = 0
            r3 = 6407(0x1907, float:8.978E-42)
            r6 = 0
            r4 = r23
            r5 = r24
            r9 = r27
            android.opengl.GLES20.glTexImage2D(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto L164
        L139:
            r7 = 6407(0x1907, float:8.978E-42)
            r8 = 5121(0x1401, float:7.176E-42)
            r1 = 3553(0xde1, float:4.979E-42)
            r2 = 0
            r3 = 6407(0x1907, float:8.978E-42)
            r6 = 0
            r4 = r23
            r5 = r24
            r9 = r27
            android.opengl.GLES20.glTexImage2D(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto L164
        L14d:
            r7 = 6409(0x1909, float:8.981E-42)
            r8 = 5121(0x1401, float:7.176E-42)
            r1 = 3553(0xde1, float:4.979E-42)
            r2 = 0
            r3 = 6409(0x1909, float:8.981E-42)
            r6 = 0
            r4 = r23
            r5 = r24
            r9 = r27
            android.opengl.GLES20.glTexImage2D(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto L164
        L161:
            android.opengl.GLES20.glBindTexture(r2, r11)
        L164:
            android.opengl.GLES20.glPixelStorei(r10, r11)
            return
    }

    public final void a() {
            r1 = this;
            int r0 = r1.f1465u
            r1.b(r0)
            return
    }

    public final void e(@org.jetbrains.annotations.NotNull cn.easyar.Matrix44F r45) {
            r44 = this;
            r1 = r44
            r0 = r45
            java.lang.String r2 = "imageProjection"
            kotlin.jvm.internal.g0.p(r0, r2)
            r2 = 1
            java.nio.IntBuffer r3 = java.nio.IntBuffer.allocate(r2)
            java.nio.IntBuffer r4 = java.nio.IntBuffer.allocate(r2)
            java.nio.IntBuffer r5 = java.nio.IntBuffer.allocate(r2)
            java.nio.IntBuffer r6 = java.nio.IntBuffer.allocate(r2)
            java.nio.IntBuffer r7 = java.nio.IntBuffer.allocate(r2)
            java.nio.IntBuffer r8 = java.nio.IntBuffer.allocate(r2)
            java.nio.IntBuffer r9 = java.nio.IntBuffer.allocate(r2)
            java.nio.IntBuffer r10 = java.nio.IntBuffer.allocate(r2)
            java.nio.IntBuffer r11 = java.nio.IntBuffer.allocate(r2)
            java.nio.IntBuffer r12 = java.nio.IntBuffer.allocate(r2)
            java.nio.IntBuffer r13 = java.nio.IntBuffer.allocate(r2)
            r14 = 4
            java.nio.IntBuffer r15 = java.nio.IntBuffer.allocate(r14)
            r16 = 1
            r2 = 3042(0xbe2, float:4.263E-42)
            android.opengl.GLES20.glGetIntegerv(r2, r3)
            r17 = 3042(0xbe2, float:4.263E-42)
            r2 = 2929(0xb71, float:4.104E-42)
            android.opengl.GLES20.glGetIntegerv(r2, r4)
            r18 = 2929(0xb71, float:4.104E-42)
            r2 = 2884(0xb44, float:4.041E-42)
            android.opengl.GLES20.glGetIntegerv(r2, r9)
            r19 = 2884(0xb44, float:4.041E-42)
            r2 = 34964(0x8894, float:4.8995E-41)
            android.opengl.GLES20.glGetIntegerv(r2, r7)
            r2 = 34965(0x8895, float:4.8996E-41)
            android.opengl.GLES20.glGetIntegerv(r2, r8)
            r2 = 36006(0x8ca6, float:5.0455E-41)
            android.opengl.GLES20.glGetIntegerv(r2, r5)
            r2 = 0
            r15.position(r2)
            r20 = 4
            r14 = 2978(0xba2, float:4.173E-42)
            android.opengl.GLES20.glGetIntegerv(r14, r15)
            r14 = 35725(0x8b8d, float:5.0061E-41)
            android.opengl.GLES20.glGetIntegerv(r14, r10)
            r14 = 34016(0x84e0, float:4.7667E-41)
            android.opengl.GLES20.glGetIntegerv(r14, r11)
            r14 = 33984(0x84c0, float:4.7622E-41)
            android.opengl.GLES20.glActiveTexture(r14)
            r21 = 33984(0x84c0, float:4.7622E-41)
            r14 = 32873(0x8069, float:4.6065E-41)
            android.opengl.GLES20.glGetIntegerv(r14, r6)
            r22 = 33985(0x84c1, float:4.7623E-41)
            android.opengl.GLES20.glActiveTexture(r22)
            android.opengl.GLES20.glGetIntegerv(r14, r12)
            r23 = 33986(0x84c2, float:4.7625E-41)
            android.opengl.GLES20.glActiveTexture(r23)
            android.opengl.GLES20.glGetIntegerv(r14, r13)
            r14 = 2
            r24 = 0
            int[] r2 = new int[r14]
            r14 = -1
            r2[r24] = r14
            r2[r16] = r14
            java.nio.IntBuffer r26 = java.nio.IntBuffer.allocate(r16)
            java.nio.IntBuffer r27 = java.nio.IntBuffer.allocate(r16)
            r28 = r2
            r14 = 2
            java.nio.IntBuffer[] r2 = new java.nio.IntBuffer[r14]
            r2[r24] = r26
            r2[r16] = r27
            java.nio.IntBuffer r25 = java.nio.IntBuffer.allocate(r16)
            java.nio.IntBuffer r26 = java.nio.IntBuffer.allocate(r16)
            r27 = r2
            java.nio.IntBuffer[] r2 = new java.nio.IntBuffer[r14]
            r2[r24] = r25
            r2[r16] = r26
            java.nio.IntBuffer r25 = java.nio.IntBuffer.allocate(r16)
            java.nio.IntBuffer r26 = java.nio.IntBuffer.allocate(r16)
            r29 = r2
            java.nio.IntBuffer[] r2 = new java.nio.IntBuffer[r14]
            r2[r24] = r25
            r2[r16] = r26
            java.nio.IntBuffer r25 = java.nio.IntBuffer.allocate(r16)
            java.nio.IntBuffer r26 = java.nio.IntBuffer.allocate(r16)
            r30 = r2
            java.nio.IntBuffer[] r2 = new java.nio.IntBuffer[r14]
            r2[r24] = r25
            r2[r16] = r26
            java.nio.IntBuffer r25 = java.nio.IntBuffer.allocate(r16)
            java.nio.IntBuffer r26 = java.nio.IntBuffer.allocate(r16)
            r31 = r2
            java.nio.IntBuffer[] r2 = new java.nio.IntBuffer[r14]
            r2[r24] = r25
            r2[r16] = r26
            java.nio.IntBuffer r26 = java.nio.IntBuffer.allocate(r16)
            java.nio.IntBuffer r32 = java.nio.IntBuffer.allocate(r16)
            r33 = r2
            java.nio.IntBuffer[] r2 = new java.nio.IntBuffer[r14]
            r2[r24] = r26
            r2[r16] = r32
            java.nio.IntBuffer.allocate(r16)
            java.nio.IntBuffer.allocate(r16)
            android.opengl.GLES20.glDisable(r18)
            android.opengl.GLES20.glDisable(r17)
            android.opengl.GLES20.glDisable(r19)
            r14 = 34962(0x8892, float:4.8992E-41)
            r26 = r2
            r2 = 0
            android.opengl.GLES20.glBindBuffer(r14, r2)
            r14 = 34963(0x8893, float:4.8994E-41)
            android.opengl.GLES20.glBindBuffer(r14, r2)
            r24 = 0
            int r2 = r1.f1460p
            r28[r24] = r2
            int r2 = r1.f1461q
            r28[r16] = r2
            r2 = 0
        L130:
            r14 = 2
            if (r2 >= r14) goto L17e
            r14 = r28[r2]
            r34 = r2
            r2 = -1
            if (r14 != r2) goto L13d
            r35 = r10
            goto L179
        L13d:
            r2 = 34975(0x889f, float:4.901E-41)
            r35 = r10
            r10 = r27[r34]
            android.opengl.GLES20.glGetVertexAttribiv(r14, r2, r10)
            r2 = r28[r34]
            r10 = 34338(0x8622, float:4.8118E-41)
            r14 = r29[r34]
            android.opengl.GLES20.glGetVertexAttribiv(r2, r10, r14)
            r2 = r28[r34]
            r10 = 34339(0x8623, float:4.8119E-41)
            r14 = r30[r34]
            android.opengl.GLES20.glGetVertexAttribiv(r2, r10, r14)
            r2 = r28[r34]
            r10 = 34340(0x8624, float:4.812E-41)
            r14 = r31[r34]
            android.opengl.GLES20.glGetVertexAttribiv(r2, r10, r14)
            r2 = r28[r34]
            r10 = 34341(0x8625, float:4.8122E-41)
            r14 = r33[r34]
            android.opengl.GLES20.glGetVertexAttribiv(r2, r10, r14)
            r2 = r28[r34]
            r10 = 34922(0x886a, float:4.8936E-41)
            r14 = r26[r34]
            android.opengl.GLES20.glGetVertexAttribiv(r2, r10, r14)
        L179:
            int r2 = r34 + 1
            r10 = r35
            goto L130
        L17e:
            r35 = r10
            int r2 = r1.k     // Catch: java.lang.Throwable -> L424
            android.opengl.GLES20.glUseProgram(r2)     // Catch: java.lang.Throwable -> L424
            java.nio.IntBuffer r2 = r1.f1462r     // Catch: java.lang.Throwable -> L424
            r14 = 0
            int r2 = r2.get(r14)     // Catch: java.lang.Throwable -> L424
            r14 = 34962(0x8892, float:4.8992E-41)
            android.opengl.GLES20.glBindBuffer(r14, r2)     // Catch: java.lang.Throwable -> L424
            int r2 = r1.f1460p     // Catch: java.lang.Throwable -> L424
            android.opengl.GLES20.glEnableVertexAttribArray(r2)     // Catch: java.lang.Throwable -> L424
            int r2 = r1.f1460p     // Catch: java.lang.Throwable -> L424
            r40 = 0
            r41 = 0
            r37 = 3
            r38 = 5126(0x1406, float:7.183E-42)
            r39 = 0
            r36 = r2
            android.opengl.GLES20.glVertexAttribPointer(r36, r37, r38, r39, r40, r41)     // Catch: java.lang.Throwable -> L424
            r2 = 12
            float[] r2 = new float[r2]     // Catch: java.lang.Throwable -> L424
            r14 = -1082130432(0xffffffffbf800000, float:-1.0)
            r24 = 0
            r2[r24] = r14     // Catch: java.lang.Throwable -> L424
            r2[r16] = r14     // Catch: java.lang.Throwable -> L424
            r30 = 3
            r10 = 0
            r25 = 2
            r2[r25] = r10     // Catch: java.lang.Throwable -> L424
            r31 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            r2[r30] = r10     // Catch: java.lang.Throwable -> L424
            r2[r20] = r14     // Catch: java.lang.Throwable -> L424
            r33 = 5
            r2[r33] = r31     // Catch: java.lang.Throwable -> L424
            r34 = 1065353216(0x3f800000, float:1.0)
            r10 = 6
            r2[r10] = r34     // Catch: java.lang.Throwable -> L424
            r36 = 7
            r2[r36] = r34     // Catch: java.lang.Throwable -> L424
            r37 = 8
            r2[r37] = r31     // Catch: java.lang.Throwable -> L424
            r38 = 9
            r2[r38] = r14     // Catch: java.lang.Throwable -> L424
            r39 = 10
            r2[r39] = r34     // Catch: java.lang.Throwable -> L424
            r40 = 11
            r2[r40] = r31     // Catch: java.lang.Throwable -> L424
            r41 = 6
            cn.easyar.p0 r10 = new cn.easyar.p0     // Catch: java.lang.Throwable -> L424
            r42 = r2
            r31 = r15
            r2 = 0
            r15 = 1065353216(0x3f800000, float:1.0)
            r10.<init>(r14, r14, r2, r15)     // Catch: java.lang.Throwable -> L41a
            cn.easyar.p0 r2 = new cn.easyar.p0     // Catch: java.lang.Throwable -> L41a
            r14 = r42[r30]     // Catch: java.lang.Throwable -> L41a
            r15 = r42[r20]     // Catch: java.lang.Throwable -> L41a
            r43 = r11
            r11 = r42[r33]     // Catch: java.lang.Throwable -> L414
            r33 = r13
            r13 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r14, r15, r11, r13)     // Catch: java.lang.Throwable -> L40d
            cn.easyar.p0 r11 = new cn.easyar.p0     // Catch: java.lang.Throwable -> L40d
            r14 = r42[r41]     // Catch: java.lang.Throwable -> L40d
            r15 = r42[r36]     // Catch: java.lang.Throwable -> L40d
            r34 = r12
            r12 = r42[r37]     // Catch: java.lang.Throwable -> L402
            r11.<init>(r14, r15, r12, r13)     // Catch: java.lang.Throwable -> L402
            cn.easyar.p0 r12 = new cn.easyar.p0     // Catch: java.lang.Throwable -> L402
            r14 = r42[r38]     // Catch: java.lang.Throwable -> L402
            r15 = r42[r39]     // Catch: java.lang.Throwable -> L402
            r36 = r6
            r6 = r42[r40]     // Catch: java.lang.Throwable -> L24d
            r12.<init>(r14, r15, r6, r13)     // Catch: java.lang.Throwable -> L24d
            cn.easyar.p0 r6 = r1.d(r0, r10)     // Catch: java.lang.Throwable -> L24d
            cn.easyar.p0 r2 = r1.d(r0, r2)     // Catch: java.lang.Throwable -> L24d
            cn.easyar.p0 r10 = r1.d(r0, r11)     // Catch: java.lang.Throwable -> L24d
            cn.easyar.p0 r0 = r1.d(r0, r12)     // Catch: java.lang.Throwable -> L24d
            r11 = 4
            cn.easyar.p0[] r12 = new cn.easyar.p0[r11]     // Catch: java.lang.Throwable -> L3f5
            r24 = 0
            r12[r24] = r6     // Catch: java.lang.Throwable -> L3f5
            r12[r16] = r2     // Catch: java.lang.Throwable -> L3f5
            r25 = 2
            r12[r25] = r10     // Catch: java.lang.Throwable -> L3f5
            r12[r30] = r0     // Catch: java.lang.Throwable -> L3f5
            r0 = 0
        L239:
            if (r0 >= r11) goto L263
            r2 = 0
        L23c:
            r6 = 3
            if (r2 >= r6) goto L25d
            int r6 = r0 * 3
            int r6 = r6 + r2
            r10 = r12[r0]     // Catch: java.lang.Throwable -> L24d
            float[] r10 = r10.data     // Catch: java.lang.Throwable -> L24d
            r10 = r10[r2]     // Catch: java.lang.Throwable -> L24d
            r42[r6] = r10     // Catch: java.lang.Throwable -> L24d
            int r2 = r2 + 1
            goto L23c
        L24d:
            r0 = move-exception
            r13 = r31
            r11 = r33
            r10 = r34
            r14 = r35
            r6 = r36
        L258:
            r12 = r43
        L25a:
            r2 = 0
            goto L42d
        L25d:
            int r0 = r0 + 1
            r11 = 4
            r30 = 3
            goto L239
        L263:
            java.nio.FloatBuffer r0 = java.nio.FloatBuffer.wrap(r42)     // Catch: java.lang.Throwable -> L24d
            r2 = 35048(0x88e8, float:4.9113E-41)
            r6 = 48
            r14 = 34962(0x8892, float:4.8992E-41)
            android.opengl.GLES20.glBufferData(r14, r6, r0, r2)     // Catch: java.lang.Throwable -> L24d
            java.nio.IntBuffer r0 = r1.f1463s     // Catch: java.lang.Throwable -> L24d
            r2 = 0
            int r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L24d
            android.opengl.GLES20.glBindBuffer(r14, r0)     // Catch: java.lang.Throwable -> L24d
            int r0 = r1.f1461q     // Catch: java.lang.Throwable -> L24d
            android.opengl.GLES20.glEnableVertexAttribArray(r0)     // Catch: java.lang.Throwable -> L24d
            int r10 = r1.f1461q     // Catch: java.lang.Throwable -> L24d
            r14 = 0
            r15 = 0
            r11 = 2
            r12 = 5126(0x1406, float:7.183E-42)
            r13 = 0
            android.opengl.GLES20.glVertexAttribPointer(r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L24d
            com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer$FrameShader r0 = r1.h     // Catch: java.lang.Throwable -> L24d
            int[] r2 = com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer.a.a     // Catch: java.lang.Throwable -> L24d
            int r0 = r0.ordinal()     // Catch: java.lang.Throwable -> L24d
            r0 = r2[r0]     // Catch: java.lang.Throwable -> L24d
            r2 = 1
            if (r0 == r2) goto L2e8
            r14 = 2
            if (r0 != r14) goto L2e2
            android.opengl.GLES20.glActiveTexture(r21)     // Catch: java.lang.Throwable -> L24d
            java.nio.IntBuffer r0 = r1.f1456l     // Catch: java.lang.Throwable -> L24d
            r2 = 0
            int r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L24d
            r2 = 3553(0xde1, float:4.979E-42)
            android.opengl.GLES20.glBindTexture(r2, r0)     // Catch: java.lang.Throwable -> L24d
            int r0 = r1.f1465u     // Catch: java.lang.Throwable -> L24d
            if (r0 == r14) goto L2d2
            r6 = 3
            if (r0 != r6) goto L2b3
            goto L2d2
        L2b3:
            android.opengl.GLES20.glActiveTexture(r22)     // Catch: java.lang.Throwable -> L24d
            java.nio.IntBuffer r0 = r1.f1458n     // Catch: java.lang.Throwable -> L24d
            r2 = 0
            int r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L24d
            r6 = 3553(0xde1, float:4.979E-42)
            android.opengl.GLES20.glBindTexture(r6, r0)     // Catch: java.lang.Throwable -> L24d
            android.opengl.GLES20.glActiveTexture(r23)     // Catch: java.lang.Throwable -> L24d
            java.nio.IntBuffer r0 = r1.f1459o     // Catch: java.lang.Throwable -> L24d
            int r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L24d
            android.opengl.GLES20.glBindTexture(r6, r0)     // Catch: java.lang.Throwable -> L24d
        L2ce:
            r0 = 6
            r2 = 0
        L2d0:
            r11 = 4
            goto L339
        L2d2:
            android.opengl.GLES20.glActiveTexture(r22)     // Catch: java.lang.Throwable -> L24d
            java.nio.IntBuffer r0 = r1.f1457m     // Catch: java.lang.Throwable -> L24d
            r2 = 0
            int r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L24d
            r2 = 3553(0xde1, float:4.979E-42)
            android.opengl.GLES20.glBindTexture(r2, r0)     // Catch: java.lang.Throwable -> L24d
            goto L2ce
        L2e2:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Throwable -> L24d
            r0.<init>()     // Catch: java.lang.Throwable -> L24d
            throw r0     // Catch: java.lang.Throwable -> L24d
        L2e8:
            android.opengl.GLES20.glActiveTexture(r21)     // Catch: java.lang.Throwable -> L24d
            java.nio.IntBuffer r0 = r1.f1456l     // Catch: java.lang.Throwable -> L24d
            r2 = 0
            int r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L24d
            r6 = 3553(0xde1, float:4.979E-42)
            android.opengl.GLES20.glBindTexture(r6, r0)     // Catch: java.lang.Throwable -> L24d
            android.opengl.GLES20.glActiveTexture(r21)     // Catch: java.lang.Throwable -> L24d
            java.nio.IntBuffer r0 = r1.f1456l     // Catch: java.lang.Throwable -> L24d
            int r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L24d
            android.opengl.GLES20.glBindTexture(r6, r0)     // Catch: java.lang.Throwable -> L24d
            int r0 = r1.f1465u     // Catch: java.lang.Throwable -> L24d
            r14 = 2
            if (r0 == r14) goto L328
            r6 = 3
            if (r0 != r6) goto L30c
            goto L328
        L30c:
            android.opengl.GLES20.glActiveTexture(r22)     // Catch: java.lang.Throwable -> L24d
            java.nio.IntBuffer r0 = r1.f1458n     // Catch: java.lang.Throwable -> L24d
            r2 = 0
            int r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L24d
            r6 = 3553(0xde1, float:4.979E-42)
            android.opengl.GLES20.glBindTexture(r6, r0)     // Catch: java.lang.Throwable -> L24d
            android.opengl.GLES20.glActiveTexture(r23)     // Catch: java.lang.Throwable -> L24d
            java.nio.IntBuffer r0 = r1.f1459o     // Catch: java.lang.Throwable -> L24d
            int r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L24d
            android.opengl.GLES20.glBindTexture(r6, r0)     // Catch: java.lang.Throwable -> L24d
            goto L2ce
        L328:
            android.opengl.GLES20.glActiveTexture(r22)     // Catch: java.lang.Throwable -> L24d
            java.nio.IntBuffer r0 = r1.f1457m     // Catch: java.lang.Throwable -> L24d
            r2 = 0
            int r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L24d
            r6 = 3553(0xde1, float:4.979E-42)
            android.opengl.GLES20.glBindTexture(r6, r0)     // Catch: java.lang.Throwable -> L24d
            r0 = 6
            goto L2d0
        L339:
            android.opengl.GLES20.glDrawArrays(r0, r2, r11)     // Catch: java.lang.Throwable -> L24d
            int r0 = r3.get(r2)
            if (r0 == 0) goto L345
            android.opengl.GLES20.glEnable(r17)
        L345:
            int r0 = r4.get(r2)
            if (r0 == 0) goto L34e
            android.opengl.GLES20.glEnable(r18)
        L34e:
            int r0 = r9.get(r2)
            if (r0 == 0) goto L357
            android.opengl.GLES20.glEnable(r19)
        L357:
            r0 = 0
        L358:
            r14 = 2
            if (r0 >= r14) goto L386
            r3 = r27[r0]
            int r3 = r3.get(r2)
            if (r3 != 0) goto L364
            goto L383
        L364:
            r3 = r27[r0]
            int r3 = r3.get(r2)
            r14 = 34962(0x8892, float:4.8992E-41)
            android.opengl.GLES20.glBindBuffer(r14, r3)
            r3 = r29[r0]
            int r3 = r3.get(r2)
            if (r3 == 0) goto L37e
            r3 = r28[r0]
            android.opengl.GLES20.glEnableVertexAttribArray(r3)
            goto L383
        L37e:
            r3 = r28[r0]
            android.opengl.GLES20.glDisableVertexAttribArray(r3)
        L383:
            int r0 = r0 + 1
            goto L358
        L386:
            int r0 = r7.get(r2)
            r14 = 34962(0x8892, float:4.8992E-41)
            android.opengl.GLES20.glBindBuffer(r14, r0)
            int r0 = r8.get(r2)
            r3 = 34963(0x8893, float:4.8994E-41)
            android.opengl.GLES20.glBindBuffer(r3, r0)
            int r0 = r5.get(r2)
            r3 = 36160(0x8d40, float:5.0671E-41)
            android.opengl.GLES20.glBindFramebuffer(r3, r0)
            android.opengl.GLES20.glActiveTexture(r21)
            r6 = r36
            int r0 = r6.get(r2)
            r6 = 3553(0xde1, float:4.979E-42)
            android.opengl.GLES20.glBindTexture(r6, r0)
            android.opengl.GLES20.glActiveTexture(r22)
            r10 = r34
            int r0 = r10.get(r2)
            android.opengl.GLES20.glBindTexture(r6, r0)
            android.opengl.GLES20.glActiveTexture(r23)
            r11 = r33
            int r0 = r11.get(r2)
            android.opengl.GLES20.glBindTexture(r6, r0)
            r12 = r43
            int r0 = r12.get(r2)
            android.opengl.GLES20.glActiveTexture(r0)
            r13 = r31
            int r0 = r13.get(r2)
            r3 = 1
            int r3 = r13.get(r3)
            r14 = 2
            int r4 = r13.get(r14)
            r6 = 3
            int r5 = r13.get(r6)
            android.opengl.GLES20.glViewport(r0, r3, r4, r5)
            r14 = r35
            int r0 = r14.get(r2)
            android.opengl.GLES20.glUseProgram(r0)
            return
        L3f5:
            r0 = move-exception
            r13 = r31
            r11 = r33
            r10 = r34
            r14 = r35
            r6 = r36
            goto L258
        L402:
            r0 = move-exception
            r13 = r31
            r11 = r33
            r10 = r34
        L409:
            r14 = r35
            goto L258
        L40d:
            r0 = move-exception
            r10 = r12
            r13 = r31
            r11 = r33
            goto L409
        L414:
            r0 = move-exception
            r10 = r12
            r11 = r13
            r13 = r31
            goto L409
        L41a:
            r0 = move-exception
            r10 = r12
            r14 = r35
            r12 = r11
            r11 = r13
            r13 = r31
            goto L25a
        L424:
            r0 = move-exception
            r10 = r12
            r14 = r35
            r12 = r11
            r11 = r13
            r13 = r15
            goto L25a
        L42d:
            int r3 = r3.get(r2)
            if (r3 == 0) goto L436
            android.opengl.GLES20.glEnable(r17)
        L436:
            int r3 = r4.get(r2)
            if (r3 == 0) goto L43f
            android.opengl.GLES20.glEnable(r18)
        L43f:
            int r3 = r9.get(r2)
            if (r3 == 0) goto L448
            android.opengl.GLES20.glEnable(r19)
        L448:
            r3 = 0
        L449:
            r4 = 2
            if (r3 >= r4) goto L477
            r4 = r27[r3]
            int r4 = r4.get(r2)
            if (r4 != 0) goto L455
            goto L474
        L455:
            r4 = r27[r3]
            int r4 = r4.get(r2)
            r9 = 34962(0x8892, float:4.8992E-41)
            android.opengl.GLES20.glBindBuffer(r9, r4)
            r4 = r29[r3]
            int r4 = r4.get(r2)
            if (r4 == 0) goto L46f
            r4 = r28[r3]
            android.opengl.GLES20.glEnableVertexAttribArray(r4)
            goto L474
        L46f:
            r4 = r28[r3]
            android.opengl.GLES20.glDisableVertexAttribArray(r4)
        L474:
            int r3 = r3 + 1
            goto L449
        L477:
            int r3 = r7.get(r2)
            r9 = 34962(0x8892, float:4.8992E-41)
            android.opengl.GLES20.glBindBuffer(r9, r3)
            int r3 = r8.get(r2)
            r4 = 34963(0x8893, float:4.8994E-41)
            android.opengl.GLES20.glBindBuffer(r4, r3)
            int r3 = r5.get(r2)
            r4 = 36160(0x8d40, float:5.0671E-41)
            android.opengl.GLES20.glBindFramebuffer(r4, r3)
            android.opengl.GLES20.glActiveTexture(r21)
            int r3 = r6.get(r2)
            r6 = 3553(0xde1, float:4.979E-42)
            android.opengl.GLES20.glBindTexture(r6, r3)
            android.opengl.GLES20.glActiveTexture(r22)
            int r3 = r10.get(r2)
            android.opengl.GLES20.glBindTexture(r6, r3)
            android.opengl.GLES20.glActiveTexture(r23)
            int r3 = r11.get(r2)
            android.opengl.GLES20.glBindTexture(r6, r3)
            int r3 = r12.get(r2)
            android.opengl.GLES20.glActiveTexture(r3)
            int r3 = r13.get(r2)
            r4 = 1
            int r4 = r13.get(r4)
            r5 = 2
            int r5 = r13.get(r5)
            r6 = 3
            int r6 = r13.get(r6)
            android.opengl.GLES20.glViewport(r3, r4, r5, r6)
            int r2 = r14.get(r2)
            android.opengl.GLES20.glUseProgram(r2)
            throw r0
    }

    public final void g(int r20, int r21, int r22, int r23, int r24, @org.jetbrains.annotations.NotNull java.nio.ByteBuffer r25) {
            r19 = this;
            r1 = r19
            r2 = r20
            java.lang.String r0 = "buffer"
            r7 = r25
            kotlin.jvm.internal.g0.p(r7, r0)
            r0 = 1
            java.nio.IntBuffer r9 = java.nio.IntBuffer.allocate(r0)
            java.nio.IntBuffer r10 = java.nio.IntBuffer.allocate(r0)
            java.nio.IntBuffer r11 = java.nio.IntBuffer.allocate(r0)
            java.nio.IntBuffer r12 = java.nio.IntBuffer.allocate(r0)
            java.nio.IntBuffer r13 = java.nio.IntBuffer.allocate(r0)
            r3 = 35725(0x8b8d, float:5.0061E-41)
            android.opengl.GLES20.glGetIntegerv(r3, r10)
            r3 = 34016(0x84e0, float:4.7667E-41)
            android.opengl.GLES20.glGetIntegerv(r3, r11)
            r14 = 33984(0x84c0, float:4.7622E-41)
            android.opengl.GLES20.glActiveTexture(r14)
            r3 = 32873(0x8069, float:4.6065E-41)
            android.opengl.GLES20.glGetIntegerv(r3, r9)
            r15 = 33985(0x84c1, float:4.7623E-41)
            android.opengl.GLES20.glActiveTexture(r15)
            android.opengl.GLES20.glGetIntegerv(r3, r12)
            r16 = 33986(0x84c2, float:4.7625E-41)
            android.opengl.GLES20.glActiveTexture(r16)
            android.opengl.GLES20.glGetIntegerv(r3, r13)
            r3 = 3553(0xde1, float:4.979E-42)
            r4 = 0
            int r5 = r1.f1465u     // Catch: java.lang.Throwable -> L8a
            if (r5 == r2) goto L96
            r1.b(r5)     // Catch: java.lang.Throwable -> L8a
            boolean r5 = r19.c(r20)     // Catch: java.lang.Throwable -> L8a
            if (r5 != 0) goto L87
            android.opengl.GLES20.glActiveTexture(r14)
            int r0 = r9.get(r4)
            android.opengl.GLES20.glBindTexture(r3, r0)
            android.opengl.GLES20.glActiveTexture(r15)
            int r0 = r12.get(r4)
            android.opengl.GLES20.glBindTexture(r3, r0)
            android.opengl.GLES20.glActiveTexture(r16)
            int r0 = r13.get(r4)
            android.opengl.GLES20.glBindTexture(r3, r0)
            int r0 = r11.get(r4)
            android.opengl.GLES20.glActiveTexture(r0)
            int r0 = r10.get(r4)
        L83:
            android.opengl.GLES20.glUseProgram(r0)
            return
        L87:
            r1.f1465u = r2     // Catch: java.lang.Throwable -> L8a
            goto L96
        L8a:
            r0 = move-exception
            r14 = 3553(0xde1, float:4.979E-42)
            r15 = 0
            r17 = 33984(0x84c0, float:4.7622E-41)
            r18 = 33985(0x84c1, float:4.7623E-41)
            goto L20a
        L96:
            cn.easyar.Vec2I r5 = new cn.easyar.Vec2I     // Catch: java.lang.Throwable -> L8a
            r6 = r21
            r8 = r22
            r5.<init>(r6, r8)     // Catch: java.lang.Throwable -> L8a
            r1.f1466v = r5     // Catch: java.lang.Throwable -> L8a
            com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer$FrameShader r5 = r1.h     // Catch: java.lang.Throwable -> L8a
            int[] r17 = com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.BGRenderer.a.a     // Catch: java.lang.Throwable -> L8a
            int r5 = r5.ordinal()     // Catch: java.lang.Throwable -> L8a
            r5 = r17[r5]     // Catch: java.lang.Throwable -> L8a
            r17 = 33984(0x84c0, float:4.7622E-41)
            r14 = 3
            r18 = 33985(0x84c1, float:4.7623E-41)
            r15 = 2
            if (r5 == r0) goto L146
            if (r5 != r15) goto L13d
            android.opengl.GLES20.glActiveTexture(r17)     // Catch: java.lang.Throwable -> L11a
            java.nio.IntBuffer r0 = r1.f1456l     // Catch: java.lang.Throwable -> L11a
            int r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L11a
            android.opengl.GLES20.glBindTexture(r3, r0)     // Catch: java.lang.Throwable -> L11a
            r8 = 0
            r4 = r22
            r5 = r23
            r3 = r6
            r6 = r24
            r1.f(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L11a
            if (r2 == r15) goto L11d
            if (r2 == r14) goto L11d
            android.opengl.GLES20.glActiveTexture(r18)     // Catch: java.lang.Throwable -> L11a
            java.nio.IntBuffer r0 = r1.f1458n     // Catch: java.lang.Throwable -> L11a
            r14 = 0
            int r0 = r0.get(r14)     // Catch: java.lang.Throwable -> L116
            r15 = 3553(0xde1, float:4.979E-42)
            android.opengl.GLES20.glBindTexture(r15, r0)     // Catch: java.lang.Throwable -> L110
            r8 = 1
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = r25
            r1.f(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L110
            android.opengl.GLES20.glActiveTexture(r16)     // Catch: java.lang.Throwable -> L110
            java.nio.IntBuffer r0 = r1.f1459o     // Catch: java.lang.Throwable -> L110
            int r0 = r0.get(r14)     // Catch: java.lang.Throwable -> L110
            android.opengl.GLES20.glBindTexture(r15, r0)     // Catch: java.lang.Throwable -> L110
            r8 = 2
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = r25
            r1.f(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L110
        L10b:
            r14 = 3553(0xde1, float:4.979E-42)
            r15 = 0
            goto L1df
        L110:
            r0 = move-exception
        L111:
            r14 = 3553(0xde1, float:4.979E-42)
            r15 = 0
            goto L20a
        L116:
            r0 = move-exception
        L117:
            r15 = 3553(0xde1, float:4.979E-42)
            goto L111
        L11a:
            r0 = move-exception
            r14 = 0
            goto L117
        L11d:
            r14 = 0
            r15 = 3553(0xde1, float:4.979E-42)
            android.opengl.GLES20.glActiveTexture(r18)     // Catch: java.lang.Throwable -> L110
            java.nio.IntBuffer r0 = r1.f1457m     // Catch: java.lang.Throwable -> L110
            int r0 = r0.get(r14)     // Catch: java.lang.Throwable -> L110
            android.opengl.GLES20.glBindTexture(r15, r0)     // Catch: java.lang.Throwable -> L110
            r8 = 1
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = r25
            r1.f(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L110
            goto L10b
        L13d:
            r14 = 0
            r15 = 3553(0xde1, float:4.979E-42)
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Throwable -> L110
            r0.<init>()     // Catch: java.lang.Throwable -> L110
            throw r0     // Catch: java.lang.Throwable -> L110
        L146:
            r2 = 3553(0xde1, float:4.979E-42)
            r3 = 0
            android.opengl.GLES20.glActiveTexture(r17)     // Catch: java.lang.Throwable -> L110
            java.nio.IntBuffer r0 = r1.f1456l     // Catch: java.lang.Throwable -> L110
            int r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L110
            android.opengl.GLES20.glBindTexture(r2, r0)     // Catch: java.lang.Throwable -> L110
            r8 = 0
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = r25
            r14 = 3553(0xde1, float:4.979E-42)
            r15 = 0
            r1.f(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L1c1
            android.opengl.GLES20.glActiveTexture(r17)     // Catch: java.lang.Throwable -> L1c1
            java.nio.IntBuffer r2 = r1.f1456l     // Catch: java.lang.Throwable -> L1c1
            int r2 = r2.get(r15)     // Catch: java.lang.Throwable -> L1c1
            android.opengl.GLES20.glBindTexture(r14, r2)     // Catch: java.lang.Throwable -> L1c1
            r8 = 0
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = r25
            r1.f(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L1c1
            r3 = 2
            if (r2 == r3) goto L1c3
            r0 = 3
            if (r2 == r0) goto L1c3
            android.opengl.GLES20.glActiveTexture(r18)     // Catch: java.lang.Throwable -> L1c1
            java.nio.IntBuffer r0 = r1.f1458n     // Catch: java.lang.Throwable -> L1c1
            int r0 = r0.get(r15)     // Catch: java.lang.Throwable -> L1c1
            android.opengl.GLES20.glBindTexture(r14, r0)     // Catch: java.lang.Throwable -> L1c1
            r8 = 1
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = r25
            r1.f(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L1c1
            android.opengl.GLES20.glActiveTexture(r16)     // Catch: java.lang.Throwable -> L1c1
            java.nio.IntBuffer r0 = r1.f1459o     // Catch: java.lang.Throwable -> L1c1
            int r0 = r0.get(r15)     // Catch: java.lang.Throwable -> L1c1
            android.opengl.GLES20.glBindTexture(r14, r0)     // Catch: java.lang.Throwable -> L1c1
            r8 = 2
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = r25
            r1.f(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L1c1
            goto L1df
        L1c1:
            r0 = move-exception
            goto L20a
        L1c3:
            android.opengl.GLES20.glActiveTexture(r18)     // Catch: java.lang.Throwable -> L1c1
            java.nio.IntBuffer r0 = r1.f1457m     // Catch: java.lang.Throwable -> L1c1
            int r0 = r0.get(r15)     // Catch: java.lang.Throwable -> L1c1
            android.opengl.GLES20.glBindTexture(r14, r0)     // Catch: java.lang.Throwable -> L1c1
            r8 = 1
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = r25
            r1.f(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L1c1
        L1df:
            android.opengl.GLES20.glActiveTexture(r17)
            int r0 = r9.get(r15)
            android.opengl.GLES20.glBindTexture(r14, r0)
            android.opengl.GLES20.glActiveTexture(r18)
            int r0 = r12.get(r15)
            android.opengl.GLES20.glBindTexture(r14, r0)
            android.opengl.GLES20.glActiveTexture(r16)
            int r0 = r13.get(r15)
            android.opengl.GLES20.glBindTexture(r14, r0)
            int r0 = r11.get(r15)
            android.opengl.GLES20.glActiveTexture(r0)
            int r0 = r10.get(r15)
            goto L83
        L20a:
            android.opengl.GLES20.glActiveTexture(r17)
            int r1 = r9.get(r15)
            android.opengl.GLES20.glBindTexture(r14, r1)
            android.opengl.GLES20.glActiveTexture(r18)
            int r1 = r12.get(r15)
            android.opengl.GLES20.glBindTexture(r14, r1)
            android.opengl.GLES20.glActiveTexture(r16)
            int r1 = r13.get(r15)
            android.opengl.GLES20.glBindTexture(r14, r1)
            int r1 = r11.get(r15)
            android.opengl.GLES20.glActiveTexture(r1)
            int r1 = r10.get(r15)
            android.opengl.GLES20.glUseProgram(r1)
            throw r0
    }
}
