package com.yxcorp.kuaishou.addfp.android.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class d {
    private static volatile com.yxcorp.kuaishou.addfp.android.a.d e;
    private com.yxcorp.kuaishou.addfp.android.a.e a;
    private java.util.concurrent.ConcurrentHashMap b;
    private android.content.Context c;
    private int d;

    private d(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.a = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r1 = 10
            r0.<init>(r1)
            r2.b = r0
            r0 = 0
            r2.d = r0
            r2.c = r3     // Catch: java.lang.Throwable -> L2b
            com.yxcorp.kuaishou.addfp.android.a.e r0 = new com.yxcorp.kuaishou.addfp.android.a.e     // Catch: java.lang.Throwable -> L2b
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L2b
            r2.a = r0     // Catch: java.lang.Throwable -> L2b
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L2b
            r0 = 30
            if (r3 < r0) goto L2b
            android.content.Context r3 = r2.c     // Catch: java.lang.Throwable -> L2b
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()     // Catch: java.lang.Throwable -> L2b
            int r3 = r3.targetSdkVersion     // Catch: java.lang.Throwable -> L2b
            r2.d = r3     // Catch: java.lang.Throwable -> L2b
        L2b:
            return
    }

    public static com.yxcorp.kuaishou.addfp.android.a.d a(android.content.Context r2) {
            com.yxcorp.kuaishou.addfp.android.a.d r0 = com.yxcorp.kuaishou.addfp.android.a.d.e
            if (r0 != 0) goto L19
            java.lang.Class<com.yxcorp.kuaishou.addfp.android.a.d> r0 = com.yxcorp.kuaishou.addfp.android.a.d.class
            monitor-enter(r0)
            com.yxcorp.kuaishou.addfp.android.a.d r1 = com.yxcorp.kuaishou.addfp.android.a.d.e     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.yxcorp.kuaishou.addfp.android.a.d r1 = new com.yxcorp.kuaishou.addfp.android.a.d     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
            com.yxcorp.kuaishou.addfp.android.a.d.e = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r2 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r2
        L19:
            com.yxcorp.kuaishou.addfp.android.a.d r2 = com.yxcorp.kuaishou.addfp.android.a.d.e
            return r2
    }

    private java.lang.String a(java.util.HashMap r4) {
            r3 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L2b
            r0.<init>()     // Catch: java.lang.Throwable -> L2b
            java.io.ObjectOutputStream r1 = new java.io.ObjectOutputStream     // Catch: java.lang.Throwable -> L2b
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L2b
            r1.writeObject(r4)     // Catch: java.lang.Throwable -> L29
            byte[] r4 = r0.toByteArray()     // Catch: java.lang.Throwable -> L29
            java.lang.String r0 = "20212102sjcudiab"
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Throwable -> L29
            byte[] r4 = com.yxcorp.kuaishou.addfp.android.b.b.c(r4, r0)     // Catch: java.lang.Throwable -> L29
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L29
            r2 = 0
            byte[] r4 = android.util.Base64.encode(r4, r2)     // Catch: java.lang.Throwable -> L29
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L29
            r1.close()     // Catch: java.io.IOException -> L28
        L28:
            return r0
        L29:
            goto L2c
        L2b:
            r1 = 0
        L2c:
            if (r1 == 0) goto L31
            r1.close()     // Catch: java.io.IOException -> L31
        L31:
            java.lang.String r4 = ""
            return r4
    }

    public static void a(android.content.Context r4, java.lang.String r5) {
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L7
            goto L3f
        L7:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L39
            r1 = 0
            java.io.File r4 = com.yxcorp.kuaishou.addfp.android.b.b.a(r4, r1)     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L39
            java.lang.String r3 = "Lm91a2R0ZnQ="
            byte[] r3 = android.util.Base64.decode(r3, r1)     // Catch: java.lang.Throwable -> L39
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L39
            r0.<init>(r4, r2)     // Catch: java.lang.Throwable -> L39
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = r0.getParent()     // Catch: java.lang.Throwable -> L39
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L39
            r4.mkdirs()     // Catch: java.lang.Throwable -> L39
            java.io.FileWriter r4 = new java.io.FileWriter     // Catch: java.lang.Throwable -> L39
            r4.<init>(r0, r1)     // Catch: java.lang.Throwable -> L39
            r4.write(r5)     // Catch: java.lang.Throwable -> L37
            r4.flush()     // Catch: java.lang.Throwable -> L37
            r4.close()     // Catch: java.io.IOException -> L3f
            return
        L37:
            goto L3a
        L39:
            r4 = 0
        L3a:
            if (r4 == 0) goto L3f
            r4.close()     // Catch: java.io.IOException -> L3f
        L3f:
            return
    }

    public synchronized android.util.Pair a() {
            r7 = this;
            monitor-enter(r7)
            r0 = 0
            java.util.concurrent.ConcurrentHashMap r1 = r7.b     // Catch: java.lang.Throwable -> Lc7
            if (r1 == 0) goto L2d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc7
            r1.<init>()     // Catch: java.lang.Throwable -> Lc7
            java.util.concurrent.ConcurrentHashMap r2 = r7.b     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r3 = "cache_e"
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> Lc7
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> Lc7
            if (r2 != 0) goto L2d
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lc7
            android.util.Pair r1 = android.util.Pair.create(r2, r1)     // Catch: java.lang.Throwable -> Lc7
            java.util.concurrent.ConcurrentHashMap r2 = r7.b     // Catch: java.lang.Throwable -> Lc7
            android.util.Pair r0 = android.util.Pair.create(r1, r2)     // Catch: java.lang.Throwable -> Lc7
            monitor-exit(r7)
            return r0
        L2d:
            java.util.concurrent.ConcurrentHashMap r1 = r7.b     // Catch: java.lang.Throwable -> Lc7
            r1.clear()     // Catch: java.lang.Throwable -> Lc7
            com.yxcorp.kuaishou.addfp.android.a.e r1 = r7.a     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r1 = r1.b()     // Catch: java.lang.Throwable -> Lc7
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Lc7
            if (r2 != 0) goto L96
            r2 = 0
            byte[] r2 = android.util.Base64.decode(r1, r2)     // Catch: java.lang.Throwable -> L44
            goto L46
        L44:
            r2 = r0
        L46:
            if (r2 != 0) goto L4e
            r3 = 8
            byte[] r2 = android.util.Base64.decode(r1, r3)     // Catch: java.lang.Throwable -> L4e
        L4e:
            java.lang.String r1 = "20212102sjcudiab"
            byte[] r1 = r1.getBytes()     // Catch: java.lang.Throwable -> L96
            byte[] r1 = com.yxcorp.kuaishou.addfp.android.b.b.b(r2, r1)     // Catch: java.lang.Throwable -> L96
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L96
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L96
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L96
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L96
            java.util.concurrent.ConcurrentHashMap r1 = r7.b     // Catch: java.lang.Throwable -> L96
            java.lang.String r3 = "cache_e"
            java.lang.String r4 = "cache_e"
            java.lang.String r5 = ""
            java.lang.String r4 = r2.optString(r4, r5)     // Catch: java.lang.Throwable -> L96
            r1.put(r3, r4)     // Catch: java.lang.Throwable -> L96
            java.util.concurrent.ConcurrentHashMap r1 = r7.b     // Catch: java.lang.Throwable -> L96
            java.lang.String r3 = "cache_m"
            java.lang.String r4 = "cache_m"
            java.lang.String r5 = ""
            java.lang.String r4 = r2.optString(r4, r5)     // Catch: java.lang.Throwable -> L96
            r1.put(r3, r4)     // Catch: java.lang.Throwable -> L96
            java.util.concurrent.ConcurrentHashMap r1 = r7.b     // Catch: java.lang.Throwable -> L96
            java.lang.String r3 = "c_time"
            java.lang.String r4 = "c_time"
            r5 = 0
            long r4 = r2.optLong(r4, r5)     // Catch: java.lang.Throwable -> L96
            java.lang.String r2 = java.lang.Long.toString(r4)     // Catch: java.lang.Throwable -> L96
            r1.put(r3, r2)     // Catch: java.lang.Throwable -> L96
            goto L96
        L94:
            r0 = move-exception
            goto Ld5
        L96:
            java.util.concurrent.ConcurrentHashMap r1 = r7.b     // Catch: java.lang.Throwable -> Lc7
            if (r1 == 0) goto Lc7
            int r1 = r1.size()     // Catch: java.lang.Throwable -> Lc7
            if (r1 <= 0) goto Lc7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc7
            r1.<init>()     // Catch: java.lang.Throwable -> Lc7
            java.util.concurrent.ConcurrentHashMap r2 = r7.b     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r3 = "cache_e"
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> Lc7
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> Lc7
            if (r2 != 0) goto Lc7
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lc7
            android.util.Pair r1 = android.util.Pair.create(r2, r1)     // Catch: java.lang.Throwable -> Lc7
            java.util.concurrent.ConcurrentHashMap r2 = r7.b     // Catch: java.lang.Throwable -> Lc7
            android.util.Pair r0 = android.util.Pair.create(r1, r2)     // Catch: java.lang.Throwable -> Lc7
            monitor-exit(r7)
            return r0
        Lc7:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L94
            java.lang.String r2 = "8"
            android.util.Pair r1 = android.util.Pair.create(r1, r2)     // Catch: java.lang.Throwable -> L94
            android.util.Pair r0 = android.util.Pair.create(r1, r0)     // Catch: java.lang.Throwable -> L94
            monitor-exit(r7)
            return r0
        Ld5:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L94
            throw r0
    }

    public java.lang.String a(java.lang.String r5) {
            r4 = this;
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L40
            android.content.Context r1 = r4.c     // Catch: java.lang.Throwable -> L40
            r2 = 0
            java.io.File r1 = com.yxcorp.kuaishou.addfp.android.b.b.a(r1, r2)     // Catch: java.lang.Throwable -> L40
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L40
            byte[] r5 = android.util.Base64.decode(r5, r2)     // Catch: java.lang.Throwable -> L40
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L40
            r0.<init>(r1, r3)     // Catch: java.lang.Throwable -> L40
            boolean r5 = r0.exists()     // Catch: java.lang.Throwable -> L40
            if (r5 == 0) goto L40
            java.io.FileReader r5 = new java.io.FileReader     // Catch: java.lang.Throwable -> L40
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L40
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L40
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L40
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40
            r5.<init>()     // Catch: java.lang.Throwable -> L40
        L2a:
            java.lang.String r1 = r0.readLine()     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L34
            r5.append(r1)     // Catch: java.lang.Throwable -> L40
            goto L2a
        L34:
            r0.close()     // Catch: java.lang.Throwable -> L40
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L40
            java.lang.String r5 = r5.trim()     // Catch: java.lang.Throwable -> L40
            return r5
        L40:
            java.lang.String r5 = ""
            return r5
    }

    public synchronized void a(java.lang.String r7, java.lang.String r8) {
            r6 = this;
            monitor-enter(r6)
            r0 = 0
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L67
            java.util.concurrent.ConcurrentHashMap r3 = r6.b     // Catch: java.lang.Throwable -> L67
            java.lang.String r4 = "c_time"
            java.lang.String r5 = java.lang.Long.toString(r1)     // Catch: java.lang.Throwable -> L67
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> L67
            java.util.concurrent.ConcurrentHashMap r3 = r6.b     // Catch: java.lang.Throwable -> L67
            java.lang.String r4 = "cache_e"
            r3.put(r4, r7)     // Catch: java.lang.Throwable -> L67
            java.util.concurrent.ConcurrentHashMap r3 = r6.b     // Catch: java.lang.Throwable -> L67
            java.lang.String r4 = "cache_m"
            r3.put(r4, r8)     // Catch: java.lang.Throwable -> L67
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L67
            r3.<init>()     // Catch: java.lang.Throwable -> L67
            java.lang.String r4 = "c_time"
            r3.put(r4, r1)     // Catch: java.lang.Throwable -> L67
            java.lang.String r1 = "cache_e"
            r3.put(r1, r7)     // Catch: java.lang.Throwable -> L67
            java.lang.String r1 = "cache_m"
            r3.put(r1, r8)     // Catch: java.lang.Throwable -> L67
            java.lang.String r8 = r3.toString()     // Catch: java.lang.Throwable -> L67
            byte[] r8 = r8.getBytes()     // Catch: java.lang.Throwable -> L67
            java.lang.String r1 = "20212102sjcudiab"
            byte[] r1 = r1.getBytes()     // Catch: java.lang.Throwable -> L67
            byte[] r8 = com.yxcorp.kuaishou.addfp.android.b.b.c(r8, r1)     // Catch: java.lang.Throwable -> L67
            r1 = 0
            byte[] r1 = android.util.Base64.encode(r8, r1)     // Catch: java.lang.Throwable -> L4b
            goto L4d
        L4b:
            r1 = r0
        L4d:
            if (r1 != 0) goto L57
            r2 = 8
            byte[] r1 = android.util.Base64.encode(r8, r2)     // Catch: java.lang.Throwable -> L56
            goto L57
        L56:
        L57:
            if (r1 == 0) goto L67
            java.lang.String r8 = new java.lang.String     // Catch: java.lang.Throwable -> L67
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L67
            com.yxcorp.kuaishou.addfp.android.a.e r1 = r6.a     // Catch: java.lang.Throwable -> L67
            r1.a(r8)     // Catch: java.lang.Throwable -> L67
            goto L67
        L64:
            r7 = move-exception
            goto Lf5
        L67:
            android.content.Context r8 = r6.c     // Catch: java.lang.Throwable -> Lf7
            java.lang.String r1 = "k_w_o_d_out_dtt"
            java.lang.String r8 = com.yxcorp.kuaishou.addfp.c.a.a.a(r8, r1)     // Catch: java.lang.Throwable -> Lf7
            boolean r1 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> Lf7
            if (r1 == 0) goto L8b
            android.content.Context r1 = r6.c     // Catch: java.lang.Throwable -> Lf7
            java.lang.String r2 = "android.permission.READ_EXTERNAL_STORAGE"
            java.lang.String r3 = "android.permission.WRITE_EXTERNAL_STORAGE"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}     // Catch: java.lang.Throwable -> Lf7
            boolean r1 = com.yxcorp.kuaishou.addfp.android.b.f.a(r1, r2)     // Catch: java.lang.Throwable -> Lf7
            if (r1 == 0) goto L8b
            java.lang.String r8 = "Lm91a2R0ZnQ="
            java.lang.String r8 = r6.a(r8)     // Catch: java.lang.Throwable -> Lf7
        L8b:
            boolean r1 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> Lf7
            if (r1 != 0) goto Lb3
            java.util.LinkedHashMap r0 = r6.b(r8)     // Catch: java.lang.Throwable -> Lf7
            if (r0 == 0) goto Lb3
            com.yxcorp.kuaishou.addfp.android.a.c r8 = com.yxcorp.kuaishou.addfp.android.a.b.a     // Catch: java.lang.Throwable -> Lf7
            java.lang.String r1 = r8.a()     // Catch: java.lang.Throwable -> Lf7
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Lf7
            if (r2 != 0) goto Lb3
            boolean r2 = r0.containsKey(r1)     // Catch: java.lang.Throwable -> Lf7
            if (r2 == 0) goto Lac
            r0.remove(r1)     // Catch: java.lang.Throwable -> Lf7
        Lac:
            java.lang.String r8 = r8.a()     // Catch: java.lang.Throwable -> Lf7
            r0.put(r8, r7)     // Catch: java.lang.Throwable -> Lf7
        Lb3:
            if (r0 == 0) goto Lbb
            int r8 = r0.size()     // Catch: java.lang.Throwable -> Lf7
            if (r8 != 0) goto Lc9
        Lbb:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> Lf7
            r0.<init>()     // Catch: java.lang.Throwable -> Lf7
            com.yxcorp.kuaishou.addfp.android.a.c r8 = com.yxcorp.kuaishou.addfp.android.a.b.a     // Catch: java.lang.Throwable -> Lf7
            java.lang.String r8 = r8.a()     // Catch: java.lang.Throwable -> Lf7
            r0.put(r8, r7)     // Catch: java.lang.Throwable -> Lf7
        Lc9:
            java.lang.String r7 = r6.a(r0)     // Catch: java.lang.Throwable -> Lf7
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> Lf7
            if (r8 != 0) goto Lf7
            android.content.Context r8 = r6.c     // Catch: java.lang.Throwable -> Lf7
            java.lang.String r0 = "k_w_o_d_out_dtt"
            android.content.ContentResolver r8 = r8.getContentResolver()     // Catch: java.lang.Throwable -> Lde
            android.provider.Settings.System.putString(r8, r0, r7)     // Catch: java.lang.Throwable -> Lde
        Lde:
            android.content.Context r8 = r6.c     // Catch: java.lang.Throwable -> Lf7
            java.lang.String r0 = "android.permission.READ_EXTERNAL_STORAGE"
            java.lang.String r1 = "android.permission.WRITE_EXTERNAL_STORAGE"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}     // Catch: java.lang.Throwable -> Lf7
            boolean r8 = com.yxcorp.kuaishou.addfp.android.b.f.a(r8, r0)     // Catch: java.lang.Throwable -> Lf7
            if (r8 == 0) goto Lf7
            android.content.Context r8 = r6.c     // Catch: java.lang.Throwable -> Lf7
            a(r8, r7)     // Catch: java.lang.Throwable -> Lf7
            monitor-exit(r6)
            return
        Lf5:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L64
            throw r7
        Lf7:
            monitor-exit(r6)
            return
    }

    public java.util.LinkedHashMap b(java.lang.String r3) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L38
            if (r0 != 0) goto L3e
            byte[] r3 = r3.getBytes()     // Catch: java.lang.Throwable -> L38
            r0 = 0
            byte[] r3 = android.util.Base64.decode(r3, r0)     // Catch: java.lang.Throwable -> L38
            java.lang.String r0 = "20212102sjcudiab"
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Throwable -> L38
            byte[] r3 = com.yxcorp.kuaishou.addfp.android.b.b.b(r3, r0)     // Catch: java.lang.Throwable -> L38
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L38
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L38
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L38
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r3.readObject()     // Catch: java.lang.Throwable -> L35
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch: java.lang.Throwable -> L35
            r3.close()     // Catch: java.io.IOException -> L34
        L34:
            return r0
        L35:
            r1 = r3
            goto L39
        L38:
        L39:
            if (r1 == 0) goto L3e
            r1.close()     // Catch: java.io.IOException -> L3e
        L3e:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            return r3
    }

    public boolean b() {
            r2 = this;
            int r0 = r2.d
            r1 = 30
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }
}
