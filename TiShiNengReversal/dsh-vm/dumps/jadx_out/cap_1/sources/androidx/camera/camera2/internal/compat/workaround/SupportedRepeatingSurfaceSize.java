package androidx.camera.camera2.internal.compat.workaround;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class SupportedRepeatingSurfaceSize {
    private static final android.util.Size MINI_PREVIEW_SIZE_HUAWEI_MATE_9 = null;
    private static final java.util.Comparator<android.util.Size> SIZE_COMPARATOR = null;

    @androidx.annotation.Nullable
    private final androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk mQuirk;

    static {
            android.util.Size r0 = new android.util.Size
            r1 = 320(0x140, float:4.48E-43)
            r2 = 240(0xf0, float:3.36E-43)
            r0.<init>(r1, r2)
            androidx.camera.camera2.internal.compat.workaround.SupportedRepeatingSurfaceSize.MINI_PREVIEW_SIZE_HUAWEI_MATE_9 = r0
            androidx.camera.core.impl.utils.CompareSizesByArea r0 = new androidx.camera.core.impl.utils.CompareSizesByArea
            r0.<init>()
            androidx.camera.camera2.internal.compat.workaround.SupportedRepeatingSurfaceSize.SIZE_COMPARATOR = r0
            return
    }

    public SupportedRepeatingSurfaceSize() {
            r1 = this;
            r1.<init>()
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk> r0 = androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk.class
            androidx.camera.core.impl.Quirk r0 = androidx.camera.camera2.internal.compat.quirk.DeviceQuirks.get(r0)
            androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk r0 = (androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk) r0
            r1.mQuirk = r0
            return
    }

    @androidx.annotation.NonNull
    public android.util.Size[] getSupportedSizes(@androidx.annotation.NonNull android.util.Size[] r8) {
            r7 = this;
            androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk r0 = r7.mQuirk
            if (r0 == 0) goto L2e
            boolean r0 = androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk.isHuaweiMate9()
            if (r0 == 0) goto L2e
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r8.length
            r2 = 0
            r3 = 0
        L12:
            if (r3 >= r1) goto L26
            r4 = r8[r3]
            java.util.Comparator<android.util.Size> r5 = androidx.camera.camera2.internal.compat.workaround.SupportedRepeatingSurfaceSize.SIZE_COMPARATOR
            android.util.Size r6 = androidx.camera.camera2.internal.compat.workaround.SupportedRepeatingSurfaceSize.MINI_PREVIEW_SIZE_HUAWEI_MATE_9
            int r5 = r5.compare(r4, r6)
            if (r5 < 0) goto L23
            r0.add(r4)
        L23:
            int r3 = r3 + 1
            goto L12
        L26:
            android.util.Size[] r8 = new android.util.Size[r2]
            java.lang.Object[] r8 = r0.toArray(r8)
            android.util.Size[] r8 = (android.util.Size[]) r8
        L2e:
            return r8
    }
}
