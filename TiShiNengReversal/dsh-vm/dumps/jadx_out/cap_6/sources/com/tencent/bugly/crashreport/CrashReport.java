package com.tencent.bugly.crashreport;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class CrashReport {
    private static android.content.Context a;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class CrashHandleCallback extends com.tencent.bugly.BuglyStrategy.a {
        public CrashHandleCallback() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class UserStrategy extends com.tencent.bugly.BuglyStrategy {
        com.tencent.bugly.crashreport.CrashReport.CrashHandleCallback c;

        public UserStrategy(android.content.Context r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized int getCallBackType() {
                r1 = this;
                monitor-enter(r1)
                int r0 = r1.a     // Catch: java.lang.Throwable -> L5
                monitor-exit(r1)
                return r0
            L5:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
                throw r0
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized boolean getCloseErrorCallback() {
                r1 = this;
                monitor-enter(r1)
                boolean r0 = r1.b     // Catch: java.lang.Throwable -> L5
                monitor-exit(r1)
                return r0
            L5:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
                throw r0
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public /* bridge */ /* synthetic */ com.tencent.bugly.BuglyStrategy.a getCrashHandleCallback() {
                r1 = this;
                com.tencent.bugly.crashreport.CrashReport$CrashHandleCallback r0 = r1.getCrashHandleCallback()
                return r0
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized com.tencent.bugly.crashreport.CrashReport.CrashHandleCallback getCrashHandleCallback() {
                r1 = this;
                monitor-enter(r1)
                com.tencent.bugly.crashreport.CrashReport$CrashHandleCallback r0 = r1.c     // Catch: java.lang.Throwable -> L5
                monitor-exit(r1)
                return r0
            L5:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
                throw r0
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized void setCallBackType(int r1) {
                r0 = this;
                monitor-enter(r0)
                r0.a = r1     // Catch: java.lang.Throwable -> L5
                monitor-exit(r0)
                return
            L5:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
                throw r1
        }

        @Override // com.tencent.bugly.BuglyStrategy
        public synchronized void setCloseErrorCallback(boolean r1) {
                r0 = this;
                monitor-enter(r0)
                r0.b = r1     // Catch: java.lang.Throwable -> L5
                monitor-exit(r0)
                return
            L5:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
                throw r1
        }

        public synchronized void setCrashHandleCallback(com.tencent.bugly.crashreport.CrashReport.CrashHandleCallback r1) {
                r0 = this;
                monitor-enter(r0)
                r0.c = r1     // Catch: java.lang.Throwable -> L5
                monitor-exit(r0)
                return
            L5:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
                throw r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        java.lang.String a();

        void a(com.tencent.bugly.crashreport.crash.h5.H5JavaScriptInterface r1, java.lang.String r2);

        void a(java.lang.String r1);

        void b();

        java.lang.CharSequence c();
    }

    public CrashReport() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void closeBugly() {
            boolean r0 = com.tencent.bugly.proguard.p.a
            if (r0 != 0) goto L7
            java.lang.String r0 = com.tencent.bugly.proguard.al.b
            return
        L7:
            com.tencent.bugly.CrashModule r0 = com.tencent.bugly.CrashModule.getInstance()
            boolean r0 = r0.hasInitialized()
            if (r0 != 0) goto L14
            java.lang.String r0 = com.tencent.bugly.proguard.al.b
            return
        L14:
            android.content.Context r0 = com.tencent.bugly.crashreport.CrashReport.a
            if (r0 != 0) goto L19
            goto L35
        L19:
            com.tencent.bugly.proguard.aq r0 = com.tencent.bugly.proguard.aq.a()
            if (r0 == 0) goto L24
            android.content.Context r1 = com.tencent.bugly.crashreport.CrashReport.a
            r0.b(r1)
        L24:
            closeCrashReport()
            android.content.Context r0 = com.tencent.bugly.crashreport.CrashReport.a
            com.tencent.bugly.proguard.s.a(r0)
            com.tencent.bugly.proguard.ak r0 = com.tencent.bugly.proguard.ak.a()
            if (r0 == 0) goto L35
            r0.b()
        L35:
            return
    }

    public static void closeCrashReport() {
            boolean r0 = com.tencent.bugly.proguard.p.a
            if (r0 != 0) goto L7
            java.lang.String r0 = com.tencent.bugly.proguard.al.b
            return
        L7:
            com.tencent.bugly.CrashModule r0 = com.tencent.bugly.CrashModule.getInstance()
            boolean r0 = r0.hasInitialized()
            if (r0 != 0) goto L14
            java.lang.String r0 = com.tencent.bugly.proguard.al.b
            return
        L14:
            com.tencent.bugly.proguard.at r0 = com.tencent.bugly.proguard.at.a()
            r0.c()
            return
    }

    public static void closeNativeReport() {
            boolean r0 = com.tencent.bugly.proguard.p.a
            if (r0 != 0) goto L7
            java.lang.String r0 = com.tencent.bugly.proguard.al.b
            return
        L7:
            com.tencent.bugly.CrashModule r0 = com.tencent.bugly.CrashModule.getInstance()
            boolean r0 = r0.hasInitialized()
            if (r0 != 0) goto L14
            java.lang.String r0 = com.tencent.bugly.proguard.al.b
            return
        L14:
            com.tencent.bugly.proguard.at r0 = com.tencent.bugly.proguard.at.a()
            r0.d()
            return
    }

    public static void enableBugly(boolean r0) {
            com.tencent.bugly.proguard.p.a = r0
            return
    }

    public static void enableObtainId(android.content.Context r0, boolean r1) {
            setCollectPrivacyInfo(r0, r1)
            return
    }

    public static java.util.Set<java.lang.String> getAllUserDataKeys(android.content.Context r1) {
            boolean r0 = com.tencent.bugly.proguard.p.a
            if (r0 != 0) goto Lc
            java.lang.String r1 = com.tencent.bugly.proguard.al.b
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            return r1
        Lc:
            if (r1 != 0) goto L16
            java.lang.String r1 = com.tencent.bugly.proguard.al.b
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            return r1
        L16:
            com.tencent.bugly.proguard.aa r1 = com.tencent.bugly.proguard.aa.a(r1)
            java.util.Set r1 = r1.w()
            return r1
    }

    public static java.lang.String getAppChannel() {
            boolean r0 = com.tencent.bugly.proguard.p.a
            java.lang.String r1 = "unknown"
            if (r0 != 0) goto L9
            java.lang.String r0 = com.tencent.bugly.proguard.al.b
            return r1
        L9:
            com.tencent.bugly.CrashModule r0 = com.tencent.bugly.CrashModule.getInstance()
            boolean r0 = r0.hasInitialized()
            if (r0 != 0) goto L16
            java.lang.String r0 = com.tencent.bugly.proguard.al.b
            return r1
        L16:
            android.content.Context r0 = com.tencent.bugly.crashreport.CrashReport.a
            com.tencent.bugly.proguard.aa r0 = com.tencent.bugly.proguard.aa.a(r0)
            java.lang.String r0 = r0.s
            return r0
    }

    public static java.lang.String getAppID() {
            boolean r0 = com.tencent.bugly.proguard.p.a
            java.lang.String r1 = "unknown"
            if (r0 != 0) goto L9
            java.lang.String r0 = com.tencent.bugly.proguard.al.b
            return r1
        L9:
            com.tencent.bugly.CrashModule r0 = com.tencent.bugly.CrashModule.getInstance()
            boolean r0 = r0.hasInitialized()
            if (r0 != 0) goto L16
            java.lang.String r0 = com.tencent.bugly.proguard.al.b
            return r1
        L16:
            android.content.Context r0 = com.tencent.bugly.crashreport.CrashReport.a
            com.tencent.bugly.proguard.aa r0 = com.tencent.bugly.proguard.aa.a(r0)
            java.lang.String r0 = r0.e()
            return r0
    }

    public static java.lang.String getAppVer() {
            boolean r0 = com.tencent.bugly.proguard.p.a
            java.lang.String r1 = "unknown"
            if (r0 != 0) goto L9
            java.lang.String r0 = com.tencent.bugly.proguard.al.b
            return r1
        L9:
            com.tencent.bugly.CrashModule r0 = com.tencent.bugly.CrashModule.getInstance()
            boolean r0 = r0.hasInitialized()
            if (r0 != 0) goto L16
            java.lang.String r0 = com.tencent.bugly.proguard.al.b
            return r1
        L16:
            android.content.Context r0 = com.tencent.bugly.crashreport.CrashReport.a
            com.tencent.bugly.proguard.aa r0 = com.tencent.bugly.proguard.aa.a(r0)
            java.lang.String r0 = r0.o
            return r0
    }

    public static java.lang.String getBuglyVersion(android.content.Context r1) {
            if (r1 != 0) goto Ld
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = "Please call with context."
            com.tencent.bugly.proguard.al.d(r0, r1)
            java.lang.String r1 = "unknown"
            return r1
        Ld:
            com.tencent.bugly.proguard.aa r1 = com.tencent.bugly.proguard.aa.a(r1)
            java.lang.String r1 = r1.h
            return r1
    }

    public static android.content.Context getContext() {
            android.content.Context r0 = com.tencent.bugly.crashreport.CrashReport.a
            return r0
    }

    public static java.lang.String getDeviceID(android.content.Context r0) {
            com.tencent.bugly.proguard.aa r0 = com.tencent.bugly.proguard.aa.a(r0)
            java.lang.String r0 = r0.g()
            return r0
    }

    public static java.net.Proxy getHttpProxy() {
            java.net.Proxy r0 = com.tencent.bugly.proguard.an.a
            return r0
    }

    public static java.util.Map<java.lang.String, java.lang.String> getSdkExtraData() {
            boolean r0 = com.tencent.bugly.proguard.p.a
            if (r0 != 0) goto Lc
            java.lang.String r0 = com.tencent.bugly.proguard.al.b
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            return r0
        Lc:
            com.tencent.bugly.CrashModule r0 = com.tencent.bugly.CrashModule.getInstance()
            boolean r0 = r0.hasInitialized()
            if (r0 != 0) goto L1a
            java.lang.String r0 = com.tencent.bugly.proguard.al.b
            r0 = 0
            return r0
        L1a:
            android.content.Context r0 = com.tencent.bugly.crashreport.CrashReport.a
            com.tencent.bugly.proguard.aa r0 = com.tencent.bugly.proguard.aa.a(r0)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r0.K
            return r0
    }

    public static java.util.Map<java.lang.String, java.lang.String> getSdkExtraData(android.content.Context r1) {
            boolean r0 = com.tencent.bugly.proguard.p.a
            if (r0 != 0) goto Lc
            java.lang.String r1 = com.tencent.bugly.proguard.al.b
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            return r1
        Lc:
            if (r1 != 0) goto L18
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = "Context should not be null."
            com.tencent.bugly.proguard.al.d(r0, r1)
            r1 = 0
            return r1
        L18:
            com.tencent.bugly.proguard.aa r1 = com.tencent.bugly.proguard.aa.a(r1)
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r1.K
            return r1
    }

    public static java.lang.String getUserData(android.content.Context r2, java.lang.String r3) {
            boolean r0 = com.tencent.bugly.proguard.p.a
            java.lang.String r1 = "unknown"
            if (r0 != 0) goto L9
            java.lang.String r2 = com.tencent.bugly.proguard.al.b
            return r1
        L9:
            if (r2 != 0) goto Le
            java.lang.String r2 = com.tencent.bugly.proguard.al.b
            return r1
        Le:
            boolean r0 = com.tencent.bugly.proguard.ap.b(r3)
            if (r0 == 0) goto L16
            r2 = 0
            return r2
        L16:
            com.tencent.bugly.proguard.aa r2 = com.tencent.bugly.proguard.aa.a(r2)
            java.lang.String r2 = r2.g(r3)
            return r2
    }

    public static int getUserDatasSize(android.content.Context r2) {
            boolean r0 = com.tencent.bugly.proguard.p.a
            r1 = -1
            if (r0 != 0) goto L8
            java.lang.String r2 = com.tencent.bugly.proguard.al.b
            return r1
        L8:
            if (r2 != 0) goto Ld
            java.lang.String r2 = com.tencent.bugly.proguard.al.b
            return r1
        Ld:
            com.tencent.bugly.proguard.aa r2 = com.tencent.bugly.proguard.aa.a(r2)
            int r2 = r2.v()
            return r2
    }

    public static java.lang.String getUserId() {
            boolean r0 = com.tencent.bugly.proguard.p.a
            java.lang.String r1 = "unknown"
            if (r0 != 0) goto L9
            java.lang.String r0 = com.tencent.bugly.proguard.al.b
            return r1
        L9:
            com.tencent.bugly.CrashModule r0 = com.tencent.bugly.CrashModule.getInstance()
            boolean r0 = r0.hasInitialized()
            if (r0 != 0) goto L16
            java.lang.String r0 = com.tencent.bugly.proguard.al.b
            return r1
        L16:
            android.content.Context r0 = com.tencent.bugly.crashreport.CrashReport.a
            com.tencent.bugly.proguard.aa r0 = com.tencent.bugly.proguard.aa.a(r0)
            java.lang.String r0 = r0.f()
            return r0
    }

    public static int getUserSceneTagId(android.content.Context r2) {
            boolean r0 = com.tencent.bugly.proguard.p.a
            r1 = -1
            if (r0 != 0) goto L8
            java.lang.String r2 = com.tencent.bugly.proguard.al.b
            return r1
        L8:
            if (r2 != 0) goto Ld
            java.lang.String r2 = com.tencent.bugly.proguard.al.b
            return r1
        Ld:
            com.tencent.bugly.proguard.aa r2 = com.tencent.bugly.proguard.aa.a(r2)
            int r2 = r2.z()
            return r2
    }

    public static void initCrashReport(android.content.Context r1) {
            if (r1 != 0) goto L3
            return
        L3:
            com.tencent.bugly.crashreport.CrashReport.a = r1
            com.tencent.bugly.CrashModule r0 = com.tencent.bugly.CrashModule.getInstance()
            com.tencent.bugly.proguard.p.a(r0)
            com.tencent.bugly.proguard.p.a(r1)
            return
    }

    public static void initCrashReport(android.content.Context r1, com.tencent.bugly.crashreport.CrashReport.UserStrategy r2) {
            if (r1 != 0) goto L3
            return
        L3:
            com.tencent.bugly.crashreport.CrashReport.a = r1
            com.tencent.bugly.CrashModule r0 = com.tencent.bugly.CrashModule.getInstance()
            com.tencent.bugly.proguard.p.a(r0)
            com.tencent.bugly.proguard.p.a(r1, r2)
            return
    }

    public static void initCrashReport(android.content.Context r1, java.lang.String r2, boolean r3) {
            r0 = 0
            initCrashReport(r1, r2, r3, r0)
            return
    }

    public static void initCrashReport(android.content.Context r1, java.lang.String r2, boolean r3, com.tencent.bugly.crashreport.CrashReport.UserStrategy r4) {
            if (r1 != 0) goto L3
            return
        L3:
            com.tencent.bugly.crashreport.CrashReport.a = r1
            com.tencent.bugly.CrashModule r0 = com.tencent.bugly.CrashModule.getInstance()
            com.tencent.bugly.proguard.p.a(r0)
            com.tencent.bugly.proguard.p.a(r1, r2, r3, r4)
            return
    }

    public static boolean isLastSessionCrash() {
            boolean r0 = com.tencent.bugly.proguard.p.a
            r1 = 0
            if (r0 != 0) goto L8
            java.lang.String r0 = com.tencent.bugly.proguard.al.b
            return r1
        L8:
            com.tencent.bugly.CrashModule r0 = com.tencent.bugly.CrashModule.getInstance()
            boolean r0 = r0.hasInitialized()
            if (r0 != 0) goto L15
            java.lang.String r0 = com.tencent.bugly.proguard.al.b
            return r1
        L15:
            com.tencent.bugly.proguard.at r0 = com.tencent.bugly.proguard.at.a()
            java.lang.Boolean r2 = r0.A
            if (r2 == 0) goto L22
            boolean r0 = r2.booleanValue()
            return r0
        L22:
            com.tencent.bugly.proguard.aa r2 = com.tencent.bugly.proguard.aa.b()
            java.lang.String r2 = r2.d
            com.tencent.bugly.proguard.w r3 = com.tencent.bugly.proguard.w.a()
            r4 = 1
            java.util.List r3 = r3.a(r4)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            if (r3 == 0) goto L6c
            int r6 = r3.size()
            if (r6 <= 0) goto L6c
            java.util.Iterator r1 = r3.iterator()
        L42:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L5e
            java.lang.Object r3 = r1.next()
            com.tencent.bugly.proguard.y r3 = (com.tencent.bugly.proguard.y) r3
            java.lang.String r6 = r3.c
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L42
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r0.A = r6
            r5.add(r3)
            goto L42
        L5e:
            int r0 = r5.size()
            if (r0 <= 0) goto L6b
            com.tencent.bugly.proguard.w r0 = com.tencent.bugly.proguard.w.a()
            r0.a(r5)
        L6b:
            return r4
        L6c:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.A = r2
            return r1
    }

    public static void postCatchedException(java.lang.Throwable r1) {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            postCatchedException(r1, r0)
            return
    }

    public static void postCatchedException(java.lang.Throwable r1, java.lang.Thread r2) {
            r0 = 0
            postCatchedException(r1, r2, r0)
            return
    }

    public static void postCatchedException(java.lang.Throwable r3, java.lang.Thread r4, boolean r5) {
            boolean r0 = com.tencent.bugly.proguard.p.a
            if (r0 != 0) goto L7
            java.lang.String r3 = com.tencent.bugly.proguard.al.b
            return
        L7:
            com.tencent.bugly.CrashModule r0 = com.tencent.bugly.CrashModule.getInstance()
            boolean r0 = r0.hasInitialized()
            if (r0 != 0) goto L14
            java.lang.String r3 = com.tencent.bugly.proguard.al.b
            return
        L14:
            if (r3 != 0) goto L1f
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "throwable is null, just return"
            com.tencent.bugly.proguard.al.d(r4, r3)
            return
        L1f:
            if (r4 != 0) goto L25
            java.lang.Thread r4 = java.lang.Thread.currentThread()
        L25:
            com.tencent.bugly.proguard.at r0 = com.tencent.bugly.proguard.at.a()
            com.tencent.bugly.proguard.ak r1 = r0.w
            com.tencent.bugly.proguard.at$3 r2 = new com.tencent.bugly.proguard.at$3
            r2.<init>(r0, r4, r3, r5)
            r1.a(r2)
            return
    }

    public static void postException(int r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.util.Map<java.lang.String, java.lang.String> r10) {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            postException(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void postException(java.lang.Thread r6, int r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.util.Map<java.lang.String, java.lang.String> r11) {
            boolean r0 = com.tencent.bugly.proguard.p.a
            if (r0 != 0) goto L7
            java.lang.String r6 = com.tencent.bugly.proguard.al.b
            return
        L7:
            com.tencent.bugly.CrashModule r0 = com.tencent.bugly.CrashModule.getInstance()
            boolean r0 = r0.hasInitialized()
            if (r0 != 0) goto L14
            java.lang.String r6 = com.tencent.bugly.proguard.al.b
            return
        L14:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            com.tencent.bugly.proguard.au.a(r0, r1, r2, r3, r4, r5)
            return
    }

    private static void putSdkData(android.content.Context r5, java.lang.String r6, java.lang.String r7) {
            if (r5 == 0) goto L6c
            boolean r0 = com.tencent.bugly.proguard.ap.b(r6)
            if (r0 != 0) goto L6c
            boolean r0 = com.tencent.bugly.proguard.ap.b(r7)
            if (r0 == 0) goto Lf
            goto L6c
        Lf:
            java.lang.String r0 = "[a-zA-Z[0-9]]+"
            java.lang.String r1 = ""
            java.lang.String r6 = r6.replace(r0, r1)
            int r0 = r6.length()
            r1 = 100
            r2 = 1
            r3 = 0
            if (r0 <= r1) goto L36
            java.lang.String r0 = com.tencent.bugly.proguard.al.b
            r0 = 50
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r3] = r1
            java.lang.String r1 = "putSdkData key length over limit %d, will be cutted."
            java.lang.String.format(r1, r4)
            java.lang.String r6 = r6.substring(r3, r0)
        L36:
            int r0 = r7.length()
            r1 = 500(0x1f4, float:7.0E-43)
            if (r0 <= r1) goto L53
            java.lang.String r0 = com.tencent.bugly.proguard.al.b
            r0 = 200(0xc8, float:2.8E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r3] = r1
            java.lang.String r1 = "putSdkData value length over limit %d, will be cutted!"
            java.lang.String.format(r1, r4)
            java.lang.String r7 = r7.substring(r3, r0)
        L53:
            com.tencent.bugly.proguard.aa r5 = com.tencent.bugly.proguard.aa.a(r5)
            r5.b(r6, r7)
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r3] = r6
            r5[r2] = r7
            java.lang.String r6 = "[param] putSdkData data: %s - %s"
            java.lang.String r5 = java.lang.String.format(r6, r5)
            java.lang.Object[] r6 = new java.lang.Object[r3]
            com.tencent.bugly.proguard.al.b(r5, r6)
        L6c:
            return
    }

    public static void putUserData(android.content.Context r7, java.lang.String r8, java.lang.String r9) {
            r0 = 50
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            boolean r2 = com.tencent.bugly.proguard.p.a
            if (r2 != 0) goto Ld
            java.lang.String r7 = com.tencent.bugly.proguard.al.b
            return
        Ld:
            if (r7 != 0) goto L12
            java.lang.String r7 = com.tencent.bugly.proguard.al.b
            return
        L12:
            r2 = 0
            if (r8 != 0) goto L1d
            java.lang.String r7 = "putUserData args key should not be null or empty"
            java.lang.Object[] r8 = new java.lang.Object[r2]
            com.tencent.bugly.proguard.al.d(r7, r8)
            return
        L1d:
            if (r9 != 0) goto L27
            java.lang.String r7 = "putUserData args value should not be null"
            java.lang.Object[] r8 = new java.lang.Object[r2]
            com.tencent.bugly.proguard.al.d(r7, r8)
            return
        L27:
            int r3 = r9.length()
            r4 = 1
            r5 = 200(0xc8, float:2.8E-43)
            if (r3 <= r5) goto L41
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r6[r2] = r3
            java.lang.String r3 = "user data value length over limit %d, it will be cutted!"
            com.tencent.bugly.proguard.al.d(r3, r6)
            java.lang.String r9 = r9.substring(r2, r5)
        L41:
            com.tencent.bugly.proguard.aa r3 = com.tencent.bugly.proguard.aa.a(r7)
            java.util.Set r5 = r3.w()
            boolean r5 = r5.contains(r8)
            r6 = 2
            if (r5 == 0) goto L6c
            com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler r0 = com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler.getInstance()
            if (r0 == 0) goto L59
            r0.putKeyValueToNative(r8, r9)
        L59:
            com.tencent.bugly.proguard.aa r7 = com.tencent.bugly.proguard.aa.a(r7)
            r7.a(r8, r9)
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r7[r2] = r8
            r7[r4] = r9
            java.lang.String r8 = "replace KV %s %s"
            com.tencent.bugly.proguard.al.c(r8, r7)
            return
        L6c:
            int r3 = r3.v()
            if (r3 < r0) goto L7c
            java.lang.Object[] r7 = new java.lang.Object[r4]
            r7[r2] = r1
            java.lang.String r8 = "user data size is over limit %d, it will be cutted!"
            com.tencent.bugly.proguard.al.d(r8, r7)
            return
        L7c:
            int r3 = r8.length()
            if (r3 <= r0) goto L91
            java.lang.Object[] r3 = new java.lang.Object[r6]
            r3[r2] = r1
            r3[r4] = r8
            java.lang.String r1 = "user data key length over limit %d , will drop this new key %s"
            com.tencent.bugly.proguard.al.d(r1, r3)
            java.lang.String r8 = r8.substring(r2, r0)
        L91:
            com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler r0 = com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler.getInstance()
            if (r0 == 0) goto L9a
            r0.putKeyValueToNative(r8, r9)
        L9a:
            com.tencent.bugly.proguard.aa r7 = com.tencent.bugly.proguard.aa.a(r7)
            r7.a(r8, r9)
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r7[r2] = r8
            r7[r4] = r9
            java.lang.String r8 = "[param] set user data: %s - %s"
            com.tencent.bugly.proguard.al.b(r8, r7)
            return
    }

    public static java.lang.String removeUserData(android.content.Context r2, java.lang.String r3) {
            boolean r0 = com.tencent.bugly.proguard.p.a
            java.lang.String r1 = "unknown"
            if (r0 != 0) goto L9
            java.lang.String r2 = com.tencent.bugly.proguard.al.b
            return r1
        L9:
            if (r2 != 0) goto Le
            java.lang.String r2 = com.tencent.bugly.proguard.al.b
            return r1
        Le:
            boolean r0 = com.tencent.bugly.proguard.ap.b(r3)
            if (r0 == 0) goto L16
            r2 = 0
            return r2
        L16:
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            java.lang.String r1 = "[param] remove user data: %s"
            com.tencent.bugly.proguard.al.b(r1, r0)
            com.tencent.bugly.proguard.aa r2 = com.tencent.bugly.proguard.aa.a(r2)
            java.lang.String r2 = r2.f(r3)
            return r2
    }

    public static void setAllThreadStackEnable(android.content.Context r0, boolean r1, boolean r2) {
            com.tencent.bugly.proguard.aa r0 = com.tencent.bugly.proguard.aa.a(r0)
            r0.Q = r1
            r0.R = r2
            return
    }

    public static void setAppChannel(android.content.Context r1, java.lang.String r2) {
            boolean r0 = com.tencent.bugly.proguard.p.a
            if (r0 != 0) goto L7
            java.lang.String r1 = com.tencent.bugly.proguard.al.b
            return
        L7:
            if (r1 != 0) goto Lc
            java.lang.String r1 = com.tencent.bugly.proguard.al.b
            return
        Lc:
            if (r2 != 0) goto L11
            java.lang.String r1 = com.tencent.bugly.proguard.al.b
            return
        L11:
            com.tencent.bugly.proguard.aa r1 = com.tencent.bugly.proguard.aa.a(r1)
            r1.s = r2
            com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler r1 = com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler.getInstance()
            if (r1 == 0) goto L20
            r1.setNativeAppChannel(r2)
        L20:
            return
    }

    public static void setAppPackage(android.content.Context r1, java.lang.String r2) {
            boolean r0 = com.tencent.bugly.proguard.p.a
            if (r0 != 0) goto L7
            java.lang.String r1 = com.tencent.bugly.proguard.al.b
            return
        L7:
            if (r1 != 0) goto Lc
            java.lang.String r1 = com.tencent.bugly.proguard.al.b
            return
        Lc:
            if (r2 != 0) goto L11
            java.lang.String r1 = com.tencent.bugly.proguard.al.b
            return
        L11:
            com.tencent.bugly.proguard.aa r1 = com.tencent.bugly.proguard.aa.a(r1)
            r1.c = r2
            com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler r1 = com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler.getInstance()
            if (r1 == 0) goto L20
            r1.setNativeAppPackage(r2)
        L20:
            return
    }

    public static void setAppVersion(android.content.Context r1, java.lang.String r2) {
            boolean r0 = com.tencent.bugly.proguard.p.a
            if (r0 != 0) goto L7
            java.lang.String r1 = com.tencent.bugly.proguard.al.b
            return
        L7:
            if (r1 != 0) goto Lc
            java.lang.String r1 = com.tencent.bugly.proguard.al.b
            return
        Lc:
            if (r2 != 0) goto L11
            java.lang.String r1 = com.tencent.bugly.proguard.al.b
            return
        L11:
            com.tencent.bugly.proguard.aa r1 = com.tencent.bugly.proguard.aa.a(r1)
            r1.o = r2
            com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler r1 = com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler.getInstance()
            if (r1 == 0) goto L20
            r1.setNativeAppVersion(r2)
        L20:
            return
    }

    public static void setBuglyDbName(java.lang.String r2) {
            boolean r0 = com.tencent.bugly.proguard.p.a
            if (r0 != 0) goto L7
            java.lang.String r2 = com.tencent.bugly.proguard.al.b
            return
        L7:
            java.lang.String r0 = com.tencent.bugly.proguard.al.b
            java.lang.String r0 = "Set Bugly DB name: "
            java.lang.String r1 = java.lang.String.valueOf(r2)
            r0.concat(r1)
            com.tencent.bugly.proguard.x.a = r2
            return
    }

    public static void setCollectPrivacyInfo(android.content.Context r2, boolean r3) {
            boolean r0 = com.tencent.bugly.proguard.p.a
            if (r0 != 0) goto L7
            java.lang.String r2 = com.tencent.bugly.proguard.al.b
            return
        L7:
            if (r2 != 0) goto Lc
            java.lang.String r2 = com.tencent.bugly.proguard.al.b
            return
        Lc:
            java.lang.String r0 = com.tencent.bugly.proguard.al.b
            java.lang.String r0 = "setCollectPrivacyInfo: "
            java.lang.String r1 = java.lang.String.valueOf(r3)
            r0.concat(r1)
            com.tencent.bugly.proguard.aa r2 = com.tencent.bugly.proguard.aa.a(r2)
            r2.n = r3
            return
    }

    public static void setContext(android.content.Context r0) {
            com.tencent.bugly.crashreport.CrashReport.a = r0
            return
    }

    public static void setCrashFilter(java.lang.String r2) {
            boolean r0 = com.tencent.bugly.proguard.p.a
            if (r0 != 0) goto L7
            java.lang.String r2 = com.tencent.bugly.proguard.al.b
            return
        L7:
            java.lang.String r0 = com.tencent.bugly.proguard.al.b
            java.lang.String r0 = "Set crash stack filter: "
            java.lang.String r1 = java.lang.String.valueOf(r2)
            r0.concat(r1)
            com.tencent.bugly.proguard.at.f14q = r2
            return
    }

    public static void setCrashRegularFilter(java.lang.String r2) {
            boolean r0 = com.tencent.bugly.proguard.p.a
            if (r0 != 0) goto L7
            java.lang.String r2 = com.tencent.bugly.proguard.al.b
            return
        L7:
            java.lang.String r0 = com.tencent.bugly.proguard.al.b
            java.lang.String r0 = "Set crash stack filter: "
            java.lang.String r1 = java.lang.String.valueOf(r2)
            r0.concat(r1)
            com.tencent.bugly.proguard.at.r = r2
            return
    }

    public static void setDeviceId(android.content.Context r1, java.lang.String r2) {
            if (r1 == 0) goto Lf
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto Lf
            com.tencent.bugly.proguard.aa r1 = com.tencent.bugly.proguard.aa.a(r1)
            r1.a(r2)
        Lf:
            return
    }

    public static void setDeviceModel(android.content.Context r1, java.lang.String r2) {
            if (r1 == 0) goto Lf
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto Lf
            com.tencent.bugly.proguard.aa r1 = com.tencent.bugly.proguard.aa.a(r1)
            r1.b(r2)
        Lf:
            return
    }

    public static void setDumpFilePath(android.content.Context r1, java.lang.String r2) {
            boolean r0 = com.tencent.bugly.proguard.p.a
            if (r0 != 0) goto L7
            java.lang.String r1 = com.tencent.bugly.proguard.al.b
            return
        L7:
            if (r1 != 0) goto Lc
            java.lang.String r1 = com.tencent.bugly.proguard.al.b
            return
        Lc:
            if (r2 != 0) goto L11
            java.lang.String r1 = com.tencent.bugly.proguard.al.b
            return
        L11:
            java.lang.String r1 = com.tencent.bugly.proguard.al.b
            java.lang.String r1 = "user set tombstone path: "
            r1.concat(r2)
            com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler.setDumpFilePath(r2)
            return
    }

    public static void setHandleNativeCrashInJava(boolean r2) {
            boolean r0 = com.tencent.bugly.proguard.p.a
            if (r0 != 0) goto L7
            java.lang.String r2 = com.tencent.bugly.proguard.al.b
            return
        L7:
            java.lang.String r0 = com.tencent.bugly.proguard.al.b
            java.lang.String r0 = "Should handle native crash in Java profile after handled in native profile: "
            java.lang.String r1 = java.lang.String.valueOf(r2)
            r0.concat(r1)
            com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler.setShouldHandleInJava(r2)
            return
    }

    public static void setHttpProxy(java.lang.String r3, int r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto La
            r3 = 0
            com.tencent.bugly.proguard.an.a = r3
            return
        La:
            java.net.Proxy r0 = new java.net.Proxy
            java.net.Proxy$Type r1 = java.net.Proxy.Type.HTTP
            java.net.InetSocketAddress r2 = new java.net.InetSocketAddress
            r2.<init>(r3, r4)
            r0.<init>(r1, r2)
            com.tencent.bugly.proguard.an.a = r0
            return
    }

    public static void setHttpProxy(java.net.InetAddress r3, int r4) {
            if (r3 != 0) goto L6
            r3 = 0
            com.tencent.bugly.proguard.an.a = r3
            return
        L6:
            java.net.Proxy r0 = new java.net.Proxy
            java.net.Proxy$Type r1 = java.net.Proxy.Type.HTTP
            java.net.InetSocketAddress r2 = new java.net.InetSocketAddress
            r2.<init>(r3, r4)
            r0.<init>(r1, r2)
            com.tencent.bugly.proguard.an.a = r0
            return
    }

    @java.lang.Deprecated
    public static void setIsAppForeground(android.content.Context r0, boolean r1) {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "App fore and back status are no longer supported"
            com.tencent.bugly.proguard.al.a(r1, r0)
            return
    }

    public static void setIsDevelopmentDevice(android.content.Context r2, boolean r3) {
            boolean r0 = com.tencent.bugly.proguard.p.a
            if (r0 != 0) goto L7
            java.lang.String r2 = com.tencent.bugly.proguard.al.b
            return
        L7:
            r0 = 0
            if (r2 != 0) goto L12
            java.lang.String r2 = "Context should not be null."
            java.lang.Object[] r3 = new java.lang.Object[r0]
            com.tencent.bugly.proguard.al.d(r2, r3)
            return
        L12:
            if (r3 == 0) goto L1c
            java.lang.String r1 = "This is a development device."
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.tencent.bugly.proguard.al.c(r1, r0)
            goto L23
        L1c:
            java.lang.String r1 = "This is not a development device."
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.tencent.bugly.proguard.al.c(r1, r0)
        L23:
            com.tencent.bugly.proguard.aa r2 = com.tencent.bugly.proguard.aa.a(r2)
            r2.I = r3
            return
    }

    public static boolean setJavascriptMonitor(android.webkit.WebView r1, boolean r2) {
            r0 = 0
            boolean r1 = setJavascriptMonitor(r1, r2, r0)
            return r1
    }

    @android.annotation.SuppressLint({"SetJavaScriptEnabled"})
    public static boolean setJavascriptMonitor(android.webkit.WebView r2, boolean r3, boolean r4) {
            r0 = 0
            if (r2 != 0) goto L6
            java.lang.String r2 = com.tencent.bugly.proguard.al.b
            return r0
        L6:
            android.webkit.WebSettings r1 = r2.getSettings()
            r1.setSavePassword(r0)
            android.webkit.WebSettings r1 = r2.getSettings()
            r1.setAllowFileAccess(r0)
            com.tencent.bugly.crashreport.CrashReport$1 r0 = new com.tencent.bugly.crashreport.CrashReport$1
            r0.<init>(r2)
            boolean r2 = setJavascriptMonitor(r0, r3, r4)
            return r2
    }

    public static boolean setJavascriptMonitor(com.tencent.bugly.crashreport.CrashReport.a r1, boolean r2) {
            r0 = 0
            boolean r1 = setJavascriptMonitor(r1, r2, r0)
            return r1
    }

    @android.annotation.SuppressLint({"SetJavaScriptEnabled"})
    public static boolean setJavascriptMonitor(com.tencent.bugly.crashreport.CrashReport.a r4, boolean r5, boolean r6) {
            r6 = 0
            if (r4 != 0) goto L6
            java.lang.String r4 = com.tencent.bugly.proguard.al.b
            return r6
        L6:
            com.tencent.bugly.CrashModule r0 = com.tencent.bugly.CrashModule.getInstance()
            boolean r0 = r0.hasInitialized()
            if (r0 != 0) goto L18
            java.lang.String r4 = "CrashReport has not been initialed! please to call method 'initCrashReport' first!"
            java.lang.Object[] r5 = new java.lang.Object[r6]
            com.tencent.bugly.proguard.al.e(r4, r5)
            return r6
        L18:
            java.lang.String r0 = "Set Javascript exception monitor of webview."
            java.lang.Object[] r1 = new java.lang.Object[r6]
            com.tencent.bugly.proguard.al.a(r0, r1)
            boolean r0 = com.tencent.bugly.proguard.p.a
            if (r0 != 0) goto L26
            java.lang.String r4 = com.tencent.bugly.proguard.al.b
            return r6
        L26:
            java.lang.String r0 = r4.a()
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r2[r6] = r0
            java.lang.String r0 = "URL of webview is %s"
            com.tencent.bugly.proguard.al.c(r0, r2)
            java.lang.String r0 = "Enable the javascript needed by webview monitor."
            java.lang.Object[] r2 = new java.lang.Object[r6]
            com.tencent.bugly.proguard.al.a(r0, r2)
            r4.b()
            com.tencent.bugly.crashreport.crash.h5.H5JavaScriptInterface r0 = com.tencent.bugly.crashreport.crash.h5.H5JavaScriptInterface.getInstance(r4)
            if (r0 == 0) goto L50
            java.lang.String r2 = "Add a secure javascript interface to the webview."
            java.lang.Object[] r3 = new java.lang.Object[r6]
            com.tencent.bugly.proguard.al.a(r2, r3)
            java.lang.String r2 = "exceptionUploader"
            r4.a(r0, r2)
        L50:
            if (r5 == 0) goto L7c
            java.lang.String r5 = com.tencent.bugly.proguard.bc.b()
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r0[r6] = r5
            java.lang.String r5 = "Inject bugly.js(v%s) to the webview."
            com.tencent.bugly.proguard.al.a(r5, r0)
            java.lang.String r5 = com.tencent.bugly.proguard.bc.a()
            if (r5 != 0) goto L73
            java.lang.String r4 = com.tencent.bugly.proguard.bc.b()
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r5[r6] = r4
            java.lang.String r4 = "Failed to inject Bugly.js."
            com.tencent.bugly.proguard.al.e(r4, r5)
            return r6
        L73:
            java.lang.String r6 = "javascript:"
            java.lang.String r5 = r6.concat(r5)
            r4.a(r5)
        L7c:
            return r1
    }

    public static void setSdkExtraData(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            boolean r0 = com.tencent.bugly.proguard.p.a
            if (r0 != 0) goto L7
            java.lang.String r1 = com.tencent.bugly.proguard.al.b
            return
        L7:
            if (r1 == 0) goto L2c
            boolean r0 = com.tencent.bugly.proguard.ap.b(r2)
            if (r0 != 0) goto L2c
            boolean r0 = com.tencent.bugly.proguard.ap.b(r3)
            if (r0 == 0) goto L16
            goto L2c
        L16:
            com.tencent.bugly.proguard.aa r1 = com.tencent.bugly.proguard.aa.a(r1)
            if (r2 == 0) goto L2c
            if (r3 != 0) goto L1f
            goto L2c
        L1f:
            java.lang.Object r0 = r1.T
            monitor-enter(r0)
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r1.K     // Catch: java.lang.Throwable -> L29
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L29
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            return
        L29:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            throw r1
        L2c:
            return
    }

    public static void setServerUrl(java.lang.String r1) {
            boolean r0 = com.tencent.bugly.proguard.ap.b(r1)
            if (r0 != 0) goto L15
            boolean r0 = com.tencent.bugly.proguard.ap.d(r1)
            if (r0 != 0) goto Ld
            goto L15
        Ld:
            com.tencent.bugly.proguard.ac.a(r1)
            com.tencent.bugly.crashreport.common.strategy.StrategyBean.a = r1
            com.tencent.bugly.crashreport.common.strategy.StrategyBean.b = r1
            return
        L15:
            java.lang.String r1 = com.tencent.bugly.proguard.al.b
            return
    }

    public static void setSessionIntervalMills(long r1) {
            boolean r0 = com.tencent.bugly.proguard.p.a
            if (r0 != 0) goto L7
            java.lang.String r1 = com.tencent.bugly.proguard.al.b
            return
        L7:
            com.tencent.bugly.proguard.s.a(r1)
            return
    }

    public static void setUserId(android.content.Context r6, java.lang.String r7) {
            boolean r0 = com.tencent.bugly.proguard.p.a
            if (r0 != 0) goto L7
            java.lang.String r6 = com.tencent.bugly.proguard.al.b
            return
        L7:
            if (r6 != 0) goto Lc
            java.lang.String r6 = com.tencent.bugly.proguard.al.b
            return
        Lc:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r1 = 0
            if (r0 == 0) goto L1b
            java.lang.String r6 = "userId should not be null"
            java.lang.Object[] r7 = new java.lang.Object[r1]
            com.tencent.bugly.proguard.al.d(r6, r7)
            return
        L1b:
            int r0 = r7.length()
            r2 = 1
            r3 = 100
            if (r0 <= r3) goto L3c
            java.lang.String r0 = r7.substring(r1, r3)
            java.lang.String r4 = "userId %s length is over limit %d substring to %s"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r1] = r7
            r5[r2] = r3
            r7 = 2
            r5[r7] = r0
            com.tencent.bugly.proguard.al.d(r4, r5)
            r7 = r0
        L3c:
            com.tencent.bugly.proguard.aa r0 = com.tencent.bugly.proguard.aa.a(r6)
            java.lang.String r0 = r0.f()
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L4b
            goto L74
        L4b:
            com.tencent.bugly.proguard.aa r6 = com.tencent.bugly.proguard.aa.a(r6)
            java.lang.Object r0 = r6.V
            monitor-enter(r0)
            r6.l = r7     // Catch: java.lang.Throwable -> L75
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L75
            java.lang.String r6 = "[user] set userId : %s"
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r1] = r7
            com.tencent.bugly.proguard.al.b(r6, r0)
            com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler r6 = com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler.getInstance()
            if (r6 == 0) goto L67
            r6.setNativeUserId(r7)
        L67:
            com.tencent.bugly.CrashModule r6 = com.tencent.bugly.CrashModule.getInstance()
            boolean r6 = r6.hasInitialized()
            if (r6 == 0) goto L74
            com.tencent.bugly.proguard.s.a()
        L74:
            return
        L75:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L75
            throw r6
    }

    public static void setUserId(java.lang.String r1) {
            boolean r0 = com.tencent.bugly.proguard.p.a
            if (r0 != 0) goto L7
            java.lang.String r1 = com.tencent.bugly.proguard.al.b
            return
        L7:
            com.tencent.bugly.CrashModule r0 = com.tencent.bugly.CrashModule.getInstance()
            boolean r0 = r0.hasInitialized()
            if (r0 != 0) goto L14
            java.lang.String r1 = com.tencent.bugly.proguard.al.b
            return
        L14:
            android.content.Context r0 = com.tencent.bugly.crashreport.CrashReport.a
            setUserId(r0, r1)
            return
    }

    public static void setUserSceneTag(android.content.Context r6, int r7) {
            boolean r0 = com.tencent.bugly.proguard.p.a
            if (r0 != 0) goto L7
            java.lang.String r6 = com.tencent.bugly.proguard.al.b
            return
        L7:
            if (r6 != 0) goto Lc
            java.lang.String r6 = com.tencent.bugly.proguard.al.b
            return
        Lc:
            r0 = 0
            if (r7 > 0) goto L16
            java.lang.String r1 = "setTag args tagId should > 0"
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.tencent.bugly.proguard.al.d(r1, r2)
        L16:
            com.tencent.bugly.proguard.aa r6 = com.tencent.bugly.proguard.aa.a(r6)
            java.lang.Object r1 = r6.U
            monitor-enter(r1)
            int r2 = r6.w     // Catch: java.lang.Throwable -> L3b
            r3 = 1
            if (r2 == r7) goto L3d
            r6.w = r7     // Catch: java.lang.Throwable -> L3b
            java.lang.String r4 = "user scene tag %d changed to tag %d"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L3b
            int r6 = r6.w     // Catch: java.lang.Throwable -> L3b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L3b
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L3b
            r5[r0] = r2     // Catch: java.lang.Throwable -> L3b
            r5[r3] = r6     // Catch: java.lang.Throwable -> L3b
            com.tencent.bugly.proguard.al.a(r4, r5)     // Catch: java.lang.Throwable -> L3b
            goto L3d
        L3b:
            r6 = move-exception
            goto L4c
        L3d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r6 = "[param] set user scene tag: %d"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r0] = r7
            com.tencent.bugly.proguard.al.b(r6, r1)
            return
        L4c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3b
            throw r6
    }

    public static void startCrashReport() {
            boolean r0 = com.tencent.bugly.proguard.p.a
            if (r0 != 0) goto L7
            java.lang.String r0 = com.tencent.bugly.proguard.al.b
            return
        L7:
            com.tencent.bugly.CrashModule r0 = com.tencent.bugly.CrashModule.getInstance()
            boolean r0 = r0.hasInitialized()
            if (r0 != 0) goto L14
            java.lang.String r0 = com.tencent.bugly.proguard.al.b
            return
        L14:
            com.tencent.bugly.proguard.at r0 = com.tencent.bugly.proguard.at.a()
            r0.b()
            return
    }

    public static void testANRCrash() {
            boolean r0 = com.tencent.bugly.proguard.p.a
            if (r0 != 0) goto L7
            java.lang.String r0 = com.tencent.bugly.proguard.al.b
            return
        L7:
            com.tencent.bugly.CrashModule r0 = com.tencent.bugly.CrashModule.getInstance()
            boolean r0 = r0.hasInitialized()
            if (r0 != 0) goto L14
            java.lang.String r0 = com.tencent.bugly.proguard.al.b
            return
        L14:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "start to create a anr crash for test!"
            com.tencent.bugly.proguard.al.a(r1, r0)
            com.tencent.bugly.proguard.at r0 = com.tencent.bugly.proguard.at.a()
            r0.h()
            return
    }

    public static void testJavaCrash() {
            boolean r0 = com.tencent.bugly.proguard.p.a
            if (r0 != 0) goto L7
            java.lang.String r0 = com.tencent.bugly.proguard.al.b
            return
        L7:
            com.tencent.bugly.CrashModule r0 = com.tencent.bugly.CrashModule.getInstance()
            boolean r0 = r0.hasInitialized()
            if (r0 != 0) goto L14
            java.lang.String r0 = com.tencent.bugly.proguard.al.b
            return
        L14:
            com.tencent.bugly.proguard.aa r0 = com.tencent.bugly.proguard.aa.b()
            if (r0 == 0) goto L3a
            int r1 = r0.x
            r2 = 24096(0x5e20, float:3.3766E-41)
            if (r1 == r2) goto L3a
            r0.x = r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r0 = r0.x
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            r1 = 1
            r2[r1] = r0
            java.lang.String r0 = "server scene tag %d changed to tag %d"
            com.tencent.bugly.proguard.al.a(r0, r2)
        L3a:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "This Crash create for Test! You can go to Bugly see more detail!"
            r0.<init>(r1)
            throw r0
    }

    public static void testNativeCrash() {
            r0 = 1
            r1 = 0
            testNativeCrash(r0, r0, r1)
            return
    }

    public static void testNativeCrash(boolean r2, boolean r3, boolean r4) {
            boolean r0 = com.tencent.bugly.proguard.p.a
            if (r0 != 0) goto L7
            java.lang.String r2 = com.tencent.bugly.proguard.al.b
            return
        L7:
            com.tencent.bugly.CrashModule r0 = com.tencent.bugly.CrashModule.getInstance()
            boolean r0 = r0.hasInitialized()
            if (r0 != 0) goto L14
            java.lang.String r2 = com.tencent.bugly.proguard.al.b
            return
        L14:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "start to create a native crash for test!"
            com.tencent.bugly.proguard.al.a(r1, r0)
            com.tencent.bugly.proguard.at r0 = com.tencent.bugly.proguard.at.a()
            r0.a(r2, r3, r4)
            return
    }

    public static void uploadUserInfo() {
            boolean r0 = com.tencent.bugly.proguard.p.a
            if (r0 != 0) goto L7
            java.lang.String r0 = com.tencent.bugly.proguard.al.b
            return
        L7:
            com.tencent.bugly.proguard.r r0 = com.tencent.bugly.proguard.s.b
            if (r0 != 0) goto Le
            java.lang.String r0 = com.tencent.bugly.proguard.al.b
            return
        Le:
            r0.b()
            return
    }
}
