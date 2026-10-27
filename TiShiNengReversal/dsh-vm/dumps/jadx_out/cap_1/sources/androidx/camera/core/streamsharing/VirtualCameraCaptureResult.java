package androidx.camera.core.streamsharing;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(api = 21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class VirtualCameraCaptureResult implements androidx.camera.core.impl.CameraCaptureResult {
    private static final long INVALID_TIMESTAMP = -1;

    @androidx.annotation.Nullable
    private final androidx.camera.core.impl.CameraCaptureResult mBaseCameraCaptureResult;

    @androidx.annotation.NonNull
    private final androidx.camera.core.impl.TagBundle mTagBundle;
    private final long mTimestamp;

    private VirtualCameraCaptureResult(@androidx.annotation.Nullable androidx.camera.core.impl.CameraCaptureResult r1, @androidx.annotation.NonNull androidx.camera.core.impl.TagBundle r2, long r3) {
            r0 = this;
            r0.<init>()
            r0.mBaseCameraCaptureResult = r1
            r0.mTagBundle = r2
            r0.mTimestamp = r3
            return
    }

    public VirtualCameraCaptureResult(@androidx.annotation.NonNull androidx.camera.core.impl.TagBundle r2, long r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2, r3)
            return
    }

    public VirtualCameraCaptureResult(@androidx.annotation.NonNull androidx.camera.core.impl.TagBundle r3, @androidx.annotation.Nullable androidx.camera.core.impl.CameraCaptureResult r4) {
            r2 = this;
            r0 = -1
            r2.<init>(r4, r3, r0)
            return
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @androidx.annotation.NonNull
    public androidx.camera.core.impl.CameraCaptureMetaData.AeState getAeState() {
            r1 = this;
            androidx.camera.core.impl.CameraCaptureResult r0 = r1.mBaseCameraCaptureResult
            if (r0 == 0) goto L9
            androidx.camera.core.impl.CameraCaptureMetaData$AeState r0 = r0.getAeState()
            return r0
        L9:
            androidx.camera.core.impl.CameraCaptureMetaData$AeState r0 = androidx.camera.core.impl.CameraCaptureMetaData.AeState.UNKNOWN
            return r0
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @androidx.annotation.NonNull
    public androidx.camera.core.impl.CameraCaptureMetaData.AfMode getAfMode() {
            r1 = this;
            androidx.camera.core.impl.CameraCaptureResult r0 = r1.mBaseCameraCaptureResult
            if (r0 == 0) goto L9
            androidx.camera.core.impl.CameraCaptureMetaData$AfMode r0 = r0.getAfMode()
            return r0
        L9:
            androidx.camera.core.impl.CameraCaptureMetaData$AfMode r0 = androidx.camera.core.impl.CameraCaptureMetaData.AfMode.UNKNOWN
            return r0
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @androidx.annotation.NonNull
    public androidx.camera.core.impl.CameraCaptureMetaData.AfState getAfState() {
            r1 = this;
            androidx.camera.core.impl.CameraCaptureResult r0 = r1.mBaseCameraCaptureResult
            if (r0 == 0) goto L9
            androidx.camera.core.impl.CameraCaptureMetaData$AfState r0 = r0.getAfState()
            return r0
        L9:
            androidx.camera.core.impl.CameraCaptureMetaData$AfState r0 = androidx.camera.core.impl.CameraCaptureMetaData.AfState.UNKNOWN
            return r0
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @androidx.annotation.NonNull
    public androidx.camera.core.impl.CameraCaptureMetaData.AwbState getAwbState() {
            r1 = this;
            androidx.camera.core.impl.CameraCaptureResult r0 = r1.mBaseCameraCaptureResult
            if (r0 == 0) goto L9
            androidx.camera.core.impl.CameraCaptureMetaData$AwbState r0 = r0.getAwbState()
            return r0
        L9:
            androidx.camera.core.impl.CameraCaptureMetaData$AwbState r0 = androidx.camera.core.impl.CameraCaptureMetaData.AwbState.UNKNOWN
            return r0
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public /* synthetic */ android.hardware.camera2.CaptureResult getCaptureResult() {
            r1 = this;
            android.hardware.camera2.CaptureResult r0 = androidx.camera.core.impl.a.a(r1)
            return r0
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @androidx.annotation.NonNull
    public androidx.camera.core.impl.CameraCaptureMetaData.FlashState getFlashState() {
            r1 = this;
            androidx.camera.core.impl.CameraCaptureResult r0 = r1.mBaseCameraCaptureResult
            if (r0 == 0) goto L9
            androidx.camera.core.impl.CameraCaptureMetaData$FlashState r0 = r0.getFlashState()
            return r0
        L9:
            androidx.camera.core.impl.CameraCaptureMetaData$FlashState r0 = androidx.camera.core.impl.CameraCaptureMetaData.FlashState.UNKNOWN
            return r0
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @androidx.annotation.NonNull
    public androidx.camera.core.impl.TagBundle getTagBundle() {
            r1 = this;
            androidx.camera.core.impl.TagBundle r0 = r1.mTagBundle
            return r0
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public long getTimestamp() {
            r5 = this;
            androidx.camera.core.impl.CameraCaptureResult r0 = r5.mBaseCameraCaptureResult
            if (r0 == 0) goto L9
            long r0 = r0.getTimestamp()
            return r0
        L9:
            long r0 = r5.mTimestamp
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L12
            return r0
        L12:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No timestamp is available."
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public /* synthetic */ void populateExifData(androidx.camera.core.impl.utils.ExifData.Builder r1) {
            r0 = this;
            androidx.camera.core.impl.a.b(r0, r1)
            return
    }
}
