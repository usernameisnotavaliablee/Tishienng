package xyz.adscope.common.v2.dev.oaid;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class OAIDHelper {
    private static final java.lang.String OAID_HELPER_CN = "CN";
    private static final java.lang.String OAID_HELPER_SM = "SM";
    private static final java.lang.String SP_KEY_HONOR_OAID = "HONOR_OAID_CIP";
    private static final java.lang.String SP_KEY_OAID = "OAID_CIP";
    private static final java.lang.String TAG = "OAIDHelper";
    private volatile boolean hasInvokeInit;
    private java.lang.String mHonorOAID;
    private java.lang.String mOAID;
    private boolean personalRecommend;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class InstanceHolder {
        private static xyz.adscope.common.v2.dev.oaid.OAIDHelper instance;

        static {
                xyz.adscope.common.v2.dev.oaid.OAIDHelper r0 = new xyz.adscope.common.v2.dev.oaid.OAIDHelper
                r1 = 0
                r0.<init>(r1)
                xyz.adscope.common.v2.dev.oaid.OAIDHelper.InstanceHolder.instance = r0
                return
        }

        private InstanceHolder() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ xyz.adscope.common.v2.dev.oaid.OAIDHelper access$100() {
                xyz.adscope.common.v2.dev.oaid.OAIDHelper r0 = xyz.adscope.common.v2.dev.oaid.OAIDHelper.InstanceHolder.instance
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class OAIDChain {
        final /* synthetic */ xyz.adscope.common.v2.dev.oaid.OAIDHelper this$0;


        private OAIDChain(xyz.adscope.common.v2.dev.oaid.OAIDHelper r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ OAIDChain(xyz.adscope.common.v2.dev.oaid.OAIDHelper r1, xyz.adscope.common.v2.dev.oaid.OAIDHelper.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        static /* synthetic */ void access$600(xyz.adscope.common.v2.dev.oaid.OAIDHelper.OAIDChain r0, android.content.Context r1) {
                r0.continueGetOAID(r1)
                return
        }

        private void continueGetOAID(android.content.Context r1) {
                r0 = this;
                r0.getOAIDByCN(r1)
                return
        }

        private void getOAIDByCN(android.content.Context r3) {
                r2 = this;
                xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.DevicesIDsHelper r0 = new xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.DevicesIDsHelper     // Catch: java.lang.Throwable -> Le
                xyz.adscope.common.v2.dev.oaid.OAIDHelper$OAIDChain$1 r1 = new xyz.adscope.common.v2.dev.oaid.OAIDHelper$OAIDChain$1     // Catch: java.lang.Throwable -> Le
                r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> Le
                r0.<init>(r1)     // Catch: java.lang.Throwable -> Le
                r0.getOAID(r3)     // Catch: java.lang.Throwable -> Le
                return
            Le:
                r3 = move-exception
                xyz.adscope.common.v2.log.SDKLog.stack(r3)
                return
        }
    }

    private OAIDHelper() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.personalRecommend = r0
            r2.hasInvokeInit = r0
            xyz.adscope.common.v2.dev.oaid.OAIDHelper r0 = xyz.adscope.common.v2.dev.oaid.OAIDHelper.InstanceHolder.access$100()
            if (r0 != 0) goto Lf
            return
        Lf:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Singleton ..."
            r0.<init>(r1)
            throw r0
    }

    /* synthetic */ OAIDHelper(xyz.adscope.common.v2.dev.oaid.OAIDHelper.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ void access$200(xyz.adscope.common.v2.dev.oaid.OAIDHelper r0, android.content.Context r1) {
            r0.getHonorOAIDByProp(r1)
            return
    }

    static /* synthetic */ void access$400(xyz.adscope.common.v2.dev.oaid.OAIDHelper r0, android.content.Context r1, xyz.adscope.common.v2.dev.oaid.OAIDHelper.OAIDChain r2) {
            r0.getOAIDBySM(r1, r2)
            return
    }

    static /* synthetic */ void access$500(xyz.adscope.common.v2.dev.oaid.OAIDHelper r0, android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            r0.saveOAID(r1, r2, r3)
            return
    }

    private void getHonorOAIDByProp(android.content.Context r3) {
            r2 = this;
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r1 = "HONOR"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L33
            android.content.ContentResolver r0 = r3.getContentResolver()     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = "oaid_limit_state"
            java.lang.String r0 = android.provider.Settings.Global.getString(r0, r1)     // Catch: java.lang.Throwable -> L33
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto L33
            boolean r0 = java.lang.Boolean.parseBoolean(r0)     // Catch: java.lang.Throwable -> L33
            if (r0 != 0) goto L33
            android.content.ContentResolver r0 = r3.getContentResolver()     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = "oaid"
            java.lang.String r0 = android.provider.Settings.Global.getString(r0, r1)     // Catch: java.lang.Throwable -> L33
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto L33
            r2.saveHonorOAID(r3, r0)     // Catch: java.lang.Throwable -> L33
        L33:
            return
    }

    public static xyz.adscope.common.v2.dev.oaid.OAIDHelper getInstance() {
            xyz.adscope.common.v2.dev.oaid.OAIDHelper r0 = xyz.adscope.common.v2.dev.oaid.OAIDHelper.InstanceHolder.access$100()
            return r0
    }

    private void getOAIDBySM(android.content.Context r2, xyz.adscope.common.v2.dev.oaid.OAIDHelper.OAIDChain r3) {
            r1 = this;
            android.content.Context r0 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L1c
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)     // Catch: java.lang.Throwable -> L1c
            android.app.Application r0 = (android.app.Application) r0     // Catch: java.lang.Throwable -> L1c
            xyz.adscope.common.v2.dev.oaid.sm.oaid.DeviceIdentifier.register(r0)     // Catch: java.lang.Throwable -> L1c
            boolean r0 = xyz.adscope.common.v2.dev.oaid.sm.oaid.DeviceID.supportedOAID(r2)     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L1e
            xyz.adscope.common.v2.dev.oaid.OAIDHelper$2 r0 = new xyz.adscope.common.v2.dev.oaid.OAIDHelper$2     // Catch: java.lang.Throwable -> L1c
            r0.<init>(r1, r2, r3)     // Catch: java.lang.Throwable -> L1c
            xyz.adscope.common.v2.dev.oaid.sm.oaid.DeviceID.getOAID(r2, r0)     // Catch: java.lang.Throwable -> L1c
            return
        L1c:
            r2 = move-exception
            goto L1f
        L1e:
            return
        L1f:
            xyz.adscope.common.v2.log.SDKLog.stack(r2)
            return
    }

    private void saveHonorOAID(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "保存Honor OAID: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "OAIDHelper"
            xyz.adscope.common.v2.log.SDKLog.d(r1, r0)
            r2.mHonorOAID = r4
            java.lang.String r4 = xyz.adscope.common.v2.encrypt.impl.Base64Util.encodeToString(r4)
            java.lang.String r0 = xyz.adscope.common.v2.persistent.sp.CommonSpHelper.getCommonSPFile()
            java.lang.String r1 = "HONOR_OAID_CIP"
            xyz.adscope.common.v2.persistent.sp.CommonSpHelper.putString(r3, r0, r1, r4)
            return
    }

    private void saveOAID(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r4 = "保存 OAID: "
            r0.append(r4)
            r0.append(r3)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "OAIDHelper"
            xyz.adscope.common.v2.log.SDKLog.d(r0, r4)
            r1.mOAID = r3
            java.lang.String r3 = xyz.adscope.common.v2.encrypt.impl.Base64Util.encodeToString(r3)
            java.lang.String r4 = xyz.adscope.common.v2.persistent.sp.CommonSpHelper.getCommonSPFile()
            java.lang.String r0 = "OAID_CIP"
            xyz.adscope.common.v2.persistent.sp.CommonSpHelper.putString(r2, r4, r0, r3)
            return
    }

    public java.lang.String getHonorOAID(android.content.Context r4) {
            r3 = this;
            boolean r0 = r3.personalRecommend
            java.lang.String r1 = ""
            if (r0 != 0) goto L7
            return r1
        L7:
            java.lang.String r0 = r3.mHonorOAID
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1f
            java.lang.String r0 = xyz.adscope.common.v2.persistent.sp.CommonSpHelper.getCommonSPFile()
            java.lang.String r2 = "HONOR_OAID_CIP"
            java.lang.String r4 = xyz.adscope.common.v2.persistent.sp.CommonSpHelper.getString(r4, r0, r2, r1)
            java.lang.String r4 = xyz.adscope.common.v2.encrypt.impl.Base64Util.decodeToString(r4)
            r3.mHonorOAID = r4
        L1f:
            java.lang.String r4 = r3.mHonorOAID
            return r4
    }

    public java.lang.String getOAID(android.content.Context r4) {
            r3 = this;
            boolean r0 = r3.personalRecommend
            java.lang.String r1 = ""
            if (r0 != 0) goto L7
            return r1
        L7:
            java.lang.String r0 = r3.mOAID
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1f
            java.lang.String r0 = xyz.adscope.common.v2.persistent.sp.CommonSpHelper.getCommonSPFile()
            java.lang.String r2 = "OAID_CIP"
            java.lang.String r4 = xyz.adscope.common.v2.persistent.sp.CommonSpHelper.getString(r4, r0, r2, r1)
            java.lang.String r4 = xyz.adscope.common.v2.encrypt.impl.Base64Util.decodeToString(r4)
            r3.mOAID = r4
        L1f:
            java.lang.String r4 = r3.mOAID
            return r4
    }

    public synchronized void initOAID(android.content.Context r3) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.hasInvokeInit     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L1d
            r0 = 1
            r2.hasInvokeInit = r0     // Catch: java.lang.Throwable -> L1b
            xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager r0 = xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager.getInstance()     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r0 = r0.getOrCreateImplement(r3)     // Catch: java.lang.Throwable -> L1b
            xyz.adscope.common.v2.thread.pool.IBaseThreadPool r0 = (xyz.adscope.common.v2.thread.pool.IBaseThreadPool) r0     // Catch: java.lang.Throwable -> L1b
            xyz.adscope.common.v2.dev.oaid.OAIDHelper$1 r1 = new xyz.adscope.common.v2.dev.oaid.OAIDHelper$1     // Catch: java.lang.Throwable -> L1b
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L1b
            r0.executeLocalAsyncTask(r1)     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r3 = move-exception
            goto L1f
        L1d:
            monitor-exit(r2)
            return
        L1f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1b
            throw r3
    }

    public void setPersonalRecommend(boolean r1) {
            r0 = this;
            r0.personalRecommend = r1
            return
    }
}
