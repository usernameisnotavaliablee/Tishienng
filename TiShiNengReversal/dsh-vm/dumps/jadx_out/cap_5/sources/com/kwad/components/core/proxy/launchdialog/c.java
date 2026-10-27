package com.kwad.components.core.proxy.launchdialog;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c implements com.kwad.components.core.proxy.n {
    private static long Wr = 7000;
    private com.kwad.components.core.proxy.launchdialog.DetectEventType Ws;

    @androidx.annotation.Nullable
    private java.lang.ref.WeakReference<com.kwad.components.core.proxy.a> Wt;

    @androidx.annotation.NonNull
    private java.util.List<com.kwad.components.core.proxy.launchdialog.g> Wu;
    private com.kwad.components.core.proxy.launchdialog.c.a Wv;
    private boolean started;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements com.kwad.components.core.proxy.launchdialog.f {
        final /* synthetic */ com.kwad.components.core.proxy.launchdialog.c Ww;
        private com.kwad.components.core.proxy.launchdialog.f Wx;
        private boolean Wy;

        private a(com.kwad.components.core.proxy.launchdialog.c r1) {
                r0 = this;
                r0.Ww = r1
                r0.<init>()
                r1 = 0
                r0.Wy = r1
                return
        }

        /* synthetic */ a(com.kwad.components.core.proxy.launchdialog.c r1, byte r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        static /* synthetic */ com.kwad.components.core.proxy.launchdialog.f a(com.kwad.components.core.proxy.launchdialog.c.a r0, com.kwad.components.core.proxy.launchdialog.f r1) {
                r0.Wx = r1
                return r1
        }

        static /* synthetic */ void a(com.kwad.components.core.proxy.launchdialog.c.a r0) {
                r0.stop()
                return
        }

        private void rZ() {
                r1 = this;
                r0 = 1
                r1.Wy = r0
                return
        }

        private void stop() {
                r1 = this;
                r1.rZ()
                r0 = 0
                r1.Wx = r0
                return
        }

        @Override // com.kwad.components.core.proxy.launchdialog.f
        public final void j(com.kwad.components.core.proxy.a r2) {
                r1 = this;
                com.kwad.components.core.proxy.launchdialog.f r0 = r1.Wx
                if (r0 != 0) goto L5
                return
            L5:
                r0.j(r2)
                return
        }

        @Override // com.kwad.components.core.proxy.launchdialog.f
        public final void k(com.kwad.components.core.proxy.a r2) {
                r1 = this;
                boolean r0 = r1.Wy
                if (r0 == 0) goto L5
                goto L9
            L5:
                com.kwad.components.core.proxy.launchdialog.f r0 = r1.Wx
                if (r0 != 0) goto La
            L9:
                return
            La:
                r0.k(r2)
                r1.rZ()
                return
        }

        @Override // com.kwad.components.core.proxy.launchdialog.f
        public final void l(com.kwad.components.core.proxy.a r2) {
                r1 = this;
                boolean r0 = r1.Wy
                if (r0 == 0) goto L5
                goto L9
            L5:
                com.kwad.components.core.proxy.launchdialog.f r0 = r1.Wx
                if (r0 != 0) goto La
            L9:
                return
            La:
                r0.l(r2)
                r1.rZ()
                return
        }

        @Override // com.kwad.components.core.proxy.launchdialog.f
        public final void m(com.kwad.components.core.proxy.a r2) {
                r1 = this;
                boolean r0 = r1.Wy
                if (r0 == 0) goto L5
                goto L9
            L5:
                com.kwad.components.core.proxy.launchdialog.f r0 = r1.Wx
                if (r0 != 0) goto La
            L9:
                return
            La:
                r0.m(r2)
                r1.rZ()
                return
        }
    }

    static {
            return
    }

    public c(com.kwad.components.core.proxy.launchdialog.DetectEventType r3, com.kwad.components.core.proxy.a r4, com.kwad.components.core.proxy.launchdialog.g... r5) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.Wu = r0
            com.kwad.components.core.proxy.launchdialog.c$a r0 = new com.kwad.components.core.proxy.launchdialog.c$a
            r1 = 0
            r0.<init>(r2, r1)
            r2.Wv = r0
            r2.started = r1
            r2.Ws = r3
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r4)
            r2.Wt = r3
            java.util.List<com.kwad.components.core.proxy.launchdialog.g> r3 = r2.Wu
            java.util.List r4 = java.util.Arrays.asList(r5)
            r3.addAll(r4)
            return
    }

    static /* synthetic */ com.kwad.components.core.proxy.a a(com.kwad.components.core.proxy.launchdialog.c r0) {
            com.kwad.components.core.proxy.a r0 = r0.rY()
            return r0
    }

    private void a(com.kwad.components.core.proxy.launchdialog.d r10) {
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "checkMatch event: "
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "LifecycleSequence"
            com.kwad.sdk.core.d.c.d(r1, r0)
            java.lang.ref.WeakReference<com.kwad.components.core.proxy.a> r0 = r9.Wt
            if (r0 == 0) goto L154
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L1f
            goto L154
        L1f:
            java.util.List<com.kwad.components.core.proxy.launchdialog.g> r0 = r9.Wu
            int r0 = r0.size()
            if (r0 != 0) goto L31
            com.kwad.components.core.proxy.launchdialog.c$a r10 = r9.Wv
            com.kwad.components.core.proxy.a r0 = r9.rY()
            r10.k(r0)
            return
        L31:
            java.util.List<com.kwad.components.core.proxy.launchdialog.g> r0 = r9.Wu
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            com.kwad.components.core.proxy.launchdialog.g r0 = (com.kwad.components.core.proxy.launchdialog.g) r0
            boolean r2 = r0 instanceof com.kwad.components.core.proxy.launchdialog.g.a
            if (r2 == 0) goto L114
            java.util.List<com.kwad.components.core.proxy.launchdialog.g> r2 = r9.Wu
            int r2 = r2.size()
            r3 = 2
            if (r2 >= r3) goto L51
            com.kwad.components.core.proxy.launchdialog.c$a r10 = r9.Wv
            com.kwad.components.core.proxy.a r0 = r9.rY()
            r10.m(r0)
            return
        L51:
            java.util.List<com.kwad.components.core.proxy.launchdialog.g> r2 = r9.Wu
            r3 = 1
            java.lang.Object r2 = r2.get(r3)
            com.kwad.components.core.proxy.launchdialog.g r2 = (com.kwad.components.core.proxy.launchdialog.g) r2
            boolean r3 = r2 instanceof com.kwad.components.core.proxy.launchdialog.g.b
            if (r3 != 0) goto L68
            com.kwad.components.core.proxy.launchdialog.c$a r10 = r9.Wv
            com.kwad.components.core.proxy.a r0 = r9.rY()
            r10.m(r0)
            return
        L68:
            java.lang.ref.WeakReference<com.kwad.components.core.proxy.a> r3 = r9.Wt
            java.lang.Object r3 = r3.get()
            com.kwad.components.core.proxy.a r3 = (com.kwad.components.core.proxy.a) r3
            com.kwad.components.core.proxy.launchdialog.d r3 = r3.rT()
            r4 = r2
            com.kwad.components.core.proxy.launchdialog.g$b r4 = (com.kwad.components.core.proxy.launchdialog.g.b) r4
            long r5 = r3.sb()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "checkMatch last: "
            r7.<init>(r8)
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            com.kwad.sdk.core.d.c.d(r1, r3)
            r3 = r0
            com.kwad.components.core.proxy.launchdialog.g$a r3 = (com.kwad.components.core.proxy.launchdialog.g.a) r3
            boolean r7 = r3.K(r5)
            if (r7 == 0) goto Le5
            androidx.lifecycle.Lifecycle$Event r7 = r10.sa()
            boolean r7 = r4.b(r7)
            if (r7 == 0) goto Le5
            java.util.List<com.kwad.components.core.proxy.launchdialog.g> r10 = r9.Wu
            r10.remove(r0)
            java.util.List<com.kwad.components.core.proxy.launchdialog.g> r10 = r9.Wu
            r10.remove(r2)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r3 = "DurationMoreThanItem remove first: "
            r10.<init>(r3)
            r10.append(r0)
            com.kwad.components.core.proxy.launchdialog.DetectEventType r0 = r9.Ws
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            com.kwad.sdk.core.d.c.d(r1, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "DurationMoreThanItem remove second: "
            r10.<init>(r0)
            r10.append(r2)
            com.kwad.components.core.proxy.launchdialog.DetectEventType r0 = r9.Ws
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            com.kwad.sdk.core.d.c.d(r1, r10)
            boolean r10 = r9.rX()
            if (r10 != 0) goto L154
            com.kwad.components.core.proxy.launchdialog.c$a r10 = r9.Wv
            com.kwad.components.core.proxy.a r0 = r9.rY()
            r10.j(r0)
            return
        Le5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "DurationMoreThanItem not match two: "
            r0.<init>(r2)
            boolean r2 = r3.K(r5)
            r0.append(r2)
            java.lang.String r2 = ", "
            r0.append(r2)
            androidx.lifecycle.Lifecycle$Event r10 = r10.sa()
            boolean r10 = r4.b(r10)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            com.kwad.sdk.core.d.c.d(r1, r10)
            com.kwad.components.core.proxy.launchdialog.c$a r10 = r9.Wv
            com.kwad.components.core.proxy.a r0 = r9.rY()
            r10.m(r0)
            return
        L114:
            boolean r2 = r0 instanceof com.kwad.components.core.proxy.launchdialog.g.b
            if (r2 == 0) goto L154
            r2 = r0
            com.kwad.components.core.proxy.launchdialog.g$b r2 = (com.kwad.components.core.proxy.launchdialog.g.b) r2
            androidx.lifecycle.Lifecycle$Event r10 = r10.sa()
            boolean r10 = r2.b(r10)
            if (r10 == 0) goto L14b
            java.util.List<com.kwad.components.core.proxy.launchdialog.g> r10 = r9.Wu
            r10.remove(r0)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r2 = "PageEventItem remove: "
            r10.<init>(r2)
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            com.kwad.sdk.core.d.c.d(r1, r10)
            boolean r10 = r9.rX()
            if (r10 != 0) goto L154
            com.kwad.components.core.proxy.launchdialog.c$a r10 = r9.Wv
            com.kwad.components.core.proxy.a r0 = r9.rY()
            r10.j(r0)
            return
        L14b:
            com.kwad.components.core.proxy.launchdialog.c$a r10 = r9.Wv
            com.kwad.components.core.proxy.a r0 = r9.rY()
            r10.m(r0)
        L154:
            return
    }

    static /* synthetic */ com.kwad.components.core.proxy.launchdialog.c.a b(com.kwad.components.core.proxy.launchdialog.c r0) {
            com.kwad.components.core.proxy.launchdialog.c$a r0 = r0.Wv
            return r0
    }

    static /* synthetic */ com.kwad.components.core.proxy.launchdialog.DetectEventType c(com.kwad.components.core.proxy.launchdialog.c r0) {
            com.kwad.components.core.proxy.launchdialog.DetectEventType r0 = r0.Ws
            return r0
    }

    private com.kwad.components.core.proxy.launchdialog.d rU() {
            r2 = this;
            java.lang.ref.WeakReference<com.kwad.components.core.proxy.a> r0 = r2.Wt
            r1 = 0
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto Lc
            goto L1c
        Lc:
            java.lang.ref.WeakReference<com.kwad.components.core.proxy.a> r0 = r2.Wt
            java.lang.Object r0 = r0.get()
            com.kwad.components.core.proxy.a r0 = (com.kwad.components.core.proxy.a) r0
            if (r0 != 0) goto L17
            return r1
        L17:
            com.kwad.components.core.proxy.launchdialog.d r0 = r0.rU()
            return r0
        L1c:
            return r1
    }

    private boolean rX() {
            r2 = this;
            java.util.List<com.kwad.components.core.proxy.launchdialog.g> r0 = r2.Wu
            int r0 = r0.size()
            if (r0 != 0) goto L13
            com.kwad.components.core.proxy.launchdialog.c$a r0 = r2.Wv
            com.kwad.components.core.proxy.a r1 = r2.rY()
            r0.k(r1)
            r0 = 1
            return r0
        L13:
            r0 = 0
            return r0
    }

    private com.kwad.components.core.proxy.a rY() {
            r1 = this;
            java.lang.ref.WeakReference<com.kwad.components.core.proxy.a> r0 = r1.Wt
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.Object r0 = r0.get()
            com.kwad.components.core.proxy.a r0 = (com.kwad.components.core.proxy.a) r0
            return r0
    }

    @Override // com.kwad.components.core.proxy.k
    public final void a(com.kwad.components.core.proxy.a r1) {
            r0 = this;
            boolean r1 = r0.started
            if (r1 != 0) goto L5
            return
        L5:
            com.kwad.components.core.proxy.launchdialog.d r1 = r0.rU()
            r0.a(r1)
            return
    }

    public final void a(com.kwad.components.core.proxy.launchdialog.f r2) {
            r1 = this;
            com.kwad.components.core.proxy.launchdialog.c$a r0 = r1.Wv
            com.kwad.components.core.proxy.launchdialog.c.a.a(r0, r2)
            return
    }

    @Override // com.kwad.components.core.proxy.k
    public final void b(com.kwad.components.core.proxy.a r1) {
            r0 = this;
            boolean r1 = r0.started
            if (r1 != 0) goto L5
            return
        L5:
            com.kwad.components.core.proxy.launchdialog.d r1 = r0.rU()
            r0.a(r1)
            return
    }

    public final boolean b(com.kwad.components.core.proxy.launchdialog.DetectEventType r2) {
            r1 = this;
            if (r2 == 0) goto Lc
            com.kwad.components.core.proxy.launchdialog.DetectEventType r0 = r1.Ws
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            r2 = 0
            return r2
    }

    @Override // com.kwad.components.core.proxy.k
    public final void c(com.kwad.components.core.proxy.a r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LifecycleSequence onResume: "
            r0.<init>(r1)
            java.lang.String r3 = r3.getPageName()
            r0.append(r3)
            java.lang.String r3 = " , type:"
            r0.append(r3)
            com.kwad.components.core.proxy.launchdialog.DetectEventType r3 = r2.Ws
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "LifecycleSequence"
            com.kwad.sdk.core.d.c.d(r0, r3)
            boolean r3 = r2.started
            if (r3 != 0) goto L26
            return
        L26:
            com.kwad.components.core.proxy.launchdialog.d r3 = r2.rU()
            r2.a(r3)
            return
    }

    @Override // com.kwad.components.core.proxy.k
    public final void d(com.kwad.components.core.proxy.a r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = r2.started
            r0.append(r1)
            java.lang.String r1 = " LifecycleSequence onPause: "
            r0.append(r1)
            java.lang.String r3 = r3.getPageName()
            r0.append(r3)
            java.lang.String r3 = " , type:"
            r0.append(r3)
            com.kwad.components.core.proxy.launchdialog.DetectEventType r3 = r2.Ws
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "LifecycleSequence"
            com.kwad.sdk.core.d.c.d(r0, r3)
            boolean r3 = r2.started
            if (r3 != 0) goto L2e
            return
        L2e:
            com.kwad.components.core.proxy.launchdialog.d r3 = r2.rU()
            r2.a(r3)
            return
    }

    @Override // com.kwad.components.core.proxy.k
    public final void e(com.kwad.components.core.proxy.a r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = r2.started
            r0.append(r1)
            java.lang.String r1 = " LifecycleSequence onStop: "
            r0.append(r1)
            java.lang.String r3 = r3.getPageName()
            r0.append(r3)
            java.lang.String r3 = " , type:"
            r0.append(r3)
            com.kwad.components.core.proxy.launchdialog.DetectEventType r3 = r2.Ws
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "LifecycleSequence"
            com.kwad.sdk.core.d.c.d(r0, r3)
            boolean r3 = r2.started
            if (r3 != 0) goto L2e
            return
        L2e:
            com.kwad.components.core.proxy.launchdialog.d r3 = r2.rU()
            r2.a(r3)
            return
    }

    @Override // com.kwad.components.core.proxy.k
    public final void f(com.kwad.components.core.proxy.a r1) {
            r0 = this;
            boolean r1 = r0.started
            if (r1 != 0) goto L5
            return
        L5:
            com.kwad.components.core.proxy.launchdialog.d r1 = r0.rU()
            r0.a(r1)
            return
    }

    @Override // com.kwad.components.core.proxy.n
    public final boolean g(com.kwad.components.core.proxy.a r2) {
            r1 = this;
            if (r2 == 0) goto L1a
            java.lang.ref.WeakReference<com.kwad.components.core.proxy.a> r0 = r1.Wt
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto Ld
            goto L1a
        Ld:
            java.lang.ref.WeakReference<com.kwad.components.core.proxy.a> r0 = r1.Wt
            java.lang.Object r0 = r0.get()
            com.kwad.components.core.proxy.a r0 = (com.kwad.components.core.proxy.a) r0
            boolean r2 = r0.equals(r2)
            return r2
        L1a:
            r2 = 0
            return r2
    }

    public final void start() {
            r4 = this;
            r0 = 1
            r4.started = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "start call: "
            r0.<init>(r1)
            com.kwad.components.core.proxy.launchdialog.DetectEventType r1 = r4.Ws
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "LifecycleSequence"
            com.kwad.sdk.core.d.c.d(r1, r0)
            com.kwad.components.core.proxy.launchdialog.c$1 r0 = new com.kwad.components.core.proxy.launchdialog.c$1
            r0.<init>(r4)
            long r2 = com.kwad.components.core.proxy.launchdialog.c.Wr
            com.kwad.sdk.utils.bw.runOnUiThreadDelay(r0, r2)
            com.kwad.components.core.proxy.launchdialog.d r0 = r4.rU()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "start call current: "
            r2.<init>(r3)
            r2.append(r0)
            com.kwad.components.core.proxy.launchdialog.DetectEventType r3 = r4.Ws
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.kwad.sdk.core.d.c.d(r1, r2)
            r4.a(r0)
            return
    }

    public final void stop() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "stop call: "
            r0.<init>(r1)
            com.kwad.components.core.proxy.launchdialog.DetectEventType r1 = r2.Ws
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "LifecycleSequence"
            com.kwad.sdk.core.d.c.d(r1, r0)
            com.kwad.components.core.proxy.launchdialog.c$a r0 = r2.Wv
            com.kwad.components.core.proxy.launchdialog.c.a.a(r0)
            r0 = 0
            r2.started = r0
            return
    }
}
