package com.bytedance.pangle.log;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class xt {
    public xt() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String j(java.lang.Object r0) {
            if (r0 != 0) goto L5
            java.lang.String r0 = ""
            return r0
        L5:
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.String j(java.lang.Throwable r1) {
            if (r1 != 0) goto L5
            java.lang.String r1 = ""
            return r1
        L5:
            java.io.StringWriter r1 = new java.io.StringWriter
            r1.<init>()
            java.io.PrintWriter r0 = new java.io.PrintWriter
            r0.<init>(r1)
            java.lang.String r1 = r1.toString()
            return r1
    }

    public static void j(java.lang.String r6, org.json.JSONObject r7, org.json.JSONObject r8, org.json.JSONObject r9) {
            java.lang.String r0 = "Zeus/reporter_pangle"
            if (r7 != 0) goto L9
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
        L9:
            if (r8 != 0) goto L10
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
        L10:
            if (r9 != 0) goto L17
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
        L17:
            android.app.Application r1 = com.bytedance.pangle.Zeus.getAppApplication()
            if (r1 == 0) goto L2a
            android.app.Application r1 = com.bytedance.pangle.Zeus.getAppApplication()
            java.lang.String r1 = com.bytedance.pangle.up.r.j(r1)
            java.lang.String r1 = com.bytedance.pangle.up.r.j(r1)
            goto L2b
        L2a:
            r1 = 0
        L2b:
            android.app.Application r2 = com.bytedance.pangle.Zeus.getAppApplication()
            java.lang.String r3 = ""
            if (r2 == 0) goto L3c
            android.app.Application r2 = com.bytedance.pangle.Zeus.getAppApplication()
            java.lang.String r2 = r2.getPackageName()
            goto L3d
        L3c:
            r2 = r3
        L3d:
            if (r1 != 0) goto L41
            java.lang.String r1 = "unknown"
        L41:
            java.lang.String r4 = "process_name"
            java.lang.String r1 = j(r1)     // Catch: org.json.JSONException -> L61
            r7.putOpt(r4, r1)     // Catch: org.json.JSONException -> L61
            java.lang.String r1 = "host_package_name"
            r7.putOpt(r1, r2)     // Catch: org.json.JSONException -> L61
            java.lang.String r1 = "plugin_package_name"
            java.lang.String r1 = r7.optString(r1, r3)     // Catch: org.json.JSONException -> L61
            r2 = 0
            com.bytedance.pangle.plugin.Plugin r1 = com.bytedance.pangle.Zeus.getPlugin(r1, r2)     // Catch: org.json.JSONException -> L61
            if (r1 == 0) goto L64
            int r1 = r1.getApiVersionCode()     // Catch: org.json.JSONException -> L61
            goto L65
        L61:
            r6 = move-exception
            goto L10e
        L64:
            r1 = -1
        L65:
            java.lang.String r2 = "plugin_api_version"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: org.json.JSONException -> L61
            java.lang.String r1 = j(r1)     // Catch: org.json.JSONException -> L61
            r7.putOpt(r2, r1)     // Catch: org.json.JSONException -> L61
            java.lang.String r1 = "zeus_sdk_version"
            java.lang.String r2 = "0.0.1-beta.4200.115-bugfix.33"
            java.lang.String r2 = j(r2)     // Catch: org.json.JSONException -> L61
            r7.putOpt(r1, r2)     // Catch: org.json.JSONException -> L61
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L61
            java.lang.String r2 = "eventName: "
            r1.<init>(r2)     // Catch: org.json.JSONException -> L61
            r1.append(r6)     // Catch: org.json.JSONException -> L61
            java.lang.String r2 = "\ncategoryData:"
            r1.append(r2)     // Catch: org.json.JSONException -> L61
            r2 = 1
            java.lang.String r3 = r7.toString(r2)     // Catch: org.json.JSONException -> L61
            r1.append(r3)     // Catch: org.json.JSONException -> L61
            java.lang.String r3 = "\nmetricData:"
            r1.append(r3)     // Catch: org.json.JSONException -> L61
            java.lang.String r3 = r8.toString(r2)     // Catch: org.json.JSONException -> L61
            r1.append(r3)     // Catch: org.json.JSONException -> L61
            java.lang.String r3 = "\nlogExtrData:"
            r1.append(r3)     // Catch: org.json.JSONException -> L61
            java.lang.String r2 = r9.toString(r2)     // Catch: org.json.JSONException -> L61
            r1.append(r2)     // Catch: org.json.JSONException -> L61
            java.lang.String r1 = r1.toString()     // Catch: org.json.JSONException -> L61
            com.bytedance.pangle.log.ZeusLogger.v(r0, r1)     // Catch: org.json.JSONException -> L61
            com.bytedance.pangle.GlobalParam r1 = com.bytedance.pangle.GlobalParam.getInstance()     // Catch: org.json.JSONException -> L61
            com.bytedance.pangle.log.IZeusReporter r1 = r1.getReporter()     // Catch: org.json.JSONException -> L61
            if (r1 == 0) goto L10d
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L61
            r2.<init>()     // Catch: org.json.JSONException -> L61
            java.util.Iterator r3 = r7.keys()     // Catch: org.json.JSONException -> L61
        Lc6:
            boolean r4 = r3.hasNext()     // Catch: org.json.JSONException -> L61
            if (r4 == 0) goto Lda
            java.lang.Object r4 = r3.next()     // Catch: org.json.JSONException -> L61
            java.lang.String r4 = (java.lang.String) r4     // Catch: org.json.JSONException -> L61
            java.lang.Object r5 = r7.opt(r4)     // Catch: org.json.JSONException -> L61
            r2.putOpt(r4, r5)     // Catch: org.json.JSONException -> L61
            goto Lc6
        Lda:
            java.util.Iterator r7 = r8.keys()     // Catch: org.json.JSONException -> L61
        Lde:
            boolean r3 = r7.hasNext()     // Catch: org.json.JSONException -> L61
            if (r3 == 0) goto Lf2
            java.lang.Object r3 = r7.next()     // Catch: org.json.JSONException -> L61
            java.lang.String r3 = (java.lang.String) r3     // Catch: org.json.JSONException -> L61
            java.lang.Object r4 = r8.opt(r3)     // Catch: org.json.JSONException -> L61
            r2.putOpt(r3, r4)     // Catch: org.json.JSONException -> L61
            goto Lde
        Lf2:
            java.util.Iterator r7 = r9.keys()     // Catch: org.json.JSONException -> L61
        Lf6:
            boolean r8 = r7.hasNext()     // Catch: org.json.JSONException -> L61
            if (r8 == 0) goto L10a
            java.lang.Object r8 = r7.next()     // Catch: org.json.JSONException -> L61
            java.lang.String r8 = (java.lang.String) r8     // Catch: org.json.JSONException -> L61
            java.lang.Object r3 = r9.opt(r8)     // Catch: org.json.JSONException -> L61
            r2.putOpt(r8, r3)     // Catch: org.json.JSONException -> L61
            goto Lf6
        L10a:
            r1.report(r6, r2)     // Catch: org.json.JSONException -> L61
        L10d:
            return
        L10e:
            java.lang.String r7 = r6.getMessage()
            com.bytedance.pangle.log.ZeusLogger.w(r0, r7, r6)
            return
    }

    public static int xt(java.lang.Object r1) {
            r0 = -1
            if (r1 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = r1.toString()
            int r1 = com.bytedance.pangle.util.vl.j(r1, r0)
            return r1
    }
}
