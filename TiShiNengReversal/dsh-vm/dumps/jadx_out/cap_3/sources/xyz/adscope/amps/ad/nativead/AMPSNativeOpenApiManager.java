package xyz.adscope.amps.ad.nativead;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSNativeOpenApiManager extends xyz.adscope.amps.manager.AMPSBaseOpenApiManager implements xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdAdapterListener<xyz.adscope.amps.ad.nativead.inter.AMPSNativeAdExpressInfo> {
    private xyz.adscope.amps.ad.nativead.AMPSNativeLoadEventListener ampsNativeLoadEventListener;

    public AMPSNativeOpenApiManager(android.content.Context r1, xyz.adscope.amps.config.AMPSRequestParameters r2, xyz.adscope.amps.ad.nativead.AMPSNativeLoadEventListener r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.ampsNativeLoadEventListener = r3
            return
    }

    @Override // xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdAdapterListener
    public void onRender() {
            r7 = this;
            xyz.adscope.amps.model.config.response.AdSourceModel r1 = r7.getWinAdSourceModel()
            xyz.adscope.amps.report.AMPSEventReportCode r2 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_ADSOURCE_NATIVE_AD_RENDER
            java.lang.String r4 = ""
            r5 = 0
            java.lang.String r3 = ""
            r0 = r7
            r0.uploadLog(r1, r2, r3, r4, r5)
            return
    }

    @Override // xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdAdapterListener
    public void onRenderFail(xyz.adscope.amps.common.AMPSError r8) {
            r7 = this;
            xyz.adscope.amps.model.config.response.AdSourceModel r1 = r7.getWinAdSourceModel()
            java.lang.String r8 = ""
            if (r1 == 0) goto Le
            java.lang.String r0 = r1.getErrorCode()
            r3 = r0
            goto Lf
        Le:
            r3 = r8
        Lf:
            if (r1 == 0) goto L15
            java.lang.String r8 = r1.getErrorMsg()
        L15:
            r4 = r8
            xyz.adscope.amps.report.AMPSEventReportCode r2 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_ADSOURCE_NATIVE_AD_RENDER_FAIL
            r5 = 0
            r0 = r7
            r0.uploadLog(r1, r2, r3, r4, r5)
            return
    }

    @Override // xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdAdapterListener
    public void onRenderSuccess() {
            r7 = this;
            xyz.adscope.amps.model.config.response.AdSourceModel r1 = r7.getWinAdSourceModel()
            xyz.adscope.amps.report.AMPSEventReportCode r2 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_ADSOURCE_NATIVE_AD_RENDER_SUCCESS
            java.lang.String r4 = ""
            r5 = 0
            java.lang.String r3 = ""
            r0 = r7
            r0.uploadLog(r1, r2, r3, r4, r5)
            return
    }
}
