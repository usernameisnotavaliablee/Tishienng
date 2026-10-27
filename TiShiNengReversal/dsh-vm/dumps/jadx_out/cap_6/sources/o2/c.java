package o2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class c {
    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String a(java.lang.String r2, android.os.IBinder r3, java.lang.String r4, int r5) throws android.os.RemoteException {
            android.os.Parcel r0 = android.os.Parcel.obtain()
            android.os.Parcel r1 = android.os.Parcel.obtain()
            r0.writeInterfaceToken(r4)     // Catch: java.lang.Throwable -> L15
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L15
            if (r4 != 0) goto L17
            r0.writeString(r2)     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r2 = move-exception
            goto L29
        L17:
            r2 = 0
            r3.transact(r5, r0, r1, r2)     // Catch: java.lang.Throwable -> L15
            r1.readException()     // Catch: java.lang.Throwable -> L15
            java.lang.String r2 = r1.readString()     // Catch: java.lang.Throwable -> L15
            r1.recycle()
            r0.recycle()
            return r2
        L29:
            r1.recycle()
            r0.recycle()
            throw r2
    }

    public static java.lang.String b(android.content.Context r2) {
            java.lang.String r0 = e(r2)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L1c
            java.lang.String r0 = d(r2)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L1c
            java.lang.String r2 = c(r2)
            android.text.TextUtils.isEmpty(r2)
            return r2
        L1c:
            return r0
    }

    public static java.lang.String c(android.content.Context r8) {
            java.lang.String r0 = "getDeviceId"
            java.lang.String r1 = "phone"
            java.lang.Object r1 = r8.getSystemService(r1)
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1
            java.lang.Class<android.telephony.TelephonyManager> r2 = android.telephony.TelephonyManager.class
            java.lang.String r3 = "getITelephony"
            r4 = 0
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch: java.lang.Exception -> L59
            r3 = 1
            r2.setAccessible(r3)     // Catch: java.lang.Exception -> L59
            java.lang.Object r1 = r2.invoke(r1, r4)     // Catch: java.lang.Exception -> L59
            java.lang.Class r2 = r1.getClass()     // Catch: java.lang.Exception -> L59
            java.lang.String r5 = "asBinder"
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r5, r4)     // Catch: java.lang.Exception -> L59
            r2.setAccessible(r3)     // Catch: java.lang.Exception -> L59
            java.lang.Class r2 = r1.getClass()     // Catch: java.lang.Exception -> L48
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L48
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r7 = 0
            r5[r7] = r6     // Catch: java.lang.Exception -> L48
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r0, r5)     // Catch: java.lang.Exception -> L48
            if (r2 == 0) goto L48
            java.lang.String r8 = r8.getPackageName()     // Catch: java.lang.Exception -> L48
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L48
            r3[r7] = r8     // Catch: java.lang.Exception -> L48
            java.lang.Object r8 = r2.invoke(r1, r3)     // Catch: java.lang.Exception -> L48
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L48
            return r8
        L48:
            java.lang.Class r8 = r1.getClass()     // Catch: java.lang.Exception -> L59
            java.lang.reflect.Method r8 = r8.getDeclaredMethod(r0, r4)     // Catch: java.lang.Exception -> L59
            if (r8 == 0) goto L59
            java.lang.Object r8 = r8.invoke(r1, r4)     // Catch: java.lang.Exception -> L59
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L59
            return r8
        L59:
            java.lang.String r8 = ""
            return r8
    }

    public static java.lang.String d(android.content.Context r10) {
            java.lang.String r0 = "getDeviceId"
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.String r2 = "android.os.ServiceManager"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Exception -> L71
            java.lang.String r3 = "getService"
            r4 = 1
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L71
            r6 = 0
            r5[r6] = r1     // Catch: java.lang.Exception -> L71
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r5)     // Catch: java.lang.Exception -> L71
            r2.setAccessible(r4)     // Catch: java.lang.Exception -> L71
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L71
            java.lang.String r5 = "phone"
            r3[r6] = r5     // Catch: java.lang.Exception -> L71
            r5 = 0
            java.lang.Object r2 = r2.invoke(r5, r3)     // Catch: java.lang.Exception -> L71
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: java.lang.Exception -> L71
            java.lang.String r3 = "com.android.internal.telephony.ITelephony$Stub"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Exception -> L71
            java.lang.String r7 = "asInterface"
            java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L71
            java.lang.Class<android.os.IBinder> r9 = android.os.IBinder.class
            r8[r6] = r9     // Catch: java.lang.Exception -> L71
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r7, r8)     // Catch: java.lang.Exception -> L71
            r3.setAccessible(r4)     // Catch: java.lang.Exception -> L71
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L71
            r7[r6] = r2     // Catch: java.lang.Exception -> L71
            java.lang.Object r2 = r3.invoke(r5, r7)     // Catch: java.lang.Exception -> L71
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Exception -> L60
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L60
            r7[r6] = r1     // Catch: java.lang.Exception -> L60
            java.lang.reflect.Method r1 = r3.getDeclaredMethod(r0, r7)     // Catch: java.lang.Exception -> L60
            if (r1 == 0) goto L60
            java.lang.String r10 = r10.getPackageName()     // Catch: java.lang.Exception -> L60
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L60
            r3[r6] = r10     // Catch: java.lang.Exception -> L60
            java.lang.Object r10 = r1.invoke(r2, r3)     // Catch: java.lang.Exception -> L60
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L60
            return r10
        L60:
            java.lang.Class r10 = r2.getClass()     // Catch: java.lang.Exception -> L71
            java.lang.reflect.Method r10 = r10.getDeclaredMethod(r0, r5)     // Catch: java.lang.Exception -> L71
            if (r10 == 0) goto L71
            java.lang.Object r10 = r10.invoke(r2, r5)     // Catch: java.lang.Exception -> L71
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L71
            return r10
        L71:
            java.lang.String r10 = ""
            return r10
    }

    public static java.lang.String e(android.content.Context r12) {
            java.lang.String r0 = "TRANSACTION_getDeviceId"
            java.lang.String r1 = "getDeviceId"
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.String r3 = ""
            java.lang.String r4 = "android.os.ServiceManager"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.Exception -> L7f
            java.lang.String r5 = "getService"
            r6 = 1
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch: java.lang.Exception -> L7f
            r8 = 0
            r7[r8] = r2     // Catch: java.lang.Exception -> L7f
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r5, r7)     // Catch: java.lang.Exception -> L7f
            r4.setAccessible(r6)     // Catch: java.lang.Exception -> L7f
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L7f
            java.lang.String r7 = "phone"
            r5[r8] = r7     // Catch: java.lang.Exception -> L7f
            r7 = 0
            java.lang.Object r4 = r4.invoke(r7, r5)     // Catch: java.lang.Exception -> L7f
            android.os.IBinder r4 = (android.os.IBinder) r4     // Catch: java.lang.Exception -> L7f
            java.lang.String r5 = "com.android.internal.telephony.ITelephony$Stub"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Exception -> L7f
            java.lang.String r9 = "asInterface"
            java.lang.Class[] r10 = new java.lang.Class[r6]     // Catch: java.lang.Exception -> L7f
            java.lang.Class<android.os.IBinder> r11 = android.os.IBinder.class
            r10[r8] = r11     // Catch: java.lang.Exception -> L7f
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r9, r10)     // Catch: java.lang.Exception -> L7f
            r5.setAccessible(r6)     // Catch: java.lang.Exception -> L7f
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L7f
            r9[r8] = r4     // Catch: java.lang.Exception -> L7f
            java.lang.Object r5 = r5.invoke(r7, r9)     // Catch: java.lang.Exception -> L7f
            java.lang.Class r9 = r5.getClass()     // Catch: java.lang.Exception -> L66
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch: java.lang.Exception -> L66
            r6[r8] = r2     // Catch: java.lang.Exception -> L66
            java.lang.reflect.Method r2 = r9.getDeclaredMethod(r1, r6)     // Catch: java.lang.Exception -> L66
            if (r2 == 0) goto L66
            java.lang.String r12 = r12.getPackageName()     // Catch: java.lang.Exception -> L66
            java.lang.String r2 = com.snail.antifake.deviceid.b.a(r5)     // Catch: java.lang.Exception -> L66
            int r6 = com.snail.antifake.deviceid.b.b(r5, r0)     // Catch: java.lang.Exception -> L66
            java.lang.String r12 = a(r12, r4, r2, r6)     // Catch: java.lang.Exception -> L66
            goto L67
        L66:
            r12 = r3
        L67:
            java.lang.Class r2 = r5.getClass()     // Catch: java.lang.Exception -> L7e
            java.lang.reflect.Method r1 = r2.getDeclaredMethod(r1, r7)     // Catch: java.lang.Exception -> L7e
            if (r1 == 0) goto L80
            java.lang.String r1 = com.snail.antifake.deviceid.b.a(r5)     // Catch: java.lang.Exception -> L7e
            int r0 = com.snail.antifake.deviceid.b.b(r5, r0)     // Catch: java.lang.Exception -> L7e
            java.lang.String r12 = a(r3, r4, r1, r0)     // Catch: java.lang.Exception -> L7e
            goto L80
        L7e:
            r3 = r12
        L7f:
            r12 = r3
        L80:
            return r12
    }
}
