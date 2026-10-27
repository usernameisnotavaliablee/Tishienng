package com.facebook.rebound;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class AnimationQueue {
    private final com.facebook.rebound.ChoreographerCompat a;
    private final java.util.Queue<java.lang.Double> b;
    private final java.util.Queue<java.lang.Double> c;
    private final java.util.List<com.facebook.rebound.AnimationQueue.Callback> d;
    private final java.util.ArrayList<java.lang.Double> e;
    private final com.facebook.rebound.ChoreographerCompat.FrameCallback f;
    private boolean g;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Callback {
        void a(java.lang.Double r1);
    }

    public AnimationQueue() {
            r1 = this;
            r1.<init>()
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1.b = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1.c = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.d = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.e = r0
            com.facebook.rebound.ChoreographerCompat r0 = com.facebook.rebound.ChoreographerCompat.e()
            r1.a = r0
            com.facebook.rebound.AnimationQueue$1 r0 = new com.facebook.rebound.AnimationQueue$1
            r0.<init>(r1)
            r1.f = r0
            return
    }

    static /* synthetic */ void a(com.facebook.rebound.AnimationQueue r0, long r1) {
            r0.g(r1)
            return
    }

    private void g(long r5) {
            r4 = this;
            java.util.Queue<java.lang.Double> r5 = r4.b
            java.lang.Object r5 = r5.poll()
            java.lang.Double r5 = (java.lang.Double) r5
            r6 = 0
            if (r5 == 0) goto L12
            java.util.Queue<java.lang.Double> r0 = r4.c
            r0.offer(r5)
            r5 = 0
            goto L23
        L12:
            java.util.List<com.facebook.rebound.AnimationQueue$Callback> r5 = r4.d
            int r5 = r5.size()
            java.util.Queue<java.lang.Double> r0 = r4.c
            int r0 = r0.size()
            int r5 = r5 - r0
            int r5 = java.lang.Math.max(r5, r6)
        L23:
            java.util.ArrayList<java.lang.Double> r0 = r4.e
            java.util.Queue<java.lang.Double> r1 = r4.c
            r0.addAll(r1)
            java.util.ArrayList<java.lang.Double> r0 = r4.e
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L32:
            r1 = -1
            if (r0 <= r1) goto L5d
            java.util.ArrayList<java.lang.Double> r1 = r4.e
            java.lang.Object r1 = r1.get(r0)
            java.lang.Double r1 = (java.lang.Double) r1
            java.util.ArrayList<java.lang.Double> r2 = r4.e
            int r2 = r2.size()
            int r2 = r2 + (-1)
            int r2 = r2 - r0
            int r2 = r2 + r5
            java.util.List<com.facebook.rebound.AnimationQueue$Callback> r3 = r4.d
            int r3 = r3.size()
            if (r3 <= r2) goto L5a
            java.util.List<com.facebook.rebound.AnimationQueue$Callback> r3 = r4.d
            java.lang.Object r2 = r3.get(r2)
            com.facebook.rebound.AnimationQueue$Callback r2 = (com.facebook.rebound.AnimationQueue.Callback) r2
            r2.a(r1)
        L5a:
            int r0 = r0 + (-1)
            goto L32
        L5d:
            java.util.ArrayList<java.lang.Double> r0 = r4.e
            r0.clear()
        L62:
            java.util.Queue<java.lang.Double> r0 = r4.c
            int r0 = r0.size()
            int r0 = r0 + r5
            java.util.List<com.facebook.rebound.AnimationQueue$Callback> r1 = r4.d
            int r1 = r1.size()
            if (r0 < r1) goto L77
            java.util.Queue<java.lang.Double> r0 = r4.c
            r0.poll()
            goto L62
        L77:
            java.util.Queue<java.lang.Double> r5 = r4.c
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L8a
            java.util.Queue<java.lang.Double> r5 = r4.b
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L8a
            r4.g = r6
            return
        L8a:
            com.facebook.rebound.ChoreographerCompat r5 = r4.a
            com.facebook.rebound.ChoreographerCompat$FrameCallback r6 = r4.f
            r5.f(r6)
            return
    }

    private void i() {
            r2 = this;
            boolean r0 = r2.g
            if (r0 != 0) goto Le
            r0 = 1
            r2.g = r0
            com.facebook.rebound.ChoreographerCompat r0 = r2.a
            com.facebook.rebound.ChoreographerCompat$FrameCallback r1 = r2.f
            r0.f(r1)
        Le:
            return
    }

    public void b(java.util.Collection<java.lang.Double> r2) {
            r1 = this;
            java.util.Queue<java.lang.Double> r0 = r1.b
            r0.addAll(r2)
            r1.i()
            return
    }

    public void c(com.facebook.rebound.AnimationQueue.Callback r2) {
            r1 = this;
            java.util.List<com.facebook.rebound.AnimationQueue$Callback> r0 = r1.d
            r0.add(r2)
            return
    }

    public void d(java.lang.Double r2) {
            r1 = this;
            java.util.Queue<java.lang.Double> r0 = r1.b
            r0.add(r2)
            r1.i()
            return
    }

    public void e() {
            r1 = this;
            java.util.List<com.facebook.rebound.AnimationQueue$Callback> r0 = r1.d
            r0.clear()
            return
    }

    public void f() {
            r1 = this;
            java.util.Queue<java.lang.Double> r0 = r1.b
            r0.clear()
            return
    }

    public void h(com.facebook.rebound.AnimationQueue.Callback r2) {
            r1 = this;
            java.util.List<com.facebook.rebound.AnimationQueue$Callback> r0 = r1.d
            r0.remove(r2)
            return
    }
}
