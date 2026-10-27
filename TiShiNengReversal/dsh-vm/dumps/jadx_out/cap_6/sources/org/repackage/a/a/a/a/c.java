package org.repackage.a.a.a.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class c {
    public org.repackage.a.a.a.a a;
    public java.lang.String b;
    public java.lang.String c;
    public final java.lang.Object d;
    public android.content.ServiceConnection e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a {
        public static final org.repackage.a.a.a.a.c a = null;

        static {
                org.repackage.a.a.a.a.c r0 = new org.repackage.a.a.a.a.c
                r1 = 0
                r0.<init>(r1)
                org.repackage.a.a.a.a.c.a.a = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    public /* synthetic */ c(org.repackage.a.a.a.a.b r1) {
            r0 = this;
            r0.<init>()
            r1 = 0
            r0.a = r1
            r0.b = r1
            r0.c = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.d = r1
            org.repackage.a.a.a.a.b r1 = new org.repackage.a.a.a.a.b
            r1.<init>(r0)
            r0.e = r1
            return
    }

    public synchronized java.lang.String a(android.content.Context r5, java.lang.String r6) {
            r4 = this;
            monitor-enter(r4)
            android.os.Looper r0 = android.os.Looper.myLooper()     // Catch: java.lang.Throwable -> L3f
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L3f
            if (r0 == r1) goto L5d
            org.repackage.a.a.a.a r0 = r4.a     // Catch: java.lang.Throwable -> L3f
            if (r0 != 0) goto L53
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L3f
            r0.<init>()     // Catch: java.lang.Throwable -> L3f
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L3f
            java.lang.String r2 = "com.heytap.openid"
            java.lang.String r3 = "com.heytap.openid.IdentifyService"
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L3f
            r0.setComponent(r1)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = "action.com.heytap.openid.OPEN_ID_SERVICE"
            r0.setAction(r1)     // Catch: java.lang.Throwable -> L3f
            android.content.ServiceConnection r1 = r4.e     // Catch: java.lang.Throwable -> L3f
            r2 = 1
            boolean r0 = r5.bindService(r0, r1, r2)     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L41
            java.lang.Object r0 = r4.d     // Catch: java.lang.Throwable -> L3f
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r1 = r4.d     // Catch: java.lang.Throwable -> L39 java.lang.InterruptedException -> L3b
            r2 = 3000(0xbb8, double:1.482E-320)
            r1.wait(r2)     // Catch: java.lang.Throwable -> L39 java.lang.InterruptedException -> L3b
            goto L3b
        L39:
            r5 = move-exception
            goto L3d
        L3b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            goto L41
        L3d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            throw r5     // Catch: java.lang.Throwable -> L3f
        L3f:
            r5 = move-exception
            goto L65
        L41:
            org.repackage.a.a.a.a r0 = r4.a     // Catch: java.lang.Throwable -> L3f
            if (r0 != 0) goto L49
            java.lang.String r5 = ""
            monitor-exit(r4)
            return r5
        L49:
            java.lang.String r5 = r4.b(r5, r6)     // Catch: java.lang.Throwable -> L3f android.os.RemoteException -> L4f
            monitor-exit(r4)
            return r5
        L4f:
            java.lang.String r5 = ""
            monitor-exit(r4)
            return r5
        L53:
            java.lang.String r5 = r4.b(r5, r6)     // Catch: java.lang.Throwable -> L3f android.os.RemoteException -> L59
            monitor-exit(r4)
            return r5
        L59:
            java.lang.String r5 = ""
            monitor-exit(r4)
            return r5
        L5d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3f
            java.lang.String r6 = "Cannot run on MainThread"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L3f
            throw r5     // Catch: java.lang.Throwable -> L3f
        L65:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3f
            throw r5
    }

    public boolean a(android.content.Context r7) {
            r6 = this;
            r0 = 0
            android.content.pm.PackageManager r7 = r7.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L27
            java.lang.String r1 = "com.heytap.openid"
            android.content.pm.PackageInfo r7 = r7.getPackageInfo(r1, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L27
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L27
            r2 = 28
            r3 = 1
            if (r1 < r2) goto L20
            if (r7 == 0) goto L1f
            long r1 = cn.jiguang.v.n.a(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L27
            r4 = 1
            int r7 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r7 < 0) goto L1f
            return r3
        L1f:
            return r0
        L20:
            if (r7 == 0) goto L27
            int r7 = r7.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L27
            if (r7 < r3) goto L27
            return r3
        L27:
            return r0
    }

    public final java.lang.String b(android.content.Context r8, java.lang.String r9) {
            r7 = this;
            java.lang.String r0 = r7.b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Le
            java.lang.String r0 = r8.getPackageName()
            r7.b = r0
        Le:
            java.lang.String r0 = r7.c
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L64
            java.lang.String r0 = r7.b
            r1 = 0
            android.content.pm.PackageManager r8 = r8.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L26
            r2 = 64
            android.content.pm.PackageInfo r8 = r8.getPackageInfo(r0, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L26
            android.content.pm.Signature[] r8 = r8.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L26
            goto L28
        L26:
            r8 = r1
        L28:
            if (r8 == 0) goto L62
            int r0 = r8.length
            if (r0 <= 0) goto L62
            r0 = 0
            r8 = r8[r0]
            java.lang.String r2 = "SHA1"
            byte[] r8 = r8.toByteArray()
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r2)     // Catch: java.security.NoSuchAlgorithmException -> L62
            if (r2 == 0) goto L62
            byte[] r8 = r2.digest(r8)     // Catch: java.security.NoSuchAlgorithmException -> L62
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.security.NoSuchAlgorithmException -> L62
            r2.<init>()     // Catch: java.security.NoSuchAlgorithmException -> L62
            int r3 = r8.length     // Catch: java.security.NoSuchAlgorithmException -> L62
        L46:
            if (r0 >= r3) goto L5e
            r4 = r8[r0]     // Catch: java.security.NoSuchAlgorithmException -> L62
            r4 = r4 & 255(0xff, float:3.57E-43)
            r4 = r4 | 256(0x100, float:3.59E-43)
            java.lang.String r4 = java.lang.Integer.toHexString(r4)     // Catch: java.security.NoSuchAlgorithmException -> L62
            r5 = 3
            r6 = 1
            java.lang.String r4 = r4.substring(r6, r5)     // Catch: java.security.NoSuchAlgorithmException -> L62
            r2.append(r4)     // Catch: java.security.NoSuchAlgorithmException -> L62
            int r0 = r0 + 1
            goto L46
        L5e:
            java.lang.String r1 = r2.toString()     // Catch: java.security.NoSuchAlgorithmException -> L62
        L62:
            r7.c = r1
        L64:
            org.repackage.a.a.a.a r8 = r7.a
            java.lang.String r0 = r7.b
            java.lang.String r1 = r7.c
            org.repackage.a.a.a.a$a$a r8 = (org.repackage.a.a.a.a.AbstractBinderC0086a.C0087a) r8
            java.lang.String r8 = r8.a(r0, r1, r9)
            boolean r9 = android.text.TextUtils.isEmpty(r8)
            if (r9 == 0) goto L78
            java.lang.String r8 = ""
        L78:
            return r8
    }
}
