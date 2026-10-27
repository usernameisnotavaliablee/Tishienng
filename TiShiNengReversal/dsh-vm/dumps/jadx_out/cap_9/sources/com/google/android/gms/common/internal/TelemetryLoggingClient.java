package com.google.android.gms.common.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.errorprone.annotations.DoNotMock("Use canonical fakes instead. go/cheezhead-testing-methodology")
@com.google.android.gms.common.annotation.KeepForSdk
@com.google.errorprone.annotations.RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", explanation = "Use canonical fakes instead.", link = "go/gmscore-restrictedinheritance")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface TelemetryLoggingClient extends com.google.android.gms.common.api.HasApiKey<com.google.android.gms.common.internal.TelemetryLoggingOptions> {
    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    @com.google.android.gms.common.annotation.KeepForSdk
    com.google.android.gms.tasks.Task<java.lang.Void> log(@androidx.annotation.NonNull com.google.android.gms.common.internal.TelemetryData r1);
}
