package com.bxkj.base.runtimepermissions;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class b {
    private static final java.lang.String d = "b";
    private static com.bxkj.base.runtimepermissions.b e;
    private final java.util.Set<java.lang.String> a;
    private final java.util.Set<java.lang.String> b;
    private final java.util.List<java.lang.ref.WeakReference<com.bxkj.base.runtimepermissions.c>> c;

    static {
            return
    }

    private b() {
            r2 = this;
            r2.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r1 = 1
            r0.<init>(r1)
            r2.a = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r1)
            r2.b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            r2.c = r0
            r2.h()
            return
    }

    private synchronized void a(@androidx.annotation.NonNull java.lang.String[] r2, @androidx.annotation.Nullable com.bxkj.base.runtimepermissions.c r3) {
            r1 = this;
            monitor-enter(r1)
            if (r3 != 0) goto L5
            monitor-exit(r1)
            return
        L5:
            r3.e(r2)     // Catch: java.lang.Throwable -> L14
            java.util.List<java.lang.ref.WeakReference<com.bxkj.base.runtimepermissions.c>> r2 = r1.c     // Catch: java.lang.Throwable -> L14
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L14
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L14
            r2.add(r0)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r1)
            return
        L14:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            throw r2
    }

    private void b(@androidx.annotation.NonNull android.app.Activity r5, @androidx.annotation.NonNull java.lang.String[] r6, @androidx.annotation.Nullable com.bxkj.base.runtimepermissions.c r7) {
            r4 = this;
            int r0 = r6.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L2a
            r2 = r6[r1]
            if (r7 == 0) goto L27
            java.util.Set<java.lang.String> r3 = r4.b
            boolean r3 = r3.contains(r2)
            if (r3 != 0) goto L16
            com.bxkj.base.runtimepermissions.a r3 = com.bxkj.base.runtimepermissions.a.c
            r7.d(r2, r3)
            goto L27
        L16:
            int r3 = androidx.core.content.ContextCompat.checkSelfPermission(r5, r2)
            if (r3 == 0) goto L22
            com.bxkj.base.runtimepermissions.a r3 = com.bxkj.base.runtimepermissions.a.b
            r7.d(r2, r3)
            goto L27
        L22:
            com.bxkj.base.runtimepermissions.a r3 = com.bxkj.base.runtimepermissions.a.a
            r7.d(r2, r3)
        L27:
            int r1 = r1 + 1
            goto L2
        L2a:
            return
    }

    public static com.bxkj.base.runtimepermissions.b c() {
            com.bxkj.base.runtimepermissions.b r0 = com.bxkj.base.runtimepermissions.b.e
            if (r0 != 0) goto Lb
            com.bxkj.base.runtimepermissions.b r0 = new com.bxkj.base.runtimepermissions.b
            r0.<init>()
            com.bxkj.base.runtimepermissions.b.e = r0
        Lb:
            com.bxkj.base.runtimepermissions.b r0 = com.bxkj.base.runtimepermissions.b.e
            return r0
    }

    @androidx.annotation.NonNull
    private synchronized java.lang.String[] d(@androidx.annotation.NonNull android.app.Activity r5) {
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L19
            r1 = 1
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L19
            r5.getPackageName()     // Catch: java.lang.Throwable -> L19 android.content.pm.PackageManager.NameNotFoundException -> L1b
            android.content.pm.PackageManager r1 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L19 android.content.pm.PackageManager.NameNotFoundException -> L1b
            java.lang.String r5 = r5.getPackageName()     // Catch: java.lang.Throwable -> L19 android.content.pm.PackageManager.NameNotFoundException -> L1b
            r2 = 4096(0x1000, float:5.74E-42)
            android.content.pm.PackageInfo r5 = r1.getPackageInfo(r5, r2)     // Catch: java.lang.Throwable -> L19 android.content.pm.PackageManager.NameNotFoundException -> L1b
            goto L1c
        L19:
            r5 = move-exception
            goto L3c
        L1b:
            r5 = 0
        L1c:
            if (r5 == 0) goto L2e
            java.lang.String[] r5 = r5.requestedPermissions     // Catch: java.lang.Throwable -> L19
            if (r5 == 0) goto L2e
            int r1 = r5.length     // Catch: java.lang.Throwable -> L19
            r2 = 0
        L24:
            if (r2 >= r1) goto L2e
            r3 = r5[r2]     // Catch: java.lang.Throwable -> L19
            r0.add(r3)     // Catch: java.lang.Throwable -> L19
            int r2 = r2 + 1
            goto L24
        L2e:
            int r5 = r0.size()     // Catch: java.lang.Throwable -> L19
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L19
            java.lang.Object[] r5 = r0.toArray(r5)     // Catch: java.lang.Throwable -> L19
            java.lang.String[] r5 = (java.lang.String[]) r5     // Catch: java.lang.Throwable -> L19
            monitor-exit(r4)
            return r5
        L3c:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L19
            throw r5
    }

    @androidx.annotation.NonNull
    private java.util.List<java.lang.String> e(@androidx.annotation.NonNull android.app.Activity r6, @androidx.annotation.NonNull java.lang.String[] r7, @androidx.annotation.Nullable com.bxkj.base.runtimepermissions.c r8) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r7.length
            r0.<init>(r1)
            int r1 = r7.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L38
            r3 = r7[r2]
            java.util.Set<java.lang.String> r4 = r5.b
            boolean r4 = r4.contains(r3)
            if (r4 != 0) goto L1c
            if (r8 == 0) goto L35
            com.bxkj.base.runtimepermissions.a r4 = com.bxkj.base.runtimepermissions.a.c
            r8.d(r3, r4)
            goto L35
        L1c:
            int r4 = androidx.core.content.ContextCompat.checkSelfPermission(r6, r3)
            if (r4 == 0) goto L2e
            java.util.Set<java.lang.String> r4 = r5.a
            boolean r4 = r4.contains(r3)
            if (r4 != 0) goto L35
            r0.add(r3)
            goto L35
        L2e:
            if (r8 == 0) goto L35
            com.bxkj.base.runtimepermissions.a r4 = com.bxkj.base.runtimepermissions.a.a
            r8.d(r3, r4)
        L35:
            int r2 = r2 + 1
            goto L8
        L38:
            return r0
    }

    private synchronized void h() {
            r5 = this;
            monitor-enter(r5)
            java.lang.Class<android.Manifest$permission> r0 = android.Manifest.permission.class
            java.lang.reflect.Field[] r0 = r0.getFields()     // Catch: java.lang.Throwable -> L16
            int r1 = r0.length     // Catch: java.lang.Throwable -> L16
            r2 = 0
        L9:
            if (r2 >= r1) goto L21
            r3 = r0[r2]     // Catch: java.lang.Throwable -> L16
            java.lang.String r4 = ""
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L16 java.lang.IllegalAccessException -> L18
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L16 java.lang.IllegalAccessException -> L18
            goto L19
        L16:
            r0 = move-exception
            goto L23
        L18:
            r3 = 0
        L19:
            java.util.Set<java.lang.String> r4 = r5.b     // Catch: java.lang.Throwable -> L16
            r4.add(r3)     // Catch: java.lang.Throwable -> L16
            int r2 = r2 + 1
            goto L9
        L21:
            monitor-exit(r5)
            return
        L23:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L16
            throw r0
    }

    private synchronized void j(@androidx.annotation.Nullable com.bxkj.base.runtimepermissions.c r4) {
            r3 = this;
            monitor-enter(r3)
            java.util.List<java.lang.ref.WeakReference<com.bxkj.base.runtimepermissions.c>> r0 = r3.c     // Catch: java.lang.Throwable -> L20
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L20
        L7:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L20
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1     // Catch: java.lang.Throwable -> L20
            java.lang.Object r2 = r1.get()     // Catch: java.lang.Throwable -> L20
            if (r2 == r4) goto L22
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L20
            if (r1 != 0) goto L7
            goto L22
        L20:
            r4 = move-exception
            goto L28
        L22:
            r0.remove()     // Catch: java.lang.Throwable -> L20
            goto L7
        L26:
            monitor-exit(r3)
            return
        L28:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L20
            throw r4
    }

    public synchronized boolean f(@androidx.annotation.Nullable android.content.Context r5, @androidx.annotation.NonNull java.lang.String[] r6) {
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            if (r5 != 0) goto L6
            monitor-exit(r4)
            return r0
        L6:
            int r1 = r6.length     // Catch: java.lang.Throwable -> L14
            r2 = 1
        L8:
            if (r0 >= r1) goto L16
            r3 = r6[r0]     // Catch: java.lang.Throwable -> L14
            boolean r3 = r4.g(r5, r3)     // Catch: java.lang.Throwable -> L14
            r2 = r2 & r3
            int r0 = r0 + 1
            goto L8
        L14:
            r5 = move-exception
            goto L18
        L16:
            monitor-exit(r4)
            return r2
        L18:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            throw r5
    }

    public synchronized boolean g(@androidx.annotation.Nullable android.content.Context r1, @androidx.annotation.NonNull java.lang.String r2) {
            r0 = this;
            monitor-enter(r0)
            if (r1 == 0) goto L18
            int r1 = androidx.core.content.ContextCompat.checkSelfPermission(r1, r2)     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L14
            java.util.Set<java.lang.String> r1 = r0.b     // Catch: java.lang.Throwable -> L12
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L18
            goto L14
        L12:
            r1 = move-exception
            goto L16
        L14:
            r1 = 1
            goto L19
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r1
        L18:
            r1 = 0
        L19:
            monitor-exit(r0)
            return r1
    }

    public synchronized void i(@androidx.annotation.NonNull java.lang.String[] r7, @androidx.annotation.NonNull int[] r8) {
            r6 = this;
            monitor-enter(r6)
            int r0 = r7.length     // Catch: java.lang.Throwable -> L7
            int r1 = r8.length     // Catch: java.lang.Throwable -> L7
            if (r1 >= r0) goto L9
            int r0 = r8.length     // Catch: java.lang.Throwable -> L7
            goto L9
        L7:
            r7 = move-exception
            goto L46
        L9:
            java.util.List<java.lang.ref.WeakReference<com.bxkj.base.runtimepermissions.c>> r1 = r6.c     // Catch: java.lang.Throwable -> L7
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L7
        Lf:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L7
            r3 = 0
            if (r2 == 0) goto L38
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L7
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch: java.lang.Throwable -> L7
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L7
            com.bxkj.base.runtimepermissions.c r2 = (com.bxkj.base.runtimepermissions.c) r2     // Catch: java.lang.Throwable -> L7
        L22:
            if (r3 >= r0) goto Lf
            if (r2 == 0) goto L34
            r4 = r7[r3]     // Catch: java.lang.Throwable -> L7
            r5 = r8[r3]     // Catch: java.lang.Throwable -> L7
            boolean r4 = r2.c(r4, r5)     // Catch: java.lang.Throwable -> L7
            if (r4 == 0) goto L31
            goto L34
        L31:
            int r3 = r3 + 1
            goto L22
        L34:
            r1.remove()     // Catch: java.lang.Throwable -> L7
            goto Lf
        L38:
            if (r3 >= r0) goto L44
            java.util.Set<java.lang.String> r8 = r6.a     // Catch: java.lang.Throwable -> L7
            r1 = r7[r3]     // Catch: java.lang.Throwable -> L7
            r8.remove(r1)     // Catch: java.lang.Throwable -> L7
            int r3 = r3 + 1
            goto L38
        L44:
            monitor-exit(r6)
            return
        L46:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L7
            throw r7
    }

    public synchronized void k(@androidx.annotation.Nullable android.app.Activity r2, @androidx.annotation.Nullable com.bxkj.base.runtimepermissions.c r3) {
            r1 = this;
            monitor-enter(r1)
            if (r2 != 0) goto L5
            monitor-exit(r1)
            return
        L5:
            java.lang.String[] r0 = r1.d(r2)     // Catch: java.lang.Throwable -> Le
            r1.l(r2, r0, r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)
            return
        Le:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            throw r2
    }

    public synchronized void l(@androidx.annotation.Nullable android.app.Activity r3, @androidx.annotation.NonNull java.lang.String[] r4, @androidx.annotation.Nullable com.bxkj.base.runtimepermissions.c r5) {
            r2 = this;
            monitor-enter(r2)
            if (r3 != 0) goto L5
            monitor-exit(r2)
            return
        L5:
            r2.a(r4, r5)     // Catch: java.lang.Throwable -> L12
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L12
            r1 = 23
            if (r0 >= r1) goto L14
            r2.b(r3, r4, r5)     // Catch: java.lang.Throwable -> L12
            goto L37
        L12:
            r3 = move-exception
            goto L39
        L14:
            java.util.List r4 = r2.e(r3, r4, r5)     // Catch: java.lang.Throwable -> L12
            boolean r0 = r4.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L22
            r2.j(r5)     // Catch: java.lang.Throwable -> L12
            goto L37
        L22:
            int r5 = r4.size()     // Catch: java.lang.Throwable -> L12
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L12
            java.lang.Object[] r5 = r4.toArray(r5)     // Catch: java.lang.Throwable -> L12
            java.lang.String[] r5 = (java.lang.String[]) r5     // Catch: java.lang.Throwable -> L12
            java.util.Set<java.lang.String> r0 = r2.a     // Catch: java.lang.Throwable -> L12
            r0.addAll(r4)     // Catch: java.lang.Throwable -> L12
            r4 = 1
            androidx.core.app.ActivityCompat.requestPermissions(r3, r5, r4)     // Catch: java.lang.Throwable -> L12
        L37:
            monitor-exit(r2)
            return
        L39:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            throw r3
    }

    public synchronized void m(@androidx.annotation.NonNull androidx.fragment.app.Fragment r4, @androidx.annotation.NonNull java.lang.String[] r5, @androidx.annotation.Nullable com.bxkj.base.runtimepermissions.c r6) {
            r3 = this;
            monitor-enter(r3)
            androidx.fragment.app.FragmentActivity r0 = r4.getActivity()     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L9
            monitor-exit(r3)
            return
        L9:
            r3.a(r5, r6)     // Catch: java.lang.Throwable -> L16
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L16
            r2 = 23
            if (r1 >= r2) goto L18
            r3.b(r0, r5, r6)     // Catch: java.lang.Throwable -> L16
            goto L3b
        L16:
            r4 = move-exception
            goto L3d
        L18:
            java.util.List r5 = r3.e(r0, r5, r6)     // Catch: java.lang.Throwable -> L16
            boolean r0 = r5.isEmpty()     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L26
            r3.j(r6)     // Catch: java.lang.Throwable -> L16
            goto L3b
        L26:
            int r6 = r5.size()     // Catch: java.lang.Throwable -> L16
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch: java.lang.Throwable -> L16
            java.lang.Object[] r6 = r5.toArray(r6)     // Catch: java.lang.Throwable -> L16
            java.lang.String[] r6 = (java.lang.String[]) r6     // Catch: java.lang.Throwable -> L16
            java.util.Set<java.lang.String> r0 = r3.a     // Catch: java.lang.Throwable -> L16
            r0.addAll(r5)     // Catch: java.lang.Throwable -> L16
            r5 = 1
            r4.requestPermissions(r6, r5)     // Catch: java.lang.Throwable -> L16
        L3b:
            monitor-exit(r3)
            return
        L3d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L16
            throw r4
    }
}
