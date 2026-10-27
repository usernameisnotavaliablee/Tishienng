package com.bumptech.glide.load.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class m<A, B> {
    private static final int b = 250;
    private final com.bumptech.glide.util.h<com.bumptech.glide.load.model.m.b<A>, B> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends com.bumptech.glide.util.h<com.bumptech.glide.load.model.m.b<A>, B> {
        final /* synthetic */ com.bumptech.glide.load.model.m e;

        a(com.bumptech.glide.load.model.m r1, long r2) {
                r0 = this;
                r0.e = r1
                r0.<init>(r2)
                return
        }

        @Override // com.bumptech.glide.util.h
        protected /* bridge */ /* synthetic */ void l(@androidx.annotation.NonNull java.lang.Object r1, @androidx.annotation.Nullable java.lang.Object r2) {
                r0 = this;
                com.bumptech.glide.load.model.m$b r1 = (com.bumptech.glide.load.model.m.b) r1
                r0.p(r1, r2)
                return
        }

        protected void p(@androidx.annotation.NonNull com.bumptech.glide.load.model.m.b<A> r1, @androidx.annotation.Nullable B r2) {
                r0 = this;
                r1.c()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.VisibleForTesting
    static final class b<A> {
        private static final java.util.Queue<com.bumptech.glide.load.model.m.b<?>> d = null;
        private int a;
        private int b;
        private A c;

        static {
                r0 = 0
                java.util.Queue r0 = com.bumptech.glide.util.l.f(r0)
                com.bumptech.glide.load.model.m.b.d = r0
                return
        }

        private b() {
                r0 = this;
                r0.<init>()
                return
        }

        static <A> com.bumptech.glide.load.model.m.b<A> a(A r2, int r3, int r4) {
                java.util.Queue<com.bumptech.glide.load.model.m$b<?>> r0 = com.bumptech.glide.load.model.m.b.d
                monitor-enter(r0)
                java.lang.Object r1 = r0.poll()     // Catch: java.lang.Throwable -> L15
                com.bumptech.glide.load.model.m$b r1 = (com.bumptech.glide.load.model.m.b) r1     // Catch: java.lang.Throwable -> L15
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
                if (r1 != 0) goto L11
                com.bumptech.glide.load.model.m$b r1 = new com.bumptech.glide.load.model.m$b
                r1.<init>()
            L11:
                r1.b(r2, r3, r4)
                return r1
            L15:
                r2 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
                throw r2
        }

        private void b(A r1, int r2, int r3) {
                r0 = this;
                r0.c = r1
                r0.b = r2
                r0.a = r3
                return
        }

        public void c() {
                r2 = this;
                java.util.Queue<com.bumptech.glide.load.model.m$b<?>> r0 = com.bumptech.glide.load.model.m.b.d
                monitor-enter(r0)
                r0.offer(r2)     // Catch: java.lang.Throwable -> L8
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
                return
            L8:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
                throw r1
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof com.bumptech.glide.load.model.m.b
                r1 = 0
                if (r0 == 0) goto L1f
                com.bumptech.glide.load.model.m$b r4 = (com.bumptech.glide.load.model.m.b) r4
                int r0 = r3.b
                int r2 = r4.b
                if (r0 != r2) goto L1f
                int r0 = r3.a
                int r2 = r4.a
                if (r0 != r2) goto L1f
                A r0 = r3.c
                A r4 = r4.c
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L1f
                r4 = 1
                return r4
            L1f:
                return r1
        }

        public int hashCode() {
                r2 = this;
                int r0 = r2.a
                int r0 = r0 * 31
                int r1 = r2.b
                int r0 = r0 + r1
                int r0 = r0 * 31
                A r1 = r2.c
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    public m() {
            r2 = this;
            r0 = 250(0xfa, double:1.235E-321)
            r2.<init>(r0)
            return
    }

    public m(long r2) {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.load.model.m$a r0 = new com.bumptech.glide.load.model.m$a
            r0.<init>(r1, r2)
            r1.a = r0
            return
    }

    public void a() {
            r1 = this;
            com.bumptech.glide.util.h<com.bumptech.glide.load.model.m$b<A>, B> r0 = r1.a
            r0.b()
            return
    }

    @androidx.annotation.Nullable
    public B b(A r1, int r2, int r3) {
            r0 = this;
            com.bumptech.glide.load.model.m$b r1 = com.bumptech.glide.load.model.m.b.a(r1, r2, r3)
            com.bumptech.glide.util.h<com.bumptech.glide.load.model.m$b<A>, B> r2 = r0.a
            java.lang.Object r2 = r2.i(r1)
            r1.c()
            return r2
    }

    public void c(A r1, int r2, int r3, B r4) {
            r0 = this;
            com.bumptech.glide.load.model.m$b r1 = com.bumptech.glide.load.model.m.b.a(r1, r2, r3)
            com.bumptech.glide.util.h<com.bumptech.glide.load.model.m$b<A>, B> r2 = r0.a
            r2.m(r1, r4)
            return
    }
}
