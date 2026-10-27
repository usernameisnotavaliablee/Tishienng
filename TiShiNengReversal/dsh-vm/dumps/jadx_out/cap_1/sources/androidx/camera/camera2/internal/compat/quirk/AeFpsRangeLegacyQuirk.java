package androidx.camera.camera2.internal.compat.quirk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class AeFpsRangeLegacyQuirk implements androidx.camera.core.impl.Quirk {

    @androidx.annotation.Nullable
    private final android.util.Range<java.lang.Integer> mAeFpsRange;

    public AeFpsRangeLegacyQuirk(@androidx.annotation.NonNull androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r2) {
            r1 = this;
            r1.<init>()
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES
            java.lang.Object r2 = r2.get(r0)
            android.util.Range[] r2 = (android.util.Range[]) r2
            android.util.Range r2 = r1.pickSuitableFpsRange(r2)
            r1.mAeFpsRange = r2
            return
    }

    @androidx.annotation.NonNull
    private android.util.Range<java.lang.Integer> getCorrectedFpsRange(@androidx.annotation.NonNull android.util.Range<java.lang.Integer> r5) {
            r4 = this;
            java.lang.Comparable r0 = r5.getUpper()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.lang.Comparable r1 = r5.getLower()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.Comparable r2 = r5.getUpper()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r2 < r3) goto L2d
            java.lang.Comparable r0 = r5.getUpper()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r0 = r0 / r3
        L2d:
            java.lang.Comparable r2 = r5.getLower()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 < r3) goto L45
            java.lang.Comparable r5 = r5.getLower()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            int r1 = r5 / 1000
        L45:
            android.util.Range r5 = new android.util.Range
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.<init>(r1, r0)
            return r5
    }

    static boolean load(@androidx.annotation.NonNull androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r1) {
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL
            java.lang.Object r1 = r1.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L13
            int r1 = r1.intValue()
            r0 = 2
            if (r1 != r0) goto L13
            r1 = 1
            return r1
        L13:
            r1 = 0
            return r1
    }

    @androidx.annotation.Nullable
    private android.util.Range<java.lang.Integer> pickSuitableFpsRange(@androidx.annotation.Nullable android.util.Range<java.lang.Integer>[] r7) {
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L3d
            int r1 = r7.length
            if (r1 != 0) goto L7
            goto L3d
        L7:
            int r1 = r7.length
            r2 = 0
        L9:
            if (r2 >= r1) goto L3d
            r3 = r7[r2]
            android.util.Range r3 = r6.getCorrectedFpsRange(r3)
            java.lang.Comparable r4 = r3.getUpper()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5 = 30
            if (r4 == r5) goto L20
            goto L3a
        L20:
            if (r0 != 0) goto L23
            goto L39
        L23:
            java.lang.Comparable r4 = r3.getLower()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.Comparable r5 = r0.getLower()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            if (r4 >= r5) goto L3a
        L39:
            r0 = r3
        L3a:
            int r2 = r2 + 1
            goto L9
        L3d:
            return r0
    }

    @androidx.annotation.Nullable
    public android.util.Range<java.lang.Integer> getRange() {
            r1 = this;
            android.util.Range<java.lang.Integer> r0 = r1.mAeFpsRange
            return r0
    }
}
