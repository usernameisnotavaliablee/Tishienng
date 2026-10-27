package xyz.adscope.amps.adapter.asnp;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class ASNPUnifiedNativeAdapter extends xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter<xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem> {
    private java.util.List<xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem> mIUnifiedAdItem;
    private xyz.adscope.ad.publish.ad.unified.UnifiedAd mUnifiedAd;



    public static class ASNPTransformEntry extends xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry {
        private xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem mSrc;




        private ASNPTransformEntry(xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem r2, android.content.Context r3, int r4, xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter r5) {
                r1 = this;
                r0 = 0
                r1.<init>(r3, r4, r0, r5)
                r1.mSrc = r2
                return
        }

        public /* synthetic */ ASNPTransformEntry(xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem r1, android.content.Context r2, int r3, xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter r4, xyz.adscope.amps.adapter.asnp.ASNPUnifiedNativeAdapter.AnonymousClass1 r5) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener access$1000(xyz.adscope.amps.adapter.asnp.ASNPUnifiedNativeAdapter.ASNPTransformEntry r0) {
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener r0 = r0.mAdEventListener
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener access$1100(xyz.adscope.amps.adapter.asnp.ASNPUnifiedNativeAdapter.ASNPTransformEntry r0) {
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener r0 = r0.mAdEventListener
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter access$1200(xyz.adscope.amps.adapter.asnp.ASNPUnifiedNativeAdapter.ASNPTransformEntry r0) {
                xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter r0 = r0.mAdapter
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter access$1300(xyz.adscope.amps.adapter.asnp.ASNPUnifiedNativeAdapter.ASNPTransformEntry r0) {
                xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter r0 = r0.mAdapter
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener access$1400(xyz.adscope.amps.adapter.asnp.ASNPUnifiedNativeAdapter.ASNPTransformEntry r0) {
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener r0 = r0.mAdEventListener
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener access$1500(xyz.adscope.amps.adapter.asnp.ASNPUnifiedNativeAdapter.ASNPTransformEntry r0) {
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener r0 = r0.mAdEventListener
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter access$400(xyz.adscope.amps.adapter.asnp.ASNPUnifiedNativeAdapter.ASNPTransformEntry r0) {
                xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter r0 = r0.mAdapter
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter access$500(xyz.adscope.amps.adapter.asnp.ASNPUnifiedNativeAdapter.ASNPTransformEntry r0) {
                xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter r0 = r0.mAdapter
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener access$600(xyz.adscope.amps.adapter.asnp.ASNPUnifiedNativeAdapter.ASNPTransformEntry r0) {
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener r0 = r0.mAdEventListener
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener access$700(xyz.adscope.amps.adapter.asnp.ASNPUnifiedNativeAdapter.ASNPTransformEntry r0) {
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedAdEventListener r0 = r0.mAdEventListener
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter access$800(xyz.adscope.amps.adapter.asnp.ASNPUnifiedNativeAdapter.ASNPTransformEntry r0) {
                xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter r0 = r0.mAdapter
                return r0
        }

        public static /* synthetic */ xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter access$900(xyz.adscope.amps.adapter.asnp.ASNPUnifiedNativeAdapter.ASNPTransformEntry r0) {
                xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter r0 = r0.mAdapter
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public void bindAdToMediaView(android.app.Activity r2, xyz.adscope.amps.ad.unified.view.AMPSUnifiedMediaViewStub r3, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedVideoListener r4) {
                r1 = this;
                xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem r4 = r1.mSrc
                if (r4 != 0) goto L5
                return
            L5:
                xyz.adscope.ad.publish.ad.unified.view.ASNPUnifiedMediaView r4 = new xyz.adscope.ad.publish.ad.unified.view.ASNPUnifiedMediaView
                android.content.Context r0 = r1.mContext
                r4.<init>(r0)
                r3.addView(r4)
                xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem r3 = r1.mSrc
                r3.bindAdToMediaView(r2, r4)
                return
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public void bindAdToRootContainer(android.app.Activity r3, xyz.adscope.amps.ad.unified.view.AMPSUnifiedRootContainer r4, java.util.List<android.view.View> r5, java.util.List<android.view.View> r6) {
                r2 = this;
                xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem r0 = r2.mSrc
                if (r0 != 0) goto L5
                return
            L5:
                xyz.adscope.ad.publish.ad.unified.view.ASNPUnifiedExpressContainer r0 = new xyz.adscope.ad.publish.ad.unified.view.ASNPUnifiedExpressContainer
                xyz.adscope.amps.adapter.asnp.ASNPInitMediation r1 = xyz.adscope.amps.adapter.asnp.ASNPInitMediation.getInstance()
                java.lang.String r1 = r1.getApiKey()
                r0.<init>(r3, r1)
                xyz.adscope.amps.ad.unified.view.AMPSRootInsertHelper.insertRootView(r4, r0)
                xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem r4 = r2.mSrc
                xyz.adscope.amps.adapter.asnp.ASNPUnifiedNativeAdapter$ASNPTransformEntry$1 r1 = new xyz.adscope.amps.adapter.asnp.ASNPUnifiedNativeAdapter$ASNPTransformEntry$1
                r1.<init>(r2)
                r4.setBindAdListener(r1)
                xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem r4 = r2.mSrc
                xyz.adscope.amps.adapter.asnp.ASNPUnifiedNativeAdapter$ASNPTransformEntry$2 r1 = new xyz.adscope.amps.adapter.asnp.ASNPUnifiedNativeAdapter$ASNPTransformEntry$2
                r1.<init>(r2)
                r4.setExpressListener(r1)
                xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem r4 = r2.mSrc
                xyz.adscope.amps.adapter.asnp.ASNPUnifiedNativeAdapter$ASNPTransformEntry$3 r1 = new xyz.adscope.amps.adapter.asnp.ASNPUnifiedNativeAdapter$ASNPTransformEntry$3
                r1.<init>(r2)
                r4.setInteractiveListener(r1)
                xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem r4 = r2.mSrc
                r4.bindAdToRootContainer(r3, r0, r5)
                xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem r3 = r2.mSrc
                r3.bindAdActionView(r6)
                return
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public java.lang.String getActionButtonText() {
                r1 = this;
                xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem r0 = r1.mSrc
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.lang.String r0 = r0.getActionButtonText()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern getAdPattern() {
                r2 = this;
                xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem r0 = r2.mSrc
                if (r0 != 0) goto L7
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern r0 = xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern.AD_PATTERN_UNKNOWN
                return r0
            L7:
                xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern r0 = r0.getAdPattern()
                xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern r1 = xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern.PATTERN_TEXT_IMAGE
                if (r0 != r1) goto L12
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern r0 = xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern.AD_PATTERN_TEXT_IMAGE
                return r0
            L12:
                xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern r1 = xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern.PATTERN_3_IMAGES
                if (r0 != r1) goto L19
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern r0 = xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern.AD_PATTERN_3_IMAGES
                return r0
            L19:
                xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern r1 = xyz.adscope.ad.publish.ad.unified.ASNPUnifiedPattern.PATTERN_VIDEO
                if (r0 != r1) goto L20
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern r0 = xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern.AD_PATTERN_VIDEO
                return r0
            L20:
                xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern r0 = xyz.adscope.amps.ad.unified.inter.AMPSUnifiedPattern.AD_PATTERN_UNKNOWN
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public java.lang.String getAdSourceLogoUrl() {
                r1 = this;
                xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem r0 = r1.mSrc
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.lang.String r0 = r0.getAdLogoUrl()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
        public java.lang.String getAppDescription() {
                r2 = this;
                xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem r0 = r2.mSrc
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                xyz.adscope.ad.publish.ad.unified.IUnifiedDownloadInfo r0 = r0.getDownloadInfo()
                if (r0 != 0) goto Ld
                return r1
            Ld:
                java.lang.String r0 = r0.getAppIntroduction()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public xyz.adscope.amps.ad.unified.inter.AMPSAppDetail getAppDetail() {
                r0 = this;
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
        public java.lang.String getAppDeveloper() {
                r2 = this;
                xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem r0 = r2.mSrc
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                xyz.adscope.ad.publish.ad.unified.IUnifiedDownloadInfo r0 = r0.getDownloadInfo()
                if (r0 != 0) goto Ld
                return r1
            Ld:
                java.lang.String r0 = r0.getDeveloper()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
        public java.lang.String getAppIconUrl() {
                r2 = this;
                xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem r0 = r2.mSrc
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                xyz.adscope.ad.publish.ad.unified.IUnifiedDownloadInfo r0 = r0.getDownloadInfo()
                if (r0 != 0) goto Ld
                return r1
            Ld:
                java.lang.String r0 = r0.getIconUrl()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
        public java.lang.String getAppName() {
                r2 = this;
                xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem r0 = r2.mSrc
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                xyz.adscope.ad.publish.ad.unified.IUnifiedDownloadInfo r0 = r0.getDownloadInfo()
                if (r0 != 0) goto Ld
                return r1
            Ld:
                java.lang.String r0 = r0.getName()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
        public java.lang.String getAppPackageName() {
                r2 = this;
                xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem r0 = r2.mSrc
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                xyz.adscope.ad.publish.ad.unified.IUnifiedDownloadInfo r0 = r0.getDownloadInfo()
                if (r0 != 0) goto Ld
                return r1
            Ld:
                java.lang.String r0 = r0.getPackageName()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
        public java.lang.String getAppPermissionInfo() {
                r4 = this;
                xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem r0 = r4.mSrc
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                xyz.adscope.ad.publish.ad.unified.IUnifiedDownloadInfo r0 = r0.getDownloadInfo()
                if (r0 != 0) goto Ld
                return r1
            Ld:
                java.lang.String r2 = r0.getPermissionUrl()
                boolean r3 = android.text.TextUtils.isEmpty(r2)
                if (r3 != 0) goto L18
                return r2
            L18:
                java.util.List r0 = r0.getPermission()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                if (r0 == 0) goto L57
                int r3 = r0.size()
                if (r3 <= 0) goto L57
                java.util.Iterator r0 = r0.iterator()
            L2d:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L52
                java.lang.Object r1 = r0.next()
                xyz.adscope.ad.publish.ad.unified.IUnifiedDownloadInfo$IPermissionInfo r1 = (xyz.adscope.ad.publish.ad.unified.IUnifiedDownloadInfo.IPermissionInfo) r1
                java.lang.String r3 = r1.getTitle()
                java.lang.String r1 = r1.getDescribe()
                r2.append(r3)
                java.lang.String r3 = ":"
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = "\n"
                r2.append(r1)
                goto L2d
            L52:
                java.lang.String r0 = r2.toString()
                return r0
            L57:
                return r1
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
        public java.lang.String getAppPrivacyPolicy() {
                r3 = this;
                xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem r0 = r3.mSrc
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                xyz.adscope.ad.publish.ad.unified.IUnifiedDownloadInfo r0 = r0.getDownloadInfo()
                if (r0 != 0) goto Ld
                return r1
            Ld:
                java.lang.String r1 = r0.getPolicyUrl()
                boolean r2 = android.text.TextUtils.isEmpty(r1)
                if (r2 != 0) goto L18
                return r1
            L18:
                java.lang.String r0 = r0.getPolicy()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
        public java.lang.String getAppSize() {
                r2 = this;
                xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem r0 = r2.mSrc
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                xyz.adscope.ad.publish.ad.unified.IUnifiedDownloadInfo r0 = r0.getDownloadInfo()
                if (r0 != 0) goto Ld
                return r1
            Ld:
                java.lang.String r0 = r0.getSize()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSAppDetail
        public java.lang.String getAppVersion() {
                r2 = this;
                xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem r0 = r2.mSrc
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                xyz.adscope.ad.publish.ad.unified.IUnifiedDownloadInfo r0 = r0.getDownloadInfo()
                if (r0 != 0) goto Ld
                return r1
            Ld:
                java.lang.String r0 = r0.getVersion()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public java.lang.String getDesc() {
                r1 = this;
                xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem r0 = r1.mSrc
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
                xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem r0 = r1.mSrc
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
                xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem r0 = r1.mSrc
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.util.List r0 = r0.getImagesUrl()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public java.lang.String getMainImageUrl() {
                r1 = this;
                xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem r0 = r1.mSrc
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.lang.String r0 = r0.getMainImageUrl()
                return r0
        }

        @Override // xyz.adscope.amps.ad.unified.inter.AMPSBaseTransformEntry, xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem
        public java.lang.String getTitle() {
                r1 = this;
                xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem r0 = r1.mSrc
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
                xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem r0 = r1.mSrc
                if (r0 == 0) goto L6
                r0 = 1
                return r0
            L6:
                r0 = 0
                return r0
        }
    }

    public ASNPUnifiedNativeAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void access$000(xyz.adscope.amps.adapter.asnp.ASNPUnifiedNativeAdapter r0) {
            r0.loadUnifiedNativeAd()
            return
    }

    public static /* synthetic */ java.util.List access$102(xyz.adscope.amps.adapter.asnp.ASNPUnifiedNativeAdapter r0, java.util.List r1) {
            r0.mIUnifiedAdItem = r1
            return r1
    }

    public static /* synthetic */ void access$200(xyz.adscope.amps.adapter.asnp.ASNPUnifiedNativeAdapter r0, java.util.List r1) {
            r0.convertAdapterResponse(r1)
            return
    }

    private void initSDK() {
            r3 = this;
            xyz.adscope.amps.adapter.asnp.ASNPInitMediation r0 = xyz.adscope.amps.adapter.asnp.ASNPInitMediation.getInstance()
            xyz.adscope.amps.init.AMPSInitAdapterConfig r1 = r3.mInitAdapterConfig
            xyz.adscope.amps.adapter.asnp.ASNPUnifiedNativeAdapter$1 r2 = new xyz.adscope.amps.adapter.asnp.ASNPUnifiedNativeAdapter$1
            r2.<init>(r3)
            r0.initSDK(r1, r2)
            return
    }

    private void loadUnifiedNativeAd() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ASNPSDK start loadUnifiedNativeAd spaceId:"
            r0.append(r1)
            java.lang.String r1 = r3.mSpaceId
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "amps_log_tag"
            xyz.adscope.amps.tool.AMPSLogUtil.d(r1, r0)
            android.content.Context r0 = r3.mContext
            if (r0 != 0) goto L2a
            xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum r0 = xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum.CHANNEL_ERROR_REQUEST_FAIL
            java.lang.String r1 = r0.getErrorCode()
            java.lang.String r0 = r0.getErrorMsg()
            r3.onAdFailed(r1, r0)
            return
        L2a:
            xyz.adscope.ad.publish.ad.unified.IUnifiedAdConfig$Builder r0 = new xyz.adscope.ad.publish.ad.unified.IUnifiedAdConfig$Builder
            r0.<init>()
            r1 = 1
            xyz.adscope.ad.publish.ad.unified.IUnifiedAdConfig$Builder r0 = r0.setAdCount2(r1)
            int r1 = r3.expressViewWidth
            float r1 = (float) r1
            int r2 = r3.expressViewHeight
            float r2 = (float) r2
            xyz.adscope.ad.publish.ad.unified.IUnifiedAdConfig$Builder r0 = r0.setExpressSizePixel2(r1, r2)
            int r1 = r3.mTimeout
            long r1 = (long) r1
            xyz.adscope.ad.publish.ad.unified.IUnifiedAdConfig$Builder r0 = r0.setTimeoutMillion2(r1)
            java.lang.String r1 = r3.mSpaceId
            xyz.adscope.ad.a2 r0 = r0.build(r1)
            xyz.adscope.ad.publish.ad.unified.IUnifiedAdConfig r0 = (xyz.adscope.ad.publish.ad.unified.IUnifiedAdConfig) r0
            xyz.adscope.ad.publish.ad.unified.UnifiedAd r1 = new xyz.adscope.ad.publish.ad.unified.UnifiedAd
            android.content.Context r2 = r3.mContext
            r1.<init>(r2, r0)
            r3.mUnifiedAd = r1
            xyz.adscope.amps.adapter.asnp.ASNPUnifiedNativeAdapter$2 r0 = new xyz.adscope.amps.adapter.asnp.ASNPUnifiedNativeAdapter$2
            r0.<init>(r3)
            r1.loadAd(r0)
            return
    }

    @Override // xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter
    public /* bridge */ /* synthetic */ xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem convertEntryFromAdapterResponse(xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem r1) {
            r0 = this;
            xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem r1 = (xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem) r1
            xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem r1 = r0.convertEntryFromAdapterResponse2(r1)
            return r1
    }

    /* renamed from: convertEntryFromAdapterResponse, reason: avoid collision after fix types in other method */
    public xyz.adscope.amps.ad.unified.inter.AMPSUnifiedNativeItem convertEntryFromAdapterResponse2(xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem r8) {
            r7 = this;
            int r0 = r7.mAdEcpm
            boolean r1 = r7.isBidding
            if (r1 == 0) goto L14
            xyz.adscope.ad.publish.ad.IBidding r1 = r8.getBidding()
            if (r1 == 0) goto L14
            xyz.adscope.ad.publish.ad.IBidding r0 = r8.getBidding()
            int r0 = r0.getECPM()
        L14:
            r4 = r0
            xyz.adscope.amps.adapter.asnp.ASNPUnifiedNativeAdapter$ASNPTransformEntry r1 = new xyz.adscope.amps.adapter.asnp.ASNPUnifiedNativeAdapter$ASNPTransformEntry
            android.content.Context r3 = r7.mContext
            r6 = 0
            r5 = r7
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public boolean isValid() {
            r1 = this;
            xyz.adscope.ad.publish.ad.unified.UnifiedAd r0 = r1.mUnifiedAd
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
            xyz.adscope.ad.publish.ad.unified.UnifiedAd r1 = r0.mUnifiedAd
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
    public void sendLossNotice(xyz.adscope.amps.base.AMPSBidResult r5) {
            r4 = this;
            java.util.List<xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem> r0 = r4.mIUnifiedAdItem     // Catch: java.lang.Exception -> L3b
            if (r0 == 0) goto L3b
            int r0 = r0.size()     // Catch: java.lang.Exception -> L3b
            if (r0 == 0) goto L3b
            if (r5 != 0) goto Ld
            goto L3b
        Ld:
            java.util.List<xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem> r0 = r4.mIUnifiedAdItem     // Catch: java.lang.Exception -> L3b
            r1 = 0
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L3b
            xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem r0 = (xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem) r0     // Catch: java.lang.Exception -> L3b
            if (r0 == 0) goto L3b
            xyz.adscope.ad.publish.ad.IBidding r1 = r0.getBidding()     // Catch: java.lang.Exception -> L3b
            if (r1 != 0) goto L1f
            goto L3b
        L1f:
            int r1 = r5.getEcpm()     // Catch: java.lang.Exception -> L3b
            int r2 = r5.getReason()     // Catch: java.lang.Exception -> L3b
            java.lang.String r5 = r5.getChannelName()     // Catch: java.lang.Exception -> L3b
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Exception -> L3b
            r3 = -1
            java.util.Map r5 = xyz.adscope.ad.publish.ad.IBidding.BiddingPriceBuilder.buildLoseNoticeMap(r1, r3, r5, r2, r3)     // Catch: java.lang.Exception -> L3b
            xyz.adscope.ad.publish.ad.IBidding r0 = r0.getBidding()     // Catch: java.lang.Exception -> L3b
            r0.notifyBidLose(r5)     // Catch: java.lang.Exception -> L3b
        L3b:
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void sendWinNotice(xyz.adscope.amps.base.AMPSBidResult r5) {
            r4 = this;
            java.util.List<xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem> r0 = r4.mIUnifiedAdItem     // Catch: java.lang.Exception -> L3b
            if (r0 == 0) goto L3b
            int r0 = r0.size()     // Catch: java.lang.Exception -> L3b
            if (r0 == 0) goto L3b
            if (r5 != 0) goto Ld
            goto L3b
        Ld:
            java.util.List<xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem> r0 = r4.mIUnifiedAdItem     // Catch: java.lang.Exception -> L3b
            r1 = 0
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L3b
            xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem r0 = (xyz.adscope.ad.publish.ad.unified.IUnifiedAdItem) r0     // Catch: java.lang.Exception -> L3b
            if (r0 == 0) goto L3b
            xyz.adscope.ad.publish.ad.IBidding r1 = r0.getBidding()     // Catch: java.lang.Exception -> L3b
            if (r1 != 0) goto L1f
            goto L3b
        L1f:
            xyz.adscope.ad.publish.ad.IBidding r1 = r0.getBidding()     // Catch: java.lang.Exception -> L3b
            int r1 = r1.getECPM()     // Catch: java.lang.Exception -> L3b
            int r2 = r5.getEcpm()     // Catch: java.lang.Exception -> L3b
            java.lang.String r5 = r5.getChannelName()     // Catch: java.lang.Exception -> L3b
            r3 = -1
            java.util.Map r5 = xyz.adscope.ad.publish.ad.IBidding.BiddingPriceBuilder.buildWinNoticeMap(r1, r2, r5, r3)     // Catch: java.lang.Exception -> L3b
            xyz.adscope.ad.publish.ad.IBidding r0 = r0.getBidding()     // Catch: java.lang.Exception -> L3b
            r0.notifyBidWin(r5)     // Catch: java.lang.Exception -> L3b
        L3b:
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
