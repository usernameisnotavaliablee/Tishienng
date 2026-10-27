package xyz.adscope.amps.adapter.bd.data;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class BDDrawAd implements xyz.adscope.amps.ad.draw.inter.AMPSDrawAdExpressInfo {
    private xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdExpressListener mAmpsDrawAdExpressListener;
    public xyz.adscope.amps.adapter.bd.BDDrawAdapter mBDDrawAdapter;
    public android.content.Context mContext;
    private android.view.View mDrawView;
    public com.baidu.mobads.sdk.api.NativeResponse mNativeResponse;

    public BDDrawAd(com.baidu.mobads.sdk.api.NativeResponse r1, xyz.adscope.amps.adapter.bd.BDDrawAdapter r2, android.content.Context r3) {
            r0 = this;
            r0.<init>()
            r0.mNativeResponse = r1
            r0.mBDDrawAdapter = r2
            r0.mContext = r3
            return
    }

    @Override // xyz.adscope.amps.ad.draw.inter.AMPSDrawAdExpressInfo
    public void destroy() {
            r1 = this;
            r0 = 0
            r1.mNativeResponse = r0
            r1.mDrawView = r0
            r1.mContext = r0
            r1.mAmpsDrawAdExpressListener = r0
            return
    }

    @Override // xyz.adscope.amps.ad.draw.inter.AMPSDrawAdExpressInfo
    public android.view.View getDrawView() {
            r2 = this;
            com.baidu.mobads.sdk.api.NativeResponse r0 = r2.mNativeResponse
            if (r0 == 0) goto Lf
            android.content.Context r1 = r2.mContext
            boolean r0 = r0.isAdAvailable(r1)
            if (r0 == 0) goto Lf
            android.view.View r0 = r2.mDrawView
            return r0
        Lf:
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.amps.ad.draw.inter.AMPSDrawAdExpressInfo
    public void render() {
            r4 = this;
            xyz.adscope.amps.adapter.bd.BDDrawAdapter r0 = r4.mBDDrawAdapter
            com.baidu.mobads.sdk.api.NativeResponse r1 = r4.mNativeResponse
            android.view.View r0 = r0.renderView(r1)
            r4.mDrawView = r0
            if (r0 != 0) goto L39
            xyz.adscope.amps.adapter.bd.BDDrawAdapter r0 = r4.mBDDrawAdapter
            if (r0 == 0) goto L22
            xyz.adscope.amps.common.AMPSError r1 = new xyz.adscope.amps.common.AMPSError
            xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum r2 = xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum.CHANNEL_ERROR_AD_RENDER_FAIL
            java.lang.String r3 = r2.getErrorCode()
            java.lang.String r2 = r2.getErrorMsg()
            r1.<init>(r3, r2)
            r0.onRenderFail(r1)
        L22:
            xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdExpressListener r0 = r4.mAmpsDrawAdExpressListener
            if (r0 == 0) goto L4c
            xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum r1 = xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum.CHANNEL_ERROR_AD_RENDER_FAIL
            java.lang.String r2 = r1.getErrorMsg()
            java.lang.String r1 = r1.getErrorCode()
            int r1 = java.lang.Integer.parseInt(r1)
            r3 = 0
            r0.onRenderFail(r3, r2, r1)
            return
        L39:
            xyz.adscope.amps.adapter.bd.BDDrawAdapter r0 = r4.mBDDrawAdapter
            if (r0 == 0) goto L40
            r0.onRender()
        L40:
            xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdExpressListener r0 = r4.mAmpsDrawAdExpressListener
            if (r0 == 0) goto L4c
            android.view.View r1 = r4.getDrawView()
            r2 = 0
            r0.onRenderSuccess(r1, r2, r2)
        L4c:
            return
    }

    @Override // xyz.adscope.amps.ad.draw.inter.AMPSDrawAdExpressInfo
    public void setAMPSDrawAdExpressInfoListener(xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdExpressListener r2) {
            r1 = this;
            r1.mAmpsDrawAdExpressListener = r2
            xyz.adscope.amps.adapter.bd.BDDrawAdapter r0 = r1.mBDDrawAdapter
            if (r0 == 0) goto L9
            r0.setAMPSDrawAdExpressListener(r2)
        L9:
            return
    }

    @Override // xyz.adscope.amps.ad.draw.inter.AMPSDrawAdExpressInfo
    public void setAMPSDrawAdVideoListener(xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdVideoListener r2) {
            r1 = this;
            xyz.adscope.amps.adapter.bd.BDDrawAdapter r0 = r1.mBDDrawAdapter
            if (r0 == 0) goto L7
            r0.setAMPSDrawAdVideoListener(r2)
        L7:
            return
    }
}
