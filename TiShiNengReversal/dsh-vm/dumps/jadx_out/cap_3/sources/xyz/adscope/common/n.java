package xyz.adscope.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class n {
    private xyz.adscope.common.analyse.publish.IEventConfigModel a;
    private xyz.adscope.common.n b;
    private xyz.adscope.common.p<xyz.adscope.common.analyse.model.impl.HistoryDbModel> c;
    private xyz.adscope.common.n.b d;
    private final xyz.adscope.common.n.c e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface b {
        void a(java.util.List<xyz.adscope.common.analyse.model.impl.HistoryDbModel> r1);

        void a(xyz.adscope.common.analyse.model.impl.HistoryDbModel r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class c implements xyz.adscope.common.p.a {
        final /* synthetic */ xyz.adscope.common.n a;

        private c(xyz.adscope.common.n r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ c(xyz.adscope.common.n r1, xyz.adscope.common.n.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // xyz.adscope.common.p.a
        public void a(java.util.List r2) {
                r1 = this;
                xyz.adscope.common.n r0 = r1.a
                xyz.adscope.common.n.a(r0, r2)
                return
        }
    }

    n() {
            r2 = this;
            r2.<init>()
            xyz.adscope.common.n$c r0 = new xyz.adscope.common.n$c
            r1 = 0
            r0.<init>(r2, r1)
            r2.e = r0
            return
    }

    private void a(java.util.List<xyz.adscope.common.analyse.model.impl.HistoryDbModel> r2) {
            r1 = this;
            xyz.adscope.common.n$b r0 = r1.d
            if (r0 == 0) goto L7
            r0.a(r2)
        L7:
            return
    }

    private void a(xyz.adscope.common.analyse.model.impl.HistoryDbModel r2) {
            r1 = this;
            xyz.adscope.common.n$b r0 = r1.d
            if (r0 == 0) goto L7
            r0.a(r2)
        L7:
            return
    }

    static /* synthetic */ void a(xyz.adscope.common.n r0, java.util.List r1) {
            r0.a(r1)
            return
    }

    private boolean a(xyz.adscope.common.analyse.model.IBaseEventReportModel r2) {
            r1 = this;
            xyz.adscope.common.analyse.publish.IEventConfigModel r0 = r1.a
            if (r0 == 0) goto L25
            java.util.List r0 = r0.getCodes()
            if (r0 == 0) goto L25
            xyz.adscope.common.analyse.publish.IEventConfigModel r0 = r1.a
            java.util.List r0 = r0.getCodes()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L25
            xyz.adscope.common.analyse.publish.IEventConfigModel r0 = r1.a
            java.util.List r0 = r0.getCodes()
            java.lang.String r2 = r2.getEventCode()
            boolean r2 = r0.contains(r2)
            return r2
        L25:
            r2 = 0
            return r2
    }

    private void b(xyz.adscope.common.analyse.model.IBaseEventReportModel r2) {
            r1 = this;
            xyz.adscope.common.n r0 = r1.b
            if (r0 == 0) goto L7
            r0.d(r2)
        L7:
            return
    }

    private xyz.adscope.common.analyse.model.impl.HistoryDbModel c(xyz.adscope.common.analyse.model.IBaseEventReportModel r5) {
            r4 = this;
            xyz.adscope.common.analyse.publish.IEventConfigModel r0 = r4.a
            java.lang.String r0 = r0.getMacros()
            xyz.adscope.common.analyse.publish.IEventConfigModel r1 = r4.a
            java.lang.String r1 = r1.getUploadURL()
            xyz.adscope.common.analyse.publish.IEventConfigModel r2 = r4.a
            java.lang.String r2 = r2.getAcceptEncrypt()
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L41
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L41
            xyz.adscope.common.analyse.model.impl.HistoryDbModel r3 = new xyz.adscope.common.analyse.model.impl.HistoryDbModel
            r3.<init>()
            java.util.Map r5 = r5.getMacrosReplaceMap()
            r3.setUrl(r1)
            r3.setEncrypt(r2)
            java.lang.String r1 = ""
            r3.setApiKey(r1)
            long r1 = java.lang.System.currentTimeMillis()
            r3.setStoreTime(r1)
            java.lang.String r5 = xyz.adscope.common.v2.tool.str.RegexUtil.replaceMacros(r0, r5)
            r3.setMacros(r5)
            return r3
        L41:
            r5 = 0
            return r5
    }

    void a(xyz.adscope.common.analyse.publish.IEventConfigModel r4) {
            r3 = this;
            r3.a = r4
            java.lang.String r0 = r4.getTime()
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> Lb
            goto Ld
        Lb:
            r0 = 0
        Ld:
            xyz.adscope.common.p r2 = new xyz.adscope.common.p
            int r4 = r4.getCount()
            r2.<init>(r4, r0)
            r3.c = r2
            return
    }

    void a(xyz.adscope.common.n.b r1) {
            r0 = this;
            r0.d = r1
            return
    }

    void a(xyz.adscope.common.n r1) {
            r0 = this;
            r0.b = r1
            return
    }

    void d(xyz.adscope.common.analyse.model.IBaseEventReportModel r3) {
            r2 = this;
            xyz.adscope.common.p<xyz.adscope.common.analyse.model.impl.HistoryDbModel> r0 = r2.c
            xyz.adscope.common.n$c r1 = r2.e
            r0.a(r1)
            boolean r0 = r2.a(r3)
            if (r0 == 0) goto L1c
            xyz.adscope.common.analyse.model.impl.HistoryDbModel r3 = r2.c(r3)
            if (r3 == 0) goto L1b
            r2.a(r3)
            xyz.adscope.common.p<xyz.adscope.common.analyse.model.impl.HistoryDbModel> r0 = r2.c
            r0.a(r3)
        L1b:
            return
        L1c:
            r2.b(r3)
            return
    }
}
