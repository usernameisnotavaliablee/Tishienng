package n2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b {
    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(android.content.Context r10, java.lang.String r11) {
            java.lang.String r0 = "android.os.UserHandle"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L5d
            java.lang.String r1 = "getUserId"
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L5d
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L5d
            r5 = 0
            r4[r5] = r2     // Catch: java.lang.Exception -> L5d
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r4)     // Catch: java.lang.Exception -> L5d
            r0.setAccessible(r3)     // Catch: java.lang.Exception -> L5d
            int r1 = android.os.Process.myUid()     // Catch: java.lang.Exception -> L5d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> L5d
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L5d
            r4[r5] = r1     // Catch: java.lang.Exception -> L5d
            r1 = 0
            java.lang.Object r0 = r0.invoke(r1, r4)     // Catch: java.lang.Exception -> L5d
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Exception -> L5d
            r0.intValue()     // Catch: java.lang.Exception -> L5d
            java.lang.String r4 = "android.provider.Settings$Secure"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.Exception -> L5d
            java.lang.String r6 = "getStringForUser"
            r7 = 3
            java.lang.Class[] r8 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L5d
            java.lang.Class<android.content.ContentResolver> r9 = android.content.ContentResolver.class
            r8[r5] = r9     // Catch: java.lang.Exception -> L5d
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r8[r3] = r9     // Catch: java.lang.Exception -> L5d
            r9 = 2
            r8[r9] = r2     // Catch: java.lang.Exception -> L5d
            java.lang.reflect.Method r2 = r4.getDeclaredMethod(r6, r8)     // Catch: java.lang.Exception -> L5d
            r2.setAccessible(r3)     // Catch: java.lang.Exception -> L5d
            android.content.ContentResolver r10 = r10.getContentResolver()     // Catch: java.lang.Exception -> L5d
            java.lang.Object[] r4 = new java.lang.Object[r7]     // Catch: java.lang.Exception -> L5d
            r4[r5] = r10     // Catch: java.lang.Exception -> L5d
            r4[r3] = r11     // Catch: java.lang.Exception -> L5d
            r4[r9] = r0     // Catch: java.lang.Exception -> L5d
            java.lang.Object r10 = r2.invoke(r1, r4)     // Catch: java.lang.Exception -> L5d
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L5d
            return r10
        L5d:
            java.lang.String r10 = ""
            return r10
    }

    public static java.lang.String b(android.content.Context r18, java.lang.String r19) {
            r0 = r19
            java.lang.String r1 = "android.provider.Settings$Secure"
            java.lang.Class r2 = java.lang.Integer.TYPE
            android.content.ContentResolver r3 = r18.getContentResolver()
            java.lang.String r4 = "android.os.UserHandle"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.Exception -> L169
            java.lang.String r5 = "getUserId"
            r6 = 1
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch: java.lang.Exception -> L169
            r8 = 0
            r7[r8] = r2     // Catch: java.lang.Exception -> L169
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r5, r7)     // Catch: java.lang.Exception -> L169
            r4.setAccessible(r6)     // Catch: java.lang.Exception -> L169
            int r5 = android.os.Process.myUid()     // Catch: java.lang.Exception -> L169
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> L169
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L169
            r7[r8] = r5     // Catch: java.lang.Exception -> L169
            r5 = 0
            java.lang.Object r4 = r4.invoke(r5, r7)     // Catch: java.lang.Exception -> L169
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Exception -> L169
            r4.intValue()     // Catch: java.lang.Exception -> L169
            java.util.HashSet r7 = new java.util.HashSet     // Catch: java.lang.Exception -> L169
            r7.<init>()     // Catch: java.lang.Exception -> L169
            java.util.HashSet r9 = new java.util.HashSet     // Catch: java.lang.Exception -> L169
            r9.<init>()     // Catch: java.lang.Exception -> L169
            java.util.HashSet r10 = new java.util.HashSet     // Catch: java.lang.Exception -> L169
            r10.<init>()     // Catch: java.lang.Exception -> L169
            java.lang.String r11 = "android.provider.Settings$Global"
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch: java.lang.Exception -> L5a
            java.lang.String r12 = "MOVED_TO_SECURE"
            java.lang.reflect.Field r12 = r11.getDeclaredField(r12)     // Catch: java.lang.Exception -> L5a
            r12.setAccessible(r6)     // Catch: java.lang.Exception -> L5a
            java.lang.Object r11 = r12.get(r11)     // Catch: java.lang.Exception -> L5a
            java.util.HashSet r11 = (java.util.HashSet) r11     // Catch: java.lang.Exception -> L5a
            r7 = r11
        L5a:
            java.lang.Class r11 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L6e
            java.lang.String r12 = "MOVED_TO_LOCK_SETTINGS"
            java.lang.reflect.Field r12 = r11.getDeclaredField(r12)     // Catch: java.lang.Exception -> L6e
            r12.setAccessible(r6)     // Catch: java.lang.Exception -> L6e
            java.lang.Object r11 = r12.get(r11)     // Catch: java.lang.Exception -> L6e
            java.util.HashSet r11 = (java.util.HashSet) r11     // Catch: java.lang.Exception -> L6e
            r9 = r11
        L6e:
            java.lang.Class r11 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L82
            java.lang.String r12 = "MOVED_TO_GLOBAL"
            java.lang.reflect.Field r12 = r11.getDeclaredField(r12)     // Catch: java.lang.Exception -> L82
            r12.setAccessible(r6)     // Catch: java.lang.Exception -> L82
            java.lang.Object r11 = r12.get(r11)     // Catch: java.lang.Exception -> L82
            java.util.HashSet r11 = (java.util.HashSet) r11     // Catch: java.lang.Exception -> L82
            r10 = r11
        L82:
            boolean r7 = r7.contains(r0)     // Catch: java.lang.Exception -> L169
            r11 = 3
            r12 = 2
            java.lang.Class<android.content.ContentResolver> r13 = android.content.ContentResolver.class
            java.lang.String r14 = "getStringForUser"
            java.lang.Class<java.lang.String> r15 = java.lang.String.class
            if (r7 == 0) goto L94
        L90:
            r18 = 0
            goto L137
        L94:
            boolean r7 = r10.contains(r0)     // Catch: java.lang.Exception -> L169
            if (r7 == 0) goto Lbe
            java.lang.String r1 = "android.provider.Global"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L169
            java.lang.Class[] r7 = new java.lang.Class[r11]     // Catch: java.lang.Exception -> L169
            r7[r8] = r13     // Catch: java.lang.Exception -> L169
            r7[r6] = r15     // Catch: java.lang.Exception -> L169
            r7[r12] = r2     // Catch: java.lang.Exception -> L169
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r14, r7)     // Catch: java.lang.Exception -> L169
            r1.setAccessible(r6)     // Catch: java.lang.Exception -> L169
            java.lang.Object[] r2 = new java.lang.Object[r11]     // Catch: java.lang.Exception -> L169
            r2[r8] = r3     // Catch: java.lang.Exception -> L169
            r2[r6] = r0     // Catch: java.lang.Exception -> L169
            r2[r12] = r4     // Catch: java.lang.Exception -> L169
            java.lang.Object r0 = r1.invoke(r5, r2)     // Catch: java.lang.Exception -> L169
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L169
            return r0
        Lbe:
            boolean r7 = r9.contains(r0)     // Catch: java.lang.Exception -> L169
            if (r7 == 0) goto L90
            java.lang.String r7 = "android.os.ServiceManager"
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch: java.lang.Exception -> L169
            java.lang.String r10 = "getService"
            java.lang.reflect.Method r7 = r7.getDeclaredMethod(r10, r5)     // Catch: java.lang.Exception -> L169
            r7.setAccessible(r6)     // Catch: java.lang.Exception -> L169
            java.lang.Object[] r10 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L169
            java.lang.String r16 = "lock_settings"
            r10[r8] = r16     // Catch: java.lang.Exception -> L169
            java.lang.Object r7 = r7.invoke(r5, r10)     // Catch: java.lang.Exception -> L169
            android.os.IBinder r7 = (android.os.IBinder) r7     // Catch: java.lang.Exception -> L169
            java.lang.String r10 = "com.android.internal.widget.ILockSettings$Stub"
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch: java.lang.Exception -> L169
            r18 = 0
            java.lang.String r8 = "asInterface"
            r16 = 2
            java.lang.Class[] r12 = new java.lang.Class[r6]     // Catch: java.lang.Exception -> L169
            java.lang.Class<android.os.IBinder> r17 = android.os.IBinder.class
            r12[r18] = r17     // Catch: java.lang.Exception -> L169
            java.lang.reflect.Method r8 = r10.getDeclaredMethod(r8, r12)     // Catch: java.lang.Exception -> L169
            r8.setAccessible(r6)     // Catch: java.lang.Exception -> L169
            java.lang.Object[] r10 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L169
            r10[r18] = r7     // Catch: java.lang.Exception -> L169
            java.lang.Object r7 = r8.invoke(r5, r10)     // Catch: java.lang.Exception -> L169
            int r8 = android.os.Process.myUid()     // Catch: java.lang.Exception -> L169
            r10 = 1000(0x3e8, float:1.401E-42)
            if (r8 != r10) goto L10a
            r8 = 1
            goto L10b
        L10a:
            r8 = 0
        L10b:
            boolean r9 = r9.contains(r0)     // Catch: java.lang.Exception -> L169
            if (r9 == 0) goto L137
            if (r7 == 0) goto L137
            if (r8 != 0) goto L137
            java.lang.Class r1 = r7.getClass()     // Catch: java.lang.Exception -> L169
            java.lang.String r3 = "getString"
            java.lang.Class[] r5 = new java.lang.Class[r11]     // Catch: java.lang.Exception -> L169
            r5[r18] = r15     // Catch: java.lang.Exception -> L169
            r5[r6] = r15     // Catch: java.lang.Exception -> L169
            r5[r16] = r2     // Catch: java.lang.Exception -> L169
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r3, r5)     // Catch: java.lang.Exception -> L169
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L169
            java.lang.String r3 = "0"
            r2[r18] = r3     // Catch: java.lang.Exception -> L169
            r2[r6] = r4     // Catch: java.lang.Exception -> L169
            java.lang.Object r0 = r1.invoke(r0, r2)     // Catch: java.lang.Exception -> L169
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L169
            return r0
        L137:
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L169
            java.lang.String r7 = "sNameValueCache"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r7)     // Catch: java.lang.Exception -> L169
            r1.setAccessible(r6)     // Catch: java.lang.Exception -> L169
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Exception -> L169
            java.lang.Class r5 = r1.getClass()     // Catch: java.lang.Exception -> L169
            java.lang.Class[] r7 = new java.lang.Class[r11]     // Catch: java.lang.Exception -> L169
            r7[r18] = r13     // Catch: java.lang.Exception -> L169
            r7[r6] = r15     // Catch: java.lang.Exception -> L169
            r16 = 2
            r7[r16] = r2     // Catch: java.lang.Exception -> L169
            java.lang.reflect.Method r2 = r5.getDeclaredMethod(r14, r7)     // Catch: java.lang.Exception -> L169
            java.lang.Object[] r5 = new java.lang.Object[r11]     // Catch: java.lang.Exception -> L169
            r5[r18] = r3     // Catch: java.lang.Exception -> L169
            r5[r6] = r0     // Catch: java.lang.Exception -> L169
            r5[r16] = r4     // Catch: java.lang.Exception -> L169
            java.lang.Object r0 = r2.invoke(r1, r5)     // Catch: java.lang.Exception -> L169
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L169
            return r0
        L169:
            java.lang.String r0 = ""
            return r0
    }
}
