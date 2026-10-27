package com.kwad.components.core.o.b.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class j implements com.kwad.components.offline.api.core.IOfflineHostApi {
    private com.kwad.components.offline.api.core.api.IAsync RR;
    private com.kwad.components.offline.api.core.api.IEnvironment RS;
    private com.kwad.components.offline.api.core.api.IZipper RT;
    private com.kwad.components.offline.api.core.api.INet RU;
    private com.kwad.components.offline.api.core.api.IEncrypt RV;
    private com.kwad.components.offline.api.core.api.IOfflineCompoLogcat RW;
    private com.kwad.components.offline.api.core.api.ICrash RX;
    private com.kwad.components.offline.api.core.api.ILoggerReporter RY;
    private com.kwad.components.offline.api.core.api.IDownloader RZ;
    private com.kwad.components.offline.api.core.api.IImageLoader Sa;
    private com.kwad.components.offline.api.core.video.IVideo Sb;
    private com.kwad.components.offline.api.core.adlive.ILive Sc;
    private com.kwad.components.offline.api.core.api.ICache Sd;
    private com.kwad.components.offline.api.core.webview.IWebView Se;
    private com.kwad.components.offline.api.core.api.IVibratorUtil Sf;
    private com.kwad.components.offline.api.core.network.IIdc Sg;
    private com.kwad.components.offline.api.core.imageplayer.IImagePlayer Sh;
    private com.kwad.components.offline.api.core.api.ILifeCycle Si;
    private com.kwad.components.offline.api.core.network.INetworkManager Sj;
    private com.kwad.components.offline.api.core.api.ISystemProperties Sk;
    private com.kwad.components.offline.api.core.api.IFlowUuid Sl;
    private com.kwad.components.offline.api.core.api.ISensorManagerProxy Sm;
    private com.kwad.components.core.o.b.a.m Sn;





    public j() {
            r0 = this;
            r0.<init>()
            return
    }

    private com.kwad.components.core.o.b.a.m qF() {
            r1 = this;
            com.kwad.components.core.o.b.a.m r0 = r1.Sn
            if (r0 != 0) goto Lb
            com.kwad.components.core.o.b.a.m r0 = new com.kwad.components.core.o.b.a.m
            r0.<init>()
            r1.Sn = r0
        Lb:
            com.kwad.components.core.o.b.a.m r0 = r1.Sn
            return r0
    }

    @Override // com.kwad.components.offline.api.core.IOfflineHostApi
    public final com.kwad.components.offline.api.core.api.IAsync async() {
            r1 = this;
            com.kwad.components.offline.api.core.api.IAsync r0 = r1.RR
            if (r0 != 0) goto Lb
            com.kwad.components.core.o.b.a.a r0 = new com.kwad.components.core.o.b.a.a
            r0.<init>()
            r1.RR = r0
        Lb:
            com.kwad.components.offline.api.core.api.IAsync r0 = r1.RR
            return r0
    }

    @Override // com.kwad.components.offline.api.core.IOfflineHostApi
    public final com.kwad.components.offline.api.core.api.IBundleService bundleService() {
            r1 = this;
            com.kwad.components.core.o.b.a.j$4 r0 = new com.kwad.components.core.o.b.a.j$4
            r0.<init>(r1)
            return r0
    }

    @Override // com.kwad.components.offline.api.core.IOfflineHostApi
    public final com.kwad.components.offline.api.core.api.ICache cache() {
            r1 = this;
            com.kwad.components.offline.api.core.api.ICache r0 = r1.Sd
            if (r0 != 0) goto Lb
            com.kwad.components.core.o.b.a.b r0 = new com.kwad.components.core.o.b.a.b
            r0.<init>()
            r1.Sd = r0
        Lb:
            com.kwad.components.offline.api.core.api.ICache r0 = r1.Sd
            return r0
    }

    @Override // com.kwad.components.offline.api.core.IOfflineHostApi
    public final boolean canUseStorage() {
            r1 = this;
            boolean r0 = com.kwad.sdk.utils.bc.useStoragePermissionDisable()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // com.kwad.components.offline.api.core.IOfflineHostApi
    public final com.kwad.components.offline.api.core.api.ICrash crash() {
            r1 = this;
            com.kwad.components.offline.api.core.api.ICrash r0 = r1.RX
            if (r0 != 0) goto Lb
            com.kwad.components.core.o.b.a.j$1 r0 = new com.kwad.components.core.o.b.a.j$1
            r0.<init>(r1)
            r1.RX = r0
        Lb:
            com.kwad.components.offline.api.core.api.ICrash r0 = r1.RX
            return r0
    }

    @Override // com.kwad.components.offline.api.core.IOfflineHostApi
    public final /* synthetic */ com.kwad.components.offline.api.core.api.IOfflineDeviceManagerProxy deviceManager() {
            r1 = this;
            com.kwad.components.core.o.b.a.m r0 = r1.qF()
            return r0
    }

    @Override // com.kwad.components.offline.api.core.IOfflineHostApi
    public final com.kwad.components.offline.api.core.api.IDownloader downloader() {
            r1 = this;
            com.kwad.components.offline.api.core.api.IDownloader r0 = r1.RZ
            if (r0 != 0) goto Lb
            com.kwad.components.core.o.b.a.j$3 r0 = new com.kwad.components.core.o.b.a.j$3
            r0.<init>(r1)
            r1.RZ = r0
        Lb:
            com.kwad.components.offline.api.core.api.IDownloader r0 = r1.RZ
            return r0
    }

    @Override // com.kwad.components.offline.api.core.IOfflineHostApi
    public final com.kwad.components.offline.api.core.api.IEncrypt encrypt() {
            r1 = this;
            com.kwad.components.offline.api.core.api.IEncrypt r0 = r1.RV
            if (r0 != 0) goto Lb
            com.kwad.components.core.o.b.a.c r0 = new com.kwad.components.core.o.b.a.c
            r0.<init>()
            r1.RV = r0
        Lb:
            com.kwad.components.offline.api.core.api.IEncrypt r0 = r1.RV
            return r0
    }

    @Override // com.kwad.components.offline.api.core.IOfflineHostApi
    public final com.kwad.components.offline.api.core.api.IEnvironment env() {
            r1 = this;
            com.kwad.components.offline.api.core.api.IEnvironment r0 = r1.RS
            if (r0 != 0) goto Lb
            com.kwad.components.core.o.b.a.d r0 = new com.kwad.components.core.o.b.a.d
            r0.<init>()
            r1.RS = r0
        Lb:
            com.kwad.components.offline.api.core.api.IEnvironment r0 = r1.RS
            return r0
    }

    @Override // com.kwad.components.offline.api.core.IOfflineHostApi
    public final com.kwad.components.offline.api.core.api.IFlowUuid flowUuid() {
            r1 = this;
            com.kwad.components.offline.api.core.api.IFlowUuid r0 = r1.Sl
            if (r0 != 0) goto Lb
            com.kwad.components.core.o.b.a.e r0 = new com.kwad.components.core.o.b.a.e
            r0.<init>()
            r1.Sl = r0
        Lb:
            com.kwad.components.offline.api.core.api.IFlowUuid r0 = r1.Sl
            return r0
    }

    @Override // com.kwad.components.offline.api.core.IOfflineHostApi
    public final int getAppIconId(android.content.Context r1) {
            r0 = this;
            int r1 = com.kwad.sdk.utils.ba.getAppIconId(r1)
            return r1
    }

    @Override // com.kwad.components.offline.api.core.IOfflineHostApi
    public final int getDrawableId(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            int r1 = com.kwad.sdk.utils.ba.aw(r1, r2)
            return r1
    }

    @Override // com.kwad.components.offline.api.core.IOfflineHostApi
    public final int getId(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            int r1 = com.kwad.sdk.utils.ba.getId(r1, r2)
            return r1
    }

    @Override // com.kwad.components.offline.api.core.IOfflineHostApi
    public final android.content.pm.PackageInfo getPackageInfo(android.content.Context r1, java.lang.String r2, int r3) {
            r0 = this;
            android.content.pm.PackageInfo r1 = com.kwad.sdk.utils.y.getPackageInfo(r1, r2, r3)
            return r1
    }

    @Override // com.kwad.components.offline.api.core.IOfflineHostApi
    public final long getSystemTimeInMs(android.content.Context r1, boolean r2) {
            r0 = this;
            long r1 = com.kwad.sdk.utils.bt.x(r1, r2)
            return r1
    }

    @Override // com.kwad.components.offline.api.core.IOfflineHostApi
    public final int getTKErrorDetailCount() {
            r1 = this;
            int r0 = com.kwad.sdk.core.config.e.getTKErrorDetailCount()
            return r0
    }

    @Override // com.kwad.components.offline.api.core.IOfflineHostApi
    public final java.util.List<java.lang.String> getTKPreloadMemCacheTemplates() {
            r1 = this;
            java.util.List r0 = com.kwad.sdk.core.config.e.getTKPreloadMemCacheTemplates()
            return r0
    }

    @Override // com.kwad.components.offline.api.core.IOfflineHostApi
    public final java.lang.String getWaynePlayerPlayConfig() {
            r1 = this;
            java.lang.String r0 = com.kwad.sdk.core.config.e.Gq()
            return r0
    }

    @Override // com.kwad.components.offline.api.core.IOfflineHostApi
    public final com.kwad.components.offline.api.core.network.IIdc idc() {
            r1 = this;
            com.kwad.components.offline.api.core.network.IIdc r0 = r1.Sg
            if (r0 != 0) goto Lb
            com.kwad.components.core.o.b.a.n r0 = new com.kwad.components.core.o.b.a.n
            r0.<init>()
            r1.Sg = r0
        Lb:
            com.kwad.components.offline.api.core.network.IIdc r0 = r1.Sg
            return r0
    }

    @Override // com.kwad.components.offline.api.core.IOfflineHostApi
    public final com.kwad.components.offline.api.core.api.IImageLoader imageLoader() {
            r1 = this;
            com.kwad.components.offline.api.core.api.IImageLoader r0 = r1.Sa
            if (r0 != 0) goto Lb
            com.kwad.components.core.o.b.a.f r0 = new com.kwad.components.core.o.b.a.f
            r0.<init>()
            r1.Sa = r0
        Lb:
            com.kwad.components.offline.api.core.api.IImageLoader r0 = r1.Sa
            return r0
    }

    @Override // com.kwad.components.offline.api.core.IOfflineHostApi
    public final com.kwad.components.offline.api.core.imageplayer.IImagePlayer imagePlayer() {
            r1 = this;
            com.kwad.components.core.h.d r0 = new com.kwad.components.core.h.d
            r0.<init>()
            r1.Sh = r0
            return r0
    }

    @Override // com.kwad.components.offline.api.core.IOfflineHostApi
    public final boolean isOrientationPortrait() {
            r1 = this;
            boolean r0 = com.kwad.sdk.utils.aq.isOrientationPortrait()
            return r0
    }

    @Override // com.kwad.components.offline.api.core.IOfflineHostApi
    public final com.kwad.components.offline.api.core.api.ILifeCycle lifeCycle() {
            r1 = this;
            com.kwad.components.offline.api.core.api.ILifeCycle r0 = r1.Si
            if (r0 != 0) goto Lb
            com.kwad.components.core.o.b.a.g r0 = new com.kwad.components.core.o.b.a.g
            r0.<init>()
            r1.Si = r0
        Lb:
            com.kwad.components.offline.api.core.api.ILifeCycle r0 = r1.Si
            return r0
    }

    @Override // com.kwad.components.offline.api.core.IOfflineHostApi
    public final com.kwad.components.offline.api.core.adlive.ILive live() {
            r1 = this;
            com.kwad.components.offline.api.core.adlive.ILive r0 = r1.Sc
            if (r0 != 0) goto Lb
            com.kwad.components.core.o.b.b.a r0 = new com.kwad.components.core.o.b.b.a
            r0.<init>()
            r1.Sc = r0
        Lb:
            com.kwad.components.offline.api.core.adlive.ILive r0 = r1.Sc
            return r0
    }

    @Override // com.kwad.components.offline.api.core.IOfflineHostApi
    public final com.kwad.components.offline.api.core.api.IOfflineCompoLogcat log() {
            r1 = this;
            com.kwad.components.offline.api.core.api.IOfflineCompoLogcat r0 = r1.RW
            if (r0 != 0) goto Lb
            com.kwad.components.core.o.b.a.k r0 = new com.kwad.components.core.o.b.a.k
            r0.<init>()
            r1.RW = r0
        Lb:
            com.kwad.components.offline.api.core.api.IOfflineCompoLogcat r0 = r1.RW
            return r0
    }

    @Override // com.kwad.components.offline.api.core.IOfflineHostApi
    public final com.kwad.components.offline.api.core.api.ILoggerReporter loggerReporter() {
            r1 = this;
            com.kwad.components.offline.api.core.api.ILoggerReporter r0 = r1.RY
            if (r0 != 0) goto Lb
            com.kwad.components.core.o.b.a.j$2 r0 = new com.kwad.components.core.o.b.a.j$2
            r0.<init>(r1)
            r1.RY = r0
        Lb:
            com.kwad.components.offline.api.core.api.ILoggerReporter r0 = r1.RY
            return r0
    }

    @Override // com.kwad.components.offline.api.core.IOfflineHostApi
    public final com.kwad.components.offline.api.core.api.INet net() {
            r1 = this;
            com.kwad.components.offline.api.core.api.INet r0 = r1.RU
            if (r0 != 0) goto Lb
            com.kwad.components.core.o.b.a.h r0 = new com.kwad.components.core.o.b.a.h
            r0.<init>()
            r1.RU = r0
        Lb:
            com.kwad.components.offline.api.core.api.INet r0 = r1.RU
            return r0
    }

    @Override // com.kwad.components.offline.api.core.IOfflineHostApi
    public final com.kwad.components.offline.api.core.network.INetworkManager networkManager() {
            r1 = this;
            com.kwad.components.offline.api.core.network.INetworkManager r0 = r1.Sj
            if (r0 != 0) goto Lb
            com.kwad.components.core.o.b.a.i r0 = new com.kwad.components.core.o.b.a.i
            r0.<init>()
            r1.Sj = r0
        Lb:
            com.kwad.components.offline.api.core.network.INetworkManager r0 = r1.Sj
            return r0
    }

    @Override // com.kwad.components.offline.api.core.IOfflineHostApi
    public final void saveTKTemplateCache(java.lang.String r2, int r3, java.lang.String r4) {
            r1 = this;
            com.kwad.components.core.webview.tachikoma.h r0 = com.kwad.components.core.webview.tachikoma.h.uS()
            r0.b(r2, r3, r4)
            return
    }

    @Override // com.kwad.components.offline.api.core.IOfflineHostApi
    public final com.kwad.components.offline.api.core.api.ISensorManagerProxy sensorManager() {
            r1 = this;
            com.kwad.components.offline.api.core.api.ISensorManagerProxy r0 = r1.Sm
            if (r0 != 0) goto Lb
            com.kwad.components.core.o.b.a.p r0 = new com.kwad.components.core.o.b.a.p
            r0.<init>()
            r1.Sm = r0
        Lb:
            com.kwad.components.offline.api.core.api.ISensorManagerProxy r0 = r1.Sm
            return r0
    }

    @Override // com.kwad.components.offline.api.core.IOfflineHostApi
    public final com.kwad.components.offline.api.core.api.ISystemProperties systemProperty() {
            r1 = this;
            com.kwad.components.offline.api.core.api.ISystemProperties r0 = r1.Sk
            if (r0 != 0) goto Lb
            com.kwad.components.core.o.b.a.o r0 = new com.kwad.components.core.o.b.a.o
            r0.<init>()
            r1.Sk = r0
        Lb:
            com.kwad.components.offline.api.core.api.ISystemProperties r0 = r1.Sk
            return r0
    }

    @Override // com.kwad.components.offline.api.core.IOfflineHostApi
    public final com.kwad.components.offline.api.core.api.IVibratorUtil vibratorUtil() {
            r1 = this;
            com.kwad.components.offline.api.core.api.IVibratorUtil r0 = r1.Sf
            if (r0 != 0) goto Lb
            com.kwad.components.core.o.b.a.q r0 = new com.kwad.components.core.o.b.a.q
            r0.<init>()
            r1.Sf = r0
        Lb:
            com.kwad.components.offline.api.core.api.IVibratorUtil r0 = r1.Sf
            return r0
    }

    @Override // com.kwad.components.offline.api.core.IOfflineHostApi
    public final com.kwad.components.offline.api.core.video.IVideo video() {
            r1 = this;
            com.kwad.components.offline.api.core.video.IVideo r0 = r1.Sb
            if (r0 != 0) goto Lb
            com.kwad.components.core.o.b.c.e r0 = new com.kwad.components.core.o.b.c.e
            r0.<init>()
            r1.Sb = r0
        Lb:
            com.kwad.components.offline.api.core.video.IVideo r0 = r1.Sb
            return r0
    }

    @Override // com.kwad.components.offline.api.core.IOfflineHostApi
    public final com.kwad.components.offline.api.core.webview.IWebView webview() {
            r1 = this;
            com.kwad.components.offline.api.core.webview.IWebView r0 = r1.Se
            if (r0 != 0) goto Lb
            com.kwad.components.core.o.b.d.b r0 = new com.kwad.components.core.o.b.d.b
            r0.<init>()
            r1.Se = r0
        Lb:
            com.kwad.components.offline.api.core.webview.IWebView r0 = r1.Se
            return r0
    }

    @Override // com.kwad.components.offline.api.core.IOfflineHostApi
    public final com.kwad.components.offline.api.core.api.IZipper zipper() {
            r1 = this;
            com.kwad.components.offline.api.core.api.IZipper r0 = r1.RT
            if (r0 != 0) goto Lb
            com.kwad.components.core.o.b.a.r r0 = new com.kwad.components.core.o.b.a.r
            r0.<init>()
            r1.RT = r0
        Lb:
            com.kwad.components.offline.api.core.api.IZipper r0 = r1.RT
            return r0
    }
}
