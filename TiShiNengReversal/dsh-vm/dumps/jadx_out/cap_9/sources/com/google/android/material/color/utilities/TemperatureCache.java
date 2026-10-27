package com.google.android.material.color.utilities;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class TemperatureCache {
    private final com.google.android.material.color.utilities.Hct input;
    private com.google.android.material.color.utilities.Hct precomputedComplement;
    private java.util.List<com.google.android.material.color.utilities.Hct> precomputedHctsByHue;
    private java.util.List<com.google.android.material.color.utilities.Hct> precomputedHctsByTemp;
    private java.util.Map<com.google.android.material.color.utilities.Hct, java.lang.Double> precomputedTempsByHct;

    private TemperatureCache() {
            r1 = this;
            r1.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public TemperatureCache(com.google.android.material.color.utilities.Hct r1) {
            r0 = this;
            r0.<init>()
            r0.input = r1
            return
    }

    public static /* synthetic */ java.lang.Double a(com.google.android.material.color.utilities.TemperatureCache r0, com.google.android.material.color.utilities.Hct r1) {
            java.util.Map r0 = r0.getTempsByHct()
            java.lang.Object r0 = r0.get(r1)
            java.lang.Double r0 = (java.lang.Double) r0
            return r0
    }

    private com.google.android.material.color.utilities.Hct getColdest() {
            r2 = this;
            java.util.List r0 = r2.getHctsByTemp()
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.google.android.material.color.utilities.Hct r0 = (com.google.android.material.color.utilities.Hct) r0
            return r0
    }

    private java.util.List<com.google.android.material.color.utilities.Hct> getHctsByHue() {
            r9 = this;
            java.util.List<com.google.android.material.color.utilities.Hct> r0 = r9.precomputedHctsByHue
            if (r0 == 0) goto L5
            return r0
        L5:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r3 = r1
        Ld:
            r1 = 4645040803167600640(0x4076800000000000, double:360.0)
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L2d
            com.google.android.material.color.utilities.Hct r1 = r9.input
            double r5 = r1.getChroma()
            com.google.android.material.color.utilities.Hct r1 = r9.input
            double r7 = r1.getTone()
            com.google.android.material.color.utilities.Hct r1 = com.google.android.material.color.utilities.Hct.from(r3, r5, r7)
            r0.add(r1)
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 + r1
            goto Ld
        L2d:
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r9.precomputedHctsByHue = r0
            return r0
    }

    private java.util.List<com.google.android.material.color.utilities.Hct> getHctsByTemp() {
            r3 = this;
            java.util.List<com.google.android.material.color.utilities.Hct> r0 = r3.precomputedHctsByTemp
            if (r0 == 0) goto L5
            return r0
        L5:
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r1 = r3.getHctsByHue()
            r0.<init>(r1)
            com.google.android.material.color.utilities.Hct r1 = r3.input
            r0.add(r1)
            com.google.android.material.color.utilities.s5 r1 = new com.google.android.material.color.utilities.s5
            r1.<init>(r3)
            com.google.android.material.color.utilities.t5 r2 = new com.google.android.material.color.utilities.t5
            r2.<init>()
            java.util.Comparator r1 = com.google.android.material.color.utilities.r5.a(r1, r2)
            java.util.Collections.sort(r0, r1)
            r3.precomputedHctsByTemp = r0
            return r0
    }

    private java.util.Map<com.google.android.material.color.utilities.Hct, java.lang.Double> getTempsByHct() {
            r5 = this;
            java.util.Map<com.google.android.material.color.utilities.Hct, java.lang.Double> r0 = r5.precomputedTempsByHct
            if (r0 == 0) goto L5
            return r0
        L5:
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r1 = r5.getHctsByHue()
            r0.<init>(r1)
            com.google.android.material.color.utilities.Hct r1 = r5.input
            r0.add(r1)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r0.next()
            com.google.android.material.color.utilities.Hct r2 = (com.google.android.material.color.utilities.Hct) r2
            double r3 = rawTemperature(r2)
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            r1.put(r2, r3)
            goto L1c
        L34:
            r5.precomputedTempsByHct = r1
            return r1
    }

    private com.google.android.material.color.utilities.Hct getWarmest() {
            r2 = this;
            java.util.List r0 = r2.getHctsByTemp()
            java.util.List r1 = r2.getHctsByTemp()
            int r1 = r1.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            com.google.android.material.color.utilities.Hct r0 = (com.google.android.material.color.utilities.Hct) r0
            return r0
    }

    private static boolean isBetween(double r3, double r5, double r7) {
            r0 = 0
            r1 = 1
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 >= 0) goto L10
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 > 0) goto Lf
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 > 0) goto Lf
            return r1
        Lf:
            return r0
        L10:
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 <= 0) goto L1a
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 > 0) goto L19
            goto L1a
        L19:
            return r0
        L1a:
            return r1
    }

    public static double rawTemperature(com.google.android.material.color.utilities.Hct r7) {
            int r7 = r7.toInt()
            double[] r7 = com.google.android.material.color.utilities.ColorUtils.labFromArgb(r7)
            r0 = 2
            r1 = r7[r0]
            r3 = 1
            r4 = r7[r3]
            double r1 = java.lang.Math.atan2(r1, r4)
            double r1 = java.lang.Math.toDegrees(r1)
            double r1 = com.google.android.material.color.utilities.MathUtils.sanitizeDegreesDouble(r1)
            r3 = r7[r3]
            r5 = r7[r0]
            double r3 = java.lang.Math.hypot(r3, r5)
            r5 = 4607497670773933343(0x3ff11eb851eb851f, double:1.07)
            double r3 = java.lang.Math.pow(r3, r5)
            r5 = 4581421828931458171(0x3f947ae147ae147b, double:0.02)
            double r3 = r3 * r5
            r5 = 4632233691727265792(0x4049000000000000, double:50.0)
            double r1 = r1 - r5
            double r0 = com.google.android.material.color.utilities.MathUtils.sanitizeDegreesDouble(r1)
            double r0 = java.lang.Math.toRadians(r0)
            double r0 = java.lang.Math.cos(r0)
            double r3 = r3 * r0
            r0 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            double r3 = r3 + r0
            return r3
    }

    public java.util.List<com.google.android.material.color.utilities.Hct> getAnalogousColors() {
            r2 = this;
            r0 = 5
            r1 = 12
            java.util.List r0 = r2.getAnalogousColors(r0, r1)
            return r0
    }

    public java.util.List<com.google.android.material.color.utilities.Hct> getAnalogousColors(int r20, int r21) {
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            com.google.android.material.color.utilities.Hct r3 = r0.input
            double r3 = r3.getHue()
            long r3 = java.lang.Math.round(r3)
            int r4 = (int) r3
            java.util.List r3 = r0.getHctsByHue()
            java.lang.Object r3 = r3.get(r4)
            com.google.android.material.color.utilities.Hct r3 = (com.google.android.material.color.utilities.Hct) r3
            double r5 = r0.getRelativeTemperature(r3)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r7.add(r3)
            r8 = 0
            r12 = r8
            r11 = 0
        L2b:
            r14 = 360(0x168, float:5.04E-43)
            if (r11 >= r14) goto L4e
            int r14 = r4 + r11
            int r14 = com.google.android.material.color.utilities.MathUtils.sanitizeDegreesInt(r14)
            java.util.List r15 = r0.getHctsByHue()
            java.lang.Object r14 = r15.get(r14)
            com.google.android.material.color.utilities.Hct r14 = (com.google.android.material.color.utilities.Hct) r14
            double r14 = r0.getRelativeTemperature(r14)
            double r5 = r14 - r5
            double r5 = java.lang.Math.abs(r5)
            double r12 = r12 + r5
            int r11 = r11 + 1
            r5 = r14
            goto L2b
        L4e:
            double r5 = (double) r2
            double r12 = r12 / r5
            double r5 = r0.getRelativeTemperature(r3)
            r11 = 1
        L55:
            int r15 = r7.size()
            if (r15 >= r2) goto Lb9
            int r15 = r4 + r11
            int r15 = com.google.android.material.color.utilities.MathUtils.sanitizeDegreesInt(r15)
            java.util.List r3 = r0.getHctsByHue()
            java.lang.Object r3 = r3.get(r15)
            com.google.android.material.color.utilities.Hct r3 = (com.google.android.material.color.utilities.Hct) r3
            double r16 = r0.getRelativeTemperature(r3)
            double r5 = r16 - r5
            double r5 = java.lang.Math.abs(r5)
            double r8 = r8 + r5
            int r5 = r7.size()
            double r5 = (double) r5
            double r5 = r5 * r12
            int r15 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r15 < 0) goto L83
            r5 = 1
            goto L84
        L83:
            r5 = 0
        L84:
            r6 = 1
        L85:
            if (r5 == 0) goto La6
            int r5 = r7.size()
            if (r5 >= r2) goto La6
            r7.add(r3)
            int r5 = r7.size()
            int r5 = r5 + r6
            r18 = r11
            double r10 = (double) r5
            double r10 = r10 * r12
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 < 0) goto La0
            r5 = 1
            goto La1
        La0:
            r5 = 0
        La1:
            int r6 = r6 + 1
            r11 = r18
            goto L85
        La6:
            r18 = r11
            int r11 = r18 + 1
            if (r11 <= r14) goto Lb6
        Lac:
            int r4 = r7.size()
            if (r4 >= r2) goto Lb9
            r7.add(r3)
            goto Lac
        Lb6:
            r5 = r16
            goto L55
        Lb9:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.google.android.material.color.utilities.Hct r3 = r0.input
            r2.add(r3)
            double r3 = (double) r1
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 - r5
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r3 = r3 / r5
            double r3 = java.lang.Math.floor(r3)
            int r3 = (int) r3
            r4 = 1
        Ld0:
            int r5 = r3 + 1
            if (r4 >= r5) goto Lf6
            int r5 = 0 - r4
        Ld6:
            if (r5 >= 0) goto Lde
            int r6 = r7.size()
            int r5 = r5 + r6
            goto Ld6
        Lde:
            int r6 = r7.size()
            if (r5 < r6) goto Le9
            int r6 = r7.size()
            int r5 = r5 % r6
        Le9:
            java.lang.Object r5 = r7.get(r5)
            com.google.android.material.color.utilities.Hct r5 = (com.google.android.material.color.utilities.Hct) r5
            r15 = 0
            r2.add(r15, r5)
            int r4 = r4 + 1
            goto Ld0
        Lf6:
            int r1 = r1 - r3
            r3 = 1
        Lf8:
            if (r3 >= r1) goto L11a
            r4 = r3
        Lfb:
            if (r4 >= 0) goto L103
            int r5 = r7.size()
            int r4 = r4 + r5
            goto Lfb
        L103:
            int r5 = r7.size()
            if (r4 < r5) goto L10e
            int r5 = r7.size()
            int r4 = r4 % r5
        L10e:
            java.lang.Object r4 = r7.get(r4)
            com.google.android.material.color.utilities.Hct r4 = (com.google.android.material.color.utilities.Hct) r4
            r2.add(r4)
            int r3 = r3 + 1
            goto Lf8
        L11a:
            return r2
    }

    public com.google.android.material.color.utilities.Hct getComplement() {
            r22 = this;
            r0 = r22
            com.google.android.material.color.utilities.Hct r1 = r0.precomputedComplement
            if (r1 == 0) goto L7
            return r1
        L7:
            com.google.android.material.color.utilities.Hct r1 = r0.getColdest()
            double r4 = r1.getHue()
            java.util.Map r1 = r0.getTempsByHct()
            com.google.android.material.color.utilities.Hct r2 = r0.getColdest()
            java.lang.Object r1 = r1.get(r2)
            java.lang.Double r1 = (java.lang.Double) r1
            double r8 = r1.doubleValue()
            com.google.android.material.color.utilities.Hct r1 = r0.getWarmest()
            double r6 = r1.getHue()
            java.util.Map r1 = r0.getTempsByHct()
            com.google.android.material.color.utilities.Hct r2 = r0.getWarmest()
            java.lang.Object r1 = r1.get(r2)
            java.lang.Double r1 = (java.lang.Double) r1
            double r1 = r1.doubleValue()
            double r10 = r1 - r8
            com.google.android.material.color.utilities.Hct r1 = r0.input
            double r2 = r1.getHue()
            boolean r1 = isBetween(r2, r4, r6)
            if (r1 == 0) goto L4b
            r14 = r6
            goto L4c
        L4b:
            r14 = r4
        L4c:
            if (r1 == 0) goto L51
            r16 = r4
            goto L53
        L51:
            r16 = r6
        L53:
            java.util.List r1 = r0.getHctsByHue()
            com.google.android.material.color.utilities.Hct r2 = r0.input
            double r2 = r2.getHue()
            long r2 = java.lang.Math.round(r2)
            int r3 = (int) r2
            java.lang.Object r1 = r1.get(r3)
            com.google.android.material.color.utilities.Hct r1 = (com.google.android.material.color.utilities.Hct) r1
            com.google.android.material.color.utilities.Hct r2 = r0.input
            double r2 = r0.getRelativeTemperature(r2)
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = r4 - r2
            r6 = 4652007308841189376(0x408f400000000000, double:1000.0)
            r12 = 0
            r18 = r12
        L7b:
            r12 = 4645040803167600640(0x4076800000000000, double:360.0)
            int r20 = (r18 > r12 ? 1 : (r18 == r12 ? 0 : -1))
            if (r20 > 0) goto Lc6
            double r12 = r4 * r18
            double r12 = r12 + r14
            double r12 = com.google.android.material.color.utilities.MathUtils.sanitizeDegreesDouble(r12)
            boolean r20 = isBetween(r12, r14, r16)
            if (r20 != 0) goto L94
            r20 = r4
            goto Lc1
        L94:
            r20 = r4
            java.util.List r4 = r0.getHctsByHue()
            long r12 = java.lang.Math.round(r12)
            int r5 = (int) r12
            java.lang.Object r4 = r4.get(r5)
            com.google.android.material.color.utilities.Hct r4 = (com.google.android.material.color.utilities.Hct) r4
            java.util.Map r5 = r0.getTempsByHct()
            java.lang.Object r5 = r5.get(r4)
            java.lang.Double r5 = (java.lang.Double) r5
            double r12 = r5.doubleValue()
            double r12 = r12 - r8
            double r12 = r12 / r10
            double r12 = r2 - r12
            double r12 = java.lang.Math.abs(r12)
            int r5 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r5 >= 0) goto Lc1
            r1 = r4
            r6 = r12
        Lc1:
            double r18 = r18 + r20
            r4 = r20
            goto L7b
        Lc6:
            r0.precomputedComplement = r1
            return r1
    }

    public double getRelativeTemperature(com.google.android.material.color.utilities.Hct r7) {
            r6 = this;
            java.util.Map r0 = r6.getTempsByHct()
            com.google.android.material.color.utilities.Hct r1 = r6.getWarmest()
            java.lang.Object r0 = r0.get(r1)
            java.lang.Double r0 = (java.lang.Double) r0
            double r0 = r0.doubleValue()
            java.util.Map r2 = r6.getTempsByHct()
            com.google.android.material.color.utilities.Hct r3 = r6.getColdest()
            java.lang.Object r2 = r2.get(r3)
            java.lang.Double r2 = (java.lang.Double) r2
            double r2 = r2.doubleValue()
            double r0 = r0 - r2
            java.util.Map r2 = r6.getTempsByHct()
            java.lang.Object r7 = r2.get(r7)
            java.lang.Double r7 = (java.lang.Double) r7
            double r2 = r7.doubleValue()
            java.util.Map r7 = r6.getTempsByHct()
            com.google.android.material.color.utilities.Hct r4 = r6.getColdest()
            java.lang.Object r7 = r7.get(r4)
            java.lang.Double r7 = (java.lang.Double) r7
            double r4 = r7.doubleValue()
            double r2 = r2 - r4
            r4 = 0
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 != 0) goto L4f
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            return r0
        L4f:
            double r2 = r2 / r0
            return r2
    }
}
