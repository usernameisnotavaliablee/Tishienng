package androidx.appcompat.app;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class TwilightCalculator {
    private static final float ALTIDUTE_CORRECTION_CIVIL_TWILIGHT = -0.10471976f;
    private static final float C1 = 0.0334196f;
    private static final float C2 = 3.49066E-4f;
    private static final float C3 = 5.236E-6f;
    public static final int DAY = 0;
    private static final float DEGREES_TO_RADIANS = 0.017453292f;
    private static final float J0 = 9.0E-4f;
    public static final int NIGHT = 1;
    private static final float OBLIQUITY = 0.4092797f;
    private static final long UTC_2000 = 946728000000L;
    private static androidx.appcompat.app.TwilightCalculator sInstance;
    public int state;
    public long sunrise;
    public long sunset;

    TwilightCalculator() {
            r0 = this;
            r0.<init>()
            return
    }

    static androidx.appcompat.app.TwilightCalculator getInstance() {
            androidx.appcompat.app.TwilightCalculator r0 = androidx.appcompat.app.TwilightCalculator.sInstance
            if (r0 != 0) goto Lb
            androidx.appcompat.app.TwilightCalculator r0 = new androidx.appcompat.app.TwilightCalculator
            r0.<init>()
            androidx.appcompat.app.TwilightCalculator.sInstance = r0
        Lb:
            androidx.appcompat.app.TwilightCalculator r0 = androidx.appcompat.app.TwilightCalculator.sInstance
            return r0
    }

    public void calculateTwilight(long r15, double r17, double r19) {
            r14 = this;
            r0 = 946728000000(0xdc6d62da00, double:4.67745780756E-312)
            long r2 = r15 - r0
            float r2 = (float) r2
            r3 = 1285868416(0x4ca4cb80, float:8.64E7)
            float r2 = r2 / r3
            r3 = 1015868197(0x3c8ceb25, float:0.01720197)
            float r3 = r3 * r2
            r4 = 1086828178(0x40c7ae92, float:6.24006)
            float r3 = r3 + r4
            double r4 = (double) r3
            r6 = 4584977093208571904(0x3fa11c5fc0000000, double:0.03341960161924362)
            double r8 = java.lang.Math.sin(r4)
            double r8 = r8 * r6
            double r8 = r8 + r4
            r6 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 * r3
            double r6 = (double) r6
            double r6 = java.lang.Math.sin(r6)
            r10 = 4555074754578481152(0x3f36e05b00000000, double:3.4906598739326E-4)
            double r6 = r6 * r10
            double r8 = r8 + r6
            r6 = 1077936128(0x40400000, float:3.0)
            float r3 = r3 * r6
            double r6 = (double) r3
            double r6 = java.lang.Math.sin(r6)
            r10 = 4527795603731644416(0x3ed5f61cc0000000, double:5.236000106378924E-6)
            double r6 = r6 * r10
            double r8 = r8 + r6
            r6 = 4610769955021710130(0x3ffcbed85e1ce332, double:1.796593063)
            double r8 = r8 + r6
            r6 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r8 = r8 + r6
            r6 = r19
            double r6 = -r6
            r10 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r6 = r6 / r10
            r3 = 980151802(0x3a6bedfa, float:9.0E-4)
            float r2 = r2 - r3
            double r10 = (double) r2
            double r10 = r10 - r6
            long r10 = java.lang.Math.round(r10)
            float r2 = (float) r10
            float r2 = r2 + r3
            double r2 = (double) r2
            double r2 = r2 + r6
            r6 = 4572760506128099233(0x3f75b573eab367a1, double:0.0053)
            double r4 = java.lang.Math.sin(r4)
            double r4 = r4 * r6
            double r2 = r2 + r4
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r4 = r4 * r8
            double r4 = java.lang.Math.sin(r4)
            r6 = -4648766856319305620(0xbf7c432ca57a786c, double:-0.0069)
            double r4 = r4 * r6
            double r2 = r2 + r4
            double r4 = java.lang.Math.sin(r8)
            r6 = 4601044547609296896(0x3fda31a380000000, double:0.4092797040939331)
            double r6 = java.lang.Math.sin(r6)
            double r4 = r4 * r6
            double r4 = java.lang.Math.asin(r4)
            r6 = 4580687790437564416(0x3f91df46a0000000, double:0.01745329238474369)
            double r6 = r6 * r17
            r8 = -4631161762379464704(0xbfbaceea00000000, double:-0.10471975803375244)
            double r8 = java.lang.Math.sin(r8)
            double r10 = java.lang.Math.sin(r6)
            double r12 = java.lang.Math.sin(r4)
            double r10 = r10 * r12
            double r8 = r8 - r10
            double r6 = java.lang.Math.cos(r6)
            double r4 = java.lang.Math.cos(r4)
            double r6 = r6 * r4
            double r8 = r8 / r6
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r6 = 1
            r10 = -1
            int r7 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r7 < 0) goto Lcc
            r14.state = r6
            r14.sunset = r10
            r14.sunrise = r10
            return
        Lcc:
            r4 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r7 = 0
            int r12 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r12 > 0) goto Lda
            r14.state = r7
            r14.sunset = r10
            r14.sunrise = r10
            return
        Lda:
            double r4 = java.lang.Math.acos(r8)
            r8 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            double r4 = r4 / r8
            float r4 = (float) r4
            double r4 = (double) r4
            double r8 = r2 + r4
            r10 = 4725570615333879808(0x4194997000000000, double:8.64E7)
            double r8 = r8 * r10
            long r8 = java.lang.Math.round(r8)
            long r8 = r8 + r0
            r14.sunset = r8
            double r2 = r2 - r4
            double r2 = r2 * r10
            long r2 = java.lang.Math.round(r2)
            long r2 = r2 + r0
            r14.sunrise = r2
            int r0 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r0 >= 0) goto L10d
            long r0 = r14.sunset
            int r2 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r2 <= 0) goto L10d
            r14.state = r7
            return
        L10d:
            r14.state = r6
            return
    }
}
