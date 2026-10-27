package com.github.mikephil.charting.highlight;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class Range {
    public float from;
    public float to;

    public Range(float r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.from = r1
            r0.to = r2
            return
    }

    public boolean contains(float r2) {
            r1 = this;
            float r0 = r1.from
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto Le
            float r0 = r1.to
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 > 0) goto Le
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }

    public boolean isLarger(float r2) {
            r1 = this;
            float r0 = r1.to
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 <= 0) goto L8
            r2 = 1
            return r2
        L8:
            r2 = 0
            return r2
    }

    public boolean isSmaller(float r2) {
            r1 = this;
            float r0 = r1.from
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 >= 0) goto L8
            r2 = 1
            return r2
        L8:
            r2 = 0
            return r2
    }
}
