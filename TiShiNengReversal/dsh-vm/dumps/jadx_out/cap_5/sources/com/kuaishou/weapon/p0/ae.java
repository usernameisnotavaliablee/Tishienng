package com.kuaishou.weapon.p0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class ae {
    public ae() {
            r0 = this;
            r0.<init>()
            return
    }

    public org.json.JSONObject a() {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L28
            r0.<init>()     // Catch: java.lang.Exception -> L28
            java.lang.String r1 = "/data"
            r2 = 1
            boolean r1 = r4.a(r1, r2)     // Catch: java.lang.Exception -> L28
            java.lang.String r3 = "0"
            r0.put(r3, r1)     // Catch: java.lang.Exception -> L28
            java.lang.String r1 = "/system/bin"
            boolean r1 = r4.a(r1, r2)     // Catch: java.lang.Exception -> L28
            java.lang.String r3 = "1"
            r0.put(r3, r1)     // Catch: java.lang.Exception -> L28
            java.lang.String r1 = "/system/lib"
            boolean r1 = r4.a(r1, r2)     // Catch: java.lang.Exception -> L28
            java.lang.String r2 = "2"
            r0.put(r2, r1)     // Catch: java.lang.Exception -> L28
            return r0
        L28:
            r0 = 0
            return r0
    }

    public boolean a(java.lang.String r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = java.io.File.separator
            r0.append(r1)
            java.lang.String r2 = "proc"
            r0.append(r2)
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            boolean r4 = r0.canWrite()
            return r4
    }

    public boolean a(java.lang.String r4, boolean r5) {
            r3 = this;
            java.lang.String r0 = ""
            if (r5 == 0) goto L2c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L53
            r0.<init>()     // Catch: java.lang.Throwable -> L53
            r0.append(r4)     // Catch: java.lang.Throwable -> L53
            java.lang.String r4 = "/-"
            r0.append(r4)     // Catch: java.lang.Throwable -> L53
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L53
            r0.append(r1)     // Catch: java.lang.Throwable -> L53
            java.lang.String r4 = r0.toString()     // Catch: java.lang.Throwable -> L53
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L53
            r0.<init>()     // Catch: java.lang.Throwable -> L53
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L53
            r0.append(r1)     // Catch: java.lang.Throwable -> L53
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L53
        L2c:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L53
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L53
            r1.exists()     // Catch: java.lang.Throwable -> L53
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L53
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L53
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Throwable -> L4c
            r4.write(r0)     // Catch: java.lang.Throwable -> L4c
            r4.flush()     // Catch: java.lang.Throwable -> L4c
            r4.close()     // Catch: java.lang.Throwable -> L4c
            if (r5 == 0) goto L4e
            r1.delete()     // Catch: java.lang.Throwable -> L4c
            goto L4e
        L4c:
            goto L54
        L4e:
            r4.close()     // Catch: java.lang.Exception -> L51
        L51:
            r4 = 1
            return r4
        L53:
            r4 = 0
        L54:
            if (r4 == 0) goto L59
            r4.close()     // Catch: java.lang.Exception -> L59
        L59:
            r4 = 0
            return r4
    }

    public org.json.JSONObject b() {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L33
            r0.<init>()     // Catch: java.lang.Exception -> L33
            java.lang.String r1 = "/sys"
            r2 = 1
            boolean r1 = r4.a(r1, r2)     // Catch: java.lang.Exception -> L33
            java.lang.String r3 = "0"
            r0.put(r3, r1)     // Catch: java.lang.Exception -> L33
            java.lang.String r1 = "/sbin"
            boolean r1 = r4.a(r1, r2)     // Catch: java.lang.Exception -> L33
            java.lang.String r3 = "1"
            r0.put(r3, r1)     // Catch: java.lang.Exception -> L33
            java.lang.String r1 = "/etc"
            boolean r1 = r4.a(r1, r2)     // Catch: java.lang.Exception -> L33
            java.lang.String r3 = "2"
            r0.put(r3, r1)     // Catch: java.lang.Exception -> L33
            java.lang.String r1 = "/dev"
            boolean r1 = r4.a(r1, r2)     // Catch: java.lang.Exception -> L33
            java.lang.String r2 = "3"
            r0.put(r2, r1)     // Catch: java.lang.Exception -> L33
            return r0
        L33:
            r0 = 0
            return r0
    }

    public boolean b(java.lang.String r2) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.a(r2, r0)
            return r2
    }
}
