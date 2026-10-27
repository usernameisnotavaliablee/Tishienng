package com.google.android.gms.common.moduleinstall.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zaz extends com.google.android.gms.common.internal.GmsClient {
    protected zaz(android.content.Context r8, android.os.Looper r9, com.google.android.gms.common.internal.ClientSettings r10, com.google.android.gms.common.api.internal.ConnectionCallbacks r11, com.google.android.gms.common.api.internal.OnConnectionFailedListener r12) {
            r7 = this;
            r3 = 308(0x134, float:4.32E-43)
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @androidx.annotation.Nullable
    protected final /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            java.lang.String r0 = "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.common.moduleinstall.internal.zaf
            if (r1 == 0) goto L11
            com.google.android.gms.common.moduleinstall.internal.zaf r0 = (com.google.android.gms.common.moduleinstall.internal.zaf) r0
            return r0
        L11:
            com.google.android.gms.common.moduleinstall.internal.zaf r0 = new com.google.android.gms.common.moduleinstall.internal.zaf
            r0.<init>(r3)
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final com.google.android.gms.common.Feature[] getApiFeatures() {
            r1 = this;
            com.google.android.gms.common.Feature[] r0 = com.google.android.gms.internal.base.zav.zab
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
            r1 = this;
            r0 = 17895000(0x1110e58, float:2.6642585E-38)
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @androidx.annotation.NonNull
    protected final java.lang.String getServiceDescriptor() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService"
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @androidx.annotation.NonNull
    protected final java.lang.String getStartServiceAction() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.chimera.container.moduleinstall.ModuleInstallService.START"
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final boolean getUseDynamicLookup() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
            r1 = this;
            r0 = 1
            return r0
    }
}
