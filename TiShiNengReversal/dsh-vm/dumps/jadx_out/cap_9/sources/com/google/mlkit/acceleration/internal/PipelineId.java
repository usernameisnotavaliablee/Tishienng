package com.google.mlkit.acceleration.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class PipelineId {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.android.gms.common.annotation.KeepForSdk
    public static abstract class Builder {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public abstract com.google.mlkit.acceleration.internal.PipelineId build();

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public abstract com.google.mlkit.acceleration.internal.PipelineId.Builder setClientLibraryName(@androidx.annotation.NonNull java.lang.String r1);

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public abstract com.google.mlkit.acceleration.internal.PipelineId.Builder setClientLibraryVersion(@androidx.annotation.NonNull java.lang.String r1);

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public abstract com.google.mlkit.acceleration.internal.PipelineId.Builder setName(@androidx.annotation.NonNull java.lang.String r1);

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public abstract com.google.mlkit.acceleration.internal.PipelineId.Builder setNamespace(@androidx.annotation.NonNull java.lang.String r1);
    }

    public PipelineId() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.mlkit.acceleration.internal.PipelineId.Builder builder() {
            com.google.mlkit.acceleration.internal.zzd r0 = new com.google.mlkit.acceleration.internal.zzd
            r0.<init>()
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public abstract java.lang.String getClientLibraryName();

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public abstract java.lang.String getClientLibraryVersion();

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public abstract java.lang.String getName();

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public abstract java.lang.String getNamespace();
}
