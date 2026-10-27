package com.bytedance.j.xt.tl;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class f {
    private static java.lang.String a;
    private static java.lang.Class<?> b;
    private static java.lang.reflect.Field c;
    private static java.lang.reflect.Field d;
    private static boolean e;

    static {
            return
    }

    public f() {
            r1 = this;
            r1.<init>()
            return
    }

    @androidx.annotation.Nullable
    private static java.lang.Class<?> a(android.content.Context r1) {
            java.lang.Class<?> r0 = com.bytedance.j.xt.tl.f.b
            if (r0 != 0) goto L26
            boolean r0 = com.bytedance.j.xt.tl.f.e
            if (r0 != 0) goto L26
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.ClassNotFoundException -> L23
            r0.<init>()     // Catch: java.lang.ClassNotFoundException -> L23
            java.lang.String r1 = r1.getPackageName()     // Catch: java.lang.ClassNotFoundException -> L23
            r0.append(r1)     // Catch: java.lang.ClassNotFoundException -> L23
            java.lang.String r1 = ".BuildConfig"
            r0.append(r1)     // Catch: java.lang.ClassNotFoundException -> L23
            java.lang.String r1 = r0.toString()     // Catch: java.lang.ClassNotFoundException -> L23
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.ClassNotFoundException -> L23
            com.bytedance.j.xt.tl.f.b = r1     // Catch: java.lang.ClassNotFoundException -> L23
        L23:
            r1 = 1
            com.bytedance.j.xt.tl.f.e = r1
        L26:
            java.lang.Class<?> r1 = com.bytedance.j.xt.tl.f.b
            return r1
    }

    public static boolean b(android.content.Context r0) {
            r0 = 0
            return r0
    }

    private static long c(int r4) {
            if (r4 >= 0) goto L5
            r0 = 0
            return r0
        L5:
            long r0 = (long) r4
            r2 = 1024(0x400, double:5.06E-321)
            long r0 = r0 * r2
            return r0
    }

    @androidx.annotation.Nullable
    public static android.app.ActivityManager.ProcessErrorStateInfo d(android.content.Context r6, int r7) {
            java.lang.String r0 = "activity"
            java.lang.Object r6 = r6.getSystemService(r0)
            android.app.ActivityManager r6 = (android.app.ActivityManager) r6
            r0 = 0
            if (r6 != 0) goto Lc
            return r0
        Lc:
            r1 = 0
        Ld:
            if (r1 >= r7) goto L33
            r2 = 200(0xc8, double:9.9E-322)
            android.os.SystemClock.sleep(r2)
            java.util.List r2 = r6.getProcessesInErrorState()
            if (r2 == 0) goto L30
            java.util.Iterator r2 = r2.iterator()
        L1e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L30
            java.lang.Object r3 = r2.next()
            android.app.ActivityManager$ProcessErrorStateInfo r3 = (android.app.ActivityManager.ProcessErrorStateInfo) r3
            int r4 = r3.condition
            r5 = 2
            if (r4 != r5) goto L1e
            return r3
        L30:
            int r1 = r1 + 1
            goto Ld
        L33:
            return r0
    }

    public static void e(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull org.json.JSONObject r2) {
            f(r2)     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = "activity"
            java.lang.Object r1 = r1.getSystemService(r0)     // Catch: java.lang.Throwable -> L13
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1     // Catch: java.lang.Throwable -> L13
            if (r1 == 0) goto L10
            l(r2, r1)     // Catch: java.lang.Throwable -> L13
        L10:
            g(r2, r1)     // Catch: java.lang.Throwable -> L13
        L13:
            return
    }

    private static void f(@androidx.annotation.NonNull org.json.JSONObject r5) throws org.json.JSONException {
            android.os.Debug$MemoryInfo r0 = new android.os.Debug$MemoryInfo
            r0.<init>()
            android.os.Debug.getMemoryInfo(r0)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            int r2 = r0.dalvikPrivateDirty
            long r2 = c(r2)
            java.lang.String r4 = "dalvikPrivateDirty"
            r1.put(r4, r2)
            int r2 = r0.dalvikPss
            long r2 = c(r2)
            java.lang.String r4 = "dalvikPss"
            r1.put(r4, r2)
            int r2 = r0.dalvikSharedDirty
            long r2 = c(r2)
            java.lang.String r4 = "dalvikSharedDirty"
            r1.put(r4, r2)
            int r2 = r0.nativePrivateDirty
            long r2 = c(r2)
            java.lang.String r4 = "nativePrivateDirty"
            r1.put(r4, r2)
            int r2 = r0.nativePss
            long r2 = c(r2)
            java.lang.String r4 = "nativePss"
            r1.put(r4, r2)
            int r2 = r0.nativeSharedDirty
            long r2 = c(r2)
            java.lang.String r4 = "nativeSharedDirty"
            r1.put(r4, r2)
            int r2 = r0.otherPrivateDirty
            long r2 = c(r2)
            java.lang.String r4 = "otherPrivateDirty"
            r1.put(r4, r2)
            int r2 = r0.otherPss
            long r2 = c(r2)
            java.lang.String r4 = "otherPss"
            r1.put(r4, r2)
            java.lang.String r2 = "otherSharedDirty"
            int r3 = r0.otherSharedDirty
            r1.put(r2, r3)
            java.lang.String r2 = "totalPrivateClean"
            int r3 = com.bytedance.j.xt.tl.p.b(r0)
            r1.put(r2, r3)
            java.lang.String r2 = "totalPrivateDirty"
            int r3 = r0.getTotalPrivateDirty()
            r1.put(r2, r3)
            int r2 = r0.getTotalPss()
            long r2 = c(r2)
            java.lang.String r4 = "totalPss"
            r1.put(r4, r2)
            java.lang.String r2 = "totalSharedClean"
            int r3 = com.bytedance.j.xt.tl.p.c(r0)
            r1.put(r2, r3)
            int r2 = r0.getTotalSharedDirty()
            long r2 = c(r2)
            java.lang.String r4 = "totalSharedDirty"
            r1.put(r4, r2)
            int r0 = com.bytedance.j.xt.tl.p.a(r0)
            long r2 = c(r0)
            java.lang.String r0 = "totalSwappablePss"
            r1.put(r0, r2)
            java.lang.String r0 = "memory_info"
            r5.put(r0, r1)
            return
    }

    private static void g(@androidx.annotation.NonNull org.json.JSONObject r5, android.app.ActivityManager r6) throws org.json.JSONException {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "native_heap_size"
            long r2 = android.os.Debug.getNativeHeapSize()
            r0.put(r1, r2)
            java.lang.String r1 = "native_heap_alloc_size"
            long r2 = android.os.Debug.getNativeHeapAllocatedSize()
            r0.put(r1, r2)
            java.lang.String r1 = "native_heap_free_size"
            long r2 = android.os.Debug.getNativeHeapFreeSize()
            r0.put(r1, r2)
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()
            java.lang.String r2 = "max_memory"
            long r3 = r1.maxMemory()
            r0.put(r2, r3)
            java.lang.String r2 = "free_memory"
            long r3 = r1.freeMemory()
            r0.put(r2, r3)
            java.lang.String r2 = "total_memory"
            long r3 = r1.totalMemory()
            r0.put(r2, r3)
            if (r6 == 0) goto L53
            java.lang.String r1 = "memory_class"
            int r2 = r6.getMemoryClass()
            r0.put(r1, r2)
            java.lang.String r1 = "large_memory_class"
            int r6 = r6.getLargeMemoryClass()
            r0.put(r1, r6)
        L53:
            java.lang.String r6 = "app_memory_info"
            r5.put(r6, r0)
            return
    }

    public static boolean h(android.content.Context r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r2 = "activity"
            java.lang.Object r4 = r4.getSystemService(r2)     // Catch: java.lang.Throwable -> L37
            android.app.ActivityManager r4 = (android.app.ActivityManager) r4     // Catch: java.lang.Throwable -> L37
            if (r4 != 0) goto L13
            return r0
        L13:
            r2 = 1
            java.util.List r4 = r4.getRunningTasks(r2)     // Catch: java.lang.Throwable -> L37
            if (r4 == 0) goto L37
            boolean r3 = r4.isEmpty()     // Catch: java.lang.Throwable -> L37
            if (r3 != 0) goto L37
            java.lang.Object r4 = r4.get(r0)     // Catch: java.lang.Throwable -> L37
            android.app.ActivityManager$RunningTaskInfo r4 = (android.app.ActivityManager.RunningTaskInfo) r4     // Catch: java.lang.Throwable -> L37
            android.content.ComponentName r4 = cn.jpush.android.ui.e.a(r4)     // Catch: java.lang.Throwable -> L37
            if (r4 == 0) goto L37
            java.lang.String r4 = r4.getPackageName()     // Catch: java.lang.Throwable -> L37
            boolean r4 = r1.equals(r4)     // Catch: java.lang.Throwable -> L37
            if (r4 == 0) goto L37
            return r2
        L37:
            return r0
    }

    public static int i(android.content.Context r1) {
            java.lang.Class r1 = a(r1)
            java.lang.reflect.Field r0 = com.bytedance.j.xt.tl.f.d
            if (r0 != 0) goto L14
            if (r1 == 0) goto L14
            java.lang.String r0 = "VERSION_CODE"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r0)     // Catch: java.lang.NoSuchFieldException -> L13
            com.bytedance.j.xt.tl.f.d = r1     // Catch: java.lang.NoSuchFieldException -> L13
            goto L14
        L13:
        L14:
            java.lang.reflect.Field r1 = com.bytedance.j.xt.tl.f.d
            if (r1 == 0) goto L24
            r0 = 0
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L24
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L24
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L24
            return r1
        L24:
            r1 = -1
            return r1
    }

    @androidx.annotation.Nullable
    public static java.lang.String j(android.content.Context r2) {
            java.lang.String r0 = com.bytedance.j.xt.tl.f.a
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L9
            return r0
        L9:
            java.lang.String r2 = com.bytedance.j.xt.tl.n.c(r2)     // Catch: java.lang.Throwable -> L10
            com.bytedance.j.xt.tl.f.a = r2     // Catch: java.lang.Throwable -> L10
            goto L11
        L10:
        L11:
            java.lang.String r2 = com.bytedance.j.xt.tl.f.a
            if (r2 != 0) goto L17
            java.lang.String r2 = ""
        L17:
            return r2
    }

    @androidx.annotation.NonNull
    public static java.lang.String k(android.content.Context r1) {
            java.lang.Class r1 = a(r1)
            java.lang.reflect.Field r0 = com.bytedance.j.xt.tl.f.c
            if (r0 != 0) goto L14
            if (r1 == 0) goto L14
            java.lang.String r0 = "VERSION_NAME"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r0)     // Catch: java.lang.NoSuchFieldException -> L13
            com.bytedance.j.xt.tl.f.c = r1     // Catch: java.lang.NoSuchFieldException -> L13
            goto L14
        L13:
        L14:
            java.lang.reflect.Field r1 = com.bytedance.j.xt.tl.f.c
            if (r1 == 0) goto L20
            r0 = 0
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L20
            return r1
        L20:
            java.lang.String r1 = ""
            return r1
    }

    private static void l(@androidx.annotation.NonNull org.json.JSONObject r4, android.app.ActivityManager r5) throws org.json.JSONException {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            android.app.ActivityManager$MemoryInfo r1 = new android.app.ActivityManager$MemoryInfo
            r1.<init>()
            r5.getMemoryInfo(r1)
            java.lang.String r5 = "availMem"
            long r2 = r1.availMem
            r0.put(r5, r2)
            java.lang.String r5 = "lowMemory"
            boolean r2 = r1.lowMemory
            r0.put(r5, r2)
            java.lang.String r5 = "threshold"
            long r2 = r1.threshold
            r0.put(r5, r2)
            java.lang.String r5 = "totalMem"
            long r1 = com.bytedance.j.xt.tl.a.a(r1)
            r0.put(r5, r1)
            java.lang.String r5 = "sys_memory_info"
            r4.put(r5, r0)
            return
    }

    public static boolean m(android.content.Context r4) {
            java.lang.String r0 = j(r4)
            r1 = 0
            if (r0 == 0) goto L10
            java.lang.String r2 = ":"
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L10
            return r1
        L10:
            r2 = 1
            if (r0 == 0) goto L1e
            java.lang.String r3 = r4.getPackageName()
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L1e
            return r2
        L1e:
            if (r0 == 0) goto L2d
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo()
            java.lang.String r4 = r4.processName
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L2d
            return r2
        L2d:
            return r1
    }
}
