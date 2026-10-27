package com.google.android.material.shape;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class OffsetEdgeTreatment extends com.google.android.material.shape.EdgeTreatment {
    private final float offset;
    private final com.google.android.material.shape.EdgeTreatment other;

    public OffsetEdgeTreatment(@androidx.annotation.NonNull com.google.android.material.shape.EdgeTreatment r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.other = r1
            r0.offset = r2
            return
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    boolean forceIntersection() {
            r1 = this;
            com.google.android.material.shape.EdgeTreatment r0 = r1.other
            boolean r0 = r0.forceIntersection()
            return r0
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float r3, float r4, float r5, @androidx.annotation.NonNull com.google.android.material.shape.ShapePath r6) {
            r2 = this;
            com.google.android.material.shape.EdgeTreatment r0 = r2.other
            float r1 = r2.offset
            float r4 = r4 - r1
            r0.getEdgePath(r3, r4, r5, r6)
            return
    }
}
