package com.google.android.material.shape;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class AdjustedCornerSize implements com.google.android.material.shape.CornerSize {
    private final float adjustment;
    private final com.google.android.material.shape.CornerSize other;

    public AdjustedCornerSize(float r2, @androidx.annotation.NonNull com.google.android.material.shape.CornerSize r3) {
            r1 = this;
            r1.<init>()
        L3:
            boolean r0 = r3 instanceof com.google.android.material.shape.AdjustedCornerSize
            if (r0 == 0) goto L12
            com.google.android.material.shape.AdjustedCornerSize r3 = (com.google.android.material.shape.AdjustedCornerSize) r3
            com.google.android.material.shape.CornerSize r3 = r3.other
            r0 = r3
            com.google.android.material.shape.AdjustedCornerSize r0 = (com.google.android.material.shape.AdjustedCornerSize) r0
            float r0 = r0.adjustment
            float r2 = r2 + r0
            goto L3
        L12:
            r1.other = r3
            r1.adjustment = r2
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.material.shape.AdjustedCornerSize
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.material.shape.AdjustedCornerSize r5 = (com.google.android.material.shape.AdjustedCornerSize) r5
            com.google.android.material.shape.CornerSize r1 = r4.other
            com.google.android.material.shape.CornerSize r3 = r5.other
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L1f
            float r1 = r4.adjustment
            float r5 = r5.adjustment
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 != 0) goto L1f
            return r0
        L1f:
            return r2
    }

    @Override // com.google.android.material.shape.CornerSize
    public float getCornerSize(@androidx.annotation.NonNull android.graphics.RectF r2) {
            r1 = this;
            com.google.android.material.shape.CornerSize r0 = r1.other
            float r2 = r0.getCornerSize(r2)
            float r0 = r1.adjustment
            float r2 = r2 + r0
            r0 = 0
            float r2 = java.lang.Math.max(r0, r2)
            return r2
    }

    public int hashCode() {
            r4 = this;
            com.google.android.material.shape.CornerSize r0 = r4.other
            float r1 = r4.adjustment
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            int r0 = java.util.Arrays.hashCode(r2)
            return r0
    }
}
