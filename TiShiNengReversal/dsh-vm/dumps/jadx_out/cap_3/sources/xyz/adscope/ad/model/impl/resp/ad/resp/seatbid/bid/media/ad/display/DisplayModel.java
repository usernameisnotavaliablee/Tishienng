package xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class DisplayModel extends xyz.adscope.ad.model.impl.resp.ASNPJsonResponseModel {

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "id")
    private java.lang.String a;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "native")
    private xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.NativeModel b;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "event")
    private java.util.List<xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.event.EventModel> c;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "report")
    private xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.report.ReportModel d;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "ext")
    private xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.ext.DisplayExtModel e;

    public DisplayModel(org.json.JSONObject r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public java.util.List<xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.event.EventModel> a() {
            r1 = this;
            java.util.List<xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.event.EventModel> r0 = r1.c
            return r0
    }

    public xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.ext.DisplayExtModel b() {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.ext.DisplayExtModel r0 = r1.e
            return r0
    }

    public java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.NativeModel d() {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.NativeModel r0 = r1.b
            return r0
    }

    public xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.report.ReportModel e() {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.report.ReportModel r0 = r1.d
            return r0
    }

    public java.lang.String f() {
            r2 = this;
            org.json.JSONObject r0 = r2.mJsonObject
            if (r0 == 0) goto L15
            java.lang.String r1 = "event"
            org.json.JSONArray r0 = xyz.adscope.common.v2.tool.json.JsonUtil.getJSONArray(r0, r1)
            if (r0 == 0) goto L15
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = xyz.adscope.common.v2.encrypt.impl.MD5Util.md5(r0)
            return r0
        L15:
            java.lang.String r0 = "DEFAULT_EVENT"
            java.lang.String r0 = xyz.adscope.common.v2.encrypt.impl.MD5Util.md5(r0)
            return r0
    }
}
