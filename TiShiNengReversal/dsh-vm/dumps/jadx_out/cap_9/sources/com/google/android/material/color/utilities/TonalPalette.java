package com.google.android.material.color.utilities;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class TonalPalette {
    java.util.Map<java.lang.Integer, java.lang.Integer> cache;
    double chroma;
    double hue;
    com.google.android.material.color.utilities.Hct keyColor;

    private TonalPalette(double r2, double r4, com.google.android.material.color.utilities.Hct r6) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.cache = r0
            r1.hue = r2
            r1.chroma = r4
            r1.keyColor = r6
            return
    }

    private static com.google.android.material.color.utilities.Hct createKeyColor(double r15, double r17) {
            r4 = 4632233691727265792(0x4049000000000000, double:50.0)
            r0 = r15
            r2 = r17
            com.google.android.material.color.utilities.Hct r6 = com.google.android.material.color.utilities.Hct.from(r0, r2, r4)
            double r0 = r6.getChroma()
            double r0 = r0 - r17
            double r0 = java.lang.Math.abs(r0)
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r13 = r2
        L16:
            r7 = 4632233691727265792(0x4049000000000000, double:50.0)
            int r9 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r9 >= 0) goto L61
            long r7 = java.lang.Math.round(r17)
            double r9 = r6.getChroma()
            long r9 = java.lang.Math.round(r9)
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L2d
            goto L61
        L2d:
            double r11 = r4 + r13
            r7 = r15
            r9 = r17
            com.google.android.material.color.utilities.Hct r11 = com.google.android.material.color.utilities.Hct.from(r7, r9, r11)
            double r7 = r11.getChroma()
            double r7 = r7 - r17
            double r7 = java.lang.Math.abs(r7)
            int r9 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r9 >= 0) goto L46
            r0 = r7
            r6 = r11
        L46:
            double r11 = r4 - r13
            r7 = r15
            r9 = r17
            com.google.android.material.color.utilities.Hct r11 = com.google.android.material.color.utilities.Hct.from(r7, r9, r11)
            double r7 = r11.getChroma()
            double r7 = r7 - r17
            double r7 = java.lang.Math.abs(r7)
            int r9 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r9 >= 0) goto L5f
            r0 = r7
            r6 = r11
        L5f:
            double r13 = r13 + r2
            goto L16
        L61:
            return r6
    }

    public static com.google.android.material.color.utilities.TonalPalette fromHct(com.google.android.material.color.utilities.Hct r6) {
            com.google.android.material.color.utilities.TonalPalette r0 = new com.google.android.material.color.utilities.TonalPalette
            double r1 = r6.getHue()
            double r3 = r6.getChroma()
            r5 = r6
            r0.<init>(r1, r3, r5)
            return r0
    }

    public static com.google.android.material.color.utilities.TonalPalette fromHueAndChroma(double r6, double r8) {
            com.google.android.material.color.utilities.TonalPalette r0 = new com.google.android.material.color.utilities.TonalPalette
            com.google.android.material.color.utilities.Hct r5 = createKeyColor(r6, r8)
            r1 = r6
            r3 = r8
            r0.<init>(r1, r3, r5)
            return r0
    }

    public static com.google.android.material.color.utilities.TonalPalette fromInt(int r0) {
            com.google.android.material.color.utilities.Hct r0 = com.google.android.material.color.utilities.Hct.fromInt(r0)
            com.google.android.material.color.utilities.TonalPalette r0 = fromHct(r0)
            return r0
    }

    public double getChroma() {
            r2 = this;
            double r0 = r2.chroma
            return r0
    }

    public com.google.android.material.color.utilities.Hct getHct(double r7) {
            r6 = this;
            double r0 = r6.hue
            double r2 = r6.chroma
            r4 = r7
            com.google.android.material.color.utilities.Hct r7 = com.google.android.material.color.utilities.Hct.from(r0, r2, r4)
            return r7
    }

    public double getHue() {
            r2 = this;
            double r0 = r2.hue
            return r0
    }

    public com.google.android.material.color.utilities.Hct getKeyColor() {
            r1 = this;
            com.google.android.material.color.utilities.Hct r0 = r1.keyColor
            return r0
    }

    public int tone(int r8) {
            r7 = this;
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r7.cache
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L28
            double r1 = r7.hue
            double r3 = r7.chroma
            double r5 = (double) r8
            com.google.android.material.color.utilities.Hct r0 = com.google.android.material.color.utilities.Hct.from(r1, r3, r5)
            int r0 = r0.toInt()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.Map<java.lang.Integer, java.lang.Integer> r1 = r7.cache
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r1.put(r8, r0)
        L28:
            int r8 = r0.intValue()
            return r8
    }
}
