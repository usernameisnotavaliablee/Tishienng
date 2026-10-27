package com.bytedance.pangle.res;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class j {
    private static java.util.Map<java.lang.String, java.lang.Integer> j;
    private java.util.LinkedHashMap<java.lang.String, java.lang.Integer> xt;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.bytedance.pangle.res.j.j = r0
            java.util.List r0 = com.bytedance.pangle.util.qv.j()
            if (r0 == 0) goto L2e
            int r1 = r0.size()
            if (r1 <= 0) goto L2e
            java.util.Iterator r0 = r0.iterator()
        L17:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.Map<java.lang.String, java.lang.Integer> r2 = com.bytedance.pangle.res.j.j
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.put(r1, r3)
            goto L17
        L2e:
            return
    }

    public j() {
            r3 = this;
            r3.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r3.xt = r0
            android.app.Application r1 = com.bytedance.pangle.Zeus.getAppApplication()
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo()
            java.lang.String r1 = r1.sourceDir
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            return
    }

    private android.content.res.AssetManager cw(android.content.res.AssetManager r18, java.lang.String r19, boolean r20) {
            r17 = this;
            r1 = r18
            r2 = r19
            r3 = 3
            r0 = 0
            r4 = 3
        L7:
            int r5 = r4 + (-1)
            if (r4 < 0) goto L10d
            monitor-enter(r18)     // Catch: java.lang.Throwable -> L106
            r4 = 0
            r6 = 0
            r7 = 0
        Lf:
            r8 = 2
            r9 = 1
            if (r6 >= r3) goto L5e
            boolean r10 = com.bytedance.pangle.util.g.up()     // Catch: java.lang.Throwable -> L30
            if (r10 == 0) goto L33
            java.lang.String r7 = "addAssetPathNative"
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L30
            r10[r4] = r2     // Catch: java.lang.Throwable -> L30
            java.lang.Class[] r11 = new java.lang.Class[r9]     // Catch: java.lang.Throwable -> L30
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            r11[r4] = r12     // Catch: java.lang.Throwable -> L30
            java.lang.Object r7 = com.bytedance.pangle.util.MethodUtils.invokeMethod(r1, r7, r10, r11)     // Catch: java.lang.Throwable -> L30
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch: java.lang.Throwable -> L30
            int r7 = r7.intValue()     // Catch: java.lang.Throwable -> L30
            goto L59
        L30:
            r0 = move-exception
            goto L108
        L33:
            boolean r10 = com.bytedance.pangle.util.g.vl()     // Catch: java.lang.Throwable -> L30
            if (r10 == 0) goto L59
            java.lang.String r7 = "addAssetPathNative"
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r20)     // Catch: java.lang.Throwable -> L30
            java.lang.Object[] r11 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L30
            r11[r4] = r2     // Catch: java.lang.Throwable -> L30
            r11[r9] = r10     // Catch: java.lang.Throwable -> L30
            java.lang.Class[] r10 = new java.lang.Class[r8]     // Catch: java.lang.Throwable -> L30
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            r10[r4] = r12     // Catch: java.lang.Throwable -> L30
            java.lang.Class r12 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L30
            r10[r9] = r12     // Catch: java.lang.Throwable -> L30
            java.lang.Object r7 = com.bytedance.pangle.util.MethodUtils.invokeMethod(r1, r7, r11, r10)     // Catch: java.lang.Throwable -> L30
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch: java.lang.Throwable -> L30
            int r7 = r7.intValue()     // Catch: java.lang.Throwable -> L30
        L59:
            if (r7 != 0) goto L5e
            int r6 = r6 + 1
            goto Lf
        L5e:
            if (r7 != 0) goto L7e
            java.lang.String r4 = "Zeus/load_pangle"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30
            java.lang.String r8 = "AssetManagerProcessor invoke AssetManager.appendAssetPathSafely() failed, cookie = "
            r6.<init>(r8)     // Catch: java.lang.Throwable -> L30
            r6.append(r7)     // Catch: java.lang.Throwable -> L30
            java.lang.String r7 = " "
            r6.append(r7)     // Catch: java.lang.Throwable -> L30
            r6.append(r2)     // Catch: java.lang.Throwable -> L30
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L30
            com.bytedance.pangle.log.ZeusLogger.w(r4, r6)     // Catch: java.lang.Throwable -> L30
            monitor-exit(r18)     // Catch: java.lang.Throwable -> L30
            goto L10d
        L7e:
            java.lang.String r6 = "mStringBlocks"
            java.lang.Object r6 = com.bytedance.pangle.util.FieldUtils.readField(r1, r6)     // Catch: java.lang.Throwable -> L30
            if (r6 == 0) goto L8b
            int r7 = java.lang.reflect.Array.getLength(r6)     // Catch: java.lang.Throwable -> L30
            goto L8c
        L8b:
            r7 = 0
        L8c:
            java.lang.String r10 = "getStringBlockCount"
            java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L30
            java.lang.Object r10 = com.bytedance.pangle.util.MethodUtils.invokeMethod(r1, r10, r11)     // Catch: java.lang.Throwable -> L30
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch: java.lang.Throwable -> L30
            int r10 = r10.intValue()     // Catch: java.lang.Throwable -> L30
            java.lang.Class r11 = r6.getClass()     // Catch: java.lang.Throwable -> L30
            java.lang.Class r11 = r11.getComponentType()     // Catch: java.lang.Throwable -> L30
            java.lang.Object r11 = java.lang.reflect.Array.newInstance(r11, r10)     // Catch: java.lang.Throwable -> L30
            r12 = 0
        La7:
            if (r12 >= r10) goto Lf0
            if (r12 >= r7) goto Lb3
            java.lang.Object r13 = java.lang.reflect.Array.get(r6, r12)     // Catch: java.lang.Throwable -> L30
            java.lang.reflect.Array.set(r11, r12, r13)     // Catch: java.lang.Throwable -> L30
            goto Led
        Lb3:
            java.lang.String r13 = "getNativeStringBlock"
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L30
            java.lang.Object[] r15 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L30
            r15[r4] = r14     // Catch: java.lang.Throwable -> L30
            java.lang.Class[] r14 = new java.lang.Class[r9]     // Catch: java.lang.Throwable -> L30
            java.lang.Class r16 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L30
            r14[r4] = r16     // Catch: java.lang.Throwable -> L30
            java.lang.Object r13 = com.bytedance.pangle.util.MethodUtils.invokeMethod(r1, r13, r15, r14)     // Catch: java.lang.Throwable -> L30
            java.lang.Long r13 = (java.lang.Long) r13     // Catch: java.lang.Throwable -> L30
            r13.longValue()     // Catch: java.lang.Throwable -> L30
            java.lang.Class r14 = r6.getClass()     // Catch: java.lang.Throwable -> L30
            java.lang.Class r14 = r14.getComponentType()     // Catch: java.lang.Throwable -> L30
            java.lang.Object[] r15 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L30
            r15[r4] = r13     // Catch: java.lang.Throwable -> L30
            java.lang.Boolean r13 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L30
            r15[r9] = r13     // Catch: java.lang.Throwable -> L30
            java.lang.Class[] r13 = new java.lang.Class[r8]     // Catch: java.lang.Throwable -> L30
            java.lang.Class r16 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L30
            r13[r4] = r16     // Catch: java.lang.Throwable -> L30
            java.lang.Class r16 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L30
            r13[r9] = r16     // Catch: java.lang.Throwable -> L30
            java.lang.Object r13 = com.bytedance.pangle.util.MethodUtils.invokeConstructor(r14, r15, r13)     // Catch: java.lang.Throwable -> L30
            java.lang.reflect.Array.set(r11, r12, r13)     // Catch: java.lang.Throwable -> L30
        Led:
            int r12 = r12 + 1
            goto La7
        Lf0:
            java.lang.String r4 = "mStringBlocks"
            com.bytedance.pangle.util.FieldUtils.writeField(r1, r4, r11)     // Catch: java.lang.Throwable -> L30
            monitor-exit(r18)     // Catch: java.lang.Throwable -> L30
            java.lang.String r4 = "Zeus/load_pangle"
            java.lang.String r6 = "AssetManagerProcessor appendAssetPathSafely success, sourceDir = "
            java.lang.String r7 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L106
            java.lang.String r6 = r6.concat(r7)     // Catch: java.lang.Throwable -> L106
            com.bytedance.pangle.log.ZeusLogger.d(r4, r6)     // Catch: java.lang.Throwable -> L106
            goto L10d
        L106:
            r0 = move-exception
            goto L10a
        L108:
            monitor-exit(r18)     // Catch: java.lang.Throwable -> L30
            throw r0     // Catch: java.lang.Throwable -> L106
        L10a:
            r4 = r5
            goto L7
        L10d:
            if (r0 == 0) goto L133
            boolean r3 = com.bytedance.pangle.util.g.tj()
            if (r3 != 0) goto L124
            java.lang.String r3 = "Zeus/load_pangle"
            java.lang.String r4 = "AssetManagerProcessor appendAssetPathSafely failed, sourceDir = "
            java.lang.String r5 = java.lang.String.valueOf(r2)
            java.lang.String r4 = r4.concat(r5)
            com.bytedance.pangle.log.ZeusLogger.errReport(r3, r4, r0)
        L124:
            java.lang.String r3 = "Zeus/load_pangle"
            java.lang.String r4 = "AssetManagerProcessor appendAssetPathSafely failed, sourceDir = "
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = r4.concat(r2)
            com.bytedance.pangle.log.ZeusLogger.w(r3, r2, r0)
        L133:
            return r1
    }

    private android.content.res.AssetManager j(android.content.res.AssetManager r10, java.lang.String r11) {
            r9 = this;
            java.util.List r0 = com.bytedance.pangle.util.qv.j(r10)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L38
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            java.util.Map<java.lang.String, java.lang.Integer> r4 = com.bytedance.pangle.res.j.j
            boolean r4 = r4.containsKey(r3)
            if (r4 != 0) goto L12
            java.util.LinkedHashMap<java.lang.String, java.lang.Integer> r4 = r9.xt
            boolean r4 = r4.containsKey(r3)
            if (r4 != 0) goto L12
            boolean r4 = r3.equals(r11)
            if (r4 != 0) goto L12
            r1.add(r3)
            goto L12
        L38:
            java.lang.String r0 = "Zeus/load_pangle"
            java.lang.String r3 = "AssetManagerProcessor newAssetManager, runtimeAdditionalAssets path = "
            java.lang.String r4 = java.lang.String.valueOf(r11)
            java.lang.String r3 = r3.concat(r4)
            com.bytedance.pangle.log.ZeusLogger.i(r0, r3)
            r0 = 0
            java.lang.Class r3 = r10.getClass()     // Catch: java.lang.Exception -> L6a
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Exception -> L6a
            java.lang.String r4 = "android.content.res.BaiduAssetManager"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> L6a
            if (r3 == 0) goto L6d
            java.lang.String r3 = "android.content.res.BaiduAssetManager"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Exception -> L6a
            r4 = 0
            java.lang.reflect.Constructor r3 = r3.getConstructor(r4)     // Catch: java.lang.Exception -> L6a
            java.lang.Object r3 = r3.newInstance(r4)     // Catch: java.lang.Exception -> L6a
            android.content.res.AssetManager r3 = (android.content.res.AssetManager) r3     // Catch: java.lang.Exception -> L6a
            goto L75
        L6a:
            r1 = move-exception
            goto L177
        L6d:
            java.lang.Class<android.content.res.AssetManager> r3 = android.content.res.AssetManager.class
            java.lang.Object r3 = r3.newInstance()     // Catch: java.lang.Exception -> L6a
            android.content.res.AssetManager r3 = (android.content.res.AssetManager) r3     // Catch: java.lang.Exception -> L6a
        L75:
            java.lang.String r4 = "Zeus/load_pangle"
            java.lang.String r5 = "AssetManagerProcessor newAssetManager = "
            java.lang.String r6 = java.lang.String.valueOf(r3)     // Catch: java.lang.Exception -> L6a
            java.lang.String r5 = r5.concat(r6)     // Catch: java.lang.Exception -> L6a
            com.bytedance.pangle.log.ZeusLogger.i(r4, r5)     // Catch: java.lang.Exception -> L6a
            java.util.LinkedHashMap<java.lang.String, java.lang.Integer> r4 = r9.xt     // Catch: java.lang.Exception -> L6a
            monitor-enter(r4)     // Catch: java.lang.Exception -> L6a
            java.util.LinkedHashMap<java.lang.String, java.lang.Integer> r5 = r9.xt     // Catch: java.lang.Throwable -> Lbc
            java.util.Set r5 = r5.entrySet()     // Catch: java.lang.Throwable -> Lbc
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> Lbc
        L91:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> Lbc
            if (r6 == 0) goto Lbf
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> Lbc
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch: java.lang.Throwable -> Lbc
            java.util.Map<java.lang.String, java.lang.Integer> r7 = com.bytedance.pangle.res.j.j     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r8 = r6.getKey()     // Catch: java.lang.Throwable -> Lbc
            boolean r7 = r7.containsKey(r8)     // Catch: java.lang.Throwable -> Lbc
            if (r7 != 0) goto L91
            java.lang.Object r7 = r6.getKey()     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> Lbc
            r2.append(r7)     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r6 = r6.getKey()     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> Lbc
            r9.xt(r3, r6, r0)     // Catch: java.lang.Throwable -> Lbc
            goto L91
        Lbc:
            r1 = move-exception
            goto L175
        Lbf:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Exception -> L6a
            android.app.Application r5 = com.bytedance.pangle.Zeus.getAppApplication()     // Catch: java.lang.Exception -> L6a
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo()     // Catch: java.lang.Exception -> L6a
            java.lang.String r5 = r5.sourceDir     // Catch: java.lang.Exception -> L6a
            boolean r4 = r4.contains(r5)     // Catch: java.lang.Exception -> L6a
            if (r4 != 0) goto L104
            android.app.Application r4 = com.bytedance.pangle.Zeus.getAppApplication()     // Catch: java.lang.Exception -> L6a
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo()     // Catch: java.lang.Exception -> L6a
            java.lang.String r4 = r4.sourceDir     // Catch: java.lang.Exception -> L6a
            r9.xt(r3, r4, r0)     // Catch: java.lang.Exception -> L6a
            java.lang.String r4 = "Zeus/load_pangle"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6a
            java.lang.String r6 = "AssetManagerProcessor newAssetManager lost host path : "
            r5.<init>(r6)     // Catch: java.lang.Exception -> L6a
            java.util.Map<java.lang.String, java.lang.Integer> r6 = com.bytedance.pangle.res.j.j     // Catch: java.lang.Exception -> L6a
            android.app.Application r7 = com.bytedance.pangle.Zeus.getAppApplication()     // Catch: java.lang.Exception -> L6a
            android.content.pm.ApplicationInfo r7 = r7.getApplicationInfo()     // Catch: java.lang.Exception -> L6a
            java.lang.String r7 = r7.sourceDir     // Catch: java.lang.Exception -> L6a
            boolean r6 = r6.containsKey(r7)     // Catch: java.lang.Exception -> L6a
            r5.append(r6)     // Catch: java.lang.Exception -> L6a
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L6a
            com.bytedance.pangle.log.ZeusLogger.w(r4, r5)     // Catch: java.lang.Exception -> L6a
        L104:
            r2.append(r11)     // Catch: java.lang.Exception -> L6a
            r9.xt(r3, r11, r0)     // Catch: java.lang.Exception -> L6a
            boolean r4 = r1.isEmpty()     // Catch: java.lang.Exception -> L6a
            if (r4 != 0) goto L127
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L6a
        L114:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Exception -> L6a
            if (r4 == 0) goto L127
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Exception -> L6a
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> L6a
            r2.append(r4)     // Catch: java.lang.Exception -> L6a
            r9.xt(r3, r4, r0)     // Catch: java.lang.Exception -> L6a
            goto L114
        L127:
            boolean r1 = com.bytedance.pangle.util.g.m()     // Catch: java.lang.Exception -> L6a
            if (r1 == 0) goto L173
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> L6a
            java.lang.String r1 = r1.toLowerCase()     // Catch: java.lang.Exception -> L6a
            java.lang.String r2 = "webview"
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Exception -> L6a
            if (r1 != 0) goto L173
            android.app.Application r1 = com.bytedance.pangle.Zeus.getAppApplication()     // Catch: java.lang.Exception -> L16b
            android.content.res.Resources r1 = r1.getResources()     // Catch: java.lang.Exception -> L16b
            java.lang.String r2 = "android:string/config_webViewPackageName"
            java.lang.String r4 = "string"
            java.lang.String r5 = "android"
            int r2 = r1.getIdentifier(r2, r4, r5)     // Catch: java.lang.Exception -> L16b
            android.app.Application r4 = com.bytedance.pangle.Zeus.getAppApplication()     // Catch: java.lang.Exception -> L16b
            java.lang.String r1 = r1.getString(r2)     // Catch: java.lang.Exception -> L16b
            android.content.Context r1 = r4.createPackageContext(r1, r0)     // Catch: java.lang.Exception -> L16b
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo()     // Catch: java.lang.Exception -> L16b
            java.lang.String r1 = r1.sourceDir     // Catch: java.lang.Exception -> L16b
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L16b
            if (r2 != 0) goto L173
            r9.xt(r3, r1, r0)     // Catch: java.lang.Exception -> L16b
            goto L173
        L16b:
            r1 = move-exception
            java.lang.String r2 = "Zeus/load_pangle"
            java.lang.String r4 = "AssetManagerProcessor newAssetManager appendAsset webview failed."
            com.bytedance.pangle.log.ZeusLogger.errReport(r2, r4, r1)     // Catch: java.lang.Exception -> L6a
        L173:
            r10 = r3
            goto L181
        L175:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lbc
            throw r1     // Catch: java.lang.Exception -> L6a
        L177:
            java.lang.String r2 = "Zeus/load_pangle"
            java.lang.String r3 = "AssetManagerProcessor newAssetManager failed."
            com.bytedance.pangle.log.ZeusLogger.errReport(r2, r3, r1)
            r9.xt(r10, r11, r0)
        L181:
            java.lang.String r11 = "ensureStringBlocks"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L190
            com.bytedance.pangle.util.MethodUtils.invokeMethod(r10, r11, r0)     // Catch: java.lang.Exception -> L190
            java.lang.String r11 = "Zeus/load_pangle"
            java.lang.String r0 = "AssetManagerProcessor ensureStringBlocks"
            com.bytedance.pangle.log.ZeusLogger.i(r11, r0)     // Catch: java.lang.Exception -> L190
            goto L198
        L190:
            r11 = move-exception
            java.lang.String r0 = "Zeus/load_pangle"
            java.lang.String r1 = "AssetManagerProcessor ensureStringBlocks failed."
            com.bytedance.pangle.log.ZeusLogger.errReport(r0, r1, r11)
        L198:
            return r10
    }

    private android.content.res.AssetManager xt(android.content.res.AssetManager r10, java.lang.String r11, boolean r12) {
            r9 = this;
            java.lang.String r0 = "addAssetPath"
            if (r12 == 0) goto L7
            java.lang.String r1 = "addAssetPathAsSharedLibrary"
            goto L8
        L7:
            r1 = r0
        L8:
            boolean r2 = com.bytedance.pangle.util.g.w()
            if (r2 == 0) goto L1a
            if (r12 != 0) goto L1a
            java.lang.String r2 = "/product/overlay/"
            boolean r2 = r11.startsWith(r2)
            if (r2 == 0) goto L1a
            java.lang.String r1 = "addOverlayPath"
        L1a:
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]
            r4 = 0
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r3[r4] = r5
            java.lang.Class<android.content.res.AssetManager> r6 = android.content.res.AssetManager.class
            java.lang.reflect.Method r3 = com.bytedance.pangle.util.MethodUtils.getAccessibleMethod(r6, r1, r3)
            java.lang.String r7 = "Zeus/load_pangle"
            if (r3 != 0) goto L3c
            if (r12 == 0) goto L3c
            java.lang.Class[] r1 = new java.lang.Class[r2]
            r1[r4] = r5
            java.lang.reflect.Method r3 = com.bytedance.pangle.util.MethodUtils.getAccessibleMethod(r6, r0, r1)
            java.lang.String r1 = "AssetManagerProcessor AssetManager.addAssetPath() invoke addAssetPathAsSharedLibrary failed. use addAssetPath."
            com.bytedance.pangle.log.ZeusLogger.w(r7, r1)
            goto L3d
        L3c:
            r0 = r1
        L3d:
            if (r3 == 0) goto La6
            r1 = 3
        L40:
            int r5 = r1 + (-1)
            if (r1 < 0) goto La5
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L6e
            r1[r4] = r11     // Catch: java.lang.Exception -> L6e
            java.lang.Object r1 = r3.invoke(r10, r1)     // Catch: java.lang.Exception -> L6e
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L6e
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> L6e
            if (r1 == 0) goto L70
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6e
            java.lang.String r8 = "AssetManagerProcessor invoke AssetManager.addAssetPath() success, cookie = "
            r6.<init>(r8)     // Catch: java.lang.Exception -> L6e
            r6.append(r1)     // Catch: java.lang.Exception -> L6e
            java.lang.String r1 = ", path = "
            r6.append(r1)     // Catch: java.lang.Exception -> L6e
            r6.append(r11)     // Catch: java.lang.Exception -> L6e
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Exception -> L6e
            com.bytedance.pangle.log.ZeusLogger.i(r7, r1)     // Catch: java.lang.Exception -> L6e
            goto La5
        L6e:
            r1 = move-exception
            goto L8a
        L70:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6e
            java.lang.String r8 = "AssetManagerProcessor invoke AssetManager.addAssetPath() failed, cookie = "
            r6.<init>(r8)     // Catch: java.lang.Exception -> L6e
            r6.append(r1)     // Catch: java.lang.Exception -> L6e
            java.lang.String r1 = " "
            r6.append(r1)     // Catch: java.lang.Exception -> L6e
            r6.append(r11)     // Catch: java.lang.Exception -> L6e
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Exception -> L6e
            com.bytedance.pangle.log.ZeusLogger.w(r7, r1)     // Catch: java.lang.Exception -> L6e
            goto La3
        L8a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r8 = "AssetManagerProcessor invoke AssetManager.addAssetPath() failed. asSharedLibrary = "
            r6.<init>(r8)
            r6.append(r12)
            java.lang.String r8 = ", methodName = "
            r6.append(r8)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            com.bytedance.pangle.log.ZeusLogger.w(r7, r6, r1)
        La3:
            r1 = r5
            goto L40
        La5:
            return r10
        La6:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r1 = "AssetManagerProcessor reflect AssetManager.addAssetPath() failed. addAssetPathMethod == null. asSharedLibrary = "
            r11.<init>(r1)
            r11.append(r12)
            java.lang.String r12 = " methodName:"
            r11.append(r12)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            com.bytedance.pangle.log.ZeusLogger.w(r7, r11)
            return r10
    }

    public android.content.res.AssetManager j(android.content.res.AssetManager r3, java.lang.String r4, boolean r5) {
            r2 = this;
            java.lang.String r0 = ".frro"
            boolean r0 = r4.endsWith(r0)
            if (r0 == 0) goto L14
            java.lang.String r5 = "Zeus/load_pangle"
            java.lang.String r0 = "AssetManagerProcessor updateAssetManager skip frro. "
            java.lang.String r4 = r0.concat(r4)
            com.bytedance.pangle.log.ZeusLogger.w(r5, r4)
            return r3
        L14:
            boolean r0 = com.bytedance.pangle.util.g.j()
            if (r0 == 0) goto L34
            boolean r0 = com.bytedance.pangle.util.g.ae()
            if (r0 == 0) goto L2f
            android.content.res.AssetManager r0 = r2.cw(r3, r4, r5)
            boolean r1 = com.bytedance.pangle.util.qv.j(r0, r4)
            if (r1 != 0) goto L38
            android.content.res.AssetManager r0 = r2.xt(r3, r4, r5)
            goto L38
        L2f:
            android.content.res.AssetManager r0 = r2.xt(r3, r4, r5)
            goto L38
        L34:
            android.content.res.AssetManager r0 = r2.j(r3, r4)
        L38:
            java.util.LinkedHashMap<java.lang.String, java.lang.Integer> r3 = r2.xt
            monitor-enter(r3)
            java.util.LinkedHashMap<java.lang.String, java.lang.Integer> r5 = r2.xt     // Catch: java.lang.Throwable -> L47
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L47
            r5.put(r4, r1)     // Catch: java.lang.Throwable -> L47
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L47
            return r0
        L47:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L47
            throw r4
    }
}
