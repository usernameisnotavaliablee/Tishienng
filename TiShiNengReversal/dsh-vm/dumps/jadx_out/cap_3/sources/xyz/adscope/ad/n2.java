package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class n2 {
    protected android.content.Context a;

    protected n2(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    protected void a(java.lang.String r2, xyz.adscope.ad.p2 r3, xyz.adscope.common.v2.conn.IBaseHttpResponseCallback r4) {
            r1 = this;
            java.lang.String r0 = "101,1001"
            r1.a(r2, r3, r4, r0)
            return
    }

    protected void a(java.lang.String r5, xyz.adscope.ad.p2 r6, xyz.adscope.common.v2.conn.IBaseHttpResponseCallback r7, java.lang.String r8) {
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L3f
            if (r6 == 0) goto L39
            xyz.adscope.ad.v5 r0 = new xyz.adscope.ad.v5
            android.content.Context r1 = r4.a
            r2 = 1
            r0.<init>(r1, r2)
            r0.setEncryptPatten(r8)
            java.lang.String r6 = r6.a()
            xyz.adscope.common.v2.encrypt.LinkedEncryptManager r1 = xyz.adscope.common.v2.encrypt.LinkedEncryptManager.getInstance()
            android.content.Context r3 = r4.a
            java.lang.Object r1 = r1.getOrCreateImplement(r3)
            xyz.adscope.common.v2.encrypt.ILinkedEncrypt r1 = (xyz.adscope.common.v2.encrypt.ILinkedEncrypt) r1
            xyz.adscope.common.v2.encrypt.ILinkedEncrypt$B64Model r3 = xyz.adscope.common.v2.encrypt.ILinkedEncrypt.B64Model.STEP_BY_STEP
            java.lang.String r8 = r1.encrypt(r6, r8, r3, r2)
            boolean r6 = xyz.adscope.common.v2.tool.json.JsonUtil.isValidJson(r6)
            if (r6 == 0) goto L33
            r0.requestWithPostMethod(r5, r8, r7)
            return
        L33:
            xyz.adscope.ad.q5 r5 = xyz.adscope.ad.q5.e
            r4.a(r5, r7)
            return
        L39:
            xyz.adscope.ad.q5 r5 = xyz.adscope.ad.q5.d
            r4.a(r5, r7)
            return
        L3f:
            xyz.adscope.ad.q5 r5 = xyz.adscope.ad.q5.c
            r4.a(r5, r7)
            return
    }

    protected void a(xyz.adscope.ad.q5 r1, xyz.adscope.common.v2.conn.IBaseHttpResponseCallback r2) {
            r0 = this;
            if (r2 == 0) goto L5
            r2.failCallback(r1)
        L5:
            return
    }
}
