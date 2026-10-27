package xyz.adscope.amps.model.config.response;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AdSourceModel implements xyz.adscope.amps.model.inter.IDeepCopyModel<xyz.adscope.amps.model.config.response.AdSourceModel> {
    private java.lang.String accountId;
    private int adComparePriceStatus;
    private int adStatus;
    private java.lang.String adType;
    private java.lang.String adapterClass;
    private java.lang.String adapterManagerClass;
    private int adsTimeout;
    private java.lang.String appId;
    private xyz.adscope.amps.model.config.response.AuctionStrategyModel auctionStrategy;
    private int autoRefreshSwitch;
    private java.lang.String bidSeatId;
    private java.lang.String bidSpaceId;
    private long biddingStartTime;
    private int biddingTimeout;
    private java.lang.String biddingType;
    private int cachedOffersTimeout;
    private java.lang.String customData;
    private long durationTime;
    private int ecpm;
    private int endWeight;
    private java.lang.String errorCode;
    private java.lang.String errorMsg;
    private xyz.adscope.amps.model.config.response.FilterModel filter;
    private int floorEcpm;
    private boolean isCache;
    private int isFloor;
    private boolean isHitWeight;
    private int isSendBidData;
    private java.util.List<xyz.adscope.amps.model.config.response.AdSourceNoticeRuleModel> lossNoticeRule;
    private java.lang.String lossReason;
    private java.lang.String noticePrice;
    private java.lang.String orientation;
    private int priority;
    private java.lang.String publicKey;
    private java.lang.String realPrice;
    private java.lang.String renderType;
    private int reportEcpm;
    private long requestStartTime;
    private java.lang.String seatId;
    private java.lang.String serverUrl;
    private java.lang.String spaceId;
    private int startWeight;
    private java.util.List<java.lang.Integer> templateTypes;
    private int videoAutoPlay;
    private int videoMaxTime;
    private int videoSound;
    private java.util.List<xyz.adscope.amps.model.config.response.AdSourceNoticeRuleModel> winNoticeRule;
    private java.lang.String zoomout;

    public AdSourceModel() {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = ""
            r2.appId = r0
            r2.spaceId = r0
            r2.adType = r0
            r2.seatId = r0
            r2.adapterManagerClass = r0
            r2.adapterClass = r0
            r2.biddingType = r0
            r2.renderType = r0
            r2.orientation = r0
            r2.zoomout = r0
            r2.errorCode = r0
            r2.errorMsg = r0
            r2.customData = r0
            r0 = 0
            r2.durationTime = r0
            return
    }

    public AdSourceModel(xyz.adscope.amps.model.config.response.AdSourceModel r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = ""
            r2.appId = r0
            r2.spaceId = r0
            r2.adType = r0
            r2.seatId = r0
            r2.adapterManagerClass = r0
            r2.adapterClass = r0
            r2.biddingType = r0
            r2.renderType = r0
            r2.orientation = r0
            r2.zoomout = r0
            r2.errorCode = r0
            r2.errorMsg = r0
            r2.customData = r0
            r0 = 0
            r2.durationTime = r0
            java.lang.String r0 = r3.getAppId()
            r2.appId = r0
            java.lang.String r0 = r3.getSpaceId()
            r2.spaceId = r0
            java.lang.String r0 = r3.getAdType()
            r2.adType = r0
            java.lang.String r0 = r3.getSeatId()
            r2.seatId = r0
            java.lang.String r0 = r3.getAdapterManagerClass()
            r2.adapterManagerClass = r0
            java.lang.String r0 = r3.getAdapterClass()
            r2.adapterClass = r0
            java.lang.String r0 = r3.getBiddingType()
            r2.biddingType = r0
            java.lang.String r0 = r3.getRenderType()
            r2.renderType = r0
            int r0 = r3.getEcpm()
            r2.ecpm = r0
            int r0 = r3.getFloorEcpm()
            r2.floorEcpm = r0
            int r0 = r3.getIsFloor()
            r2.isFloor = r0
            int r0 = r3.getPriority()
            r2.priority = r0
            int r0 = r3.getAdsTimeout()
            r2.adsTimeout = r0
            int r0 = r3.getBiddingTimeout()
            r2.biddingTimeout = r0
            int r0 = r3.getCachedOffersTimeout()
            r2.cachedOffersTimeout = r0
            int r0 = r3.getAutoRefreshSwitch()
            r2.autoRefreshSwitch = r0
            java.lang.String r0 = r3.getOrientation()
            r2.orientation = r0
            java.lang.String r0 = r3.getZoomout()
            r2.zoomout = r0
            int r0 = r3.getVideoSound()
            r2.videoSound = r0
            int r0 = r3.getVideoMaxTime()
            r2.videoMaxTime = r0
            int r0 = r3.getVideoAutoPlay()
            r2.videoAutoPlay = r0
            xyz.adscope.amps.model.config.response.FilterModel r0 = r3.getFilter()
            if (r0 == 0) goto Lad
            xyz.adscope.amps.model.config.response.FilterModel r0 = r0.deepCopy2()
            r2.filter = r0
        Lad:
            int r0 = r3.getStartWeight()
            r2.startWeight = r0
            int r0 = r3.getEndWeight()
            r2.endWeight = r0
            java.util.List r0 = r3.getTemplateTypes()
            r2.templateTypes = r0
            int r0 = r3.getAdStatus()
            r2.adStatus = r0
            int r0 = r3.getAdComparePriceStatus()
            r2.adComparePriceStatus = r0
            boolean r0 = r3.isCache()
            r2.isCache = r0
            java.lang.String r0 = r3.getErrorCode()
            r2.errorCode = r0
            java.lang.String r0 = r3.getErrorMsg()
            r2.errorMsg = r0
            java.lang.String r0 = r3.getCustomData()
            r2.customData = r0
            long r0 = r3.getDurationTime()
            r2.durationTime = r0
            int r0 = r3.getIsSendBidData()
            r2.isSendBidData = r0
            long r0 = r3.getBiddingStartTime()
            r2.biddingStartTime = r0
            long r0 = r3.getRequestStartTime()
            r2.requestStartTime = r0
            boolean r0 = r3.isHitWeight()
            r2.isHitWeight = r0
            int r0 = r3.getReportEcpm()
            r2.reportEcpm = r0
            xyz.adscope.amps.model.config.response.AuctionStrategyModel r0 = r3.getAuctionStrategy()
            if (r0 == 0) goto L113
            xyz.adscope.amps.model.config.response.AuctionStrategyModel r0 = r0.deepCopy2()
            r2.auctionStrategy = r0
        L113:
            java.lang.String r0 = r3.getAccountId()
            r2.accountId = r0
            java.lang.String r0 = r3.getServerUrl()
            r2.serverUrl = r0
            java.lang.String r0 = r3.getPublicKey()
            r2.publicKey = r0
            java.util.List r0 = r3.getWinNoticeRule()
            java.util.List r0 = r2.deepCopyAdSourceNoticeRuleList(r0)
            r2.winNoticeRule = r0
            java.util.List r0 = r3.getLossNoticeRule()
            java.util.List r0 = r2.deepCopyAdSourceNoticeRuleList(r0)
            r2.lossNoticeRule = r0
            java.lang.String r0 = r3.getNoticePrice()
            r2.noticePrice = r0
            java.lang.String r0 = r3.getLossReason()
            r2.lossReason = r0
            java.lang.String r0 = r3.getRealPrice()
            r2.realPrice = r0
            java.lang.String r0 = r3.getBidSeatId()
            r2.bidSeatId = r0
            java.lang.String r3 = r3.getBidSpaceId()
            r2.bidSpaceId = r3
            return
    }

    private java.util.List<xyz.adscope.amps.model.config.response.AdSourceNoticeRuleModel> deepCopyAdSourceNoticeRuleList(java.util.List<xyz.adscope.amps.model.config.response.AdSourceNoticeRuleModel> r3) {
            r2 = this;
            if (r3 == 0) goto L2a
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L9
            goto L2a
        L9:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L12:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r3.next()
            xyz.adscope.amps.model.config.response.AdSourceNoticeRuleModel r1 = (xyz.adscope.amps.model.config.response.AdSourceNoticeRuleModel) r1
            if (r1 != 0) goto L21
            goto L12
        L21:
            xyz.adscope.amps.model.config.response.AdSourceNoticeRuleModel r1 = r1.deepCopy2()
            r0.add(r1)
            goto L12
        L29:
            return r0
        L2a:
            r3 = 0
            return r3
    }

    @Override // xyz.adscope.amps.model.inter.IDeepCopyModel
    public /* bridge */ /* synthetic */ xyz.adscope.amps.model.config.response.AdSourceModel deepCopy() {
            r1 = this;
            xyz.adscope.amps.model.config.response.AdSourceModel r0 = r1.deepCopy2()
            return r0
    }

    @Override // xyz.adscope.amps.model.inter.IDeepCopyModel
    /* renamed from: deepCopy, reason: avoid collision after fix types in other method */
    public xyz.adscope.amps.model.config.response.AdSourceModel deepCopy2() {
            r1 = this;
            xyz.adscope.amps.model.config.response.AdSourceModel r0 = new xyz.adscope.amps.model.config.response.AdSourceModel
            r0.<init>(r1)
            return r0
    }

    public java.lang.String getAccountId() {
            r1 = this;
            java.lang.String r0 = r1.accountId
            return r0
    }

    public int getAdComparePriceStatus() {
            r1 = this;
            int r0 = r1.adComparePriceStatus
            return r0
    }

    public int getAdStatus() {
            r1 = this;
            int r0 = r1.adStatus
            return r0
    }

    public java.lang.String getAdType() {
            r1 = this;
            java.lang.String r0 = r1.adType
            return r0
    }

    public java.lang.String getAdapterClass() {
            r1 = this;
            java.lang.String r0 = r1.adapterClass
            return r0
    }

    public java.lang.String getAdapterManagerClass() {
            r1 = this;
            java.lang.String r0 = r1.adapterManagerClass
            return r0
    }

    public int getAdsTimeout() {
            r1 = this;
            int r0 = r1.adsTimeout
            return r0
    }

    public java.lang.String getAppId() {
            r1 = this;
            java.lang.String r0 = r1.appId
            return r0
    }

    public xyz.adscope.amps.model.config.response.AuctionStrategyModel getAuctionStrategy() {
            r1 = this;
            xyz.adscope.amps.model.config.response.AuctionStrategyModel r0 = r1.auctionStrategy
            return r0
    }

    public int getAutoRefreshSwitch() {
            r1 = this;
            int r0 = r1.autoRefreshSwitch
            return r0
    }

    public java.lang.String getBidSeatId() {
            r1 = this;
            java.lang.String r0 = r1.bidSeatId
            return r0
    }

    public java.lang.String getBidSpaceId() {
            r1 = this;
            java.lang.String r0 = r1.bidSpaceId
            return r0
    }

    public long getBiddingStartTime() {
            r2 = this;
            long r0 = r2.biddingStartTime
            return r0
    }

    public int getBiddingTimeout() {
            r1 = this;
            int r0 = r1.biddingTimeout
            return r0
    }

    public java.lang.String getBiddingType() {
            r1 = this;
            java.lang.String r0 = r1.biddingType
            return r0
    }

    public int getCachedOffersTimeout() {
            r1 = this;
            int r0 = r1.cachedOffersTimeout
            return r0
    }

    public java.lang.String getCustomData() {
            r1 = this;
            java.lang.String r0 = r1.customData
            return r0
    }

    public long getDurationTime() {
            r2 = this;
            long r0 = r2.durationTime
            return r0
    }

    public int getEcpm() {
            r1 = this;
            int r0 = r1.ecpm
            return r0
    }

    public int getEndWeight() {
            r1 = this;
            int r0 = r1.endWeight
            return r0
    }

    public java.lang.String getErrorCode() {
            r1 = this;
            java.lang.String r0 = r1.errorCode
            return r0
    }

    public java.lang.String getErrorMsg() {
            r1 = this;
            java.lang.String r0 = r1.errorMsg
            return r0
    }

    public xyz.adscope.amps.model.config.response.FilterModel getFilter() {
            r1 = this;
            xyz.adscope.amps.model.config.response.FilterModel r0 = r1.filter
            return r0
    }

    public int getFloorEcpm() {
            r1 = this;
            int r0 = r1.floorEcpm
            return r0
    }

    public int getIsFloor() {
            r1 = this;
            int r0 = r1.isFloor
            return r0
    }

    public int getIsSendBidData() {
            r1 = this;
            int r0 = r1.isSendBidData
            return r0
    }

    public java.util.List<xyz.adscope.amps.model.config.response.AdSourceNoticeRuleModel> getLossNoticeRule() {
            r1 = this;
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceNoticeRuleModel> r0 = r1.lossNoticeRule
            return r0
    }

    public java.lang.String getLossReason() {
            r1 = this;
            java.lang.String r0 = r1.lossReason
            return r0
    }

    public java.lang.String getNoticePrice() {
            r1 = this;
            java.lang.String r0 = r1.noticePrice
            return r0
    }

    public java.lang.String getOrientation() {
            r1 = this;
            java.lang.String r0 = r1.orientation
            return r0
    }

    public int getPriority() {
            r1 = this;
            int r0 = r1.priority
            return r0
    }

    public java.lang.String getPublicKey() {
            r1 = this;
            java.lang.String r0 = r1.publicKey
            return r0
    }

    public java.lang.String getRealPrice() {
            r1 = this;
            java.lang.String r0 = r1.realPrice
            return r0
    }

    public java.lang.String getRenderType() {
            r1 = this;
            java.lang.String r0 = r1.renderType
            return r0
    }

    public int getReportEcpm() {
            r1 = this;
            int r0 = r1.reportEcpm
            return r0
    }

    public long getRequestStartTime() {
            r2 = this;
            long r0 = r2.requestStartTime
            return r0
    }

    public java.lang.String getSeatId() {
            r1 = this;
            java.lang.String r0 = r1.seatId
            return r0
    }

    public java.lang.String getServerUrl() {
            r1 = this;
            java.lang.String r0 = r1.serverUrl
            return r0
    }

    public java.lang.String getSpaceId() {
            r1 = this;
            java.lang.String r0 = r1.spaceId
            return r0
    }

    public int getStartWeight() {
            r1 = this;
            int r0 = r1.startWeight
            return r0
    }

    public java.util.List<java.lang.Integer> getTemplateTypes() {
            r1 = this;
            java.util.List<java.lang.Integer> r0 = r1.templateTypes
            return r0
    }

    public int getVideoAutoPlay() {
            r1 = this;
            int r0 = r1.videoAutoPlay
            return r0
    }

    public int getVideoMaxTime() {
            r1 = this;
            int r0 = r1.videoMaxTime
            return r0
    }

    public int getVideoSound() {
            r1 = this;
            int r0 = r1.videoSound
            return r0
    }

    public java.util.List<xyz.adscope.amps.model.config.response.AdSourceNoticeRuleModel> getWinNoticeRule() {
            r1 = this;
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceNoticeRuleModel> r0 = r1.winNoticeRule
            return r0
    }

    public java.lang.String getZoomout() {
            r1 = this;
            java.lang.String r0 = r1.zoomout
            return r0
    }

    public boolean isCache() {
            r1 = this;
            boolean r0 = r1.isCache
            return r0
    }

    public boolean isHitWeight() {
            r1 = this;
            boolean r0 = r1.isHitWeight
            return r0
    }

    public void setAccountId(java.lang.String r1) {
            r0 = this;
            r0.accountId = r1
            return
    }

    public void setAdComparePriceStatus(int r1) {
            r0 = this;
            r0.adComparePriceStatus = r1
            return
    }

    public void setAdStatus(int r1) {
            r0 = this;
            r0.adStatus = r1
            return
    }

    public void setAdType(java.lang.String r1) {
            r0 = this;
            r0.adType = r1
            return
    }

    public void setAdapterClass(java.lang.String r1) {
            r0 = this;
            r0.adapterClass = r1
            return
    }

    public void setAdapterManagerClass(java.lang.String r1) {
            r0 = this;
            r0.adapterManagerClass = r1
            return
    }

    public void setAdsTimeout(int r1) {
            r0 = this;
            r0.adsTimeout = r1
            return
    }

    public void setAppId(java.lang.String r1) {
            r0 = this;
            r0.appId = r1
            return
    }

    public void setAuctionStrategy(xyz.adscope.amps.model.config.response.AuctionStrategyModel r1) {
            r0 = this;
            r0.auctionStrategy = r1
            return
    }

    public void setAutoRefreshSwitch(int r1) {
            r0 = this;
            r0.autoRefreshSwitch = r1
            return
    }

    public void setBidSeatId(java.lang.String r1) {
            r0 = this;
            r0.bidSeatId = r1
            return
    }

    public void setBidSpaceId(java.lang.String r1) {
            r0 = this;
            r0.bidSpaceId = r1
            return
    }

    public void setBiddingStartTime(long r1) {
            r0 = this;
            r0.biddingStartTime = r1
            return
    }

    public void setBiddingTimeout(int r1) {
            r0 = this;
            r0.biddingTimeout = r1
            return
    }

    public void setBiddingType(java.lang.String r1) {
            r0 = this;
            r0.biddingType = r1
            return
    }

    public void setCache(boolean r1) {
            r0 = this;
            r0.isCache = r1
            return
    }

    public void setCachedOffersTimeout(int r1) {
            r0 = this;
            r0.cachedOffersTimeout = r1
            return
    }

    public void setCustomData(java.lang.String r1) {
            r0 = this;
            r0.customData = r1
            return
    }

    public void setDurationTime(long r1) {
            r0 = this;
            r0.durationTime = r1
            return
    }

    public void setEcpm(int r1) {
            r0 = this;
            r0.ecpm = r1
            return
    }

    public void setEndWeight(int r1) {
            r0 = this;
            r0.endWeight = r1
            return
    }

    public void setErrorCode(java.lang.String r1) {
            r0 = this;
            r0.errorCode = r1
            return
    }

    public void setErrorMsg(java.lang.String r1) {
            r0 = this;
            r0.errorMsg = r1
            return
    }

    public void setFilter(xyz.adscope.amps.model.config.response.FilterModel r1) {
            r0 = this;
            r0.filter = r1
            return
    }

    public void setFloorEcpm(int r1) {
            r0 = this;
            r0.floorEcpm = r1
            return
    }

    public void setHitWeight(boolean r1) {
            r0 = this;
            r0.isHitWeight = r1
            return
    }

    public void setIsFloor(int r1) {
            r0 = this;
            r0.isFloor = r1
            return
    }

    public void setIsSendBidData(int r1) {
            r0 = this;
            r0.isSendBidData = r1
            return
    }

    public void setLossNoticeRule(java.util.List<xyz.adscope.amps.model.config.response.AdSourceNoticeRuleModel> r1) {
            r0 = this;
            r0.lossNoticeRule = r1
            return
    }

    public void setLossReason(java.lang.String r1) {
            r0 = this;
            r0.lossReason = r1
            return
    }

    public void setNoticePrice(java.lang.String r1) {
            r0 = this;
            r0.noticePrice = r1
            return
    }

    public void setOrientation(java.lang.String r1) {
            r0 = this;
            r0.orientation = r1
            return
    }

    public void setPriority(int r1) {
            r0 = this;
            r0.priority = r1
            return
    }

    public void setPublicKey(java.lang.String r1) {
            r0 = this;
            r0.publicKey = r1
            return
    }

    public void setRealPrice(java.lang.String r1) {
            r0 = this;
            r0.realPrice = r1
            return
    }

    public void setRenderType(java.lang.String r1) {
            r0 = this;
            r0.renderType = r1
            return
    }

    public void setReportEcpm(int r1) {
            r0 = this;
            r0.reportEcpm = r1
            return
    }

    public void setRequestStartTime(long r1) {
            r0 = this;
            r0.requestStartTime = r1
            return
    }

    public void setSeatId(java.lang.String r1) {
            r0 = this;
            r0.seatId = r1
            return
    }

    public void setServerUrl(java.lang.String r1) {
            r0 = this;
            r0.serverUrl = r1
            return
    }

    public void setSpaceId(java.lang.String r1) {
            r0 = this;
            r0.spaceId = r1
            return
    }

    public void setStartWeight(int r1) {
            r0 = this;
            r0.startWeight = r1
            return
    }

    public void setTemplateTypes(java.util.List<java.lang.Integer> r1) {
            r0 = this;
            r0.templateTypes = r1
            return
    }

    public void setVideoAutoPlay(int r1) {
            r0 = this;
            r0.videoAutoPlay = r1
            return
    }

    public void setVideoMaxTime(int r1) {
            r0 = this;
            r0.videoMaxTime = r1
            return
    }

    public void setVideoSound(int r1) {
            r0 = this;
            r0.videoSound = r1
            return
    }

    public void setWinNoticeRule(java.util.List<xyz.adscope.amps.model.config.response.AdSourceNoticeRuleModel> r1) {
            r0 = this;
            r0.winNoticeRule = r1
            return
    }

    public void setZoomout(java.lang.String r1) {
            r0 = this;
            r0.zoomout = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "{\"appId\":\""
            r0.append(r1)
            java.lang.String r1 = r2.appId
            r0.append(r1)
            java.lang.String r1 = "\", \"spaceId\":\""
            r0.append(r1)
            java.lang.String r1 = r2.spaceId
            r0.append(r1)
            java.lang.String r1 = "\", \"adType\":\""
            r0.append(r1)
            java.lang.String r1 = r2.adType
            r0.append(r1)
            java.lang.String r1 = "\", \"seatId\":\""
            r0.append(r1)
            java.lang.String r1 = r2.seatId
            r0.append(r1)
            java.lang.String r1 = "\", \"adapterManagerClass\":\""
            r0.append(r1)
            java.lang.String r1 = r2.adapterManagerClass
            r0.append(r1)
            java.lang.String r1 = "\", \"adapterClass\":\""
            r0.append(r1)
            java.lang.String r1 = r2.adapterClass
            r0.append(r1)
            java.lang.String r1 = "\", \"biddingType\":\""
            r0.append(r1)
            java.lang.String r1 = r2.biddingType
            r0.append(r1)
            java.lang.String r1 = "\", \"renderType\":\""
            r0.append(r1)
            java.lang.String r1 = r2.renderType
            r0.append(r1)
            java.lang.String r1 = "\", \"ecpm\":"
            r0.append(r1)
            int r1 = r2.ecpm
            r0.append(r1)
            java.lang.String r1 = ", \"floorEcpm\":"
            r0.append(r1)
            int r1 = r2.floorEcpm
            r0.append(r1)
            java.lang.String r1 = ", \"isFloor\":"
            r0.append(r1)
            int r1 = r2.isFloor
            r0.append(r1)
            java.lang.String r1 = ", \"priority\":"
            r0.append(r1)
            int r1 = r2.priority
            r0.append(r1)
            java.lang.String r1 = ", \"adsTimeout\":"
            r0.append(r1)
            int r1 = r2.adsTimeout
            r0.append(r1)
            java.lang.String r1 = ", \"biddingTimeout\":"
            r0.append(r1)
            int r1 = r2.biddingTimeout
            r0.append(r1)
            java.lang.String r1 = ", \"cachedOffersTimeout\":"
            r0.append(r1)
            int r1 = r2.cachedOffersTimeout
            r0.append(r1)
            java.lang.String r1 = ", \"autoRefreshSwitch\":"
            r0.append(r1)
            int r1 = r2.autoRefreshSwitch
            r0.append(r1)
            java.lang.String r1 = ", \"orientation\":\""
            r0.append(r1)
            java.lang.String r1 = r2.orientation
            r0.append(r1)
            java.lang.String r1 = "\", \"zoomout\":\""
            r0.append(r1)
            java.lang.String r1 = r2.zoomout
            r0.append(r1)
            java.lang.String r1 = "\", \"videoSound\":"
            r0.append(r1)
            int r1 = r2.videoSound
            r0.append(r1)
            java.lang.String r1 = ", \"videoMaxTime\":"
            r0.append(r1)
            int r1 = r2.videoMaxTime
            r0.append(r1)
            java.lang.String r1 = ", \"videoAutoPlay\":"
            r0.append(r1)
            int r1 = r2.videoAutoPlay
            r0.append(r1)
            java.lang.String r1 = ", \"filter\":"
            r0.append(r1)
            xyz.adscope.amps.model.config.response.FilterModel r1 = r2.filter
            r0.append(r1)
            java.lang.String r1 = ", \"startWeight\":"
            r0.append(r1)
            int r1 = r2.startWeight
            r0.append(r1)
            java.lang.String r1 = ", \"endWeight\":"
            r0.append(r1)
            int r1 = r2.endWeight
            r0.append(r1)
            java.lang.String r1 = ", \"templateTypes\":"
            r0.append(r1)
            java.util.List<java.lang.Integer> r1 = r2.templateTypes
            r0.append(r1)
            java.lang.String r1 = ", \"adStatus\":"
            r0.append(r1)
            int r1 = r2.adStatus
            r0.append(r1)
            java.lang.String r1 = ", \"isCache\":"
            r0.append(r1)
            boolean r1 = r2.isCache
            r0.append(r1)
            java.lang.String r1 = ", \"customData\":\""
            r0.append(r1)
            java.lang.String r1 = r2.customData
            java.lang.String r1 = xyz.adscope.common.json.util.JsonUtil.addEscapeChar(r1)
            r0.append(r1)
            java.lang.String r1 = "\", \"errorCode\":\""
            r0.append(r1)
            java.lang.String r1 = r2.errorCode
            r0.append(r1)
            java.lang.String r1 = "\", \"errorMsg\":\""
            r0.append(r1)
            java.lang.String r1 = r2.errorMsg
            r0.append(r1)
            java.lang.String r1 = "\", \"isSendBidData\":"
            r0.append(r1)
            int r1 = r2.isSendBidData
            r0.append(r1)
            java.lang.String r1 = ", \"auctionStrategy\":"
            r0.append(r1)
            xyz.adscope.amps.model.config.response.AuctionStrategyModel r1 = r2.auctionStrategy
            r0.append(r1)
            java.lang.String r1 = ", \"accountId\":\""
            r0.append(r1)
            java.lang.String r1 = r2.accountId
            r0.append(r1)
            java.lang.String r1 = "\", \"serverUrl\":\""
            r0.append(r1)
            java.lang.String r1 = r2.serverUrl
            r0.append(r1)
            java.lang.String r1 = "\", \"publicKey\":\""
            r0.append(r1)
            java.lang.String r1 = r2.publicKey
            r0.append(r1)
            java.lang.String r1 = "\", \"winNoticeRule\":"
            r0.append(r1)
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceNoticeRuleModel> r1 = r2.winNoticeRule
            r0.append(r1)
            java.lang.String r1 = ", \"lossNoticeRule\":"
            r0.append(r1)
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceNoticeRuleModel> r1 = r2.lossNoticeRule
            r0.append(r1)
            java.lang.String r1 = ", \"noticePrice\":\""
            r0.append(r1)
            java.lang.String r1 = r2.noticePrice
            r0.append(r1)
            java.lang.String r1 = "\", \"lossReason\":\""
            r0.append(r1)
            java.lang.String r1 = r2.lossReason
            r0.append(r1)
            java.lang.String r1 = "\", \"realPrice\":\""
            r0.append(r1)
            java.lang.String r1 = r2.realPrice
            r0.append(r1)
            java.lang.String r1 = "\", \"bidSeatId\":\""
            r0.append(r1)
            java.lang.String r1 = r2.bidSeatId
            r0.append(r1)
            java.lang.String r1 = "\", \"bidSpaceId\":\""
            r0.append(r1)
            java.lang.String r1 = r2.bidSpaceId
            r0.append(r1)
            java.lang.String r1 = "\""
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
