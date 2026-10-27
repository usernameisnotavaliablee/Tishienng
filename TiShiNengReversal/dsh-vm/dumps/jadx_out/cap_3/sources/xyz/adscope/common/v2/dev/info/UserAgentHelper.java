package xyz.adscope.common.v2.dev.info;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class UserAgentHelper {
    private static final int GET_USER_AGENT_MSG = 1;
    private static final java.lang.String SP_KEY_USER_AGENT = "UA_CIP";
    private static final java.lang.String SP_KEY_USER_AGENT_LAST = "UA_LAST";
    private java.lang.String mCustomUA;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: xyz.adscope.common.v2.dev.info.UserAgentHelper$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class InstanceHolder {
        private static xyz.adscope.common.v2.dev.info.UserAgentHelper instance;

        static {
                xyz.adscope.common.v2.dev.info.UserAgentHelper r0 = new xyz.adscope.common.v2.dev.info.UserAgentHelper
                r1 = 0
                r0.<init>(r1)
                xyz.adscope.common.v2.dev.info.UserAgentHelper.InstanceHolder.instance = r0
                return
        }

        private InstanceHolder() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ xyz.adscope.common.v2.dev.info.UserAgentHelper access$100() {
                xyz.adscope.common.v2.dev.info.UserAgentHelper r0 = xyz.adscope.common.v2.dev.info.UserAgentHelper.InstanceHolder.instance
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class UAHandler extends xyz.adscope.common.v2.handle.WeakReferenceHandler {
        public UAHandler(android.content.Context r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private android.webkit.WebView getSafeWebView(android.content.Context r3) {
                r2 = this;
                android.webkit.WebView r0 = new android.webkit.WebView
                r0.<init>(r3)
                r3 = 0
                android.webkit.WebView.setWebContentsDebuggingEnabled(r3)
                android.webkit.WebSettings r1 = r0.getSettings()
                r1.setSavePassword(r3)
                return r0
        }

        @Override // xyz.adscope.common.v2.handle.WeakReferenceHandler
        public void scopeHandleMessage(android.os.Message r6) {
                r5 = this;
                if (r6 == 0) goto L4d
                int r6 = r6.what
                r0 = 1
                if (r6 != r0) goto L4d
                android.content.Context r6 = r5.getContext()
                if (r6 == 0) goto L4d
                java.lang.String r0 = "v2"
                java.lang.String r1 = xyz.adscope.common.v2.persistent.sp.CommonSpHelper.getBasicSPFile(r0)
                r2 = 0
                java.lang.String r4 = "UA_LAST"
                long r1 = xyz.adscope.common.v2.persistent.sp.CommonSpHelper.getLong(r6, r1, r4, r2)
                r3 = 2
                boolean r1 = xyz.adscope.common.v2.tool.date.DateUtil.timestampIsInDay(r1, r3)
                if (r1 == 0) goto L23
                goto L4d
            L23:
                android.webkit.WebView r1 = r5.getSafeWebView(r6)
                android.webkit.WebSettings r1 = r1.getSettings()
                java.lang.String r1 = r1.getUserAgentString()
                boolean r2 = android.text.TextUtils.isEmpty(r1)
                if (r2 != 0) goto L4d
                java.lang.String r1 = xyz.adscope.common.v2.encrypt.impl.Base64Util.encodeToString(r1)
                java.lang.String r2 = xyz.adscope.common.v2.persistent.sp.CommonSpHelper.getBasicSPFile(r0)
                java.lang.String r3 = "UA_CIP"
                xyz.adscope.common.v2.persistent.sp.CommonSpHelper.putString(r6, r2, r3, r1)
                java.lang.String r0 = xyz.adscope.common.v2.persistent.sp.CommonSpHelper.getBasicSPFile(r0)
                long r1 = java.lang.System.currentTimeMillis()
                xyz.adscope.common.v2.persistent.sp.CommonSpHelper.putLong(r6, r0, r4, r1)
            L4d:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class UserAgentTask implements java.lang.Runnable {
        private final xyz.adscope.common.v2.handle.WeakReferenceHandler mHandler;

        private UserAgentTask(android.content.Context r2) {
                r1 = this;
                r1.<init>()
                xyz.adscope.common.v2.dev.info.UserAgentHelper$UAHandler r0 = new xyz.adscope.common.v2.dev.info.UserAgentHelper$UAHandler
                r0.<init>(r2)
                r1.mHandler = r0
                return
        }

        /* synthetic */ UserAgentTask(android.content.Context r1, xyz.adscope.common.v2.dev.info.UserAgentHelper.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                android.os.Message r0 = android.os.Message.obtain()
                r1 = 1
                r0.what = r1
                xyz.adscope.common.v2.handle.WeakReferenceHandler r1 = r2.mHandler
                r1.sendMessage(r0)
                return
        }
    }

    private UserAgentHelper() {
            r2 = this;
            r2.<init>()
            xyz.adscope.common.v2.dev.info.UserAgentHelper r0 = xyz.adscope.common.v2.dev.info.UserAgentHelper.InstanceHolder.access$100()
            if (r0 != 0) goto La
            return
        La:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Singleton ..."
            r0.<init>(r1)
            throw r0
    }

    /* synthetic */ UserAgentHelper(xyz.adscope.common.v2.dev.info.UserAgentHelper.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static xyz.adscope.common.v2.dev.info.UserAgentHelper getInstance() {
            xyz.adscope.common.v2.dev.info.UserAgentHelper r0 = xyz.adscope.common.v2.dev.info.UserAgentHelper.InstanceHolder.access$100()
            return r0
    }

    public void asyncInitUserAgent(android.content.Context r5) {
            r4 = this;
            xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager r0 = xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager.getInstance()
            java.lang.Object r0 = r0.getOrCreateImplement(r5)
            xyz.adscope.common.v2.thread.pool.IBaseThreadPool r0 = (xyz.adscope.common.v2.thread.pool.IBaseThreadPool) r0
            if (r0 == 0) goto L19
            xyz.adscope.common.v2.dev.info.UserAgentHelper$UserAgentTask r1 = new xyz.adscope.common.v2.dev.info.UserAgentHelper$UserAgentTask
            r2 = 0
            r1.<init>(r5, r2)
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            r2 = 5
            r0.scheduleAsyncTask(r1, r2, r5)
        L19:
            return
    }

    public java.lang.String getUserAgent(android.content.Context r4) {
            r3 = this;
            java.lang.String r0 = r3.mCustomUA
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r4 = r3.mCustomUA
            return r4
        Lb:
            java.lang.String r0 = "v2"
            java.lang.String r0 = xyz.adscope.common.v2.persistent.sp.CommonSpHelper.getBasicSPFile(r0)
            java.lang.String r1 = "UA_CIP"
            java.lang.String r2 = ""
            java.lang.String r4 = xyz.adscope.common.v2.persistent.sp.CommonSpHelper.getString(r4, r0, r1, r2)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L24
            java.lang.String r4 = xyz.adscope.common.v2.encrypt.impl.Base64Util.decodeToString(r4)
            return r4
        L24:
            return r2
    }

    public void setCustomUserAgent(java.lang.String r1) {
            r0 = this;
            r0.mCustomUA = r1
            return
    }
}
