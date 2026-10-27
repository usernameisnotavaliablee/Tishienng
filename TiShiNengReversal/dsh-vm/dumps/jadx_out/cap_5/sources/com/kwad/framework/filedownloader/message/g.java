package com.kwad.framework.filedownloader.message;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class g {
    private final com.kwad.framework.filedownloader.message.e.b aoL;
    private final java.util.List<com.kwad.framework.filedownloader.message.g.a> aoN;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a {
        private final java.util.List<java.lang.Integer> aoO;
        private final java.util.concurrent.Executor aoP;
        final /* synthetic */ com.kwad.framework.filedownloader.message.g aoQ;


        public a(com.kwad.framework.filedownloader.message.g r2, int r3) {
                r1 = this;
                r1.aoQ = r2
                r1.<init>()
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r1.aoO = r2
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r0 = "Flow-"
                r2.<init>(r0)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r3 = 1
                java.util.concurrent.ThreadPoolExecutor r2 = com.kwad.framework.filedownloader.f.b.r(r3, r2)
                r1.aoP = r2
                return
        }

        static /* synthetic */ java.util.List a(com.kwad.framework.filedownloader.message.g.a r0) {
                java.util.List<java.lang.Integer> r0 = r0.aoO
                return r0
        }

        public final void bU(int r2) {
                r1 = this;
                java.util.List<java.lang.Integer> r0 = r1.aoO
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0.add(r2)
                return
        }

        public final void u(com.kwad.framework.filedownloader.message.MessageSnapshot r3) {
                r2 = this;
                java.util.concurrent.Executor r0 = r2.aoP
                com.kwad.framework.filedownloader.message.g$a$1 r1 = new com.kwad.framework.filedownloader.message.g$a$1
                r1.<init>(r2, r3)
                r0.execute(r1)
                return
        }
    }

    g(int r2, com.kwad.framework.filedownloader.message.e.b r3) {
            r1 = this;
            r1.<init>()
            r1.aoL = r3
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.aoN = r2
            r2 = 0
        Ld:
            r3 = 5
            if (r2 >= r3) goto L1d
            java.util.List<com.kwad.framework.filedownloader.message.g$a> r3 = r1.aoN
            com.kwad.framework.filedownloader.message.g$a r0 = new com.kwad.framework.filedownloader.message.g$a
            r0.<init>(r1, r2)
            r3.add(r0)
            int r2 = r2 + 1
            goto Ld
        L1d:
            return
    }

    static /* synthetic */ com.kwad.framework.filedownloader.message.e.b a(com.kwad.framework.filedownloader.message.g r0) {
            com.kwad.framework.filedownloader.message.e$b r0 = r0.aoL
            return r0
    }

    public final void u(com.kwad.framework.filedownloader.message.MessageSnapshot r8) {
            r7 = this;
            r0 = 0
            java.util.List<com.kwad.framework.filedownloader.message.g$a> r1 = r7.aoN     // Catch: java.lang.Throwable -> L72
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L72
            int r2 = r8.getId()     // Catch: java.lang.Throwable -> L2a
            java.util.List<com.kwad.framework.filedownloader.message.g$a> r3 = r7.aoN     // Catch: java.lang.Throwable -> L2a
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L2a
        Le:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L2a
            if (r4 == 0) goto L2c
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L2a
            com.kwad.framework.filedownloader.message.g$a r4 = (com.kwad.framework.filedownloader.message.g.a) r4     // Catch: java.lang.Throwable -> L2a
            java.util.List r5 = com.kwad.framework.filedownloader.message.g.a.a(r4)     // Catch: java.lang.Throwable -> L2a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L2a
            boolean r5 = r5.contains(r6)     // Catch: java.lang.Throwable -> L2a
            if (r5 == 0) goto Le
            r0 = r4
            goto L2c
        L2a:
            r2 = move-exception
            goto L70
        L2c:
            if (r0 != 0) goto L64
            java.util.List<com.kwad.framework.filedownloader.message.g$a> r3 = r7.aoN     // Catch: java.lang.Throwable -> L2a
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L2a
            r4 = 0
        L35:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> L2a
            if (r5 == 0) goto L64
            java.lang.Object r5 = r3.next()     // Catch: java.lang.Throwable -> L2a
            com.kwad.framework.filedownloader.message.g$a r5 = (com.kwad.framework.filedownloader.message.g.a) r5     // Catch: java.lang.Throwable -> L2a
            java.util.List r6 = com.kwad.framework.filedownloader.message.g.a.a(r5)     // Catch: java.lang.Throwable -> L2a
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L2a
            if (r6 > 0) goto L4d
            r0 = r5
            goto L64
        L4d:
            if (r4 == 0) goto L59
            java.util.List r6 = com.kwad.framework.filedownloader.message.g.a.a(r5)     // Catch: java.lang.Throwable -> L2a
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L2a
            if (r6 >= r4) goto L35
        L59:
            java.util.List r4 = com.kwad.framework.filedownloader.message.g.a.a(r5)     // Catch: java.lang.Throwable -> L2a
            int r0 = r4.size()     // Catch: java.lang.Throwable -> L2a
            r4 = r0
            r0 = r5
            goto L35
        L64:
            if (r0 == 0) goto L69
            r0.bU(r2)     // Catch: java.lang.Throwable -> L2a
        L69:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L6f
            r0.u(r8)
        L6f:
            return
        L70:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2a
            throw r2     // Catch: java.lang.Throwable -> L72
        L72:
            r1 = move-exception
            if (r0 == 0) goto L78
            r0.u(r8)
        L78:
            throw r1
    }
}
