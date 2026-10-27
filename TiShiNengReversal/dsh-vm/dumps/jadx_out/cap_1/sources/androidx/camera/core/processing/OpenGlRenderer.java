package androidx.camera.core.processing;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
@androidx.annotation.WorkerThread
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class OpenGlRenderer {
    private static final java.lang.String DEFAULT_FRAGMENT_SHADER = null;
    private static final java.lang.String DEFAULT_VERTEX_SHADER = null;
    private static final java.lang.String HDR_FRAGMENT_SHADER = null;
    private static final java.lang.String HDR_VERTEX_SHADER = null;
    private static final androidx.camera.core.processing.OpenGlRenderer.OutputSurface NO_OUTPUT_SURFACE = null;
    private static final int PIXEL_STRIDE = 4;
    private static final int SIZEOF_FLOAT = 4;
    private static final java.lang.String TAG = "OpenGlRenderer";
    private static final java.nio.FloatBuffer TEX_BUF = null;
    private static final float[] TEX_COORDS = null;
    private static final java.lang.String VAR_TEXTURE = "sTexture";
    private static final java.lang.String VAR_TEXTURE_COORD = "vTextureCoord";
    private static final java.nio.FloatBuffer VERTEX_BUF = null;
    private static final float[] VERTEX_COORDS = null;

    @androidx.annotation.Nullable
    private android.view.Surface mCurrentSurface;

    @androidx.annotation.Nullable
    private android.opengl.EGLConfig mEglConfig;

    @androidx.annotation.NonNull
    private android.opengl.EGLContext mEglContext;

    @androidx.annotation.NonNull
    private android.opengl.EGLDisplay mEglDisplay;
    private int mExternalTextureId;

    @androidx.annotation.Nullable
    private java.lang.Thread mGlThread;
    private final java.util.concurrent.atomic.AtomicBoolean mInitialized;

    @androidx.annotation.VisibleForTesting
    final java.util.Map<android.view.Surface, androidx.camera.core.processing.OpenGlRenderer.OutputSurface> mOutputSurfaceMap;
    private int mPositionLoc;
    private int mProgramHandle;

    @androidx.annotation.NonNull
    private android.opengl.EGLSurface mTempSurface;
    private int mTexCoordLoc;
    private int mTexMatrixLoc;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.auto.value.AutoValue
    static abstract class OutputSurface {
        OutputSurface() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        static androidx.camera.core.processing.OpenGlRenderer.OutputSurface of(@androidx.annotation.NonNull android.opengl.EGLSurface r1, int r2, int r3) {
                androidx.camera.core.processing.AutoValue_OpenGlRenderer_OutputSurface r0 = new androidx.camera.core.processing.AutoValue_OpenGlRenderer_OutputSurface
                r0.<init>(r1, r2, r3)
                return r0
        }

        @androidx.annotation.NonNull
        abstract android.opengl.EGLSurface getEglSurface();

        abstract int getHeight();

        abstract int getWidth();
    }

    static {
            java.util.Locale r0 = java.util.Locale.US
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            java.lang.String r4 = "vTextureCoord"
            r2[r3] = r4
            r5 = 1
            r2[r5] = r4
            java.lang.String r6 = "uniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 %s;\nvoid main() {\n    gl_Position = aPosition;\n    %s = (uTexMatrix * aTextureCoord).xy;\n}\n"
            java.lang.String r2 = java.lang.String.format(r0, r6, r2)
            androidx.camera.core.processing.OpenGlRenderer.DEFAULT_VERTEX_SHADER = r2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r2[r3] = r4
            r2[r5] = r4
            java.lang.String r6 = "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nout vec2 %s;\nvoid main() {\n  gl_Position = aPosition;\n  %s = (uTexMatrix * aTextureCoord).xy;\n}\n"
            java.lang.String r2 = java.lang.String.format(r0, r6, r2)
            androidx.camera.core.processing.OpenGlRenderer.HDR_VERTEX_SHADER = r2
            r2 = 4
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r6[r3] = r4
            java.lang.String r7 = "sTexture"
            r6[r5] = r7
            r6[r1] = r7
            r8 = 3
            r6[r8] = r4
            java.lang.String r9 = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 %s;\nuniform samplerExternalOES %s;\nvoid main() {\n    gl_FragColor = texture2D(%s, %s);\n}\n"
            java.lang.String r6 = java.lang.String.format(r0, r9, r6)
            androidx.camera.core.processing.OpenGlRenderer.DEFAULT_FRAGMENT_SHADER = r6
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r3] = r7
            r2[r5] = r4
            r2[r1] = r7
            r2[r8] = r4
            java.lang.String r1 = "#version 300 es\n#extension GL_OES_EGL_image_external : require\n#extension GL_EXT_YUV_target : require\nprecision mediump float;\nuniform __samplerExternal2DY2YEXT %s;\nin vec2 %s;\nout vec4 outColor;\n\nvec3 yuvToRgb(vec3 yuv) {\n  const vec3 yuvOffset = vec3(0.0625, 0.5, 0.5);\n  const mat3 yuvToRgbColorTransform = mat3(\n    1.1689f, 1.1689f, 1.1689f,\n    0.0000f, -0.1881f, 2.1502f,\n    1.6853f, -0.6530f, 0.0000f\n  );\n  return clamp(yuvToRgbColorTransform * (yuv - yuvOffset), 0.0, 1.0);\n}\n\nvoid main() {\n  vec3 srcYuv = texture(%s, %s).xyz;\n  outColor = vec4(yuvToRgb(srcYuv), 1.0);\n}"
            java.lang.String r0 = java.lang.String.format(r0, r1, r2)
            androidx.camera.core.processing.OpenGlRenderer.HDR_FRAGMENT_SHADER = r0
            r0 = 8
            float[] r1 = new float[r0]
            r1 = {x0072: FILL_ARRAY_DATA , data: [-1082130432, -1082130432, 1065353216, -1082130432, -1082130432, 1065353216, 1065353216, 1065353216} // fill-array
            androidx.camera.core.processing.OpenGlRenderer.VERTEX_COORDS = r1
            java.nio.FloatBuffer r1 = createFloatBuffer(r1)
            androidx.camera.core.processing.OpenGlRenderer.VERTEX_BUF = r1
            float[] r0 = new float[r0]
            r0 = {x0086: FILL_ARRAY_DATA , data: [0, 0, 1065353216, 0, 0, 1065353216, 1065353216, 1065353216} // fill-array
            androidx.camera.core.processing.OpenGlRenderer.TEX_COORDS = r0
            java.nio.FloatBuffer r0 = createFloatBuffer(r0)
            androidx.camera.core.processing.OpenGlRenderer.TEX_BUF = r0
            android.opengl.EGLSurface r0 = android.opengl.EGL14.EGL_NO_SURFACE
            androidx.camera.core.processing.OpenGlRenderer$OutputSurface r0 = androidx.camera.core.processing.OpenGlRenderer.OutputSurface.of(r0, r3, r3)
            androidx.camera.core.processing.OpenGlRenderer.NO_OUTPUT_SURFACE = r0
            return
    }

    public OpenGlRenderer() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.mInitialized = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.mOutputSurfaceMap = r0
            android.opengl.EGLDisplay r0 = android.opengl.EGL14.EGL_NO_DISPLAY
            r2.mEglDisplay = r0
            android.opengl.EGLContext r0 = android.opengl.EGL14.EGL_NO_CONTEXT
            r2.mEglContext = r0
            android.opengl.EGLSurface r0 = android.opengl.EGL14.EGL_NO_SURFACE
            r2.mTempSurface = r0
            r0 = -1
            r2.mExternalTextureId = r0
            r2.mProgramHandle = r0
            r2.mTexMatrixLoc = r0
            r2.mPositionLoc = r0
            r2.mTexCoordLoc = r0
            return
    }

    private static void checkEglErrorOrLog(@androidx.annotation.NonNull java.lang.String r2) {
            checkEglErrorOrThrow(r2)     // Catch: java.lang.IllegalStateException -> L4
            return
        L4:
            r2 = move-exception
            java.lang.String r0 = "OpenGlRenderer"
            java.lang.String r1 = r2.toString()
            androidx.camera.core.Logger.e(r0, r1, r2)
            return
    }

    private static void checkEglErrorOrThrow(@androidx.annotation.NonNull java.lang.String r3) {
            int r0 = android.opengl.EGL14.eglGetError()
            r1 = 12288(0x3000, float:1.7219E-41)
            if (r0 != r1) goto L9
            return
        L9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            java.lang.String r3 = ": EGL error: 0x"
            r2.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r0)
            r2.append(r3)
            java.lang.String r3 = r2.toString()
            r1.<init>(r3)
            throw r1
    }

    private static void checkGlErrorOrThrow(@androidx.annotation.NonNull java.lang.String r3) {
            int r0 = android.opengl.GLES20.glGetError()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            java.lang.String r3 = ": GL error 0x"
            r2.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r0)
            r2.append(r3)
            java.lang.String r3 = r2.toString()
            r1.<init>(r3)
            throw r1
    }

    private void checkGlThreadOrThrow() {
            r2 = this;
            java.lang.Thread r0 = r2.mGlThread
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 != r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            java.lang.String r1 = "Method call must be called on the GL thread."
            androidx.core.util.Preconditions.checkState(r0, r1)
            return
    }

    private void checkInitializedOrThrow(boolean r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.mInitialized
            boolean r0 = r0.get()
            if (r2 != r0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            if (r2 == 0) goto L10
            java.lang.String r2 = "OpenGlRenderer is not initialized"
            goto L12
        L10:
            java.lang.String r2 = "OpenGlRenderer is already initialized"
        L12:
            androidx.core.util.Preconditions.checkState(r0, r2)
            return
    }

    private static void checkLocationOrThrow(int r2, @androidx.annotation.NonNull java.lang.String r3) {
            if (r2 < 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unable to locate '"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "' in program"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    private void createEglContext(@androidx.annotation.NonNull androidx.camera.core.DynamicRange r34) {
            r33 = this;
            r0 = r33
            r1 = 0
            android.opengl.EGLDisplay r2 = android.opengl.EGL14.eglGetDisplay(r1)
            r0.mEglDisplay = r2
            android.opengl.EGLDisplay r3 = android.opengl.EGL14.EGL_NO_DISPLAY
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 != 0) goto Lc2
            r2 = 2
            int[] r3 = new int[r2]
            android.opengl.EGLDisplay r4 = r0.mEglDisplay
            r5 = 1
            boolean r3 = android.opengl.EGL14.eglInitialize(r4, r3, r1, r3, r5)
            if (r3 == 0) goto Lb6
            boolean r3 = r34.is10BitHdr()
            r4 = 8
            if (r3 == 0) goto L2a
            r3 = 10
            r7 = 10
            goto L2c
        L2a:
            r7 = 8
        L2c:
            boolean r3 = r34.is10BitHdr()
            if (r3 == 0) goto L34
            r13 = 2
            goto L36
        L34:
            r13 = 8
        L36:
            boolean r3 = r34.is10BitHdr()
            if (r3 == 0) goto L41
            r3 = 64
            r19 = 64
            goto L44
        L41:
            r3 = 4
            r19 = 4
        L44:
            boolean r3 = r34.is10BitHdr()
            r21 = r3 ^ 1
            r23 = 5
            r24 = 12344(0x3038, float:1.7298E-41)
            r6 = 12324(0x3024, float:1.727E-41)
            r8 = 12323(0x3023, float:1.7268E-41)
            r10 = 12322(0x3022, float:1.7267E-41)
            r12 = 12321(0x3021, float:1.7265E-41)
            r14 = 12325(0x3025, float:1.7271E-41)
            r15 = 0
            r16 = 12326(0x3026, float:1.7272E-41)
            r17 = 0
            r18 = 12352(0x3040, float:1.7309E-41)
            r20 = 12610(0x3142, float:1.767E-41)
            r22 = 12339(0x3033, float:1.729E-41)
            r9 = r7
            r11 = r7
            int[] r26 = new int[]{r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24}
            r3 = 1
            android.opengl.EGLConfig[] r4 = new android.opengl.EGLConfig[r3]
            int[] r6 = new int[r5]
            android.opengl.EGLDisplay r7 = r0.mEglDisplay
            r29 = 0
            r32 = 0
            r27 = 0
            r28 = r4
            r31 = r6
            r25 = r7
            r30 = 1
            boolean r3 = android.opengl.EGL14.eglChooseConfig(r25, r26, r27, r28, r29, r30, r31, r32)
            if (r3 == 0) goto Lae
            r3 = r28[r1]
            boolean r4 = r34.is10BitHdr()
            if (r4 == 0) goto L8d
            r2 = 3
        L8d:
            r4 = 12344(0x3038, float:1.7298E-41)
            r6 = 12440(0x3098, float:1.7432E-41)
            int[] r2 = new int[]{r6, r2, r4}
            android.opengl.EGLDisplay r4 = r0.mEglDisplay
            android.opengl.EGLContext r7 = android.opengl.EGL14.EGL_NO_CONTEXT
            android.opengl.EGLContext r2 = android.opengl.EGL14.eglCreateContext(r4, r3, r7, r2, r1)
            java.lang.String r4 = "eglCreateContext"
            checkEglErrorOrThrow(r4)
            r0.mEglConfig = r3
            r0.mEglContext = r2
            int[] r3 = new int[r5]
            android.opengl.EGLDisplay r4 = r0.mEglDisplay
            android.opengl.EGL14.eglQueryContext(r4, r2, r6, r3, r1)
            return
        Lae:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Unable to find a suitable EGLConfig"
            r1.<init>(r2)
            throw r1
        Lb6:
            android.opengl.EGLDisplay r1 = android.opengl.EGL14.EGL_NO_DISPLAY
            r0.mEglDisplay = r1
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Unable to initialize EGL14"
            r1.<init>(r2)
            throw r1
        Lc2:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Unable to get EGL14 display"
            r1.<init>(r2)
            throw r1
    }

    @androidx.annotation.NonNull
    public static java.nio.FloatBuffer createFloatBuffer(@androidx.annotation.NonNull float[] r2) {
            int r0 = r2.length
            int r0 = r0 * 4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            r0.order(r1)
            java.nio.FloatBuffer r0 = r0.asFloatBuffer()
            r0.put(r2)
            r2 = 0
            r0.position(r2)
            return r0
    }

    @androidx.annotation.Nullable
    private androidx.camera.core.processing.OpenGlRenderer.OutputSurface createOutputSurfaceInternal(@androidx.annotation.NonNull android.view.Surface r3) {
            r2 = this;
            android.opengl.EGLDisplay r0 = r2.mEglDisplay     // Catch: java.lang.IllegalArgumentException -> L1c java.lang.IllegalStateException -> L1e
            android.opengl.EGLConfig r1 = r2.mEglConfig     // Catch: java.lang.IllegalArgumentException -> L1c java.lang.IllegalStateException -> L1e
            java.util.Objects.requireNonNull(r1)     // Catch: java.lang.IllegalArgumentException -> L1c java.lang.IllegalStateException -> L1e
            android.opengl.EGLSurface r3 = createWindowSurface(r0, r1, r3)     // Catch: java.lang.IllegalArgumentException -> L1c java.lang.IllegalStateException -> L1e
            android.util.Size r0 = r2.getSurfaceSize(r3)
            int r1 = r0.getWidth()
            int r0 = r0.getHeight()
            androidx.camera.core.processing.OpenGlRenderer$OutputSurface r3 = androidx.camera.core.processing.OpenGlRenderer.OutputSurface.of(r3, r1, r0)
            return r3
        L1c:
            r3 = move-exception
            goto L1f
        L1e:
            r3 = move-exception
        L1f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to create EGL surface: "
            r0.append(r1)
            java.lang.String r1 = r3.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "OpenGlRenderer"
            androidx.camera.core.Logger.w(r1, r0, r3)
            r3 = 0
            return r3
    }

    @androidx.annotation.NonNull
    private static android.opengl.EGLSurface createPBufferSurface(@androidx.annotation.NonNull android.opengl.EGLDisplay r3, @androidx.annotation.NonNull android.opengl.EGLConfig r4, int r5, int r6) {
            r0 = 12374(0x3056, float:1.734E-41)
            r1 = 12344(0x3038, float:1.7298E-41)
            r2 = 12375(0x3057, float:1.7341E-41)
            int[] r5 = new int[]{r2, r5, r0, r6, r1}
            r6 = 0
            android.opengl.EGLSurface r3 = android.opengl.EGL14.eglCreatePbufferSurface(r3, r4, r5, r6)
            java.lang.String r4 = "eglCreatePbufferSurface"
            checkEglErrorOrThrow(r4)
            if (r3 == 0) goto L17
            return r3
        L17:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "surface was null"
            r3.<init>(r4)
            throw r3
    }

    private void createProgram(@androidx.annotation.NonNull androidx.camera.core.DynamicRange r8, @androidx.annotation.NonNull androidx.camera.core.processing.ShaderProvider r9) {
            r7 = this;
            java.lang.String r0 = "glAttachShader"
            r1 = -1
            boolean r2 = r8.is10BitHdr()     // Catch: java.lang.IllegalArgumentException -> Lc java.lang.IllegalStateException -> L12
            if (r2 == 0) goto L14
            java.lang.String r2 = androidx.camera.core.processing.OpenGlRenderer.HDR_VERTEX_SHADER     // Catch: java.lang.IllegalArgumentException -> Lc java.lang.IllegalStateException -> L12
            goto L16
        Lc:
            r8 = move-exception
        Ld:
            r9 = -1
            r0 = -1
            r2 = -1
            goto L7a
        L12:
            r8 = move-exception
            goto Ld
        L14:
            java.lang.String r2 = androidx.camera.core.processing.OpenGlRenderer.DEFAULT_VERTEX_SHADER     // Catch: java.lang.IllegalArgumentException -> Lc java.lang.IllegalStateException -> L12
        L16:
            r3 = 35633(0x8b31, float:4.9932E-41)
            int r2 = loadShader(r3, r2)     // Catch: java.lang.IllegalArgumentException -> Lc java.lang.IllegalStateException -> L12
            int r8 = r7.loadFragmentShader(r8, r9)     // Catch: java.lang.IllegalArgumentException -> L75 java.lang.IllegalStateException -> L78
            int r9 = android.opengl.GLES20.glCreateProgram()     // Catch: java.lang.IllegalArgumentException -> L6d java.lang.IllegalStateException -> L73
            java.lang.String r3 = "glCreateProgram"
            checkGlErrorOrThrow(r3)     // Catch: java.lang.IllegalArgumentException -> L4a java.lang.IllegalStateException -> L50
            android.opengl.GLES20.glAttachShader(r9, r2)     // Catch: java.lang.IllegalArgumentException -> L4a java.lang.IllegalStateException -> L50
            checkGlErrorOrThrow(r0)     // Catch: java.lang.IllegalArgumentException -> L4a java.lang.IllegalStateException -> L50
            android.opengl.GLES20.glAttachShader(r9, r8)     // Catch: java.lang.IllegalArgumentException -> L4a java.lang.IllegalStateException -> L50
            checkGlErrorOrThrow(r0)     // Catch: java.lang.IllegalArgumentException -> L4a java.lang.IllegalStateException -> L50
            android.opengl.GLES20.glLinkProgram(r9)     // Catch: java.lang.IllegalArgumentException -> L4a java.lang.IllegalStateException -> L50
            r0 = 1
            int[] r3 = new int[r0]     // Catch: java.lang.IllegalArgumentException -> L4a java.lang.IllegalStateException -> L50
            r4 = 35714(0x8b82, float:5.0046E-41)
            r5 = 0
            android.opengl.GLES20.glGetProgramiv(r9, r4, r3, r5)     // Catch: java.lang.IllegalArgumentException -> L4a java.lang.IllegalStateException -> L50
            r3 = r3[r5]     // Catch: java.lang.IllegalArgumentException -> L4a java.lang.IllegalStateException -> L50
            if (r3 != r0) goto L52
            r7.mProgramHandle = r9     // Catch: java.lang.IllegalArgumentException -> L4a java.lang.IllegalStateException -> L50
            return
        L4a:
            r0 = move-exception
        L4b:
            r6 = r9
            r9 = r8
            r8 = r0
            r0 = r6
            goto L7a
        L50:
            r0 = move-exception
            goto L4b
        L52:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.IllegalArgumentException -> L4a java.lang.IllegalStateException -> L50
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L4a java.lang.IllegalStateException -> L50
            r3.<init>()     // Catch: java.lang.IllegalArgumentException -> L4a java.lang.IllegalStateException -> L50
            java.lang.String r4 = "Could not link program: "
            r3.append(r4)     // Catch: java.lang.IllegalArgumentException -> L4a java.lang.IllegalStateException -> L50
            java.lang.String r4 = android.opengl.GLES20.glGetProgramInfoLog(r9)     // Catch: java.lang.IllegalArgumentException -> L4a java.lang.IllegalStateException -> L50
            r3.append(r4)     // Catch: java.lang.IllegalArgumentException -> L4a java.lang.IllegalStateException -> L50
            java.lang.String r3 = r3.toString()     // Catch: java.lang.IllegalArgumentException -> L4a java.lang.IllegalStateException -> L50
            r0.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L4a java.lang.IllegalStateException -> L50
            throw r0     // Catch: java.lang.IllegalArgumentException -> L4a java.lang.IllegalStateException -> L50
        L6d:
            r9 = move-exception
        L6e:
            r0 = r9
            r9 = r8
            r8 = r0
        L71:
            r0 = -1
            goto L7a
        L73:
            r9 = move-exception
            goto L6e
        L75:
            r8 = move-exception
        L76:
            r9 = -1
            goto L71
        L78:
            r8 = move-exception
            goto L76
        L7a:
            if (r2 == r1) goto L7f
            android.opengl.GLES20.glDeleteShader(r2)
        L7f:
            if (r9 == r1) goto L84
            android.opengl.GLES20.glDeleteShader(r9)
        L84:
            if (r0 == r1) goto L89
            android.opengl.GLES20.glDeleteProgram(r0)
        L89:
            throw r8
    }

    private void createTempSurface() {
            r3 = this;
            android.opengl.EGLDisplay r0 = r3.mEglDisplay
            android.opengl.EGLConfig r1 = r3.mEglConfig
            java.util.Objects.requireNonNull(r1)
            r2 = 1
            android.opengl.EGLSurface r0 = createPBufferSurface(r0, r1, r2, r2)
            r3.mTempSurface = r0
            return
    }

    private void createTexture() {
            r4 = this;
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 0
            android.opengl.GLES20.glGenTextures(r0, r1, r2)
            java.lang.String r0 = "glGenTextures"
            checkGlErrorOrThrow(r0)
            r0 = r1[r2]
            r1 = 36197(0x8d65, float:5.0723E-41)
            android.opengl.GLES20.glBindTexture(r1, r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "glBindTexture "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            checkGlErrorOrThrow(r2)
            r2 = 10241(0x2801, float:1.435E-41)
            r3 = 1175977984(0x46180000, float:9728.0)
            android.opengl.GLES20.glTexParameterf(r1, r2, r3)
            r2 = 10240(0x2800, float:1.4349E-41)
            r3 = 1175979008(0x46180400, float:9729.0)
            android.opengl.GLES20.glTexParameterf(r1, r2, r3)
            r2 = 10242(0x2802, float:1.4352E-41)
            r3 = 33071(0x812f, float:4.6342E-41)
            android.opengl.GLES20.glTexParameteri(r1, r2, r3)
            r2 = 10243(0x2803, float:1.4354E-41)
            android.opengl.GLES20.glTexParameteri(r1, r2, r3)
            java.lang.String r1 = "glTexParameter"
            checkGlErrorOrThrow(r1)
            r4.mExternalTextureId = r0
            return
    }

    @androidx.annotation.NonNull
    private static android.opengl.EGLSurface createWindowSurface(@androidx.annotation.NonNull android.opengl.EGLDisplay r2, @androidx.annotation.NonNull android.opengl.EGLConfig r3, @androidx.annotation.NonNull android.view.Surface r4) {
            r0 = 12344(0x3038, float:1.7298E-41)
            int[] r0 = new int[]{r0}
            r1 = 0
            android.opengl.EGLSurface r2 = android.opengl.EGL14.eglCreateWindowSurface(r2, r3, r4, r0, r1)
            java.lang.String r3 = "eglCreateWindowSurface"
            checkEglErrorOrThrow(r3)
            if (r2 == 0) goto L13
            return r2
        L13:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "surface was null"
            r2.<init>(r3)
            throw r2
    }

    private static void deleteFbo(int r2) {
            int[] r2 = new int[]{r2}
            r0 = 1
            r1 = 0
            android.opengl.GLES20.glDeleteFramebuffers(r0, r2, r1)
            java.lang.String r2 = "glDeleteFramebuffers"
            checkGlErrorOrThrow(r2)
            return
    }

    private static void deleteTexture(int r2) {
            int[] r2 = new int[]{r2}
            r0 = 1
            r1 = 0
            android.opengl.GLES20.glDeleteTextures(r0, r2, r1)
            java.lang.String r2 = "glDeleteTextures"
            checkGlErrorOrThrow(r2)
            return
    }

    private static int generateFbo() {
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 0
            android.opengl.GLES20.glGenFramebuffers(r0, r1, r2)
            java.lang.String r0 = "glGenFramebuffers"
            checkGlErrorOrThrow(r0)
            r0 = r1[r2]
            return r0
    }

    private static int generateTexture() {
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 0
            android.opengl.GLES20.glGenTextures(r0, r1, r2)
            java.lang.String r0 = "glGenTextures"
            checkGlErrorOrThrow(r0)
            r0 = r1[r2]
            return r0
    }

    @androidx.annotation.NonNull
    private java.lang.String getGlExtensionsBeforeInitialized(@androidx.annotation.NonNull androidx.camera.core.DynamicRange r5) {
            r4 = this;
            java.lang.String r0 = ""
            r1 = 0
            r4.checkInitializedOrThrow(r1)
            r4.createEglContext(r5)     // Catch: java.lang.Throwable -> L1e java.lang.IllegalStateException -> L20
            r4.createTempSurface()     // Catch: java.lang.Throwable -> L1e java.lang.IllegalStateException -> L20
            android.opengl.EGLSurface r5 = r4.mTempSurface     // Catch: java.lang.Throwable -> L1e java.lang.IllegalStateException -> L20
            r4.makeCurrent(r5)     // Catch: java.lang.Throwable -> L1e java.lang.IllegalStateException -> L20
            r5 = 7939(0x1f03, float:1.1125E-41)
            java.lang.String r5 = android.opengl.GLES20.glGetString(r5)     // Catch: java.lang.Throwable -> L1e java.lang.IllegalStateException -> L20
            if (r5 == 0) goto L1a
            r0 = r5
        L1a:
            r4.releaseInternal()
            return r0
        L1e:
            r5 = move-exception
            goto L3f
        L20:
            r5 = move-exception
            java.lang.String r1 = "OpenGlRenderer"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e
            r2.<init>()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r3 = "Failed to get GL extensions: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r3 = r5.getMessage()     // Catch: java.lang.Throwable -> L1e
            r2.append(r3)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L1e
            androidx.camera.core.Logger.w(r1, r2, r5)     // Catch: java.lang.Throwable -> L1e
            r4.releaseInternal()
            return r0
        L3f:
            r4.releaseInternal()
            throw r5
    }

    @androidx.annotation.NonNull
    private androidx.camera.core.processing.OpenGlRenderer.OutputSurface getOutSurfaceOrThrow(@androidx.annotation.NonNull android.view.Surface r3) {
            r2 = this;
            java.util.Map<android.view.Surface, androidx.camera.core.processing.OpenGlRenderer$OutputSurface> r0 = r2.mOutputSurfaceMap
            boolean r0 = r0.containsKey(r3)
            java.lang.String r1 = "The surface is not registered."
            androidx.core.util.Preconditions.checkState(r0, r1)
            java.util.Map<android.view.Surface, androidx.camera.core.processing.OpenGlRenderer$OutputSurface> r0 = r2.mOutputSurfaceMap
            java.lang.Object r3 = r0.get(r3)
            androidx.camera.core.processing.OpenGlRenderer$OutputSurface r3 = (androidx.camera.core.processing.OpenGlRenderer.OutputSurface) r3
            java.util.Objects.requireNonNull(r3)
            return r3
    }

    @androidx.annotation.NonNull
    private android.util.Size getSurfaceSize(@androidx.annotation.NonNull android.opengl.EGLSurface r4) {
            r3 = this;
            android.opengl.EGLDisplay r0 = r3.mEglDisplay
            r1 = 12375(0x3057, float:1.7341E-41)
            int r0 = querySurface(r0, r4, r1)
            android.opengl.EGLDisplay r1 = r3.mEglDisplay
            r2 = 12374(0x3056, float:1.734E-41)
            int r4 = querySurface(r1, r4, r2)
            android.util.Size r1 = new android.util.Size
            r1.<init>(r0, r4)
            return r1
    }

    private int loadFragmentShader(@androidx.annotation.NonNull androidx.camera.core.DynamicRange r5, @androidx.annotation.NonNull androidx.camera.core.processing.ShaderProvider r6) {
            r4 = this;
            java.lang.String r0 = "vTextureCoord"
            java.lang.String r1 = "sTexture"
            androidx.camera.core.processing.ShaderProvider r2 = androidx.camera.core.processing.ShaderProvider.DEFAULT
            r3 = 35632(0x8b30, float:4.9931E-41)
            if (r6 != r2) goto L1c
            boolean r5 = r5.is10BitHdr()
            if (r5 == 0) goto L15
            java.lang.String r5 = androidx.camera.core.processing.OpenGlRenderer.HDR_FRAGMENT_SHADER
            goto L17
        L15:
            java.lang.String r5 = androidx.camera.core.processing.OpenGlRenderer.DEFAULT_FRAGMENT_SHADER
        L17:
            int r5 = loadShader(r3, r5)
            return r5
        L1c:
            java.lang.String r5 = r6.createFragmentShader(r1, r0)     // Catch: java.lang.Throwable -> L33
            if (r5 == 0) goto L35
            boolean r6 = r5.contains(r0)     // Catch: java.lang.Throwable -> L33
            if (r6 == 0) goto L35
            boolean r6 = r5.contains(r1)     // Catch: java.lang.Throwable -> L33
            if (r6 == 0) goto L35
            int r5 = loadShader(r3, r5)     // Catch: java.lang.Throwable -> L33
            return r5
        L33:
            r5 = move-exception
            goto L3d
        L35:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L33
            java.lang.String r6 = "Invalid fragment shader"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L33
            throw r5     // Catch: java.lang.Throwable -> L33
        L3d:
            boolean r6 = r5 instanceof java.lang.IllegalArgumentException
            if (r6 == 0) goto L42
            throw r5
        L42:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unable to compile fragment shader"
            r6.<init>(r0, r5)
            throw r6
    }

    private void loadLocations() {
            r2 = this;
            int r0 = r2.mProgramHandle
            java.lang.String r1 = "aPosition"
            int r0 = android.opengl.GLES20.glGetAttribLocation(r0, r1)
            r2.mPositionLoc = r0
            checkLocationOrThrow(r0, r1)
            int r0 = r2.mProgramHandle
            java.lang.String r1 = "aTextureCoord"
            int r0 = android.opengl.GLES20.glGetAttribLocation(r0, r1)
            r2.mTexCoordLoc = r0
            checkLocationOrThrow(r0, r1)
            int r0 = r2.mProgramHandle
            java.lang.String r1 = "uTexMatrix"
            int r0 = android.opengl.GLES20.glGetUniformLocation(r0, r1)
            r2.mTexMatrixLoc = r0
            checkLocationOrThrow(r0, r1)
            return
    }

    private static int loadShader(int r4, @androidx.annotation.NonNull java.lang.String r5) {
            int r0 = android.opengl.GLES20.glCreateShader(r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "glCreateShader type="
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            checkGlErrorOrThrow(r1)
            android.opengl.GLES20.glShaderSource(r0, r5)
            android.opengl.GLES20.glCompileShader(r0)
            r1 = 1
            int[] r1 = new int[r1]
            r2 = 35713(0x8b81, float:5.0045E-41)
            r3 = 0
            android.opengl.GLES20.glGetShaderiv(r0, r2, r1, r3)
            r1 = r1[r3]
            if (r1 == 0) goto L2d
            return r0
        L2d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Could not compile shader: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r1 = "OpenGlRenderer"
            androidx.camera.core.Logger.w(r1, r5)
            android.opengl.GLES20.glDeleteShader(r0)
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Could not compile shader type "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ":"
            r1.append(r4)
            java.lang.String r4 = android.opengl.GLES20.glGetShaderInfoLog(r0)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r5.<init>(r4)
            throw r5
    }

    private void makeCurrent(@androidx.annotation.NonNull android.opengl.EGLSurface r3) {
            r2 = this;
            android.opengl.EGLDisplay r0 = r2.mEglDisplay
            androidx.core.util.Preconditions.checkNotNull(r0)
            android.opengl.EGLContext r0 = r2.mEglContext
            androidx.core.util.Preconditions.checkNotNull(r0)
            android.opengl.EGLDisplay r0 = r2.mEglDisplay
            android.opengl.EGLContext r1 = r2.mEglContext
            boolean r3 = android.opengl.EGL14.eglMakeCurrent(r0, r3, r3, r1)
            if (r3 == 0) goto L15
            return
        L15:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "eglMakeCurrent failed"
            r3.<init>(r0)
            throw r3
    }

    private static int querySurface(@androidx.annotation.NonNull android.opengl.EGLDisplay r2, @androidx.annotation.NonNull android.opengl.EGLSurface r3, int r4) {
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            android.opengl.EGL14.eglQuerySurface(r2, r3, r4, r0, r1)
            r2 = r0[r1]
            return r2
    }

    private void releaseInternal() {
            r5 = this;
            int r0 = r5.mProgramHandle
            r1 = -1
            if (r0 == r1) goto La
            android.opengl.GLES20.glDeleteProgram(r0)
            r5.mProgramHandle = r1
        La:
            android.opengl.EGLDisplay r0 = r5.mEglDisplay
            android.opengl.EGLDisplay r2 = android.opengl.EGL14.EGL_NO_DISPLAY
            boolean r0 = java.util.Objects.equals(r0, r2)
            if (r0 != 0) goto L8c
            android.opengl.EGLDisplay r0 = r5.mEglDisplay
            android.opengl.EGLSurface r2 = android.opengl.EGL14.EGL_NO_SURFACE
            android.opengl.EGLContext r3 = android.opengl.EGL14.EGL_NO_CONTEXT
            android.opengl.EGL14.eglMakeCurrent(r0, r2, r2, r3)
            java.util.Map<android.view.Surface, androidx.camera.core.processing.OpenGlRenderer$OutputSurface> r0 = r5.mOutputSurfaceMap
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L27:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L51
            java.lang.Object r2 = r0.next()
            androidx.camera.core.processing.OpenGlRenderer$OutputSurface r2 = (androidx.camera.core.processing.OpenGlRenderer.OutputSurface) r2
            android.opengl.EGLSurface r3 = r2.getEglSurface()
            android.opengl.EGLSurface r4 = android.opengl.EGL14.EGL_NO_SURFACE
            boolean r3 = java.util.Objects.equals(r3, r4)
            if (r3 != 0) goto L27
            android.opengl.EGLDisplay r3 = r5.mEglDisplay
            android.opengl.EGLSurface r2 = r2.getEglSurface()
            boolean r2 = android.opengl.EGL14.eglDestroySurface(r3, r2)
            if (r2 != 0) goto L27
            java.lang.String r2 = "eglDestroySurface"
            checkEglErrorOrLog(r2)
            goto L27
        L51:
            java.util.Map<android.view.Surface, androidx.camera.core.processing.OpenGlRenderer$OutputSurface> r0 = r5.mOutputSurfaceMap
            r0.clear()
            android.opengl.EGLSurface r0 = r5.mTempSurface
            android.opengl.EGLSurface r2 = android.opengl.EGL14.EGL_NO_SURFACE
            boolean r0 = java.util.Objects.equals(r0, r2)
            if (r0 != 0) goto L6b
            android.opengl.EGLDisplay r0 = r5.mEglDisplay
            android.opengl.EGLSurface r2 = r5.mTempSurface
            android.opengl.EGL14.eglDestroySurface(r0, r2)
            android.opengl.EGLSurface r0 = android.opengl.EGL14.EGL_NO_SURFACE
            r5.mTempSurface = r0
        L6b:
            android.opengl.EGLContext r0 = r5.mEglContext
            android.opengl.EGLContext r2 = android.opengl.EGL14.EGL_NO_CONTEXT
            boolean r0 = java.util.Objects.equals(r0, r2)
            if (r0 != 0) goto L80
            android.opengl.EGLDisplay r0 = r5.mEglDisplay
            android.opengl.EGLContext r2 = r5.mEglContext
            android.opengl.EGL14.eglDestroyContext(r0, r2)
            android.opengl.EGLContext r0 = android.opengl.EGL14.EGL_NO_CONTEXT
            r5.mEglContext = r0
        L80:
            android.opengl.EGL14.eglReleaseThread()
            android.opengl.EGLDisplay r0 = r5.mEglDisplay
            android.opengl.EGL14.eglTerminate(r0)
            android.opengl.EGLDisplay r0 = android.opengl.EGL14.EGL_NO_DISPLAY
            r5.mEglDisplay = r0
        L8c:
            r0 = 0
            r5.mEglConfig = r0
            r5.mProgramHandle = r1
            r5.mTexMatrixLoc = r1
            r5.mPositionLoc = r1
            r5.mTexCoordLoc = r1
            r5.mExternalTextureId = r1
            r5.mCurrentSurface = r0
            r5.mGlThread = r0
            return
    }

    private void removeOutputSurfaceInternal(@androidx.annotation.NonNull android.view.Surface r2, boolean r3) {
            r1 = this;
            android.view.Surface r0 = r1.mCurrentSurface
            if (r0 != r2) goto Lc
            r0 = 0
            r1.mCurrentSurface = r0
            android.opengl.EGLSurface r0 = r1.mTempSurface
            r1.makeCurrent(r0)
        Lc:
            if (r3 == 0) goto L17
            java.util.Map<android.view.Surface, androidx.camera.core.processing.OpenGlRenderer$OutputSurface> r3 = r1.mOutputSurfaceMap
            java.lang.Object r2 = r3.remove(r2)
            androidx.camera.core.processing.OpenGlRenderer$OutputSurface r2 = (androidx.camera.core.processing.OpenGlRenderer.OutputSurface) r2
            goto L21
        L17:
            java.util.Map<android.view.Surface, androidx.camera.core.processing.OpenGlRenderer$OutputSurface> r3 = r1.mOutputSurfaceMap
            androidx.camera.core.processing.OpenGlRenderer$OutputSurface r0 = androidx.camera.core.processing.OpenGlRenderer.NO_OUTPUT_SURFACE
            java.lang.Object r2 = r3.put(r2, r0)
            androidx.camera.core.processing.OpenGlRenderer$OutputSurface r2 = (androidx.camera.core.processing.OpenGlRenderer.OutputSurface) r2
        L21:
            if (r2 == 0) goto L4c
            androidx.camera.core.processing.OpenGlRenderer$OutputSurface r3 = androidx.camera.core.processing.OpenGlRenderer.NO_OUTPUT_SURFACE
            if (r2 == r3) goto L4c
            android.opengl.EGLDisplay r3 = r1.mEglDisplay     // Catch: java.lang.RuntimeException -> L31
            android.opengl.EGLSurface r2 = r2.getEglSurface()     // Catch: java.lang.RuntimeException -> L31
            android.opengl.EGL14.eglDestroySurface(r3, r2)     // Catch: java.lang.RuntimeException -> L31
            return
        L31:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Failed to destroy EGL surface: "
            r3.append(r0)
            java.lang.String r0 = r2.getMessage()
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "OpenGlRenderer"
            androidx.camera.core.Logger.w(r0, r3, r2)
        L4c:
            return
    }

    private void snapshot(@androidx.annotation.NonNull java.nio.ByteBuffer r19, @androidx.annotation.NonNull android.util.Size r20, @androidx.annotation.NonNull float[] r21) {
            r18 = this;
            r0 = r18
            int r1 = r19.capacity()
            int r2 = r20.getWidth()
            int r3 = r20.getHeight()
            int r2 = r2 * r3
            r3 = 4
            int r2 = r2 * 4
            r4 = 1
            r5 = 0
            if (r1 != r2) goto L19
            r1 = 1
            goto L1a
        L19:
            r1 = 0
        L1a:
            java.lang.String r2 = "ByteBuffer capacity is not equal to width * height * 4."
            androidx.core.util.Preconditions.checkArgument(r1, r2)
            boolean r1 = r19.isDirect()
            java.lang.String r2 = "ByteBuffer is not direct."
            androidx.core.util.Preconditions.checkArgument(r1, r2)
            int r1 = generateTexture()
            r2 = 33985(0x84c1, float:4.7623E-41)
            android.opengl.GLES20.glActiveTexture(r2)
            java.lang.String r2 = "glActiveTexture"
            checkGlErrorOrThrow(r2)
            r6 = 3553(0xde1, float:4.979E-42)
            android.opengl.GLES20.glBindTexture(r6, r1)
            java.lang.String r7 = "glBindTexture"
            checkGlErrorOrThrow(r7)
            int r11 = r20.getWidth()
            int r12 = r20.getHeight()
            r15 = 5121(0x1401, float:7.176E-42)
            r16 = 0
            r8 = 3553(0xde1, float:4.979E-42)
            r9 = 0
            r10 = 6407(0x1907, float:8.978E-42)
            r13 = 0
            r14 = 6407(0x1907, float:8.978E-42)
            android.opengl.GLES20.glTexImage2D(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r8 = "glTexImage2D"
            checkGlErrorOrThrow(r8)
            r8 = 10240(0x2800, float:1.4349E-41)
            r9 = 9729(0x2601, float:1.3633E-41)
            android.opengl.GLES20.glTexParameteri(r6, r8, r9)
            r8 = 10241(0x2801, float:1.435E-41)
            android.opengl.GLES20.glTexParameteri(r6, r8, r9)
            int r8 = generateFbo()
            r9 = 36160(0x8d40, float:5.0671E-41)
            android.opengl.GLES20.glBindFramebuffer(r9, r8)
            java.lang.String r10 = "glBindFramebuffer"
            checkGlErrorOrThrow(r10)
            r10 = 36064(0x8ce0, float:5.0536E-41)
            android.opengl.GLES20.glFramebufferTexture2D(r9, r10, r6, r1, r5)
            java.lang.String r6 = "glFramebufferTexture2D"
            checkGlErrorOrThrow(r6)
            r6 = 33984(0x84c0, float:4.7622E-41)
            android.opengl.GLES20.glActiveTexture(r6)
            checkGlErrorOrThrow(r2)
            int r2 = r0.mExternalTextureId
            r10 = 36197(0x8d65, float:5.0723E-41)
            android.opengl.GLES20.glBindTexture(r10, r2)
            checkGlErrorOrThrow(r7)
            r2 = 0
            r0.mCurrentSurface = r2
            int r2 = r20.getWidth()
            int r7 = r20.getHeight()
            android.opengl.GLES20.glViewport(r5, r5, r2, r7)
            int r2 = r20.getWidth()
            int r7 = r20.getHeight()
            android.opengl.GLES20.glScissor(r5, r5, r2, r7)
            int r2 = r0.mTexMatrixLoc
            r7 = r21
            android.opengl.GLES20.glUniformMatrix4fv(r2, r4, r5, r7, r5)
            java.lang.String r2 = "glUniformMatrix4fv"
            checkGlErrorOrThrow(r2)
            r2 = 5
            android.opengl.GLES20.glDrawArrays(r2, r5, r3)
            java.lang.String r2 = "glDrawArrays"
            checkGlErrorOrThrow(r2)
            int r13 = r20.getWidth()
            int r14 = r20.getHeight()
            r15 = 6408(0x1908, float:8.98E-42)
            r16 = 5121(0x1401, float:7.176E-42)
            r11 = 0
            r12 = 0
            r17 = r19
            android.opengl.GLES20.glReadPixels(r11, r12, r13, r14, r15, r16, r17)
            java.lang.String r2 = "glReadPixels"
            checkGlErrorOrThrow(r2)
            android.opengl.GLES20.glBindFramebuffer(r9, r5)
            deleteTexture(r1)
            deleteFbo(r8)
            android.opengl.GLES20.glActiveTexture(r6)
            int r1 = r0.mExternalTextureId
            android.opengl.GLES20.glBindTexture(r10, r1)
            return
    }

    private void useAndConfigureProgram() {
            r9 = this;
            int r0 = r9.mProgramHandle
            android.opengl.GLES20.glUseProgram(r0)
            java.lang.String r0 = "glUseProgram"
            checkGlErrorOrThrow(r0)
            r0 = 33984(0x84c0, float:4.7622E-41)
            android.opengl.GLES20.glActiveTexture(r0)
            r0 = 36197(0x8d65, float:5.0723E-41)
            int r1 = r9.mExternalTextureId
            android.opengl.GLES20.glBindTexture(r0, r1)
            int r0 = r9.mPositionLoc
            android.opengl.GLES20.glEnableVertexAttribArray(r0)
            java.lang.String r0 = "glEnableVertexAttribArray"
            checkGlErrorOrThrow(r0)
            int r1 = r9.mPositionLoc
            r4 = 0
            java.nio.FloatBuffer r6 = androidx.camera.core.processing.OpenGlRenderer.VERTEX_BUF
            r2 = 2
            r3 = 5126(0x1406, float:7.183E-42)
            r5 = 0
            android.opengl.GLES20.glVertexAttribPointer(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = "glVertexAttribPointer"
            checkGlErrorOrThrow(r1)
            int r2 = r9.mTexCoordLoc
            android.opengl.GLES20.glEnableVertexAttribArray(r2)
            checkGlErrorOrThrow(r0)
            int r3 = r9.mTexCoordLoc
            r6 = 0
            java.nio.FloatBuffer r8 = androidx.camera.core.processing.OpenGlRenderer.TEX_BUF
            r4 = 2
            r5 = 5126(0x1406, float:7.183E-42)
            r7 = 0
            android.opengl.GLES20.glVertexAttribPointer(r3, r4, r5, r6, r7, r8)
            checkGlErrorOrThrow(r1)
            return
    }

    public int getTextureName() {
            r1 = this;
            r0 = 1
            r1.checkInitializedOrThrow(r0)
            r1.checkGlThreadOrThrow()
            int r0 = r1.mExternalTextureId
            return r0
    }

    public void init(@androidx.annotation.NonNull androidx.camera.core.DynamicRange r3, @androidx.annotation.NonNull androidx.camera.core.processing.ShaderProvider r4) {
            r2 = this;
            r0 = 0
            r2.checkInitializedOrThrow(r0)
            boolean r0 = r3.is10BitHdr()     // Catch: java.lang.IllegalArgumentException -> L19 java.lang.IllegalStateException -> L1b
            if (r0 == 0) goto L1d
            java.lang.String r0 = r2.getGlExtensionsBeforeInitialized(r3)     // Catch: java.lang.IllegalArgumentException -> L19 java.lang.IllegalStateException -> L1b
            java.lang.String r1 = "GL_EXT_YUV_target"
            boolean r0 = r0.contains(r1)     // Catch: java.lang.IllegalArgumentException -> L19 java.lang.IllegalStateException -> L1b
            if (r0 != 0) goto L1d
            androidx.camera.core.DynamicRange r3 = androidx.camera.core.DynamicRange.SDR     // Catch: java.lang.IllegalArgumentException -> L19 java.lang.IllegalStateException -> L1b
            goto L1d
        L19:
            r3 = move-exception
            goto L41
        L1b:
            r3 = move-exception
            goto L41
        L1d:
            r2.createEglContext(r3)     // Catch: java.lang.IllegalArgumentException -> L19 java.lang.IllegalStateException -> L1b
            r2.createTempSurface()     // Catch: java.lang.IllegalArgumentException -> L19 java.lang.IllegalStateException -> L1b
            android.opengl.EGLSurface r0 = r2.mTempSurface     // Catch: java.lang.IllegalArgumentException -> L19 java.lang.IllegalStateException -> L1b
            r2.makeCurrent(r0)     // Catch: java.lang.IllegalArgumentException -> L19 java.lang.IllegalStateException -> L1b
            r2.createProgram(r3, r4)     // Catch: java.lang.IllegalArgumentException -> L19 java.lang.IllegalStateException -> L1b
            r2.loadLocations()     // Catch: java.lang.IllegalArgumentException -> L19 java.lang.IllegalStateException -> L1b
            r2.createTexture()     // Catch: java.lang.IllegalArgumentException -> L19 java.lang.IllegalStateException -> L1b
            r2.useAndConfigureProgram()     // Catch: java.lang.IllegalArgumentException -> L19 java.lang.IllegalStateException -> L1b
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            r2.mGlThread = r3
            java.util.concurrent.atomic.AtomicBoolean r3 = r2.mInitialized
            r4 = 1
            r3.set(r4)
            return
        L41:
            r2.releaseInternal()
            throw r3
    }

    public void registerOutputSurface(@androidx.annotation.NonNull android.view.Surface r3) {
            r2 = this;
            r0 = 1
            r2.checkInitializedOrThrow(r0)
            r2.checkGlThreadOrThrow()
            java.util.Map<android.view.Surface, androidx.camera.core.processing.OpenGlRenderer$OutputSurface> r0 = r2.mOutputSurfaceMap
            boolean r0 = r0.containsKey(r3)
            if (r0 != 0) goto L16
            java.util.Map<android.view.Surface, androidx.camera.core.processing.OpenGlRenderer$OutputSurface> r0 = r2.mOutputSurfaceMap
            androidx.camera.core.processing.OpenGlRenderer$OutputSurface r1 = androidx.camera.core.processing.OpenGlRenderer.NO_OUTPUT_SURFACE
            r0.put(r3, r1)
        L16:
            return
    }

    public void release() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.mInitialized
            r1 = 0
            boolean r0 = r0.getAndSet(r1)
            if (r0 != 0) goto La
            return
        La:
            r2.checkGlThreadOrThrow()
            r2.releaseInternal()
            return
    }

    public void render(long r6, @androidx.annotation.NonNull float[] r8, @androidx.annotation.NonNull android.view.Surface r9) {
            r5 = this;
            r0 = 1
            r5.checkInitializedOrThrow(r0)
            r5.checkGlThreadOrThrow()
            androidx.camera.core.processing.OpenGlRenderer$OutputSurface r1 = r5.getOutSurfaceOrThrow(r9)
            androidx.camera.core.processing.OpenGlRenderer$OutputSurface r2 = androidx.camera.core.processing.OpenGlRenderer.NO_OUTPUT_SURFACE
            if (r1 != r2) goto L1b
            androidx.camera.core.processing.OpenGlRenderer$OutputSurface r1 = r5.createOutputSurfaceInternal(r9)
            if (r1 != 0) goto L16
            goto L89
        L16:
            java.util.Map<android.view.Surface, androidx.camera.core.processing.OpenGlRenderer$OutputSurface> r2 = r5.mOutputSurfaceMap
            r2.put(r9, r1)
        L1b:
            android.view.Surface r2 = r5.mCurrentSurface
            r3 = 0
            if (r9 == r2) goto L3f
            android.opengl.EGLSurface r2 = r1.getEglSurface()
            r5.makeCurrent(r2)
            r5.mCurrentSurface = r9
            int r2 = r1.getWidth()
            int r4 = r1.getHeight()
            android.opengl.GLES20.glViewport(r3, r3, r2, r4)
            int r2 = r1.getWidth()
            int r4 = r1.getHeight()
            android.opengl.GLES20.glScissor(r3, r3, r2, r4)
        L3f:
            int r2 = r5.mTexMatrixLoc
            android.opengl.GLES20.glUniformMatrix4fv(r2, r0, r3, r8, r3)
            java.lang.String r8 = "glUniformMatrix4fv"
            checkGlErrorOrThrow(r8)
            r8 = 5
            r0 = 4
            android.opengl.GLES20.glDrawArrays(r8, r3, r0)
            java.lang.String r8 = "glDrawArrays"
            checkGlErrorOrThrow(r8)
            android.opengl.EGLDisplay r8 = r5.mEglDisplay
            android.opengl.EGLSurface r0 = r1.getEglSurface()
            android.opengl.EGLExt.eglPresentationTimeANDROID(r8, r0, r6)
            android.opengl.EGLDisplay r6 = r5.mEglDisplay
            android.opengl.EGLSurface r7 = r1.getEglSurface()
            boolean r6 = android.opengl.EGL14.eglSwapBuffers(r6, r7)
            if (r6 != 0) goto L89
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Failed to swap buffers with EGL error: 0x"
            r6.append(r7)
            int r7 = android.opengl.EGL14.eglGetError()
            java.lang.String r7 = java.lang.Integer.toHexString(r7)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "OpenGlRenderer"
            androidx.camera.core.Logger.w(r7, r6)
            r5.removeOutputSurfaceInternal(r9, r3)
        L89:
            return
    }

    @androidx.annotation.NonNull
    public android.graphics.Bitmap snapshot(@androidx.annotation.NonNull android.util.Size r4, @androidx.annotation.NonNull float[] r5) {
            r3 = this;
            int r0 = r4.getWidth()
            int r1 = r4.getHeight()
            int r0 = r0 * r1
            int r0 = r0 * 4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)
            r3.snapshot(r0, r4, r5)
            int r5 = r4.getWidth()
            int r1 = r4.getHeight()
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r5, r1, r2)
            r0.rewind()
            int r4 = r4.getWidth()
            int r4 = r4 * 4
            androidx.camera.core.ImageProcessingUtil.copyByteBufferToBitmap(r5, r0, r4)
            return r5
    }

    public void unregisterOutputSurface(@androidx.annotation.NonNull android.view.Surface r2) {
            r1 = this;
            r0 = 1
            r1.checkInitializedOrThrow(r0)
            r1.checkGlThreadOrThrow()
            r1.removeOutputSurfaceInternal(r2, r0)
            return
    }
}
