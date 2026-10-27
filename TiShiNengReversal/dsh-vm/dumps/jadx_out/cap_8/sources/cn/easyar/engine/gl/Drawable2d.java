package cn.easyar.engine.gl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class Drawable2d {
    private static final java.nio.FloatBuffer FULL_RECTANGLE_BUF = null;
    private static final float[] FULL_RECTANGLE_COORDS = null;
    private static java.nio.FloatBuffer FULL_RECTANGLE_TEX_BUF = null;
    private static final float[] FULL_RECTANGLE_TEX_COORDS = null;
    private static final java.nio.FloatBuffer RECTANGLE_BUF = null;
    private static final float[] RECTANGLE_COORDS = null;
    private static final java.nio.FloatBuffer RECTANGLE_TEX_BUF = null;
    private static final float[] RECTANGLE_TEX_COORDS = null;
    private static final int SIZEOF_FLOAT = 4;
    private static final java.nio.FloatBuffer TRIANGLE_BUF = null;
    private static final float[] TRIANGLE_COORDS = null;
    private static final java.nio.FloatBuffer TRIANGLE_TEX_BUF = null;
    private static final float[] TRIANGLE_TEX_COORDS = null;
    private int mCoordsPerVertex;
    private cn.easyar.engine.gl.Drawable2d.Prefab mPrefab;
    private java.nio.FloatBuffer mTexCoordArray;
    private int mTexCoordStride;
    private java.nio.FloatBuffer mVertexArray;
    private int mVertexCount;
    private int mVertexStride;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: cn.easyar.engine.gl.Drawable2d$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$cn$easyar$engine$gl$Drawable2d$Prefab = null;

        static {
                cn.easyar.engine.gl.Drawable2d$Prefab[] r0 = cn.easyar.engine.gl.Drawable2d.Prefab.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                cn.easyar.engine.gl.Drawable2d.AnonymousClass1.$SwitchMap$cn$easyar$engine$gl$Drawable2d$Prefab = r0
                cn.easyar.engine.gl.Drawable2d$Prefab r1 = cn.easyar.engine.gl.Drawable2d.Prefab.TRIANGLE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = cn.easyar.engine.gl.Drawable2d.AnonymousClass1.$SwitchMap$cn$easyar$engine$gl$Drawable2d$Prefab     // Catch: java.lang.NoSuchFieldError -> L1d
                cn.easyar.engine.gl.Drawable2d$Prefab r1 = cn.easyar.engine.gl.Drawable2d.Prefab.RECTANGLE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = cn.easyar.engine.gl.Drawable2d.AnonymousClass1.$SwitchMap$cn$easyar$engine$gl$Drawable2d$Prefab     // Catch: java.lang.NoSuchFieldError -> L28
                cn.easyar.engine.gl.Drawable2d$Prefab r1 = cn.easyar.engine.gl.Drawable2d.Prefab.FULL_RECTANGLE     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum Prefab extends java.lang.Enum<cn.easyar.engine.gl.Drawable2d.Prefab> {
        private static final /* synthetic */ cn.easyar.engine.gl.Drawable2d.Prefab[] $VALUES = null;
        public static final cn.easyar.engine.gl.Drawable2d.Prefab FULL_RECTANGLE = null;
        public static final cn.easyar.engine.gl.Drawable2d.Prefab RECTANGLE = null;
        public static final cn.easyar.engine.gl.Drawable2d.Prefab TRIANGLE = null;

        static {
                cn.easyar.engine.gl.Drawable2d$Prefab r0 = new cn.easyar.engine.gl.Drawable2d$Prefab
                java.lang.String r1 = "TRIANGLE"
                r2 = 0
                r0.<init>(r1, r2)
                cn.easyar.engine.gl.Drawable2d.Prefab.TRIANGLE = r0
                cn.easyar.engine.gl.Drawable2d$Prefab r1 = new cn.easyar.engine.gl.Drawable2d$Prefab
                java.lang.String r3 = "RECTANGLE"
                r4 = 1
                r1.<init>(r3, r4)
                cn.easyar.engine.gl.Drawable2d.Prefab.RECTANGLE = r1
                cn.easyar.engine.gl.Drawable2d$Prefab r3 = new cn.easyar.engine.gl.Drawable2d$Prefab
                java.lang.String r5 = "FULL_RECTANGLE"
                r6 = 2
                r3.<init>(r5, r6)
                cn.easyar.engine.gl.Drawable2d.Prefab.FULL_RECTANGLE = r3
                r5 = 3
                cn.easyar.engine.gl.Drawable2d$Prefab[] r5 = new cn.easyar.engine.gl.Drawable2d.Prefab[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                cn.easyar.engine.gl.Drawable2d.Prefab.$VALUES = r5
                return
        }

        Prefab(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static cn.easyar.engine.gl.Drawable2d.Prefab valueOf(java.lang.String r1) {
                java.lang.Class<cn.easyar.engine.gl.Drawable2d$Prefab> r0 = cn.easyar.engine.gl.Drawable2d.Prefab.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                cn.easyar.engine.gl.Drawable2d$Prefab r1 = (cn.easyar.engine.gl.Drawable2d.Prefab) r1
                return r1
        }

        public static cn.easyar.engine.gl.Drawable2d.Prefab[] values() {
                cn.easyar.engine.gl.Drawable2d$Prefab[] r0 = cn.easyar.engine.gl.Drawable2d.Prefab.$VALUES
                java.lang.Object r0 = r0.clone()
                cn.easyar.engine.gl.Drawable2d$Prefab[] r0 = (cn.easyar.engine.gl.Drawable2d.Prefab[]) r0
                return r0
        }
    }

    static {
            r0 = 6
            float[] r1 = new float[r0]
            r1 = {x0052: FILL_ARRAY_DATA , data: [0, 1058262330, -1090519040, -1097609926, 1056964608, -1097609926} // fill-array
            cn.easyar.engine.gl.Drawable2d.TRIANGLE_COORDS = r1
            float[] r0 = new float[r0]
            r0 = {x0062: FILL_ARRAY_DATA , data: [1056964608, 0, 0, 1065353216, 1065353216, 1065353216} // fill-array
            cn.easyar.engine.gl.Drawable2d.TRIANGLE_TEX_COORDS = r0
            java.nio.FloatBuffer r1 = cn.easyar.engine.gl.GlUtil.createFloatBuffer(r1)
            cn.easyar.engine.gl.Drawable2d.TRIANGLE_BUF = r1
            java.nio.FloatBuffer r0 = cn.easyar.engine.gl.GlUtil.createFloatBuffer(r0)
            cn.easyar.engine.gl.Drawable2d.TRIANGLE_TEX_BUF = r0
            r0 = 8
            float[] r1 = new float[r0]
            r1 = {x0072: FILL_ARRAY_DATA , data: [-1090519040, -1090519040, 1056964608, -1090519040, -1090519040, 1056964608, 1056964608, 1056964608} // fill-array
            cn.easyar.engine.gl.Drawable2d.RECTANGLE_COORDS = r1
            float[] r2 = new float[r0]
            r2 = {x0086: FILL_ARRAY_DATA , data: [0, 1065353216, 1065353216, 1065353216, 0, 0, 1065353216, 0} // fill-array
            cn.easyar.engine.gl.Drawable2d.RECTANGLE_TEX_COORDS = r2
            java.nio.FloatBuffer r1 = cn.easyar.engine.gl.GlUtil.createFloatBuffer(r1)
            cn.easyar.engine.gl.Drawable2d.RECTANGLE_BUF = r1
            java.nio.FloatBuffer r1 = cn.easyar.engine.gl.GlUtil.createFloatBuffer(r2)
            cn.easyar.engine.gl.Drawable2d.RECTANGLE_TEX_BUF = r1
            float[] r1 = new float[r0]
            r1 = {x009a: FILL_ARRAY_DATA , data: [-1082130432, -1082130432, 1065353216, -1082130432, -1082130432, 1065353216, 1065353216, 1065353216} // fill-array
            cn.easyar.engine.gl.Drawable2d.FULL_RECTANGLE_COORDS = r1
            float[] r0 = new float[r0]
            r0 = {x00ae: FILL_ARRAY_DATA , data: [0, 0, 1065353216, 0, 0, 1065353216, 1065353216, 1065353216} // fill-array
            cn.easyar.engine.gl.Drawable2d.FULL_RECTANGLE_TEX_COORDS = r0
            java.nio.FloatBuffer r1 = cn.easyar.engine.gl.GlUtil.createFloatBuffer(r1)
            cn.easyar.engine.gl.Drawable2d.FULL_RECTANGLE_BUF = r1
            java.nio.FloatBuffer r0 = cn.easyar.engine.gl.GlUtil.createFloatBuffer(r0)
            cn.easyar.engine.gl.Drawable2d.FULL_RECTANGLE_TEX_BUF = r0
            return
    }

    public Drawable2d(cn.easyar.engine.gl.Drawable2d.Prefab r4) {
            r3 = this;
            r3.<init>()
            int[] r0 = cn.easyar.engine.gl.Drawable2d.AnonymousClass1.$SwitchMap$cn$easyar$engine$gl$Drawable2d$Prefab
            int r1 = r4.ordinal()
            r0 = r0[r1]
            r1 = 1
            r2 = 2
            if (r0 == r1) goto L55
            if (r0 == r2) goto L40
            r1 = 3
            if (r0 != r1) goto L29
            java.nio.FloatBuffer r0 = cn.easyar.engine.gl.Drawable2d.FULL_RECTANGLE_BUF
            r3.mVertexArray = r0
            java.nio.FloatBuffer r0 = cn.easyar.engine.gl.Drawable2d.FULL_RECTANGLE_TEX_BUF
            r3.mTexCoordArray = r0
            r3.mCoordsPerVertex = r2
            int r0 = r2 * 4
            r3.mVertexStride = r0
            float[] r0 = cn.easyar.engine.gl.Drawable2d.FULL_RECTANGLE_COORDS
            int r0 = r0.length
            int r0 = r0 / r2
            r3.mVertexCount = r0
            goto L69
        L29:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown shape "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L40:
            java.nio.FloatBuffer r0 = cn.easyar.engine.gl.Drawable2d.RECTANGLE_BUF
            r3.mVertexArray = r0
            java.nio.FloatBuffer r0 = cn.easyar.engine.gl.Drawable2d.RECTANGLE_TEX_BUF
            r3.mTexCoordArray = r0
            r3.mCoordsPerVertex = r2
            int r0 = r2 * 4
            r3.mVertexStride = r0
            float[] r0 = cn.easyar.engine.gl.Drawable2d.RECTANGLE_COORDS
            int r0 = r0.length
            int r0 = r0 / r2
            r3.mVertexCount = r0
            goto L69
        L55:
            java.nio.FloatBuffer r0 = cn.easyar.engine.gl.Drawable2d.TRIANGLE_BUF
            r3.mVertexArray = r0
            java.nio.FloatBuffer r0 = cn.easyar.engine.gl.Drawable2d.TRIANGLE_TEX_BUF
            r3.mTexCoordArray = r0
            r3.mCoordsPerVertex = r2
            int r0 = r2 * 4
            r3.mVertexStride = r0
            float[] r0 = cn.easyar.engine.gl.Drawable2d.TRIANGLE_COORDS
            int r0 = r0.length
            int r0 = r0 / r2
            r3.mVertexCount = r0
        L69:
            r0 = 8
            r3.mTexCoordStride = r0
            r3.mPrefab = r4
            return
    }

    public int getCoordsPerVertex() {
            r1 = this;
            int r0 = r1.mCoordsPerVertex
            return r0
    }

    public java.nio.FloatBuffer getTexCoordArray() {
            r1 = this;
            java.nio.FloatBuffer r0 = r1.mTexCoordArray
            return r0
    }

    public int getTexCoordStride() {
            r1 = this;
            int r0 = r1.mTexCoordStride
            return r0
    }

    public java.nio.FloatBuffer getVertexArray() {
            r1 = this;
            java.nio.FloatBuffer r0 = r1.mVertexArray
            return r0
    }

    public int getVertexCount() {
            r1 = this;
            int r0 = r1.mVertexCount
            return r0
    }

    public int getVertexStride() {
            r1 = this;
            int r0 = r1.mVertexStride
            return r0
    }

    public void setCoordsArray(android.graphics.RectF r6) {
            r5 = this;
            float r0 = r6.left
            float r1 = r6.top
            float r2 = r6.right
            float r6 = r6.bottom
            r3 = 8
            float[] r3 = new float[r3]
            r4 = 0
            r3[r4] = r0
            r4 = 1
            r3[r4] = r1
            r4 = 2
            r3[r4] = r2
            r4 = 3
            r3[r4] = r1
            r1 = 4
            r3[r1] = r0
            r0 = 5
            r3[r0] = r6
            r0 = 6
            r3[r0] = r2
            r0 = 7
            r3[r0] = r6
            java.nio.FloatBuffer r6 = cn.easyar.engine.gl.GlUtil.createFloatBuffer(r3)
            r5.mTexCoordArray = r6
            return
    }

    public java.lang.String toString() {
            r2 = this;
            cn.easyar.engine.gl.Drawable2d$Prefab r0 = r2.mPrefab
            if (r0 == 0) goto L1d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[Drawable2d: "
            r0.append(r1)
            cn.easyar.engine.gl.Drawable2d$Prefab r1 = r2.mPrefab
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L1d:
            java.lang.String r0 = "[Drawable2d: ...]"
            return r0
    }
}
