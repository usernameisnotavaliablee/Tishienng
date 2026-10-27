package com.bytedance.msdk.tl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class tl {
    private static volatile com.bytedance.msdk.tl.tl cw;
    private volatile java.lang.String j;
    private volatile java.util.concurrent.ExecutorService xt;


    private class j implements java.util.concurrent.Callable<java.lang.String> {
        final /* synthetic */ com.bytedance.msdk.tl.tl j;

        private j(com.bytedance.msdk.tl.tl r1) {
                r0 = this;
                r0.j = r1
                r0.<init>()
                return
        }

        /* synthetic */ j(com.bytedance.msdk.tl.tl r1, com.bytedance.msdk.tl.tl.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ java.lang.String call() throws java.lang.Exception {
                r1 = this;
                java.lang.String r0 = r1.call2()
                return r0
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: call, reason: avoid collision after fix types in other method */
        public java.lang.String call2() throws java.lang.Exception {
                r6 = this;
                long r0 = java.lang.System.currentTimeMillis()
                android.content.Context r2 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> L24
                com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r2 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(r2)     // Catch: java.lang.Throwable -> L24
                if (r2 == 0) goto L24
                java.lang.String r2 = r2.getId()     // Catch: java.lang.Throwable -> L24
                java.lang.String r3 = "gaid-"
                java.lang.String r4 = "getAdvertisingId: "
                java.lang.String r5 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L24
                java.lang.String r4 = r4.concat(r5)     // Catch: java.lang.Throwable -> L24
                com.bytedance.msdk.j.up.cw.j(r3, r4)     // Catch: java.lang.Throwable -> L24
                com.bytedance.msdk.tl.tl.j(r2)     // Catch: java.lang.Throwable -> L24
            L24:
                android.content.Context r2 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> L3a
                com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r2 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(r2)     // Catch: java.lang.Throwable -> L3a
                if (r2 == 0) goto L3a
                com.bytedance.msdk.tl.tl r3 = r6.j     // Catch: java.lang.Throwable -> L3a
                java.lang.String r4 = r2.getId()     // Catch: java.lang.Throwable -> L3a
                com.bytedance.msdk.tl.tl.j(r3, r4)     // Catch: java.lang.Throwable -> L3a
                r2.isLimitAdTrackingEnabled()     // Catch: java.lang.Throwable -> L3a
            L3a:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "mGAId:"
                r2.<init>(r3)
                com.bytedance.msdk.tl.tl r3 = r6.j
                java.lang.String r3 = com.bytedance.msdk.tl.tl.j(r3)
                r2.append(r3)
                java.lang.String r3 = " , get gaid consume time :"
                r2.append(r3)
                long r3 = java.lang.System.currentTimeMillis()
                long r3 = r3 - r0
                r2.append(r3)
                java.lang.String r0 = r2.toString()
                java.lang.String r1 = "AdvertisingIdHelper"
                com.bytedance.msdk.j.up.cw.j(r1, r0)
                com.bytedance.msdk.tl.tl r0 = r6.j
                java.lang.String r0 = com.bytedance.msdk.tl.tl.j(r0)
                return r0
        }
    }

    static {
            return
    }

    private tl() {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = ""
            r3.j = r0
            com.bytedance.msdk.tl.tl$1 r0 = new com.bytedance.msdk.tl.tl$1
            r0.<init>(r3)
            java.lang.String r1 = "gaid"
            r2 = 2
            java.util.concurrent.ExecutorService r0 = com.bytedance.msdk.j.up.m.j(r1, r2, r0)
            r3.xt = r0
            return
    }

    public static com.bytedance.msdk.tl.tl j() {
            com.bytedance.msdk.tl.tl r0 = com.bytedance.msdk.tl.tl.cw
            if (r0 != 0) goto L19
            java.lang.Class<com.bytedance.msdk.tl.tl> r0 = com.bytedance.msdk.tl.tl.class
            monitor-enter(r0)
            com.bytedance.msdk.tl.tl r1 = com.bytedance.msdk.tl.tl.cw     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.bytedance.msdk.tl.tl r1 = new com.bytedance.msdk.tl.tl     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.bytedance.msdk.tl.tl.cw = r1     // Catch: java.lang.Throwable -> L13
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
            com.bytedance.msdk.tl.tl r0 = com.bytedance.msdk.tl.tl.cw
            return r0
    }

    static /* synthetic */ java.lang.String j(com.bytedance.msdk.tl.tl r0) {
            java.lang.String r0 = r0.j
            return r0
    }

    static /* synthetic */ java.lang.String j(com.bytedance.msdk.tl.tl r0, java.lang.String r1) {
            r0.j = r1
            return r1
    }

    static /* synthetic */ void j(java.lang.String r0) {
            xt(r0)
            return
    }

    private static void xt(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L15
            java.lang.String r0 = "tt_device_info"
            android.content.Context r1 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.tl.l r0 = com.bytedance.msdk.tl.l.j(r0, r1)
            java.lang.String r1 = "gaid"
            r0.j(r1, r2)
        L15:
            return
    }

    public synchronized void cw() {
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = "tt_device_info"
            android.content.Context r1 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> L48
            com.bytedance.msdk.tl.l r0 = com.bytedance.msdk.tl.l.j(r0, r1)     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = "gaid"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.xt(r1, r2)     // Catch: java.lang.Throwable -> L48
            r3.j = r0     // Catch: java.lang.Throwable -> L48
            java.lang.String r0 = "gaid"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L48
            java.lang.String r2 = "--==-- initGAIdByAsyc-mGAId = "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L48
            java.lang.String r2 = r3.j     // Catch: java.lang.Throwable -> L48
            r1.append(r2)     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L48
            com.bytedance.msdk.j.up.cw.j(r0, r1)     // Catch: java.lang.Throwable -> L48
            java.lang.String r0 = r3.j     // Catch: java.lang.Throwable -> L48
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L48
            if (r0 == 0) goto L46
            java.util.concurrent.ExecutorService r0 = r3.xt     // Catch: java.lang.Throwable -> L48
            if (r0 == 0) goto L46
            com.bytedance.msdk.tl.tl$j r0 = new com.bytedance.msdk.tl.tl$j     // Catch: java.lang.Throwable -> L48
            r1 = 0
            r0.<init>(r3, r1)     // Catch: java.lang.Throwable -> L48
            java.util.concurrent.FutureTask r1 = new java.util.concurrent.FutureTask     // Catch: java.lang.Throwable -> L48
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L48
            java.util.concurrent.ExecutorService r0 = r3.xt     // Catch: java.lang.Throwable -> L48
            r0.execute(r1)     // Catch: java.lang.Throwable -> L48
        L46:
            monitor-exit(r3)
            return
        L48:
            monitor-exit(r3)
            return
    }

    public java.lang.String xt() {
            r5 = this;
            java.lang.String r0 = "tt_device_info"
            android.content.Context r1 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> L68
            com.bytedance.msdk.tl.l r0 = com.bytedance.msdk.tl.l.j(r0, r1)     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = "gaid"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.xt(r1, r2)     // Catch: java.lang.Throwable -> L68
            r5.j = r0     // Catch: java.lang.Throwable -> L68
            java.lang.String r0 = "gaid"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68
            java.lang.String r2 = "--==-- getGAIdTimeOut-mGAId = "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L68
            java.lang.String r2 = r5.j     // Catch: java.lang.Throwable -> L68
            r1.append(r2)     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L68
            com.bytedance.msdk.j.up.cw.j(r0, r1)     // Catch: java.lang.Throwable -> L68
            java.lang.String r0 = r5.j     // Catch: java.lang.Throwable -> L68
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L68
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L68
            java.util.concurrent.ExecutorService r0 = r5.xt     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L64
            com.bytedance.msdk.tl.tl$j r0 = new com.bytedance.msdk.tl.tl$j     // Catch: java.lang.Throwable -> L62
            r1 = 0
            r0.<init>(r5, r1)     // Catch: java.lang.Throwable -> L62
            java.util.concurrent.FutureTask r2 = new java.util.concurrent.FutureTask     // Catch: java.lang.Throwable -> L62
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L62
            java.util.concurrent.ExecutorService r0 = r5.xt     // Catch: java.lang.Throwable -> L62
            r0.execute(r2)     // Catch: java.lang.Throwable -> L62
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch: java.lang.Throwable -> L62
            r3 = 1
            java.lang.Object r0 = r2.get(r3, r0)     // Catch: java.lang.Throwable -> L62
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L62
            r5.j = r0     // Catch: java.lang.Throwable -> L62
            java.lang.String r0 = r5.j     // Catch: java.lang.Throwable -> L62
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L62
            if (r0 != 0) goto L64
            java.util.concurrent.ExecutorService r0 = r5.xt     // Catch: java.lang.Throwable -> L62
            r0.shutdown()     // Catch: java.lang.Throwable -> L62
            r5.xt = r1     // Catch: java.lang.Throwable -> L62
            goto L64
        L62:
            r0 = move-exception
            goto L66
        L64:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L62
            goto L68
        L66:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L62
            throw r0     // Catch: java.lang.Throwable -> L68
        L68:
            java.lang.String r0 = r5.j
            return r0
    }
}
