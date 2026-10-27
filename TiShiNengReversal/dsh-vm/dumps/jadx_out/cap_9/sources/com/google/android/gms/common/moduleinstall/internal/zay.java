package com.google.android.gms.common.moduleinstall.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zay extends com.google.android.gms.common.api.GoogleApi implements com.google.android.gms.common.moduleinstall.ModuleInstallClient {
    public static final /* synthetic */ int zab = 0;
    private static final com.google.android.gms.common.api.Api.ClientKey zac = null;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zad = null;
    private static final com.google.android.gms.common.api.Api zae = null;

    static {
            com.google.android.gms.common.api.Api$ClientKey r0 = new com.google.android.gms.common.api.Api$ClientKey
            r0.<init>()
            com.google.android.gms.common.moduleinstall.internal.zay.zac = r0
            com.google.android.gms.common.moduleinstall.internal.zaq r1 = new com.google.android.gms.common.moduleinstall.internal.zaq
            r1.<init>()
            com.google.android.gms.common.moduleinstall.internal.zay.zad = r1
            com.google.android.gms.common.api.Api r2 = new com.google.android.gms.common.api.Api
            java.lang.String r3 = "ModuleInstall.API"
            r2.<init>(r3, r1, r0)
            com.google.android.gms.common.moduleinstall.internal.zay.zae = r2
            return
    }

    public zay(android.app.Activity r4) {
            r3 = this;
            com.google.android.gms.common.api.Api r0 = com.google.android.gms.common.moduleinstall.internal.zay.zae
            com.google.android.gms.common.api.Api$ApiOptions$NoOptions r1 = com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS
            com.google.android.gms.common.api.GoogleApi$Settings r2 = com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS
            r3.<init>(r4, r0, r1, r2)
            return
    }

    public zay(android.content.Context r4) {
            r3 = this;
            com.google.android.gms.common.api.Api r0 = com.google.android.gms.common.moduleinstall.internal.zay.zae
            com.google.android.gms.common.api.Api$ApiOptions$NoOptions r1 = com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS
            com.google.android.gms.common.api.GoogleApi$Settings r2 = com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS
            r3.<init>(r4, r0, r1, r2)
            return
    }

    static final com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest zad(boolean r4, com.google.android.gms.common.api.OptionalModuleApi... r5) {
            java.lang.String r0 = "Requested APIs must not be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5, r0)
            int r0 = r5.length
            r1 = 0
            if (r0 <= 0) goto Lb
            r2 = 1
            goto Lc
        Lb:
            r2 = 0
        Lc:
            java.lang.String r3 = "Please provide at least one OptionalModuleApi."
            com.google.android.gms.common.internal.Preconditions.checkArgument(r2, r3)
        L11:
            if (r1 >= r0) goto L1d
            r2 = r5[r1]
            java.lang.String r3 = "Requested API must not be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r3)
            int r1 = r1 + 1
            goto L11
        L1d:
            java.util.List r5 = java.util.Arrays.asList(r5)
            com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest r4 = com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest.zaa(r5, r4)
            return r4
    }

    @Override // com.google.android.gms.common.moduleinstall.ModuleInstallClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse> areModulesAvailable(com.google.android.gms.common.api.OptionalModuleApi... r5) {
            r4 = this;
            r0 = 0
            com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest r5 = zad(r0, r5)
            java.util.List r1 = r5.getApiFeatures()
            boolean r1 = r1.isEmpty()
            r2 = 1
            if (r1 == 0) goto L1a
            com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse r5 = new com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse
            r5.<init>(r2, r0)
            com.google.android.gms.tasks.Task r5 = com.google.android.gms.tasks.Tasks.forResult(r5)
            return r5
        L1a:
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r1 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.common.Feature[] r2 = new com.google.android.gms.common.Feature[r2]
            com.google.android.gms.common.Feature r3 = com.google.android.gms.internal.base.zav.zaa
            r2[r0] = r3
            r1.setFeatures(r2)
            r2 = 27301(0x6aa5, float:3.8257E-41)
            r1.setMethodKey(r2)
            r1.setAutoResolveMissingFeatures(r0)
            com.google.android.gms.common.moduleinstall.internal.zal r0 = new com.google.android.gms.common.moduleinstall.internal.zal
            r0.<init>(r4, r5)
            r1.run(r0)
            com.google.android.gms.common.api.internal.TaskApiCall r5 = r1.build()
            com.google.android.gms.tasks.Task r5 = r4.doRead(r5)
            return r5
    }

    @Override // com.google.android.gms.common.moduleinstall.ModuleInstallClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> deferredInstall(com.google.android.gms.common.api.OptionalModuleApi... r5) {
            r4 = this;
            r0 = 0
            com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest r5 = zad(r0, r5)
            java.util.List r1 = r5.getApiFeatures()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L15
            r5 = 0
            com.google.android.gms.tasks.Task r5 = com.google.android.gms.tasks.Tasks.forResult(r5)
            return r5
        L15:
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r1 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            r2 = 1
            com.google.android.gms.common.Feature[] r2 = new com.google.android.gms.common.Feature[r2]
            com.google.android.gms.common.Feature r3 = com.google.android.gms.internal.base.zav.zaa
            r2[r0] = r3
            r1.setFeatures(r2)
            r2 = 27302(0x6aa6, float:3.8258E-41)
            r1.setMethodKey(r2)
            r1.setAutoResolveMissingFeatures(r0)
            com.google.android.gms.common.moduleinstall.internal.zap r0 = new com.google.android.gms.common.moduleinstall.internal.zap
            r0.<init>(r4, r5)
            r1.run(r0)
            com.google.android.gms.common.api.internal.TaskApiCall r5 = r1.build()
            com.google.android.gms.tasks.Task r5 = r4.doRead(r5)
            return r5
    }

    @Override // com.google.android.gms.common.moduleinstall.ModuleInstallClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse> getInstallModulesIntent(com.google.android.gms.common.api.OptionalModuleApi... r5) {
            r4 = this;
            r0 = 1
            com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest r5 = zad(r0, r5)
            java.util.List r1 = r5.getApiFeatures()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L1a
            com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse r5 = new com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse
            r0 = 0
            r5.<init>(r0)
            com.google.android.gms.tasks.Task r5 = com.google.android.gms.tasks.Tasks.forResult(r5)
            return r5
        L1a:
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r1 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.common.Feature[] r0 = new com.google.android.gms.common.Feature[r0]
            com.google.android.gms.common.Feature r2 = com.google.android.gms.internal.base.zav.zaa
            r3 = 0
            r0[r3] = r2
            r1.setFeatures(r0)
            r0 = 27307(0x6aab, float:3.8265E-41)
            r1.setMethodKey(r0)
            com.google.android.gms.common.moduleinstall.internal.zan r0 = new com.google.android.gms.common.moduleinstall.internal.zan
            r0.<init>(r4, r5)
            r1.run(r0)
            com.google.android.gms.common.api.internal.TaskApiCall r5 = r1.build()
            com.google.android.gms.tasks.Task r5 = r4.doRead(r5)
            return r5
    }

    @Override // com.google.android.gms.common.moduleinstall.ModuleInstallClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.common.moduleinstall.ModuleInstallResponse> installModules(com.google.android.gms.common.moduleinstall.ModuleInstallRequest r9) {
            r8 = this;
            com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest r4 = com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest.fromModuleInstallRequest(r9)
            com.google.android.gms.common.moduleinstall.InstallStatusListener r3 = r9.getListener()
            java.util.concurrent.Executor r9 = r9.getListenerExecutor()
            java.util.List r0 = r4.getApiFeatures()
            boolean r0 = r0.isEmpty()
            r6 = 0
            if (r0 == 0) goto L21
            com.google.android.gms.common.moduleinstall.ModuleInstallResponse r9 = new com.google.android.gms.common.moduleinstall.ModuleInstallResponse
            r9.<init>(r6)
            com.google.android.gms.tasks.Task r9 = com.google.android.gms.tasks.Tasks.forResult(r9)
            return r9
        L21:
            r7 = 1
            if (r3 != 0) goto L4a
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r9 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.common.Feature[] r0 = new com.google.android.gms.common.Feature[r7]
            com.google.android.gms.common.Feature r1 = com.google.android.gms.internal.base.zav.zaa
            r0[r6] = r1
            r9.setFeatures(r0)
            r9.setAutoResolveMissingFeatures(r7)
            r0 = 27304(0x6aa8, float:3.8261E-41)
            r9.setMethodKey(r0)
            com.google.android.gms.common.moduleinstall.internal.zao r0 = new com.google.android.gms.common.moduleinstall.internal.zao
            r0.<init>(r8, r4)
            r9.run(r0)
            com.google.android.gms.common.api.internal.TaskApiCall r9 = r9.build()
            com.google.android.gms.tasks.Task r9 = r8.doRead(r9)
            return r9
        L4a:
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            java.lang.Class<com.google.android.gms.common.moduleinstall.InstallStatusListener> r0 = com.google.android.gms.common.moduleinstall.InstallStatusListener.class
            if (r9 != 0) goto L5a
            java.lang.String r9 = r0.getSimpleName()
            com.google.android.gms.common.api.internal.ListenerHolder r9 = r8.registerListener(r3, r9)
            goto L62
        L5a:
            java.lang.String r0 = r0.getSimpleName()
            com.google.android.gms.common.api.internal.ListenerHolder r9 = com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(r3, r9, r0)
        L62:
            com.google.android.gms.common.moduleinstall.internal.zaab r5 = new com.google.android.gms.common.moduleinstall.internal.zaab
            r5.<init>(r9)
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r2.<init>()
            com.google.android.gms.common.moduleinstall.internal.zai r0 = new com.google.android.gms.common.moduleinstall.internal.zai
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            com.google.android.gms.common.moduleinstall.internal.zaj r3 = new com.google.android.gms.common.moduleinstall.internal.zaj
            r3.<init>(r8, r5)
            com.google.android.gms.common.api.internal.RegistrationMethods$Builder r4 = com.google.android.gms.common.api.internal.RegistrationMethods.builder()
            r4.withHolder(r9)
            com.google.android.gms.common.Feature[] r9 = new com.google.android.gms.common.Feature[r7]
            com.google.android.gms.common.Feature r5 = com.google.android.gms.internal.base.zav.zaa
            r9[r6] = r5
            r4.setFeatures(r9)
            r4.setAutoResolveMissingFeatures(r7)
            r4.register(r0)
            r4.unregister(r3)
            r9 = 27305(0x6aa9, float:3.8262E-41)
            r4.setMethodKey(r9)
            com.google.android.gms.common.api.internal.RegistrationMethods r9 = r4.build()
            com.google.android.gms.tasks.Task r9 = r8.doRegisterEventListener(r9)
            com.google.android.gms.common.moduleinstall.internal.zak r0 = new com.google.android.gms.common.moduleinstall.internal.zak
            r0.<init>(r2)
            com.google.android.gms.tasks.Task r9 = r9.onSuccessTask(r0)
            return r9
    }

    @Override // com.google.android.gms.common.moduleinstall.ModuleInstallClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> releaseModules(com.google.android.gms.common.api.OptionalModuleApi... r5) {
            r4 = this;
            r0 = 0
            com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest r5 = zad(r0, r5)
            java.util.List r1 = r5.getApiFeatures()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L15
            r5 = 0
            com.google.android.gms.tasks.Task r5 = com.google.android.gms.tasks.Tasks.forResult(r5)
            return r5
        L15:
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r1 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            r2 = 1
            com.google.android.gms.common.Feature[] r2 = new com.google.android.gms.common.Feature[r2]
            com.google.android.gms.common.Feature r3 = com.google.android.gms.internal.base.zav.zaa
            r2[r0] = r3
            r1.setFeatures(r2)
            r2 = 27303(0x6aa7, float:3.826E-41)
            r1.setMethodKey(r2)
            r1.setAutoResolveMissingFeatures(r0)
            com.google.android.gms.common.moduleinstall.internal.zam r0 = new com.google.android.gms.common.moduleinstall.internal.zam
            r0.<init>(r4, r5)
            r1.run(r0)
            com.google.android.gms.common.api.internal.TaskApiCall r5 = r1.build()
            com.google.android.gms.tasks.Task r5 = r4.doRead(r5)
            return r5
    }

    @Override // com.google.android.gms.common.moduleinstall.ModuleInstallClient
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final com.google.android.gms.tasks.Task<java.lang.Boolean> unregisterListener(com.google.android.gms.common.moduleinstall.InstallStatusListener r2) {
            r1 = this;
            java.lang.Class<com.google.android.gms.common.moduleinstall.InstallStatusListener> r0 = com.google.android.gms.common.moduleinstall.InstallStatusListener.class
            java.lang.String r0 = r0.getSimpleName()
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r2 = com.google.android.gms.common.api.internal.ListenerHolders.createListenerKey(r2, r0)
            r0 = 27306(0x6aaa, float:3.8264E-41)
            com.google.android.gms.tasks.Task r2 = r1.doUnregisterEventListener(r2, r0)
            return r2
    }
}
