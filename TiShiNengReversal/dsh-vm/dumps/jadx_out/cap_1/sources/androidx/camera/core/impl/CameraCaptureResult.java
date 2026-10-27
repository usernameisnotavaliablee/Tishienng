package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface CameraCaptureResult {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class EmptyCameraCaptureResult implements androidx.camera.core.impl.CameraCaptureResult {
        public EmptyCameraCaptureResult() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        public static androidx.camera.core.impl.CameraCaptureResult create() {
                androidx.camera.core.impl.CameraCaptureResult$EmptyCameraCaptureResult r0 = new androidx.camera.core.impl.CameraCaptureResult$EmptyCameraCaptureResult
                r0.<init>()
                return r0
        }

        @Override // androidx.camera.core.impl.CameraCaptureResult
        @androidx.annotation.NonNull
        public androidx.camera.core.impl.CameraCaptureMetaData.AeState getAeState() {
                r1 = this;
                androidx.camera.core.impl.CameraCaptureMetaData$AeState r0 = androidx.camera.core.impl.CameraCaptureMetaData.AeState.UNKNOWN
                return r0
        }

        @Override // androidx.camera.core.impl.CameraCaptureResult
        @androidx.annotation.NonNull
        public androidx.camera.core.impl.CameraCaptureMetaData.AfMode getAfMode() {
                r1 = this;
                androidx.camera.core.impl.CameraCaptureMetaData$AfMode r0 = androidx.camera.core.impl.CameraCaptureMetaData.AfMode.UNKNOWN
                return r0
        }

        @Override // androidx.camera.core.impl.CameraCaptureResult
        @androidx.annotation.NonNull
        public androidx.camera.core.impl.CameraCaptureMetaData.AfState getAfState() {
                r1 = this;
                androidx.camera.core.impl.CameraCaptureMetaData$AfState r0 = androidx.camera.core.impl.CameraCaptureMetaData.AfState.UNKNOWN
                return r0
        }

        @Override // androidx.camera.core.impl.CameraCaptureResult
        @androidx.annotation.NonNull
        public androidx.camera.core.impl.CameraCaptureMetaData.AwbState getAwbState() {
                r1 = this;
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
                androidx.camera.core.impl.CameraCaptureMetaData$FlashState r0 = androidx.camera.core.impl.CameraCaptureMetaData.FlashState.UNKNOWN
                return r0
        }

        @Override // androidx.camera.core.impl.CameraCaptureResult
        @androidx.annotation.NonNull
        public androidx.camera.core.impl.TagBundle getTagBundle() {
                r1 = this;
                androidx.camera.core.impl.TagBundle r0 = androidx.camera.core.impl.TagBundle.emptyBundle()
                return r0
        }

        @Override // androidx.camera.core.impl.CameraCaptureResult
        public long getTimestamp() {
                r2 = this;
                r0 = -1
                return r0
        }

        @Override // androidx.camera.core.impl.CameraCaptureResult
        public /* synthetic */ void populateExifData(androidx.camera.core.impl.utils.ExifData.Builder r1) {
                r0 = this;
                androidx.camera.core.impl.a.b(r0, r1)
                return
        }
    }

    @androidx.annotation.NonNull
    androidx.camera.core.impl.CameraCaptureMetaData.AeState getAeState();

    @androidx.annotation.NonNull
    androidx.camera.core.impl.CameraCaptureMetaData.AfMode getAfMode();

    @androidx.annotation.NonNull
    androidx.camera.core.impl.CameraCaptureMetaData.AfState getAfState();

    @androidx.annotation.NonNull
    androidx.camera.core.impl.CameraCaptureMetaData.AwbState getAwbState();

    @androidx.annotation.NonNull
    android.hardware.camera2.CaptureResult getCaptureResult();

    @androidx.annotation.NonNull
    androidx.camera.core.impl.CameraCaptureMetaData.FlashState getFlashState();

    @androidx.annotation.NonNull
    androidx.camera.core.impl.TagBundle getTagBundle();

    long getTimestamp();

    void populateExifData(@androidx.annotation.NonNull androidx.camera.core.impl.utils.ExifData.Builder r1);
}
