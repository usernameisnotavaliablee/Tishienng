package com.google.android.gms.common.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class TelemetryLoggingOptions implements com.google.android.gms.common.api.Api.ApiOptions.Optional {

    @androidx.annotation.NonNull
    public static final com.google.android.gms.common.internal.TelemetryLoggingOptions zaa = null;

    @androidx.annotation.Nullable
    private final java.lang.String zab;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.android.gms.common.annotation.KeepForSdk
    public static class Builder {

        @androidx.annotation.Nullable
        private java.lang.String zaa;

        private Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ Builder(com.google.android.gms.common.internal.zaac r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public com.google.android.gms.common.internal.TelemetryLoggingOptions build() {
                r3 = this;
                com.google.android.gms.common.internal.TelemetryLoggingOptions r0 = new com.google.android.gms.common.internal.TelemetryLoggingOptions
                java.lang.String r1 = r3.zaa
                r2 = 0
                r0.<init>(r1, r2)
                return r0
        }

        @androidx.annotation.NonNull
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @com.google.android.gms.common.annotation.KeepForSdk
        public com.google.android.gms.common.internal.TelemetryLoggingOptions.Builder setApi(@androidx.annotation.Nullable java.lang.String r1) {
                r0 = this;
                r0.zaa = r1
                return r0
        }
    }

    static {
            com.google.android.gms.common.internal.TelemetryLoggingOptions$Builder r0 = builder()
            com.google.android.gms.common.internal.TelemetryLoggingOptions r0 = r0.build()
            com.google.android.gms.common.internal.TelemetryLoggingOptions.zaa = r0
            return
    }

    /* synthetic */ TelemetryLoggingOptions(java.lang.String r1, com.google.android.gms.common.internal.zaad r2) {
            r0 = this;
            r0.<init>()
            r0.zab = r1
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.common.internal.TelemetryLoggingOptions.Builder builder() {
            com.google.android.gms.common.internal.TelemetryLoggingOptions$Builder r0 = new com.google.android.gms.common.internal.TelemetryLoggingOptions$Builder
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    public final boolean equals(@androidx.annotation.Nullable java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof com.google.android.gms.common.internal.TelemetryLoggingOptions
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            com.google.android.gms.common.internal.TelemetryLoggingOptions r2 = (com.google.android.gms.common.internal.TelemetryLoggingOptions) r2
            java.lang.String r0 = r1.zab
            java.lang.String r2 = r2.zab
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.zab
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r1)
            return r0
    }

    @androidx.annotation.NonNull
    public final android.os.Bundle zaa() {
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = r3.zab
            if (r1 == 0) goto Le
            java.lang.String r2 = "api"
            r0.putString(r2, r1)
        Le:
            return r0
    }
}
