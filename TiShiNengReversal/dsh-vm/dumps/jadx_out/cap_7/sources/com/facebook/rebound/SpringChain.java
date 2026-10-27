package com.facebook.rebound;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class SpringChain implements com.facebook.rebound.SpringListener {
    private static final com.facebook.rebound.SpringConfigRegistry g = null;
    private static final int h = 40;
    private static final int i = 6;
    private static final int j = 70;
    private static final int k = 10;
    private static int l;
    private final com.facebook.rebound.SpringSystem a;
    private final java.util.concurrent.CopyOnWriteArrayList<com.facebook.rebound.SpringListener> b;
    private final java.util.concurrent.CopyOnWriteArrayList<com.facebook.rebound.Spring> c;
    private int d;
    private final com.facebook.rebound.SpringConfig e;
    private final com.facebook.rebound.SpringConfig f;

    static {
            com.facebook.rebound.SpringConfigRegistry r0 = com.facebook.rebound.SpringConfigRegistry.c()
            com.facebook.rebound.SpringChain.g = r0
            r0 = 0
            com.facebook.rebound.SpringChain.l = r0
            return
    }

    private SpringChain() {
            r4 = this;
            r0 = 70
            r1 = 10
            r2 = 40
            r3 = 6
            r4.<init>(r2, r3, r0, r1)
            return
    }

    private SpringChain(int r3, int r4, int r5, int r6) {
            r2 = this;
            r2.<init>()
            com.facebook.rebound.SpringSystem r0 = com.facebook.rebound.SpringSystem.m()
            r2.a = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r2.b = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r2.c = r0
            r0 = -1
            r2.d = r0
            double r0 = (double) r3
            double r3 = (double) r4
            com.facebook.rebound.SpringConfig r3 = com.facebook.rebound.SpringConfig.b(r0, r3)
            r2.e = r3
            double r4 = (double) r5
            double r0 = (double) r6
            com.facebook.rebound.SpringConfig r4 = com.facebook.rebound.SpringConfig.b(r4, r0)
            r2.f = r4
            com.facebook.rebound.SpringConfigRegistry r5 = com.facebook.rebound.SpringChain.g
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "main spring "
            r6.append(r0)
            int r0 = com.facebook.rebound.SpringChain.l
            int r1 = r0 + 1
            com.facebook.rebound.SpringChain.l = r1
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.a(r3, r6)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "attachment spring "
            r3.append(r6)
            int r6 = com.facebook.rebound.SpringChain.l
            int r0 = r6 + 1
            com.facebook.rebound.SpringChain.l = r0
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            r5.a(r4, r3)
            return
    }

    public static com.facebook.rebound.SpringChain b() {
            com.facebook.rebound.SpringChain r0 = new com.facebook.rebound.SpringChain
            r0.<init>()
            return r0
    }

    public static com.facebook.rebound.SpringChain c(int r1, int r2, int r3, int r4) {
            com.facebook.rebound.SpringChain r0 = new com.facebook.rebound.SpringChain
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public com.facebook.rebound.SpringChain a(com.facebook.rebound.SpringListener r3) {
            r2 = this;
            com.facebook.rebound.SpringSystem r0 = r2.a
            com.facebook.rebound.Spring r0 = r0.d()
            com.facebook.rebound.Spring r0 = r0.a(r2)
            com.facebook.rebound.SpringConfig r1 = r2.f
            com.facebook.rebound.Spring r0 = r0.B(r1)
            java.util.concurrent.CopyOnWriteArrayList<com.facebook.rebound.Spring> r1 = r2.c
            r1.add(r0)
            java.util.concurrent.CopyOnWriteArrayList<com.facebook.rebound.SpringListener> r0 = r2.b
            r0.add(r3)
            return r2
    }

    public java.util.List<com.facebook.rebound.Spring> d() {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<com.facebook.rebound.Spring> r0 = r1.c
            return r0
    }

    public com.facebook.rebound.SpringConfig e() {
            r1 = this;
            com.facebook.rebound.SpringConfig r0 = r1.f
            return r0
    }

    public com.facebook.rebound.Spring f() {
            r2 = this;
            java.util.concurrent.CopyOnWriteArrayList<com.facebook.rebound.Spring> r0 = r2.c
            int r1 = r2.d
            java.lang.Object r0 = r0.get(r1)
            com.facebook.rebound.Spring r0 = (com.facebook.rebound.Spring) r0
            return r0
    }

    public com.facebook.rebound.SpringConfig g() {
            r1 = this;
            com.facebook.rebound.SpringConfig r0 = r1.e
            return r0
    }

    public com.facebook.rebound.SpringChain h(int r3) {
            r2 = this;
            r2.d = r3
            java.util.concurrent.CopyOnWriteArrayList<com.facebook.rebound.Spring> r0 = r2.c
            java.lang.Object r3 = r0.get(r3)
            com.facebook.rebound.Spring r3 = (com.facebook.rebound.Spring) r3
            if (r3 != 0) goto Le
            r3 = 0
            return r3
        Le:
            com.facebook.rebound.SpringSystem r3 = r2.a
            java.util.List r3 = r3.f()
            java.util.Iterator r3 = r3.iterator()
        L18:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r3.next()
            com.facebook.rebound.Spring r0 = (com.facebook.rebound.Spring) r0
            com.facebook.rebound.SpringConfig r1 = r2.f
            r0.B(r1)
            goto L18
        L2a:
            com.facebook.rebound.Spring r3 = r2.f()
            com.facebook.rebound.SpringConfig r0 = r2.e
            r3.B(r0)
            return r2
    }

    @Override // com.facebook.rebound.SpringListener
    public void onSpringActivate(com.facebook.rebound.Spring r3) {
            r2 = this;
            java.util.concurrent.CopyOnWriteArrayList<com.facebook.rebound.Spring> r0 = r2.c
            int r0 = r0.indexOf(r3)
            java.util.concurrent.CopyOnWriteArrayList<com.facebook.rebound.SpringListener> r1 = r2.b
            java.lang.Object r0 = r1.get(r0)
            com.facebook.rebound.SpringListener r0 = (com.facebook.rebound.SpringListener) r0
            r0.onSpringActivate(r3)
            return
    }

    @Override // com.facebook.rebound.SpringListener
    public void onSpringAtRest(com.facebook.rebound.Spring r3) {
            r2 = this;
            java.util.concurrent.CopyOnWriteArrayList<com.facebook.rebound.Spring> r0 = r2.c
            int r0 = r0.indexOf(r3)
            java.util.concurrent.CopyOnWriteArrayList<com.facebook.rebound.SpringListener> r1 = r2.b
            java.lang.Object r0 = r1.get(r0)
            com.facebook.rebound.SpringListener r0 = (com.facebook.rebound.SpringListener) r0
            r0.onSpringAtRest(r3)
            return
    }

    @Override // com.facebook.rebound.SpringListener
    public void onSpringEndStateChange(com.facebook.rebound.Spring r3) {
            r2 = this;
            java.util.concurrent.CopyOnWriteArrayList<com.facebook.rebound.Spring> r0 = r2.c
            int r0 = r0.indexOf(r3)
            java.util.concurrent.CopyOnWriteArrayList<com.facebook.rebound.SpringListener> r1 = r2.b
            java.lang.Object r0 = r1.get(r0)
            com.facebook.rebound.SpringListener r0 = (com.facebook.rebound.SpringListener) r0
            r0.onSpringEndStateChange(r3)
            return
    }

    @Override // com.facebook.rebound.SpringListener
    public void onSpringUpdate(com.facebook.rebound.Spring r7) {
            r6 = this;
            java.util.concurrent.CopyOnWriteArrayList<com.facebook.rebound.Spring> r0 = r6.c
            int r0 = r0.indexOf(r7)
            java.util.concurrent.CopyOnWriteArrayList<com.facebook.rebound.SpringListener> r1 = r6.b
            java.lang.Object r1 = r1.get(r0)
            com.facebook.rebound.SpringListener r1 = (com.facebook.rebound.SpringListener) r1
            int r2 = r6.d
            r3 = -1
            if (r0 != r2) goto L18
            int r2 = r0 + (-1)
            int r0 = r0 + 1
            goto L26
        L18:
            if (r0 >= r2) goto L1e
            int r2 = r0 + (-1)
            r0 = -1
            goto L26
        L1e:
            if (r0 <= r2) goto L24
            int r0 = r0 + 1
        L22:
            r2 = -1
            goto L26
        L24:
            r0 = -1
            goto L22
        L26:
            if (r0 <= r3) goto L3f
            java.util.concurrent.CopyOnWriteArrayList<com.facebook.rebound.Spring> r4 = r6.c
            int r4 = r4.size()
            if (r0 >= r4) goto L3f
            java.util.concurrent.CopyOnWriteArrayList<com.facebook.rebound.Spring> r4 = r6.c
            java.lang.Object r0 = r4.get(r0)
            com.facebook.rebound.Spring r0 = (com.facebook.rebound.Spring) r0
            double r4 = r7.f()
            r0.x(r4)
        L3f:
            if (r2 <= r3) goto L58
            java.util.concurrent.CopyOnWriteArrayList<com.facebook.rebound.Spring> r0 = r6.c
            int r0 = r0.size()
            if (r2 >= r0) goto L58
            java.util.concurrent.CopyOnWriteArrayList<com.facebook.rebound.Spring> r0 = r6.c
            java.lang.Object r0 = r0.get(r2)
            com.facebook.rebound.Spring r0 = (com.facebook.rebound.Spring) r0
            double r2 = r7.f()
            r0.x(r2)
        L58:
            r1.onSpringUpdate(r7)
            return
    }
}
