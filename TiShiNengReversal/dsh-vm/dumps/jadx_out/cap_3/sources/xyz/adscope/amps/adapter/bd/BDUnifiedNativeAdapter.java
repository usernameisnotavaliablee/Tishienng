package xyz.adscope.amps.adapter.bd;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class BDUnifiedNativeAdapter extends xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter<com.baidu.mobads.sdk.api.NativeResponse> {
    private com.baidu.mobads.sdk.api.BaiduNativeManager mBaiduNativeManager;
    private java.util.List<com.baidu.mobads.sdk.api.NativeResponse> mExpressResponseList;



    public class BaiduFeedAdListener implements com.baidu.mobads.sdk.api.BaiduNativeManager.FeedAdListener {
        public final /* synthetic */ xyz.adscope.amps.adapter.bd.BDUnifiedNativeAdapter this$0;

        private BaiduFeedAdListener(xyz.adscope.amps.adapter.bd.BDUnifiedNativeAdapter r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ BaiduFeedAdListener(xyz.adscope.amps.adapter.bd.BDUnifiedNativeAdapter r1, xyz.adscope.amps.adapter.bd.BDUnifiedNativeAdapter.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public void onLpClosed() {
                r0 = this;
                return
        }

        public void onNativeFail(int r2, java.lang.String r3, com.baidu.mobads.sdk.api.NativeResponse r4) {
                r1 = this;
                xyz.adscope.amps.adapter.bd.BDUnifiedNativeAdapter r4 = r1.this$0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r2)
                java.lang.String r2 = ""
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                r4.onAdFailed(r2, r3)
                return
        }

        public void onNativeLoad(java.util.List<com.baidu.mobads.sdk.api.NativeResponse> r3) {
                r2 = this;
                r3.size()
                boolean r0 = r3.isEmpty()
                if (r0 == 0) goto L19
                xyz.adscope.amps.adapter.bd.BDUnifiedNativeAdapter r3 = r2.this$0
                xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum r0 = xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum.CHANNEL_ERROR_AD_IS_NULL
                java.lang.String r1 = r0.getErrorCode()
                java.lang.String r0 = r0.getErrorMsg()
                r3.onAdFailed(r1, r0)
                return
            L19:
                xyz.adscope.amps.adapter.bd.BDUnifiedNativeAdapter r0 = r2.this$0
                xyz.adscope.amps.adapter.bd.BDUnifiedNativeAdapter.access$2300(r0, r3)
                xyz.adscope.amps.adapter.bd.BDUnifiedNativeAdapter r0 = r2.this$0
                xyz.adscope.amps.adapter.bd.BDUnifiedNativeAdapter.access$2402(r0, r3)
                r0 = 0
                java.lang.Object r3 = r3.get(r0)     // Catch: java.lang.Throwable -> L35
                com.baidu.mobads.sdk.api.NativeResponse r3 = (com.baidu.mobads.sdk.api.NativeResponse) r3     // Catch: java.lang.Throwable -> L35
                if (r3 == 0) goto L36
                java.lang.String r3 = r3.getECPMLevel()     // Catch: java.lang.Throwable -> L35
                int r0 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Throwable -> L35
                goto L36
            L35:
            L36:
                xyz.adscope.amps.adapter.bd.BDUnifiedNativeAdapter r3 = r2.this$0
                boolean r1 = r3.isBidding
                if (r1 == 0) goto L40
                r3.onC2SBiddingSuccess(r0)
                goto L43
            L40:
                r3.onAdLoad()
            L43:
                return
        }

        public void onNoAd(int r2, java.lang.String r3, com.baidu.mobads.sdk.api.NativeResponse r4) {
                r1 = this;
                xyz.adscope.amps.adapter.bd.BDUnifiedNativeAdapter r4 = r1.this$0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r2)
                java.lang.String r2 = ""
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                r4.onAdFailed(r2, r3)
                return
        }

        public void onVideoDownloadFailed() {
                r0 = this;
                return
        }

        public void onVideoDownloadSuccess() {
                r0 = this;
                return
        }
    }

    public static class BaiduTransformEntry extends xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry {
        private com.baidu.mobads.sdk.api.NativeResponse mSrc;




        private BaiduTransformEntry(com.baidu.mobads.sdk.api.NativeResponse r1, android.content.Context r2, int r3, xyz.adscope.amps.ad.unified.inter.AMPSVideoConfig r4, xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter r5) {
                r0 = this;
                r0.<init>(r2, r3, r4, r5)
                r0.mSrc = r1
                return
        }

        public /* synthetic */ BaiduTransformEntry(com.baidu.mobads.sdk.api.NativeResponse r1, android.content.Context r2, int r3, xyz.adscope.amps.ad.unified.inter.AMPSVideoConfig r4, xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter r5, xyz.adscope.amps.adapter.bd.BDUnifiedNativeAdapter.AnonymousClass1 r6) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter access$1000(xyz.adscope.amps.adapter.bd.BDUnifiedNativeAdapter.BaiduTransformEntry r0) {
                xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter r0 = r0.mAdapter
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter access$1100(xyz.adscope.amps.adapter.bd.BDUnifiedNativeAdapter.BaiduTransformEntry r0) {
                xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter r0 = r0.mAdapter
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener access$1200(xyz.adscope.amps.adapter.bd.BDUnifiedNativeAdapter.BaiduTransformEntry r0) {
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener r0 = r0.mAdEventListener
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener access$1300(xyz.adscope.amps.adapter.bd.BDUnifiedNativeAdapter.BaiduTransformEntry r0) {
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener r0 = r0.mAdEventListener
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener access$1400(xyz.adscope.amps.adapter.bd.BDUnifiedNativeAdapter.BaiduTransformEntry r0) {
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener r0 = r0.mDownloadListener
                return r0
        }

        public static /* synthetic */ com.baidu.mobads.sdk.api.NativeResponse access$1500(xyz.adscope.amps.adapter.bd.BDUnifiedNativeAdapter.BaiduTransformEntry r0) {
                com.baidu.mobads.sdk.api.NativeResponse r0 = r0.mSrc
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener access$1600(xyz.adscope.amps.adapter.bd.BDUnifiedNativeAdapter.BaiduTransformEntry r0) {
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener r0 = r0.mDownloadListener
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener access$1700(xyz.adscope.amps.adapter.bd.BDUnifiedNativeAdapter.BaiduTransformEntry r0) {
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener r0 = r0.mDownloadListener
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener access$1800(xyz.adscope.amps.adapter.bd.BDUnifiedNativeAdapter.BaiduTransformEntry r0) {
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener r0 = r0.mDownloadListener
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener access$1900(xyz.adscope.amps.adapter.bd.BDUnifiedNativeAdapter.BaiduTransformEntry r0) {
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener r0 = r0.mDownloadListener
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter access$200(xyz.adscope.amps.adapter.bd.BDUnifiedNativeAdapter.BaiduTransformEntry r0) {
                xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter r0 = r0.mAdapter
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener access$2000(xyz.adscope.amps.adapter.bd.BDUnifiedNativeAdapter.BaiduTransformEntry r0) {
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener r0 = r0.mDownloadListener
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener access$2100(xyz.adscope.amps.adapter.bd.BDUnifiedNativeAdapter.BaiduTransformEntry r0) {
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener r0 = r0.mAdEventListener
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener access$2200(xyz.adscope.amps.adapter.bd.BDUnifiedNativeAdapter.BaiduTransformEntry r0) {
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener r0 = r0.mAdEventListener
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter access$300(xyz.adscope.amps.adapter.bd.BDUnifiedNativeAdapter.BaiduTransformEntry r0) {
                xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter r0 = r0.mAdapter
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener access$400(xyz.adscope.amps.adapter.bd.BDUnifiedNativeAdapter.BaiduTransformEntry r0) {
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener r0 = r0.mAdEventListener
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener access$500(xyz.adscope.amps.adapter.bd.BDUnifiedNativeAdapter.BaiduTransformEntry r0) {
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener r0 = r0.mAdEventListener
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter access$600(xyz.adscope.amps.adapter.bd.BDUnifiedNativeAdapter.BaiduTransformEntry r0) {
                xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter r0 = r0.mAdapter
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter access$700(xyz.adscope.amps.adapter.bd.BDUnifiedNativeAdapter.BaiduTransformEntry r0) {
                xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter r0 = r0.mAdapter
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener access$800(xyz.adscope.amps.adapter.bd.BDUnifiedNativeAdapter.BaiduTransformEntry r0) {
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener r0 = r0.mAdEventListener
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener access$900(xyz.adscope.amps.adapter.bd.BDUnifiedNativeAdapter.BaiduTransformEntry r0) {
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener r0 = r0.mAdEventListener
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public void bindAdToMediaView(android.app.Activity r2, xyz.adscope.amps.ad.unified.view.AMPSUnifiedMediaViewStub r3, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedVideoListener r4) {
                r1 = this;
                com.baidu.mobads.sdk.api.NativeResponse r0 = r1.mSrc
                if (r0 != 0) goto L5
                return
            L5:
                com.baidu.mobads.sdk.api.XNativeView r0 = new com.baidu.mobads.sdk.api.XNativeView
                r0.<init>(r2)
                xyz.adscope.amps.adapter.bd.BDUnifiedNativeAdapter$BaiduTransformEntry$2 r2 = new xyz.adscope.amps.adapter.bd.BDUnifiedNativeAdapter$BaiduTransformEntry$2
                r2.<init>(r1, r4)
                r0.setNativeVideoListener(r2)
                r3.addView(r0)
                xyz.adscope.amps.ad.unified.inter.AMPSVideoConfig r2 = r1.mVideoConfig
                if (r2 == 0) goto L20
                boolean r2 = r2.isMute()
                r0.setVideoMute(r2)
            L20:
                com.baidu.mobads.sdk.api.NativeResponse r2 = r1.mSrc
                r0.setNativeItem(r2)
                xyz.adscope.amps.adapter.bd.BDUnifiedNativeAdapter$BaiduTransformEntry$3 r2 = new xyz.adscope.amps.adapter.bd.BDUnifiedNativeAdapter$BaiduTransformEntry$3
                r2.<init>(r1)
                r0.setNativeViewClickListener(r2)
                r0.render()
                return
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public void bindAdToRootContainer(android.app.Activity r2, xyz.adscope.amps.ad.unified.view.AMPSUnifiedRootContainer r3, java.util.List<android.view.View> r4, java.util.List<android.view.View> r5) {
                r1 = this;
                com.baidu.mobads.sdk.api.NativeResponse r2 = r1.mSrc
                if (r2 != 0) goto L5
                return
            L5:
                xyz.adscope.amps.adapter.bd.BDUnifiedNativeAdapter$BaiduTransformEntry$1 r0 = new xyz.adscope.amps.adapter.bd.BDUnifiedNativeAdapter$BaiduTransformEntry$1
                r0.<init>(r1)
                r2.registerViewForInteraction(r3, r4, r5, r0)
                return
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public java.lang.String getActionButtonText() {
                r1 = this;
                com.baidu.mobads.sdk.api.NativeResponse r0 = r1.mSrc
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.lang.String r0 = r0.getActButtonString()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern getAdPattern() {
                r2 = this;
                com.baidu.mobads.sdk.api.NativeResponse r0 = r2.mSrc
                if (r0 != 0) goto L7
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern r0 = xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern.AD_PATTERN_UNKNOWN
                return r0
            L7:
                com.baidu.mobads.sdk.api.NativeResponse$MaterialType r0 = r0.getMaterialType()
                com.baidu.mobads.sdk.api.NativeResponse$MaterialType r1 = com.baidu.mobads.sdk.api.NativeResponse.MaterialType.NORMAL
                if (r0 != r1) goto L12
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern r0 = xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern.AD_PATTERN_TEXT_IMAGE
                return r0
            L12:
                com.baidu.mobads.sdk.api.NativeResponse$MaterialType r1 = com.baidu.mobads.sdk.api.NativeResponse.MaterialType.VIDEO
                if (r0 != r1) goto L19
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern r0 = xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern.AD_PATTERN_VIDEO
                return r0
            L19:
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern r0 = xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern.AD_PATTERN_UNKNOWN
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public java.lang.String getAdSourceLogoUrl() {
                r1 = this;
                com.baidu.mobads.sdk.api.NativeResponse r0 = r1.mSrc
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.lang.String r0 = r0.getBaiduLogoUrl()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
        public java.lang.String getAppDescription() {
                r1 = this;
                com.baidu.mobads.sdk.api.NativeResponse r0 = r1.mSrc
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.lang.String r0 = r0.getAppFunctionLink()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public xyz.adscope.amps.ad.unified.inter.AMPSAppDetail getAppDetail() {
                r0 = this;
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
        public java.lang.String getAppDeveloper() {
                r1 = this;
                com.baidu.mobads.sdk.api.NativeResponse r0 = r1.mSrc
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.lang.String r0 = r0.getPublisher()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
        public java.lang.String getAppIconUrl() {
                r1 = this;
                com.baidu.mobads.sdk.api.NativeResponse r0 = r1.mSrc
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.lang.String r0 = r0.getIconUrl()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
        public java.lang.String getAppName() {
                r1 = this;
                com.baidu.mobads.sdk.api.NativeResponse r0 = r1.mSrc
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.lang.String r0 = r0.getBrandName()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
        public java.lang.String getAppPackageName() {
                r1 = this;
                com.baidu.mobads.sdk.api.NativeResponse r0 = r1.mSrc
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.lang.String r0 = r0.getAppPackage()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
        public java.lang.String getAppPermissionInfo() {
                r1 = this;
                com.baidu.mobads.sdk.api.NativeResponse r0 = r1.mSrc
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.lang.String r0 = r0.getAppPermissionLink()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
        public java.lang.String getAppPrivacyPolicy() {
                r1 = this;
                com.baidu.mobads.sdk.api.NativeResponse r0 = r1.mSrc
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.lang.String r0 = r0.getAppPrivacyLink()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
        public java.lang.String getAppSize() {
                r3 = this;
                com.baidu.mobads.sdk.api.NativeResponse r0 = r3.mSrc
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                com.baidu.mobads.sdk.api.NativeResponse r1 = r3.mSrc
                long r1 = r1.getAppSize()
                r0.append(r1)
                java.lang.String r1 = ""
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
        public java.lang.String getAppVersion() {
                r1 = this;
                com.baidu.mobads.sdk.api.NativeResponse r0 = r1.mSrc
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.lang.String r0 = r0.getAppVersion()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public java.lang.String getDesc() {
                r1 = this;
                com.baidu.mobads.sdk.api.NativeResponse r0 = r1.mSrc
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.lang.String r0 = r0.getDesc()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public java.lang.String getIconUrl() {
                r1 = this;
                com.baidu.mobads.sdk.api.NativeResponse r0 = r1.mSrc
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.lang.String r0 = r0.getIconUrl()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public int getImageHeight() {
                r1 = this;
                com.baidu.mobads.sdk.api.NativeResponse r0 = r1.mSrc
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                int r0 = r0.getMainPicHeight()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public int getImageWidth() {
                r1 = this;
                com.baidu.mobads.sdk.api.NativeResponse r0 = r1.mSrc
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                int r0 = r0.getMainPicWidth()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public java.util.List<java.lang.String> getImagesUrl() {
                r1 = this;
                com.baidu.mobads.sdk.api.NativeResponse r0 = r1.mSrc
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.util.List r0 = r0.getMultiPicUrls()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public java.lang.String getMainImageUrl() {
                r1 = this;
                com.baidu.mobads.sdk.api.NativeResponse r0 = r1.mSrc
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.lang.String r0 = r0.getImageUrl()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public xyz.adscope.amps.ad.unified.inter.AMPSUnifiedOptimizeController getOptimizeController() {
                r0 = this;
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedOptimizeController
        public android.view.View getOptimizeShakeView(int r3, int r4) {
                r2 = this;
                com.baidu.mobads.sdk.api.NativeResponse r0 = r2.mSrc
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                android.view.View r3 = r0.renderShakeView(r3, r4, r1)
                return r3
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedOptimizeController
        public android.view.View getOptimizeSlideView(int r3, int r4, int r5) {
                r2 = this;
                com.baidu.mobads.sdk.api.NativeResponse r0 = r2.mSrc
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                android.view.View r3 = r0.renderSlideView(r3, r4, r5, r1)
                return r3
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public java.lang.String getTitle() {
                r1 = this;
                com.baidu.mobads.sdk.api.NativeResponse r0 = r1.mSrc
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
                com.baidu.mobads.sdk.api.NativeResponse r0 = r1.mSrc
                if (r0 == 0) goto L6
                r0 = 1
                return r0
            L6:
                r0 = 0
                return r0
        }
    }

    public BDUnifiedNativeAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void access$2300(xyz.adscope.amps.adapter.bd.BDUnifiedNativeAdapter r0, java.util.List r1) {
            r0.convertAdapterResponse(r1)
            return
    }

    public static /* synthetic */ java.util.List access$2402(xyz.adscope.amps.adapter.bd.BDUnifiedNativeAdapter r0, java.util.List r1) {
            r0.mExpressResponseList = r1
            return r1
    }

    private void initSDK() {
            r3 = this;
            xyz.adscope.amps.adapter.bd.BDInitMediation r0 = xyz.adscope.amps.adapter.bd.BDInitMediation.getInstance()
            xyz.adscope.amps.init.AMPSInitAdapterConfig r1 = r3.mInitAdapterConfig
            r2 = 0
            r0.initSDK(r1, r2)
            r3.loadUnifiedNativeAd()
            return
    }

    private void loadUnifiedNativeAd() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "BDSDK loadUnifiedNativeAd "
            r0.append(r1)
            java.lang.String r1 = r4.mSpaceId
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "amps_log_tag"
            xyz.adscope.amps.tool.AMPSLogUtil.d(r1, r0)
            com.baidu.mobads.sdk.api.BaiduNativeManager r0 = new com.baidu.mobads.sdk.api.BaiduNativeManager
            android.content.Context r1 = r4.mContext
            java.lang.String r2 = r4.mSpaceId
            r0.<init>(r1, r2)
            r4.mBaiduNativeManager = r0
            com.baidu.mobads.sdk.api.RequestParameters$Builder r0 = new com.baidu.mobads.sdk.api.RequestParameters$Builder
            r0.<init>()
            com.baidu.mobads.sdk.api.RequestParameters r0 = r0.build()
            com.baidu.mobads.sdk.api.BaiduNativeManager r1 = r4.mBaiduNativeManager
            xyz.adscope.amps.adapter.bd.BDUnifiedNativeAdapter$BaiduFeedAdListener r2 = new xyz.adscope.amps.adapter.bd.BDUnifiedNativeAdapter$BaiduFeedAdListener
            r3 = 0
            r2.<init>(r4, r3)
            r1.loadFeedAd(r0, r2)
            return
    }

    /* renamed from: convertEntryFromAdapterResponse, reason: avoid collision after fix types in other method */
    public xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem convertEntryFromAdapterResponse2(com.baidu.mobads.sdk.api.NativeResponse r9) {
            r8 = this;
            int r0 = r8.mAdEcpm
            boolean r1 = r8.isBidding     // Catch: java.lang.Exception -> Le
            if (r1 == 0) goto Le
            java.lang.String r1 = r9.getECPMLevel()     // Catch: java.lang.Exception -> Le
            int r0 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Exception -> Le
        Le:
            r4 = r0
            xyz.adscope.amps.adapter.bd.BDUnifiedNativeAdapter$BaiduTransformEntry r1 = new xyz.adscope.amps.adapter.bd.BDUnifiedNativeAdapter$BaiduTransformEntry
            android.content.Context r3 = r8.mContext
            xyz.adscope.amps.ad.unified.inter.AMPSVideoConfig r5 = new xyz.adscope.amps.ad.unified.inter.AMPSVideoConfig
            boolean r0 = r8.isVolumeOn
            r0 = r0 ^ 1
            int r2 = r8.autoPlayPolicy
            r5.<init>(r0, r2)
            r7 = 0
            r6 = r8
            r2 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
    }

    @Override // xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter
    public /* bridge */ /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem convertEntryFromAdapterResponse(com.baidu.mobads.sdk.api.NativeResponse r1) {
            r0 = this;
            com.baidu.mobads.sdk.api.NativeResponse r1 = (com.baidu.mobads.sdk.api.NativeResponse) r1
            xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem r1 = r0.convertEntryFromAdapterResponse2(r1)
            return r1
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void destroy() {
            r2 = this;
            super.destroy()
            com.baidu.mobads.sdk.api.BaiduNativeManager r0 = r2.mBaiduNativeManager
            r1 = 0
            if (r0 == 0) goto La
            r2.mBaiduNativeManager = r1
        La:
            java.util.List<com.baidu.mobads.sdk.api.NativeResponse> r0 = r2.mExpressResponseList
            if (r0 == 0) goto L13
            r0.clear()
            r2.mExpressResponseList = r1
        L13:
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public boolean isValid() {
            r1 = this;
            com.baidu.mobads.sdk.api.BaiduNativeManager r0 = r1.mBaiduNativeManager
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
            if (r1 == 0) goto L15
            java.util.List<com.baidu.mobads.sdk.api.NativeResponse> r1 = r0.mExpressResponseList
            if (r1 == 0) goto L15
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L15
            r0.onAdLoad()
            return
        L15:
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
    public void sendLossNotice(xyz.adscope.amps.base.AMPSBidResult r4) {
            r3 = this;
            java.util.List<com.baidu.mobads.sdk.api.NativeResponse> r0 = r3.mExpressResponseList     // Catch: java.lang.Exception -> L2b
            if (r0 == 0) goto L2b
            if (r4 != 0) goto L7
            goto L2b
        L7:
            int r0 = r0.size()     // Catch: java.lang.Exception -> L2b
            if (r0 <= 0) goto L17
            java.util.List<com.baidu.mobads.sdk.api.NativeResponse> r0 = r3.mExpressResponseList     // Catch: java.lang.Exception -> L2b
            r1 = 0
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L2b
            com.baidu.mobads.sdk.api.NativeResponse r0 = (com.baidu.mobads.sdk.api.NativeResponse) r0     // Catch: java.lang.Exception -> L2b
            goto L18
        L17:
            r0 = 0
        L18:
            if (r0 != 0) goto L1b
            goto L2b
        L1b:
            xyz.adscope.amps.adapter.bd.BDUnifiedNativeAdapter$2 r1 = new xyz.adscope.amps.adapter.bd.BDUnifiedNativeAdapter$2     // Catch: java.lang.Exception -> L2b
            r1.<init>(r3)     // Catch: java.lang.Exception -> L2b
            xyz.adscope.amps.adapter.bd.BDInitMediation r2 = xyz.adscope.amps.adapter.bd.BDInitMediation.getInstance()     // Catch: java.lang.Exception -> L2b
            java.util.LinkedHashMap r4 = r2.getWinInfo(r4)     // Catch: java.lang.Exception -> L2b
            r0.biddingFail(r4, r1)     // Catch: java.lang.Exception -> L2b
        L2b:
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void sendWinNotice(xyz.adscope.amps.base.AMPSBidResult r4) {
            r3 = this;
            java.util.List<com.baidu.mobads.sdk.api.NativeResponse> r0 = r3.mExpressResponseList     // Catch: java.lang.Exception -> L2b
            if (r0 == 0) goto L2b
            if (r4 != 0) goto L7
            goto L2b
        L7:
            int r0 = r0.size()     // Catch: java.lang.Exception -> L2b
            if (r0 <= 0) goto L17
            java.util.List<com.baidu.mobads.sdk.api.NativeResponse> r0 = r3.mExpressResponseList     // Catch: java.lang.Exception -> L2b
            r1 = 0
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L2b
            com.baidu.mobads.sdk.api.NativeResponse r0 = (com.baidu.mobads.sdk.api.NativeResponse) r0     // Catch: java.lang.Exception -> L2b
            goto L18
        L17:
            r0 = 0
        L18:
            if (r0 != 0) goto L1b
            goto L2b
        L1b:
            xyz.adscope.amps.adapter.bd.BDUnifiedNativeAdapter$1 r1 = new xyz.adscope.amps.adapter.bd.BDUnifiedNativeAdapter$1     // Catch: java.lang.Exception -> L2b
            r1.<init>(r3)     // Catch: java.lang.Exception -> L2b
            xyz.adscope.amps.adapter.bd.BDInitMediation r2 = xyz.adscope.amps.adapter.bd.BDInitMediation.getInstance()     // Catch: java.lang.Exception -> L2b
            java.util.LinkedHashMap r4 = r2.getSecondInfo(r4)     // Catch: java.lang.Exception -> L2b
            r0.biddingSuccess(r4, r1)     // Catch: java.lang.Exception -> L2b
        L2b:
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
