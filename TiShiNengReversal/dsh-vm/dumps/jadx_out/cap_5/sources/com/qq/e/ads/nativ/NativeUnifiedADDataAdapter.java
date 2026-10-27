package com.qq.e.ads.nativ;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class NativeUnifiedADDataAdapter implements com.qq.e.ads.nativ.NativeUnifiedADData, com.qq.e.comm.compliance.DownloadConfirmListener {
    private com.qq.e.ads.nativ.NativeUnifiedADData a;
    private com.qq.e.ads.nativ.NativeADEventListener b;
    private com.qq.e.ads.nativ.NativeADMediaListener c;
    private com.qq.e.comm.compliance.DownloadConfirmListener d;
    private com.qq.e.comm.listeners.NegativeFeedbackListener e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.qq.e.ads.nativ.NativeUnifiedADDataAdapter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class UnifiedAdListener implements com.qq.e.comm.adevent.ADListener {
        final /* synthetic */ com.qq.e.ads.nativ.NativeUnifiedADDataAdapter a;

        private UnifiedAdListener(com.qq.e.ads.nativ.NativeUnifiedADDataAdapter r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ UnifiedAdListener(com.qq.e.ads.nativ.NativeUnifiedADDataAdapter r1, com.qq.e.ads.nativ.NativeUnifiedADDataAdapter.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.qq.e.comm.adevent.ADListener
        public void onADEvent(com.qq.e.comm.adevent.ADEvent r2) {
                r1 = this;
                com.qq.e.ads.nativ.NativeUnifiedADDataAdapter r0 = r1.a
                boolean r0 = com.qq.e.ads.nativ.NativeUnifiedADDataAdapter.a(r0, r2)
                if (r0 == 0) goto L9
                goto L11
            L9:
                com.qq.e.ads.nativ.NativeUnifiedADDataAdapter r0 = r1.a
                boolean r0 = com.qq.e.ads.nativ.NativeUnifiedADDataAdapter.b(r0, r2)
                if (r0 == 0) goto L12
            L11:
                return
            L12:
                com.qq.e.ads.nativ.NativeUnifiedADDataAdapter r0 = r1.a
                com.qq.e.ads.nativ.NativeUnifiedADDataAdapter.c(r0, r2)
                return
        }
    }

    public NativeUnifiedADDataAdapter(com.qq.e.ads.nativ.NativeUnifiedADData r3) {
            r2 = this;
            r2.<init>()
            r2.a = r3
            boolean r0 = r3 instanceof com.qq.e.comm.adevent.ADEventListener
            if (r0 == 0) goto L14
            com.qq.e.comm.adevent.ADEventListener r3 = (com.qq.e.comm.adevent.ADEventListener) r3
            com.qq.e.ads.nativ.NativeUnifiedADDataAdapter$UnifiedAdListener r0 = new com.qq.e.ads.nativ.NativeUnifiedADDataAdapter$UnifiedAdListener
            r1 = 0
            r0.<init>(r2, r1)
            r3.setAdListener(r0)
        L14:
            return
    }

    static /* synthetic */ boolean a(com.qq.e.ads.nativ.NativeUnifiedADDataAdapter r0, com.qq.e.comm.adevent.ADEvent r1) {
            boolean r0 = r0.a(r1)
            return r0
    }

    private boolean a(com.qq.e.comm.adevent.ADEvent r4) {
            r3 = this;
            com.qq.e.ads.nativ.NativeADEventListener r0 = r3.b
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r4.getType()
            r2 = 103(0x67, float:1.44E-43)
            if (r0 == r2) goto L53
            r2 = 105(0x69, float:1.47E-43)
            if (r0 == r2) goto L39
            r2 = 107(0x6b, float:1.5E-43)
            if (r0 == r2) goto L21
            r4 = 111(0x6f, float:1.56E-43)
            if (r0 == r4) goto L1b
            return r1
        L1b:
            com.qq.e.ads.nativ.NativeADEventListener r4 = r3.b
            r4.onADStatusChanged()
            goto L58
        L21:
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            java.lang.Object r4 = r4.getParam(r0)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L58
            com.qq.e.ads.nativ.NativeADEventListener r0 = r3.b
            int r4 = r4.intValue()
            com.qq.e.comm.util.AdError r4 = com.qq.e.comm.util.AdErrorConvertor.formatErrorCode(r4)
            r0.onADError(r4)
            goto L58
        L39:
            com.qq.e.ads.nativ.NativeADEventListener r0 = r3.b
            boolean r1 = r0 instanceof com.qq.e.ads.nativ.NativeADEventListenerWithClickInfo
            if (r1 == 0) goto L4f
            java.lang.Class<android.view.View> r0 = android.view.View.class
            java.lang.Object r4 = r4.getParam(r0)
            android.view.View r4 = (android.view.View) r4
            com.qq.e.ads.nativ.NativeADEventListener r0 = r3.b
            com.qq.e.ads.nativ.NativeADEventListenerWithClickInfo r0 = (com.qq.e.ads.nativ.NativeADEventListenerWithClickInfo) r0
            r0.onADClicked(r4)
            goto L58
        L4f:
            r0.onADClicked()
            goto L58
        L53:
            com.qq.e.ads.nativ.NativeADEventListener r4 = r3.b
            r4.onADExposed()
        L58:
            r4 = 1
            return r4
    }

    static /* synthetic */ boolean b(com.qq.e.ads.nativ.NativeUnifiedADDataAdapter r0, com.qq.e.comm.adevent.ADEvent r1) {
            boolean r0 = r0.b(r1)
            return r0
    }

    private boolean b(com.qq.e.comm.adevent.ADEvent r4) {
            r3 = this;
            com.qq.e.ads.nativ.NativeADMediaListener r0 = r3.c
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r4.getType()
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            switch(r0) {
                case 201: goto L5c;
                case 202: goto L56;
                case 203: goto L50;
                case 204: goto L4a;
                case 205: goto L44;
                case 206: goto L3e;
                case 207: goto L28;
                case 208: goto L22;
                case 209: goto L1c;
                case 210: goto L16;
                case 211: goto L10;
                default: goto Lf;
            }
        Lf:
            return r1
        L10:
            com.qq.e.ads.nativ.NativeADMediaListener r4 = r3.c
            r4.onVideoLoading()
            goto L6d
        L16:
            com.qq.e.ads.nativ.NativeADMediaListener r4 = r3.c
            r4.onVideoReady()
            goto L6d
        L1c:
            com.qq.e.ads.nativ.NativeADMediaListener r4 = r3.c
            r4.onVideoInit()
            goto L6d
        L22:
            com.qq.e.ads.nativ.NativeADMediaListener r4 = r3.c
            r4.onVideoClicked()
            goto L6d
        L28:
            java.lang.Object r4 = r4.getParam(r2)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L6d
            com.qq.e.ads.nativ.NativeADMediaListener r0 = r3.c
            int r4 = r4.intValue()
            com.qq.e.comm.util.AdError r4 = com.qq.e.comm.util.AdErrorConvertor.formatErrorCode(r4)
            r0.onVideoError(r4)
            goto L6d
        L3e:
            com.qq.e.ads.nativ.NativeADMediaListener r4 = r3.c
            r4.onVideoCompleted()
            goto L6d
        L44:
            com.qq.e.ads.nativ.NativeADMediaListener r4 = r3.c
            r4.onVideoStop()
            goto L6d
        L4a:
            com.qq.e.ads.nativ.NativeADMediaListener r4 = r3.c
            r4.onVideoPause()
            goto L6d
        L50:
            com.qq.e.ads.nativ.NativeADMediaListener r4 = r3.c
            r4.onVideoResume()
            goto L6d
        L56:
            com.qq.e.ads.nativ.NativeADMediaListener r4 = r3.c
            r4.onVideoStart()
            goto L6d
        L5c:
            java.lang.Object r4 = r4.getParam(r2)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L6d
            com.qq.e.ads.nativ.NativeADMediaListener r0 = r3.c
            int r4 = r4.intValue()
            r0.onVideoLoaded(r4)
        L6d:
            r4 = 1
            return r4
    }

    static /* synthetic */ boolean c(com.qq.e.ads.nativ.NativeUnifiedADDataAdapter r0, com.qq.e.comm.adevent.ADEvent r1) {
            boolean r0 = r0.c(r1)
            return r0
    }

    private boolean c(com.qq.e.comm.adevent.ADEvent r3) {
            r2 = this;
            com.qq.e.comm.listeners.NegativeFeedbackListener r0 = r2.e
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r3 = r3.getType()
            r0 = 304(0x130, float:4.26E-43)
            if (r3 == r0) goto Lf
            return r1
        Lf:
            com.qq.e.comm.listeners.NegativeFeedbackListener r3 = r2.e
            r3.onComplainSuccess()
            r3 = 1
            return r3
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADData
    public void bindAdToCustomVideo(android.view.ViewGroup r2, android.content.Context r3, java.util.List<android.view.View> r4, java.util.List<android.view.View> r5) {
            r1 = this;
            com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.a
            r0.bindAdToCustomVideo(r2, r3, r4, r5)
            return
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADData
    public void bindAdToView(android.content.Context r2, com.qq.e.ads.nativ.widget.NativeAdContainer r3, android.widget.FrameLayout.LayoutParams r4, java.util.List<android.view.View> r5) {
            r1 = this;
            com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.a
            r0.bindAdToView(r2, r3, r4, r5)
            return
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADData
    public void bindAdToView(android.content.Context r7, com.qq.e.ads.nativ.widget.NativeAdContainer r8, android.widget.FrameLayout.LayoutParams r9, java.util.List<android.view.View> r10, java.util.List<android.view.View> r11) {
            r6 = this;
            com.qq.e.ads.nativ.NativeUnifiedADData r0 = r6.a
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.bindAdToView(r1, r2, r3, r4, r5)
            return
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADData
    public void bindCTAViews(java.util.List<android.view.View> r2) {
            r1 = this;
            com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.a
            r0.bindCTAViews(r2)
            return
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADData
    public void bindImageViews(java.util.List<android.widget.ImageView> r2, int r3) {
            r1 = this;
            com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.a
            r0.bindImageViews(r2, r3)
            return
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADData
    public void bindImageViews(java.util.List<android.widget.ImageView> r2, byte[] r3) {
            r1 = this;
            com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.a
            r0.bindImageViews(r2, r3)
            return
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADData
    public void bindMediaView(com.qq.e.ads.nativ.MediaView r2, com.qq.e.ads.cfg.VideoOption r3, com.qq.e.ads.nativ.NativeADMediaListener r4) {
            r1 = this;
            r1.c = r4
            com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.a
            r0.bindMediaView(r2, r3, r4)
            return
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADData
    public void destroy() {
            r1 = this;
            com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.a
            r0.destroy()
            return
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADData
    public boolean equalsAdData(com.qq.e.ads.nativ.NativeUnifiedADData r2) {
            r1 = this;
            com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.a
            boolean r2 = r0.equalsAdData(r2)
            return r2
    }

    public com.qq.e.ads.nativ.NativeUnifiedADData getAdData() {
            r1 = this;
            com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.a
            return r0
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADData
    public int getAdPatternType() {
            r1 = this;
            com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.a
            int r0 = r0.getAdPatternType()
            return r0
    }

    @Override // com.qq.e.comm.compliance.ApkDownloadComplianceInterface
    public java.lang.String getApkInfoUrl() {
            r1 = this;
            com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.a
            java.lang.String r0 = r0.getApkInfoUrl()
            return r0
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADData
    public com.qq.e.ads.nativ.NativeUnifiedADAppMiitInfo getAppMiitInfo() {
            r1 = this;
            com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.a
            com.qq.e.ads.nativ.NativeUnifiedADAppMiitInfo r0 = r0.getAppMiitInfo()
            return r0
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADData
    public double getAppPrice() {
            r2 = this;
            com.qq.e.ads.nativ.NativeUnifiedADData r0 = r2.a
            double r0 = r0.getAppPrice()
            return r0
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADData
    public int getAppScore() {
            r1 = this;
            com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.a
            int r0 = r0.getAppScore()
            return r0
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADData
    public int getAppStatus() {
            r1 = this;
            com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.a
            int r0 = r0.getAppStatus()
            return r0
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADData
    public java.lang.String getButtonText() {
            r1 = this;
            com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.a
            java.lang.String r0 = r0.getButtonText()
            return r0
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADData
    public java.lang.String getCTAText() {
            r1 = this;
            com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.a
            java.lang.String r0 = r0.getCTAText()
            return r0
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADData
    public com.qq.e.ads.nativ.CustomizeVideo getCustomizeVideo() {
            r1 = this;
            com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.a
            com.qq.e.ads.nativ.CustomizeVideo r0 = r0.getCustomizeVideo()
            return r0
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADData
    public java.lang.String getDesc() {
            r1 = this;
            com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.a
            java.lang.String r0 = r0.getDesc()
            return r0
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADData
    public long getDownloadCount() {
            r2 = this;
            com.qq.e.ads.nativ.NativeUnifiedADData r0 = r2.a
            long r0 = r0.getDownloadCount()
            return r0
    }

    @Override // com.qq.e.comm.pi.LADI
    public int getECPM() {
            r1 = this;
            com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.a
            int r0 = r0.getECPM()
            return r0
    }

    @Override // com.qq.e.comm.pi.LADI
    public java.lang.String getECPMLevel() {
            r1 = this;
            com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.a
            java.lang.String r0 = r0.getECPMLevel()
            return r0
    }

    @Override // com.qq.e.comm.pi.LADI
    public java.util.Map<java.lang.String, java.lang.Object> getExtraInfo() {
            r1 = this;
            com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.a
            java.util.Map r0 = r0.getExtraInfo()
            return r0
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADData
    public java.lang.String getIconUrl() {
            r1 = this;
            com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.a
            java.lang.String r0 = r0.getIconUrl()
            return r0
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADData
    public java.util.List<java.lang.String> getImgList() {
            r1 = this;
            com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.a
            java.util.List r0 = r0.getImgList()
            return r0
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADData
    public java.lang.String getImgUrl() {
            r1 = this;
            com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.a
            java.lang.String r0 = r0.getImgUrl()
            return r0
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADData
    public int getPictureHeight() {
            r1 = this;
            com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.a
            int r0 = r0.getPictureHeight()
            return r0
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADData
    public int getPictureWidth() {
            r1 = this;
            com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.a
            int r0 = r0.getPictureWidth()
            return r0
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADData
    public int getProgress() {
            r1 = this;
            com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.a
            int r0 = r0.getProgress()
            return r0
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADData
    public java.lang.String getTitle() {
            r1 = this;
            com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.a
            java.lang.String r0 = r0.getTitle()
            return r0
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADData
    public int getVideoCurrentPosition() {
            r1 = this;
            com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.a
            int r0 = r0.getVideoCurrentPosition()
            return r0
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADData
    public int getVideoDuration() {
            r1 = this;
            com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.a
            int r0 = r0.getVideoDuration()
            return r0
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADData
    public boolean isAppAd() {
            r1 = this;
            com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.a
            boolean r0 = r0.isAppAd()
            return r0
    }

    @Override // com.qq.e.comm.pi.LADI
    public boolean isValid() {
            r1 = this;
            com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.a
            boolean r0 = r0.isValid()
            return r0
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADData
    public boolean isWeChatCanvasAd() {
            r1 = this;
            com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.a
            boolean r0 = r0.isWeChatCanvasAd()
            return r0
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADData
    public void negativeFeedback() {
            r1 = this;
            com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.a
            r0.negativeFeedback()
            return
    }

    @Override // com.qq.e.comm.compliance.DownloadConfirmListener
    public void onDownloadConfirm(android.app.Activity r2, int r3, java.lang.String r4, com.qq.e.comm.compliance.DownloadConfirmCallBack r5) {
            r1 = this;
            com.qq.e.comm.compliance.DownloadConfirmListener r0 = r1.d
            if (r0 == 0) goto L7
            r0.onDownloadConfirm(r2, r3, r4, r5)
        L7:
            return
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADData
    public void pauseAppDownload() {
            r1 = this;
            com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.a
            r0.pauseAppDownload()
            return
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADData
    public void pauseVideo() {
            r1 = this;
            com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.a
            r0.pauseVideo()
            return
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADData
    public void resume() {
            r0 = this;
            return
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADData
    public void resumeAppDownload() {
            r1 = this;
            com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.a
            r0.resumeAppDownload()
            return
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADData
    public void resumeVideo() {
            r1 = this;
            com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.a
            r0.resumeVideo()
            return
    }

    @Override // com.qq.e.comm.pi.IBidding
    public void sendLossNotification(int r2, int r3, java.lang.String r4) {
            r1 = this;
            com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.a
            r0.sendLossNotification(r2, r3, r4)
            return
    }

    @Override // com.qq.e.comm.pi.IBiddingLoss
    public void sendLossNotification(java.util.Map<java.lang.String, java.lang.Object> r2) {
            r1 = this;
            com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.a
            r0.sendLossNotification(r2)
            return
    }

    @Override // com.qq.e.comm.pi.IBidding
    public void sendWinNotification(int r2) {
            r1 = this;
            com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.a
            r0.sendWinNotification(r2)
            return
    }

    @Override // com.qq.e.comm.pi.IBidding
    public void sendWinNotification(java.util.Map<java.lang.String, java.lang.Object> r2) {
            r1 = this;
            com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.a
            r0.sendWinNotification(r2)
            return
    }

    @Override // com.qq.e.comm.pi.IBidding
    public void setBidECPM(int r2) {
            r1 = this;
            com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.a
            r0.setBidECPM(r2)
            return
    }

    @Override // com.qq.e.comm.compliance.ApkDownloadComplianceInterface
    public void setDownloadConfirmListener(com.qq.e.comm.compliance.DownloadConfirmListener r1) {
            r0 = this;
            r0.d = r1
            com.qq.e.ads.nativ.NativeUnifiedADData r1 = r0.a
            if (r1 == 0) goto L9
            r1.setDownloadConfirmListener(r0)
        L9:
            return
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADData
    public void setNativeAdEventListener(com.qq.e.ads.nativ.NativeADEventListener r1) {
            r0 = this;
            r0.b = r1
            return
    }

    @Override // com.qq.e.comm.pi.NFBI
    public void setNegativeFeedbackListener(com.qq.e.comm.listeners.NegativeFeedbackListener r1) {
            r0 = this;
            r0.e = r1
            return
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADData
    public void setVideoMute(boolean r2) {
            r1 = this;
            com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.a
            r0.setVideoMute(r2)
            return
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADData
    public void startVideo() {
            r1 = this;
            com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.a
            r0.startVideo()
            return
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADData
    public void stopVideo() {
            r1 = this;
            com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.a
            r0.stopVideo()
            return
    }
}
