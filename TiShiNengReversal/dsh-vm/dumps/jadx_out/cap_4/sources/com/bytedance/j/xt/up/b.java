package com.bytedance.j.xt.up;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class b {
    private android.content.Context a;

    class a implements java.io.FilenameFilter {
        final /* synthetic */ com.bytedance.j.xt.up.b a;

        a(com.bytedance.j.xt.up.b r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.io.FilenameFilter
        public boolean accept(java.io.File r1, java.lang.String r2) {
                r0 = this;
                if (r2 == 0) goto Lc
                java.lang.String r1 = ".npth"
                boolean r1 = r2.endsWith(r1)
                if (r1 == 0) goto Lc
                r1 = 1
                return r1
            Lc:
                r1 = 0
                return r1
        }
    }

    public b(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    private com.bytedance.j.xt.cw a(java.lang.String r3, org.json.JSONObject r4) {
            r2 = this;
            r0 = 0
            if (r4 != 0) goto La
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 == 0) goto La
            return r0
        La:
            java.lang.String r1 = "launch_"
            boolean r1 = r3.startsWith(r1)
            if (r1 == 0) goto L15
            com.bytedance.j.xt.cw r3 = com.bytedance.j.xt.cw.j
            return r3
        L15:
            java.lang.String r1 = "anr_"
            boolean r1 = r3.startsWith(r1)
            if (r1 == 0) goto L20
            com.bytedance.j.xt.cw r3 = com.bytedance.j.xt.cw.f2132r
            return r3
        L20:
            java.lang.String r1 = "java_"
            boolean r3 = r3.startsWith(r1)
            if (r3 == 0) goto L3f
            java.lang.String r3 = "is_dart"
            int r3 = r4.optInt(r3)
            r1 = 1
            if (r3 != r1) goto L34
            com.bytedance.j.xt.cw r3 = com.bytedance.j.xt.cw.ae
            return r3
        L34:
            java.lang.String r3 = "isJava"
            int r3 = r4.optInt(r3)
            if (r3 != r1) goto L3f
            com.bytedance.j.xt.cw r3 = com.bytedance.j.xt.cw.xt
            return r3
        L3f:
            return r0
    }

    private void b() {
            r7 = this;
            java.lang.String r0 = "history_time"
            android.content.Context r1 = r7.a     // Catch: java.lang.Exception -> L27
            java.lang.String r2 = "npth"
            r3 = 0
            android.content.SharedPreferences r1 = com.bytedance.sdk.openadsdk.api.plugin.xt.xt(r1, r2, r3)     // Catch: java.lang.Exception -> L27
            r2 = -1
            long r2 = r1.getLong(r0, r2)     // Catch: java.lang.Exception -> L27
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L29
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch: java.lang.Exception -> L27
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L27
            android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r2)     // Catch: java.lang.Exception -> L27
            r0.apply()     // Catch: java.lang.Exception -> L27
            return
        L27:
            r0 = move-exception
            goto L4e
        L29:
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L27
            long r4 = r4 - r2
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 <= 0) goto L4d
            android.content.Context r2 = r7.a     // Catch: java.lang.Exception -> L27
            java.io.File r2 = com.bytedance.j.xt.tl.l.d(r2)     // Catch: java.lang.Exception -> L27
            com.bytedance.j.xt.tl.k.g(r2)     // Catch: java.lang.Exception -> L27
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch: java.lang.Exception -> L27
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L27
            android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r2)     // Catch: java.lang.Exception -> L27
            r0.apply()     // Catch: java.lang.Exception -> L27
        L4d:
            return
        L4e:
            com.bytedance.sdk.component.utils.vl.j(r0)
            return
    }

    @androidx.annotation.Nullable
    private java.io.File[] d(java.io.File r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = r2.exists()
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L13
            java.io.File[] r2 = r2.listFiles()
            return r2
        L13:
            com.bytedance.j.xt.up.b$a r3 = new com.bytedance.j.xt.up.b$a
            r3.<init>(r1)
            java.io.File[] r2 = r2.listFiles(r3)
            return r2
    }

    private void e() {
            r8 = this;
            android.content.Context r0 = r8.a
            java.io.File r0 = com.bytedance.j.xt.tl.l.b(r0)
            java.lang.String r1 = ".npth"
            java.io.File[] r0 = r8.d(r0, r1)
            if (r0 != 0) goto L10
            goto L8d
        L10:
            java.util.Comparator r1 = java.util.Collections.reverseOrder()
            java.util.Arrays.sort(r0, r1)
            r1 = 0
        L18:
            int r2 = r0.length
            if (r1 >= r2) goto L8d
            r2 = 50
            if (r1 >= r2) goto L8d
            r2 = r0[r1]
            x0.a r3 = x0.a.a()     // Catch: java.lang.Exception -> L33
            java.lang.String r4 = r2.getAbsolutePath()     // Catch: java.lang.Exception -> L33
            boolean r3 = r3.d(r4)     // Catch: java.lang.Exception -> L33
            if (r3 == 0) goto L35
            com.bytedance.j.xt.tl.k.g(r2)     // Catch: java.lang.Exception -> L33
            goto L8a
        L33:
            r2 = move-exception
            goto L87
        L35:
            java.lang.String r3 = r2.getAbsolutePath()     // Catch: java.lang.Exception -> L33
            com.bytedance.j.xt.cw.a r3 = com.bytedance.j.xt.tl.k.a(r3)     // Catch: java.lang.Exception -> L33
            if (r3 == 0) goto L8a
            org.json.JSONObject r4 = r3.f()     // Catch: java.lang.Exception -> L33
            if (r4 == 0) goto L8a
            org.json.JSONObject r4 = r3.f()     // Catch: java.lang.Exception -> L33
            java.lang.String r5 = r2.getName()     // Catch: java.lang.Exception -> L33
            r8.a(r5, r4)     // Catch: java.lang.Exception -> L33
            org.json.JSONObject r5 = r3.f()     // Catch: java.lang.Exception -> L33
            java.lang.String r6 = "upload_scene"
            java.lang.String r7 = "launch_scan"
            r5.put(r6, r7)     // Catch: java.lang.Exception -> L33
            java.lang.String r5 = r3.b()     // Catch: java.lang.Exception -> L33
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L33
            boolean r3 = r3.a()     // Catch: java.lang.Exception -> L33
            com.bytedance.j.xt.a$e r3 = com.bytedance.j.xt.ae.xt.e(r5, r4, r3)     // Catch: java.lang.Exception -> L33
            boolean r3 = r3.a()     // Catch: java.lang.Exception -> L33
            if (r3 == 0) goto L8a
            boolean r3 = com.bytedance.j.xt.tl.k.g(r2)     // Catch: java.lang.Exception -> L33
            if (r3 != 0) goto L8a
            x0.a r3 = x0.a.a()     // Catch: java.lang.Exception -> L33
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.Exception -> L33
            y0.a r2 = y0.a.a(r2)     // Catch: java.lang.Exception -> L33
            r3.c(r2)     // Catch: java.lang.Exception -> L33
            goto L8a
        L87:
            com.bytedance.j.xt.tl.i.c(r2)
        L8a:
            int r1 = r1 + 1
            goto L18
        L8d:
            return
    }

    public void c(boolean r1) {
            r0 = this;
            r0.b()
            if (r1 == 0) goto L8
            r0.e()
        L8:
            return
    }
}
