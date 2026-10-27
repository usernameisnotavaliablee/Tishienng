package xyz.adscope.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class o {
    private final xyz.adscope.common.o.a a;
    private final android.content.Context b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a extends xyz.adscope.common.v2.conn.IBaseEncryptRequest {
        public a(android.content.Context r1, boolean r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    o(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            android.content.Context r0 = r3.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            r2.b = r0
            xyz.adscope.common.o$a r0 = new xyz.adscope.common.o$a
            r1 = 1
            r0.<init>(r3, r1)
            r2.a = r0
            return
    }

    private java.lang.String a(java.util.List<xyz.adscope.common.analyse.model.impl.HistoryDbModel> r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "["
            r0.append(r1)
            java.util.Iterator r4 = r4.iterator()
        Le:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r4.next()
            xyz.adscope.common.analyse.model.impl.HistoryDbModel r1 = (xyz.adscope.common.analyse.model.impl.HistoryDbModel) r1
            java.lang.String r1 = r1.getMacros()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto Le
            r0.append(r1)
            java.lang.String r1 = ","
            r0.append(r1)
            goto Le
        L2d:
            int r4 = r0.length()
            r1 = 1
            if (r4 <= r1) goto L3f
            int r4 = r0.length()
            int r4 = r4 - r1
            r1 = 93
            r0.setCharAt(r4, r1)
            goto L44
        L3f:
            java.lang.String r4 = "]"
            r0.append(r4)
        L44:
            java.lang.String r4 = r0.toString()
            return r4
    }

    void a(java.lang.String r4, java.lang.String r5, java.util.List<xyz.adscope.common.analyse.model.impl.HistoryDbModel> r6, xyz.adscope.common.v2.conn.IBaseHttpResponseCallback r7) {
            r3 = this;
            xyz.adscope.common.o$a r0 = r3.a
            r0.setEncryptPatten(r5)
            java.lang.String r6 = r3.a(r6)
            xyz.adscope.common.v2.encrypt.LinkedEncryptManager r0 = xyz.adscope.common.v2.encrypt.LinkedEncryptManager.getInstance()
            android.content.Context r1 = r3.b
            java.lang.Object r0 = r0.getOrCreateImplement(r1)
            xyz.adscope.common.v2.encrypt.ILinkedEncrypt r0 = (xyz.adscope.common.v2.encrypt.ILinkedEncrypt) r0
            xyz.adscope.common.v2.encrypt.ILinkedEncrypt$B64Model r1 = xyz.adscope.common.v2.encrypt.ILinkedEncrypt.B64Model.AS_LAST_OR_FIRST
            r2 = 1
            java.lang.String r5 = r0.encrypt(r6, r5, r1, r2)
            xyz.adscope.common.o$a r6 = r3.a
            r6.requestWithPostMethod(r4, r5, r7)
            return
    }
}
