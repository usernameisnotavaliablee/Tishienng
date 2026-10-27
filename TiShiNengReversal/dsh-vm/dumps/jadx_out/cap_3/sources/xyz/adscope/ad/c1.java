package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class c1 extends xyz.adscope.ad.i2 {

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "install")
    private boolean b;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "linkId")
    private java.lang.String c;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "updateTime")
    private long d;

    public c1() {
            r0 = this;
            r0.<init>()
            return
    }

    public c1(org.json.JSONObject r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public void a(long r1) {
            r0 = this;
            r0.d = r1
            return
    }

    public void a(java.lang.String r1) {
            r0 = this;
            r0.c = r1
            return
    }

    public void a(boolean r1) {
            r0 = this;
            r0.b = r1
            return
    }

    public java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.c
            return r0
    }

    public long c() {
            r2 = this;
            long r0 = r2.d
            return r0
    }

    public java.lang.String d() {
            r1 = this;
            boolean r0 = r1.b
            if (r0 == 0) goto L7
            java.lang.String r0 = "1"
            return r0
        L7:
            java.lang.String r0 = "0"
            return r0
    }
}
