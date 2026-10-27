package com.bytedance.j.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class a {
    static volatile org.json.JSONObject a;

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    private static java.lang.String a() {
            java.lang.String r0 = android.os.Build.VERSION.RELEASE
            java.lang.String r1 = "."
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto Lb
            return r0
        Lb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = ".0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    private static org.json.JSONObject b(java.util.Map r11) throws org.json.JSONException {
            java.lang.String r0 = "channel"
            java.lang.String r1 = "update_version_code"
            java.lang.String r2 = "app_version"
            java.lang.String r3 = "aid"
            java.lang.String r4 = "version_code"
            java.lang.String r5 = "Android"
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            java.lang.String r7 = "magic_tag"
            java.lang.String r8 = "ss_app_log"
            r6.put(r7, r8)
            org.json.JSONObject r7 = com.bytedance.j.j.a.a
            if (r7 != 0) goto L115
            android.content.Context r7 = com.bytedance.j.xt.e.i()
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Exception -> L115
            r8.<init>()     // Catch: java.lang.Exception -> L115
            com.bytedance.j.j.a.a = r8     // Catch: java.lang.Exception -> L115
            java.lang.String r9 = "os"
            r8.put(r9, r5)     // Catch: java.lang.Exception -> L115
            org.json.JSONObject r8 = com.bytedance.j.j.a.a     // Catch: java.lang.Exception -> L115
            java.lang.String r9 = "platform"
            r8.put(r9, r5)     // Catch: java.lang.Exception -> L115
            org.json.JSONObject r8 = com.bytedance.j.j.a.a     // Catch: java.lang.Exception -> L115
            java.lang.String r9 = "sdk_lib"
            r8.put(r9, r5)     // Catch: java.lang.Exception -> L115
            org.json.JSONObject r5 = com.bytedance.j.j.a.a     // Catch: java.lang.Exception -> L115
            java.lang.String r8 = "os_version"
            java.lang.String r9 = a()     // Catch: java.lang.Exception -> L115
            r5.put(r8, r9)     // Catch: java.lang.Exception -> L115
            org.json.JSONObject r5 = com.bytedance.j.j.a.a     // Catch: java.lang.Exception -> L115
            java.lang.String r8 = "os_api"
            int r9 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L115
            r5.put(r8, r9)     // Catch: java.lang.Exception -> L115
            org.json.JSONObject r5 = com.bytedance.j.j.a.a     // Catch: java.lang.Exception -> L115
            java.lang.String r8 = "use_apm_sdk"
            java.lang.String r9 = "1"
            r5.put(r8, r9)     // Catch: java.lang.Exception -> L115
            org.json.JSONObject r5 = com.bytedance.j.j.a.a     // Catch: java.lang.Exception -> L115
            java.lang.String r8 = "sdk_version"
            r9 = 137(0x89, float:1.92E-43)
            r5.put(r8, r9)     // Catch: java.lang.Exception -> L115
            org.json.JSONObject r5 = com.bytedance.j.j.a.a     // Catch: java.lang.Exception -> L115
            java.lang.String r8 = "sdk_version_code"
            r5.put(r8, r9)     // Catch: java.lang.Exception -> L115
            org.json.JSONObject r5 = com.bytedance.j.j.a.a     // Catch: java.lang.Exception -> L115
            java.lang.String r8 = "sdk_version_name"
            java.lang.String r9 = "0.0.1-alpha.17-cloud"
            r5.put(r8, r9)     // Catch: java.lang.Exception -> L115
            java.lang.String r5 = android.os.Build.MODEL     // Catch: java.lang.Exception -> L115
            java.lang.String r8 = android.os.Build.BRAND     // Catch: java.lang.Exception -> L115
            if (r5 != 0) goto L78
            r5 = r8
            goto L94
        L78:
            if (r8 == 0) goto L94
            boolean r9 = r5.contains(r8)     // Catch: java.lang.Exception -> L115
            if (r9 != 0) goto L94
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L115
            r9.<init>()     // Catch: java.lang.Exception -> L115
            r9.append(r8)     // Catch: java.lang.Exception -> L115
            r10 = 32
            r9.append(r10)     // Catch: java.lang.Exception -> L115
            r9.append(r5)     // Catch: java.lang.Exception -> L115
            java.lang.String r5 = r9.toString()     // Catch: java.lang.Exception -> L115
        L94:
            org.json.JSONObject r9 = com.bytedance.j.j.a.a     // Catch: java.lang.Exception -> L115
            java.lang.String r10 = "device_model"
            r9.put(r10, r5)     // Catch: java.lang.Exception -> L115
            org.json.JSONObject r5 = com.bytedance.j.j.a.a     // Catch: java.lang.Exception -> L115
            java.lang.String r9 = "device_brand"
            r5.put(r9, r8)     // Catch: java.lang.Exception -> L115
            org.json.JSONObject r5 = com.bytedance.j.j.a.a     // Catch: java.lang.Exception -> L115
            java.lang.String r8 = "device_manufacturer"
            java.lang.String r9 = android.os.Build.MANUFACTURER     // Catch: java.lang.Exception -> L115
            r5.put(r8, r9)     // Catch: java.lang.Exception -> L115
            if (r11 == 0) goto Le9
            java.lang.Object r5 = r11.get(r3)     // Catch: java.lang.Exception -> L115
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Exception -> L115
            org.json.JSONObject r8 = com.bytedance.j.j.a.a     // Catch: java.lang.Exception -> L115
            r8.put(r3, r5)     // Catch: java.lang.Exception -> L115
            org.json.JSONObject r3 = com.bytedance.j.j.a.a     // Catch: java.lang.Exception -> L115
            java.lang.Object r5 = r11.get(r2)     // Catch: java.lang.Exception -> L115
            r3.put(r2, r5)     // Catch: java.lang.Exception -> L115
            org.json.JSONObject r2 = com.bytedance.j.j.a.a     // Catch: java.lang.Exception -> L115
            java.lang.Object r3 = r11.get(r4)     // Catch: java.lang.Exception -> L115
            r2.put(r4, r3)     // Catch: java.lang.Exception -> L115
            org.json.JSONObject r2 = com.bytedance.j.j.a.a     // Catch: java.lang.Exception -> L115
            java.lang.Object r3 = r11.get(r1)     // Catch: java.lang.Exception -> L115
            r2.put(r1, r3)     // Catch: java.lang.Exception -> L115
            org.json.JSONObject r1 = com.bytedance.j.j.a.a     // Catch: java.lang.Exception -> L115
            java.lang.String r2 = "manifest_version_code"
            java.lang.Object r3 = r11.get(r4)     // Catch: java.lang.Exception -> L115
            r1.put(r2, r3)     // Catch: java.lang.Exception -> L115
            org.json.JSONObject r1 = com.bytedance.j.j.a.a     // Catch: java.lang.Exception -> L115
            java.lang.Object r11 = r11.get(r0)     // Catch: java.lang.Exception -> L115
            r1.put(r0, r11)     // Catch: java.lang.Exception -> L115
        Le9:
            org.json.JSONObject r11 = com.bytedance.j.j.a.a     // Catch: java.lang.Exception -> L115
            java.lang.String r0 = "bd_did"
            com.bytedance.j.xt.up.g r1 = com.bytedance.j.xt.e.b()     // Catch: java.lang.Exception -> L115
            java.lang.String r1 = r1.a()     // Catch: java.lang.Exception -> L115
            r11.put(r0, r1)     // Catch: java.lang.Exception -> L115
            java.lang.String r11 = r7.getPackageName()     // Catch: java.lang.Exception -> L115
            org.json.JSONObject r0 = com.bytedance.j.j.a.a     // Catch: java.lang.Exception -> L115
            java.lang.String r1 = "package"
            r0.put(r1, r11)     // Catch: java.lang.Exception -> L115
            org.json.JSONObject r11 = com.bytedance.j.j.a.a     // Catch: java.lang.Exception -> L115
            java.lang.String r0 = "display_name"
            android.content.pm.ApplicationInfo r1 = r7.getApplicationInfo()     // Catch: java.lang.Exception -> L115
            java.lang.String r1 = r1.name     // Catch: java.lang.Exception -> L115
            r11.put(r0, r1)     // Catch: java.lang.Exception -> L115
            org.json.JSONObject r11 = com.bytedance.j.j.a.a     // Catch: java.lang.Exception -> L115
            d(r11)     // Catch: java.lang.Exception -> L115
        L115:
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            java.lang.String r11 = "header"
            org.json.JSONObject r2 = com.bytedance.j.j.a.a
            r6.put(r11, r2)
            java.lang.String r11 = "local_time"
            r6.put(r11, r0)
            org.json.JSONArray r11 = new org.json.JSONArray
            r11.<init>()
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = "local_time_ms"
            r0.put(r3, r1)
            java.lang.String r3 = "tea_event_index"
            r4 = 10001(0x2711, float:1.4014E-41)
            r0.put(r3, r4)
            java.util.UUID r3 = java.util.UUID.randomUUID()
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "session_id"
            r0.put(r4, r3)
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            java.lang.String r4 = "yyyy-MM-dd HH:mm:ss"
            java.util.Locale r5 = java.util.Locale.US
            r3.<init>(r4, r5)
            java.util.Date r4 = new java.util.Date
            r4.<init>(r1)
            java.lang.String r1 = r3.format(r4)
            java.lang.String r2 = "datetime"
            r0.put(r2, r1)
            r11.put(r0)
            java.lang.String r0 = "launch"
            r6.put(r0, r11)
            return r6
    }

    public static void c(com.bytedance.j.j.b r4) {
            com.bytedance.j.xt.up.c r4 = com.bytedance.j.xt.e.d()
            java.util.Map r4 = r4.b()
            java.lang.String r0 = "aid"
            if (r4 != 0) goto L12
            java.lang.Object r1 = r4.get(r0)
            if (r1 == 0) goto L52
        L12:
            org.json.JSONObject r1 = b(r4)     // Catch: java.lang.Throwable -> L52
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L52
            java.lang.String r2 = "UTF-8"
            byte[] r1 = r1.getBytes(r2)     // Catch: java.lang.Throwable -> L52
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
            java.lang.String r3 = com.bytedance.j.xt.ae.xt.k(r4)     // Catch: java.lang.Throwable -> L52
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L52
            java.lang.String r3 = "?device_platform=android&version_code=137&iid=iid&aid="
            r2.append(r3)     // Catch: java.lang.Throwable -> L52
            java.lang.Object r4 = r4.get(r0)     // Catch: java.lang.Throwable -> L52
            r2.append(r4)     // Catch: java.lang.Throwable -> L52
            com.bytedance.j.xt.a$g$a r4 = new com.bytedance.j.xt.a$g$a     // Catch: java.lang.Throwable -> L52
            r4.<init>()     // Catch: java.lang.Throwable -> L52
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L52
            com.bytedance.j.xt.a$g$a r4 = r4.a(r0)     // Catch: java.lang.Throwable -> L52
            r0 = 1
            com.bytedance.j.xt.a$g$a r4 = r4.b(r0)     // Catch: java.lang.Throwable -> L52
            com.bytedance.j.xt.a$g$a r4 = r4.c(r1)     // Catch: java.lang.Throwable -> L52
            com.bytedance.j.xt.a$g r4 = r4.d()     // Catch: java.lang.Throwable -> L52
            com.bytedance.j.xt.ae.xt.c(r4)     // Catch: java.lang.Throwable -> L52
        L52:
            return
    }

    private static void d(org.json.JSONObject r5) {
            com.bytedance.j.xt.up.c r0 = com.bytedance.j.xt.e.d()
            if (r0 == 0) goto L41
            if (r5 == 0) goto L41
            java.util.Map r0 = r0.f()
            if (r0 == 0) goto L41
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L3d
            r1.<init>()     // Catch: java.lang.Exception -> L3d
            java.util.Set r2 = r0.keySet()     // Catch: java.lang.Exception -> L3d
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> L3d
        L1b:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Exception -> L3d
            if (r3 == 0) goto L37
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Exception -> L3d
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L3d
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L3d
            if (r4 != 0) goto L1b
            java.lang.Object r4 = r0.get(r3)     // Catch: java.lang.Exception -> L3d
            if (r4 == 0) goto L1b
            r1.put(r3, r4)     // Catch: java.lang.Exception -> L3d
            goto L1b
        L37:
            java.lang.String r0 = "custom"
            r5.put(r0, r1)     // Catch: java.lang.Exception -> L3d
            return
        L3d:
            r5 = move-exception
            com.bytedance.j.xt.tl.i.c(r5)
        L41:
            return
    }
}
