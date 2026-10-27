package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class DisplayOrientedMeteringPointFactory extends androidx.camera.core.MeteringPointFactory {

    @androidx.annotation.NonNull
    private final androidx.camera.core.CameraInfo mCameraInfo;

    @androidx.annotation.NonNull
    private final android.view.Display mDisplay;
    private final float mHeight;
    private final float mWidth;

    public DisplayOrientedMeteringPointFactory(@androidx.annotation.NonNull android.view.Display r1, @androidx.annotation.NonNull androidx.camera.core.CameraInfo r2, float r3, float r4) {
            r0 = this;
            r0.<init>()
            r0.mWidth = r3
            r0.mHeight = r4
            r0.mDisplay = r1
            r0.mCameraInfo = r2
            return
    }

    private int getRelativeCameraOrientation(boolean r3) {
            r2 = this;
            android.view.Display r0 = r2.mDisplay     // Catch: java.lang.Exception -> L14
            int r0 = r0.getRotation()     // Catch: java.lang.Exception -> L14
            androidx.camera.core.CameraInfo r1 = r2.mCameraInfo     // Catch: java.lang.Exception -> L14
            int r0 = r1.getSensorRotationDegrees(r0)     // Catch: java.lang.Exception -> L14
            if (r3 == 0) goto L13
            int r3 = 360 - r0
            int r3 = r3 % 360
            return r3
        L13:
            return r0
        L14:
            r3 = 0
            return r3
    }

    @Override // androidx.camera.core.MeteringPointFactory
    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    protected android.graphics.PointF convertPoint(float r8, float r9) {
            r7 = this;
            float r0 = r7.mWidth
            float r1 = r7.mHeight
            androidx.camera.core.CameraInfo r2 = r7.mCameraInfo
            int r2 = r2.getLensFacing()
            if (r2 != 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            int r3 = r7.getRelativeCameraOrientation(r2)
            r4 = 270(0x10e, float:3.78E-43)
            r5 = 90
            if (r3 == r5) goto L22
            if (r3 != r4) goto L1c
            goto L22
        L1c:
            r6 = r9
            r9 = r8
            r8 = r6
            r6 = r1
            r1 = r0
            r0 = r6
        L22:
            if (r3 == r5) goto L30
            r5 = 180(0xb4, float:2.52E-43)
            if (r3 == r5) goto L2e
            if (r3 == r4) goto L2b
            goto L32
        L2b:
            float r9 = r1 - r9
            goto L32
        L2e:
            float r9 = r1 - r9
        L30:
            float r8 = r0 - r8
        L32:
            if (r2 == 0) goto L36
            float r9 = r1 - r9
        L36:
            float r9 = r9 / r1
            float r8 = r8 / r0
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>(r9, r8)
            return r0
    }
}
