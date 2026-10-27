package com.qq.e.ads.interstitial2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
class ADListenerAdapter implements com.qq.e.comm.adevent.ADListener {
    private final com.qq.e.ads.interstitial2.UnifiedInterstitialADListener a;
    private com.qq.e.ads.interstitial2.UnifiedInterstitialMediaListener b;
    private com.qq.e.comm.listeners.ADRewardListener c;
    private com.qq.e.comm.listeners.NegativeFeedbackListener d;

    static {
            return
    }

    ADListenerAdapter(com.qq.e.ads.interstitial2.UnifiedInterstitialADListener r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // com.qq.e.comm.adevent.ADListener
    public void onADEvent(com.qq.e.comm.adevent.ADEvent r4) {
            r3 = this;
            if (r4 != 0) goto L4
            goto L12b
        L4:
            int r0 = r4.getType()
            r1 = 109(0x6d, float:1.53E-43)
            if (r0 == r1) goto L11c
            r1 = 110(0x6e, float:1.54E-43)
            if (r0 == r1) goto L10c
            r1 = 201(0xc9, float:2.82E-43)
            if (r0 == r1) goto L104
            r1 = 202(0xca, float:2.83E-43)
            if (r0 == r1) goto Lfc
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto Lf4
            r1 = 206(0xce, float:2.89E-43)
            if (r0 == r1) goto Lec
            r1 = 207(0xcf, float:2.9E-43)
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            if (r0 == r1) goto Ld4
            switch(r0) {
                case 100: goto Lcc;
                case 101: goto Lb4;
                case 102: goto Lac;
                case 103: goto La4;
                case 104: goto L86;
                case 105: goto L7e;
                case 106: goto L76;
                default: goto L29;
            }
        L29:
            switch(r0) {
                case 209: goto L6e;
                case 210: goto L59;
                case 211: goto L51;
                default: goto L2c;
            }
        L2c:
            switch(r0) {
                case 301: goto L49;
                case 302: goto L41;
                case 303: goto L39;
                case 304: goto L31;
                default: goto L2f;
            }
        L2f:
            goto L12b
        L31:
            com.qq.e.comm.listeners.NegativeFeedbackListener r4 = r3.d
            if (r4 == 0) goto L12b
            r4.onComplainSuccess()
            return
        L39:
            com.qq.e.ads.interstitial2.UnifiedInterstitialADListener r4 = r3.a
            if (r4 == 0) goto L12b
            r4.onADLeftApplication()
            return
        L41:
            com.qq.e.ads.interstitial2.UnifiedInterstitialMediaListener r4 = r3.b
            if (r4 == 0) goto L12b
            r4.onVideoPageClose()
            return
        L49:
            com.qq.e.ads.interstitial2.UnifiedInterstitialMediaListener r4 = r3.b
            if (r4 == 0) goto L12b
            r4.onVideoPageOpen()
            return
        L51:
            com.qq.e.ads.interstitial2.UnifiedInterstitialMediaListener r4 = r3.b
            if (r4 == 0) goto L12b
            r4.onVideoLoading()
            return
        L59:
            java.lang.Object r4 = r4.getParam(r2)
            java.lang.Integer r4 = (java.lang.Integer) r4
            com.qq.e.ads.interstitial2.UnifiedInterstitialMediaListener r0 = r3.b
            if (r0 == 0) goto L12b
            if (r4 == 0) goto L12b
            int r4 = r4.intValue()
            long r1 = (long) r4
            r0.onVideoReady(r1)
            return
        L6e:
            com.qq.e.ads.interstitial2.UnifiedInterstitialMediaListener r4 = r3.b
            if (r4 == 0) goto L12b
            r4.onVideoInit()
            return
        L76:
            com.qq.e.ads.interstitial2.UnifiedInterstitialADListener r4 = r3.a
            if (r4 == 0) goto L12b
            r4.onADClosed()
            return
        L7e:
            com.qq.e.ads.interstitial2.UnifiedInterstitialADListener r4 = r3.a
            if (r4 == 0) goto L12b
            r4.onADClicked()
            return
        L86:
            com.qq.e.comm.listeners.ADRewardListener r0 = r3.c
            if (r0 == 0) goto L12b
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Object r4 = r4.getParam(r0)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L12b
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "transId"
            r0.put(r1, r4)
            com.qq.e.comm.listeners.ADRewardListener r4 = r3.c
            r4.onReward(r0)
            return
        La4:
            com.qq.e.ads.interstitial2.UnifiedInterstitialADListener r4 = r3.a
            if (r4 == 0) goto L12b
            r4.onADExposure()
            return
        Lac:
            com.qq.e.ads.interstitial2.UnifiedInterstitialADListener r4 = r3.a
            if (r4 == 0) goto L12b
            r4.onADOpened()
            return
        Lb4:
            java.lang.Object r4 = r4.getParam(r2)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L12b
            com.qq.e.ads.interstitial2.UnifiedInterstitialADListener r0 = r3.a
            if (r0 == 0) goto L12b
            int r4 = r4.intValue()
            com.qq.e.comm.util.AdError r4 = com.qq.e.comm.util.AdErrorConvertor.formatErrorCode(r4)
            r0.onNoAD(r4)
            return
        Lcc:
            com.qq.e.ads.interstitial2.UnifiedInterstitialADListener r4 = r3.a
            if (r4 == 0) goto L12b
            r4.onADReceive()
            return
        Ld4:
            java.lang.Object r4 = r4.getParam(r2)
            java.lang.Integer r4 = (java.lang.Integer) r4
            com.qq.e.ads.interstitial2.UnifiedInterstitialMediaListener r0 = r3.b
            if (r0 == 0) goto L12b
            if (r4 == 0) goto L12b
            int r4 = r4.intValue()
            com.qq.e.comm.util.AdError r4 = com.qq.e.comm.util.AdErrorConvertor.formatErrorCode(r4)
            r0.onVideoError(r4)
            return
        Lec:
            com.qq.e.ads.interstitial2.UnifiedInterstitialMediaListener r4 = r3.b
            if (r4 == 0) goto L12b
            r4.onVideoComplete()
            return
        Lf4:
            com.qq.e.ads.interstitial2.UnifiedInterstitialMediaListener r4 = r3.b
            if (r4 == 0) goto L12b
            r4.onVideoPause()
            return
        Lfc:
            com.qq.e.ads.interstitial2.UnifiedInterstitialMediaListener r4 = r3.b
            if (r4 == 0) goto L12b
            r4.onVideoStart()
            return
        L104:
            com.qq.e.ads.interstitial2.UnifiedInterstitialADListener r4 = r3.a
            if (r4 == 0) goto L12b
            r4.onVideoCached()
            return
        L10c:
            com.qq.e.ads.interstitial2.UnifiedInterstitialADListener r4 = r3.a
            if (r4 == 0) goto L12b
            boolean r4 = com.qq.e.comm.util.a.a(r4)
            if (r4 == 0) goto L12b
            com.qq.e.ads.interstitial2.UnifiedInterstitialADListener r4 = r3.a
            r4.onRenderFail()
            return
        L11c:
            com.qq.e.ads.interstitial2.UnifiedInterstitialADListener r4 = r3.a
            if (r4 == 0) goto L12b
            boolean r4 = com.qq.e.comm.util.a.b(r4)
            if (r4 == 0) goto L12b
            com.qq.e.ads.interstitial2.UnifiedInterstitialADListener r4 = r3.a
            r4.onRenderSuccess()
        L12b:
            return
    }

    public void setAdRewardListener(com.qq.e.comm.listeners.ADRewardListener r1) {
            r0 = this;
            r0.c = r1
            return
    }

    public void setMediaListener(com.qq.e.ads.interstitial2.UnifiedInterstitialMediaListener r1) {
            r0 = this;
            r0.b = r1
            return
    }

    public void setNegativeFeedbackListener(com.qq.e.comm.listeners.NegativeFeedbackListener r1) {
            r0 = this;
            r0.d = r1
            return
    }
}
