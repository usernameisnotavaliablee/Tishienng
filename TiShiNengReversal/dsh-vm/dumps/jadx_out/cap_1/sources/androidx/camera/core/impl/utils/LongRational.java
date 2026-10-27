package androidx.camera.core.impl.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class LongRational {
    private final long mDenominator;
    private final long mNumerator;

    LongRational(double r3) {
            r2 = this;
            r0 = 4666723172467343360(0x40c3880000000000, double:10000.0)
            double r3 = r3 * r0
            long r3 = (long) r3
            r0 = 10000(0x2710, double:4.9407E-320)
            r2.<init>(r3, r0)
            return
    }

    LongRational(long r1, long r3) {
            r0 = this;
            r0.<init>()
            r0.mNumerator = r1
            r0.mDenominator = r3
            return
    }

    long getDenominator() {
            r2 = this;
            long r0 = r2.mDenominator
            return r0
    }

    long getNumerator() {
            r2 = this;
            long r0 = r2.mNumerator
            return r0
    }

    double toDouble() {
            r4 = this;
            long r0 = r4.mNumerator
            double r0 = (double) r0
            long r2 = r4.mDenominator
            double r2 = (double) r2
            double r0 = r0 / r2
            return r0
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = r3.mNumerator
            r0.append(r1)
            java.lang.String r1 = "/"
            r0.append(r1)
            long r1 = r3.mDenominator
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
