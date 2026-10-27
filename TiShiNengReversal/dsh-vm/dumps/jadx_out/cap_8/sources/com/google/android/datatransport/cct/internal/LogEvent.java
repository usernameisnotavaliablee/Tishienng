package com.google.android.datatransport.cct.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.auto.value.AutoValue
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class LogEvent {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.auto.value.AutoValue.Builder
    public static abstract class Builder {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        public abstract com.google.android.datatransport.cct.internal.LogEvent build();

        @androidx.annotation.NonNull
        public abstract com.google.android.datatransport.cct.internal.LogEvent.Builder setEventCode(@androidx.annotation.Nullable java.lang.Integer r1);

        @androidx.annotation.NonNull
        public abstract com.google.android.datatransport.cct.internal.LogEvent.Builder setEventTimeMs(long r1);

        @androidx.annotation.NonNull
        public abstract com.google.android.datatransport.cct.internal.LogEvent.Builder setEventUptimeMs(long r1);

        @androidx.annotation.NonNull
        public abstract com.google.android.datatransport.cct.internal.LogEvent.Builder setNetworkConnectionInfo(@androidx.annotation.Nullable com.google.android.datatransport.cct.internal.NetworkConnectionInfo r1);

        @androidx.annotation.NonNull
        abstract com.google.android.datatransport.cct.internal.LogEvent.Builder setSourceExtension(@androidx.annotation.Nullable byte[] r1);

        @androidx.annotation.NonNull
        abstract com.google.android.datatransport.cct.internal.LogEvent.Builder setSourceExtensionJsonProto3(@androidx.annotation.Nullable java.lang.String r1);

        @androidx.annotation.NonNull
        public abstract com.google.android.datatransport.cct.internal.LogEvent.Builder setTimezoneOffsetSeconds(long r1);
    }

    public LogEvent() {
            r0 = this;
            r0.<init>()
            return
    }

    private static com.google.android.datatransport.cct.internal.LogEvent.Builder builder() {
            com.google.android.datatransport.cct.internal.AutoValue_LogEvent$Builder r0 = new com.google.android.datatransport.cct.internal.AutoValue_LogEvent$Builder
            r0.<init>()
            return r0
    }

    @androidx.annotation.NonNull
    public static com.google.android.datatransport.cct.internal.LogEvent.Builder jsonBuilder(@androidx.annotation.NonNull java.lang.String r1) {
            com.google.android.datatransport.cct.internal.LogEvent$Builder r0 = builder()
            com.google.android.datatransport.cct.internal.LogEvent$Builder r1 = r0.setSourceExtensionJsonProto3(r1)
            return r1
    }

    @androidx.annotation.NonNull
    public static com.google.android.datatransport.cct.internal.LogEvent.Builder protoBuilder(@androidx.annotation.NonNull byte[] r1) {
            com.google.android.datatransport.cct.internal.LogEvent$Builder r0 = builder()
            com.google.android.datatransport.cct.internal.LogEvent$Builder r1 = r0.setSourceExtension(r1)
            return r1
    }

    @androidx.annotation.Nullable
    public abstract java.lang.Integer getEventCode();

    public abstract long getEventTimeMs();

    public abstract long getEventUptimeMs();

    @androidx.annotation.Nullable
    public abstract com.google.android.datatransport.cct.internal.NetworkConnectionInfo getNetworkConnectionInfo();

    @androidx.annotation.Nullable
    public abstract byte[] getSourceExtension();

    @androidx.annotation.Nullable
    public abstract java.lang.String getSourceExtensionJsonProto3();

    public abstract long getTimezoneOffsetSeconds();
}
