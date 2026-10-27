package com.umeng.commonsdk.statistics.idtracking;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ImprintHandler implements com.umeng.commonsdk.utils.FileLockCallback {
    private static final java.lang.String a = "ImprintHandler";
    private static java.lang.Object b = null;
    private static final java.lang.String c = null;
    private static final byte[] d = null;
    private static java.util.Map<java.lang.String, java.util.ArrayList<com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback>> f = null;
    private static java.lang.Object g = null;
    private static com.umeng.commonsdk.statistics.idtracking.ImprintHandler j = null;
    private static android.content.Context k = null;
    private static com.umeng.commonsdk.utils.FileLockUtil l = null;
    private static final int m = 0;
    private static final int n = 1;
    private static java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.internal.UMImprintPreProcessCallback> o;
    private static java.lang.Object p;
    private com.umeng.commonsdk.statistics.internal.d e;
    private com.umeng.commonsdk.statistics.idtracking.ImprintHandler.a h;
    private com.umeng.commonsdk.statistics.proto.d i;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a {
        private java.util.Map<java.lang.String, java.lang.String> a;

        a() {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.a = r0
                return
        }

        a(com.umeng.commonsdk.statistics.proto.d r2) {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.a = r0
                r1.a(r2)
                return
        }

        private synchronized void b(com.umeng.commonsdk.statistics.proto.d r5) {
                r4 = this;
                monitor-enter(r4)
                if (r5 == 0) goto L44
                boolean r0 = r5.e()     // Catch: java.lang.Throwable -> L42
                if (r0 != 0) goto La
                goto L44
            La:
                java.util.Map r5 = r5.c()     // Catch: java.lang.Throwable -> L42
                java.util.Set r0 = r5.keySet()     // Catch: java.lang.Throwable -> L42
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L42
            L16:
                boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L42
                if (r1 == 0) goto L42
                java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L42
                java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L42
                boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L42
                if (r2 != 0) goto L16
                java.lang.Object r2 = r5.get(r1)     // Catch: java.lang.Throwable -> L42
                com.umeng.commonsdk.statistics.proto.e r2 = (com.umeng.commonsdk.statistics.proto.e) r2     // Catch: java.lang.Throwable -> L42
                if (r2 == 0) goto L16
                java.lang.String r2 = r2.b()     // Catch: java.lang.Throwable -> L42
                boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L42
                if (r3 != 0) goto L16
                java.util.Map<java.lang.String, java.lang.String> r3 = r4.a     // Catch: java.lang.Throwable -> L42
                r3.put(r1, r2)     // Catch: java.lang.Throwable -> L42
                boolean r1 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG     // Catch: java.lang.Throwable -> L42
                goto L16
            L42:
                monitor-exit(r4)
                return
            L44:
                monitor-exit(r4)
                return
        }

        public synchronized java.lang.String a(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                monitor-enter(r1)
                boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L22
                if (r0 != 0) goto L24
                java.util.Map<java.lang.String, java.lang.String> r0 = r1.a     // Catch: java.lang.Throwable -> L22
                int r0 = r0.size()     // Catch: java.lang.Throwable -> L22
                if (r0 > 0) goto L10
                goto L24
            L10:
                java.util.Map<java.lang.String, java.lang.String> r0 = r1.a     // Catch: java.lang.Throwable -> L22
                java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L22
                java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L22
                boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L22
                if (r0 != 0) goto L20
                monitor-exit(r1)
                return r2
            L20:
                monitor-exit(r1)
                return r3
            L22:
                r2 = move-exception
                goto L26
            L24:
                monitor-exit(r1)
                return r3
            L26:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L22
                throw r2
        }

        public void a(com.umeng.commonsdk.statistics.proto.d r1) {
                r0 = this;
                if (r1 != 0) goto L3
                return
            L3:
                r0.b(r1)
                return
        }

        public synchronized void a(java.lang.String r2) {
                r1 = this;
                monitor-enter(r1)
                java.util.Map<java.lang.String, java.lang.String> r0 = r1.a     // Catch: java.lang.Throwable -> L1f
                if (r0 == 0) goto L21
                int r0 = r0.size()     // Catch: java.lang.Throwable -> L1f
                if (r0 <= 0) goto L21
                boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L1f
                if (r0 != 0) goto L21
                java.util.Map<java.lang.String, java.lang.String> r0 = r1.a     // Catch: java.lang.Throwable -> L1f
                boolean r0 = r0.containsKey(r2)     // Catch: java.lang.Throwable -> L1f
                if (r0 == 0) goto L21
                java.util.Map<java.lang.String, java.lang.String> r0 = r1.a     // Catch: java.lang.Throwable -> L1f
                r0.remove(r2)     // Catch: java.lang.Throwable -> L1f
                goto L21
            L1f:
                r2 = move-exception
                goto L23
            L21:
                monitor-exit(r1)
                return
            L23:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
                throw r2
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler.b = r0
            com.umeng.analytics.pro.au r0 = com.umeng.analytics.pro.au.b()
            java.lang.String r1 = "imp"
            java.lang.String r0 = r0.b(r1)
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler.c = r0
            java.lang.String r0 = "pbl0"
            byte[] r0 = r0.getBytes()
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler.d = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler.f = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler.g = r0
            r0 = 0
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler.j = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler.o = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler.p = r0
            return
    }

    private ImprintHandler(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler$a r0 = new com.umeng.commonsdk.statistics.idtracking.ImprintHandler$a
            r0.<init>()
            r1.h = r0
            r0 = 0
            r1.i = r0
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler.k = r2
            return
    }

    private com.umeng.commonsdk.statistics.proto.d a(com.umeng.commonsdk.statistics.proto.d r9, com.umeng.commonsdk.statistics.proto.d r10, java.util.Map<java.lang.String, java.lang.String> r11) {
            r8 = this;
            if (r10 != 0) goto L3
            return r9
        L3:
            java.util.Map r0 = r9.c()
            java.util.Map r1 = r10.c()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L13:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lf4
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            com.umeng.commonsdk.statistics.proto.e r3 = (com.umeng.commonsdk.statistics.proto.e) r3
            boolean r3 = r3.d()
            r4 = 0
            if (r3 == 0) goto Lb1
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r5 = r2.getValue()
            com.umeng.commonsdk.statistics.proto.e r5 = (com.umeng.commonsdk.statistics.proto.e) r5
            java.lang.String r5 = r5.a
            java.lang.Object r6 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.p
            monitor-enter(r6)
            boolean r7 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L5d
            if (r7 != 0) goto L5f
            java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.internal.UMImprintPreProcessCallback> r7 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.o     // Catch: java.lang.Throwable -> L5d
            boolean r7 = r7.containsKey(r3)     // Catch: java.lang.Throwable -> L5d
            if (r7 == 0) goto L5f
            java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.internal.UMImprintPreProcessCallback> r7 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.o     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r7 = r7.get(r3)     // Catch: java.lang.Throwable -> L5d
            com.umeng.commonsdk.statistics.internal.UMImprintPreProcessCallback r7 = (com.umeng.commonsdk.statistics.internal.UMImprintPreProcessCallback) r7     // Catch: java.lang.Throwable -> L5d
            if (r7 == 0) goto L5f
            boolean r7 = r7.onPreProcessImprintKey(r3, r5)     // Catch: java.lang.Throwable -> L5d
            if (r7 == 0) goto L5f
            r4 = 1
            goto L5f
        L5d:
            r9 = move-exception
            goto Laf
        L5f:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L5d
            if (r4 != 0) goto L92
            java.lang.Object r4 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            r0.put(r4, r2)
            java.lang.Object r2 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.g
            monitor-enter(r2)
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L8c
            if (r4 != 0) goto L8e
            java.util.Map<java.lang.String, java.util.ArrayList<com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback>> r4 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.f     // Catch: java.lang.Throwable -> L8c
            boolean r4 = r4.containsKey(r3)     // Catch: java.lang.Throwable -> L8c
            if (r4 == 0) goto L8e
            java.util.Map<java.lang.String, java.util.ArrayList<com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback>> r4 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.f     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Throwable -> L8c
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch: java.lang.Throwable -> L8c
            if (r4 == 0) goto L8e
            r11.put(r3, r5)     // Catch: java.lang.Throwable -> L8c
            goto L8e
        L8c:
            r9 = move-exception
            goto L90
        L8e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8c
            goto L13
        L90:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8c
            throw r9
        L92:
            java.lang.String r2 = "MobclickRT"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "--->>> merge: ["
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = "] should be ignored."
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.umeng.commonsdk.debug.UMRTLog.i(r2, r3)
            goto L13
        Laf:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L5d
            throw r9
        Lb1:
            java.lang.Object r2 = r2.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.g
            monitor-enter(r3)
            boolean r5 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> Le5
            if (r5 != 0) goto Le7
            java.util.Map<java.lang.String, java.util.ArrayList<com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback>> r5 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.f     // Catch: java.lang.Throwable -> Le5
            boolean r5 = r5.containsKey(r2)     // Catch: java.lang.Throwable -> Le5
            if (r5 == 0) goto Le7
            java.util.Map<java.lang.String, java.util.ArrayList<com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback>> r5 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.f     // Catch: java.lang.Throwable -> Le5
            java.lang.Object r5 = r5.get(r2)     // Catch: java.lang.Throwable -> Le5
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch: java.lang.Throwable -> Le5
            if (r5 == 0) goto Le7
        Ld2:
            int r6 = r5.size()     // Catch: java.lang.Throwable -> Le5
            if (r4 >= r6) goto Le7
            java.lang.Object r6 = r5.get(r4)     // Catch: java.lang.Throwable -> Le5
            com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback r6 = (com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback) r6     // Catch: java.lang.Throwable -> Le5
            r7 = 0
            r6.onImprintValueChanged(r2, r7)     // Catch: java.lang.Throwable -> Le5
            int r4 = r4 + 1
            goto Ld2
        Le5:
            r9 = move-exception
            goto Lf2
        Le7:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Le5
            r0.remove(r2)
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler$a r3 = r8.h
            r3.a(r2)
            goto L13
        Lf2:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Le5
            throw r9
        Lf4:
            int r10 = r10.f()
            r9.a(r10)
            java.lang.String r10 = r8.a(r9)
            r9.a(r10)
            return r9
    }

    private void a(java.io.File r4) {
            r3 = this;
            com.umeng.commonsdk.statistics.proto.d r0 = r3.i
            if (r0 != 0) goto L5
            goto L2c
        L5:
            java.lang.Object r0 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.b     // Catch: java.lang.Exception -> L2c
            monitor-enter(r0)     // Catch: java.lang.Exception -> L2c
            com.umeng.analytics.pro.ca r1 = new com.umeng.analytics.pro.ca     // Catch: java.lang.Throwable -> L23
            r1.<init>()     // Catch: java.lang.Throwable -> L23
            com.umeng.commonsdk.statistics.proto.d r2 = r3.i     // Catch: java.lang.Throwable -> L23
            byte[] r1 = r1.a(r2)     // Catch: java.lang.Throwable -> L23
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L23
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L23
            r2.write(r1)     // Catch: java.lang.Throwable -> L25
            r2.flush()     // Catch: java.lang.Throwable -> L25
            com.umeng.commonsdk.statistics.common.HelperUtils.safeClose(r2)     // Catch: java.lang.Throwable -> L23
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return
        L23:
            r4 = move-exception
            goto L2a
        L25:
            r4 = move-exception
            com.umeng.commonsdk.statistics.common.HelperUtils.safeClose(r2)     // Catch: java.lang.Throwable -> L23
            throw r4     // Catch: java.lang.Throwable -> L23
        L2a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r4     // Catch: java.lang.Exception -> L2c
        L2c:
            return
    }

    private static void a(java.lang.String r6, com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback r7) {
            java.lang.Object r0 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.g
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.util.ArrayList<com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback>> r1 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.f     // Catch: java.lang.Throwable -> L3e
            boolean r1 = r1.containsKey(r6)     // Catch: java.lang.Throwable -> L3e
            r2 = 0
            if (r1 == 0) goto L5f
            java.util.Map<java.lang.String, java.util.ArrayList<com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback>> r1 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.f     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r6 = r1.get(r6)     // Catch: java.lang.Throwable -> L3e
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch: java.lang.Throwable -> L3e
            int r1 = r6.size()     // Catch: java.lang.Throwable -> L3e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r3.<init>()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = "--->>> addCallback: before add: callbacks size is: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L3e
            r3.append(r1)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L3e
            com.umeng.commonsdk.statistics.common.ULog.i(r3)     // Catch: java.lang.Throwable -> L3e
        L2c:
            if (r2 >= r1) goto L43
            java.lang.Object r3 = r6.get(r2)     // Catch: java.lang.Throwable -> L3e
            if (r7 != r3) goto L40
            java.lang.String r6 = "--->>> addCallback: callback has exist, just exit"
            com.umeng.commonsdk.statistics.common.ULog.i(r6)     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            return
        L3b:
            r6 = move-exception
            goto Lb6
        L3e:
            r6 = move-exception
            goto Laf
        L40:
            int r2 = r2 + 1
            goto L2c
        L43:
            r6.add(r7)     // Catch: java.lang.Throwable -> L3e
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r7.<init>()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r1 = "--->>> addCallback: after add: callbacks size is: "
            r7.append(r1)     // Catch: java.lang.Throwable -> L3e
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L3e
            r7.append(r6)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r6 = r7.toString()     // Catch: java.lang.Throwable -> L3e
            com.umeng.commonsdk.statistics.common.ULog.i(r6)     // Catch: java.lang.Throwable -> L3e
            goto Lb4
        L5f:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3e
            r1.<init>()     // Catch: java.lang.Throwable -> L3e
            int r3 = r1.size()     // Catch: java.lang.Throwable -> L3e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r4.<init>()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r5 = "--->>> addCallback: before add: callbacks size is: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L3e
            r4.append(r3)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L3e
            com.umeng.commonsdk.statistics.common.ULog.i(r4)     // Catch: java.lang.Throwable -> L3e
        L7c:
            if (r2 >= r3) goto L8e
            java.lang.Object r4 = r1.get(r2)     // Catch: java.lang.Throwable -> L3e
            if (r7 != r4) goto L8b
            java.lang.String r6 = "--->>> addCallback: callback has exist, just exit"
            com.umeng.commonsdk.statistics.common.ULog.i(r6)     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            return
        L8b:
            int r2 = r2 + 1
            goto L7c
        L8e:
            r1.add(r7)     // Catch: java.lang.Throwable -> L3e
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r7.<init>()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = "--->>> addCallback: after add: callbacks size is: "
            r7.append(r2)     // Catch: java.lang.Throwable -> L3e
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L3e
            r7.append(r2)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L3e
            com.umeng.commonsdk.statistics.common.ULog.i(r7)     // Catch: java.lang.Throwable -> L3e
            java.util.Map<java.lang.String, java.util.ArrayList<com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback>> r7 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.f     // Catch: java.lang.Throwable -> L3e
            r7.put(r6, r1)     // Catch: java.lang.Throwable -> L3e
            goto Lb4
        Laf:
            android.content.Context r7 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.k     // Catch: java.lang.Throwable -> L3b
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r7, r6)     // Catch: java.lang.Throwable -> L3b
        Lb4:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            return
        Lb6:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            throw r6
    }

    private boolean a(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            if (r1 != 0) goto L8
            if (r2 == 0) goto L6
            r1 = 0
            return r1
        L6:
            r1 = 1
            return r1
        L8:
            boolean r1 = r1.equals(r2)
            return r1
    }

    private static void b(java.lang.String r5, com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback r6) {
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto La3
            if (r6 != 0) goto La
            goto La3
        La:
            java.lang.Object r0 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.g
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.util.ArrayList<com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback>> r1 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.f     // Catch: java.lang.Throwable -> L5c
            boolean r1 = r1.containsKey(r5)     // Catch: java.lang.Throwable -> L5c
            if (r1 == 0) goto L9e
            java.util.Map<java.lang.String, java.util.ArrayList<com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback>> r1 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.f     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L5c
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> L5c
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L5c
            if (r2 <= 0) goto L9e
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L5c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            r3.<init>()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r4 = "--->>> removeCallback: before remove: callbacks size is: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L5c
            r3.append(r2)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L5c
            com.umeng.commonsdk.statistics.common.ULog.i(r3)     // Catch: java.lang.Throwable -> L5c
            r3 = 0
        L3c:
            if (r3 >= r2) goto L61
            java.lang.Object r4 = r1.get(r3)     // Catch: java.lang.Throwable -> L5c
            if (r6 != r4) goto L5e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            r6.<init>()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r2 = "--->>> removeCallback: remove index "
            r6.append(r2)     // Catch: java.lang.Throwable -> L5c
            r6.append(r3)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5c
            com.umeng.commonsdk.statistics.common.ULog.i(r6)     // Catch: java.lang.Throwable -> L5c
            r1.remove(r3)     // Catch: java.lang.Throwable -> L5c
            goto L61
        L5c:
            r5 = move-exception
            goto L99
        L5e:
            int r3 = r3 + 1
            goto L3c
        L61:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            r6.<init>()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r2 = "--->>> removeCallback: after remove: callbacks size is: "
            r6.append(r2)     // Catch: java.lang.Throwable -> L5c
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L5c
            r6.append(r2)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5c
            com.umeng.commonsdk.statistics.common.ULog.i(r6)     // Catch: java.lang.Throwable -> L5c
            int r6 = r1.size()     // Catch: java.lang.Throwable -> L5c
            if (r6 != 0) goto L9e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            r6.<init>()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r1 = "--->>> removeCallback: remove key from map: key = "
            r6.append(r1)     // Catch: java.lang.Throwable -> L5c
            r6.append(r5)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5c
            com.umeng.commonsdk.statistics.common.ULog.i(r6)     // Catch: java.lang.Throwable -> L5c
            java.util.Map<java.lang.String, java.util.ArrayList<com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback>> r6 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.f     // Catch: java.lang.Throwable -> L5c
            r6.remove(r5)     // Catch: java.lang.Throwable -> L5c
            goto L9e
        L99:
            android.content.Context r6 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.k     // Catch: java.lang.Throwable -> La0
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r6, r5)     // Catch: java.lang.Throwable -> La0
        L9e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La0
            goto La3
        La0:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La0
            throw r5
        La3:
            return
    }

    private boolean c(com.umeng.commonsdk.statistics.proto.d r7) {
            r6 = this;
            java.lang.String r0 = r7.i()
            java.lang.String r1 = r6.a(r7)
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 != 0) goto L10
            return r1
        L10:
            java.util.Map r7 = r7.c()
            java.util.Collection r7 = r7.values()
            java.util.Iterator r7 = r7.iterator()
        L1c:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L49
            java.lang.Object r0 = r7.next()
            com.umeng.commonsdk.statistics.proto.e r0 = (com.umeng.commonsdk.statistics.proto.e) r0
            java.lang.String r2 = r0.h()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L33
            goto L1c
        L33:
            byte[] r2 = com.umeng.commonsdk.statistics.common.DataHelper.reverseHexString(r2)
            byte[] r0 = r6.a(r0)
            r3 = 0
        L3c:
            r4 = 4
            if (r3 >= r4) goto L1c
            r4 = r2[r3]
            r5 = r0[r3]
            if (r4 == r5) goto L46
            return r1
        L46:
            int r3 = r3 + 1
            goto L3c
        L49:
            r7 = 1
            return r7
    }

    private com.umeng.commonsdk.statistics.proto.d d(com.umeng.commonsdk.statistics.proto.d r4) {
            r3 = this;
            java.util.Map r0 = r4.c()
            java.lang.String r1 = "umtt"
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L22
            r0.remove(r1)
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler$a r0 = r3.h
            r0.a(r1)
            int r0 = r4.f()
            r4.a(r0)
            java.lang.String r0 = r3.a(r4)
            r4.a(r0)
        L22:
            return r4
    }

    private com.umeng.commonsdk.statistics.proto.d e(com.umeng.commonsdk.statistics.proto.d r10) {
            r9 = this;
            java.util.Map r0 = r10.c()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 / 2
            r1.<init>(r2)
            java.util.Set r2 = r0.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L17:
            boolean r3 = r2.hasNext()
            r4 = 0
            if (r3 == 0) goto La8
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r5 = r3.getValue()
            com.umeng.commonsdk.statistics.proto.e r5 = (com.umeng.commonsdk.statistics.proto.e) r5
            boolean r5 = r5.d()
            if (r5 != 0) goto L38
            java.lang.Object r3 = r3.getKey()
            r1.add(r3)
            goto L17
        L38:
            java.lang.Object r5 = r3.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r3 = r3.getValue()
            com.umeng.commonsdk.statistics.proto.e r3 = (com.umeng.commonsdk.statistics.proto.e) r3
            java.lang.String r3 = r3.a
            java.lang.Object r6 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.p
            monitor-enter(r6)
            boolean r7 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L69
            if (r7 != 0) goto L6b
            java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.internal.UMImprintPreProcessCallback> r7 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.o     // Catch: java.lang.Throwable -> L69
            boolean r7 = r7.containsKey(r5)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L6b
            java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.internal.UMImprintPreProcessCallback> r7 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.o     // Catch: java.lang.Throwable -> L69
            java.lang.Object r7 = r7.get(r5)     // Catch: java.lang.Throwable -> L69
            com.umeng.commonsdk.statistics.internal.UMImprintPreProcessCallback r7 = (com.umeng.commonsdk.statistics.internal.UMImprintPreProcessCallback) r7     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L6b
            boolean r7 = r7.onPreProcessImprintKey(r5, r3)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L6b
            r7 = 1
            goto L6c
        L69:
            r10 = move-exception
            goto La6
        L6b:
            r7 = 0
        L6c:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L72
            r1.add(r5)
        L72:
            java.lang.Object r7 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.g
            monitor-enter(r7)
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L9f
            if (r6 != 0) goto La1
            java.util.Map<java.lang.String, java.util.ArrayList<com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback>> r6 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.f     // Catch: java.lang.Throwable -> L9f
            boolean r6 = r6.containsKey(r5)     // Catch: java.lang.Throwable -> L9f
            if (r6 == 0) goto La1
            java.util.Map<java.lang.String, java.util.ArrayList<com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback>> r6 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.f     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r6 = r6.get(r5)     // Catch: java.lang.Throwable -> L9f
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch: java.lang.Throwable -> L9f
            if (r6 == 0) goto La1
        L8d:
            int r8 = r6.size()     // Catch: java.lang.Throwable -> L9f
            if (r4 >= r8) goto La1
            java.lang.Object r8 = r6.get(r4)     // Catch: java.lang.Throwable -> L9f
            com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback r8 = (com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback) r8     // Catch: java.lang.Throwable -> L9f
            r8.onImprintValueChanged(r5, r3)     // Catch: java.lang.Throwable -> L9f
            int r4 = r4 + 1
            goto L8d
        L9f:
            r10 = move-exception
            goto La4
        La1:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L9f
            goto L17
        La4:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L9f
            throw r10
        La6:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L69
            throw r10
        La8:
            java.util.Iterator r1 = r1.iterator()
        Lac:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lf0
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.g
            monitor-enter(r3)
            boolean r5 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> Le7
            if (r5 != 0) goto Le9
            java.util.Map<java.lang.String, java.util.ArrayList<com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback>> r5 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.f     // Catch: java.lang.Throwable -> Le7
            boolean r5 = r5.containsKey(r2)     // Catch: java.lang.Throwable -> Le7
            if (r5 == 0) goto Le9
            java.util.Map<java.lang.String, java.util.ArrayList<com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback>> r5 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.f     // Catch: java.lang.Throwable -> Le7
            java.lang.Object r5 = r5.get(r2)     // Catch: java.lang.Throwable -> Le7
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch: java.lang.Throwable -> Le7
            if (r5 == 0) goto Le9
            r6 = 0
        Ld4:
            int r7 = r5.size()     // Catch: java.lang.Throwable -> Le7
            if (r6 >= r7) goto Le9
            java.lang.Object r7 = r5.get(r6)     // Catch: java.lang.Throwable -> Le7
            com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback r7 = (com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback) r7     // Catch: java.lang.Throwable -> Le7
            r8 = 0
            r7.onImprintValueChanged(r2, r8)     // Catch: java.lang.Throwable -> Le7
            int r6 = r6 + 1
            goto Ld4
        Le7:
            r10 = move-exception
            goto Lee
        Le9:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Le7
            r0.remove(r2)
            goto Lac
        Lee:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Le7
            throw r10
        Lf0:
            return r10
    }

    private void e() {
            r5 = this;
            java.io.File r0 = new java.io.File
            android.content.Context r1 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.k
            java.io.File r1 = r1.getFilesDir()
            java.lang.String r2 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.c
            r0.<init>(r1, r2)
            java.lang.Object r1 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.b
            monitor-enter(r1)
            boolean r0 = r0.exists()     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L1a
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L18
            return
        L18:
            r0 = move-exception
            goto L56
        L1a:
            r0 = 0
            android.content.Context r3 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.k     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L30
            java.io.FileInputStream r2 = r3.openFileInput(r2)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L30
            byte[] r0 = com.umeng.commonsdk.statistics.common.HelperUtils.readStreamToByteArray(r2)     // Catch: java.lang.Exception -> L25 java.lang.Throwable -> L29
        L25:
            com.umeng.commonsdk.statistics.common.HelperUtils.safeClose(r2)     // Catch: java.lang.Throwable -> L18
            goto L36
        L29:
            r0 = move-exception
            goto L32
        L2b:
            r2 = move-exception
            r4 = r2
            r2 = r0
            r0 = r4
            goto L32
        L30:
            r2 = r0
            goto L25
        L32:
            com.umeng.commonsdk.statistics.common.HelperUtils.safeClose(r2)     // Catch: java.lang.Throwable -> L18
            throw r0     // Catch: java.lang.Throwable -> L18
        L36:
            if (r0 == 0) goto L54
            com.umeng.commonsdk.statistics.proto.d r2 = new com.umeng.commonsdk.statistics.proto.d     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L54
            r2.<init>()     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L54
            com.umeng.analytics.pro.bu r3 = new com.umeng.analytics.pro.bu     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L54
            r3.<init>()     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L54
            r3.a(r2, r0)     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L54
            r5.i = r2     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L54
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler$a r0 = r5.h     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L54
            r0.a(r2)     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L54
            com.umeng.commonsdk.statistics.proto.d r0 = r5.i     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L54
            com.umeng.commonsdk.statistics.proto.d r0 = r5.d(r0)     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L54
            r5.i = r0     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L54
        L54:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L18
            return
        L56:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L18
            throw r0
    }

    public static synchronized com.umeng.commonsdk.statistics.idtracking.ImprintHandler getImprintService(android.content.Context r4) {
            java.lang.Class<com.umeng.commonsdk.statistics.idtracking.ImprintHandler> r0 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.class
            monitor-enter(r0)
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler r1 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.j     // Catch: java.lang.Throwable -> L2b
            if (r1 != 0) goto L2d
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler r1 = new com.umeng.commonsdk.statistics.idtracking.ImprintHandler     // Catch: java.lang.Throwable -> L2b
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L2b
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler.j = r1     // Catch: java.lang.Throwable -> L2b
            com.umeng.commonsdk.utils.FileLockUtil r4 = new com.umeng.commonsdk.utils.FileLockUtil     // Catch: java.lang.Throwable -> L2b
            r4.<init>()     // Catch: java.lang.Throwable -> L2b
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler.l = r4     // Catch: java.lang.Throwable -> L2b
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L2b
            android.content.Context r1 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.k     // Catch: java.lang.Throwable -> L2b
            java.io.File r1 = r1.getFilesDir()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.c     // Catch: java.lang.Throwable -> L2b
            r4.<init>(r1, r2)     // Catch: java.lang.Throwable -> L2b
            com.umeng.commonsdk.utils.FileLockUtil r1 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.l     // Catch: java.lang.Throwable -> L2b
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler r2 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.j     // Catch: java.lang.Throwable -> L2b
            r3 = 0
            r1.doFileOperateion(r4, r2, r3)     // Catch: java.lang.Throwable -> L2b
            goto L2d
        L2b:
            r4 = move-exception
            goto L31
        L2d:
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler r4 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.j     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r0)
            return r4
        L31:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            throw r4
    }

    public java.lang.String a(com.umeng.commonsdk.statistics.proto.d r5) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.TreeMap r1 = new java.util.TreeMap
            java.util.Map r2 = r5.c()
            r1.<init>(r2)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L16:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L45
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            r0.append(r3)
            java.lang.Object r3 = r2.getValue()
            com.umeng.commonsdk.statistics.proto.e r3 = (com.umeng.commonsdk.statistics.proto.e) r3
            boolean r3 = r3.d()
            if (r3 == 0) goto L16
            java.lang.Object r2 = r2.getValue()
            com.umeng.commonsdk.statistics.proto.e r2 = (com.umeng.commonsdk.statistics.proto.e) r2
            java.lang.String r2 = r2.b()
            r0.append(r2)
            goto L16
        L45:
            int r5 = r5.b
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r5 = com.umeng.commonsdk.statistics.common.HelperUtils.MD5(r5)
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r5 = r5.toLowerCase(r0)
            return r5
    }

    public void a(com.umeng.commonsdk.statistics.internal.d r1) {
            r0 = this;
            r0.e = r1
            return
    }

    public void a(java.lang.String r5) {
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L5a
            java.lang.Object r0 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.p
            monitor-enter(r0)
            java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.internal.UMImprintPreProcessCallback> r1 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.o     // Catch: java.lang.Throwable -> L32
            boolean r1 = r1.containsKey(r5)     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L34
            java.lang.String r1 = "MobclickRT"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32
            r2.<init>()     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = "--->>> unregistPreProcessCallback: unregist ["
            r2.append(r3)     // Catch: java.lang.Throwable -> L32
            r2.append(r5)     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = "] success."
            r2.append(r3)     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L32
            com.umeng.commonsdk.debug.UMRTLog.i(r1, r2)     // Catch: java.lang.Throwable -> L32
            java.util.Map<java.lang.String, java.util.ArrayList<com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback>> r1 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.f     // Catch: java.lang.Throwable -> L32
            r1.remove(r5)     // Catch: java.lang.Throwable -> L32
            goto L55
        L32:
            r5 = move-exception
            goto L50
        L34:
            java.lang.String r1 = "MobclickRT"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32
            r2.<init>()     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = "--->>> unregistPreProcessCallback: can't find ["
            r2.append(r3)     // Catch: java.lang.Throwable -> L32
            r2.append(r5)     // Catch: java.lang.Throwable -> L32
            java.lang.String r5 = "], pls regist first."
            r2.append(r5)     // Catch: java.lang.Throwable -> L32
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> L32
            com.umeng.commonsdk.debug.UMRTLog.i(r1, r5)     // Catch: java.lang.Throwable -> L32
            goto L55
        L50:
            android.content.Context r1 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.k     // Catch: java.lang.Throwable -> L57
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r1, r5)     // Catch: java.lang.Throwable -> L57
        L55:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L57
            goto L5a
        L57:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L57
            throw r5
        L5a:
            return
    }

    public byte[] a() {
            r3 = this;
            r0 = 0
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L21
            com.umeng.commonsdk.statistics.proto.d r1 = r3.i     // Catch: java.lang.Throwable -> L8
            if (r1 != 0) goto La
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L8
            return r0
        L8:
            r1 = move-exception
            goto L1f
        La:
            int r1 = r1.b()     // Catch: java.lang.Throwable -> L8
            if (r1 > 0) goto L12
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L8
            return r0
        L12:
            com.umeng.analytics.pro.ca r1 = new com.umeng.analytics.pro.ca     // Catch: java.lang.Throwable -> L8
            r1.<init>()     // Catch: java.lang.Throwable -> L8
            com.umeng.commonsdk.statistics.proto.d r2 = r3.i     // Catch: java.lang.Throwable -> L8
            byte[] r1 = r1.a(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L8
            return r1
        L1f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L8
            throw r1     // Catch: java.lang.Throwable -> L21
        L21:
            r1 = move-exception
            android.content.Context r2 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.k
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r2, r1)
            return r0
    }

    public byte[] a(com.umeng.commonsdk.statistics.proto.e r7) {
            r6 = this;
            r0 = 8
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r1 = 0
            r0.order(r1)
            long r1 = r7.e()
            r0.putLong(r1)
            byte[] r7 = r0.array()
            byte[] r0 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.d
            r1 = 4
            byte[] r2 = new byte[r1]
            r3 = 0
        L1b:
            if (r3 >= r1) goto L28
            r4 = r7[r3]
            r5 = r0[r3]
            r4 = r4 ^ r5
            byte r4 = (byte) r4
            r2[r3] = r4
            int r3 = r3 + 1
            goto L1b
        L28:
            return r2
    }

    public synchronized com.umeng.commonsdk.statistics.proto.d b() {
            r1 = this;
            monitor-enter(r1)
            com.umeng.commonsdk.statistics.proto.d r0 = r1.i     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public void b(com.umeng.commonsdk.statistics.proto.d r7) {
            r6 = this;
            if (r7 != 0) goto Le
            boolean r7 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r7 == 0) goto Ldd
            java.lang.String r7 = "MobclickRT"
            java.lang.String r0 = "Imprint is null"
            com.umeng.commonsdk.debug.UMRTLog.d(r7, r0)
            return
        Le:
            boolean r0 = r6.c(r7)
            if (r0 != 0) goto L20
            boolean r7 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r7 == 0) goto Ldd
            java.lang.String r7 = "MobclickRT"
            java.lang.String r0 = "Imprint is not valid"
            com.umeng.commonsdk.debug.UMRTLog.e(r7, r0)
            return
        L20:
            boolean r0 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            monitor-enter(r6)
            com.umeng.commonsdk.statistics.proto.d r1 = r6.i     // Catch: java.lang.Throwable -> L3e
            com.umeng.commonsdk.statistics.proto.d r7 = r6.d(r7)     // Catch: java.lang.Throwable -> L3e
            r2 = 0
            if (r1 != 0) goto L33
            r3 = r2
            goto L37
        L33:
            java.lang.String r3 = r1.i()     // Catch: java.lang.Throwable -> L3e
        L37:
            if (r1 != 0) goto L41
            com.umeng.commonsdk.statistics.proto.d r7 = r6.e(r7)     // Catch: java.lang.Throwable -> L3e
            goto L45
        L3e:
            r7 = move-exception
            goto Lde
        L41:
            com.umeng.commonsdk.statistics.proto.d r7 = r6.a(r1, r7, r0)     // Catch: java.lang.Throwable -> L3e
        L45:
            r6.i = r7     // Catch: java.lang.Throwable -> L3e
            if (r7 != 0) goto L4a
            goto L4e
        L4a:
            java.lang.String r2 = r7.i()     // Catch: java.lang.Throwable -> L3e
        L4e:
            boolean r7 = r6.a(r3, r2)     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L3e
            com.umeng.commonsdk.statistics.proto.d r1 = r6.i
            if (r1 == 0) goto L67
            if (r7 != 0) goto L67
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler$a r7 = r6.h
            r7.a(r1)
            com.umeng.commonsdk.statistics.internal.d r7 = r6.e
            if (r7 == 0) goto L67
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler$a r1 = r6.h
            r7.onImprintChanged(r1)
        L67:
            int r7 = r0.size()
            if (r7 <= 0) goto Ldd
            java.lang.Object r7 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.g
            monitor-enter(r7)
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> Ld7
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Ld7
        L78:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> Ld7
            if (r1 == 0) goto Ld9
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> Ld7
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> Ld7
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> Ld7
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> Ld7
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> Ld7
            if (r3 != 0) goto L78
            java.util.Map<java.lang.String, java.util.ArrayList<com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback>> r3 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.f     // Catch: java.lang.Throwable -> Ld7
            boolean r3 = r3.containsKey(r2)     // Catch: java.lang.Throwable -> Ld7
            if (r3 == 0) goto L78
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld7
            r3.<init>()     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r4 = "--->>> target imprint key is: "
            r3.append(r4)     // Catch: java.lang.Throwable -> Ld7
            r3.append(r2)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r4 = "; value is: "
            r3.append(r4)     // Catch: java.lang.Throwable -> Ld7
            r3.append(r1)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Ld7
            com.umeng.commonsdk.statistics.common.ULog.i(r3)     // Catch: java.lang.Throwable -> Ld7
            java.util.Map<java.lang.String, java.util.ArrayList<com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback>> r3 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.f     // Catch: java.lang.Throwable -> Ld7
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> Ld7
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch: java.lang.Throwable -> Ld7
            if (r3 == 0) goto L78
            r4 = 0
        Lc5:
            int r5 = r3.size()     // Catch: java.lang.Throwable -> Ld7
            if (r4 >= r5) goto L78
            java.lang.Object r5 = r3.get(r4)     // Catch: java.lang.Throwable -> Ld7
            com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback r5 = (com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback) r5     // Catch: java.lang.Throwable -> Ld7
            r5.onImprintValueChanged(r2, r1)     // Catch: java.lang.Throwable -> Ld7
            int r4 = r4 + 1
            goto Lc5
        Ld7:
            r0 = move-exception
            goto Ldb
        Ld9:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Ld7
            return
        Ldb:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Ld7
            throw r0
        Ldd:
            return
        Lde:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L3e
            throw r7
    }

    public com.umeng.commonsdk.statistics.idtracking.ImprintHandler.a c() {
            r1 = this;
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler$a r0 = r1.h
            return r0
    }

    public void d() {
            r4 = this;
            com.umeng.commonsdk.statistics.proto.d r0 = r4.i
            if (r0 != 0) goto L5
            goto L32
        L5:
            com.umeng.commonsdk.utils.FileLockUtil r0 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.l
            if (r0 == 0) goto L32
            java.io.File r0 = new java.io.File
            android.content.Context r1 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.k
            java.io.File r1 = r1.getFilesDir()
            java.lang.String r2 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.c
            r0.<init>(r1, r2)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L2a
            r0.createNewFile()     // Catch: java.io.IOException -> L20
            goto L2a
        L20:
            r0.createNewFile()     // Catch: java.io.IOException -> L24
            goto L2a
        L24:
            r1 = move-exception
            android.content.Context r2 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.k
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r2, r1)
        L2a:
            com.umeng.commonsdk.utils.FileLockUtil r1 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.l
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler r2 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.j
            r3 = 1
            r1.doFileOperateion(r0, r2, r3)
        L32:
            return
    }

    @Override // com.umeng.commonsdk.utils.FileLockCallback
    public boolean onFileLock(java.io.File r2, int r3) {
            r1 = this;
            r0 = 1
            if (r3 != 0) goto L9
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler r2 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.j
            r2.e()
            goto L10
        L9:
            if (r3 != r0) goto L10
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler r3 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.j
            r3.a(r2)
        L10:
            return r0
    }

    @Override // com.umeng.commonsdk.utils.FileLockCallback
    public boolean onFileLock(java.lang.String r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.umeng.commonsdk.utils.FileLockCallback
    public boolean onFileLock(java.lang.String r1, java.lang.Object r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    public void registImprintCallback(java.lang.String r2, com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback r3) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto Lb
            if (r3 == 0) goto Lb
            a(r2, r3)
        Lb:
            return
    }

    public void registPreProcessCallback(java.lang.String r4, com.umeng.commonsdk.statistics.internal.UMImprintPreProcessCallback r5) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L5c
            if (r5 == 0) goto L5c
            java.lang.Object r0 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.p
            monitor-enter(r0)
            java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.internal.UMImprintPreProcessCallback> r1 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.o     // Catch: java.lang.Throwable -> L34
            boolean r1 = r1.containsKey(r4)     // Catch: java.lang.Throwable -> L34
            if (r1 != 0) goto L36
            java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.internal.UMImprintPreProcessCallback> r1 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.o     // Catch: java.lang.Throwable -> L34
            r1.put(r4, r5)     // Catch: java.lang.Throwable -> L34
            java.lang.String r5 = "MobclickRT"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L34
            r1.<init>()     // Catch: java.lang.Throwable -> L34
            java.lang.String r2 = "--->>> registPreProcessCallback: key : "
            r1.append(r2)     // Catch: java.lang.Throwable -> L34
            r1.append(r4)     // Catch: java.lang.Throwable -> L34
            java.lang.String r4 = " regist success."
            r1.append(r4)     // Catch: java.lang.Throwable -> L34
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L34
            com.umeng.commonsdk.debug.UMRTLog.i(r5, r4)     // Catch: java.lang.Throwable -> L34
            goto L57
        L34:
            r4 = move-exception
            goto L52
        L36:
            java.lang.String r5 = "MobclickRT"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L34
            r1.<init>()     // Catch: java.lang.Throwable -> L34
            java.lang.String r2 = "--->>> key : "
            r1.append(r2)     // Catch: java.lang.Throwable -> L34
            r1.append(r4)     // Catch: java.lang.Throwable -> L34
            java.lang.String r4 = " PreProcesser has registed!"
            r1.append(r4)     // Catch: java.lang.Throwable -> L34
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L34
            com.umeng.commonsdk.debug.UMRTLog.i(r5, r4)     // Catch: java.lang.Throwable -> L34
            goto L57
        L52:
            android.content.Context r5 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.k     // Catch: java.lang.Throwable -> L59
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r5, r4)     // Catch: java.lang.Throwable -> L59
        L57:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L59
            goto L5c
        L59:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L59
            throw r4
        L5c:
            return
    }

    public void unregistImprintCallback(java.lang.String r2, com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback r3) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto Lb
            if (r3 == 0) goto Lb
            b(r2, r3)
        Lb:
            return
    }
}
