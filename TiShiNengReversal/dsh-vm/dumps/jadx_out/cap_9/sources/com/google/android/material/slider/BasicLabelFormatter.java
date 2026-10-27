package com.google.android.material.slider;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class BasicLabelFormatter implements com.google.android.material.slider.LabelFormatter {
    private static final int BILLION = 1000000000;
    private static final int MILLION = 1000000;
    private static final int THOUSAND = 1000;
    private static final long TRILLION = 1000000000000L;

    public BasicLabelFormatter() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.material.slider.LabelFormatter
    @androidx.annotation.NonNull
    public java.lang.String getFormattedValue(float r5) {
            r4 = this;
            r0 = 0
            r1 = 1
            r2 = 1399379109(0x5368d4a5, float:1.0E12)
            int r3 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r3 < 0) goto L1b
            java.util.Locale r3 = java.util.Locale.US
            float r5 = r5 / r2
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r5
            java.lang.String r5 = "%.1fT"
            java.lang.String r5 = java.lang.String.format(r3, r5, r1)
            return r5
        L1b:
            r2 = 1315859240(0x4e6e6b28, float:1.0E9)
            int r3 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r3 < 0) goto L34
            java.util.Locale r3 = java.util.Locale.US
            float r5 = r5 / r2
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r5
            java.lang.String r5 = "%.1fB"
            java.lang.String r5 = java.lang.String.format(r3, r5, r1)
            return r5
        L34:
            r2 = 1232348160(0x49742400, float:1000000.0)
            int r3 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r3 < 0) goto L4d
            java.util.Locale r3 = java.util.Locale.US
            float r5 = r5 / r2
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r5
            java.lang.String r5 = "%.1fM"
            java.lang.String r5 = java.lang.String.format(r3, r5, r1)
            return r5
        L4d:
            r2 = 1148846080(0x447a0000, float:1000.0)
            int r3 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r3 < 0) goto L65
            java.util.Locale r3 = java.util.Locale.US
            float r5 = r5 / r2
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r5
            java.lang.String r5 = "%.1fK"
            java.lang.String r5 = java.lang.String.format(r3, r5, r1)
            return r5
        L65:
            java.util.Locale r2 = java.util.Locale.US
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r5
            java.lang.String r5 = "%.0f"
            java.lang.String r5 = java.lang.String.format(r2, r5, r1)
            return r5
    }
}
