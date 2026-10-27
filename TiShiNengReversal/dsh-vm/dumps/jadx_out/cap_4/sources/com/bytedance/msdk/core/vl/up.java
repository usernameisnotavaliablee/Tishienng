package com.bytedance.msdk.core.vl;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class up {

    /* renamed from: r, reason: collision with root package name */
    private static com.bytedance.msdk.core.vl.up f2284r;
    private final java.util.List<java.lang.ref.WeakReference<com.bytedance.msdk.core.vl.m>> cw;
    private final java.util.Set<java.lang.String> j;
    private final java.util.List<com.bytedance.msdk.core.vl.m> xt;

    static {
            return
    }

    private up() {
            r2 = this;
            r2.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r1 = 1
            r0.<init>(r1)
            r2.j = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            r2.xt = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            r2.cw = r0
            r2.xt()
            return
    }

    @androidx.annotation.NonNull
    private java.util.List<java.lang.String> cw(@androidx.annotation.NonNull android.app.Activity r6, @androidx.annotation.NonNull java.lang.String[] r7, @androidx.annotation.Nullable com.bytedance.msdk.core.vl.m r8) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r7.length
            r0.<init>(r1)
            int r1 = r7.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L30
            r3 = r7[r2]
            java.util.Set<java.lang.String> r4 = r5.j
            boolean r4 = r4.contains(r3)
            if (r4 != 0) goto L1c
            if (r8 == 0) goto L2d
            com.bytedance.msdk.core.vl.r r4 = com.bytedance.msdk.core.vl.r.cw
            r8.j(r3, r4)
            goto L2d
        L1c:
            boolean r4 = r5.j(r6, r3)
            if (r4 != 0) goto L26
            r0.add(r3)
            goto L2d
        L26:
            if (r8 == 0) goto L2d
            com.bytedance.msdk.core.vl.r r4 = com.bytedance.msdk.core.vl.r.j
            r8.j(r3, r4)
        L2d:
            int r2 = r2 + 1
            goto L8
        L30:
            return r0
    }

    public static com.bytedance.msdk.core.vl.up j() {
            com.bytedance.msdk.core.vl.up r0 = com.bytedance.msdk.core.vl.up.f2284r
            if (r0 != 0) goto Lb
            com.bytedance.msdk.core.vl.up r0 = new com.bytedance.msdk.core.vl.up
            r0.<init>()
            com.bytedance.msdk.core.vl.up.f2284r = r0
        Lb:
            com.bytedance.msdk.core.vl.up r0 = com.bytedance.msdk.core.vl.up.f2284r
            return r0
    }

    private synchronized void j(@androidx.annotation.Nullable com.bytedance.msdk.core.vl.m r4) {
            r3 = this;
            monitor-enter(r3)
            java.util.List<java.lang.ref.WeakReference<com.bytedance.msdk.core.vl.m>> r0 = r3.cw     // Catch: java.lang.Throwable -> L20
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
            goto L40
        L22:
            r0.remove()     // Catch: java.lang.Throwable -> L20
            goto L7
        L26:
            java.util.List<com.bytedance.msdk.core.vl.m> r0 = r3.xt     // Catch: java.lang.Throwable -> L20
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L20
        L2c:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L20
            com.bytedance.msdk.core.vl.m r1 = (com.bytedance.msdk.core.vl.m) r1     // Catch: java.lang.Throwable -> L20
            if (r1 != r4) goto L2c
            r0.remove()     // Catch: java.lang.Throwable -> L20
            goto L2c
        L3e:
            monitor-exit(r3)
            return
        L40:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L20
            throw r4
    }

    private synchronized void j(@androidx.annotation.NonNull java.lang.String[] r2, @androidx.annotation.Nullable com.bytedance.msdk.core.vl.m r3) {
            r1 = this;
            monitor-enter(r1)
            if (r3 == 0) goto L19
            r3.j(r2)     // Catch: java.lang.Throwable -> L16
            java.util.List<com.bytedance.msdk.core.vl.m> r2 = r1.xt     // Catch: java.lang.Throwable -> L16
            r2.add(r3)     // Catch: java.lang.Throwable -> L16
            java.util.List<java.lang.ref.WeakReference<com.bytedance.msdk.core.vl.m>> r2 = r1.cw     // Catch: java.lang.Throwable -> L16
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L16
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L16
            r2.add(r0)     // Catch: java.lang.Throwable -> L16
            goto L19
        L16:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            throw r2
        L19:
            monitor-exit(r1)
            return
    }

    private void j(@androidx.annotation.NonNull java.lang.String[] r7, @androidx.annotation.NonNull int[] r8) {
            r6 = this;
            int r0 = r7.length     // Catch: java.lang.Throwable -> L6
            int r1 = r8.length     // Catch: java.lang.Throwable -> L6
            if (r1 >= r0) goto L8
            int r0 = r8.length     // Catch: java.lang.Throwable -> L6
            goto L8
        L6:
            r7 = move-exception
            goto L4b
        L8:
            java.util.List<java.lang.ref.WeakReference<com.bytedance.msdk.core.vl.m>> r1 = r6.cw     // Catch: java.lang.Throwable -> L6
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L6
        Le:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L6
            if (r2 == 0) goto L37
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L6
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch: java.lang.Throwable -> L6
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L6
            com.bytedance.msdk.core.vl.m r2 = (com.bytedance.msdk.core.vl.m) r2     // Catch: java.lang.Throwable -> L6
            r3 = 0
        L21:
            if (r3 >= r0) goto Le
            if (r2 == 0) goto L33
            r4 = r7[r3]     // Catch: java.lang.Throwable -> L6
            r5 = r8[r3]     // Catch: java.lang.Throwable -> L6
            boolean r4 = r2.j(r4, r5)     // Catch: java.lang.Throwable -> L6
            if (r4 == 0) goto L30
            goto L33
        L30:
            int r3 = r3 + 1
            goto L21
        L33:
            r1.remove()     // Catch: java.lang.Throwable -> L6
            goto Le
        L37:
            java.util.List<com.bytedance.msdk.core.vl.m> r7 = r6.xt     // Catch: java.lang.Throwable -> L6
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L6
        L3d:
            boolean r8 = r7.hasNext()     // Catch: java.lang.Throwable -> L6
            if (r8 == 0) goto L4a
            r7.next()     // Catch: java.lang.Throwable -> L6
            r7.remove()     // Catch: java.lang.Throwable -> L6
            goto L3d
        L4a:
            return
        L4b:
            com.bytedance.sdk.component.utils.vl.j(r7)
            return
    }

    private void xt() {
            r4 = this;
            android.content.Context r0 = com.bytedance.msdk.core.xt.getContext()
            if (r0 != 0) goto L7
            goto L39
        L7:
            android.content.pm.PackageManager r1 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L39
            java.lang.String r0 = r0.getPackageName()     // Catch: java.lang.Throwable -> L39
            if (r1 != 0) goto L12
            goto L39
        L12:
            r2 = 4096(0x1000, float:5.74E-42)
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r0, r2)     // Catch: java.lang.Throwable -> L39
            if (r0 != 0) goto L1b
            goto L39
        L1b:
            java.lang.String[] r0 = r0.requestedPermissions     // Catch: java.lang.Throwable -> L39
            if (r0 == 0) goto L39
            int r1 = r0.length     // Catch: java.lang.Throwable -> L39
            if (r1 != 0) goto L23
            goto L39
        L23:
            r1 = 0
        L24:
            int r2 = r0.length     // Catch: java.lang.Throwable -> L39
            if (r1 >= r2) goto L39
            r2 = r0[r1]     // Catch: java.lang.Throwable -> L39
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L39
            if (r2 != 0) goto L36
            java.util.Set<java.lang.String> r2 = r4.j     // Catch: java.lang.Throwable -> L39
            r3 = r0[r1]     // Catch: java.lang.Throwable -> L39
            r2.add(r3)     // Catch: java.lang.Throwable -> L39
        L36:
            int r1 = r1 + 1
            goto L24
        L39:
            return
    }

    private void xt(@androidx.annotation.NonNull android.app.Activity r5, @androidx.annotation.NonNull java.lang.String[] r6, @androidx.annotation.Nullable com.bytedance.msdk.core.vl.m r7) {
            r4 = this;
            int r0 = r6.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L35
            r2 = r6[r1]
            if (r7 == 0) goto L32
            java.util.Set<java.lang.String> r3 = r4.j     // Catch: java.lang.Throwable -> L17
            boolean r3 = r3.contains(r2)     // Catch: java.lang.Throwable -> L17
            if (r3 != 0) goto L19
            com.bytedance.msdk.core.vl.r r3 = com.bytedance.msdk.core.vl.r.cw     // Catch: java.lang.Throwable -> L17
            boolean r2 = r7.j(r2, r3)     // Catch: java.lang.Throwable -> L17
            goto L2c
        L17:
            r2 = move-exception
            goto L2f
        L19:
            int r3 = com.bytedance.msdk.core.vl.cw.j(r5, r2)     // Catch: java.lang.Throwable -> L17
            if (r3 == 0) goto L26
            com.bytedance.msdk.core.vl.r r3 = com.bytedance.msdk.core.vl.r.xt     // Catch: java.lang.Throwable -> L17
            boolean r2 = r7.j(r2, r3)     // Catch: java.lang.Throwable -> L17
            goto L2c
        L26:
            com.bytedance.msdk.core.vl.r r3 = com.bytedance.msdk.core.vl.r.j     // Catch: java.lang.Throwable -> L17
            boolean r2 = r7.j(r2, r3)     // Catch: java.lang.Throwable -> L17
        L2c:
            if (r2 == 0) goto L32
            goto L35
        L2f:
            com.bytedance.sdk.component.utils.vl.j(r2)
        L32:
            int r1 = r1 + 1
            goto L2
        L35:
            r4.j(r7)
            return
    }

    public synchronized void j(@androidx.annotation.Nullable android.app.Activity r3, @androidx.annotation.NonNull java.lang.String[] r4, @androidx.annotation.Nullable com.bytedance.msdk.core.vl.m r5) {
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L3b
            r2.j(r4, r5)     // Catch: java.lang.Throwable -> L11
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L11
            r1 = 23
            if (r0 >= r1) goto L13
            r2.xt(r3, r4, r5)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r2)
            return
        L11:
            r3 = move-exception
            goto L34
        L13:
            java.util.List r4 = r2.cw(r3, r4, r5)     // Catch: java.lang.Throwable -> L11
            boolean r0 = r4.isEmpty()     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L22
            r2.j(r5)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r2)
            return
        L22:
            int r5 = r4.size()     // Catch: java.lang.Throwable -> L11
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L11
            java.lang.Object[] r4 = r4.toArray(r5)     // Catch: java.lang.Throwable -> L11
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch: java.lang.Throwable -> L11
            r5 = 1
            com.bytedance.msdk.core.vl.cw.requestPermissions(r3, r4, r5)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r2)
            return
        L34:
            com.bytedance.sdk.component.utils.vl.j(r3)     // Catch: java.lang.Throwable -> L38
            goto L3b
        L38:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L38
            throw r3
        L3b:
            monitor-exit(r2)
            return
    }

    public synchronized void j(@androidx.annotation.NonNull android.app.Activity r6, @androidx.annotation.NonNull java.lang.String[] r7, @androidx.annotation.NonNull int[] r8) {
            r5 = this;
            monitor-enter(r5)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1f
            r1 = 3
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1f
            int r0 = r7.length     // Catch: java.lang.Throwable -> L1f
            r1 = 0
        L9:
            if (r1 >= r0) goto L2a
            r2 = r7[r1]     // Catch: java.lang.Throwable -> L1f
            r3 = r8[r1]     // Catch: java.lang.Throwable -> L1f
            r4 = -1
            if (r3 == r4) goto L21
            boolean r3 = com.bytedance.msdk.tl.a.up()     // Catch: java.lang.Throwable -> L1f
            if (r3 == 0) goto L27
            boolean r2 = com.bytedance.msdk.core.vl.xt.j(r6, r2)     // Catch: java.lang.Throwable -> L1f
            if (r2 != 0) goto L27
            goto L21
        L1f:
            r6 = move-exception
            goto L2f
        L21:
            r2 = r8[r1]     // Catch: java.lang.Throwable -> L1f
            if (r2 == r4) goto L27
            r8[r1] = r4     // Catch: java.lang.Throwable -> L1f
        L27:
            int r1 = r1 + 1
            goto L9
        L2a:
            r5.j(r7, r8)     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r5)
            return
        L2f:
            com.bytedance.sdk.component.utils.vl.j(r6)     // Catch: java.lang.Throwable -> L34
            monitor-exit(r5)
            return
        L34:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L34
            throw r6
    }

    public synchronized boolean j(@androidx.annotation.Nullable android.content.Context r4, @androidx.annotation.NonNull java.lang.String r5) {
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            if (r4 == 0) goto L3b
            boolean r1 = com.bytedance.msdk.tl.a.up()     // Catch: java.lang.Throwable -> L20
            r2 = 1
            if (r1 == 0) goto L26
            boolean r1 = com.bytedance.msdk.core.vl.xt.j(r4, r5)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L24
            int r4 = com.bytedance.msdk.core.vl.cw.j(r4, r5)     // Catch: java.lang.Throwable -> L20
            if (r4 == 0) goto L22
            java.util.Set<java.lang.String> r4 = r3.j     // Catch: java.lang.Throwable -> L20
            boolean r4 = r4.contains(r5)     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L24
            goto L22
        L20:
            r4 = move-exception
            goto L39
        L22:
            monitor-exit(r3)
            return r2
        L24:
            monitor-exit(r3)
            return r0
        L26:
            int r4 = com.bytedance.msdk.core.vl.cw.j(r4, r5)     // Catch: java.lang.Throwable -> L20
            if (r4 == 0) goto L37
            java.util.Set<java.lang.String> r4 = r3.j     // Catch: java.lang.Throwable -> L20
            boolean r4 = r4.contains(r5)     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L35
            goto L37
        L35:
            monitor-exit(r3)
            return r0
        L37:
            monitor-exit(r3)
            return r2
        L39:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L20
            throw r4
        L3b:
            monitor-exit(r3)
            return r0
    }
}
