package com.hw.videoprocessor.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.TargetApi(16)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class h {
    private static final int k = 4;
    private static final int l = 20;
    private static final int m = 0;
    private static final int n = 3;
    private static final float[] o = null;
    private static final java.lang.String p = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";
    private static final java.lang.String q = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
    private java.nio.FloatBuffer a;
    private float[] b;
    private float[] c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;

    static {
            r0 = 20
            float[] r0 = new float[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [-1082130432, -1082130432, 0, 0, 0, 1065353216, -1082130432, 0, 1065353216, 0, -1082130432, 1065353216, 0, 0, 1065353216, 1065353216, 1065353216, 0, 1065353216, 1065353216} // fill-array
            com.hw.videoprocessor.util.h.o = r0
            return
    }

    public h(int r3) {
            r2 = this;
            r2.<init>()
            r0 = 16
            float[] r1 = new float[r0]
            r2.b = r1
            float[] r0 = new float[r0]
            r2.c = r0
            r0 = -12345(0xffffffffffffcfc7, float:NaN)
            r2.e = r0
            r2.j = r3
            float[] r3 = com.hw.videoprocessor.util.h.o
            int r0 = r3.length
            int r0 = r0 * 4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r0 = r0.order(r1)
            java.nio.FloatBuffer r0 = r0.asFloatBuffer()
            r2.a = r0
            java.nio.FloatBuffer r3 = r0.put(r3)
            r0 = 0
            r3.position(r0)
            float[] r3 = r2.c
            android.opengl.Matrix.setIdentityM(r3, r0)
            return
    }

    private int c(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            r0 = 35633(0x8b31, float:4.9932E-41)
            int r4 = r3.f(r0, r4)
            r0 = 0
            if (r4 != 0) goto Lb
            return r0
        Lb:
            r1 = 35632(0x8b30, float:4.9931E-41)
            int r5 = r3.f(r1, r5)
            if (r5 != 0) goto L15
            return r0
        L15:
            int r1 = android.opengl.GLES20.glCreateProgram()
            java.lang.String r2 = "glCreateProgram"
            r3.b(r2)
            if (r1 != 0) goto L21
            return r0
        L21:
            android.opengl.GLES20.glAttachShader(r1, r4)
            java.lang.String r4 = "glAttachShader"
            r3.b(r4)
            android.opengl.GLES20.glAttachShader(r1, r5)
            r3.b(r4)
            android.opengl.GLES20.glLinkProgram(r1)
            r4 = 1
            int[] r5 = new int[r4]
            r2 = 35714(0x8b82, float:5.0046E-41)
            android.opengl.GLES20.glGetProgramiv(r1, r2, r5, r0)
            r5 = r5[r0]
            if (r5 == r4) goto L43
            android.opengl.GLES20.glDeleteProgram(r1)
            return r0
        L43:
            return r1
    }

    private int f(int r4, java.lang.String r5) {
            r3 = this;
            int r0 = android.opengl.GLES20.glCreateShader(r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "glCreateShader type="
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r3.b(r4)
            android.opengl.GLES20.glShaderSource(r0, r5)
            android.opengl.GLES20.glCompileShader(r0)
            r4 = 1
            int[] r4 = new int[r4]
            r5 = 35713(0x8b81, float:5.0045E-41)
            r1 = 0
            android.opengl.GLES20.glGetShaderiv(r0, r5, r4, r1)
            r4 = r4[r1]
            if (r4 != 0) goto L30
            android.opengl.GLES20.glDeleteShader(r0)
            return r1
        L30:
            return r0
    }

    public void a(java.lang.String r2) {
            r1 = this;
            int r0 = r1.d
            android.opengl.GLES20.glDeleteProgram(r0)
            java.lang.String r0 = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n"
            int r2 = r1.c(r0, r2)
            r1.d = r2
            if (r2 == 0) goto L10
            return
        L10:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r0 = "failed creating program"
            r2.<init>(r0)
            throw r2
    }

    public void b(java.lang.String r4) {
            r3 = this;
            int r0 = android.opengl.GLES20.glGetError()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            java.lang.String r4 = ": glError "
            r2.append(r4)
            r2.append(r0)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4)
            throw r1
    }

    public void d(android.graphics.SurfaceTexture r9, boolean r10) {
            r8 = this;
            java.lang.String r0 = "onDrawFrame start"
            r8.b(r0)
            float[] r0 = r8.c
            r9.getTransformMatrix(r0)
            r9 = 5
            if (r10 == 0) goto L1d
            float[] r10 = r8.c
            r0 = r10[r9]
            float r0 = -r0
            r10[r9] = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 13
            r2 = r10[r1]
            float r0 = r0 - r2
            r10[r1] = r0
        L1d:
            int r10 = r8.d
            android.opengl.GLES20.glUseProgram(r10)
            java.lang.String r10 = "glUseProgram"
            r8.b(r10)
            r10 = 33984(0x84c0, float:4.7622E-41)
            android.opengl.GLES20.glActiveTexture(r10)
            r10 = 36197(0x8d65, float:5.0723E-41)
            int r0 = r8.e
            android.opengl.GLES20.glBindTexture(r10, r0)
            java.nio.FloatBuffer r10 = r8.a
            r0 = 0
            r10.position(r0)
            int r1 = r8.h
            r5 = 20
            java.nio.FloatBuffer r6 = r8.a
            r2 = 3
            r3 = 5126(0x1406, float:7.183E-42)
            r4 = 0
            android.opengl.GLES20.glVertexAttribPointer(r1, r2, r3, r4, r5, r6)
            java.lang.String r10 = "glVertexAttribPointer maPosition"
            r8.b(r10)
            int r10 = r8.h
            android.opengl.GLES20.glEnableVertexAttribArray(r10)
            java.lang.String r10 = "glEnableVertexAttribArray maPositionHandle"
            r8.b(r10)
            java.nio.FloatBuffer r10 = r8.a
            r1 = 3
            r10.position(r1)
            int r2 = r8.i
            r6 = 20
            java.nio.FloatBuffer r7 = r8.a
            r3 = 2
            r4 = 5126(0x1406, float:7.183E-42)
            r5 = 0
            android.opengl.GLES20.glVertexAttribPointer(r2, r3, r4, r5, r6, r7)
            java.lang.String r10 = "glVertexAttribPointer maTextureHandle"
            r8.b(r10)
            int r10 = r8.i
            android.opengl.GLES20.glEnableVertexAttribArray(r10)
            java.lang.String r10 = "glEnableVertexAttribArray maTextureHandle"
            r8.b(r10)
            int r10 = r8.g
            float[] r1 = r8.c
            r2 = 1
            android.opengl.GLES20.glUniformMatrix4fv(r10, r2, r0, r1, r0)
            int r10 = r8.f
            float[] r1 = r8.b
            android.opengl.GLES20.glUniformMatrix4fv(r10, r2, r0, r1, r0)
            r10 = 4
            android.opengl.GLES20.glDrawArrays(r9, r0, r10)
            java.lang.String r9 = "glDrawArrays"
            r8.b(r9)
            android.opengl.GLES20.glFinish()
            return
    }

    public int e() {
            r1 = this;
            int r0 = r1.e
            return r0
    }

    public void g() {
            r7 = this;
            java.lang.String r0 = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n"
            java.lang.String r1 = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n"
            int r0 = r7.c(r0, r1)
            r7.d = r0
            if (r0 == 0) goto Lc3
            java.lang.String r1 = "aPosition"
            int r0 = android.opengl.GLES20.glGetAttribLocation(r0, r1)
            r7.h = r0
            java.lang.String r0 = "glGetAttribLocation aPosition"
            r7.b(r0)
            int r0 = r7.h
            r1 = -1
            if (r0 == r1) goto Lbb
            int r0 = r7.d
            java.lang.String r2 = "aTextureCoord"
            int r0 = android.opengl.GLES20.glGetAttribLocation(r0, r2)
            r7.i = r0
            java.lang.String r0 = "glGetAttribLocation aTextureCoord"
            r7.b(r0)
            int r0 = r7.i
            if (r0 == r1) goto Lb3
            int r0 = r7.d
            java.lang.String r2 = "uMVPMatrix"
            int r0 = android.opengl.GLES20.glGetUniformLocation(r0, r2)
            r7.f = r0
            java.lang.String r0 = "glGetUniformLocation uMVPMatrix"
            r7.b(r0)
            int r0 = r7.f
            if (r0 == r1) goto Lab
            int r0 = r7.d
            java.lang.String r2 = "uSTMatrix"
            int r0 = android.opengl.GLES20.glGetUniformLocation(r0, r2)
            r7.g = r0
            java.lang.String r0 = "glGetUniformLocation uSTMatrix"
            r7.b(r0)
            int r0 = r7.g
            if (r0 == r1) goto La3
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 0
            android.opengl.GLES20.glGenTextures(r0, r1, r2)
            r0 = r1[r2]
            r7.e = r0
            r1 = 36197(0x8d65, float:5.0723E-41)
            android.opengl.GLES20.glBindTexture(r1, r0)
            java.lang.String r0 = "glBindTexture mTextureID"
            r7.b(r0)
            r0 = 10241(0x2801, float:1.435E-41)
            r3 = 1175977984(0x46180000, float:9728.0)
            android.opengl.GLES20.glTexParameterf(r1, r0, r3)
            r0 = 10240(0x2800, float:1.4349E-41)
            r3 = 1175979008(0x46180400, float:9729.0)
            android.opengl.GLES20.glTexParameterf(r1, r0, r3)
            r0 = 10242(0x2802, float:1.4352E-41)
            r3 = 33071(0x812f, float:4.6342E-41)
            android.opengl.GLES20.glTexParameteri(r1, r0, r3)
            r0 = 10243(0x2803, float:1.4354E-41)
            android.opengl.GLES20.glTexParameteri(r1, r0, r3)
            java.lang.String r0 = "glTexParameter"
            r7.b(r0)
            float[] r0 = r7.b
            android.opengl.Matrix.setIdentityM(r0, r2)
            int r0 = r7.j
            if (r0 == 0) goto La2
            float[] r1 = r7.b
            float r3 = (float) r0
            r5 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            r4 = 0
            android.opengl.Matrix.rotateM(r1, r2, r3, r4, r5, r6)
        La2:
            return
        La3:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Could not get attrib location for uSTMatrix"
            r0.<init>(r1)
            throw r0
        Lab:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Could not get attrib location for uMVPMatrix"
            r0.<init>(r1)
            throw r0
        Lb3:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Could not get attrib location for aTextureCoord"
            r0.<init>(r1)
            throw r0
        Lbb:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Could not get attrib location for aPosition"
            r0.<init>(r1)
            throw r0
        Lc3:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "failed creating program"
            r0.<init>(r1)
            throw r0
    }
}
