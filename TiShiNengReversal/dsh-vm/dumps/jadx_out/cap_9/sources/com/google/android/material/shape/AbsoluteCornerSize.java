package com.google.android.material.shape;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class AbsoluteCornerSize implements com.google.android.material.shape.CornerSize {
    private final float size;

    public AbsoluteCornerSize(float r1) {
            r0 = this;
            r0.<init>()
            r0.size = r1
            return
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof com.google.android.material.shape.AbsoluteCornerSize
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.material.shape.AbsoluteCornerSize r4 = (com.google.android.material.shape.AbsoluteCornerSize) r4
            float r1 = r3.size
            float r4 = r4.size
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 != 0) goto L15
            return r0
        L15:
            return r2
    }

    public float getCornerSize() {
            r1 = this;
            float r0 = r1.size
            return r0
    }

    @Override // com.google.android.material.shape.CornerSize
    public float getCornerSize(@androidx.annotation.NonNull android.graphics.RectF r1) {
            r0 = this;
            float r1 = r0.size
            return r1
    }

    public int hashCode() {
            r3 = this;
            float r0 = r3.size
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            int r0 = java.util.Arrays.hashCode(r1)
            return r0
    }
}
