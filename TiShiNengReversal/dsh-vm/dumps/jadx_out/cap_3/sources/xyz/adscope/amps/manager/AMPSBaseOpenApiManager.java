package xyz.adscope.amps.manager;

import xyz.adscope.amps.manager.inter.AMPSLoadEventListener;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class AMPSBaseOpenApiManager<T extends xyz.adscope.amps.manager.inter.AMPSLoadEventListener> implements xyz.adscope.amps.inner.AMPSAdBiddingListener, xyz.adscope.amps.inner.AMPSBaseAdAdapterListener {
    private final java.lang.String TAG;
    private xyz.adscope.amps.init.AMPSInitChannelAdapterConfig ampsInitChannelAdapterConfig;
    private xyz.adscope.amps.manager.inter.AMPSLoadEventListener ampsLoadEventListener;
    protected android.view.View currentViewGroup;
    private xyz.adscope.amps.control.dispatch.inter.IDispatcherInterface iDispatcherInterface;
    private xyz.adscope.amps.control.filter.inter.IFilterInterface iFilterInterface;
    private xyz.adscope.amps.control.bid.inter.IPriceComparatorInterface iPriceComparatorInterface;
    private boolean isAdClosed;
    private boolean isDispatchFloorAdSource;
    private boolean isFirstLoadAd;
    private boolean isHasLoadingSuccess;
    private boolean isRequestTimeout;
    private java.util.Map<java.lang.String, xyz.adscope.amps.base.AMPSBaseAdapter> loadAdResourceAdapters;
    private java.util.Map<java.lang.String, xyz.adscope.amps.model.config.response.AdSourceModel> loadAdResourceDatas;
    private xyz.adscope.amps.base.AMPSBaseAdapter mAMPSBaseAdapter;
    private xyz.adscope.amps.config.AMPSRequestParameters mAMPSRequestParameters;
    private int mAdAutoRefreshSwitch;
    private long mAdRequestTimeout;
    private int mAdRequestType;
    private int mAdSourceRequestTimeout;
    private xyz.adscope.amps.tool.task.AMPSManagerTask mAmpsManagerTask;
    private long mBidAdTimeout;
    private java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> mC2SAdSourceList;
    private android.content.Context mContext;
    private java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> mFloorAdSourceList;
    private long mFloorDelayTime;
    private java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> mS2SAdSourceList;
    private java.lang.String mSessionId;
    private int mSpaceAdStatus;
    private long mSpaceCachedOffersTimeout;
    private java.lang.String mSpaceId;
    private xyz.adscope.amps.model.config.response.SpaceModel mSpaceModel;
    private xyz.adscope.amps.model.config.response.AdSourceModel mWinAdSourceModel;
    private long mediationStartTime;





    public AMPSBaseOpenApiManager(android.content.Context r4, xyz.adscope.amps.config.AMPSRequestParameters r5, T r6) {
            r3 = this;
            r3.<init>()
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r3.TAG = r0
            r0 = 5000(0x1388, double:2.4703E-320)
            r3.mAdRequestTimeout = r0
            r2 = 5000(0x1388, float:7.006E-42)
            r3.mAdSourceRequestTimeout = r2
            r2 = 0
            r3.mAdRequestType = r2
            r3.mBidAdTimeout = r0
            r3.mFloorDelayTime = r0
            r0 = 0
            r3.mS2SAdSourceList = r0
            r3.mC2SAdSourceList = r0
            r3.mFloorAdSourceList = r0
            r3.mAdAutoRefreshSwitch = r2
            r3.mAmpsManagerTask = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.loadAdResourceDatas = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.loadAdResourceAdapters = r0
            r3.isHasLoadingSuccess = r2
            r3.isDispatchFloorAdSource = r2
            r3.isRequestTimeout = r2
            r3.mSpaceAdStatus = r2
            r0 = 1
            r3.isFirstLoadAd = r0
            r3.mContext = r4
            r3.mAMPSRequestParameters = r5
            r3.ampsLoadEventListener = r6
            xyz.adscope.amps.manager.AMPSAdSourceDataProvider r4 = xyz.adscope.amps.manager.AMPSAdSourceDataProvider.getInstance()
            xyz.adscope.amps.model.config.response.SpaceModel r4 = r4.buildDispatcherModel(r5)
            r3.mSpaceModel = r4
            if (r4 != 0) goto L53
            return
        L53:
            r3.initData()
            return
    }

    static /* synthetic */ xyz.adscope.amps.model.config.response.SpaceModel access$000(xyz.adscope.amps.manager.AMPSBaseOpenApiManager r0) {
            xyz.adscope.amps.model.config.response.SpaceModel r0 = r0.mSpaceModel
            return r0
    }

    static /* synthetic */ xyz.adscope.amps.model.config.response.SpaceModel access$002(xyz.adscope.amps.manager.AMPSBaseOpenApiManager r0, xyz.adscope.amps.model.config.response.SpaceModel r1) {
            r0.mSpaceModel = r1
            return r1
    }

    static /* synthetic */ xyz.adscope.amps.config.AMPSRequestParameters access$100(xyz.adscope.amps.manager.AMPSBaseOpenApiManager r0) {
            xyz.adscope.amps.config.AMPSRequestParameters r0 = r0.mAMPSRequestParameters
            return r0
    }

    static /* synthetic */ boolean access$1000(xyz.adscope.amps.manager.AMPSBaseOpenApiManager r0, java.lang.String r1) {
            boolean r0 = r0.isC2SOrS2SAdSource(r1)
            return r0
    }

    static /* synthetic */ xyz.adscope.amps.control.bid.inter.IPriceComparatorInterface access$1100(xyz.adscope.amps.manager.AMPSBaseOpenApiManager r0) {
            xyz.adscope.amps.control.bid.inter.IPriceComparatorInterface r0 = r0.iPriceComparatorInterface
            return r0
    }

    static /* synthetic */ void access$1200(xyz.adscope.amps.manager.AMPSBaseOpenApiManager r0, xyz.adscope.amps.model.config.response.AdSourceModel r1) {
            r0.callBackAdLoadSuccess(r1)
            return
    }

    static /* synthetic */ boolean access$1300(xyz.adscope.amps.manager.AMPSBaseOpenApiManager r0) {
            boolean r0 = r0.isHasLoadingSuccess
            return r0
    }

    static /* synthetic */ java.lang.String access$1400(xyz.adscope.amps.manager.AMPSBaseOpenApiManager r0) {
            java.lang.String r0 = r0.TAG
            return r0
    }

    static /* synthetic */ java.util.List access$1500(xyz.adscope.amps.manager.AMPSBaseOpenApiManager r0) {
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r0.mFloorAdSourceList
            return r0
    }

    static /* synthetic */ void access$1600(xyz.adscope.amps.manager.AMPSBaseOpenApiManager r0, java.util.List r1) {
            r0.dispatchAdSource(r1)
            return
    }

    static /* synthetic */ boolean access$200(xyz.adscope.amps.manager.AMPSBaseOpenApiManager r0) {
            boolean r0 = r0.isDispatchFloorAdSource
            return r0
    }

    static /* synthetic */ boolean access$202(xyz.adscope.amps.manager.AMPSBaseOpenApiManager r0, boolean r1) {
            r0.isDispatchFloorAdSource = r1
            return r1
    }

    static /* synthetic */ void access$300(xyz.adscope.amps.manager.AMPSBaseOpenApiManager r0, java.lang.String r1, java.lang.String r2) {
            r0.callBackAdLoadFail(r1, r2)
            return
    }

    static /* synthetic */ void access$400(xyz.adscope.amps.manager.AMPSBaseOpenApiManager r0) {
            r0.initData()
            return
    }

    static /* synthetic */ void access$500(xyz.adscope.amps.manager.AMPSBaseOpenApiManager r0) {
            r0.dispatchAdSourceByTimeOut()
            return
    }

    static /* synthetic */ boolean access$602(xyz.adscope.amps.manager.AMPSBaseOpenApiManager r0, boolean r1) {
            r0.isRequestTimeout = r1
            return r1
    }

    static /* synthetic */ xyz.adscope.amps.tool.task.AMPSManagerTask access$700(xyz.adscope.amps.manager.AMPSBaseOpenApiManager r0) {
            xyz.adscope.amps.tool.task.AMPSManagerTask r0 = r0.mAmpsManagerTask
            return r0
    }

    static /* synthetic */ xyz.adscope.amps.base.AMPSBaseAdapter access$800(xyz.adscope.amps.manager.AMPSBaseOpenApiManager r0) {
            xyz.adscope.amps.base.AMPSBaseAdapter r0 = r0.mAMPSBaseAdapter
            return r0
    }

    static /* synthetic */ java.util.Map access$900(xyz.adscope.amps.manager.AMPSBaseOpenApiManager r0) {
            java.util.Map<java.lang.String, xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r0.loadAdResourceDatas
            return r0
    }

    private void addFilterEvent(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L13
            if (r0 == 0) goto L7
            goto L13
        L7:
            xyz.adscope.amps.control.filter.inter.IFilterInterface r0 = r2.iFilterInterface     // Catch: java.lang.Exception -> L13
            if (r0 == 0) goto L13
            xyz.adscope.amps.model.frequency.AMPSFrequencyEventModel r1 = new xyz.adscope.amps.model.frequency.AMPSFrequencyEventModel     // Catch: java.lang.Exception -> L13
            r1.<init>(r3, r4)     // Catch: java.lang.Exception -> L13
            r0.addFilterEvent(r1)     // Catch: java.lang.Exception -> L13
        L13:
            return
    }

    private int calcLossECPM(xyz.adscope.amps.model.config.response.AdSourceModel r7) {
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            int r1 = r7.getEcpm()
            xyz.adscope.amps.model.config.response.AdSourceModel r2 = r6.mWinAdSourceModel
            if (r2 == 0) goto L10
            int r0 = r2.getEcpm()
        L10:
            if (r1 > 0) goto L13
            goto L2c
        L13:
            if (r0 > 0) goto L16
            goto L2d
        L16:
            double r2 = (double) r1
            r4 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r2 = r2 * r4
            double r4 = (double) r0
            double r2 = r2 / r4
            r4 = 1
            xyz.adscope.amps.model.config.response.AdSourceNoticeRuleModel r2 = r6.getAdSourceNoticeRule(r4, r7, r2)
            xyz.adscope.amps.model.config.response.AdSourceModel r3 = r6.mWinAdSourceModel
            int r7 = r6.calcLossNoticePrice(r2, r3, r7)
            if (r7 > r1) goto L2e
            if (r0 <= 0) goto L2d
        L2c:
            return r0
        L2d:
            return r1
        L2e:
            return r7
    }

    private int calcLossNoticePrice(xyz.adscope.amps.model.config.response.AdSourceNoticeRuleModel r10, xyz.adscope.amps.model.config.response.AdSourceModel r11, xyz.adscope.amps.model.config.response.AdSourceModel r12) {
            r9 = this;
            r0 = 0
            if (r12 != 0) goto L4
            return r0
        L4:
            int r12 = r12.getEcpm()     // Catch: java.lang.Exception -> L63
            if (r11 == 0) goto Lf
            int r11 = r11.getEcpm()     // Catch: java.lang.Exception -> L63
            goto L10
        Lf:
            r11 = 0
        L10:
            if (r10 != 0) goto L16
            if (r11 <= 0) goto L15
            goto L60
        L15:
            return r0
        L16:
            java.lang.String r1 = r10.getAdd()     // Catch: java.lang.Exception -> L63
            java.lang.String r2 = r10.getSubtract()     // Catch: java.lang.Exception -> L63
            java.lang.String r10 = r10.getRandom()     // Catch: java.lang.Exception -> L63
            boolean r3 = xyz.adscope.amps.tool.util.AMPSRegularUtil.isInteger(r1)     // Catch: java.lang.Exception -> L63
            if (r3 == 0) goto L2d
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Exception -> L63
            goto L2e
        L2d:
            r1 = 0
        L2e:
            boolean r3 = xyz.adscope.amps.tool.util.AMPSRegularUtil.isInteger(r2)     // Catch: java.lang.Exception -> L63
            if (r3 == 0) goto L39
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Exception -> L63
            goto L3a
        L39:
            r2 = 0
        L3a:
            boolean r3 = xyz.adscope.amps.tool.util.AMPSRegularUtil.isInteger(r10)     // Catch: java.lang.Exception -> L63
            if (r3 == 0) goto L45
            int r10 = java.lang.Integer.parseInt(r10)     // Catch: java.lang.Exception -> L63
            goto L46
        L45:
            r10 = 0
        L46:
            r3 = 100
            int r0 = xyz.adscope.amps.tool.util.AMPSRandomUtil.getNegativeToPositiveRandomNum(r3)     // Catch: java.lang.Exception -> L63
            double r3 = (double) r11
            int r1 = r1 - r2
            double r1 = (double) r1
            int r0 = r0 * r10
            double r5 = (double) r0
            r7 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r5 = r5 / r7
            double r1 = r1 + r5
            double r1 = r1 / r7
            double r5 = (double) r12
            double r1 = r1 * r5
            double r3 = r3 + r1
            int r10 = (int) r3
            if (r10 >= r12) goto L62
            if (r11 <= 0) goto L61
        L60:
            return r11
        L61:
            return r12
        L62:
            return r10
        L63:
            return r0
    }

    private int calcWinECPM(xyz.adscope.amps.model.config.response.AdSourceModel r8) {
            r7 = this;
            xyz.adscope.amps.model.config.response.AdSourceModel r0 = r7.mWinAdSourceModel
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r0.getEcpm()
            if (r8 == 0) goto L11
            int r2 = r8.getEcpm()
            goto L12
        L11:
            r2 = 0
        L12:
            if (r0 > 0) goto L15
            return r1
        L15:
            double r3 = (double) r2
            r5 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r3 = r3 * r5
            double r5 = (double) r0
            double r3 = r3 / r5
            xyz.adscope.amps.model.config.response.AdSourceModel r5 = r7.mWinAdSourceModel
            xyz.adscope.amps.model.config.response.AdSourceNoticeRuleModel r1 = r7.getAdSourceNoticeRule(r1, r5, r3)
            xyz.adscope.amps.model.config.response.AdSourceModel r3 = r7.mWinAdSourceModel
            int r8 = r7.calcWinNoticePrice(r1, r3, r8)
            if (r8 > 0) goto L30
            if (r2 <= 0) goto L2d
            return r2
        L2d:
            int r0 = r0 + (-1)
            return r0
        L30:
            return r8
    }

    private int calcWinNoticePrice(xyz.adscope.amps.model.config.response.AdSourceNoticeRuleModel r10, xyz.adscope.amps.model.config.response.AdSourceModel r11, xyz.adscope.amps.model.config.response.AdSourceModel r12) {
            r9 = this;
            r0 = 0
            if (r11 != 0) goto L4
            return r0
        L4:
            int r11 = r11.getEcpm()     // Catch: java.lang.Exception -> L6a
            if (r12 == 0) goto Lf
            int r12 = r12.getEcpm()     // Catch: java.lang.Exception -> L6a
            goto L10
        Lf:
            r12 = 0
        L10:
            if (r10 != 0) goto L18
            if (r12 <= 0) goto L15
            goto L66
        L15:
            int r11 = r11 + (-1)
            return r11
        L18:
            java.lang.String r1 = r10.getAdd()     // Catch: java.lang.Exception -> L6a
            java.lang.String r2 = r10.getSubtract()     // Catch: java.lang.Exception -> L6a
            java.lang.String r10 = r10.getRandom()     // Catch: java.lang.Exception -> L6a
            boolean r3 = xyz.adscope.amps.tool.util.AMPSRegularUtil.isInteger(r1)     // Catch: java.lang.Exception -> L6a
            if (r3 == 0) goto L2f
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Exception -> L6a
            goto L30
        L2f:
            r1 = 0
        L30:
            boolean r3 = xyz.adscope.amps.tool.util.AMPSRegularUtil.isInteger(r2)     // Catch: java.lang.Exception -> L6a
            if (r3 == 0) goto L3b
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Exception -> L6a
            goto L3c
        L3b:
            r2 = 0
        L3c:
            boolean r3 = xyz.adscope.amps.tool.util.AMPSRegularUtil.isInteger(r10)     // Catch: java.lang.Exception -> L6a
            if (r3 == 0) goto L47
            int r10 = java.lang.Integer.parseInt(r10)     // Catch: java.lang.Exception -> L6a
            goto L48
        L47:
            r10 = 0
        L48:
            r3 = 100
            int r0 = xyz.adscope.amps.tool.util.AMPSRandomUtil.getNegativeToPositiveRandomNum(r3)     // Catch: java.lang.Exception -> L6a
            double r3 = (double) r12
            int r1 = r1 - r2
            double r1 = (double) r1
            int r0 = r0 * r10
            double r5 = (double) r0
            r7 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r5 = r5 / r7
            double r1 = r1 + r5
            double r1 = r1 / r7
            double r5 = (double) r11
            double r1 = r1 * r5
            double r3 = r3 + r1
            int r10 = (int) r3
            if (r10 > r11) goto L64
            if (r10 >= 0) goto L63
            goto L64
        L63:
            return r10
        L64:
            if (r12 <= 0) goto L67
        L66:
            return r12
        L67:
            int r11 = r11 + (-1)
            return r11
        L6a:
            return r0
    }

    private void callBackAdLoadFail(java.lang.String r12, java.lang.String r13) {
            r11 = this;
            java.lang.String r0 = "amps_log_tag"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4a
            r1.<init>()     // Catch: java.lang.Exception -> L4a
            java.lang.String r2 = r11.TAG     // Catch: java.lang.Exception -> L4a
            r1.append(r2)     // Catch: java.lang.Exception -> L4a
            java.lang.String r2 = " callbackAdLoadFail code:"
            r1.append(r2)     // Catch: java.lang.Exception -> L4a
            r1.append(r12)     // Catch: java.lang.Exception -> L4a
            java.lang.String r2 = "; message:"
            r1.append(r2)     // Catch: java.lang.Exception -> L4a
            r1.append(r13)     // Catch: java.lang.Exception -> L4a
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L4a
            xyz.adscope.amps.tool.AMPSLogUtil.d(r0, r1)     // Catch: java.lang.Exception -> L4a
            boolean r1 = r11.isDispatchFloorAdSource     // Catch: java.lang.Exception -> L4a
            if (r1 != 0) goto L4d
            boolean r1 = r11.isRequestTimeout     // Catch: java.lang.Exception -> L4a
            if (r1 != 0) goto L4d
            r12 = 1
            r11.isDispatchFloorAdSource = r12     // Catch: java.lang.Exception -> L4a
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4a
            r12.<init>()     // Catch: java.lang.Exception -> L4a
            java.lang.String r13 = r11.TAG     // Catch: java.lang.Exception -> L4a
            r12.append(r13)     // Catch: java.lang.Exception -> L4a
            java.lang.String r13 = " callbackAdLoadFail 分发兜底广告源"
            r12.append(r13)     // Catch: java.lang.Exception -> L4a
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Exception -> L4a
            xyz.adscope.amps.tool.AMPSLogUtil.d(r0, r12)     // Catch: java.lang.Exception -> L4a
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r12 = r11.mFloorAdSourceList     // Catch: java.lang.Exception -> L4a
            r11.dispatchAdSource(r12)     // Catch: java.lang.Exception -> L4a
            return
        L4a:
            r4 = r11
            goto Lbc
        L4d:
            int r0 = r11.mSpaceAdStatus     // Catch: java.lang.Exception -> L4a
            r1 = 3
            if (r0 != r1) goto L53
            goto L4a
        L53:
            r11.mSpaceAdStatus = r1     // Catch: java.lang.Exception -> L4a
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L4a
            long r2 = r11.mediationStartTime     // Catch: java.lang.Exception -> L4a
            long r9 = r0 - r2
            xyz.adscope.amps.report.AMPSEventReportCode r6 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_MEDIATION_LOAD_FAIL_CODE     // Catch: java.lang.Exception -> L4a
            r5 = 0
            r4 = r11
            r7 = r12
            r8 = r13
            r4.uploadLog(r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> Lbc
            xyz.adscope.amps.manager.inter.AMPSLoadEventListener r12 = r4.ampsLoadEventListener     // Catch: java.lang.Exception -> Lbc
            if (r12 == 0) goto Lb6
            xyz.adscope.amps.common.AMPSError r12 = new xyz.adscope.amps.common.AMPSError     // Catch: java.lang.Exception -> Lbc
            r12.<init>(r7, r8)     // Catch: java.lang.Exception -> Lbc
            xyz.adscope.amps.manager.inter.AMPSLoadEventListener r13 = r4.ampsLoadEventListener     // Catch: java.lang.Exception -> Lbc
            boolean r0 = r13 instanceof xyz.adscope.amps.ad.splash.AMPSSplashLoadEventListener     // Catch: java.lang.Exception -> Lbc
            if (r0 == 0) goto L7b
            xyz.adscope.amps.ad.splash.AMPSSplashLoadEventListener r13 = (xyz.adscope.amps.ad.splash.AMPSSplashLoadEventListener) r13     // Catch: java.lang.Exception -> Lbc
            r13.onAmpsAdFailed(r12)     // Catch: java.lang.Exception -> Lbc
            goto Lb6
        L7b:
            boolean r0 = r13 instanceof xyz.adscope.amps.ad.nativead.AMPSNativeLoadEventListener     // Catch: java.lang.Exception -> Lbc
            if (r0 == 0) goto L85
            xyz.adscope.amps.ad.nativead.AMPSNativeLoadEventListener r13 = (xyz.adscope.amps.ad.nativead.AMPSNativeLoadEventListener) r13     // Catch: java.lang.Exception -> Lbc
            r13.onAmpsAdFailed(r12)     // Catch: java.lang.Exception -> Lbc
            goto Lb6
        L85:
            boolean r0 = r13 instanceof xyz.adscope.amps.ad.banner.AMPSBannerLoadEventListener     // Catch: java.lang.Exception -> Lbc
            if (r0 == 0) goto L8f
            xyz.adscope.amps.ad.banner.AMPSBannerLoadEventListener r13 = (xyz.adscope.amps.ad.banner.AMPSBannerLoadEventListener) r13     // Catch: java.lang.Exception -> Lbc
            r13.onAmpsAdFailed(r12)     // Catch: java.lang.Exception -> Lbc
            goto Lb6
        L8f:
            boolean r0 = r13 instanceof xyz.adscope.amps.ad.interstitial.AMPSInterstitialLoadEventListener     // Catch: java.lang.Exception -> Lbc
            if (r0 == 0) goto L99
            xyz.adscope.amps.ad.interstitial.AMPSInterstitialLoadEventListener r13 = (xyz.adscope.amps.ad.interstitial.AMPSInterstitialLoadEventListener) r13     // Catch: java.lang.Exception -> Lbc
            r13.onAmpsAdFailed(r12)     // Catch: java.lang.Exception -> Lbc
            goto Lb6
        L99:
            boolean r0 = r13 instanceof xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener     // Catch: java.lang.Exception -> Lbc
            if (r0 == 0) goto La3
            xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener r13 = (xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener) r13     // Catch: java.lang.Exception -> Lbc
            r13.onAmpsAdFailed(r12)     // Catch: java.lang.Exception -> Lbc
            goto Lb6
        La3:
            boolean r0 = r13 instanceof xyz.adscope.amps.ad.unified.AMPSUnifiedNativeLoadEventListener     // Catch: java.lang.Exception -> Lbc
            if (r0 == 0) goto Lad
            xyz.adscope.amps.ad.unified.AMPSUnifiedNativeLoadEventListener r13 = (xyz.adscope.amps.ad.unified.AMPSUnifiedNativeLoadEventListener) r13     // Catch: java.lang.Exception -> Lbc
            r13.onAmpsAdFailed(r12)     // Catch: java.lang.Exception -> Lbc
            goto Lb6
        Lad:
            boolean r0 = r13 instanceof xyz.adscope.amps.ad.draw.AMPSDrawLoadEventListener     // Catch: java.lang.Exception -> Lbc
            if (r0 == 0) goto Lb6
            xyz.adscope.amps.ad.draw.AMPSDrawLoadEventListener r13 = (xyz.adscope.amps.ad.draw.AMPSDrawLoadEventListener) r13     // Catch: java.lang.Exception -> Lbc
            r13.onAmpsAdFailed(r12)     // Catch: java.lang.Exception -> Lbc
        Lb6:
            r11.sendLosNoticeByFail()     // Catch: java.lang.Exception -> Lbc
            r11.destroy()     // Catch: java.lang.Exception -> Lbc
        Lbc:
            return
    }

    private void callBackAdLoadSuccess(xyz.adscope.amps.model.config.response.AdSourceModel r11) {
            r10 = this;
            if (r11 == 0) goto L203
            xyz.adscope.amps.base.AMPSBaseAdapter r2 = r10.mAMPSBaseAdapter     // Catch: java.lang.Exception -> L203
            if (r2 != 0) goto L203
            int r2 = r10.mSpaceAdStatus     // Catch: java.lang.Exception -> L203
            r7 = 1
            if (r2 < r7) goto Ld
            goto L203
        Ld:
            java.lang.String r8 = r11.getSpaceId()     // Catch: java.lang.Exception -> L203
            boolean r2 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Exception -> L203
            if (r2 == 0) goto L19
            goto L203
        L19:
            r10.mWinAdSourceModel = r11     // Catch: java.lang.Exception -> L203
            java.util.Map<java.lang.String, xyz.adscope.amps.base.AMPSBaseAdapter> r2 = r10.loadAdResourceAdapters     // Catch: java.lang.Exception -> L203
            boolean r2 = r2.containsKey(r8)     // Catch: java.lang.Exception -> L203
            if (r2 == 0) goto L2d
            java.util.Map<java.lang.String, xyz.adscope.amps.base.AMPSBaseAdapter> r2 = r10.loadAdResourceAdapters     // Catch: java.lang.Exception -> L203
            java.lang.Object r2 = r2.get(r8)     // Catch: java.lang.Exception -> L203
            xyz.adscope.amps.base.AMPSBaseAdapter r2 = (xyz.adscope.amps.base.AMPSBaseAdapter) r2     // Catch: java.lang.Exception -> L203
            r10.mAMPSBaseAdapter = r2     // Catch: java.lang.Exception -> L203
        L2d:
            xyz.adscope.amps.base.AMPSBaseAdapter r2 = r10.mAMPSBaseAdapter     // Catch: java.lang.Exception -> L203
            if (r2 == 0) goto L203
            xyz.adscope.amps.manager.inter.AMPSLoadEventListener r2 = r10.ampsLoadEventListener     // Catch: java.lang.Exception -> L203
            if (r2 != 0) goto L37
            goto L203
        L37:
            r10.mSpaceAdStatus = r7     // Catch: java.lang.Exception -> L203
            r2 = 3
            r11.setAdComparePriceStatus(r2)     // Catch: java.lang.Exception -> L203
            r10.updateAdSourceECPM(r11)     // Catch: java.lang.Exception -> L203
            int r2 = r11.getEcpm()     // Catch: java.lang.Exception -> L203
            r11.setReportEcpm(r2)     // Catch: java.lang.Exception -> L203
            java.lang.String r2 = "WF"
            java.lang.String r3 = r11.getBiddingType()     // Catch: java.lang.Exception -> L203
            boolean r2 = r2.equalsIgnoreCase(r3)     // Catch: java.lang.Exception -> L203
            if (r2 != 0) goto Lbb
            xyz.adscope.amps.model.config.response.AdSourceModel r2 = r10.getSecondAdSourceModel()     // Catch: java.lang.Exception -> L203
            xyz.adscope.amps.base.AMPSBidResult r3 = new xyz.adscope.amps.base.AMPSBidResult     // Catch: java.lang.Exception -> L203
            r3.<init>()     // Catch: java.lang.Exception -> L203
            int r4 = r10.calcWinECPM(r2)     // Catch: java.lang.Exception -> L203
            r3.setEcpm(r4)     // Catch: java.lang.Exception -> L203
            java.lang.String r5 = r11.getSeatId()     // Catch: java.lang.Exception -> L203
            r3.setChannelName(r5)     // Catch: java.lang.Exception -> L203
            java.lang.String r5 = r11.getBiddingType()     // Catch: java.lang.Exception -> L203
            r3.setBidType(r5)     // Catch: java.lang.Exception -> L203
            xyz.adscope.amps.model.config.response.AdSourceModel r5 = r10.mWinAdSourceModel     // Catch: java.lang.Exception -> L203
            int r5 = r5.getEcpm()     // Catch: java.lang.Exception -> L203
            r3.setWinPrice(r5)     // Catch: java.lang.Exception -> L203
            xyz.adscope.amps.base.AMPSBaseAdapter r5 = r10.mAMPSBaseAdapter     // Catch: java.lang.Exception -> L203
            r5.sendWinNotice(r3)     // Catch: java.lang.Exception -> L203
            java.lang.String r3 = java.lang.String.valueOf(r4)     // Catch: java.lang.Exception -> L203
            r11.setNoticePrice(r3)     // Catch: java.lang.Exception -> L203
            if (r2 == 0) goto Lae
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L203
            r3.<init>()     // Catch: java.lang.Exception -> L203
            int r4 = r2.getEcpm()     // Catch: java.lang.Exception -> L203
            r3.append(r4)     // Catch: java.lang.Exception -> L203
            java.lang.String r4 = ""
            r3.append(r4)     // Catch: java.lang.Exception -> L203
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L203
            r11.setRealPrice(r3)     // Catch: java.lang.Exception -> L203
            java.lang.String r3 = r2.getSeatId()     // Catch: java.lang.Exception -> L203
            r11.setBidSeatId(r3)     // Catch: java.lang.Exception -> L203
            java.lang.String r2 = r2.getSpaceId()     // Catch: java.lang.Exception -> L203
            r11.setBidSpaceId(r2)     // Catch: java.lang.Exception -> L203
        Lae:
            xyz.adscope.amps.report.AMPSEventReportCode r2 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_ADSOURCE_LOAD_WIN_CODE     // Catch: java.lang.Exception -> L203
            java.lang.String r3 = ""
            java.lang.String r4 = ""
            r5 = 0
            r0 = r10
            r1 = r11
            r0.uploadLog(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L203
        Lbb:
            xyz.adscope.amps.report.AMPSEventReportCode r2 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_ADSOURCE_COMPARISON_SUCCESS_CODE     // Catch: java.lang.Exception -> L203
            java.lang.String r3 = ""
            java.lang.String r4 = ""
            r5 = 0
            r0 = r10
            r1 = r11
            r0.uploadLog(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L203
            java.util.Map<java.lang.String, xyz.adscope.amps.model.config.response.AdSourceModel> r1 = r10.loadAdResourceDatas     // Catch: java.lang.Exception -> L203
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Exception -> L203
            java.util.Iterator r9 = r1.iterator()     // Catch: java.lang.Exception -> L203
        Ld2:
            boolean r1 = r9.hasNext()     // Catch: java.lang.Exception -> L203
            if (r1 == 0) goto L108
            java.lang.Object r1 = r9.next()     // Catch: java.lang.Exception -> L203
            xyz.adscope.amps.model.config.response.AdSourceModel r1 = (xyz.adscope.amps.model.config.response.AdSourceModel) r1     // Catch: java.lang.Exception -> L203
            if (r1 != 0) goto Le1
            goto Ld2
        Le1:
            int r2 = r1.getAdStatus()     // Catch: java.lang.Exception -> L203
            r3 = 5
            if (r2 == r3) goto Le9
            goto Ld2
        Le9:
            int r2 = r1.getAdComparePriceStatus()     // Catch: java.lang.Exception -> L203
            if (r2 == r7) goto Lf0
            goto Ld2
        Lf0:
            r2 = 4
            r1.setAdComparePriceStatus(r2)     // Catch: java.lang.Exception -> L203
            xyz.adscope.amps.report.AMPSEventReportCode r2 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_ADSOURCE_COMPARISON_FAIL_CODE     // Catch: java.lang.Exception -> L203
            xyz.adscope.amps.common.AMPSErrorCode$ReportLogErrorEnum r3 = xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum.REPORT_LOG_ADSOURCE_COMPARISON_FAIL     // Catch: java.lang.Exception -> L203
            r4 = r3
            java.lang.String r3 = r4.getErrorCode()     // Catch: java.lang.Exception -> L203
            java.lang.String r4 = r4.getErrorMsg()     // Catch: java.lang.Exception -> L203
            r5 = 0
            r0 = r10
            r0.uploadLog(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L203
            goto Ld2
        L108:
            java.lang.String r1 = "amps_log_tag"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L203
            r2.<init>()     // Catch: java.lang.Exception -> L203
            java.lang.String r3 = r10.TAG     // Catch: java.lang.Exception -> L203
            r2.append(r3)     // Catch: java.lang.Exception -> L203
            java.lang.String r3 = " callBackAdLoadSuccess winAdSource:"
            r2.append(r3)     // Catch: java.lang.Exception -> L203
            r2.append(r8)     // Catch: java.lang.Exception -> L203
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L203
            xyz.adscope.amps.tool.AMPSLogUtil.d(r1, r2)     // Catch: java.lang.Exception -> L203
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L203
            long r3 = r10.mediationStartTime     // Catch: java.lang.Exception -> L203
            long r5 = r1 - r3
            xyz.adscope.amps.report.AMPSEventReportCode r2 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_MEDIATION_LOAD_SUCCESS_CODE     // Catch: java.lang.Exception -> L203
            java.lang.String r3 = ""
            java.lang.String r4 = ""
            r1 = 0
            r0 = r10
            r0.uploadLog(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L203
            xyz.adscope.amps.manager.inter.AMPSLoadEventListener r1 = r10.ampsLoadEventListener     // Catch: java.lang.Exception -> L203
            boolean r2 = r1 instanceof xyz.adscope.amps.ad.splash.AMPSSplashLoadEventListener     // Catch: java.lang.Exception -> L203
            if (r2 == 0) goto L143
            xyz.adscope.amps.ad.splash.AMPSSplashLoadEventListener r1 = (xyz.adscope.amps.ad.splash.AMPSSplashLoadEventListener) r1     // Catch: java.lang.Exception -> L203
            r1.onAmpsAdLoaded()     // Catch: java.lang.Exception -> L203
            goto L1ae
        L143:
            boolean r2 = r1 instanceof xyz.adscope.amps.ad.nativead.AMPSNativeLoadEventListener     // Catch: java.lang.Exception -> L203
            if (r2 == 0) goto L159
            xyz.adscope.amps.base.AMPSBaseAdapter r2 = r10.mAMPSBaseAdapter     // Catch: java.lang.Exception -> L203
            boolean r3 = r2 instanceof xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdapter     // Catch: java.lang.Exception -> L203
            if (r3 == 0) goto L1ae
            xyz.adscope.amps.ad.nativead.AMPSNativeLoadEventListener r1 = (xyz.adscope.amps.ad.nativead.AMPSNativeLoadEventListener) r1     // Catch: java.lang.Exception -> L203
            xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdapter r2 = (xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdapter) r2     // Catch: java.lang.Exception -> L203
            java.util.List r2 = r2.getNativeListInfo()     // Catch: java.lang.Exception -> L203
            r1.onAmpsAdLoad(r2)     // Catch: java.lang.Exception -> L203
            goto L1ae
        L159:
            boolean r2 = r1 instanceof xyz.adscope.amps.ad.unified.AMPSUnifiedNativeLoadEventListener     // Catch: java.lang.Exception -> L203
            if (r2 == 0) goto L17f
            xyz.adscope.amps.base.AMPSBaseAdapter r2 = r10.mAMPSBaseAdapter     // Catch: java.lang.Exception -> L203
            boolean r3 = r2 instanceof xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter     // Catch: java.lang.Exception -> L203
            if (r3 == 0) goto L16f
            xyz.adscope.amps.ad.unified.AMPSUnifiedNativeLoadEventListener r1 = (xyz.adscope.amps.ad.unified.AMPSUnifiedNativeLoadEventListener) r1     // Catch: java.lang.Exception -> L203
            xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter r2 = (xyz.adscope.amps.ad.unified.adapter.AMPSUnifiedNativeAdapter) r2     // Catch: java.lang.Exception -> L203
            java.util.List r2 = r2.getNativeListInfo()     // Catch: java.lang.Exception -> L203
            r1.onAmpsAdLoad(r2)     // Catch: java.lang.Exception -> L203
            goto L1ae
        L16f:
            boolean r3 = r2 instanceof xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdapter     // Catch: java.lang.Exception -> L203
            if (r3 == 0) goto L1ae
            xyz.adscope.amps.ad.unified.AMPSUnifiedNativeLoadEventListener r1 = (xyz.adscope.amps.ad.unified.AMPSUnifiedNativeLoadEventListener) r1     // Catch: java.lang.Exception -> L203
            xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdapter r2 = (xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdapter) r2     // Catch: java.lang.Exception -> L203
            java.util.List r2 = r2.getNativeExpressListInfo()     // Catch: java.lang.Exception -> L203
            r1.onAmpsAdLoad(r2)     // Catch: java.lang.Exception -> L203
            goto L1ae
        L17f:
            boolean r2 = r1 instanceof xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener     // Catch: java.lang.Exception -> L203
            if (r2 == 0) goto L189
            xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener r1 = (xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener) r1     // Catch: java.lang.Exception -> L203
            r1.onAmpsAdLoad()     // Catch: java.lang.Exception -> L203
            goto L1ae
        L189:
            boolean r2 = r1 instanceof xyz.adscope.amps.ad.interstitial.AMPSInterstitialLoadEventListener     // Catch: java.lang.Exception -> L203
            if (r2 == 0) goto L193
            xyz.adscope.amps.ad.interstitial.AMPSInterstitialLoadEventListener r1 = (xyz.adscope.amps.ad.interstitial.AMPSInterstitialLoadEventListener) r1     // Catch: java.lang.Exception -> L203
            r1.onAmpsAdLoaded()     // Catch: java.lang.Exception -> L203
            goto L1ae
        L193:
            boolean r2 = r1 instanceof xyz.adscope.amps.ad.banner.AMPSBannerLoadEventListener     // Catch: java.lang.Exception -> L203
            if (r2 == 0) goto L19d
            xyz.adscope.amps.ad.banner.AMPSBannerLoadEventListener r1 = (xyz.adscope.amps.ad.banner.AMPSBannerLoadEventListener) r1     // Catch: java.lang.Exception -> L203
            r1.onAmpsAdLoaded()     // Catch: java.lang.Exception -> L203
            goto L1ae
        L19d:
            boolean r2 = r1 instanceof xyz.adscope.amps.ad.draw.AMPSDrawLoadEventListener     // Catch: java.lang.Exception -> L203
            if (r2 == 0) goto L1ae
            xyz.adscope.amps.ad.draw.AMPSDrawLoadEventListener r1 = (xyz.adscope.amps.ad.draw.AMPSDrawLoadEventListener) r1     // Catch: java.lang.Exception -> L203
            xyz.adscope.amps.base.AMPSBaseAdapter r2 = r10.mAMPSBaseAdapter     // Catch: java.lang.Exception -> L203
            xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapter r2 = (xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapter) r2     // Catch: java.lang.Exception -> L203
            java.util.List r2 = r2.getDrawListInfo()     // Catch: java.lang.Exception -> L203
            r1.onAmpsAdLoad(r2)     // Catch: java.lang.Exception -> L203
        L1ae:
            r10.startCacheLoadSuccessAdSource()     // Catch: java.lang.Exception -> L203
            r10.removeCacheAdSource(r8)     // Catch: java.lang.Exception -> L203
            r10.sendLosNotice()     // Catch: java.lang.Exception -> L203
            xyz.adscope.amps.tool.task.AMPSManagerTask r1 = r10.mAmpsManagerTask     // Catch: java.lang.Exception -> L203
            if (r1 == 0) goto L1cb
            r1.cancelBiddingTimerTask()     // Catch: java.lang.Exception -> L203
            xyz.adscope.amps.tool.task.AMPSManagerTask r1 = r10.mAmpsManagerTask     // Catch: java.lang.Exception -> L203
            r1.cancelDispatchFloorAdSourceTimerTask()     // Catch: java.lang.Exception -> L203
            xyz.adscope.amps.tool.task.AMPSManagerTask r1 = r10.mAmpsManagerTask     // Catch: java.lang.Exception -> L203
            r1.cancelRequestedTimerTask()     // Catch: java.lang.Exception -> L203
            r1 = 0
            r10.mAmpsManagerTask = r1     // Catch: java.lang.Exception -> L203
        L1cb:
            xyz.adscope.amps.manager.inter.AMPSLoadEventListener r1 = r10.ampsLoadEventListener     // Catch: java.lang.Exception -> L203
            boolean r1 = r1 instanceof xyz.adscope.amps.ad.banner.AMPSBannerLoadEventListener     // Catch: java.lang.Exception -> L203
            if (r1 == 0) goto L203
            java.util.Map<java.lang.String, xyz.adscope.amps.base.AMPSBaseAdapter> r1 = r10.loadAdResourceAdapters     // Catch: java.lang.Exception -> L203
            if (r1 == 0) goto L203
            int r1 = r1.size()     // Catch: java.lang.Exception -> L203
            if (r1 <= 0) goto L203
            java.util.Map<java.lang.String, xyz.adscope.amps.base.AMPSBaseAdapter> r1 = r10.loadAdResourceAdapters     // Catch: java.lang.Exception -> L203
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Exception -> L203
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L203
        L1e5:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> L203
            if (r2 == 0) goto L203
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Exception -> L203
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Exception -> L203
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Exception -> L203
            xyz.adscope.amps.base.AMPSBaseAdapter r2 = (xyz.adscope.amps.base.AMPSBaseAdapter) r2     // Catch: java.lang.Exception -> L203
            if (r2 == 0) goto L1e5
            boolean r3 = r10.isWinAdSource(r2)     // Catch: java.lang.Exception -> L203
            if (r3 != 0) goto L1e5
            r2.destroy()     // Catch: java.lang.Exception -> L203
            goto L1e5
        L203:
            return
    }

    private void comparePrice(xyz.adscope.amps.base.AMPSBaseAdapter r10, xyz.adscope.amps.model.config.response.AdSourceModel r11) {
            r9 = this;
            xyz.adscope.amps.control.bid.inter.IPriceComparatorInterface r1 = r9.iPriceComparatorInterface     // Catch: java.lang.Exception -> La5
            if (r1 == 0) goto La5
            if (r11 != 0) goto L8
            goto La5
        L8:
            java.lang.String r1 = r11.getSpaceId()     // Catch: java.lang.Exception -> La5
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> La5
            if (r1 == 0) goto L14
            goto La5
        L14:
            xyz.adscope.amps.report.AMPSEventReportCode r2 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_ADSOURCE_COMPARISON_CODE     // Catch: java.lang.Exception -> La5
            java.lang.String r3 = ""
            java.lang.String r4 = ""
            r5 = 0
            r0 = r9
            r1 = r11
            r0.uploadLog(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> La5
            xyz.adscope.amps.control.bid.inter.IPriceComparatorInterface r2 = r9.iPriceComparatorInterface     // Catch: java.lang.Exception -> La5
            int r7 = r2.getComparePriceResult(r11)     // Catch: java.lang.Exception -> La5
            java.lang.String r2 = "amps_log_tag"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La5
            r3.<init>()     // Catch: java.lang.Exception -> La5
            java.lang.String r4 = "comparePrice channel:"
            r3.append(r4)     // Catch: java.lang.Exception -> La5
            java.lang.String r4 = r11.getSeatId()     // Catch: java.lang.Exception -> La5
            r3.append(r4)     // Catch: java.lang.Exception -> La5
            java.lang.String r4 = ",spaceId:"
            r3.append(r4)     // Catch: java.lang.Exception -> La5
            java.lang.String r4 = r11.getSpaceId()     // Catch: java.lang.Exception -> La5
            r3.append(r4)     // Catch: java.lang.Exception -> La5
            java.lang.String r4 = ",comparePriceResult:"
            r3.append(r4)     // Catch: java.lang.Exception -> La5
            r3.append(r7)     // Catch: java.lang.Exception -> La5
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> La5
            xyz.adscope.amps.tool.AMPSLogUtil.d(r2, r3)     // Catch: java.lang.Exception -> La5
            r11.setAdComparePriceStatus(r7)     // Catch: java.lang.Exception -> La5
            r8 = 1
            if (r7 != r8) goto L69
            xyz.adscope.amps.report.AMPSEventReportCode r2 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_ADSOURCE_COMPARISON_WAIT_CODE     // Catch: java.lang.Exception -> La5
            java.lang.String r3 = ""
            java.lang.String r4 = ""
            r5 = 0
            r0 = r9
            r1 = r11
            r0.uploadLog(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> La5
            goto L7f
        L69:
            r0 = 4
            if (r7 != r0) goto L7f
            xyz.adscope.amps.report.AMPSEventReportCode r2 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_ADSOURCE_COMPARISON_FAIL_CODE     // Catch: java.lang.Exception -> La5
            xyz.adscope.amps.common.AMPSErrorCode$ReportLogErrorEnum r0 = xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum.REPORT_LOG_ADSOURCE_COMPARISON_FAIL     // Catch: java.lang.Exception -> La5
            java.lang.String r3 = r0.getErrorCode()     // Catch: java.lang.Exception -> La5
            java.lang.String r4 = r0.getErrorMsg()     // Catch: java.lang.Exception -> La5
            r5 = 0
            r0 = r9
            r1 = r11
            r0.uploadLog(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> La5
        L7f:
            r2 = 3
            if (r7 != r2) goto L86
            r9.callBackAdLoadSuccess(r11)     // Catch: java.lang.Exception -> La5
            return
        L86:
            int r2 = r9.mAdRequestType     // Catch: java.lang.Exception -> La5
            if (r2 == r8) goto La2
            int r2 = r11.getIsFloor()     // Catch: java.lang.Exception -> La5
            if (r2 != r8) goto L91
            goto La2
        L91:
            java.lang.String r2 = r11.getBiddingType()     // Catch: java.lang.Exception -> La5
            boolean r2 = r9.isC2SOrS2SAdSource(r2)     // Catch: java.lang.Exception -> La5
            if (r2 == 0) goto L9e
            r9.dispatchAdSourceByChannelResult(r11)     // Catch: java.lang.Exception -> La5
        L9e:
            r9.handleCallbackAdSourceLoadResult()     // Catch: java.lang.Exception -> La5
            return
        La2:
            r9.handleCallbackAdSourceLoadResult()     // Catch: java.lang.Exception -> La5
        La5:
            return
    }

    private void createAMPSInitCustomAdapterConfig() {
            r3 = this;
            xyz.adscope.amps.init.AMPSInitChannelAdapterConfig r0 = r3.ampsInitChannelAdapterConfig     // Catch: java.lang.Exception -> L54
            if (r0 != 0) goto Lb
            xyz.adscope.amps.init.AMPSInitChannelAdapterConfig r0 = new xyz.adscope.amps.init.AMPSInitChannelAdapterConfig     // Catch: java.lang.Exception -> L54
            r0.<init>()     // Catch: java.lang.Exception -> L54
            r3.ampsInitChannelAdapterConfig = r0     // Catch: java.lang.Exception -> L54
        Lb:
            xyz.adscope.amps.manager.AMPSSDKManager r0 = xyz.adscope.amps.manager.AMPSSDKManager.getInstance()     // Catch: java.lang.Exception -> L54
            xyz.adscope.amps.init.AMPSInitConfig r0 = r0.getAMPSAdConfig()     // Catch: java.lang.Exception -> L54
            if (r0 == 0) goto L54
            xyz.adscope.amps.init.AMPSInitChannelAdapterConfig r1 = r3.ampsInitChannelAdapterConfig     // Catch: java.lang.Exception -> L54
            java.lang.String r2 = r0.getAppName()     // Catch: java.lang.Exception -> L54
            r1.setAppName(r2)     // Catch: java.lang.Exception -> L54
            xyz.adscope.amps.init.AMPSInitChannelAdapterConfig r1 = r3.ampsInitChannelAdapterConfig     // Catch: java.lang.Exception -> L54
            xyz.adscope.amps.config.AMPSPrivacyConfig r2 = r0.getPrivacyConfig()     // Catch: java.lang.Exception -> L54
            r1.setPrivacyConfig(r2)     // Catch: java.lang.Exception -> L54
            xyz.adscope.amps.init.AMPSInitChannelAdapterConfig r1 = r3.ampsInitChannelAdapterConfig     // Catch: java.lang.Exception -> L54
            boolean r2 = r0.isPersonalRecommend()     // Catch: java.lang.Exception -> L54
            r1.setPersonalRecommend(r2)     // Catch: java.lang.Exception -> L54
            xyz.adscope.amps.init.AMPSInitChannelAdapterConfig r1 = r3.ampsInitChannelAdapterConfig     // Catch: java.lang.Exception -> L54
            boolean r2 = r0.isDebug()     // Catch: java.lang.Exception -> L54
            r1.setDebug(r2)     // Catch: java.lang.Exception -> L54
            xyz.adscope.amps.init.AMPSInitChannelAdapterConfig r1 = r3.ampsInitChannelAdapterConfig     // Catch: java.lang.Exception -> L54
            java.lang.String r2 = r0.getUserId()     // Catch: java.lang.Exception -> L54
            r1.setUserId(r2)     // Catch: java.lang.Exception -> L54
            xyz.adscope.amps.init.AMPSInitChannelAdapterConfig r1 = r3.ampsInitChannelAdapterConfig     // Catch: java.lang.Exception -> L54
            java.lang.String r2 = r0.getCustomOAID()     // Catch: java.lang.Exception -> L54
            r1.setCustomOAID(r2)     // Catch: java.lang.Exception -> L54
            xyz.adscope.amps.init.AMPSInitChannelAdapterConfig r1 = r3.ampsInitChannelAdapterConfig     // Catch: java.lang.Exception -> L54
            java.util.Map r0 = r0.getLocalExtraMap()     // Catch: java.lang.Exception -> L54
            r1.setLocalExtraMap(r0)     // Catch: java.lang.Exception -> L54
        L54:
            return
    }

    private void dispatchAdSource(java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r10) {
            r9 = this;
            java.lang.String r0 = "amps_log_tag"
            if (r10 == 0) goto La
            int r1 = r10.size()     // Catch: java.lang.Exception -> L34
            if (r1 != 0) goto Ld
        La:
            r2 = r9
            goto Lb4
        Ld:
            java.util.Iterator r1 = r10.iterator()     // Catch: java.lang.Exception -> L34
        L11:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> L34
            if (r2 == 0) goto L37
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Exception -> L34
            xyz.adscope.amps.model.config.response.AdSourceModel r2 = (xyz.adscope.amps.model.config.response.AdSourceModel) r2     // Catch: java.lang.Exception -> L34
            if (r2 == 0) goto L11
            java.lang.String r3 = r2.getSpaceId()     // Catch: java.lang.Exception -> L34
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L34
            if (r3 == 0) goto L2a
            goto L11
        L2a:
            java.util.Map<java.lang.String, xyz.adscope.amps.model.config.response.AdSourceModel> r3 = r9.loadAdResourceDatas     // Catch: java.lang.Exception -> L34
            java.lang.String r4 = r2.getSpaceId()     // Catch: java.lang.Exception -> L34
            r3.put(r4, r2)     // Catch: java.lang.Exception -> L34
            goto L11
        L34:
            r2 = r9
            goto Lcd
        L37:
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Exception -> L34
        L3b:
            boolean r1 = r10.hasNext()     // Catch: java.lang.Exception -> L34
            if (r1 == 0) goto L34
            java.lang.Object r1 = r10.next()     // Catch: java.lang.Exception -> L34
            r3 = r1
            xyz.adscope.amps.model.config.response.AdSourceModel r3 = (xyz.adscope.amps.model.config.response.AdSourceModel) r3     // Catch: java.lang.Exception -> L34
            if (r3 == 0) goto Lb2
            java.lang.String r1 = r3.getSpaceId()     // Catch: java.lang.Exception -> L34
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L34
            if (r1 == 0) goto L55
            goto L3b
        L55:
            xyz.adscope.amps.report.AMPSEventReportCode r4 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_ADSOURCE_FILTER_CODE     // Catch: java.lang.Exception -> L34
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            r7 = 0
            r2 = r9
            r2.uploadLog(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> Lcd
            xyz.adscope.amps.control.filter.inter.IFilterInterface r1 = r2.iFilterInterface     // Catch: java.lang.Exception -> Lcd
            if (r1 == 0) goto L6a
            boolean r1 = r1.channelFilter(r3)     // Catch: java.lang.Exception -> Lcd
            goto L6b
        L6a:
            r1 = 0
        L6b:
            if (r1 == 0) goto L7c
            xyz.adscope.amps.report.AMPSEventReportCode r4 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_ADSOURCE_FILTER_SUCCESS_CODE     // Catch: java.lang.Exception -> Lcd
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            r7 = 0
            r2.uploadLog(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> Lcd
            r9.starLoadAdResource(r3)     // Catch: java.lang.Exception -> Lcd
            goto L3b
        L7c:
            xyz.adscope.amps.report.AMPSEventReportCode r4 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_ADSOURCE_FILTER_FAIL_CODE     // Catch: java.lang.Exception -> Lcd
            xyz.adscope.amps.common.AMPSErrorCode$ReportLogErrorEnum r1 = xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum.REPORT_LOG_ADSOURCE_FILTER_FAIL     // Catch: java.lang.Exception -> Lcd
            java.lang.String r5 = r1.getErrorCode()     // Catch: java.lang.Exception -> Lcd
            java.lang.String r6 = r1.getErrorMsg()     // Catch: java.lang.Exception -> Lcd
            r7 = 0
            r2.uploadLog(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> Lcd
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lcd
            r1.<init>()     // Catch: java.lang.Exception -> Lcd
            java.lang.String r4 = r2.TAG     // Catch: java.lang.Exception -> Lcd
            r1.append(r4)     // Catch: java.lang.Exception -> Lcd
            java.lang.String r4 = " filter not pass spaceId:"
            r1.append(r4)     // Catch: java.lang.Exception -> Lcd
            java.lang.String r4 = r3.getSpaceId()     // Catch: java.lang.Exception -> Lcd
            r1.append(r4)     // Catch: java.lang.Exception -> Lcd
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> Lcd
            xyz.adscope.amps.tool.AMPSLogUtil.d(r0, r1)     // Catch: java.lang.Exception -> Lcd
            r1 = 6
            r3.setAdStatus(r1)     // Catch: java.lang.Exception -> Lcd
            r9.dispatchAdSourceByChannelResult(r3)     // Catch: java.lang.Exception -> Lcd
            goto L3b
        Lb2:
            r2 = r9
            goto L3b
        Lb4:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lcd
            r10.<init>()     // Catch: java.lang.Exception -> Lcd
            java.lang.String r1 = r2.TAG     // Catch: java.lang.Exception -> Lcd
            r10.append(r1)     // Catch: java.lang.Exception -> Lcd
            java.lang.String r1 = " dispatchAdSource is null:"
            r10.append(r1)     // Catch: java.lang.Exception -> Lcd
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Exception -> Lcd
            xyz.adscope.amps.tool.AMPSLogUtil.d(r0, r10)     // Catch: java.lang.Exception -> Lcd
            r9.handleCallbackAdSourceLoadResult()     // Catch: java.lang.Exception -> Lcd
        Lcd:
            return
    }

    private void dispatchAdSourceByChannelResult(xyz.adscope.amps.model.config.response.AdSourceModel r2) {
            r1 = this;
            xyz.adscope.amps.control.dispatch.inter.IDispatcherInterface r0 = r1.iDispatcherInterface     // Catch: java.lang.Exception -> Lc
            if (r0 != 0) goto L5
            goto Lc
        L5:
            java.util.List r2 = r0.dispatch(r2)     // Catch: java.lang.Exception -> Lc
            r1.dispatchAdSource(r2)     // Catch: java.lang.Exception -> Lc
        Lc:
            return
    }

    private void dispatchAdSourceByFloor() {
            r4 = this;
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r4.mFloorAdSourceList     // Catch: java.lang.Exception -> L19
            if (r0 == 0) goto L19
            int r0 = r0.size()     // Catch: java.lang.Exception -> L19
            if (r0 == 0) goto L19
            xyz.adscope.amps.tool.task.AMPSManagerTask r0 = r4.mAmpsManagerTask     // Catch: java.lang.Exception -> L19
            if (r0 != 0) goto Lf
            goto L19
        Lf:
            long r1 = r4.mFloorDelayTime     // Catch: java.lang.Exception -> L19
            xyz.adscope.amps.manager.AMPSBaseOpenApiManager$4 r3 = new xyz.adscope.amps.manager.AMPSBaseOpenApiManager$4     // Catch: java.lang.Exception -> L19
            r3.<init>(r4)     // Catch: java.lang.Exception -> L19
            r0.startDispatchFloorAdSourceTimerTask(r1, r3)     // Catch: java.lang.Exception -> L19
        L19:
            return
    }

    private void dispatchAdSourceByS2S() {
            r3 = this;
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r3.mS2SAdSourceList
            if (r0 == 0) goto L1b
            int r0 = r0.size()
            if (r0 != 0) goto Lb
            goto L1b
        Lb:
            xyz.adscope.amps.control.dispatch.inter.IDispatcherInterface r0 = r3.iDispatcherInterface
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r1 = r3.mS2SAdSourceList
            r2 = 1
            r0.updateAdSourceAdStatus(r1, r2)
            xyz.adscope.amps.control.dispatch.inter.IDispatcherInterface r0 = r3.iDispatcherInterface
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r1 = r3.mS2SAdSourceList
            r2 = 6
            r0.updateAdSourceAdStatus(r1, r2)
        L1b:
            return
    }

    private void dispatchAdSourceByTimeOut() {
            r3 = this;
            xyz.adscope.amps.control.dispatch.inter.IDispatcherInterface r0 = r3.iDispatcherInterface     // Catch: java.lang.Exception -> L26
            if (r0 != 0) goto L5
            goto L26
        L5:
            java.lang.String r0 = "amps_log_tag"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L26
            r1.<init>()     // Catch: java.lang.Exception -> L26
            java.lang.String r2 = r3.TAG     // Catch: java.lang.Exception -> L26
            r1.append(r2)     // Catch: java.lang.Exception -> L26
            java.lang.String r2 = " dispatchAdSourceByTimeOut 询价超时:"
            r1.append(r2)     // Catch: java.lang.Exception -> L26
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L26
            xyz.adscope.amps.tool.AMPSLogUtil.d(r0, r1)     // Catch: java.lang.Exception -> L26
            xyz.adscope.amps.control.dispatch.inter.IDispatcherInterface r0 = r3.iDispatcherInterface     // Catch: java.lang.Exception -> L26
            java.util.List r0 = r0.biddingTimeOut()     // Catch: java.lang.Exception -> L26
            r3.dispatchAdSource(r0)     // Catch: java.lang.Exception -> L26
        L26:
            return
    }

    private xyz.adscope.amps.model.config.response.AdSourceNoticeRuleModel getAdSourceNoticeRule(int r8, xyz.adscope.amps.model.config.response.AdSourceModel r9, double r10) {
            r7 = this;
            r0 = 0
            if (r9 != 0) goto L4
            return r0
        L4:
            r1 = 1
            if (r8 != 0) goto Lc
            java.util.List r8 = r9.getWinNoticeRule()     // Catch: java.lang.Exception -> L88
            goto L14
        Lc:
            if (r8 != r1) goto L13
            java.util.List r8 = r9.getLossNoticeRule()     // Catch: java.lang.Exception -> L88
            goto L14
        L13:
            r8 = r0
        L14:
            if (r8 == 0) goto L88
            boolean r9 = r8.isEmpty()     // Catch: java.lang.Exception -> L88
            if (r9 == 0) goto L1e
            goto L88
        L1e:
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Exception -> L88
        L22:
            boolean r9 = r8.hasNext()     // Catch: java.lang.Exception -> L88
            if (r9 == 0) goto L88
            java.lang.Object r9 = r8.next()     // Catch: java.lang.Exception -> L88
            xyz.adscope.amps.model.config.response.AdSourceNoticeRuleModel r9 = (xyz.adscope.amps.model.config.response.AdSourceNoticeRuleModel) r9     // Catch: java.lang.Exception -> L88
            if (r9 != 0) goto L31
            goto L22
        L31:
            java.util.List r2 = r9.getPriceGapScope()     // Catch: java.lang.Exception -> L88
            if (r2 == 0) goto L22
            int r3 = r2.size()     // Catch: java.lang.Exception -> L88
            r4 = 2
            if (r3 >= r4) goto L3f
            goto L22
        L3f:
            r3 = 0
            java.lang.Object r3 = r2.get(r3)     // Catch: java.lang.Exception -> L88
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L88
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Exception -> L88
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L88
            boolean r4 = xyz.adscope.amps.tool.util.AMPSRegularUtil.isInteger(r3)     // Catch: java.lang.Exception -> L88
            r5 = -2
            r6 = -1
            if (r4 == 0) goto L59
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Exception -> L88
            goto L64
        L59:
            java.lang.String r4 = "max"
            boolean r3 = r4.equals(r3)     // Catch: java.lang.Exception -> L88
            if (r3 == 0) goto L63
            r3 = -2
            goto L64
        L63:
            r3 = -1
        L64:
            boolean r4 = xyz.adscope.amps.tool.util.AMPSRegularUtil.isInteger(r2)     // Catch: java.lang.Exception -> L88
            if (r4 == 0) goto L6f
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Exception -> L88
            goto L70
        L6f:
            r2 = -1
        L70:
            if (r3 == r6) goto L22
            if (r2 != r6) goto L75
            goto L22
        L75:
            if (r3 != r5) goto L7d
            double r4 = (double) r2
            int r6 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r6 < 0) goto L7d
            goto L87
        L7d:
            double r4 = (double) r2
            int r2 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r2 < 0) goto L22
            double r2 = (double) r3
            int r4 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r4 > 0) goto L22
        L87:
            return r9
        L88:
            return r0
    }

    private int getProfitPrice(int r3, java.lang.String r4) {
            r2 = this;
            java.lang.String r0 = "%"
            if (r3 > 0) goto L5
            goto L28
        L5:
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L28
            if (r1 != 0) goto L28
            boolean r1 = r4.endsWith(r0)     // Catch: java.lang.Exception -> L28
            if (r1 == 0) goto L23
            int r0 = r4.indexOf(r0)     // Catch: java.lang.Exception -> L28
            r1 = 0
            java.lang.String r4 = r4.substring(r1, r0)     // Catch: java.lang.Exception -> L28
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.Exception -> L28
            int r3 = r3 * r4
            int r3 = r3 / 100
            return r3
        L23:
            int r3 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.Exception -> L28
            return r3
        L28:
            r3 = 1
            return r3
    }

    private xyz.adscope.amps.model.config.response.AdSourceModel getSecondAdSourceModel() {
            r5 = this;
            java.util.Map<java.lang.String, xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r5.loadAdResourceDatas
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        Lb:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L5d
            java.lang.Object r2 = r0.next()
            xyz.adscope.amps.model.config.response.AdSourceModel r2 = (xyz.adscope.amps.model.config.response.AdSourceModel) r2
            if (r2 != 0) goto L1a
            goto Lb
        L1a:
            int r3 = r2.getAdStatus()
            r4 = 5
            if (r3 == r4) goto L46
            java.lang.String r3 = r2.getBiddingType()
            boolean r3 = r5.isC2SOrS2SAdSource(r3)
            if (r3 == 0) goto Lb
            int r3 = r2.getEcpm()
            if (r3 <= 0) goto Lb
            r3 = 4
            int r4 = r2.getAdComparePriceStatus()
            if (r3 != r4) goto Lb
            if (r1 != 0) goto L3b
            goto L50
        L3b:
            int r3 = r2.getEcpm()
            int r4 = r1.getEcpm()
            if (r3 <= r4) goto Lb
            goto L50
        L46:
            int r3 = r2.getAdComparePriceStatus()
            r4 = 3
            if (r3 != r4) goto L4e
            goto Lb
        L4e:
            if (r1 != 0) goto L52
        L50:
            r1 = r2
            goto Lb
        L52:
            int r3 = r2.getEcpm()
            int r4 = r1.getEcpm()
            if (r3 <= r4) goto Lb
            goto L50
        L5d:
            return r1
    }

    private int getWinEcpm() {
            r1 = this;
            xyz.adscope.amps.model.config.response.AdSourceModel r0 = r1.mWinAdSourceModel
            if (r0 == 0) goto L9
            int r0 = r0.getEcpm()
            return r0
        L9:
            r0 = 0
            return r0
    }

    private void handleC2SOrS2SAdSourceBidResult(xyz.adscope.amps.model.config.response.AdSourceModel r2, xyz.adscope.amps.base.AMPSBaseBiddingResult r3, int r4) {
            r1 = this;
            if (r2 == 0) goto L1c
            if (r3 != 0) goto L5
            goto L1c
        L5:
            int r3 = r2.getAdStatus()     // Catch: java.lang.Exception -> L1c
            r0 = 3
            if (r3 != r0) goto L19
            r3 = 2
            if (r4 != r3) goto L19
            int r4 = r1.mAdRequestType     // Catch: java.lang.Exception -> L1c
            if (r4 == 0) goto L15
            if (r4 != r3) goto L19
        L15:
            r1.starLoadAdResource(r2)     // Catch: java.lang.Exception -> L1c
            return
        L19:
            r1.dispatchAdSourceByChannelResult(r2)     // Catch: java.lang.Exception -> L1c
        L1c:
            return
    }

    private void handleC2SOrS2SFloorAdSourceBidResult(xyz.adscope.amps.model.config.response.AdSourceModel r2, xyz.adscope.amps.base.AMPSBaseBiddingResult r3, int r4) {
            r1 = this;
            int r3 = r2.getAdStatus()     // Catch: java.lang.Exception -> L11
            r0 = 3
            if (r3 != r0) goto Le
            r3 = 2
            if (r4 != r3) goto Le
            r1.starLoadAdResource(r2)     // Catch: java.lang.Exception -> L11
            return
        Le:
            r1.handleCallbackAdSourceLoadResult()     // Catch: java.lang.Exception -> L11
        L11:
            return
    }

    private void handleCallbackAdSourceLoadResult() {
            r3 = this;
            java.lang.String r0 = "amps_log_tag"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4d
            r1.<init>()     // Catch: java.lang.Exception -> L4d
            java.lang.String r2 = r3.TAG     // Catch: java.lang.Exception -> L4d
            r1.append(r2)     // Catch: java.lang.Exception -> L4d
            java.lang.String r2 = " handleCallbackAdSourceLoadResult "
            r1.append(r2)     // Catch: java.lang.Exception -> L4d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L4d
            xyz.adscope.amps.tool.AMPSLogUtil.d(r0, r1)     // Catch: java.lang.Exception -> L4d
            xyz.adscope.amps.base.AMPSBaseAdapter r0 = r3.mAMPSBaseAdapter     // Catch: java.lang.Exception -> L4d
            if (r0 != 0) goto L4d
            xyz.adscope.amps.control.bid.inter.IPriceComparatorInterface r0 = r3.iPriceComparatorInterface     // Catch: java.lang.Exception -> L4d
            if (r0 != 0) goto L21
            goto L4d
        L21:
            xyz.adscope.amps.model.config.response.AdSourceModel r0 = r0.getWinAdSourceModel()     // Catch: java.lang.Exception -> L4d
            if (r0 == 0) goto L36
            java.lang.String r1 = r0.getSpaceId()     // Catch: java.lang.Exception -> L4d
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L4d
            if (r1 == 0) goto L32
            goto L36
        L32:
            r3.callBackAdLoadSuccess(r0)     // Catch: java.lang.Exception -> L4d
            return
        L36:
            boolean r0 = r3.judgeIsHasNoResultAdSource()     // Catch: java.lang.Exception -> L4d
            if (r0 != 0) goto L4d
            xyz.adscope.amps.manager.inter.AMPSLoadEventListener r0 = r3.ampsLoadEventListener     // Catch: java.lang.Exception -> L4d
            if (r0 == 0) goto L4d
            xyz.adscope.amps.common.AMPSErrorCode$ASMPLogicErrorEnum r0 = xyz.adscope.amps.common.AMPSErrorCode.ASMPLogicErrorEnum.PLATFORM_ERROR_REQUEST_ERROR     // Catch: java.lang.Exception -> L4d
            java.lang.String r1 = r0.getErrorCode()     // Catch: java.lang.Exception -> L4d
            java.lang.String r0 = r0.getErrorMsg()     // Catch: java.lang.Exception -> L4d
            r3.callBackAdLoadFail(r1, r0)     // Catch: java.lang.Exception -> L4d
        L4d:
            return
    }

    private void handlerBiddingTimeout() {
            r4 = this;
            xyz.adscope.amps.tool.task.AMPSManagerTask r0 = r4.mAmpsManagerTask     // Catch: java.lang.Exception -> L2d
            if (r0 != 0) goto L5
            goto L2d
        L5:
            int r0 = r4.mAdRequestType     // Catch: java.lang.Exception -> L2d
            if (r0 == 0) goto L2d
            r1 = 2
            if (r0 != r1) goto Ld
            goto L2d
        Ld:
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r4.mS2SAdSourceList     // Catch: java.lang.Exception -> L2d
            if (r0 == 0) goto L17
            int r0 = r0.size()     // Catch: java.lang.Exception -> L2d
            if (r0 > 0) goto L21
        L17:
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r4.mC2SAdSourceList     // Catch: java.lang.Exception -> L2d
            if (r0 == 0) goto L2d
            int r0 = r0.size()     // Catch: java.lang.Exception -> L2d
            if (r0 <= 0) goto L2d
        L21:
            xyz.adscope.amps.tool.task.AMPSManagerTask r0 = r4.mAmpsManagerTask     // Catch: java.lang.Exception -> L2d
            long r1 = r4.mBidAdTimeout     // Catch: java.lang.Exception -> L2d
            xyz.adscope.amps.manager.AMPSBaseOpenApiManager$2 r3 = new xyz.adscope.amps.manager.AMPSBaseOpenApiManager$2     // Catch: java.lang.Exception -> L2d
            r3.<init>(r4)     // Catch: java.lang.Exception -> L2d
            r0.startBiddingTimerTask(r1, r3)     // Catch: java.lang.Exception -> L2d
        L2d:
            return
    }

    private void handlerRequestedTimeout() {
            r4 = this;
            xyz.adscope.amps.tool.task.AMPSManagerTask r0 = r4.mAmpsManagerTask     // Catch: java.lang.Exception -> Lf
            if (r0 != 0) goto L5
            goto Lf
        L5:
            long r1 = r4.mAdRequestTimeout     // Catch: java.lang.Exception -> Lf
            xyz.adscope.amps.manager.AMPSBaseOpenApiManager$3 r3 = new xyz.adscope.amps.manager.AMPSBaseOpenApiManager$3     // Catch: java.lang.Exception -> Lf
            r3.<init>(r4)     // Catch: java.lang.Exception -> Lf
            r0.startRequestedTimerTask(r1, r3)     // Catch: java.lang.Exception -> Lf
        Lf:
            return
    }

    private void initData() {
            r3 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r3.mediationStartTime = r0
            java.lang.String r0 = xyz.adscope.amps.tool.util.AMPSStringUtil.createRequestId()
            r3.mSessionId = r0
            xyz.adscope.amps.model.config.response.SpaceModel r0 = r3.mSpaceModel
            if (r0 == 0) goto L69
            java.lang.String r0 = r0.getSpaceId()
            r3.mSpaceId = r0
            xyz.adscope.amps.model.config.response.SpaceModel r0 = r3.mSpaceModel
            int r0 = r0.getCachedOffersTimeout()
            long r0 = (long) r0
            r3.mSpaceCachedOffersTimeout = r0
            xyz.adscope.amps.model.config.response.SpaceModel r0 = r3.mSpaceModel
            int r0 = r0.getBidDistributionMethod()
            r3.mAdRequestType = r0
            xyz.adscope.amps.model.config.response.SpaceModel r0 = r3.mSpaceModel
            long r0 = r0.getBidAdTimeout()
            r3.mBidAdTimeout = r0
            xyz.adscope.amps.model.config.response.SpaceModel r0 = r3.mSpaceModel
            int r0 = r0.getFloorDelayTime()
            long r0 = (long) r0
            r3.mFloorDelayTime = r0
            xyz.adscope.amps.model.config.response.SpaceModel r0 = r3.mSpaceModel
            long r0 = r0.getAdTimeout()
            r3.mAdRequestTimeout = r0
            xyz.adscope.amps.model.config.response.SpaceModel r0 = r3.mSpaceModel
            long r0 = r0.getAdsTimeout()
            int r1 = (int) r0
            r3.mAdSourceRequestTimeout = r1
            xyz.adscope.amps.model.config.response.SpaceModel r0 = r3.mSpaceModel
            java.util.List r0 = r0.getS2sAdSourceList()
            r3.mS2SAdSourceList = r0
            xyz.adscope.amps.model.config.response.SpaceModel r0 = r3.mSpaceModel
            java.util.List r0 = r0.getC2sAdSourceList()
            r3.mC2SAdSourceList = r0
            xyz.adscope.amps.model.config.response.SpaceModel r0 = r3.mSpaceModel
            java.util.List r0 = r0.getFloorAdSourceList()
            r3.mFloorAdSourceList = r0
            xyz.adscope.amps.model.config.response.SpaceModel r0 = r3.mSpaceModel
            int r0 = r0.getAutoRefreshSwitch()
            r3.mAdAutoRefreshSwitch = r0
        L69:
            xyz.adscope.amps.tool.task.AMPSManagerTask r0 = new xyz.adscope.amps.tool.task.AMPSManagerTask
            r0.<init>()
            r3.mAmpsManagerTask = r0
            xyz.adscope.amps.control.filter.AMPSFilter r0 = new xyz.adscope.amps.control.filter.AMPSFilter
            xyz.adscope.amps.model.config.response.SpaceModel r1 = r3.mSpaceModel
            r0.<init>(r1)
            r3.iFilterInterface = r0
            xyz.adscope.amps.control.dispatch.AMPSDispatcher r0 = new xyz.adscope.amps.control.dispatch.AMPSDispatcher
            xyz.adscope.amps.model.config.response.SpaceModel r1 = r3.mSpaceModel
            r0.<init>(r1)
            r3.iDispatcherInterface = r0
            xyz.adscope.amps.control.bid.AMPSPriceComparator r0 = new xyz.adscope.amps.control.bid.AMPSPriceComparator
            xyz.adscope.amps.model.config.response.SpaceModel r1 = r3.mSpaceModel
            java.util.Map<java.lang.String, xyz.adscope.amps.model.config.response.AdSourceModel> r2 = r3.loadAdResourceDatas
            r0.<init>(r1, r2)
            r3.iPriceComparatorInterface = r0
            return
    }

    private boolean isC2SOrS2SAdSource(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "C2S"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L13
            java.lang.String r0 = "S2S"
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 == 0) goto L11
            goto L13
        L11:
            r2 = 0
            return r2
        L13:
            r2 = 1
            return r2
    }

    private boolean judgeIsHasNoResultAdSource() {
            r4 = this;
            java.util.Map<java.lang.String, xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r4.loadAdResourceDatas     // Catch: java.lang.Exception -> L28
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Exception -> L28
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L28
        La:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Exception -> L28
            if (r1 == 0) goto L28
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Exception -> L28
            xyz.adscope.amps.model.config.response.AdSourceModel r1 = (xyz.adscope.amps.model.config.response.AdSourceModel) r1     // Catch: java.lang.Exception -> L28
            if (r1 != 0) goto L19
            goto La
        L19:
            int r2 = r1.getAdStatus()     // Catch: java.lang.Exception -> L28
            r3 = 1
            if (r2 < r3) goto La
            int r1 = r1.getAdStatus()     // Catch: java.lang.Exception -> L28
            r2 = 4
            if (r1 > r2) goto La
            return r3
        L28:
            r0 = 0
            return r0
    }

    private void modifyAdSourceAuctionStrategy(xyz.adscope.amps.model.config.response.AdSourceModel r4, java.lang.String r5) {
            r3 = this;
            if (r4 == 0) goto L93
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L93
            if (r0 == 0) goto La
            goto L93
        La:
            java.lang.String r0 = xyz.adscope.common.tool.security.KeyGenerator.generateAesKey()     // Catch: java.lang.Exception -> L93
            java.lang.String r5 = xyz.adscope.common.tool.security.AesUtil.decrypt(r0, r5)     // Catch: java.lang.Exception -> L93
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L93
            if (r0 == 0) goto L1a
            goto L93
        L1a:
            java.lang.String r5 = xyz.adscope.common.tool.security.GzipUtil.decompressForGzip(r5)     // Catch: java.lang.Exception -> L93
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L93
            if (r0 == 0) goto L25
            goto L93
        L25:
            java.lang.Class<xyz.adscope.amps.model.config.response.AuctionStrategyModel> r0 = xyz.adscope.amps.model.config.response.AuctionStrategyModel.class
            java.lang.Object r5 = xyz.adscope.common.json.util.JsonUtil.fromJson(r5, r0)     // Catch: java.lang.Exception -> L93
            xyz.adscope.amps.model.config.response.AuctionStrategyModel r5 = (xyz.adscope.amps.model.config.response.AuctionStrategyModel) r5     // Catch: java.lang.Exception -> L93
            if (r5 != 0) goto L30
            goto L93
        L30:
            xyz.adscope.amps.model.config.response.AuctionStrategyModel r0 = r4.getAuctionStrategy()     // Catch: java.lang.Exception -> L93
            if (r0 != 0) goto L3b
            xyz.adscope.amps.model.config.response.AuctionStrategyModel r0 = new xyz.adscope.amps.model.config.response.AuctionStrategyModel     // Catch: java.lang.Exception -> L93
            r0.<init>()     // Catch: java.lang.Exception -> L93
        L3b:
            int r1 = r5.getRaiseSortPrice()     // Catch: java.lang.Exception -> L93
            r2 = -1
            if (r1 == r2) goto L45
            r0.setRaiseSortPrice(r1)     // Catch: java.lang.Exception -> L93
        L45:
            int r1 = r5.getEffectRate()     // Catch: java.lang.Exception -> L93
            if (r1 == r2) goto L4e
            r0.setEffectRate(r1)     // Catch: java.lang.Exception -> L93
        L4e:
            int r1 = r5.getAuctionType()     // Catch: java.lang.Exception -> L93
            if (r1 == r2) goto L57
            r0.setAuctionType(r1)     // Catch: java.lang.Exception -> L93
        L57:
            int r1 = r5.getIsLastLook()     // Catch: java.lang.Exception -> L93
            if (r1 == r2) goto L60
            r0.setIsLastLook(r1)     // Catch: java.lang.Exception -> L93
        L60:
            int r1 = r5.getSecondPrice()     // Catch: java.lang.Exception -> L93
            if (r1 <= 0) goto L69
            r0.setSecondPrice(r1)     // Catch: java.lang.Exception -> L93
        L69:
            java.lang.String r1 = r5.getWinPriceMin()     // Catch: java.lang.Exception -> L93
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L93
            if (r2 != 0) goto L76
            r0.setWinPriceMin(r1)     // Catch: java.lang.Exception -> L93
        L76:
            java.lang.String r1 = r5.getWinPriceMax()     // Catch: java.lang.Exception -> L93
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L93
            if (r2 != 0) goto L83
            r0.setWinPriceMax(r1)     // Catch: java.lang.Exception -> L93
        L83:
            java.lang.String r5 = r5.getCustomData()     // Catch: java.lang.Exception -> L93
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L93
            if (r1 != 0) goto L90
            r0.setCustomData(r5)     // Catch: java.lang.Exception -> L93
        L90:
            r4.setAuctionStrategy(r0)     // Catch: java.lang.Exception -> L93
        L93:
            return
    }

    private void removeCacheAdSource(java.lang.String r3) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L30
            if (r0 == 0) goto L7
            goto L30
        L7:
            java.util.Map<java.lang.String, xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r2.loadAdResourceDatas     // Catch: java.lang.Exception -> L30
            boolean r0 = r0.containsKey(r3)     // Catch: java.lang.Exception -> L30
            if (r0 == 0) goto L18
            java.util.Map<java.lang.String, xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r2.loadAdResourceDatas     // Catch: java.lang.Exception -> L30
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Exception -> L30
            xyz.adscope.amps.model.config.response.AdSourceModel r0 = (xyz.adscope.amps.model.config.response.AdSourceModel) r0     // Catch: java.lang.Exception -> L30
            goto L19
        L18:
            r0 = 0
        L19:
            if (r0 != 0) goto L1c
            goto L30
        L1c:
            java.lang.String r0 = r0.getAppId()     // Catch: java.lang.Exception -> L30
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L30
            if (r0 == 0) goto L27
            goto L30
        L27:
            xyz.adscope.amps.control.cache.AMPSCacheController r0 = xyz.adscope.amps.control.cache.AMPSCacheController.getInstance()     // Catch: java.lang.Exception -> L30
            java.lang.String r1 = r2.mSpaceId     // Catch: java.lang.Exception -> L30
            r0.removeAdSourceCacheInfo(r1, r3)     // Catch: java.lang.Exception -> L30
        L30:
            return
    }

    private void requestAdResource(xyz.adscope.amps.model.config.response.AdSourceModel r13) {
            r12 = this;
            if (r13 != 0) goto L4
            goto L22b
        L4:
            java.lang.String r7 = r13.getSpaceId()     // Catch: java.lang.Exception -> L22b
            java.lang.String r0 = "WF"
            java.lang.String r1 = r13.getBiddingType()     // Catch: java.lang.Exception -> L22b
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L22b
            java.lang.String r8 = "request"
            java.lang.String r9 = "amps_log_tag"
            r10 = 1
            if (r0 == 0) goto L89
            xyz.adscope.amps.report.AMPSEventReportCode r2 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_ADSOURCE_GET_CACHE_CODE     // Catch: java.lang.Exception -> L22b
            java.lang.String r3 = ""
            java.lang.String r4 = ""
            r5 = 0
            r0 = r12
            r1 = r13
            r0.uploadLog(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L22b
            xyz.adscope.amps.control.cache.AMPSCacheController r1 = xyz.adscope.amps.control.cache.AMPSCacheController.getInstance()     // Catch: java.lang.Exception -> L22b
            java.lang.String r2 = r12.mSpaceId     // Catch: java.lang.Exception -> L22b
            xyz.adscope.amps.model.cache.AMPSAdSourceCacheInfo r7 = r1.getAdSourceCacheInfo(r2, r7)     // Catch: java.lang.Exception -> L22b
            if (r7 != 0) goto L45
            xyz.adscope.amps.report.AMPSEventReportCode r2 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_ADSOURCE_GET_CACHE_FAIL_CODE     // Catch: java.lang.Exception -> L22b
            xyz.adscope.amps.common.AMPSErrorCode$ReportLogErrorEnum r1 = xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum.REPORT_LOG_ADSOURCE_GET_CACHE_FAIL     // Catch: java.lang.Exception -> L22b
            java.lang.String r3 = r1.getErrorCode()     // Catch: java.lang.Exception -> L22b
            java.lang.String r4 = r1.getErrorMsg()     // Catch: java.lang.Exception -> L22b
            r5 = 0
            r0 = r12
            r1 = r13
            r0.uploadLog(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L22b
        L45:
            if (r7 == 0) goto L89
            xyz.adscope.amps.base.AMPSBaseAdapter r11 = r7.getBaseAdapter()     // Catch: java.lang.Exception -> L22b
            if (r11 == 0) goto L89
            xyz.adscope.amps.report.AMPSEventReportCode r2 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_ADSOURCE_GET_CACHE_SUCCESS_CODE     // Catch: java.lang.Exception -> L22b
            java.lang.String r3 = ""
            java.lang.String r4 = ""
            r5 = 0
            r0 = r12
            r1 = r13
            r0.uploadLog(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L22b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L22b
            r2.<init>()     // Catch: java.lang.Exception -> L22b
            java.lang.String r3 = "loadAdResource  cacheInfo spaceId:"
            r2.append(r3)     // Catch: java.lang.Exception -> L22b
            java.lang.String r3 = r7.getSpaceId()     // Catch: java.lang.Exception -> L22b
            r2.append(r3)     // Catch: java.lang.Exception -> L22b
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L22b
            xyz.adscope.amps.tool.AMPSLogUtil.d(r9, r2)     // Catch: java.lang.Exception -> L22b
            r13.setCache(r10)     // Catch: java.lang.Exception -> L22b
            java.util.Map<java.lang.String, xyz.adscope.amps.base.AMPSBaseAdapter> r2 = r12.loadAdResourceAdapters     // Catch: java.lang.Exception -> L22b
            java.lang.String r3 = r13.getSpaceId()     // Catch: java.lang.Exception -> L22b
            r2.put(r3, r11)     // Catch: java.lang.Exception -> L22b
            java.lang.String r1 = r13.getSpaceId()     // Catch: java.lang.Exception -> L22b
            r12.addFilterEvent(r1, r8)     // Catch: java.lang.Exception -> L22b
            r12.onAdLoaded(r11)     // Catch: java.lang.Exception -> L22b
            return
        L89:
            java.util.Map<java.lang.String, xyz.adscope.amps.base.AMPSBaseAdapter> r2 = r12.loadAdResourceAdapters     // Catch: java.lang.Exception -> L22b
            java.lang.String r3 = r13.getSpaceId()     // Catch: java.lang.Exception -> L22b
            boolean r2 = r2.containsKey(r3)     // Catch: java.lang.Exception -> L22b
            if (r2 == 0) goto La3
            java.util.Map<java.lang.String, xyz.adscope.amps.base.AMPSBaseAdapter> r2 = r12.loadAdResourceAdapters     // Catch: java.lang.Exception -> L22b
            java.lang.String r3 = r13.getSpaceId()     // Catch: java.lang.Exception -> L22b
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Exception -> L22b
            xyz.adscope.amps.base.AMPSBaseAdapter r2 = (xyz.adscope.amps.base.AMPSBaseAdapter) r2     // Catch: java.lang.Exception -> L22b
        La1:
            r7 = r2
            goto Lac
        La3:
            java.lang.String r2 = r13.getAdapterClass()     // Catch: java.lang.Exception -> L22b
            xyz.adscope.amps.base.AMPSBaseAdapter r2 = xyz.adscope.amps.tool.AMPSAdapterFactory.createAdapterClass(r2)     // Catch: java.lang.Exception -> L22b
            goto La1
        Lac:
            if (r7 != 0) goto Le2
            xyz.adscope.amps.report.AMPSEventReportCode r2 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_ADSOURCE_BIDDING_FAIL_SELECTOR_CODE     // Catch: java.lang.Exception -> L22b
            xyz.adscope.amps.common.AMPSErrorCode$ReportLogErrorEnum r3 = xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum.REPORT_LOG_ADSOURCE_BIDDING_FAIL_SELECTOR_ADAPTER_NULL     // Catch: java.lang.Exception -> L22b
            r4 = r3
            java.lang.String r3 = r4.getErrorCode()     // Catch: java.lang.Exception -> L22b
            java.lang.String r4 = r4.getErrorMsg()     // Catch: java.lang.Exception -> L22b
            r5 = 0
            r0 = r12
            r1 = r13
            r0.uploadLog(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L22b
            r2 = 6
            r13.setAdStatus(r2)     // Catch: java.lang.Exception -> L22b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L22b
            r2.<init>()     // Catch: java.lang.Exception -> L22b
            java.lang.String r3 = "loadAdResource  adapter name error spaceId:"
            r2.append(r3)     // Catch: java.lang.Exception -> L22b
            java.lang.String r3 = r13.getSpaceId()     // Catch: java.lang.Exception -> L22b
            r2.append(r3)     // Catch: java.lang.Exception -> L22b
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L22b
            xyz.adscope.amps.tool.AMPSLogUtil.d(r9, r2)     // Catch: java.lang.Exception -> L22b
            r12.dispatchAdSourceByChannelResult(r13)     // Catch: java.lang.Exception -> L22b
            return
        Le2:
            java.lang.String r2 = r13.getSpaceId()     // Catch: java.lang.Exception -> L22b
            r12.addFilterEvent(r2, r8)     // Catch: java.lang.Exception -> L22b
            xyz.adscope.amps.model.AMPSAdapterModel r8 = new xyz.adscope.amps.model.AMPSAdapterModel     // Catch: java.lang.Exception -> L22b
            r8.<init>()     // Catch: java.lang.Exception -> L22b
            java.lang.String r2 = r13.getAppId()     // Catch: java.lang.Exception -> L22b
            r8.setAppId(r2)     // Catch: java.lang.Exception -> L22b
            java.lang.String r2 = r13.getSpaceId()     // Catch: java.lang.Exception -> L22b
            r8.setSpaceId(r2)     // Catch: java.lang.Exception -> L22b
            int r2 = r12.mAdSourceRequestTimeout     // Catch: java.lang.Exception -> L22b
            r8.setTimeOut(r2)     // Catch: java.lang.Exception -> L22b
            java.lang.String r2 = r13.getZoomout()     // Catch: java.lang.Exception -> L22b
            r8.setZoomOut(r2)     // Catch: java.lang.Exception -> L22b
            int r2 = r13.getVideoSound()     // Catch: java.lang.Exception -> L22b
            r8.setVideoSound(r2)     // Catch: java.lang.Exception -> L22b
            int r2 = r13.getVideoMaxTime()     // Catch: java.lang.Exception -> L22b
            long r2 = (long) r2     // Catch: java.lang.Exception -> L22b
            r8.setVideoMaxTime(r2)     // Catch: java.lang.Exception -> L22b
            int r2 = r13.getVideoAutoPlay()     // Catch: java.lang.Exception -> L22b
            r8.setVideoAutoPlay(r2)     // Catch: java.lang.Exception -> L22b
            java.lang.String r2 = r13.getOrientation()     // Catch: java.lang.Exception -> L22b
            r8.setOrientation(r2)     // Catch: java.lang.Exception -> L22b
            java.util.List r2 = r13.getTemplateTypes()     // Catch: java.lang.Exception -> L22b
            if (r2 == 0) goto L13c
            java.util.List r2 = r13.getTemplateTypes()     // Catch: java.lang.Exception -> L22b
            int r2 = r2.size()     // Catch: java.lang.Exception -> L22b
            if (r2 <= 0) goto L13c
            java.util.List r2 = r13.getTemplateTypes()     // Catch: java.lang.Exception -> L22b
            r8.setTemplateTypes(r2)     // Catch: java.lang.Exception -> L22b
        L13c:
            xyz.adscope.amps.config.AMPSRequestParameters r2 = r12.mAMPSRequestParameters     // Catch: java.lang.Exception -> L22b
            if (r2 == 0) goto L174
            int r2 = r2.getAdCount()     // Catch: java.lang.Exception -> L22b
            r8.setAdCount(r2)     // Catch: java.lang.Exception -> L22b
            xyz.adscope.amps.config.AMPSRequestParameters r2 = r12.mAMPSRequestParameters     // Catch: java.lang.Exception -> L22b
            int r2 = r2.getWidth()     // Catch: java.lang.Exception -> L22b
            r8.setExpressViewWidth(r2)     // Catch: java.lang.Exception -> L22b
            xyz.adscope.amps.config.AMPSRequestParameters r2 = r12.mAMPSRequestParameters     // Catch: java.lang.Exception -> L22b
            int r2 = r2.getHeight()     // Catch: java.lang.Exception -> L22b
            r8.setExpressViewHeight(r2)     // Catch: java.lang.Exception -> L22b
            xyz.adscope.amps.config.AMPSRequestParameters r2 = r12.mAMPSRequestParameters     // Catch: java.lang.Exception -> L22b
            java.lang.String r2 = r2.getUserId()     // Catch: java.lang.Exception -> L22b
            r8.setUserId(r2)     // Catch: java.lang.Exception -> L22b
            xyz.adscope.amps.config.AMPSRequestParameters r2 = r12.mAMPSRequestParameters     // Catch: java.lang.Exception -> L22b
            java.lang.String r2 = r2.getExtraData()     // Catch: java.lang.Exception -> L22b
            r8.setExtra(r2)     // Catch: java.lang.Exception -> L22b
            xyz.adscope.amps.config.AMPSRequestParameters r2 = r12.mAMPSRequestParameters     // Catch: java.lang.Exception -> L22b
            java.util.Map r2 = r2.getCustomExtraParameters()     // Catch: java.lang.Exception -> L22b
            r8.setLocalCustomParameter(r2)     // Catch: java.lang.Exception -> L22b
        L174:
            xyz.adscope.amps.init.AMPSInitAdapterConfig r2 = new xyz.adscope.amps.init.AMPSInitAdapterConfig     // Catch: java.lang.Exception -> L22b
            r2.<init>()     // Catch: java.lang.Exception -> L22b
            java.lang.String r3 = r13.getAppId()     // Catch: java.lang.Exception -> L22b
            r2.setAppId(r3)     // Catch: java.lang.Exception -> L22b
            xyz.adscope.amps.init.AMPSInitChannelAdapterConfig r3 = r12.ampsInitChannelAdapterConfig     // Catch: java.lang.Exception -> L22b
            r2.setAmpsInitChannelAdapterConfig(r3)     // Catch: java.lang.Exception -> L22b
            r8.setAmpsInitAdapterConfig(r2)     // Catch: java.lang.Exception -> L22b
            int r2 = r13.getIsSendBidData()     // Catch: java.lang.Exception -> L22b
            r8.setIsSendBidData(r2)     // Catch: java.lang.Exception -> L22b
            int r2 = r13.getEcpm()     // Catch: java.lang.Exception -> L22b
            r8.setEcpm(r2)     // Catch: java.lang.Exception -> L22b
            java.lang.String r2 = r13.getSeatId()     // Catch: java.lang.Exception -> L22b
            r8.setSeatId(r2)     // Catch: java.lang.Exception -> L22b
            java.lang.String r2 = r13.getBiddingType()     // Catch: java.lang.Exception -> L22b
            r8.setBiddingType(r2)     // Catch: java.lang.Exception -> L22b
            int r2 = r13.getFloorEcpm()     // Catch: java.lang.Exception -> L22b
            r8.setFloorEcpm(r2)     // Catch: java.lang.Exception -> L22b
            java.lang.String r2 = r13.getAccountId()     // Catch: java.lang.Exception -> L22b
            r8.setAccountId(r2)     // Catch: java.lang.Exception -> L22b
            java.lang.String r2 = r13.getServerUrl()     // Catch: java.lang.Exception -> L22b
            r8.setServerUrl(r2)     // Catch: java.lang.Exception -> L22b
            java.lang.String r2 = r13.getPublicKey()     // Catch: java.lang.Exception -> L22b
            r8.setPublicKey(r2)     // Catch: java.lang.Exception -> L22b
            java.util.Map<java.lang.String, xyz.adscope.amps.base.AMPSBaseAdapter> r2 = r12.loadAdResourceAdapters     // Catch: java.lang.Exception -> L22b
            java.lang.String r3 = r13.getSpaceId()     // Catch: java.lang.Exception -> L22b
            r2.put(r3, r7)     // Catch: java.lang.Exception -> L22b
            boolean r2 = r13.isCache()     // Catch: java.lang.Exception -> L22b
            if (r2 != 0) goto L208
            java.lang.String r2 = r13.getBiddingType()     // Catch: java.lang.Exception -> L22b
            boolean r2 = r12.isC2SOrS2SAdSource(r2)     // Catch: java.lang.Exception -> L22b
            if (r2 == 0) goto L1f4
            int r2 = r13.getAdStatus()     // Catch: java.lang.Exception -> L22b
            if (r2 > r10) goto L1f4
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L22b
            r13.setBiddingStartTime(r2)     // Catch: java.lang.Exception -> L22b
            xyz.adscope.amps.report.AMPSEventReportCode r2 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_ADSOURCE_BIDDING_CODE     // Catch: java.lang.Exception -> L22b
            java.lang.String r3 = ""
            java.lang.String r4 = ""
            r5 = 0
            r0 = r12
            r1 = r13
            r0.uploadLog(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L22b
            goto L208
        L1f4:
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L22b
            r13.setRequestStartTime(r2)     // Catch: java.lang.Exception -> L22b
            xyz.adscope.amps.report.AMPSEventReportCode r2 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_ADSOURCE_LOAD_CODE     // Catch: java.lang.Exception -> L22b
            java.lang.String r3 = ""
            java.lang.String r4 = ""
            r5 = 0
            r0 = r12
            r1 = r13
            r0.uploadLog(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L22b
        L208:
            java.lang.String r2 = r13.getBiddingType()     // Catch: java.lang.Exception -> L22b
            boolean r2 = r12.isC2SOrS2SAdSource(r2)     // Catch: java.lang.Exception -> L22b
            if (r2 == 0) goto L222
            int r2 = r13.getAdStatus()     // Catch: java.lang.Exception -> L22b
            if (r2 > r10) goto L222
            r2 = 2
            r13.setAdStatus(r2)     // Catch: java.lang.Exception -> L22b
            android.content.Context r1 = r12.mContext     // Catch: java.lang.Exception -> L22b
            r7.startBid(r1, r8, r12)     // Catch: java.lang.Exception -> L22b
            return
        L222:
            r2 = 4
            r13.setAdStatus(r2)     // Catch: java.lang.Exception -> L22b
            android.content.Context r1 = r12.mContext     // Catch: java.lang.Exception -> L22b
            r7.loadNetworkAd(r1, r8, r12)     // Catch: java.lang.Exception -> L22b
        L22b:
            return
    }

    private void sendLosNotice() {
            r9 = this;
            java.util.Map<java.lang.String, xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r9.loadAdResourceDatas     // Catch: java.lang.Exception -> Lf6
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Exception -> Lf6
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> Lf6
        La:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Exception -> Lf6
            if (r1 == 0) goto Lf6
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Exception -> Lf6
            r3 = r1
            xyz.adscope.amps.model.config.response.AdSourceModel r3 = (xyz.adscope.amps.model.config.response.AdSourceModel) r3     // Catch: java.lang.Exception -> Lf6
            if (r3 != 0) goto L1a
            goto La
        L1a:
            java.lang.String r1 = "WF"
            java.lang.String r2 = r3.getBiddingType()     // Catch: java.lang.Exception -> Lf6
            boolean r1 = r1.equalsIgnoreCase(r2)     // Catch: java.lang.Exception -> Lf6
            if (r1 == 0) goto L27
            goto La
        L27:
            java.lang.String r1 = r3.getSpaceId()     // Catch: java.lang.Exception -> Lf6
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> Lf6
            if (r2 == 0) goto L32
            goto La
        L32:
            xyz.adscope.amps.model.config.response.AdSourceModel r2 = r9.mWinAdSourceModel     // Catch: java.lang.Exception -> Lf6
            java.lang.String r4 = ""
            if (r2 == 0) goto L3d
            java.lang.String r2 = r2.getSpaceId()     // Catch: java.lang.Exception -> Lf6
            goto L3e
        L3d:
            r2 = r4
        L3e:
            boolean r2 = r1.equalsIgnoreCase(r2)     // Catch: java.lang.Exception -> Lf6
            if (r2 == 0) goto L45
            goto La
        L45:
            java.util.Map<java.lang.String, xyz.adscope.amps.base.AMPSBaseAdapter> r2 = r9.loadAdResourceAdapters     // Catch: java.lang.Exception -> Lf6
            boolean r2 = r2.containsKey(r1)     // Catch: java.lang.Exception -> Lf6
            if (r2 != 0) goto L4e
            goto La
        L4e:
            java.util.Map<java.lang.String, xyz.adscope.amps.base.AMPSBaseAdapter> r2 = r9.loadAdResourceAdapters     // Catch: java.lang.Exception -> Lf6
            java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.Exception -> Lf6
            xyz.adscope.amps.base.AMPSBaseAdapter r1 = (xyz.adscope.amps.base.AMPSBaseAdapter) r1     // Catch: java.lang.Exception -> Lf6
            if (r1 != 0) goto L59
            goto La
        L59:
            xyz.adscope.amps.base.AMPSBidResult r2 = new xyz.adscope.amps.base.AMPSBidResult     // Catch: java.lang.Exception -> Lf6
            r2.<init>()     // Catch: java.lang.Exception -> Lf6
            int r5 = r9.calcLossECPM(r3)     // Catch: java.lang.Exception -> Lf6
            java.lang.String r6 = java.lang.String.valueOf(r5)     // Catch: java.lang.Exception -> Lf6
            r3.setNoticePrice(r6)     // Catch: java.lang.Exception -> Lf6
            xyz.adscope.amps.model.config.response.AdSourceModel r6 = r9.mWinAdSourceModel     // Catch: java.lang.Exception -> Lf6
            if (r6 == 0) goto L97
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lf6
            r6.<init>()     // Catch: java.lang.Exception -> Lf6
            xyz.adscope.amps.model.config.response.AdSourceModel r7 = r9.mWinAdSourceModel     // Catch: java.lang.Exception -> Lf6
            int r7 = r7.getEcpm()     // Catch: java.lang.Exception -> Lf6
            r6.append(r7)     // Catch: java.lang.Exception -> Lf6
            r6.append(r4)     // Catch: java.lang.Exception -> Lf6
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Exception -> Lf6
            r3.setRealPrice(r4)     // Catch: java.lang.Exception -> Lf6
            xyz.adscope.amps.model.config.response.AdSourceModel r4 = r9.mWinAdSourceModel     // Catch: java.lang.Exception -> Lf6
            java.lang.String r4 = r4.getSeatId()     // Catch: java.lang.Exception -> Lf6
            r3.setBidSeatId(r4)     // Catch: java.lang.Exception -> Lf6
            xyz.adscope.amps.model.config.response.AdSourceModel r4 = r9.mWinAdSourceModel     // Catch: java.lang.Exception -> Lf6
            java.lang.String r4 = r4.getSpaceId()     // Catch: java.lang.Exception -> Lf6
            r3.setBidSpaceId(r4)     // Catch: java.lang.Exception -> Lf6
        L97:
            r2.setEcpm(r5)     // Catch: java.lang.Exception -> Lf6
            xyz.adscope.amps.model.config.response.AdSourceModel r4 = r9.mWinAdSourceModel     // Catch: java.lang.Exception -> Lf6
            java.lang.String r4 = r4.getSeatId()     // Catch: java.lang.Exception -> Lf6
            r2.setChannelName(r4)     // Catch: java.lang.Exception -> Lf6
            xyz.adscope.amps.model.config.response.AdSourceModel r4 = r9.mWinAdSourceModel     // Catch: java.lang.Exception -> Lf6
            java.lang.String r4 = r4.getBiddingType()     // Catch: java.lang.Exception -> Lf6
            r2.setBidType(r4)     // Catch: java.lang.Exception -> Lf6
            int r4 = r3.getEcpm()     // Catch: java.lang.Exception -> Lf6
            if (r4 <= 0) goto Lbe
            r4 = 1
            r2.setReason(r4)     // Catch: java.lang.Exception -> Lf6
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Exception -> Lf6
            r3.setLossReason(r4)     // Catch: java.lang.Exception -> Lf6
            goto Le5
        Lbe:
            xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum r4 = xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum.CHANNEL_ERROR_REQUEST_TIMEOUT     // Catch: java.lang.Exception -> Lf6
            java.lang.String r4 = r4.getErrorCode()     // Catch: java.lang.Exception -> Lf6
            java.lang.String r5 = r3.getErrorCode()     // Catch: java.lang.Exception -> Lf6
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Exception -> Lf6
            if (r4 == 0) goto Lda
            r4 = 3
            r2.setReason(r4)     // Catch: java.lang.Exception -> Lf6
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Exception -> Lf6
            r3.setLossReason(r4)     // Catch: java.lang.Exception -> Lf6
            goto Le5
        Lda:
            r4 = 2
            r2.setReason(r4)     // Catch: java.lang.Exception -> Lf6
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Exception -> Lf6
            r3.setLossReason(r4)     // Catch: java.lang.Exception -> Lf6
        Le5:
            r1.sendLossNotice(r2)     // Catch: java.lang.Exception -> Lf6
            xyz.adscope.amps.report.AMPSEventReportCode r4 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_ADSOURCE_LOAD_LOSS_CODE     // Catch: java.lang.Exception -> Lf6
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            r7 = 0
            r2 = r9
            r2.uploadLog(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> Lf6
            goto La
        Lf6:
            return
    }

    private void sendLosNoticeByFail() {
            r5 = this;
            java.util.Map<java.lang.String, xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r5.loadAdResourceDatas     // Catch: java.lang.Exception -> L7d
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Exception -> L7d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L7d
        La:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Exception -> L7d
            if (r1 == 0) goto L7d
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Exception -> L7d
            xyz.adscope.amps.model.config.response.AdSourceModel r1 = (xyz.adscope.amps.model.config.response.AdSourceModel) r1     // Catch: java.lang.Exception -> L7d
            if (r1 != 0) goto L19
            goto La
        L19:
            java.lang.String r2 = "WF"
            java.lang.String r3 = r1.getBiddingType()     // Catch: java.lang.Exception -> L7d
            boolean r2 = r2.equalsIgnoreCase(r3)     // Catch: java.lang.Exception -> L7d
            if (r2 == 0) goto L26
            goto La
        L26:
            java.lang.String r2 = r1.getSpaceId()     // Catch: java.lang.Exception -> L7d
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L7d
            if (r3 == 0) goto L31
            goto La
        L31:
            int r3 = r1.getAdStatus()     // Catch: java.lang.Exception -> L7d
            r4 = 6
            if (r3 == r4) goto L39
            goto La
        L39:
            java.util.Map<java.lang.String, xyz.adscope.amps.base.AMPSBaseAdapter> r3 = r5.loadAdResourceAdapters     // Catch: java.lang.Exception -> L7d
            boolean r3 = r3.containsKey(r2)     // Catch: java.lang.Exception -> L7d
            if (r3 != 0) goto L42
            goto La
        L42:
            java.util.Map<java.lang.String, xyz.adscope.amps.base.AMPSBaseAdapter> r3 = r5.loadAdResourceAdapters     // Catch: java.lang.Exception -> L7d
            java.lang.Object r2 = r3.get(r2)     // Catch: java.lang.Exception -> L7d
            xyz.adscope.amps.base.AMPSBaseAdapter r2 = (xyz.adscope.amps.base.AMPSBaseAdapter) r2     // Catch: java.lang.Exception -> L7d
            if (r2 != 0) goto L4d
            goto La
        L4d:
            xyz.adscope.amps.base.AMPSBidResult r3 = new xyz.adscope.amps.base.AMPSBidResult     // Catch: java.lang.Exception -> L7d
            r3.<init>()     // Catch: java.lang.Exception -> L7d
            r4 = 0
            r3.setEcpm(r4)     // Catch: java.lang.Exception -> L7d
            java.lang.String r4 = "9999"
            r3.setChannelName(r4)     // Catch: java.lang.Exception -> L7d
            java.lang.String r4 = "other"
            r3.setBidType(r4)     // Catch: java.lang.Exception -> L7d
            xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum r4 = xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum.CHANNEL_ERROR_REQUEST_TIMEOUT     // Catch: java.lang.Exception -> L7d
            java.lang.String r4 = r4.getErrorCode()     // Catch: java.lang.Exception -> L7d
            java.lang.String r1 = r1.getErrorCode()     // Catch: java.lang.Exception -> L7d
            boolean r1 = r4.equals(r1)     // Catch: java.lang.Exception -> L7d
            if (r1 == 0) goto L75
            r1 = 3
            r3.setReason(r1)     // Catch: java.lang.Exception -> L7d
            goto L79
        L75:
            r1 = 2
            r3.setReason(r1)     // Catch: java.lang.Exception -> L7d
        L79:
            r2.sendLossNotice(r3)     // Catch: java.lang.Exception -> L7d
            goto La
        L7d:
            return
    }

    private void starLoadAdResource(xyz.adscope.amps.model.config.response.AdSourceModel r1) {
            r0 = this;
            if (r1 != 0) goto L3
            return
        L3:
            r0.requestAdResource(r1)     // Catch: java.lang.Exception -> L6
        L6:
            return
    }

    private void startCacheLoadSuccessAdSource() {
            r5 = this;
            java.util.Map<java.lang.String, xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r5.loadAdResourceDatas     // Catch: java.lang.Exception -> L74
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Exception -> L74
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L74
        La:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Exception -> L74
            if (r1 == 0) goto L74
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Exception -> L74
            xyz.adscope.amps.model.config.response.AdSourceModel r1 = (xyz.adscope.amps.model.config.response.AdSourceModel) r1     // Catch: java.lang.Exception -> L74
            if (r1 != 0) goto L19
            goto La
        L19:
            java.lang.String r2 = r1.getSpaceId()     // Catch: java.lang.Exception -> L74
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L74
            if (r3 == 0) goto L24
            goto La
        L24:
            int r3 = r1.getAdStatus()     // Catch: java.lang.Exception -> L74
            r4 = 5
            if (r3 == r4) goto L2c
            goto La
        L2c:
            java.lang.String r3 = "WF"
            java.lang.String r4 = r1.getBiddingType()     // Catch: java.lang.Exception -> L74
            boolean r3 = r3.equalsIgnoreCase(r4)     // Catch: java.lang.Exception -> L74
            if (r3 != 0) goto L39
            goto La
        L39:
            boolean r3 = r1.isCache()     // Catch: java.lang.Exception -> L74
            if (r3 == 0) goto L40
            goto La
        L40:
            xyz.adscope.amps.base.AMPSBaseAdapter r3 = r5.mAMPSBaseAdapter     // Catch: java.lang.Exception -> L74
            if (r3 == 0) goto L55
            java.lang.String r3 = r3.getNetworkSpaceId()     // Catch: java.lang.Exception -> L74
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L74
            if (r4 != 0) goto L55
            boolean r3 = r3.equalsIgnoreCase(r2)     // Catch: java.lang.Exception -> L74
            if (r3 == 0) goto L55
            goto La
        L55:
            java.util.Map<java.lang.String, xyz.adscope.amps.base.AMPSBaseAdapter> r3 = r5.loadAdResourceAdapters     // Catch: java.lang.Exception -> L74
            boolean r3 = r3.containsKey(r2)     // Catch: java.lang.Exception -> L74
            if (r3 == 0) goto L66
            java.util.Map<java.lang.String, xyz.adscope.amps.base.AMPSBaseAdapter> r3 = r5.loadAdResourceAdapters     // Catch: java.lang.Exception -> L74
            java.lang.Object r2 = r3.get(r2)     // Catch: java.lang.Exception -> L74
            xyz.adscope.amps.base.AMPSBaseAdapter r2 = (xyz.adscope.amps.base.AMPSBaseAdapter) r2     // Catch: java.lang.Exception -> L74
            goto L67
        L66:
            r2 = 0
        L67:
            if (r2 != 0) goto L6a
            goto La
        L6a:
            xyz.adscope.amps.control.cache.AMPSCacheController r3 = xyz.adscope.amps.control.cache.AMPSCacheController.getInstance()     // Catch: java.lang.Exception -> L74
            xyz.adscope.amps.model.config.response.SpaceModel r4 = r5.mSpaceModel     // Catch: java.lang.Exception -> L74
            r3.addAdSourceCacheInfo(r4, r1, r2)     // Catch: java.lang.Exception -> L74
            goto La
        L74:
            return
    }

    private void updateAdSourceECPM(xyz.adscope.amps.model.config.response.AdSourceModel r8) {
            r7 = this;
            if (r8 != 0) goto L4
            goto L87
        L4:
            xyz.adscope.amps.model.config.response.AuctionStrategyModel r0 = r8.getAuctionStrategy()     // Catch: java.lang.Exception -> L87
            if (r0 != 0) goto Lc
            goto L87
        Lc:
            boolean r1 = r0.isHit()     // Catch: java.lang.Exception -> L87
            if (r1 != 0) goto L14
            goto L87
        L14:
            int r1 = r0.getOriginEcpm()     // Catch: java.lang.Exception -> L87
            java.lang.String r2 = "WF"
            java.lang.String r3 = r8.getBiddingType()     // Catch: java.lang.Exception -> L87
            boolean r2 = r2.equalsIgnoreCase(r3)     // Catch: java.lang.Exception -> L87
            if (r2 == 0) goto L28
            r8.setEcpm(r1)     // Catch: java.lang.Exception -> L87
            return
        L28:
            java.lang.String r2 = r8.getBiddingType()     // Catch: java.lang.Exception -> L87
            boolean r2 = r7.isC2SOrS2SAdSource(r2)     // Catch: java.lang.Exception -> L87
            if (r2 == 0) goto L87
            int r2 = r8.getEcpm()     // Catch: java.lang.Exception -> L87
            int r3 = r0.getRaiseSortPrice()     // Catch: java.lang.Exception -> L87
            boolean r4 = r0.isUseLastLook()     // Catch: java.lang.Exception -> L87
            int r5 = r0.getAuctionType()     // Catch: java.lang.Exception -> L87
            boolean r6 = r0.isRaise()     // Catch: java.lang.Exception -> L87
            if (r4 != 0) goto L4e
            r4 = 2
            if (r5 != r4) goto L4c
            goto L4e
        L4c:
            r1 = r2
            goto L81
        L4e:
            xyz.adscope.amps.model.config.response.AdSourceModel r4 = r7.getSecondAdSourceModel()     // Catch: java.lang.Exception -> L87
            if (r4 == 0) goto L5e
            int r5 = r4.getEcpm()     // Catch: java.lang.Exception -> L87
            int r4 = r4.getEcpm()     // Catch: java.lang.Exception -> L87
            int r2 = r2 - r4
            goto L5f
        L5e:
            r5 = 0
        L5f:
            java.lang.String r4 = r0.getWinPriceMin()     // Catch: java.lang.Exception -> L87
            java.lang.String r0 = r0.getWinPriceMax()     // Catch: java.lang.Exception -> L87
            int r4 = r7.getProfitPrice(r2, r4)     // Catch: java.lang.Exception -> L87
            int r0 = r7.getProfitPrice(r2, r0)     // Catch: java.lang.Exception -> L87
            r2 = 1
            if (r4 >= r0) goto L77
            int r0 = xyz.adscope.amps.tool.util.AMPSRandomUtil.getRandomNum(r4, r0)     // Catch: java.lang.Exception -> L87
            goto L78
        L77:
            r0 = 1
        L78:
            if (r0 > 0) goto L7b
            goto L7c
        L7b:
            r2 = r0
        L7c:
            int r5 = r5 + r2
            if (r5 <= r1) goto L80
            goto L81
        L80:
            r1 = r5
        L81:
            if (r6 == 0) goto L84
            int r1 = r1 - r3
        L84:
            r8.setEcpm(r1)     // Catch: java.lang.Exception -> L87
        L87:
            return
    }

    private void updateC2SOrS2SAdSourceAdStatus(xyz.adscope.amps.model.config.response.AdSourceModel r8, xyz.adscope.amps.base.AMPSBaseBiddingResult r9) {
            r7 = this;
            if (r8 != 0) goto L4
            goto L9d
        L4:
            r0 = 6
            if (r9 != 0) goto L26
            r8.setAdStatus(r0)     // Catch: java.lang.Exception -> L9d
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L9d
            long r4 = r8.getBiddingStartTime()     // Catch: java.lang.Exception -> L9d
            long r2 = r2 - r4
            r5 = r2
            xyz.adscope.amps.report.AMPSEventReportCode r2 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_ADSOURCE_BIDDING_FAIL_CODE     // Catch: java.lang.Exception -> L9d
            xyz.adscope.amps.common.AMPSErrorCode$ReportLogErrorEnum r0 = xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum.REPORT_LOG_ADSOURCE_BIDDING_FAIL_RESULT_NULL     // Catch: java.lang.Exception -> L9d
            java.lang.String r3 = r0.getErrorCode()     // Catch: java.lang.Exception -> L9d
            java.lang.String r4 = r0.getErrorMsg()     // Catch: java.lang.Exception -> L9d
            r0 = r7
            r1 = r8
            r0.uploadLog(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L9d
            return
        L26:
            int r2 = r8.getAdStatus()     // Catch: java.lang.Exception -> L9d
            if (r2 != r0) goto L30
            r8.setAdStatus(r0)     // Catch: java.lang.Exception -> L9d
            return
        L30:
            boolean r2 = r9.isSuccess()     // Catch: java.lang.Exception -> L9d
            if (r2 != 0) goto L55
            r8.setAdStatus(r0)     // Catch: java.lang.Exception -> L9d
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L9d
            long r4 = r8.getBiddingStartTime()     // Catch: java.lang.Exception -> L9d
            long r2 = r2 - r4
            r5 = r2
            xyz.adscope.amps.report.AMPSEventReportCode r2 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_ADSOURCE_BIDDING_FAIL_CODE     // Catch: java.lang.Exception -> L9d
            xyz.adscope.amps.common.AMPSErrorCode$ReportLogErrorEnum r0 = xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum.REPORT_LOG_ADSOURCE_BIDDING_FAIL_RESULT     // Catch: java.lang.Exception -> L9d
            java.lang.String r3 = r0.getErrorCode()     // Catch: java.lang.Exception -> L9d
            java.lang.String r4 = r0.getErrorMsg()     // Catch: java.lang.Exception -> L9d
            r0 = r7
            r1 = r8
            r0.uploadLog(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L9d
            return
        L55:
            int r2 = r9.getEcpm()     // Catch: java.lang.Exception -> L9d
            r8.setEcpm(r2)     // Catch: java.lang.Exception -> L9d
            int r2 = r9.getEcpm()     // Catch: java.lang.Exception -> L9d
            r8.setReportEcpm(r2)     // Catch: java.lang.Exception -> L9d
            int r2 = r9.getEcpm()     // Catch: java.lang.Exception -> L9d
            int r3 = r8.getFloorEcpm()     // Catch: java.lang.Exception -> L9d
            if (r2 >= r3) goto L84
            r8.setAdStatus(r0)     // Catch: java.lang.Exception -> L9d
            xyz.adscope.amps.report.AMPSEventReportCode r2 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_ADSOURCE_BIDDING_COMPARE_FAIL_CODE     // Catch: java.lang.Exception -> L9d
            xyz.adscope.amps.common.AMPSErrorCode$ReportLogErrorEnum r0 = xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum.REPORT_LOG_ADSOURCE_BIDDING_COMPARE_FAIL_LESS_FLOOR     // Catch: java.lang.Exception -> L9d
            java.lang.String r3 = r0.getErrorCode()     // Catch: java.lang.Exception -> L9d
            java.lang.String r4 = r0.getErrorMsg()     // Catch: java.lang.Exception -> L9d
            r5 = 0
            r0 = r7
            r1 = r8
            r0.uploadLog(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L9d
            return
        L84:
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L9d
            long r2 = r8.getBiddingStartTime()     // Catch: java.lang.Exception -> L9d
            long r5 = r0 - r2
            xyz.adscope.amps.report.AMPSEventReportCode r2 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_ADSOURCE_BIDDING_SUCCESS_CODE     // Catch: java.lang.Exception -> L9d
            java.lang.String r3 = ""
            java.lang.String r4 = ""
            r0 = r7
            r1 = r8
            r0.uploadLog(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L9d
            r0 = 3
            r8.setAdStatus(r0)     // Catch: java.lang.Exception -> L9d
        L9d:
            return
    }

    public void destroy() {
            r9 = this;
            java.util.Map<java.lang.String, xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r9.loadAdResourceDatas     // Catch: java.lang.Exception -> L4f
            if (r0 == 0) goto L54
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Exception -> L4f
            if (r0 != 0) goto L54
            java.util.Map<java.lang.String, xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r9.loadAdResourceDatas     // Catch: java.lang.Exception -> L4f
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Exception -> L4f
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L4f
        L14:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Exception -> L4f
            if (r1 == 0) goto L54
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Exception -> L4f
            r3 = r1
            xyz.adscope.amps.model.config.response.AdSourceModel r3 = (xyz.adscope.amps.model.config.response.AdSourceModel) r3     // Catch: java.lang.Exception -> L4f
            if (r3 != 0) goto L24
            goto L14
        L24:
            int r1 = r3.getAdStatus()     // Catch: java.lang.Exception -> L4f
            r2 = 5
            if (r1 >= r2) goto L52
            xyz.adscope.amps.report.AMPSEventReportCode r4 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_ADSOURCE_LOAD_FAIL_CODE     // Catch: java.lang.Exception -> L4f
            xyz.adscope.amps.common.AMPSErrorCode$ReportLogErrorEnum r1 = xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum.REPORT_LOG_ADSOURCE_LOAD_REQUEST_FAIL     // Catch: java.lang.Exception -> L4f
            java.lang.String r5 = r1.getErrorCode()     // Catch: java.lang.Exception -> L4f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4f
            r2.<init>()     // Catch: java.lang.Exception -> L4f
            java.lang.String r1 = r1.getErrorMsg()     // Catch: java.lang.Exception -> L4f
            r2.append(r1)     // Catch: java.lang.Exception -> L4f
            java.lang.String r1 = " onDestroy"
            r2.append(r1)     // Catch: java.lang.Exception -> L4f
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Exception -> L4f
            r7 = 0
            r2 = r9
            r2.uploadLog(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> Lc2
            goto L14
        L4f:
            r2 = r9
            goto Lc2
        L52:
            r2 = r9
            goto L14
        L54:
            r2 = r9
            java.util.Map<java.lang.String, xyz.adscope.amps.base.AMPSBaseAdapter> r0 = r2.loadAdResourceAdapters     // Catch: java.lang.Exception -> Lc2
            if (r0 == 0) goto L81
            int r0 = r0.size()     // Catch: java.lang.Exception -> Lc2
            if (r0 <= 0) goto L81
            java.util.Map<java.lang.String, xyz.adscope.amps.base.AMPSBaseAdapter> r0 = r2.loadAdResourceAdapters     // Catch: java.lang.Exception -> Lc2
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Exception -> Lc2
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> Lc2
        L69:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Exception -> Lc2
            if (r1 == 0) goto L81
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Exception -> Lc2
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Exception -> Lc2
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Exception -> Lc2
            xyz.adscope.amps.base.AMPSBaseAdapter r1 = (xyz.adscope.amps.base.AMPSBaseAdapter) r1     // Catch: java.lang.Exception -> Lc2
            if (r1 == 0) goto L69
            r1.destroy()     // Catch: java.lang.Exception -> Lc2
            goto L69
        L81:
            r0 = 0
            r2.mAMPSBaseAdapter = r0     // Catch: java.lang.Exception -> Lc2
            java.util.Map<java.lang.String, xyz.adscope.amps.model.config.response.AdSourceModel> r1 = r2.loadAdResourceDatas     // Catch: java.lang.Exception -> Lc2
            if (r1 == 0) goto L8b
            r1.clear()     // Catch: java.lang.Exception -> Lc2
        L8b:
            r2.loadAdResourceDatas = r0     // Catch: java.lang.Exception -> Lc2
            java.util.Map<java.lang.String, xyz.adscope.amps.base.AMPSBaseAdapter> r1 = r2.loadAdResourceAdapters     // Catch: java.lang.Exception -> Lc2
            if (r1 == 0) goto L94
            r1.clear()     // Catch: java.lang.Exception -> Lc2
        L94:
            r2.loadAdResourceAdapters = r0     // Catch: java.lang.Exception -> Lc2
            r2.mSpaceModel = r0     // Catch: java.lang.Exception -> Lc2
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r1 = r2.mS2SAdSourceList     // Catch: java.lang.Exception -> Lc2
            if (r1 == 0) goto L9f
            r1.clear()     // Catch: java.lang.Exception -> Lc2
        L9f:
            r2.mS2SAdSourceList = r0     // Catch: java.lang.Exception -> Lc2
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r1 = r2.mC2SAdSourceList     // Catch: java.lang.Exception -> Lc2
            if (r1 == 0) goto La8
            r1.clear()     // Catch: java.lang.Exception -> Lc2
        La8:
            r2.mC2SAdSourceList = r0     // Catch: java.lang.Exception -> Lc2
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r1 = r2.mFloorAdSourceList     // Catch: java.lang.Exception -> Lc2
            if (r1 == 0) goto Lb1
            r1.clear()     // Catch: java.lang.Exception -> Lc2
        Lb1:
            r2.mFloorAdSourceList = r0     // Catch: java.lang.Exception -> Lc2
            r2.iDispatcherInterface = r0     // Catch: java.lang.Exception -> Lc2
            r2.iPriceComparatorInterface = r0     // Catch: java.lang.Exception -> Lc2
            r2.mContext = r0     // Catch: java.lang.Exception -> Lc2
            xyz.adscope.amps.init.AMPSInitChannelAdapterConfig r1 = r2.ampsInitChannelAdapterConfig     // Catch: java.lang.Exception -> Lc2
            if (r1 == 0) goto Lc2
            r1.clear()     // Catch: java.lang.Exception -> Lc2
            r2.ampsInitChannelAdapterConfig = r0     // Catch: java.lang.Exception -> Lc2
        Lc2:
            return
    }

    public int getAdAutoRefreshSwitch() {
            r1 = this;
            int r0 = r1.mAdAutoRefreshSwitch
            return r0
    }

    public long getSpaceCachedOffersTimeout() {
            r2 = this;
            long r0 = r2.mSpaceCachedOffersTimeout
            return r0
    }

    public xyz.adscope.amps.base.AMPSBaseAdapter getWinAdSourceAdapter() {
            r1 = this;
            xyz.adscope.amps.base.AMPSBaseAdapter r0 = r1.mAMPSBaseAdapter
            return r0
    }

    public xyz.adscope.amps.model.config.response.AdSourceModel getWinAdSourceModel() {
            r1 = this;
            xyz.adscope.amps.model.config.response.AdSourceModel r0 = r1.mWinAdSourceModel
            return r0
    }

    public boolean isWinAdSource(xyz.adscope.amps.base.AMPSBaseAdapter r2) {
            r1 = this;
            if (r2 == 0) goto L1c
            java.lang.String r2 = r2.getNetworkSpaceId()
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L1c
            xyz.adscope.amps.base.AMPSBaseAdapter r0 = r1.mAMPSBaseAdapter
            if (r0 == 0) goto L1c
            java.lang.String r0 = r0.getNetworkSpaceId()
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L1c
            r2 = 1
            return r2
        L1c:
            r2 = 0
            return r2
    }

    @Override // xyz.adscope.amps.inner.AMPSBaseAdAdapterListener
    public void onAdClicked(xyz.adscope.amps.base.AMPSBaseAdapter r8) {
            r7 = this;
            java.lang.String r0 = "amps_log_tag"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L72
            r1.<init>()     // Catch: java.lang.Exception -> L72
            java.lang.String r2 = r7.TAG     // Catch: java.lang.Exception -> L72
            r1.append(r2)     // Catch: java.lang.Exception -> L72
            java.lang.String r2 = " onAdClicked "
            r1.append(r2)     // Catch: java.lang.Exception -> L72
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L72
            xyz.adscope.amps.tool.AMPSLogUtil.d(r0, r1)     // Catch: java.lang.Exception -> L72
            xyz.adscope.amps.manager.inter.AMPSLoadEventListener r0 = r7.ampsLoadEventListener     // Catch: java.lang.Exception -> L72
            if (r0 != 0) goto L1d
            goto L72
        L1d:
            boolean r8 = r7.isWinAdSource(r8)     // Catch: java.lang.Exception -> L72
            if (r8 != 0) goto L24
            goto L72
        L24:
            xyz.adscope.amps.manager.inter.AMPSLoadEventListener r8 = r7.ampsLoadEventListener     // Catch: java.lang.Exception -> L72
            boolean r0 = r8 instanceof xyz.adscope.amps.ad.splash.AMPSSplashLoadEventListener     // Catch: java.lang.Exception -> L72
            if (r0 == 0) goto L30
            xyz.adscope.amps.ad.splash.AMPSSplashLoadEventListener r8 = (xyz.adscope.amps.ad.splash.AMPSSplashLoadEventListener) r8     // Catch: java.lang.Exception -> L72
            r8.onAmpsAdClicked()     // Catch: java.lang.Exception -> L72
            goto L4d
        L30:
            boolean r0 = r8 instanceof xyz.adscope.amps.ad.interstitial.AMPSInterstitialLoadEventListener     // Catch: java.lang.Exception -> L72
            if (r0 == 0) goto L3a
            xyz.adscope.amps.ad.interstitial.AMPSInterstitialLoadEventListener r8 = (xyz.adscope.amps.ad.interstitial.AMPSInterstitialLoadEventListener) r8     // Catch: java.lang.Exception -> L72
            r8.onAmpsAdClicked()     // Catch: java.lang.Exception -> L72
            goto L4d
        L3a:
            boolean r0 = r8 instanceof xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener     // Catch: java.lang.Exception -> L72
            if (r0 == 0) goto L44
            xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener r8 = (xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener) r8     // Catch: java.lang.Exception -> L72
            r8.onAmpsAdVideoClick()     // Catch: java.lang.Exception -> L72
            goto L4d
        L44:
            boolean r0 = r8 instanceof xyz.adscope.amps.ad.banner.AMPSBannerLoadEventListener     // Catch: java.lang.Exception -> L72
            if (r0 == 0) goto L4d
            xyz.adscope.amps.ad.banner.AMPSBannerLoadEventListener r8 = (xyz.adscope.amps.ad.banner.AMPSBannerLoadEventListener) r8     // Catch: java.lang.Exception -> L72
            r8.onAmpsAdClicked()     // Catch: java.lang.Exception -> L72
        L4d:
            xyz.adscope.amps.base.AMPSBaseAdapter r8 = r7.mAMPSBaseAdapter     // Catch: java.lang.Exception -> L72
            if (r8 == 0) goto L72
            java.lang.String r8 = r8.getNetworkSpaceId()     // Catch: java.lang.Exception -> L72
            java.lang.String r0 = "click"
            r7.addFilterEvent(r8, r0)     // Catch: java.lang.Exception -> L72
            java.util.Map<java.lang.String, xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r7.loadAdResourceDatas     // Catch: java.lang.Exception -> L72
            java.lang.Object r8 = r0.get(r8)     // Catch: java.lang.Exception -> L72
            r1 = r8
            xyz.adscope.amps.model.config.response.AdSourceModel r1 = (xyz.adscope.amps.model.config.response.AdSourceModel) r1     // Catch: java.lang.Exception -> L72
            if (r1 != 0) goto L66
            goto L72
        L66:
            xyz.adscope.amps.report.AMPSEventReportCode r2 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_ADSOURCE_CLICK_CODE     // Catch: java.lang.Exception -> L72
            java.lang.String r3 = ""
            java.lang.String r4 = ""
            r5 = 0
            r0 = r7
            r0.uploadLog(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L72
        L72:
            return
    }

    @Override // xyz.adscope.amps.inner.AMPSBaseAdAdapterListener
    public void onAdDismiss(xyz.adscope.amps.base.AMPSBaseAdapter r10) {
            r9 = this;
            java.lang.String r0 = "amps_log_tag"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ldc
            r1.<init>()     // Catch: java.lang.Exception -> Ldc
            java.lang.String r2 = r9.TAG     // Catch: java.lang.Exception -> Ldc
            r1.append(r2)     // Catch: java.lang.Exception -> Ldc
            java.lang.String r2 = " onAdDismiss "
            r1.append(r2)     // Catch: java.lang.Exception -> Ldc
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> Ldc
            xyz.adscope.amps.tool.AMPSLogUtil.d(r0, r1)     // Catch: java.lang.Exception -> Ldc
            boolean r0 = r9.isAdClosed     // Catch: java.lang.Exception -> Ldc
            if (r0 == 0) goto L34
            boolean r10 = r9.isWinAdSource(r10)     // Catch: java.lang.Exception -> Ldc
            if (r10 != 0) goto L24
            goto Ldc
        L24:
            xyz.adscope.amps.manager.inter.AMPSLoadEventListener r10 = r9.ampsLoadEventListener     // Catch: java.lang.Exception -> Ldc
            if (r10 != 0) goto L2a
            goto Ldc
        L2a:
            boolean r0 = r10 instanceof xyz.adscope.amps.ad.banner.AMPSBannerLoadEventListener     // Catch: java.lang.Exception -> Ldc
            if (r0 == 0) goto Ldc
            xyz.adscope.amps.ad.banner.AMPSBannerLoadEventListener r10 = (xyz.adscope.amps.ad.banner.AMPSBannerLoadEventListener) r10     // Catch: java.lang.Exception -> Ldc
            r10.onAmpsAdDismiss()     // Catch: java.lang.Exception -> Ldc
            return
        L34:
            boolean r10 = r9.isWinAdSource(r10)     // Catch: java.lang.Exception -> Ldc
            if (r10 != 0) goto L3c
            goto Ldc
        L3c:
            r10 = 1
            r9.isAdClosed = r10     // Catch: java.lang.Exception -> Ldc
            xyz.adscope.amps.manager.inter.AMPSLoadEventListener r10 = r9.ampsLoadEventListener     // Catch: java.lang.Exception -> Ldc
            if (r10 != 0) goto L45
            goto Ldc
        L45:
            boolean r0 = r10 instanceof xyz.adscope.amps.ad.splash.AMPSSplashLoadEventListener     // Catch: java.lang.Exception -> Ldc
            if (r0 == 0) goto L4f
            xyz.adscope.amps.ad.splash.AMPSSplashLoadEventListener r10 = (xyz.adscope.amps.ad.splash.AMPSSplashLoadEventListener) r10     // Catch: java.lang.Exception -> Ldc
            r10.onAmpsAdDismiss()     // Catch: java.lang.Exception -> Ldc
            goto L6c
        L4f:
            boolean r0 = r10 instanceof xyz.adscope.amps.ad.interstitial.AMPSInterstitialLoadEventListener     // Catch: java.lang.Exception -> Ldc
            if (r0 == 0) goto L59
            xyz.adscope.amps.ad.interstitial.AMPSInterstitialLoadEventListener r10 = (xyz.adscope.amps.ad.interstitial.AMPSInterstitialLoadEventListener) r10     // Catch: java.lang.Exception -> Ldc
            r10.onAmpsAdDismiss()     // Catch: java.lang.Exception -> Ldc
            goto L6c
        L59:
            boolean r0 = r10 instanceof xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener     // Catch: java.lang.Exception -> Ldc
            if (r0 == 0) goto L63
            xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener r10 = (xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener) r10     // Catch: java.lang.Exception -> Ldc
            r10.onAmpsAdDismiss()     // Catch: java.lang.Exception -> Ldc
            goto L6c
        L63:
            boolean r0 = r10 instanceof xyz.adscope.amps.ad.banner.AMPSBannerLoadEventListener     // Catch: java.lang.Exception -> Ldc
            if (r0 == 0) goto L6c
            xyz.adscope.amps.ad.banner.AMPSBannerLoadEventListener r10 = (xyz.adscope.amps.ad.banner.AMPSBannerLoadEventListener) r10     // Catch: java.lang.Exception -> Ldc
            r10.onAmpsAdDismiss()     // Catch: java.lang.Exception -> Ldc
        L6c:
            xyz.adscope.amps.base.AMPSBaseAdapter r10 = r9.mAMPSBaseAdapter     // Catch: java.lang.Exception -> Ldc
            if (r10 == 0) goto Ldc
            java.lang.String r10 = r10.getNetworkSpaceId()     // Catch: java.lang.Exception -> Ldc
            boolean r0 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Exception -> Ldc
            if (r0 == 0) goto L7b
            goto Ldc
        L7b:
            java.util.Map<java.lang.String, xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r9.loadAdResourceDatas     // Catch: java.lang.Exception -> Ldc
            java.lang.Object r10 = r0.get(r10)     // Catch: java.lang.Exception -> Ldc
            r1 = r10
            xyz.adscope.amps.model.config.response.AdSourceModel r1 = (xyz.adscope.amps.model.config.response.AdSourceModel) r1     // Catch: java.lang.Exception -> Ldc
            if (r1 != 0) goto L87
            goto Ldc
        L87:
            java.util.Map<java.lang.String, xyz.adscope.amps.model.config.response.AdSourceModel> r10 = r9.loadAdResourceDatas     // Catch: java.lang.Exception -> Ldc
            java.util.Collection r10 = r10.values()     // Catch: java.lang.Exception -> Ldc
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Exception -> Ldc
        L91:
            boolean r0 = r10.hasNext()     // Catch: java.lang.Exception -> Ldc
            if (r0 == 0) goto Ld0
            java.lang.Object r0 = r10.next()     // Catch: java.lang.Exception -> Ldc
            r3 = r0
            xyz.adscope.amps.model.config.response.AdSourceModel r3 = (xyz.adscope.amps.model.config.response.AdSourceModel) r3     // Catch: java.lang.Exception -> Ldc
            if (r3 != 0) goto La1
            goto L91
        La1:
            int r0 = r3.getAdStatus()     // Catch: java.lang.Exception -> Ldc
            r2 = 5
            if (r0 >= r2) goto L91
            r0 = 6
            r3.setAdStatus(r0)     // Catch: java.lang.Exception -> Ldc
            xyz.adscope.amps.report.AMPSEventReportCode r4 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_ADSOURCE_LOAD_FAIL_CODE     // Catch: java.lang.Exception -> Ldc
            xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum r0 = xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum.CHANNEL_ERROR_REQUEST_TIMEOUT     // Catch: java.lang.Exception -> Ldc
            java.lang.String r5 = r0.getErrorCode()     // Catch: java.lang.Exception -> Ldc
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ldc
            r2.<init>()     // Catch: java.lang.Exception -> Ldc
            java.lang.String r0 = r0.getErrorMsg()     // Catch: java.lang.Exception -> Ldc
            r2.append(r0)     // Catch: java.lang.Exception -> Ldc
            java.lang.String r0 = " , onAdDismiss"
            r2.append(r0)     // Catch: java.lang.Exception -> Ldc
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Exception -> Ldc
            r7 = 0
            r2 = r9
            r2.uploadLog(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> Ldc
            goto L91
        Ld0:
            xyz.adscope.amps.report.AMPSEventReportCode r2 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_ADSOURCE_CLOSE_CODE     // Catch: java.lang.Exception -> Ldc
            java.lang.String r3 = ""
            java.lang.String r4 = ""
            r5 = 0
            r0 = r9
            r0.uploadLog(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> Ldc
        Ldc:
            return
    }

    public void onAdFailed(xyz.adscope.amps.base.AMPSBaseAdapter r8, xyz.adscope.amps.common.AMPSError r9) {
            r7 = this;
            java.lang.String r0 = "amps_log_tag"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4d
            r1.<init>()     // Catch: java.lang.Exception -> L4d
            java.lang.String r2 = r7.TAG     // Catch: java.lang.Exception -> L4d
            r1.append(r2)     // Catch: java.lang.Exception -> L4d
            java.lang.String r2 = " onAdFailed code: "
            r1.append(r2)     // Catch: java.lang.Exception -> L4d
            java.lang.String r2 = r9.getCode()     // Catch: java.lang.Exception -> L4d
            r1.append(r2)     // Catch: java.lang.Exception -> L4d
            java.lang.String r2 = ";message:"
            r1.append(r2)     // Catch: java.lang.Exception -> L4d
            java.lang.String r2 = r9.getMessage()     // Catch: java.lang.Exception -> L4d
            r1.append(r2)     // Catch: java.lang.Exception -> L4d
            java.lang.String r2 = " spaceID:"
            r1.append(r2)     // Catch: java.lang.Exception -> L4d
            java.lang.String r2 = r8.getNetworkSpaceId()     // Catch: java.lang.Exception -> L4d
            r1.append(r2)     // Catch: java.lang.Exception -> L4d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L4d
            xyz.adscope.amps.tool.AMPSLogUtil.d(r0, r1)     // Catch: java.lang.Exception -> L4d
            xyz.adscope.amps.manager.inter.AMPSLoadEventListener r0 = r7.ampsLoadEventListener     // Catch: java.lang.Exception -> L4d
            if (r0 == 0) goto L4d
            java.lang.String r8 = r8.getNetworkSpaceId()     // Catch: java.lang.Exception -> L4d
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Exception -> L4d
            if (r0 != 0) goto L4d
            java.util.Map<java.lang.String, xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r7.loadAdResourceDatas     // Catch: java.lang.Exception -> L4d
            boolean r0 = r0.containsKey(r8)     // Catch: java.lang.Exception -> L4d
            if (r0 != 0) goto L4f
        L4d:
            r0 = r7
            goto L88
        L4f:
            java.util.Map<java.lang.String, xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r7.loadAdResourceDatas     // Catch: java.lang.Exception -> L4d
            java.lang.Object r8 = r0.get(r8)     // Catch: java.lang.Exception -> L4d
            r1 = r8
            xyz.adscope.amps.model.config.response.AdSourceModel r1 = (xyz.adscope.amps.model.config.response.AdSourceModel) r1     // Catch: java.lang.Exception -> L4d
            if (r1 != 0) goto L5b
            goto L4d
        L5b:
            int r8 = r1.getAdStatus()     // Catch: java.lang.Exception -> L4d
            r0 = 6
            if (r8 == r0) goto L84
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L4d
            long r4 = r1.getRequestStartTime()     // Catch: java.lang.Exception -> L4d
            long r2 = r2 - r4
            r1.setAdStatus(r0)     // Catch: java.lang.Exception -> L4d
            r5 = r2
            java.lang.String r3 = r9.getCode()     // Catch: java.lang.Exception -> L4d
            java.lang.String r4 = r9.getMessage()     // Catch: java.lang.Exception -> L4d
            r1.setErrorCode(r3)     // Catch: java.lang.Exception -> L4d
            r1.setErrorMsg(r4)     // Catch: java.lang.Exception -> L4d
            xyz.adscope.amps.report.AMPSEventReportCode r2 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_ADSOURCE_LOAD_FAIL_CODE     // Catch: java.lang.Exception -> L4d
            r0 = r7
            r0.uploadLog(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L88
            goto L85
        L84:
            r0 = r7
        L85:
            r7.dispatchAdSourceByChannelResult(r1)     // Catch: java.lang.Exception -> L88
        L88:
            return
    }

    public void onAdLoaded(xyz.adscope.amps.base.AMPSBaseAdapter r10) {
            r9 = this;
            xyz.adscope.amps.manager.inter.AMPSLoadEventListener r0 = r9.ampsLoadEventListener     // Catch: java.lang.Exception -> L6
            if (r0 == 0) goto L6
            if (r10 != 0) goto L9
        L6:
            r2 = r9
            goto L9e
        L9:
            java.lang.String r0 = r10.getNetworkSpaceId()     // Catch: java.lang.Exception -> L6
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L6
            if (r1 != 0) goto L6
            java.util.Map<java.lang.String, xyz.adscope.amps.model.config.response.AdSourceModel> r1 = r9.loadAdResourceDatas     // Catch: java.lang.Exception -> L6
            boolean r1 = r1.containsKey(r0)     // Catch: java.lang.Exception -> L6
            if (r1 != 0) goto L1c
            goto L6
        L1c:
            java.util.Map<java.lang.String, xyz.adscope.amps.model.config.response.AdSourceModel> r1 = r9.loadAdResourceDatas     // Catch: java.lang.Exception -> L6
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Exception -> L6
            r3 = r1
            xyz.adscope.amps.model.config.response.AdSourceModel r3 = (xyz.adscope.amps.model.config.response.AdSourceModel) r3     // Catch: java.lang.Exception -> L6
            if (r3 != 0) goto L28
            goto L6
        L28:
            boolean r1 = r3.isCache()     // Catch: java.lang.Exception -> L6
            if (r1 != 0) goto L43
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L6
            long r4 = r3.getRequestStartTime()     // Catch: java.lang.Exception -> L6
            long r7 = r1 - r4
            xyz.adscope.amps.report.AMPSEventReportCode r4 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_ADSOURCE_LOAD_SUCCESS_CODE     // Catch: java.lang.Exception -> L6
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            r2 = r9
            r2.uploadLog(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L9e
            goto L46
        L43:
            r2 = r9
            r7 = 0
        L46:
            java.lang.String r1 = "amps_log_tag"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L9e
            r4.<init>()     // Catch: java.lang.Exception -> L9e
            java.lang.String r5 = r2.TAG     // Catch: java.lang.Exception -> L9e
            r4.append(r5)     // Catch: java.lang.Exception -> L9e
            java.lang.String r5 = " channel:"
            r4.append(r5)     // Catch: java.lang.Exception -> L9e
            java.lang.String r5 = r3.getSeatId()     // Catch: java.lang.Exception -> L9e
            r4.append(r5)     // Catch: java.lang.Exception -> L9e
            java.lang.String r5 = " spaceId:"
            r4.append(r5)     // Catch: java.lang.Exception -> L9e
            r4.append(r0)     // Catch: java.lang.Exception -> L9e
            java.lang.String r0 = ", onAdLoaded success time:"
            r4.append(r0)     // Catch: java.lang.Exception -> L9e
            r4.append(r7)     // Catch: java.lang.Exception -> L9e
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Exception -> L9e
            xyz.adscope.amps.tool.AMPSLogUtil.e(r1, r0)     // Catch: java.lang.Exception -> L9e
            r0 = 5
            r3.setAdStatus(r0)     // Catch: java.lang.Exception -> L9e
            r0 = 1
            r2.isHasLoadingSuccess = r0     // Catch: java.lang.Exception -> L9e
            xyz.adscope.amps.base.AMPSBaseAdapter r0 = r2.mAMPSBaseAdapter     // Catch: java.lang.Exception -> L9e
            if (r0 == 0) goto L9b
            boolean r0 = r3.isCache()     // Catch: java.lang.Exception -> L9e
            if (r0 != 0) goto L9b
            java.lang.String r0 = "WF"
            java.lang.String r1 = r3.getBiddingType()     // Catch: java.lang.Exception -> L9e
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch: java.lang.Exception -> L9e
            if (r0 == 0) goto L9b
            xyz.adscope.amps.control.cache.AMPSCacheController r0 = xyz.adscope.amps.control.cache.AMPSCacheController.getInstance()     // Catch: java.lang.Exception -> L9e
            xyz.adscope.amps.model.config.response.SpaceModel r1 = r2.mSpaceModel     // Catch: java.lang.Exception -> L9e
            r0.addAdSourceCacheInfo(r1, r3, r10)     // Catch: java.lang.Exception -> L9e
        L9b:
            r9.comparePrice(r10, r3)     // Catch: java.lang.Exception -> L9e
        L9e:
            return
    }

    @Override // xyz.adscope.amps.inner.AMPSBaseAdAdapterListener
    public void onAdShow(xyz.adscope.amps.base.AMPSBaseAdapter r8) {
            r7 = this;
            xyz.adscope.amps.manager.inter.AMPSLoadEventListener r0 = r7.ampsLoadEventListener     // Catch: java.lang.Exception -> L8c
            if (r0 != 0) goto L6
            goto L8c
        L6:
            boolean r8 = r7.isWinAdSource(r8)     // Catch: java.lang.Exception -> L8c
            if (r8 != 0) goto Le
            goto L8c
        Le:
            xyz.adscope.amps.model.config.response.AdSourceModel r8 = r7.mWinAdSourceModel     // Catch: java.lang.Exception -> L8c
            java.lang.String r8 = r8.getAdType()     // Catch: java.lang.Exception -> L8c
            xyz.adscope.amps.report.AMPSReportConstants$REPORT_AD_TYPE r0 = xyz.adscope.amps.report.AMPSReportConstants.REPORT_AD_TYPE.AD_TYPE_NATIVE_EXPRESS     // Catch: java.lang.Exception -> L8c
            java.lang.String r0 = r0.getCode()     // Catch: java.lang.Exception -> L8c
            boolean r0 = r0.equals(r8)     // Catch: java.lang.Exception -> L8c
            if (r0 != 0) goto L2f
            xyz.adscope.amps.report.AMPSReportConstants$REPORT_AD_TYPE r0 = xyz.adscope.amps.report.AMPSReportConstants.REPORT_AD_TYPE.AD_TYPE_NATIVE_UNIFIED     // Catch: java.lang.Exception -> L8c
            java.lang.String r0 = r0.getCode()     // Catch: java.lang.Exception -> L8c
            boolean r8 = r0.equals(r8)     // Catch: java.lang.Exception -> L8c
            if (r8 != 0) goto L2f
            r7.saveWinAdSourceMaterial()     // Catch: java.lang.Exception -> L8c
        L2f:
            r8 = 2
            r7.mSpaceAdStatus = r8     // Catch: java.lang.Exception -> L8c
            xyz.adscope.amps.manager.inter.AMPSLoadEventListener r8 = r7.ampsLoadEventListener     // Catch: java.lang.Exception -> L8c
            boolean r0 = r8 instanceof xyz.adscope.amps.ad.splash.AMPSSplashLoadEventListener     // Catch: java.lang.Exception -> L8c
            if (r0 == 0) goto L3e
            xyz.adscope.amps.ad.splash.AMPSSplashLoadEventListener r8 = (xyz.adscope.amps.ad.splash.AMPSSplashLoadEventListener) r8     // Catch: java.lang.Exception -> L8c
            r8.onAmpsAdShow()     // Catch: java.lang.Exception -> L8c
            goto L5b
        L3e:
            boolean r0 = r8 instanceof xyz.adscope.amps.ad.interstitial.AMPSInterstitialLoadEventListener     // Catch: java.lang.Exception -> L8c
            if (r0 == 0) goto L48
            xyz.adscope.amps.ad.interstitial.AMPSInterstitialLoadEventListener r8 = (xyz.adscope.amps.ad.interstitial.AMPSInterstitialLoadEventListener) r8     // Catch: java.lang.Exception -> L8c
            r8.onAmpsAdShow()     // Catch: java.lang.Exception -> L8c
            goto L5b
        L48:
            boolean r0 = r8 instanceof xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener     // Catch: java.lang.Exception -> L8c
            if (r0 == 0) goto L52
            xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener r8 = (xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener) r8     // Catch: java.lang.Exception -> L8c
            r8.onAmpsAdShow()     // Catch: java.lang.Exception -> L8c
            goto L5b
        L52:
            boolean r0 = r8 instanceof xyz.adscope.amps.ad.banner.AMPSBannerLoadEventListener     // Catch: java.lang.Exception -> L8c
            if (r0 == 0) goto L5b
            xyz.adscope.amps.ad.banner.AMPSBannerLoadEventListener r8 = (xyz.adscope.amps.ad.banner.AMPSBannerLoadEventListener) r8     // Catch: java.lang.Exception -> L8c
            r8.onAmpsAdShow()     // Catch: java.lang.Exception -> L8c
        L5b:
            xyz.adscope.amps.base.AMPSBaseAdapter r8 = r7.mAMPSBaseAdapter     // Catch: java.lang.Exception -> L8c
            if (r8 == 0) goto L8c
            java.lang.String r8 = r8.getNetworkSpaceId()     // Catch: java.lang.Exception -> L8c
            java.lang.String r0 = "show"
            r7.addFilterEvent(r8, r0)     // Catch: java.lang.Exception -> L8c
            java.util.Map<java.lang.String, xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r7.loadAdResourceDatas     // Catch: java.lang.Exception -> L8c
            java.lang.Object r8 = r0.get(r8)     // Catch: java.lang.Exception -> L8c
            r1 = r8
            xyz.adscope.amps.model.config.response.AdSourceModel r1 = (xyz.adscope.amps.model.config.response.AdSourceModel) r1     // Catch: java.lang.Exception -> L8c
            if (r1 != 0) goto L74
            goto L8c
        L74:
            xyz.adscope.amps.report.AMPSEventReportCode r2 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_ADSOURCE_SHOW_CODE     // Catch: java.lang.Exception -> L8c
            java.lang.String r3 = ""
            java.lang.String r4 = ""
            r5 = 0
            r0 = r7
            r0.uploadLog(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L8c
            xyz.adscope.amps.report.AMPSEventReportCode r2 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_ADSOURCE_EXPOSURE_CODE     // Catch: java.lang.Exception -> L8c
            java.lang.String r3 = ""
            java.lang.String r4 = ""
            r5 = 0
            r0 = r7
            r0.uploadLog(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L8c
        L8c:
            return
    }

    @Override // xyz.adscope.amps.inner.AMPSBaseAdAdapterListener
    public void onAdShowFailed(xyz.adscope.amps.base.AMPSBaseAdapter r8, xyz.adscope.amps.common.AMPSError r9) {
            r7 = this;
            xyz.adscope.amps.model.config.response.AdSourceModel r0 = r7.mWinAdSourceModel     // Catch: java.lang.Exception -> L4
            if (r0 != 0) goto L6
        L4:
            r0 = r7
            goto L47
        L6:
            boolean r8 = r7.isWinAdSource(r8)     // Catch: java.lang.Exception -> L4
            if (r8 != 0) goto Ld
            goto L4
        Ld:
            xyz.adscope.amps.model.config.response.AdSourceModel r8 = r7.mWinAdSourceModel     // Catch: java.lang.Exception -> L4
            int r8 = r8.getAdStatus()     // Catch: java.lang.Exception -> L4
            r0 = 5
            if (r8 == r0) goto L17
            goto L4
        L17:
            if (r9 == 0) goto L24
            java.lang.String r8 = r9.getCode()     // Catch: java.lang.Exception -> L4
            java.lang.String r9 = r9.getMessage()     // Catch: java.lang.Exception -> L4
            r3 = r8
            r4 = r9
            goto L28
        L24:
            java.lang.String r8 = ""
            r3 = r8
            r4 = r3
        L28:
            xyz.adscope.amps.model.config.response.AdSourceModel r1 = r7.mWinAdSourceModel     // Catch: java.lang.Exception -> L4
            xyz.adscope.amps.report.AMPSEventReportCode r2 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_ADSOURCE_SHOW_FAIL_CODE     // Catch: java.lang.Exception -> L4
            r5 = 0
            r0 = r7
            r0.uploadLog(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L47
            r8 = 1
            r0.isDispatchFloorAdSource = r8     // Catch: java.lang.Exception -> L47
            xyz.adscope.amps.model.config.response.AdSourceModel r8 = r0.mWinAdSourceModel     // Catch: java.lang.Exception -> L47
            java.lang.String r8 = r8.getSpaceId()     // Catch: java.lang.Exception -> L47
            xyz.adscope.amps.control.cache.AMPSCacheController r9 = xyz.adscope.amps.control.cache.AMPSCacheController.getInstance()     // Catch: java.lang.Exception -> L47
            java.lang.String r1 = r0.mSpaceId     // Catch: java.lang.Exception -> L47
            r9.removeAdSourceCacheInfo(r1, r8)     // Catch: java.lang.Exception -> L47
            r7.callBackAdLoadFail(r3, r4)     // Catch: java.lang.Exception -> L47
        L47:
            return
    }

    @Override // xyz.adscope.amps.inner.AMPSAdBiddingListener
    public void onC2SBiddingFail(xyz.adscope.amps.base.AMPSBaseAdapter r9, xyz.adscope.amps.base.AMPSBaseBiddingResult r10) {
            r8 = this;
            if (r9 == 0) goto L4
            if (r10 != 0) goto L7
        L4:
            r1 = r8
            goto L98
        L7:
            java.lang.String r9 = r9.getNetworkSpaceId()     // Catch: java.lang.Exception -> L4
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L4
            if (r0 != 0) goto L4
            java.util.Map<java.lang.String, xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r8.loadAdResourceDatas     // Catch: java.lang.Exception -> L4
            boolean r0 = r0.containsKey(r9)     // Catch: java.lang.Exception -> L4
            if (r0 != 0) goto L1a
            goto L4
        L1a:
            java.util.Map<java.lang.String, xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r8.loadAdResourceDatas     // Catch: java.lang.Exception -> L4
            java.lang.Object r0 = r0.get(r9)     // Catch: java.lang.Exception -> L4
            r2 = r0
            xyz.adscope.amps.model.config.response.AdSourceModel r2 = (xyz.adscope.amps.model.config.response.AdSourceModel) r2     // Catch: java.lang.Exception -> L4
            if (r2 != 0) goto L26
            goto L4
        L26:
            int r0 = r2.getAdStatus()     // Catch: java.lang.Exception -> L4
            r1 = 5
            if (r0 != r1) goto L2e
            goto L4
        L2e:
            java.lang.String r0 = "amps_log_tag"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4
            r1.<init>()     // Catch: java.lang.Exception -> L4
            java.lang.String r3 = r8.TAG     // Catch: java.lang.Exception -> L4
            r1.append(r3)     // Catch: java.lang.Exception -> L4
            java.lang.String r3 = " onC2SBiddingFail  channel:"
            r1.append(r3)     // Catch: java.lang.Exception -> L4
            java.lang.String r3 = r2.getSeatId()     // Catch: java.lang.Exception -> L4
            r1.append(r3)     // Catch: java.lang.Exception -> L4
            java.lang.String r3 = ",spaceId:"
            r1.append(r3)     // Catch: java.lang.Exception -> L4
            r1.append(r9)     // Catch: java.lang.Exception -> L4
            java.lang.String r9 = ";adStatus:"
            r1.append(r9)     // Catch: java.lang.Exception -> L4
            int r9 = r2.getAdStatus()     // Catch: java.lang.Exception -> L4
            r1.append(r9)     // Catch: java.lang.Exception -> L4
            java.lang.String r9 = ";"
            r1.append(r9)     // Catch: java.lang.Exception -> L4
            java.lang.String r9 = r10.toString()     // Catch: java.lang.Exception -> L4
            r1.append(r9)     // Catch: java.lang.Exception -> L4
            java.lang.String r9 = r1.toString()     // Catch: java.lang.Exception -> L4
            xyz.adscope.amps.tool.AMPSLogUtil.d(r0, r9)     // Catch: java.lang.Exception -> L4
            r9 = 6
            r2.setAdStatus(r9)     // Catch: java.lang.Exception -> L4
            java.lang.String r4 = r10.getErrorCode()     // Catch: java.lang.Exception -> L4
            java.lang.String r5 = r10.getErrorMsg()     // Catch: java.lang.Exception -> L4
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L4
            long r6 = r2.getBiddingStartTime()     // Catch: java.lang.Exception -> L4
            long r6 = r0 - r6
            xyz.adscope.amps.report.AMPSEventReportCode r3 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_ADSOURCE_BIDDING_FAIL_CODE     // Catch: java.lang.Exception -> L4
            r1 = r8
            r1.uploadLog(r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L98
            int r9 = r2.getIsFloor()     // Catch: java.lang.Exception -> L98
            r0 = 1
            r3 = 4
            if (r9 != r0) goto L95
            r8.handleC2SOrS2SFloorAdSourceBidResult(r2, r10, r3)     // Catch: java.lang.Exception -> L98
            return
        L95:
            r8.handleC2SOrS2SAdSourceBidResult(r2, r10, r3)     // Catch: java.lang.Exception -> L98
        L98:
            return
    }

    @Override // xyz.adscope.amps.inner.AMPSAdBiddingListener
    public void onC2SBiddingSuccess(xyz.adscope.amps.base.AMPSBaseAdapter r14, xyz.adscope.amps.base.AMPSBaseBiddingResult r15) {
            r13 = this;
            if (r14 == 0) goto L8
            if (r15 == 0) goto L8
            xyz.adscope.amps.control.bid.inter.IPriceComparatorInterface r0 = r13.iPriceComparatorInterface     // Catch: java.lang.Exception -> L8
            if (r0 != 0) goto Lb
        L8:
            r2 = r13
            goto Lf2
        Lb:
            java.lang.String r0 = r14.getNetworkSpaceId()     // Catch: java.lang.Exception -> L8
            java.lang.String r14 = r14.getMediaCustomExtraInfo()     // Catch: java.lang.Exception -> L8
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L8
            if (r1 != 0) goto L8
            java.util.Map<java.lang.String, xyz.adscope.amps.model.config.response.AdSourceModel> r1 = r13.loadAdResourceDatas     // Catch: java.lang.Exception -> L8
            boolean r1 = r1.containsKey(r0)     // Catch: java.lang.Exception -> L8
            if (r1 != 0) goto L22
            goto L8
        L22:
            java.util.Map<java.lang.String, xyz.adscope.amps.model.config.response.AdSourceModel> r1 = r13.loadAdResourceDatas     // Catch: java.lang.Exception -> L8
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Exception -> L8
            r3 = r1
            xyz.adscope.amps.model.config.response.AdSourceModel r3 = (xyz.adscope.amps.model.config.response.AdSourceModel) r3     // Catch: java.lang.Exception -> L8
            if (r3 != 0) goto L2e
            goto L8
        L2e:
            int r1 = r3.getAdStatus()     // Catch: java.lang.Exception -> L8
            r2 = 5
            if (r1 != r2) goto L36
            goto L8
        L36:
            r13.updateC2SOrS2SAdSourceAdStatus(r3, r15)     // Catch: java.lang.Exception -> L8
            r13.modifyAdSourceAuctionStrategy(r3, r14)     // Catch: java.lang.Exception -> L8
            int r14 = r3.getIsFloor()     // Catch: java.lang.Exception -> L8
            int r1 = r13.mAdRequestType     // Catch: java.lang.Exception -> L8
            r9 = 1
            r10 = 2
            if (r1 == 0) goto L4e
            if (r1 == r10) goto L4e
            if (r14 != r9) goto L4b
            goto L4e
        L4b:
            r2 = r13
            goto Le8
        L4e:
            int r1 = r3.getAdStatus()     // Catch: java.lang.Exception -> L8
            r2 = 3
            if (r1 != r2) goto L4b
            xyz.adscope.amps.report.AMPSEventReportCode r4 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_ADSOURCE_BIDDING_COMPARE     // Catch: java.lang.Exception -> L8
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            r7 = 0
            r2 = r13
            r2.uploadLog(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> Lf2
            xyz.adscope.amps.control.bid.inter.IPriceComparatorInterface r1 = r2.iPriceComparatorInterface     // Catch: java.lang.Exception -> Lf2
            int r1 = r1.getComparePriceResult(r3)     // Catch: java.lang.Exception -> Lf2
            java.lang.String r4 = "amps_log_tag"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lf2
            r5.<init>()     // Catch: java.lang.Exception -> Lf2
            java.lang.String r6 = r2.TAG     // Catch: java.lang.Exception -> Lf2
            r5.append(r6)     // Catch: java.lang.Exception -> Lf2
            java.lang.String r6 = " onC2SBiddingSuccess  channel:"
            r5.append(r6)     // Catch: java.lang.Exception -> Lf2
            java.lang.String r6 = r3.getSeatId()     // Catch: java.lang.Exception -> Lf2
            r5.append(r6)     // Catch: java.lang.Exception -> Lf2
            java.lang.String r6 = ",spaceId:"
            r5.append(r6)     // Catch: java.lang.Exception -> Lf2
            r5.append(r0)     // Catch: java.lang.Exception -> Lf2
            java.lang.String r0 = ";adStatus:"
            r5.append(r0)     // Catch: java.lang.Exception -> Lf2
            int r0 = r3.getAdStatus()     // Catch: java.lang.Exception -> Lf2
            r5.append(r0)     // Catch: java.lang.Exception -> Lf2
            java.lang.String r0 = ",comparePriceResult:"
            r5.append(r0)     // Catch: java.lang.Exception -> Lf2
            r5.append(r1)     // Catch: java.lang.Exception -> Lf2
            java.lang.String r0 = ",result:"
            r5.append(r0)     // Catch: java.lang.Exception -> Lf2
            java.lang.String r0 = r15.toString()     // Catch: java.lang.Exception -> Lf2
            r5.append(r0)     // Catch: java.lang.Exception -> Lf2
            java.lang.String r0 = ",time:"
            r5.append(r0)     // Catch: java.lang.Exception -> Lf2
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> Lf2
            long r11 = r3.getBiddingStartTime()     // Catch: java.lang.Exception -> Lf2
            long r6 = r6 - r11
            r5.append(r6)     // Catch: java.lang.Exception -> Lf2
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Exception -> Lf2
            xyz.adscope.amps.tool.AMPSLogUtil.d(r4, r0)     // Catch: java.lang.Exception -> Lf2
            r3.setAdComparePriceStatus(r1)     // Catch: java.lang.Exception -> Lf2
            if (r1 == r10) goto Ldb
            r0 = 6
            r3.setAdStatus(r0)     // Catch: java.lang.Exception -> L8
            xyz.adscope.amps.report.AMPSEventReportCode r4 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_ADSOURCE_BIDDING_COMPARE_FAIL_CODE     // Catch: java.lang.Exception -> L8
            xyz.adscope.amps.common.AMPSErrorCode$ReportLogErrorEnum r0 = xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum.REPORT_LOG_ADSOURCE_BIDDING_COMPARE_FAIL     // Catch: java.lang.Exception -> L8
            java.lang.String r5 = r0.getErrorCode()     // Catch: java.lang.Exception -> L8
            java.lang.String r6 = r0.getErrorMsg()     // Catch: java.lang.Exception -> L8
            r7 = 0
            r2.uploadLog(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L8
            r2 = r13
            goto Le9
        Ldb:
            xyz.adscope.amps.report.AMPSEventReportCode r4 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_ADSOURCE_BIDDING_COMPARE_SUCCESS_CODE     // Catch: java.lang.Exception -> L8
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            r7 = 0
            r2 = r13
            r2.uploadLog(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> Lf2
            goto Le9
        Le8:
            r1 = 0
        Le9:
            if (r14 != r9) goto Lef
            r13.handleC2SOrS2SFloorAdSourceBidResult(r3, r15, r1)     // Catch: java.lang.Exception -> Lf2
            return
        Lef:
            r13.handleC2SOrS2SAdSourceBidResult(r3, r15, r1)     // Catch: java.lang.Exception -> Lf2
        Lf2:
            return
    }

    @Override // xyz.adscope.amps.inner.AMPSAdBiddingListener
    public void onS2SBiddingFail(xyz.adscope.amps.base.AMPSBaseAdapter r9, xyz.adscope.amps.base.AMPSBaseBiddingResult r10) {
            r8 = this;
            if (r9 == 0) goto L4
            if (r10 != 0) goto L7
        L4:
            r1 = r8
            goto L98
        L7:
            java.lang.String r9 = r9.getNetworkSpaceId()     // Catch: java.lang.Exception -> L4
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L4
            if (r0 != 0) goto L4
            java.util.Map<java.lang.String, xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r8.loadAdResourceDatas     // Catch: java.lang.Exception -> L4
            boolean r0 = r0.containsKey(r9)     // Catch: java.lang.Exception -> L4
            if (r0 != 0) goto L1a
            goto L4
        L1a:
            java.util.Map<java.lang.String, xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r8.loadAdResourceDatas     // Catch: java.lang.Exception -> L4
            java.lang.Object r0 = r0.get(r9)     // Catch: java.lang.Exception -> L4
            r2 = r0
            xyz.adscope.amps.model.config.response.AdSourceModel r2 = (xyz.adscope.amps.model.config.response.AdSourceModel) r2     // Catch: java.lang.Exception -> L4
            if (r2 != 0) goto L26
            goto L4
        L26:
            int r0 = r2.getAdStatus()     // Catch: java.lang.Exception -> L4
            r1 = 5
            if (r0 != r1) goto L2e
            goto L4
        L2e:
            java.lang.String r0 = "amps_log_tag"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4
            r1.<init>()     // Catch: java.lang.Exception -> L4
            java.lang.String r3 = r8.TAG     // Catch: java.lang.Exception -> L4
            r1.append(r3)     // Catch: java.lang.Exception -> L4
            java.lang.String r3 = " onS2SBiddingFail  channel:"
            r1.append(r3)     // Catch: java.lang.Exception -> L4
            java.lang.String r3 = r2.getSeatId()     // Catch: java.lang.Exception -> L4
            r1.append(r3)     // Catch: java.lang.Exception -> L4
            java.lang.String r3 = ",spaceId:"
            r1.append(r3)     // Catch: java.lang.Exception -> L4
            r1.append(r9)     // Catch: java.lang.Exception -> L4
            java.lang.String r9 = ";adStatus:"
            r1.append(r9)     // Catch: java.lang.Exception -> L4
            int r9 = r2.getAdStatus()     // Catch: java.lang.Exception -> L4
            r1.append(r9)     // Catch: java.lang.Exception -> L4
            java.lang.String r9 = ";"
            r1.append(r9)     // Catch: java.lang.Exception -> L4
            java.lang.String r9 = r10.toString()     // Catch: java.lang.Exception -> L4
            r1.append(r9)     // Catch: java.lang.Exception -> L4
            java.lang.String r9 = r1.toString()     // Catch: java.lang.Exception -> L4
            xyz.adscope.amps.tool.AMPSLogUtil.d(r0, r9)     // Catch: java.lang.Exception -> L4
            r9 = 6
            r2.setAdStatus(r9)     // Catch: java.lang.Exception -> L4
            java.lang.String r4 = r10.getErrorCode()     // Catch: java.lang.Exception -> L4
            java.lang.String r5 = r10.getErrorMsg()     // Catch: java.lang.Exception -> L4
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L4
            long r6 = r2.getBiddingStartTime()     // Catch: java.lang.Exception -> L4
            long r6 = r0 - r6
            xyz.adscope.amps.report.AMPSEventReportCode r3 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_ADSOURCE_BIDDING_FAIL_CODE     // Catch: java.lang.Exception -> L4
            r1 = r8
            r1.uploadLog(r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L98
            int r9 = r2.getIsFloor()     // Catch: java.lang.Exception -> L98
            r0 = 1
            r3 = 4
            if (r9 != r0) goto L95
            r8.handleC2SOrS2SFloorAdSourceBidResult(r2, r10, r3)     // Catch: java.lang.Exception -> L98
            return
        L95:
            r8.handleC2SOrS2SAdSourceBidResult(r2, r10, r3)     // Catch: java.lang.Exception -> L98
        L98:
            return
    }

    @Override // xyz.adscope.amps.inner.AMPSAdBiddingListener
    public void onS2SBiddingSuccess(xyz.adscope.amps.base.AMPSBaseAdapter r14, xyz.adscope.amps.base.AMPSBaseBiddingResult r15) {
            r13 = this;
            if (r14 == 0) goto L8
            if (r15 == 0) goto L8
            xyz.adscope.amps.control.bid.inter.IPriceComparatorInterface r0 = r13.iPriceComparatorInterface     // Catch: java.lang.Exception -> L8
            if (r0 != 0) goto Lb
        L8:
            r2 = r13
            goto Lf2
        Lb:
            java.lang.String r0 = r14.getNetworkSpaceId()     // Catch: java.lang.Exception -> L8
            java.lang.String r14 = r14.getMediaCustomExtraInfo()     // Catch: java.lang.Exception -> L8
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L8
            if (r1 != 0) goto L8
            java.util.Map<java.lang.String, xyz.adscope.amps.model.config.response.AdSourceModel> r1 = r13.loadAdResourceDatas     // Catch: java.lang.Exception -> L8
            boolean r1 = r1.containsKey(r0)     // Catch: java.lang.Exception -> L8
            if (r1 != 0) goto L22
            goto L8
        L22:
            java.util.Map<java.lang.String, xyz.adscope.amps.model.config.response.AdSourceModel> r1 = r13.loadAdResourceDatas     // Catch: java.lang.Exception -> L8
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Exception -> L8
            r3 = r1
            xyz.adscope.amps.model.config.response.AdSourceModel r3 = (xyz.adscope.amps.model.config.response.AdSourceModel) r3     // Catch: java.lang.Exception -> L8
            if (r3 != 0) goto L2e
            goto L8
        L2e:
            int r1 = r3.getAdStatus()     // Catch: java.lang.Exception -> L8
            r2 = 5
            if (r1 != r2) goto L36
            goto L8
        L36:
            r13.updateC2SOrS2SAdSourceAdStatus(r3, r15)     // Catch: java.lang.Exception -> L8
            r13.modifyAdSourceAuctionStrategy(r3, r14)     // Catch: java.lang.Exception -> L8
            int r14 = r3.getIsFloor()     // Catch: java.lang.Exception -> L8
            int r1 = r13.mAdRequestType     // Catch: java.lang.Exception -> L8
            r9 = 1
            r10 = 2
            if (r1 == 0) goto L4e
            if (r1 == r10) goto L4e
            if (r14 != r9) goto L4b
            goto L4e
        L4b:
            r2 = r13
            goto Le8
        L4e:
            int r1 = r3.getAdStatus()     // Catch: java.lang.Exception -> L8
            r2 = 3
            if (r1 != r2) goto L4b
            xyz.adscope.amps.report.AMPSEventReportCode r4 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_ADSOURCE_BIDDING_COMPARE     // Catch: java.lang.Exception -> L8
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            r7 = 0
            r2 = r13
            r2.uploadLog(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> Lf2
            xyz.adscope.amps.control.bid.inter.IPriceComparatorInterface r1 = r2.iPriceComparatorInterface     // Catch: java.lang.Exception -> Lf2
            int r1 = r1.getComparePriceResult(r3)     // Catch: java.lang.Exception -> Lf2
            java.lang.String r4 = "amps_log_tag"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lf2
            r5.<init>()     // Catch: java.lang.Exception -> Lf2
            java.lang.String r6 = r2.TAG     // Catch: java.lang.Exception -> Lf2
            r5.append(r6)     // Catch: java.lang.Exception -> Lf2
            java.lang.String r6 = " onS2SBiddingSuccess  channel:"
            r5.append(r6)     // Catch: java.lang.Exception -> Lf2
            java.lang.String r6 = r3.getSeatId()     // Catch: java.lang.Exception -> Lf2
            r5.append(r6)     // Catch: java.lang.Exception -> Lf2
            java.lang.String r6 = ",spaceId:"
            r5.append(r6)     // Catch: java.lang.Exception -> Lf2
            r5.append(r0)     // Catch: java.lang.Exception -> Lf2
            java.lang.String r0 = ";adStatus:"
            r5.append(r0)     // Catch: java.lang.Exception -> Lf2
            int r0 = r3.getAdStatus()     // Catch: java.lang.Exception -> Lf2
            r5.append(r0)     // Catch: java.lang.Exception -> Lf2
            java.lang.String r0 = ",comparePriceResult:"
            r5.append(r0)     // Catch: java.lang.Exception -> Lf2
            r5.append(r1)     // Catch: java.lang.Exception -> Lf2
            java.lang.String r0 = ",result:"
            r5.append(r0)     // Catch: java.lang.Exception -> Lf2
            java.lang.String r0 = r15.toString()     // Catch: java.lang.Exception -> Lf2
            r5.append(r0)     // Catch: java.lang.Exception -> Lf2
            java.lang.String r0 = ",time:"
            r5.append(r0)     // Catch: java.lang.Exception -> Lf2
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> Lf2
            long r11 = r3.getBiddingStartTime()     // Catch: java.lang.Exception -> Lf2
            long r6 = r6 - r11
            r5.append(r6)     // Catch: java.lang.Exception -> Lf2
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Exception -> Lf2
            xyz.adscope.amps.tool.AMPSLogUtil.d(r4, r0)     // Catch: java.lang.Exception -> Lf2
            r3.setAdComparePriceStatus(r1)     // Catch: java.lang.Exception -> Lf2
            if (r1 == r10) goto Ldb
            r0 = 6
            r3.setAdStatus(r0)     // Catch: java.lang.Exception -> L8
            xyz.adscope.amps.report.AMPSEventReportCode r4 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_ADSOURCE_BIDDING_COMPARE_FAIL_CODE     // Catch: java.lang.Exception -> L8
            xyz.adscope.amps.common.AMPSErrorCode$ReportLogErrorEnum r0 = xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum.REPORT_LOG_ADSOURCE_BIDDING_COMPARE_FAIL     // Catch: java.lang.Exception -> L8
            java.lang.String r5 = r0.getErrorCode()     // Catch: java.lang.Exception -> L8
            java.lang.String r6 = r0.getErrorMsg()     // Catch: java.lang.Exception -> L8
            r7 = 0
            r2.uploadLog(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L8
            r2 = r13
            goto Le9
        Ldb:
            xyz.adscope.amps.report.AMPSEventReportCode r4 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_ADSOURCE_BIDDING_COMPARE_SUCCESS_CODE     // Catch: java.lang.Exception -> L8
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            r7 = 0
            r2 = r13
            r2.uploadLog(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> Lf2
            goto Le9
        Le8:
            r1 = 0
        Le9:
            if (r14 != r9) goto Lef
            r13.handleC2SOrS2SFloorAdSourceBidResult(r3, r15, r1)     // Catch: java.lang.Exception -> Lf2
            return
        Lef:
            r13.handleC2SOrS2SAdSourceBidResult(r3, r15, r1)     // Catch: java.lang.Exception -> Lf2
        Lf2:
            return
    }

    public void preLoad() {
            r0 = this;
            return
    }

    public void refreshListener(T r1) {
            r0 = this;
            r0.ampsLoadEventListener = r1
            return
    }

    protected void saveWinAdSourceMaterial() {
            r1 = this;
            r0 = 0
            r1.saveWinAdSourceMaterial(r0)     // Catch: java.lang.Exception -> L4
        L4:
            return
    }

    protected void saveWinAdSourceMaterial(android.view.View r4) {
            r3 = this;
            xyz.adscope.amps.manager.AMPSSDKManager r0 = xyz.adscope.amps.manager.AMPSSDKManager.getInstance()
            xyz.adscope.amps.init.inter.IAMPSInitInterface r0 = r0.getIAMPSInitInterface()
            xyz.adscope.amps.model.AMPSGlobalModel r0 = r0.getGlobalModel()
            xyz.adscope.amps.model.config.response.AMPSConfigResponseModel r1 = r0.getConfigureResponseModel()
            xyz.adscope.amps.model.config.response.MaterialManagerModel r1 = r1.getMaterialManager()
            if (r1 != 0) goto L17
            goto L23
        L17:
            int r1 = r1.getRandom()
            r2 = 100
            int r2 = xyz.adscope.amps.tool.util.AMPSRandomUtil.getRandomNum(r2)
            if (r2 <= r1) goto L24
        L23:
            return
        L24:
            xyz.adscope.amps.model.material.AMPSUploadMaterial r1 = new xyz.adscope.amps.model.material.AMPSUploadMaterial
            r1.<init>()
            java.lang.String r2 = r0.getAppId()
            r1.setAppId(r2)
            xyz.adscope.amps.config.AMPSRequestParameters r2 = r3.mAMPSRequestParameters
            java.lang.String r2 = r2.getSpaceId()
            r1.setSpaceId(r2)
            xyz.adscope.amps.model.config.response.AdSourceModel r2 = r3.mWinAdSourceModel
            java.lang.String r2 = r2.getSeatId()
            r1.setSeatId(r2)
            xyz.adscope.amps.model.config.response.AdSourceModel r2 = r3.mWinAdSourceModel
            java.lang.String r2 = r2.getAppId()
            r1.setSeatAppId(r2)
            xyz.adscope.amps.model.config.response.AdSourceModel r2 = r3.mWinAdSourceModel
            java.lang.String r2 = r2.getSpaceId()
            r1.setSeatSpaceId(r2)
            xyz.adscope.amps.model.config.response.AdSourceModel r2 = r3.mWinAdSourceModel
            java.lang.String r2 = r2.getAdType()
            r1.setAdType(r2)
            java.lang.String r0 = r0.getStartId()
            r1.setStartId(r0)
            java.lang.String r0 = r3.mSessionId
            r1.setSessionId(r0)
            android.content.Context r0 = r3.mContext
            xyz.adscope.common.info.DeviceInfo r0 = xyz.adscope.common.info.DeviceInfo.getInstance(r0)
            java.lang.String r0 = r0.getSdkid()
            r1.setSaid(r0)
            if (r4 == 0) goto L7a
            r3.currentViewGroup = r4
        L7a:
            xyz.adscope.amps.tool.material.MaterialManager r4 = new xyz.adscope.amps.tool.material.MaterialManager
            android.content.Context r0 = r3.mContext
            android.view.View r2 = r3.currentViewGroup
            r4.<init>(r0, r2, r1)
            r4.saveMaterial()
            return
    }

    public void show(android.app.Activity r2) {
            r1 = this;
            if (r2 == 0) goto L10
            xyz.adscope.amps.base.AMPSBaseAdapter r0 = r1.mAMPSBaseAdapter     // Catch: java.lang.Exception -> L1d
            if (r0 != 0) goto L7
            goto L10
        L7:
            r0.refreshAMPSAdAdapterListener(r1)     // Catch: java.lang.Exception -> L1d
            xyz.adscope.amps.base.AMPSBaseAdapter r0 = r1.mAMPSBaseAdapter     // Catch: java.lang.Exception -> L1d
            r0.showAd(r2)     // Catch: java.lang.Exception -> L1d
            return
        L10:
            xyz.adscope.amps.common.AMPSErrorCode$ASMPLogicErrorEnum r2 = xyz.adscope.amps.common.AMPSErrorCode.ASMPLogicErrorEnum.PLATFORM_ERROR_SHOW_ERROR     // Catch: java.lang.Exception -> L1d
            java.lang.String r0 = r2.getErrorCode()     // Catch: java.lang.Exception -> L1d
            java.lang.String r2 = r2.getErrorMsg()     // Catch: java.lang.Exception -> L1d
            r1.callBackAdLoadFail(r0, r2)     // Catch: java.lang.Exception -> L1d
        L1d:
            return
    }

    public void show(android.view.ViewGroup r2) {
            r1 = this;
            r1.currentViewGroup = r2
            if (r2 == 0) goto L12
            xyz.adscope.amps.base.AMPSBaseAdapter r0 = r1.mAMPSBaseAdapter     // Catch: java.lang.Exception -> L1f
            if (r0 != 0) goto L9
            goto L12
        L9:
            r0.refreshAMPSAdAdapterListener(r1)     // Catch: java.lang.Exception -> L1f
            xyz.adscope.amps.base.AMPSBaseAdapter r0 = r1.mAMPSBaseAdapter     // Catch: java.lang.Exception -> L1f
            r0.showAd(r2)     // Catch: java.lang.Exception -> L1f
            return
        L12:
            xyz.adscope.amps.common.AMPSErrorCode$ASMPLogicErrorEnum r2 = xyz.adscope.amps.common.AMPSErrorCode.ASMPLogicErrorEnum.PLATFORM_ERROR_SHOW_ERROR     // Catch: java.lang.Exception -> L1f
            java.lang.String r0 = r2.getErrorCode()     // Catch: java.lang.Exception -> L1f
            java.lang.String r2 = r2.getErrorMsg()     // Catch: java.lang.Exception -> L1f
            r1.callBackAdLoadFail(r0, r2)     // Catch: java.lang.Exception -> L1f
        L1f:
            return
    }

    public void startLoad() {
            r15 = this;
            boolean r0 = r15.isFirstLoadAd     // Catch: java.lang.Exception -> L18
            if (r0 == 0) goto L1b
            xyz.adscope.amps.model.config.response.SpaceModel r0 = r15.mSpaceModel     // Catch: java.lang.Exception -> L18
            if (r0 != 0) goto L1b
            xyz.adscope.amps.manager.AMPSSDKManager r0 = xyz.adscope.amps.manager.AMPSSDKManager.getInstance()     // Catch: java.lang.Exception -> L18
            xyz.adscope.amps.manager.AMPSBaseOpenApiManager$1 r1 = new xyz.adscope.amps.manager.AMPSBaseOpenApiManager$1     // Catch: java.lang.Exception -> L18
            r1.<init>(r15)     // Catch: java.lang.Exception -> L18
            r0.setInitResultCallBack(r1)     // Catch: java.lang.Exception -> L18
            r0 = 0
            r15.isFirstLoadAd = r0     // Catch: java.lang.Exception -> L18
            return
        L18:
            r8 = r15
            goto Lbe
        L1b:
            xyz.adscope.amps.report.AMPSEventReportCode r3 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_MEDIATION_LOAD_CODE     // Catch: java.lang.Exception -> L18
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            r6 = 0
            r2 = 0
            r1 = r15
            r1.uploadLog(r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> Lbd
            r8 = r1
            xyz.adscope.amps.model.config.response.SpaceModel r0 = r8.mSpaceModel     // Catch: java.lang.Exception -> Lbe
            r1 = 1
            if (r0 == 0) goto Lad
            xyz.adscope.amps.config.AMPSRequestParameters r0 = r8.mAMPSRequestParameters     // Catch: java.lang.Exception -> Lbe
            if (r0 == 0) goto Lad
            xyz.adscope.amps.control.filter.inter.IFilterInterface r0 = r8.iFilterInterface     // Catch: java.lang.Exception -> Lbe
            if (r0 == 0) goto Lad
            xyz.adscope.amps.control.dispatch.inter.IDispatcherInterface r0 = r8.iDispatcherInterface     // Catch: java.lang.Exception -> Lbe
            if (r0 != 0) goto L3b
            goto Lad
        L3b:
            xyz.adscope.amps.report.AMPSEventReportCode r10 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_SPACE_FILTER_CODE     // Catch: java.lang.Exception -> Lbe
            java.lang.String r11 = ""
            java.lang.String r12 = ""
            r13 = 0
            r9 = 0
            r8.uploadLog(r9, r10, r11, r12, r13)     // Catch: java.lang.Exception -> Lbe
            xyz.adscope.amps.control.filter.inter.IFilterInterface r0 = r8.iFilterInterface     // Catch: java.lang.Exception -> Lbe
            boolean r0 = r0.platformFilter()     // Catch: java.lang.Exception -> Lbe
            if (r0 != 0) goto L6b
            r8.isDispatchFloorAdSource = r1     // Catch: java.lang.Exception -> Lbe
            xyz.adscope.amps.report.AMPSEventReportCode r10 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_SPACE_FILTER_FAIL_CODE     // Catch: java.lang.Exception -> Lbe
            java.lang.String r11 = ""
            java.lang.String r12 = ""
            r13 = 0
            r9 = 0
            r8.uploadLog(r9, r10, r11, r12, r13)     // Catch: java.lang.Exception -> Lbe
            xyz.adscope.amps.common.AMPSErrorCode$ASMPLogicErrorEnum r0 = xyz.adscope.amps.common.AMPSErrorCode.ASMPLogicErrorEnum.PLATFORM_ERROR_FILTER_NOT_PASS     // Catch: java.lang.Exception -> Lbe
            java.lang.String r1 = r0.getErrorCode()     // Catch: java.lang.Exception -> Lbe
            java.lang.String r0 = r0.getErrorMsg()     // Catch: java.lang.Exception -> Lbe
            r15.callBackAdLoadFail(r1, r0)     // Catch: java.lang.Exception -> Lbe
            return
        L6b:
            xyz.adscope.amps.report.AMPSEventReportCode r10 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_SPACE_FILTER_SUCCESS_CODE     // Catch: java.lang.Exception -> Lbe
            java.lang.String r11 = ""
            java.lang.String r12 = ""
            r13 = 0
            r9 = 0
            r8.uploadLog(r9, r10, r11, r12, r13)     // Catch: java.lang.Exception -> Lbe
            r15.createAMPSInitCustomAdapterConfig()     // Catch: java.lang.Exception -> Lbe
            java.lang.String r0 = ""
            java.lang.String r1 = "request"
            r15.addFilterEvent(r0, r1)     // Catch: java.lang.Exception -> Lbe
            r15.handlerBiddingTimeout()     // Catch: java.lang.Exception -> Lbe
            r15.handlerRequestedTimeout()     // Catch: java.lang.Exception -> Lbe
            xyz.adscope.amps.report.AMPSEventReportCode r10 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_FORWARD_BEGIN_CODE     // Catch: java.lang.Exception -> Lbe
            java.lang.String r11 = ""
            java.lang.String r12 = ""
            r13 = 0
            r9 = 0
            r8.uploadLog(r9, r10, r11, r12, r13)     // Catch: java.lang.Exception -> Lbe
            xyz.adscope.amps.control.dispatch.inter.IDispatcherInterface r0 = r8.iDispatcherInterface     // Catch: java.lang.Exception -> Lbe
            r1 = 0
            java.util.List r0 = r0.dispatch(r1)     // Catch: java.lang.Exception -> Lbe
            xyz.adscope.amps.report.AMPSEventReportCode r10 = xyz.adscope.amps.report.AMPSEventReportCode.EVENT_FORWARD_RESULT_CODE     // Catch: java.lang.Exception -> Lbe
            java.lang.String r11 = ""
            java.lang.String r12 = ""
            r13 = 0
            r9 = 0
            r8.uploadLog(r9, r10, r11, r12, r13)     // Catch: java.lang.Exception -> Lbe
            r15.dispatchAdSource(r0)     // Catch: java.lang.Exception -> Lbe
            r15.dispatchAdSourceByFloor()     // Catch: java.lang.Exception -> Lbe
            return
        Lad:
            r8.isDispatchFloorAdSource = r1     // Catch: java.lang.Exception -> Lbe
            xyz.adscope.amps.common.AMPSErrorCode$ASMPLogicErrorEnum r0 = xyz.adscope.amps.common.AMPSErrorCode.ASMPLogicErrorEnum.PLATFORM_ERROR_PARAM_ERROR     // Catch: java.lang.Exception -> Lbe
            java.lang.String r1 = r0.getErrorCode()     // Catch: java.lang.Exception -> Lbe
            java.lang.String r0 = r0.getErrorMsg()     // Catch: java.lang.Exception -> Lbe
            r15.callBackAdLoadFail(r1, r0)     // Catch: java.lang.Exception -> Lbe
            return
        Lbd:
            r8 = r1
        Lbe:
            return
    }

    public synchronized void uploadLog(xyz.adscope.amps.model.config.response.AdSourceModel r3, xyz.adscope.amps.report.AMPSEventReportCode r4, java.lang.String r5, java.lang.String r6, long r7) {
            r2 = this;
            monitor-enter(r2)
            xyz.adscope.amps.model.AMPSCycleModel r0 = new xyz.adscope.amps.model.AMPSCycleModel     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            r0.<init>()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            xyz.adscope.amps.manager.AMPSSDKManager r1 = xyz.adscope.amps.manager.AMPSSDKManager.getInstance()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            java.lang.String r1 = r1.getAppId()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            r0.setMediationAppId(r1)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            java.lang.String r1 = r2.mSpaceId     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            r0.setMediationSpaceId(r1)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            r0.setErrorCode(r5)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            r0.setErrorMsg(r6)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            r0.setRoundTripTime(r7)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            if (r3 == 0) goto Lc3
            java.lang.String r5 = r3.getAppId()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            r0.setAdSourceAppId(r5)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            java.lang.String r5 = r3.getSeatId()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            r0.setAdSourceId(r5)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            java.lang.String r5 = r3.getSpaceId()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            r0.setAdSourceSpaceId(r5)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            r5.<init>()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            int r6 = r3.getReportEcpm()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            r5.append(r6)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            java.lang.String r6 = ""
            r5.append(r6)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            r0.setEcpm(r5)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            java.lang.String r5 = r3.getCustomData()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            r0.setAdSourceCustomData(r5)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            java.lang.String r5 = r3.getBiddingType()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            r0.setBidType(r5)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            r5.<init>()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            int r6 = r3.getFloorEcpm()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            r5.append(r6)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            java.lang.String r6 = ""
            r5.append(r6)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            r0.setFloorPrice(r5)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            xyz.adscope.amps.model.config.response.AuctionStrategyModel r5 = r3.getAuctionStrategy()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            if (r5 == 0) goto La0
            boolean r6 = r5.isHit()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            if (r6 == 0) goto L86
            java.lang.String r6 = "1"
            goto L88
        L83:
            r3 = move-exception
            goto L141
        L86:
            java.lang.String r6 = "0"
        L88:
            r0.setIsHitAuction(r6)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            boolean r6 = r5.isUseLastLook()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            if (r6 == 0) goto L94
            java.lang.String r6 = "1"
            goto L96
        L94:
            java.lang.String r6 = "0"
        L96:
            r0.setIsLastLook(r6)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            java.lang.String r5 = r5.getCustomData()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            r0.setBidStrategyCustomData(r5)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
        La0:
            java.lang.String r5 = r3.getNoticePrice()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            r0.setNoticePrice(r5)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            java.lang.String r5 = r3.getLossReason()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            r0.setLossReason(r5)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            java.lang.String r5 = r3.getRealPrice()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            r0.setRealPrice(r5)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            java.lang.String r5 = r3.getBidSeatId()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            r0.setBidSeatId(r5)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            java.lang.String r3 = r3.getBidSpaceId()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            r0.setBidSpaceId(r3)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
        Lc3:
            xyz.adscope.amps.config.AMPSRequestParameters r3 = r2.mAMPSRequestParameters     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            if (r3 == 0) goto Le8
            java.lang.String r3 = r3.getLoadType()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            r0.setLoadType(r3)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            r3.<init>()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            xyz.adscope.amps.config.AMPSRequestParameters r5 = r2.mAMPSRequestParameters     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            int r5 = r5.getAdCount()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            r3.append(r5)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            java.lang.String r5 = ""
            r3.append(r5)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            r0.setAdCount(r3)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
        Le8:
            xyz.adscope.amps.model.config.response.SpaceModel r3 = r2.mSpaceModel     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            if (r3 == 0) goto L135
            java.lang.String r3 = r3.getAdType()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            r0.setAdType(r3)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            java.lang.String r3 = r2.mSessionId     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            r0.setSessionId(r3)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            xyz.adscope.amps.model.config.response.SpaceModel r3 = r2.mSpaceModel     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            java.lang.String r3 = r3.getCustomData()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            r0.setSpaceCustomData(r3)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            r3.<init>()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            xyz.adscope.amps.model.config.response.SpaceModel r5 = r2.mSpaceModel     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            long r5 = r5.getAdsTimeout()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            r3.append(r5)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            java.lang.String r5 = ""
            r3.append(r5)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            r0.setMaxWaitTime(r3)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            r3.<init>()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            xyz.adscope.amps.model.config.response.SpaceModel r5 = r2.mSpaceModel     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            long r5 = r5.getAdTimeout()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            r3.append(r5)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            java.lang.String r5 = ""
            r3.append(r5)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            r0.setAdTimeOut(r3)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
        L135:
            xyz.adscope.amps.report.AMPSReportLoader r3 = xyz.adscope.amps.report.AMPSReportLoader.getInstance()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            java.lang.String r4 = r4.getCodeStr()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            r3.reportAdLog(r0, r4)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L143
            goto L143
        L141:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L83
            throw r3
        L143:
            monitor-exit(r2)
            return
    }
}
