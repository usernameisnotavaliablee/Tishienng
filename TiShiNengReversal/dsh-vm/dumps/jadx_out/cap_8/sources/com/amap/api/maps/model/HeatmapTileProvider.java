package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class HeatmapTileProvider implements com.amap.api.maps.model.TileProvider {
    public static final com.amap.api.maps.model.Gradient DEFAULT_GRADIENT = null;
    private static final int[] DEFAULT_GRADIENT_COLORS = null;
    private static final float[] DEFAULT_GRADIENT_START_POINTS = null;
    private static final int DEFAULT_MAX_ZOOM = 11;
    private static final int DEFAULT_MIN_ZOOM = 5;
    public static final double DEFAULT_OPACITY = 0.6d;
    public static final int DEFAULT_RADIUS = 12;
    private static final int MAX_RADIUS = 200;
    private static final int MAX_ZOOM_LEVEL = 21;
    private static final int MIN_RADIUS = 10;
    private static final int SCREEN_SIZE = 1280;
    private static final int TILE_DIM = 256;
    private com.amap.api.col.p0003l.l2 mBounds;
    private int[] mColorMap;
    private java.util.Collection<com.amap.api.maps.model.WeightedLatLng> mData;
    private com.amap.api.maps.model.Gradient mGradient;
    private double[] mKernel;
    private double[] mMaxIntensity;
    private double mOpacity;
    private int mRadius;
    private com.amap.api.maps.model.a mTree;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Builder {
        private java.util.Collection<com.amap.api.maps.model.WeightedLatLng> data;
        private com.amap.api.maps.model.Gradient gradient;
        private double opacity;
        private int radius;

        public Builder() {
                r2 = this;
                r2.<init>()
                r0 = 12
                r2.radius = r0
                com.amap.api.maps.model.Gradient r0 = com.amap.api.maps.model.HeatmapTileProvider.DEFAULT_GRADIENT
                r2.gradient = r0
                r0 = 4603579539098121011(0x3fe3333333333333, double:0.6)
                r2.opacity = r0
                return
        }

        static /* synthetic */ java.util.Collection a(com.amap.api.maps.model.HeatmapTileProvider.Builder r0) {
                java.util.Collection<com.amap.api.maps.model.WeightedLatLng> r0 = r0.data
                return r0
        }

        static /* synthetic */ int b(com.amap.api.maps.model.HeatmapTileProvider.Builder r0) {
                int r0 = r0.radius
                return r0
        }

        static /* synthetic */ com.amap.api.maps.model.Gradient c(com.amap.api.maps.model.HeatmapTileProvider.Builder r0) {
                com.amap.api.maps.model.Gradient r0 = r0.gradient
                return r0
        }

        static /* synthetic */ double d(com.amap.api.maps.model.HeatmapTileProvider.Builder r2) {
                double r0 = r2.opacity
                return r0
        }

        public com.amap.api.maps.model.HeatmapTileProvider build() {
                r3 = this;
                java.util.Collection<com.amap.api.maps.model.WeightedLatLng> r0 = r3.data
                r1 = 0
                if (r0 == 0) goto L13
                int r0 = r0.size()
                if (r0 == 0) goto L13
                com.amap.api.maps.model.HeatmapTileProvider r0 = new com.amap.api.maps.model.HeatmapTileProvider     // Catch: java.lang.Throwable -> L12
                r2 = 0
                r0.<init>(r3, r2)     // Catch: java.lang.Throwable -> L12
                return r0
            L12:
                return r1
            L13:
                com.amap.api.maps.AMapException r0 = new com.amap.api.maps.AMapException     // Catch: com.amap.api.maps.AMapException -> L1b
                java.lang.String r2 = "No input points."
                r0.<init>(r2)     // Catch: com.amap.api.maps.AMapException -> L1b
                throw r0     // Catch: com.amap.api.maps.AMapException -> L1b
            L1b:
                r0 = move-exception
                r0.getErrorMessage()
                return r1
        }

        public com.amap.api.maps.model.HeatmapTileProvider.Builder data(java.util.Collection<com.amap.api.maps.model.LatLng> r1) {
                r0 = this;
                java.util.Collection r1 = com.amap.api.maps.model.HeatmapTileProvider.a(r1)
                com.amap.api.maps.model.HeatmapTileProvider$Builder r1 = r0.weightedData(r1)
                return r1
        }

        public com.amap.api.maps.model.HeatmapTileProvider.Builder gradient(com.amap.api.maps.model.Gradient r1) {
                r0 = this;
                r0.gradient = r1
                return r0
        }

        public com.amap.api.maps.model.HeatmapTileProvider.Builder radius(int r2) {
                r1 = this;
                r0 = 200(0xc8, float:2.8E-43)
                int r2 = java.lang.Math.min(r2, r0)
                r0 = 10
                int r2 = java.lang.Math.max(r0, r2)
                r1.radius = r2
                return r1
        }

        public com.amap.api.maps.model.HeatmapTileProvider.Builder transparency(double r3) {
                r2 = this;
                r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r3 = java.lang.Math.min(r3, r0)
                r0 = 0
                double r3 = java.lang.Math.max(r0, r3)
                r2.opacity = r3
                return r2
        }

        public com.amap.api.maps.model.HeatmapTileProvider.Builder weightedData(java.util.Collection<com.amap.api.maps.model.WeightedLatLng> r1) {
                r0 = this;
                r0.data = r1
                return r0
        }
    }

    static {
            r0 = 102(0x66, float:1.43E-43)
            r1 = 225(0xe1, float:3.15E-43)
            r2 = 0
            int r0 = android.graphics.Color.rgb(r0, r1, r2)
            r1 = 255(0xff, float:3.57E-43)
            int r1 = android.graphics.Color.rgb(r1, r2, r2)
            int[] r0 = new int[]{r0, r1}
            com.amap.api.maps.model.HeatmapTileProvider.DEFAULT_GRADIENT_COLORS = r0
            r1 = 2
            float[] r1 = new float[r1]
            r1 = {x0026: FILL_ARRAY_DATA , data: [1045220557, 1065353216} // fill-array
            com.amap.api.maps.model.HeatmapTileProvider.DEFAULT_GRADIENT_START_POINTS = r1
            com.amap.api.maps.model.Gradient r2 = new com.amap.api.maps.model.Gradient
            r2.<init>(r0, r1)
            com.amap.api.maps.model.HeatmapTileProvider.DEFAULT_GRADIENT = r2
            return
    }

    private HeatmapTileProvider(com.amap.api.maps.model.HeatmapTileProvider.Builder r5) {
            r4 = this;
            r4.<init>()
            java.util.Collection r0 = com.amap.api.maps.model.HeatmapTileProvider.Builder.a(r5)
            r4.mData = r0
            int r0 = com.amap.api.maps.model.HeatmapTileProvider.Builder.b(r5)
            r4.mRadius = r0
            com.amap.api.maps.model.Gradient r0 = com.amap.api.maps.model.HeatmapTileProvider.Builder.c(r5)
            r4.mGradient = r0
            if (r0 == 0) goto L1d
            boolean r0 = r0.isAvailable()
            if (r0 != 0) goto L21
        L1d:
            com.amap.api.maps.model.Gradient r0 = com.amap.api.maps.model.HeatmapTileProvider.DEFAULT_GRADIENT
            r4.mGradient = r0
        L21:
            double r0 = com.amap.api.maps.model.HeatmapTileProvider.Builder.d(r5)
            r4.mOpacity = r0
            int r5 = r4.mRadius
            double r0 = (double) r5
            r2 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r0 = r0 / r2
            double[] r5 = a(r5, r0)
            r4.mKernel = r5
            com.amap.api.maps.model.Gradient r5 = r4.mGradient
            r4.a(r5)
            java.util.Collection<com.amap.api.maps.model.WeightedLatLng> r5 = r4.mData
            r4.b(r5)
            return
    }

    /* synthetic */ HeatmapTileProvider(com.amap.api.maps.model.HeatmapTileProvider.Builder r1, byte r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private static double a(java.util.Collection<com.amap.api.maps.model.WeightedLatLng> r19, com.amap.api.col.p0003l.l2 r20, int r21, int r22) {
            r0 = r20
            double r1 = r0.a
            double r3 = r0.f3663c
            double r5 = r0.f3662b
            double r7 = r0.f3664d
            double r3 = r3 - r1
            double r7 = r7 - r5
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 <= 0) goto L11
            goto L12
        L11:
            r3 = r7
        L12:
            int r0 = r21 * 2
            int r0 = r22 / r0
            double r7 = (double) r0
            r9 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r7 = r7 + r9
            int r0 = (int) r7
            double r7 = (double) r0
            double r7 = r7 / r3
            androidx.collection.LongSparseArray r0 = new androidx.collection.LongSparseArray
            r0.<init>()
            java.util.Iterator r3 = r19.iterator()
            r11 = 0
        L28:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L84
            java.lang.Object r4 = r3.next()
            com.amap.api.maps.model.WeightedLatLng r4 = (com.amap.api.maps.model.WeightedLatLng) r4
            com.autonavi.amap.mapcore.DPoint r13 = r4.getPoint()
            double r13 = r13.x
            com.autonavi.amap.mapcore.DPoint r15 = r4.getPoint()
            r19 = 0
            double r9 = r15.y
            double r13 = r13 - r1
            double r13 = r13 * r7
            int r13 = (int) r13
            double r9 = r9 - r5
            double r9 = r9 * r7
            int r9 = (int) r9
            long r13 = (long) r13
            java.lang.Object r10 = r0.get(r13)
            androidx.collection.LongSparseArray r10 = (androidx.collection.LongSparseArray) r10
            if (r10 != 0) goto L5b
            androidx.collection.LongSparseArray r10 = new androidx.collection.LongSparseArray
            r10.<init>()
            r0.put(r13, r10)
        L5b:
            long r13 = (long) r9
            java.lang.Object r9 = r10.get(r13)
            java.lang.Double r9 = (java.lang.Double) r9
            if (r9 != 0) goto L68
            java.lang.Double r9 = java.lang.Double.valueOf(r19)
        L68:
            double r15 = r9.doubleValue()
            r21 = r0
            r17 = r1
            double r0 = r4.intensity
            double r15 = r15 + r0
            java.lang.Double r0 = java.lang.Double.valueOf(r15)
            r10.put(r13, r0)
            int r0 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r0 <= 0) goto L7f
            r11 = r15
        L7f:
            r0 = r21
            r1 = r17
            goto L28
        L84:
            return r11
    }

    private static android.graphics.Bitmap a(double[][] r17, int[] r18, double r19) {
            r0 = r17
            r1 = r18
            int r2 = r1.length
            int r2 = r2 + (-1)
            r2 = r1[r2]
            int r3 = r1.length
            int r3 = r3 + (-1)
            double r3 = (double) r3
            double r3 = r3 / r19
            int r8 = r0.length
            int r5 = r8 * r8
            int[] r6 = new int[r5]
            r5 = 0
            r7 = 0
        L16:
            if (r7 >= r8) goto L3e
            r9 = 0
        L19:
            if (r9 >= r8) goto L3b
            r10 = r0[r9]
            r11 = r10[r7]
            int r10 = r7 * r8
            int r10 = r10 + r9
            double r13 = r11 * r3
            int r13 = (int) r13
            r14 = 0
            int r16 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r16 == 0) goto L36
            int r11 = r1.length
            if (r13 >= r11) goto L33
            r11 = r1[r13]
            r6[r10] = r11
            goto L38
        L33:
            r6[r10] = r2
            goto L38
        L36:
            r6[r10] = r5
        L38:
            int r9 = r9 + 1
            goto L19
        L3b:
            int r7 = r7 + 1
            goto L16
        L3e:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r8, r8, r0)
            r9 = 0
            r10 = 0
            r7 = 0
            r11 = r8
            r12 = r8
            r5.setPixels(r6, r7, r8, r9, r10, r11, r12)
            return r5
    }

    private static com.amap.api.maps.model.Tile a(android.graphics.Bitmap r3) {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG
            r2 = 100
            r3.compress(r1, r2, r0)
            byte[] r3 = r0.toByteArray()
            r0 = 256(0x100, float:3.59E-43)
            com.amap.api.maps.model.Tile r3 = com.amap.api.maps.model.Tile.obtain(r0, r0, r3)
            return r3
    }

    static /* synthetic */ java.util.Collection a(java.util.Collection r0) {
            java.util.Collection r0 = c(r0)
            return r0
    }

    private void a(com.amap.api.maps.model.Gradient r3) {
            r2 = this;
            r2.mGradient = r3
            double r0 = r2.mOpacity
            int[] r3 = r3.generateColorMap(r0)
            r2.mColorMap = r3
            return
    }

    private double[] a(int r11) {
            r10 = this;
            r0 = 21
            double[] r1 = new double[r0]
            r2 = 5
            r3 = 5
        L6:
            r4 = 11
            if (r3 >= r4) goto L2f
            java.util.Collection<com.amap.api.maps.model.WeightedLatLng> r4 = r10.mData
            com.amap.api.col.3l.l2 r5 = r10.mBounds
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r8 = (double) r3
            double r6 = java.lang.Math.pow(r6, r8)
            r8 = 4653344314980564992(0x4094000000000000, double:1280.0)
            double r6 = r6 * r8
            int r6 = (int) r6
            double r4 = a(r4, r5, r11, r6)
            r1[r3] = r4
            if (r3 != r2) goto L2c
            r4 = 0
        L23:
            if (r4 >= r3) goto L2c
            r5 = r1[r3]
            r1[r4] = r5
            int r4 = r4 + 1
            goto L23
        L2c:
            int r3 = r3 + 1
            goto L6
        L2f:
            if (r4 >= r0) goto L3a
            r11 = 10
            r2 = r1[r11]
            r1[r4] = r2
            int r4 = r4 + 1
            goto L2f
        L3a:
            return r1
    }

    private static double[] a(int r7, double r8) {
            int r0 = r7 * 2
            int r0 = r0 + 1
            double[] r0 = new double[r0]
            int r1 = -r7
        L7:
            if (r1 > r7) goto L1f
            int r2 = r1 + r7
            int r3 = -r1
            int r3 = r3 * r1
            double r3 = (double) r3
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r5 = r5 * r8
            double r5 = r5 * r8
            double r3 = r3 / r5
            double r3 = java.lang.Math.exp(r3)
            r0[r2] = r3
            int r1 = r1 + 1
            goto L7
        L1f:
            return r0
    }

    private static double[][] a(double[][] r27, double[] r28) {
            r0 = r27
            r1 = r28
            int r2 = r1.length
            double r2 = (double) r2
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r2 = r2 / r4
            double r2 = java.lang.Math.floor(r2)
            int r2 = (int) r2
            int r3 = r0.length
            int r4 = r2 * 2
            int r4 = r3 - r4
            int r5 = r2 + r4
            int r6 = r5 + (-1)
            r7 = 2
            int[] r8 = new int[r7]
            r9 = 1
            r8[r9] = r3
            r10 = 0
            r8[r10] = r3
            java.lang.Class r11 = java.lang.Double.TYPE
            java.lang.Object r8 = java.lang.reflect.Array.newInstance(r11, r8)
            double[][] r8 = (double[][]) r8
            r12 = 0
        L29:
            r13 = 0
            if (r12 >= r3) goto L79
            r15 = 0
        L2e:
            if (r15 >= r3) goto L70
            r16 = r0[r12]
            r17 = r16[r15]
            int r16 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r16 == 0) goto L63
            r16 = 1
            int r9 = r12 + r2
            if (r6 >= r9) goto L3f
            r9 = r6
        L3f:
            int r9 = r9 + 1
            r19 = 0
            int r10 = r12 - r2
            if (r2 <= r10) goto L4a
            r20 = r2
            goto L4c
        L4a:
            r20 = r10
        L4c:
            r21 = r13
            r13 = r20
        L50:
            if (r13 >= r9) goto L69
            r14 = r8[r13]
            r23 = r14[r15]
            int r20 = r13 - r10
            r25 = r1[r20]
            double r25 = r25 * r17
            double r23 = r23 + r25
            r14[r15] = r23
            int r13 = r13 + 1
            goto L50
        L63:
            r21 = r13
            r16 = 1
            r19 = 0
        L69:
            int r15 = r15 + 1
            r13 = r21
            r9 = 1
            r10 = 0
            goto L2e
        L70:
            r16 = 1
            r19 = 0
            int r12 = r12 + 1
            r9 = 1
            r10 = 0
            goto L29
        L79:
            r21 = r13
            r16 = 1
            r19 = 0
            int[] r0 = new int[r7]
            r0[r16] = r4
            r0[r19] = r4
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r11, r0)
            double[][] r0 = (double[][]) r0
            r4 = r2
        L8c:
            if (r4 >= r5) goto Lc4
            r7 = 0
        L8f:
            if (r7 >= r3) goto Lc1
            r9 = r8[r4]
            r10 = r9[r7]
            int r9 = (r10 > r21 ? 1 : (r10 == r21 ? 0 : -1))
            if (r9 == 0) goto Lbe
            int r9 = r7 + r2
            if (r6 >= r9) goto L9e
            r9 = r6
        L9e:
            int r9 = r9 + 1
            int r12 = r7 - r2
            if (r2 <= r12) goto La6
            r13 = r2
            goto La7
        La6:
            r13 = r12
        La7:
            if (r13 >= r9) goto Lbe
            int r14 = r4 - r2
            r14 = r0[r14]
            int r15 = r13 - r2
            r17 = r14[r15]
            int r20 = r13 - r12
            r23 = r1[r20]
            double r23 = r23 * r10
            double r17 = r17 + r23
            r14[r15] = r17
            int r13 = r13 + 1
            goto La7
        Lbe:
            int r7 = r7 + 1
            goto L8f
        Lc1:
            int r4 = r4 + 1
            goto L8c
        Lc4:
            return r0
    }

    private void b(java.util.Collection<com.amap.api.maps.model.WeightedLatLng> r8) {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5e
            r0.<init>()     // Catch: java.lang.Throwable -> L5e
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L5e
        L9:
            boolean r1 = r8.hasNext()     // Catch: java.lang.Throwable -> L5e
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r8.next()     // Catch: java.lang.Throwable -> L5e
            com.amap.api.maps.model.WeightedLatLng r1 = (com.amap.api.maps.model.WeightedLatLng) r1     // Catch: java.lang.Throwable -> L5e
            com.amap.api.maps.model.LatLng r2 = r1.latLng     // Catch: java.lang.Throwable -> L5e
            double r2 = r2.latitude     // Catch: java.lang.Throwable -> L5e
            r4 = 4635681760191971328(0x4055400000000000, double:85.0)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L9
            r4 = -4587690276662804480(0xc055400000000000, double:-85.0)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L9
            r0.add(r1)     // Catch: java.lang.Throwable -> L5e
            goto L9
        L2f:
            r7.mData = r0     // Catch: java.lang.Throwable -> L5e
            com.amap.api.col.3l.l2 r8 = d(r0)     // Catch: java.lang.Throwable -> L5e
            r7.mBounds = r8     // Catch: java.lang.Throwable -> L5e
            com.amap.api.maps.model.a r0 = new com.amap.api.maps.model.a     // Catch: java.lang.Throwable -> L5e
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L5e
            r7.mTree = r0     // Catch: java.lang.Throwable -> L5e
            java.util.Collection<com.amap.api.maps.model.WeightedLatLng> r8 = r7.mData     // Catch: java.lang.Throwable -> L5e
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L5e
        L44:
            boolean r0 = r8.hasNext()     // Catch: java.lang.Throwable -> L5e
            if (r0 == 0) goto L56
            java.lang.Object r0 = r8.next()     // Catch: java.lang.Throwable -> L5e
            com.amap.api.maps.model.WeightedLatLng r0 = (com.amap.api.maps.model.WeightedLatLng) r0     // Catch: java.lang.Throwable -> L5e
            com.amap.api.maps.model.a r1 = r7.mTree     // Catch: java.lang.Throwable -> L5e
            r1.a(r0)     // Catch: java.lang.Throwable -> L5e
            goto L44
        L56:
            int r8 = r7.mRadius     // Catch: java.lang.Throwable -> L5e
            double[] r8 = r7.a(r8)     // Catch: java.lang.Throwable -> L5e
            r7.mMaxIntensity = r8     // Catch: java.lang.Throwable -> L5e
        L5e:
            return
    }

    private static java.util.Collection<com.amap.api.maps.model.WeightedLatLng> c(java.util.Collection<com.amap.api.maps.model.LatLng> r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r3.next()
            com.amap.api.maps.model.LatLng r1 = (com.amap.api.maps.model.LatLng) r1
            com.amap.api.maps.model.WeightedLatLng r2 = new com.amap.api.maps.model.WeightedLatLng
            r2.<init>(r1)
            r0.add(r2)
            goto L9
        L1e:
            return r0
    }

    private static com.amap.api.col.p0003l.l2 d(java.util.Collection<com.amap.api.maps.model.WeightedLatLng> r19) {
            java.util.Iterator r0 = r19.iterator()
            java.lang.Object r1 = r0.next()
            com.amap.api.maps.model.WeightedLatLng r1 = (com.amap.api.maps.model.WeightedLatLng) r1
            com.autonavi.amap.mapcore.DPoint r2 = r1.getPoint()
            double r2 = r2.x
            com.autonavi.amap.mapcore.DPoint r4 = r1.getPoint()
            double r4 = r4.x
            com.autonavi.amap.mapcore.DPoint r6 = r1.getPoint()
            double r6 = r6.y
            com.autonavi.amap.mapcore.DPoint r1 = r1.getPoint()
            double r8 = r1.y
            r11 = r2
            r13 = r4
            r15 = r6
            r17 = r8
        L27:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L55
            java.lang.Object r1 = r0.next()
            com.amap.api.maps.model.WeightedLatLng r1 = (com.amap.api.maps.model.WeightedLatLng) r1
            com.autonavi.amap.mapcore.DPoint r2 = r1.getPoint()
            double r2 = r2.x
            com.autonavi.amap.mapcore.DPoint r1 = r1.getPoint()
            double r4 = r1.y
            int r1 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r1 >= 0) goto L44
            r11 = r2
        L44:
            int r1 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r1 <= 0) goto L49
            r13 = r2
        L49:
            int r1 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r1 >= 0) goto L4e
            r15 = r4
        L4e:
            int r1 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r1 <= 0) goto L27
            r17 = r4
            goto L27
        L55:
            com.amap.api.col.3l.l2 r10 = new com.amap.api.col.3l.l2
            r10.<init>(r11, r13, r15, r17)
            return r10
    }

    @Override // com.amap.api.maps.model.TileProvider
    public com.amap.api.maps.model.Tile getTile(int r38, int r39, int r40) {
            r37 = this;
            r0 = r37
            r1 = r38
            r2 = r39
            r3 = r40
            double r4 = (double) r3
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r4 = java.lang.Math.pow(r6, r4)
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r8 / r4
            int r10 = r0.mRadius
            double r11 = (double) r10
            double r11 = r11 * r4
            r13 = 4643211215818981376(0x4070000000000000, double:256.0)
            double r11 = r11 / r13
            double r6 = r6 * r11
            double r6 = r6 + r4
            r13 = 2
            int r10 = r10 * 2
            int r10 = r10 + 256
            double r14 = (double) r10
            double r6 = r6 / r14
            double r14 = (double) r1
            double r14 = r14 * r4
            double r17 = r14 - r11
            r10 = 1
            int r1 = r1 + r10
            double r14 = (double) r1
            double r14 = r14 * r4
            double r19 = r14 + r11
            double r14 = (double) r2
            double r14 = r14 * r4
            double r26 = r14 - r11
            int r1 = r2 + 1
            double r1 = (double) r1
            double r1 = r1 * r4
            double r28 = r1 + r11
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r4 = 0
            int r2 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r2 >= 0) goto L5c
            com.amap.api.col.3l.l2 r21 = new com.amap.api.col.3l.l2
            double r22 = r17 + r8
            r24 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r21.<init>(r22, r24, r26, r28)
            r1 = r21
            com.amap.api.maps.model.a r2 = r0.mTree
            java.util.Collection r1 = r2.a(r1)
            r8 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            goto L73
        L5c:
            int r2 = (r19 > r8 ? 1 : (r19 == r8 ? 0 : -1))
            if (r2 <= 0) goto L72
            com.amap.api.col.3l.l2 r21 = new com.amap.api.col.3l.l2
            r22 = 0
            double r24 = r19 - r8
            r21.<init>(r22, r24, r26, r28)
            r1 = r21
            com.amap.api.maps.model.a r2 = r0.mTree
            java.util.Collection r1 = r2.a(r1)
            goto L73
        L72:
            r8 = r4
        L73:
            com.amap.api.col.3l.l2 r16 = new com.amap.api.col.3l.l2
            r21 = r26
            r23 = r28
            r16.<init>(r17, r19, r21, r23)
            r2 = r16
            com.amap.api.col.3l.l2 r28 = new com.amap.api.col.3l.l2
            com.amap.api.col.3l.l2 r4 = r0.mBounds
            double r14 = r4.a
            double r29 = r14 - r11
            double r14 = r4.f3663c
            double r31 = r14 + r11
            double r14 = r4.f3662b
            double r33 = r14 - r11
            double r4 = r4.f3664d
            double r35 = r4 + r11
            r28.<init>(r29, r31, r33, r35)
            r4 = r28
            boolean r4 = r2.c(r4)
            if (r4 != 0) goto La0
            com.amap.api.maps.model.Tile r1 = com.amap.api.maps.model.TileProvider.NO_TILE
            return r1
        La0:
            com.amap.api.maps.model.a r4 = r0.mTree
            java.util.Collection r2 = r4.a(r2)
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto Laf
            com.amap.api.maps.model.Tile r1 = com.amap.api.maps.model.TileProvider.NO_TILE
            return r1
        Laf:
            int r4 = r0.mRadius
            int r5 = r4 * 2
            int r5 = r5 + 256
            int r4 = r4 * 2
            int r4 = r4 + 256
            int[] r11 = new int[r13]
            r11[r10] = r4
            r4 = 0
            r11[r4] = r5
            java.lang.Class r4 = java.lang.Double.TYPE
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r11)
            double[][] r4 = (double[][]) r4
            java.util.Iterator r2 = r2.iterator()
        Lcc:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto Lf2
            java.lang.Object r5 = r2.next()
            com.amap.api.maps.model.WeightedLatLng r5 = (com.amap.api.maps.model.WeightedLatLng) r5
            com.autonavi.amap.mapcore.DPoint r10 = r5.getPoint()
            double r11 = r10.x
            double r11 = r11 - r17
            double r11 = r11 / r6
            int r11 = (int) r11
            double r12 = r10.y
            double r12 = r12 - r26
            double r12 = r12 / r6
            int r10 = (int) r12
            r11 = r4[r11]
            r12 = r11[r10]
            double r14 = r5.intensity
            double r12 = r12 + r14
            r11[r10] = r12
            goto Lcc
        Lf2:
            java.util.Iterator r1 = r1.iterator()
        Lf6:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L11d
            java.lang.Object r2 = r1.next()
            com.amap.api.maps.model.WeightedLatLng r2 = (com.amap.api.maps.model.WeightedLatLng) r2
            com.autonavi.amap.mapcore.DPoint r5 = r2.getPoint()
            double r10 = r5.x
            double r10 = r10 + r8
            double r10 = r10 - r17
            double r10 = r10 / r6
            int r10 = (int) r10
            double r11 = r5.y
            double r11 = r11 - r26
            double r11 = r11 / r6
            int r5 = (int) r11
            r10 = r4[r10]
            r11 = r10[r5]
            double r13 = r2.intensity
            double r11 = r11 + r13
            r10[r5] = r11
            goto Lf6
        L11d:
            double[] r1 = r0.mKernel
            double[][] r1 = a(r4, r1)
            int[] r2 = r0.mColorMap
            double[] r4 = r0.mMaxIntensity
            r3 = r4[r3]
            android.graphics.Bitmap r1 = a(r1, r2, r3)
            com.amap.api.maps.model.Tile r1 = a(r1)
            return r1
    }

    @Override // com.amap.api.maps.model.TileProvider
    public int getTileHeight() {
            r1 = this;
            r0 = 256(0x100, float:3.59E-43)
            return r0
    }

    @Override // com.amap.api.maps.model.TileProvider
    public int getTileWidth() {
            r1 = this;
            r0 = 256(0x100, float:3.59E-43)
            return r0
    }
}
