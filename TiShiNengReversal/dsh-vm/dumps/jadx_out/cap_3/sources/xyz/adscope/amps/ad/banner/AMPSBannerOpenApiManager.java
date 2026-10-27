package xyz.adscope.amps.ad.banner;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSBannerOpenApiManager extends xyz.adscope.amps.manager.AMPSBaseOpenApiManager implements xyz.adscope.amps.ad.banner.adapter.AMPSBannerAdAdapterListener {
    private xyz.adscope.amps.ad.banner.AMPSBannerLoadEventListener ampsBannerLoadEventListener;
    private java.util.List<java.lang.String> callBackResults;

    public AMPSBannerOpenApiManager(android.content.Context r1, xyz.adscope.amps.config.AMPSRequestParameters r2, xyz.adscope.amps.ad.banner.AMPSBannerLoadEventListener r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.callBackResults = r1
            r0.ampsBannerLoadEventListener = r3
            return
    }

    @Override // xyz.adscope.amps.manager.AMPSBaseOpenApiManager
    public void destroy() {
            r1 = this;
            super.destroy()
            java.util.List<java.lang.String> r0 = r1.callBackResults
            r0.clear()
            return
    }

    @Override // xyz.adscope.amps.manager.AMPSBaseOpenApiManager, xyz.adscope.amps.inner.AMPSBaseAdAdapterListener
    public void onAdFailed(xyz.adscope.amps.base.AMPSBaseAdapter r9, xyz.adscope.amps.common.AMPSError r10) {
            r8 = this;
            if (r9 != 0) goto L3
            goto L1e
        L3:
            java.lang.String r0 = r9.getNetworkSpaceId()
            java.util.List<java.lang.String> r1 = r8.callBackResults
            boolean r1 = r1.contains(r0)
            if (r1 != 0) goto L18
            java.util.List<java.lang.String> r1 = r8.callBackResults
            r1.add(r0)
            super.onAdFailed(r9, r10)
            return
        L18:
            boolean r9 = r8.isWinAdSource(r9)
            if (r9 != 0) goto L1f
        L1e:
            return
        L1f:
            java.lang.String r9 = ""
            if (r10 == 0) goto L29
            java.lang.String r0 = r10.getCode()
            r4 = r0
            goto L2a
        L29:
            r4 = r9
        L2a:
            if (r10 == 0) goto L30
            java.lang.String r9 = r10.getMessage()
        L30:
            r5 = r9
            xyz.adscope.amps.model.config.response.AdSourceModel r2 = r8.getWinAdSourceModel()
            xyz.adscope.amps.report.AMPSEventReportCode r3 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_ADSOURCE_LOAD_FAIL_CODE
            r6 = 0
            r1 = r8
            r1.uploadLog(r2, r3, r4, r5, r6)
            return
    }

    @Override // xyz.adscope.amps.manager.AMPSBaseOpenApiManager, xyz.adscope.amps.inner.AMPSBaseAdAdapterListener
    public void onAdLoaded(xyz.adscope.amps.base.AMPSBaseAdapter r8) {
            r7 = this;
            if (r8 != 0) goto L3
            goto L1e
        L3:
            java.lang.String r0 = r8.getNetworkSpaceId()
            java.util.List<java.lang.String> r1 = r7.callBackResults
            boolean r1 = r1.contains(r0)
            if (r1 != 0) goto L18
            java.util.List<java.lang.String> r1 = r7.callBackResults
            r1.add(r0)
            super.onAdLoaded(r8)
            return
        L18:
            boolean r8 = r7.isWinAdSource(r8)
            if (r8 != 0) goto L1f
        L1e:
            return
        L1f:
            xyz.adscope.amps.model.config.response.AdSourceModel r1 = r7.getWinAdSourceModel()
            xyz.adscope.amps.report.AMPSEventReportCode r2 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_ADSOURCE_LOAD_SUCCESS_CODE
            java.lang.String r4 = ""
            r5 = 0
            java.lang.String r3 = ""
            r0 = r7
            r0.uploadLog(r1, r2, r3, r4, r5)
            return
    }
}
