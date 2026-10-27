package com.bytedance.pangle;

@androidx.annotation.Keep
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class ComponentManager {
    public static java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> stubActivity2TargetActivities;
    public static java.util.HashMap<java.lang.String, java.lang.String> targetString2PluginPkgName;
    public static java.util.HashMap<java.lang.String, java.lang.String> targetString2StubActivity;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.bytedance.pangle.ComponentManager.stubActivity2TargetActivities = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.bytedance.pangle.ComponentManager.targetString2StubActivity = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.bytedance.pangle.ComponentManager.targetString2PluginPkgName = r0
            return
    }

    public ComponentManager() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String getTargetStubActivityString(java.lang.String r1) {
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.bytedance.pangle.ComponentManager.targetString2StubActivity
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            return r1
    }

    private static boolean isSupportLibIso(java.lang.String r1) {
            com.bytedance.pangle.plugin.PluginManager r0 = com.bytedance.pangle.plugin.PluginManager.getInstance()     // Catch: java.lang.Throwable -> Lb
            com.bytedance.pangle.plugin.Plugin r1 = r0.getPlugin(r1)     // Catch: java.lang.Throwable -> Lb
            boolean r1 = r1.mIsSupportLibIso     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public static void realStartActivity(java.lang.Object r3, android.content.Context r4, android.content.Intent r5, android.os.Bundle r6, java.lang.String r7) {
            boolean r0 = r4 instanceof com.bytedance.pangle.PluginContext
            if (r0 == 0) goto L8
            com.bytedance.pangle.PluginContext r4 = (com.bytedance.pangle.PluginContext) r4
            android.content.Context r4 = r4.mOriginContext
        L8:
            android.content.ComponentName r0 = r5.getComponent()
            if (r0 == 0) goto L33
            android.content.ComponentName r0 = r5.getComponent()
            java.lang.String r0 = r0.getClassName()
            com.bytedance.pangle.Zeus.loadPlugin(r7)
            java.lang.String r1 = getTargetStubActivityString(r0)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L33
            com.bytedance.pangle.activity.IntentUtils.j(r5, r7)
            android.content.ComponentName r2 = new android.content.ComponentName
            r2.<init>(r4, r1)
            r5.setComponent(r2)
            java.lang.String r1 = "targetPlugin"
            r5.putExtra(r1, r0)
        L33:
            boolean r7 = isSupportLibIso(r7)     // Catch: java.lang.Throwable -> L43
            if (r7 != 0) goto L45
            boolean r7 = r3 instanceof androidx.fragment.app.Fragment     // Catch: java.lang.Throwable -> L43
            if (r7 == 0) goto L45
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3     // Catch: java.lang.Throwable -> L43
            r3.startActivity(r5, r6)     // Catch: java.lang.Throwable -> L43
            return
        L43:
            r3 = move-exception
            goto L53
        L45:
            boolean r7 = r3 instanceof android.app.Fragment     // Catch: java.lang.Throwable -> L43
            if (r7 == 0) goto L4f
            android.app.Fragment r3 = (android.app.Fragment) r3     // Catch: java.lang.Throwable -> L43
            r3.startActivity(r5, r6)     // Catch: java.lang.Throwable -> L43
            return
        L4f:
            r4.startActivity(r5, r6)     // Catch: java.lang.Throwable -> L43
            return
        L53:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "component = "
            r6.<init>(r7)
            android.content.ComponentName r5 = r5.getComponent()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5, r3)
            throw r4
    }

    private static void realStartActivityForResult(java.lang.Object r3, android.app.Activity r4, android.content.Intent r5, int r6, android.os.Bundle r7, java.lang.String r8) {
            android.content.ComponentName r0 = r5.getComponent()
            if (r0 == 0) goto L2b
            android.content.ComponentName r0 = r5.getComponent()
            java.lang.String r0 = r0.getClassName()
            com.bytedance.pangle.Zeus.loadPlugin(r8)
            java.lang.String r1 = getTargetStubActivityString(r0)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L2b
            com.bytedance.pangle.activity.IntentUtils.j(r5, r8)
            android.content.ComponentName r2 = new android.content.ComponentName
            r2.<init>(r4, r1)
            r5.setComponent(r2)
            java.lang.String r1 = "targetPlugin"
            r5.putExtra(r1, r0)
        L2b:
            boolean r8 = isSupportLibIso(r8)     // Catch: java.lang.Throwable -> L3b
            if (r8 != 0) goto L3d
            boolean r8 = r3 instanceof androidx.fragment.app.Fragment     // Catch: java.lang.Throwable -> L3b
            if (r8 == 0) goto L3d
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3     // Catch: java.lang.Throwable -> L3b
            r3.startActivityForResult(r5, r6, r7)     // Catch: java.lang.Throwable -> L3b
            return
        L3b:
            r3 = move-exception
            goto L4b
        L3d:
            boolean r8 = r3 instanceof android.app.Fragment     // Catch: java.lang.Throwable -> L3b
            if (r8 == 0) goto L47
            android.app.Fragment r3 = (android.app.Fragment) r3     // Catch: java.lang.Throwable -> L3b
            r3.startActivityForResult(r5, r6, r7)     // Catch: java.lang.Throwable -> L3b
            return
        L47:
            r4.startActivityForResult(r5, r6, r7)     // Catch: java.lang.Throwable -> L3b
            return
        L4b:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "component =  "
            r6.<init>(r7)
            android.content.ComponentName r5 = r5.getComponent()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5, r3)
            throw r4
    }

    public static void registerActivity(java.lang.String r5, java.lang.String r6, java.lang.String... r7) {
            if (r7 == 0) goto L2c
            int r0 = r7.length
            r1 = 0
        L4:
            if (r1 >= r0) goto L2c
            r2 = r7[r1]
            java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> r3 = com.bytedance.pangle.ComponentManager.stubActivity2TargetActivities
            java.lang.Object r3 = r3.get(r6)
            java.util.List r3 = (java.util.List) r3
            if (r3 != 0) goto L1c
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> r4 = com.bytedance.pangle.ComponentManager.stubActivity2TargetActivities
            r4.put(r6, r3)
        L1c:
            r3.add(r2)
            java.util.HashMap<java.lang.String, java.lang.String> r3 = com.bytedance.pangle.ComponentManager.targetString2StubActivity
            r3.put(r2, r6)
            java.util.HashMap<java.lang.String, java.lang.String> r3 = com.bytedance.pangle.ComponentManager.targetString2PluginPkgName
            r3.put(r2, r5)
            int r1 = r1 + 1
            goto L4
        L2c:
            return
    }

    public static android.content.Intent registerReceiver(android.content.Context r0, com.bytedance.pangle.receiver.PluginBroadcastReceiver r1, android.content.IntentFilter r2, int r3, java.lang.String r4) {
            com.bytedance.pangle.Zeus.loadPlugin(r4)
            com.bytedance.pangle.receiver.xt r4 = com.bytedance.pangle.receiver.xt.j()
            android.content.Intent r0 = r4.registerReceiver(r0, r1, r2, r3)
            return r0
    }

    public static android.content.Intent registerReceiver(android.content.Context r0, com.bytedance.pangle.receiver.PluginBroadcastReceiver r1, android.content.IntentFilter r2, java.lang.String r3) {
            com.bytedance.pangle.Zeus.loadPlugin(r3)
            com.bytedance.pangle.receiver.xt r3 = com.bytedance.pangle.receiver.xt.j()
            android.content.Intent r0 = r3.registerReceiver(r0, r1, r2)
            return r0
    }

    public static android.content.Intent registerReceiver(android.content.Context r0, com.bytedance.pangle.receiver.PluginBroadcastReceiver r1, android.content.IntentFilter r2, java.lang.String r3, android.os.Handler r4, int r5, java.lang.String r6) {
            com.bytedance.pangle.Zeus.loadPlugin(r6)
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            r1 = r0
            com.bytedance.pangle.receiver.xt r0 = com.bytedance.pangle.receiver.xt.j()
            android.content.Intent r0 = r0.registerReceiver(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static android.content.Intent registerReceiver(android.content.Context r0, com.bytedance.pangle.receiver.PluginBroadcastReceiver r1, android.content.IntentFilter r2, java.lang.String r3, android.os.Handler r4, java.lang.String r5) {
            com.bytedance.pangle.Zeus.loadPlugin(r5)
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            r1 = r0
            com.bytedance.pangle.receiver.xt r0 = com.bytedance.pangle.receiver.xt.j()
            android.content.Intent r0 = r0.registerReceiver(r1, r2, r3, r4, r5)
            return r0
    }

    public static void startActivity(android.content.Context r1, android.content.Intent r2, android.os.Bundle r3, java.lang.String r4) {
            r0 = 0
            realStartActivity(r0, r1, r2, r3, r4)
            return
    }

    public static void startActivity(android.content.Context r1, android.content.Intent r2, java.lang.String r3) {
            r0 = 0
            realStartActivity(r0, r1, r2, r0, r3)
            return
    }

    public static void startActivity(java.lang.Object r3, android.content.Intent r4, android.os.Bundle r5, java.lang.String r6) {
            boolean r0 = r3 instanceof android.content.Context
            if (r0 == 0) goto Lb
            r0 = 0
            android.content.Context r3 = (android.content.Context) r3
            realStartActivity(r0, r3, r4, r5, r6)
            return
        Lb:
            boolean r0 = isSupportLibIso(r6)
            if (r0 != 0) goto L20
            boolean r0 = r3 instanceof androidx.fragment.app.Fragment
            if (r0 == 0) goto L20
            r0 = r3
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
            realStartActivity(r3, r0, r4, r5, r6)
            return
        L20:
            boolean r0 = r3 instanceof android.app.Fragment
            if (r0 == 0) goto L2f
            r0 = r3
            android.app.Fragment r0 = (android.app.Fragment) r0
            android.app.Activity r0 = r0.getActivity()
            realStartActivity(r3, r0, r4, r5, r6)
            return
        L2f:
            java.lang.String r6 = "startActivity"
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L48
            r2 = 0
            r1[r2] = r4     // Catch: java.lang.Throwable -> L48
            r4 = 1
            r1[r4] = r5     // Catch: java.lang.Throwable -> L48
            java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L48
            java.lang.Class<android.content.Intent> r0 = android.content.Intent.class
            r5[r2] = r0     // Catch: java.lang.Throwable -> L48
            java.lang.Class<android.os.Bundle> r0 = android.os.Bundle.class
            r5[r4] = r0     // Catch: java.lang.Throwable -> L48
            com.bytedance.pangle.util.MethodUtils.invokeMethod(r3, r6, r1, r5)     // Catch: java.lang.Throwable -> L48
            return
        L48:
            r3 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r4.<init>(r3)
            throw r4
    }

    public static void startActivityForResult(android.app.Activity r6, android.content.Intent r7, int r8, android.os.Bundle r9, java.lang.String r10) {
            r0 = 0
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            realStartActivityForResult(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void startActivityForResult(java.lang.Object r8, android.content.Intent r9, int r10, android.os.Bundle r11, java.lang.String r12) {
            boolean r1 = r8 instanceof android.app.Activity
            if (r1 == 0) goto L10
            r3 = r8
            android.app.Activity r3 = (android.app.Activity) r3
            r6 = 0
            r2 = 0
            r4 = r9
            r5 = r10
            r7 = r12
            realStartActivityForResult(r2, r3, r4, r5, r6, r7)
            return
        L10:
            boolean r1 = isSupportLibIso(r12)
            if (r1 != 0) goto L2a
            boolean r1 = r8 instanceof androidx.fragment.app.Fragment
            if (r1 == 0) goto L2a
            r1 = r8
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            androidx.fragment.app.FragmentActivity r1 = r1.getActivity()
            r4 = 0
            r0 = r8
            r2 = r9
            r3 = r10
            r5 = r12
            realStartActivityForResult(r0, r1, r2, r3, r4, r5)
            return
        L2a:
            boolean r1 = r8 instanceof android.app.Fragment
            if (r1 == 0) goto L3e
            r1 = r8
            android.app.Fragment r1 = (android.app.Fragment) r1
            android.app.Activity r1 = r1.getActivity()
            r4 = 0
            r0 = r8
            r2 = r9
            r3 = r10
            r5 = r12
            realStartActivityForResult(r0, r1, r2, r3, r4, r5)
            return
        L3e:
            java.lang.String r1 = "startActivityForResult"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L62
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L62
            r5 = 0
            r4[r5] = r9     // Catch: java.lang.Throwable -> L62
            r6 = 1
            r4[r6] = r2     // Catch: java.lang.Throwable -> L62
            r2 = 2
            r4[r2] = r11     // Catch: java.lang.Throwable -> L62
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L62
            java.lang.Class<android.content.Intent> r7 = android.content.Intent.class
            r3[r5] = r7     // Catch: java.lang.Throwable -> L62
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L62
            r3[r6] = r5     // Catch: java.lang.Throwable -> L62
            java.lang.Class<android.os.Bundle> r5 = android.os.Bundle.class
            r3[r2] = r5     // Catch: java.lang.Throwable -> L62
            com.bytedance.pangle.util.MethodUtils.invokeMethod(r8, r1, r4, r3)     // Catch: java.lang.Throwable -> L62
            return
        L62:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    public static void unregisterReceiver(android.content.Context r1, com.bytedance.pangle.receiver.PluginBroadcastReceiver r2) {
            if (r2 == 0) goto L9
            com.bytedance.pangle.receiver.xt r0 = com.bytedance.pangle.receiver.xt.j()
            r0.unregisterReceiver(r1, r2)
        L9:
            return
    }
}
