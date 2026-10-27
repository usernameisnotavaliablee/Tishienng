package com.bumptech.glide;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class f<T> implements android.widget.AbsListView.OnScrollListener {
    private final int a;
    private final com.bumptech.glide.f.d b;
    private final com.bumptech.glide.i c;
    private final com.bumptech.glide.f.a<T> d;
    private final com.bumptech.glide.f.b<T> e;
    private int f;
    private int g;
    private int h;
    private int i;
    private boolean j;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a<U> {
        @androidx.annotation.NonNull
        java.util.List<U> a(int r1);

        @androidx.annotation.Nullable
        com.bumptech.glide.h<?> b(@androidx.annotation.NonNull U r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b<T> {
        @androidx.annotation.Nullable
        int[] a(@androidx.annotation.NonNull T r1, int r2, int r3);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class c implements com.bumptech.glide.request.target.p<java.lang.Object> {
        int a;
        int b;

        @androidx.annotation.Nullable
        private com.bumptech.glide.request.e c;

        c() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.request.target.p
        public void b(@androidx.annotation.NonNull com.bumptech.glide.request.target.o r1) {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.request.target.p
        @androidx.annotation.Nullable
        public com.bumptech.glide.request.e d() {
                r1 = this;
                com.bumptech.glide.request.e r0 = r1.c
                return r0
        }

        @Override // com.bumptech.glide.request.target.p
        public void g(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.request.target.p
        public void h(@androidx.annotation.NonNull java.lang.Object r1, @androidx.annotation.Nullable com.bumptech.glide.request.transition.f<? super java.lang.Object> r2) {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.request.target.p
        public void j(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.request.target.p
        public void n(@androidx.annotation.Nullable com.bumptech.glide.request.e r1) {
                r0 = this;
                r0.c = r1
                return
        }

        @Override // com.bumptech.glide.request.target.p
        public void o(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.manager.m
        public void onDestroy() {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.manager.m
        public void onStart() {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.manager.m
        public void onStop() {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.request.target.p
        public void q(@androidx.annotation.NonNull com.bumptech.glide.request.target.o r3) {
                r2 = this;
                int r0 = r2.b
                int r1 = r2.a
                r3.d(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class d {
        final java.util.Queue<com.bumptech.glide.f.c> a;

        d(int r4) {
                r3 = this;
                r3.<init>()
                java.util.Queue r0 = com.bumptech.glide.util.l.f(r4)
                r3.a = r0
                r0 = 0
            La:
                if (r0 >= r4) goto L19
                java.util.Queue<com.bumptech.glide.f$c> r1 = r3.a
                com.bumptech.glide.f$c r2 = new com.bumptech.glide.f$c
                r2.<init>()
                r1.offer(r2)
                int r0 = r0 + 1
                goto La
            L19:
                return
        }

        public com.bumptech.glide.f.c a(int r3, int r4) {
                r2 = this;
                java.util.Queue<com.bumptech.glide.f$c> r0 = r2.a
                java.lang.Object r0 = r0.poll()
                com.bumptech.glide.f$c r0 = (com.bumptech.glide.f.c) r0
                java.util.Queue<com.bumptech.glide.f$c> r1 = r2.a
                r1.offer(r0)
                r0.b = r3
                r0.a = r4
                return r0
        }
    }

    public f(@androidx.annotation.NonNull com.bumptech.glide.i r2, @androidx.annotation.NonNull com.bumptech.glide.f.a<T> r3, @androidx.annotation.NonNull com.bumptech.glide.f.b<T> r4, int r5) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.h = r0
            r0 = 1
            r1.j = r0
            r1.c = r2
            r1.d = r3
            r1.e = r4
            r1.a = r5
            com.bumptech.glide.f$d r2 = new com.bumptech.glide.f$d
            int r5 = r5 + r0
            r2.<init>(r5)
            r1.b = r2
            return
    }

    private void a() {
            r4 = this;
            r0 = 0
            r1 = 0
        L2:
            com.bumptech.glide.f$d r2 = r4.b
            java.util.Queue<com.bumptech.glide.f$c> r2 = r2.a
            int r2 = r2.size()
            if (r1 >= r2) goto L1a
            com.bumptech.glide.i r2 = r4.c
            com.bumptech.glide.f$d r3 = r4.b
            com.bumptech.glide.f$c r3 = r3.a(r0, r0)
            r2.z(r3)
            int r1 = r1 + 1
            goto L2
        L1a:
            return
    }

    private void b(int r5, int r6) {
            r4 = this;
            if (r5 >= r6) goto Lb
            int r0 = r4.f
            int r0 = java.lang.Math.max(r0, r5)
            r1 = r0
            r0 = r6
            goto L12
        Lb:
            int r0 = r4.g
            int r0 = java.lang.Math.min(r0, r5)
            r1 = r6
        L12:
            int r2 = r4.i
            int r0 = java.lang.Math.min(r2, r0)
            int r2 = r4.i
            r3 = 0
            int r1 = java.lang.Math.max(r3, r1)
            int r1 = java.lang.Math.min(r2, r1)
            if (r5 >= r6) goto L35
            r5 = r1
        L26:
            if (r5 >= r0) goto L45
            com.bumptech.glide.f$a<T> r6 = r4.d
            java.util.List r6 = r6.a(r5)
            r2 = 1
            r4.d(r6, r5, r2)
            int r5 = r5 + 1
            goto L26
        L35:
            int r5 = r0 + (-1)
        L37:
            if (r5 < r1) goto L45
            com.bumptech.glide.f$a<T> r6 = r4.d
            java.util.List r6 = r6.a(r5)
            r4.d(r6, r5, r3)
            int r5 = r5 + (-1)
            goto L37
        L45:
            r4.g = r1
            r4.f = r0
            return
    }

    private void c(int r2, boolean r3) {
            r1 = this;
            boolean r0 = r1.j
            if (r0 == r3) goto L9
            r1.j = r3
            r1.a()
        L9:
            if (r3 == 0) goto Le
            int r3 = r1.a
            goto L11
        Le:
            int r3 = r1.a
            int r3 = -r3
        L11:
            int r3 = r3 + r2
            r1.b(r2, r3)
            return
    }

    private void d(java.util.List<T> r3, int r4, boolean r5) {
            r2 = this;
            int r0 = r3.size()
            if (r5 == 0) goto L13
            r5 = 0
        L7:
            if (r5 >= r0) goto L21
            java.lang.Object r1 = r3.get(r5)
            r2.e(r1, r4, r5)
            int r5 = r5 + 1
            goto L7
        L13:
            int r0 = r0 + (-1)
        L15:
            if (r0 < 0) goto L21
            java.lang.Object r5 = r3.get(r0)
            r2.e(r5, r4, r0)
            int r0 = r0 + (-1)
            goto L15
        L21:
            return
    }

    private void e(@androidx.annotation.Nullable T r3, int r4, int r5) {
            r2 = this;
            if (r3 != 0) goto L3
            goto L14
        L3:
            com.bumptech.glide.f$b<T> r0 = r2.e
            int[] r4 = r0.a(r3, r4, r5)
            if (r4 != 0) goto Lc
            goto L14
        Lc:
            com.bumptech.glide.f$a<T> r5 = r2.d
            com.bumptech.glide.h r3 = r5.b(r3)
            if (r3 != 0) goto L15
        L14:
            return
        L15:
            com.bumptech.glide.f$d r5 = r2.b
            r0 = 0
            r0 = r4[r0]
            r1 = 1
            r4 = r4[r1]
            com.bumptech.glide.f$c r4 = r5.a(r0, r4)
            r3.j1(r4)
            return
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView r1, int r2, int r3, int r4) {
            r0 = this;
            r0.i = r4
            int r1 = r0.h
            if (r2 <= r1) goto Lc
            int r3 = r3 + r2
            r1 = 1
            r0.c(r3, r1)
            goto L12
        Lc:
            if (r2 >= r1) goto L12
            r1 = 0
            r0.c(r2, r1)
        L12:
            r0.h = r2
            return
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView r1, int r2) {
            r0 = this;
            return
    }
}
