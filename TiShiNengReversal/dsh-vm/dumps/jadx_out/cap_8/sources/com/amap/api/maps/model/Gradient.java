package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class Gradient {
    private static final int DEFAULT_COLOR_MAP_SIZE = 1000;
    private boolean isAvailable;
    private int mColorMapSize;
    private int[] mColors;
    private float[] mStartPoints;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a {
        private final int a;

        /* renamed from: b, reason: collision with root package name */
        private final int f4997b;

        /* renamed from: c, reason: collision with root package name */
        private final float f4998c;

        private a(int r1, int r2, float r3) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.f4997b = r2
                r0.f4998c = r3
                return
        }

        /* synthetic */ a(int r1, int r2, float r3, byte r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        static /* synthetic */ float a(com.amap.api.maps.model.Gradient.a r0) {
                float r0 = r0.f4998c
                return r0
        }

        static /* synthetic */ int b(com.amap.api.maps.model.Gradient.a r0) {
                int r0 = r0.a
                return r0
        }

        static /* synthetic */ int c(com.amap.api.maps.model.Gradient.a r0) {
                int r0 = r0.f4997b
                return r0
        }
    }

    public Gradient(int[] r2, float[] r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    private Gradient(int[] r5, float[] r6, byte r7) {
            r4 = this;
            r4.<init>()
            r7 = 1
            r4.isAvailable = r7
            r0 = 0
            if (r5 == 0) goto L58
            if (r6 == 0) goto L58
            int r1 = r5.length     // Catch: com.amap.api.maps.AMapException -> L2b
            int r2 = r6.length     // Catch: com.amap.api.maps.AMapException -> L2b
            if (r1 != r2) goto L50
            int r1 = r5.length     // Catch: com.amap.api.maps.AMapException -> L2b
            if (r1 == 0) goto L48
            r1 = 1
        L13:
            int r2 = r6.length     // Catch: com.amap.api.maps.AMapException -> L2b
            if (r1 >= r2) goto L2d
            r2 = r6[r1]     // Catch: com.amap.api.maps.AMapException -> L2b
            int r3 = r1 + (-1)
            r3 = r6[r3]     // Catch: com.amap.api.maps.AMapException -> L2b
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 < 0) goto L23
            int r1 = r1 + 1
            goto L13
        L23:
            com.amap.api.maps.AMapException r5 = new com.amap.api.maps.AMapException     // Catch: com.amap.api.maps.AMapException -> L2b
            java.lang.String r6 = "startPoints should be in increasing order"
            r5.<init>(r6)     // Catch: com.amap.api.maps.AMapException -> L2b
            throw r5     // Catch: com.amap.api.maps.AMapException -> L2b
        L2b:
            r5 = move-exception
            goto L60
        L2d:
            r1 = 1000(0x3e8, float:1.401E-42)
            r4.mColorMapSize = r1     // Catch: com.amap.api.maps.AMapException -> L2b
            int r1 = r5.length     // Catch: com.amap.api.maps.AMapException -> L2b
            int[] r1 = new int[r1]     // Catch: com.amap.api.maps.AMapException -> L2b
            r4.mColors = r1     // Catch: com.amap.api.maps.AMapException -> L2b
            int r2 = r6.length     // Catch: com.amap.api.maps.AMapException -> L2b
            float[] r2 = new float[r2]     // Catch: com.amap.api.maps.AMapException -> L2b
            r4.mStartPoints = r2     // Catch: com.amap.api.maps.AMapException -> L2b
            int r2 = r5.length     // Catch: com.amap.api.maps.AMapException -> L2b
            java.lang.System.arraycopy(r5, r0, r1, r0, r2)     // Catch: com.amap.api.maps.AMapException -> L2b
            float[] r5 = r4.mStartPoints     // Catch: com.amap.api.maps.AMapException -> L2b
            int r1 = r6.length     // Catch: com.amap.api.maps.AMapException -> L2b
            java.lang.System.arraycopy(r6, r0, r5, r0, r1)     // Catch: com.amap.api.maps.AMapException -> L2b
            r4.isAvailable = r7     // Catch: com.amap.api.maps.AMapException -> L2b
            return
        L48:
            com.amap.api.maps.AMapException r5 = new com.amap.api.maps.AMapException     // Catch: com.amap.api.maps.AMapException -> L2b
            java.lang.String r6 = "No colors have been defined"
            r5.<init>(r6)     // Catch: com.amap.api.maps.AMapException -> L2b
            throw r5     // Catch: com.amap.api.maps.AMapException -> L2b
        L50:
            com.amap.api.maps.AMapException r5 = new com.amap.api.maps.AMapException     // Catch: com.amap.api.maps.AMapException -> L2b
            java.lang.String r6 = "colors and startPoints should be same length"
            r5.<init>(r6)     // Catch: com.amap.api.maps.AMapException -> L2b
            throw r5     // Catch: com.amap.api.maps.AMapException -> L2b
        L58:
            com.amap.api.maps.AMapException r5 = new com.amap.api.maps.AMapException     // Catch: com.amap.api.maps.AMapException -> L2b
            java.lang.String r6 = "colors and startPoints should not be null"
            r5.<init>(r6)     // Catch: com.amap.api.maps.AMapException -> L2b
            throw r5     // Catch: com.amap.api.maps.AMapException -> L2b
        L60:
            r4.isAvailable = r0
            r5.getErrorMessage()
            return
    }

    private static int a(int r8, int r9, float r10) {
            int r0 = android.graphics.Color.alpha(r9)
            int r1 = android.graphics.Color.alpha(r8)
            int r0 = r0 - r1
            float r0 = (float) r0
            float r0 = r0 * r10
            int r1 = android.graphics.Color.alpha(r8)
            float r1 = (float) r1
            float r0 = r0 + r1
            int r0 = (int) r0
            r1 = 3
            float[] r2 = new float[r1]
            int r3 = android.graphics.Color.red(r8)
            int r4 = android.graphics.Color.green(r8)
            int r8 = android.graphics.Color.blue(r8)
            android.graphics.Color.RGBToHSV(r3, r4, r8, r2)
            float[] r8 = new float[r1]
            int r3 = android.graphics.Color.red(r9)
            int r4 = android.graphics.Color.green(r9)
            int r9 = android.graphics.Color.blue(r9)
            android.graphics.Color.RGBToHSV(r3, r4, r9, r8)
            r9 = 0
            r3 = r2[r9]
            r4 = r8[r9]
            float r5 = r3 - r4
            r6 = 1135869952(0x43b40000, float:360.0)
            r7 = 1127481344(0x43340000, float:180.0)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L49
            float r4 = r4 + r6
            r8[r9] = r4
            goto L51
        L49:
            float r4 = r4 - r3
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 <= 0) goto L51
            float r3 = r3 + r6
            r2[r9] = r3
        L51:
            float[] r3 = new float[r1]
        L53:
            if (r9 >= r1) goto L62
            r4 = r8[r9]
            r5 = r2[r9]
            float r4 = r4 - r5
            float r4 = r4 * r10
            float r4 = r4 + r5
            r3[r9] = r4
            int r9 = r9 + 1
            goto L53
        L62:
            int r8 = android.graphics.Color.HSVToColor(r0, r3)
            return r8
    }

    private java.util.HashMap<java.lang.Integer, com.amap.api.maps.model.Gradient.a> a() {
            r12 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 32
            r0.<init>(r1)
            float[] r1 = r12.mStartPoints
            r2 = 0
            r1 = r1[r2]
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L46
            int[] r1 = r12.mColors
            r1 = r1[r2]
            int r1 = android.graphics.Color.red(r1)
            int[] r3 = r12.mColors
            r3 = r3[r2]
            int r3 = android.graphics.Color.green(r3)
            int[] r4 = r12.mColors
            r4 = r4[r2]
            int r4 = android.graphics.Color.blue(r4)
            int r1 = android.graphics.Color.argb(r2, r1, r3, r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            com.amap.api.maps.model.Gradient$a r4 = new com.amap.api.maps.model.Gradient$a
            int[] r5 = r12.mColors
            r5 = r5[r2]
            int r6 = r12.mColorMapSize
            float r6 = (float) r6
            float[] r7 = r12.mStartPoints
            r7 = r7[r2]
            float r6 = r6 * r7
            r4.<init>(r1, r5, r6, r2)
            r0.put(r3, r4)
        L46:
            r1 = 1
            r3 = 1
        L48:
            int[] r4 = r12.mColors
            int r4 = r4.length
            if (r3 >= r4) goto L7a
            int r4 = r12.mColorMapSize
            float r4 = (float) r4
            float[] r5 = r12.mStartPoints
            int r6 = r3 + (-1)
            r5 = r5[r6]
            float r4 = r4 * r5
            int r4 = (int) r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            com.amap.api.maps.model.Gradient$a r5 = new com.amap.api.maps.model.Gradient$a
            int[] r7 = r12.mColors
            r8 = r7[r6]
            r7 = r7[r3]
            int r9 = r12.mColorMapSize
            float r9 = (float) r9
            float[] r10 = r12.mStartPoints
            r11 = r10[r3]
            r6 = r10[r6]
            float r11 = r11 - r6
            float r9 = r9 * r11
            r5.<init>(r8, r7, r9, r2)
            r0.put(r4, r5)
            int r3 = r3 + 1
            goto L48
        L7a:
            float[] r3 = r12.mStartPoints
            int r4 = r3.length
            int r4 = r4 - r1
            r4 = r3[r4]
            r5 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 == 0) goto Laa
            int r4 = r3.length
            int r4 = r4 - r1
            int r1 = r12.mColorMapSize
            float r1 = (float) r1
            r3 = r3[r4]
            float r1 = r1 * r3
            int r1 = (int) r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.amap.api.maps.model.Gradient$a r3 = new com.amap.api.maps.model.Gradient$a
            int[] r6 = r12.mColors
            r6 = r6[r4]
            int r7 = r12.mColorMapSize
            float r7 = (float) r7
            float[] r8 = r12.mStartPoints
            r4 = r8[r4]
            float r5 = r5 - r4
            float r7 = r7 * r5
            r3.<init>(r6, r6, r7, r2)
            r0.put(r1, r3)
        Laa:
            return r0
    }

    protected int[] generateColorMap(double r10) {
            r9 = this;
            java.util.HashMap r0 = r9.a()
            int r1 = r9.mColorMapSize
            int[] r1 = new int[r1]
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.Object r3 = r0.get(r3)
            com.amap.api.maps.model.Gradient$a r3 = (com.amap.api.maps.model.Gradient.a) r3
            r4 = 0
            r5 = 0
        L15:
            int r6 = r9.mColorMapSize
            if (r4 >= r6) goto L47
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            boolean r6 = r0.containsKey(r6)
            if (r6 == 0) goto L2e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            java.lang.Object r3 = r0.get(r3)
            com.amap.api.maps.model.Gradient$a r3 = (com.amap.api.maps.model.Gradient.a) r3
            r5 = r4
        L2e:
            int r6 = r4 - r5
            float r6 = (float) r6
            float r7 = com.amap.api.maps.model.Gradient.a.a(r3)
            float r6 = r6 / r7
            int r7 = com.amap.api.maps.model.Gradient.a.b(r3)
            int r8 = com.amap.api.maps.model.Gradient.a.c(r3)
            int r6 = a(r7, r8, r6)
            r1[r4] = r6
            int r4 = r4 + 1
            goto L15
        L47:
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r0 == 0) goto L70
        L4d:
            int r0 = r9.mColorMapSize
            if (r2 >= r0) goto L70
            r0 = r1[r2]
            int r3 = android.graphics.Color.alpha(r0)
            double r3 = (double) r3
            double r3 = r3 * r10
            int r3 = (int) r3
            int r4 = android.graphics.Color.red(r0)
            int r5 = android.graphics.Color.green(r0)
            int r0 = android.graphics.Color.blue(r0)
            int r0 = android.graphics.Color.argb(r3, r4, r5, r0)
            r1[r2] = r0
            int r2 = r2 + 1
            goto L4d
        L70:
            return r1
    }

    public int[] getColors() {
            r1 = this;
            int[] r0 = r1.mColors
            return r0
    }

    public float[] getStartPoints() {
            r1 = this;
            float[] r0 = r1.mStartPoints
            return r0
    }

    protected boolean isAvailable() {
            r1 = this;
            boolean r0 = r1.isAvailable
            return r0
    }
}
