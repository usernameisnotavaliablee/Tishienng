package androidx.camera.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class PreviewViewMeteringPointFactory extends androidx.camera.core.MeteringPointFactory {
    static final android.graphics.PointF INVALID_POINT = null;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("this")
    private android.graphics.Matrix mMatrix;

    @androidx.annotation.NonNull
    private final androidx.camera.view.PreviewTransformation mPreviewTransformation;

    static {
            android.graphics.PointF r0 = new android.graphics.PointF
            r1 = 1073741824(0x40000000, float:2.0)
            r0.<init>(r1, r1)
            androidx.camera.view.PreviewViewMeteringPointFactory.INVALID_POINT = r0
            return
    }

    PreviewViewMeteringPointFactory(@androidx.annotation.NonNull androidx.camera.view.PreviewTransformation r1) {
            r0 = this;
            r0.<init>()
            r0.mPreviewTransformation = r1
            return
    }

    @Override // androidx.camera.core.MeteringPointFactory
    @androidx.annotation.NonNull
    @androidx.annotation.AnyThread
    protected android.graphics.PointF convertPoint(float r3, float r4) {
            r2 = this;
            r0 = 2
            float[] r0 = new float[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            monitor-enter(r2)
            android.graphics.Matrix r4 = r2.mMatrix     // Catch: java.lang.Throwable -> L12
            if (r4 != 0) goto L14
            android.graphics.PointF r3 = androidx.camera.view.PreviewViewMeteringPointFactory.INVALID_POINT     // Catch: java.lang.Throwable -> L12
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            return r3
        L12:
            r3 = move-exception
            goto L22
        L14:
            r4.mapPoints(r0)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            android.graphics.PointF r4 = new android.graphics.PointF
            r1 = r0[r1]
            r3 = r0[r3]
            r4.<init>(r1, r3)
            return r4
        L22:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            throw r3
    }

    @androidx.annotation.UiThread
    void recalculate(@androidx.annotation.NonNull android.util.Size r2, int r3) {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            monitor-enter(r1)
            int r0 = r2.getWidth()     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1d
            int r0 = r2.getHeight()     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L11
            goto L1d
        L11:
            androidx.camera.view.PreviewTransformation r0 = r1.mPreviewTransformation     // Catch: java.lang.Throwable -> L1b
            android.graphics.Matrix r2 = r0.getPreviewViewToNormalizedSurfaceMatrix(r2, r3)     // Catch: java.lang.Throwable -> L1b
            r1.mMatrix = r2     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
            return
        L1b:
            r2 = move-exception
            goto L22
        L1d:
            r2 = 0
            r1.mMatrix = r2     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
            return
        L22:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
            throw r2
    }
}
