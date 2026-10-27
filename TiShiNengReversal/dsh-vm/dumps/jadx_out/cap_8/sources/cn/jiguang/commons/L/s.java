package cn.jiguang.commons.L;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class s {
    public s() {
            r1 = this;
            r1.<init>()
            return
    }

    public static boolean a(android.content.Context r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Lb
            boolean r2 = c(r2)
            return r2
        Lb:
            boolean r2 = d(r2)
            return r2
    }

    private static boolean c(android.content.Context r2) {
            java.lang.String r0 = "notification"
            java.lang.Object r2 = r2.getSystemService(r0)     // Catch: java.lang.Throwable -> Ld
            android.app.NotificationManager r2 = (android.app.NotificationManager) r2     // Catch: java.lang.Throwable -> Ld
            boolean r2 = cn.jiguang.commons.L.f1.a(r2)     // Catch: java.lang.Throwable -> Ld
            return r2
        Ld:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "invoke areNotificationsEnabled method failed, error:"
            r0.append(r1)
            java.lang.String r2 = r2.getMessage()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "NotificationUtils"
            cn.jiguang.commons.w.a.f(r0, r2)
            r2 = 1
            return r2
    }

    private static boolean d(android.content.Context r10) {
            r0 = 1
            java.lang.String r1 = "appops"
            java.lang.Object r1 = r10.getSystemService(r1)     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L80
            android.app.AppOpsManager r1 = (android.app.AppOpsManager) r1     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L80
            android.content.pm.ApplicationInfo r2 = r10.getApplicationInfo()     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L80
            android.content.Context r10 = r10.getApplicationContext()     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L80
            android.content.Context r10 = com.stub.StubApp.getOrigApplicationContext(r10)     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L80
            java.lang.String r10 = r10.getPackageName()     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L80
            int r2 = r2.uid     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L80
            java.lang.Class<android.app.AppOpsManager> r3 = android.app.AppOpsManager.class
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L80
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L80
            java.lang.String r4 = "checkOpNoThrow"
            r5 = 3
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L80
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L80
            r8 = 0
            r6[r8] = r7     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L80
            r6[r0] = r7     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L80
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r9 = 2
            r6[r9] = r7     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L80
            java.lang.reflect.Method r4 = r3.getMethod(r4, r6)     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L80
            java.lang.String r6 = "OP_POST_NOTIFICATION"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r6)     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L80
            java.lang.Class<java.lang.Integer> r6 = java.lang.Integer.class
            java.lang.Object r3 = r3.get(r6)     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L80
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L80
            r3.getClass()     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L80
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L80
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L80
            r5[r8] = r3     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L80
            r5[r0] = r2     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L80
            r5[r9] = r10     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L80
            java.lang.Object r10 = r4.invoke(r1, r5)     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L80
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L80
            int r10 = r10.intValue()     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L80
            if (r10 != 0) goto L64
            return r0
        L64:
            return r8
        L65:
            r10 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getNotificationStateCommon failed, other error:"
            r1.append(r2)
            java.lang.String r10 = r10.getMessage()
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            java.lang.String r1 = "NotificationUtils"
            cn.jiguang.commons.w.a.f(r1, r10)
        L80:
            return r0
    }
}
