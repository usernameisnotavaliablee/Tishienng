package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class ZoomStateImpl implements androidx.camera.core.ZoomState {
    private float mLinearZoom;
    private final float mMaxZoomRatio;
    private final float mMinZoomRatio;
    private float mZoomRatio;

    ZoomStateImpl(float r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.mMaxZoomRatio = r1
            r0.mMinZoomRatio = r2
            return
    }

    private float getPercentageByRatio(float r6) {
            r5 = this;
            float r0 = r5.mMaxZoomRatio
            float r1 = r5.mMinZoomRatio
            r2 = 0
            int r3 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r3 != 0) goto La
            return r2
        La:
            r3 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 != 0) goto L11
            return r3
        L11:
            int r4 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r4 != 0) goto L16
            return r2
        L16:
            float r6 = r3 / r6
            float r0 = r3 / r0
            float r3 = r3 / r1
            float r6 = r6 - r3
            float r0 = r0 - r3
            float r6 = r6 / r0
            return r6
    }

    private float getRatioByPercentage(float r14) {
            r13 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r1 != 0) goto L9
            float r14 = r13.mMaxZoomRatio
            return r14
        L9:
            r1 = 0
            int r1 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r1 != 0) goto L11
            float r14 = r13.mMinZoomRatio
            return r14
        L11:
            float r1 = r13.mMaxZoomRatio
            float r2 = r0 / r1
            double r2 = (double) r2
            float r4 = r13.mMinZoomRatio
            float r0 = r0 / r4
            double r5 = (double) r0
            double r2 = r2 - r5
            double r7 = (double) r14
            double r2 = r2 * r7
            double r5 = r5 + r2
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r7 = r2 / r5
            double r9 = (double) r4
            double r11 = (double) r1
            double r0 = androidx.core.math.MathUtils.clamp(r7, r9, r11)
            float r14 = (float) r0
            return r14
    }

    @Override // androidx.camera.core.ZoomState
    public float getLinearZoom() {
            r1 = this;
            float r0 = r1.mLinearZoom
            return r0
    }

    @Override // androidx.camera.core.ZoomState
    public float getMaxZoomRatio() {
            r1 = this;
            float r0 = r1.mMaxZoomRatio
            return r0
    }

    @Override // androidx.camera.core.ZoomState
    public float getMinZoomRatio() {
            r1 = this;
            float r0 = r1.mMinZoomRatio
            return r0
    }

    @Override // androidx.camera.core.ZoomState
    public float getZoomRatio() {
            r1 = this;
            float r0 = r1.mZoomRatio
            return r0
    }

    void setLinearZoom(float r3) throws java.lang.IllegalArgumentException {
            r2 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L14
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L14
            r2.mLinearZoom = r3
            float r3 = r2.getRatioByPercentage(r3)
            r2.mZoomRatio = r3
            return
        L14:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Requested linearZoom "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " is not within valid range [0..1]"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r3)
            throw r0
    }

    void setZoomRatio(float r3) throws java.lang.IllegalArgumentException {
            r2 = this;
            float r0 = r2.mMaxZoomRatio
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L15
            float r0 = r2.mMinZoomRatio
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L15
            r2.mZoomRatio = r3
            float r3 = r2.getPercentageByRatio(r3)
            r2.mLinearZoom = r3
            return
        L15:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Requested zoomRatio "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " is not within valid range ["
            r0.append(r3)
            float r3 = r2.mMinZoomRatio
            r0.append(r3)
            java.lang.String r3 = " , "
            r0.append(r3)
            float r3 = r2.mMaxZoomRatio
            r0.append(r3)
            java.lang.String r3 = "]"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r3)
            throw r0
    }
}
