package xyz.adscope.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
class b implements java.lang.Runnable {
    private final xyz.adscope.common.v2.persistent.db.IBaseDBOperator a;
    private final xyz.adscope.common.h b;
    private final android.content.Context c;

    b(android.content.Context r1, xyz.adscope.common.v2.persistent.db.IBaseDBOperator r2, xyz.adscope.common.h r3) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            r0.c = r1
            r0.b = r3
            r0.a = r2
            return
    }

    private void a() {
            r4 = this;
            xyz.adscope.common.v2.persistent.db.IBaseDBOperator r0 = r4.a
            if (r0 == 0) goto L3a
            r0 = 3
            long r0 = xyz.adscope.common.v2.tool.date.DateUtil.getTimeMillisBeforeDay(r0)
            xyz.adscope.common.v2.persistent.db.IBaseDBOperator r2 = r4.a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = ""
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.Class<xyz.adscope.common.analyse2.db.AnalyseEventDBModel> r1 = xyz.adscope.common.analyse2.db.AnalyseEventDBModel.class
            java.lang.String r3 = "eventTime"
            int r0 = r2.deleteLessThenWhere(r1, r3, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "删除过期的日志... 共计: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "AnalyseDBHistoryTask"
            xyz.adscope.common.v2.log.SDKLog.d(r1, r0)
        L3a:
            return
    }

    private java.util.List<xyz.adscope.common.analyse2.db.AnalyseEventDBModel> b() {
            r3 = this;
            xyz.adscope.common.v2.persistent.db.IBaseDBOperator r0 = r3.a
            if (r0 == 0) goto L34
            java.lang.String r1 = "eventTime"
            java.lang.String r1 = r0.getOrderByAsc(r1)
            java.lang.Class<xyz.adscope.common.analyse2.db.AnalyseEventDBModel> r2 = xyz.adscope.common.analyse2.db.AnalyseEventDBModel.class
            java.util.List r0 = r0.query(r2, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "从数据库查询数据..."
            r1.append(r2)
            if (r0 == 0) goto L25
            int r2 = r0.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L27
        L25:
            java.lang.String r2 = " 历史数据为空..."
        L27:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "AnalyseDBHistoryTask"
            xyz.adscope.common.v2.log.SDKLog.d(r2, r1)
            return r0
        L34:
            r0 = 0
            return r0
    }

    @Override // java.lang.Runnable
    public void run() {
            r5 = this;
            r5.a()
            java.util.List r0 = r5.b()
            if (r0 == 0) goto L35
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L35
            java.util.Iterator r1 = r0.iterator()
        L13:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L24
            java.lang.Object r2 = r1.next()
            xyz.adscope.common.analyse2.db.AnalyseEventDBModel r2 = (xyz.adscope.common.analyse2.db.AnalyseEventDBModel) r2
            r3 = 1
            r2.a(r3)
            goto L13
        L24:
            xyz.adscope.common.i r1 = new xyz.adscope.common.i
            android.content.Context r2 = r5.c
            xyz.adscope.common.v2.persistent.db.IBaseDBOperator r3 = r5.a
            xyz.adscope.common.h r4 = r5.b
            r1.<init>(r2, r3, r4)
            r1.b(r0)
            r1.run()
        L35:
            return
    }
}
