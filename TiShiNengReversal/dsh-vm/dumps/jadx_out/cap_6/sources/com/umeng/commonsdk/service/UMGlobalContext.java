package com.umeng.commonsdk.service;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class UMGlobalContext {
    private static final java.lang.String TAG = "UMGlobalContext";
    private java.lang.String mAppVersion;
    private java.lang.String mAppkey;
    private android.content.Context mApplicationContext;
    private java.lang.String mChannel;
    private java.lang.String mProcessName;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.umeng.commonsdk.service.UMGlobalContext$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a {
        private static final com.umeng.commonsdk.service.UMGlobalContext a = null;

        static {
                com.umeng.commonsdk.service.UMGlobalContext r0 = new com.umeng.commonsdk.service.UMGlobalContext
                r1 = 0
                r0.<init>(r1)
                com.umeng.commonsdk.service.UMGlobalContext.a.a = r0
                return
        }

        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ com.umeng.commonsdk.service.UMGlobalContext a() {
                com.umeng.commonsdk.service.UMGlobalContext r0 = com.umeng.commonsdk.service.UMGlobalContext.a.a
                return r0
        }
    }

    private UMGlobalContext() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.mProcessName = r0
            return
    }

    /* synthetic */ UMGlobalContext(com.umeng.commonsdk.service.UMGlobalContext.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.content.Context getAppContext() {
            com.umeng.commonsdk.service.UMGlobalContext r0 = com.umeng.commonsdk.service.UMGlobalContext.a.a()
            android.content.Context r0 = r0.mApplicationContext
            return r0
    }

    public static android.content.Context getAppContext(android.content.Context r1) {
            com.umeng.commonsdk.service.UMGlobalContext r0 = com.umeng.commonsdk.service.UMGlobalContext.a.a()
            android.content.Context r0 = r0.mApplicationContext
            if (r0 != 0) goto L18
            if (r1 == 0) goto L18
            com.umeng.commonsdk.service.UMGlobalContext r0 = com.umeng.commonsdk.service.UMGlobalContext.a.a()
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            r0.mApplicationContext = r1
        L18:
            com.umeng.commonsdk.service.UMGlobalContext r1 = com.umeng.commonsdk.service.UMGlobalContext.a.a()
            android.content.Context r1 = r1.mApplicationContext
            return r1
    }

    public static com.umeng.commonsdk.service.UMGlobalContext getInstance(android.content.Context r1) {
            com.umeng.commonsdk.service.UMGlobalContext r0 = com.umeng.commonsdk.service.UMGlobalContext.a.a()
            android.content.Context r0 = r0.mApplicationContext
            if (r0 != 0) goto L10
            if (r1 == 0) goto L10
            com.umeng.commonsdk.service.UMGlobalContext r0 = com.umeng.commonsdk.service.UMGlobalContext.a.a()
            r0.mApplicationContext = r1
        L10:
            com.umeng.commonsdk.service.UMGlobalContext r1 = com.umeng.commonsdk.service.UMGlobalContext.a.a()
            return r1
    }

    public java.lang.String getAppVersion() {
            r1 = this;
            java.lang.String r0 = r1.mAppVersion
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L10
            android.content.Context r0 = r1.mApplicationContext
            java.lang.String r0 = com.umeng.commonsdk.utils.UMUtils.getAppVersionName(r0)
            r1.mAppVersion = r0
        L10:
            java.lang.String r0 = r1.mAppVersion
            return r0
    }

    public java.lang.String getAppkey() {
            r1 = this;
            java.lang.String r0 = r1.mAppkey
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Lc
            java.lang.String r0 = com.umeng.commonsdk.UMConfigure.sAppkey
            r1.mAppkey = r0
        Lc:
            java.lang.String r0 = r1.mAppkey
            return r0
    }

    public java.lang.String getChannel() {
            r1 = this;
            java.lang.String r0 = r1.mChannel
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Lc
            java.lang.String r0 = com.umeng.commonsdk.UMConfigure.sChannel
            r1.mChannel = r0
        Lc:
            java.lang.String r0 = r1.mChannel
            return r0
    }

    public java.lang.String getProcessName(android.content.Context r2) {
            r1 = this;
            java.lang.String r0 = r1.mProcessName
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L2c
            if (r2 == 0) goto L20
            com.umeng.commonsdk.service.UMGlobalContext r0 = com.umeng.commonsdk.service.UMGlobalContext.a.a()
            android.content.Context r0 = r0.mApplicationContext
            if (r0 == 0) goto L19
            java.lang.String r2 = com.umeng.commonsdk.framework.UMFrUtils.getCurrentProcessName(r0)
            r1.mProcessName = r2
            goto L2c
        L19:
            java.lang.String r2 = com.umeng.commonsdk.framework.UMFrUtils.getCurrentProcessName(r2)
            r1.mProcessName = r2
            goto L2c
        L20:
            com.umeng.commonsdk.service.UMGlobalContext r2 = com.umeng.commonsdk.service.UMGlobalContext.a.a()
            android.content.Context r2 = r2.mApplicationContext
            java.lang.String r2 = com.umeng.commonsdk.framework.UMFrUtils.getCurrentProcessName(r2)
            r1.mProcessName = r2
        L2c:
            java.lang.String r2 = r1.mProcessName
            return r2
    }

    public boolean isMainProcess(android.content.Context r1) {
            r0 = this;
            boolean r1 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r1)
            return r1
    }

    public java.lang.String toString() {
            r4 = this;
            com.umeng.commonsdk.service.UMGlobalContext r0 = com.umeng.commonsdk.service.UMGlobalContext.a.a()
            android.content.Context r0 = r0.mApplicationContext
            if (r0 == 0) goto L63
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "["
            r0.<init>(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "appkey:"
            r1.append(r2)
            java.lang.String r2 = r4.mAppkey
            r1.append(r2)
            java.lang.String r2 = ","
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "channel:"
            r1.append(r3)
            java.lang.String r3 = r4.mChannel
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "procName:"
            r1.append(r2)
            java.lang.String r2 = r4.mProcessName
            r1.append(r2)
            java.lang.String r2 = "]"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L63:
            java.lang.String r0 = "uninitialized."
            return r0
    }
}
