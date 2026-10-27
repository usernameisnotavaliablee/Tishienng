package com.google.android.datatransport.cct.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.auto.value.AutoValue
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class LogRequest {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.auto.value.AutoValue.Builder
    public static abstract class Builder {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        public abstract com.google.android.datatransport.cct.internal.LogRequest build();

        @androidx.annotation.NonNull
        public abstract com.google.android.datatransport.cct.internal.LogRequest.Builder setClientInfo(@androidx.annotation.Nullable com.google.android.datatransport.cct.internal.ClientInfo r1);

        @androidx.annotation.NonNull
        public abstract com.google.android.datatransport.cct.internal.LogRequest.Builder setLogEvents(@androidx.annotation.Nullable java.util.List<com.google.android.datatransport.cct.internal.LogEvent> r1);

        @androidx.annotation.NonNull
        abstract com.google.android.datatransport.cct.internal.LogRequest.Builder setLogSource(@androidx.annotation.Nullable java.lang.Integer r1);

        @androidx.annotation.NonNull
        abstract com.google.android.datatransport.cct.internal.LogRequest.Builder setLogSourceName(@androidx.annotation.Nullable java.lang.String r1);

        @androidx.annotation.NonNull
        public abstract com.google.android.datatransport.cct.internal.LogRequest.Builder setQosTier(@androidx.annotation.Nullable com.google.android.datatransport.cct.internal.QosTier r1);

        @androidx.annotation.NonNull
        public abstract com.google.android.datatransport.cct.internal.LogRequest.Builder setRequestTimeMs(long r1);

        @androidx.annotation.NonNull
        public abstract com.google.android.datatransport.cct.internal.LogRequest.Builder setRequestUptimeMs(long r1);

        @androidx.annotation.NonNull
        public com.google.android.datatransport.cct.internal.LogRequest.Builder setSource(int r1) {
                r0 = this;
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                com.google.android.datatransport.cct.internal.LogRequest$Builder r1 = r0.setLogSource(r1)
                return r1
        }

        @androidx.annotation.NonNull
        public com.google.android.datatransport.cct.internal.LogRequest.Builder setSource(@androidx.annotation.NonNull java.lang.String r1) {
                r0 = this;
                com.google.android.datatransport.cct.internal.LogRequest$Builder r1 = r0.setLogSourceName(r1)
                return r1
        }
    }

    public LogRequest() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static com.google.android.datatransport.cct.internal.LogRequest.Builder builder() {
            com.google.android.datatransport.cct.internal.AutoValue_LogRequest$Builder r0 = new com.google.android.datatransport.cct.internal.AutoValue_LogRequest$Builder
            r0.<init>()
            return r0
    }

    @androidx.annotation.Nullable
    public abstract com.google.android.datatransport.cct.internal.ClientInfo getClientInfo();

    @androidx.annotation.Nullable
    @com.google.firebase.encoders.annotations.Encodable.Field(name = "logEvent")
    public abstract java.util.List<com.google.android.datatransport.cct.internal.LogEvent> getLogEvents();

    @androidx.annotation.Nullable
    public abstract java.lang.Integer getLogSource();

    @androidx.annotation.Nullable
    public abstract java.lang.String getLogSourceName();

    @androidx.annotation.Nullable
    public abstract com.google.android.datatransport.cct.internal.QosTier getQosTier();

    public abstract long getRequestTimeMs();

    public abstract long getRequestUptimeMs();
}
