package com.kwad.components.core.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a {
    private java.lang.String Ne;
    private java.lang.String Nf;
    private long Ng;
    private long Nh;
    private java.util.Timer Ni;
    private boolean Nj;
    private final long period;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.components.core.a.a$a, reason: collision with other inner class name */
    static final class C0061a {
        private static final com.kwad.components.core.a.a Nl = null;

        static {
                com.kwad.components.core.a.a r0 = new com.kwad.components.core.a.a
                r0.<init>()
                com.kwad.components.core.a.a.C0061a.Nl = r0
                return
        }

        public C0061a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.kwad.components.core.a.a nY() {
                com.kwad.components.core.a.a r0 = com.kwad.components.core.a.a.C0061a.Nl
                return r0
        }
    }

    public a() {
            r3 = this;
            r3.<init>()
            r0 = -1
            r3.Ng = r0
            r0 = 0
            r3.Nj = r0
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L11
            r3.Ng = r0     // Catch: java.lang.Throwable -> L11
            goto L1b
        L11:
            r0 = move-exception
            long r1 = java.lang.System.currentTimeMillis()
            r3.Ng = r1
            com.kwad.sdk.core.d.c.printStackTraceOnly(r0)
        L1b:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MINUTES
            int r1 = com.kwad.sdk.core.config.e.Fa()
            long r1 = (long) r1
            long r0 = r0.toMillis(r1)
            r3.period = r0
            com.kwad.components.core.a.a$1 r0 = new com.kwad.components.core.a.a$1
            r0.<init>(r3)
            com.kwad.sdk.core.c.b.Ho()
            com.kwad.sdk.core.c.b.a(r0)
            return
    }

    static /* synthetic */ void a(com.kwad.components.core.a.a r0) {
            r0.av()
            return
    }

    static /* synthetic */ void a(com.kwad.components.core.a.a r0, int r1) {
            r1 = 2
            r0.av(r1)
            return
    }

    private void av() {
            r5 = this;
            r0 = 0
            r5.Nj = r0
            long r0 = r5.period
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto Lc
            return
        Lc:
            java.util.Timer r0 = r5.Ni
            if (r0 == 0) goto L13
            r0.cancel()
        L13:
            r0 = 3
            r5.av(r0)
            return
    }

    private void av(int r9) {
            r8 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r8.Ng
            long r2 = r0 - r2
            r8.Ng = r0
            r0 = 1
            r4 = 0
            if (r9 != r0) goto L27
            r8.Nh = r4
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r8.Nf = r0
            java.lang.String r0 = r8.Ne
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L27
            java.lang.String r0 = r8.Nf
            r8.Ne = r0
        L27:
            long r0 = r8.Nh
            r6 = 1
            long r0 = r0 + r6
            r8.Nh = r0
            com.kwad.sdk.core.report.n r0 = new com.kwad.sdk.core.report.n
            r6 = 10220(0x27ec, double:5.0494E-320)
            r0.<init>(r6)
            long r6 = r8.Nh
            r0.aDb = r6
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 <= 0) goto L3f
            r0.aHK = r2
        L3f:
            long r1 = (long) r9
            r0.aHL = r1
            java.lang.String r9 = r8.Ne
            r0.Ne = r9
            java.lang.String r9 = r8.Nf
            r0.Nf = r9
            com.kwad.sdk.core.report.g.a2(r0)
            return
    }

    public static com.kwad.components.core.a.a nX() {
            com.kwad.components.core.a.a r0 = com.kwad.components.core.a.a.C0061a.nY()
            return r0
    }

    public final void au() {
            r8 = this;
            boolean r0 = r8.Nj
            if (r0 == 0) goto L5
            goto L28
        L5:
            r0 = 1
            r8.Nj = r0
            long r1 = r8.period
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L11
            goto L28
        L11:
            java.util.Timer r1 = new java.util.Timer
            r1.<init>()
            r8.Ni = r1
            r8.av(r0)
            com.kwad.components.core.a.a$2 r3 = new com.kwad.components.core.a.a$2
            r3.<init>(r8)
            java.util.Timer r2 = r8.Ni     // Catch: java.lang.Throwable -> L28
            long r4 = r8.period     // Catch: java.lang.Throwable -> L28
            r6 = r4
            r2.schedule(r3, r4, r6)     // Catch: java.lang.Throwable -> L28
        L28:
            return
    }
}
