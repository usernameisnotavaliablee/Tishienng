package cn.jiguang.k;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {
    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(android.content.Context r9, int r10) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "triggerScene:"
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "JNotificationState"
            cn.jiguang.w.f.c(r1, r0)
            r0 = 1800(0x708, float:2.522E-42)
            boolean r0 = cn.jiguang.f.b.b(r0)
            if (r0 != 0) goto L1f
            return
        L1f:
            r0 = 1
            if (r0 != r10) goto L41
            cn.jiguang.ad.g r2 = cn.jiguang.ad.g.a()
            boolean r2 = r2.d()
            if (r2 != 0) goto L41
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "ismLoggedIn is false, triggerScene:"
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            cn.jiguang.w.f.e(r1, r9)
            return
        L41:
            java.lang.String r2 = cn.jiguang.h.b.e(r9)
            boolean r3 = a(r9)
            if (r3 != 0) goto L50
            java.lang.String r4 = "notification trigger is off, will not show notification"
            cn.jiguang.w.f.e(r1, r4)
        L50:
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r5 = "OFF"
            java.lang.String r6 = "ON"
            if (r4 == 0) goto L5b
            goto L7d
        L5b:
            boolean r4 = android.text.TextUtils.equals(r6, r2)
            r7 = 0
            if (r4 == 0) goto L65
            r4 = 0
            r8 = 1
            goto L70
        L65:
            boolean r4 = android.text.TextUtils.equals(r5, r2)
            if (r4 == 0) goto L6e
            r4 = 0
        L6c:
            r8 = 0
            goto L70
        L6e:
            r4 = 1
            goto L6c
        L70:
            if (r4 != 0) goto L77
            if (r8 == r3) goto L75
            goto L7d
        L75:
            r0 = 0
            goto L7d
        L77:
            java.lang.String r0 = "notification state do not changed"
            cn.jiguang.w.f.c(r1, r0)
            r0 = r4
        L7d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "lastCacheNotificationState:"
            r4.append(r7)
            r4.append(r2)
            java.lang.String r2 = ",currentNotificationSate:"
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = ",isNeedReport:"
            r4.append(r2)
            r4.append(r0)
            java.lang.String r2 = ",triggerScene:"
            r4.append(r2)
            r4.append(r10)
            java.lang.String r2 = r4.toString()
            cn.jiguang.w.f.c(r1, r2)
            if (r0 == 0) goto L10a
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lcd
            r0.<init>()     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r2 = "notification_state"
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> Lcd
            r2 = 1801(0x709, float:2.524E-42)
            boolean r2 = cn.jiguang.f.b.b(r2)     // Catch: java.lang.Throwable -> Lcd
            if (r2 == 0) goto Lcf
            java.lang.String r2 = "imei"
            cn.jiguang.av.a r4 = cn.jiguang.av.a.a()     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r7 = ""
            java.lang.String r4 = r4.c(r9, r7)     // Catch: java.lang.Throwable -> Lcd
            r0.put(r2, r4)     // Catch: java.lang.Throwable -> Lcd
            goto Lcf
        Lcd:
            r9 = move-exception
            goto Lf1
        Lcf:
            r2 = 1802(0x70a, float:2.525E-42)
            boolean r2 = cn.jiguang.f.b.b(r2)     // Catch: java.lang.Throwable -> Lcd
            if (r2 == 0) goto Le0
            java.lang.String r2 = "device_id"
            java.lang.String r4 = cn.jiguang.av.g.b(r9)     // Catch: java.lang.Throwable -> Lcd
            r0.put(r2, r4)     // Catch: java.lang.Throwable -> Lcd
        Le0:
            java.lang.String r2 = "trigger_scene"
            r0.put(r2, r10)     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r10 = "android_notification_state"
            cn.jiguang.z.b.a(r9, r0, r10)     // Catch: java.lang.Throwable -> Lcd
            if (r3 == 0) goto Led
            r5 = r6
        Led:
            cn.jiguang.h.b.m(r9, r5)     // Catch: java.lang.Throwable -> Lcd
            return
        Lf1:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "report notification state failed, error:"
            r10.append(r0)
            java.lang.String r9 = r9.getMessage()
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            cn.jiguang.w.f.i(r1, r9)
            return
        L10a:
            java.lang.String r9 = "do not need report notification state"
            cn.jiguang.w.f.c(r1, r9)
            return
    }

    public static boolean a(android.content.Context r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Lb
            boolean r2 = b(r2)
            return r2
        Lb:
            boolean r2 = c(r2)
            return r2
    }

    @android.annotation.TargetApi(24)
    private static boolean b(android.content.Context r2) {
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
            java.lang.String r0 = "JNotificationState"
            cn.jiguang.w.f.i(r0, r2)
            r2 = 1
            return r2
    }

    private static boolean c(android.content.Context r10) {
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
            r3.intValue()     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L80
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
            java.lang.String r1 = "JNotificationState"
            cn.jiguang.w.f.i(r1, r10)
        L80:
            return r0
    }
}
