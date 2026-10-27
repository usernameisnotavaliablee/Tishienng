package com.google.android.material.color.utilities;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class DynamicScheme {
    public final double contrastLevel;
    public final com.google.android.material.color.utilities.TonalPalette errorPalette;
    public final boolean isDark;
    public final com.google.android.material.color.utilities.TonalPalette neutralPalette;
    public final com.google.android.material.color.utilities.TonalPalette neutralVariantPalette;
    public final com.google.android.material.color.utilities.TonalPalette primaryPalette;
    public final com.google.android.material.color.utilities.TonalPalette secondaryPalette;
    public final int sourceColorArgb;
    public final com.google.android.material.color.utilities.Hct sourceColorHct;
    public final com.google.android.material.color.utilities.TonalPalette tertiaryPalette;
    public final com.google.android.material.color.utilities.Variant variant;

    public DynamicScheme(com.google.android.material.color.utilities.Hct r2, com.google.android.material.color.utilities.Variant r3, boolean r4, double r5, com.google.android.material.color.utilities.TonalPalette r7, com.google.android.material.color.utilities.TonalPalette r8, com.google.android.material.color.utilities.TonalPalette r9, com.google.android.material.color.utilities.TonalPalette r10, com.google.android.material.color.utilities.TonalPalette r11) {
            r1 = this;
            r1.<init>()
            int r0 = r2.toInt()
            r1.sourceColorArgb = r0
            r1.sourceColorHct = r2
            r1.variant = r3
            r1.isDark = r4
            r1.contrastLevel = r5
            r1.primaryPalette = r7
            r1.secondaryPalette = r8
            r1.tertiaryPalette = r9
            r1.neutralPalette = r10
            r1.neutralVariantPalette = r11
            r2 = 4627730092099895296(0x4039000000000000, double:25.0)
            r4 = 4635611391447793664(0x4055000000000000, double:84.0)
            com.google.android.material.color.utilities.TonalPalette r2 = com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(r2, r4)
            r1.errorPalette = r2
            return
    }

    public static double getRotatedHue(com.google.android.material.color.utilities.Hct r9, double[] r10, double[] r11) {
            double r0 = r9.getHue()
            int r9 = r11.length
            r2 = 1
            r3 = 0
            if (r9 != r2) goto L11
            r9 = r11[r3]
            double r0 = r0 + r9
            double r9 = com.google.android.material.color.utilities.MathUtils.sanitizeDegreesDouble(r0)
            return r9
        L11:
            int r9 = r10.length
        L12:
            int r2 = r9 + (-2)
            if (r3 > r2) goto L2e
            r4 = r10[r3]
            int r2 = r3 + 1
            r6 = r10[r2]
            int r8 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r8 >= 0) goto L2c
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 >= 0) goto L2c
            r9 = r11[r3]
            double r0 = r0 + r9
            double r9 = com.google.android.material.color.utilities.MathUtils.sanitizeDegreesDouble(r0)
            return r9
        L2c:
            r3 = r2
            goto L12
        L2e:
            return r0
    }
}
