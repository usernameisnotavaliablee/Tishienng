package com.google.android.material.shape;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class TriangleEdgeTreatment extends com.google.android.material.shape.EdgeTreatment {
    private final boolean inside;
    private final float size;

    public TriangleEdgeTreatment(float r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.size = r1
            r0.inside = r2
            return
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float r4, float r5, float r6, @androidx.annotation.NonNull com.google.android.material.shape.ShapePath r7) {
            r3 = this;
            boolean r0 = r3.inside
            r1 = 0
            if (r0 == 0) goto L1c
            float r0 = r3.size
            float r0 = r0 * r6
            float r0 = r5 - r0
            r7.lineTo(r0, r1)
            float r0 = r3.size
            float r2 = r0 * r6
            float r0 = r0 * r6
            float r0 = r0 + r5
            r7.lineTo(r5, r2, r0, r1)
            r7.lineTo(r4, r1)
            return
        L1c:
            float r0 = r3.size
            float r2 = r0 * r6
            float r2 = r5 - r2
            float r0 = -r0
            float r0 = r0 * r6
            r7.lineTo(r2, r1, r5, r0)
            float r0 = r3.size
            float r0 = r0 * r6
            float r5 = r5 + r0
            r7.lineTo(r5, r1, r4, r1)
            return
    }
}
