package cn.easyar.engine.gl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class Texture2dProgram {
    private static final java.lang.String FRAGMENT_SHADER_2D = "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
    private static final java.lang.String FRAGMENT_SHADER_EXT = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
    private static final java.lang.String FRAGMENT_SHADER_EXT_BW = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    vec4 tc = texture2D(sTexture, vTextureCoord);\n    float color = tc.r * 0.3 + tc.g * 0.59 + tc.b * 0.11;\n    gl_FragColor = vec4(color, color, color, 1.0);\n}\n";
    private static final java.lang.String FRAGMENT_SHADER_EXT_FILT = "#extension GL_OES_EGL_image_external : require\n#define KERNEL_SIZE 9\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float uKernel[KERNEL_SIZE];\nuniform vec2 uTexOffset[KERNEL_SIZE];\nuniform float uColorAdjust;\nvoid main() {\n    int i = 0;\n    vec4 sum = vec4(0.0);\n    if (vTextureCoord.x < vTextureCoord.y - 0.005) {\n        for (i = 0; i < KERNEL_SIZE; i++) {\n            vec4 texc = texture2D(sTexture, vTextureCoord + uTexOffset[i]);\n            sum += texc * uKernel[i];\n        }\n    sum += uColorAdjust;\n    } else if (vTextureCoord.x > vTextureCoord.y + 0.005) {\n        sum = texture2D(sTexture, vTextureCoord);\n    } else {\n        sum.r = 1.0;\n    }\n    gl_FragColor = sum;\n}\n";
    public static final int KERNEL_SIZE = 9;
    private static final java.lang.String TAG = "easyar.GlUtil";
    private static final java.lang.String VERTEX_SHADER = "uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
    private float mColorAdjust;
    private float[] mKernel;
    private int mProgramHandle;
    private cn.easyar.engine.gl.Texture2dProgram.ProgramType mProgramType;
    private float[] mTexOffset;
    private int mTextureTarget;
    private int maPositionLoc;
    private int maTextureCoordLoc;
    private int muColorAdjustLoc;
    private int muKernelLoc;
    private int muMVPMatrixLoc;
    private int muTexMatrixLoc;
    private int muTexOffsetLoc;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: cn.easyar.engine.gl.Texture2dProgram$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$cn$easyar$engine$gl$Texture2dProgram$ProgramType = null;

        static {
                cn.easyar.engine.gl.Texture2dProgram$ProgramType[] r0 = cn.easyar.engine.gl.Texture2dProgram.ProgramType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                cn.easyar.engine.gl.Texture2dProgram.AnonymousClass1.$SwitchMap$cn$easyar$engine$gl$Texture2dProgram$ProgramType = r0
                cn.easyar.engine.gl.Texture2dProgram$ProgramType r1 = cn.easyar.engine.gl.Texture2dProgram.ProgramType.TEXTURE_2D     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = cn.easyar.engine.gl.Texture2dProgram.AnonymousClass1.$SwitchMap$cn$easyar$engine$gl$Texture2dProgram$ProgramType     // Catch: java.lang.NoSuchFieldError -> L1d
                cn.easyar.engine.gl.Texture2dProgram$ProgramType r1 = cn.easyar.engine.gl.Texture2dProgram.ProgramType.TEXTURE_EXT     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = cn.easyar.engine.gl.Texture2dProgram.AnonymousClass1.$SwitchMap$cn$easyar$engine$gl$Texture2dProgram$ProgramType     // Catch: java.lang.NoSuchFieldError -> L28
                cn.easyar.engine.gl.Texture2dProgram$ProgramType r1 = cn.easyar.engine.gl.Texture2dProgram.ProgramType.TEXTURE_EXT_BW     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = cn.easyar.engine.gl.Texture2dProgram.AnonymousClass1.$SwitchMap$cn$easyar$engine$gl$Texture2dProgram$ProgramType     // Catch: java.lang.NoSuchFieldError -> L33
                cn.easyar.engine.gl.Texture2dProgram$ProgramType r1 = cn.easyar.engine.gl.Texture2dProgram.ProgramType.TEXTURE_EXT_FILT     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum ProgramType extends java.lang.Enum<cn.easyar.engine.gl.Texture2dProgram.ProgramType> {
        private static final /* synthetic */ cn.easyar.engine.gl.Texture2dProgram.ProgramType[] $VALUES = null;
        public static final cn.easyar.engine.gl.Texture2dProgram.ProgramType TEXTURE_2D = null;
        public static final cn.easyar.engine.gl.Texture2dProgram.ProgramType TEXTURE_EXT = null;
        public static final cn.easyar.engine.gl.Texture2dProgram.ProgramType TEXTURE_EXT_BW = null;
        public static final cn.easyar.engine.gl.Texture2dProgram.ProgramType TEXTURE_EXT_FILT = null;

        static {
                cn.easyar.engine.gl.Texture2dProgram$ProgramType r0 = new cn.easyar.engine.gl.Texture2dProgram$ProgramType
                java.lang.String r1 = "TEXTURE_2D"
                r2 = 0
                r0.<init>(r1, r2)
                cn.easyar.engine.gl.Texture2dProgram.ProgramType.TEXTURE_2D = r0
                cn.easyar.engine.gl.Texture2dProgram$ProgramType r1 = new cn.easyar.engine.gl.Texture2dProgram$ProgramType
                java.lang.String r3 = "TEXTURE_EXT"
                r4 = 1
                r1.<init>(r3, r4)
                cn.easyar.engine.gl.Texture2dProgram.ProgramType.TEXTURE_EXT = r1
                cn.easyar.engine.gl.Texture2dProgram$ProgramType r3 = new cn.easyar.engine.gl.Texture2dProgram$ProgramType
                java.lang.String r5 = "TEXTURE_EXT_BW"
                r6 = 2
                r3.<init>(r5, r6)
                cn.easyar.engine.gl.Texture2dProgram.ProgramType.TEXTURE_EXT_BW = r3
                cn.easyar.engine.gl.Texture2dProgram$ProgramType r5 = new cn.easyar.engine.gl.Texture2dProgram$ProgramType
                java.lang.String r7 = "TEXTURE_EXT_FILT"
                r8 = 3
                r5.<init>(r7, r8)
                cn.easyar.engine.gl.Texture2dProgram.ProgramType.TEXTURE_EXT_FILT = r5
                r7 = 4
                cn.easyar.engine.gl.Texture2dProgram$ProgramType[] r7 = new cn.easyar.engine.gl.Texture2dProgram.ProgramType[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                cn.easyar.engine.gl.Texture2dProgram.ProgramType.$VALUES = r7
                return
        }

        ProgramType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static cn.easyar.engine.gl.Texture2dProgram.ProgramType valueOf(java.lang.String r1) {
                java.lang.Class<cn.easyar.engine.gl.Texture2dProgram$ProgramType> r0 = cn.easyar.engine.gl.Texture2dProgram.ProgramType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                cn.easyar.engine.gl.Texture2dProgram$ProgramType r1 = (cn.easyar.engine.gl.Texture2dProgram.ProgramType) r1
                return r1
        }

        public static cn.easyar.engine.gl.Texture2dProgram.ProgramType[] values() {
                cn.easyar.engine.gl.Texture2dProgram$ProgramType[] r0 = cn.easyar.engine.gl.Texture2dProgram.ProgramType.$VALUES
                java.lang.Object r0 = r0.clone()
                cn.easyar.engine.gl.Texture2dProgram$ProgramType[] r0 = (cn.easyar.engine.gl.Texture2dProgram.ProgramType[]) r0
                return r0
        }
    }

    public Texture2dProgram(cn.easyar.engine.gl.Texture2dProgram.ProgramType r6) {
            r5 = this;
            r5.<init>()
            r0 = 9
            float[] r1 = new float[r0]
            r5.mKernel = r1
            r5.mProgramType = r6
            int[] r1 = cn.easyar.engine.gl.Texture2dProgram.AnonymousClass1.$SwitchMap$cn$easyar$engine$gl$Texture2dProgram$ProgramType
            int r2 = r6.ordinal()
            r1 = r1[r2]
            r2 = 1
            java.lang.String r3 = "uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n"
            if (r1 == r2) goto L5c
            r2 = 2
            r4 = 36197(0x8d65, float:5.0723E-41)
            if (r1 == r2) goto L51
            r2 = 3
            if (r1 == r2) goto L46
            r2 = 4
            if (r1 != r2) goto L2f
            r5.mTextureTarget = r4
            java.lang.String r1 = "#extension GL_OES_EGL_image_external : require\n#define KERNEL_SIZE 9\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float uKernel[KERNEL_SIZE];\nuniform vec2 uTexOffset[KERNEL_SIZE];\nuniform float uColorAdjust;\nvoid main() {\n    int i = 0;\n    vec4 sum = vec4(0.0);\n    if (vTextureCoord.x < vTextureCoord.y - 0.005) {\n        for (i = 0; i < KERNEL_SIZE; i++) {\n            vec4 texc = texture2D(sTexture, vTextureCoord + uTexOffset[i]);\n            sum += texc * uKernel[i];\n        }\n    sum += uColorAdjust;\n    } else if (vTextureCoord.x > vTextureCoord.y + 0.005) {\n        sum = texture2D(sTexture, vTextureCoord);\n    } else {\n        sum.r = 1.0;\n    }\n    gl_FragColor = sum;\n}\n"
            int r1 = cn.easyar.engine.gl.GlUtil.createProgram(r3, r1)
            r5.mProgramHandle = r1
            goto L68
        L2f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unhandled type "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
        L46:
            r5.mTextureTarget = r4
            java.lang.String r1 = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    vec4 tc = texture2D(sTexture, vTextureCoord);\n    float color = tc.r * 0.3 + tc.g * 0.59 + tc.b * 0.11;\n    gl_FragColor = vec4(color, color, color, 1.0);\n}\n"
            int r1 = cn.easyar.engine.gl.GlUtil.createProgram(r3, r1)
            r5.mProgramHandle = r1
            goto L68
        L51:
            r5.mTextureTarget = r4
            java.lang.String r1 = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n"
            int r1 = cn.easyar.engine.gl.GlUtil.createProgram(r3, r1)
            r5.mProgramHandle = r1
            goto L68
        L5c:
            r1 = 3553(0xde1, float:4.979E-42)
            r5.mTextureTarget = r1
            java.lang.String r1 = "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n"
            int r1 = cn.easyar.engine.gl.GlUtil.createProgram(r3, r1)
            r5.mProgramHandle = r1
        L68:
            int r1 = r5.mProgramHandle
            if (r1 == 0) goto Le0
            r6.toString()
            int r6 = r5.mProgramHandle
            java.lang.String r1 = "aPosition"
            int r6 = android.opengl.GLES20.glGetAttribLocation(r6, r1)
            r5.maPositionLoc = r6
            cn.easyar.engine.gl.GlUtil.checkLocation(r6, r1)
            int r6 = r5.mProgramHandle
            java.lang.String r1 = "aTextureCoord"
            int r6 = android.opengl.GLES20.glGetAttribLocation(r6, r1)
            r5.maTextureCoordLoc = r6
            cn.easyar.engine.gl.GlUtil.checkLocation(r6, r1)
            int r6 = r5.mProgramHandle
            java.lang.String r1 = "uMVPMatrix"
            int r6 = android.opengl.GLES20.glGetUniformLocation(r6, r1)
            r5.muMVPMatrixLoc = r6
            cn.easyar.engine.gl.GlUtil.checkLocation(r6, r1)
            int r6 = r5.mProgramHandle
            java.lang.String r1 = "uTexMatrix"
            int r6 = android.opengl.GLES20.glGetUniformLocation(r6, r1)
            r5.muTexMatrixLoc = r6
            cn.easyar.engine.gl.GlUtil.checkLocation(r6, r1)
            int r6 = r5.mProgramHandle
            java.lang.String r1 = "uKernel"
            int r6 = android.opengl.GLES20.glGetUniformLocation(r6, r1)
            r5.muKernelLoc = r6
            if (r6 >= 0) goto Lb7
            r6 = -1
            r5.muKernelLoc = r6
            r5.muTexOffsetLoc = r6
            r5.muColorAdjustLoc = r6
            return
        Lb7:
            int r6 = r5.mProgramHandle
            java.lang.String r1 = "uTexOffset"
            int r6 = android.opengl.GLES20.glGetUniformLocation(r6, r1)
            r5.muTexOffsetLoc = r6
            cn.easyar.engine.gl.GlUtil.checkLocation(r6, r1)
            int r6 = r5.mProgramHandle
            java.lang.String r1 = "uColorAdjust"
            int r6 = android.opengl.GLES20.glGetUniformLocation(r6, r1)
            r5.muColorAdjustLoc = r6
            cn.easyar.engine.gl.GlUtil.checkLocation(r6, r1)
            float[] r6 = new float[r0]
            r6 = {x00e8: FILL_ARRAY_DATA , data: [0, 0, 0, 0, 1065353216, 0, 0, 0, 0} // fill-array
            r0 = 0
            r5.setKernel(r6, r0)
            r6 = 256(0x100, float:3.59E-43)
            r5.setTexSize(r6, r6)
            return
        Le0:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r0 = "Unable to create program"
            r6.<init>(r0)
            throw r6
    }

    public int createTextureObject() {
            r4 = this;
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 0
            android.opengl.GLES20.glGenTextures(r0, r1, r2)
            java.lang.String r0 = "glGenTextures"
            cn.easyar.engine.gl.GlUtil.checkGlError(r0)
            r0 = r1[r2]
            int r1 = r4.mTextureTarget
            android.opengl.GLES20.glBindTexture(r1, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "glBindTexture "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            cn.easyar.engine.gl.GlUtil.checkGlError(r1)
            r1 = 10241(0x2801, float:1.435E-41)
            r2 = 1175977984(0x46180000, float:9728.0)
            r3 = 36197(0x8d65, float:5.0723E-41)
            android.opengl.GLES20.glTexParameterf(r3, r1, r2)
            r1 = 10240(0x2800, float:1.4349E-41)
            r2 = 1175979008(0x46180400, float:9729.0)
            android.opengl.GLES20.glTexParameterf(r3, r1, r2)
            r1 = 10242(0x2802, float:1.4352E-41)
            r2 = 33071(0x812f, float:4.6342E-41)
            android.opengl.GLES20.glTexParameteri(r3, r1, r2)
            r1 = 10243(0x2803, float:1.4354E-41)
            android.opengl.GLES20.glTexParameteri(r3, r1, r2)
            java.lang.String r1 = "glTexParameter"
            cn.easyar.engine.gl.GlUtil.checkGlError(r1)
            return r0
    }

    public void draw(float[] r10, java.nio.FloatBuffer r11, int r12, int r13, int r14, int r15, float[] r16, java.nio.FloatBuffer r17, int r18, int r19) {
            r9 = this;
            java.lang.String r0 = "draw request"
            cn.easyar.engine.gl.GlUtil.checkGlError(r0)
            int r0 = r9.mProgramHandle
            android.opengl.GLES20.glUseProgram(r0)
            java.lang.String r0 = "glUseProgram"
            cn.easyar.engine.gl.GlUtil.checkGlError(r0)
            r0 = 33984(0x84c0, float:4.7622E-41)
            android.opengl.GLES20.glActiveTexture(r0)
            int r0 = r9.mTextureTarget
            r1 = r18
            android.opengl.GLES20.glBindTexture(r0, r1)
            int r0 = r9.muMVPMatrixLoc
            r1 = 1
            r2 = 0
            android.opengl.GLES20.glUniformMatrix4fv(r0, r1, r2, r10, r2)
            java.lang.String r10 = "glUniformMatrix4fv"
            cn.easyar.engine.gl.GlUtil.checkGlError(r10)
            int r0 = r9.muTexMatrixLoc
            r3 = r16
            android.opengl.GLES20.glUniformMatrix4fv(r0, r1, r2, r3, r2)
            cn.easyar.engine.gl.GlUtil.checkGlError(r10)
            int r10 = r9.maPositionLoc
            android.opengl.GLES20.glEnableVertexAttribArray(r10)
            java.lang.String r10 = "glEnableVertexAttribArray"
            cn.easyar.engine.gl.GlUtil.checkGlError(r10)
            int r3 = r9.maPositionLoc
            r5 = 5126(0x1406, float:7.183E-42)
            r6 = 0
            r8 = r11
            r4 = r14
            r7 = r15
            android.opengl.GLES20.glVertexAttribPointer(r3, r4, r5, r6, r7, r8)
            java.lang.String r11 = "glVertexAttribPointer"
            cn.easyar.engine.gl.GlUtil.checkGlError(r11)
            int r14 = r9.maTextureCoordLoc
            android.opengl.GLES20.glEnableVertexAttribArray(r14)
            cn.easyar.engine.gl.GlUtil.checkGlError(r10)
            int r3 = r9.maTextureCoordLoc
            r4 = 2
            r8 = r17
            r7 = r19
            android.opengl.GLES20.glVertexAttribPointer(r3, r4, r5, r6, r7, r8)
            cn.easyar.engine.gl.GlUtil.checkGlError(r11)
            int r10 = r9.muKernelLoc
            if (r10 < 0) goto L7a
            float[] r11 = r9.mKernel
            r14 = 9
            android.opengl.GLES20.glUniform1fv(r10, r14, r11, r2)
            int r10 = r9.muTexOffsetLoc
            float[] r11 = r9.mTexOffset
            android.opengl.GLES20.glUniform2fv(r10, r14, r11, r2)
            int r10 = r9.muColorAdjustLoc
            float r11 = r9.mColorAdjust
            android.opengl.GLES20.glUniform1f(r10, r11)
        L7a:
            r10 = 5
            android.opengl.GLES20.glDrawArrays(r10, r12, r13)
            java.lang.String r10 = "glDrawArrays"
            cn.easyar.engine.gl.GlUtil.checkGlError(r10)
            int r10 = r9.maPositionLoc
            android.opengl.GLES20.glDisableVertexAttribArray(r10)
            int r10 = r9.maTextureCoordLoc
            android.opengl.GLES20.glDisableVertexAttribArray(r10)
            int r10 = r9.mTextureTarget
            android.opengl.GLES20.glBindTexture(r10, r2)
            android.opengl.GLES20.glUseProgram(r2)
            return
    }

    public cn.easyar.engine.gl.Texture2dProgram.ProgramType getProgramType() {
            r1 = this;
            cn.easyar.engine.gl.Texture2dProgram$ProgramType r0 = r1.mProgramType
            return r0
    }

    public void release() {
            r1 = this;
            int r0 = r1.mProgramHandle
            android.opengl.GLES20.glDeleteProgram(r0)
            r0 = -1
            r1.mProgramHandle = r0
            return
    }

    public void setKernel(float[] r4, float r5) {
            r3 = this;
            int r0 = r4.length
            r1 = 9
            if (r0 != r1) goto Le
            float[] r0 = r3.mKernel
            r2 = 0
            java.lang.System.arraycopy(r4, r2, r0, r2, r1)
            r3.mColorAdjust = r5
            return
        Le:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Kernel size is "
            r0.append(r2)
            int r4 = r4.length
            r0.append(r4)
            java.lang.String r4 = " vs. "
            r0.append(r4)
            r0.append(r1)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            throw r5
    }

    public void setTexSize(int r6, int r7) {
            r5 = this;
            float r6 = (float) r6
            r0 = 1065353216(0x3f800000, float:1.0)
            float r6 = r0 / r6
            float r7 = (float) r7
            float r0 = r0 / r7
            float r7 = -r6
            float r1 = -r0
            r2 = 18
            float[] r2 = new float[r2]
            r3 = 0
            r2[r3] = r7
            r3 = 1
            r2[r3] = r1
            r3 = 2
            r4 = 0
            r2[r3] = r4
            r3 = 3
            r2[r3] = r1
            r3 = 4
            r2[r3] = r6
            r3 = 5
            r2[r3] = r1
            r1 = 6
            r2[r1] = r7
            r1 = 7
            r2[r1] = r4
            r1 = 8
            r2[r1] = r4
            r1 = 9
            r2[r1] = r4
            r1 = 10
            r2[r1] = r6
            r1 = 11
            r2[r1] = r4
            r1 = 12
            r2[r1] = r7
            r7 = 13
            r2[r7] = r0
            r7 = 14
            r2[r7] = r4
            r7 = 15
            r2[r7] = r0
            r7 = 16
            r2[r7] = r6
            r6 = 17
            r2[r6] = r0
            r5.mTexOffset = r2
            return
    }
}
