package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class ExposureStateImpl implements androidx.camera.core.ExposureState {
    private final androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat mCameraCharacteristics;

    @androidx.annotation.GuardedBy("mLock")
    private int mExposureCompensation;
    private final java.lang.Object mLock;

    ExposureStateImpl(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r2, int r3) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.mLock = r0
            r1.mCameraCharacteristics = r2
            r1.mExposureCompensation = r3
            return
    }

    @Override // androidx.camera.core.ExposureState
    public int getExposureCompensationIndex() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            int r1 = r2.mExposureCompensation     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    @Override // androidx.camera.core.ExposureState
    @androidx.annotation.NonNull
    public android.util.Range<java.lang.Integer> getExposureCompensationRange() {
            r2 = this;
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r0 = r2.mCameraCharacteristics
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE
            java.lang.Object r0 = r0.get(r1)
            android.util.Range r0 = (android.util.Range) r0
            return r0
    }

    @Override // androidx.camera.core.ExposureState
    @androidx.annotation.NonNull
    public android.util.Rational getExposureCompensationStep() {
            r2 = this;
            boolean r0 = r2.isExposureCompensationSupported()
            if (r0 != 0) goto L9
            android.util.Rational r0 = android.util.Rational.ZERO
            return r0
        L9:
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r0 = r2.mCameraCharacteristics
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP
            java.lang.Object r0 = r0.get(r1)
            android.util.Rational r0 = (android.util.Rational) r0
            return r0
    }

    @Override // androidx.camera.core.ExposureState
    public boolean isExposureCompensationSupported() {
            r2 = this;
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r0 = r2.mCameraCharacteristics
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE
            java.lang.Object r0 = r0.get(r1)
            android.util.Range r0 = (android.util.Range) r0
            if (r0 == 0) goto L26
            java.lang.Comparable r1 = r0.getLower()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 == 0) goto L26
            java.lang.Comparable r0 = r0.getUpper()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 == 0) goto L26
            r0 = 1
            return r0
        L26:
            r0 = 0
            return r0
    }

    void setExposureCompensationIndex(int r2) {
            r1 = this;
            java.lang.Object r0 = r1.mLock
            monitor-enter(r0)
            r1.mExposureCompensation = r2     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r2
    }
}
