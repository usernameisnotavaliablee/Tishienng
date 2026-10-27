package com.kwad.components.core.proxy.launchdialog;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a implements com.kwad.components.core.proxy.k {
    private java.util.List<com.kwad.components.core.proxy.k> Wm;
    private java.util.Map<com.kwad.components.core.proxy.a, java.util.List<com.kwad.components.core.proxy.launchdialog.c>> Wn;
    private com.kwad.components.core.proxy.a Wo;







    public a() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.Wm = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.Wn = r0
            return
    }

    private void a(com.kwad.components.core.proxy.a r4, com.kwad.sdk.g.a<com.kwad.components.core.proxy.k> r5) {
            r3 = this;
            java.util.List<com.kwad.components.core.proxy.k> r0 = r3.Wm
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            com.kwad.components.core.proxy.k r1 = (com.kwad.components.core.proxy.k) r1
            boolean r2 = r1 instanceof com.kwad.components.core.proxy.n
            if (r2 == 0) goto L22
            com.kwad.components.core.proxy.n r1 = (com.kwad.components.core.proxy.n) r1
            boolean r2 = r1.g(r4)
            if (r2 == 0) goto L6
            r5.accept(r1)
            goto L6
        L22:
            r5.accept(r1)
            goto L6
        L26:
            return
    }

    private void a(com.kwad.components.core.proxy.k r2) {
            r1 = this;
            java.util.List<com.kwad.components.core.proxy.k> r0 = r1.Wm
            r0.add(r2)
            return
    }

    private void b(com.kwad.components.core.proxy.k r2) {
            r1 = this;
            if (r2 == 0) goto L7
            java.util.List<com.kwad.components.core.proxy.k> r0 = r1.Wm
            r0.remove(r2)
        L7:
            return
    }

    public final com.kwad.components.core.proxy.launchdialog.c a(com.kwad.components.core.proxy.launchdialog.DetectEventType r5) {
            r4 = this;
            com.kwad.components.core.proxy.a r0 = r4.Wo
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.util.Map<com.kwad.components.core.proxy.a, java.util.List<com.kwad.components.core.proxy.launchdialog.c>> r2 = r4.Wn
            java.lang.Object r0 = r2.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L11
            return r1
        L11:
            java.util.Iterator r0 = r0.iterator()
        L15:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L28
            java.lang.Object r2 = r0.next()
            com.kwad.components.core.proxy.launchdialog.c r2 = (com.kwad.components.core.proxy.launchdialog.c) r2
            boolean r3 = r2.b(r5)
            if (r3 == 0) goto L15
            return r2
        L28:
            return r1
    }

    @Override // com.kwad.components.core.proxy.k
    public final void a(com.kwad.components.core.proxy.a r2) {
            r1 = this;
            com.kwad.components.core.proxy.launchdialog.a$1 r0 = new com.kwad.components.core.proxy.launchdialog.a$1
            r0.<init>(r1, r2)
            r1.a(r2, r0)
            return
    }

    @Override // com.kwad.components.core.proxy.k
    public final void b(com.kwad.components.core.proxy.a r2) {
            r1 = this;
            com.kwad.components.core.proxy.launchdialog.a$2 r0 = new com.kwad.components.core.proxy.launchdialog.a$2
            r0.<init>(r1, r2)
            r1.a(r2, r0)
            return
    }

    @Override // com.kwad.components.core.proxy.k
    public final void c(com.kwad.components.core.proxy.a r2) {
            r1 = this;
            r1.Wo = r2
            com.kwad.components.core.proxy.launchdialog.a$3 r0 = new com.kwad.components.core.proxy.launchdialog.a$3
            r0.<init>(r1, r2)
            r1.a(r2, r0)
            return
    }

    @Override // com.kwad.components.core.proxy.k
    public final void d(com.kwad.components.core.proxy.a r2) {
            r1 = this;
            com.kwad.components.core.proxy.launchdialog.a$4 r0 = new com.kwad.components.core.proxy.launchdialog.a$4
            r0.<init>(r1, r2)
            r1.a(r2, r0)
            return
    }

    @Override // com.kwad.components.core.proxy.k
    public final void e(com.kwad.components.core.proxy.a r2) {
            r1 = this;
            com.kwad.components.core.proxy.launchdialog.a$5 r0 = new com.kwad.components.core.proxy.launchdialog.a$5
            r0.<init>(r1, r2)
            r1.a(r2, r0)
            return
    }

    @Override // com.kwad.components.core.proxy.k
    public final void f(com.kwad.components.core.proxy.a r2) {
            r1 = this;
            com.kwad.components.core.proxy.launchdialog.a$6 r0 = new com.kwad.components.core.proxy.launchdialog.a$6
            r0.<init>(r1, r2)
            r1.a(r2, r0)
            r1.i(r2)
            return
    }

    public final void h(com.kwad.components.core.proxy.a r14) {
            r13 = this;
            com.kwad.components.core.proxy.launchdialog.c r0 = new com.kwad.components.core.proxy.launchdialog.c
            com.kwad.components.core.proxy.launchdialog.DetectEventType r1 = com.kwad.components.core.proxy.launchdialog.DetectEventType.USER_CANCEL
            com.kwad.components.core.proxy.launchdialog.g$b r2 = new com.kwad.components.core.proxy.launchdialog.g$b
            androidx.lifecycle.Lifecycle$Event r3 = androidx.lifecycle.Lifecycle.Event.ON_RESUME
            r2.<init>(r3)
            com.kwad.components.core.proxy.launchdialog.g$b r4 = new com.kwad.components.core.proxy.launchdialog.g$b
            androidx.lifecycle.Lifecycle$Event r5 = androidx.lifecycle.Lifecycle.Event.ON_PAUSE
            r4.<init>(r5)
            com.kwad.components.core.proxy.launchdialog.g$a r6 = new com.kwad.components.core.proxy.launchdialog.g$a
            r7 = 500(0x1f4, double:2.47E-321)
            r6.<init>(r7)
            com.kwad.components.core.proxy.launchdialog.g$b r7 = new com.kwad.components.core.proxy.launchdialog.g$b
            r7.<init>(r3)
            r8 = 4
            com.kwad.components.core.proxy.launchdialog.g[] r9 = new com.kwad.components.core.proxy.launchdialog.g[r8]
            r10 = 0
            r9[r10] = r2
            r2 = 1
            r9[r2] = r4
            r4 = 2
            r9[r4] = r6
            r6 = 3
            r9[r6] = r7
            r0.<init>(r1, r14, r9)
            r13.a(r0)
            com.kwad.components.core.proxy.launchdialog.c r1 = new com.kwad.components.core.proxy.launchdialog.c
            com.kwad.components.core.proxy.launchdialog.DetectEventType r7 = com.kwad.components.core.proxy.launchdialog.DetectEventType.USER_CONFIRM
            com.kwad.components.core.proxy.launchdialog.g$b r9 = new com.kwad.components.core.proxy.launchdialog.g$b
            r9.<init>(r3)
            com.kwad.components.core.proxy.launchdialog.g$b r3 = new com.kwad.components.core.proxy.launchdialog.g$b
            r3.<init>(r5)
            com.kwad.components.core.proxy.launchdialog.g$a r5 = new com.kwad.components.core.proxy.launchdialog.g$a
            r11 = 1000(0x3e8, double:4.94E-321)
            r5.<init>(r11)
            com.kwad.components.core.proxy.launchdialog.g$b r11 = new com.kwad.components.core.proxy.launchdialog.g$b
            androidx.lifecycle.Lifecycle$Event r12 = androidx.lifecycle.Lifecycle.Event.ON_STOP
            r11.<init>(r12)
            com.kwad.components.core.proxy.launchdialog.g[] r8 = new com.kwad.components.core.proxy.launchdialog.g[r8]
            r8[r10] = r9
            r8[r2] = r3
            r8[r4] = r5
            r8[r6] = r11
            r1.<init>(r7, r14, r8)
            r13.a(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.add(r0)
            r2.add(r1)
            java.util.Map<com.kwad.components.core.proxy.a, java.util.List<com.kwad.components.core.proxy.launchdialog.c>> r0 = r13.Wn
            r0.put(r14, r2)
            return
    }

    public final void i(com.kwad.components.core.proxy.a r4) {
            r3 = this;
            if (r4 == 0) goto L23
            java.util.Map<com.kwad.components.core.proxy.a, java.util.List<com.kwad.components.core.proxy.launchdialog.c>> r0 = r3.Wn
            java.lang.Object r0 = r0.get(r4)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L23
            java.util.Iterator r1 = r0.iterator()
        L10:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L20
            java.lang.Object r2 = r1.next()
            com.kwad.components.core.proxy.launchdialog.c r2 = (com.kwad.components.core.proxy.launchdialog.c) r2
            r3.b(r2)
            goto L10
        L20:
            r0.clear()
        L23:
            java.util.Map<com.kwad.components.core.proxy.a, java.util.List<com.kwad.components.core.proxy.launchdialog.c>> r0 = r3.Wn
            r0.remove(r4)
            return
    }

    public final com.kwad.components.core.proxy.a rW() {
            r1 = this;
            com.kwad.components.core.proxy.a r0 = r1.Wo
            return r0
    }
}
