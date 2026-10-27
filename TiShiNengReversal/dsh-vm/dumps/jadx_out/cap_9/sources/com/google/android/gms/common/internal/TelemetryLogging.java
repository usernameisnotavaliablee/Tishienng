package com.google.android.gms.common.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class TelemetryLogging {
    private TelemetryLogging() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.common.internal.TelemetryLoggingClient getClient(@androidx.annotation.NonNull android.content.Context r1) {
            com.google.android.gms.common.internal.TelemetryLoggingOptions r0 = com.google.android.gms.common.internal.TelemetryLoggingOptions.zaa
            com.google.android.gms.common.internal.TelemetryLoggingClient r1 = getClient(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.common.internal.TelemetryLoggingClient getClient(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull com.google.android.gms.common.internal.TelemetryLoggingOptions r2) {
            com.google.android.gms.common.internal.service.zao r0 = new com.google.android.gms.common.internal.service.zao
            r0.<init>(r1, r2)
            return r0
    }
}
