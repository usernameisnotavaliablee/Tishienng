package xyz.adscope.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
final class i implements java.lang.Runnable {
    private final xyz.adscope.common.v2.persistent.db.IBaseDBOperator a;
    private final xyz.adscope.common.h b;
    private final android.content.Context c;
    private java.util.List<xyz.adscope.common.analyse2.base.model.biz.AnalyseSimpleLog> d;
    private java.util.List<xyz.adscope.common.analyse2.db.AnalyseEventDBModel> e;
    private java.lang.String f;
    private java.lang.String g;
    private java.lang.String h;
    private java.util.List<xyz.adscope.common.v2.crash.ScopeCrashLog> i;
    private xyz.adscope.common.i.b j;
    private java.util.List<java.lang.String> k;

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
        void a();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class c implements xyz.adscope.common.v2.conn.IBaseHttpResponseCallback {
        private final xyz.adscope.common.analyse2.db.AnalyseEventDBModel a;
        final /* synthetic */ xyz.adscope.common.i b;

        private c(xyz.adscope.common.i r1, xyz.adscope.common.analyse2.db.AnalyseEventDBModel r2) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                r0.a = r2
                return
        }

        /* synthetic */ c(xyz.adscope.common.i r1, xyz.adscope.common.analyse2.db.AnalyseEventDBModel r2, xyz.adscope.common.i.a r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        private void a() {
                r2 = this;
                xyz.adscope.common.i r0 = r2.b
                xyz.adscope.common.v2.persistent.db.IBaseDBOperator r0 = xyz.adscope.common.i.a(r0)
                if (r0 == 0) goto L13
                xyz.adscope.common.i r0 = r2.b
                xyz.adscope.common.v2.persistent.db.IBaseDBOperator r0 = xyz.adscope.common.i.a(r0)
                xyz.adscope.common.analyse2.db.AnalyseEventDBModel r1 = r2.a
                r0.insert(r1)
            L13:
                return
        }

        private void a(xyz.adscope.common.v2.conn.IBaseHttpResponse r3) {
                r2 = this;
                if (r3 == 0) goto L21
                int r0 = r3.getResponseCode()
                r1 = 200(0xc8, float:2.8E-43)
                if (r0 != r1) goto L21
                boolean r3 = r2.b(r3)
                if (r3 == 0) goto L21
                xyz.adscope.common.i r3 = r2.b
                xyz.adscope.common.i$b r3 = xyz.adscope.common.i.b(r3)
                if (r3 == 0) goto L21
                xyz.adscope.common.i r3 = r2.b
                xyz.adscope.common.i$b r3 = xyz.adscope.common.i.b(r3)
                r3.a()
            L21:
                return
        }

        private boolean b(xyz.adscope.common.v2.conn.IBaseHttpResponse r4) {
                r3 = this;
                java.lang.String r4 = r4.getResponseResult()
                boolean r0 = android.text.TextUtils.isEmpty(r4)
                r1 = 0
                if (r0 != 0) goto L2d
                org.json.JSONObject r4 = xyz.adscope.common.v2.tool.json.JsonUtil.parseJSONObject(r4)
                if (r4 == 0) goto L2d
                java.lang.String r0 = "code"
                int r0 = xyz.adscope.common.v2.tool.json.JsonUtil.getInt(r4, r0, r1)
                r2 = 200(0xc8, float:2.8E-43)
                if (r0 != r2) goto L2d
                java.lang.String r0 = "data"
                org.json.JSONObject r4 = xyz.adscope.common.v2.tool.json.JsonUtil.getJSONObject(r4, r0)
                if (r4 == 0) goto L2d
                java.lang.String r0 = "isUpdate"
                int r4 = xyz.adscope.common.v2.tool.json.JsonUtil.getInt(r4, r0, r1)
                r0 = 1
                if (r0 != r4) goto L2d
                return r0
            L2d:
                return r1
        }

        @Override // xyz.adscope.common.v2.conn.IBaseHttpResponseCallback
        public void failCallback(xyz.adscope.common.v2.conn.IHttpRequestError r1) {
                r0 = this;
                r0.a()
                return
        }

        @Override // xyz.adscope.common.v2.conn.IBaseHttpResponseCallback
        public void successCallback(xyz.adscope.common.v2.conn.IBaseHttpResponse r5) {
                r4 = this;
                xyz.adscope.common.analyse2.db.AnalyseEventDBModel r0 = r4.a
                if (r0 == 0) goto L1b
                boolean r0 = r0.b()
                if (r0 == 0) goto L1b
                xyz.adscope.common.i r0 = r4.b
                xyz.adscope.common.v2.persistent.db.IBaseDBOperator r0 = xyz.adscope.common.i.a(r0)
                xyz.adscope.common.analyse2.db.AnalyseEventDBModel r1 = r4.a
                long r1 = r1.getPrimaryID()
                java.lang.Class<xyz.adscope.common.analyse2.db.AnalyseEventDBModel> r3 = xyz.adscope.common.analyse2.db.AnalyseEventDBModel.class
                r0.deleteByPrimaryKey(r3, r1)
            L1b:
                r4.a(r5)
                return
        }
    }

    i(android.content.Context r1, xyz.adscope.common.v2.persistent.db.IBaseDBOperator r2, xyz.adscope.common.h r3) {
            r0 = this;
            r0.<init>()
            r0.a = r2
            r0.b = r3
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            r0.c = r1
            return
    }

    static /* synthetic */ xyz.adscope.common.v2.persistent.db.IBaseDBOperator a(xyz.adscope.common.i r0) {
            xyz.adscope.common.v2.persistent.db.IBaseDBOperator r0 = r0.a
            return r0
    }

    private void a(xyz.adscope.common.analyse2.db.AnalyseEventDBModel r5) {
            r4 = this;
            if (r5 == 0) goto L1d
            java.lang.String r0 = r5.getUrl()
            java.lang.String r1 = r5.getEncrypt()
            xyz.adscope.common.i$c r2 = new xyz.adscope.common.i$c
            r3 = 0
            r2.<init>(r4, r5, r3)
            xyz.adscope.common.h r3 = r4.b
            java.lang.String r5 = r5.a()
            byte[] r5 = xyz.adscope.common.v2.tool.str.StringUtil.hexStringToBytes(r5)
            r3.a(r0, r1, r5, r2)
        L1d:
            return
    }

    static /* synthetic */ xyz.adscope.common.i.b b(xyz.adscope.common.i r0) {
            xyz.adscope.common.i$b r0 = r0.j
            return r0
    }

    void a(java.lang.String r1, java.lang.String r2, java.util.List<java.lang.String> r3, java.lang.String r4) {
            r0 = this;
            r0.f = r1
            r0.g = r2
            r0.h = r4
            r0.k = r3
            return
    }

    void a(java.util.List<xyz.adscope.common.v2.crash.ScopeCrashLog> r1) {
            r0 = this;
            r0.i = r1
            return
    }

    void a(xyz.adscope.common.i.b r1) {
            r0 = this;
            r0.j = r1
            return
    }

    void b(java.util.List<xyz.adscope.common.analyse2.db.AnalyseEventDBModel> r1) {
            r0 = this;
            r0.e = r1
            return
    }

    void c(java.util.List<xyz.adscope.common.analyse2.base.model.biz.AnalyseSimpleLog> r1) {
            r0 = this;
            r0.d = r1
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r5 = this;
            java.util.List<xyz.adscope.common.analyse2.db.AnalyseEventDBModel> r0 = r5.e
            if (r0 == 0) goto L20
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L20
            java.util.List<xyz.adscope.common.analyse2.db.AnalyseEventDBModel> r0 = r5.e
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            xyz.adscope.common.analyse2.db.AnalyseEventDBModel r1 = (xyz.adscope.common.analyse2.db.AnalyseEventDBModel) r1
            r5.a(r1)
            goto L10
        L20:
            xyz.adscope.common.analyse2.publish.ScopeEventAnalyserManager r0 = xyz.adscope.common.analyse2.publish.ScopeEventAnalyserManager.getInstance()
            android.content.Context r1 = r5.c
            java.lang.Object r0 = r0.getOrCreateImplement(r1)
            xyz.adscope.common.analyse2.publish.IScopeEventAnalyser r0 = (xyz.adscope.common.analyse2.publish.IScopeEventAnalyser) r0
            boolean r1 = r0 instanceof xyz.adscope.common.m
            if (r1 == 0) goto L4c
            xyz.adscope.common.m r0 = (xyz.adscope.common.m) r0
            java.lang.String r1 = r5.h
            org.json.JSONObject r0 = r0.a(r1)
            java.util.List<java.lang.String> r1 = r5.k
            r2 = 0
            if (r1 == 0) goto L46
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            java.lang.String[] r1 = (java.lang.String[]) r1
            goto L48
        L46:
            java.lang.String[] r1 = new java.lang.String[r2]
        L48:
            xyz.adscope.common.v2.tool.json.JsonUtil.removeJsonObjectKeys(r0, r1)
            goto L4d
        L4c:
            r0 = 0
        L4d:
            if (r0 == 0) goto L8c
            java.util.List<xyz.adscope.common.v2.crash.ScopeCrashLog> r1 = r5.i
            if (r1 == 0) goto L71
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L71
            java.lang.String r1 = "custom_id"
            java.lang.String r2 = "crash"
            xyz.adscope.common.v2.tool.json.JsonUtil.updateJSONValue(r0, r1, r2)
            android.content.Context r1 = r5.c
            java.lang.String r2 = r5.f
            java.lang.String r3 = r5.g
            java.util.List<xyz.adscope.common.v2.crash.ScopeCrashLog> r4 = r5.i
            xyz.adscope.common.analyse2.db.AnalyseEventDBModel r1 = xyz.adscope.common.c.a(r1, r2, r3, r0, r4)
            if (r1 == 0) goto L71
            r5.a(r1)
        L71:
            java.util.List<xyz.adscope.common.analyse2.base.model.biz.AnalyseSimpleLog> r1 = r5.d
            if (r1 == 0) goto L8c
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L8c
            android.content.Context r1 = r5.c
            java.lang.String r2 = r5.f
            java.lang.String r3 = r5.g
            java.util.List<xyz.adscope.common.analyse2.base.model.biz.AnalyseSimpleLog> r4 = r5.d
            xyz.adscope.common.analyse2.db.AnalyseEventDBModel r0 = xyz.adscope.common.c.b(r1, r2, r3, r0, r4)
            if (r0 == 0) goto L8c
            r5.a(r0)
        L8c:
            return
    }
}
