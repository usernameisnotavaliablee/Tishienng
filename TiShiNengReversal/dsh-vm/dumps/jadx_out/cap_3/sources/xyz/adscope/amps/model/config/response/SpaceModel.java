package xyz.adscope.amps.model.config.response;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class SpaceModel implements xyz.adscope.amps.model.inter.IDeepCopyModel<xyz.adscope.amps.model.config.response.SpaceModel> {
    private int adFloorEcpm;
    private long adTimeout;
    private java.lang.String adType;
    private long adsTimeout;
    private int autoRefreshSwitch;
    private int autoRefreshTime;
    private long bidAdTimeout;
    private int bidDistributionMethod;
    private int bidFloorEcpm;
    private int bidParallelNum;
    private java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> c2sAdSourceList;
    private int cachedOffersNum;
    private int cachedOffersTimeout;
    private java.lang.String customData;
    private java.lang.String ext;
    private xyz.adscope.amps.model.config.response.FilterModel filter;
    private java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> floorAdSourceList;
    private int floorDelayTime;
    private java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> s2sAdSourceList;
    private java.lang.String spaceId;
    private int waterfallParallelNum;
    private int weightRandomNum;
    private java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> wfAdSourceList;

    public SpaceModel() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.customData = r0
            return
    }

    private SpaceModel(xyz.adscope.amps.model.config.response.SpaceModel r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = ""
            r2.customData = r0
            java.lang.String r0 = r3.getSpaceId()
            r2.spaceId = r0
            int r0 = r3.getBidDistributionMethod()
            r2.bidDistributionMethod = r0
            java.lang.String r0 = r3.getAdType()
            r2.adType = r0
            int r0 = r3.getWaterfallParallelNum()
            r2.waterfallParallelNum = r0
            long r0 = r3.getAdTimeout()
            r2.adTimeout = r0
            long r0 = r3.getAdsTimeout()
            r2.adsTimeout = r0
            long r0 = r3.getBidAdTimeout()
            r2.bidAdTimeout = r0
            int r0 = r3.getBidParallelNum()
            r2.bidParallelNum = r0
            int r0 = r3.getAdFloorEcpm()
            r2.adFloorEcpm = r0
            int r0 = r3.getBidFloorEcpm()
            r2.bidFloorEcpm = r0
            int r0 = r3.getCachedOffersNum()
            r2.cachedOffersNum = r0
            int r0 = r3.getCachedOffersTimeout()
            r2.cachedOffersTimeout = r0
            int r0 = r3.getAutoRefreshSwitch()
            r2.autoRefreshSwitch = r0
            int r0 = r3.getAutoRefreshTime()
            r2.autoRefreshTime = r0
            int r0 = r3.getFloorDelayTime()
            r2.floorDelayTime = r0
            java.util.List r0 = r3.getS2sAdSourceList()
            java.util.List r0 = r2.deepCopyAdSourceList(r0)
            r2.s2sAdSourceList = r0
            java.util.List r0 = r3.getC2sAdSourceList()
            java.util.List r0 = r2.deepCopyAdSourceList(r0)
            r2.c2sAdSourceList = r0
            java.util.List r0 = r3.getWfAdSourceList()
            java.util.List r0 = r2.deepCopyAdSourceList(r0)
            r2.wfAdSourceList = r0
            java.util.List r0 = r3.getFloorAdSourceList()
            java.util.List r0 = r2.deepCopyAdSourceList(r0)
            r2.floorAdSourceList = r0
            xyz.adscope.amps.model.config.response.FilterModel r0 = r3.getFilter()
            if (r0 == 0) goto L95
            xyz.adscope.amps.model.config.response.FilterModel r0 = r0.deepCopy2()
            r2.filter = r0
        L95:
            java.lang.String r0 = r3.getExt()
            r2.ext = r0
            r0 = 1000(0x3e8, float:1.401E-42)
            int r0 = xyz.adscope.amps.tool.util.AMPSRandomUtil.getRandomNum(r0)
            r2.weightRandomNum = r0
            java.lang.String r3 = r3.getCustomData()
            r2.customData = r3
            return
    }

    private java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> deepCopyAdSourceList(java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r3) {
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
            xyz.adscope.amps.model.config.response.AdSourceModel r1 = (xyz.adscope.amps.model.config.response.AdSourceModel) r1
            if (r1 != 0) goto L21
            goto L12
        L21:
            xyz.adscope.amps.model.config.response.AdSourceModel r1 = r1.deepCopy2()
            r0.add(r1)
            goto L12
        L29:
            return r0
        L2a:
            r3 = 0
            return r3
    }

    @Override // xyz.adscope.amps.model.inter.IDeepCopyModel
    public /* bridge */ /* synthetic */ xyz.adscope.amps.model.config.response.SpaceModel deepCopy() {
            r1 = this;
            xyz.adscope.amps.model.config.response.SpaceModel r0 = r1.deepCopy2()
            return r0
    }

    @Override // xyz.adscope.amps.model.inter.IDeepCopyModel
    /* renamed from: deepCopy, reason: avoid collision after fix types in other method */
    public xyz.adscope.amps.model.config.response.SpaceModel deepCopy2() {
            r1 = this;
            xyz.adscope.amps.model.config.response.SpaceModel r0 = new xyz.adscope.amps.model.config.response.SpaceModel
            r0.<init>(r1)
            return r0
    }

    public int getAdFloorEcpm() {
            r1 = this;
            int r0 = r1.adFloorEcpm
            return r0
    }

    public long getAdTimeout() {
            r2 = this;
            long r0 = r2.adTimeout
            return r0
    }

    public java.lang.String getAdType() {
            r1 = this;
            java.lang.String r0 = r1.adType
            return r0
    }

    public long getAdsTimeout() {
            r2 = this;
            long r0 = r2.adsTimeout
            return r0
    }

    public int getAutoRefreshSwitch() {
            r1 = this;
            int r0 = r1.autoRefreshSwitch
            return r0
    }

    public int getAutoRefreshTime() {
            r1 = this;
            int r0 = r1.autoRefreshTime
            return r0
    }

    public long getBidAdTimeout() {
            r2 = this;
            long r0 = r2.bidAdTimeout
            return r0
    }

    public int getBidDistributionMethod() {
            r1 = this;
            int r0 = r1.bidDistributionMethod
            return r0
    }

    public int getBidFloorEcpm() {
            r1 = this;
            int r0 = r1.bidFloorEcpm
            return r0
    }

    public int getBidParallelNum() {
            r1 = this;
            int r0 = r1.bidParallelNum
            return r0
    }

    public java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> getC2sAdSourceList() {
            r1 = this;
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r1.c2sAdSourceList
            return r0
    }

    public int getCachedOffersNum() {
            r1 = this;
            int r0 = r1.cachedOffersNum
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

    public java.lang.String getExt() {
            r1 = this;
            java.lang.String r0 = r1.ext
            return r0
    }

    public xyz.adscope.amps.model.config.response.FilterModel getFilter() {
            r1 = this;
            xyz.adscope.amps.model.config.response.FilterModel r0 = r1.filter
            return r0
    }

    public java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> getFloorAdSourceList() {
            r1 = this;
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r1.floorAdSourceList
            return r0
    }

    public int getFloorDelayTime() {
            r1 = this;
            int r0 = r1.floorDelayTime
            return r0
    }

    public java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> getS2sAdSourceList() {
            r1 = this;
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r1.s2sAdSourceList
            return r0
    }

    public java.lang.String getSpaceId() {
            r1 = this;
            java.lang.String r0 = r1.spaceId
            return r0
    }

    public int getWaterfallParallelNum() {
            r1 = this;
            int r0 = r1.waterfallParallelNum
            return r0
    }

    public int getWeightRandomNum() {
            r1 = this;
            int r0 = r1.weightRandomNum
            return r0
    }

    public java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> getWfAdSourceList() {
            r1 = this;
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r0 = r1.wfAdSourceList
            return r0
    }

    public void setAdFloorEcpm(int r1) {
            r0 = this;
            r0.adFloorEcpm = r1
            return
    }

    public void setAdTimeout(long r1) {
            r0 = this;
            r0.adTimeout = r1
            return
    }

    public void setAdType(java.lang.String r1) {
            r0 = this;
            r0.adType = r1
            return
    }

    public void setAdsTimeout(long r1) {
            r0 = this;
            r0.adsTimeout = r1
            return
    }

    public void setAutoRefreshSwitch(int r1) {
            r0 = this;
            r0.autoRefreshSwitch = r1
            return
    }

    public void setAutoRefreshTime(int r1) {
            r0 = this;
            r0.autoRefreshTime = r1
            return
    }

    public void setBidAdTimeout(long r1) {
            r0 = this;
            r0.bidAdTimeout = r1
            return
    }

    public void setBidDistributionMethod(int r1) {
            r0 = this;
            r0.bidDistributionMethod = r1
            return
    }

    public void setBidFloorEcpm(int r1) {
            r0 = this;
            r0.bidFloorEcpm = r1
            return
    }

    public void setBidParallelNum(int r1) {
            r0 = this;
            r0.bidParallelNum = r1
            return
    }

    public void setC2sAdSourceList(java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r1) {
            r0 = this;
            r0.c2sAdSourceList = r1
            return
    }

    public void setCachedOffersNum(int r1) {
            r0 = this;
            r0.cachedOffersNum = r1
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

    public void setExt(java.lang.String r1) {
            r0 = this;
            r0.ext = r1
            return
    }

    public void setFilter(xyz.adscope.amps.model.config.response.FilterModel r1) {
            r0 = this;
            r0.filter = r1
            return
    }

    public void setFloorAdSourceList(java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r1) {
            r0 = this;
            r0.floorAdSourceList = r1
            return
    }

    public void setFloorDelayTime(int r1) {
            r0 = this;
            r0.floorDelayTime = r1
            return
    }

    public void setS2sAdSourceList(java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r1) {
            r0 = this;
            r0.s2sAdSourceList = r1
            return
    }

    public void setSpaceId(java.lang.String r1) {
            r0 = this;
            r0.spaceId = r1
            return
    }

    public void setWaterfallParallelNum(int r1) {
            r0 = this;
            r0.waterfallParallelNum = r1
            return
    }

    public void setWeightRandomNum(int r1) {
            r0 = this;
            r0.weightRandomNum = r1
            return
    }

    public void setWfAdSourceList(java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r1) {
            r0 = this;
            r0.wfAdSourceList = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "{\"spaceId\":\""
            r0.append(r1)
            java.lang.String r1 = r3.spaceId
            r0.append(r1)
            java.lang.String r1 = "\", \"bidDistributionMethod\":"
            r0.append(r1)
            int r1 = r3.bidDistributionMethod
            r0.append(r1)
            java.lang.String r1 = ", \"adType\":\""
            r0.append(r1)
            java.lang.String r1 = r3.adType
            r0.append(r1)
            java.lang.String r1 = "\", \"waterfallParallelNum\":"
            r0.append(r1)
            int r1 = r3.waterfallParallelNum
            r0.append(r1)
            java.lang.String r1 = ", \"adTimeout\":"
            r0.append(r1)
            long r1 = r3.adTimeout
            r0.append(r1)
            java.lang.String r1 = ", \"adsTimeout\":"
            r0.append(r1)
            long r1 = r3.adsTimeout
            r0.append(r1)
            java.lang.String r1 = ", \"bidAdTimeout\":"
            r0.append(r1)
            long r1 = r3.bidAdTimeout
            r0.append(r1)
            java.lang.String r1 = ", \"bidParallelNum\":"
            r0.append(r1)
            int r1 = r3.bidParallelNum
            r0.append(r1)
            java.lang.String r1 = ", \"adFloorEcpm\":"
            r0.append(r1)
            int r1 = r3.adFloorEcpm
            r0.append(r1)
            java.lang.String r1 = ", \"bidFloorEcpm\":"
            r0.append(r1)
            int r1 = r3.bidFloorEcpm
            r0.append(r1)
            java.lang.String r1 = ", \"cachedOffersNum\":"
            r0.append(r1)
            int r1 = r3.cachedOffersNum
            r0.append(r1)
            java.lang.String r1 = ", \"cachedOffersTimeout\":"
            r0.append(r1)
            int r1 = r3.cachedOffersTimeout
            r0.append(r1)
            java.lang.String r1 = ", \"autoRefreshSwitch\":"
            r0.append(r1)
            int r1 = r3.autoRefreshSwitch
            r0.append(r1)
            java.lang.String r1 = ", \"autoRefreshTime\":"
            r0.append(r1)
            int r1 = r3.autoRefreshTime
            r0.append(r1)
            java.lang.String r1 = ", \"floorDelayTime\":"
            r0.append(r1)
            int r1 = r3.floorDelayTime
            r0.append(r1)
            java.lang.String r1 = ", \"s2sAdSourceList\":"
            r0.append(r1)
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r1 = r3.s2sAdSourceList
            r0.append(r1)
            java.lang.String r1 = ", \"c2sAdSourceList\":"
            r0.append(r1)
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r1 = r3.c2sAdSourceList
            r0.append(r1)
            java.lang.String r1 = ", \"wfAdSourceList\":"
            r0.append(r1)
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r1 = r3.wfAdSourceList
            r0.append(r1)
            java.lang.String r1 = ", \"floorAdSourceList\":"
            r0.append(r1)
            java.util.List<xyz.adscope.amps.model.config.response.AdSourceModel> r1 = r3.floorAdSourceList
            r0.append(r1)
            java.lang.String r1 = ", \"customData\":\""
            r0.append(r1)
            java.lang.String r1 = r3.customData
            java.lang.String r1 = xyz.adscope.common.json.util.JsonUtil.addEscapeChar(r1)
            r0.append(r1)
            java.lang.String r1 = "\", \"filter\":"
            r0.append(r1)
            xyz.adscope.amps.model.config.response.FilterModel r1 = r3.filter
            r0.append(r1)
            java.lang.String r1 = ", \"ext\":\""
            r0.append(r1)
            java.lang.String r1 = r3.ext
            r0.append(r1)
            java.lang.String r1 = "\""
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
