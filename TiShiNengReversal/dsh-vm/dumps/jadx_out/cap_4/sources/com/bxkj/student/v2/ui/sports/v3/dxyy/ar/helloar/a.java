package com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class a {

    @org.jetbrains.annotations.Nullable
    private javax.microedition.khronos.egl.EGLContext a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String k;

    /* renamed from: l, reason: collision with root package name */
    @org.jetbrains.annotations.NotNull
    private final java.lang.String f1468l;

    public a() {
            r15 = this;
            r15.<init>()
            java.lang.String r0 = "uniform mat4 trans;\nuniform mat4 proj;\nattribute vec4 coord;\nattribute vec4 color;\nvarying vec4 vcolor;\n\nvoid main(void)\n{\n    vcolor = color;\n    gl_Position = proj*trans*coord;\n}\n\n"
            r15.k = r0
            java.lang.String r1 = "#ifdef GL_ES\nprecision highp float;\n#endif\nvarying vec4 vcolor;\n\nvoid main(void)\n{\n    gl_FragColor = vcolor;\n}\n\n"
            r15.f1468l = r1
            javax.microedition.khronos.egl.EGL r2 = javax.microedition.khronos.egl.EGLContext.getEGL()
            java.lang.String r3 = "null cannot be cast to non-null type javax.microedition.khronos.egl.EGL10"
            kotlin.jvm.internal.g0.n(r2, r3)
            javax.microedition.khronos.egl.EGL10 r2 = (javax.microedition.khronos.egl.EGL10) r2
            javax.microedition.khronos.egl.EGLContext r2 = r2.eglGetCurrentContext()
            r15.a = r2
            int r2 = android.opengl.GLES20.glCreateProgram()
            r15.b = r2
            r3 = 35633(0x8b31, float:4.9932E-41)
            int r3 = android.opengl.GLES20.glCreateShader(r3)
            android.opengl.GLES20.glShaderSource(r3, r0)
            android.opengl.GLES20.glCompileShader(r3)
            r0 = 35632(0x8b30, float:4.9931E-41)
            int r0 = android.opengl.GLES20.glCreateShader(r0)
            android.opengl.GLES20.glShaderSource(r0, r1)
            android.opengl.GLES20.glCompileShader(r0)
            android.opengl.GLES20.glAttachShader(r2, r3)
            android.opengl.GLES20.glAttachShader(r2, r0)
            android.opengl.GLES20.glLinkProgram(r2)
            android.opengl.GLES20.glUseProgram(r2)
            android.opengl.GLES20.glDeleteShader(r3)
            android.opengl.GLES20.glDeleteShader(r0)
            java.lang.String r0 = "coord"
            int r0 = android.opengl.GLES20.glGetAttribLocation(r2, r0)
            r15.c = r0
            java.lang.String r0 = "color"
            int r0 = android.opengl.GLES20.glGetAttribLocation(r2, r0)
            r15.d = r0
            java.lang.String r0 = "trans"
            int r0 = android.opengl.GLES20.glGetUniformLocation(r2, r0)
            r15.e = r0
            java.lang.String r0 = "proj"
            int r0 = android.opengl.GLES20.glGetUniformLocation(r2, r0)
            r15.f = r0
            int r0 = r15.h()
            r15.g = r0
            r1 = 34962(0x8892, float:4.8992E-41)
            android.opengl.GLES20.glBindBuffer(r1, r0)
            r0 = 3
            float[] r2 = new float[r0]
            r2 = {x01c0: FILL_ARRAY_DATA , data: [1056964608, 1056964608, 1000593162} // fill-array
            float[] r3 = new float[r0]
            r3 = {x01ca: FILL_ARRAY_DATA , data: [1056964608, -1090519040, 1000593162} // fill-array
            float[] r4 = new float[r0]
            r4 = {x01d4: FILL_ARRAY_DATA , data: [-1090519040, -1090519040, 1000593162} // fill-array
            float[] r5 = new float[r0]
            r5 = {x01de: FILL_ARRAY_DATA , data: [-1090519040, 1056964608, 1000593162} // fill-array
            float[] r6 = new float[r0]
            r6 = {x01e8: FILL_ARRAY_DATA , data: [1056964608, 1056964608, -1146890486} // fill-array
            float[] r7 = new float[r0]
            r7 = {x01f2: FILL_ARRAY_DATA , data: [1056964608, -1090519040, -1146890486} // fill-array
            float[] r8 = new float[r0]
            r8 = {x01fc: FILL_ARRAY_DATA , data: [-1090519040, -1090519040, -1146890486} // fill-array
            float[] r9 = new float[r0]
            r9 = {x0206: FILL_ARRAY_DATA , data: [-1090519040, 1056964608, -1146890486} // fill-array
            r10 = 8
            float[][] r11 = new float[r10][]
            r12 = 0
            r11[r12] = r2
            r2 = 1
            r11[r2] = r3
            r3 = 2
            r11[r3] = r4
            r11[r0] = r5
            r4 = 4
            r11[r4] = r6
            r5 = 5
            r11[r5] = r7
            r6 = 6
            r11[r6] = r8
            r7 = 7
            r11[r7] = r9
            float[] r8 = r15.e(r11)
            java.nio.FloatBuffer r8 = java.nio.FloatBuffer.wrap(r8)
            int r9 = r8.limit()
            int r9 = r9 * 4
            r11 = 35048(0x88e8, float:4.9113E-41)
            android.opengl.GLES20.glBufferData(r1, r9, r8, r11)
            int r8 = r15.h()
            r15.h = r8
            android.opengl.GLES20.glBindBuffer(r1, r8)
            int[][] r8 = new int[r10][]
            r9 = 255(0xff, float:3.57E-43)
            r11 = 128(0x80, float:1.8E-43)
            int[] r13 = new int[]{r9, r12, r12, r11}
            r8[r12] = r13
            int[] r13 = new int[]{r12, r9, r12, r11}
            r8[r2] = r13
            int[] r13 = new int[]{r12, r12, r9, r11}
            r8[r3] = r13
            int[] r13 = new int[]{r12, r12, r12, r11}
            r8[r0] = r13
            int[] r13 = new int[]{r12, r9, r9, r11}
            r8[r4] = r13
            int[] r13 = new int[]{r9, r12, r9, r11}
            r8[r5] = r13
            int[] r13 = new int[]{r9, r9, r12, r11}
            r8[r6] = r13
            int[] r11 = new int[]{r9, r9, r9, r11}
            r8[r7] = r11
            int[] r8 = r15.f(r8)
            byte[] r8 = r15.a(r8)
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.wrap(r8)
            int r11 = r8.limit()
            r13 = 35044(0x88e4, float:4.9107E-41)
            android.opengl.GLES20.glBufferData(r1, r11, r8, r13)
            int r8 = r15.h()
            r15.i = r8
            android.opengl.GLES20.glBindBuffer(r1, r8)
            int[][] r8 = new int[r10][]
            int[] r10 = new int[]{r9, r12, r12, r9}
            r8[r12] = r10
            int[] r10 = new int[]{r9, r9, r12, r9}
            r8[r2] = r10
            int[] r10 = new int[]{r12, r9, r12, r9}
            r8[r3] = r10
            int[] r10 = new int[]{r9, r12, r9, r9}
            r8[r0] = r10
            int[] r10 = new int[]{r9, r12, r9, r9}
            r8[r4] = r10
            int[] r10 = new int[]{r9, r9, r9, r9}
            r8[r5] = r10
            int[] r10 = new int[]{r12, r9, r9, r9}
            r8[r6] = r10
            int[] r9 = new int[]{r9, r12, r9, r9}
            r8[r7] = r9
            int[] r7 = r15.f(r8)
            byte[] r7 = r15.a(r7)
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.wrap(r7)
            int r8 = r7.limit()
            android.opengl.GLES20.glBufferData(r1, r8, r7, r13)
            int r1 = r15.h()
            r15.j = r1
            r7 = 34963(0x8893, float:4.8994E-41)
            android.opengl.GLES20.glBindBuffer(r7, r1)
            short[] r1 = new short[r4]
            r1 = {x0210: FILL_ARRAY_DATA , data: [0, 1, 5, 4} // fill-array
            short[] r8 = new short[r4]
            r8 = {x0218: FILL_ARRAY_DATA , data: [3, 7, 6, 2} // fill-array
            short[] r9 = new short[r4]
            r9 = {x0220: FILL_ARRAY_DATA , data: [0, 4, 7, 3} // fill-array
            short[] r10 = new short[r4]
            r10 = {x0228: FILL_ARRAY_DATA , data: [1, 2, 6, 5} // fill-array
            short[] r11 = new short[r4]
            r11 = {x0230: FILL_ARRAY_DATA , data: [0, 3, 2, 1} // fill-array
            short[] r14 = new short[r4]
            r14 = {x0238: FILL_ARRAY_DATA , data: [4, 5, 6, 7} // fill-array
            short[][] r6 = new short[r6][]
            r6[r12] = r1
            r6[r2] = r8
            r6[r3] = r9
            r6[r0] = r10
            r6[r4] = r11
            r6[r5] = r14
            short[] r0 = r15.g(r6)
            java.nio.ShortBuffer r0 = java.nio.ShortBuffer.wrap(r0)
            int r1 = r0.limit()
            int r1 = r1 * 2
            android.opengl.GLES20.glBufferData(r7, r1, r0, r13)
            return
    }

    private final byte[] a(int[] r4) {
            r3 = this;
            int r0 = r4.length
            byte[] r0 = new byte[r0]
            r1 = 0
        L4:
            int r2 = r4.length
            if (r1 >= r2) goto L11
            r2 = r4[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L11:
            return r0
    }

    private final void b(int r3) {
            r2 = this;
            int[] r3 = new int[]{r3}
            r0 = 1
            r1 = 0
            android.opengl.GLES20.glDeleteBuffers(r0, r3, r1)
            return
    }

    private final byte[] d(byte[][] r7) {
            r6 = this;
            r0 = 0
            r1 = 0
            r2 = 0
        L3:
            int r3 = r7.length
            if (r1 >= r3) goto Ld
            r3 = r7[r1]
            int r3 = r3.length
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L3
        Ld:
            byte[] r1 = new byte[r2]
            r2 = 0
            r3 = 0
        L11:
            int r4 = r7.length
            if (r2 >= r4) goto L21
            r4 = r7[r2]
            int r5 = r4.length
            java.lang.System.arraycopy(r4, r0, r1, r3, r5)
            r4 = r7[r2]
            int r4 = r4.length
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L11
        L21:
            return r1
    }

    private final float[] e(float[][] r7) {
            r6 = this;
            r0 = 0
            r1 = 0
            r2 = 0
        L3:
            int r3 = r7.length
            if (r1 >= r3) goto Ld
            r3 = r7[r1]
            int r3 = r3.length
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L3
        Ld:
            float[] r1 = new float[r2]
            r2 = 0
            r3 = 0
        L11:
            int r4 = r7.length
            if (r2 >= r4) goto L21
            r4 = r7[r2]
            int r5 = r4.length
            java.lang.System.arraycopy(r4, r0, r1, r3, r5)
            r4 = r7[r2]
            int r4 = r4.length
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L11
        L21:
            return r1
    }

    private final int[] f(int[][] r7) {
            r6 = this;
            r0 = 0
            r1 = 0
            r2 = 0
        L3:
            int r3 = r7.length
            if (r1 >= r3) goto Ld
            r3 = r7[r1]
            int r3 = r3.length
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L3
        Ld:
            int[] r1 = new int[r2]
            r2 = 0
            r3 = 0
        L11:
            int r4 = r7.length
            if (r2 >= r4) goto L21
            r4 = r7[r2]
            int r5 = r4.length
            java.lang.System.arraycopy(r4, r0, r1, r3, r5)
            r4 = r7[r2]
            int r4 = r4.length
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L11
        L21:
            return r1
    }

    private final short[] g(short[][] r7) {
            r6 = this;
            r0 = 0
            r1 = 0
            r2 = 0
        L3:
            int r3 = r7.length
            if (r1 >= r3) goto Ld
            r3 = r7[r1]
            int r3 = r3.length
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L3
        Ld:
            short[] r1 = new short[r2]
            r2 = 0
            r3 = 0
        L11:
            int r4 = r7.length
            if (r2 >= r4) goto L21
            r4 = r7[r2]
            int r5 = r4.length
            java.lang.System.arraycopy(r4, r0, r1, r3, r5)
            r4 = r7[r2]
            int r4 = r4.length
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L11
        L21:
            return r1
    }

    private final int h() {
            r3 = this;
            r0 = 0
            int[] r1 = new int[]{r0}
            r2 = 1
            android.opengl.GLES20.glGenBuffers(r2, r1, r0)
            r0 = r1[r0]
            return r0
    }

    private final float[] i(cn.easyar.Matrix44F r33) {
            r32 = this;
            r0 = r33
            float[] r0 = r0.data
            java.lang.String r1 = "data"
            kotlin.jvm.internal.g0.o(r0, r1)
            r1 = 0
            r2 = r0[r1]
            r3 = 4
            r4 = r0[r3]
            r5 = 8
            r6 = r0[r5]
            r7 = 12
            r8 = r0[r7]
            r9 = 1
            r10 = r0[r9]
            r11 = 5
            r12 = r0[r11]
            r13 = 9
            r14 = r0[r13]
            r15 = 13
            r16 = r0[r15]
            r17 = 2
            r18 = r0[r17]
            r19 = 6
            r20 = r0[r19]
            r21 = 10
            r22 = r0[r21]
            r23 = 14
            r24 = r0[r23]
            r25 = 3
            r26 = r0[r25]
            r27 = 7
            r28 = r0[r27]
            r29 = 11
            r30 = r0[r29]
            r31 = 15
            r0 = r0[r31]
            r33 = 0
            r1 = 16
            float[] r1 = new float[r1]
            r1[r33] = r2
            r1[r9] = r4
            r1[r17] = r6
            r1[r25] = r8
            r1[r3] = r10
            r1[r11] = r12
            r1[r19] = r14
            r1[r27] = r16
            r1[r5] = r18
            r1[r13] = r20
            r1[r21] = r22
            r1[r29] = r24
            r1[r7] = r26
            r1[r15] = r28
            r1[r23] = r30
            r1[r31] = r0
            return r1
    }

    public final void c() {
            r2 = this;
            javax.microedition.khronos.egl.EGL r0 = javax.microedition.khronos.egl.EGLContext.getEGL()
            java.lang.String r1 = "null cannot be cast to non-null type javax.microedition.khronos.egl.EGL10"
            kotlin.jvm.internal.g0.n(r0, r1)
            javax.microedition.khronos.egl.EGL10 r0 = (javax.microedition.khronos.egl.EGL10) r0
            javax.microedition.khronos.egl.EGLContext r0 = r0.eglGetCurrentContext()
            javax.microedition.khronos.egl.EGLContext r1 = r2.a
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L30
            int r0 = r2.b
            android.opengl.GLES20.glDeleteProgram(r0)
            int r0 = r2.g
            r2.b(r0)
            int r0 = r2.h
            r2.b(r0)
            int r0 = r2.i
            r2.b(r0)
            int r0 = r2.j
            r2.b(r0)
        L30:
            return
    }

    public final void j(@org.jetbrains.annotations.NotNull cn.easyar.Matrix44F r29, @org.jetbrains.annotations.NotNull cn.easyar.Matrix44F r30, @org.jetbrains.annotations.NotNull cn.easyar.Vec2F r31) {
            r28 = this;
            r0 = r28
            r1 = r30
            r2 = r31
            java.lang.String r3 = "projectionMatrix"
            r4 = r29
            kotlin.jvm.internal.g0.p(r4, r3)
            java.lang.String r3 = "cameraview"
            kotlin.jvm.internal.g0.p(r1, r3)
            java.lang.String r3 = "size"
            kotlin.jvm.internal.g0.p(r2, r3)
            float[] r2 = r2.data
            r3 = 0
            r5 = r2[r3]
            r6 = 1
            r2 = r2[r6]
            int r7 = r0.g
            r8 = 34962(0x8892, float:4.8992E-41)
            android.opengl.GLES20.glBindBuffer(r8, r7)
            r7 = 1000(0x3e8, float:1.401E-42)
            float r7 = (float) r7
            float r7 = r5 / r7
            r9 = 2
            float r10 = (float) r9
            float r11 = r5 / r10
            float r12 = r2 / r10
            float r7 = r7 / r10
            r13 = 3
            float[] r14 = new float[r13]
            r14[r3] = r11
            r14[r6] = r12
            r14[r9] = r7
            float r15 = -r2
            float r16 = r15 / r10
            r31 = 2
            float[] r9 = new float[r13]
            r9[r3] = r11
            r9[r6] = r16
            r9[r31] = r7
            r17 = 0
            float r3 = -r5
            float r10 = r3 / r10
            r18 = 1
            float[] r6 = new float[r13]
            r6[r17] = r10
            r6[r18] = r16
            r6[r31] = r7
            float[] r8 = new float[r13]
            r8[r17] = r10
            r8[r18] = r12
            r8[r31] = r7
            float[] r7 = new float[r13]
            r7[r17] = r11
            r7[r18] = r12
            r20 = 0
            r7[r31] = r20
            r21 = r2
            float[] r2 = new float[r13]
            r2[r17] = r11
            r2[r18] = r16
            r2[r31] = r20
            float[] r11 = new float[r13]
            r11[r17] = r10
            r11[r18] = r16
            r11[r31] = r20
            r16 = r2
            float[] r2 = new float[r13]
            r2[r17] = r10
            r2[r18] = r12
            r2[r31] = r20
            r10 = 8
            float[][] r12 = new float[r10][]
            r12[r17] = r14
            r12[r18] = r9
            r12[r31] = r6
            r12[r13] = r8
            r6 = 4
            r12[r6] = r7
            r7 = 5
            r12[r7] = r16
            r8 = 6
            r12[r8] = r11
            r9 = 7
            r12[r9] = r2
            float[] r2 = r0.e(r12)
            java.nio.FloatBuffer r2 = java.nio.FloatBuffer.wrap(r2)
            int r11 = r2.limit()
            int r11 = r11 * 4
            r12 = 35048(0x88e8, float:4.9113E-41)
            r14 = 34962(0x8892, float:4.8992E-41)
            android.opengl.GLES20.glBufferData(r14, r11, r2, r12)
            r2 = 3042(0xbe2, float:4.263E-42)
            android.opengl.GLES20.glEnable(r2)
            r2 = 770(0x302, float:1.079E-42)
            r11 = 771(0x303, float:1.08E-42)
            android.opengl.GLES20.glBlendFunc(r2, r11)
            r2 = 2929(0xb71, float:4.104E-42)
            android.opengl.GLES20.glEnable(r2)
            int r2 = r0.b
            android.opengl.GLES20.glUseProgram(r2)
            int r2 = r0.g
            android.opengl.GLES20.glBindBuffer(r14, r2)
            int r2 = r0.c
            android.opengl.GLES20.glEnableVertexAttribArray(r2)
            int r2 = r0.c
            r26 = 0
            r27 = 0
            r23 = 3
            r24 = 5126(0x1406, float:7.183E-42)
            r25 = 0
            r22 = r2
            android.opengl.GLES20.glVertexAttribPointer(r22, r23, r24, r25, r26, r27)
            int r2 = r0.h
            android.opengl.GLES20.glBindBuffer(r14, r2)
            int r2 = r0.d
            android.opengl.GLES20.glEnableVertexAttribArray(r2)
            int r2 = r0.d
            r23 = 4
            r24 = 5121(0x1401, float:7.176E-42)
            r25 = 1
            r22 = r2
            android.opengl.GLES20.glVertexAttribPointer(r22, r23, r24, r25, r26, r27)
            int r2 = r0.e
            float[] r1 = r0.i(r1)
            r11 = 0
            r14 = 1
            android.opengl.GLES20.glUniformMatrix4fv(r2, r14, r11, r1, r11)
            int r1 = r0.f
            float[] r2 = r28.i(r29)
            android.opengl.GLES20.glUniformMatrix4fv(r1, r14, r11, r2, r11)
            r1 = 34963(0x8893, float:4.8994E-41)
            int r2 = r0.j
            android.opengl.GLES20.glBindBuffer(r1, r2)
            r11 = 0
        L11a:
            r1 = 5123(0x1403, float:7.179E-42)
            if (r11 >= r8) goto L126
            int r2 = r11 * 8
            android.opengl.GLES20.glDrawElements(r8, r6, r1, r2)
            int r11 = r11 + 1
            goto L11a
        L126:
            int r2 = r0.g
            r14 = 34962(0x8892, float:4.8992E-41)
            android.opengl.GLES20.glBindBuffer(r14, r2)
            float r2 = (float) r6
            float r5 = r5 / r2
            float r4 = r21 / r2
            float[] r11 = new float[r13]
            r17 = 0
            r11[r17] = r5
            r18 = 1
            r11[r18] = r4
            r11[r31] = r5
            float r15 = r15 / r2
            float[] r14 = new float[r13]
            r14[r17] = r5
            r14[r18] = r15
            r14[r31] = r5
            float r3 = r3 / r2
            float[] r2 = new float[r13]
            r2[r17] = r3
            r2[r18] = r15
            r2[r31] = r5
            r16 = 5
            float[] r7 = new float[r13]
            r7[r17] = r3
            r7[r18] = r4
            r7[r31] = r5
            r21 = 7
            float[] r9 = new float[r13]
            r9[r17] = r5
            r9[r18] = r4
            r9[r31] = r20
            float[] r1 = new float[r13]
            r1[r17] = r5
            r1[r18] = r15
            r1[r31] = r20
            float[] r5 = new float[r13]
            r5[r17] = r3
            r5[r18] = r15
            r5[r31] = r20
            float[] r15 = new float[r13]
            r15[r17] = r3
            r15[r18] = r4
            r15[r31] = r20
            float[][] r3 = new float[r10][]
            r3[r17] = r11
            r3[r18] = r14
            r3[r31] = r2
            r3[r13] = r7
            r3[r6] = r9
            r3[r16] = r1
            r3[r8] = r5
            r3[r21] = r15
            float[] r1 = r0.e(r3)
            java.nio.FloatBuffer r1 = java.nio.FloatBuffer.wrap(r1)
            int r2 = r1.limit()
            int r2 = r2 * 4
            r14 = 34962(0x8892, float:4.8992E-41)
            android.opengl.GLES20.glBufferData(r14, r2, r1, r12)
            int r1 = r0.c
            android.opengl.GLES20.glEnableVertexAttribArray(r1)
            int r1 = r0.c
            r22 = 0
            r23 = 0
            r19 = 3
            r20 = 5126(0x1406, float:7.183E-42)
            r21 = 0
            r18 = r1
            android.opengl.GLES20.glVertexAttribPointer(r18, r19, r20, r21, r22, r23)
            int r1 = r0.i
            android.opengl.GLES20.glBindBuffer(r14, r1)
            int r1 = r0.d
            android.opengl.GLES20.glEnableVertexAttribArray(r1)
            int r9 = r0.d
            r13 = 0
            r14 = 0
            r10 = 4
            r11 = 5121(0x1401, float:7.176E-42)
            r12 = 1
            android.opengl.GLES20.glVertexAttribPointer(r9, r10, r11, r12, r13, r14)
            r3 = 0
        L1ce:
            if (r3 >= r8) goto L1da
            int r1 = r3 * 8
            r2 = 5123(0x1403, float:7.179E-42)
            android.opengl.GLES20.glDrawElements(r8, r6, r2, r1)
            int r3 = r3 + 1
            goto L1ce
        L1da:
            return
    }
}
