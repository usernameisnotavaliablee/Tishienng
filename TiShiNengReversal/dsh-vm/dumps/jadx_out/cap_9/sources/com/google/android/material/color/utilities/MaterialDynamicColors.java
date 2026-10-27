package com.google.android.material.color.utilities;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class MaterialDynamicColors {
    private static final double CONTAINER_ACCENT_TONE_DELTA = 15.0d;

    public MaterialDynamicColors() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ java.lang.Double A(com.google.android.material.color.utilities.DynamicScheme r2) {
            com.google.android.material.color.utilities.TonalPalette r2 = r2.secondaryPalette
            com.google.android.material.color.utilities.Hct r2 = r2.getKeyColor()
            double r0 = r2.getTone()
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette A0(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.primaryPalette
            return r0
    }

    public static /* synthetic */ java.lang.Double A1(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4622945017495814144(0x4028000000000000, double:12.0)
            goto Lc
        L7:
            r0 = 4636315078889570304(0x4057800000000000, double:94.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette B(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.primaryPalette
            return r0
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette B0(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralVariantPalette
            return r0
    }

    public static /* synthetic */ java.lang.Double B1(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4630826316843712512(0x4044000000000000, double:40.0)
            goto L9
        L7:
            r0 = 4635329916471083008(0x4054000000000000, double:80.0)
        L9:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ com.google.android.material.color.utilities.DynamicColor C(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.DynamicColor r0 = r0.secondary()
            return r0
    }

    public static /* synthetic */ java.lang.Double C0(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r0 = isMonochrome(r2)
            if (r0 == 0) goto L14
            boolean r2 = r2.isDark
            if (r2 == 0) goto Ld
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            goto Lf
        Ld:
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
        Lf:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
        L14:
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette C1(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.errorPalette
            return r0
    }

    public static /* synthetic */ java.lang.Double D(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
            goto Lc
        L7:
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ com.google.android.material.color.utilities.DynamicColor D0(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.DynamicColor r0 = r0.secondaryFixedDim()
            return r0
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette D1(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette E(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.errorPalette
            return r0
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette E0(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.secondaryPalette
            return r0
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette E1(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.primaryPalette
            return r0
    }

    public static /* synthetic */ java.lang.Double F(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4627448617123184640(0x4038000000000000, double:24.0)
            goto Lc
        L7:
            r0 = 4636596553866280960(0x4058800000000000, double:98.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette F0(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette F1(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.secondaryPalette
            return r0
    }

    public static /* synthetic */ java.lang.Double G(com.google.android.material.color.utilities.DynamicScheme r2) {
            com.google.android.material.color.utilities.TonalPalette r2 = r2.primaryPalette
            com.google.android.material.color.utilities.Hct r2 = r2.getKeyColor()
            double r0 = r2.getTone()
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ java.lang.Double G0(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r0 = isMonochrome(r2)
            if (r0 == 0) goto L17
            boolean r2 = r2.isDark
            if (r2 == 0) goto Ld
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
            goto L12
        Ld:
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
        L12:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
        L17:
            boolean r2 = r2.isDark
            if (r2 == 0) goto L1e
            r0 = 4626322717216342016(0x4034000000000000, double:20.0)
            goto L20
        L1e:
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
        L20:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ com.google.android.material.color.utilities.DynamicColor G1(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.DynamicColor r0 = r0.background()
            return r0
    }

    public static /* synthetic */ java.lang.Double H(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            goto L9
        L7:
            r0 = 0
        L9:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ com.google.android.material.color.utilities.DynamicColor H0(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.DynamicColor r0 = r0.inverseSurface()
            return r0
    }

    public static /* synthetic */ java.lang.Double H1(com.google.android.material.color.utilities.DynamicScheme r2) {
            com.google.android.material.color.utilities.x1 r0 = new com.google.android.material.color.utilities.x1
            r0.<init>()
            r1 = 0
            double r0 = com.google.android.material.color.utilities.DynamicColor.toneMaxContrastDefault(r0, r1, r2, r1)
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette I(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.secondaryPalette
            return r0
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette I0(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    public static /* synthetic */ java.lang.Double I1(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = isMonochrome(r2)
            if (r2 == 0) goto Lc
            r0 = 4634626229029306368(0x4051800000000000, double:70.0)
            goto Le
        Lc:
            r0 = 4635329916471083008(0x4054000000000000, double:80.0)
        Le:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette J(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette J0(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.secondaryPalette
            return r0
    }

    public static /* synthetic */ com.google.android.material.color.utilities.DynamicColor J1(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.DynamicColor r0 = r0.primaryFixedDim()
            return r0
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette K(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralVariantPalette
            return r0
    }

    public static /* synthetic */ java.lang.Double K0(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
            goto L9
        L7:
            r0 = 4636455816377925632(0x4058000000000000, double:96.0)
        L9:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette K1(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    public static /* synthetic */ com.google.android.material.color.utilities.DynamicColor L(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.DynamicColor r0 = r0.surfaceVariant()
            return r0
    }

    public static /* synthetic */ java.lang.Double L0(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = isMonochrome(r2)
            if (r2 == 0) goto Lc
            r0 = 4634626229029306368(0x4051800000000000, double:70.0)
            goto Le
        Lc:
            r0 = 4629137466983448576(0x403e000000000000, double:30.0)
        Le:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ com.google.android.material.color.utilities.DynamicColor L1(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.DynamicColor r0 = r0.tertiaryContainer()
            return r0
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette M(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralVariantPalette
            return r0
    }

    public static /* synthetic */ java.lang.Double M0(com.google.android.material.color.utilities.DynamicScheme r2) {
            r0 = 0
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette M1(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    public static /* synthetic */ java.lang.Double N(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = isMonochrome(r2)
            if (r2 == 0) goto L9
            r0 = 4630826316843712512(0x4044000000000000, double:40.0)
            goto Le
        L9:
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
        Le:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ com.google.android.material.color.utilities.DynamicColor N0(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.DynamicColor r0 = r0.tertiaryFixedDim()
            return r0
    }

    public static /* synthetic */ java.lang.Double N1(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = isMonochrome(r2)
            if (r2 == 0) goto L9
            r0 = 4635329916471083008(0x4054000000000000, double:80.0)
            goto Le
        L9:
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
        Le:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ java.lang.Double O(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto La
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
            goto Lc
        La:
            r0 = 4626322717216342016(0x4034000000000000, double:20.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ java.lang.Double O0(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4633641066610819072(0x404e000000000000, double:60.0)
            goto L9
        L7:
            r0 = 4632233691727265792(0x4049000000000000, double:50.0)
        L9:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ java.lang.Double O1(com.google.android.material.color.utilities.DynamicScheme r3) {
            boolean r0 = isMonochrome(r3)
            r1 = 4636737291354636288(0x4059000000000000, double:100.0)
            if (r0 == 0) goto L13
            boolean r3 = r3.isDark
            if (r3 == 0) goto Le
            r1 = 4621819117588971520(0x4024000000000000, double:10.0)
        Le:
            java.lang.Double r3 = java.lang.Double.valueOf(r1)
            return r3
        L13:
            boolean r3 = r3.isDark
            if (r3 == 0) goto L19
            r1 = 4626322717216342016(0x4034000000000000, double:20.0)
        L19:
            java.lang.Double r3 = java.lang.Double.valueOf(r1)
            return r3
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette P(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    public static /* synthetic */ java.lang.Double P0(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4635329916471083008(0x4054000000000000, double:80.0)
            goto L9
        L7:
            r0 = 4630826316843712512(0x4044000000000000, double:40.0)
        L9:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ java.lang.Double P1(com.google.android.material.color.utilities.MaterialDynamicColors r2, com.google.android.material.color.utilities.DynamicScheme r3) {
            r2.getClass()
            boolean r0 = isMonochrome(r3)
            if (r0 == 0) goto L17
            boolean r2 = r3.isDark
            if (r2 == 0) goto L10
            r2 = 0
            goto L12
        L10:
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
        L12:
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            return r2
        L17:
            boolean r0 = isFidelity(r3)
            if (r0 != 0) goto L2e
            boolean r2 = r3.isDark
            if (r2 == 0) goto L27
            r2 = 4636033603912859648(0x4056800000000000, double:90.0)
            goto L29
        L27:
            r2 = 4621819117588971520(0x4024000000000000, double:10.0)
        L29:
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            return r2
        L2e:
            com.google.android.material.color.utilities.DynamicColor r2 = r2.tertiaryContainer()
            java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r2 = r2.tone
            java.lang.Object r2 = com.bytedance.msdk.core.ae.a.a(r2, r3)
            java.lang.Double r2 = (java.lang.Double) r2
            double r2 = r2.doubleValue()
            r0 = 4616752568008179712(0x4012000000000000, double:4.5)
            double r2 = com.google.android.material.color.utilities.DynamicColor.contrastingTone(r2, r0)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            return r2
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette Q(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    public static /* synthetic */ java.lang.Double Q0(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
            goto Lc
        L7:
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ java.lang.Double Q1(com.google.android.material.color.utilities.DynamicScheme r2) {
            com.google.android.material.color.utilities.TonalPalette r2 = r2.neutralPalette
            com.google.android.material.color.utilities.Hct r2 = r2.getKeyColor()
            double r0 = r2.getTone()
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ java.lang.Double R(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = isMonochrome(r2)
            if (r2 == 0) goto L9
            r0 = 4629137466983448576(0x403e000000000000, double:30.0)
            goto Lb
        L9:
            r0 = 4635329916471083008(0x4054000000000000, double:80.0)
        Lb:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ java.lang.Double R0(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r0 = isFidelity(r2)
            if (r0 == 0) goto L11
            com.google.android.material.color.utilities.Hct r0 = r2.sourceColorHct
            double r0 = performAlbers(r0, r2)
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
        L11:
            boolean r0 = isMonochrome(r2)
            if (r0 == 0) goto L28
            boolean r2 = r2.isDark
            if (r2 == 0) goto L21
            r0 = 4635681760191971328(0x4055400000000000, double:85.0)
            goto L23
        L21:
            r0 = 4627730092099895296(0x4039000000000000, double:25.0)
        L23:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
        L28:
            boolean r2 = r2.isDark
            if (r2 == 0) goto L2f
            r0 = 4629137466983448576(0x403e000000000000, double:30.0)
            goto L34
        L2f:
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
        L34:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette R1(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.secondaryPalette
            return r0
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette S(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    public static /* synthetic */ java.lang.Double S0(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4626322717216342016(0x4034000000000000, double:20.0)
            goto L9
        L7:
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
        L9:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ java.lang.Double S1(com.google.android.material.color.utilities.DynamicScheme r2) {
            com.google.android.material.color.utilities.TonalPalette r2 = r2.tertiaryPalette
            com.google.android.material.color.utilities.Hct r2 = r2.getKeyColor()
            double r0 = r2.getTone()
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ com.google.android.material.color.utilities.ToneDeltaConstraint T(com.google.android.material.color.utilities.MaterialDynamicColors r3, com.google.android.material.color.utilities.DynamicScheme r4) {
            com.google.android.material.color.utilities.ToneDeltaConstraint r0 = new com.google.android.material.color.utilities.ToneDeltaConstraint
            com.google.android.material.color.utilities.DynamicColor r3 = r3.errorContainer()
            boolean r4 = r4.isDark
            if (r4 == 0) goto Ld
            com.google.android.material.color.utilities.TonePolarity r4 = com.google.android.material.color.utilities.TonePolarity.DARKER
            goto Lf
        Ld:
            com.google.android.material.color.utilities.TonePolarity r4 = com.google.android.material.color.utilities.TonePolarity.LIGHTER
        Lf:
            r1 = 4624633867356078080(0x402e000000000000, double:15.0)
            r0.<init>(r1, r3, r4)
            return r0
    }

    public static /* synthetic */ java.lang.Double T0(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto La
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
            goto Lc
        La:
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette T1(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.primaryPalette
            return r0
    }

    public static /* synthetic */ java.lang.Double U(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
            goto Lc
        L7:
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ java.lang.Double U0(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
            goto Lc
        L7:
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ java.lang.Double U1(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4625478292286210048(0x4031000000000000, double:17.0)
            goto L9
        L7:
            r0 = 4636174341401214976(0x4057000000000000, double:92.0)
        L9:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ java.lang.Double V(com.google.android.material.color.utilities.DynamicScheme r2) {
            r0 = 0
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette V0(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralVariantPalette
            return r0
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette V1(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette W(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    public static /* synthetic */ com.google.android.material.color.utilities.DynamicColor W0(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.DynamicColor r0 = r0.tertiary()
            return r0
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette X(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    public static /* synthetic */ java.lang.Double X0(com.google.android.material.color.utilities.MaterialDynamicColors r2, com.google.android.material.color.utilities.DynamicScheme r3) {
            r2.getClass()
            boolean r0 = isFidelity(r3)
            if (r0 == 0) goto L24
            com.google.android.material.color.utilities.DynamicColor r2 = r2.primaryContainer()
            java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r2 = r2.tone
            java.lang.Object r2 = com.bytedance.msdk.core.ae.a.a(r2, r3)
            java.lang.Double r2 = (java.lang.Double) r2
            double r2 = r2.doubleValue()
            r0 = 4616752568008179712(0x4012000000000000, double:4.5)
            double r2 = com.google.android.material.color.utilities.DynamicColor.contrastingTone(r2, r0)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            return r2
        L24:
            boolean r2 = isMonochrome(r3)
            if (r2 == 0) goto L38
            boolean r2 = r3.isDark
            if (r2 == 0) goto L31
            r2 = 0
            goto L33
        L31:
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
        L33:
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            return r2
        L38:
            boolean r2 = r3.isDark
            if (r2 == 0) goto L42
            r2 = 4636033603912859648(0x4056800000000000, double:90.0)
            goto L44
        L42:
            r2 = 4621819117588971520(0x4024000000000000, double:10.0)
        L44:
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            return r2
    }

    public static /* synthetic */ java.lang.Double Y(com.google.android.material.color.utilities.DynamicScheme r2) {
            com.google.android.material.color.utilities.i2 r0 = new com.google.android.material.color.utilities.i2
            r0.<init>()
            r1 = 0
            double r0 = com.google.android.material.color.utilities.DynamicColor.toneMinContrastDefault(r0, r1, r2, r1)
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ java.lang.Double Y0(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r0 = isMonochrome(r2)
            if (r0 == 0) goto L14
            boolean r2 = r2.isDark
            if (r2 == 0) goto Ld
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            goto Lf
        Ld:
            r0 = 0
        Lf:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
        L14:
            boolean r2 = r2.isDark
            if (r2 == 0) goto L1b
            r0 = 4635329916471083008(0x4054000000000000, double:80.0)
            goto L1d
        L1b:
            r0 = 4630826316843712512(0x4044000000000000, double:40.0)
        L1d:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ java.lang.Double Z(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = isMonochrome(r2)
            if (r2 == 0) goto Lc
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
            goto Le
        Lc:
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
        Le:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ java.lang.Double Z0(com.google.android.material.color.utilities.DynamicScheme r2) {
            r0 = 0
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette a(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.tertiaryPalette
            return r0
    }

    public static /* synthetic */ com.google.android.material.color.utilities.ToneDeltaConstraint a0(com.google.android.material.color.utilities.MaterialDynamicColors r3, com.google.android.material.color.utilities.DynamicScheme r4) {
            com.google.android.material.color.utilities.ToneDeltaConstraint r0 = new com.google.android.material.color.utilities.ToneDeltaConstraint
            com.google.android.material.color.utilities.DynamicColor r3 = r3.tertiaryContainer()
            boolean r4 = r4.isDark
            if (r4 == 0) goto Ld
            com.google.android.material.color.utilities.TonePolarity r4 = com.google.android.material.color.utilities.TonePolarity.DARKER
            goto Lf
        Ld:
            com.google.android.material.color.utilities.TonePolarity r4 = com.google.android.material.color.utilities.TonePolarity.LIGHTER
        Lf:
            r1 = 4624633867356078080(0x402e000000000000, double:15.0)
            r0.<init>(r1, r3, r4)
            return r0
    }

    public static /* synthetic */ java.lang.Double a1(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4629137466983448576(0x403e000000000000, double:30.0)
            goto L9
        L7:
            r0 = 4635329916471083008(0x4054000000000000, double:80.0)
        L9:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette b(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    public static /* synthetic */ java.lang.Double b0(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4635329916471083008(0x4054000000000000, double:80.0)
            goto L9
        L7:
            r0 = 4630826316843712512(0x4044000000000000, double:40.0)
        L9:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette b1(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    public static /* synthetic */ java.lang.Double c(com.google.android.material.color.utilities.DynamicScheme r3) {
            boolean r0 = isMonochrome(r3)
            r1 = 4629137466983448576(0x403e000000000000, double:30.0)
            if (r0 == 0) goto L17
            boolean r3 = r3.isDark
            if (r3 == 0) goto Ld
            goto L12
        Ld:
            r1 = 4634626229029306368(0x4051800000000000, double:70.0)
        L12:
            java.lang.Double r3 = java.lang.Double.valueOf(r1)
            return r3
        L17:
            java.lang.Double r3 = java.lang.Double.valueOf(r1)
            return r3
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette c0(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    public static /* synthetic */ java.lang.Double c1(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4629137466983448576(0x403e000000000000, double:30.0)
            goto Lc
        L7:
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ com.google.android.material.color.utilities.DynamicColor d(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.DynamicColor r0 = r0.secondaryContainer()
            return r0
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette d0(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.secondaryPalette
            return r0
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette d1(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.tertiaryPalette
            return r0
    }

    public static /* synthetic */ java.lang.Double e(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4629137466983448576(0x403e000000000000, double:30.0)
            goto Lc
        L7:
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette e0(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    public static /* synthetic */ java.lang.Double e1(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4616189618054758400(0x4010000000000000, double:4.0)
            goto L9
        L7:
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
        L9:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette f(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.secondaryPalette
            return r0
    }

    public static /* synthetic */ java.lang.Double f0(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4626885667169763328(0x4036000000000000, double:22.0)
            goto Lc
        L7:
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ java.lang.Double f1(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r0 = isMonochrome(r2)
            if (r0 == 0) goto L17
            boolean r2 = r2.isDark
            if (r2 == 0) goto Ld
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
            goto L12
        Ld:
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
        L12:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
        L17:
            boolean r2 = r2.isDark
            if (r2 == 0) goto L1e
            r0 = 4626322717216342016(0x4034000000000000, double:20.0)
            goto L20
        L1e:
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
        L20:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static double findDesiredChromaByTone(double r9, double r11, double r13, boolean r15) {
            com.google.android.material.color.utilities.Hct r0 = com.google.android.material.color.utilities.Hct.from(r9, r11, r13)
            double r1 = r0.getChroma()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 >= 0) goto L60
            double r1 = r0.getChroma()
        L10:
            double r3 = r0.getChroma()
            int r5 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r5 >= 0) goto L60
            if (r15 == 0) goto L1d
            r3 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            goto L1f
        L1d:
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L1f:
            double r13 = r13 + r3
            com.google.android.material.color.utilities.Hct r3 = com.google.android.material.color.utilities.Hct.from(r9, r11, r13)
            double r4 = r3.getChroma()
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 <= 0) goto L2d
            goto L3f
        L2d:
            double r4 = r3.getChroma()
            double r4 = r4 - r11
            double r4 = java.lang.Math.abs(r4)
            r6 = 4600877379321698714(0x3fd999999999999a, double:0.4)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L40
        L3f:
            return r13
        L40:
            double r4 = r3.getChroma()
            double r4 = r4 - r11
            double r4 = java.lang.Math.abs(r4)
            double r6 = r0.getChroma()
            double r6 = r6 - r11
            double r6 = java.lang.Math.abs(r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L57
            r0 = r3
        L57:
            double r3 = r3.getChroma()
            double r1 = java.lang.Math.max(r1, r3)
            goto L10
        L60:
            return r13
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette g(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.primaryPalette
            return r0
    }

    public static /* synthetic */ com.google.android.material.color.utilities.DynamicColor g0(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.DynamicColor r0 = r0.error()
            return r0
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette g1(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    public static /* synthetic */ com.google.android.material.color.utilities.DynamicColor h(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.DynamicColor r0 = r0.primaryFixedDim()
            return r0
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette h0(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.tertiaryPalette
            return r0
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette h1(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette i(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.errorPalette
            return r0
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette i0(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.tertiaryPalette
            return r0
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette i1(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.secondaryPalette
            return r0
    }

    private static boolean isFidelity(com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.Variant r1 = r1.variant
            com.google.android.material.color.utilities.Variant r0 = com.google.android.material.color.utilities.Variant.FIDELITY
            if (r1 == r0) goto Ld
            com.google.android.material.color.utilities.Variant r0 = com.google.android.material.color.utilities.Variant.CONTENT
            if (r1 != r0) goto Lb
            goto Ld
        Lb:
            r1 = 0
            return r1
        Ld:
            r1 = 1
            return r1
    }

    private static boolean isMonochrome(com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.Variant r1 = r1.variant
            com.google.android.material.color.utilities.Variant r0 = com.google.android.material.color.utilities.Variant.MONOCHROME
            if (r1 != r0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    public static /* synthetic */ com.google.android.material.color.utilities.DynamicColor j(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.DynamicColor r0 = r0.primaryContainer()
            return r0
    }

    public static /* synthetic */ java.lang.Double j0(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            goto L9
        L7:
            r0 = 0
        L9:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette j1(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralVariantPalette
            return r0
    }

    public static /* synthetic */ com.google.android.material.color.utilities.DynamicColor k(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.DynamicColor r0 = r0.primary()
            return r0
    }

    public static /* synthetic */ java.lang.Double k0(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4626322717216342016(0x4034000000000000, double:20.0)
            goto Lc
        L7:
            r0 = 4636385447633747968(0x4057c00000000000, double:95.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ java.lang.Double k1(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r0 = isMonochrome(r2)
            if (r0 == 0) goto L17
            boolean r2 = r2.isDark
            if (r2 == 0) goto L10
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
            goto L12
        L10:
            r0 = 4627730092099895296(0x4039000000000000, double:25.0)
        L12:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
        L17:
            boolean r2 = r2.isDark
            if (r2 == 0) goto L1e
            r0 = 4635329916471083008(0x4054000000000000, double:80.0)
            goto L20
        L1e:
            r0 = 4630826316843712512(0x4044000000000000, double:40.0)
        L20:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette l(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.tertiaryPalette
            return r0
    }

    public static /* synthetic */ java.lang.Double l0(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto La
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
            goto Lc
        La:
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ java.lang.Double l1(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4635329916471083008(0x4054000000000000, double:80.0)
            goto L9
        L7:
            r0 = 4629137466983448576(0x403e000000000000, double:30.0)
        L9:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette m(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.primaryPalette
            return r0
    }

    public static /* synthetic */ java.lang.Double m0(com.google.android.material.color.utilities.DynamicScheme r2) {
            com.google.android.material.color.utilities.TonalPalette r2 = r2.neutralVariantPalette
            com.google.android.material.color.utilities.Hct r2 = r2.getKeyColor()
            double r0 = r2.getTone()
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ com.google.android.material.color.utilities.DynamicColor m1(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.DynamicColor r0 = r0.tertiaryFixedDim()
            return r0
    }

    public static /* synthetic */ java.lang.Double n(com.google.android.material.color.utilities.DynamicScheme r2) {
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ com.google.android.material.color.utilities.ToneDeltaConstraint n0(com.google.android.material.color.utilities.MaterialDynamicColors r3, com.google.android.material.color.utilities.DynamicScheme r4) {
            com.google.android.material.color.utilities.ToneDeltaConstraint r0 = new com.google.android.material.color.utilities.ToneDeltaConstraint
            com.google.android.material.color.utilities.DynamicColor r3 = r3.primaryContainer()
            boolean r4 = r4.isDark
            if (r4 == 0) goto Ld
            com.google.android.material.color.utilities.TonePolarity r4 = com.google.android.material.color.utilities.TonePolarity.DARKER
            goto Lf
        Ld:
            com.google.android.material.color.utilities.TonePolarity r4 = com.google.android.material.color.utilities.TonePolarity.LIGHTER
        Lf:
            r1 = 4624633867356078080(0x402e000000000000, double:15.0)
            r0.<init>(r1, r3, r4)
            return r0
    }

    public static /* synthetic */ java.lang.Double n1(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4635329916471083008(0x4054000000000000, double:80.0)
            goto L9
        L7:
            r0 = 4629137466983448576(0x403e000000000000, double:30.0)
        L9:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ java.lang.Double o(com.google.android.material.color.utilities.DynamicScheme r2) {
            r0 = 0
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette o0(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.tertiaryPalette
            return r0
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette o1(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette p(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralPalette
            return r0
    }

    public static /* synthetic */ java.lang.Double p0(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto La
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
            goto Lc
        La:
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette p1(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.secondaryPalette
            return r0
    }

    static double performAlbers(com.google.android.material.color.utilities.Hct r2, com.google.android.material.color.utilities.DynamicScheme r3) {
            com.google.android.material.color.utilities.ViewingConditions r3 = viewingConditionsForAlbers(r3)
            com.google.android.material.color.utilities.Hct r3 = r2.inViewingConditions(r3)
            double r0 = r2.getTone()
            boolean r0 = com.google.android.material.color.utilities.DynamicColor.tonePrefersLightForeground(r0)
            if (r0 == 0) goto L25
            double r0 = r3.getTone()
            boolean r0 = com.google.android.material.color.utilities.DynamicColor.toneAllowsLightForeground(r0)
            if (r0 != 0) goto L25
            double r2 = r2.getTone()
            double r2 = com.google.android.material.color.utilities.DynamicColor.enableLightForeground(r2)
            return r2
        L25:
            double r2 = r3.getTone()
            double r2 = com.google.android.material.color.utilities.DynamicColor.enableLightForeground(r2)
            return r2
    }

    public static /* synthetic */ java.lang.Double q(com.google.android.material.color.utilities.DynamicScheme r3) {
            boolean r0 = isMonochrome(r3)
            if (r0 == 0) goto L17
            boolean r3 = r3.isDark
            if (r3 == 0) goto Ld
            r0 = 4633641066610819072(0x404e000000000000, double:60.0)
            goto L12
        Ld:
            r0 = 4632092954238910464(0x4048800000000000, double:49.0)
        L12:
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
            return r3
        L17:
            boolean r0 = isFidelity(r3)
            if (r0 != 0) goto L2e
            boolean r3 = r3.isDark
            if (r3 == 0) goto L24
            r0 = 4629137466983448576(0x403e000000000000, double:30.0)
            goto L29
        L24:
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
        L29:
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
            return r3
        L2e:
            com.google.android.material.color.utilities.TonalPalette r0 = r3.tertiaryPalette
            com.google.android.material.color.utilities.Hct r1 = r3.sourceColorHct
            double r1 = r1.getTone()
            com.google.android.material.color.utilities.Hct r0 = r0.getHct(r1)
            double r0 = performAlbers(r0, r3)
            com.google.android.material.color.utilities.TonalPalette r3 = r3.tertiaryPalette
            com.google.android.material.color.utilities.Hct r3 = r3.getHct(r0)
            com.google.android.material.color.utilities.Hct r3 = com.google.android.material.color.utilities.DislikeAnalyzer.fixIfDisliked(r3)
            double r0 = r3.getTone()
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
            return r3
    }

    public static /* synthetic */ java.lang.Double q0(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4635329916471083008(0x4054000000000000, double:80.0)
            goto L9
        L7:
            r0 = 4630826316843712512(0x4044000000000000, double:40.0)
        L9:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette q1(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.primaryPalette
            return r0
    }

    public static /* synthetic */ com.google.android.material.color.utilities.DynamicColor r(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.DynamicColor r0 = r0.errorContainer()
            return r0
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette r0(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.primaryPalette
            return r0
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette r1(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.tertiaryPalette
            return r0
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette s(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralVariantPalette
            return r0
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette s0(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.primaryPalette
            return r0
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette s1(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.errorPalette
            return r0
    }

    public static /* synthetic */ java.lang.Double t(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4618441417868443648(0x4018000000000000, double:6.0)
            goto Lc
        L7:
            r0 = 4636596553866280960(0x4058800000000000, double:98.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette t0(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.primaryPalette
            return r0
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette t1(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.primaryPalette
            return r0
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette u(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.tertiaryPalette
            return r0
    }

    public static /* synthetic */ java.lang.Double u0(com.google.android.material.color.utilities.DynamicScheme r10) {
            boolean r0 = isMonochrome(r10)
            r1 = 4629137466983448576(0x403e000000000000, double:30.0)
            if (r0 == 0) goto L17
            boolean r10 = r10.isDark
            if (r10 == 0) goto Ld
            goto L12
        Ld:
            r1 = 4635681760191971328(0x4055400000000000, double:85.0)
        L12:
            java.lang.Double r10 = java.lang.Double.valueOf(r1)
            return r10
        L17:
            boolean r0 = r10.isDark
            if (r0 == 0) goto L1d
        L1b:
            r7 = r1
            goto L23
        L1d:
            r1 = 4636033603912859648(0x4056800000000000, double:90.0)
            goto L1b
        L23:
            boolean r0 = isFidelity(r10)
            if (r0 != 0) goto L2e
            java.lang.Double r10 = java.lang.Double.valueOf(r7)
            return r10
        L2e:
            com.google.android.material.color.utilities.TonalPalette r0 = r10.secondaryPalette
            double r3 = r0.getHue()
            com.google.android.material.color.utilities.TonalPalette r0 = r10.secondaryPalette
            double r5 = r0.getChroma()
            boolean r0 = r10.isDark
            r9 = r0 ^ 1
            double r0 = findDesiredChromaByTone(r3, r5, r7, r9)
            com.google.android.material.color.utilities.TonalPalette r2 = r10.secondaryPalette
            com.google.android.material.color.utilities.Hct r0 = r2.getHct(r0)
            double r0 = performAlbers(r0, r10)
            java.lang.Double r10 = java.lang.Double.valueOf(r0)
            return r10
    }

    public static /* synthetic */ java.lang.Double u1(com.google.android.material.color.utilities.DynamicScheme r3) {
            boolean r0 = isMonochrome(r3)
            r1 = 4621819117588971520(0x4024000000000000, double:10.0)
            if (r0 == 0) goto L17
            boolean r3 = r3.isDark
            if (r3 == 0) goto Ld
            goto L12
        Ld:
            r1 = 4636033603912859648(0x4056800000000000, double:90.0)
        L12:
            java.lang.Double r3 = java.lang.Double.valueOf(r1)
            return r3
        L17:
            java.lang.Double r3 = java.lang.Double.valueOf(r1)
            return r3
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette v(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.primaryPalette
            return r0
    }

    public static /* synthetic */ java.lang.Double v0(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4618441417868443648(0x4018000000000000, double:6.0)
            goto Lc
        L7:
            r0 = 4636596553866280960(0x4058800000000000, double:98.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ java.lang.Double v1(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4629137466983448576(0x403e000000000000, double:30.0)
            goto Lc
        L7:
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    private static com.google.android.material.color.utilities.ViewingConditions viewingConditionsForAlbers(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4629137466983448576(0x403e000000000000, double:30.0)
            goto L9
        L7:
            r0 = 4635329916471083008(0x4054000000000000, double:80.0)
        L9:
            com.google.android.material.color.utilities.ViewingConditions r2 = com.google.android.material.color.utilities.ViewingConditions.defaultWithBackgroundLstar(r0)
            return r2
    }

    public static /* synthetic */ java.lang.Double w(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4618441417868443648(0x4018000000000000, double:6.0)
            goto Lc
        L7:
            r0 = 4635822497680326656(0x4055c00000000000, double:87.0)
        Lc:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette w0(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.tertiaryPalette
            return r0
    }

    public static /* synthetic */ java.lang.Double w1(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            goto L9
        L7:
            r0 = 0
        L9:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette x(com.google.android.material.color.utilities.DynamicScheme r0) {
            com.google.android.material.color.utilities.TonalPalette r0 = r0.neutralVariantPalette
            return r0
    }

    public static /* synthetic */ java.lang.Double x0(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto L7
            r0 = 4629137466983448576(0x403e000000000000, double:30.0)
            goto L9
        L7:
            r0 = 4635329916471083008(0x4054000000000000, double:80.0)
        L9:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ java.lang.Double x1(com.google.android.material.color.utilities.MaterialDynamicColors r2, com.google.android.material.color.utilities.DynamicScheme r3) {
            r2.getClass()
            boolean r0 = isFidelity(r3)
            if (r0 != 0) goto L1a
            boolean r2 = r3.isDark
            if (r2 == 0) goto L13
            r2 = 4636033603912859648(0x4056800000000000, double:90.0)
            goto L15
        L13:
            r2 = 4621819117588971520(0x4024000000000000, double:10.0)
        L15:
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            return r2
        L1a:
            com.google.android.material.color.utilities.DynamicColor r2 = r2.secondaryContainer()
            java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r2 = r2.tone
            java.lang.Object r2 = com.bytedance.msdk.core.ae.a.a(r2, r3)
            java.lang.Double r2 = (java.lang.Double) r2
            double r2 = r2.doubleValue()
            r0 = 4616752568008179712(0x4012000000000000, double:4.5)
            double r2 = com.google.android.material.color.utilities.DynamicColor.contrastingTone(r2, r0)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            return r2
    }

    public static /* synthetic */ com.google.android.material.color.utilities.DynamicColor y(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.DynamicColor r0 = r0.secondaryFixedDim()
            return r0
    }

    public static /* synthetic */ java.lang.Double y0(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r0 = isMonochrome(r2)
            if (r0 == 0) goto L17
            boolean r2 = r2.isDark
            if (r2 == 0) goto L10
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
            goto L12
        L10:
            r0 = 4626322717216342016(0x4034000000000000, double:20.0)
        L12:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
        L17:
            r0 = 4635329916471083008(0x4054000000000000, double:80.0)
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ com.google.android.material.color.utilities.DynamicColor y1(com.google.android.material.color.utilities.MaterialDynamicColors r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.DynamicColor r0 = r0.inverseSurface()
            return r0
    }

    public static /* synthetic */ java.lang.Double z(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = isMonochrome(r2)
            if (r2 == 0) goto L9
            r0 = 4627730092099895296(0x4039000000000000, double:25.0)
            goto Lb
        L9:
            r0 = 4629137466983448576(0x403e000000000000, double:30.0)
        Lb:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ java.lang.Double z0(com.google.android.material.color.utilities.DynamicScheme r2) {
            boolean r2 = r2.isDark
            if (r2 == 0) goto La
            r0 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            goto Lf
        La:
            r0 = 4593311331947716280(0x3fbeb851eb851eb8, double:0.12)
        Lf:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    public static /* synthetic */ com.google.android.material.color.utilities.ToneDeltaConstraint z1(com.google.android.material.color.utilities.MaterialDynamicColors r3, com.google.android.material.color.utilities.DynamicScheme r4) {
            com.google.android.material.color.utilities.ToneDeltaConstraint r0 = new com.google.android.material.color.utilities.ToneDeltaConstraint
            com.google.android.material.color.utilities.DynamicColor r3 = r3.secondaryContainer()
            boolean r4 = r4.isDark
            if (r4 == 0) goto Ld
            com.google.android.material.color.utilities.TonePolarity r4 = com.google.android.material.color.utilities.TonePolarity.DARKER
            goto Lf
        Ld:
            com.google.android.material.color.utilities.TonePolarity r4 = com.google.android.material.color.utilities.TonePolarity.LIGHTER
        Lf:
            r1 = 4624633867356078080(0x402e000000000000, double:15.0)
            r0.<init>(r1, r3, r4)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor background() {
            r2 = this;
            com.google.android.material.color.utilities.h3 r0 = new com.google.android.material.color.utilities.h3
            r0.<init>()
            com.google.android.material.color.utilities.i3 r1 = new com.google.android.material.color.utilities.i3
            r1.<init>()
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor controlActivated() {
            r3 = this;
            com.google.android.material.color.utilities.d2 r0 = new com.google.android.material.color.utilities.d2
            r0.<init>()
            com.google.android.material.color.utilities.e2 r1 = new com.google.android.material.color.utilities.e2
            r1.<init>()
            r2 = 0
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor controlHighlight() {
            r9 = this;
            com.google.android.material.color.utilities.DynamicColor r0 = new com.google.android.material.color.utilities.DynamicColor
            com.google.android.material.color.utilities.y2 r1 = new com.google.android.material.color.utilities.y2
            r1.<init>()
            com.google.android.material.color.utilities.z2 r2 = new com.google.android.material.color.utilities.z2
            r2.<init>()
            com.google.android.material.color.utilities.a3 r3 = new com.google.android.material.color.utilities.a3
            r3.<init>()
            com.google.android.material.color.utilities.b3 r4 = new com.google.android.material.color.utilities.b3
            r4.<init>()
            com.google.android.material.color.utilities.d3 r6 = new com.google.android.material.color.utilities.d3
            r6.<init>()
            com.google.android.material.color.utilities.e3 r7 = new com.google.android.material.color.utilities.e3
            r7.<init>()
            r8 = 0
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor controlNormal() {
            r2 = this;
            com.google.android.material.color.utilities.b2 r0 = new com.google.android.material.color.utilities.b2
            r0.<init>()
            com.google.android.material.color.utilities.c2 r1 = new com.google.android.material.color.utilities.c2
            r1.<init>()
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor error() {
            r4 = this;
            com.google.android.material.color.utilities.s0 r0 = new com.google.android.material.color.utilities.s0
            r0.<init>()
            com.google.android.material.color.utilities.t0 r1 = new com.google.android.material.color.utilities.t0
            r1.<init>()
            com.google.android.material.color.utilities.q5 r2 = new com.google.android.material.color.utilities.q5
            r2.<init>(r4)
            com.google.android.material.color.utilities.u0 r3 = new com.google.android.material.color.utilities.u0
            r3.<init>(r4)
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1, r2, r3)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor errorContainer() {
            r3 = this;
            com.google.android.material.color.utilities.k1 r0 = new com.google.android.material.color.utilities.k1
            r0.<init>()
            com.google.android.material.color.utilities.l1 r1 = new com.google.android.material.color.utilities.l1
            r1.<init>()
            com.google.android.material.color.utilities.q5 r2 = new com.google.android.material.color.utilities.q5
            r2.<init>(r3)
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor highestSurface(@androidx.annotation.NonNull com.google.android.material.color.utilities.DynamicScheme r1) {
            r0 = this;
            boolean r1 = r1.isDark
            if (r1 == 0) goto L9
            com.google.android.material.color.utilities.DynamicColor r1 = r0.surfaceBright()
            return r1
        L9:
            com.google.android.material.color.utilities.DynamicColor r1 = r0.surfaceDim()
            return r1
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor inverseOnSurface() {
            r3 = this;
            com.google.android.material.color.utilities.e0 r0 = new com.google.android.material.color.utilities.e0
            r0.<init>()
            com.google.android.material.color.utilities.g0 r1 = new com.google.android.material.color.utilities.g0
            r1.<init>()
            com.google.android.material.color.utilities.h0 r2 = new com.google.android.material.color.utilities.h0
            r2.<init>(r3)
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor inversePrimary() {
            r3 = this;
            com.google.android.material.color.utilities.w3 r0 = new com.google.android.material.color.utilities.w3
            r0.<init>()
            com.google.android.material.color.utilities.x3 r1 = new com.google.android.material.color.utilities.x3
            r1.<init>()
            com.google.android.material.color.utilities.z3 r2 = new com.google.android.material.color.utilities.z3
            r2.<init>(r3)
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor inverseSurface() {
            r2 = this;
            com.google.android.material.color.utilities.d1 r0 = new com.google.android.material.color.utilities.d1
            r0.<init>()
            com.google.android.material.color.utilities.e1 r1 = new com.google.android.material.color.utilities.e1
            r1.<init>()
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor neutralPaletteKeyColor() {
            r2 = this;
            com.google.android.material.color.utilities.f0 r0 = new com.google.android.material.color.utilities.f0
            r0.<init>()
            com.google.android.material.color.utilities.q0 r1 = new com.google.android.material.color.utilities.q0
            r1.<init>()
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor neutralVariantPaletteKeyColor() {
            r2 = this;
            com.google.android.material.color.utilities.v4 r0 = new com.google.android.material.color.utilities.v4
            r0.<init>()
            com.google.android.material.color.utilities.w4 r1 = new com.google.android.material.color.utilities.w4
            r1.<init>()
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor onBackground() {
            r3 = this;
            com.google.android.material.color.utilities.l3 r0 = new com.google.android.material.color.utilities.l3
            r0.<init>()
            com.google.android.material.color.utilities.m3 r1 = new com.google.android.material.color.utilities.m3
            r1.<init>()
            com.google.android.material.color.utilities.o3 r2 = new com.google.android.material.color.utilities.o3
            r2.<init>(r3)
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor onError() {
            r3 = this;
            com.google.android.material.color.utilities.h4 r0 = new com.google.android.material.color.utilities.h4
            r0.<init>()
            com.google.android.material.color.utilities.i4 r1 = new com.google.android.material.color.utilities.i4
            r1.<init>()
            com.google.android.material.color.utilities.k4 r2 = new com.google.android.material.color.utilities.k4
            r2.<init>(r3)
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor onErrorContainer() {
            r3 = this;
            com.google.android.material.color.utilities.f1 r0 = new com.google.android.material.color.utilities.f1
            r0.<init>()
            com.google.android.material.color.utilities.g1 r1 = new com.google.android.material.color.utilities.g1
            r1.<init>()
            com.google.android.material.color.utilities.h1 r2 = new com.google.android.material.color.utilities.h1
            r2.<init>(r3)
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor onPrimary() {
            r3 = this;
            com.google.android.material.color.utilities.t3 r0 = new com.google.android.material.color.utilities.t3
            r0.<init>()
            com.google.android.material.color.utilities.u3 r1 = new com.google.android.material.color.utilities.u3
            r1.<init>()
            com.google.android.material.color.utilities.v3 r2 = new com.google.android.material.color.utilities.v3
            r2.<init>(r3)
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor onPrimaryContainer() {
            r4 = this;
            com.google.android.material.color.utilities.n4 r0 = new com.google.android.material.color.utilities.n4
            r0.<init>()
            com.google.android.material.color.utilities.o4 r1 = new com.google.android.material.color.utilities.o4
            r1.<init>(r4)
            com.google.android.material.color.utilities.p4 r2 = new com.google.android.material.color.utilities.p4
            r2.<init>(r4)
            r3 = 0
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1, r2, r3)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor onPrimaryFixed() {
            r3 = this;
            com.google.android.material.color.utilities.o0 r0 = new com.google.android.material.color.utilities.o0
            r0.<init>()
            com.google.android.material.color.utilities.p0 r1 = new com.google.android.material.color.utilities.p0
            r1.<init>()
            com.google.android.material.color.utilities.r0 r2 = new com.google.android.material.color.utilities.r0
            r2.<init>(r3)
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor onPrimaryFixedVariant() {
            r3 = this;
            com.google.android.material.color.utilities.c4 r0 = new com.google.android.material.color.utilities.c4
            r0.<init>()
            com.google.android.material.color.utilities.d4 r1 = new com.google.android.material.color.utilities.d4
            r1.<init>()
            com.google.android.material.color.utilities.e4 r2 = new com.google.android.material.color.utilities.e4
            r2.<init>(r3)
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor onSecondary() {
            r3 = this;
            com.google.android.material.color.utilities.k5 r0 = new com.google.android.material.color.utilities.k5
            r0.<init>()
            com.google.android.material.color.utilities.l5 r1 = new com.google.android.material.color.utilities.l5
            r1.<init>()
            com.google.android.material.color.utilities.m5 r2 = new com.google.android.material.color.utilities.m5
            r2.<init>(r3)
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor onSecondaryContainer() {
            r3 = this;
            com.google.android.material.color.utilities.l0 r0 = new com.google.android.material.color.utilities.l0
            r0.<init>()
            com.google.android.material.color.utilities.m0 r1 = new com.google.android.material.color.utilities.m0
            r1.<init>(r3)
            com.google.android.material.color.utilities.n0 r2 = new com.google.android.material.color.utilities.n0
            r2.<init>(r3)
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor onSecondaryFixed() {
            r3 = this;
            com.google.android.material.color.utilities.b0 r0 = new com.google.android.material.color.utilities.b0
            r0.<init>()
            com.google.android.material.color.utilities.c0 r1 = new com.google.android.material.color.utilities.c0
            r1.<init>()
            com.google.android.material.color.utilities.d0 r2 = new com.google.android.material.color.utilities.d0
            r2.<init>(r3)
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor onSecondaryFixedVariant() {
            r3 = this;
            com.google.android.material.color.utilities.u1 r0 = new com.google.android.material.color.utilities.u1
            r0.<init>()
            com.google.android.material.color.utilities.v1 r1 = new com.google.android.material.color.utilities.v1
            r1.<init>()
            com.google.android.material.color.utilities.w1 r2 = new com.google.android.material.color.utilities.w1
            r2.<init>(r3)
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor onSurface() {
            r3 = this;
            com.google.android.material.color.utilities.u4 r0 = new com.google.android.material.color.utilities.u4
            r0.<init>()
            com.google.android.material.color.utilities.f5 r1 = new com.google.android.material.color.utilities.f5
            r1.<init>()
            com.google.android.material.color.utilities.q5 r2 = new com.google.android.material.color.utilities.q5
            r2.<init>(r3)
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor onSurfaceVariant() {
            r3 = this;
            com.google.android.material.color.utilities.z0 r0 = new com.google.android.material.color.utilities.z0
            r0.<init>()
            com.google.android.material.color.utilities.a1 r1 = new com.google.android.material.color.utilities.a1
            r1.<init>()
            com.google.android.material.color.utilities.c1 r2 = new com.google.android.material.color.utilities.c1
            r2.<init>(r3)
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor onTertiary() {
            r3 = this;
            com.google.android.material.color.utilities.n3 r0 = new com.google.android.material.color.utilities.n3
            r0.<init>()
            com.google.android.material.color.utilities.y3 r1 = new com.google.android.material.color.utilities.y3
            r1.<init>()
            com.google.android.material.color.utilities.j4 r2 = new com.google.android.material.color.utilities.j4
            r2.<init>(r3)
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor onTertiaryContainer() {
            r3 = this;
            com.google.android.material.color.utilities.i0 r0 = new com.google.android.material.color.utilities.i0
            r0.<init>()
            com.google.android.material.color.utilities.j0 r1 = new com.google.android.material.color.utilities.j0
            r1.<init>(r3)
            com.google.android.material.color.utilities.k0 r2 = new com.google.android.material.color.utilities.k0
            r2.<init>(r3)
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor onTertiaryFixed() {
            r3 = this;
            com.google.android.material.color.utilities.t2 r0 = new com.google.android.material.color.utilities.t2
            r0.<init>()
            com.google.android.material.color.utilities.u2 r1 = new com.google.android.material.color.utilities.u2
            r1.<init>()
            com.google.android.material.color.utilities.v2 r2 = new com.google.android.material.color.utilities.v2
            r2.<init>(r3)
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor onTertiaryFixedVariant() {
            r3 = this;
            com.google.android.material.color.utilities.j2 r0 = new com.google.android.material.color.utilities.j2
            r0.<init>()
            com.google.android.material.color.utilities.k2 r1 = new com.google.android.material.color.utilities.k2
            r1.<init>()
            com.google.android.material.color.utilities.l2 r2 = new com.google.android.material.color.utilities.l2
            r2.<init>(r3)
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor outline() {
            r3 = this;
            com.google.android.material.color.utilities.x r0 = new com.google.android.material.color.utilities.x
            r0.<init>()
            com.google.android.material.color.utilities.y r1 = new com.google.android.material.color.utilities.y
            r1.<init>()
            com.google.android.material.color.utilities.q5 r2 = new com.google.android.material.color.utilities.q5
            r2.<init>(r3)
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor outlineVariant() {
            r3 = this;
            com.google.android.material.color.utilities.p3 r0 = new com.google.android.material.color.utilities.p3
            r0.<init>()
            com.google.android.material.color.utilities.q3 r1 = new com.google.android.material.color.utilities.q3
            r1.<init>()
            com.google.android.material.color.utilities.q5 r2 = new com.google.android.material.color.utilities.q5
            r2.<init>(r3)
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor primary() {
            r4 = this;
            com.google.android.material.color.utilities.p1 r0 = new com.google.android.material.color.utilities.p1
            r0.<init>()
            com.google.android.material.color.utilities.q1 r1 = new com.google.android.material.color.utilities.q1
            r1.<init>()
            com.google.android.material.color.utilities.q5 r2 = new com.google.android.material.color.utilities.q5
            r2.<init>(r4)
            com.google.android.material.color.utilities.r1 r3 = new com.google.android.material.color.utilities.r1
            r3.<init>(r4)
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1, r2, r3)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor primaryContainer() {
            r3 = this;
            com.google.android.material.color.utilities.f3 r0 = new com.google.android.material.color.utilities.f3
            r0.<init>()
            com.google.android.material.color.utilities.g3 r1 = new com.google.android.material.color.utilities.g3
            r1.<init>()
            com.google.android.material.color.utilities.q5 r2 = new com.google.android.material.color.utilities.q5
            r2.<init>(r3)
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor primaryFixed() {
            r3 = this;
            com.google.android.material.color.utilities.d5 r0 = new com.google.android.material.color.utilities.d5
            r0.<init>()
            com.google.android.material.color.utilities.e5 r1 = new com.google.android.material.color.utilities.e5
            r1.<init>()
            com.google.android.material.color.utilities.q5 r2 = new com.google.android.material.color.utilities.q5
            r2.<init>(r3)
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor primaryFixedDim() {
            r3 = this;
            com.google.android.material.color.utilities.g5 r0 = new com.google.android.material.color.utilities.g5
            r0.<init>()
            com.google.android.material.color.utilities.h5 r1 = new com.google.android.material.color.utilities.h5
            r1.<init>()
            com.google.android.material.color.utilities.q5 r2 = new com.google.android.material.color.utilities.q5
            r2.<init>(r3)
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor primaryPaletteKeyColor() {
            r2 = this;
            com.google.android.material.color.utilities.f2 r0 = new com.google.android.material.color.utilities.f2
            r0.<init>()
            com.google.android.material.color.utilities.h2 r1 = new com.google.android.material.color.utilities.h2
            r1.<init>()
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor scrim() {
            r2 = this;
            com.google.android.material.color.utilities.s1 r0 = new com.google.android.material.color.utilities.s1
            r0.<init>()
            com.google.android.material.color.utilities.t1 r1 = new com.google.android.material.color.utilities.t1
            r1.<init>()
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor secondary() {
            r4 = this;
            com.google.android.material.color.utilities.n5 r0 = new com.google.android.material.color.utilities.n5
            r0.<init>()
            com.google.android.material.color.utilities.o5 r1 = new com.google.android.material.color.utilities.o5
            r1.<init>()
            com.google.android.material.color.utilities.q5 r2 = new com.google.android.material.color.utilities.q5
            r2.<init>(r4)
            com.google.android.material.color.utilities.p5 r3 = new com.google.android.material.color.utilities.p5
            r3.<init>(r4)
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1, r2, r3)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor secondaryContainer() {
            r3 = this;
            com.google.android.material.color.utilities.q2 r0 = new com.google.android.material.color.utilities.q2
            r0.<init>()
            com.google.android.material.color.utilities.s2 r1 = new com.google.android.material.color.utilities.s2
            r1.<init>()
            com.google.android.material.color.utilities.q5 r2 = new com.google.android.material.color.utilities.q5
            r2.<init>(r3)
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor secondaryFixed() {
            r3 = this;
            com.google.android.material.color.utilities.a4 r0 = new com.google.android.material.color.utilities.a4
            r0.<init>()
            com.google.android.material.color.utilities.b4 r1 = new com.google.android.material.color.utilities.b4
            r1.<init>()
            com.google.android.material.color.utilities.q5 r2 = new com.google.android.material.color.utilities.q5
            r2.<init>(r3)
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor secondaryFixedDim() {
            r3 = this;
            com.google.android.material.color.utilities.q4 r0 = new com.google.android.material.color.utilities.q4
            r0.<init>()
            com.google.android.material.color.utilities.r4 r1 = new com.google.android.material.color.utilities.r4
            r1.<init>()
            com.google.android.material.color.utilities.q5 r2 = new com.google.android.material.color.utilities.q5
            r2.<init>(r3)
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor secondaryPaletteKeyColor() {
            r2 = this;
            com.google.android.material.color.utilities.m2 r0 = new com.google.android.material.color.utilities.m2
            r0.<init>()
            com.google.android.material.color.utilities.n2 r1 = new com.google.android.material.color.utilities.n2
            r1.<init>()
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor shadow() {
            r2 = this;
            com.google.android.material.color.utilities.z4 r0 = new com.google.android.material.color.utilities.z4
            r0.<init>()
            com.google.android.material.color.utilities.a5 r1 = new com.google.android.material.color.utilities.a5
            r1.<init>()
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor surface() {
            r2 = this;
            com.google.android.material.color.utilities.u r0 = new com.google.android.material.color.utilities.u
            r0.<init>()
            com.google.android.material.color.utilities.g2 r1 = new com.google.android.material.color.utilities.g2
            r1.<init>()
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor surfaceBright() {
            r2 = this;
            com.google.android.material.color.utilities.r3 r0 = new com.google.android.material.color.utilities.r3
            r0.<init>()
            com.google.android.material.color.utilities.s3 r1 = new com.google.android.material.color.utilities.s3
            r1.<init>()
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor surfaceContainer() {
            r2 = this;
            com.google.android.material.color.utilities.x0 r0 = new com.google.android.material.color.utilities.x0
            r0.<init>()
            com.google.android.material.color.utilities.y0 r1 = new com.google.android.material.color.utilities.y0
            r1.<init>()
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor surfaceContainerHigh() {
            r2 = this;
            com.google.android.material.color.utilities.j3 r0 = new com.google.android.material.color.utilities.j3
            r0.<init>()
            com.google.android.material.color.utilities.k3 r1 = new com.google.android.material.color.utilities.k3
            r1.<init>()
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor surfaceContainerHighest() {
            r2 = this;
            com.google.android.material.color.utilities.b5 r0 = new com.google.android.material.color.utilities.b5
            r0.<init>()
            com.google.android.material.color.utilities.c5 r1 = new com.google.android.material.color.utilities.c5
            r1.<init>()
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor surfaceContainerLow() {
            r2 = this;
            com.google.android.material.color.utilities.o2 r0 = new com.google.android.material.color.utilities.o2
            r0.<init>()
            com.google.android.material.color.utilities.p2 r1 = new com.google.android.material.color.utilities.p2
            r1.<init>()
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor surfaceContainerLowest() {
            r2 = this;
            com.google.android.material.color.utilities.v r0 = new com.google.android.material.color.utilities.v
            r0.<init>()
            com.google.android.material.color.utilities.w r1 = new com.google.android.material.color.utilities.w
            r1.<init>()
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor surfaceDim() {
            r2 = this;
            com.google.android.material.color.utilities.b1 r0 = new com.google.android.material.color.utilities.b1
            r0.<init>()
            com.google.android.material.color.utilities.m1 r1 = new com.google.android.material.color.utilities.m1
            r1.<init>()
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor surfaceTint() {
            r2 = this;
            com.google.android.material.color.utilities.z r0 = new com.google.android.material.color.utilities.z
            r0.<init>()
            com.google.android.material.color.utilities.a0 r1 = new com.google.android.material.color.utilities.a0
            r1.<init>()
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor surfaceVariant() {
            r2 = this;
            com.google.android.material.color.utilities.s4 r0 = new com.google.android.material.color.utilities.s4
            r0.<init>()
            com.google.android.material.color.utilities.t4 r1 = new com.google.android.material.color.utilities.t4
            r1.<init>()
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor tertiary() {
            r4 = this;
            com.google.android.material.color.utilities.y1 r0 = new com.google.android.material.color.utilities.y1
            r0.<init>()
            com.google.android.material.color.utilities.z1 r1 = new com.google.android.material.color.utilities.z1
            r1.<init>()
            com.google.android.material.color.utilities.q5 r2 = new com.google.android.material.color.utilities.q5
            r2.<init>(r4)
            com.google.android.material.color.utilities.a2 r3 = new com.google.android.material.color.utilities.a2
            r3.<init>(r4)
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1, r2, r3)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor tertiaryContainer() {
            r3 = this;
            com.google.android.material.color.utilities.i5 r0 = new com.google.android.material.color.utilities.i5
            r0.<init>()
            com.google.android.material.color.utilities.j5 r1 = new com.google.android.material.color.utilities.j5
            r1.<init>()
            com.google.android.material.color.utilities.q5 r2 = new com.google.android.material.color.utilities.q5
            r2.<init>(r3)
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor tertiaryFixed() {
            r3 = this;
            com.google.android.material.color.utilities.n1 r0 = new com.google.android.material.color.utilities.n1
            r0.<init>()
            com.google.android.material.color.utilities.o1 r1 = new com.google.android.material.color.utilities.o1
            r1.<init>()
            com.google.android.material.color.utilities.q5 r2 = new com.google.android.material.color.utilities.q5
            r2.<init>(r3)
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor tertiaryFixedDim() {
            r3 = this;
            com.google.android.material.color.utilities.f4 r0 = new com.google.android.material.color.utilities.f4
            r0.<init>()
            com.google.android.material.color.utilities.g4 r1 = new com.google.android.material.color.utilities.g4
            r1.<init>()
            com.google.android.material.color.utilities.q5 r2 = new com.google.android.material.color.utilities.q5
            r2.<init>(r3)
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor tertiaryPaletteKeyColor() {
            r2 = this;
            com.google.android.material.color.utilities.w2 r0 = new com.google.android.material.color.utilities.w2
            r0.<init>()
            com.google.android.material.color.utilities.x2 r1 = new com.google.android.material.color.utilities.x2
            r1.<init>()
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor textHintInverse() {
            r2 = this;
            com.google.android.material.color.utilities.x4 r0 = new com.google.android.material.color.utilities.x4
            r0.<init>()
            com.google.android.material.color.utilities.y4 r1 = new com.google.android.material.color.utilities.y4
            r1.<init>()
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor textPrimaryInverse() {
            r2 = this;
            com.google.android.material.color.utilities.v0 r0 = new com.google.android.material.color.utilities.v0
            r0.<init>()
            com.google.android.material.color.utilities.w0 r1 = new com.google.android.material.color.utilities.w0
            r1.<init>()
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor textPrimaryInverseDisableOnly() {
            r2 = this;
            com.google.android.material.color.utilities.l4 r0 = new com.google.android.material.color.utilities.l4
            r0.<init>()
            com.google.android.material.color.utilities.m4 r1 = new com.google.android.material.color.utilities.m4
            r1.<init>()
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor textSecondaryAndTertiaryInverse() {
            r2 = this;
            com.google.android.material.color.utilities.i1 r0 = new com.google.android.material.color.utilities.i1
            r0.<init>()
            com.google.android.material.color.utilities.j1 r1 = new com.google.android.material.color.utilities.j1
            r1.<init>()
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.utilities.DynamicColor textSecondaryAndTertiaryInverseDisabled() {
            r2 = this;
            com.google.android.material.color.utilities.r2 r0 = new com.google.android.material.color.utilities.r2
            r0.<init>()
            com.google.android.material.color.utilities.c3 r1 = new com.google.android.material.color.utilities.c3
            r1.<init>()
            com.google.android.material.color.utilities.DynamicColor r0 = com.google.android.material.color.utilities.DynamicColor.fromPalette(r0, r1)
            return r0
    }
}
