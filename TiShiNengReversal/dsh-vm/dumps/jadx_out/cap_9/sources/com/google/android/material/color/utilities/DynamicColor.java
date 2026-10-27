package com.google.android.material.color.utilities;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class DynamicColor {
    public final java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.DynamicColor> background;
    public final java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> chroma;
    private final java.util.HashMap<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.Hct> hctCache;
    public final java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> hue;
    public final java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> opacity;
    public final java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> tone;
    public final java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.ToneDeltaConstraint> toneDeltaConstraint;
    public final java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> toneMaxContrast;
    public final java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> toneMinContrast;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.android.material.color.utilities.DynamicColor$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$material$color$utilities$TonePolarity = null;

        static {
                com.google.android.material.color.utilities.TonePolarity[] r0 = com.google.android.material.color.utilities.TonePolarity.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.android.material.color.utilities.DynamicColor.AnonymousClass1.$SwitchMap$com$google$android$material$color$utilities$TonePolarity = r0
                com.google.android.material.color.utilities.TonePolarity r1 = com.google.android.material.color.utilities.TonePolarity.DARKER     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.android.material.color.utilities.DynamicColor.AnonymousClass1.$SwitchMap$com$google$android$material$color$utilities$TonePolarity     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.android.material.color.utilities.TonePolarity r1 = com.google.android.material.color.utilities.TonePolarity.LIGHTER     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.android.material.color.utilities.DynamicColor.AnonymousClass1.$SwitchMap$com$google$android$material$color$utilities$TonePolarity     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.android.material.color.utilities.TonePolarity r1 = com.google.android.material.color.utilities.TonePolarity.NO_PREFERENCE     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    public DynamicColor(java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r2, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r3, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r4, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r5, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.DynamicColor> r6, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r7, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r8, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.ToneDeltaConstraint> r9) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.hctCache = r0
            r1.hue = r2
            r1.chroma = r3
            r1.tone = r4
            r1.opacity = r5
            r1.background = r6
            r1.toneMinContrast = r7
            r1.toneMaxContrast = r8
            r1.toneDeltaConstraint = r9
            return
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette a(int r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.TonalPalette r0 = com.google.android.material.color.utilities.TonalPalette.fromInt(r0)
            return r0
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette b(int r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.TonalPalette r0 = com.google.android.material.color.utilities.TonalPalette.fromInt(r0)
            return r0
    }

    public static /* synthetic */ com.google.android.material.color.utilities.DynamicColor c(com.google.android.material.color.utilities.DynamicColor r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            return r0
    }

    public static double calculateDynamicTone(com.google.android.material.color.utilities.DynamicScheme r20, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r21, java.util.function.Function<com.google.android.material.color.utilities.DynamicColor, java.lang.Double> r22, java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> r23, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.DynamicColor> r24, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.ToneDeltaConstraint> r25, java.util.function.Function<java.lang.Double, java.lang.Double> r26, java.util.function.Function<java.lang.Double, java.lang.Double> r27) {
            r4 = r20
            r0 = r24
            r1 = r26
            r2 = r21
            r3 = r27
            java.lang.Object r2 = com.bytedance.msdk.core.ae.a.a(r2, r4)
            java.lang.Double r2 = (java.lang.Double) r2
            double r5 = r2.doubleValue()
            if (r0 != 0) goto L18
            r0 = 0
            goto L1e
        L18:
            java.lang.Object r0 = com.bytedance.msdk.core.ae.a.a(r0, r4)
            com.google.android.material.color.utilities.DynamicColor r0 = (com.google.android.material.color.utilities.DynamicColor) r0
        L1e:
            if (r0 != 0) goto L21
            return r5
        L21:
            java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r2 = r0.tone
            java.lang.Object r2 = com.bytedance.msdk.core.ae.a.a(r2, r4)
            java.lang.Double r2 = (java.lang.Double) r2
            double r7 = r2.doubleValue()
            double r7 = com.google.android.material.color.utilities.Contrast.ratioOfTones(r5, r7)
            r2 = r22
            java.lang.Object r9 = com.bytedance.msdk.core.ae.a.a(r2, r0)
            java.lang.Double r9 = (java.lang.Double) r9
            double r10 = r9.doubleValue()
            java.lang.Double r12 = java.lang.Double.valueOf(r7)
            r13 = r23
            java.lang.Object r9 = com.google.android.material.color.utilities.a.a(r13, r12, r9)
            java.lang.Double r9 = (java.lang.Double) r9
            double r12 = r9.doubleValue()
            double r18 = com.google.android.material.color.utilities.Contrast.ratioOfTones(r10, r12)
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r1 != 0) goto L56
            goto L6f
        L56:
            java.lang.Double r9 = java.lang.Double.valueOf(r7)
            java.lang.Object r9 = com.bytedance.msdk.core.ae.a.a(r1, r9)
            if (r9 != 0) goto L61
            goto L6f
        L61:
            java.lang.Double r9 = java.lang.Double.valueOf(r7)
            java.lang.Object r1 = com.bytedance.msdk.core.ae.a.a(r1, r9)
            java.lang.Double r1 = (java.lang.Double) r1
            double r14 = r1.doubleValue()
        L6f:
            r16 = 4626604192193052672(0x4035000000000000, double:21.0)
            if (r3 != 0) goto L74
            goto L8d
        L74:
            java.lang.Double r1 = java.lang.Double.valueOf(r7)
            java.lang.Object r1 = com.bytedance.msdk.core.ae.a.a(r3, r1)
            if (r1 != 0) goto L7f
            goto L8d
        L7f:
            java.lang.Double r1 = java.lang.Double.valueOf(r7)
            java.lang.Object r1 = com.bytedance.msdk.core.ae.a.a(r3, r1)
            java.lang.Double r1 = (java.lang.Double) r1
            double r16 = r1.doubleValue()
        L8d:
            double r7 = com.google.android.material.color.utilities.MathUtils.clampDouble(r14, r16, r18)
            int r1 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r1 != 0) goto L96
            goto L9a
        L96:
            double r12 = contrastingTone(r10, r7)
        L9a:
            java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.DynamicColor> r0 = r0.background
            if (r0 == 0) goto Lac
            java.lang.Object r0 = com.bytedance.msdk.core.ae.a.a(r0, r4)
            if (r0 != 0) goto La5
            goto Lac
        La5:
            r0 = r5
            r6 = r2
            r2 = r0
            r5 = r25
            r0 = r12
            goto Lb1
        Lac:
            double r12 = enableLightForeground(r12)
            goto La5
        Lb1:
            double r0 = ensureToneDelta(r0, r2, r4, r5, r6)
            return r0
    }

    public static double contrastingTone(double r11, double r13) {
            double r0 = com.google.android.material.color.utilities.Contrast.lighterUnsafe(r11, r13)
            double r2 = com.google.android.material.color.utilities.Contrast.darkerUnsafe(r11, r13)
            double r4 = com.google.android.material.color.utilities.Contrast.ratioOfTones(r0, r11)
            double r6 = com.google.android.material.color.utilities.Contrast.ratioOfTones(r2, r11)
            boolean r11 = tonePrefersLightForeground(r11)
            if (r11 == 0) goto L3b
            double r11 = r4 - r6
            double r11 = java.lang.Math.abs(r11)
            r8 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r10 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r10 >= 0) goto L2f
            int r11 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r11 >= 0) goto L2f
            int r11 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r11 >= 0) goto L2f
            r11 = 1
            goto L30
        L2f:
            r11 = 0
        L30:
            int r12 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r12 >= 0) goto L44
            int r12 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r12 >= 0) goto L44
            if (r11 == 0) goto L45
            goto L44
        L3b:
            int r11 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r11 >= 0) goto L45
            int r11 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r11 < 0) goto L44
            goto L45
        L44:
            return r0
        L45:
            return r2
    }

    public static /* synthetic */ java.lang.Double d(com.google.android.material.color.utilities.DynamicScheme r0, com.google.android.material.color.utilities.DynamicColor r1) {
            double r0 = r1.getTone(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
    }

    public static /* synthetic */ java.lang.Double e(com.google.android.material.color.utilities.Hct r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            double r0 = r0.getTone()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
    }

    public static double enableLightForeground(double r1) {
            boolean r0 = tonePrefersLightForeground(r1)
            if (r0 == 0) goto L11
            boolean r0 = toneAllowsLightForeground(r1)
            if (r0 != 0) goto L11
            r1 = 4632092954238910464(0x4048800000000000, double:49.0)
        L11:
            return r1
    }

    static double ensureToneDelta(double r8, double r10, com.google.android.material.color.utilities.DynamicScheme r12, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.ToneDeltaConstraint> r13, java.util.function.Function<com.google.android.material.color.utilities.DynamicColor, java.lang.Double> r14) {
            if (r13 != 0) goto L4
            r13 = 0
            goto La
        L4:
            java.lang.Object r13 = com.bytedance.msdk.core.ae.a.a(r13, r12)
            com.google.android.material.color.utilities.ToneDeltaConstraint r13 = (com.google.android.material.color.utilities.ToneDeltaConstraint) r13
        La:
            if (r13 != 0) goto Ld
            goto L39
        Ld:
            double r0 = r13.delta
            com.google.android.material.color.utilities.DynamicColor r2 = r13.keepAway
            java.lang.Object r14 = com.bytedance.msdk.core.ae.a.a(r14, r2)
            java.lang.Double r14 = (java.lang.Double) r14
            double r2 = r14.doubleValue()
            double r4 = r8 - r2
            double r4 = java.lang.Math.abs(r4)
            int r14 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r14 < 0) goto L26
            goto L39
        L26:
            int[] r14 = com.google.android.material.color.utilities.DynamicColor.AnonymousClass1.$SwitchMap$com$google$android$material$color$utilities$TonePolarity
            com.google.android.material.color.utilities.TonePolarity r6 = r13.keepAwayPolarity
            int r6 = r6.ordinal()
            r14 = r14[r6]
            r6 = 1
            if (r14 == r6) goto L72
            r7 = 2
            if (r14 == r7) goto L66
            r2 = 3
            if (r14 == r2) goto L3a
        L39:
            return r8
        L3a:
            com.google.android.material.color.utilities.DynamicColor r13 = r13.keepAway
            java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r13 = r13.tone
            java.lang.Object r12 = com.bytedance.msdk.core.ae.a.a(r13, r12)
            java.lang.Double r12 = (java.lang.Double) r12
            double r12 = r12.doubleValue()
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 <= 0) goto L4d
            goto L4e
        L4d:
            r6 = 0
        L4e:
            double r4 = r4 - r0
            double r10 = java.lang.Math.abs(r4)
            if (r6 == 0) goto L5e
            double r12 = r8 + r10
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            int r14 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r14 > 0) goto L64
            goto L62
        L5e:
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 >= 0) goto L64
        L62:
            double r8 = r8 + r10
            return r8
        L64:
            double r8 = r8 - r10
            return r8
        L66:
            r8 = r2
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r4 = r8 - r0
            r0 = 0
            double r8 = com.google.android.material.color.utilities.MathUtils.clampDouble(r0, r2, r4)
            return r8
        L72:
            r8 = r2
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r4 = r8 + r0
            r0 = 0
            double r8 = com.google.android.material.color.utilities.MathUtils.clampDouble(r0, r2, r4)
            return r8
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette f(com.google.android.material.color.utilities.TonalPalette r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            return r0
    }

    public static com.google.android.material.color.utilities.DynamicColor fromArgb(int r2) {
            com.google.android.material.color.utilities.Hct r0 = com.google.android.material.color.utilities.Hct.fromInt(r2)
            com.google.android.material.color.utilities.TonalPalette r2 = com.google.android.material.color.utilities.TonalPalette.fromInt(r2)
            com.google.android.material.color.utilities.e r1 = new com.google.android.material.color.utilities.e
            r1.<init>(r2)
            com.google.android.material.color.utilities.f r2 = new com.google.android.material.color.utilities.f
            r2.<init>(r0)
            com.google.android.material.color.utilities.DynamicColor r2 = fromPalette(r1, r2)
            return r2
    }

    public static com.google.android.material.color.utilities.DynamicColor fromArgb(int r1, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r2) {
            com.google.android.material.color.utilities.m r0 = new com.google.android.material.color.utilities.m
            r0.<init>(r1)
            com.google.android.material.color.utilities.DynamicColor r1 = fromPalette(r0, r2)
            return r1
    }

    public static com.google.android.material.color.utilities.DynamicColor fromArgb(int r1, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r2, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.DynamicColor> r3) {
            com.google.android.material.color.utilities.l r0 = new com.google.android.material.color.utilities.l
            r0.<init>(r1)
            com.google.android.material.color.utilities.DynamicColor r1 = fromPalette(r0, r2, r3)
            return r1
    }

    public static com.google.android.material.color.utilities.DynamicColor fromArgb(int r1, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r2, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.DynamicColor> r3, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.ToneDeltaConstraint> r4) {
            com.google.android.material.color.utilities.s r0 = new com.google.android.material.color.utilities.s
            r0.<init>(r1)
            com.google.android.material.color.utilities.DynamicColor r1 = fromPalette(r0, r2, r3, r4)
            return r1
    }

    public static com.google.android.material.color.utilities.DynamicColor fromPalette(java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.TonalPalette> r1, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r2) {
            r0 = 0
            com.google.android.material.color.utilities.DynamicColor r1 = fromPalette(r1, r2, r0, r0)
            return r1
    }

    public static com.google.android.material.color.utilities.DynamicColor fromPalette(java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.TonalPalette> r1, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r2, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.DynamicColor> r3) {
            r0 = 0
            com.google.android.material.color.utilities.DynamicColor r1 = fromPalette(r1, r2, r3, r0)
            return r1
    }

    public static com.google.android.material.color.utilities.DynamicColor fromPalette(java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.TonalPalette> r9, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r10, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.DynamicColor> r11, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.ToneDeltaConstraint> r12) {
            com.google.android.material.color.utilities.DynamicColor r0 = new com.google.android.material.color.utilities.DynamicColor
            com.google.android.material.color.utilities.t r1 = new com.google.android.material.color.utilities.t
            r1.<init>(r9)
            com.google.android.material.color.utilities.b r2 = new com.google.android.material.color.utilities.b
            r2.<init>(r9)
            com.google.android.material.color.utilities.c r6 = new com.google.android.material.color.utilities.c
            r6.<init>(r10, r11, r12)
            com.google.android.material.color.utilities.d r7 = new com.google.android.material.color.utilities.d
            r7.<init>(r10, r11, r12)
            r4 = 0
            r3 = r10
            r5 = r11
            r8 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    public static /* synthetic */ java.lang.Double g(double r0, java.lang.Double r2) {
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
    }

    public static /* synthetic */ java.lang.Double h(com.google.android.material.color.utilities.DynamicScheme r0, com.google.android.material.color.utilities.DynamicColor r1) {
            java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r1 = r1.toneMaxContrast
            java.lang.Object r0 = com.bytedance.msdk.core.ae.a.a(r1, r0)
            java.lang.Double r0 = (java.lang.Double) r0
            return r0
    }

    public static /* synthetic */ java.lang.Double i(java.util.function.Function r6, com.google.android.material.color.utilities.DynamicScheme r7, java.util.function.Function r8, java.lang.Double r9, java.lang.Double r10) {
            java.lang.Object r6 = com.bytedance.msdk.core.ae.a.a(r6, r7)
            java.lang.Double r6 = (java.lang.Double) r6
            double r0 = r6.doubleValue()
            double r2 = r9.doubleValue()
            r4 = 4619567317775286272(0x401c000000000000, double:7.0)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L1f
            double r6 = r10.doubleValue()
            r8 = 4616752568008179712(0x4012000000000000, double:4.5)
            double r0 = contrastingTone(r6, r8)
            goto L5e
        L1f:
            double r2 = r9.doubleValue()
            r4 = 4613937818241073152(0x4008000000000000, double:3.0)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L32
            double r6 = r10.doubleValue()
            double r0 = contrastingTone(r6, r4)
            goto L5e
        L32:
            if (r8 == 0) goto L5e
            java.lang.Object r6 = com.bytedance.msdk.core.ae.a.a(r8, r7)
            if (r6 == 0) goto L5e
            java.lang.Object r6 = com.bytedance.msdk.core.ae.a.a(r8, r7)
            com.google.android.material.color.utilities.DynamicColor r6 = (com.google.android.material.color.utilities.DynamicColor) r6
            java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.DynamicColor> r6 = r6.background
            if (r6 == 0) goto L5e
            java.lang.Object r6 = com.bytedance.msdk.core.ae.a.a(r8, r7)
            com.google.android.material.color.utilities.DynamicColor r6 = (com.google.android.material.color.utilities.DynamicColor) r6
            java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.DynamicColor> r6 = r6.background
            java.lang.Object r6 = com.bytedance.msdk.core.ae.a.a(r6, r7)
            if (r6 == 0) goto L5e
            double r6 = r10.doubleValue()
            double r8 = r9.doubleValue()
            double r0 = contrastingTone(r6, r8)
        L5e:
            java.lang.Double r6 = java.lang.Double.valueOf(r0)
            return r6
    }

    public static /* synthetic */ java.lang.Double j(java.util.function.Function r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            java.lang.Object r0 = com.bytedance.msdk.core.ae.a.a(r0, r1)
            com.google.android.material.color.utilities.TonalPalette r0 = (com.google.android.material.color.utilities.TonalPalette) r0
            double r0 = r0.getChroma()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
    }

    public static /* synthetic */ java.lang.Double k(java.util.function.Function r3, com.google.android.material.color.utilities.DynamicScheme r4, java.lang.Double r5, java.lang.Double r6) {
            r0 = 4619567317775286272(0x401c000000000000, double:7.0)
            if (r3 == 0) goto L2f
            java.lang.Object r2 = com.bytedance.msdk.core.ae.a.a(r3, r4)
            if (r2 == 0) goto L2f
            java.lang.Object r2 = com.bytedance.msdk.core.ae.a.a(r3, r4)
            com.google.android.material.color.utilities.DynamicColor r2 = (com.google.android.material.color.utilities.DynamicColor) r2
            java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.DynamicColor> r2 = r2.background
            if (r2 == 0) goto L2f
            java.lang.Object r3 = com.bytedance.msdk.core.ae.a.a(r3, r4)
            com.google.android.material.color.utilities.DynamicColor r3 = (com.google.android.material.color.utilities.DynamicColor) r3
            java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.DynamicColor> r3 = r3.background
            java.lang.Object r3 = com.bytedance.msdk.core.ae.a.a(r3, r4)
            if (r3 == 0) goto L2f
            double r3 = r6.doubleValue()
            double r3 = contrastingTone(r3, r0)
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            return r3
        L2f:
            double r3 = r6.doubleValue()
            double r5 = r5.doubleValue()
            double r5 = java.lang.Math.max(r0, r5)
            double r3 = contrastingTone(r3, r5)
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            return r3
    }

    public static /* synthetic */ com.google.android.material.color.utilities.TonalPalette l(int r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            com.google.android.material.color.utilities.TonalPalette r0 = com.google.android.material.color.utilities.TonalPalette.fromInt(r0)
            return r0
    }

    public static /* synthetic */ java.lang.Double m(com.google.android.material.color.utilities.DynamicScheme r0, com.google.android.material.color.utilities.DynamicColor r1) {
            java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r1 = r1.toneMinContrast
            java.lang.Object r0 = com.bytedance.msdk.core.ae.a.a(r1, r0)
            java.lang.Double r0 = (java.lang.Double) r0
            return r0
    }

    public static /* synthetic */ java.lang.Double n(double r0, java.lang.Double r2) {
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
    }

    public static /* synthetic */ java.lang.Double o(java.util.function.Function r0, com.google.android.material.color.utilities.DynamicScheme r1) {
            java.lang.Object r0 = com.bytedance.msdk.core.ae.a.a(r0, r1)
            com.google.android.material.color.utilities.TonalPalette r0 = (com.google.android.material.color.utilities.TonalPalette) r0
            double r0 = r0.getHue()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
    }

    public static /* synthetic */ java.lang.Double p(java.util.function.Function r0, java.util.function.Function r1, java.util.function.Function r2, com.google.android.material.color.utilities.DynamicScheme r3) {
            double r0 = toneMaxContrastDefault(r0, r1, r3, r2)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
    }

    public static /* synthetic */ java.lang.Double q(java.util.function.Function r0, java.util.function.Function r1, java.util.function.Function r2, com.google.android.material.color.utilities.DynamicScheme r3) {
            double r0 = toneMinContrastDefault(r0, r1, r3, r2)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
    }

    public static /* synthetic */ java.lang.Double r(java.lang.Double r0) {
            return r0
    }

    public static /* synthetic */ java.lang.Double s(double r0, java.lang.Double r2, java.lang.Double r3) {
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
    }

    public static boolean toneAllowsLightForeground(double r3) {
            long r3 = java.lang.Math.round(r3)
            r0 = 49
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 > 0) goto Lc
            r3 = 1
            return r3
        Lc:
            r3 = 0
            return r3
    }

    public static double toneMaxContrastDefault(java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r8, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.DynamicColor> r9, com.google.android.material.color.utilities.DynamicScheme r10, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.ToneDeltaConstraint> r11) {
            com.google.android.material.color.utilities.g r2 = new com.google.android.material.color.utilities.g
            r2.<init>(r10)
            com.google.android.material.color.utilities.h r3 = new com.google.android.material.color.utilities.h
            r3.<init>(r9, r10)
            r6 = 0
            r7 = 0
            r1 = r8
            r4 = r9
            r0 = r10
            r5 = r11
            double r8 = calculateDynamicTone(r0, r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    public static double toneMinContrastDefault(java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r8, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.DynamicColor> r9, com.google.android.material.color.utilities.DynamicScheme r10, java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.ToneDeltaConstraint> r11) {
            com.google.android.material.color.utilities.i r2 = new com.google.android.material.color.utilities.i
            r2.<init>(r10)
            com.google.android.material.color.utilities.j r3 = new com.google.android.material.color.utilities.j
            r3.<init>(r8, r10, r9)
            com.google.android.material.color.utilities.k r7 = new com.google.android.material.color.utilities.k
            r7.<init>()
            r6 = 0
            r1 = r8
            r4 = r9
            r0 = r10
            r5 = r11
            double r8 = calculateDynamicTone(r0, r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    public static boolean tonePrefersLightForeground(double r3) {
            long r3 = java.lang.Math.round(r3)
            r0 = 60
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 >= 0) goto Lc
            r3 = 1
            return r3
        Lc:
            r3 = 0
            return r3
    }

    public int getArgb(com.google.android.material.color.utilities.DynamicScheme r6) {
            r5 = this;
            com.google.android.material.color.utilities.Hct r0 = r5.getHct(r6)
            int r0 = r0.toInt()
            java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r1 = r5.opacity
            if (r1 != 0) goto Ld
            return r0
        Ld:
            java.lang.Object r6 = com.bytedance.msdk.core.ae.a.a(r1, r6)
            java.lang.Double r6 = (java.lang.Double) r6
            double r1 = r6.doubleValue()
            r3 = 4643176031446892544(0x406fe00000000000, double:255.0)
            double r1 = r1 * r3
            long r1 = java.lang.Math.round(r1)
            int r6 = (int) r1
            r1 = 0
            r2 = 255(0xff, float:3.57E-43)
            int r6 = com.google.android.material.color.utilities.MathUtils.clampInt(r1, r2, r6)
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r0 & r1
            int r6 = r6 << 24
            r6 = r6 | r0
            return r6
    }

    public com.google.android.material.color.utilities.Hct getHct(com.google.android.material.color.utilities.DynamicScheme r8) {
            r7 = this;
            java.util.HashMap<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.Hct> r0 = r7.hctCache
            java.lang.Object r0 = r0.get(r8)
            com.google.android.material.color.utilities.Hct r0 = (com.google.android.material.color.utilities.Hct) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r0 = r7.hue
            java.lang.Object r0 = com.bytedance.msdk.core.ae.a.a(r0, r8)
            java.lang.Double r0 = (java.lang.Double) r0
            double r1 = r0.doubleValue()
            java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r0 = r7.chroma
            java.lang.Object r0 = com.bytedance.msdk.core.ae.a.a(r0, r8)
            java.lang.Double r0 = (java.lang.Double) r0
            double r3 = r0.doubleValue()
            double r5 = r7.getTone(r8)
            com.google.android.material.color.utilities.Hct r0 = com.google.android.material.color.utilities.Hct.from(r1, r3, r5)
            java.util.HashMap<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.Hct> r1 = r7.hctCache
            int r1 = r1.size()
            r2 = 4
            if (r1 <= r2) goto L39
            java.util.HashMap<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.Hct> r1 = r7.hctCache
            r1.clear()
        L39:
            java.util.HashMap<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.Hct> r1 = r7.hctCache
            r1.put(r8, r0)
            return r0
    }

    public double getTone(com.google.android.material.color.utilities.DynamicScheme r15) {
            r14 = this;
            r0 = r15
            java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r1 = r14.tone
            java.lang.Object r1 = com.bytedance.msdk.core.ae.a.a(r1, r15)
            java.lang.Double r1 = (java.lang.Double) r1
            double r1 = r1.doubleValue()
            double r3 = r0.contrastLevel
            r5 = 0
            r6 = 1
            r7 = 0
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 >= 0) goto L19
            r9 = 1
            goto L1a
        L19:
            r9 = 0
        L1a:
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L46
            java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r1 = r14.tone
            java.lang.Object r1 = com.bytedance.msdk.core.ae.a.a(r1, r15)
            java.lang.Double r1 = (java.lang.Double) r1
            double r1 = r1.doubleValue()
            if (r9 == 0) goto L35
            java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r3 = r14.toneMinContrast
        L2e:
            java.lang.Object r3 = com.bytedance.msdk.core.ae.a.a(r3, r15)
            java.lang.Double r3 = (java.lang.Double) r3
            goto L38
        L35:
            java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r3 = r14.toneMaxContrast
            goto L2e
        L38:
            double r3 = r3.doubleValue()
            double r3 = r3 - r1
            double r7 = r0.contrastLevel
            double r7 = java.lang.Math.abs(r7)
            double r3 = r3 * r7
            double r1 = r1 + r3
        L46:
            java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.DynamicColor> r3 = r14.background
            if (r3 != 0) goto L4c
            r3 = 0
            goto L52
        L4c:
            java.lang.Object r3 = com.bytedance.msdk.core.ae.a.a(r3, r15)
            com.google.android.material.color.utilities.DynamicColor r3 = (com.google.android.material.color.utilities.DynamicColor) r3
        L52:
            r10 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r3 == 0) goto Lc9
            java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.DynamicColor> r4 = r3.background
            if (r4 == 0) goto L61
            java.lang.Object r4 = com.bytedance.msdk.core.ae.a.a(r4, r15)
            if (r4 == 0) goto L61
            r5 = 1
        L61:
            java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r4 = r14.tone
            java.lang.Object r4 = com.bytedance.msdk.core.ae.a.a(r4, r15)
            java.lang.Double r4 = (java.lang.Double) r4
            double r12 = r4.doubleValue()
            java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r4 = r3.tone
            java.lang.Object r4 = com.bytedance.msdk.core.ae.a.a(r4, r15)
            java.lang.Double r4 = (java.lang.Double) r4
            double r7 = r4.doubleValue()
            double r6 = com.google.android.material.color.utilities.Contrast.ratioOfTones(r12, r7)
            if (r9 == 0) goto La0
            java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r4 = r14.toneMinContrast
            java.lang.Object r4 = com.bytedance.msdk.core.ae.a.a(r4, r15)
            java.lang.Double r4 = (java.lang.Double) r4
            double r8 = r4.doubleValue()
            java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r4 = r3.toneMinContrast
            java.lang.Object r4 = com.bytedance.msdk.core.ae.a.a(r4, r15)
            java.lang.Double r4 = (java.lang.Double) r4
            double r12 = r4.doubleValue()
            double r8 = com.google.android.material.color.utilities.Contrast.ratioOfTones(r8, r12)
            if (r5 == 0) goto L9e
            r10 = r8
        L9e:
            r7 = r6
            goto Lcb
        La0:
            java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r4 = r14.toneMaxContrast
            java.lang.Object r4 = com.bytedance.msdk.core.ae.a.a(r4, r15)
            java.lang.Double r4 = (java.lang.Double) r4
            double r8 = r4.doubleValue()
            java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r4 = r3.toneMaxContrast
            java.lang.Object r4 = com.bytedance.msdk.core.ae.a.a(r4, r15)
            java.lang.Double r4 = (java.lang.Double) r4
            double r12 = r4.doubleValue()
            double r8 = com.google.android.material.color.utilities.Contrast.ratioOfTones(r8, r12)
            if (r5 == 0) goto Lc2
            double r10 = java.lang.Math.min(r8, r6)
        Lc2:
            if (r5 == 0) goto Lc9
            double r7 = java.lang.Math.max(r8, r6)
            goto Lcb
        Lc9:
            r7 = 4626604192193052672(0x4035000000000000, double:21.0)
        Lcb:
            java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, java.lang.Double> r4 = r14.tone
            com.google.android.material.color.utilities.n r5 = new com.google.android.material.color.utilities.n
            r5.<init>(r15)
            com.google.android.material.color.utilities.o r6 = new com.google.android.material.color.utilities.o
            r6.<init>(r1)
            r1 = r4
            com.google.android.material.color.utilities.p r4 = new com.google.android.material.color.utilities.p
            r4.<init>(r3)
            r2 = r5
            java.util.function.Function<com.google.android.material.color.utilities.DynamicScheme, com.google.android.material.color.utilities.ToneDeltaConstraint> r5 = r14.toneDeltaConstraint
            r3 = r6
            com.google.android.material.color.utilities.q r6 = new com.google.android.material.color.utilities.q
            r6.<init>(r10)
            com.google.android.material.color.utilities.r r9 = new com.google.android.material.color.utilities.r
            r9.<init>(r7)
            r7 = r9
            double r0 = calculateDynamicTone(r0, r1, r2, r3, r4, r5, r6, r7)
            return r0
    }
}
