package androidx.camera.video.internal.workaround;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class CorrectNegativeLatLongForMediaMuxer {
    private CorrectNegativeLatLongForMediaMuxer() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static android.util.Pair<java.lang.Double, java.lang.Double> adjustGeoLocation(double r1, double r3) {
            java.lang.Class<androidx.camera.video.internal.compat.quirk.NegativeLatLongSavesIncorrectlyQuirk> r0 = androidx.camera.video.internal.compat.quirk.NegativeLatLongSavesIncorrectlyQuirk.class
            androidx.camera.core.impl.Quirk r0 = androidx.camera.video.internal.compat.quirk.DeviceQuirks.get(r0)
            if (r0 == 0) goto L10
            double r1 = adjustInternal(r1)
            double r3 = adjustInternal(r3)
        L10:
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            java.lang.Double r2 = java.lang.Double.valueOf(r3)
            android.util.Pair r1 = android.util.Pair.create(r1, r2)
            return r1
    }

    private static double adjustInternal(double r4) {
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L7
            return r4
        L7:
            r0 = 4666723172467343360(0x40c3880000000000, double:10000.0)
            double r4 = r4 * r0
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r4 - r2
            double r4 = r4 / r0
            return r4
    }
}
