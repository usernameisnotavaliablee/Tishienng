package xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class DownloadInfoModel extends xyz.adscope.ad.model.impl.resp.ASNPJsonResponseModel {

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "iconUrl")
    private java.lang.String a;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "bundle")
    private java.lang.String b;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "name")
    private java.lang.String c;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "size")
    private java.lang.String d;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "developer")
    private java.lang.String e;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "permission")
    private java.util.List<xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.permission.PermissionModel> f;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "policyUrl")
    private java.lang.String g;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "version")
    private java.lang.String h;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "permissionUrl")
    private java.lang.String i;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "policy")
    private java.lang.String j;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "appintro")
    private java.lang.String k;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "md5")
    private java.lang.String l;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "ext")
    private xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.ext.DownloadExtModel m;

    public DownloadInfoModel(org.json.JSONObject r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.l
            return r0
    }

    public java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.k
            return r0
    }

    public java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }

    public java.lang.String d() {
            r1 = this;
            java.lang.String r0 = r1.e
            return r0
    }

    public java.lang.String e() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public java.lang.String f() {
            r1 = this;
            java.lang.String r0 = r1.c
            return r0
    }

    public java.util.List<xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.permission.PermissionModel> g() {
            r1 = this;
            java.util.List<xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.permission.PermissionModel> r0 = r1.f
            return r0
    }

    public java.lang.String h() {
            r1 = this;
            java.lang.String r0 = r1.i
            return r0
    }

    public java.lang.String i() {
            r1 = this;
            java.lang.String r0 = r1.j
            return r0
    }

    public java.lang.String j() {
            r1 = this;
            java.lang.String r0 = r1.g
            return r0
    }

    public java.lang.String k() {
            r1 = this;
            java.lang.String r0 = r1.d
            return r0
    }

    public java.lang.String l() {
            r1 = this;
            java.lang.String r0 = r1.h
            return r0
    }

    public boolean m() {
            r2 = this;
            java.lang.String r0 = r2.c
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 0
            if (r0 == 0) goto La
            return r1
        La:
            java.lang.String r0 = r2.e
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L13
            return r1
        L13:
            java.lang.String r0 = r2.h
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1c
            return r1
        L1c:
            java.lang.String r0 = r2.j
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L2d
            java.lang.String r0 = r2.g
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L2d
            return r1
        L2d:
            java.util.List<xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.permission.PermissionModel> r0 = r2.f
            if (r0 == 0) goto L37
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L40
        L37:
            java.lang.String r0 = r2.i
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L40
            return r1
        L40:
            java.lang.String r0 = r2.k
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L49
            return r1
        L49:
            r0 = 1
            return r0
    }

    public boolean n() {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.ext.DownloadExtModel r0 = r1.m
            if (r0 == 0) goto Ld
            boolean r0 = r0.a()
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
            r0 = 1
            return r0
    }

    public boolean o() {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.down.ext.DownloadExtModel r0 = r1.m
            if (r0 == 0) goto Ld
            boolean r0 = r0.b()
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
            r0 = 1
            return r0
    }
}
