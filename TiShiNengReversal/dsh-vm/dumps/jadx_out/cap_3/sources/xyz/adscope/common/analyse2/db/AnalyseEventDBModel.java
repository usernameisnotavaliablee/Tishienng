package xyz.adscope.common.analyse2.db;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AnalyseEventDBModel extends xyz.adscope.common.v2.persistent.db.IBaseDatabaseModel {

    @xyz.adscope.common.v2.model.annotation.DataBaseNode(column = "reportUrl")
    private java.lang.String a;

    @xyz.adscope.common.v2.model.annotation.DataBaseNode(column = "eventTime")
    private java.lang.String b;

    @xyz.adscope.common.v2.model.annotation.DataBaseNode(column = "encrypt")
    private java.lang.String c;

    @xyz.adscope.common.v2.model.annotation.DataBaseNode(column = "body")
    private java.lang.String d;
    private boolean e;

    public AnalyseEventDBModel() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.a = r0
            r1.b = r0
            r1.c = r0
            r1.d = r0
            r0 = 0
            r1.e = r0
            return
    }

    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.d
            return r0
    }

    public void a(java.lang.String r1) {
            r0 = this;
            r0.d = r1
            return
    }

    public void a(boolean r1) {
            r0 = this;
            r0.e = r1
            return
    }

    public void b(java.lang.String r1) {
            r0 = this;
            r0.b = r1
            return
    }

    public boolean b() {
            r1 = this;
            boolean r0 = r1.e
            return r0
    }

    public java.lang.String getEncrypt() {
            r1 = this;
            java.lang.String r0 = r1.c
            return r0
    }

    public java.lang.String getUrl() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public void setEncrypt(java.lang.String r1) {
            r0 = this;
            r0.c = r1
            return
    }

    public void setUrl(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }
}
