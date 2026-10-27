package xyz.adscope.amps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSCycleModel {
    private java.lang.String adCount;
    private java.lang.String adSourceAppId;
    private java.lang.String adSourceCustomData;
    private java.lang.String adSourceId;
    private java.lang.String adSourceSpaceId;
    private java.lang.String adTimeOut;
    private java.lang.String adType;
    private java.lang.String bidSeatId;
    private java.lang.String bidSpaceId;
    private java.lang.String bidStrategyCustomData;
    private java.lang.String bidType;
    private java.lang.String ecpm;
    private java.lang.String errorCode;
    private java.lang.String errorMsg;
    private java.lang.String floorPrice;
    private java.lang.String isHitAuction;
    private java.lang.String isLastLook;
    private java.lang.String loadType;
    private java.lang.String lossReason;
    private java.lang.String maxWaitTime;
    private java.lang.String mediationAppId;
    private java.lang.String mediationSpaceId;
    private java.lang.String noticePrice;
    private java.lang.String realPrice;
    private long roundTripTime;
    private java.lang.String sessionId;
    private java.lang.String spaceCustomData;

    public AMPSCycleModel() {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = ""
            r3.mediationAppId = r0
            r3.mediationSpaceId = r0
            r3.adSourceId = r0
            r3.adSourceAppId = r0
            r3.adSourceSpaceId = r0
            r3.ecpm = r0
            r3.errorCode = r0
            r3.errorMsg = r0
            r1 = 0
            r3.roundTripTime = r1
            r3.spaceCustomData = r0
            r3.adSourceCustomData = r0
            r3.adType = r0
            r3.bidType = r0
            r3.floorPrice = r0
            r3.loadType = r0
            r3.adCount = r0
            r3.maxWaitTime = r0
            r3.sessionId = r0
            return
    }

    public java.lang.String getAdCount() {
            r1 = this;
            java.lang.String r0 = r1.adCount
            return r0
    }

    public java.lang.String getAdSourceAppId() {
            r1 = this;
            java.lang.String r0 = r1.adSourceAppId
            return r0
    }

    public java.lang.String getAdSourceCustomData() {
            r1 = this;
            java.lang.String r0 = r1.adSourceCustomData
            return r0
    }

    public java.lang.String getAdSourceId() {
            r1 = this;
            java.lang.String r0 = r1.adSourceId
            return r0
    }

    public java.lang.String getAdSourceSpaceId() {
            r1 = this;
            java.lang.String r0 = r1.adSourceSpaceId
            return r0
    }

    public java.lang.String getAdTimeOut() {
            r1 = this;
            java.lang.String r0 = r1.adTimeOut
            return r0
    }

    public java.lang.String getAdType() {
            r1 = this;
            java.lang.String r0 = r1.adType
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

    public java.lang.String getBidStrategyCustomData() {
            r1 = this;
            java.lang.String r0 = r1.bidStrategyCustomData
            return r0
    }

    public java.lang.String getBidType() {
            r1 = this;
            java.lang.String r0 = r1.bidType
            return r0
    }

    public java.lang.String getEcpm() {
            r1 = this;
            java.lang.String r0 = r1.ecpm
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

    public java.lang.String getEventId() {
            r1 = this;
            java.lang.String r0 = xyz.adscope.amps.tool.util.AMPSStringUtil.createRequestId()
            return r0
    }

    public long getEventTime() {
            r2 = this;
            long r0 = xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.getTimeStamp()
            return r0
    }

    public java.lang.String getFloorPrice() {
            r1 = this;
            java.lang.String r0 = r1.floorPrice
            return r0
    }

    public java.lang.String getIsHitAuction() {
            r1 = this;
            java.lang.String r0 = r1.isHitAuction
            return r0
    }

    public java.lang.String getIsLastLook() {
            r1 = this;
            java.lang.String r0 = r1.isLastLook
            return r0
    }

    public java.lang.String getLoadType() {
            r1 = this;
            java.lang.String r0 = r1.loadType
            return r0
    }

    public java.lang.String getLogTime() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.getTimeStamp()
            r0.append(r1)
            java.lang.String r1 = ""
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String getLossReason() {
            r1 = this;
            java.lang.String r0 = r1.lossReason
            return r0
    }

    public java.lang.String getMaxWaitTime() {
            r1 = this;
            java.lang.String r0 = r1.maxWaitTime
            return r0
    }

    public java.lang.String getMediationAppId() {
            r1 = this;
            java.lang.String r0 = r1.mediationAppId
            return r0
    }

    public java.lang.String getMediationSpaceId() {
            r1 = this;
            java.lang.String r0 = r1.mediationSpaceId
            return r0
    }

    public java.lang.String getNoticePrice() {
            r1 = this;
            java.lang.String r0 = r1.noticePrice
            return r0
    }

    public java.lang.String getRealPrice() {
            r1 = this;
            java.lang.String r0 = r1.realPrice
            return r0
    }

    public long getRoundTripTime() {
            r2 = this;
            long r0 = r2.roundTripTime
            return r0
    }

    public java.lang.String getSessionId() {
            r1 = this;
            java.lang.String r0 = r1.sessionId
            return r0
    }

    public java.lang.String getSpaceCustomData() {
            r1 = this;
            java.lang.String r0 = r1.spaceCustomData
            return r0
    }

    public void setAdCount(java.lang.String r1) {
            r0 = this;
            r0.adCount = r1
            return
    }

    public void setAdSourceAppId(java.lang.String r1) {
            r0 = this;
            r0.adSourceAppId = r1
            return
    }

    public void setAdSourceCustomData(java.lang.String r1) {
            r0 = this;
            r0.adSourceCustomData = r1
            return
    }

    public void setAdSourceId(java.lang.String r1) {
            r0 = this;
            r0.adSourceId = r1
            return
    }

    public void setAdSourceSpaceId(java.lang.String r1) {
            r0 = this;
            r0.adSourceSpaceId = r1
            return
    }

    public void setAdTimeOut(java.lang.String r1) {
            r0 = this;
            r0.adTimeOut = r1
            return
    }

    public void setAdType(java.lang.String r1) {
            r0 = this;
            r0.adType = r1
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

    public void setBidStrategyCustomData(java.lang.String r1) {
            r0 = this;
            r0.bidStrategyCustomData = r1
            return
    }

    public void setBidType(java.lang.String r1) {
            r0 = this;
            r0.bidType = r1
            return
    }

    public void setEcpm(java.lang.String r1) {
            r0 = this;
            r0.ecpm = r1
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

    public void setFloorPrice(java.lang.String r1) {
            r0 = this;
            r0.floorPrice = r1
            return
    }

    public void setIsHitAuction(java.lang.String r1) {
            r0 = this;
            r0.isHitAuction = r1
            return
    }

    public void setIsLastLook(java.lang.String r1) {
            r0 = this;
            r0.isLastLook = r1
            return
    }

    public void setLoadType(java.lang.String r1) {
            r0 = this;
            r0.loadType = r1
            return
    }

    public void setLossReason(java.lang.String r1) {
            r0 = this;
            r0.lossReason = r1
            return
    }

    public void setMaxWaitTime(java.lang.String r1) {
            r0 = this;
            r0.maxWaitTime = r1
            return
    }

    public void setMediationAppId(java.lang.String r1) {
            r0 = this;
            r0.mediationAppId = r1
            return
    }

    public void setMediationSpaceId(java.lang.String r1) {
            r0 = this;
            r0.mediationSpaceId = r1
            return
    }

    public void setNoticePrice(java.lang.String r1) {
            r0 = this;
            r0.noticePrice = r1
            return
    }

    public void setRealPrice(java.lang.String r1) {
            r0 = this;
            r0.realPrice = r1
            return
    }

    public void setRoundTripTime(long r1) {
            r0 = this;
            r0.roundTripTime = r1
            return
    }

    public void setSessionId(java.lang.String r1) {
            r0 = this;
            r0.sessionId = r1
            return
    }

    public void setSpaceCustomData(java.lang.String r1) {
            r0 = this;
            r0.spaceCustomData = r1
            return
    }
}
