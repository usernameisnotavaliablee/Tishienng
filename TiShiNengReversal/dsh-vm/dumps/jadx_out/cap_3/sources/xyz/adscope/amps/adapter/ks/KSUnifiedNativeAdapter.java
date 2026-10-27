package xyz.adscope.amps.adapter.ks;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class KSUnifiedNativeAdapter extends xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter<com.kwad.sdk.api.KsNativeAd> {
    private java.util.List<com.kwad.sdk.api.KsNativeAd> iNativeAdViews;
    private java.lang.String mBidResponse;
    private xyz.adscope.amps.adapter.ks.model.BidResponseModel mBidResponseModel;
    private java.lang.String mBidResponseV2;



    public static class KSTransformEntry extends xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry {
        private com.kwad.sdk.api.KsNativeAd mSrc;




        private KSTransformEntry(com.kwad.sdk.api.KsNativeAd r2, int r3, xyz.adscope.amps.ad.unified.inter.AMPSVideoConfig r4, xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter r5) {
                r1 = this;
                r0 = 0
                r1.<init>(r0, r3, r4, r5)
                r1.mSrc = r2
                return
        }

        public /* synthetic */ KSTransformEntry(com.kwad.sdk.api.KsNativeAd r1, int r2, xyz.adscope.amps.ad.unified.inter.AMPSVideoConfig r3, xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter r4, xyz.adscope.amps.adapter.ks.KSUnifiedNativeAdapter.AnonymousClass1 r5) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener access$1000(xyz.adscope.amps.adapter.ks.KSUnifiedNativeAdapter.KSTransformEntry r0) {
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener r0 = r0.mDownloadListener
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener access$1100(xyz.adscope.amps.adapter.ks.KSUnifiedNativeAdapter.KSTransformEntry r0) {
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener r0 = r0.mDownloadListener
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener access$1200(xyz.adscope.amps.adapter.ks.KSUnifiedNativeAdapter.KSTransformEntry r0) {
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener r0 = r0.mDownloadListener
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener access$1300(xyz.adscope.amps.adapter.ks.KSUnifiedNativeAdapter.KSTransformEntry r0) {
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener r0 = r0.mDownloadListener
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener access$1400(xyz.adscope.amps.adapter.ks.KSUnifiedNativeAdapter.KSTransformEntry r0) {
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener r0 = r0.mDownloadListener
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter access$1500(xyz.adscope.amps.adapter.ks.KSUnifiedNativeAdapter.KSTransformEntry r0) {
                xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter r0 = r0.mAdapter
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter access$1600(xyz.adscope.amps.adapter.ks.KSUnifiedNativeAdapter.KSTransformEntry r0) {
                xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter r0 = r0.mAdapter
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener access$1700(xyz.adscope.amps.adapter.ks.KSUnifiedNativeAdapter.KSTransformEntry r0) {
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener r0 = r0.mAdEventListener
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener access$1800(xyz.adscope.amps.adapter.ks.KSUnifiedNativeAdapter.KSTransformEntry r0) {
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener r0 = r0.mAdEventListener
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter access$1900(xyz.adscope.amps.adapter.ks.KSUnifiedNativeAdapter.KSTransformEntry r0) {
                xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter r0 = r0.mAdapter
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter access$2000(xyz.adscope.amps.adapter.ks.KSUnifiedNativeAdapter.KSTransformEntry r0) {
                xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter r0 = r0.mAdapter
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener access$2100(xyz.adscope.amps.adapter.ks.KSUnifiedNativeAdapter.KSTransformEntry r0) {
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener r0 = r0.mAdEventListener
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener access$2200(xyz.adscope.amps.adapter.ks.KSUnifiedNativeAdapter.KSTransformEntry r0) {
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener r0 = r0.mAdEventListener
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener access$300(xyz.adscope.amps.adapter.ks.KSUnifiedNativeAdapter.KSTransformEntry r0) {
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener r0 = r0.mDownloadListener
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener access$400(xyz.adscope.amps.adapter.ks.KSUnifiedNativeAdapter.KSTransformEntry r0) {
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener r0 = r0.mDownloadListener
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener access$500(xyz.adscope.amps.adapter.ks.KSUnifiedNativeAdapter.KSTransformEntry r0) {
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener r0 = r0.mDownloadListener
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener access$600(xyz.adscope.amps.adapter.ks.KSUnifiedNativeAdapter.KSTransformEntry r0) {
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener r0 = r0.mDownloadListener
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener access$700(xyz.adscope.amps.adapter.ks.KSUnifiedNativeAdapter.KSTransformEntry r0) {
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener r0 = r0.mDownloadListener
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener access$800(xyz.adscope.amps.adapter.ks.KSUnifiedNativeAdapter.KSTransformEntry r0) {
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener r0 = r0.mDownloadListener
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener access$900(xyz.adscope.amps.adapter.ks.KSUnifiedNativeAdapter.KSTransformEntry r0) {
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener r0 = r0.mDownloadListener
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public void bindAdToMediaView(android.app.Activity r4, xyz.adscope.amps.ad.unified.view.AMPSUnifiedMediaViewStub r5, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedVideoListener r6) {
                r3 = this;
                com.kwad.sdk.api.KsNativeAd r0 = r3.mSrc
                if (r0 != 0) goto L5
                goto L4e
            L5:
                if (r5 == 0) goto L4e
                xyz.adscope.amps.adapter.ks.KSUnifiedNativeAdapter$KSTransformEntry$3 r1 = new xyz.adscope.amps.adapter.ks.KSUnifiedNativeAdapter$KSTransformEntry$3
                r1.<init>(r3, r6)
                r0.setVideoPlayListener(r1)
                com.kwad.sdk.api.KsAdVideoPlayConfig$Builder r6 = new com.kwad.sdk.api.KsAdVideoPlayConfig$Builder
                r6.<init>()
                xyz.adscope.amps.ad.unified.inter.AMPSVideoConfig r0 = r3.mVideoConfig
                if (r0 == 0) goto L3b
                int r0 = r0.getAutoPlayPrivacy()
                r1 = 1
                if (r0 == 0) goto L2d
                r2 = 2
                if (r0 == r1) goto L29
                if (r0 == r2) goto L25
                goto L31
            L25:
                r6.videoAutoPlayType(r1)
                goto L31
            L29:
                r6.videoAutoPlayType(r2)
                goto L31
            L2d:
                r0 = 3
                r6.videoAutoPlayType(r0)
            L31:
                xyz.adscope.amps.ad.unified.inter.AMPSVideoConfig r0 = r3.mVideoConfig
                boolean r0 = r0.isMute()
                r0 = r0 ^ r1
                r6.videoSoundEnable(r0)
            L3b:
                com.kwad.sdk.api.KsNativeAd r0 = r3.mSrc
                com.kwad.sdk.api.KsAdVideoPlayConfig r6 = r6.build()
                android.view.View r4 = r0.getVideoView(r4, r6)
                android.view.ViewGroup$LayoutParams r6 = new android.view.ViewGroup$LayoutParams
                r0 = -1
                r6.<init>(r0, r0)
                r5.addView(r4, r6)
            L4e:
                return
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public void bindAdToRootContainer(android.app.Activity r4, xyz.adscope.amps.ad.unified.view.AMPSUnifiedRootContainer r5, java.util.List<android.view.View> r6, java.util.List<android.view.View> r7) {
                r3 = this;
                com.kwad.sdk.api.KsNativeAd r0 = r3.mSrc
                if (r0 != 0) goto L5
                return
            L5:
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                java.util.Iterator r6 = r6.iterator()
            Le:
                boolean r1 = r6.hasNext()
                if (r1 == 0) goto L23
                java.lang.Object r1 = r6.next()
                android.view.View r1 = (android.view.View) r1
                r2 = 1
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0.put(r1, r2)
                goto Le
            L23:
                java.util.Iterator r6 = r7.iterator()
            L27:
                boolean r7 = r6.hasNext()
                if (r7 == 0) goto L3c
                java.lang.Object r7 = r6.next()
                android.view.View r7 = (android.view.View) r7
                r1 = 2
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.put(r7, r1)
                goto L27
            L3c:
                com.kwad.sdk.api.KsNativeAd r6 = r3.mSrc
                xyz.adscope.amps.adapter.ks.KSUnifiedNativeAdapter$KSTransformEntry$2 r7 = new xyz.adscope.amps.adapter.ks.KSUnifiedNativeAdapter$KSTransformEntry$2
                r7.<init>(r3)
                r6.registerViewForInteraction(r4, r5, r0, r7)
                return
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public java.lang.String getActionButtonText() {
                r1 = this;
                com.kwad.sdk.api.KsNativeAd r0 = r1.mSrc
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.lang.String r0 = r0.getActionDescription()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern getAdPattern() {
                r2 = this;
                com.kwad.sdk.api.KsNativeAd r0 = r2.mSrc
                if (r0 != 0) goto L7
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern r0 = xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern.AD_PATTERN_UNKNOWN
                return r0
            L7:
                int r0 = r0.getMaterialType()
                r1 = 1
                if (r0 == r1) goto L1d
                r1 = 2
                if (r0 == r1) goto L1a
                r1 = 3
                if (r0 == r1) goto L17
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern r0 = xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern.AD_PATTERN_UNKNOWN
                return r0
            L17:
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern r0 = xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern.AD_PATTERN_3_IMAGES
                return r0
            L1a:
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern r0 = xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern.AD_PATTERN_TEXT_IMAGE
                return r0
            L1d:
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern r0 = xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern.AD_PATTERN_VIDEO
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public java.lang.String getAdSourceLogoUrl() {
                r2 = this;
                com.kwad.sdk.api.KsNativeAd r0 = r2.mSrc
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                r1 = 1
                java.lang.String r0 = r0.getAdSourceLogoUrl(r1)
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
                com.kwad.sdk.api.KsNativeAd r0 = r1.mSrc
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.lang.String r0 = r0.getCorporationName()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
        public java.lang.String getAppIconUrl() {
                r1 = this;
                com.kwad.sdk.api.KsNativeAd r0 = r1.mSrc
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.lang.String r0 = r0.getAppIconUrl()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
        public java.lang.String getAppName() {
                r1 = this;
                com.kwad.sdk.api.KsNativeAd r0 = r1.mSrc
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.lang.String r0 = r0.getAppName()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
        public java.lang.String getAppPackageName() {
                r1 = this;
                com.kwad.sdk.api.KsNativeAd r0 = r1.mSrc
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.lang.String r0 = r0.getAppPackageName()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
        public java.lang.String getAppPermissionInfo() {
                r1 = this;
                com.kwad.sdk.api.KsNativeAd r0 = r1.mSrc
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.lang.String r0 = r0.getPermissionInfoUrl()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
        public java.lang.String getAppPrivacyPolicy() {
                r1 = this;
                com.kwad.sdk.api.KsNativeAd r0 = r1.mSrc
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.lang.String r0 = r0.getAppPrivacyUrl()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
        public java.lang.String getAppScore() {
                r2 = this;
                com.kwad.sdk.api.KsNativeAd r0 = r2.mSrc
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                com.kwad.sdk.api.KsNativeAd r1 = r2.mSrc
                float r1 = r1.getAppScore()
                r0.append(r1)
                java.lang.String r1 = ""
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
        public java.lang.String getAppSize() {
                r3 = this;
                com.kwad.sdk.api.KsNativeAd r0 = r3.mSrc
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                com.kwad.sdk.api.KsNativeAd r1 = r3.mSrc
                long r1 = r1.getAppPackageSize()
                r0.append(r1)
                java.lang.String r1 = ""
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
        public java.lang.String getAppVersion() {
                r1 = this;
                com.kwad.sdk.api.KsNativeAd r0 = r1.mSrc
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
                com.kwad.sdk.api.KsNativeAd r0 = r1.mSrc
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.lang.String r0 = r0.getAdDescription()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
        public java.lang.String getDownloadCountDesc() {
                r1 = this;
                com.kwad.sdk.api.KsNativeAd r0 = r1.mSrc
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.lang.String r0 = r0.getAppDownloadCountDes()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public java.lang.String getIconUrl() {
                r1 = this;
                com.kwad.sdk.api.KsNativeAd r0 = r1.mSrc
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.lang.String r0 = r0.getAppIconUrl()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public int getImageHeight() {
                r3 = this;
                com.kwad.sdk.api.KsNativeAd r0 = r3.mSrc
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                java.util.List r0 = r0.getImageList()
                if (r0 == 0) goto L1d
                boolean r2 = r0.isEmpty()
                if (r2 != 0) goto L1d
                java.lang.Object r0 = r0.get(r1)
                com.kwad.sdk.api.KsImage r0 = (com.kwad.sdk.api.KsImage) r0
                int r0 = r0.getHeight()
                return r0
            L1d:
                return r1
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public int getImageWidth() {
                r3 = this;
                com.kwad.sdk.api.KsNativeAd r0 = r3.mSrc
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                java.util.List r0 = r0.getImageList()
                if (r0 == 0) goto L1d
                boolean r2 = r0.isEmpty()
                if (r2 != 0) goto L1d
                java.lang.Object r0 = r0.get(r1)
                com.kwad.sdk.api.KsImage r0 = (com.kwad.sdk.api.KsImage) r0
                int r0 = r0.getWidth()
                return r0
            L1d:
                return r1
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public java.util.List<java.lang.String> getImagesUrl() {
                r3 = this;
                com.kwad.sdk.api.KsNativeAd r0 = r3.mSrc
                java.util.List r0 = r0.getImageList()
                if (r0 == 0) goto L2c
                boolean r1 = r0.isEmpty()
                if (r1 != 0) goto L2c
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Iterator r0 = r0.iterator()
            L17:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L2b
                java.lang.Object r2 = r0.next()
                com.kwad.sdk.api.KsImage r2 = (com.kwad.sdk.api.KsImage) r2
                java.lang.String r2 = r2.getImageUrl()
                r1.add(r2)
                goto L17
            L2b:
                return r1
            L2c:
                r0 = 0
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public java.lang.String getMainImageUrl() {
                r3 = this;
                com.kwad.sdk.api.KsNativeAd r0 = r3.mSrc
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                java.util.List r0 = r0.getImageList()
                if (r0 == 0) goto L1e
                boolean r2 = r0.isEmpty()
                if (r2 != 0) goto L1e
                r1 = 0
                java.lang.Object r0 = r0.get(r1)
                com.kwad.sdk.api.KsImage r0 = (com.kwad.sdk.api.KsImage) r0
                java.lang.String r0 = r0.getImageUrl()
                return r0
            L1e:
                return r1
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public java.lang.String getTitle() {
                r1 = this;
                com.kwad.sdk.api.KsNativeAd r0 = r1.mSrc
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.lang.String r0 = r0.getProductName()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public boolean isValid() {
                r1 = this;
                com.kwad.sdk.api.KsNativeAd r0 = r1.mSrc
                if (r0 == 0) goto L6
                r0 = 1
                return r0
            L6:
                r0 = 0
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public void setDownloadListener(xyz.adscope.amps.ad.unified.inter.AMPSUnifiedDownloadListener r2) {
                r1 = this;
                super.setDownloadListener(r2)
                com.kwad.sdk.api.KsNativeAd r2 = r1.mSrc
                xyz.adscope.amps.adapter.ks.KSUnifiedNativeAdapter$KSTransformEntry$1 r0 = new xyz.adscope.amps.adapter.ks.KSUnifiedNativeAdapter$KSTransformEntry$1
                r0.<init>(r1)
                r2.setDownloadListener(r0)
                return
        }
    }

    public KSUnifiedNativeAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void access$100(xyz.adscope.amps.adapter.ks.KSUnifiedNativeAdapter r0, java.util.List r1) {
            r0.convertAdapterResponse(r1)
            return
    }

    public static /* synthetic */ java.util.List access$200(xyz.adscope.amps.adapter.ks.KSUnifiedNativeAdapter r0) {
            java.util.List<com.kwad.sdk.api.KsNativeAd> r0 = r0.iNativeAdViews
            return r0
    }

    public static /* synthetic */ java.util.List access$202(xyz.adscope.amps.adapter.ks.KSUnifiedNativeAdapter r0, java.util.List r1) {
            r0.iNativeAdViews = r1
            return r1
    }

    public static /* synthetic */ xyz.adscope.amps.adapter.ks.model.BidResponseModel access$2302(xyz.adscope.amps.adapter.ks.KSUnifiedNativeAdapter r0, xyz.adscope.amps.adapter.ks.model.BidResponseModel r1) {
            r0.mBidResponseModel = r1
            return r1
    }

    public static /* synthetic */ java.lang.String access$2402(xyz.adscope.amps.adapter.ks.KSUnifiedNativeAdapter r0, java.lang.String r1) {
            r0.mBidResponse = r1
            return r1
    }

    private com.kwad.sdk.api.KsNativeAd getKsFeedAd() {
            r2 = this;
            java.util.List<com.kwad.sdk.api.KsNativeAd> r0 = r2.iNativeAdViews
            if (r0 == 0) goto L15
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            goto L15
        Lb:
            java.util.List<com.kwad.sdk.api.KsNativeAd> r0 = r2.iNativeAdViews
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.kwad.sdk.api.KsNativeAd r0 = (com.kwad.sdk.api.KsNativeAd) r0
            return r0
        L15:
            r0 = 0
            return r0
    }

    private void initSDK() {
            r3 = this;
            xyz.adscope.amps.adapter.ks.KSInitMediation r0 = xyz.adscope.amps.adapter.ks.KSInitMediation.getInstance()
            xyz.adscope.amps.init.AMPSInitAdapterConfig r1 = r3.mInitAdapterConfig
            r2 = 0
            r0.initSDK(r1, r2)
            return
    }

    private void loadUnifiedNativeAd() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "KSSDKload  loadUnifiedNativeAd "
            r0.append(r1)
            java.lang.String r1 = r3.mSpaceId
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "amps_log_tag"
            xyz.adscope.amps.tool.AMPSLogUtil.d(r1, r0)
            com.kwad.sdk.api.KsScene$Builder r0 = new com.kwad.sdk.api.KsScene$Builder
            java.lang.String r1 = r3.mSpaceId
            long r1 = java.lang.Long.parseLong(r1)
            r0.<init>(r1)
            int r1 = r3.adCount
            com.kwad.sdk.api.KsScene$Builder r1 = r0.adNum(r1)
            r1.build()
            java.lang.String r1 = r3.mBidResponse
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L3a
            java.lang.String r1 = r3.mBidResponse
            r0.setBidResponse(r1)
            goto L47
        L3a:
            java.lang.String r1 = r3.mBidResponseV2
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L47
            java.lang.String r1 = r3.mBidResponseV2
            r0.setBidResponseV2(r1)
        L47:
            com.kwad.sdk.api.KsLoadManager r1 = com.kwad.sdk.api.KsAdSDK.getLoadManager()
            com.kwad.sdk.api.KsScene r0 = r0.build()
            xyz.adscope.amps.adapter.ks.KSUnifiedNativeAdapter$1 r2 = new xyz.adscope.amps.adapter.ks.KSUnifiedNativeAdapter$1
            r2.<init>(r3)
            r1.loadNativeAd(r0, r2)
            return
    }

    private void startS2SBidding() {
            r5 = this;
            java.lang.String r0 = r5.mServerUrl
            java.lang.String r1 = r5.mAccountId
            java.lang.String r2 = r5.mSpaceId
            int r3 = r5.mFloorEcpm
            xyz.adscope.amps.adapter.ks.KSUnifiedNativeAdapter$2 r4 = new xyz.adscope.amps.adapter.ks.KSUnifiedNativeAdapter$2
            r4.<init>(r5)
            xyz.adscope.amps.adapter.ks.util.KSBiddingRequestUtil.getBidResponse(r0, r1, r2, r3, r4)
            return
    }

    /* renamed from: convertEntryFromAdapterResponse, reason: avoid collision after fix types in other method */
    public xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem convertEntryFromAdapterResponse2(com.kwad.sdk.api.KsNativeAd r8) {
            r7 = this;
            int r0 = r7.mAdEcpm
            boolean r1 = r7.isBidding
            if (r1 == 0) goto La
            int r0 = r8.getECPM()
        La:
            r3 = r0
            xyz.adscope.amps.adapter.ks.KSUnifiedNativeAdapter$KSTransformEntry r1 = new xyz.adscope.amps.adapter.ks.KSUnifiedNativeAdapter$KSTransformEntry
            xyz.adscope.amps.ad.unified.inter.AMPSVideoConfig r4 = new xyz.adscope.amps.ad.unified.inter.AMPSVideoConfig
            boolean r0 = r7.isVolumeOn
            r0 = r0 ^ 1
            int r2 = r7.autoPlayPolicy
            r4.<init>(r0, r2)
            r6 = 0
            r5 = r7
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
    }

    @Override // xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter
    public /* bridge */ /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem convertEntryFromAdapterResponse(com.kwad.sdk.api.KsNativeAd r1) {
            r0 = this;
            com.kwad.sdk.api.KsNativeAd r1 = (com.kwad.sdk.api.KsNativeAd) r1
            xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem r1 = r0.convertEntryFromAdapterResponse2(r1)
            return r1
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void destroy() {
            r1 = this;
            super.destroy()
            java.util.List<com.kwad.sdk.api.KsNativeAd> r0 = r1.iNativeAdViews
            if (r0 == 0) goto Ld
            r0.clear()
            r0 = 0
            r1.iNativeAdViews = r0
        Ld:
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public boolean isValid() {
            r1 = this;
            java.util.List<com.kwad.sdk.api.KsNativeAd> r0 = r1.iNativeAdViews
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
            java.util.List<com.kwad.sdk.api.KsNativeAd> r1 = r0.iNativeAdViews
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
    public void sendLossNotice(xyz.adscope.amps.base.AMPSBidResult r2) {
            r1 = this;
            com.kwad.sdk.api.KsNativeAd r0 = r1.getKsFeedAd()     // Catch: java.lang.Exception -> Lc
            if (r0 == 0) goto Lc
            if (r2 != 0) goto L9
            goto Lc
        L9:
            xyz.adscope.amps.adapter.ks.KSAdManagerHolder.sendLossNotification(r0, r2)     // Catch: java.lang.Exception -> Lc
        Lc:
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void sendWinNotice(xyz.adscope.amps.base.AMPSBidResult r3) {
            r2 = this;
            com.kwad.sdk.api.KsNativeAd r3 = r2.getKsFeedAd()     // Catch: java.lang.Exception -> L20
            if (r3 != 0) goto L7
            goto L20
        L7:
            int r0 = r3.getECPM()     // Catch: java.lang.Exception -> L20
            boolean r1 = r2.isC2SAdSource()     // Catch: java.lang.Exception -> L20
            if (r1 == 0) goto L15
            xyz.adscope.amps.adapter.ks.KSAdManagerHolder.sendWinNotification(r3, r0)     // Catch: java.lang.Exception -> L20
            return
        L15:
            boolean r3 = r2.isS2SAdSource()     // Catch: java.lang.Exception -> L20
            if (r3 == 0) goto L20
            xyz.adscope.amps.adapter.ks.model.BidResponseModel r3 = r2.mBidResponseModel     // Catch: java.lang.Exception -> L20
            xyz.adscope.amps.adapter.ks.util.KSBiddingRequestUtil.sendWinNotice(r3)     // Catch: java.lang.Exception -> L20
        L20:
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
