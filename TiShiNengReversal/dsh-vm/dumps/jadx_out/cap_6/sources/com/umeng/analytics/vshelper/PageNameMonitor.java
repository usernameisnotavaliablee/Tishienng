package com.umeng.analytics.vshelper;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class PageNameMonitor implements com.umeng.analytics.vshelper.a {
    private static java.lang.String currentActivity;
    private static java.lang.String currentCustomPage;
    private static java.lang.Object lock;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.umeng.analytics.vshelper.PageNameMonitor$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a {
        private static final com.umeng.analytics.vshelper.PageNameMonitor a = null;

        static {
                com.umeng.analytics.vshelper.PageNameMonitor r0 = new com.umeng.analytics.vshelper.PageNameMonitor
                r1 = 0
                r0.<init>(r1)
                com.umeng.analytics.vshelper.PageNameMonitor.a.a = r0
                return
        }

        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ com.umeng.analytics.vshelper.PageNameMonitor a() {
                com.umeng.analytics.vshelper.PageNameMonitor r0 = com.umeng.analytics.vshelper.PageNameMonitor.a.a
                return r0
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.umeng.analytics.vshelper.PageNameMonitor.lock = r0
            return
    }

    private PageNameMonitor() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ PageNameMonitor(com.umeng.analytics.vshelper.PageNameMonitor.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.umeng.analytics.vshelper.PageNameMonitor getInstance() {
            com.umeng.analytics.vshelper.PageNameMonitor r0 = com.umeng.analytics.vshelper.PageNameMonitor.a.a()
            return r0
    }

    @Override // com.umeng.analytics.vshelper.a
    public void activityPause(java.lang.String r2) {
            r1 = this;
            java.lang.Object r2 = com.umeng.analytics.vshelper.PageNameMonitor.lock
            monitor-enter(r2)
            r0 = 0
            com.umeng.analytics.vshelper.PageNameMonitor.currentActivity = r0     // Catch: java.lang.Throwable -> L8
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    @Override // com.umeng.analytics.vshelper.a
    public void activityResume(java.lang.String r2) {
            r1 = this;
            java.lang.Object r0 = com.umeng.analytics.vshelper.PageNameMonitor.lock
            monitor-enter(r0)
            com.umeng.analytics.vshelper.PageNameMonitor.currentActivity = r2     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r2
    }

    @Override // com.umeng.analytics.vshelper.a
    public void customPageBegin(java.lang.String r2) {
            r1 = this;
            java.lang.Object r0 = com.umeng.analytics.vshelper.PageNameMonitor.lock
            monitor-enter(r0)
            com.umeng.analytics.vshelper.PageNameMonitor.currentCustomPage = r2     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r2
    }

    @Override // com.umeng.analytics.vshelper.a
    public void customPageEnd(java.lang.String r2) {
            r1 = this;
            java.lang.Object r2 = com.umeng.analytics.vshelper.PageNameMonitor.lock
            monitor-enter(r2)
            r0 = 0
            com.umeng.analytics.vshelper.PageNameMonitor.currentCustomPage = r0     // Catch: java.lang.Throwable -> L8
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    public java.lang.String getCurrenPageName() {
            r2 = this;
            java.lang.Object r0 = com.umeng.analytics.vshelper.PageNameMonitor.lock
            monitor-enter(r0)
            java.lang.String r1 = com.umeng.analytics.vshelper.PageNameMonitor.currentCustomPage     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return r1
        L9:
            r1 = move-exception
            goto L14
        Lb:
            java.lang.String r1 = com.umeng.analytics.vshelper.PageNameMonitor.currentActivity     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return r1
        L11:
            r1 = 0
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return r1
        L14:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r1
    }

    public java.lang.String getCurrentActivityName() {
            r2 = this;
            java.lang.Object r0 = com.umeng.analytics.vshelper.PageNameMonitor.lock
            monitor-enter(r0)
            java.lang.String r1 = com.umeng.analytics.vshelper.PageNameMonitor.currentActivity     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }
}
