package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class Camera2CameraCaptureResult implements androidx.camera.core.impl.CameraCaptureResult {
    private static final java.lang.String TAG = "C2CameraCaptureResult";
    private final android.hardware.camera2.CaptureResult mCaptureResult;
    private final androidx.camera.core.impl.TagBundle mTagBundle;

    public Camera2CameraCaptureResult(@androidx.annotation.NonNull android.hardware.camera2.CaptureResult r2) {
            r1 = this;
            androidx.camera.core.impl.TagBundle r0 = androidx.camera.core.impl.TagBundle.emptyBundle()
            r1.<init>(r0, r2)
            return
    }

    public Camera2CameraCaptureResult(@androidx.annotation.NonNull androidx.camera.core.impl.TagBundle r1, @androidx.annotation.NonNull android.hardware.camera2.CaptureResult r2) {
            r0 = this;
            r0.<init>()
            r0.mTagBundle = r1
            r0.mCaptureResult = r2
            return
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @androidx.annotation.NonNull
    public androidx.camera.core.impl.CameraCaptureMetaData.AeState getAeState() {
            r3 = this;
            android.hardware.camera2.CaptureResult r0 = r3.mCaptureResult
            android.hardware.camera2.CaptureResult$Key r1 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto Lf
            androidx.camera.core.impl.CameraCaptureMetaData$AeState r0 = androidx.camera.core.impl.CameraCaptureMetaData.AeState.UNKNOWN
            return r0
        Lf:
            int r1 = r0.intValue()
            if (r1 == 0) goto L49
            r2 = 1
            if (r1 == r2) goto L46
            r2 = 2
            if (r1 == r2) goto L43
            r2 = 3
            if (r1 == r2) goto L40
            r2 = 4
            if (r1 == r2) goto L3d
            r2 = 5
            if (r1 == r2) goto L46
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Undefined ae state: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "C2CameraCaptureResult"
            androidx.camera.core.Logger.e(r1, r0)
            androidx.camera.core.impl.CameraCaptureMetaData$AeState r0 = androidx.camera.core.impl.CameraCaptureMetaData.AeState.UNKNOWN
            return r0
        L3d:
            androidx.camera.core.impl.CameraCaptureMetaData$AeState r0 = androidx.camera.core.impl.CameraCaptureMetaData.AeState.FLASH_REQUIRED
            return r0
        L40:
            androidx.camera.core.impl.CameraCaptureMetaData$AeState r0 = androidx.camera.core.impl.CameraCaptureMetaData.AeState.LOCKED
            return r0
        L43:
            androidx.camera.core.impl.CameraCaptureMetaData$AeState r0 = androidx.camera.core.impl.CameraCaptureMetaData.AeState.CONVERGED
            return r0
        L46:
            androidx.camera.core.impl.CameraCaptureMetaData$AeState r0 = androidx.camera.core.impl.CameraCaptureMetaData.AeState.SEARCHING
            return r0
        L49:
            androidx.camera.core.impl.CameraCaptureMetaData$AeState r0 = androidx.camera.core.impl.CameraCaptureMetaData.AeState.INACTIVE
            return r0
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @androidx.annotation.NonNull
    public androidx.camera.core.impl.CameraCaptureMetaData.AfMode getAfMode() {
            r3 = this;
            android.hardware.camera2.CaptureResult r0 = r3.mCaptureResult
            android.hardware.camera2.CaptureResult$Key r1 = android.hardware.camera2.CaptureResult.CONTROL_AF_MODE
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto Lf
            androidx.camera.core.impl.CameraCaptureMetaData$AfMode r0 = androidx.camera.core.impl.CameraCaptureMetaData.AfMode.UNKNOWN
            return r0
        Lf:
            int r1 = r0.intValue()
            if (r1 == 0) goto L43
            r2 = 1
            if (r1 == r2) goto L40
            r2 = 2
            if (r1 == r2) goto L40
            r2 = 3
            if (r1 == r2) goto L3d
            r2 = 4
            if (r1 == r2) goto L3d
            r2 = 5
            if (r1 == r2) goto L43
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Undefined af mode: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "C2CameraCaptureResult"
            androidx.camera.core.Logger.e(r1, r0)
            androidx.camera.core.impl.CameraCaptureMetaData$AfMode r0 = androidx.camera.core.impl.CameraCaptureMetaData.AfMode.UNKNOWN
            return r0
        L3d:
            androidx.camera.core.impl.CameraCaptureMetaData$AfMode r0 = androidx.camera.core.impl.CameraCaptureMetaData.AfMode.ON_CONTINUOUS_AUTO
            return r0
        L40:
            androidx.camera.core.impl.CameraCaptureMetaData$AfMode r0 = androidx.camera.core.impl.CameraCaptureMetaData.AfMode.ON_MANUAL_AUTO
            return r0
        L43:
            androidx.camera.core.impl.CameraCaptureMetaData$AfMode r0 = androidx.camera.core.impl.CameraCaptureMetaData.AfMode.OFF
            return r0
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @androidx.annotation.NonNull
    public androidx.camera.core.impl.CameraCaptureMetaData.AfState getAfState() {
            r3 = this;
            android.hardware.camera2.CaptureResult r0 = r3.mCaptureResult
            android.hardware.camera2.CaptureResult$Key r1 = android.hardware.camera2.CaptureResult.CONTROL_AF_STATE
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto Lf
            androidx.camera.core.impl.CameraCaptureMetaData$AfState r0 = androidx.camera.core.impl.CameraCaptureMetaData.AfState.UNKNOWN
            return r0
        Lf:
            int r1 = r0.intValue()
            switch(r1) {
                case 0: goto L3e;
                case 1: goto L3b;
                case 2: goto L38;
                case 3: goto L3b;
                case 4: goto L35;
                case 5: goto L32;
                case 6: goto L2f;
                default: goto L16;
            }
        L16:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Undefined af state: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "C2CameraCaptureResult"
            androidx.camera.core.Logger.e(r1, r0)
            androidx.camera.core.impl.CameraCaptureMetaData$AfState r0 = androidx.camera.core.impl.CameraCaptureMetaData.AfState.UNKNOWN
            return r0
        L2f:
            androidx.camera.core.impl.CameraCaptureMetaData$AfState r0 = androidx.camera.core.impl.CameraCaptureMetaData.AfState.PASSIVE_NOT_FOCUSED
            return r0
        L32:
            androidx.camera.core.impl.CameraCaptureMetaData$AfState r0 = androidx.camera.core.impl.CameraCaptureMetaData.AfState.LOCKED_NOT_FOCUSED
            return r0
        L35:
            androidx.camera.core.impl.CameraCaptureMetaData$AfState r0 = androidx.camera.core.impl.CameraCaptureMetaData.AfState.LOCKED_FOCUSED
            return r0
        L38:
            androidx.camera.core.impl.CameraCaptureMetaData$AfState r0 = androidx.camera.core.impl.CameraCaptureMetaData.AfState.PASSIVE_FOCUSED
            return r0
        L3b:
            androidx.camera.core.impl.CameraCaptureMetaData$AfState r0 = androidx.camera.core.impl.CameraCaptureMetaData.AfState.SCANNING
            return r0
        L3e:
            androidx.camera.core.impl.CameraCaptureMetaData$AfState r0 = androidx.camera.core.impl.CameraCaptureMetaData.AfState.INACTIVE
            return r0
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @androidx.annotation.NonNull
    public androidx.camera.core.impl.CameraCaptureMetaData.AwbState getAwbState() {
            r3 = this;
            android.hardware.camera2.CaptureResult r0 = r3.mCaptureResult
            android.hardware.camera2.CaptureResult$Key r1 = android.hardware.camera2.CaptureResult.CONTROL_AWB_STATE
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto Lf
            androidx.camera.core.impl.CameraCaptureMetaData$AwbState r0 = androidx.camera.core.impl.CameraCaptureMetaData.AwbState.UNKNOWN
            return r0
        Lf:
            int r1 = r0.intValue()
            if (r1 == 0) goto L40
            r2 = 1
            if (r1 == r2) goto L3d
            r2 = 2
            if (r1 == r2) goto L3a
            r2 = 3
            if (r1 == r2) goto L37
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Undefined awb state: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "C2CameraCaptureResult"
            androidx.camera.core.Logger.e(r1, r0)
            androidx.camera.core.impl.CameraCaptureMetaData$AwbState r0 = androidx.camera.core.impl.CameraCaptureMetaData.AwbState.UNKNOWN
            return r0
        L37:
            androidx.camera.core.impl.CameraCaptureMetaData$AwbState r0 = androidx.camera.core.impl.CameraCaptureMetaData.AwbState.LOCKED
            return r0
        L3a:
            androidx.camera.core.impl.CameraCaptureMetaData$AwbState r0 = androidx.camera.core.impl.CameraCaptureMetaData.AwbState.CONVERGED
            return r0
        L3d:
            androidx.camera.core.impl.CameraCaptureMetaData$AwbState r0 = androidx.camera.core.impl.CameraCaptureMetaData.AwbState.METERING
            return r0
        L40:
            androidx.camera.core.impl.CameraCaptureMetaData$AwbState r0 = androidx.camera.core.impl.CameraCaptureMetaData.AwbState.INACTIVE
            return r0
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @androidx.annotation.NonNull
    public android.hardware.camera2.CaptureResult getCaptureResult() {
            r1 = this;
            android.hardware.camera2.CaptureResult r0 = r1.mCaptureResult
            return r0
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @androidx.annotation.NonNull
    public androidx.camera.core.impl.CameraCaptureMetaData.FlashState getFlashState() {
            r3 = this;
            android.hardware.camera2.CaptureResult r0 = r3.mCaptureResult
            android.hardware.camera2.CaptureResult$Key r1 = android.hardware.camera2.CaptureResult.FLASH_STATE
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto Lf
            androidx.camera.core.impl.CameraCaptureMetaData$FlashState r0 = androidx.camera.core.impl.CameraCaptureMetaData.FlashState.UNKNOWN
            return r0
        Lf:
            int r1 = r0.intValue()
            if (r1 == 0) goto L40
            r2 = 1
            if (r1 == r2) goto L40
            r2 = 2
            if (r1 == r2) goto L3d
            r2 = 3
            if (r1 == r2) goto L3a
            r2 = 4
            if (r1 == r2) goto L3a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Undefined flash state: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "C2CameraCaptureResult"
            androidx.camera.core.Logger.e(r1, r0)
            androidx.camera.core.impl.CameraCaptureMetaData$FlashState r0 = androidx.camera.core.impl.CameraCaptureMetaData.FlashState.UNKNOWN
            return r0
        L3a:
            androidx.camera.core.impl.CameraCaptureMetaData$FlashState r0 = androidx.camera.core.impl.CameraCaptureMetaData.FlashState.FIRED
            return r0
        L3d:
            androidx.camera.core.impl.CameraCaptureMetaData$FlashState r0 = androidx.camera.core.impl.CameraCaptureMetaData.FlashState.READY
            return r0
        L40:
            androidx.camera.core.impl.CameraCaptureMetaData$FlashState r0 = androidx.camera.core.impl.CameraCaptureMetaData.FlashState.NONE
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
            r2 = this;
            android.hardware.camera2.CaptureResult r0 = r2.mCaptureResult
            android.hardware.camera2.CaptureResult$Key r1 = android.hardware.camera2.CaptureResult.SENSOR_TIMESTAMP
            java.lang.Object r0 = r0.get(r1)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 != 0) goto Lf
            r0 = -1
            return r0
        Lf:
            long r0 = r0.longValue()
            return r0
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public void populateExifData(@androidx.annotation.NonNull androidx.camera.core.impl.utils.ExifData.Builder r4) {
            r3 = this;
            androidx.camera.core.impl.a.b(r3, r4)
            android.hardware.camera2.CaptureResult r0 = r3.mCaptureResult
            android.hardware.camera2.CaptureResult$Key r1 = android.hardware.camera2.CaptureResult.SCALER_CROP_REGION
            java.lang.Object r0 = r0.get(r1)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            if (r0 == 0) goto L1e
            int r1 = r0.width()
            androidx.camera.core.impl.utils.ExifData$Builder r1 = r4.setImageWidth(r1)
            int r0 = r0.height()
            r1.setImageHeight(r0)
        L1e:
            android.hardware.camera2.CaptureResult r0 = r3.mCaptureResult     // Catch: java.nio.BufferUnderflowException -> L32
            android.hardware.camera2.CaptureResult$Key r1 = android.hardware.camera2.CaptureResult.JPEG_ORIENTATION     // Catch: java.nio.BufferUnderflowException -> L32
            java.lang.Object r0 = r0.get(r1)     // Catch: java.nio.BufferUnderflowException -> L32
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.nio.BufferUnderflowException -> L32
            if (r0 == 0) goto L39
            int r0 = r0.intValue()     // Catch: java.nio.BufferUnderflowException -> L32
            r4.setOrientationDegrees(r0)     // Catch: java.nio.BufferUnderflowException -> L32
            goto L39
        L32:
            java.lang.String r0 = "C2CameraCaptureResult"
            java.lang.String r1 = "Failed to get JPEG orientation."
            androidx.camera.core.Logger.w(r0, r1)
        L39:
            android.hardware.camera2.CaptureResult r0 = r3.mCaptureResult
            android.hardware.camera2.CaptureResult$Key r1 = android.hardware.camera2.CaptureResult.SENSOR_EXPOSURE_TIME
            java.lang.Object r0 = r0.get(r1)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L4c
            long r0 = r0.longValue()
            r4.setExposureTimeNanos(r0)
        L4c:
            android.hardware.camera2.CaptureResult r0 = r3.mCaptureResult
            android.hardware.camera2.CaptureResult$Key r1 = android.hardware.camera2.CaptureResult.LENS_APERTURE
            java.lang.Object r0 = r0.get(r1)
            java.lang.Float r0 = (java.lang.Float) r0
            if (r0 == 0) goto L5f
            float r0 = r0.floatValue()
            r4.setLensFNumber(r0)
        L5f:
            android.hardware.camera2.CaptureResult r0 = r3.mCaptureResult
            android.hardware.camera2.CaptureResult$Key r1 = android.hardware.camera2.CaptureResult.SENSOR_SENSITIVITY
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L99
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 24
            if (r1 < r2) goto L92
            android.hardware.camera2.CaptureResult r1 = r3.mCaptureResult
            android.hardware.camera2.CaptureResult$Key r2 = androidx.camera.camera2.internal.c.a()
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L92
            int r0 = r0.intValue()
            int r1 = r1.intValue()
            float r1 = (float) r1
            r2 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r2
            int r1 = (int) r1
            int r0 = r0 * r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L92:
            int r0 = r0.intValue()
            r4.setIso(r0)
        L99:
            android.hardware.camera2.CaptureResult r0 = r3.mCaptureResult
            android.hardware.camera2.CaptureResult$Key r1 = android.hardware.camera2.CaptureResult.LENS_FOCAL_LENGTH
            java.lang.Object r0 = r0.get(r1)
            java.lang.Float r0 = (java.lang.Float) r0
            if (r0 == 0) goto Lac
            float r0 = r0.floatValue()
            r4.setFocalLength(r0)
        Lac:
            android.hardware.camera2.CaptureResult r0 = r3.mCaptureResult
            android.hardware.camera2.CaptureResult$Key r1 = android.hardware.camera2.CaptureResult.CONTROL_AWB_MODE
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto Lc5
            androidx.camera.core.impl.utils.ExifData$WhiteBalanceMode r1 = androidx.camera.core.impl.utils.ExifData.WhiteBalanceMode.AUTO
            int r0 = r0.intValue()
            if (r0 != 0) goto Lc2
            androidx.camera.core.impl.utils.ExifData$WhiteBalanceMode r1 = androidx.camera.core.impl.utils.ExifData.WhiteBalanceMode.MANUAL
        Lc2:
            r4.setWhiteBalanceMode(r1)
        Lc5:
            return
    }
}
