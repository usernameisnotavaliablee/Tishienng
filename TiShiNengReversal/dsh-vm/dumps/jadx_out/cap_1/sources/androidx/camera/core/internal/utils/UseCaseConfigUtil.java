package androidx.camera.core.internal.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class UseCaseConfigUtil {
    private UseCaseConfigUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void updateTargetRotationAndRelatedConfigs(@androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfig.Builder<?, ?, ?> r4, int r5) {
            androidx.camera.core.impl.UseCaseConfig r0 = r4.getUseCaseConfig()
            androidx.camera.core.impl.ImageOutputConfig r0 = (androidx.camera.core.impl.ImageOutputConfig) r0
            r1 = -1
            int r2 = r0.getTargetRotation(r1)
            if (r2 == r1) goto Lf
            if (r2 == r5) goto L15
        Lf:
            r3 = r4
            androidx.camera.core.impl.ImageOutputConfig$Builder r3 = (androidx.camera.core.impl.ImageOutputConfig.Builder) r3
            r3.setTargetRotation(r5)
        L15:
            if (r2 == r1) goto L48
            if (r5 == r1) goto L48
            if (r2 != r5) goto L1c
            goto L48
        L1c:
            int r1 = androidx.camera.core.impl.utils.CameraOrientationUtil.surfaceRotationToDegrees(r2)
            int r5 = androidx.camera.core.impl.utils.CameraOrientationUtil.surfaceRotationToDegrees(r5)
            int r5 = r5 - r1
            int r5 = java.lang.Math.abs(r5)
            int r5 = r5 % 180
            r1 = 90
            if (r5 != r1) goto L48
            r5 = 0
            android.util.Size r5 = r0.getTargetResolution(r5)
            if (r5 == 0) goto L48
            androidx.camera.core.impl.ImageOutputConfig$Builder r4 = (androidx.camera.core.impl.ImageOutputConfig.Builder) r4
            android.util.Size r0 = new android.util.Size
            int r1 = r5.getHeight()
            int r5 = r5.getWidth()
            r0.<init>(r1, r5)
            r4.setTargetResolution(r0)
        L48:
            return
    }
}
