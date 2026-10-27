package com.google.mlkit.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class MlKitException extends java.lang.Exception {
    public static final int ABORTED = 10;
    public static final int ALREADY_EXISTS = 6;
    public static final int CANCELLED = 1;
    public static final int CODE_SCANNER_APP_NAME_UNAVAILABLE = 203;
    public static final int CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED = 202;
    public static final int CODE_SCANNER_CANCELLED = 201;
    public static final int CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD = 207;
    public static final int CODE_SCANNER_PIPELINE_INFERENCE_ERROR = 206;
    public static final int CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR = 205;
    public static final int CODE_SCANNER_TASK_IN_PROGRESS = 204;
    public static final int CODE_SCANNER_UNAVAILABLE = 200;
    public static final int DATA_LOSS = 15;
    public static final int DEADLINE_EXCEEDED = 4;
    public static final int FAILED_PRECONDITION = 9;
    public static final int INTERNAL = 13;
    public static final int INVALID_ARGUMENT = 3;

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final int LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE = 300;

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final int LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE = 301;
    public static final int MODEL_HASH_MISMATCH = 102;
    public static final int MODEL_INCOMPATIBLE_WITH_TFLITE = 100;
    public static final int NETWORK_ISSUE = 17;
    public static final int NOT_ENOUGH_SPACE = 101;
    public static final int NOT_FOUND = 5;
    public static final int OUT_OF_RANGE = 11;
    public static final int PERMISSION_DENIED = 7;
    public static final int RESOURCE_EXHAUSTED = 8;
    public static final int UNAUTHENTICATED = 16;
    public static final int UNAVAILABLE = 14;
    public static final int UNIMPLEMENTED = 12;
    public static final int UNKNOWN = 2;
    public static final int UNSUPPORTED = 18;

    @com.google.mlkit.common.MlKitException.ErrorCode
    private final int zza;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    public @interface ErrorCode {
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public MlKitException(@androidx.annotation.NonNull java.lang.String r2, @com.google.mlkit.common.MlKitException.ErrorCode int r3) {
            r1 = this;
            java.lang.String r0 = "Provided message must not be empty."
            java.lang.String r2 = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2, r0)
            r1.<init>(r2)
            r1.zza = r3
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public MlKitException(@androidx.annotation.NonNull java.lang.String r2, @com.google.mlkit.common.MlKitException.ErrorCode int r3, @androidx.annotation.Nullable java.lang.Throwable r4) {
            r1 = this;
            java.lang.String r0 = "Provided message must not be empty."
            java.lang.String r2 = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2, r0)
            r1.<init>(r2, r4)
            r1.zza = r3
            return
    }

    @com.google.mlkit.common.MlKitException.ErrorCode
    public int getErrorCode() {
            r1 = this;
            int r0 = r1.zza
            return r0
    }
}
