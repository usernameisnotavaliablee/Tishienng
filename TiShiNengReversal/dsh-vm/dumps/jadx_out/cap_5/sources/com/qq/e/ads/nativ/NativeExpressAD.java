package com.qq.e.ads.nativ;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class NativeExpressAD extends com.qq.e.ads.NativeAbstractAD<com.qq.e.comm.pi.NEADI> implements com.qq.e.comm.pi.IReward {
    private volatile int h;
    private volatile int i;
    private java.util.List<java.lang.Integer> j;
    private com.qq.e.ads.cfg.VideoOption k;
    private com.qq.e.ads.nativ.ADSize l;
    private com.qq.e.ads.nativ.NativeExpressAD.NativeExpressADListener m;
    private final com.qq.e.ads.nativ.NativeExpressAD.ADListenerAdapter n;
    private com.qq.e.comm.constants.LoadAdParams o;
    private volatile com.qq.e.ads.rewardvideo.ServerSideVerificationOptions p;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class ADListenerAdapter implements com.qq.e.comm.adevent.ADListener {
        private com.qq.e.ads.nativ.NativeExpressAD.NativeExpressADListener a;
        private com.qq.e.ads.nativ.NativeExpressMediaListener b;
        private com.qq.e.comm.listeners.NegativeFeedbackListener c;
        private com.qq.e.comm.listeners.ADRewardListener d;

        public ADListenerAdapter(com.qq.e.ads.nativ.NativeExpressAD.NativeExpressADListener r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        public ADListenerAdapter(com.qq.e.ads.nativ.NativeExpressMediaListener r1) {
                r0 = this;
                r0.<init>()
                r0.b = r1
                return
        }

        @Override // com.qq.e.comm.adevent.ADListener
        public void onADEvent(com.qq.e.comm.adevent.ADEvent r2) {
                r1 = this;
                com.qq.e.ads.nativ.NativeExpressAD$NativeExpressADListener r0 = r1.a
                boolean r0 = com.qq.e.ads.nativ.NativeExpressAD.a(r0, r2)
                if (r0 == 0) goto L9
                goto L1a
            L9:
                com.qq.e.ads.nativ.NativeExpressMediaListener r0 = r1.b
                boolean r0 = com.qq.e.ads.nativ.NativeExpressAD.a(r0, r2)
                if (r0 == 0) goto L12
                goto L1a
            L12:
                com.qq.e.comm.listeners.NegativeFeedbackListener r0 = r1.c
                boolean r0 = com.qq.e.ads.nativ.NativeExpressAD.a(r0, r2)
                if (r0 == 0) goto L1b
            L1a:
                return
            L1b:
                com.qq.e.comm.listeners.ADRewardListener r0 = r1.d
                com.qq.e.ads.nativ.NativeExpressAD.a(r0, r2)
                return
        }

        public void setAdRewardListener(com.qq.e.comm.listeners.ADRewardListener r1) {
                r0 = this;
                r0.d = r1
                return
        }

        public void setMediaListener(com.qq.e.ads.nativ.NativeExpressMediaListener r1) {
                r0 = this;
                r0.b = r1
                return
        }

        public void setNegativeFeedbackListener(com.qq.e.comm.listeners.NegativeFeedbackListener r1) {
                r0 = this;
                r0.c = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface NativeExpressADListener extends com.qq.e.ads.NativeAbstractAD.BasicADListener {
        void onADClicked(com.qq.e.ads.nativ.NativeExpressADView r1);

        void onADClosed(com.qq.e.ads.nativ.NativeExpressADView r1);

        void onADExposure(com.qq.e.ads.nativ.NativeExpressADView r1);

        void onADLeftApplication(com.qq.e.ads.nativ.NativeExpressADView r1);

        void onADLoaded(java.util.List<com.qq.e.ads.nativ.NativeExpressADView> r1);

        void onRenderFail(com.qq.e.ads.nativ.NativeExpressADView r1);

        void onRenderSuccess(com.qq.e.ads.nativ.NativeExpressADView r1);
    }

    public NativeExpressAD(android.content.Context r2, com.qq.e.ads.nativ.ADSize r3, java.lang.String r4, com.qq.e.ads.nativ.NativeExpressAD.NativeExpressADListener r5) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = java.util.Collections.synchronizedList(r0)
            r1.j = r0
            r1.m = r5
            com.qq.e.ads.nativ.NativeExpressAD$ADListenerAdapter r0 = new com.qq.e.ads.nativ.NativeExpressAD$ADListenerAdapter
            r0.<init>(r5)
            r1.n = r0
            boolean r3 = r1.a(r3)
            if (r3 == 0) goto L1e
            return
        L1e:
            r1.a(r2, r4)
            return
    }

    public NativeExpressAD(android.content.Context r2, com.qq.e.ads.nativ.ADSize r3, java.lang.String r4, com.qq.e.ads.nativ.NativeExpressAD.NativeExpressADListener r5, java.lang.String r6) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = java.util.Collections.synchronizedList(r0)
            r1.j = r0
            r1.m = r5
            com.qq.e.ads.nativ.NativeExpressAD$ADListenerAdapter r0 = new com.qq.e.ads.nativ.NativeExpressAD$ADListenerAdapter
            r0.<init>(r5)
            r1.n = r0
            boolean r3 = r1.a(r3)
            if (r3 == 0) goto L1e
            return
        L1e:
            r1.a(r2, r4, r6)
            return
    }

    private boolean a(com.qq.e.ads.nativ.ADSize r1) {
            r0 = this;
            if (r1 != 0) goto Le
            java.lang.String r1 = "初始化错误：参数adSize不能为空"
            com.qq.e.comm.util.GDTLogger.e(r1)
            r1 = 2001(0x7d1, float:2.804E-42)
            r0.a(r1)
            r1 = 1
            return r1
        Le:
            r0.l = r1
            r1 = 0
            return r1
    }

    static /* synthetic */ boolean a(com.qq.e.ads.nativ.NativeExpressAD.NativeExpressADListener r0, com.qq.e.comm.adevent.ADEvent r1) {
            boolean r0 = b(r0, r1)
            return r0
    }

    static /* synthetic */ boolean a(com.qq.e.ads.nativ.NativeExpressMediaListener r0, com.qq.e.comm.adevent.ADEvent r1) {
            boolean r0 = b(r0, r1)
            return r0
    }

    static /* synthetic */ boolean a(com.qq.e.comm.listeners.ADRewardListener r0, com.qq.e.comm.adevent.ADEvent r1) {
            boolean r0 = b(r0, r1)
            return r0
    }

    static /* synthetic */ boolean a(com.qq.e.comm.listeners.NegativeFeedbackListener r0, com.qq.e.comm.adevent.ADEvent r1) {
            boolean r0 = b(r0, r1)
            return r0
    }

    private static boolean b(com.qq.e.ads.nativ.NativeExpressAD.NativeExpressADListener r4, com.qq.e.comm.adevent.ADEvent r5) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r5.getType()
            r2 = 100
            if (r1 == r2) goto L8c
            r2 = 101(0x65, float:1.42E-43)
            if (r1 == r2) goto L76
            r2 = 103(0x67, float:1.44E-43)
            java.lang.Class<com.qq.e.ads.nativ.NativeExpressADView> r3 = com.qq.e.ads.nativ.NativeExpressADView.class
            if (r1 == r2) goto L6a
            r2 = 303(0x12f, float:4.25E-43)
            if (r1 == r2) goto L5e
            r2 = 105(0x69, float:1.47E-43)
            if (r1 == r2) goto L52
            r2 = 106(0x6a, float:1.49E-43)
            if (r1 == r2) goto L43
            r2 = 109(0x6d, float:1.53E-43)
            if (r1 == r2) goto L37
            r2 = 110(0x6e, float:1.54E-43)
            if (r1 == r2) goto L2b
            return r0
        L2b:
            java.lang.Object r5 = r5.getParam(r3)
            com.qq.e.ads.nativ.NativeExpressADView r5 = (com.qq.e.ads.nativ.NativeExpressADView) r5
            if (r5 == 0) goto L99
            r4.onRenderFail(r5)
            goto L99
        L37:
            java.lang.Object r5 = r5.getParam(r3)
            com.qq.e.ads.nativ.NativeExpressADView r5 = (com.qq.e.ads.nativ.NativeExpressADView) r5
            if (r5 == 0) goto L99
            r4.onRenderSuccess(r5)
            goto L99
        L43:
            java.lang.Object r5 = r5.getParam(r3)
            com.qq.e.ads.nativ.NativeExpressADView r5 = (com.qq.e.ads.nativ.NativeExpressADView) r5
            if (r5 == 0) goto L99
            r4.onADClosed(r5)
            r5.negativeFeedback()
            goto L99
        L52:
            java.lang.Object r5 = r5.getParam(r3)
            com.qq.e.ads.nativ.NativeExpressADView r5 = (com.qq.e.ads.nativ.NativeExpressADView) r5
            if (r5 == 0) goto L99
            r4.onADClicked(r5)
            goto L99
        L5e:
            java.lang.Object r5 = r5.getParam(r3)
            com.qq.e.ads.nativ.NativeExpressADView r5 = (com.qq.e.ads.nativ.NativeExpressADView) r5
            if (r5 == 0) goto L99
            r4.onADLeftApplication(r5)
            goto L99
        L6a:
            java.lang.Object r5 = r5.getParam(r3)
            com.qq.e.ads.nativ.NativeExpressADView r5 = (com.qq.e.ads.nativ.NativeExpressADView) r5
            if (r5 == 0) goto L99
            r4.onADExposure(r5)
            goto L99
        L76:
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            java.lang.Object r5 = r5.getParam(r0)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L99
            int r5 = r5.intValue()
            com.qq.e.comm.util.AdError r5 = com.qq.e.comm.util.AdErrorConvertor.formatErrorCode(r5)
            r4.onNoAD(r5)
            goto L99
        L8c:
            java.lang.Class<java.util.List> r0 = java.util.List.class
            java.lang.Object r5 = r5.getParam(r0)
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L99
            r4.onADLoaded(r5)
        L99:
            r4 = 1
            return r4
    }

    private static boolean b(com.qq.e.ads.nativ.NativeExpressMediaListener r6, com.qq.e.comm.adevent.ADEvent r7) {
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            java.lang.Class<com.qq.e.ads.nativ.NativeExpressADView> r1 = com.qq.e.ads.nativ.NativeExpressADView.class
            java.lang.Object r1 = r7.getParam(r1)
            com.qq.e.ads.nativ.NativeExpressADView r1 = (com.qq.e.ads.nativ.NativeExpressADView) r1
            if (r1 != 0) goto Lf
            return r0
        Lf:
            int r2 = r7.getType()
            r3 = 201(0xc9, float:2.82E-43)
            r4 = 1
            if (r2 == r3) goto L77
            r3 = 202(0xca, float:2.83E-43)
            if (r2 == r3) goto L73
            r3 = 204(0xcc, float:2.86E-43)
            if (r2 == r3) goto L6f
            r3 = 206(0xce, float:2.89E-43)
            if (r2 == r3) goto L6b
            r3 = 207(0xcf, float:2.9E-43)
            java.lang.Class<java.lang.Integer> r5 = java.lang.Integer.class
            if (r2 == r3) goto L57
            r3 = 301(0x12d, float:4.22E-43)
            if (r2 == r3) goto L53
            r3 = 302(0x12e, float:4.23E-43)
            if (r2 == r3) goto L4f
            switch(r2) {
                case 209: goto L4b;
                case 210: goto L3a;
                case 211: goto L36;
                default: goto L35;
            }
        L35:
            return r0
        L36:
            r6.onVideoLoading(r1)
            goto L7a
        L3a:
            java.lang.Object r7 = r7.getParam(r4, r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L7a
            int r7 = r7.intValue()
            long r2 = (long) r7
            r6.onVideoReady(r1, r2)
            goto L7a
        L4b:
            r6.onVideoInit(r1)
            goto L7a
        L4f:
            r6.onVideoPageClose(r1)
            goto L7a
        L53:
            r6.onVideoPageOpen(r1)
            goto L7a
        L57:
            java.lang.Object r7 = r7.getParam(r4, r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L7a
            int r7 = r7.intValue()
            com.qq.e.comm.util.AdError r7 = com.qq.e.comm.util.AdErrorConvertor.formatErrorCode(r7)
            r6.onVideoError(r1, r7)
            goto L7a
        L6b:
            r6.onVideoComplete(r1)
            goto L7a
        L6f:
            r6.onVideoPause(r1)
            goto L7a
        L73:
            r6.onVideoStart(r1)
            goto L7a
        L77:
            r6.onVideoCached(r1)
        L7a:
            return r4
    }

    private static boolean b(com.qq.e.comm.listeners.ADRewardListener r3, com.qq.e.comm.adevent.ADEvent r4) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            int r1 = r4.getType()
            r2 = 104(0x68, float:1.46E-43)
            if (r1 == r2) goto Ld
            return r0
        Ld:
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Object r4 = r4.getParam(r0)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L24
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "transId"
            r0.put(r1, r4)
            r3.onReward(r0)
        L24:
            r3 = 1
            return r3
    }

    private static boolean b(com.qq.e.comm.listeners.NegativeFeedbackListener r2, com.qq.e.comm.adevent.ADEvent r3) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            int r3 = r3.getType()
            r1 = 304(0x130, float:4.26E-43)
            if (r3 == r1) goto Ld
            return r0
        Ld:
            r2.onComplainSuccess()
            r2 = 1
            return r2
    }

    @Override // com.qq.e.ads.AbstractAD
    protected /* bridge */ /* synthetic */ java.lang.Object a(android.content.Context r1, com.qq.e.comm.pi.POFactory r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r0 = this;
            com.qq.e.comm.pi.NEADI r1 = r0.b(r1, r2, r3, r4, r5)
            return r1
    }

    @Override // com.qq.e.ads.NativeAbstractAD
    protected /* bridge */ /* synthetic */ void a(com.qq.e.comm.pi.NEADI r1) {
            r0 = this;
            com.qq.e.comm.pi.NEADI r1 = (com.qq.e.comm.pi.NEADI) r1
            r0.a2(r1)
            return
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    protected void a2(com.qq.e.comm.pi.NEADI r5) {
            r4 = this;
            super.a(r5)
            int r0 = r4.h
            r5.setMinVideoDuration(r0)
            int r0 = r4.i
            r5.setMaxVideoDuration(r0)
            T r5 = r4.a
            com.qq.e.comm.pi.NEADI r5 = (com.qq.e.comm.pi.NEADI) r5
            com.qq.e.ads.rewardvideo.ServerSideVerificationOptions r0 = r4.p
            r5.setServerSideVerificationOptions(r0)
            com.qq.e.ads.cfg.VideoOption r5 = r4.k
            if (r5 == 0) goto L1d
            r4.setVideoOption(r5)
        L1d:
            java.util.List<java.lang.Integer> r5 = r4.j
            monitor-enter(r5)
            java.util.List<java.lang.Integer> r0 = r4.j     // Catch: java.lang.Throwable -> L46
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L46
        L26:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L46
            if (r1 == 0) goto L58
            T r1 = r4.a     // Catch: java.lang.Throwable -> L46
            if (r1 == 0) goto L26
            com.qq.e.comm.constants.LoadAdParams r2 = r4.o     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L48
            com.qq.e.comm.pi.NEADI r1 = (com.qq.e.comm.pi.NEADI) r1     // Catch: java.lang.Throwable -> L46
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L46
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L46
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L46
            com.qq.e.comm.constants.LoadAdParams r3 = r4.o     // Catch: java.lang.Throwable -> L46
            r1.loadAd(r2, r3)     // Catch: java.lang.Throwable -> L46
            goto L26
        L46:
            r0 = move-exception
            goto L5a
        L48:
            com.qq.e.comm.pi.NEADI r1 = (com.qq.e.comm.pi.NEADI) r1     // Catch: java.lang.Throwable -> L46
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L46
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L46
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L46
            r1.loadAd(r2)     // Catch: java.lang.Throwable -> L46
            goto L26
        L58:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L46
            return
        L5a:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L46
            throw r0
    }

    @Override // com.qq.e.ads.NativeAbstractAD, com.qq.e.ads.AbstractAD
    protected /* bridge */ /* synthetic */ void a(java.lang.Object r1) {
            r0 = this;
            com.qq.e.comm.pi.NEADI r1 = (com.qq.e.comm.pi.NEADI) r1
            r0.a2(r1)
            return
    }

    protected com.qq.e.comm.pi.NEADI b(android.content.Context r8, com.qq.e.comm.pi.POFactory r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
            r7 = this;
            com.qq.e.ads.nativ.ADSize r2 = r7.l
            com.qq.e.ads.nativ.NativeExpressAD$ADListenerAdapter r6 = r7.n
            r1 = r8
            r0 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            com.qq.e.comm.pi.NEADI r8 = r0.getNativeExpressADDelegate(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Override // com.qq.e.ads.AbstractAD
    protected void b(int r2) {
            r1 = this;
            com.qq.e.ads.nativ.NativeExpressAD$NativeExpressADListener r0 = r1.m
            if (r0 == 0) goto Lb
            com.qq.e.comm.util.AdError r2 = com.qq.e.comm.util.AdErrorConvertor.formatErrorCode(r2)
            r0.onNoAD(r2)
        Lb:
            return
    }

    public java.lang.String getAdNetWorkName() {
            r1 = this;
            T r0 = r1.a
            if (r0 == 0) goto Lb
            com.qq.e.comm.pi.NEADI r0 = (com.qq.e.comm.pi.NEADI) r0
            java.lang.String r0 = r0.getAdNetWorkName()
            return r0
        Lb:
            java.lang.String r0 = "getAdNetWorkName"
            r1.a(r0)
            r0 = 0
            return r0
    }

    public void loadAD(int r2) {
            r1 = this;
            r0 = 0
            r1.loadAD(r2, r0)
            return
    }

    public void loadAD(int r2, com.qq.e.comm.constants.LoadAdParams r3) {
            r1 = this;
            boolean r0 = r1.a()
            if (r0 != 0) goto L7
            return
        L7:
            if (r3 == 0) goto Lc
            r1.setAdParams(r3)
        Lc:
            boolean r3 = r1.b()
            if (r3 != 0) goto L23
            java.util.List<java.lang.Integer> r3 = r1.j
            monitor-enter(r3)
            java.util.List<java.lang.Integer> r0 = r1.j     // Catch: java.lang.Throwable -> L20
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L20
            r0.add(r2)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L20
            return
        L20:
            r2 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L20
            throw r2
        L23:
            T r3 = r1.a
            if (r3 == 0) goto L35
            com.qq.e.comm.constants.LoadAdParams r0 = r1.o
            com.qq.e.comm.pi.NEADI r3 = (com.qq.e.comm.pi.NEADI) r3
            if (r0 == 0) goto L31
            r3.loadAd(r2, r0)
            return
        L31:
            r3.loadAd(r2)
            return
        L35:
            java.lang.String r2 = "loadAD"
            r1.a(r2)
            return
    }

    public void setAdParams(com.qq.e.comm.constants.LoadAdParams r1) {
            r0 = this;
            r0.o = r1
            return
    }

    public void setMaxVideoDuration(int r2) {
            r1 = this;
            r1.i = r2
            int r2 = r1.i
            if (r2 <= 0) goto L11
            int r2 = r1.h
            int r0 = r1.i
            if (r2 <= r0) goto L11
            java.lang.String r2 = "maxVideoDuration 设置值非法，不得小于minVideoDuration"
            com.qq.e.comm.util.GDTLogger.e(r2)
        L11:
            T r2 = r1.a
            if (r2 == 0) goto L1c
            com.qq.e.comm.pi.NEADI r2 = (com.qq.e.comm.pi.NEADI) r2
            int r0 = r1.i
            r2.setMaxVideoDuration(r0)
        L1c:
            return
    }

    public void setMinVideoDuration(int r2) {
            r1 = this;
            r1.h = r2
            int r2 = r1.i
            if (r2 <= 0) goto L11
            int r2 = r1.h
            int r0 = r1.i
            if (r2 <= r0) goto L11
            java.lang.String r2 = "minVideoDuration 设置值非法，不得大于maxVideoDuration"
            com.qq.e.comm.util.GDTLogger.e(r2)
        L11:
            T r2 = r1.a
            if (r2 == 0) goto L1c
            com.qq.e.comm.pi.NEADI r2 = (com.qq.e.comm.pi.NEADI) r2
            int r0 = r1.h
            r2.setMinVideoDuration(r0)
        L1c:
            return
    }

    @Override // com.qq.e.comm.pi.IReward
    public void setRewardListener(com.qq.e.comm.listeners.ADRewardListener r2) {
            r1 = this;
            com.qq.e.ads.nativ.NativeExpressAD$ADListenerAdapter r0 = r1.n
            r0.setAdRewardListener(r2)
            return
    }

    @Override // com.qq.e.comm.pi.IReward
    public void setServerSideVerificationOptions(com.qq.e.ads.rewardvideo.ServerSideVerificationOptions r2) {
            r1 = this;
            r1.p = r2
            T r0 = r1.a
            if (r0 == 0) goto Lb
            com.qq.e.comm.pi.NEADI r0 = (com.qq.e.comm.pi.NEADI) r0
            r0.setServerSideVerificationOptions(r2)
        Lb:
            return
    }

    public void setVideoOption(com.qq.e.ads.cfg.VideoOption r2) {
            r1 = this;
            r1.k = r2
            T r0 = r1.a
            if (r0 == 0) goto Ld
            if (r2 == 0) goto Ld
            com.qq.e.comm.pi.NEADI r0 = (com.qq.e.comm.pi.NEADI) r0
            r0.setVideoOption(r2)
        Ld:
            return
    }
}
