package com.bytedance.j.xt.r;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class b implements java.lang.Thread.UncaughtExceptionHandler {
    private static com.bytedance.j.xt.r.b e;
    private java.lang.Thread.UncaughtExceptionHandler a;
    private java.util.HashSet<java.lang.Thread.UncaughtExceptionHandler> b;
    private com.bytedance.j.xt.r.c c;
    private long d;

    static class a extends com.bytedance.j.cw.j.xt.a {
        final /* synthetic */ java.lang.String c;

        a(java.lang.String r1) {
                r0 = this;
                r0.c = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                com.bytedance.j.xt.cw.b r0 = new com.bytedance.j.xt.cw.b     // Catch: java.lang.Throwable -> L2d
                r0.<init>()     // Catch: java.lang.Throwable -> L2d
                java.lang.String r1 = "data"
                java.lang.String r2 = r3.c     // Catch: java.lang.Throwable -> L2d
                r0.l(r1, r2)     // Catch: java.lang.Throwable -> L2d
                java.lang.String r1 = "userdefine"
                r2 = 1
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L2d
                r0.l(r1, r2)     // Catch: java.lang.Throwable -> L2d
                com.bytedance.j.xt.up.j.f r1 = com.bytedance.j.xt.up.j.f.c()     // Catch: java.lang.Throwable -> L2d
                com.bytedance.j.xt.cw r2 = com.bytedance.j.xt.cw.tl     // Catch: java.lang.Throwable -> L2d
                com.bytedance.j.xt.cw.b r0 = r1.a(r2, r0)     // Catch: java.lang.Throwable -> L2d
                if (r0 == 0) goto L2d
                com.bytedance.j.xt.a$d r1 = com.bytedance.j.xt.a.d.b()     // Catch: java.lang.Throwable -> L2d
                org.json.JSONObject r0 = r0.k()     // Catch: java.lang.Throwable -> L2d
                r1.a(r0)     // Catch: java.lang.Throwable -> L2d
            L2d:
                return
        }
    }

    private b() {
            r2 = this;
            r2.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r2.b = r0
            r0 = -1
            r2.d = r0
            r2.f()
            return
    }

    private void a(java.lang.Thread r3, java.lang.Throwable r4) {
            r2 = this;
            java.util.HashSet<java.lang.Thread$UncaughtExceptionHandler> r0 = r2.b     // Catch: java.lang.Throwable -> L1b
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1b
        L6:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L1b
            java.lang.Thread$UncaughtExceptionHandler r1 = (java.lang.Thread.UncaughtExceptionHandler) r1     // Catch: java.lang.Throwable -> L1b
            r1.uncaughtException(r3, r4)     // Catch: java.lang.Throwable -> L6
            goto L6
        L16:
            java.lang.Thread$UncaughtExceptionHandler r0 = r2.a     // Catch: java.lang.Throwable -> L1b
            r0.uncaughtException(r3, r4)     // Catch: java.lang.Throwable -> L1b
        L1b:
            return
    }

    public static com.bytedance.j.xt.r.b b() {
            com.bytedance.j.xt.r.b r0 = com.bytedance.j.xt.r.b.e
            if (r0 != 0) goto Lb
            com.bytedance.j.xt.r.b r0 = new com.bytedance.j.xt.r.b
            r0.<init>()
            com.bytedance.j.xt.r.b.e = r0
        Lb:
            com.bytedance.j.xt.r.b r0 = com.bytedance.j.xt.r.b.e
            return r0
    }

    public static void d(java.lang.String r2) {
            if (r2 != 0) goto L3
            return
        L3:
            com.bytedance.j.cw.j.xt.b r0 = com.bytedance.j.cw.j.xt.b.a()
            com.bytedance.j.xt.r.b$a r1 = new com.bytedance.j.xt.r.b$a
            r1.<init>(r2)
            r0.b(r1)
            return
    }

    private boolean e(java.lang.Thread r3, java.lang.Throwable r4) {
            r2 = this;
            com.bytedance.j.xt.g r0 = com.bytedance.j.xt.e.l()
            com.bytedance.j.xt.c r0 = r0.f()
            r1 = 1
            if (r0 == 0) goto L14
            boolean r3 = r0.j(r4, r3)     // Catch: java.lang.Throwable -> L14
            if (r3 == 0) goto L12
            goto L14
        L12:
            r3 = 0
            return r3
        L14:
            return r1
    }

    private void f() {
            r2 = this;
            java.lang.Thread$UncaughtExceptionHandler r0 = java.lang.Thread.getDefaultUncaughtExceptionHandler()
            if (r0 == r2) goto L15
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r2)
            java.lang.Thread$UncaughtExceptionHandler r1 = r2.a
            if (r1 != 0) goto L10
            r2.a = r0
            return
        L10:
            java.util.HashSet<java.lang.Thread$UncaughtExceptionHandler> r1 = r2.b
            r1.add(r0)
        L15:
            return
    }

    private void g(java.lang.Thread r2, java.lang.Throwable r3) {
            r1 = this;
            com.bytedance.j.xt.g r2 = com.bytedance.j.xt.e.l()
            java.util.List r2 = r2.g()
            com.bytedance.j.xt.cw r0 = com.bytedance.j.xt.cw.xt
            java.util.Iterator r2 = r2.iterator()
        Le:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L20
            r2.next()
            com.bytedance.j.xt.tl.o.b(r3)     // Catch: java.lang.Throwable -> L1b
            goto Le
        L1b:
            r0 = move-exception
            com.bytedance.j.xt.tl.i.c(r0)
            goto Le
        L20:
            return
    }

    public void c(com.bytedance.j.xt.r.c r1) {
            r0 = this;
            r0.c = r1
            return
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(java.lang.Thread r6, java.lang.Throwable r7) {
            r5 = this;
            long r0 = android.os.SystemClock.uptimeMillis()
            long r2 = r5.d
            long r0 = r0 - r2
            r2 = 20000(0x4e20, double:9.8813E-320)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto Le
            return
        Le:
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L48
            r5.d = r2     // Catch: java.lang.Throwable -> L48
            boolean r2 = r5.e(r6, r7)     // Catch: java.lang.Throwable -> L48
            if (r2 != 0) goto L22
            r5.a(r6, r7)
            return
        L22:
            com.bytedance.j.xt.cw r3 = com.bytedance.j.xt.cw.xt     // Catch: java.lang.Throwable -> L48
            r5.g(r6, r7)     // Catch: java.lang.Throwable -> L48
            if (r2 == 0) goto L4a
            com.bytedance.j.xt.r.c r2 = r5.c     // Catch: java.lang.Throwable -> L48
            if (r2 == 0) goto L4a
            boolean r2 = r2.j(r7)     // Catch: java.lang.Throwable -> L48
            if (r2 == 0) goto L4a
            com.bytedance.j.xt.r.c r2 = r5.c     // Catch: java.lang.Throwable -> L48
            r2.a(r0, r6, r7)     // Catch: java.lang.Throwable -> L48
            java.lang.String r0 = "crash_dispatcher"
            java.lang.String r1 = "end dispose "
            java.lang.String r2 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = r1.concat(r2)     // Catch: java.lang.Throwable -> L48
            com.bytedance.sdk.component.utils.vl.j(r0, r1)     // Catch: java.lang.Throwable -> L48
            goto L4a
        L48:
            r0 = move-exception
            goto L4e
        L4a:
            r5.a(r6, r7)
            return
        L4e:
            com.bytedance.j.xt.tl.i.b(r0)     // Catch: java.lang.Throwable -> L55
            r5.a(r6, r7)
            return
        L55:
            r0 = move-exception
            r5.a(r6, r7)
            throw r0
    }
}
