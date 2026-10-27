package com.google.android.gms.common.moduleinstall;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface ModuleInstallClient extends com.google.android.gms.common.api.HasApiKey<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> {
    @androidx.annotation.NonNull
    com.google.android.gms.tasks.Task<com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse> areModulesAvailable(@androidx.annotation.NonNull com.google.android.gms.common.api.OptionalModuleApi... r1);

    @androidx.annotation.NonNull
    com.google.android.gms.tasks.Task<java.lang.Void> deferredInstall(@androidx.annotation.NonNull com.google.android.gms.common.api.OptionalModuleApi... r1);

    @androidx.annotation.NonNull
    com.google.android.gms.tasks.Task<com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse> getInstallModulesIntent(@androidx.annotation.NonNull com.google.android.gms.common.api.OptionalModuleApi... r1);

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    com.google.android.gms.tasks.Task<com.google.android.gms.common.moduleinstall.ModuleInstallResponse> installModules(@androidx.annotation.NonNull com.google.android.gms.common.moduleinstall.ModuleInstallRequest r1);

    @androidx.annotation.NonNull
    com.google.android.gms.tasks.Task<java.lang.Void> releaseModules(@androidx.annotation.NonNull com.google.android.gms.common.api.OptionalModuleApi... r1);

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    com.google.android.gms.tasks.Task<java.lang.Boolean> unregisterListener(@androidx.annotation.NonNull com.google.android.gms.common.moduleinstall.InstallStatusListener r1);
}
