package com.kwad.framework.filedownloader;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class h {
    private final java.util.ArrayList<com.kwad.framework.filedownloader.a.InterfaceC0110a> alT;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a {
        private static final com.kwad.framework.filedownloader.h alU = null;

        static {
                com.kwad.framework.filedownloader.h r0 = new com.kwad.framework.filedownloader.h
                r1 = 0
                r0.<init>(r1)
                com.kwad.framework.filedownloader.h.a.alU = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.kwad.framework.filedownloader.h xq() {
                com.kwad.framework.filedownloader.h r0 = com.kwad.framework.filedownloader.h.a.alU
                return r0
        }
    }

    private h() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.alT = r0
            return
    }

    /* synthetic */ h(byte r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.kwad.framework.filedownloader.h xp() {
            com.kwad.framework.filedownloader.h r0 = com.kwad.framework.filedownloader.h.a.xq()
            return r0
    }

    final boolean a(com.kwad.framework.filedownloader.a.InterfaceC0110a r2) {
            r1 = this;
            java.util.ArrayList<com.kwad.framework.filedownloader.a$a> r0 = r1.alT
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L13
            java.util.ArrayList<com.kwad.framework.filedownloader.a$a> r0 = r1.alT
            boolean r2 = r0.contains(r2)
            if (r2 != 0) goto L11
            goto L13
        L11:
            r2 = 0
            return r2
        L13:
            r2 = 1
            return r2
    }

    public final boolean a(com.kwad.framework.filedownloader.a.InterfaceC0110a r10, com.kwad.framework.filedownloader.message.MessageSnapshot r11) {
            r9 = this;
            byte r0 = r11.wJ()
            java.util.ArrayList<com.kwad.framework.filedownloader.a$a> r1 = r9.alT
            monitor-enter(r1)
            java.util.ArrayList<com.kwad.framework.filedownloader.a$a> r2 = r9.alT     // Catch: java.lang.Throwable -> L74
            boolean r2 = r2.remove(r10)     // Catch: java.lang.Throwable -> L74
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L74
            boolean r1 = com.kwad.framework.filedownloader.f.d.apD
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L39
            java.util.ArrayList<com.kwad.framework.filedownloader.a$a> r1 = r9.alT
            int r1 = r1.size()
            if (r1 != 0) goto L39
            java.lang.String r1 = "remove %s left %d %d"
            java.lang.Byte r6 = java.lang.Byte.valueOf(r0)
            java.util.ArrayList<com.kwad.framework.filedownloader.a$a> r7 = r9.alT
            int r7 = r7.size()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r5] = r10
            r8[r4] = r6
            r8[r3] = r7
            com.kwad.framework.filedownloader.f.d.e(r9, r1, r8)
        L39:
            if (r2 == 0) goto L64
            com.kwad.framework.filedownloader.x$a r10 = r10.wS()
            com.kwad.framework.filedownloader.t r10 = r10.xh()
            r1 = -4
            if (r0 == r1) goto L60
            r1 = -3
            if (r0 == r1) goto L58
            r1 = -2
            if (r0 == r1) goto L54
            r1 = -1
            if (r0 == r1) goto L50
            return r2
        L50:
            r10.m(r11)
            return r2
        L54:
            r10.n(r11)
            return r2
        L58:
            com.kwad.framework.filedownloader.message.MessageSnapshot r11 = com.kwad.framework.filedownloader.message.f.t(r11)
            r10.j(r11)
            return r2
        L60:
            r10.l(r11)
            return r2
        L64:
            java.lang.String r11 = "remove error, not exist: %s %d"
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r5] = r10
            r1[r4] = r0
            com.kwad.framework.filedownloader.f.d.a(r9, r11, r1)
            return r2
        L74:
            r10 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L74
            throw r10
    }

    final void b(com.kwad.framework.filedownloader.a.InterfaceC0110a r2) {
            r1 = this;
            com.kwad.framework.filedownloader.a r0 = r2.wR()
            boolean r0 = r0.wC()
            if (r0 != 0) goto Ld
            r2.wU()
        Ld:
            com.kwad.framework.filedownloader.x$a r0 = r2.wS()
            com.kwad.framework.filedownloader.t r0 = r0.xh()
            boolean r0 = r0.xu()
            if (r0 == 0) goto L1e
            r1.c(r2)
        L1e:
            return
    }

    final int bs(int r5) {
            r4 = this;
            java.util.ArrayList<com.kwad.framework.filedownloader.a$a> r0 = r4.alT
            monitor-enter(r0)
            java.util.ArrayList<com.kwad.framework.filedownloader.a$a> r1 = r4.alT     // Catch: java.lang.Throwable -> L1f
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1f
            r2 = 0
        La:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L1f
            if (r3 == 0) goto L21
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L1f
            com.kwad.framework.filedownloader.a$a r3 = (com.kwad.framework.filedownloader.a.InterfaceC0110a) r3     // Catch: java.lang.Throwable -> L1f
            boolean r3 = r3.br(r5)     // Catch: java.lang.Throwable -> L1f
            if (r3 == 0) goto La
            int r2 = r2 + 1
            goto La
        L1f:
            r5 = move-exception
            goto L23
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            return r2
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            throw r5
    }

    final java.util.List<com.kwad.framework.filedownloader.a.InterfaceC0110a> bt(int r7) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList<com.kwad.framework.filedownloader.a$a> r1 = r6.alT
            monitor-enter(r1)
            java.util.ArrayList<com.kwad.framework.filedownloader.a$a> r2 = r6.alT     // Catch: java.lang.Throwable -> L38
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L38
        Le:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L38
            if (r3 == 0) goto L3a
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L38
            com.kwad.framework.filedownloader.a$a r3 = (com.kwad.framework.filedownloader.a.InterfaceC0110a) r3     // Catch: java.lang.Throwable -> L38
            boolean r4 = r3.br(r7)     // Catch: java.lang.Throwable -> L38
            if (r4 == 0) goto Le
            boolean r4 = r3.isOver()     // Catch: java.lang.Throwable -> L38
            if (r4 != 0) goto Le
            com.kwad.framework.filedownloader.a r4 = r3.wR()     // Catch: java.lang.Throwable -> L38
            byte r4 = r4.wJ()     // Catch: java.lang.Throwable -> L38
            if (r4 == 0) goto Le
            r5 = 10
            if (r4 == r5) goto Le
            r0.add(r3)     // Catch: java.lang.Throwable -> L38
            goto Le
        L38:
            r7 = move-exception
            goto L3c
        L3a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L38
            return r0
        L3c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L38
            throw r7
    }

    final java.util.List<com.kwad.framework.filedownloader.a.InterfaceC0110a> bu(int r6) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList<com.kwad.framework.filedownloader.a$a> r1 = r5.alT
            monitor-enter(r1)
            java.util.ArrayList<com.kwad.framework.filedownloader.a$a> r2 = r5.alT     // Catch: java.lang.Throwable -> L2a
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L2a
        Le:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L2a
            if (r3 == 0) goto L2c
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L2a
            com.kwad.framework.filedownloader.a$a r3 = (com.kwad.framework.filedownloader.a.InterfaceC0110a) r3     // Catch: java.lang.Throwable -> L2a
            boolean r4 = r3.br(r6)     // Catch: java.lang.Throwable -> L2a
            if (r4 == 0) goto Le
            boolean r4 = r3.isOver()     // Catch: java.lang.Throwable -> L2a
            if (r4 != 0) goto Le
            r0.add(r3)     // Catch: java.lang.Throwable -> L2a
            goto Le
        L2a:
            r6 = move-exception
            goto L2e
        L2c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2a
            return r0
        L2e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2a
            throw r6
    }

    final void c(com.kwad.framework.filedownloader.a.InterfaceC0110a r8) {
            r7 = this;
            boolean r0 = r8.wV()
            if (r0 == 0) goto L7
            return
        L7:
            java.util.ArrayList<com.kwad.framework.filedownloader.a$a> r0 = r7.alT
            monitor-enter(r0)
            java.util.ArrayList<com.kwad.framework.filedownloader.a$a> r1 = r7.alT     // Catch: java.lang.Throwable -> L1e
            boolean r1 = r1.contains(r8)     // Catch: java.lang.Throwable -> L1e
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L20
            java.lang.String r1 = "already has %s"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L1e
            r3[r2] = r8     // Catch: java.lang.Throwable -> L1e
            com.kwad.framework.filedownloader.f.d.d(r7, r1, r3)     // Catch: java.lang.Throwable -> L1e
            goto L51
        L1e:
            r8 = move-exception
            goto L53
        L20:
            r8.wW()     // Catch: java.lang.Throwable -> L1e
            java.util.ArrayList<com.kwad.framework.filedownloader.a$a> r1 = r7.alT     // Catch: java.lang.Throwable -> L1e
            r1.add(r8)     // Catch: java.lang.Throwable -> L1e
            boolean r1 = com.kwad.framework.filedownloader.f.d.apD     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L51
            java.lang.String r1 = "add list in all %s %d %d"
            com.kwad.framework.filedownloader.a r4 = r8.wR()     // Catch: java.lang.Throwable -> L1e
            byte r4 = r4.wJ()     // Catch: java.lang.Throwable -> L1e
            java.lang.Byte r4 = java.lang.Byte.valueOf(r4)     // Catch: java.lang.Throwable -> L1e
            java.util.ArrayList<com.kwad.framework.filedownloader.a$a> r5 = r7.alT     // Catch: java.lang.Throwable -> L1e
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L1e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L1e
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L1e
            r6[r2] = r8     // Catch: java.lang.Throwable -> L1e
            r6[r3] = r4     // Catch: java.lang.Throwable -> L1e
            r8 = 2
            r6[r8] = r5     // Catch: java.lang.Throwable -> L1e
            com.kwad.framework.filedownloader.f.d.e(r7, r1, r6)     // Catch: java.lang.Throwable -> L1e
        L51:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            return
        L53:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r8
    }

    final void p(java.util.List<com.kwad.framework.filedownloader.a.InterfaceC0110a> r5) {
            r4 = this;
            java.util.ArrayList<com.kwad.framework.filedownloader.a$a> r0 = r4.alT
            monitor-enter(r0)
            java.util.ArrayList<com.kwad.framework.filedownloader.a$a> r1 = r4.alT     // Catch: java.lang.Throwable -> L1f
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1f
        L9:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L1f
            if (r2 == 0) goto L21
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L1f
            com.kwad.framework.filedownloader.a$a r2 = (com.kwad.framework.filedownloader.a.InterfaceC0110a) r2     // Catch: java.lang.Throwable -> L1f
            boolean r3 = r5.contains(r2)     // Catch: java.lang.Throwable -> L1f
            if (r3 != 0) goto L9
            r5.add(r2)     // Catch: java.lang.Throwable -> L1f
            goto L9
        L1f:
            r5 = move-exception
            goto L28
        L21:
            java.util.ArrayList<com.kwad.framework.filedownloader.a$a> r5 = r4.alT     // Catch: java.lang.Throwable -> L1f
            r5.clear()     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            return
        L28:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            throw r5
    }

    final int size() {
            r1 = this;
            java.util.ArrayList<com.kwad.framework.filedownloader.a$a> r0 = r1.alT
            int r0 = r0.size()
            return r0
    }
}
