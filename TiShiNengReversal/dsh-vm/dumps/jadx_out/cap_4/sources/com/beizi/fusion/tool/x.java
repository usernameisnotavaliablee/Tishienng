package com.beizi.fusion.tool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class x {
    private static com.beizi.fusion.tool.x a;
    private java.lang.String b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.beizi.fusion.tool.x$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a implements java.lang.Runnable {
        private final com.beizi.fusion.tool.j a;
        private int b;


        private a(android.content.Context r2) {
                r1 = this;
                r1.<init>()
                r0 = 100100(0x18704, float:1.4027E-40)
                r1.b = r0
                com.beizi.fusion.tool.x$a$1 r0 = new com.beizi.fusion.tool.x$a$1
                r0.<init>(r1, r2, r2)
                r1.a = r0
                return
        }

        /* synthetic */ a(android.content.Context r1, com.beizi.fusion.tool.x.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        static /* synthetic */ int a(com.beizi.fusion.tool.x.a r0) {
                int r0 = r0.b
                return r0
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                com.beizi.fusion.tool.j r0 = r2.a
                if (r0 != 0) goto L5
                return
            L5:
                android.os.Message r0 = android.os.Message.obtain()
                int r1 = r2.b
                r0.what = r1
                com.beizi.fusion.tool.j r1 = r2.a
                r1.sendMessage(r0)
                return
        }
    }

    public x() {
            r0 = this;
            r0.<init>()
            return
    }

    public static synchronized com.beizi.fusion.tool.x a() {
            java.lang.Class<com.beizi.fusion.tool.x> r0 = com.beizi.fusion.tool.x.class
            monitor-enter(r0)
            com.beizi.fusion.tool.x r1 = com.beizi.fusion.tool.x.a     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L18
            java.lang.Class<com.beizi.fusion.tool.x> r1 = com.beizi.fusion.tool.x.class
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L16
            com.beizi.fusion.tool.x r2 = new com.beizi.fusion.tool.x     // Catch: java.lang.Throwable -> L13
            r2.<init>()     // Catch: java.lang.Throwable -> L13
            com.beizi.fusion.tool.x.a = r2     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            goto L18
        L13:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            throw r2     // Catch: java.lang.Throwable -> L16
        L16:
            r1 = move-exception
            goto L1c
        L18:
            com.beizi.fusion.tool.x r1 = com.beizi.fusion.tool.x.a     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            return r1
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r1
    }

    public java.lang.String a(android.content.Context r2) {
            r1 = this;
            java.lang.String r0 = r1.b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L10
            java.lang.String r0 = "userAgent"
            java.lang.String r2 = com.beizi.fusion.tool.an.a(r2, r0)
            r1.b = r2
        L10:
            java.lang.String r2 = r1.b
            return r2
    }

    public void a(java.lang.String r1) {
            r0 = this;
            r0.b = r1
            return
    }

    public void b(android.content.Context r5) {
            r4 = this;
            java.lang.String r0 = r4.b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L9
            return
        L9:
            java.util.concurrent.ScheduledExecutorService r0 = java.util.concurrent.Executors.newSingleThreadScheduledExecutor()
            com.beizi.fusion.tool.x$a r1 = new com.beizi.fusion.tool.x$a
            r2 = 0
            r1.<init>(r5, r2)
            r2 = 15000(0x3a98, double:7.411E-320)
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r1, r2, r5)
            return
    }
}
