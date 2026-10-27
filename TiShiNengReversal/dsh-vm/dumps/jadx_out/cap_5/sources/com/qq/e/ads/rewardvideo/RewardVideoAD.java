package com.qq.e.ads.rewardvideo;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class RewardVideoAD extends com.qq.e.ads.LiteAbstractAD<com.qq.e.comm.pi.RVADI> implements com.qq.e.comm.pi.NFBI {
    public static final int REWARD_TYPE_PAGE = 1;
    public static final int REWARD_TYPE_VIDEO = 0;
    private final com.qq.e.ads.rewardvideo.RewardVideoADListener i;
    private volatile boolean j;
    private com.qq.e.comm.constants.LoadAdParams k;
    private com.qq.e.ads.rewardvideo.ServerSideVerificationOptions l;
    private final boolean m;
    private final com.qq.e.ads.rewardvideo.RewardVideoAD.ADListenerAdapter n;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class ADListenerAdapter implements com.qq.e.comm.adevent.ADListener {
        private com.qq.e.comm.listeners.NegativeFeedbackListener a;
        public com.qq.e.ads.rewardvideo.RewardVideoADListener adListener;

        public ADListenerAdapter(com.qq.e.ads.rewardvideo.RewardVideoADListener r1) {
                r0 = this;
                r0.<init>()
                r0.adListener = r1
                return
        }

        static /* synthetic */ void a(com.qq.e.ads.rewardvideo.RewardVideoAD.ADListenerAdapter r0, com.qq.e.comm.listeners.NegativeFeedbackListener r1) {
                r0.a(r1)
                return
        }

        private void a(com.qq.e.comm.listeners.NegativeFeedbackListener r1) {
                r0 = this;
                r0.a = r1
                return
        }

        @Override // com.qq.e.comm.adevent.ADListener
        public void onADEvent(com.qq.e.comm.adevent.ADEvent r5) {
                r4 = this;
                int r0 = r5.getType()
                r1 = 100
                if (r0 == r1) goto L84
                r1 = 201(0xc9, float:2.82E-43)
                if (r0 == r1) goto L7e
                r1 = 206(0xce, float:2.89E-43)
                if (r0 == r1) goto L78
                r1 = 304(0x130, float:4.26E-43)
                if (r0 == r1) goto L70
                java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
                switch(r0) {
                    case 102: goto L6a;
                    case 103: goto L64;
                    case 104: goto L3c;
                    case 105: goto L36;
                    case 106: goto L30;
                    case 107: goto L1a;
                    default: goto L19;
                }
            L19:
                goto L77
            L1a:
                java.lang.Object r5 = r5.getParam(r1)
                java.lang.Integer r5 = (java.lang.Integer) r5
                if (r5 == 0) goto L77
                com.qq.e.ads.rewardvideo.RewardVideoADListener r0 = r4.adListener
                int r5 = r5.intValue()
                com.qq.e.comm.util.AdError r5 = com.qq.e.comm.util.AdErrorConvertor.formatErrorCode(r5)
                r0.onError(r5)
                return
            L30:
                com.qq.e.ads.rewardvideo.RewardVideoADListener r5 = r4.adListener
                r5.onADClose()
                return
            L36:
                com.qq.e.ads.rewardvideo.RewardVideoADListener r5 = r4.adListener
                r5.onADClick()
                return
            L3c:
                java.lang.Class<java.lang.String> r0 = java.lang.String.class
                java.lang.Object r0 = r5.getParam(r0)
                java.lang.String r0 = (java.lang.String) r0
                if (r0 == 0) goto L77
                java.util.HashMap r2 = new java.util.HashMap
                r2.<init>()
                java.lang.String r3 = "transId"
                r2.put(r3, r0)
                r0 = 1
                java.lang.Object r5 = r5.getParam(r0, r1)
                java.lang.Integer r5 = (java.lang.Integer) r5
                if (r5 == 0) goto L5e
                java.lang.String r0 = "rewardAction"
                r2.put(r0, r5)
            L5e:
                com.qq.e.ads.rewardvideo.RewardVideoADListener r5 = r4.adListener
                r5.onReward(r2)
                return
            L64:
                com.qq.e.ads.rewardvideo.RewardVideoADListener r5 = r4.adListener
                r5.onADExpose()
                return
            L6a:
                com.qq.e.ads.rewardvideo.RewardVideoADListener r5 = r4.adListener
                r5.onADShow()
                return
            L70:
                com.qq.e.comm.listeners.NegativeFeedbackListener r5 = r4.a
                if (r5 == 0) goto L77
                r5.onComplainSuccess()
            L77:
                return
            L78:
                com.qq.e.ads.rewardvideo.RewardVideoADListener r5 = r4.adListener
                r5.onVideoComplete()
                return
            L7e:
                com.qq.e.ads.rewardvideo.RewardVideoADListener r5 = r4.adListener
                r5.onVideoCached()
                return
            L84:
                com.qq.e.ads.rewardvideo.RewardVideoADListener r5 = r4.adListener
                r5.onADLoad()
                return
        }
    }

    public RewardVideoAD(android.content.Context r2, java.lang.String r3, com.qq.e.ads.rewardvideo.RewardVideoADListener r4) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public RewardVideoAD(android.content.Context r1, java.lang.String r2, com.qq.e.ads.rewardvideo.RewardVideoADListener r3, boolean r4) {
            r0 = this;
            r0.<init>(r3, r4)
            r0.a(r1, r2)
            return
    }

    public RewardVideoAD(android.content.Context r1, java.lang.String r2, com.qq.e.ads.rewardvideo.RewardVideoADListener r3, boolean r4, java.lang.String r5) {
            r0 = this;
            r0.<init>(r3, r4)
            r0.a(r1, r2, r5)
            return
    }

    private RewardVideoAD(com.qq.e.ads.rewardvideo.RewardVideoADListener r2, boolean r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.k = r0
            r1.m = r3
            r1.i = r2
            com.qq.e.ads.rewardvideo.RewardVideoAD$ADListenerAdapter r3 = new com.qq.e.ads.rewardvideo.RewardVideoAD$ADListenerAdapter
            r3.<init>(r2)
            r1.n = r3
            return
    }

    @Override // com.qq.e.ads.AbstractAD
    protected /* bridge */ /* synthetic */ java.lang.Object a(android.content.Context r1, com.qq.e.comm.pi.POFactory r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r0 = this;
            com.qq.e.comm.pi.RVADI r1 = r0.b(r1, r2, r3, r4, r5)
            return r1
    }

    protected void a(com.qq.e.comm.pi.RVADI r2) {
            r1 = this;
            boolean r0 = r1.m
            r2.setVolumeOn(r0)
            com.qq.e.comm.constants.LoadAdParams r0 = r1.k
            r2.setLoadAdParams(r0)
            com.qq.e.ads.rewardvideo.ServerSideVerificationOptions r0 = r1.l
            r2.setServerSideVerificationOptions(r0)
            boolean r2 = r1.j
            if (r2 == 0) goto L16
            r1.loadAD()
        L16:
            return
    }

    @Override // com.qq.e.ads.AbstractAD
    protected /* bridge */ /* synthetic */ void a(java.lang.Object r1) {
            r0 = this;
            com.qq.e.comm.pi.RVADI r1 = (com.qq.e.comm.pi.RVADI) r1
            r0.a(r1)
            return
    }

    protected com.qq.e.comm.pi.RVADI b(android.content.Context r7, com.qq.e.comm.pi.POFactory r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
            r6 = this;
            com.qq.e.ads.rewardvideo.RewardVideoAD$ADListenerAdapter r5 = r6.n
            r1 = r7
            r0 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            com.qq.e.comm.pi.RVADI r7 = r0.getRewardVideoADDelegate(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // com.qq.e.ads.AbstractAD
    protected void b(int r2) {
            r1 = this;
            com.qq.e.ads.rewardvideo.RewardVideoADListener r0 = r1.i
            if (r0 == 0) goto Lb
            com.qq.e.comm.util.AdError r2 = com.qq.e.comm.util.AdErrorConvertor.formatErrorCode(r2)
            r0.onError(r2)
        Lb:
            return
    }

    public java.lang.String getAdNetWorkName() {
            r1 = this;
            T r0 = r1.a
            if (r0 == 0) goto Lb
            com.qq.e.comm.pi.RVADI r0 = (com.qq.e.comm.pi.RVADI) r0
            java.lang.String r0 = r0.getAdNetWorkName()
            return r0
        Lb:
            java.lang.String r0 = "getAdNetWorkName"
            r1.a(r0)
            r0 = 0
            return r0
    }

    public int getRewardAdType() {
            r1 = this;
            T r0 = r1.a
            if (r0 == 0) goto Lb
            com.qq.e.comm.pi.RVADI r0 = (com.qq.e.comm.pi.RVADI) r0
            int r0 = r0.getRewardAdType()
            return r0
        Lb:
            java.lang.String r0 = "getRewardAdType"
            r1.a(r0)
            r0 = 0
            return r0
    }

    public int getVideoDuration() {
            r1 = this;
            T r0 = r1.a
            if (r0 == 0) goto Lb
            com.qq.e.comm.pi.RVADI r0 = (com.qq.e.comm.pi.RVADI) r0
            int r0 = r0.getVideoDuration()
            return r0
        Lb:
            java.lang.String r0 = "getVideoDuration"
            r1.a(r0)
            r0 = 0
            return r0
    }

    public boolean hasShown() {
            r1 = this;
            T r0 = r1.a
            if (r0 == 0) goto Lb
            com.qq.e.comm.pi.RVADI r0 = (com.qq.e.comm.pi.RVADI) r0
            boolean r0 = r0.hasShown()
            return r0
        Lb:
            java.lang.String r0 = "hasShown"
            r1.a(r0)
            r0 = 0
            return r0
    }

    public void loadAD() {
            r1 = this;
            boolean r0 = r1.a()
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r1.b()
            if (r0 != 0) goto L11
            r0 = 1
            r1.j = r0
            return
        L11:
            T r0 = r1.a
            if (r0 == 0) goto L1b
            com.qq.e.comm.pi.RVADI r0 = (com.qq.e.comm.pi.RVADI) r0
            r0.loadAD()
            return
        L1b:
            java.lang.String r0 = "loadAD"
            r1.a(r0)
            return
    }

    public void setLoadAdParams(com.qq.e.comm.constants.LoadAdParams r2) {
            r1 = this;
            r1.k = r2
            T r0 = r1.a
            if (r0 == 0) goto Lb
            com.qq.e.comm.pi.RVADI r0 = (com.qq.e.comm.pi.RVADI) r0
            r0.setLoadAdParams(r2)
        Lb:
            return
    }

    @Override // com.qq.e.comm.pi.NFBI
    public void setNegativeFeedbackListener(com.qq.e.comm.listeners.NegativeFeedbackListener r2) {
            r1 = this;
            com.qq.e.ads.rewardvideo.RewardVideoAD$ADListenerAdapter r0 = r1.n
            com.qq.e.ads.rewardvideo.RewardVideoAD.ADListenerAdapter.a(r0, r2)
            return
    }

    public void setServerSideVerificationOptions(com.qq.e.ads.rewardvideo.ServerSideVerificationOptions r2) {
            r1 = this;
            r1.l = r2
            T r0 = r1.a
            if (r0 == 0) goto Lb
            com.qq.e.comm.pi.RVADI r0 = (com.qq.e.comm.pi.RVADI) r0
            r0.setServerSideVerificationOptions(r2)
        Lb:
            return
    }

    public void showAD() {
            r1 = this;
            T r0 = r1.a
            if (r0 == 0) goto La
            com.qq.e.comm.pi.RVADI r0 = (com.qq.e.comm.pi.RVADI) r0
            r0.showAD()
            return
        La:
            java.lang.String r0 = "showAD"
            r1.a(r0)
            return
    }

    public void showAD(android.app.Activity r2) {
            r1 = this;
            T r0 = r1.a
            if (r0 == 0) goto La
            com.qq.e.comm.pi.RVADI r0 = (com.qq.e.comm.pi.RVADI) r0
            r0.showAD(r2)
            return
        La:
            java.lang.String r2 = "showAD"
            r1.a(r2)
            return
    }
}
