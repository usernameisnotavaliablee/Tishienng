package com.qq.e.ads.splash;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class SplashAD extends com.qq.e.ads.LiteAbstractAD<com.qq.e.comm.pi.NSPVI> implements com.qq.e.comm.pi.IReward {
    private volatile android.view.ViewGroup i;
    private volatile com.qq.e.ads.splash.SplashADListener j;
    private volatile com.qq.e.comm.listeners.ADRewardListener k;
    private volatile com.qq.e.comm.constants.LoadAdParams l;
    private volatile boolean m;
    private volatile boolean n;
    private volatile boolean o;
    private volatile int p;
    private volatile byte[] q;
    private volatile com.qq.e.ads.rewardvideo.ServerSideVerificationOptions r;
    private int s;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.qq.e.ads.splash.SplashAD$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class ADListenerAdapter implements com.qq.e.comm.adevent.ADListener {
        final /* synthetic */ com.qq.e.ads.splash.SplashAD a;

        private ADListenerAdapter(com.qq.e.ads.splash.SplashAD r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ ADListenerAdapter(com.qq.e.ads.splash.SplashAD r1, com.qq.e.ads.splash.SplashAD.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.qq.e.comm.adevent.ADListener
        public void onADEvent(com.qq.e.comm.adevent.ADEvent r4) {
                r3 = this;
                com.qq.e.ads.splash.SplashAD r0 = r3.a
                com.qq.e.ads.splash.SplashADListener r0 = com.qq.e.ads.splash.SplashAD.a(r0)
                if (r0 != 0) goto La
                goto Ld9
            La:
                int r0 = r4.getType()
                java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
                switch(r0) {
                    case 100: goto Lc4;
                    case 101: goto La8;
                    case 102: goto L9e;
                    case 103: goto L94;
                    case 104: goto L6e;
                    case 105: goto L64;
                    case 106: goto L5a;
                    default: goto L13;
                }
            L13:
                switch(r0) {
                    case 112: goto L44;
                    case 113: goto L2e;
                    case 114: goto L18;
                    default: goto L16;
                }
            L16:
                goto Ld9
            L18:
                com.qq.e.ads.splash.SplashAD r4 = r3.a
                com.qq.e.ads.splash.SplashADListener r4 = com.qq.e.ads.splash.SplashAD.a(r4)
                boolean r4 = r4 instanceof com.qq.e.ads.splash.SplashADZoomOutListener
                if (r4 == 0) goto Ld9
                com.qq.e.ads.splash.SplashAD r4 = r3.a
                com.qq.e.ads.splash.SplashADListener r4 = com.qq.e.ads.splash.SplashAD.a(r4)
                com.qq.e.ads.splash.SplashADZoomOutListener r4 = (com.qq.e.ads.splash.SplashADZoomOutListener) r4
                r4.onZoomOutPlayFinish()
                return
            L2e:
                com.qq.e.ads.splash.SplashAD r4 = r3.a
                com.qq.e.ads.splash.SplashADListener r4 = com.qq.e.ads.splash.SplashAD.a(r4)
                boolean r4 = r4 instanceof com.qq.e.ads.splash.SplashADZoomOutListener
                if (r4 == 0) goto Ld9
                com.qq.e.ads.splash.SplashAD r4 = r3.a
                com.qq.e.ads.splash.SplashADListener r4 = com.qq.e.ads.splash.SplashAD.a(r4)
                com.qq.e.ads.splash.SplashADZoomOutListener r4 = (com.qq.e.ads.splash.SplashADZoomOutListener) r4
                r4.onZoomOut()
                return
            L44:
                java.lang.Object r4 = r4.getParam(r1)
                java.lang.Long r4 = (java.lang.Long) r4
                if (r4 == 0) goto Ld9
                com.qq.e.ads.splash.SplashAD r0 = r3.a
                com.qq.e.ads.splash.SplashADListener r0 = com.qq.e.ads.splash.SplashAD.a(r0)
                long r1 = r4.longValue()
                r0.onADTick(r1)
                return
            L5a:
                com.qq.e.ads.splash.SplashAD r4 = r3.a
                com.qq.e.ads.splash.SplashADListener r4 = com.qq.e.ads.splash.SplashAD.a(r4)
                r4.onADDismissed()
                return
            L64:
                com.qq.e.ads.splash.SplashAD r4 = r3.a
                com.qq.e.ads.splash.SplashADListener r4 = com.qq.e.ads.splash.SplashAD.a(r4)
                r4.onADClicked()
                return
            L6e:
                com.qq.e.ads.splash.SplashAD r0 = r3.a
                com.qq.e.comm.listeners.ADRewardListener r0 = com.qq.e.ads.splash.SplashAD.b(r0)
                if (r0 == 0) goto Ld9
                java.lang.Class<java.lang.String> r0 = java.lang.String.class
                java.lang.Object r4 = r4.getParam(r0)
                java.lang.String r4 = (java.lang.String) r4
                if (r4 == 0) goto Ld9
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                java.lang.String r1 = "transId"
                r0.put(r1, r4)
                com.qq.e.ads.splash.SplashAD r4 = r3.a
                com.qq.e.comm.listeners.ADRewardListener r4 = com.qq.e.ads.splash.SplashAD.b(r4)
                r4.onReward(r0)
                return
            L94:
                com.qq.e.ads.splash.SplashAD r4 = r3.a
                com.qq.e.ads.splash.SplashADListener r4 = com.qq.e.ads.splash.SplashAD.a(r4)
                r4.onADExposure()
                return
            L9e:
                com.qq.e.ads.splash.SplashAD r4 = r3.a
                com.qq.e.ads.splash.SplashADListener r4 = com.qq.e.ads.splash.SplashAD.a(r4)
                r4.onADPresent()
                return
            La8:
                java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
                java.lang.Object r4 = r4.getParam(r0)
                java.lang.Integer r4 = (java.lang.Integer) r4
                if (r4 == 0) goto Ld9
                com.qq.e.ads.splash.SplashAD r0 = r3.a
                com.qq.e.ads.splash.SplashADListener r0 = com.qq.e.ads.splash.SplashAD.a(r0)
                int r4 = r4.intValue()
                com.qq.e.comm.util.AdError r4 = com.qq.e.comm.util.AdErrorConvertor.formatErrorCode(r4)
                r0.onNoAD(r4)
                return
            Lc4:
                java.lang.Object r4 = r4.getParam(r1)
                java.lang.Long r4 = (java.lang.Long) r4
                if (r4 == 0) goto Ld9
                com.qq.e.ads.splash.SplashAD r0 = r3.a
                com.qq.e.ads.splash.SplashADListener r0 = com.qq.e.ads.splash.SplashAD.a(r0)
                long r1 = r4.longValue()
                r0.onADLoaded(r1)
            Ld9:
                return
        }
    }

    public SplashAD(android.content.Context r2, java.lang.String r3, com.qq.e.ads.splash.SplashADListener r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public SplashAD(android.content.Context r2, java.lang.String r3, com.qq.e.ads.splash.SplashADListener r4, int r5) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.m = r0
            r1.j = r4
            r1.s = r5
            r1.a(r2, r3)
            return
    }

    public SplashAD(android.content.Context r2, java.lang.String r3, com.qq.e.ads.splash.SplashADListener r4, int r5, java.lang.String r6) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.m = r0
            r1.j = r4
            r1.s = r5
            r1.a(r2, r3, r6)
            return
    }

    static /* synthetic */ com.qq.e.ads.splash.SplashADListener a(com.qq.e.ads.splash.SplashAD r0) {
            com.qq.e.ads.splash.SplashADListener r0 = r0.j
            return r0
    }

    private void a(android.view.ViewGroup r2, boolean r3) {
            r1 = this;
            if (r2 != 0) goto Ld
            java.lang.String r2 = "传入参数有误：传入container参数为空"
            com.qq.e.comm.util.GDTLogger.e(r2)
            r2 = 4001(0xfa1, float:5.607E-42)
            r1.a(r2)
            return
        Ld:
            T r0 = r1.a
            if (r0 == 0) goto L1d
            com.qq.e.comm.pi.NSPVI r0 = (com.qq.e.comm.pi.NSPVI) r0
            if (r3 == 0) goto L19
            r0.fetchFullScreenAndShowIn(r2)
            return
        L19:
            r0.fetchAndShowIn(r2)
            return
        L1d:
            r1.o = r3
            r1.i = r2
            return
    }

    private void a(boolean r2) {
            r1 = this;
            boolean r0 = r1.a()
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r1.b()
            if (r0 != 0) goto L13
            r1.o = r2
            r2 = 1
            r1.n = r2
            return
        L13:
            T r0 = r1.a
            if (r0 != 0) goto L1d
            java.lang.String r2 = "fetchAdInner"
            r1.a(r2)
            return
        L1d:
            com.qq.e.comm.pi.NSPVI r0 = (com.qq.e.comm.pi.NSPVI) r0
            if (r2 == 0) goto L25
            r0.fetchFullScreenAdOnly()
            return
        L25:
            r0.fetchAdOnly()
            return
    }

    static /* synthetic */ com.qq.e.comm.listeners.ADRewardListener b(com.qq.e.ads.splash.SplashAD r0) {
            com.qq.e.comm.listeners.ADRewardListener r0 = r0.k
            return r0
    }

    private void b(android.view.ViewGroup r2, boolean r3) {
            r1 = this;
            if (r2 != 0) goto Ld
            java.lang.String r2 = "传入参数错误，container参数为空"
            com.qq.e.comm.util.GDTLogger.e(r2)
            r2 = 4001(0xfa1, float:5.607E-42)
            r1.a(r2)
            return
        Ld:
            T r0 = r1.a
            if (r0 != 0) goto L14
            r1.i = r2
            return
        L14:
            com.qq.e.comm.pi.NSPVI r0 = (com.qq.e.comm.pi.NSPVI) r0
            if (r3 == 0) goto L1c
            r0.showFullScreenAd(r2)
            return
        L1c:
            r0.showAd(r2)
            return
    }

    private void fetchAndShowIn(android.view.ViewGroup r2) {
            r1 = this;
            r0 = 0
            r1.a(r2, r0)
            return
    }

    private void fetchFullScreenAndShowIn(android.view.ViewGroup r2) {
            r1 = this;
            r0 = 1
            r1.a(r2, r0)
            return
    }

    @Override // com.qq.e.ads.AbstractAD
    protected /* bridge */ /* synthetic */ java.lang.Object a(android.content.Context r1, com.qq.e.comm.pi.POFactory r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r0 = this;
            com.qq.e.comm.pi.NSPVI r1 = r0.b(r1, r2, r3, r4, r5)
            return r1
    }

    protected void a(com.qq.e.comm.pi.NSPVI r3) {
            r2 = this;
            com.qq.e.comm.constants.LoadAdParams r0 = r2.l
            if (r0 == 0) goto L9
            com.qq.e.comm.constants.LoadAdParams r0 = r2.l
            r3.setLoadAdParams(r0)
        L9:
            int r0 = r2.p
            if (r0 == 0) goto L12
            int r0 = r2.p
            r3.setDeveloperLogo(r0)
        L12:
            byte[] r0 = r2.q
            if (r0 == 0) goto L1b
            byte[] r0 = r2.q
            r3.setDeveloperLogo(r0)
        L1b:
            int r0 = r2.s
            r3.setFetchDelay(r0)
            com.qq.e.ads.splash.SplashAD$ADListenerAdapter r0 = new com.qq.e.ads.splash.SplashAD$ADListenerAdapter
            r1 = 0
            r0.<init>(r2, r1)
            r3.setAdListener(r0)
            com.qq.e.ads.rewardvideo.ServerSideVerificationOptions r0 = r2.r
            r3.setServerSideVerificationOptions(r0)
            com.qq.e.ads.splash.SplashADListener r0 = r2.j
            boolean r0 = r0 instanceof com.qq.e.ads.splash.SplashADZoomOutListener
            if (r0 == 0) goto L42
            com.qq.e.ads.splash.SplashADListener r0 = r2.j
            com.qq.e.ads.splash.SplashADZoomOutListener r0 = (com.qq.e.ads.splash.SplashADZoomOutListener) r0
            boolean r0 = r0.isSupportZoomOut()
            if (r0 == 0) goto L42
            r0 = 1
            r3.setSupportZoomOut(r0)
        L42:
            android.view.ViewGroup r0 = r2.i
            if (r0 == 0) goto L55
            boolean r0 = r2.o
            if (r0 == 0) goto L50
            android.view.ViewGroup r0 = r2.i
            r2.fetchFullScreenAndShowIn(r0)
            goto L55
        L50:
            android.view.ViewGroup r0 = r2.i
            r2.fetchAndShowIn(r0)
        L55:
            boolean r0 = r2.m
            r1 = 0
            if (r0 == 0) goto L5f
            r3.preload()
            r2.m = r1
        L5f:
            boolean r0 = r2.n
            if (r0 == 0) goto L70
            boolean r0 = r2.o
            if (r0 == 0) goto L6b
            r3.fetchFullScreenAdOnly()
            goto L6e
        L6b:
            r3.fetchAdOnly()
        L6e:
            r2.n = r1
        L70:
            return
    }

    @Override // com.qq.e.ads.AbstractAD
    protected /* bridge */ /* synthetic */ void a(java.lang.Object r1) {
            r0 = this;
            com.qq.e.comm.pi.NSPVI r1 = (com.qq.e.comm.pi.NSPVI) r1
            r0.a(r1)
            return
    }

    protected com.qq.e.comm.pi.NSPVI b(android.content.Context r1, com.qq.e.comm.pi.POFactory r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r0 = this;
            com.qq.e.comm.pi.NSPVI r1 = r2.getNativeSplashAdView(r1, r3, r4, r5)
            return r1
    }

    @Override // com.qq.e.ads.AbstractAD
    protected void b(int r2) {
            r1 = this;
            com.qq.e.ads.splash.SplashADListener r0 = r1.j
            if (r0 == 0) goto Ld
            com.qq.e.ads.splash.SplashADListener r0 = r1.j
            com.qq.e.comm.util.AdError r2 = com.qq.e.comm.util.AdErrorConvertor.formatErrorCode(r2)
            r0.onNoAD(r2)
        Ld:
            return
    }

    public void fetchAdOnly() {
            r1 = this;
            r0 = 0
            r1.a(r0)
            return
    }

    public void fetchFullScreenAdOnly() {
            r1 = this;
            r0 = 1
            r1.a(r0)
            return
    }

    public java.lang.String getAdNetWorkName() {
            r1 = this;
            T r0 = r1.a
            if (r0 == 0) goto Lb
            com.qq.e.comm.pi.NSPVI r0 = (com.qq.e.comm.pi.NSPVI) r0
            java.lang.String r0 = r0.getAdNetWorkName()
            return r0
        Lb:
            java.lang.String r0 = "getAdNetWorkName"
            r1.a(r0)
            r0 = 0
            return r0
    }

    public android.graphics.Bitmap getZoomOutBitmap() {
            r1 = this;
            T r0 = r1.a
            if (r0 == 0) goto Lb
            com.qq.e.comm.pi.NSPVI r0 = (com.qq.e.comm.pi.NSPVI) r0
            android.graphics.Bitmap r0 = r0.getZoomOutBitmap()
            return r0
        Lb:
            java.lang.String r0 = "getZoomOutBitmap"
            r1.a(r0)
            r0 = 0
            return r0
    }

    public void preLoad() {
            r1 = this;
            boolean r0 = r1.a()
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r1.b()
            if (r0 != 0) goto L11
            r0 = 1
            r1.m = r0
            return
        L11:
            T r0 = r1.a
            if (r0 == 0) goto L1b
            com.qq.e.comm.pi.NSPVI r0 = (com.qq.e.comm.pi.NSPVI) r0
            r0.preload()
            return
        L1b:
            java.lang.String r0 = "preLoad"
            r1.a(r0)
            return
    }

    @java.lang.Deprecated
    public void setAdLogoMargin(int r1, int r2) {
            r0 = this;
            return
    }

    public void setDeveloperLogo(int r2) {
            r1 = this;
            T r0 = r1.a
            if (r0 != 0) goto L7
            r1.p = r2
            return
        L7:
            com.qq.e.comm.pi.NSPVI r0 = (com.qq.e.comm.pi.NSPVI) r0
            r0.setDeveloperLogo(r2)
            return
    }

    public void setDeveloperLogo(byte[] r2) {
            r1 = this;
            T r0 = r1.a
            if (r0 != 0) goto L7
            r1.q = r2
            return
        L7:
            com.qq.e.comm.pi.NSPVI r0 = (com.qq.e.comm.pi.NSPVI) r0
            r0.setDeveloperLogo(r2)
            return
    }

    public void setLoadAdParams(com.qq.e.comm.constants.LoadAdParams r2) {
            r1 = this;
            T r0 = r1.a
            if (r0 == 0) goto La
            com.qq.e.comm.pi.NSPVI r0 = (com.qq.e.comm.pi.NSPVI) r0
            r0.setLoadAdParams(r2)
            return
        La:
            r1.l = r2
            return
    }

    @java.lang.Deprecated
    public void setPreloadView(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // com.qq.e.comm.pi.IReward
    public void setRewardListener(com.qq.e.comm.listeners.ADRewardListener r1) {
            r0 = this;
            r0.k = r1
            return
    }

    @Override // com.qq.e.comm.pi.IReward
    public void setServerSideVerificationOptions(com.qq.e.ads.rewardvideo.ServerSideVerificationOptions r2) {
            r1 = this;
            r1.r = r2
            T r0 = r1.a
            if (r0 == 0) goto Lb
            com.qq.e.comm.pi.NSPVI r0 = (com.qq.e.comm.pi.NSPVI) r0
            r0.setServerSideVerificationOptions(r2)
        Lb:
            return
    }

    public void showAd(android.view.ViewGroup r2) {
            r1 = this;
            r0 = 0
            r1.b(r2, r0)
            return
    }

    public void showFullScreenAd(android.view.ViewGroup r2) {
            r1 = this;
            r0 = 1
            r1.b(r2, r0)
            return
    }

    public void zoomOutAnimationFinish() {
            r1 = this;
            T r0 = r1.a
            if (r0 == 0) goto La
            com.qq.e.comm.pi.NSPVI r0 = (com.qq.e.comm.pi.NSPVI) r0
            r0.zoomOutAnimationFinish()
            return
        La:
            java.lang.String r0 = "zoomOutAnimationFinish"
            r1.a(r0)
            return
    }
}
