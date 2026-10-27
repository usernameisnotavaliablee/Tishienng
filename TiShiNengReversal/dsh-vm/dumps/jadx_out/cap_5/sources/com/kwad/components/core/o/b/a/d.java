package com.kwad.components.core.o.b.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class d implements com.kwad.components.offline.api.core.api.IEnvironment {
    d() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.kwad.components.offline.api.core.api.IEnvironment
    public final void addOnAudioConflictListener(android.content.Context r1, com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener r2) {
            r0 = this;
            if (r1 == 0) goto Lc
            if (r2 != 0) goto L5
            goto Lc
        L5:
            com.kwad.components.core.t.a r1 = com.kwad.components.core.t.a.aC(r1)
            r1.a(r2)
        Lc:
            return
    }

    @Override // com.kwad.components.offline.api.core.api.IEnvironment
    public final java.lang.String getAppId() {
            r1 = this;
            java.lang.String r0 = com.kwad.sdk.service.ServiceProvider.getAppId()
            return r0
    }

    @Override // com.kwad.components.offline.api.core.api.IEnvironment
    public final java.lang.String getAppVersion() {
            r1 = this;
            java.lang.String r0 = "4.6.30.1"
            return r0
    }

    @Override // com.kwad.components.offline.api.core.api.IEnvironment
    public final java.lang.String getBiz() {
            r1 = this;
            java.lang.String r0 = com.kwad.sdk.i.asd
            return r0
    }

    @Override // com.kwad.components.offline.api.core.api.IEnvironment
    public final android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = com.kwad.sdk.service.ServiceProvider.getContext()
            return r0
    }

    @Override // com.kwad.components.offline.api.core.api.IEnvironment
    public final java.lang.String getDeviceId() {
            r1 = this;
            java.lang.String r0 = com.kwad.sdk.utils.br.getDeviceId()
            return r0
    }

    @Override // com.kwad.components.offline.api.core.api.IEnvironment
    public final java.lang.String getKpf() {
            r1 = this;
            java.lang.String r0 = "ANDROID_PHONE"
            return r0
    }

    @Override // com.kwad.components.offline.api.core.api.IEnvironment
    public final java.lang.String getKpn() {
            r1 = this;
            java.lang.String r0 = "UNIVERSE.AD.LIVE"
            return r0
    }

    @Override // com.kwad.components.offline.api.core.api.IEnvironment
    public final double getLatitude(android.content.Context r3) {
            r2 = this;
            com.kwad.sdk.utils.c.a r3 = com.kwad.sdk.utils.bd.cL(r3)
            if (r3 == 0) goto Lf
            com.kwad.sdk.internal.api.a r3 = r3.bcT
            if (r3 == 0) goto Lf
            double r0 = r3.getLatitude()
            return r0
        Lf:
            r0 = 0
            return r0
    }

    @Override // com.kwad.components.offline.api.core.api.IEnvironment
    public final double getLongitude(android.content.Context r3) {
            r2 = this;
            com.kwad.sdk.utils.c.a r3 = com.kwad.sdk.utils.bd.cL(r3)
            if (r3 == 0) goto Lf
            com.kwad.sdk.internal.api.a r3 = r3.bcT
            if (r3 == 0) goto Lf
            double r0 = r3.getLongitude()
            return r0
        Lf:
            r0 = 0
            return r0
    }

    @Override // com.kwad.components.offline.api.core.api.IEnvironment
    public final java.lang.String getOperator(android.content.Context r1) {
            r0 = this;
            int r1 = com.kwad.sdk.utils.ao.df(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            return r1
    }

    @Override // com.kwad.components.offline.api.core.api.IEnvironment
    public final java.lang.String getOsVersion() {
            r1 = this;
            java.lang.String r0 = com.kwad.sdk.utils.br.getOsVersion()
            return r0
    }

    @Override // com.kwad.components.offline.api.core.api.IEnvironment
    public final java.lang.String getProcessName(android.content.Context r1) {
            r0 = this;
            java.lang.String r1 = com.kwad.sdk.utils.SystemUtil.getProcessName(r1)
            return r1
    }

    @Override // com.kwad.components.offline.api.core.api.IEnvironment
    public final java.lang.String getSdkVersion() {
            r1 = this;
            java.lang.String r0 = "4.6.30.1"
            return r0
    }

    @Override // com.kwad.components.offline.api.core.api.IEnvironment
    public final int getStatusBarHeight(android.content.Context r1) {
            r0 = this;
            int r1 = com.kwad.sdk.c.a.a.getStatusBarHeight(r1)
            return r1
    }

    @Override // com.kwad.components.offline.api.core.api.IEnvironment
    public final java.lang.String getUserAgent() {
            r1 = this;
            java.lang.String r0 = com.kwad.sdk.core.network.p.getUserAgent()
            return r0
    }

    @Override // com.kwad.components.offline.api.core.api.IEnvironment
    public final boolean isArm64(android.content.Context r1) {
            r0 = this;
            boolean r1 = com.kwad.sdk.utils.AbiUtil.isArm64(r1)
            return r1
    }

    @Override // com.kwad.components.offline.api.core.api.IEnvironment
    public final boolean isDebug() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.kwad.components.offline.api.core.api.IEnvironment
    public final boolean isDevelopEnable() {
            r1 = this;
            java.lang.Boolean r0 = com.kwad.components.core.a.oz
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // com.kwad.components.offline.api.core.api.IEnvironment
    public final boolean isInMainProcess(android.content.Context r1) {
            r0 = this;
            boolean r1 = com.kwad.sdk.utils.SystemUtil.isInMainProcess(r1)
            return r1
    }

    @Override // com.kwad.components.offline.api.core.api.IEnvironment
    public final boolean isTKCrashCollectEnable() {
            r1 = this;
            com.kwad.sdk.core.config.item.d r0 = com.kwad.sdk.core.config.c.aBt
            java.lang.Boolean r0 = r0.Gv()
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // com.kwad.components.offline.api.core.api.IEnvironment
    public final java.lang.String localIpAddress() {
            r1 = this;
            java.lang.Boolean r0 = com.kwad.components.core.a.oz
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Ld
            java.lang.Class<com.kwad.sdk.components.DevelopMangerComponents> r0 = com.kwad.sdk.components.DevelopMangerComponents.class
            com.kwad.sdk.components.d.f(r0)
        Ld:
            java.lang.String r0 = "10.118.8.111"
            return r0
    }

    @Override // com.kwad.components.offline.api.core.api.IEnvironment
    public final void removeOnAudioConflictListener(android.content.Context r1, com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener r2) {
            r0 = this;
            if (r1 == 0) goto Lc
            if (r2 != 0) goto L5
            goto Lc
        L5:
            com.kwad.components.core.t.a r1 = com.kwad.components.core.t.a.aC(r1)
            r1.b(r2)
        Lc:
            return
    }

    @Override // com.kwad.components.offline.api.core.api.IEnvironment
    public final boolean requestAudioFocus(android.content.Context r1, boolean r2) {
            r0 = this;
            com.kwad.components.core.t.a r1 = com.kwad.components.core.t.a.aC(r1)
            boolean r1 = r1.aQ(r2)
            return r1
    }
}
