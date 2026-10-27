package org.repackage.com.meizu.flyme.openidsdk;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class b {
    private static volatile org.repackage.com.meizu.flyme.openidsdk.b e;
    private static boolean f;
    org.repackage.com.meizu.flyme.openidsdk.OpenId a;
    org.repackage.com.meizu.flyme.openidsdk.OpenId b;
    org.repackage.com.meizu.flyme.openidsdk.OpenId c;
    org.repackage.com.meizu.flyme.openidsdk.OpenId d;
    private org.repackage.com.meizu.flyme.openidsdk.SupportInfo g;
    private android.content.BroadcastReceiver h;

    static {
            return
    }

    private b() {
            r2 = this;
            r2.<init>()
            org.repackage.com.meizu.flyme.openidsdk.OpenId r0 = new org.repackage.com.meizu.flyme.openidsdk.OpenId
            java.lang.String r1 = "udid"
            r0.<init>(r1)
            r2.a = r0
            org.repackage.com.meizu.flyme.openidsdk.OpenId r0 = new org.repackage.com.meizu.flyme.openidsdk.OpenId
            java.lang.String r1 = "oaid"
            r0.<init>(r1)
            r2.b = r0
            org.repackage.com.meizu.flyme.openidsdk.OpenId r0 = new org.repackage.com.meizu.flyme.openidsdk.OpenId
            java.lang.String r1 = "vaid"
            r0.<init>(r1)
            r2.d = r0
            org.repackage.com.meizu.flyme.openidsdk.OpenId r0 = new org.repackage.com.meizu.flyme.openidsdk.OpenId
            java.lang.String r1 = "aaid"
            r0.<init>(r1)
            r2.c = r0
            org.repackage.com.meizu.flyme.openidsdk.SupportInfo r0 = new org.repackage.com.meizu.flyme.openidsdk.SupportInfo
            r0.<init>()
            r2.g = r0
            return
    }

    private static java.lang.String a(android.content.pm.PackageManager r2, java.lang.String r3) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            r1 = 0
            android.content.pm.ProviderInfo r2 = r2.resolveContentProvider(r3, r1)
            if (r2 != 0) goto Lc
            return r0
        Lc:
            android.content.pm.ApplicationInfo r3 = r2.applicationInfo
            int r3 = r3.flags
            r3 = r3 & 1
            if (r3 != 0) goto L15
            return r0
        L15:
            java.lang.String r2 = r2.packageName
            return r2
    }

    private static org.repackage.com.meizu.flyme.openidsdk.ValueData a(android.database.Cursor r3) {
            org.repackage.com.meizu.flyme.openidsdk.ValueData r0 = new org.repackage.com.meizu.flyme.openidsdk.ValueData
            r1 = 0
            r2 = 0
            r0.<init>(r1, r2)
            if (r3 != 0) goto Lf
            java.lang.String r3 = "parseValue fail, cursor is null."
            a(r3)
            return r0
        Lf:
            boolean r1 = r3.isClosed()
            if (r1 == 0) goto L1b
            java.lang.String r3 = "parseValue fail, cursor is closed."
            a(r3)
            return r0
        L1b:
            r3.moveToFirst()
            java.lang.String r1 = "value"
            int r1 = r3.getColumnIndex(r1)
            if (r1 < 0) goto L2d
            java.lang.String r1 = r3.getString(r1)
            r0.a = r1
            goto L32
        L2d:
            java.lang.String r1 = "parseValue fail, index < 0."
            a(r1)
        L32:
            java.lang.String r1 = "code"
            int r1 = r3.getColumnIndex(r1)
            if (r1 < 0) goto L41
            int r1 = r3.getInt(r1)
            r0.b = r1
            goto L46
        L41:
            java.lang.String r1 = "parseCode fail, index < 0."
            a(r1)
        L46:
            java.lang.String r1 = "expired"
            int r1 = r3.getColumnIndex(r1)
            if (r1 < 0) goto L55
            long r1 = r3.getLong(r1)
            r0.c = r1
            return r0
        L55:
            java.lang.String r3 = "parseExpired fail, index < 0."
            a(r3)
            return r0
    }

    public static final org.repackage.com.meizu.flyme.openidsdk.b a() {
            org.repackage.com.meizu.flyme.openidsdk.b r0 = org.repackage.com.meizu.flyme.openidsdk.b.e
            if (r0 != 0) goto L19
            java.lang.Class<org.repackage.com.meizu.flyme.openidsdk.b> r0 = org.repackage.com.meizu.flyme.openidsdk.b.class
            monitor-enter(r0)
            org.repackage.com.meizu.flyme.openidsdk.b r1 = org.repackage.com.meizu.flyme.openidsdk.b.e     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            org.repackage.com.meizu.flyme.openidsdk.b r1 = new org.repackage.com.meizu.flyme.openidsdk.b     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            org.repackage.com.meizu.flyme.openidsdk.b.e = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            org.repackage.com.meizu.flyme.openidsdk.b r0 = org.repackage.com.meizu.flyme.openidsdk.b.e
            return r0
    }

    static void a(java.lang.String r0) {
            return
    }

    public static void a(boolean r0) {
            org.repackage.com.meizu.flyme.openidsdk.b.f = r0
            return
    }

    private static boolean a(android.content.Context r9) {
            java.lang.String r0 = "querySupport version : 1.0.8"
            a(r0)
            java.lang.String r0 = "content://com.meizu.flyme.openidsdk/"
            android.net.Uri r2 = android.net.Uri.parse(r0)
            r7 = 0
            r8 = 0
            android.content.ContentResolver r1 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L38
            java.lang.String r9 = "supported"
            java.lang.String[] r5 = new java.lang.String[]{r9}     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L38
            r6 = 0
            r3 = 0
            r4 = 0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L38
            if (r8 == 0) goto L40
            org.repackage.com.meizu.flyme.openidsdk.ValueData r9 = a(r8)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L38
            int r0 = r9.b     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L38
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r1 != r0) goto L3b
            java.lang.String r0 = "0"
            java.lang.String r9 = r9.a     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L38
            boolean r9 = r0.equals(r9)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L38
            if (r9 == 0) goto L3c
            goto L3b
        L35:
            r0 = move-exception
            r9 = r0
            goto L5f
        L38:
            r0 = move-exception
            r9 = r0
            goto L46
        L3b:
            r7 = 1
        L3c:
            r8.close()
            return r7
        L40:
            if (r8 == 0) goto L5e
        L42:
            r8.close()
            goto L5e
        L46:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = "querySupport, Exception : "
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L35
            java.lang.String r9 = r9.getMessage()     // Catch: java.lang.Throwable -> L35
            r0.append(r9)     // Catch: java.lang.Throwable -> L35
            java.lang.String r9 = r0.toString()     // Catch: java.lang.Throwable -> L35
            a(r9)     // Catch: java.lang.Throwable -> L35
            if (r8 == 0) goto L5e
            goto L42
        L5e:
            return r7
        L5f:
            if (r8 == 0) goto L64
            r8.close()
        L64:
            throw r9
    }

    private java.lang.String b(android.content.Context r9, org.repackage.com.meizu.flyme.openidsdk.OpenId r10) {
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "queryId : "
            r0.<init>(r1)
            java.lang.String r1 = r10.c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            a(r0)
            java.lang.String r0 = "content://com.meizu.flyme.openidsdk/"
            android.net.Uri r2 = android.net.Uri.parse(r0)
            r7 = 0
            android.content.ContentResolver r1 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La1
            java.lang.String r0 = r10.c     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La1
            java.lang.String[] r5 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La1
            r6 = 0
            r3 = 0
            r4 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La1
            r0 = 1
            r2 = 0
            if (r1 == 0) goto L87
            org.repackage.com.meizu.flyme.openidsdk.ValueData r3 = a(r1)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            java.lang.String r7 = r3.a     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            r10.a(r7)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            long r4 = r3.c     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            r10.a(r4)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            int r4 = r3.b     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            r10.a(r4)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            r4.<init>()     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            java.lang.String r5 = r10.c     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            r4.append(r5)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            java.lang.String r5 = " errorCode : "
            r4.append(r5)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            int r10 = r10.d     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            r4.append(r10)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            java.lang.String r10 = r4.toString()     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            a(r10)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            int r10 = r3.b     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r10 == r3) goto L98
            r8.b(r9)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            boolean r10 = r8.a(r9, r2)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            if (r10 != 0) goto L98
            boolean r9 = r8.a(r9, r0)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            java.lang.String r10 = "not support, forceQuery isSupported: "
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
        L76:
            java.lang.String r9 = r10.concat(r9)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            a(r9)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            goto L98
        L7e:
            r0 = move-exception
            r9 = r0
            r7 = r1
            goto Lbf
        L82:
            r0 = move-exception
            r9 = r0
            r10 = r7
            r7 = r1
            goto La4
        L87:
            boolean r10 = r8.a(r9, r2)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            if (r10 == 0) goto L98
            boolean r9 = r8.a(r9, r0)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            java.lang.String r10 = "forceQuery isSupported : "
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            goto L76
        L98:
            if (r1 == 0) goto L9d
            r1.close()
        L9d:
            return r7
        L9e:
            r0 = move-exception
            r9 = r0
            goto Lbf
        La1:
            r0 = move-exception
            r9 = r0
            r10 = r7
        La4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9e
            java.lang.String r1 = "queryId, Exception : "
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r9 = r9.getMessage()     // Catch: java.lang.Throwable -> L9e
            r0.append(r9)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r9 = r0.toString()     // Catch: java.lang.Throwable -> L9e
            a(r9)     // Catch: java.lang.Throwable -> L9e
            if (r7 == 0) goto Lbe
            r7.close()
        Lbe:
            return r10
        Lbf:
            if (r7 == 0) goto Lc4
            r7.close()
        Lc4:
            throw r9
    }

    private static java.lang.String b(android.content.pm.PackageManager r1, java.lang.String r2) {
            r0 = 0
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r0)     // Catch: java.lang.Exception -> La
            if (r1 == 0) goto L20
            java.lang.String r1 = r1.versionName     // Catch: java.lang.Exception -> La
            return r1
        La:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "getAppVersion, Exception : "
            r2.<init>(r0)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            a(r1)
        L20:
            r1 = 0
            return r1
    }

    private synchronized void b(android.content.Context r5) {
            r4 = this;
            monitor-enter(r4)
            android.content.BroadcastReceiver r0 = r4.h     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L7
            monitor-exit(r4)
            return
        L7:
            android.content.IntentFilter r0 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> L20
            r0.<init>()     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = "com.meizu.flyme.openid.ACTION_OPEN_ID_CHANGE"
            r0.addAction(r1)     // Catch: java.lang.Throwable -> L20
            org.repackage.com.meizu.flyme.openidsdk.a r1 = new org.repackage.com.meizu.flyme.openidsdk.a     // Catch: java.lang.Throwable -> L20
            r1.<init>()     // Catch: java.lang.Throwable -> L20
            r4.h = r1     // Catch: java.lang.Throwable -> L20
            java.lang.String r2 = "com.meizu.flyme.openid.permission.OPEN_ID_CHANGE"
            r3 = 0
            r5.registerReceiver(r1, r0, r2, r3)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r4)
            return
        L20:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L20
            throw r5
    }

    final java.lang.String a(android.content.Context r3, org.repackage.com.meizu.flyme.openidsdk.OpenId r4) {
            r2 = this;
            r0 = 0
            if (r4 != 0) goto L9
            java.lang.String r3 = "getId, openId = null."
        L5:
            a(r3)
            return r0
        L9:
            boolean r1 = r4.a()
            if (r1 == 0) goto L12
            java.lang.String r3 = r4.b
            return r3
        L12:
            r1 = 1
            boolean r1 = r2.a(r3, r1)
            if (r1 != 0) goto L1c
            java.lang.String r3 = "getId, isSupported = false."
            goto L5
        L1c:
            java.lang.String r3 = r2.b(r3, r4)
            return r3
    }

    final boolean a(android.content.Context r4, boolean r5) {
            r3 = this;
            org.repackage.com.meizu.flyme.openidsdk.SupportInfo r0 = r3.g
            boolean r0 = r0.a()
            if (r0 == 0) goto L11
            if (r5 != 0) goto L11
            org.repackage.com.meizu.flyme.openidsdk.SupportInfo r4 = r3.g
            boolean r4 = r4.b()
            return r4
        L11:
            android.content.pm.PackageManager r5 = r4.getPackageManager()
            r0 = 0
            if (r5 != 0) goto L19
            return r0
        L19:
            java.lang.String r1 = "com.meizu.flyme.openidsdk"
            java.lang.String r1 = a(r5, r1)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L26
            return r0
        L26:
            java.lang.String r5 = b(r5, r1)
            org.repackage.com.meizu.flyme.openidsdk.SupportInfo r0 = r3.g
            boolean r0 = r0.a()
            if (r0 == 0) goto L4e
            org.repackage.com.meizu.flyme.openidsdk.SupportInfo r0 = r3.g
            boolean r0 = r0.a(r5)
            if (r0 == 0) goto L4e
            java.lang.String r4 = "use same version cache, safeVersion : "
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r4 = r4.concat(r5)
            a(r4)
            org.repackage.com.meizu.flyme.openidsdk.SupportInfo r4 = r3.g
            boolean r4 = r4.b()
            return r4
        L4e:
            org.repackage.com.meizu.flyme.openidsdk.SupportInfo r0 = r3.g
            r0.b(r5)
            boolean r4 = a(r4)
            java.lang.String r5 = "query support, result : "
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.String r5 = r5.concat(r0)
            a(r5)
            org.repackage.com.meizu.flyme.openidsdk.SupportInfo r5 = r3.g
            r5.a(r4)
            return r4
    }
}
