package xyz.adscope.ad.model.impl.db;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AdvertisingDBModel extends xyz.adscope.common.v2.persistent.db.IBaseDatabaseModel {

    @xyz.adscope.common.v2.model.annotation.DataBaseNode(column = "cacheKey")
    private java.lang.String a;

    @xyz.adscope.common.v2.model.annotation.DataBaseNode(column = "cacheTime")
    private java.lang.String b;

    @xyz.adscope.common.v2.model.annotation.DataBaseNode(column = "expireTime")
    private java.lang.String c;

    @xyz.adscope.common.v2.model.annotation.DataBaseNode(column = "cacheData")
    private java.lang.String d;

    public AdvertisingDBModel() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.d
            return r0
    }

    public void a(long r2) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = ""
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r1.b = r2
            return
    }

    public void a(java.lang.String r1) {
            r0 = this;
            r0.d = r1
            return
    }

    public void b(long r2) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = ""
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r1.c = r2
            return
    }

    public void b(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }
}
