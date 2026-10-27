package xyz.adscope.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
final class l implements xyz.adscope.common.analyse.publish.IEventAnalyser {
    private final xyz.adscope.common.o a;
    private final java.util.Map<java.lang.String, java.util.LinkedList<xyz.adscope.common.n>> b;
    private final android.content.Context c;
    private final xyz.adscope.common.v2.persistent.db.IBaseDBOperator d;
    private xyz.adscope.common.l.b e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class b extends xyz.adscope.common.v2.thread.pool.IRemoveAbleScheduledTask {
        public b(java.lang.Runnable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private void a() {
                r0 = this;
                r0.stopScheduled()
                return
        }

        private void a(long r1, long r3, java.util.concurrent.TimeUnit r5) {
                r0 = this;
                r0.startScheduled(r1, r3, r5)
                return
        }

        static /* synthetic */ void a(xyz.adscope.common.l.b r0) {
                r0.a()
                return
        }

        static /* synthetic */ void a(xyz.adscope.common.l.b r0, long r1, long r3, java.util.concurrent.TimeUnit r5) {
                r0.a(r1, r3, r5)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class c implements java.lang.Runnable {
        private final xyz.adscope.common.v2.persistent.db.IBaseDBOperator a;
        private final xyz.adscope.common.o b;

        private c(xyz.adscope.common.v2.persistent.db.IBaseDBOperator r1, xyz.adscope.common.o r2) {
                r0 = this;
                r0.<init>()
                r0.b = r2
                r0.a = r1
                return
        }

        /* synthetic */ c(xyz.adscope.common.v2.persistent.db.IBaseDBOperator r1, xyz.adscope.common.o r2, xyz.adscope.common.l.a r3) {
                r0 = this;
                r0.<init>(r1, r2)
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
                java.lang.Class<xyz.adscope.common.analyse.model.impl.HistoryDbModel> r1 = xyz.adscope.common.analyse.model.impl.HistoryDbModel.class
                java.lang.String r3 = "storeTime"
                int r0 = r2.deleteLessThenWhere(r1, r3, r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "删除过期的日志... 共计: "
                r1.append(r2)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                java.lang.String r1 = "EventLoggerImpl"
                xyz.adscope.common.v2.log.SDKLog.d(r1, r0)
            L3a:
                return
        }

        private java.util.List<xyz.adscope.common.analyse.model.impl.HistoryDbModel> b() {
                r3 = this;
                xyz.adscope.common.v2.persistent.db.IBaseDBOperator r0 = r3.a
                if (r0 == 0) goto L34
                java.lang.String r1 = "storeTime"
                java.lang.String r1 = r0.getOrderByAsc(r1)
                java.lang.Class<xyz.adscope.common.analyse.model.impl.HistoryDbModel> r2 = xyz.adscope.common.analyse.model.impl.HistoryDbModel.class
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
                java.lang.String r2 = "EventLoggerImpl"
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
                if (r0 == 0) goto L1c
                boolean r1 = r0.isEmpty()
                if (r1 != 0) goto L1c
                xyz.adscope.common.l$d r1 = new xyz.adscope.common.l$d
                xyz.adscope.common.v2.persistent.db.IBaseDBOperator r2 = r5.a
                xyz.adscope.common.o r3 = r5.b
                r4 = 0
                r1.<init>(r0, r2, r3, r4)
                r1.run()
            L1c:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class d implements java.lang.Runnable {
        private final java.util.List<xyz.adscope.common.analyse.model.impl.HistoryDbModel> a;
        private final xyz.adscope.common.v2.persistent.db.IBaseDBOperator b;
        private final xyz.adscope.common.o c;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private class a implements xyz.adscope.common.v2.conn.IBaseHttpResponseCallback {
            private final long[] a;
            final /* synthetic */ xyz.adscope.common.l.d b;

            private a(xyz.adscope.common.l.d r1, long[] r2) {
                    r0 = this;
                    r0.b = r1
                    r0.<init>()
                    r0.a = r2
                    return
            }

            /* synthetic */ a(xyz.adscope.common.l.d r1, long[] r2, xyz.adscope.common.l.a r3) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            private void a(long[] r3) {
                    r2 = this;
                    xyz.adscope.common.l$d r0 = r2.b
                    xyz.adscope.common.v2.persistent.db.IBaseDBOperator r0 = xyz.adscope.common.l.d.a(r0)
                    if (r0 == 0) goto L13
                    xyz.adscope.common.l$d r0 = r2.b
                    xyz.adscope.common.v2.persistent.db.IBaseDBOperator r0 = xyz.adscope.common.l.d.a(r0)
                    java.lang.Class<xyz.adscope.common.analyse.model.impl.HistoryDbModel> r1 = xyz.adscope.common.analyse.model.impl.HistoryDbModel.class
                    r0.deleteInPrimaryKey(r1, r3)
                L13:
                    return
            }

            @Override // xyz.adscope.common.v2.conn.IBaseHttpResponseCallback
            public void failCallback(xyz.adscope.common.v2.conn.IHttpRequestError r3) {
                    r2 = this;
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "上报失败..."
                    r0.append(r1)
                    int r1 = r3.getErrorCode()
                    r0.append(r1)
                    java.lang.String r1 = " "
                    r0.append(r1)
                    java.lang.String r3 = r3.getErrorMessage()
                    r0.append(r3)
                    java.lang.String r3 = r0.toString()
                    java.lang.String r0 = "EventLoggerImpl"
                    xyz.adscope.common.v2.log.SDKLog.e(r0, r3)
                    return
            }

            @Override // xyz.adscope.common.v2.conn.IBaseHttpResponseCallback
            public void successCallback(xyz.adscope.common.v2.conn.IBaseHttpResponse r1) {
                    r0 = this;
                    long[] r1 = r0.a
                    r0.a(r1)
                    return
            }
        }

        private d(java.util.List<xyz.adscope.common.analyse.model.impl.HistoryDbModel> r1, xyz.adscope.common.v2.persistent.db.IBaseDBOperator r2, xyz.adscope.common.o r3) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r3
                return
        }

        /* synthetic */ d(java.util.List r1, xyz.adscope.common.v2.persistent.db.IBaseDBOperator r2, xyz.adscope.common.o r3, xyz.adscope.common.l.a r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        static /* synthetic */ xyz.adscope.common.v2.persistent.db.IBaseDBOperator a(xyz.adscope.common.l.d r0) {
                xyz.adscope.common.v2.persistent.db.IBaseDBOperator r0 = r0.b
                return r0
        }

        private void a(java.util.List<xyz.adscope.common.analyse.model.impl.HistoryDbModel> r7) {
                r6 = this;
                if (r7 == 0) goto L3d
                boolean r0 = r7.isEmpty()
                if (r0 != 0) goto L3d
                r0 = 0
                java.lang.Object r1 = r7.get(r0)
                xyz.adscope.common.analyse.model.impl.HistoryDbModel r1 = (xyz.adscope.common.analyse.model.impl.HistoryDbModel) r1
                java.lang.String r2 = r1.getUrl()
                java.lang.String r1 = r1.getEncrypt()
                int r3 = r7.size()
                long[] r3 = new long[r3]
            L1d:
                int r4 = r7.size()
                if (r0 >= r4) goto L32
                java.lang.Object r4 = r7.get(r0)
                xyz.adscope.common.analyse.model.impl.HistoryDbModel r4 = (xyz.adscope.common.analyse.model.impl.HistoryDbModel) r4
                long r4 = r4.getPrimaryID()
                r3[r0] = r4
                int r0 = r0 + 1
                goto L1d
            L32:
                xyz.adscope.common.l$d$a r0 = new xyz.adscope.common.l$d$a
                r4 = 0
                r0.<init>(r6, r3, r4)
                xyz.adscope.common.o r3 = r6.c
                r3.a(r2, r1, r7, r0)
            L3d:
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                java.util.List<xyz.adscope.common.analyse.model.impl.HistoryDbModel> r0 = r1.a
                r1.a(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class e implements xyz.adscope.common.n.b {
        final /* synthetic */ xyz.adscope.common.l a;

        private e(xyz.adscope.common.l r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ e(xyz.adscope.common.l r1, xyz.adscope.common.l.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // xyz.adscope.common.n.b
        public void a(java.util.List<xyz.adscope.common.analyse.model.impl.HistoryDbModel> r6) {
                r5 = this;
                xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager r0 = xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager.getInstance()
                xyz.adscope.common.l r1 = r5.a
                android.content.Context r1 = xyz.adscope.common.l.a(r1)
                java.lang.Object r0 = r0.getOrCreateImplement(r1)
                xyz.adscope.common.v2.thread.pool.IBaseThreadPool r0 = (xyz.adscope.common.v2.thread.pool.IBaseThreadPool) r0
                xyz.adscope.common.l$d r1 = new xyz.adscope.common.l$d
                xyz.adscope.common.l r2 = r5.a
                xyz.adscope.common.v2.persistent.db.IBaseDBOperator r2 = xyz.adscope.common.l.b(r2)
                xyz.adscope.common.l r3 = r5.a
                xyz.adscope.common.o r3 = xyz.adscope.common.l.c(r3)
                r4 = 0
                r1.<init>(r6, r2, r3, r4)
                r0.executeAnalyseAsyncTask(r1)
                return
        }

        @Override // xyz.adscope.common.n.b
        public void a(xyz.adscope.common.analyse.model.impl.HistoryDbModel r2) {
                r1 = this;
                xyz.adscope.common.l r0 = r1.a
                xyz.adscope.common.l.a(r0, r2)
                return
        }
    }

    l(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r1.c = r2
            xyz.adscope.common.d r0 = new xyz.adscope.common.d
            r0.<init>(r2)
            r1.d = r0
            xyz.adscope.common.o r0 = new xyz.adscope.common.o
            r0.<init>(r2)
            r1.a = r0
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.b = r2
            return
    }

    static /* synthetic */ android.content.Context a(xyz.adscope.common.l r0) {
            android.content.Context r0 = r0.c
            return r0
    }

    private void a(xyz.adscope.common.analyse.model.impl.HistoryDbModel r3) {
            r2 = this;
            xyz.adscope.common.v2.persistent.db.IBaseDBOperator r0 = r2.d
            long r0 = r0.insert(r3)
            r3.setPrimaryID(r0)
            return
    }

    static /* synthetic */ void a(xyz.adscope.common.l r0, xyz.adscope.common.analyse.model.impl.HistoryDbModel r1) {
            r0.a(r1)
            return
    }

    static /* synthetic */ xyz.adscope.common.v2.persistent.db.IBaseDBOperator b(xyz.adscope.common.l r0) {
            xyz.adscope.common.v2.persistent.db.IBaseDBOperator r0 = r0.d
            return r0
    }

    static /* synthetic */ xyz.adscope.common.o c(xyz.adscope.common.l r0) {
            xyz.adscope.common.o r0 = r0.a
            return r0
    }

    @Override // xyz.adscope.common.analyse.publish.IEventAnalyser
    public void initializeQueueLinked(java.util.List<xyz.adscope.common.analyse.publish.IEventConfigModel> r7, java.lang.String r8) {
            r6 = this;
            if (r7 == 0) goto L6f
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L6f
            java.lang.String r0 = "EventLoggerImpl"
            java.lang.String r1 = "初始化统计日志队列..."
            xyz.adscope.common.v2.log.SDKLog.d(r0, r1)
            java.lang.Class<xyz.adscope.common.l> r0 = xyz.adscope.common.l.class
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.util.LinkedList<xyz.adscope.common.n>> r1 = r6.b     // Catch: java.lang.Throwable -> L49
            boolean r1 = r1.containsKey(r8)     // Catch: java.lang.Throwable -> L49
            if (r1 != 0) goto L6b
            xyz.adscope.common.l$e r1 = new xyz.adscope.common.l$e     // Catch: java.lang.Throwable -> L49
            r2 = 0
            r1.<init>(r6, r2)     // Catch: java.lang.Throwable -> L49
            java.util.LinkedList r3 = new java.util.LinkedList     // Catch: java.lang.Throwable -> L49
            r3.<init>()     // Catch: java.lang.Throwable -> L49
            java.util.Collections.reverse(r7)     // Catch: java.lang.Throwable -> L49
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L49
        L2c:
            boolean r4 = r7.hasNext()     // Catch: java.lang.Throwable -> L49
            if (r4 == 0) goto L50
            java.lang.Object r4 = r7.next()     // Catch: java.lang.Throwable -> L49
            xyz.adscope.common.analyse.publish.IEventConfigModel r4 = (xyz.adscope.common.analyse.publish.IEventConfigModel) r4     // Catch: java.lang.Throwable -> L49
            xyz.adscope.common.n r5 = new xyz.adscope.common.n     // Catch: java.lang.Throwable -> L49
            r5.<init>()     // Catch: java.lang.Throwable -> L49
            r5.a(r1)     // Catch: java.lang.Throwable -> L49
            r5.a(r4)     // Catch: java.lang.Throwable -> L49
            if (r2 == 0) goto L4b
            r5.a(r2)     // Catch: java.lang.Throwable -> L49
            goto L4b
        L49:
            r7 = move-exception
            goto L6d
        L4b:
            r3.addFirst(r5)     // Catch: java.lang.Throwable -> L49
            r2 = r5
            goto L2c
        L50:
            java.lang.String r7 = "EventLoggerImpl"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r1.<init>()     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = "记录上报队列 tag: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L49
            r1.append(r8)     // Catch: java.lang.Throwable -> L49
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L49
            xyz.adscope.common.v2.log.SDKLog.d(r7, r1)     // Catch: java.lang.Throwable -> L49
            java.util.Map<java.lang.String, java.util.LinkedList<xyz.adscope.common.n>> r7 = r6.b     // Catch: java.lang.Throwable -> L49
            r7.put(r8, r3)     // Catch: java.lang.Throwable -> L49
        L6b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
            return
        L6d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
            throw r7
        L6f:
            return
    }

    @Override // xyz.adscope.common.analyse.publish.IEventAnalyser
    public void reportCrashEvent(java.util.List<xyz.adscope.common.analyse.model.IBaseEventReportModel> r3, java.lang.String r4) {
            r2 = this;
            java.lang.String r0 = "EventLoggerImpl"
            java.lang.String r1 = "上报崩溃日志..."
            xyz.adscope.common.v2.log.SDKLog.d(r0, r1)
            if (r3 == 0) goto L23
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L23
            java.util.Iterator r3 = r3.iterator()
        L13:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r0 = r3.next()
            xyz.adscope.common.analyse.model.IBaseEventReportModel r0 = (xyz.adscope.common.analyse.model.IBaseEventReportModel) r0
            r2.reportRealtimeEvent(r0, r4)
            goto L13
        L23:
            return
    }

    @Override // xyz.adscope.common.analyse.publish.IEventAnalyser
    public void reportRealtimeEvent(xyz.adscope.common.analyse.model.IBaseEventReportModel r3, java.lang.String r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "上报实时日志..."
            r0.append(r1)
            java.lang.String r1 = r3.getEventCode()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "EventLoggerImpl"
            xyz.adscope.common.v2.log.SDKLog.d(r1, r0)
            java.lang.Class<xyz.adscope.common.l> r0 = xyz.adscope.common.l.class
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.util.LinkedList<xyz.adscope.common.n>> r1 = r2.b     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L4b
            if (r1 == 0) goto L4d
            java.util.Map<java.lang.String, java.util.LinkedList<xyz.adscope.common.n>> r1 = r2.b     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r4 = r1.get(r4)     // Catch: java.lang.Throwable -> L4b
            java.util.LinkedList r4 = (java.util.LinkedList) r4     // Catch: java.lang.Throwable -> L4b
            if (r4 == 0) goto L54
            boolean r1 = r4.isEmpty()     // Catch: java.lang.Throwable -> L4b
            if (r1 != 0) goto L54
            java.lang.Object r1 = r4.getFirst()     // Catch: java.lang.Throwable -> L4b
            if (r1 == 0) goto L54
            xyz.adscope.common.v2.model.IDeepCopyModel r3 = r3.deepCopy()     // Catch: java.lang.Throwable -> L4b
            xyz.adscope.common.analyse.model.IBaseEventReportModel r3 = (xyz.adscope.common.analyse.model.IBaseEventReportModel) r3     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r4 = r4.getFirst()     // Catch: java.lang.Throwable -> L4b
            xyz.adscope.common.n r4 = (xyz.adscope.common.n) r4     // Catch: java.lang.Throwable -> L4b
            r4.d(r3)     // Catch: java.lang.Throwable -> L4b
            goto L54
        L4b:
            r3 = move-exception
            goto L56
        L4d:
            java.lang.String r3 = "EventLoggerImpl"
            java.lang.String r4 = "没有该tag下的上报队列, 理论上不应该发生..."
            xyz.adscope.common.v2.log.SDKLog.e(r3, r4)     // Catch: java.lang.Throwable -> L4b
        L54:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4b
            return
        L56:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4b
            throw r3
    }

    @Override // xyz.adscope.common.analyse.publish.IEventAnalyser
    public void scheduleHistoryEvent(long r9, long r11, java.util.concurrent.TimeUnit r13) {
            r8 = this;
            java.lang.String r0 = "EventLoggerImpl"
            java.lang.String r1 = "上报历史日志..."
            xyz.adscope.common.v2.log.SDKLog.d(r0, r1)
            xyz.adscope.common.l$b r0 = r8.e
            if (r0 == 0) goto Lf
            xyz.adscope.common.l.b.a(r0)
            goto L20
        Lf:
            xyz.adscope.common.l$c r0 = new xyz.adscope.common.l$c
            xyz.adscope.common.v2.persistent.db.IBaseDBOperator r1 = r8.d
            xyz.adscope.common.o r2 = r8.a
            r3 = 0
            r0.<init>(r1, r2, r3)
            xyz.adscope.common.l$b r1 = new xyz.adscope.common.l$b
            r1.<init>(r0)
            r8.e = r1
        L20:
            xyz.adscope.common.l$b r2 = r8.e
            r3 = r9
            r5 = r11
            r7 = r13
            xyz.adscope.common.l.b.a(r2, r3, r5, r7)
            return
    }
}
