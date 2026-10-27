package xyz.adscope.amps.manager;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSAdSourceDataProvider {
    private static xyz.adscope.amps.manager.AMPSAdSourceDataProvider mInstance;
    private xyz.adscope.amps.model.AMPSGlobalModel globalModel;

    public AMPSAdSourceDataProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    private java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> buildAdSourceModelList(java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r5) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L9:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L120
            java.lang.Object r1 = r5.next()
            xyz.adscope.amps.model.config.response.AdSourceModel r1 = (xyz.adscope.amps.model.config.response.AdSourceModel) r1
            xyz.adscope.amps.model.config.response.AdSourceModel r2 = new xyz.adscope.amps.model.config.response.AdSourceModel
            r2.<init>()
            java.lang.String r3 = r1.getAppId()
            r2.setAppId(r3)
            java.lang.String r3 = r1.getSpaceId()
            r2.setSpaceId(r3)
            java.lang.String r3 = r1.getAdType()
            r2.setAdType(r3)
            java.lang.String r3 = r1.getSeatId()
            r2.setSeatId(r3)
            java.lang.String r3 = r1.getAdapterManagerClass()
            r2.setAdapterManagerClass(r3)
            java.lang.String r3 = r1.getAdapterClass()
            r2.setAdapterClass(r3)
            java.lang.String r3 = r1.getBiddingType()
            r2.setBiddingType(r3)
            java.lang.String r3 = r1.getRenderType()
            r2.setRenderType(r3)
            int r3 = r1.getEcpm()
            r2.setEcpm(r3)
            int r3 = r1.getFloorEcpm()
            r2.setFloorEcpm(r3)
            int r3 = r1.getIsFloor()
            r2.setIsFloor(r3)
            int r3 = r1.getPriority()
            r2.setPriority(r3)
            int r3 = r1.getAdsTimeout()
            r2.setAdsTimeout(r3)
            int r3 = r1.getBiddingTimeout()
            r2.setBiddingTimeout(r3)
            int r3 = r1.getCachedOffersTimeout()
            r2.setCachedOffersTimeout(r3)
            int r3 = r1.getAutoRefreshSwitch()
            r2.setAutoRefreshSwitch(r3)
            java.lang.String r3 = r1.getOrientation()
            r2.setOrientation(r3)
            java.lang.String r3 = r1.getZoomout()
            r2.setZoomout(r3)
            int r3 = r1.getVideoSound()
            r2.setVideoSound(r3)
            int r3 = r1.getVideoMaxTime()
            r2.setVideoMaxTime(r3)
            int r3 = r1.getVideoAutoPlay()
            r2.setVideoAutoPlay(r3)
            java.lang.String r3 = r1.getCustomData()
            r2.setCustomData(r3)
            xyz.adscope.amps.model.config.response.FilterModel r3 = r1.getFilter()
            if (r3 == 0) goto Lc5
            xyz.adscope.amps.model.config.response.FilterModel r3 = r1.getFilter()
            xyz.adscope.amps.model.config.response.FilterModel r3 = r4.buildFilterModel(r3)
            r2.setFilter(r3)
        Lc5:
            int r3 = r1.getAdStatus()
            r2.setAdStatus(r3)
            int r3 = r1.getStartWeight()
            r2.setStartWeight(r3)
            int r3 = r1.getEndWeight()
            r2.setEndWeight(r3)
            java.util.List r3 = r1.getTemplateTypes()
            if (r3 == 0) goto Lf1
            java.util.List r3 = r1.getTemplateTypes()
            int r3 = r3.size()
            if (r3 <= 0) goto Lf1
            java.util.List r3 = r1.getTemplateTypes()
            r2.setTemplateTypes(r3)
        Lf1:
            int r3 = r1.getIsSendBidData()
            r2.setIsSendBidData(r3)
            java.lang.String r3 = r1.getAccountId()
            r2.setAccountId(r3)
            java.lang.String r3 = r1.getServerUrl()
            r2.setServerUrl(r3)
            java.lang.String r3 = r1.getPublicKey()
            r2.setPublicKey(r3)
            java.util.List r3 = r1.getWinNoticeRule()
            r2.setWinNoticeRule(r3)
            java.util.List r1 = r1.getLossNoticeRule()
            r2.setLossNoticeRule(r1)
            r0.add(r2)
            goto L9
        L120:
            return r0
    }

    private xyz.adscope.amps.model.config.response.FilterModel buildFilterModel(xyz.adscope.amps.model.config.response.FilterModel r7) {
            r6 = this;
            if (r7 != 0) goto L4
            r7 = 0
            return r7
        L4:
            xyz.adscope.amps.model.config.response.FilterModel r0 = new xyz.adscope.amps.model.config.response.FilterModel
            r0.<init>()
            long r1 = r7.getMinLoadTime()
            r0.setMinLoadTime(r1)
            java.util.List r7 = r7.getFrequency()
            if (r7 == 0) goto L52
            int r1 = r7.size()
            if (r1 <= 0) goto L52
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r7 = r7.iterator()
        L25:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L4f
            java.lang.Object r2 = r7.next()
            xyz.adscope.amps.model.config.response.FrequencyModel r2 = (xyz.adscope.amps.model.config.response.FrequencyModel) r2
            xyz.adscope.amps.model.config.response.FrequencyModel r3 = new xyz.adscope.amps.model.config.response.FrequencyModel
            r3.<init>()
            int r4 = r2.getCount()
            r3.setCount(r4)
            java.lang.String r4 = r2.getEvent()
            r3.setEvent(r4)
            long r4 = r2.getTime()
            r3.setTime(r4)
            r1.add(r3)
            goto L25
        L4f:
            r0.setFrequency(r1)
        L52:
            return r0
    }

    private xyz.adscope.amps.model.config.response.SpaceModel copySpaceModel(xyz.adscope.amps.model.config.response.SpaceModel r4) {
            r3 = this;
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            xyz.adscope.amps.model.config.response.SpaceModel r0 = new xyz.adscope.amps.model.config.response.SpaceModel
            r0.<init>()
            java.lang.String r1 = r4.getSpaceId()
            r0.setSpaceId(r1)
            int r1 = r4.getBidDistributionMethod()
            r0.setBidDistributionMethod(r1)
            java.lang.String r1 = r4.getAdType()
            r0.setAdType(r1)
            int r1 = r4.getWaterfallParallelNum()
            r0.setWaterfallParallelNum(r1)
            long r1 = r4.getAdTimeout()
            r0.setAdTimeout(r1)
            long r1 = r4.getAdsTimeout()
            r0.setAdsTimeout(r1)
            long r1 = r4.getBidAdTimeout()
            r0.setBidAdTimeout(r1)
            int r1 = r4.getBidParallelNum()
            r0.setBidParallelNum(r1)
            int r1 = r4.getAdFloorEcpm()
            r0.setAdFloorEcpm(r1)
            int r1 = r4.getBidFloorEcpm()
            r0.setBidFloorEcpm(r1)
            int r1 = r4.getCachedOffersNum()
            r0.setCachedOffersNum(r1)
            int r1 = r4.getCachedOffersTimeout()
            r0.setCachedOffersTimeout(r1)
            int r1 = r4.getAutoRefreshSwitch()
            r0.setAutoRefreshSwitch(r1)
            int r1 = r4.getAutoRefreshTime()
            r0.setAutoRefreshTime(r1)
            int r1 = r4.getFloorDelayTime()
            r0.setFloorDelayTime(r1)
            java.util.List r1 = r4.getS2sAdSourceList()
            if (r1 == 0) goto L8d
            java.util.List r1 = r4.getS2sAdSourceList()
            int r1 = r1.size()
            if (r1 <= 0) goto L8d
            java.util.List r1 = r4.getS2sAdSourceList()
            java.util.List r1 = r3.buildAdSourceModelList(r1)
            r0.setS2sAdSourceList(r1)
        L8d:
            java.util.List r1 = r4.getC2sAdSourceList()
            if (r1 == 0) goto La8
            java.util.List r1 = r4.getC2sAdSourceList()
            int r1 = r1.size()
            if (r1 <= 0) goto La8
            java.util.List r1 = r4.getC2sAdSourceList()
            java.util.List r1 = r3.buildAdSourceModelList(r1)
            r0.setC2sAdSourceList(r1)
        La8:
            java.util.List r1 = r4.getWfAdSourceList()
            if (r1 == 0) goto Lc3
            java.util.List r1 = r4.getWfAdSourceList()
            int r1 = r1.size()
            if (r1 <= 0) goto Lc3
            java.util.List r1 = r4.getWfAdSourceList()
            java.util.List r1 = r3.buildAdSourceModelList(r1)
            r0.setWfAdSourceList(r1)
        Lc3:
            java.util.List r1 = r4.getFloorAdSourceList()
            if (r1 == 0) goto Lde
            java.util.List r1 = r4.getFloorAdSourceList()
            int r1 = r1.size()
            if (r1 <= 0) goto Lde
            java.util.List r1 = r4.getFloorAdSourceList()
            java.util.List r1 = r3.buildAdSourceModelList(r1)
            r0.setFloorAdSourceList(r1)
        Lde:
            xyz.adscope.amps.model.config.response.FilterModel r1 = r4.getFilter()
            if (r1 == 0) goto Lef
            xyz.adscope.amps.model.config.response.FilterModel r1 = r4.getFilter()
            xyz.adscope.amps.model.config.response.FilterModel r1 = r3.buildFilterModel(r1)
            r0.setFilter(r1)
        Lef:
            java.lang.String r1 = r4.getExt()
            r0.setExt(r1)
            r1 = 1000(0x3e8, float:1.401E-42)
            int r1 = xyz.adscope.amps.tool.util.AMPSRandomUtil.getRandomNum(r1)
            r0.setWeightRandomNum(r1)
            java.lang.String r4 = r4.getCustomData()
            r0.setCustomData(r4)
            return r0
    }

    public static xyz.adscope.amps.manager.AMPSAdSourceDataProvider getInstance() {
            xyz.adscope.amps.manager.AMPSAdSourceDataProvider r0 = xyz.adscope.amps.manager.AMPSAdSourceDataProvider.mInstance
            if (r0 != 0) goto L19
            java.lang.Class<xyz.adscope.amps.manager.AMPSAdSourceDataProvider> r0 = xyz.adscope.amps.manager.AMPSAdSourceDataProvider.class
            monitor-enter(r0)
            xyz.adscope.amps.manager.AMPSAdSourceDataProvider r1 = xyz.adscope.amps.manager.AMPSAdSourceDataProvider.mInstance     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            xyz.adscope.amps.manager.AMPSAdSourceDataProvider r1 = new xyz.adscope.amps.manager.AMPSAdSourceDataProvider     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            xyz.adscope.amps.manager.AMPSAdSourceDataProvider.mInstance = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            xyz.adscope.amps.manager.AMPSAdSourceDataProvider r0 = xyz.adscope.amps.manager.AMPSAdSourceDataProvider.mInstance
            return r0
    }

    private xyz.adscope.amps.model.config.response.AdSourceModel getSingleAdSourceByAdapterName(java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r3, java.lang.String r4) {
            r2 = this;
            if (r3 == 0) goto L23
            int r0 = r3.size()     // Catch: java.lang.Exception -> L23
            if (r0 <= 0) goto L23
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Exception -> L23
        Lc:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Exception -> L23
            if (r0 == 0) goto L23
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Exception -> L23
            xyz.adscope.amps.model.config.response.AdSourceModel r0 = (xyz.adscope.amps.model.config.response.AdSourceModel) r0     // Catch: java.lang.Exception -> L23
            java.lang.String r1 = r0.getAdapterManagerClass()     // Catch: java.lang.Exception -> L23
            boolean r1 = r4.equals(r1)     // Catch: java.lang.Exception -> L23
            if (r1 == 0) goto Lc
            return r0
        L23:
            r3 = 0
            return r3
    }

    public xyz.adscope.amps.model.config.response.SpaceModel buildDispatcherModel(xyz.adscope.amps.config.AMPSRequestParameters r7) {
            r6 = this;
            r0 = 0
            xyz.adscope.amps.manager.AMPSSDKManager r1 = xyz.adscope.amps.manager.AMPSSDKManager.getInstance()     // Catch: java.lang.Throwable -> Laf
            xyz.adscope.amps.init.inter.IAMPSInitInterface r1 = r1.getIAMPSInitInterface()     // Catch: java.lang.Throwable -> Laf
            xyz.adscope.amps.model.AMPSGlobalModel r1 = r1.getGlobalModel()     // Catch: java.lang.Throwable -> Laf
            r6.globalModel = r1     // Catch: java.lang.Throwable -> Laf
            if (r1 == 0) goto Laf
            if (r7 != 0) goto L15
            goto Laf
        L15:
            java.lang.String r1 = r1.getAppId()     // Catch: java.lang.Throwable -> Laf
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Laf
            if (r1 != 0) goto Laf
            xyz.adscope.amps.model.AMPSGlobalModel r1 = r6.globalModel     // Catch: java.lang.Throwable -> Laf
            xyz.adscope.amps.model.config.response.AMPSConfigResponseModel r1 = r1.getConfigureResponseModel()     // Catch: java.lang.Throwable -> Laf
            if (r1 == 0) goto Laf
            xyz.adscope.amps.model.AMPSGlobalModel r1 = r6.globalModel     // Catch: java.lang.Throwable -> Laf
            xyz.adscope.amps.model.config.response.AMPSConfigResponseModel r1 = r1.getConfigureResponseModel()     // Catch: java.lang.Throwable -> Laf
            xyz.adscope.amps.model.config.response.MediationModel r1 = r1.getMediation()     // Catch: java.lang.Throwable -> Laf
            if (r1 == 0) goto Laf
            xyz.adscope.amps.model.AMPSGlobalModel r1 = r6.globalModel     // Catch: java.lang.Throwable -> Laf
            xyz.adscope.amps.model.config.response.AMPSConfigResponseModel r1 = r1.getConfigureResponseModel()     // Catch: java.lang.Throwable -> Laf
            xyz.adscope.amps.model.config.response.MediationModel r1 = r1.getMediation()     // Catch: java.lang.Throwable -> Laf
            java.lang.String r1 = r1.getAppId()     // Catch: java.lang.Throwable -> Laf
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Laf
            if (r1 == 0) goto L48
            goto Laf
        L48:
            xyz.adscope.amps.model.AMPSGlobalModel r1 = r6.globalModel     // Catch: java.lang.Throwable -> Laf
            java.lang.String r1 = r1.getAppId()     // Catch: java.lang.Throwable -> Laf
            xyz.adscope.amps.model.AMPSGlobalModel r2 = r6.globalModel     // Catch: java.lang.Throwable -> Laf
            xyz.adscope.amps.model.config.response.AMPSConfigResponseModel r2 = r2.getConfigureResponseModel()     // Catch: java.lang.Throwable -> Laf
            xyz.adscope.amps.model.config.response.MediationModel r2 = r2.getMediation()     // Catch: java.lang.Throwable -> Laf
            java.lang.String r2 = r2.getAppId()     // Catch: java.lang.Throwable -> Laf
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> Laf
            if (r1 == 0) goto Laf
            xyz.adscope.amps.model.AMPSGlobalModel r1 = r6.globalModel     // Catch: java.lang.Throwable -> Laf
            xyz.adscope.amps.model.config.response.AMPSConfigResponseModel r1 = r1.getConfigureResponseModel()     // Catch: java.lang.Throwable -> Laf
            xyz.adscope.amps.model.config.response.MediationModel r1 = r1.getMediation()     // Catch: java.lang.Throwable -> Laf
            java.util.List r1 = r1.getSpaceList()     // Catch: java.lang.Throwable -> Laf
            if (r1 == 0) goto Laf
            int r2 = r1.size()     // Catch: java.lang.Throwable -> Laf
            if (r2 <= 0) goto Laf
            r2 = 0
        L79:
            int r3 = r1.size()     // Catch: java.lang.Throwable -> Laf
            if (r2 >= r3) goto Laf
            java.lang.Object r3 = r1.get(r2)     // Catch: java.lang.Throwable -> Laf
            xyz.adscope.amps.model.config.response.SpaceModel r3 = (xyz.adscope.amps.model.config.response.SpaceModel) r3     // Catch: java.lang.Throwable -> Laf
            java.lang.String r4 = r3.getSpaceId()     // Catch: java.lang.Throwable -> Laf
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> Laf
            if (r4 != 0) goto Lac
            java.lang.String r4 = r7.getSpaceId()     // Catch: java.lang.Throwable -> Laf
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> Laf
            if (r4 != 0) goto Lac
            java.lang.String r4 = r3.getSpaceId()     // Catch: java.lang.Throwable -> Laf
            java.lang.String r5 = r7.getSpaceId()     // Catch: java.lang.Throwable -> Laf
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> Laf
            if (r4 == 0) goto Lac
            xyz.adscope.amps.model.config.response.SpaceModel r7 = r3.deepCopy2()     // Catch: java.lang.Throwable -> Laf
            return r7
        Lac:
            int r2 = r2 + 1
            goto L79
        Laf:
            return r0
    }

    public xyz.adscope.amps.model.config.response.AdSourceModel getAdSourceByAdapterName(java.lang.String r5) {
            r4 = this;
            r0 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L9e
            if (r1 == 0) goto L8
            return r0
        L8:
            xyz.adscope.amps.model.AMPSGlobalModel r1 = r4.globalModel     // Catch: java.lang.Throwable -> L9e
            if (r1 == 0) goto L9e
            xyz.adscope.amps.model.config.response.AMPSConfigResponseModel r1 = r1.getConfigureResponseModel()     // Catch: java.lang.Throwable -> L9e
            if (r1 == 0) goto L9e
            xyz.adscope.amps.model.AMPSGlobalModel r1 = r4.globalModel     // Catch: java.lang.Throwable -> L9e
            xyz.adscope.amps.model.config.response.AMPSConfigResponseModel r1 = r1.getConfigureResponseModel()     // Catch: java.lang.Throwable -> L9e
            xyz.adscope.amps.model.config.response.MediationModel r1 = r1.getMediation()     // Catch: java.lang.Throwable -> L9e
            if (r1 == 0) goto L9e
            xyz.adscope.amps.model.AMPSGlobalModel r1 = r4.globalModel     // Catch: java.lang.Throwable -> L9e
            xyz.adscope.amps.model.config.response.AMPSConfigResponseModel r1 = r1.getConfigureResponseModel()     // Catch: java.lang.Throwable -> L9e
            xyz.adscope.amps.model.config.response.MediationModel r1 = r1.getMediation()     // Catch: java.lang.Throwable -> L9e
            java.util.List r1 = r1.getSpaceList()     // Catch: java.lang.Throwable -> L9e
            if (r1 == 0) goto L9e
            xyz.adscope.amps.model.AMPSGlobalModel r1 = r4.globalModel     // Catch: java.lang.Throwable -> L9e
            xyz.adscope.amps.model.config.response.AMPSConfigResponseModel r1 = r1.getConfigureResponseModel()     // Catch: java.lang.Throwable -> L9e
            xyz.adscope.amps.model.config.response.MediationModel r1 = r1.getMediation()     // Catch: java.lang.Throwable -> L9e
            java.util.List r1 = r1.getSpaceList()     // Catch: java.lang.Throwable -> L9e
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L9e
            r2 = 1
            if (r1 >= r2) goto L44
            goto L9e
        L44:
            xyz.adscope.amps.model.AMPSGlobalModel r1 = r4.globalModel     // Catch: java.lang.Throwable -> L9e
            xyz.adscope.amps.model.config.response.AMPSConfigResponseModel r1 = r1.getConfigureResponseModel()     // Catch: java.lang.Throwable -> L9e
            xyz.adscope.amps.model.config.response.MediationModel r1 = r1.getMediation()     // Catch: java.lang.Throwable -> L9e
            java.util.List r1 = r1.getSpaceList()     // Catch: java.lang.Throwable -> L9e
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L9e
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L9e
            if (r2 == 0) goto L9e
            java.lang.Object r1 = r1.next()     // Catch: java.lang.Throwable -> L9e
            xyz.adscope.amps.model.config.response.SpaceModel r1 = (xyz.adscope.amps.model.config.response.SpaceModel) r1     // Catch: java.lang.Throwable -> L9e
            java.util.List r2 = r1.getS2sAdSourceList()     // Catch: java.lang.Throwable -> L9e
            if (r2 == 0) goto L73
            int r3 = r2.size()     // Catch: java.lang.Throwable -> L9e
            if (r3 <= 0) goto L73
            xyz.adscope.amps.model.config.response.AdSourceModel r5 = r4.getSingleAdSourceByAdapterName(r2, r5)     // Catch: java.lang.Throwable -> L9e
            return r5
        L73:
            java.util.List r2 = r1.getC2sAdSourceList()     // Catch: java.lang.Throwable -> L9e
            if (r2 == 0) goto L84
            int r3 = r2.size()     // Catch: java.lang.Throwable -> L9e
            if (r3 <= 0) goto L84
            xyz.adscope.amps.model.config.response.AdSourceModel r5 = r4.getSingleAdSourceByAdapterName(r2, r5)     // Catch: java.lang.Throwable -> L9e
            return r5
        L84:
            java.util.List r2 = r1.getWfAdSourceList()     // Catch: java.lang.Throwable -> L9e
            if (r2 == 0) goto L95
            int r3 = r2.size()     // Catch: java.lang.Throwable -> L9e
            if (r3 <= 0) goto L95
            xyz.adscope.amps.model.config.response.AdSourceModel r5 = r4.getSingleAdSourceByAdapterName(r2, r5)     // Catch: java.lang.Throwable -> L9e
            return r5
        L95:
            java.util.List r1 = r1.getFloorAdSourceList()     // Catch: java.lang.Throwable -> L9e
            xyz.adscope.amps.model.config.response.AdSourceModel r5 = r4.getSingleAdSourceByAdapterName(r1, r5)     // Catch: java.lang.Throwable -> L9e
            return r5
        L9e:
            return r0
    }
}
