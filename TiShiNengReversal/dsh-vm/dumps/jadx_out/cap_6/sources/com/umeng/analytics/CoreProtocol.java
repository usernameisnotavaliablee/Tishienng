package com.umeng.analytics;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class CoreProtocol implements com.umeng.commonsdk.framework.UMLogDataProtocol, com.umeng.commonsdk.framework.UMSenderStateNotify {
    private static android.content.Context a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.umeng.analytics.CoreProtocol$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a {
        private static final com.umeng.analytics.CoreProtocol a = null;

        static {
                com.umeng.analytics.CoreProtocol r0 = new com.umeng.analytics.CoreProtocol
                r1 = 0
                r0.<init>(r1)
                com.umeng.analytics.CoreProtocol.a.a = r0
                return
        }

        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ com.umeng.analytics.CoreProtocol a() {
                com.umeng.analytics.CoreProtocol r0 = com.umeng.analytics.CoreProtocol.a.a
                return r0
        }
    }

    static {
            return
    }

    private CoreProtocol() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ CoreProtocol(com.umeng.analytics.CoreProtocol.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.umeng.analytics.CoreProtocol getInstance(android.content.Context r1) {
            android.content.Context r0 = com.umeng.analytics.CoreProtocol.a
            if (r0 != 0) goto L10
            if (r1 == 0) goto L10
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            com.umeng.analytics.CoreProtocol.a = r1
        L10:
            com.umeng.analytics.CoreProtocol r1 = com.umeng.analytics.CoreProtocol.a.a()
            return r1
    }

    @Override // com.umeng.commonsdk.framework.UMSenderStateNotify
    public void onConnectionAvailable() {
            r1 = this;
            android.content.Context r0 = com.umeng.analytics.CoreProtocol.a
            com.umeng.analytics.pro.o r0 = com.umeng.analytics.pro.o.a(r0)
            r0.a()
            return
    }

    @Override // com.umeng.commonsdk.framework.UMSenderStateNotify
    public void onSenderIdle() {
            r1 = this;
            android.content.Context r0 = com.umeng.analytics.CoreProtocol.a
            com.umeng.analytics.pro.o r0 = com.umeng.analytics.pro.o.a(r0)
            r0.b()
            return
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void removeCacheData(java.lang.Object r2) {
            r1 = this;
            android.content.Context r0 = com.umeng.analytics.CoreProtocol.a
            com.umeng.analytics.pro.o r0 = com.umeng.analytics.pro.o.a(r0)
            r0.a(r2)
            return
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public org.json.JSONObject setupReportData(long r2) {
            r1 = this;
            android.content.Context r0 = com.umeng.analytics.CoreProtocol.a
            com.umeng.analytics.pro.o r0 = com.umeng.analytics.pro.o.a(r0)
            org.json.JSONObject r2 = r0.a(r2)
            return r2
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void workEvent(java.lang.Object r2, int r3) {
            r1 = this;
            android.content.Context r0 = com.umeng.analytics.CoreProtocol.a
            com.umeng.analytics.pro.o r0 = com.umeng.analytics.pro.o.a(r0)
            r0.a(r2, r3)
            return
    }
}
