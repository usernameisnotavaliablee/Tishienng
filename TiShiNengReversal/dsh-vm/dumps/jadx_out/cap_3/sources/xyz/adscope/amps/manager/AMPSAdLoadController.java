package xyz.adscope.amps.manager;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSAdLoadController implements xyz.adscope.amps.manager.inter.IAdLoadControllerInterface {
    private final java.lang.String TAG;
    private xyz.adscope.amps.manager.inter.IAdControllerDispatcherCallBack iAdControllerDispatcherCallBack;
    private xyz.adscope.amps.control.bid.inter.IPriceComparatorInterface iBidInterface;
    private xyz.adscope.amps.control.cache.inter.ICacheControllerInterface iCacheControllerInterface;
    private xyz.adscope.amps.config.inter.IConfigInterface iConfigInterface;
    private xyz.adscope.amps.control.dispatch.inter.IDispatcherInterface iDispatcherInterface;
    private xyz.adscope.amps.control.filter.inter.IFilterInterface iFilterInterface;
    private xyz.adscope.amps.control.preload.inter.IPreLoadInterface iPreLoadInterface;
    private boolean isHasLoadingSuccess;
    private java.util.TimerTask mBiddingTimerTask;
    private android.content.Context mContext;
    private java.util.TimerTask mFloorDispatcherTimerTask;
    private xyz.adscope.amps.model.config.response.SpaceModel mSpaceModel;



    public AMPSAdLoadController(android.content.Context r2, xyz.adscope.amps.model.config.response.SpaceModel r3, xyz.adscope.amps.manager.inter.IAdControllerDispatcherCallBack r4) {
            r1 = this;
            r1.<init>()
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.TAG = r0
            r0 = 0
            r1.isHasLoadingSuccess = r0
            r0 = 0
            r1.mFloorDispatcherTimerTask = r0
            r1.mBiddingTimerTask = r0
            r1.mContext = r2
            r1.iAdControllerDispatcherCallBack = r4
            xyz.adscope.amps.config.AMPSConfigManager r2 = new xyz.adscope.amps.config.AMPSConfigManager
            r2.<init>()
            r1.iConfigInterface = r2
            r1.mSpaceModel = r3
            xyz.adscope.amps.control.dispatch.AMPSDispatcher r2 = new xyz.adscope.amps.control.dispatch.AMPSDispatcher
            r2.<init>(r3)
            r1.iDispatcherInterface = r2
            return
    }

    static /* synthetic */ boolean access$000(xyz.adscope.amps.manager.AMPSAdLoadController r0) {
            boolean r0 = r0.isHasLoadingSuccess
            return r0
    }

    static /* synthetic */ xyz.adscope.amps.manager.inter.IAdControllerDispatcherCallBack access$100(xyz.adscope.amps.manager.AMPSAdLoadController r0) {
            xyz.adscope.amps.manager.inter.IAdControllerDispatcherCallBack r0 = r0.iAdControllerDispatcherCallBack
            return r0
    }

    static /* synthetic */ xyz.adscope.amps.model.config.response.SpaceModel access$200(xyz.adscope.amps.manager.AMPSAdLoadController r0) {
            xyz.adscope.amps.model.config.response.SpaceModel r0 = r0.mSpaceModel
            return r0
    }

    static /* synthetic */ java.lang.String access$300(xyz.adscope.amps.manager.AMPSAdLoadController r0) {
            java.lang.String r0 = r0.TAG
            return r0
    }

    static /* synthetic */ xyz.adscope.amps.control.dispatch.inter.IDispatcherInterface access$400(xyz.adscope.amps.manager.AMPSAdLoadController r0) {
            xyz.adscope.amps.control.dispatch.inter.IDispatcherInterface r0 = r0.iDispatcherInterface
            return r0
    }

    private void handleBiddingTimeOut() {
            r4 = this;
            xyz.adscope.amps.model.config.response.SpaceModel r0 = r4.mSpaceModel     // Catch: java.lang.Exception -> L46
            if (r0 == 0) goto L46
            int r0 = r0.getBidDistributionMethod()     // Catch: java.lang.Exception -> L46
            r1 = 1
            if (r0 != r1) goto L46
            xyz.adscope.amps.model.config.response.SpaceModel r0 = r4.mSpaceModel     // Catch: java.lang.Exception -> L46
            java.util.List r0 = r0.getS2sAdSourceList()     // Catch: java.lang.Exception -> L46
            if (r0 == 0) goto L1f
            xyz.adscope.amps.model.config.response.SpaceModel r0 = r4.mSpaceModel     // Catch: java.lang.Exception -> L46
            java.util.List r0 = r0.getS2sAdSourceList()     // Catch: java.lang.Exception -> L46
            int r0 = r0.size()     // Catch: java.lang.Exception -> L46
            if (r0 > 0) goto L33
        L1f:
            xyz.adscope.amps.model.config.response.SpaceModel r0 = r4.mSpaceModel     // Catch: java.lang.Exception -> L46
            java.util.List r0 = r0.getC2sAdSourceList()     // Catch: java.lang.Exception -> L46
            if (r0 == 0) goto L46
            xyz.adscope.amps.model.config.response.SpaceModel r0 = r4.mSpaceModel     // Catch: java.lang.Exception -> L46
            java.util.List r0 = r0.getC2sAdSourceList()     // Catch: java.lang.Exception -> L46
            int r0 = r0.size()     // Catch: java.lang.Exception -> L46
            if (r0 <= 0) goto L46
        L33:
            android.os.Handler r0 = new android.os.Handler     // Catch: java.lang.Exception -> L46
            r0.<init>()     // Catch: java.lang.Exception -> L46
            xyz.adscope.amps.manager.AMPSAdLoadController$2 r1 = new xyz.adscope.amps.manager.AMPSAdLoadController$2     // Catch: java.lang.Exception -> L46
            r1.<init>(r4)     // Catch: java.lang.Exception -> L46
            xyz.adscope.amps.model.config.response.SpaceModel r2 = r4.mSpaceModel     // Catch: java.lang.Exception -> L46
            long r2 = r2.getBidAdTimeout()     // Catch: java.lang.Exception -> L46
            r0.postDelayed(r1, r2)     // Catch: java.lang.Exception -> L46
        L46:
            return
    }

    @Override // xyz.adscope.amps.manager.inter.IAdLoadControllerInterface
    public void bidPrice() {
            r0 = this;
            return
    }

    @Override // xyz.adscope.amps.manager.inter.IAdLoadControllerInterface
    public void cacheAdSource() {
            r0 = this;
            return
    }

    @Override // xyz.adscope.amps.manager.inter.IAdLoadControllerInterface
    public void configManager() {
            r0 = this;
            return
    }

    @Override // xyz.adscope.amps.manager.inter.IAdLoadControllerInterface
    public void dispatcher(xyz.adscope.amps.model.config.response.AdSourceModel r1) {
            r0 = this;
            return
    }

    @Override // xyz.adscope.amps.manager.inter.IAdLoadControllerInterface
    public void filter() {
            r0 = this;
            return
    }

    @Override // xyz.adscope.amps.manager.inter.IAdLoadControllerInterface
    public xyz.adscope.amps.model.config.response.SpaceModel getSpaceModel() {
            r1 = this;
            xyz.adscope.amps.model.config.response.SpaceModel r0 = r1.mSpaceModel
            return r0
    }

    @Override // xyz.adscope.amps.manager.inter.IAdLoadControllerInterface
    public void loadAd() {
            r4 = this;
            r4.preLoad()
            r4.configManager()
            r4.handleBiddingTimeOut()
            r0 = 0
            r4.dispatcher(r0)
            xyz.adscope.amps.manager.inter.IAdControllerDispatcherCallBack r0 = r4.iAdControllerDispatcherCallBack
            if (r0 == 0) goto L3e
            xyz.adscope.amps.model.config.response.SpaceModel r0 = r4.mSpaceModel
            if (r0 == 0) goto L3e
            java.util.List r0 = r0.getS2sAdSourceList()
            if (r0 == 0) goto L3e
            xyz.adscope.amps.model.config.response.SpaceModel r0 = r4.mSpaceModel
            java.util.List r0 = r0.getS2sAdSourceList()
            int r0 = r0.size()
            if (r0 <= 0) goto L3e
            xyz.adscope.amps.control.dispatch.inter.IDispatcherInterface r0 = r4.iDispatcherInterface
            xyz.adscope.amps.model.config.response.SpaceModel r1 = r4.mSpaceModel
            java.util.List r1 = r1.getS2sAdSourceList()
            r2 = 1
            r0.updateAdSourceAdStatus(r1, r2)
            xyz.adscope.amps.manager.inter.IAdControllerDispatcherCallBack r0 = r4.iAdControllerDispatcherCallBack
            xyz.adscope.amps.model.config.response.SpaceModel r1 = r4.mSpaceModel
            java.util.List r1 = r1.getS2sAdSourceList()
            r0.dispatchResult(r1)
        L3e:
            xyz.adscope.amps.model.config.response.SpaceModel r0 = r4.mSpaceModel
            if (r0 == 0) goto L68
            java.util.List r0 = r0.getFloorAdSourceList()
            if (r0 == 0) goto L68
            xyz.adscope.amps.model.config.response.SpaceModel r0 = r4.mSpaceModel
            java.util.List r0 = r0.getFloorAdSourceList()
            int r0 = r0.size()
            if (r0 <= 0) goto L68
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            xyz.adscope.amps.manager.AMPSAdLoadController$1 r1 = new xyz.adscope.amps.manager.AMPSAdLoadController$1
            r1.<init>(r4)
            xyz.adscope.amps.model.config.response.SpaceModel r2 = r4.mSpaceModel
            int r2 = r2.getFloorDelayTime()
            long r2 = (long) r2
            r0.postDelayed(r1, r2)
        L68:
            return
    }

    @Override // xyz.adscope.amps.manager.inter.IAdLoadControllerInterface
    public void preLoad() {
            r0 = this;
            return
    }

    @Override // xyz.adscope.amps.manager.inter.IAdLoadControllerInterface
    public void setHasLoadingSuccessAdResource() {
            r1 = this;
            r0 = 1
            r1.isHasLoadingSuccess = r0
            return
    }
}
