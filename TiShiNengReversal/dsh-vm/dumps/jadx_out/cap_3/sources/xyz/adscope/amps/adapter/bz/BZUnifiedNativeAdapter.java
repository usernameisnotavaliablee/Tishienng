package xyz.adscope.amps.adapter.bz;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class BZUnifiedNativeAdapter extends xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter<com.beizi.fusion.NativeUnifiedAdResponse> {
    private com.beizi.fusion.NativeUnifiedAd mUnifiedAd;
    private xyz.adscope.amps.adapter.bz.BZUnifiedNativeAdapter.BeiziTransformEntry response;


    public static class BeiziTransformEntry extends xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry {
        private com.beizi.fusion.NativeUnifiedAdResponse mSrc;

        private BeiziTransformEntry(com.beizi.fusion.NativeUnifiedAdResponse r2, android.content.Context r3, int r4) {
                r1 = this;
                r0 = 0
                r1.<init>(r3, r4, r0, r0)
                r1.mSrc = r2
                return
        }

        public /* synthetic */ BeiziTransformEntry(com.beizi.fusion.NativeUnifiedAdResponse r1, android.content.Context r2, int r3, xyz.adscope.amps.adapter.bz.BZUnifiedNativeAdapter.AnonymousClass1 r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener access$600(xyz.adscope.amps.adapter.bz.BZUnifiedNativeAdapter.BeiziTransformEntry r0) {
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener r0 = r0.getAdEventListener()
                return r0
        }

        private xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener getAdEventListener() {
                r1 = this;
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener r0 = r1.mAdEventListener
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public void bindAdToMediaView(android.app.Activity r1, xyz.adscope.amps.ad.unified.view.AMPSUnifiedMediaViewStub r2, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedVideoListener r3) {
                r0 = this;
                com.beizi.fusion.NativeUnifiedAdResponse r1 = r0.mSrc
                android.view.View r1 = r1.getVideoView()
                if (r1 == 0) goto Lb
                r2.addView(r1)
            Lb:
                return
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public void bindAdToRootContainer(android.app.Activity r1, xyz.adscope.amps.ad.unified.view.AMPSUnifiedRootContainer r2, java.util.List<android.view.View> r3, java.util.List<android.view.View> r4) {
                r0 = this;
                com.beizi.fusion.NativeUnifiedAdResponse r1 = r0.mSrc
                android.view.ViewGroup r1 = r1.getViewContainer()
                xyz.adscope.amps.ad.unified.view.AMPSRootInsertHelper.insertRootView(r2, r1)
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                if (r3 == 0) goto L19
                boolean r2 = r3.isEmpty()
                if (r2 != 0) goto L19
                r1.addAll(r3)
            L19:
                if (r4 == 0) goto L24
                boolean r2 = r4.isEmpty()
                if (r2 != 0) goto L24
                r1.addAll(r4)
            L24:
                com.beizi.fusion.NativeUnifiedAdResponse r2 = r0.mSrc
                r2.registerViewForInteraction(r1)
                return
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public java.lang.String getActionButtonText() {
                r1 = this;
                com.beizi.fusion.NativeUnifiedAdResponse r0 = r1.mSrc
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.lang.String r0 = r0.getActionText()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern getAdPattern() {
                r2 = this;
                com.beizi.fusion.NativeUnifiedAdResponse r0 = r2.mSrc
                if (r0 != 0) goto L7
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern r0 = xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern.AD_PATTERN_UNKNOWN
                return r0
            L7:
                int r0 = r0.getMaterialType()
                r1 = 1
                if (r0 != r1) goto L11
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern r0 = xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern.AD_PATTERN_TEXT_IMAGE
                return r0
            L11:
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern r0 = xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern.AD_PATTERN_UNKNOWN
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public android.view.View getAdSourceLogo() {
                r3 = this;
                com.beizi.fusion.NativeUnifiedAdResponse r0 = r3.mSrc
                if (r0 == 0) goto L4b
                android.content.Context r0 = r3.mContext
                if (r0 != 0) goto L9
                goto L4b
            L9:
                java.lang.String r0 = "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"
                android.graphics.Bitmap r0 = xyz.adscope.amps.adapter.bz.util.BZBase64Util.base64ToBitmap(r0)
                if (r0 != 0) goto L40
                android.widget.TextView r0 = new android.widget.TextView
                android.content.Context r1 = r3.mContext
                r0.<init>(r1)
                java.lang.String r1 = "倍孜"
                r0.setText(r1)
                java.lang.String r1 = "#FFFFFF"
                int r1 = android.graphics.Color.parseColor(r1)
                r0.setTextColor(r1)
                r1 = 5
                r2 = 4
                r0.setPadding(r1, r2, r1, r2)
                java.lang.String r1 = "#33000000"
                int r1 = android.graphics.Color.parseColor(r1)
                r0.setBackgroundColor(r1)
                r1 = 2
                r2 = 1094713344(0x41400000, float:12.0)
                r0.setTextSize(r1, r2)
                r1 = 17
                r0.setGravity(r1)
                return r0
            L40:
                android.widget.ImageView r1 = new android.widget.ImageView
                android.content.Context r2 = r3.mContext
                r1.<init>(r2)
                r1.setImageBitmap(r0)
                return r1
            L4b:
                r0 = 0
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
        public java.lang.String getAppDescription() {
                r2 = this;
                com.beizi.fusion.NativeUnifiedAdResponse r0 = r2.mSrc
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                com.beizi.fusion.model.UnifiedAdDownloadAppInfo r0 = r0.getDownloadAppInfo()
                if (r0 == 0) goto Lf
                r0.getAppIntro()
            Lf:
                return r1
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public xyz.adscope.amps.ad.unified.inter.AMPSAppDetail getAppDetail() {
                r0 = this;
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
        public java.lang.String getAppDeveloper() {
                r2 = this;
                com.beizi.fusion.NativeUnifiedAdResponse r0 = r2.mSrc
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                com.beizi.fusion.model.UnifiedAdDownloadAppInfo r0 = r0.getDownloadAppInfo()
                if (r0 == 0) goto Lf
                r0.getAppDeveloper()
            Lf:
                return r1
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
        public java.lang.String getAppName() {
                r1 = this;
                com.beizi.fusion.NativeUnifiedAdResponse r0 = r1.mSrc
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                com.beizi.fusion.model.UnifiedAdDownloadAppInfo r0 = r0.getDownloadAppInfo()
                if (r0 == 0) goto Lf
                r0.getAppName()
            Lf:
                java.lang.String r0 = ""
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
        public java.lang.String getAppPermissionInfo() {
                r2 = this;
                com.beizi.fusion.NativeUnifiedAdResponse r0 = r2.mSrc
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                com.beizi.fusion.model.UnifiedAdDownloadAppInfo r0 = r0.getDownloadAppInfo()
                if (r0 == 0) goto L11
                java.lang.String r0 = r0.getAppPermission()
                return r0
            L11:
                return r1
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
        public java.lang.String getAppPrivacyPolicy() {
                r2 = this;
                com.beizi.fusion.NativeUnifiedAdResponse r0 = r2.mSrc
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                com.beizi.fusion.model.UnifiedAdDownloadAppInfo r0 = r0.getDownloadAppInfo()
                if (r0 == 0) goto Lf
                r0.getAppPrivacy()
            Lf:
                return r1
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
        public java.lang.String getAppVersion() {
                r2 = this;
                com.beizi.fusion.NativeUnifiedAdResponse r0 = r2.mSrc
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                com.beizi.fusion.model.UnifiedAdDownloadAppInfo r0 = r0.getDownloadAppInfo()
                if (r0 == 0) goto Lf
                r0.getAppVersion()
            Lf:
                return r1
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public java.lang.String getDesc() {
                r1 = this;
                com.beizi.fusion.NativeUnifiedAdResponse r0 = r1.mSrc
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.lang.String r0 = r0.getDescription()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public java.lang.String getIconUrl() {
                r1 = this;
                com.beizi.fusion.NativeUnifiedAdResponse r0 = r1.mSrc
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.lang.String r0 = r0.getIconUrl()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public java.util.List<java.lang.String> getImagesUrl() {
                r1 = this;
                com.beizi.fusion.NativeUnifiedAdResponse r0 = r1.mSrc
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.util.List r0 = r0.getImgList()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public java.lang.String getMainImageUrl() {
                r1 = this;
                com.beizi.fusion.NativeUnifiedAdResponse r0 = r1.mSrc
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.lang.String r0 = r0.getImageUrl()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public java.lang.String getTitle() {
                r1 = this;
                com.beizi.fusion.NativeUnifiedAdResponse r0 = r1.mSrc
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.lang.String r0 = r0.getTitle()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public boolean isValid() {
                r1 = this;
                com.beizi.fusion.NativeUnifiedAdResponse r0 = r1.mSrc
                if (r0 == 0) goto L6
                r0 = 1
                return r0
            L6:
                r0 = 0
                return r0
        }

        public void setEcpm(int r1) {
                r0 = this;
                r0.ecpm = r1
                return
        }
    }

    public BZUnifiedNativeAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void access$101(xyz.adscope.amps.adapter.bz.BZUnifiedNativeAdapter r0, java.lang.String r1, java.lang.String r2) {
            super.onAdFailed(r1, r2)
            return
    }

    public static /* synthetic */ void access$201(xyz.adscope.amps.adapter.bz.BZUnifiedNativeAdapter r0, java.lang.String r1, java.lang.String r2) {
            super.onAdFailed(r1, r2)
            return
    }

    public static /* synthetic */ void access$300(xyz.adscope.amps.adapter.bz.BZUnifiedNativeAdapter r0, java.util.List r1) {
            r0.convertAdapterResponse(r1)
            return
    }

    public static /* synthetic */ xyz.adscope.amps.adapter.bz.BZUnifiedNativeAdapter.BeiziTransformEntry access$400(xyz.adscope.amps.adapter.bz.BZUnifiedNativeAdapter r0) {
            xyz.adscope.amps.adapter.bz.BZUnifiedNativeAdapter$BeiziTransformEntry r0 = r0.response
            return r0
    }

    public static /* synthetic */ xyz.adscope.amps.adapter.bz.BZUnifiedNativeAdapter.BeiziTransformEntry access$402(xyz.adscope.amps.adapter.bz.BZUnifiedNativeAdapter r0, xyz.adscope.amps.adapter.bz.BZUnifiedNativeAdapter.BeiziTransformEntry r1) {
            r0.response = r1
            return r1
    }

    public static /* synthetic */ java.util.List access$500(xyz.adscope.amps.adapter.bz.BZUnifiedNativeAdapter r0) {
            java.util.List<xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem> r0 = r0.mUnifiedNativeItemsList
            return r0
    }

    private void initSDK() {
            r3 = this;
            xyz.adscope.amps.adapter.bz.BZInitMediation r0 = xyz.adscope.amps.adapter.bz.BZInitMediation.getInstance()
            xyz.adscope.amps.init.AMPSInitAdapterConfig r1 = r3.mInitAdapterConfig
            r2 = 0
            r0.initSDK(r1, r2)
            r3.loadUnifiedNativeAd()
            return
    }

    private void loadUnifiedNativeAd() {
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "BZSDK loadUnifiedNativeAd spaceId:"
            r0.append(r1)
            java.lang.String r1 = r9.mSpaceId
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "amps_log_tag"
            xyz.adscope.amps.tool.AMPSLogUtil.d(r1, r0)
            com.beizi.fusion.NativeUnifiedAd r2 = new com.beizi.fusion.NativeUnifiedAd
            android.content.Context r3 = r9.mContext
            java.lang.String r4 = r9.mSpaceId
            xyz.adscope.amps.adapter.bz.BZUnifiedNativeAdapter$1 r5 = new xyz.adscope.amps.adapter.bz.BZUnifiedNativeAdapter$1
            r5.<init>(r9)
            r6 = 5000(0x1388, double:2.4703E-320)
            r8 = 1
            r2.<init>(r3, r4, r5, r6, r8)
            r9.mUnifiedAd = r2
            r0 = 1
            r2.setHideDownloadInfo(r0)
            com.beizi.fusion.NativeUnifiedAd r1 = r9.mUnifiedAd
            r1.setHideAdLogo(r0)
            com.beizi.fusion.NativeUnifiedAd r0 = r9.mUnifiedAd
            r0.loadAd()
            return
    }

    /* renamed from: convertEntryFromAdapterResponse, reason: avoid collision after fix types in other method */
    public xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem convertEntryFromAdapterResponse2(com.beizi.fusion.NativeUnifiedAdResponse r5) {
            r4 = this;
            int r0 = r4.mAdEcpm
            xyz.adscope.amps.adapter.bz.BZUnifiedNativeAdapter$BeiziTransformEntry r1 = new xyz.adscope.amps.adapter.bz.BZUnifiedNativeAdapter$BeiziTransformEntry
            android.content.Context r2 = r4.mContext
            r3 = 0
            r1.<init>(r5, r2, r0, r3)
            return r1
    }

    @Override // xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter
    public /* bridge */ /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem convertEntryFromAdapterResponse(com.beizi.fusion.NativeUnifiedAdResponse r1) {
            r0 = this;
            com.beizi.fusion.NativeUnifiedAdResponse r1 = (com.beizi.fusion.NativeUnifiedAdResponse) r1
            xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem r1 = r0.convertEntryFromAdapterResponse2(r1)
            return r1
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void destroy() {
            r1 = this;
            super.destroy()
            com.beizi.fusion.NativeUnifiedAd r0 = r1.mUnifiedAd
            if (r0 == 0) goto Ld
            r0.destroy()
            r0 = 0
            r1.mUnifiedAd = r0
        Ld:
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public boolean isValid() {
            r1 = this;
            com.beizi.fusion.NativeUnifiedAd r0 = r1.mUnifiedAd
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter
    public void loadNetworkAd(android.content.Context r1, xyz.adscope.amps.model.AMPSAdapterModel r2, xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdAdapterListener r3) {
            r0 = this;
            super.loadNetworkAd2(r1, r2, r3)
            boolean r1 = r0.isBidding
            if (r1 == 0) goto Lf
            com.beizi.fusion.NativeUnifiedAd r1 = r0.mUnifiedAd
            if (r1 == 0) goto Lf
            r0.onAdLoad()
            return
        Lf:
            r0.initSDK()
            return
    }

    @Override // xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter, xyz.adscope.amps.base.AMPSBaseAdapter
    public /* bridge */ /* synthetic */ void loadNetworkAd(android.content.Context r1, xyz.adscope.amps.model.AMPSAdapterModel r2, xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdAdapterListener r3) {
            r0 = this;
            xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdAdapterListener r3 = (xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdAdapterListener) r3
            r0.loadNetworkAd(r1, r2, r3)
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void sendLossNotice(xyz.adscope.amps.base.AMPSBidResult r2) {
            r1 = this;
            super.sendLossNotice(r2)
            com.beizi.fusion.NativeUnifiedAd r0 = r1.mUnifiedAd     // Catch: java.lang.Exception -> L1a
            if (r0 == 0) goto L1a
            if (r2 != 0) goto La
            goto L1a
        La:
            xyz.adscope.amps.adapter.bz.BZInitMediation r0 = xyz.adscope.amps.adapter.bz.BZInitMediation.getInstance()     // Catch: java.lang.Exception -> L1a
            java.util.Map r2 = r0.getLossInfo(r2)     // Catch: java.lang.Exception -> L1a
            if (r2 != 0) goto L15
            goto L1a
        L15:
            com.beizi.fusion.NativeUnifiedAd r0 = r1.mUnifiedAd     // Catch: java.lang.Exception -> L1a
            r0.sendLossNotificationWithInfo(r2)     // Catch: java.lang.Exception -> L1a
        L1a:
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void sendWinNotice(xyz.adscope.amps.base.AMPSBidResult r3) {
            r2 = this;
            super.sendWinNotice(r3)
            com.beizi.fusion.NativeUnifiedAd r0 = r2.mUnifiedAd     // Catch: java.lang.Exception -> L25
            if (r0 == 0) goto L25
            if (r3 != 0) goto La
            goto L25
        La:
            xyz.adscope.amps.adapter.bz.BZUnifiedNativeAdapter$BeiziTransformEntry r0 = r2.response     // Catch: java.lang.Exception -> L25
            if (r0 == 0) goto L15
            int r1 = r3.getWinPrice()     // Catch: java.lang.Exception -> L25
            r0.setEcpm(r1)     // Catch: java.lang.Exception -> L25
        L15:
            xyz.adscope.amps.adapter.bz.BZInitMediation r0 = xyz.adscope.amps.adapter.bz.BZInitMediation.getInstance()     // Catch: java.lang.Exception -> L25
            java.util.Map r3 = r0.getWinInfo(r3)     // Catch: java.lang.Exception -> L25
            if (r3 != 0) goto L20
            goto L25
        L20:
            com.beizi.fusion.NativeUnifiedAd r0 = r2.mUnifiedAd     // Catch: java.lang.Exception -> L25
            r0.sendWinNotificationWithInfo(r3)     // Catch: java.lang.Exception -> L25
        L25:
            return
    }

    @Override // xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter, xyz.adscope.amps.base.AMPSBaseAdapter
    public void startBid(android.content.Context r1, xyz.adscope.amps.model.AMPSAdapterModel r2, xyz.adscope.amps.inner.AMPSAdBiddingListener r3) {
            r0 = this;
            super.startBid(r1, r2, r3)
            r0.initSDK()
            return
    }
}
