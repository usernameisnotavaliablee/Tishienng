package cn.easyar.engine.gl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class GlUtil {
    public static final float[] IDENTITY_MATRIX = null;
    private static final int SIZEOF_FLOAT = 4;
    public static final java.lang.String TAG = "easyar.GlUtil";

    static {
            r0 = 16
            float[] r0 = new float[r0]
            cn.easyar.engine.gl.GlUtil.IDENTITY_MATRIX = r0
            r1 = 0
            android.opengl.Matrix.setIdentityM(r0, r1)
            return
    }

    private GlUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void checkGlError(java.lang.String r2) {
            int r0 = android.opengl.GLES20.glGetError()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r2 = ": glError 0x"
            r1.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r0)
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r2)
            throw r0
    }

    public static void checkLocation(int r2, java.lang.String r3) {
            if (r2 < 0) goto L3
            return
        L3:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
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

    public static java.nio.FloatBuffer createFloatBuffer(float[] r2) {
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

    public static int createImageTexture(java.nio.ByteBuffer r11, int r12, int r13, int r14) {
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 0
            android.opengl.GLES20.glGenTextures(r0, r1, r2)
            r0 = r1[r2]
            java.lang.String r1 = "glGenTextures"
            checkGlError(r1)
            r1 = 3553(0xde1, float:4.979E-42)
            android.opengl.GLES20.glBindTexture(r1, r0)
            r2 = 10241(0x2801, float:1.435E-41)
            r3 = 9729(0x2601, float:1.3633E-41)
            android.opengl.GLES20.glTexParameteri(r1, r2, r3)
            r2 = 10240(0x2800, float:1.4349E-41)
            android.opengl.GLES20.glTexParameteri(r1, r2, r3)
            java.lang.String r1 = "loadImageTexture"
            checkGlError(r1)
            r7 = 0
            r9 = 5121(0x1401, float:7.176E-42)
            r2 = 3553(0xde1, float:4.979E-42)
            r3 = 0
            r8 = r14
            r10 = r11
            r5 = r12
            r6 = r13
            r4 = r14
            android.opengl.GLES20.glTexImage2D(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            checkGlError(r1)
            return r0
    }

    public static int createProgram(java.lang.String r3, java.lang.String r4) {
            r0 = 35633(0x8b31, float:4.9932E-41)
            int r3 = loadShader(r0, r3)
            r0 = 0
            if (r3 != 0) goto Lb
            return r0
        Lb:
            r1 = 35632(0x8b30, float:4.9931E-41)
            int r4 = loadShader(r1, r4)
            if (r4 != 0) goto L15
            return r0
        L15:
            int r1 = android.opengl.GLES20.glCreateProgram()
            java.lang.String r2 = "glCreateProgram"
            checkGlError(r2)
            android.opengl.GLES20.glAttachShader(r1, r3)
            java.lang.String r3 = "glAttachShader"
            checkGlError(r3)
            android.opengl.GLES20.glAttachShader(r1, r4)
            checkGlError(r3)
            android.opengl.GLES20.glLinkProgram(r1)
            r3 = 1
            int[] r4 = new int[r3]
            r2 = 35714(0x8b82, float:5.0046E-41)
            android.opengl.GLES20.glGetProgramiv(r1, r2, r4, r0)
            r4 = r4[r0]
            if (r4 == r3) goto L43
            android.opengl.GLES20.glGetProgramInfoLog(r1)
            android.opengl.GLES20.glDeleteProgram(r1)
            return r0
        L43:
            return r1
    }

    public static int loadShader(int r3, java.lang.String r4) {
            int r0 = android.opengl.GLES20.glCreateShader(r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "glCreateShader type="
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            checkGlError(r3)
            android.opengl.GLES20.glShaderSource(r0, r4)
            android.opengl.GLES20.glCompileShader(r0)
            r3 = 1
            int[] r3 = new int[r3]
            r4 = 35713(0x8b81, float:5.0045E-41)
            r1 = 0
            android.opengl.GLES20.glGetShaderiv(r0, r4, r3, r1)
            r3 = r3[r1]
            if (r3 != 0) goto L33
            android.opengl.GLES20.glGetShaderInfoLog(r0)
            android.opengl.GLES20.glDeleteShader(r0)
            return r1
        L33:
            return r0
    }

    public static void logVersionInfo() {
            r0 = 7936(0x1f00, float:1.1121E-41)
            android.opengl.GLES20.glGetString(r0)
            r0 = 7937(0x1f01, float:1.1122E-41)
            android.opengl.GLES20.glGetString(r0)
            r0 = 7938(0x1f02, float:1.1124E-41)
            android.opengl.GLES20.glGetString(r0)
            return
    }
}
