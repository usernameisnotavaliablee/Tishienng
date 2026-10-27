package com.huawei.hmf.tasks.a;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class g extends android.app.Fragment {
    private static final java.util.WeakHashMap<android.app.Activity, java.lang.ref.WeakReference<com.huawei.hmf.tasks.a.g>> b = null;
    private final java.util.List<java.lang.ref.WeakReference<com.huawei.hmf.tasks.e<?>>> a;

    static {
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            com.huawei.hmf.tasks.a.g.b = r0
            return
    }

    public g() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a = r0
            return
    }

    private static com.huawei.hmf.tasks.a.g a(android.app.Activity r4) {
            java.util.WeakHashMap<android.app.Activity, java.lang.ref.WeakReference<com.huawei.hmf.tasks.a.g>> r0 = com.huawei.hmf.tasks.a.g.b
            java.lang.Object r1 = r0.get(r4)
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            if (r1 == 0) goto L17
            java.lang.Object r2 = r1.get()
            if (r2 == 0) goto L17
            java.lang.Object r4 = r1.get()
            com.huawei.hmf.tasks.a.g r4 = (com.huawei.hmf.tasks.a.g) r4
            return r4
        L17:
            android.app.FragmentManager r1 = r4.getFragmentManager()
            r2 = 0
            java.lang.String r3 = "com.huawei.hmf.tasks.lifecycle_fragment_tag"
            android.app.Fragment r3 = r1.findFragmentByTag(r3)     // Catch: java.lang.ClassCastException -> L39
            com.huawei.hmf.tasks.a.g r3 = (com.huawei.hmf.tasks.a.g) r3     // Catch: java.lang.ClassCastException -> L39
            if (r3 != 0) goto L2f
            com.huawei.hmf.tasks.a.g r1 = b(r1)     // Catch: java.lang.ClassCastException -> L2c
            r2 = r1
            goto L30
        L2c:
            r4 = move-exception
            r2 = r3
            goto L3a
        L2f:
            r2 = r3
        L30:
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch: java.lang.ClassCastException -> L39
            r1.<init>(r2)     // Catch: java.lang.ClassCastException -> L39
            r0.put(r4, r1)     // Catch: java.lang.ClassCastException -> L39
            return r2
        L39:
            r4 = move-exception
        L3a:
            r4.getMessage()
            return r2
    }

    private static com.huawei.hmf.tasks.a.g b(android.app.FragmentManager r2) {
            r0 = 0
            com.huawei.hmf.tasks.a.g r1 = new com.huawei.hmf.tasks.a.g     // Catch: java.lang.Exception -> L17
            r1.<init>()     // Catch: java.lang.Exception -> L17
            android.app.FragmentTransaction r2 = r2.beginTransaction()     // Catch: java.lang.Exception -> L14
            java.lang.String r0 = "com.huawei.hmf.tasks.lifecycle_fragment_tag"
            android.app.FragmentTransaction r2 = r2.add(r1, r0)     // Catch: java.lang.Exception -> L14
            r2.commitAllowingStateLoss()     // Catch: java.lang.Exception -> L14
            return r1
        L14:
            r2 = move-exception
            r0 = r1
            goto L18
        L17:
            r2 = move-exception
        L18:
            r2.getMessage()
            return r0
    }

    public static void c(android.app.Activity r2, com.huawei.hmf.tasks.e r3) {
            com.huawei.hmf.tasks.a.g r2 = a(r2)
            if (r2 == 0) goto L18
            java.util.List<java.lang.ref.WeakReference<com.huawei.hmf.tasks.e<?>>> r0 = r2.a
            monitor-enter(r0)
            java.util.List<java.lang.ref.WeakReference<com.huawei.hmf.tasks.e<?>>> r2 = r2.a     // Catch: java.lang.Throwable -> L15
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L15
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L15
            r2.add(r1)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return
        L15:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r2
        L18:
            return
    }

    @Override // android.app.Fragment
    public final void onStop() {
            r3 = this;
            super.onStop()
            java.util.List<java.lang.ref.WeakReference<com.huawei.hmf.tasks.e<?>>> r0 = r3.a
            monitor-enter(r0)
            java.util.List<java.lang.ref.WeakReference<com.huawei.hmf.tasks.e<?>>> r1 = r3.a     // Catch: java.lang.Throwable -> L24
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L24
        Lc:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L24
            if (r2 == 0) goto L26
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L24
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch: java.lang.Throwable -> L24
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L24
            com.huawei.hmf.tasks.e r2 = (com.huawei.hmf.tasks.e) r2     // Catch: java.lang.Throwable -> L24
            if (r2 == 0) goto Lc
            r2.cancel()     // Catch: java.lang.Throwable -> L24
            goto Lc
        L24:
            r1 = move-exception
            goto L2d
        L26:
            java.util.List<java.lang.ref.WeakReference<com.huawei.hmf.tasks.e<?>>> r1 = r3.a     // Catch: java.lang.Throwable -> L24
            r1.clear()     // Catch: java.lang.Throwable -> L24
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            return
        L2d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            throw r1
    }
}
