package com.autonavi.base.amap.mapcore;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class FPointBounds {
    private final int mVersionCode;
    public final com.autonavi.base.amap.mapcore.FPoint northeast;
    public final com.autonavi.base.amap.mapcore.FPoint southwest;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Builder {
        private float mEast;
        private float mNorth;
        private float mSouth;
        private float mWest;

        public Builder() {
                r2 = this;
                r2.<init>()
                r0 = 2139095040(0x7f800000, float:Infinity)
                r2.mSouth = r0
                r1 = -8388608(0xffffffffff800000, float:-Infinity)
                r2.mNorth = r1
                r2.mWest = r0
                r2.mEast = r1
                return
        }

        private boolean containsx(double r7) {
                r6 = this;
                float r0 = r6.mWest
                float r1 = r6.mEast
                r2 = 0
                r3 = 1
                int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r4 > 0) goto L16
                double r4 = (double) r0
                int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
                if (r0 > 0) goto L15
                double r0 = (double) r1
                int r4 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r4 > 0) goto L15
                return r3
            L15:
                return r2
            L16:
                double r4 = (double) r0
                int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
                if (r0 <= 0) goto L22
                double r0 = (double) r1
                int r4 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r4 > 0) goto L21
                goto L22
            L21:
                return r2
            L22:
                return r3
        }

        public final com.autonavi.base.amap.mapcore.FPointBounds build() {
                r4 = this;
                com.autonavi.base.amap.mapcore.FPointBounds r0 = new com.autonavi.base.amap.mapcore.FPointBounds
                float r1 = r4.mWest
                float r2 = r4.mSouth
                com.autonavi.base.amap.mapcore.FPoint r1 = com.autonavi.base.amap.mapcore.FPoint.obtain(r1, r2)
                float r2 = r4.mEast
                float r3 = r4.mNorth
                com.autonavi.base.amap.mapcore.FPoint r2 = com.autonavi.base.amap.mapcore.FPoint.obtain(r2, r3)
                r0.<init>(r1, r2)
                return r0
        }

        public final com.autonavi.base.amap.mapcore.FPointBounds.Builder include(com.autonavi.base.amap.mapcore.FPoint r3) {
                r2 = this;
                float r0 = r2.mSouth
                float r1 = r3.y
                float r0 = java.lang.Math.min(r0, r1)
                r2.mSouth = r0
                float r0 = r2.mNorth
                float r1 = r3.y
                float r0 = java.lang.Math.max(r0, r1)
                r2.mNorth = r0
                float r0 = r2.mWest
                float r1 = r3.x
                float r0 = java.lang.Math.min(r0, r1)
                r2.mWest = r0
                float r0 = r2.mEast
                float r3 = r3.x
                float r3 = java.lang.Math.max(r0, r3)
                r2.mEast = r3
                return r2
        }
    }

    FPointBounds(int r1, com.autonavi.base.amap.mapcore.FPoint r2, com.autonavi.base.amap.mapcore.FPoint r3) {
            r0 = this;
            r0.<init>()
            r0.mVersionCode = r1
            r0.southwest = r2
            r0.northeast = r3
            return
    }

    public FPointBounds(com.autonavi.base.amap.mapcore.FPoint r2, com.autonavi.base.amap.mapcore.FPoint r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r0, r2, r3)
            return
    }

    public static com.autonavi.base.amap.mapcore.FPointBounds.Builder builder() {
            com.autonavi.base.amap.mapcore.FPointBounds$Builder r0 = new com.autonavi.base.amap.mapcore.FPointBounds$Builder
            r0.<init>()
            return r0
    }

    private boolean containsx(double r7) {
            r6 = this;
            com.autonavi.base.amap.mapcore.FPoint r0 = r6.southwest
            float r0 = r0.x
            com.autonavi.base.amap.mapcore.FPoint r1 = r6.northeast
            float r1 = r1.x
            r2 = 0
            r3 = 1
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 > 0) goto L1a
            double r4 = (double) r0
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 > 0) goto L19
            double r0 = (double) r1
            int r4 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r4 > 0) goto L19
            return r3
        L19:
            return r2
        L1a:
            double r4 = (double) r0
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 <= 0) goto L26
            double r0 = (double) r1
            int r4 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r4 > 0) goto L25
            goto L26
        L25:
            return r2
        L26:
            return r3
    }

    private boolean containsy(double r4) {
            r3 = this;
            com.autonavi.base.amap.mapcore.FPoint r0 = r3.southwest
            float r0 = r0.y
            double r0 = (double) r0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 > 0) goto L14
            com.autonavi.base.amap.mapcore.FPoint r0 = r3.northeast
            float r0 = r0.y
            double r0 = (double) r0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L14
            r4 = 1
            return r4
        L14:
            r4 = 0
            return r4
    }

    private boolean intersect(com.autonavi.base.amap.mapcore.FPointBounds r11) {
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L47
            com.autonavi.base.amap.mapcore.FPoint r1 = r11.northeast
            if (r1 == 0) goto L47
            com.autonavi.base.amap.mapcore.FPoint r11 = r11.southwest
            if (r11 == 0) goto L47
            com.autonavi.base.amap.mapcore.FPoint r2 = r10.northeast
            if (r2 == 0) goto L47
            com.autonavi.base.amap.mapcore.FPoint r3 = r10.southwest
            if (r3 != 0) goto L14
            goto L47
        L14:
            float r4 = r1.x
            float r5 = r11.x
            float r5 = r5 + r4
            float r6 = r2.x
            float r5 = r5 - r6
            float r7 = r3.x
            float r5 = r5 - r7
            double r8 = (double) r5
            float r6 = r6 - r7
            float r6 = r6 + r4
            float r6 = r6 - r7
            double r4 = (double) r6
            float r1 = r1.y
            float r11 = r11.y
            float r6 = r1 + r11
            float r2 = r2.y
            float r6 = r6 - r2
            float r3 = r3.y
            float r6 = r6 - r3
            double r6 = (double) r6
            float r2 = r2 - r3
            float r2 = r2 + r1
            float r2 = r2 - r11
            double r1 = (double) r2
            double r8 = java.lang.Math.abs(r8)
            int r11 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r11 >= 0) goto L47
            double r3 = java.lang.Math.abs(r6)
            int r11 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r11 >= 0) goto L47
            r11 = 1
            return r11
        L47:
            return r0
    }

    public boolean contains(com.autonavi.base.amap.mapcore.FPoint r3) {
            r2 = this;
            float r0 = r3.y
            double r0 = (double) r0
            boolean r0 = r2.containsy(r0)
            if (r0 == 0) goto L14
            float r3 = r3.x
            double r0 = (double) r3
            boolean r3 = r2.containsx(r0)
            if (r3 == 0) goto L14
            r3 = 1
            return r3
        L14:
            r3 = 0
            return r3
    }

    public boolean contains(com.autonavi.base.amap.mapcore.FPointBounds r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            com.autonavi.base.amap.mapcore.FPoint r1 = r3.southwest
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L16
            com.autonavi.base.amap.mapcore.FPoint r3 = r3.northeast
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L16
            r3 = 1
            return r3
        L16:
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.autonavi.base.amap.mapcore.FPointBounds
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.autonavi.base.amap.mapcore.FPointBounds r5 = (com.autonavi.base.amap.mapcore.FPointBounds) r5
            com.autonavi.base.amap.mapcore.FPoint r1 = r4.southwest
            com.autonavi.base.amap.mapcore.FPoint r3 = r5.southwest
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L21
            com.autonavi.base.amap.mapcore.FPoint r1 = r4.northeast
            com.autonavi.base.amap.mapcore.FPoint r5 = r5.northeast
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L21
            return r0
        L21:
            return r2
    }

    int getVersionCode() {
            r1 = this;
            int r0 = r1.mVersionCode
            return r0
    }

    public int hashCode() {
            r1 = this;
            int r0 = super.hashCode()
            return r0
    }

    public boolean intersects(com.autonavi.base.amap.mapcore.FPointBounds r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            boolean r1 = r2.intersect(r3)
            if (r1 != 0) goto L12
            boolean r3 = r3.intersect(r2)
            if (r3 == 0) goto L11
            goto L12
        L11:
            return r0
        L12:
            r3 = 1
            return r3
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "southwest = ("
            r0.append(r1)
            com.autonavi.base.amap.mapcore.FPoint r1 = r3.southwest
            float r1 = r1.x
            r0.append(r1)
            java.lang.String r1 = ","
            r0.append(r1)
            com.autonavi.base.amap.mapcore.FPoint r2 = r3.southwest
            float r2 = r2.y
            r0.append(r2)
            java.lang.String r2 = ") northeast = ("
            r0.append(r2)
            com.autonavi.base.amap.mapcore.FPoint r2 = r3.northeast
            float r2 = r2.x
            r0.append(r2)
            r0.append(r1)
            com.autonavi.base.amap.mapcore.FPoint r1 = r3.northeast
            float r1 = r1.y
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
