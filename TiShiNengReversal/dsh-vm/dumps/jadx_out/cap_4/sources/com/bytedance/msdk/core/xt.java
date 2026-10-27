package com.bytedance.msdk.core;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class xt {
    private static volatile com.bytedance.msdk.up.xt.j<com.bytedance.msdk.up.j> cw;

    @android.annotation.SuppressLint({"StaticFieldLeak"})
    private static volatile android.content.Context j;
    private static volatile com.bytedance.msdk.core.ws.cw xt;

    public static class j {

        @android.annotation.SuppressLint({"StaticFieldLeak"})
        private static volatile android.app.Application j;

        static {
                java.lang.String r0 = "MyApplication"
                java.lang.Object r1 = xt()     // Catch: java.lang.Throwable -> L1f
                java.lang.Class r2 = r1.getClass()     // Catch: java.lang.Throwable -> L1f
                java.lang.String r3 = "getApplication"
                r4 = 0
                java.lang.reflect.Method r2 = r2.getMethod(r3, r4)     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r1 = r2.invoke(r1, r4)     // Catch: java.lang.Throwable -> L1f
                android.app.Application r1 = (android.app.Application) r1     // Catch: java.lang.Throwable -> L1f
                com.bytedance.msdk.core.xt.j.j = r1     // Catch: java.lang.Throwable -> L1f
                java.lang.String r1 = "application get success"
                com.bytedance.msdk.j.up.cw.r(r0, r1)     // Catch: java.lang.Throwable -> L1f
                return
            L1f:
                r1 = move-exception
                java.lang.String r2 = "application get failed"
                com.bytedance.msdk.j.up.cw.xt(r0, r2, r1)
                return
        }

        public j() {
                r1 = this;
                r1.<init>()
                return
        }

        public static android.app.Application j() {
                android.app.Application r0 = com.bytedance.msdk.core.xt.j.j
                return r0
        }

        private static java.lang.Object xt() {
                r0 = 0
                java.lang.String r1 = "android.app.ActivityThread"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L16
                java.lang.String r2 = "currentActivityThread"
                java.lang.reflect.Method r1 = r1.getMethod(r2, r0)     // Catch: java.lang.Throwable -> L16
                r2 = 1
                r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L16
                java.lang.Object r0 = r1.invoke(r0, r0)     // Catch: java.lang.Throwable -> L16
                return r0
            L16:
                r1 = move-exception
                java.lang.String r2 = "MyApplication"
                java.lang.String r3 = "ActivityThread get error, maybe api level <= 4.2.2"
                com.bytedance.msdk.j.up.cw.xt(r2, r3, r1)
                return r0
        }
    }

    public xt() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.content.Context getContext() {
            android.content.Context r0 = com.bytedance.msdk.core.xt.j
            if (r0 != 0) goto L8
            r0 = 0
            j(r0)
        L8:
            android.content.Context r0 = com.bytedance.msdk.core.xt.j
            return r0
    }

    public static com.bytedance.msdk.up.xt.j<com.bytedance.msdk.up.j> j() {
            com.bytedance.msdk.up.xt.j<com.bytedance.msdk.up.j> r0 = com.bytedance.msdk.core.xt.cw
            if (r0 != 0) goto L19
            java.lang.Class<com.bytedance.msdk.core.xt> r0 = com.bytedance.msdk.core.xt.class
            monitor-enter(r0)
            com.bytedance.msdk.up.xt.j<com.bytedance.msdk.up.j> r1 = com.bytedance.msdk.core.xt.cw     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.bytedance.msdk.up.xt.xt r1 = new com.bytedance.msdk.up.xt.xt     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.bytedance.msdk.core.xt.cw = r1     // Catch: java.lang.Throwable -> L13
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
            com.bytedance.msdk.up.xt.j<com.bytedance.msdk.up.j> r0 = com.bytedance.msdk.core.xt.cw
            return r0
    }

    public static synchronized void j(android.content.Context r3) {
            java.lang.Class<com.bytedance.msdk.core.xt> r0 = com.bytedance.msdk.core.xt.class
            monitor-enter(r0)
            android.content.Context r1 = com.bytedance.msdk.core.xt.j     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L31
            java.lang.Class<com.bytedance.msdk.core.xt> r1 = com.bytedance.msdk.core.xt.class
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L2f
            android.app.Application r2 = com.bytedance.msdk.core.xt.j.j()     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L1e
            android.app.Application r2 = com.bytedance.msdk.core.xt.j.j()     // Catch: java.lang.Throwable -> L1d
            com.bytedance.msdk.core.xt.j = r2     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L1e
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)
            return
        L1b:
            r3 = move-exception
            goto L2d
        L1d:
        L1e:
            if (r3 == 0) goto L2a
            android.content.Context r3 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L1b
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)     // Catch: java.lang.Throwable -> L1b
            com.bytedance.msdk.core.xt.j = r3     // Catch: java.lang.Throwable -> L1b
        L2a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)
            return
        L2d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
            throw r3     // Catch: java.lang.Throwable -> L2f
        L2f:
            r3 = move-exception
            goto L33
        L31:
            monitor-exit(r0)
            return
        L33:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            throw r3
    }

    public static com.bytedance.msdk.core.ws.cw xt() {
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt
            if (r0 != 0) goto L19
            java.lang.Class<com.bytedance.msdk.core.ws.cw> r0 = com.bytedance.msdk.core.ws.cw.class
            monitor-enter(r0)
            com.bytedance.msdk.core.ws.cw r1 = com.bytedance.msdk.core.xt.xt     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.bytedance.msdk.core.ws.cw r1 = new com.bytedance.msdk.core.ws.cw     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.bytedance.msdk.core.xt.xt = r1     // Catch: java.lang.Throwable -> L13
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
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt
            return r0
    }
}
