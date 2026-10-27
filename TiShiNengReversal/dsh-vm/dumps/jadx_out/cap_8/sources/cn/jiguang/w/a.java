package cn.jiguang.w;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {
    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(android.content.Context r4) {
            boolean r0 = cn.jiguang.e.c.a(r4)
            java.lang.String r1 = "LogExternalManage"
            if (r0 != 0) goto L10
            java.lang.String r4 = "readLogs: log is not enabled"
            cn.jiguang.w.f.i(r1, r4)
            java.lang.String r4 = ""
            return r4
        L10:
            long r2 = cn.jiguang.e.c.b(r4)
            java.lang.String r4 = cn.jiguang.w.b.a(r4, r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "readLogs: logs len: "
            r0.append(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 == 0) goto L2a
            r2 = 0
            goto L2e
        L2a:
            int r2 = r4.length()
        L2e:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            cn.jiguang.w.f.c(r1, r0)
            return r4
    }

    public static void a(android.content.Context r3, android.os.Bundle r4) {
            if (r4 != 0) goto L3
            return
        L3:
            java.lang.String r0 = "enable"
            r1 = 0
            boolean r0 = r4.getBoolean(r0, r1)
            java.lang.String r2 = "upload"
            boolean r4 = r4.getBoolean(r2, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "enableSDKLocalLog: enable="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r2 = ", upload="
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "LogExternalManage"
            cn.jiguang.w.f.c(r2, r1)
            if (r0 == 0) goto L34
            a(r3, r4)
            return
        L34:
            b(r3)
            return
    }

    private static void a(android.content.Context r6, boolean r7) {
            java.lang.String r0 = "LogExternalManage"
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L60
            r1.<init>()     // Catch: java.lang.Throwable -> L60
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L60
            r2.<init>()     // Catch: java.lang.Throwable -> L60
            java.lang.String r3 = "log_enable"
            r4 = 1
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L60
            java.lang.String r3 = "log_print"
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L60
            java.lang.String r3 = "local_upload_enable"
            r2.put(r3, r7)     // Catch: java.lang.Throwable -> L60
            java.lang.String r3 = "expire"
            r5 = 7
            r2.put(r3, r5)     // Catch: java.lang.Throwable -> L60
            java.lang.String r3 = "content"
            r1.put(r3, r2)     // Catch: java.lang.Throwable -> L60
            cn.jiguang.w.d.a(r6)     // Catch: java.lang.Throwable -> L60
            cn.jiguang.d.a.a(r6, r1)     // Catch: java.lang.Throwable -> L60
            cn.jiguang.e.c.a(r6, r4)     // Catch: java.lang.Throwable -> L60
            cn.jiguang.e.c.b(r6, r7)     // Catch: java.lang.Throwable -> L60
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60
            r2.<init>()     // Catch: java.lang.Throwable -> L60
            java.lang.String r3 = "enableSDKLocalLog: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L60
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L60
            r2.append(r1)     // Catch: java.lang.Throwable -> L60
            java.lang.String r1 = ", isUpload="
            r2.append(r1)     // Catch: java.lang.Throwable -> L60
            r2.append(r7)     // Catch: java.lang.Throwable -> L60
            java.lang.String r7 = ", spLogEnable: "
            r2.append(r7)     // Catch: java.lang.Throwable -> L60
            boolean r6 = cn.jiguang.e.c.a(r6)     // Catch: java.lang.Throwable -> L60
            r2.append(r6)     // Catch: java.lang.Throwable -> L60
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Throwable -> L60
            cn.jiguang.w.f.c(r0, r6)     // Catch: java.lang.Throwable -> L60
            return
        L60:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "enableSDKLocalLog failed: "
            r7.append(r1)
            java.lang.String r6 = r6.getMessage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            cn.jiguang.w.f.l(r0, r6)
            return
    }

    private static void b(android.content.Context r5) {
            java.lang.String r0 = "LogExternalManage"
            boolean r1 = cn.jiguang.e.c.a(r5)     // Catch: java.lang.Throwable -> L4b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4b
            r2.<init>()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r3 = "isExternalLogEnabled: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L4b
            r2.append(r1)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L4b
            cn.jiguang.w.f.c(r0, r2)     // Catch: java.lang.Throwable -> L4b
            if (r1 == 0) goto L4d
            cn.jiguang.w.d.b(r5)     // Catch: java.lang.Throwable -> L4b
            r1 = 0
            cn.jiguang.e.c.a(r5, r1)     // Catch: java.lang.Throwable -> L4b
            boolean r2 = cn.jiguang.w.d.c(r5)     // Catch: java.lang.Throwable -> L4b
            if (r2 == 0) goto L4d
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L4b
            r2.<init>()     // Catch: java.lang.Throwable -> L4b
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L4b
            r3.<init>()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r4 = "log_enable"
            r3.put(r4, r1)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r4 = "log_print"
            r3.put(r4, r1)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r4 = "local_upload_enable"
            r3.put(r4, r1)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r1 = "content"
            r2.put(r1, r3)     // Catch: java.lang.Throwable -> L4b
            cn.jiguang.d.a.a(r5, r2)     // Catch: java.lang.Throwable -> L4b
            return
        L4b:
            r5 = move-exception
            goto L4e
        L4d:
            return
        L4e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "disableSDKLocalLog failed: "
            r1.append(r2)
            java.lang.String r5 = r5.getMessage()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            cn.jiguang.w.f.l(r0, r5)
            return
    }
}
