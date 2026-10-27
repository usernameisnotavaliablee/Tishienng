package com.baidu.liantian.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class k {
    private static final java.lang.String a = null;

    /* renamed from: b, reason: collision with root package name */
    private static final java.lang.String f5920b = null;

    /* renamed from: c, reason: collision with root package name */
    private static final java.lang.String f5921c = null;

    /* renamed from: d, reason: collision with root package name */
    private static com.baidu.liantian.b.k.a f5922d;

    /* renamed from: e, reason: collision with root package name */
    private android.content.Context f5923e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a {
        public java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        public java.lang.String f5924b;

        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ a(byte r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static com.baidu.liantian.b.k.a a(java.lang.String r3) {
                boolean r0 = android.text.TextUtils.isEmpty(r3)
                r1 = 0
                if (r0 == 0) goto L8
                return r1
            L8:
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2d
                r0.<init>(r3)     // Catch: java.lang.Throwable -> L2d
                java.lang.String r3 = "deviceid"
                java.lang.String r3 = r0.getString(r3)     // Catch: java.lang.Throwable -> L2d
                java.lang.String r2 = "imei"
                java.lang.String r0 = r0.getString(r2)     // Catch: java.lang.Throwable -> L2d
                boolean r2 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L2d
                if (r2 != 0) goto L2c
                if (r0 != 0) goto L22
                goto L2c
            L22:
                com.baidu.liantian.b.k$a r2 = new com.baidu.liantian.b.k$a     // Catch: java.lang.Throwable -> L2d
                r2.<init>()     // Catch: java.lang.Throwable -> L2d
                r2.a = r3     // Catch: java.lang.Throwable -> L2d
                r2.f5924b = r0     // Catch: java.lang.Throwable -> L2d
                return r2
            L2c:
                return r1
            L2d:
                com.baidu.liantian.b.k.a()
                return r1
        }

        public final java.lang.String a() {
                r3 = this;
                java.lang.String r0 = r3.f5924b     // Catch: java.lang.Throwable -> L2e
                boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L2e
                if (r1 == 0) goto La
                java.lang.String r0 = "0"
            La:
                java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L2e
                r1.<init>(r0)     // Catch: java.lang.Throwable -> L2e
                java.lang.StringBuffer r0 = r1.reverse()     // Catch: java.lang.Throwable -> L2e
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L2e
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
                r1.<init>()     // Catch: java.lang.Throwable -> L2e
                java.lang.String r2 = r3.a     // Catch: java.lang.Throwable -> L2e
                r1.append(r2)     // Catch: java.lang.Throwable -> L2e
                java.lang.String r2 = "|"
                r1.append(r2)     // Catch: java.lang.Throwable -> L2e
                r1.append(r0)     // Catch: java.lang.Throwable -> L2e
                java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L2e
                return r0
            L2e:
                com.baidu.liantian.b.k.a()
                r0 = 0
                return r0
        }
    }

    static {
            java.lang.String r0 = new java.lang.String
            r1 = 12
            byte[] r2 = new byte[r1]
            r2 = {x0034: FILL_ARRAY_DATA , data: [77, 122, 65, 121, 77, 84, 73, 120, 77, 68, 73, 61} // fill-array
            byte[] r2 = com.baidu.liantian.b.c.a(r2)
            r0.<init>(r2)
            com.baidu.liantian.b.k.a = r0
            java.lang.String r2 = new java.lang.String
            byte[] r1 = new byte[r1]
            r1 = {x003e: FILL_ARRAY_DATA , data: [90, 71, 108, 106, 100, 87, 82, 112, 89, 87, 73, 61} // fill-array
            byte[] r1 = com.baidu.liantian.b.c.a(r1)
            r2.<init>(r1)
            com.baidu.liantian.b.k.f5920b = r2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.baidu.liantian.b.k.f5921c = r0
            return
    }

    private k(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.f5923e = r1
            return
    }

    public static java.lang.String a(android.content.Context r0) {
            com.baidu.liantian.b.k$a r0 = b(r0)
            if (r0 == 0) goto Lb
            java.lang.String r0 = r0.a()
            return r0
        Lb:
            r0 = 0
            return r0
    }

    private static java.lang.String a(java.io.File r5) {
            r0 = 0
            java.io.FileReader r1 = new java.io.FileReader     // Catch: java.lang.Throwable -> L24
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L24
            r5 = 8192(0x2000, float:1.148E-41)
            char[] r5 = new char[r5]     // Catch: java.lang.Throwable -> L1a
            java.io.CharArrayWriter r2 = new java.io.CharArrayWriter     // Catch: java.lang.Throwable -> L1a
            r2.<init>()     // Catch: java.lang.Throwable -> L1a
        Lf:
            int r3 = r1.read(r5)     // Catch: java.lang.Throwable -> L1a
            if (r3 <= 0) goto L1c
            r4 = 0
            r2.write(r5, r4, r3)     // Catch: java.lang.Throwable -> L1a
            goto Lf
        L1a:
            goto L26
        L1c:
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> L1a
            r1.close()     // Catch: java.lang.Throwable -> L23
        L23:
            return r5
        L24:
            r1 = r0
        L26:
            if (r1 == 0) goto L2b
            r1.close()     // Catch: java.lang.Throwable -> L2b
        L2b:
            return r0
    }

    private java.lang.String a(java.lang.String r2) {
            r1 = this;
            android.content.Context r0 = r1.f5923e     // Catch: java.lang.Throwable -> Lb
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Throwable -> Lb
            java.lang.String r2 = android.provider.Settings.System.getString(r0, r2)     // Catch: java.lang.Throwable -> Lb
            return r2
        Lb:
            r2 = 0
            return r2
    }

    static /* synthetic */ void a() {
            return
    }

    private com.baidu.liantian.b.k.a b() {
            r2 = this;
            java.lang.String r0 = "com.baidu.deviceid.v2"
            java.lang.String r0 = r2.a(r0)     // Catch: java.lang.Throwable -> L34
            java.lang.String r0 = d(r0)     // Catch: java.lang.Throwable -> L34
            com.baidu.liantian.b.k$a r0 = com.baidu.liantian.b.k.a.a(r0)     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L11
            return r0
        L11:
            java.lang.String r1 = "android.permission.READ_EXTERNAL_STORAGE"
            boolean r1 = r2.e(r1)     // Catch: java.lang.Throwable -> L35
            if (r1 == 0) goto L1d
            com.baidu.liantian.b.k$a r0 = c()     // Catch: java.lang.Throwable -> L35
        L1d:
            if (r0 == 0) goto L20
            return r0
        L20:
            com.baidu.liantian.b.k$a r0 = r2.d()     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L27
            return r0
        L27:
            if (r1 == 0) goto L33
            java.lang.String r1 = ""
            java.lang.String r1 = r2.c(r1)     // Catch: java.lang.Throwable -> L35
            com.baidu.liantian.b.k$a r0 = b(r1)     // Catch: java.lang.Throwable -> L35
        L33:
            return r0
        L34:
            r0 = 0
        L35:
            return r0
    }

    private static com.baidu.liantian.b.k.a b(android.content.Context r2) {
            com.baidu.liantian.b.k$a r0 = com.baidu.liantian.b.k.f5922d
            if (r0 != 0) goto L1d
            java.lang.Class<com.baidu.liantian.b.k$a> r0 = com.baidu.liantian.b.k.a.class
            monitor-enter(r0)
            com.baidu.liantian.b.k$a r1 = com.baidu.liantian.b.k.f5922d     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L19
            com.baidu.liantian.b.k r1 = new com.baidu.liantian.b.k     // Catch: java.lang.Throwable -> L17
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L17
            com.baidu.liantian.b.k$a r2 = r1.b()     // Catch: java.lang.Throwable -> L17
            com.baidu.liantian.b.k.f5922d = r2     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r2 = move-exception
            goto L1b
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            goto L1d
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r2
        L1d:
            com.baidu.liantian.b.k$a r2 = com.baidu.liantian.b.k.f5922d
            return r2
    }

    private static com.baidu.liantian.b.k.a b(java.lang.String r10) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            r2 = 0
            r3 = 1
            if (r0 >= r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            r1 = 0
            if (r0 == 0) goto L15
            boolean r4 = android.text.TextUtils.isEmpty(r10)
            if (r4 == 0) goto L15
            return r1
        L15:
            java.lang.String r4 = ""
            java.io.File r5 = new java.io.File
            java.io.File r6 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r7 = "baidu/.cuid"
            r5.<init>(r6, r7)
            boolean r6 = r5.exists()
            if (r6 != 0) goto L33
            java.io.File r5 = new java.io.File
            java.io.File r6 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r7 = "backups/.SystemConfig/.cuid"
            r5.<init>(r6, r7)
        L33:
            java.io.FileReader r6 = new java.io.FileReader     // Catch: java.lang.Throwable -> L9f
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L9f
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L9c
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L9c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L91
            r7.<init>()     // Catch: java.lang.Throwable -> L91
        L42:
            java.lang.String r8 = r5.readLine()     // Catch: java.lang.Throwable -> L91
            if (r8 == 0) goto L51
            r7.append(r8)     // Catch: java.lang.Throwable -> L91
            java.lang.String r8 = "\r\n"
            r7.append(r8)     // Catch: java.lang.Throwable -> L91
            goto L42
        L51:
            r5.close()     // Catch: java.lang.Throwable -> L91
            java.lang.String r8 = new java.lang.String     // Catch: java.lang.Throwable -> L91
            java.lang.String r9 = com.baidu.liantian.b.k.f5921c     // Catch: java.lang.Throwable -> L91
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L91
            byte[] r7 = r7.getBytes()     // Catch: java.lang.Throwable -> L91
            byte[] r7 = com.baidu.liantian.b.c.a(r7)     // Catch: java.lang.Throwable -> L91
            byte[] r7 = com.baidu.liantian.b.a.a(r9, r9, r7)     // Catch: java.lang.Throwable -> L91
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L91
            java.lang.String r7 = "="
            java.lang.String[] r7 = r8.split(r7)     // Catch: java.lang.Throwable -> L91
            if (r7 == 0) goto L93
            int r8 = r7.length     // Catch: java.lang.Throwable -> L91
            r9 = 2
            if (r8 != r9) goto L93
            if (r0 == 0) goto L84
            r8 = r7[r2]     // Catch: java.lang.Throwable -> L91
            boolean r8 = r10.equals(r8)     // Catch: java.lang.Throwable -> L91
            if (r8 == 0) goto L84
            r4 = r7[r3]     // Catch: java.lang.Throwable -> L91
            goto L93
        L84:
            if (r0 != 0) goto L93
            boolean r0 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> L91
            if (r0 == 0) goto L8e
            r10 = r7[r3]     // Catch: java.lang.Throwable -> L91
        L8e:
            r4 = r7[r3]     // Catch: java.lang.Throwable -> L91
            goto L93
        L91:
            goto La2
        L93:
            r5.close()     // Catch: java.lang.Throwable -> L9a
        L96:
            r6.close()     // Catch: java.lang.Throwable -> L9a
            goto Laa
        L9a:
            goto Laa
        L9c:
            r5 = r1
            goto La2
        L9f:
            r5 = r1
            r6 = r5
        La2:
            if (r5 == 0) goto La7
            r5.close()     // Catch: java.lang.Throwable -> L9a
        La7:
            if (r6 == 0) goto Laa
            goto L96
        Laa:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto Lba
            com.baidu.liantian.b.k$a r0 = new com.baidu.liantian.b.k$a
            r0.<init>(r2)
            r0.a = r4
            r0.f5924b = r10
            return r0
        Lba:
            return r1
    }

    private static com.baidu.liantian.b.k.a c() {
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L33
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = "backups/.SystemConfig/.cuid2"
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L33
            boolean r1 = r0.exists()     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L33
            java.lang.String r0 = a(r0)     // Catch: java.lang.Throwable -> L33
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto L33
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = com.baidu.liantian.b.k.f5921c     // Catch: java.lang.Throwable -> L33
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Throwable -> L33
            byte[] r0 = com.baidu.liantian.b.c.a(r0)     // Catch: java.lang.Throwable -> L33
            byte[] r0 = com.baidu.liantian.b.a.a(r2, r2, r0)     // Catch: java.lang.Throwable -> L33
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L33
            com.baidu.liantian.b.k$a r0 = com.baidu.liantian.b.k.a.a(r1)     // Catch: java.lang.Throwable -> L33
            return r0
        L33:
            r0 = 0
            return r0
    }

    private java.lang.String c(java.lang.String r4) {
            r3 = this;
            r0 = 0
            java.lang.String r1 = "android.permission.READ_PHONE_STATE"
            boolean r1 = r3.e(r1)     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto La
            return r4
        La:
            android.content.Context r1 = r3.f5923e     // Catch: java.lang.Throwable -> L1b
            java.lang.String r2 = "phone"
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch: java.lang.Throwable -> L1b
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L1c
            java.lang.String r0 = r1.getDeviceId()     // Catch: java.lang.Throwable -> L1b
            goto L1c
        L1b:
        L1c:
            if (r0 == 0) goto L28
            java.lang.String r1 = ":"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L28
            java.lang.String r0 = ""
        L28:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L2f
            goto L30
        L2f:
            r4 = r0
        L30:
            return r4
    }

    private com.baidu.liantian.b.k.a d() {
            r4 = this;
            java.lang.String r0 = "com.baidu.deviceid"
            java.lang.String r0 = r4.a(r0)     // Catch: java.lang.Throwable -> L60
            java.lang.String r1 = "bd_setting_i"
            java.lang.String r1 = r4.a(r1)     // Catch: java.lang.Throwable -> L60
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L60
            java.lang.String r3 = ""
            if (r2 == 0) goto L18
            java.lang.String r1 = r4.c(r3)     // Catch: java.lang.Throwable -> L60
        L18:
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L60
            if (r2 == 0) goto L4f
            android.content.Context r0 = r4.f5923e     // Catch: java.lang.Throwable -> L60
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L60
            java.lang.String r2 = "android_id"
            java.lang.String r0 = android.provider.Settings.Secure.getString(r0, r2)     // Catch: java.lang.Throwable -> L60
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L60
            if (r2 == 0) goto L31
            goto L32
        L31:
            r3 = r0
        L32:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60
            java.lang.String r2 = "com.baidu"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L60
            r0.append(r1)     // Catch: java.lang.Throwable -> L60
            r0.append(r3)     // Catch: java.lang.Throwable -> L60
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L60
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Throwable -> L60
            java.lang.String r0 = com.baidu.liantian.b.o.b(r0)     // Catch: java.lang.Throwable -> L60
            java.lang.String r0 = r4.a(r0)     // Catch: java.lang.Throwable -> L60
        L4f:
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L60
            if (r2 != 0) goto L60
            com.baidu.liantian.b.k$a r2 = new com.baidu.liantian.b.k$a     // Catch: java.lang.Throwable -> L60
            r3 = 0
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L60
            r2.a = r0     // Catch: java.lang.Throwable -> L60
            r2.f5924b = r1     // Catch: java.lang.Throwable -> L60
            return r2
        L60:
            r0 = 0
            return r0
    }

    private static java.lang.String d(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L8
            r2 = 0
            return r2
        L8:
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = com.baidu.liantian.b.k.f5921c     // Catch: java.lang.Throwable -> L1c
            byte[] r2 = r2.getBytes()     // Catch: java.lang.Throwable -> L1c
            byte[] r2 = com.baidu.liantian.b.c.a(r2)     // Catch: java.lang.Throwable -> L1c
            byte[] r2 = com.baidu.liantian.b.a.a(r1, r1, r2)     // Catch: java.lang.Throwable -> L1c
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L1c
            return r0
        L1c:
            java.lang.String r2 = ""
            return r2
    }

    private boolean e(java.lang.String r4) {
            r3 = this;
            android.content.Context r0 = r3.f5923e
            int r1 = android.os.Process.myPid()
            int r2 = android.os.Process.myUid()
            int r4 = r0.checkPermission(r4, r1, r2)
            if (r4 != 0) goto L12
            r4 = 1
            return r4
        L12:
            r4 = 0
            return r4
    }
}
