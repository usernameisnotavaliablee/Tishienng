package com.bytedance.pangle.transform;

@androidx.annotation.Keep
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class ZeusProviderTransform {
    public ZeusProviderTransform() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.os.Bundle call(java.lang.Object r8, android.net.Uri r9, java.lang.String r10, java.lang.String r11, android.os.Bundle r12, java.lang.String r13) {
            boolean r0 = r8 instanceof android.content.ContentResolver
            if (r0 == 0) goto L15
            com.bytedance.pangle.provider.ContentProviderManager r1 = com.bytedance.pangle.provider.ContentProviderManager.getInstance()
            r2 = r8
            android.content.ContentResolver r2 = (android.content.ContentResolver) r2
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            android.os.Bundle r8 = r1.call(r2, r3, r4, r5, r6, r7)
            return r8
        L15:
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            java.lang.String r9 = "call"
            r10 = 4
            java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch: java.lang.Exception -> L41
            r12 = 0
            r11[r12] = r3     // Catch: java.lang.Exception -> L41
            r13 = 1
            r11[r13] = r4     // Catch: java.lang.Exception -> L41
            r0 = 2
            r11[r0] = r5     // Catch: java.lang.Exception -> L41
            r1 = 3
            r11[r1] = r6     // Catch: java.lang.Exception -> L41
            java.lang.Class[] r10 = new java.lang.Class[r10]     // Catch: java.lang.Exception -> L41
            java.lang.Class<android.net.Uri> r2 = android.net.Uri.class
            r10[r12] = r2     // Catch: java.lang.Exception -> L41
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            r10[r13] = r12     // Catch: java.lang.Exception -> L41
            r10[r0] = r12     // Catch: java.lang.Exception -> L41
            java.lang.Class<android.os.Bundle> r12 = android.os.Bundle.class
            r10[r1] = r12     // Catch: java.lang.Exception -> L41
            java.lang.Object r8 = com.bytedance.pangle.util.MethodUtils.invokeMethod(r8, r9, r11, r10)     // Catch: java.lang.Exception -> L41
            android.os.Bundle r8 = (android.os.Bundle) r8     // Catch: java.lang.Exception -> L41
            return r8
        L41:
            r0 = move-exception
            r8 = r0
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            r9.<init>(r8)
            throw r9
    }

    public static android.os.Bundle call(java.lang.Object r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, android.os.Bundle r12, java.lang.String r13) {
            boolean r0 = r8 instanceof android.content.ContentResolver
            if (r0 == 0) goto L15
            com.bytedance.pangle.provider.ContentProviderManager r1 = com.bytedance.pangle.provider.ContentProviderManager.getInstance()
            r2 = r8
            android.content.ContentResolver r2 = (android.content.ContentResolver) r2
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            android.os.Bundle r8 = r1.call(r2, r3, r4, r5, r6, r7)
            return r8
        L15:
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            java.lang.String r9 = "call"
            r10 = 4
            java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch: java.lang.Exception -> L3f
            r12 = 0
            r11[r12] = r3     // Catch: java.lang.Exception -> L3f
            r13 = 1
            r11[r13] = r4     // Catch: java.lang.Exception -> L3f
            r0 = 2
            r11[r0] = r5     // Catch: java.lang.Exception -> L3f
            r1 = 3
            r11[r1] = r6     // Catch: java.lang.Exception -> L3f
            java.lang.Class[] r10 = new java.lang.Class[r10]     // Catch: java.lang.Exception -> L3f
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r10[r12] = r2     // Catch: java.lang.Exception -> L3f
            r10[r13] = r2     // Catch: java.lang.Exception -> L3f
            r10[r0] = r2     // Catch: java.lang.Exception -> L3f
            java.lang.Class<android.os.Bundle> r12 = android.os.Bundle.class
            r10[r1] = r12     // Catch: java.lang.Exception -> L3f
            java.lang.Object r8 = com.bytedance.pangle.util.MethodUtils.invokeMethod(r8, r9, r11, r10)     // Catch: java.lang.Exception -> L3f
            android.os.Bundle r8 = (android.os.Bundle) r8     // Catch: java.lang.Exception -> L3f
            return r8
        L3f:
            r0 = move-exception
            r8 = r0
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            r9.<init>(r8)
            throw r9
    }

    public static int delete(java.lang.Object r3, android.net.Uri r4, android.os.Bundle r5, java.lang.String r6) {
            boolean r0 = r3 instanceof android.content.ContentResolver
            if (r0 == 0) goto Lf
            com.bytedance.pangle.provider.ContentProviderManager r0 = com.bytedance.pangle.provider.ContentProviderManager.getInstance()
            android.content.ContentResolver r3 = (android.content.ContentResolver) r3
            int r3 = r0.delete(r3, r4, r5, r6)
            return r3
        Lf:
            java.lang.String r6 = "delete"
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L2f
            r2 = 0
            r1[r2] = r4     // Catch: java.lang.Exception -> L2f
            r4 = 1
            r1[r4] = r5     // Catch: java.lang.Exception -> L2f
            java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> L2f
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            r5[r2] = r0     // Catch: java.lang.Exception -> L2f
            java.lang.Class<android.os.Bundle> r0 = android.os.Bundle.class
            r5[r4] = r0     // Catch: java.lang.Exception -> L2f
            java.lang.Object r3 = com.bytedance.pangle.util.MethodUtils.invokeMethod(r3, r6, r1, r5)     // Catch: java.lang.Exception -> L2f
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Exception -> L2f
            int r3 = r3.intValue()     // Catch: java.lang.Exception -> L2f
            return r3
        L2f:
            r3 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r4.<init>(r3)
            throw r4
    }

    public static int delete(java.lang.Object r7, android.net.Uri r8, java.lang.String r9, java.lang.String[] r10, java.lang.String r11) {
            boolean r0 = r7 instanceof android.content.ContentResolver
            if (r0 == 0) goto L14
            com.bytedance.pangle.provider.ContentProviderManager r1 = com.bytedance.pangle.provider.ContentProviderManager.getInstance()
            r2 = r7
            android.content.ContentResolver r2 = (android.content.ContentResolver) r2
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            int r7 = r1.delete(r2, r3, r4, r5, r6)
            return r7
        L14:
            r3 = r8
            r4 = r9
            r5 = r10
            java.lang.String r8 = "delete"
            r9 = 3
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch: java.lang.Exception -> L3e
            r11 = 0
            r10[r11] = r3     // Catch: java.lang.Exception -> L3e
            r0 = 1
            r10[r0] = r4     // Catch: java.lang.Exception -> L3e
            r1 = 2
            r10[r1] = r5     // Catch: java.lang.Exception -> L3e
            java.lang.Class[] r9 = new java.lang.Class[r9]     // Catch: java.lang.Exception -> L3e
            java.lang.Class<android.net.Uri> r2 = android.net.Uri.class
            r9[r11] = r2     // Catch: java.lang.Exception -> L3e
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            r9[r0] = r11     // Catch: java.lang.Exception -> L3e
            java.lang.Class<java.lang.String[]> r11 = java.lang.String[].class
            r9[r1] = r11     // Catch: java.lang.Exception -> L3e
            java.lang.Object r7 = com.bytedance.pangle.util.MethodUtils.invokeMethod(r7, r8, r10, r9)     // Catch: java.lang.Exception -> L3e
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch: java.lang.Exception -> L3e
            int r7 = r7.intValue()     // Catch: java.lang.Exception -> L3e
            return r7
        L3e:
            r0 = move-exception
            r7 = r0
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            r8.<init>(r7)
            throw r8
    }

    public static java.lang.String getType(java.lang.Object r3, android.net.Uri r4, java.lang.String r5) {
            boolean r0 = r3 instanceof android.content.ContentResolver
            if (r0 == 0) goto Lf
            com.bytedance.pangle.provider.ContentProviderManager r0 = com.bytedance.pangle.provider.ContentProviderManager.getInstance()
            android.content.ContentResolver r3 = (android.content.ContentResolver) r3
            java.lang.String r3 = r0.getType(r3, r4, r5)
            return r3
        Lf:
            java.lang.String r5 = "getType"
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L24
            r2 = 0
            r1[r2] = r4     // Catch: java.lang.Exception -> L24
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> L24
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            r4[r2] = r0     // Catch: java.lang.Exception -> L24
            java.lang.Object r3 = com.bytedance.pangle.util.MethodUtils.invokeMethod(r3, r5, r1, r4)     // Catch: java.lang.Exception -> L24
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L24
            return r3
        L24:
            r3 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r4.<init>(r3)
            throw r4
    }

    public static android.net.Uri insert(java.lang.Object r7, android.net.Uri r8, android.content.ContentValues r9, android.os.Bundle r10, java.lang.String r11) {
            boolean r0 = r7 instanceof android.content.ContentResolver
            if (r0 == 0) goto L14
            com.bytedance.pangle.provider.ContentProviderManager r1 = com.bytedance.pangle.provider.ContentProviderManager.getInstance()
            r2 = r7
            android.content.ContentResolver r2 = (android.content.ContentResolver) r2
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            android.net.Uri r7 = r1.insert(r2, r3, r4, r5, r6)
            return r7
        L14:
            r3 = r8
            r4 = r9
            r5 = r10
            java.lang.String r8 = "insert"
            r9 = 3
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch: java.lang.Exception -> L3a
            r11 = 0
            r10[r11] = r3     // Catch: java.lang.Exception -> L3a
            r0 = 1
            r10[r0] = r4     // Catch: java.lang.Exception -> L3a
            r1 = 2
            r10[r1] = r5     // Catch: java.lang.Exception -> L3a
            java.lang.Class[] r9 = new java.lang.Class[r9]     // Catch: java.lang.Exception -> L3a
            java.lang.Class<android.net.Uri> r2 = android.net.Uri.class
            r9[r11] = r2     // Catch: java.lang.Exception -> L3a
            java.lang.Class<android.content.ContentValues> r11 = android.content.ContentValues.class
            r9[r0] = r11     // Catch: java.lang.Exception -> L3a
            java.lang.Class<android.os.Bundle> r11 = android.os.Bundle.class
            r9[r1] = r11     // Catch: java.lang.Exception -> L3a
            java.lang.Object r7 = com.bytedance.pangle.util.MethodUtils.invokeMethod(r7, r8, r10, r9)     // Catch: java.lang.Exception -> L3a
            android.net.Uri r7 = (android.net.Uri) r7     // Catch: java.lang.Exception -> L3a
            return r7
        L3a:
            r0 = move-exception
            r7 = r0
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            r8.<init>(r7)
            throw r8
    }

    public static android.net.Uri insert(java.lang.Object r3, android.net.Uri r4, android.content.ContentValues r5, java.lang.String r6) {
            boolean r0 = r3 instanceof android.content.ContentResolver
            if (r0 == 0) goto Lf
            com.bytedance.pangle.provider.ContentProviderManager r0 = com.bytedance.pangle.provider.ContentProviderManager.getInstance()
            android.content.ContentResolver r3 = (android.content.ContentResolver) r3
            android.net.Uri r3 = r0.insert(r3, r4, r5, r6)
            return r3
        Lf:
            java.lang.String r6 = "insert"
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L2b
            r2 = 0
            r1[r2] = r4     // Catch: java.lang.Exception -> L2b
            r4 = 1
            r1[r4] = r5     // Catch: java.lang.Exception -> L2b
            java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> L2b
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            r5[r2] = r0     // Catch: java.lang.Exception -> L2b
            java.lang.Class<android.content.ContentValues> r0 = android.content.ContentValues.class
            r5[r4] = r0     // Catch: java.lang.Exception -> L2b
            java.lang.Object r3 = com.bytedance.pangle.util.MethodUtils.invokeMethod(r3, r6, r1, r5)     // Catch: java.lang.Exception -> L2b
            android.net.Uri r3 = (android.net.Uri) r3     // Catch: java.lang.Exception -> L2b
            return r3
        L2b:
            r3 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r4.<init>(r3)
            throw r4
    }

    @androidx.annotation.RequiresApi(api = 24)
    public static void notifyChange(java.lang.Object r3, android.net.Uri r4, android.database.ContentObserver r5, int r6, java.lang.String r7) {
            boolean r0 = r3 instanceof android.content.ContentResolver
            if (r0 == 0) goto Le
            android.content.ContentResolver r3 = (android.content.ContentResolver) r3
            android.net.Uri r4 = com.bytedance.pangle.provider.a.a(r4, r7)
            com.bytedance.pangle.transform.b.a(r3, r4, r5, r6)
            return
        Le:
            java.lang.String r7 = "notifyChange"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L32
            r0 = 3
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L32
            r2 = 0
            r1[r2] = r4     // Catch: java.lang.Exception -> L32
            r4 = 1
            r1[r4] = r5     // Catch: java.lang.Exception -> L32
            r5 = 2
            r1[r5] = r6     // Catch: java.lang.Exception -> L32
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> L32
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            r6[r2] = r0     // Catch: java.lang.Exception -> L32
            java.lang.Class<android.database.ContentObserver> r0 = android.database.ContentObserver.class
            r6[r4] = r0     // Catch: java.lang.Exception -> L32
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L32
            r6[r5] = r4     // Catch: java.lang.Exception -> L32
            com.bytedance.pangle.util.MethodUtils.invokeMethod(r3, r7, r1, r6)     // Catch: java.lang.Exception -> L32
            return
        L32:
            r3 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r4.<init>(r3)
            throw r4
    }

    public static void notifyChange(java.lang.Object r3, android.net.Uri r4, android.database.ContentObserver r5, java.lang.String r6) {
            boolean r0 = r3 instanceof android.content.ContentResolver
            if (r0 == 0) goto Le
            android.content.ContentResolver r3 = (android.content.ContentResolver) r3
            android.net.Uri r4 = com.bytedance.pangle.provider.a.a(r4, r6)
            r3.notifyChange(r4, r5)
            return
        Le:
            java.lang.String r6 = "notifyChange"
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L27
            r2 = 0
            r1[r2] = r4     // Catch: java.lang.Exception -> L27
            r4 = 1
            r1[r4] = r5     // Catch: java.lang.Exception -> L27
            java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> L27
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            r5[r2] = r0     // Catch: java.lang.Exception -> L27
            java.lang.Class<android.database.ContentObserver> r0 = android.database.ContentObserver.class
            r5[r4] = r0     // Catch: java.lang.Exception -> L27
            com.bytedance.pangle.util.MethodUtils.invokeMethod(r3, r6, r1, r5)     // Catch: java.lang.Exception -> L27
            return
        L27:
            r3 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r4.<init>(r3)
            throw r4
    }

    public static void notifyChange(java.lang.Object r3, android.net.Uri r4, android.database.ContentObserver r5, boolean r6, java.lang.String r7) {
            boolean r0 = r3 instanceof android.content.ContentResolver
            if (r0 == 0) goto Le
            android.content.ContentResolver r3 = (android.content.ContentResolver) r3
            android.net.Uri r4 = com.bytedance.pangle.provider.a.a(r4, r7)
            r3.notifyChange(r4, r5, r6)
            return
        Le:
            java.lang.String r7 = "notifyChange"
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Exception -> L32
            r0 = 3
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L32
            r2 = 0
            r1[r2] = r4     // Catch: java.lang.Exception -> L32
            r4 = 1
            r1[r4] = r5     // Catch: java.lang.Exception -> L32
            r5 = 2
            r1[r5] = r6     // Catch: java.lang.Exception -> L32
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> L32
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            r6[r2] = r0     // Catch: java.lang.Exception -> L32
            java.lang.Class<android.database.ContentObserver> r0 = android.database.ContentObserver.class
            r6[r4] = r0     // Catch: java.lang.Exception -> L32
            java.lang.Class r4 = java.lang.Boolean.TYPE     // Catch: java.lang.Exception -> L32
            r6[r5] = r4     // Catch: java.lang.Exception -> L32
            com.bytedance.pangle.util.MethodUtils.invokeMethod(r3, r7, r1, r6)     // Catch: java.lang.Exception -> L32
            return
        L32:
            r3 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r4.<init>(r3)
            throw r4
    }

    @androidx.annotation.RequiresApi(api = 30)
    public static void notifyChange(java.lang.Object r3, java.util.Collection<android.net.Uri> r4, android.database.ContentObserver r5, int r6, java.lang.String r7) {
            boolean r0 = r3 instanceof android.content.ContentResolver
            if (r0 == 0) goto L27
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        Ld:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r4.next()
            android.net.Uri r1 = (android.net.Uri) r1
            android.net.Uri r1 = com.bytedance.pangle.provider.a.a(r1, r7)
            r0.add(r1)
            goto Ld
        L21:
            android.content.ContentResolver r3 = (android.content.ContentResolver) r3
            com.bytedance.pangle.transform.a.a(r3, r0, r5, r6)
            return
        L27:
            java.lang.String r7 = "notifyChange"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L4b
            r0 = 3
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L4b
            r2 = 0
            r1[r2] = r4     // Catch: java.lang.Exception -> L4b
            r4 = 1
            r1[r4] = r5     // Catch: java.lang.Exception -> L4b
            r5 = 2
            r1[r5] = r6     // Catch: java.lang.Exception -> L4b
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> L4b
            java.lang.Class<java.util.Collection> r0 = java.util.Collection.class
            r6[r2] = r0     // Catch: java.lang.Exception -> L4b
            java.lang.Class<android.database.ContentObserver> r0 = android.database.ContentObserver.class
            r6[r4] = r0     // Catch: java.lang.Exception -> L4b
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L4b
            r6[r5] = r4     // Catch: java.lang.Exception -> L4b
            com.bytedance.pangle.util.MethodUtils.invokeMethod(r3, r7, r1, r6)     // Catch: java.lang.Exception -> L4b
            return
        L4b:
            r3 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r4.<init>(r3)
            throw r4
    }

    @androidx.annotation.RequiresApi(api = 26)
    public static android.database.Cursor query(java.lang.Object r8, android.net.Uri r9, java.lang.String[] r10, android.os.Bundle r11, android.os.CancellationSignal r12, java.lang.String r13) {
            boolean r0 = r8 instanceof android.content.ContentResolver
            if (r0 == 0) goto L15
            com.bytedance.pangle.provider.ContentProviderManager r1 = com.bytedance.pangle.provider.ContentProviderManager.getInstance()
            r2 = r8
            android.content.ContentResolver r2 = (android.content.ContentResolver) r2
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6, r7)
            return r8
        L15:
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            java.lang.String r9 = "query"
            r10 = 4
            java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch: java.lang.Exception -> L43
            r12 = 0
            r11[r12] = r3     // Catch: java.lang.Exception -> L43
            r13 = 1
            r11[r13] = r4     // Catch: java.lang.Exception -> L43
            r0 = 2
            r11[r0] = r5     // Catch: java.lang.Exception -> L43
            r1 = 3
            r11[r1] = r6     // Catch: java.lang.Exception -> L43
            java.lang.Class[] r10 = new java.lang.Class[r10]     // Catch: java.lang.Exception -> L43
            java.lang.Class<android.net.Uri> r2 = android.net.Uri.class
            r10[r12] = r2     // Catch: java.lang.Exception -> L43
            java.lang.Class<java.lang.String[]> r12 = java.lang.String[].class
            r10[r13] = r12     // Catch: java.lang.Exception -> L43
            java.lang.Class<android.os.Bundle> r12 = android.os.Bundle.class
            r10[r0] = r12     // Catch: java.lang.Exception -> L43
            java.lang.Class<android.os.CancellationSignal> r12 = android.os.CancellationSignal.class
            r10[r1] = r12     // Catch: java.lang.Exception -> L43
            java.lang.Object r8 = com.bytedance.pangle.util.MethodUtils.invokeMethod(r8, r9, r11, r10)     // Catch: java.lang.Exception -> L43
            android.database.Cursor r8 = (android.database.Cursor) r8     // Catch: java.lang.Exception -> L43
            return r8
        L43:
            r0 = move-exception
            r8 = r0
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            r9.<init>(r8)
            throw r9
    }

    public static android.database.Cursor query(java.lang.Object r10, android.net.Uri r11, java.lang.String[] r12, java.lang.String r13, java.lang.String[] r14, java.lang.String r15, android.os.CancellationSignal r16, java.lang.String r17) {
            boolean r0 = r10 instanceof android.content.ContentResolver
            if (r0 == 0) goto L19
            com.bytedance.pangle.provider.ContentProviderManager r1 = com.bytedance.pangle.provider.ContentProviderManager.getInstance()
            r2 = r10
            android.content.ContentResolver r2 = (android.content.ContentResolver) r2
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            android.database.Cursor r10 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
        L19:
            java.lang.String r0 = "query"
            r1 = 6
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L4d
            r3 = 0
            r2[r3] = r11     // Catch: java.lang.Exception -> L4d
            r11 = 1
            r2[r11] = r12     // Catch: java.lang.Exception -> L4d
            r12 = 2
            r2[r12] = r13     // Catch: java.lang.Exception -> L4d
            r13 = 3
            r2[r13] = r14     // Catch: java.lang.Exception -> L4d
            r14 = 4
            r2[r14] = r15     // Catch: java.lang.Exception -> L4d
            r4 = 5
            r2[r4] = r16     // Catch: java.lang.Exception -> L4d
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L4d
            java.lang.Class<android.net.Uri> r5 = android.net.Uri.class
            r1[r3] = r5     // Catch: java.lang.Exception -> L4d
            java.lang.Class<java.lang.String[]> r3 = java.lang.String[].class
            r1[r11] = r3     // Catch: java.lang.Exception -> L4d
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            r1[r12] = r11     // Catch: java.lang.Exception -> L4d
            r1[r13] = r3     // Catch: java.lang.Exception -> L4d
            r1[r14] = r11     // Catch: java.lang.Exception -> L4d
            java.lang.Class<android.os.CancellationSignal> r11 = android.os.CancellationSignal.class
            r1[r4] = r11     // Catch: java.lang.Exception -> L4d
            java.lang.Object r10 = com.bytedance.pangle.util.MethodUtils.invokeMethod(r10, r0, r2, r1)     // Catch: java.lang.Exception -> L4d
            android.database.Cursor r10 = (android.database.Cursor) r10     // Catch: java.lang.Exception -> L4d
            return r10
        L4d:
            r0 = move-exception
            r10 = r0
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            r11.<init>(r10)
            throw r11
    }

    public static android.database.Cursor query(java.lang.Object r9, android.net.Uri r10, java.lang.String[] r11, java.lang.String r12, java.lang.String[] r13, java.lang.String r14, java.lang.String r15) {
            boolean r0 = r9 instanceof android.content.ContentResolver
            if (r0 == 0) goto L16
            com.bytedance.pangle.provider.ContentProviderManager r1 = com.bytedance.pangle.provider.ContentProviderManager.getInstance()
            r2 = r9
            android.content.ContentResolver r2 = (android.content.ContentResolver) r2
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            android.database.Cursor r9 = r1.query(r2, r3, r4, r5, r6, r7, r8)
            return r9
        L16:
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            java.lang.String r10 = "query"
            r11 = 5
            java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch: java.lang.Exception -> L48
            r13 = 0
            r12[r13] = r3     // Catch: java.lang.Exception -> L48
            r14 = 1
            r12[r14] = r4     // Catch: java.lang.Exception -> L48
            r15 = 2
            r12[r15] = r5     // Catch: java.lang.Exception -> L48
            r0 = 3
            r12[r0] = r6     // Catch: java.lang.Exception -> L48
            r1 = 4
            r12[r1] = r7     // Catch: java.lang.Exception -> L48
            java.lang.Class[] r11 = new java.lang.Class[r11]     // Catch: java.lang.Exception -> L48
            java.lang.Class<android.net.Uri> r2 = android.net.Uri.class
            r11[r13] = r2     // Catch: java.lang.Exception -> L48
            java.lang.Class<java.lang.String[]> r13 = java.lang.String[].class
            r11[r14] = r13     // Catch: java.lang.Exception -> L48
            java.lang.Class<java.lang.String> r14 = java.lang.String.class
            r11[r15] = r14     // Catch: java.lang.Exception -> L48
            r11[r0] = r13     // Catch: java.lang.Exception -> L48
            r11[r1] = r14     // Catch: java.lang.Exception -> L48
            java.lang.Object r9 = com.bytedance.pangle.util.MethodUtils.invokeMethod(r9, r10, r12, r11)     // Catch: java.lang.Exception -> L48
            android.database.Cursor r9 = (android.database.Cursor) r9     // Catch: java.lang.Exception -> L48
            return r9
        L48:
            r0 = move-exception
            r9 = r0
            java.lang.RuntimeException r10 = new java.lang.RuntimeException
            r10.<init>(r9)
            throw r10
    }

    public static void registerContentObserver(java.lang.Object r3, android.net.Uri r4, boolean r5, android.database.ContentObserver r6, java.lang.String r7) {
            boolean r0 = r3 instanceof android.content.ContentResolver
            if (r0 == 0) goto Le
            android.content.ContentResolver r3 = (android.content.ContentResolver) r3
            android.net.Uri r4 = com.bytedance.pangle.provider.a.a(r4, r7)
            r3.registerContentObserver(r4, r5, r6)
            return
        Le:
            java.lang.String r7 = "registerContentObserver"
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Exception -> L32
            r0 = 3
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L32
            r2 = 0
            r1[r2] = r4     // Catch: java.lang.Exception -> L32
            r4 = 1
            r1[r4] = r5     // Catch: java.lang.Exception -> L32
            r5 = 2
            r1[r5] = r6     // Catch: java.lang.Exception -> L32
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> L32
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            r6[r2] = r0     // Catch: java.lang.Exception -> L32
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch: java.lang.Exception -> L32
            r6[r4] = r0     // Catch: java.lang.Exception -> L32
            java.lang.Class<android.database.ContentObserver> r4 = android.database.ContentObserver.class
            r6[r5] = r4     // Catch: java.lang.Exception -> L32
            com.bytedance.pangle.util.MethodUtils.invokeMethod(r3, r7, r1, r6)     // Catch: java.lang.Exception -> L32
            return
        L32:
            r3 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r4.<init>(r3)
            throw r4
    }

    public static void unregisterContentObserver(java.lang.Object r3, android.database.ContentObserver r4, java.lang.String r5) {
            boolean r5 = r3 instanceof android.content.ContentResolver
            if (r5 == 0) goto La
            android.content.ContentResolver r3 = (android.content.ContentResolver) r3
            r3.unregisterContentObserver(r4)
            return
        La:
            java.lang.String r5 = "unregisterContentObserver"
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L1c
            r2 = 0
            r1[r2] = r4     // Catch: java.lang.Exception -> L1c
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> L1c
            java.lang.Class<android.database.ContentObserver> r0 = android.database.ContentObserver.class
            r4[r2] = r0     // Catch: java.lang.Exception -> L1c
            com.bytedance.pangle.util.MethodUtils.invokeMethod(r3, r5, r1, r4)     // Catch: java.lang.Exception -> L1c
            return
        L1c:
            r3 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r4.<init>(r3)
            throw r4
    }

    public static int update(java.lang.Object r7, android.net.Uri r8, android.content.ContentValues r9, android.os.Bundle r10, java.lang.String r11) {
            boolean r0 = r7 instanceof android.content.ContentResolver
            if (r0 == 0) goto L14
            com.bytedance.pangle.provider.ContentProviderManager r1 = com.bytedance.pangle.provider.ContentProviderManager.getInstance()
            r2 = r7
            android.content.ContentResolver r2 = (android.content.ContentResolver) r2
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            int r7 = r1.update(r2, r3, r4, r5, r6)
            return r7
        L14:
            r3 = r8
            r4 = r9
            r5 = r10
            java.lang.String r8 = "update"
            r9 = 3
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch: java.lang.Exception -> L3e
            r11 = 0
            r10[r11] = r3     // Catch: java.lang.Exception -> L3e
            r0 = 1
            r10[r0] = r4     // Catch: java.lang.Exception -> L3e
            r1 = 2
            r10[r1] = r5     // Catch: java.lang.Exception -> L3e
            java.lang.Class[] r9 = new java.lang.Class[r9]     // Catch: java.lang.Exception -> L3e
            java.lang.Class<android.net.Uri> r2 = android.net.Uri.class
            r9[r11] = r2     // Catch: java.lang.Exception -> L3e
            java.lang.Class<android.content.ContentValues> r11 = android.content.ContentValues.class
            r9[r0] = r11     // Catch: java.lang.Exception -> L3e
            java.lang.Class<android.os.Bundle> r11 = android.os.Bundle.class
            r9[r1] = r11     // Catch: java.lang.Exception -> L3e
            java.lang.Object r7 = com.bytedance.pangle.util.MethodUtils.invokeMethod(r7, r8, r10, r9)     // Catch: java.lang.Exception -> L3e
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch: java.lang.Exception -> L3e
            int r7 = r7.intValue()     // Catch: java.lang.Exception -> L3e
            return r7
        L3e:
            r0 = move-exception
            r7 = r0
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            r8.<init>(r7)
            throw r8
    }

    public static int update(java.lang.Object r8, android.net.Uri r9, android.content.ContentValues r10, java.lang.String r11, java.lang.String[] r12, java.lang.String r13) {
            boolean r0 = r8 instanceof android.content.ContentResolver
            if (r0 == 0) goto L15
            com.bytedance.pangle.provider.ContentProviderManager r1 = com.bytedance.pangle.provider.ContentProviderManager.getInstance()
            r2 = r8
            android.content.ContentResolver r2 = (android.content.ContentResolver) r2
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            int r8 = r1.update(r2, r3, r4, r5, r6, r7)
            return r8
        L15:
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            java.lang.String r9 = "update"
            r10 = 4
            java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch: java.lang.Exception -> L47
            r12 = 0
            r11[r12] = r3     // Catch: java.lang.Exception -> L47
            r13 = 1
            r11[r13] = r4     // Catch: java.lang.Exception -> L47
            r0 = 2
            r11[r0] = r5     // Catch: java.lang.Exception -> L47
            r1 = 3
            r11[r1] = r6     // Catch: java.lang.Exception -> L47
            java.lang.Class[] r10 = new java.lang.Class[r10]     // Catch: java.lang.Exception -> L47
            java.lang.Class<android.net.Uri> r2 = android.net.Uri.class
            r10[r12] = r2     // Catch: java.lang.Exception -> L47
            java.lang.Class<android.content.ContentValues> r12 = android.content.ContentValues.class
            r10[r13] = r12     // Catch: java.lang.Exception -> L47
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            r10[r0] = r12     // Catch: java.lang.Exception -> L47
            java.lang.Class<java.lang.String[]> r12 = java.lang.String[].class
            r10[r1] = r12     // Catch: java.lang.Exception -> L47
            java.lang.Object r8 = com.bytedance.pangle.util.MethodUtils.invokeMethod(r8, r9, r11, r10)     // Catch: java.lang.Exception -> L47
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch: java.lang.Exception -> L47
            int r8 = r8.intValue()     // Catch: java.lang.Exception -> L47
            return r8
        L47:
            r0 = move-exception
            r8 = r0
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            r9.<init>(r8)
            throw r9
    }
}
