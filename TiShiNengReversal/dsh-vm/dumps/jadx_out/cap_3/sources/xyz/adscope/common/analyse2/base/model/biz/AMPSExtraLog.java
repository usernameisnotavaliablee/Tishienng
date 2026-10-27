package xyz.adscope.common.analyse2.base.model.biz;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSExtraLog extends xyz.adscope.common.analyse2.base.model.biz.AnalyseAdEventLog {

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "s_custom_data")
    private java.lang.String customData;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "ecpm")
    private java.lang.String ecpm;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "floor_price")
    private java.lang.String floorPrice;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "bid_seat_id")
    private java.lang.String mBidSeatID;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "bid_space_id")
    private java.lang.String mBidSpaceID;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "bid_type")
    private java.lang.String mBidType;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "s_app_id")
    private java.lang.String mChannelAppID;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "s_space_id")
    private java.lang.String mChannelSpaceID;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "is_hit_auction")
    private java.lang.String mHitAuction;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "is_last_look")
    private java.lang.String mLastLook;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "load_type")
    private java.lang.String mLoadType;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "loss_reason")
    private java.lang.String mLossReason;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "notice_price")
    private java.lang.String mNoticePrice;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "real_price")
    private java.lang.String mRealPrice;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "seat_id")
    private java.lang.String mSeatID;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "s_time_out")
    private java.lang.String mTimeout;

    public AMPSExtraLog(org.json.JSONObject r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }
}
