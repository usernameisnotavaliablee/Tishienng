package com.umeng.commonsdk.internal.crash;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class UMCrashManager {
    private static final java.lang.String CM_VERSION = "2.0";
    private static boolean isReportCrash;
    private static java.lang.Object mObject;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.umeng.commonsdk.internal.crash.UMCrashManager.mObject = r0
            return
    }

    public UMCrashManager() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void buildEnvelope(android.content.Context r10, java.lang.Object r11) {
            java.lang.String r0 = "MobclickRT"
            java.lang.String r1 = "--->>> UMCrashManager.buildEnvelope enter."
            com.umeng.commonsdk.debug.UMRTLog.e(r0, r1)
            java.lang.Object r1 = com.umeng.commonsdk.internal.crash.UMCrashManager.mObject     // Catch: java.lang.Throwable -> L8e
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L8e
            if (r10 == 0) goto L8a
            if (r11 != 0) goto L10
            goto L8a
        L10:
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L41
            boolean r0 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> L41
            if (r0 != 0) goto L88
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L41
            r0.<init>()     // Catch: java.lang.Throwable -> L41
            java.io.File r2 = r10.getFilesDir()     // Catch: java.lang.Throwable -> L41
            r0.append(r2)     // Catch: java.lang.Throwable -> L41
            java.lang.String r2 = java.io.File.separator     // Catch: java.lang.Throwable -> L41
            r0.append(r2)     // Catch: java.lang.Throwable -> L41
            java.lang.String r2 = com.umeng.commonsdk.stateless.a.f     // Catch: java.lang.Throwable -> L41
            r0.append(r2)     // Catch: java.lang.Throwable -> L41
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L41
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L41
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L41
            boolean r3 = r2.isDirectory()     // Catch: java.lang.Throwable -> L41
            if (r3 != 0) goto L44
            r2.mkdir()     // Catch: java.lang.Throwable -> L41
            goto L44
        L41:
            r0 = move-exception
            r10 = r0
            goto L8c
        L44:
            java.lang.String r2 = "c"
            r3 = 10
            com.umeng.commonsdk.stateless.d.a(r10, r0, r2, r3)     // Catch: java.lang.Throwable -> L41
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L41 org.json.JSONException -> L88
            r5.<init>()     // Catch: java.lang.Throwable -> L41 org.json.JSONException -> L88
            java.lang.String r0 = "c_sdk_v"
            java.lang.String r2 = "2.0"
            r5.put(r0, r2)     // Catch: java.lang.Throwable -> L41 org.json.JSONException -> L88
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L41 org.json.JSONException -> L88
            r0.<init>()     // Catch: java.lang.Throwable -> L41 org.json.JSONException -> L88
            java.lang.String r2 = "content"
            r0.put(r2, r11)     // Catch: java.lang.Throwable -> L41 org.json.JSONException -> L88
            java.lang.String r11 = "ts"
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L41 org.json.JSONException -> L88
            r0.put(r11, r2)     // Catch: java.lang.Throwable -> L41 org.json.JSONException -> L88
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L41 org.json.JSONException -> L88
            r11.<init>()     // Catch: java.lang.Throwable -> L41 org.json.JSONException -> L88
            java.lang.String r2 = "crash"
            r11.put(r2, r0)     // Catch: java.lang.Throwable -> L41 org.json.JSONException -> L88
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L41 org.json.JSONException -> L88
            r6.<init>()     // Catch: java.lang.Throwable -> L41 org.json.JSONException -> L88
            java.lang.String r0 = "tp"
            r6.put(r0, r11)     // Catch: java.lang.Throwable -> L41 org.json.JSONException -> L88
            java.lang.String r7 = com.umeng.commonsdk.statistics.UMServerURL.PATH_INNER_CRASH     // Catch: java.lang.Throwable -> L41 org.json.JSONException -> L88
            java.lang.String r8 = "c"
            java.lang.String r9 = "2.0"
            r4 = r10
            com.umeng.commonsdk.framework.UMEnvelopeBuild.buildEnvelopeWithExtHeader(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L41 org.json.JSONException -> L88
        L88:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L41
            goto L8e
        L8a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L41
            return
        L8c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L41
            throw r10     // Catch: java.lang.Throwable -> L8e
        L8e:
            return
    }

    public static void reportCrash(android.content.Context r3, java.lang.Throwable r4) {
            java.lang.Object r0 = com.umeng.commonsdk.internal.crash.UMCrashManager.mObject
            monitor-enter(r0)
            boolean r1 = com.umeng.commonsdk.internal.crash.UMCrashManager.isReportCrash     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto L1f
            r1 = 1
            com.umeng.commonsdk.internal.crash.UMCrashManager.isReportCrash = r1     // Catch: java.lang.Throwable -> L1d
            java.lang.String r4 = com.umeng.commonsdk.internal.crash.a.a(r4)     // Catch: java.lang.Throwable -> L1d
            com.umeng.commonsdk.internal.b r1 = com.umeng.commonsdk.internal.b.a(r3)     // Catch: java.lang.Throwable -> L1d
            com.umeng.commonsdk.internal.c r1 = r1.a()     // Catch: java.lang.Throwable -> L1d
            r2 = 32786(0x8012, float:4.5943E-41)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r3, r2, r1, r4)     // Catch: java.lang.Throwable -> L1d
            goto L1f
        L1d:
            r3 = move-exception
            goto L21
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r3
    }
}
