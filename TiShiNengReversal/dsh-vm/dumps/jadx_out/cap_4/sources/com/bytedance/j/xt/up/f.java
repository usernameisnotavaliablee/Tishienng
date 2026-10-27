package com.bytedance.j.xt.up;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class f {

    private static class a extends com.bytedance.sdk.component.oq.r.cw {
        private java.io.InputStream a;
        private java.util.List<java.lang.String> b;

        a(java.io.InputStream r2, java.util.List<java.lang.String> r3) {
                r1 = this;
                java.lang.String r0 = "LogcatDump$LogDumperThread"
                r1.<init>(r0)
                r1.a = r2
                r1.b = r3
                return
        }

        public void run() {
                r4 = this;
                java.io.BufferedReader r0 = new java.io.BufferedReader
                java.io.InputStreamReader r1 = new java.io.InputStreamReader
                java.io.InputStream r2 = r4.a
                r1.<init>(r2)
                r0.<init>(r1)
                r1 = 32768(0x8000, float:4.5918E-41)
            Lf:
                java.lang.String r2 = r0.readLine()     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L37
                if (r2 == 0) goto L2f
                java.lang.String r3 = "---------"
                boolean r3 = r2.startsWith(r3)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L37
                if (r3 != 0) goto Lf
                java.lang.String r3 = "UTF-8"
                byte[] r3 = r2.getBytes(r3)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L37
                int r3 = r3.length     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L37
                int r1 = r1 - r3
                if (r1 < 0) goto L2f
                java.util.List<java.lang.String> r3 = r4.b     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L37
                r3.add(r2)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L37
                goto Lf
            L2d:
                r1 = move-exception
                goto L33
            L2f:
                com.bytedance.j.xt.tl.h.a(r0)
                return
            L33:
                com.bytedance.j.xt.tl.h.a(r0)
                throw r1
            L37:
                com.bytedance.j.xt.tl.h.a(r0)
                return
        }
    }

    private static class b extends com.bytedance.sdk.component.oq.r.cw {
        private java.lang.Process a;
        private long b;

        public b(java.lang.Process r2, long r3) {
                r1 = this;
                java.lang.String r0 = "LogcatDump$TimerThread"
                r1.<init>(r0)
                r1.a = r2
                r1.b = r3
                return
        }

        public void run() {
                r2 = this;
                long r0 = r2.b     // Catch: java.lang.InterruptedException -> L6
                java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L6
                goto La
            L6:
                r0 = move-exception
                com.bytedance.sdk.component.utils.vl.j(r0)
            La:
                java.lang.Process r0 = r2.a
                if (r0 == 0) goto L11
                r0.destroy()
            L11:
                return
        }
    }

    public f() {
            r1 = this;
            r1.<init>()
            return
    }

    private static java.lang.String a(int r6) {
            java.lang.String r4 = "*:E"
            java.lang.String r5 = "*:F"
            java.lang.String r0 = "*:V"
            java.lang.String r1 = "*:D"
            java.lang.String r2 = "*:I"
            java.lang.String r3 = "*:W"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5}
            if (r6 < 0) goto L18
            r1 = 6
            if (r6 >= r1) goto L18
            r6 = r0[r6]
            return r6
        L18:
            java.lang.String r6 = "*:V"
            return r6
    }

    public static java.util.List<java.lang.String> b(int r4, int r5) {
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = a(r5)
            java.lang.String r1 = "logcat"
            java.lang.String r2 = "-t"
            java.lang.String[] r4 = new java.lang.String[]{r1, r2, r4, r5}
            r5 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L4c
            java.lang.Process r5 = r1.exec(r4)     // Catch: java.lang.Throwable -> L4c
            com.bytedance.j.xt.up.f$a r4 = new com.bytedance.j.xt.up.f$a     // Catch: java.lang.Throwable -> L4c
            java.io.InputStream r1 = r5.getInputStream()     // Catch: java.lang.Throwable -> L4c
            r4.<init>(r1, r0)     // Catch: java.lang.Throwable -> L4c
            r4.start()     // Catch: java.lang.Throwable -> L4c
            com.bytedance.j.xt.up.f$a r4 = new com.bytedance.j.xt.up.f$a     // Catch: java.lang.Throwable -> L4c
            java.io.InputStream r1 = r5.getErrorStream()     // Catch: java.lang.Throwable -> L4c
            r4.<init>(r1, r0)     // Catch: java.lang.Throwable -> L4c
            r4.start()     // Catch: java.lang.Throwable -> L4c
            com.bytedance.j.xt.up.f$b r4 = new com.bytedance.j.xt.up.f$b     // Catch: java.lang.Throwable -> L4c
            r1 = 3000(0xbb8, double:1.482E-320)
            r4.<init>(r5, r1)     // Catch: java.lang.Throwable -> L4c
            r4.start()     // Catch: java.lang.Throwable -> L4c
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L4c
            r3 = 26
            if (r4 < r3) goto L4e
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L4c
            com.bytedance.j.xt.up.e.a(r5, r1, r4)     // Catch: java.lang.Throwable -> L4c
            goto L51
        L4c:
            r4 = move-exception
            goto L55
        L4e:
            r5.waitFor()     // Catch: java.lang.Throwable -> L4c
        L51:
            r5.destroy()
            return r0
        L55:
            com.bytedance.sdk.component.utils.vl.j(r4)     // Catch: java.lang.Throwable -> L5e
            if (r5 == 0) goto L5d
            r5.destroy()
        L5d:
            return r0
        L5e:
            r4 = move-exception
            if (r5 == 0) goto L64
            r5.destroy()
        L64:
            throw r4
    }
}
