package com.umeng.commonsdk.vchannel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class Sender {
    private static long INTERVAL_THRESHOLD = 500;
    public static final java.lang.String VCHANNEL_VERSION = "1.0.0";
    private static java.util.Map<java.lang.String, java.lang.String> customHeader;
    private static long lastTriggerTime;

    static {
            return
    }

    public Sender() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void handleEvent(android.content.Context r7, com.umeng.commonsdk.vchannel.b r8) {
            if (r7 != 0) goto La
            java.lang.String r7 = "MobclickRT"
            java.lang.String r8 = "--->>> Sender:handleEvent: context is null."
            com.umeng.commonsdk.debug.UMRTLog.e(r7, r8)
            return
        La:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L5c
            r2.<init>()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r0 = "v_sdk_v"
            java.lang.String r1 = "1.0.0"
            r2.put(r0, r1)     // Catch: java.lang.Throwable -> L40
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.vchannel.Sender.customHeader     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L40
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L40
            if (r0 <= 0) goto L40
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.commonsdk.vchannel.Sender.customHeader     // Catch: java.lang.Throwable -> L40
            java.util.Set r0 = r0.keySet()     // Catch: java.lang.Throwable -> L40
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L40
        L2a:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L40
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L40
            java.util.Map<java.lang.String, java.lang.String> r3 = com.umeng.commonsdk.vchannel.Sender.customHeader     // Catch: java.lang.Throwable -> L40
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L40
            r2.put(r1, r3)     // Catch: java.lang.Throwable -> L40
            goto L2a
        L40:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L5c
            r3.<init>()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r0 = "analytics"
            org.json.JSONObject r8 = r8.d()     // Catch: java.lang.Throwable -> L5c
            r3.put(r0, r8)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r4 = com.umeng.commonsdk.vchannel.a.c     // Catch: java.lang.Throwable -> L5c
            java.lang.String r5 = "v"
            java.lang.String r6 = "1.0.0"
            r1 = r7
            com.umeng.commonsdk.framework.UMEnvelopeBuild.buildEnvelopeWithExtHeader(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L59
            goto L62
        L59:
            r0 = move-exception
        L5a:
            r7 = r0
            goto L5f
        L5c:
            r0 = move-exception
            r1 = r7
            goto L5a
        L5f:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r1, r7)
        L62:
            return
    }

    public static void onEvent(android.content.Context r6, java.lang.String r7, java.util.Map<java.lang.String, java.lang.Object> r8) {
            java.lang.String r0 = "MobclickRT"
            if (r6 != 0) goto La
            java.lang.String r6 = "--->>> Sender: onEvent: context is null."
            com.umeng.commonsdk.debug.UMRTLog.e(r0, r6)
            return
        La:
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            if (r1 == 0) goto L16
            java.lang.String r6 = "--->>> Sender: onEvent: eventID is null or an empty string."
            com.umeng.commonsdk.debug.UMRTLog.e(r0, r6)
            return
        L16:
            if (r8 != 0) goto L1e
            java.lang.String r6 = "--->>> Sender: onEvent: map is null."
            com.umeng.commonsdk.debug.UMRTLog.e(r0, r6)
            return
        L1e:
            boolean r1 = com.umeng.commonsdk.framework.UMFrUtils.isOnline(r6)
            if (r1 != 0) goto L2a
            java.lang.String r6 = "--->>> Sender: onEvent: Network unavailable."
            com.umeng.commonsdk.debug.UMRTLog.e(r0, r6)
            return
        L2a:
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = com.umeng.commonsdk.vchannel.Sender.lastTriggerTime
            long r1 = r1 - r3
            long r3 = com.umeng.commonsdk.vchannel.Sender.INTERVAL_THRESHOLD
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L3d
            java.lang.String r6 = "--->>> Sender: onEvent: The interval between events is less than 500 milliseconds."
            com.umeng.commonsdk.debug.UMRTLog.e(r0, r6)
            return
        L3d:
            com.umeng.commonsdk.vchannel.b r0 = new com.umeng.commonsdk.vchannel.b
            r0.<init>(r6)
            r0.a(r7)
            long r1 = java.lang.System.currentTimeMillis()
            r0.a(r1)
            r0.a(r8)
            com.umeng.commonsdk.internal.b r7 = com.umeng.commonsdk.internal.b.a(r6)     // Catch: java.lang.Throwable -> L5d
            com.umeng.commonsdk.internal.c r7 = r7.a()     // Catch: java.lang.Throwable -> L5d
            r8 = 32779(0x800b, float:4.5933E-41)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r6, r8, r7, r0)     // Catch: java.lang.Throwable -> L5d
        L5d:
            long r6 = java.lang.System.currentTimeMillis()
            com.umeng.commonsdk.vchannel.Sender.lastTriggerTime = r6
            return
    }

    public static void setCustomHeader(java.util.Map<java.lang.String, java.lang.String> r0) {
            if (r0 == 0) goto L4
            com.umeng.commonsdk.vchannel.Sender.customHeader = r0
        L4:
            return
    }
}
