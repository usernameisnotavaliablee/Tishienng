package androidx.camera.core.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_ImmutableZoomState extends androidx.camera.core.internal.ImmutableZoomState {
    private final float linearZoom;
    private final float maxZoomRatio;
    private final float minZoomRatio;
    private final float zoomRatio;

    AutoValue_ImmutableZoomState(float r1, float r2, float r3, float r4) {
            r0 = this;
            r0.<init>()
            r0.zoomRatio = r1
            r0.maxZoomRatio = r2
            r0.minZoomRatio = r3
            r0.linearZoom = r4
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof androidx.camera.core.internal.ImmutableZoomState
            r2 = 0
            if (r1 == 0) goto L4c
            androidx.camera.core.internal.ImmutableZoomState r5 = (androidx.camera.core.internal.ImmutableZoomState) r5
            float r1 = r4.zoomRatio
            int r1 = java.lang.Float.floatToIntBits(r1)
            float r3 = r5.getZoomRatio()
            int r3 = java.lang.Float.floatToIntBits(r3)
            if (r1 != r3) goto L4c
            float r1 = r4.maxZoomRatio
            int r1 = java.lang.Float.floatToIntBits(r1)
            float r3 = r5.getMaxZoomRatio()
            int r3 = java.lang.Float.floatToIntBits(r3)
            if (r1 != r3) goto L4c
            float r1 = r4.minZoomRatio
            int r1 = java.lang.Float.floatToIntBits(r1)
            float r3 = r5.getMinZoomRatio()
            int r3 = java.lang.Float.floatToIntBits(r3)
            if (r1 != r3) goto L4c
            float r1 = r4.linearZoom
            int r1 = java.lang.Float.floatToIntBits(r1)
            float r5 = r5.getLinearZoom()
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r1 != r5) goto L4c
            return r0
        L4c:
            return r2
    }

    @Override // androidx.camera.core.internal.ImmutableZoomState, androidx.camera.core.ZoomState
    public float getLinearZoom() {
            r1 = this;
            float r0 = r1.linearZoom
            return r0
    }

    @Override // androidx.camera.core.internal.ImmutableZoomState, androidx.camera.core.ZoomState
    public float getMaxZoomRatio() {
            r1 = this;
            float r0 = r1.maxZoomRatio
            return r0
    }

    @Override // androidx.camera.core.internal.ImmutableZoomState, androidx.camera.core.ZoomState
    public float getMinZoomRatio() {
            r1 = this;
            float r0 = r1.minZoomRatio
            return r0
    }

    @Override // androidx.camera.core.internal.ImmutableZoomState, androidx.camera.core.ZoomState
    public float getZoomRatio() {
            r1 = this;
            float r0 = r1.zoomRatio
            return r0
    }

    public int hashCode() {
            r3 = this;
            float r0 = r3.zoomRatio
            int r0 = java.lang.Float.floatToIntBits(r0)
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            float r2 = r3.maxZoomRatio
            int r2 = java.lang.Float.floatToIntBits(r2)
            r0 = r0 ^ r2
            int r0 = r0 * r1
            float r2 = r3.minZoomRatio
            int r2 = java.lang.Float.floatToIntBits(r2)
            r0 = r0 ^ r2
            int r0 = r0 * r1
            float r1 = r3.linearZoom
            int r1 = java.lang.Float.floatToIntBits(r1)
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ImmutableZoomState{zoomRatio="
            r0.append(r1)
            float r1 = r2.zoomRatio
            r0.append(r1)
            java.lang.String r1 = ", maxZoomRatio="
            r0.append(r1)
            float r1 = r2.maxZoomRatio
            r0.append(r1)
            java.lang.String r1 = ", minZoomRatio="
            r0.append(r1)
            float r1 = r2.minZoomRatio
            r0.append(r1)
            java.lang.String r1 = ", linearZoom="
            r0.append(r1)
            float r1 = r2.linearZoom
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
