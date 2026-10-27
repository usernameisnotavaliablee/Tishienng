package com.google.mlkit.common.sdkinternal.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface ModelValidator {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.android.gms.common.annotation.KeepForSdk
    public static class ValidationResult {

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public static final com.google.mlkit.common.sdkinternal.model.ModelValidator.ValidationResult VALID = null;
        private final com.google.mlkit.common.sdkinternal.model.ModelValidator.ValidationResult.ErrorCode zza;

        @androidx.annotation.Nullable
        private final java.lang.String zzb;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @com.google.android.gms.common.annotation.KeepForSdk
        public enum ErrorCode extends java.lang.Enum<com.google.mlkit.common.sdkinternal.model.ModelValidator.ValidationResult.ErrorCode> {

            @androidx.annotation.NonNull
            @com.google.android.gms.common.annotation.KeepForSdk
            public static final com.google.mlkit.common.sdkinternal.model.ModelValidator.ValidationResult.ErrorCode MODEL_FORMAT_INVALID = null;

            @androidx.annotation.NonNull
            @com.google.android.gms.common.annotation.KeepForSdk
            public static final com.google.mlkit.common.sdkinternal.model.ModelValidator.ValidationResult.ErrorCode OK = null;

            @androidx.annotation.NonNull
            @com.google.android.gms.common.annotation.KeepForSdk
            public static final com.google.mlkit.common.sdkinternal.model.ModelValidator.ValidationResult.ErrorCode TFLITE_VERSION_INCOMPATIBLE = null;
            private static final /* synthetic */ com.google.mlkit.common.sdkinternal.model.ModelValidator.ValidationResult.ErrorCode[] zza = null;

            static {
                    com.google.mlkit.common.sdkinternal.model.ModelValidator$ValidationResult$ErrorCode r0 = new com.google.mlkit.common.sdkinternal.model.ModelValidator$ValidationResult$ErrorCode
                    java.lang.String r1 = "OK"
                    r2 = 0
                    r0.<init>(r1, r2)
                    com.google.mlkit.common.sdkinternal.model.ModelValidator.ValidationResult.ErrorCode.OK = r0
                    com.google.mlkit.common.sdkinternal.model.ModelValidator$ValidationResult$ErrorCode r1 = new com.google.mlkit.common.sdkinternal.model.ModelValidator$ValidationResult$ErrorCode
                    java.lang.String r3 = "TFLITE_VERSION_INCOMPATIBLE"
                    r4 = 1
                    r1.<init>(r3, r4)
                    com.google.mlkit.common.sdkinternal.model.ModelValidator.ValidationResult.ErrorCode.TFLITE_VERSION_INCOMPATIBLE = r1
                    com.google.mlkit.common.sdkinternal.model.ModelValidator$ValidationResult$ErrorCode r3 = new com.google.mlkit.common.sdkinternal.model.ModelValidator$ValidationResult$ErrorCode
                    java.lang.String r5 = "MODEL_FORMAT_INVALID"
                    r6 = 2
                    r3.<init>(r5, r6)
                    com.google.mlkit.common.sdkinternal.model.ModelValidator.ValidationResult.ErrorCode.MODEL_FORMAT_INVALID = r3
                    r5 = 3
                    com.google.mlkit.common.sdkinternal.model.ModelValidator$ValidationResult$ErrorCode[] r5 = new com.google.mlkit.common.sdkinternal.model.ModelValidator.ValidationResult.ErrorCode[r5]
                    r5[r2] = r0
                    r5[r4] = r1
                    r5[r6] = r3
                    com.google.mlkit.common.sdkinternal.model.ModelValidator.ValidationResult.ErrorCode.zza = r5
                    return
            }

            ErrorCode(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            @androidx.annotation.NonNull
            public static com.google.mlkit.common.sdkinternal.model.ModelValidator.ValidationResult.ErrorCode[] values() {
                    com.google.mlkit.common.sdkinternal.model.ModelValidator$ValidationResult$ErrorCode[] r0 = com.google.mlkit.common.sdkinternal.model.ModelValidator.ValidationResult.ErrorCode.zza
                    java.lang.Object r0 = r0.clone()
                    com.google.mlkit.common.sdkinternal.model.ModelValidator$ValidationResult$ErrorCode[] r0 = (com.google.mlkit.common.sdkinternal.model.ModelValidator.ValidationResult.ErrorCode[]) r0
                    return r0
            }
        }

        static {
                com.google.mlkit.common.sdkinternal.model.ModelValidator$ValidationResult r0 = new com.google.mlkit.common.sdkinternal.model.ModelValidator$ValidationResult
                com.google.mlkit.common.sdkinternal.model.ModelValidator$ValidationResult$ErrorCode r1 = com.google.mlkit.common.sdkinternal.model.ModelValidator.ValidationResult.ErrorCode.OK
                r2 = 0
                r0.<init>(r1, r2)
                com.google.mlkit.common.sdkinternal.model.ModelValidator.ValidationResult.VALID = r0
                return
        }

        @com.google.android.gms.common.annotation.KeepForSdk
        public ValidationResult(@androidx.annotation.NonNull com.google.mlkit.common.sdkinternal.model.ModelValidator.ValidationResult.ErrorCode r1, @androidx.annotation.Nullable java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.zza = r1
                r0.zzb = r2
                return
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public com.google.mlkit.common.sdkinternal.model.ModelValidator.ValidationResult.ErrorCode getErrorCode() {
                r1 = this;
                com.google.mlkit.common.sdkinternal.model.ModelValidator$ValidationResult$ErrorCode r0 = r1.zza
                return r0
        }

        @androidx.annotation.Nullable
        @com.google.android.gms.common.annotation.KeepForSdk
        public java.lang.String getErrorMessage() {
                r1 = this;
                java.lang.String r0 = r1.zzb
                return r0
        }

        @com.google.android.gms.common.annotation.KeepForSdk
        public boolean isValid() {
                r2 = this;
                com.google.mlkit.common.sdkinternal.model.ModelValidator$ValidationResult$ErrorCode r0 = r2.zza
                com.google.mlkit.common.sdkinternal.model.ModelValidator$ValidationResult$ErrorCode r1 = com.google.mlkit.common.sdkinternal.model.ModelValidator.ValidationResult.ErrorCode.OK
                if (r0 != r1) goto L8
                r0 = 1
                return r0
            L8:
                r0 = 0
                return r0
        }
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    com.google.mlkit.common.sdkinternal.model.ModelValidator.ValidationResult validateModel(@androidx.annotation.NonNull java.io.File r1, @androidx.annotation.NonNull com.google.mlkit.common.model.RemoteModel r2);
}
