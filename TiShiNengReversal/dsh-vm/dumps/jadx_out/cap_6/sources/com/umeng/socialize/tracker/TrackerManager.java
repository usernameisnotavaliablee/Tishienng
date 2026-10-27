package com.umeng.socialize.tracker;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class TrackerManager {
    private static final java.lang.String APPKEY_IS_EMPTY = "appkey参数不能为null或者空字符串。";
    private static final java.lang.String ATTRIBUTES_EXCEED_LIMIT = "SDK仅支持10个自定义属性。";
    private static final java.lang.String CALLBACK_IS_NULL = "callback参数不能为null。";
    private static final java.lang.String CONTEXT_IS_NULL = "context参数不能为null。";
    private static final java.lang.String TAG = "TrackerManager";
    private static final java.lang.String UMID_IS_EMPTY = "umid参数不能为null或者空字符串。";
    private static final java.lang.String URL_IS_EMPTY = "url参数不能为null或者空字符串。";

    private TrackerManager() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String getUMID(android.content.Context r0) {
            java.lang.String r0 = com.umeng.commonsdk.UMConfigure.getUMIDString(r0)
            return r0
    }

    public static void requestTrackerCode(android.content.Context r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.util.Map<java.lang.String, java.lang.String> r14, com.umeng.socialize.tracker.TrackerResultHandler r15) {
            boolean r0 = com.umeng.socialize.utils.CommonUtil.isSilentMode(r9)
            if (r0 == 0) goto L7
            return
        L7:
            if (r9 != 0) goto La
            return
        La:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L11
            return
        L11:
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 == 0) goto L18
            return
        L18:
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 == 0) goto L1f
            return
        L1f:
            if (r15 != 0) goto L22
            return
        L22:
            if (r14 == 0) goto L2d
            int r0 = r14.size()
            r1 = 10
            if (r0 <= r1) goto L2d
            return
        L2d:
            boolean r0 = com.umeng.socialize.utils.DeviceConfig.isNetworkAvailable(r9)
            if (r0 != 0) goto L42
            java.lang.Throwable r9 = new java.lang.Throwable
            com.umeng.socialize.tracker.utils.a r10 = com.umeng.socialize.tracker.utils.a.c
            java.lang.String r10 = r10.a()
            r9.<init>(r10)
            r15.codeGenerateFailed(r9)
            return
        L42:
            com.umeng.socialize.tracker.b r0 = com.umeng.socialize.tracker.b.a()
            r7 = 0
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r8 = r15
            r0.a(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }
}
