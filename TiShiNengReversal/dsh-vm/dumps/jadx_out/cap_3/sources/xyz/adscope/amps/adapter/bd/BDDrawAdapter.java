package xyz.adscope.amps.adapter.bd;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class BDDrawAdapter extends xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapter {
    private xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdExpressListener mAMPSDrawAdExpressListener;
    private xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdVideoListener mAMPSDrawAdVideoListener;
    private com.baidu.mobads.sdk.api.BaiduNativeManager mBaiduNativeManager;
    private com.baidu.mobads.sdk.api.BaiduNativeManager.FeedAdListener mFeedAdListener;
    private java.util.List<com.baidu.mobads.sdk.api.NativeResponse> mNativeResponseList;







    public BDDrawAdapter() {
            r1 = this;
            r1.<init>()
            xyz.adscope.amps.adapter.bd.BDDrawAdapter$3 r0 = new xyz.adscope.amps.adapter.bd.BDDrawAdapter$3
            r0.<init>(r1)
            r1.mFeedAdListener = r0
            return
    }

    public static /* synthetic */ java.util.List access$002(xyz.adscope.amps.adapter.bd.BDDrawAdapter r0, java.util.List r1) {
            r0.mNativeResponseList = r1
            return r1
    }

    public static /* synthetic */ xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdVideoListener access$100(xyz.adscope.amps.adapter.bd.BDDrawAdapter r0) {
            xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdVideoListener r0 = r0.mAMPSDrawAdVideoListener
            return r0
    }

    public static /* synthetic */ xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdExpressListener access$200(xyz.adscope.amps.adapter.bd.BDDrawAdapter r0) {
            xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdExpressListener r0 = r0.mAMPSDrawAdExpressListener
            return r0
    }

    private void initSDK() {
            r3 = this;
            xyz.adscope.amps.adapter.bd.BDInitMediation r0 = xyz.adscope.amps.adapter.bd.BDInitMediation.getInstance()
            xyz.adscope.amps.init.AMPSInitAdapterConfig r1 = r3.mInitAdapterConfig
            r2 = 0
            r0.initSDK(r1, r2)
            r3.loadDrawAd()
            return
    }

    private void loadDrawAd() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "BDSDK start loadNativeAd spaceId:"
            r0.append(r1)
            java.lang.String r1 = r3.mSpaceId
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "amps_log_tag"
            xyz.adscope.amps.tool.AMPSLogUtil.d(r1, r0)
            int r0 = r3.expressViewHeightDp
            if (r0 > 0) goto L1f
            r0 = 0
            r3.expressViewHeightDp = r0
        L1f:
            com.baidu.mobads.sdk.api.BaiduNativeManager r0 = new com.baidu.mobads.sdk.api.BaiduNativeManager
            android.content.Context r1 = r3.mContext
            java.lang.String r2 = r3.mSpaceId
            r0.<init>(r1, r2)
            r3.mBaiduNativeManager = r0
            com.baidu.mobads.sdk.api.RequestParameters$Builder r0 = new com.baidu.mobads.sdk.api.RequestParameters$Builder
            r0.<init>()
            int r1 = r3.expressViewHeightDp
            com.baidu.mobads.sdk.api.RequestParameters$Builder r0 = r0.setHeight(r1)
            int r1 = r3.expressViewWidthDp
            com.baidu.mobads.sdk.api.RequestParameters$Builder r0 = r0.setWidth(r1)
            com.baidu.mobads.sdk.api.RequestParameters r0 = r0.build()
            com.baidu.mobads.sdk.api.BaiduNativeManager r1 = r3.mBaiduNativeManager
            com.baidu.mobads.sdk.api.BaiduNativeManager$FeedAdListener r2 = r3.mFeedAdListener
            r1.loadPortraitVideoAd(r0, r2)
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void destroy() {
            r2 = this;
            super.destroy()     // Catch: java.lang.Exception -> L13
            com.baidu.mobads.sdk.api.BaiduNativeManager r0 = r2.mBaiduNativeManager     // Catch: java.lang.Exception -> L13
            r1 = 0
            if (r0 == 0) goto La
            r2.mBaiduNativeManager = r1     // Catch: java.lang.Exception -> L13
        La:
            java.util.List<com.baidu.mobads.sdk.api.NativeResponse> r0 = r2.mNativeResponseList     // Catch: java.lang.Exception -> L13
            if (r0 == 0) goto L13
            r0.clear()     // Catch: java.lang.Exception -> L13
            r2.mNativeResponseList = r1     // Catch: java.lang.Exception -> L13
        L13:
            return
    }

    @Override // xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapter
    public java.util.List<xyz.adscope.amps.ad.draw.inter.AMPSDrawAdExpressInfo> getDrawListInfo() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<com.baidu.mobads.sdk.api.NativeResponse> r1 = r5.mNativeResponseList
            if (r1 == 0) goto L2c
            int r1 = r1.size()
            if (r1 <= 0) goto L2c
            java.util.List<com.baidu.mobads.sdk.api.NativeResponse> r1 = r5.mNativeResponseList
            java.util.Iterator r1 = r1.iterator()
        L15:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r1.next()
            com.baidu.mobads.sdk.api.NativeResponse r2 = (com.baidu.mobads.sdk.api.NativeResponse) r2
            xyz.adscope.amps.adapter.bd.data.BDDrawAd r3 = new xyz.adscope.amps.adapter.bd.data.BDDrawAd
            android.content.Context r4 = r5.mContext
            r3.<init>(r2, r5, r4)
            r0.add(r3)
            goto L15
        L2c:
            return r0
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public boolean isValid() {
            r1 = this;
            com.baidu.mobads.sdk.api.BaiduNativeManager r0 = r1.mBaiduNativeManager
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = 1
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapter
    public void loadNetworkAd(android.content.Context r1, xyz.adscope.amps.model.AMPSAdapterModel r2, xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapterListener r3) {
            r0 = this;
            super.loadNetworkAd2(r1, r2, r3)
            boolean r1 = r0.isBidding
            if (r1 == 0) goto L15
            java.util.List<com.baidu.mobads.sdk.api.NativeResponse> r1 = r0.mNativeResponseList
            if (r1 == 0) goto L15
            int r1 = r1.size()
            if (r1 <= 0) goto L15
            r0.onAdLoad()
            return
        L15:
            r0.initSDK()
            return
    }

    @Override // xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapter, xyz.adscope.amps.base.AMPSBaseAdapter
    public /* bridge */ /* synthetic */ void loadNetworkAd(android.content.Context r1, xyz.adscope.amps.model.AMPSAdapterModel r2, xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapterListener r3) {
            r0 = this;
            xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapterListener r3 = (xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapterListener) r3
            r0.loadNetworkAd(r1, r2, r3)
            return
    }

    public android.view.View renderView(com.baidu.mobads.sdk.api.NativeResponse r13) {
            r12 = this;
            android.widget.FrameLayout r0 = new android.widget.FrameLayout     // Catch: java.lang.Exception -> Lf7
            android.content.Context r1 = r12.mContext     // Catch: java.lang.Exception -> Lf7
            r0.<init>(r1)     // Catch: java.lang.Exception -> Lf7
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams     // Catch: java.lang.Exception -> Lf7
            r2 = -1
            r1.<init>(r2, r2)     // Catch: java.lang.Exception -> Lf7
            r0.setLayoutParams(r1)     // Catch: java.lang.Exception -> Lf7
            com.baidu.mobads.sdk.api.FeedPortraitVideoView r1 = new com.baidu.mobads.sdk.api.FeedPortraitVideoView     // Catch: java.lang.Exception -> Lf7
            android.content.Context r3 = r12.mContext     // Catch: java.lang.Exception -> Lf7
            r1.<init>(r3)     // Catch: java.lang.Exception -> Lf7
            r3 = 1
            r1.setUseDownloadFrame(r3)     // Catch: java.lang.Exception -> Lf7
            r1.setShowProgress(r3)     // Catch: java.lang.Exception -> Lf7
            r1.setVideoMute(r3)     // Catch: java.lang.Exception -> Lf7
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1.setProgressBackgroundColor(r4)     // Catch: java.lang.Exception -> Lf7
            r1.setProgressBarColor(r2)     // Catch: java.lang.Exception -> Lf7
            r1.setProgressHeightInDp(r3)     // Catch: java.lang.Exception -> Lf7
            xyz.adscope.amps.adapter.bd.BDDrawAdapter$4 r4 = new xyz.adscope.amps.adapter.bd.BDDrawAdapter$4     // Catch: java.lang.Exception -> Lf7
            r4.<init>(r12)     // Catch: java.lang.Exception -> Lf7
            r1.setFeedPortraitListener(r4)     // Catch: java.lang.Exception -> Lf7
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lf7
            r4.<init>()     // Catch: java.lang.Exception -> Lf7
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lf7
            r5.<init>()     // Catch: java.lang.Exception -> Lf7
            r4.add(r1)     // Catch: java.lang.Exception -> Lf7
            xyz.adscope.amps.adapter.bd.BDDrawAdapter$5 r6 = new xyz.adscope.amps.adapter.bd.BDDrawAdapter$5     // Catch: java.lang.Exception -> Lf7
            r6.<init>(r12)     // Catch: java.lang.Exception -> Lf7
            r13.registerViewForInteraction(r1, r4, r5, r6)     // Catch: java.lang.Exception -> Lf7
            xyz.adscope.amps.adapter.bd.BDDrawAdapter$6 r4 = new xyz.adscope.amps.adapter.bd.BDDrawAdapter$6     // Catch: java.lang.Exception -> Lf7
            r4.<init>(r12, r1, r13)     // Catch: java.lang.Exception -> Lf7
            r1.post(r4)     // Catch: java.lang.Exception -> Lf7
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Exception -> Lf7
            r5 = 17
            r4.<init>(r2, r2, r5)     // Catch: java.lang.Exception -> Lf7
            r0.addView(r1, r4)     // Catch: java.lang.Exception -> Lf7
            android.widget.ImageView r1 = new android.widget.ImageView     // Catch: java.lang.Exception -> Lf7
            android.content.Context r4 = r12.mContext     // Catch: java.lang.Exception -> Lf7
            r1.<init>(r4)     // Catch: java.lang.Exception -> Lf7
            java.lang.String r4 = xyz.adscope.amps.adapter.bd.data.BDConstant.bd_icon_ad_logo     // Catch: java.lang.Exception -> Lf7
            android.graphics.Bitmap r4 = xyz.adscope.amps.adapter.bd.util.Base64Util.base64ToBitmap(r4)     // Catch: java.lang.Exception -> Lf7
            r1.setImageBitmap(r4)     // Catch: java.lang.Exception -> Lf7
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Exception -> Lf7
            r5 = 132(0x84, float:1.85E-43)
            r6 = 56
            r7 = 83
            r4.<init>(r5, r6, r7)     // Catch: java.lang.Exception -> Lf7
            r5 = 40
            r6 = 0
            r4.setMargins(r5, r6, r6, r5)     // Catch: java.lang.Exception -> Lf7
            r0.addView(r1, r4)     // Catch: java.lang.Exception -> Lf7
            java.lang.String r1 = r13.getTitle()     // Catch: java.lang.Exception -> Lf7
            java.lang.String r13 = r13.getDesc()     // Catch: java.lang.Exception -> Lf7
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> Lf7
            if (r4 != 0) goto Lf6
            boolean r4 = android.text.TextUtils.isEmpty(r13)     // Catch: java.lang.Exception -> Lf7
            if (r4 != 0) goto Lf6
            android.widget.LinearLayout r4 = new android.widget.LinearLayout     // Catch: java.lang.Exception -> Lf7
            android.content.Context r8 = r12.mContext     // Catch: java.lang.Exception -> Lf7
            r4.<init>(r8)     // Catch: java.lang.Exception -> Lf7
            r4.setOrientation(r3)     // Catch: java.lang.Exception -> Lf7
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> Lf7
            java.lang.String r8 = "#FFFFFF"
            r9 = 2
            r10 = -2
            if (r3 != 0) goto Lc5
            android.widget.TextView r3 = new android.widget.TextView     // Catch: java.lang.Exception -> Lf7
            android.content.Context r11 = r12.mContext     // Catch: java.lang.Exception -> Lf7
            r3.<init>(r11)     // Catch: java.lang.Exception -> Lf7
            r3.setText(r1)     // Catch: java.lang.Exception -> Lf7
            r1 = 1092616192(0x41200000, float:10.0)
            r3.setTextSize(r9, r1)     // Catch: java.lang.Exception -> Lf7
            int r1 = android.graphics.Color.parseColor(r8)     // Catch: java.lang.Exception -> Lf7
            r3.setTextColor(r1)     // Catch: java.lang.Exception -> Lf7
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams     // Catch: java.lang.Exception -> Lf7
            r1.<init>(r10, r10)     // Catch: java.lang.Exception -> Lf7
            r4.addView(r3, r1)     // Catch: java.lang.Exception -> Lf7
        Lc5:
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch: java.lang.Exception -> Lf7
            if (r1 != 0) goto Le9
            android.widget.TextView r1 = new android.widget.TextView     // Catch: java.lang.Exception -> Lf7
            android.content.Context r3 = r12.mContext     // Catch: java.lang.Exception -> Lf7
            r1.<init>(r3)     // Catch: java.lang.Exception -> Lf7
            r1.setText(r13)     // Catch: java.lang.Exception -> Lf7
            r13 = 1091567616(0x41100000, float:9.0)
            r1.setTextSize(r9, r13)     // Catch: java.lang.Exception -> Lf7
            int r13 = android.graphics.Color.parseColor(r8)     // Catch: java.lang.Exception -> Lf7
            r1.setTextColor(r13)     // Catch: java.lang.Exception -> Lf7
            android.widget.LinearLayout$LayoutParams r13 = new android.widget.LinearLayout$LayoutParams     // Catch: java.lang.Exception -> Lf7
            r13.<init>(r10, r10)     // Catch: java.lang.Exception -> Lf7
            r4.addView(r1, r13)     // Catch: java.lang.Exception -> Lf7
        Le9:
            android.widget.FrameLayout$LayoutParams r13 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Exception -> Lf7
            r13.<init>(r2, r10, r7)     // Catch: java.lang.Exception -> Lf7
            r1 = 120(0x78, float:1.68E-43)
            r13.setMargins(r5, r6, r6, r1)     // Catch: java.lang.Exception -> Lf7
            r0.addView(r4, r13)     // Catch: java.lang.Exception -> Lf7
        Lf6:
            return r0
        Lf7:
            r13 = 0
            return r13
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAdapter
    public void sendLossNotice(xyz.adscope.amps.base.AMPSBidResult r4) {
            r3 = this;
            java.util.List<com.baidu.mobads.sdk.api.NativeResponse> r0 = r3.mNativeResponseList     // Catch: java.lang.Exception -> L2b
            if (r0 == 0) goto L2b
            if (r4 != 0) goto L7
            goto L2b
        L7:
            int r0 = r0.size()     // Catch: java.lang.Exception -> L2b
            if (r0 <= 0) goto L17
            java.util.List<com.baidu.mobads.sdk.api.NativeResponse> r0 = r3.mNativeResponseList     // Catch: java.lang.Exception -> L2b
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
            xyz.adscope.amps.adapter.bd.BDDrawAdapter$2 r1 = new xyz.adscope.amps.adapter.bd.BDDrawAdapter$2     // Catch: java.lang.Exception -> L2b
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
            java.util.List<com.baidu.mobads.sdk.api.NativeResponse> r0 = r3.mNativeResponseList     // Catch: java.lang.Exception -> L2b
            if (r0 == 0) goto L2b
            if (r4 != 0) goto L7
            goto L2b
        L7:
            int r0 = r0.size()     // Catch: java.lang.Exception -> L2b
            if (r0 <= 0) goto L17
            java.util.List<com.baidu.mobads.sdk.api.NativeResponse> r0 = r3.mNativeResponseList     // Catch: java.lang.Exception -> L2b
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
            xyz.adscope.amps.adapter.bd.BDDrawAdapter$1 r1 = new xyz.adscope.amps.adapter.bd.BDDrawAdapter$1     // Catch: java.lang.Exception -> L2b
            r1.<init>(r3)     // Catch: java.lang.Exception -> L2b
            xyz.adscope.amps.adapter.bd.BDInitMediation r2 = xyz.adscope.amps.adapter.bd.BDInitMediation.getInstance()     // Catch: java.lang.Exception -> L2b
            java.util.LinkedHashMap r4 = r2.getSecondInfo(r4)     // Catch: java.lang.Exception -> L2b
            r0.biddingSuccess(r4, r1)     // Catch: java.lang.Exception -> L2b
        L2b:
            return
    }

    public void setAMPSDrawAdExpressListener(xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdExpressListener r1) {
            r0 = this;
            r0.mAMPSDrawAdExpressListener = r1
            return
    }

    public void setAMPSDrawAdVideoListener(xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdVideoListener r1) {
            r0 = this;
            r0.mAMPSDrawAdVideoListener = r1
            return
    }

    @Override // xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapter, xyz.adscope.amps.base.AMPSBaseAdapter
    public void startBid(android.content.Context r1, xyz.adscope.amps.model.AMPSAdapterModel r2, xyz.adscope.amps.inner.AMPSAdBiddingListener r3) {
            r0 = this;
            super.startBid(r1, r2, r3)
            r0.initSDK()
            return
    }
}
