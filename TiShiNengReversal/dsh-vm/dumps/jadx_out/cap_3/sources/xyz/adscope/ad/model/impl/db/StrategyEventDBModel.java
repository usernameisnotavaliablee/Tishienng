package xyz.adscope.ad.model.impl.db;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class StrategyEventDBModel extends xyz.adscope.common.v2.persistent.db.IBaseDatabaseModel {

    @xyz.adscope.common.v2.model.annotation.DataBaseNode(column = "apiKey")
    private java.lang.String a;

    @xyz.adscope.common.v2.model.annotation.DataBaseNode(column = "eventCode")
    private java.lang.String b;

    @xyz.adscope.common.v2.model.annotation.DataBaseNode(column = "spaceId")
    private java.lang.String c;

    @xyz.adscope.common.v2.model.annotation.DataBaseNode(column = "eventTime")
    private java.lang.String d;

    public StrategyEventDBModel() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }

    public void a(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public long b() {
            r2 = this;
            java.lang.String r0 = r2.d
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lf
            java.lang.String r0 = r2.d
            long r0 = xyz.adscope.common.v2.tool.str.StringUtil.parseLong(r0)
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public void b(java.lang.String r1) {
            r0 = this;
            r0.b = r1
            return
    }

    public java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.c
            return r0
    }

    public void c(java.lang.String r1) {
            r0 = this;
            r0.d = r1
            return
    }

    public void d(java.lang.String r1) {
            r0 = this;
            r0.c = r1
            return
    }
}
