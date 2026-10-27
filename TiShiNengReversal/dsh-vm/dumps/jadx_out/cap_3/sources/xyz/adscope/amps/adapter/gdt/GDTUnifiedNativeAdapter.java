package xyz.adscope.amps.adapter.gdt;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class GDTUnifiedNativeAdapter extends xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter<com.qq.e.ads.nativ.NativeUnifiedADData> {
    private com.qq.e.ads.nativ.NativeUnifiedAD gdtAdManager;
    private xyz.adscope.amps.adapter.gdt.model.BidResponseModel mBidResponseModel;
    private java.lang.String mToken;
    private com.qq.e.ads.nativ.NativeADUnifiedListener nativeADUnifiedListener;
    private java.util.List<com.qq.e.ads.nativ.NativeUnifiedADData> nativeUnifiedADDataList;



    public static class GDTTransformEntry extends xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry {
        private com.qq.e.ads.nativ.NativeUnifiedADData mSrc;





        private GDTTransformEntry(com.qq.e.ads.nativ.NativeUnifiedADData r2, xyz.adscope.amps.ad.unified.inter.AMPSVideoConfig r3, int r4, xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter r5) {
                r1 = this;
                r0 = 0
                r1.<init>(r0, r4, r3, r5)
                r1.mSrc = r2
                r1.bindSrcCallback()
                return
        }

        public /* synthetic */ GDTTransformEntry(com.qq.e.ads.nativ.NativeUnifiedADData r1, xyz.adscope.amps.ad.unified.inter.AMPSVideoConfig r2, int r3, xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter r4, xyz.adscope.amps.adapter.gdt.GDTUnifiedNativeAdapter.AnonymousClass1 r5) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener access$1000(xyz.adscope.amps.adapter.gdt.GDTUnifiedNativeAdapter.GDTTransformEntry r0) {
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener r0 = r0.mAdEventListener
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter access$1100(xyz.adscope.amps.adapter.gdt.GDTUnifiedNativeAdapter.GDTTransformEntry r0) {
                xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter r0 = r0.mAdapter
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter access$1200(xyz.adscope.amps.adapter.gdt.GDTUnifiedNativeAdapter.GDTTransformEntry r0) {
                xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter r0 = r0.mAdapter
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener access$1300(xyz.adscope.amps.adapter.gdt.GDTUnifiedNativeAdapter.GDTTransformEntry r0) {
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener r0 = r0.mAdEventListener
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener access$1400(xyz.adscope.amps.adapter.gdt.GDTUnifiedNativeAdapter.GDTTransformEntry r0) {
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener r0 = r0.mAdEventListener
                return r0
        }

        public static /* synthetic */ com.qq.e.ads.nativ.NativeUnifiedADData access$1500(xyz.adscope.amps.adapter.gdt.GDTUnifiedNativeAdapter.GDTTransformEntry r0) {
                com.qq.e.ads.nativ.NativeUnifiedADData r0 = r0.mSrc
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener access$1600(xyz.adscope.amps.adapter.gdt.GDTUnifiedNativeAdapter.GDTTransformEntry r0) {
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener r0 = r0.mDownloadListener
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener access$1700(xyz.adscope.amps.adapter.gdt.GDTUnifiedNativeAdapter.GDTTransformEntry r0) {
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener r0 = r0.mDownloadListener
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener access$1800(xyz.adscope.amps.adapter.gdt.GDTUnifiedNativeAdapter.GDTTransformEntry r0) {
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener r0 = r0.mDownloadListener
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener access$1900(xyz.adscope.amps.adapter.gdt.GDTUnifiedNativeAdapter.GDTTransformEntry r0) {
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener r0 = r0.mDownloadListener
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener access$2000(xyz.adscope.amps.adapter.gdt.GDTUnifiedNativeAdapter.GDTTransformEntry r0) {
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener r0 = r0.mDownloadListener
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener access$2100(xyz.adscope.amps.adapter.gdt.GDTUnifiedNativeAdapter.GDTTransformEntry r0) {
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener r0 = r0.mDownloadListener
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNegativeFeedbackListener access$2200(xyz.adscope.amps.adapter.gdt.GDTUnifiedNativeAdapter.GDTTransformEntry r0) {
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNegativeFeedbackListener r0 = r0.mNegativeFeedbackListener
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNegativeFeedbackListener access$2300(xyz.adscope.amps.adapter.gdt.GDTUnifiedNativeAdapter.GDTTransformEntry r0) {
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNegativeFeedbackListener r0 = r0.mNegativeFeedbackListener
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener access$2400(xyz.adscope.amps.adapter.gdt.GDTUnifiedNativeAdapter.GDTTransformEntry r0) {
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener r0 = r0.mDownloadListener
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener access$2500(xyz.adscope.amps.adapter.gdt.GDTUnifiedNativeAdapter.GDTTransformEntry r0) {
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener r0 = r0.mDownloadListener
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter access$300(xyz.adscope.amps.adapter.gdt.GDTUnifiedNativeAdapter.GDTTransformEntry r0) {
                xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter r0 = r0.mAdapter
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter access$400(xyz.adscope.amps.adapter.gdt.GDTUnifiedNativeAdapter.GDTTransformEntry r0) {
                xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter r0 = r0.mAdapter
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener access$500(xyz.adscope.amps.adapter.gdt.GDTUnifiedNativeAdapter.GDTTransformEntry r0) {
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener r0 = r0.mAdEventListener
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener access$600(xyz.adscope.amps.adapter.gdt.GDTUnifiedNativeAdapter.GDTTransformEntry r0) {
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener r0 = r0.mAdEventListener
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter access$700(xyz.adscope.amps.adapter.gdt.GDTUnifiedNativeAdapter.GDTTransformEntry r0) {
                xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter r0 = r0.mAdapter
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter access$800(xyz.adscope.amps.adapter.gdt.GDTUnifiedNativeAdapter.GDTTransformEntry r0) {
                xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter r0 = r0.mAdapter
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener access$900(xyz.adscope.amps.adapter.gdt.GDTUnifiedNativeAdapter.GDTTransformEntry r0) {
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener r0 = r0.mAdEventListener
                return r0
        }

        private void bindSrcCallback() {
                r2 = this;
                com.qq.e.ads.nativ.NativeUnifiedADData r0 = r2.mSrc
                xyz.adscope.amps.adapter.gdt.GDTUnifiedNativeAdapter$GDTTransformEntry$1 r1 = new xyz.adscope.amps.adapter.gdt.GDTUnifiedNativeAdapter$GDTTransformEntry$1
                r1.<init>(r2)
                r0.setNativeAdEventListener(r1)
                com.qq.e.ads.nativ.NativeUnifiedADData r0 = r2.mSrc
                xyz.adscope.amps.adapter.gdt.GDTUnifiedNativeAdapter$GDTTransformEntry$2 r1 = new xyz.adscope.amps.adapter.gdt.GDTUnifiedNativeAdapter$GDTTransformEntry$2
                r1.<init>(r2)
                r0.setNegativeFeedbackListener(r1)
                com.qq.e.ads.nativ.NativeUnifiedADData r0 = r2.mSrc
                xyz.adscope.amps.adapter.gdt.GDTUnifiedNativeAdapter$GDTTransformEntry$3 r1 = new xyz.adscope.amps.adapter.gdt.GDTUnifiedNativeAdapter$GDTTransformEntry$3
                r1.<init>(r2)
                r0.setDownloadConfirmListener(r1)
                return
        }

        private com.qq.e.ads.cfg.VideoOption getVideoOption() {
                r5 = this;
                com.qq.e.ads.cfg.VideoOption$Builder r0 = new com.qq.e.ads.cfg.VideoOption$Builder
                r0.<init>()
                xyz.adscope.amps.ad.unified.inter.AMPSVideoConfig r1 = r5.mVideoConfig
                r2 = 0
                if (r1 == 0) goto L3c
                int r1 = r1.getVideoMaxTime()
                if (r1 <= 0) goto L19
                xyz.adscope.amps.ad.unified.inter.AMPSVideoConfig r1 = r5.mVideoConfig
                int r1 = r1.getVideoMaxTime()
                r0.setMaxVideoDuration(r1)
            L19:
                xyz.adscope.amps.ad.unified.inter.AMPSVideoConfig r1 = r5.mVideoConfig
                boolean r1 = r1.isMute()
                r0.setAutoPlayMuted(r1)
                xyz.adscope.amps.ad.unified.inter.AMPSVideoConfig r1 = r5.mVideoConfig
                int r1 = r1.getAutoPlayPrivacy()
                r3 = 2
                if (r1 == 0) goto L39
                r4 = 1
                if (r1 == r4) goto L35
                if (r1 == r3) goto L31
                goto L3c
            L31:
                r0.setAutoPlayPolicy(r4)
                goto L3c
            L35:
                r0.setAutoPlayPolicy(r2)
                goto L3c
            L39:
                r0.setAutoPlayPolicy(r3)
            L3c:
                com.qq.e.ads.cfg.VideoOption$Builder r0 = r0.setEnableUserControl(r2)
                com.qq.e.ads.cfg.VideoOption r0 = r0.build()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public void bindAdToMediaView(android.app.Activity r3, xyz.adscope.amps.ad.unified.view.AMPSUnifiedMediaViewStub r4, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedVideoListener r5) {
                r2 = this;
                com.qq.e.ads.nativ.NativeUnifiedADData r0 = r2.mSrc
                if (r0 != 0) goto L5
                return
            L5:
                com.qq.e.ads.nativ.MediaView r0 = new com.qq.e.ads.nativ.MediaView
                r0.<init>(r3)
                android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
                r1 = -1
                r3.<init>(r1, r1)
                r4.addView(r0, r3)
                xyz.adscope.amps.adapter.gdt.GDTUnifiedNativeAdapter$GDTTransformEntry$4 r3 = new xyz.adscope.amps.adapter.gdt.GDTUnifiedNativeAdapter$GDTTransformEntry$4
                r3.<init>(r2, r5)
                com.qq.e.ads.cfg.VideoOption r4 = r2.getVideoOption()
                com.qq.e.ads.nativ.NativeUnifiedADData r5 = r2.mSrc
                r5.bindMediaView(r0, r4, r3)
                return
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public void bindAdToRootContainer(android.app.Activity r8, xyz.adscope.amps.ad.unified.view.AMPSUnifiedRootContainer r9, java.util.List<android.view.View> r10, java.util.List<android.view.View> r11) {
                r7 = this;
                com.qq.e.ads.nativ.NativeUnifiedADData r0 = r7.mSrc
                if (r0 != 0) goto L5
                return
            L5:
                com.qq.e.ads.nativ.widget.NativeAdContainer r3 = new com.qq.e.ads.nativ.widget.NativeAdContainer
                r3.<init>(r8)
                xyz.adscope.amps.ad.unified.view.AMPSRootInsertHelper.insertRootView(r9, r3)
                com.qq.e.ads.nativ.NativeUnifiedADData r1 = r7.mSrc
                r4 = 0
                r2 = r8
                r5 = r10
                r6 = r11
                r1.bindAdToView(r2, r3, r4, r5, r6)
                return
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public void destroy() {
                r1 = this;
                com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.mSrc
                if (r0 != 0) goto L5
                return
            L5:
                r0.destroy()
                super.destroy()
                return
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public java.lang.String getActionButtonText() {
                r1 = this;
                com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.mSrc
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.lang.String r0 = r0.getButtonText()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern getAdPattern() {
                r2 = this;
                com.qq.e.ads.nativ.NativeUnifiedADData r0 = r2.mSrc
                if (r0 != 0) goto L7
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern r0 = xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern.AD_PATTERN_UNKNOWN
                return r0
            L7:
                int r0 = r0.getAdPatternType()
                r1 = 1
                if (r0 == r1) goto L20
                r1 = 2
                if (r0 == r1) goto L1d
                r1 = 3
                if (r0 == r1) goto L1a
                r1 = 4
                if (r0 == r1) goto L20
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern r0 = xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern.AD_PATTERN_UNKNOWN
                return r0
            L1a:
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern r0 = xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern.AD_PATTERN_3_IMAGES
                return r0
            L1d:
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern r0 = xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern.AD_PATTERN_VIDEO
                return r0
            L20:
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern r0 = xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern.AD_PATTERN_TEXT_IMAGE
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
        public java.lang.String getAppDescription() {
                r2 = this;
                com.qq.e.ads.nativ.NativeUnifiedADData r0 = r2.mSrc
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                com.qq.e.ads.nativ.NativeUnifiedADAppMiitInfo r0 = r0.getAppMiitInfo()
                if (r0 == 0) goto L11
                java.lang.String r0 = r0.getDescriptionUrl()
                return r0
            L11:
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
                com.qq.e.ads.nativ.NativeUnifiedADData r0 = r2.mSrc
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                com.qq.e.ads.nativ.NativeUnifiedADAppMiitInfo r0 = r0.getAppMiitInfo()
                if (r0 == 0) goto L11
                java.lang.String r0 = r0.getAuthorName()
                return r0
            L11:
                return r1
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
        public java.lang.String getAppName() {
                r2 = this;
                com.qq.e.ads.nativ.NativeUnifiedADData r0 = r2.mSrc
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                com.qq.e.ads.nativ.NativeUnifiedADAppMiitInfo r0 = r0.getAppMiitInfo()
                if (r0 == 0) goto L11
                java.lang.String r0 = r0.getAppName()
                return r0
            L11:
                return r1
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
        public java.lang.String getAppPermissionInfo() {
                r2 = this;
                com.qq.e.ads.nativ.NativeUnifiedADData r0 = r2.mSrc
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                com.qq.e.ads.nativ.NativeUnifiedADAppMiitInfo r0 = r0.getAppMiitInfo()
                if (r0 == 0) goto L11
                java.lang.String r0 = r0.getPermissionsUrl()
                return r0
            L11:
                return r1
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
        public java.lang.String getAppPrice() {
                r3 = this;
                com.qq.e.ads.nativ.NativeUnifiedADData r0 = r3.mSrc
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                com.qq.e.ads.nativ.NativeUnifiedADData r1 = r3.mSrc
                double r1 = r1.getAppPrice()
                r0.append(r1)
                java.lang.String r1 = ""
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
        public java.lang.String getAppPrivacyPolicy() {
                r2 = this;
                com.qq.e.ads.nativ.NativeUnifiedADData r0 = r2.mSrc
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                com.qq.e.ads.nativ.NativeUnifiedADAppMiitInfo r0 = r0.getAppMiitInfo()
                if (r0 == 0) goto L11
                java.lang.String r0 = r0.getPrivacyAgreement()
                return r0
            L11:
                return r1
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
        public java.lang.String getAppScore() {
                r2 = this;
                com.qq.e.ads.nativ.NativeUnifiedADData r0 = r2.mSrc
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                com.qq.e.ads.nativ.NativeUnifiedADData r1 = r2.mSrc
                int r1 = r1.getAppScore()
                r0.append(r1)
                java.lang.String r1 = ""
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
        public java.lang.String getAppSize() {
                r4 = this;
                com.qq.e.ads.nativ.NativeUnifiedADData r0 = r4.mSrc
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                com.qq.e.ads.nativ.NativeUnifiedADAppMiitInfo r0 = r0.getAppMiitInfo()
                if (r0 == 0) goto L22
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                long r2 = r0.getPackageSizeBytes()
                r1.append(r2)
                java.lang.String r0 = ""
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
            L22:
                return r1
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
        public java.lang.String getAppVersion() {
                r2 = this;
                com.qq.e.ads.nativ.NativeUnifiedADData r0 = r2.mSrc
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                com.qq.e.ads.nativ.NativeUnifiedADAppMiitInfo r0 = r0.getAppMiitInfo()
                if (r0 == 0) goto L11
                java.lang.String r0 = r0.getVersionName()
                return r0
            L11:
                return r1
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public java.lang.String getDesc() {
                r1 = this;
                com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.mSrc
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.lang.String r0 = r0.getDesc()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
        public java.lang.String getDownloadCountDesc() {
                r3 = this;
                com.qq.e.ads.nativ.NativeUnifiedADData r0 = r3.mSrc
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                com.qq.e.ads.nativ.NativeUnifiedADData r1 = r3.mSrc
                long r1 = r1.getDownloadCount()
                r0.append(r1)
                java.lang.String r1 = ""
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public java.util.Map<java.lang.String, java.lang.Object> getExtras() {
                r1 = this;
                com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.mSrc
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.util.Map r0 = r0.getExtraInfo()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public java.lang.String getIconUrl() {
                r1 = this;
                com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.mSrc
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
                com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.mSrc
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                int r0 = r0.getPictureHeight()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public int getImageWidth() {
                r1 = this;
                com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.mSrc
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                int r0 = r0.getPictureWidth()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public java.util.List<java.lang.String> getImagesUrl() {
                r1 = this;
                com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.mSrc
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
                com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.mSrc
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.lang.String r0 = r0.getImgUrl()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public java.lang.String getTitle() {
                r1 = this;
                com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.mSrc
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
                com.qq.e.ads.nativ.NativeUnifiedADData r0 = r1.mSrc
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                boolean r0 = r0.isValid()
                return r0
        }
    }

    public GDTUnifiedNativeAdapter() {
            r1 = this;
            r1.<init>()
            xyz.adscope.amps.adapter.gdt.GDTUnifiedNativeAdapter$1 r0 = new xyz.adscope.amps.adapter.gdt.GDTUnifiedNativeAdapter$1
            r0.<init>(r1)
            r1.nativeADUnifiedListener = r0
            return
    }

    public static /* synthetic */ void access$100(xyz.adscope.amps.adapter.gdt.GDTUnifiedNativeAdapter r0, java.util.List r1) {
            r0.convertAdapterResponse(r1)
            return
    }

    public static /* synthetic */ java.util.List access$200(xyz.adscope.amps.adapter.gdt.GDTUnifiedNativeAdapter r0) {
            java.util.List<com.qq.e.ads.nativ.NativeUnifiedADData> r0 = r0.nativeUnifiedADDataList
            return r0
    }

    public static /* synthetic */ java.util.List access$202(xyz.adscope.amps.adapter.gdt.GDTUnifiedNativeAdapter r0, java.util.List r1) {
            r0.nativeUnifiedADDataList = r1
            return r1
    }

    public static /* synthetic */ java.lang.String access$2602(xyz.adscope.amps.adapter.gdt.GDTUnifiedNativeAdapter r0, java.lang.String r1) {
            r0.mToken = r1
            return r1
    }

    public static /* synthetic */ xyz.adscope.amps.adapter.gdt.model.BidResponseModel access$2702(xyz.adscope.amps.adapter.gdt.GDTUnifiedNativeAdapter r0, xyz.adscope.amps.adapter.gdt.model.BidResponseModel r1) {
            r0.mBidResponseModel = r1
            return r1
    }

    private void initSDK() {
            r3 = this;
            xyz.adscope.amps.adapter.gdt.GDTInitMediation r0 = xyz.adscope.amps.adapter.gdt.GDTInitMediation.getInstance()
            xyz.adscope.amps.init.AMPSInitAdapterConfig r1 = r3.mInitAdapterConfig
            r2 = 0
            r0.initSDK(r1, r2)
            return
    }

    private void loadUnifiedNativeAd() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "GDTSDK loadUnifiedNativeAd  "
            r0.append(r1)
            java.lang.String r1 = r5.mSpaceId
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "amps_log_tag"
            xyz.adscope.amps.tool.AMPSLogUtil.d(r1, r0)
            java.lang.String r0 = r5.mToken
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L2e
            com.qq.e.ads.nativ.NativeUnifiedAD r0 = new com.qq.e.ads.nativ.NativeUnifiedAD
            android.content.Context r1 = r5.mContext
            java.lang.String r2 = r5.mSpaceId
            com.qq.e.ads.nativ.NativeADUnifiedListener r3 = r5.nativeADUnifiedListener
            r0.<init>(r1, r2, r3)
        L2b:
            r5.gdtAdManager = r0
            goto L3c
        L2e:
            com.qq.e.ads.nativ.NativeUnifiedAD r0 = new com.qq.e.ads.nativ.NativeUnifiedAD
            android.content.Context r1 = r5.mContext
            java.lang.String r2 = r5.mSpaceId
            com.qq.e.ads.nativ.NativeADUnifiedListener r3 = r5.nativeADUnifiedListener
            java.lang.String r4 = r5.mToken
            r0.<init>(r1, r2, r3, r4)
            goto L2b
        L3c:
            com.qq.e.ads.nativ.NativeUnifiedAD r0 = r5.gdtAdManager
            int r1 = r5.adCount
            r0.loadData(r1)
            return
    }

    private void startS2SBidding() {
            r6 = this;
            android.content.Context r0 = r6.mContext
            java.lang.String r1 = r6.mServerUrl
            java.lang.String r2 = r6.mAppId
            java.lang.String r3 = r6.mSpaceId
            int r4 = r6.mFloorEcpm
            xyz.adscope.amps.adapter.gdt.GDTUnifiedNativeAdapter$2 r5 = new xyz.adscope.amps.adapter.gdt.GDTUnifiedNativeAdapter$2
            r5.<init>(r6)
            xyz.adscope.amps.adapter.gdt.util.GDTBiddingRequestUtil.getBidResponse(r0, r1, r2, r3, r4, r5)
            return
    }

    /* renamed from: convertEntryFromAdapterResponse, reason: avoid collision after fix types in other method */
    public xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem convertEntryFromAdapterResponse2(com.qq.e.ads.nativ.NativeUnifiedADData r7) {
            r6 = this;
            xyz.adscope.amps.ad.unified.inter.AMPSVideoConfig r2 = new xyz.adscope.amps.ad.unified.inter.AMPSVideoConfig
            boolean r0 = r6.isVolumeOn
            r0 = r0 ^ 1
            int r1 = r6.autoPlayPolicy
            r2.<init>(r0, r1)
            int r0 = r6.videoMaxTime
            r2.setVideoMaxTime(r0)
            int r0 = r6.mAdEcpm
            boolean r1 = r6.isBidding
            if (r1 == 0) goto L1a
            int r0 = r7.getECPM()
        L1a:
            r3 = r0
            xyz.adscope.amps.adapter.gdt.GDTUnifiedNativeAdapter$GDTTransformEntry r0 = new xyz.adscope.amps.adapter.gdt.GDTUnifiedNativeAdapter$GDTTransformEntry
            r5 = 0
            r4 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter
    public /* bridge */ /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem convertEntryFromAdapterResponse(com.qq.e.ads.nativ.NativeUnifiedADData r1) {
            r0 = this;
            com.qq.e.ads.nativ.NativeUnifiedADData r1 = (com.qq.e.ads.nativ.NativeUnifiedADData) r1
            xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem r1 = r0.convertEntryFromAdapterResponse2(r1)
            return r1
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void destroy() {
            r2 = this;
            super.destroy()
            com.qq.e.ads.nativ.NativeUnifiedAD r0 = r2.gdtAdManager
            r1 = 0
            if (r0 == 0) goto La
            r2.gdtAdManager = r1
        La:
            java.util.List<com.qq.e.ads.nativ.NativeUnifiedADData> r0 = r2.nativeUnifiedADDataList
            if (r0 == 0) goto L13
            r0.clear()
            r2.nativeUnifiedADDataList = r1
        L13:
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public boolean isValid() {
            r1 = this;
            java.util.List<com.qq.e.ads.nativ.NativeUnifiedADData> r0 = r1.nativeUnifiedADDataList
            if (r0 == 0) goto Lc
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter
    public void loadNetworkAd(android.content.Context r1, xyz.adscope.amps.model.AMPSAdapterModel r2, xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdAdapterListener r3) {
            r0 = this;
            super.loadNetworkAd2(r1, r2, r3)
            boolean r1 = r0.isC2SAdSource()
            if (r1 == 0) goto L17
            java.util.List<com.qq.e.ads.nativ.NativeUnifiedADData> r1 = r0.nativeUnifiedADDataList
            if (r1 == 0) goto L17
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L17
            r0.onAdLoad()
            return
        L17:
            r0.initSDK()
            r0.loadUnifiedNativeAd()
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
            if (r4 != 0) goto L3
            goto L3c
        L3:
            boolean r0 = r3.isC2SAdSource()     // Catch: java.lang.Exception -> L3c
            if (r0 == 0) goto L27
            java.util.List<com.qq.e.ads.nativ.NativeUnifiedADData> r0 = r3.nativeUnifiedADDataList     // Catch: java.lang.Exception -> L3c
            if (r0 == 0) goto L3c
            int r0 = r0.size()     // Catch: java.lang.Exception -> L3c
            if (r0 != 0) goto L14
            goto L3c
        L14:
            java.util.List<com.qq.e.ads.nativ.NativeUnifiedADData> r0 = r3.nativeUnifiedADDataList     // Catch: java.lang.Exception -> L3c
            r1 = 0
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L3c
            com.qq.e.ads.nativ.NativeUnifiedADData r0 = (com.qq.e.ads.nativ.NativeUnifiedADData) r0     // Catch: java.lang.Exception -> L3c
            if (r0 != 0) goto L20
            goto L3c
        L20:
            int r1 = r4.getReason()     // Catch: java.lang.Exception -> L3c
            xyz.adscope.amps.adapter.gdt.GDTAdManagerHolder.sendLossNotification(r0, r1)     // Catch: java.lang.Exception -> L3c
        L27:
            boolean r0 = r3.isS2SAdSource()     // Catch: java.lang.Exception -> L3c
            if (r0 == 0) goto L3c
            xyz.adscope.amps.adapter.gdt.model.BidResponseModel r0 = r3.mBidResponseModel     // Catch: java.lang.Exception -> L3c
            int r1 = r4.getEcpm()     // Catch: java.lang.Exception -> L3c
            int r4 = r4.getReason()     // Catch: java.lang.Exception -> L3c
            java.lang.String r2 = r3.mPublicKey     // Catch: java.lang.Exception -> L3c
            xyz.adscope.amps.adapter.gdt.util.GDTBiddingRequestUtil.sendLossNotice(r0, r1, r4, r2)     // Catch: java.lang.Exception -> L3c
        L3c:
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void sendWinNotice(xyz.adscope.amps.base.AMPSBidResult r3) {
            r2 = this;
            java.util.List<com.qq.e.ads.nativ.NativeUnifiedADData> r3 = r2.nativeUnifiedADDataList     // Catch: java.lang.Exception -> L32
            if (r3 == 0) goto L32
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Exception -> L32
            if (r3 == 0) goto Lb
            goto L32
        Lb:
            java.util.List<com.qq.e.ads.nativ.NativeUnifiedADData> r3 = r2.nativeUnifiedADDataList     // Catch: java.lang.Exception -> L32
            r0 = 0
            java.lang.Object r3 = r3.get(r0)     // Catch: java.lang.Exception -> L32
            com.qq.e.ads.nativ.NativeUnifiedADData r3 = (com.qq.e.ads.nativ.NativeUnifiedADData) r3     // Catch: java.lang.Exception -> L32
            if (r3 != 0) goto L17
            goto L32
        L17:
            int r0 = r3.getECPM()     // Catch: java.lang.Exception -> L32
            boolean r1 = r2.isC2SAdSource()     // Catch: java.lang.Exception -> L32
            if (r1 == 0) goto L25
            xyz.adscope.amps.adapter.gdt.GDTAdManagerHolder.sendWinNotification(r3, r0)     // Catch: java.lang.Exception -> L32
            return
        L25:
            boolean r3 = r2.isS2SAdSource()     // Catch: java.lang.Exception -> L32
            if (r3 == 0) goto L32
            xyz.adscope.amps.adapter.gdt.model.BidResponseModel r3 = r2.mBidResponseModel     // Catch: java.lang.Exception -> L32
            java.lang.String r0 = r2.mPublicKey     // Catch: java.lang.Exception -> L32
            xyz.adscope.amps.adapter.gdt.util.GDTBiddingRequestUtil.sendWinNotice(r3, r0)     // Catch: java.lang.Exception -> L32
        L32:
            return
    }

    @Override // xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter, xyz.adscope.amps.base.AMPSBaseAdapter
    public void startBid(android.content.Context r1, xyz.adscope.amps.model.AMPSAdapterModel r2, xyz.adscope.amps.inner.AMPSAdBiddingListener r3) {
            r0 = this;
            super.startBid(r1, r2, r3)
            r0.initSDK()
            boolean r1 = r0.isC2SAdSource()
            if (r1 == 0) goto L10
            r0.loadUnifiedNativeAd()
            return
        L10:
            boolean r1 = r0.isS2SAdSource()
            if (r1 == 0) goto L19
            r0.startS2SBidding()
        L19:
            return
    }
}
