package com.bytedance.j.xt.up;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class h implements android.os.Handler.Callback {
    private static android.util.Printer j;
    private static com.bytedance.j.xt.up.h k;

    /* renamed from: l, reason: collision with root package name */
    private static final android.util.Printer f2133l = null;
    private android.os.Handler a;
    private int b;
    private long c;
    private long d;
    private final android.util.SparseArray<java.util.List<java.lang.Runnable>> e;
    private final java.util.List<android.util.Printer> f;
    private final java.util.List<android.util.Printer> g;
    private boolean h;
    private boolean i;

    static class a implements android.util.Printer {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.util.Printer
        public void println(java.lang.String r3) {
                r2 = this;
                if (r3 != 0) goto L3
                goto L39
            L3:
                java.lang.String r0 = ">>>>> Dispatching"
                boolean r0 = r3.startsWith(r0)
                if (r0 == 0) goto L13
                com.bytedance.j.xt.up.h r0 = com.bytedance.j.xt.up.h.b()
                r0.e(r3)
                goto L22
            L13:
                java.lang.String r0 = "<<<<< Finished"
                boolean r0 = r3.startsWith(r0)
                if (r0 == 0) goto L22
                com.bytedance.j.xt.up.h r0 = com.bytedance.j.xt.up.h.b()
                r0.k(r3)
            L22:
                android.util.Printer r0 = com.bytedance.j.xt.up.h.a()
                if (r0 == 0) goto L39
                android.util.Printer r0 = com.bytedance.j.xt.up.h.a()
                android.util.Printer r1 = com.bytedance.j.xt.up.h.h()
                if (r0 == r1) goto L39
                android.util.Printer r0 = com.bytedance.j.xt.up.h.a()
                r0.println(r3)
            L39:
                return
        }
    }

    static {
            com.bytedance.j.xt.up.h$a r0 = new com.bytedance.j.xt.up.h$a
            r0.<init>()
            com.bytedance.j.xt.up.h.f2133l = r0
            return
    }

    private h() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.b = r0
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r2.e = r1
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r2.f = r1
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r2.g = r1
            r2.h = r0
            android.os.HandlerThread r0 = com.bytedance.j.xt.up.a.a()
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r0 = r0.getLooper()
            r1.<init>(r0, r2)
            r2.a = r1
            r2.j()
            return
    }

    static /* synthetic */ android.util.Printer a() {
            android.util.Printer r0 = com.bytedance.j.xt.up.h.j
            return r0
    }

    public static com.bytedance.j.xt.up.h b() {
            com.bytedance.j.xt.up.h r0 = com.bytedance.j.xt.up.h.k
            if (r0 != 0) goto L19
            java.lang.Class<com.bytedance.j.xt.up.h> r0 = com.bytedance.j.xt.up.h.class
            monitor-enter(r0)
            com.bytedance.j.xt.up.h r1 = com.bytedance.j.xt.up.h.k     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.bytedance.j.xt.up.h r1 = new com.bytedance.j.xt.up.h     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.bytedance.j.xt.up.h.k = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.bytedance.j.xt.up.h r0 = com.bytedance.j.xt.up.h.k
            return r0
    }

    private static void f(java.util.List<? extends java.lang.Runnable> r1) {
            if (r1 == 0) goto L21
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L9
            goto L21
        L9:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L1d
        Ld:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Exception -> L1d
            if (r0 == 0) goto L21
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Exception -> L1d
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch: java.lang.Exception -> L1d
            r0.run()     // Catch: java.lang.Exception -> L1d
            goto Ld
        L1d:
            r1 = move-exception
            com.bytedance.j.xt.tl.i.b(r1)
        L21:
            return
    }

    private synchronized void g(java.util.List<? extends android.util.Printer> r2, java.lang.String r3) {
            r1 = this;
            monitor-enter(r1)
            if (r2 == 0) goto L2b
            boolean r0 = r2.isEmpty()     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto La
            goto L2b
        La:
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L20
        Le:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L20
            if (r0 == 0) goto L22
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L20
            android.util.Printer r0 = (android.util.Printer) r0     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L20
            r0.println(r3)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L20
            goto Le
        L1e:
            r2 = move-exception
            goto L29
        L20:
            r2 = move-exception
            goto L24
        L22:
            monitor-exit(r1)
            return
        L24:
            com.bytedance.j.xt.tl.i.b(r2)     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r1)
            return
        L29:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1e
            throw r2
        L2b:
            monitor-exit(r1)
            return
    }

    static /* synthetic */ android.util.Printer h() {
            android.util.Printer r0 = com.bytedance.j.xt.up.h.f2133l
            return r0
    }

    private android.util.Printer i() {
            r2 = this;
            java.lang.String r0 = "android.os.Looper"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L1b
            java.lang.String r1 = "mLogging"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Exception -> L1b
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Exception -> L1b
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch: java.lang.Exception -> L1b
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L1b
            android.util.Printer r0 = (android.util.Printer) r0     // Catch: java.lang.Exception -> L1b
            return r0
        L1b:
            r0 = move-exception
            com.bytedance.j.xt.tl.i.c(r0)
            r0 = 0
            return r0
    }

    public void c(long r8, java.lang.Runnable r10) {
            r7 = this;
            r4 = 1
            r5 = 0
            r0 = r7
            r1 = r8
            r3 = r10
            r0.d(r1, r3, r4, r5)
            return
    }

    public void d(long r6, java.lang.Runnable r8, int r9, long r10) {
            r5 = this;
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 >= 0) goto L7
            goto L3a
        L7:
            r0 = 0
        L8:
            if (r0 >= r9) goto L3a
            android.util.SparseArray<java.util.List<java.lang.Runnable>> r1 = r5.e
            int r2 = (int) r6
            java.lang.Object r1 = r1.get(r2)
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L33
            android.util.SparseArray<java.util.List<java.lang.Runnable>> r3 = r5.e
            monitor-enter(r3)
            android.util.SparseArray<java.util.List<java.lang.Runnable>> r1 = r5.e     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L2d
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L2d
            if (r1 != 0) goto L2f
            java.util.LinkedList r1 = new java.util.LinkedList     // Catch: java.lang.Throwable -> L2d
            r1.<init>()     // Catch: java.lang.Throwable -> L2d
            android.util.SparseArray<java.util.List<java.lang.Runnable>> r4 = r5.e     // Catch: java.lang.Throwable -> L2d
            r4.put(r2, r1)     // Catch: java.lang.Throwable -> L2d
            goto L2f
        L2d:
            r6 = move-exception
            goto L31
        L2f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2d
            goto L33
        L31:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2d
            throw r6
        L33:
            r1.add(r8)
            long r6 = r6 + r10
            int r0 = r0 + 1
            goto L8
        L3a:
            return
    }

    void e(java.lang.String r3) {
            r2 = this;
            boolean r0 = r2.i
            if (r0 != 0) goto Lc
            r0 = 32
            com.bytedance.j.xt.up.d.a(r0)
            r0 = 1
            r2.i = r0
        Lc:
            long r0 = android.os.SystemClock.uptimeMillis()
            r2.c = r0
            java.util.List<android.util.Printer> r0 = r2.f     // Catch: java.lang.Exception -> L1e
            r2.g(r0, r3)     // Catch: java.lang.Exception -> L1e
            android.os.Handler r3 = r2.a     // Catch: java.lang.Exception -> L1e
            r0 = 0
            r3.sendEmptyMessage(r0)     // Catch: java.lang.Exception -> L1e
            return
        L1e:
            r3 = move-exception
            com.bytedance.j.xt.tl.i.b(r3)
            return
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message r7) {
            r6 = this;
            r0 = 1
            android.os.Handler r1 = r6.a     // Catch: java.lang.Throwable -> L96
            r2 = 0
            boolean r1 = r1.hasMessages(r2)     // Catch: java.lang.Throwable -> L96
            if (r1 == 0) goto Lb
            return r0
        Lb:
            int r7 = r7.what     // Catch: java.lang.Throwable -> L96
            r1 = 2
            if (r7 == 0) goto L51
            if (r7 == r0) goto L28
            if (r7 == r1) goto L15
            goto L73
        L15:
            android.util.SparseArray<java.util.List<java.lang.Runnable>> r7 = r6.e     // Catch: java.lang.Throwable -> L96
            int r2 = r6.b     // Catch: java.lang.Throwable -> L96
            java.lang.Object r7 = r7.valueAt(r2)     // Catch: java.lang.Throwable -> L96
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> L96
            f(r7)     // Catch: java.lang.Throwable -> L96
            int r7 = r6.b     // Catch: java.lang.Throwable -> L96
            int r7 = r7 + r0
            r6.b = r7     // Catch: java.lang.Throwable -> L96
            goto L73
        L28:
            android.os.Handler r7 = r6.a     // Catch: java.lang.Throwable -> L96
            r7.removeMessages(r1)     // Catch: java.lang.Throwable -> L96
            android.util.SparseArray<java.util.List<java.lang.Runnable>> r7 = r6.e     // Catch: java.lang.Throwable -> L96
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L96
            if (r7 == 0) goto L50
            android.util.SparseArray<java.util.List<java.lang.Runnable>> r7 = r6.e     // Catch: java.lang.Throwable -> L96
            int r1 = r7.size()     // Catch: java.lang.Throwable -> L96
            int r1 = r1 - r0
            int r7 = r7.keyAt(r1)     // Catch: java.lang.Throwable -> L96
            if (r7 != 0) goto L50
            android.util.SparseArray<java.util.List<java.lang.Runnable>> r7 = r6.e     // Catch: java.lang.Throwable -> L96
            r1 = 2147483647(0x7fffffff, float:NaN)
            java.lang.Object r7 = r7.get(r1)     // Catch: java.lang.Throwable -> L96
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> L96
            f(r7)     // Catch: java.lang.Throwable -> L96
        L50:
            return r0
        L51:
            r6.b = r2     // Catch: java.lang.Throwable -> L96
            android.util.SparseArray<java.util.List<java.lang.Runnable>> r7 = r6.e     // Catch: java.lang.Throwable -> L96
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L96
            if (r7 == 0) goto L73
            android.util.SparseArray<java.util.List<java.lang.Runnable>> r7 = r6.e     // Catch: java.lang.Throwable -> L96
            int r7 = r7.keyAt(r2)     // Catch: java.lang.Throwable -> L96
            if (r7 != 0) goto L73
            android.util.SparseArray<java.util.List<java.lang.Runnable>> r7 = r6.e     // Catch: java.lang.Throwable -> L96
            java.lang.Object r7 = r7.valueAt(r2)     // Catch: java.lang.Throwable -> L96
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> L96
            f(r7)     // Catch: java.lang.Throwable -> L96
            int r7 = r6.b     // Catch: java.lang.Throwable -> L96
            int r7 = r7 + r0
            r6.b = r7     // Catch: java.lang.Throwable -> L96
        L73:
            int r7 = r6.b     // Catch: java.lang.Throwable -> L96
            android.util.SparseArray<java.util.List<java.lang.Runnable>> r2 = r6.e     // Catch: java.lang.Throwable -> L96
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L96
            if (r7 < r2) goto L7e
            return r0
        L7e:
            android.util.SparseArray<java.util.List<java.lang.Runnable>> r7 = r6.e     // Catch: java.lang.Throwable -> L96
            int r2 = r6.b     // Catch: java.lang.Throwable -> L96
            int r7 = r7.keyAt(r2)     // Catch: java.lang.Throwable -> L96
            long r2 = (long) r7     // Catch: java.lang.Throwable -> L96
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 == 0) goto L96
            android.os.Handler r7 = r6.a     // Catch: java.lang.Throwable -> L96
            long r4 = r6.c     // Catch: java.lang.Throwable -> L96
            long r4 = r4 + r2
            r7.sendEmptyMessageAtTime(r1, r4)     // Catch: java.lang.Throwable -> L96
        L96:
            return r0
    }

    public void j() {
            r2 = this;
            boolean r0 = r2.h
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r2.h = r0
            android.util.Printer r0 = r2.i()
            com.bytedance.j.xt.up.h.j = r0
            android.util.Printer r1 = com.bytedance.j.xt.up.h.f2133l
            if (r0 != r1) goto L15
            r0 = 0
            com.bytedance.j.xt.up.h.j = r0
        L15:
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r0.setMessageLogging(r1)
            return
    }

    void k(java.lang.String r3) {
            r2 = this;
            long r0 = android.os.SystemClock.uptimeMillis()
            r2.d = r0
            android.os.Handler r0 = r2.a     // Catch: java.lang.Exception -> L18
            r1 = 2
            r0.removeMessages(r1)     // Catch: java.lang.Exception -> L18
            java.util.List<android.util.Printer> r0 = r2.g     // Catch: java.lang.Exception -> L18
            r2.g(r0, r3)     // Catch: java.lang.Exception -> L18
            android.os.Handler r3 = r2.a     // Catch: java.lang.Exception -> L18
            r0 = 1
            r3.sendEmptyMessage(r0)     // Catch: java.lang.Exception -> L18
            return
        L18:
            r3 = move-exception
            com.bytedance.j.xt.tl.i.c(r3)
            return
    }
}
