package com.kuaishou.weapon.p0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class an {
    public static final java.lang.String a = "de.robv.android.xposed.XposedHelpers";
    public static final java.lang.String b = "de.robv.android.xposed.XposedBridge";
    public static final java.lang.String c = "com.elderdrivers.riru.edxp.config.EdXpConfigGlobal";

    public an() {
            r0 = this;
            r0.<init>()
            return
    }

    private boolean a(android.content.Context r3, java.lang.String r4, java.util.Set r5) {
            r2 = this;
            r0 = 0
            int r1 = r5.size()     // Catch: java.lang.Exception -> L1c
            if (r1 > 0) goto L8
            return r0
        L8:
            java.lang.String r1 = "phone"
            java.lang.Object r3 = r3.getSystemService(r1)     // Catch: java.lang.Exception -> L1c
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3     // Catch: java.lang.Exception -> L1c
            if (r3 != 0) goto L13
            return r0
        L13:
            java.lang.Class r3 = r3.getClass()     // Catch: java.lang.Exception -> L1c
            boolean r3 = r2.a(r3, r4, r5)     // Catch: java.lang.Exception -> L1c
            return r3
        L1c:
            return r0
    }

    private boolean a(java.lang.Class r3, java.lang.String r4, java.util.Set r5) {
            r2 = this;
            r0 = 0
            if (r4 == 0) goto L23
            int r1 = r5.size()     // Catch: java.lang.Exception -> L23
            if (r1 <= 0) goto L23
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Exception -> L23
            boolean r4 = r1.contains(r4)     // Catch: java.lang.Exception -> L23
            if (r4 == 0) goto L23
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Exception -> L23
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Exception -> L23
            boolean r3 = r4.contains(r3)     // Catch: java.lang.Exception -> L23
            if (r3 == 0) goto L23
            r3 = 1
            return r3
        L23:
            return r0
    }

    private boolean a(java.lang.reflect.Method r1) {
            r0 = this;
            if (r1 == 0) goto Le
            int r1 = r1.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isNative(r1)
            if (r1 == 0) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    public int a(android.content.Context r3, int r4, java.util.Set r5) {
            r2 = this;
            r0 = 0
            java.lang.ClassLoader r1 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: java.lang.Exception -> L57
            if (r1 == 0) goto L52
            java.lang.Class<android.net.wifi.WifiInfo> r1 = android.net.wifi.WifiInfo.class
            switch(r4) {
                case 13: goto L4b;
                case 14: goto L44;
                case 15: goto L3d;
                case 16: goto L34;
                case 17: goto L2b;
                case 18: goto L22;
                case 19: goto L1b;
                case 20: goto L14;
                case 21: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L52
        Ld:
            java.lang.String r3 = "getBSSID"
            boolean r3 = r2.a(r1, r3, r5)     // Catch: java.lang.Exception -> L57
            goto L53
        L14:
            java.lang.String r3 = "getSSID"
            boolean r3 = r2.a(r1, r3, r5)     // Catch: java.lang.Exception -> L57
            goto L53
        L1b:
            java.lang.String r3 = "getMacAddress"
            boolean r3 = r2.a(r1, r3, r5)     // Catch: java.lang.Exception -> L57
            goto L53
        L22:
            java.lang.Class<java.lang.reflect.Method> r3 = java.lang.reflect.Method.class
            java.lang.String r4 = "invoke"
            boolean r3 = r2.a(r3, r4, r5)     // Catch: java.lang.Exception -> L57
            goto L53
        L2b:
            java.lang.Class<java.lang.StringBuilder> r3 = java.lang.StringBuilder.class
            java.lang.String r4 = "toString"
            boolean r3 = r2.a(r3, r4, r5)     // Catch: java.lang.Exception -> L57
            goto L53
        L34:
            java.lang.Class<android.provider.Settings$Secure> r3 = android.provider.Settings.Secure.class
            java.lang.String r4 = "getString"
            boolean r3 = r2.a(r3, r4, r5)     // Catch: java.lang.Exception -> L57
            goto L53
        L3d:
            java.lang.String r4 = "getSimSerialNumber"
            boolean r3 = r2.a(r3, r4, r5)     // Catch: java.lang.Exception -> L57
            goto L53
        L44:
            java.lang.String r4 = "getSubscriberId"
            boolean r3 = r2.a(r3, r4, r5)     // Catch: java.lang.Exception -> L57
            goto L53
        L4b:
            java.lang.String r4 = "getDeviceId"
            boolean r3 = r2.a(r3, r4, r5)     // Catch: java.lang.Exception -> L57
            goto L53
        L52:
            r3 = 0
        L53:
            if (r3 == 0) goto L57
            r3 = 1
            return r3
        L57:
            return r0
    }

    public java.util.Set<java.lang.String> a() {
            r6 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1 = 0
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8b
            r2.<init>()     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8b
            java.lang.String r4 = "/proc/"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8b
            int r4 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8b
            r3.append(r4)     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8b
            java.lang.String r4 = "/maps"
            r3.append(r4)     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8b
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8b
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8b
            java.io.FileReader r5 = new java.io.FileReader     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8b
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8b
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8b
        L2c:
            java.lang.String r3 = r4.readLine()     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            if (r3 == 0) goto L58
            java.lang.String r5 = ".so"
            boolean r5 = r3.endsWith(r5)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            if (r5 != 0) goto L48
            java.lang.String r5 = ".jar"
            boolean r5 = r3.endsWith(r5)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            if (r5 == 0) goto L2c
            goto L48
        L43:
            r0 = move-exception
            r1 = r4
            goto L8d
        L46:
            goto L94
        L48:
            java.lang.String r5 = " "
            int r5 = r3.lastIndexOf(r5)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            int r5 = r5 + 1
            java.lang.String r3 = r3.substring(r5)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            r2.add(r3)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            goto L2c
        L58:
            r4.close()     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
        L5f:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            if (r3 == 0) goto L83
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            java.lang.String r5 = "com.saurik.substrate"
            boolean r5 = r3.contains(r5)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            if (r5 == 0) goto L77
            r0.add(r3)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            goto L5f
        L77:
            java.lang.String r5 = "XposedBridge.jar"
            boolean r5 = r3.contains(r5)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            if (r5 == 0) goto L5f
            r0.add(r3)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            goto L5f
        L83:
            r4.close()     // Catch: java.lang.Exception -> L87
            goto L97
        L87:
            goto L97
        L89:
            r0 = move-exception
            goto L8d
        L8b:
            goto L93
        L8d:
            if (r1 == 0) goto L92
            r1.close()     // Catch: java.lang.Exception -> L92
        L92:
            throw r0
        L93:
            r4 = r1
        L94:
            if (r4 == 0) goto L97
            goto L83
        L97:
            int r2 = r0.size()
            if (r2 <= 0) goto L9e
            return r0
        L9e:
            return r1
    }

    public java.util.Set a(java.util.Set r5) {
            r4 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L9:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L3c
            java.lang.Object r1 = r5.next()
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L2e
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "android.app.ResourcesManager#"
            boolean r3 = r2.startsWith(r3)
            if (r3 != 0) goto L9
            java.lang.String r3 = "android.view.LayoutInflater#"
            boolean r2 = r2.startsWith(r3)
            if (r2 != 0) goto L9
            r0.add(r1)
            goto L9
        L2e:
            boolean r2 = r1 instanceof java.lang.reflect.Method
            if (r2 == 0) goto L9
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.String r1 = r1.getName()
            r0.add(r1)
            goto L9
        L3c:
            return r0
    }

    public boolean a(java.lang.Class r1, java.lang.String r2, java.lang.Class<?>... r3) {
            r0 = this;
            java.lang.reflect.Method r1 = com.kuaishou.weapon.p0.bh.a(r1, r2, r3)     // Catch: java.lang.Exception -> L9
            boolean r1 = r0.a(r1)     // Catch: java.lang.Exception -> L9
            return r1
        L9:
            r1 = 0
            return r1
    }

    public java.util.Set<java.lang.String> b() {
            r3 = this;
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: java.lang.Exception -> L2f
            java.lang.String r1 = "de.robv.android.xposed.XposedBridge"
            java.lang.Class r0 = r0.loadClass(r1)     // Catch: java.lang.Exception -> L2f
            if (r0 == 0) goto L2f
            java.lang.String r1 = "sHookedMethodCallbacks"
            java.lang.reflect.Field r1 = r0.getDeclaredField(r1)     // Catch: java.lang.Exception -> L2f
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.Exception -> L2f
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Exception -> L2f
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Exception -> L2f
            if (r0 == 0) goto L2f
            java.util.Set r0 = r0.keySet()     // Catch: java.lang.Exception -> L2f
            if (r0 == 0) goto L2f
            int r1 = r0.size()     // Catch: java.lang.Exception -> L2f
            if (r1 <= 0) goto L2f
            java.util.Set r0 = r3.a(r0)     // Catch: java.lang.Exception -> L2f
            return r0
        L2f:
            r0 = 0
            return r0
    }

    public org.json.JSONObject b(java.util.Set r6) {
            r5 = this;
            java.lang.Class<android.content.pm.PackageManager> r0 = android.content.pm.PackageManager.class
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L74
            r1.<init>()     // Catch: java.lang.Exception -> L74
            java.lang.ClassLoader r2 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: java.lang.Exception -> L74
            if (r2 == 0) goto L73
            int r2 = r6.size()     // Catch: java.lang.Exception -> L74
            if (r2 <= 0) goto L73
            java.lang.Class<java.lang.Class> r2 = java.lang.Class.class
            java.lang.String r3 = "forName"
            boolean r2 = r5.a(r2, r3, r6)     // Catch: java.lang.Exception -> L74
            java.lang.String r3 = "0"
            r1.put(r3, r2)     // Catch: java.lang.Exception -> L74
            java.lang.Class<java.lang.ClassLoader> r2 = java.lang.ClassLoader.class
            java.lang.String r3 = "loadClass"
            boolean r2 = r5.a(r2, r3, r6)     // Catch: java.lang.Exception -> L74
            java.lang.String r3 = "1"
            r1.put(r3, r2)     // Catch: java.lang.Exception -> L74
            java.lang.Class<java.lang.Throwable> r2 = java.lang.Throwable.class
            java.lang.String r3 = "getStackTrace"
            boolean r2 = r5.a(r2, r3, r6)     // Catch: java.lang.Exception -> L74
            java.lang.String r3 = "2"
            r1.put(r3, r2)     // Catch: java.lang.Exception -> L74
            java.lang.String r2 = "Z2V0SW5zdGFsbGVkUGFja2FnZXM="
            r3 = 2
            java.lang.String r2 = com.kuaishou.weapon.p0.c.b(r2, r3)     // Catch: java.lang.Exception -> L74
            boolean r2 = r5.a(r0, r2, r6)     // Catch: java.lang.Exception -> L74
            java.lang.String r4 = "3"
            r1.put(r4, r2)     // Catch: java.lang.Exception -> L74
            java.lang.String r2 = "Z2V0SW5zdGFsbGVkQXBwbGljYXRpb25z"
            java.lang.String r2 = com.kuaishou.weapon.p0.c.b(r2, r3)     // Catch: java.lang.Exception -> L74
            boolean r0 = r5.a(r0, r2, r6)     // Catch: java.lang.Exception -> L74
            java.lang.String r2 = "4"
            r1.put(r2, r0)     // Catch: java.lang.Exception -> L74
            java.lang.Class<android.app.ActivityManager> r0 = android.app.ActivityManager.class
            java.lang.String r2 = "getRunningServices"
            boolean r0 = r5.a(r0, r2, r6)     // Catch: java.lang.Exception -> L74
            java.lang.String r2 = "5"
            r1.put(r2, r0)     // Catch: java.lang.Exception -> L74
            java.lang.Class<org.json.JSONObject> r0 = org.json.JSONObject.class
            java.lang.String r2 = "toString"
            boolean r6 = r5.a(r0, r2, r6)     // Catch: java.lang.Exception -> L74
            java.lang.String r0 = "6"
            r1.put(r0, r6)     // Catch: java.lang.Exception -> L74
        L73:
            return r1
        L74:
            r6 = 0
            return r6
    }

    public java.util.Set<java.lang.String> c() {
            r3 = this;
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: java.lang.Exception -> L2f
            java.lang.String r1 = "de.robv.android.xposed.XposedHelpers"
            java.lang.Class r0 = r0.loadClass(r1)     // Catch: java.lang.Exception -> L2f
            if (r0 == 0) goto L2f
            java.lang.String r1 = "methodCache"
            java.lang.reflect.Field r1 = r0.getDeclaredField(r1)     // Catch: java.lang.Exception -> L2f
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.Exception -> L2f
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Exception -> L2f
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Exception -> L2f
            if (r0 == 0) goto L2f
            java.util.Set r0 = r0.keySet()     // Catch: java.lang.Exception -> L2f
            if (r0 == 0) goto L2f
            int r1 = r0.size()     // Catch: java.lang.Exception -> L2f
            if (r1 <= 0) goto L2f
            java.util.Set r0 = r3.a(r0)     // Catch: java.lang.Exception -> L2f
            return r0
        L2f:
            r0 = 0
            return r0
    }

    public org.json.JSONObject d() {
            r7 = this;
            java.lang.Class<android.location.Location> r0 = android.location.Location.class
            java.lang.Class<android.net.wifi.WifiInfo> r1 = android.net.wifi.WifiInfo.class
            java.lang.Class<android.telephony.TelephonyManager> r2 = android.telephony.TelephonyManager.class
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> Lb5
            r3.<init>()     // Catch: java.lang.Exception -> Lb5
            java.lang.String r4 = "getDeviceId"
            r5 = 0
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> Lb5
            boolean r4 = r7.a(r2, r4, r6)     // Catch: java.lang.Exception -> Lb5
            java.lang.String r6 = "0"
            r3.put(r6, r4)     // Catch: java.lang.Exception -> Lb5
            java.lang.String r4 = "getSubscriberId"
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> Lb5
            boolean r4 = r7.a(r2, r4, r6)     // Catch: java.lang.Exception -> Lb5
            java.lang.String r6 = "1"
            r3.put(r6, r4)     // Catch: java.lang.Exception -> Lb5
            java.lang.String r4 = "getSimSerialNumber"
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> Lb5
            boolean r2 = r7.a(r2, r4, r6)     // Catch: java.lang.Exception -> Lb5
            java.lang.String r4 = "2"
            r3.put(r4, r2)     // Catch: java.lang.Exception -> Lb5
            java.lang.String r2 = "getLatitude"
            java.lang.Class[] r4 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> Lb5
            boolean r2 = r7.a(r0, r2, r4)     // Catch: java.lang.Exception -> Lb5
            java.lang.String r4 = "3"
            r3.put(r4, r2)     // Catch: java.lang.Exception -> Lb5
            java.lang.String r2 = "getLongitude"
            java.lang.Class[] r4 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> Lb5
            boolean r0 = r7.a(r0, r2, r4)     // Catch: java.lang.Exception -> Lb5
            java.lang.String r2 = "4"
            r3.put(r2, r0)     // Catch: java.lang.Exception -> Lb5
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> Lb5
            r2 = 26
            java.lang.String r4 = "5"
            if (r0 < r2) goto L63
            java.lang.Class<android.os.Build> r0 = android.os.Build.class
            java.lang.String r2 = "getSerial"
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> Lb5
            boolean r0 = r7.a(r0, r2, r6)     // Catch: java.lang.Exception -> Lb5
            r3.put(r4, r0)     // Catch: java.lang.Exception -> Lb5
            goto L66
        L63:
            r3.put(r4, r5)     // Catch: java.lang.Exception -> Lb5
        L66:
            java.lang.String r0 = "getMacAddress"
            java.lang.Class[] r2 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> Lb5
            boolean r0 = r7.a(r1, r0, r2)     // Catch: java.lang.Exception -> Lb5
            java.lang.String r2 = "6"
            r3.put(r2, r0)     // Catch: java.lang.Exception -> Lb5
            java.lang.String r0 = "getBSSID"
            java.lang.Class[] r2 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> Lb5
            boolean r0 = r7.a(r1, r0, r2)     // Catch: java.lang.Exception -> Lb5
            java.lang.String r2 = "7"
            r3.put(r2, r0)     // Catch: java.lang.Exception -> Lb5
            java.lang.String r0 = "getRssi"
            java.lang.Class[] r2 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> Lb5
            boolean r0 = r7.a(r1, r0, r2)     // Catch: java.lang.Exception -> Lb5
            java.lang.String r1 = "8"
            r3.put(r1, r0)     // Catch: java.lang.Exception -> Lb5
            java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
            java.lang.String r1 = "forName"
            r2 = 1
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> Lb5
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r4[r5] = r6     // Catch: java.lang.Exception -> Lb5
            boolean r0 = r7.a(r0, r1, r4)     // Catch: java.lang.Exception -> Lb5
            java.lang.String r1 = "9"
            r3.put(r1, r0)     // Catch: java.lang.Exception -> Lb5
            java.lang.Class<android.app.ActivityManager> r0 = android.app.ActivityManager.class
            java.lang.String r1 = "getRunningServices"
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> Lb5
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> Lb5
            r2[r5] = r4     // Catch: java.lang.Exception -> Lb5
            boolean r0 = r7.a(r0, r1, r2)     // Catch: java.lang.Exception -> Lb5
            java.lang.String r1 = "10"
            r3.put(r1, r0)     // Catch: java.lang.Exception -> Lb5
            return r3
        Lb5:
            r0 = 0
            return r0
    }

    public org.json.JSONObject e() {
            r8 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L59
            r0.<init>()     // Catch: java.lang.Exception -> L59
            java.lang.Class<android.media.MediaRecorder> r1 = android.media.MediaRecorder.class
            java.lang.String r2 = "setOutputFile"
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L59
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.Exception -> L59
            boolean r1 = r8.a(r1, r2, r4)     // Catch: java.lang.Exception -> L59
            if (r1 == 0) goto L1c
            java.lang.String r2 = "0"
            r0.put(r2, r1)     // Catch: java.lang.Exception -> L59
        L1c:
            java.lang.Class<android.hardware.Camera> r1 = android.hardware.Camera.class
            java.lang.String r2 = "takePicture"
            r4 = 3
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L59
            java.lang.Class<android.hardware.Camera$ShutterCallback> r5 = android.hardware.Camera.ShutterCallback.class
            r4[r6] = r5     // Catch: java.lang.Exception -> L59
            java.lang.Class<android.hardware.Camera$PictureCallback> r5 = android.hardware.Camera.PictureCallback.class
            r4[r3] = r5     // Catch: java.lang.Exception -> L59
            r7 = 2
            r4[r7] = r5     // Catch: java.lang.Exception -> L59
            boolean r1 = r8.a(r1, r2, r4)     // Catch: java.lang.Exception -> L59
            if (r1 == 0) goto L39
            java.lang.String r2 = "1"
            r0.put(r2, r1)     // Catch: java.lang.Exception -> L59
        L39:
            java.lang.Class<android.media.MediaPlayer> r1 = android.media.MediaPlayer.class
            java.lang.String r2 = "setDataSource"
            java.lang.Class[] r4 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L59
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r4[r6] = r5     // Catch: java.lang.Exception -> L59
            java.lang.Class<android.net.Uri> r5 = android.net.Uri.class
            r4[r3] = r5     // Catch: java.lang.Exception -> L59
            boolean r1 = r8.a(r1, r2, r4)     // Catch: java.lang.Exception -> L59
            if (r1 == 0) goto L52
            java.lang.String r2 = "2"
            r0.put(r2, r1)     // Catch: java.lang.Exception -> L59
        L52:
            int r1 = r0.length()     // Catch: java.lang.Exception -> L59
            if (r1 <= 0) goto L59
            return r0
        L59:
            r0 = 0
            return r0
    }

    public org.json.JSONObject f() {
            r11 = this;
            java.lang.Class<java.security.MessageDigest> r0 = java.security.MessageDigest.class
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.Class<byte[]> r2 = byte[].class
            r3 = 0
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> L95
            r4.<init>()     // Catch: java.lang.Exception -> L95
            java.lang.Class<javax.crypto.Cipher> r5 = javax.crypto.Cipher.class
            java.lang.String r6 = "doFinal"
            r7 = 1
            java.lang.Class[] r8 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L95
            r9 = 0
            r8[r9] = r2     // Catch: java.lang.Exception -> L95
            boolean r5 = r11.a(r5, r6, r8)     // Catch: java.lang.Exception -> L95
            java.lang.String r6 = "0"
            r4.put(r6, r5)     // Catch: java.lang.Exception -> L95
            java.lang.Class<java.security.SecureRandom> r6 = java.security.SecureRandom.class
            java.lang.String r8 = "setSeed"
            java.lang.Class[] r10 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L95
            r10[r9] = r2     // Catch: java.lang.Exception -> L95
            boolean r6 = r11.a(r6, r8, r10)     // Catch: java.lang.Exception -> L95
            java.lang.String r8 = "1"
            r4.put(r8, r6)     // Catch: java.lang.Exception -> L95
            if (r6 == 0) goto L33
            r5 = 1
        L33:
            java.lang.String r6 = "update"
            java.lang.Class[] r8 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L95
            r8[r9] = r2     // Catch: java.lang.Exception -> L95
            boolean r2 = r11.a(r0, r6, r8)     // Catch: java.lang.Exception -> L95
            java.lang.String r6 = "2"
            r4.put(r6, r2)     // Catch: java.lang.Exception -> L95
            if (r2 == 0) goto L45
            r5 = 1
        L45:
            java.lang.String r2 = "getInstance"
            java.lang.Class[] r6 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L95
            r6[r9] = r1     // Catch: java.lang.Exception -> L95
            boolean r0 = r11.a(r0, r2, r6)     // Catch: java.lang.Exception -> L95
            java.lang.String r2 = "3"
            r4.put(r2, r0)     // Catch: java.lang.Exception -> L95
            if (r0 == 0) goto L57
            r5 = 1
        L57:
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.String r2 = "parse"
            java.lang.Class[] r6 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L95
            r6[r9] = r1     // Catch: java.lang.Exception -> L95
            boolean r0 = r11.a(r0, r2, r6)     // Catch: java.lang.Exception -> L95
            java.lang.String r2 = "4"
            r4.put(r2, r0)     // Catch: java.lang.Exception -> L95
            if (r0 == 0) goto L6b
            r5 = 1
        L6b:
            java.lang.Class<android.database.sqlite.SQLiteDatabase> r0 = android.database.sqlite.SQLiteDatabase.class
            java.lang.String r2 = "execSQL"
            java.lang.Class[] r6 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L95
            r6[r9] = r1     // Catch: java.lang.Exception -> L95
            boolean r0 = r11.a(r0, r2, r6)     // Catch: java.lang.Exception -> L95
            java.lang.String r1 = "5"
            r4.put(r1, r0)     // Catch: java.lang.Exception -> L95
            if (r0 == 0) goto L7f
            r5 = 1
        L7f:
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            java.lang.String r1 = "finish"
            java.lang.Class[] r2 = new java.lang.Class[r9]     // Catch: java.lang.Exception -> L95
            boolean r0 = r11.a(r0, r1, r2)     // Catch: java.lang.Exception -> L95
            java.lang.String r1 = "6"
            r4.put(r1, r0)     // Catch: java.lang.Exception -> L95
            if (r0 == 0) goto L91
            goto L92
        L91:
            r7 = r5
        L92:
            if (r7 == 0) goto L95
            return r4
        L95:
            return r3
    }

    public org.json.JSONObject g() {
            r10 = this;
            java.lang.Class<byte[]> r0 = byte[].class
            java.lang.String r1 = "toString"
            r2 = 0
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L95
            r3.<init>()     // Catch: java.lang.Exception -> L95
            java.lang.Class<org.json.JSONObject> r4 = org.json.JSONObject.class
            r5 = 0
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L95
            boolean r4 = r10.a(r4, r1, r6)     // Catch: java.lang.Exception -> L95
            if (r4 == 0) goto L1a
            java.lang.String r6 = "0"
            r3.put(r6, r4)     // Catch: java.lang.Exception -> L95
        L1a:
            java.lang.Class<android.text.TextUtils> r4 = android.text.TextUtils.class
            java.lang.String r6 = "isEmpty"
            r7 = 1
            java.lang.Class[] r8 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L95
            java.lang.Class<java.lang.CharSequence> r9 = java.lang.CharSequence.class
            r8[r5] = r9     // Catch: java.lang.Exception -> L95
            boolean r4 = r10.a(r4, r6, r8)     // Catch: java.lang.Exception -> L95
            if (r4 == 0) goto L30
            java.lang.String r6 = "1"
            r3.put(r6, r4)     // Catch: java.lang.Exception -> L95
        L30:
            java.lang.Class<org.json.JSONArray> r4 = org.json.JSONArray.class
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L95
            boolean r1 = r10.a(r4, r1, r6)     // Catch: java.lang.Exception -> L95
            if (r1 == 0) goto L3f
            java.lang.String r4 = "2"
            r3.put(r4, r1)     // Catch: java.lang.Exception -> L95
        L3f:
            java.lang.Class<javax.crypto.Cipher> r1 = javax.crypto.Cipher.class
            java.lang.String r4 = "doFinal"
            java.lang.Class[] r6 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L95
            r6[r5] = r0     // Catch: java.lang.Exception -> L95
            boolean r1 = r10.a(r1, r4, r6)     // Catch: java.lang.Exception -> L95
            if (r1 == 0) goto L52
            java.lang.String r4 = "3"
            r3.put(r4, r1)     // Catch: java.lang.Exception -> L95
        L52:
            java.lang.Class<java.io.ByteArrayOutputStream> r1 = java.io.ByteArrayOutputStream.class
            java.lang.String r4 = "toByteArray"
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L95
            boolean r1 = r10.a(r1, r4, r6)     // Catch: java.lang.Exception -> L95
            if (r1 == 0) goto L63
            java.lang.String r4 = "4"
            r3.put(r4, r1)     // Catch: java.lang.Exception -> L95
        L63:
            java.lang.Class<java.io.FileOutputStream> r1 = java.io.FileOutputStream.class
            java.lang.String r4 = "write"
            java.lang.Class[] r6 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L95
            r6[r5] = r0     // Catch: java.lang.Exception -> L95
            boolean r0 = r10.a(r1, r4, r6)     // Catch: java.lang.Exception -> L95
            if (r0 == 0) goto L76
            java.lang.String r1 = "5"
            r3.put(r1, r0)     // Catch: java.lang.Exception -> L95
        L76:
            java.lang.Class<java.net.HttpURLConnection> r0 = java.net.HttpURLConnection.class
            java.lang.String r1 = "setRequestProperty"
            r4 = 2
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L95
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r4[r5] = r6     // Catch: java.lang.Exception -> L95
            r4[r7] = r6     // Catch: java.lang.Exception -> L95
            boolean r0 = r10.a(r0, r1, r4)     // Catch: java.lang.Exception -> L95
            if (r0 == 0) goto L8e
            java.lang.String r1 = "6"
            r3.put(r1, r0)     // Catch: java.lang.Exception -> L95
        L8e:
            int r0 = r3.length()     // Catch: java.lang.Exception -> L95
            if (r0 <= 0) goto L95
            return r3
        L95:
            return r2
    }
}
