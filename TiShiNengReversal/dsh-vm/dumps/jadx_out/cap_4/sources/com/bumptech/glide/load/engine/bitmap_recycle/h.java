package com.bumptech.glide.load.engine.bitmap_recycle;

import com.bumptech.glide.load.engine.bitmap_recycle.n;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class h<K extends com.bumptech.glide.load.engine.bitmap_recycle.n, V> {
    private final com.bumptech.glide.load.engine.bitmap_recycle.h.a<K, V> a;
    private final java.util.Map<K, com.bumptech.glide.load.engine.bitmap_recycle.h.a<K, V>> b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a<K, V> {
        final K a;
        private java.util.List<V> b;
        com.bumptech.glide.load.engine.bitmap_recycle.h.a<K, V> c;
        com.bumptech.glide.load.engine.bitmap_recycle.h.a<K, V> d;

        a() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        a(K r1) {
                r0 = this;
                r0.<init>()
                r0.d = r0
                r0.c = r0
                r0.a = r1
                return
        }

        public void a(V r2) {
                r1 = this;
                java.util.List<V> r0 = r1.b
                if (r0 != 0) goto Lb
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.b = r0
            Lb:
                java.util.List<V> r0 = r1.b
                r0.add(r2)
                return
        }

        @androidx.annotation.Nullable
        public V b() {
                r2 = this;
                int r0 = r2.c()
                if (r0 <= 0) goto Lf
                java.util.List<V> r1 = r2.b
                int r0 = r0 + (-1)
                java.lang.Object r0 = r1.remove(r0)
                return r0
            Lf:
                r0 = 0
                return r0
        }

        public int c() {
                r1 = this;
                java.util.List<V> r0 = r1.b
                if (r0 == 0) goto L9
                int r0 = r0.size()
                return r0
            L9:
                r0 = 0
                return r0
        }
    }

    h() {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.load.engine.bitmap_recycle.h$a r0 = new com.bumptech.glide.load.engine.bitmap_recycle.h$a
            r0.<init>()
            r1.a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.b = r0
            return
    }

    private void b(com.bumptech.glide.load.engine.bitmap_recycle.h.a<K, V> r2) {
            r1 = this;
            e(r2)
            com.bumptech.glide.load.engine.bitmap_recycle.h$a<K extends com.bumptech.glide.load.engine.bitmap_recycle.n, V> r0 = r1.a
            r2.d = r0
            com.bumptech.glide.load.engine.bitmap_recycle.h$a<K, V> r0 = r0.c
            r2.c = r0
            g(r2)
            return
    }

    private void c(com.bumptech.glide.load.engine.bitmap_recycle.h.a<K, V> r3) {
            r2 = this;
            e(r3)
            com.bumptech.glide.load.engine.bitmap_recycle.h$a<K extends com.bumptech.glide.load.engine.bitmap_recycle.n, V> r0 = r2.a
            com.bumptech.glide.load.engine.bitmap_recycle.h$a<K, V> r1 = r0.d
            r3.d = r1
            r3.c = r0
            g(r3)
            return
    }

    private static <K, V> void e(com.bumptech.glide.load.engine.bitmap_recycle.h.a<K, V> r2) {
            com.bumptech.glide.load.engine.bitmap_recycle.h$a<K, V> r0 = r2.d
            com.bumptech.glide.load.engine.bitmap_recycle.h$a<K, V> r1 = r2.c
            r0.c = r1
            com.bumptech.glide.load.engine.bitmap_recycle.h$a<K, V> r2 = r2.c
            r2.d = r0
            return
    }

    private static <K, V> void g(com.bumptech.glide.load.engine.bitmap_recycle.h.a<K, V> r1) {
            com.bumptech.glide.load.engine.bitmap_recycle.h$a<K, V> r0 = r1.c
            r0.d = r1
            com.bumptech.glide.load.engine.bitmap_recycle.h$a<K, V> r0 = r1.d
            r0.c = r1
            return
    }

    @androidx.annotation.Nullable
    public V a(K r3) {
            r2 = this;
            java.util.Map<K extends com.bumptech.glide.load.engine.bitmap_recycle.n, com.bumptech.glide.load.engine.bitmap_recycle.h$a<K extends com.bumptech.glide.load.engine.bitmap_recycle.n, V>> r0 = r2.b
            java.lang.Object r0 = r0.get(r3)
            com.bumptech.glide.load.engine.bitmap_recycle.h$a r0 = (com.bumptech.glide.load.engine.bitmap_recycle.h.a) r0
            if (r0 != 0) goto L15
            com.bumptech.glide.load.engine.bitmap_recycle.h$a r0 = new com.bumptech.glide.load.engine.bitmap_recycle.h$a
            r0.<init>(r3)
            java.util.Map<K extends com.bumptech.glide.load.engine.bitmap_recycle.n, com.bumptech.glide.load.engine.bitmap_recycle.h$a<K extends com.bumptech.glide.load.engine.bitmap_recycle.n, V>> r1 = r2.b
            r1.put(r3, r0)
            goto L18
        L15:
            r3.a()
        L18:
            r2.b(r0)
            java.lang.Object r3 = r0.b()
            return r3
    }

    public void d(K r3, V r4) {
            r2 = this;
            java.util.Map<K extends com.bumptech.glide.load.engine.bitmap_recycle.n, com.bumptech.glide.load.engine.bitmap_recycle.h$a<K extends com.bumptech.glide.load.engine.bitmap_recycle.n, V>> r0 = r2.b
            java.lang.Object r0 = r0.get(r3)
            com.bumptech.glide.load.engine.bitmap_recycle.h$a r0 = (com.bumptech.glide.load.engine.bitmap_recycle.h.a) r0
            if (r0 != 0) goto L18
            com.bumptech.glide.load.engine.bitmap_recycle.h$a r0 = new com.bumptech.glide.load.engine.bitmap_recycle.h$a
            r0.<init>(r3)
            r2.c(r0)
            java.util.Map<K extends com.bumptech.glide.load.engine.bitmap_recycle.n, com.bumptech.glide.load.engine.bitmap_recycle.h$a<K extends com.bumptech.glide.load.engine.bitmap_recycle.n, V>> r1 = r2.b
            r1.put(r3, r0)
            goto L1b
        L18:
            r3.a()
        L1b:
            r0.a(r4)
            return
    }

    @androidx.annotation.Nullable
    public V f() {
            r3 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.h$a<K extends com.bumptech.glide.load.engine.bitmap_recycle.n, V> r0 = r3.a
            com.bumptech.glide.load.engine.bitmap_recycle.h$a<K, V> r0 = r0.d
        L4:
            com.bumptech.glide.load.engine.bitmap_recycle.h$a<K extends com.bumptech.glide.load.engine.bitmap_recycle.n, V> r1 = r3.a
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L27
            java.lang.Object r1 = r0.b()
            if (r1 == 0) goto L13
            return r1
        L13:
            e(r0)
            java.util.Map<K extends com.bumptech.glide.load.engine.bitmap_recycle.n, com.bumptech.glide.load.engine.bitmap_recycle.h$a<K extends com.bumptech.glide.load.engine.bitmap_recycle.n, V>> r1 = r3.b
            K r2 = r0.a
            r1.remove(r2)
            K r1 = r0.a
            com.bumptech.glide.load.engine.bitmap_recycle.n r1 = (com.bumptech.glide.load.engine.bitmap_recycle.n) r1
            r1.a()
            com.bumptech.glide.load.engine.bitmap_recycle.h$a<K, V> r0 = r0.d
            goto L4
        L27:
            r0 = 0
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "GroupedLinkedMap( "
            r0.<init>(r1)
            com.bumptech.glide.load.engine.bitmap_recycle.h$a<K extends com.bumptech.glide.load.engine.bitmap_recycle.n, V> r1 = r4.a
            com.bumptech.glide.load.engine.bitmap_recycle.h$a<K, V> r1 = r1.c
            r2 = 0
        Lc:
            com.bumptech.glide.load.engine.bitmap_recycle.h$a<K extends com.bumptech.glide.load.engine.bitmap_recycle.n, V> r3 = r4.a
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L33
            r2 = 123(0x7b, float:1.72E-43)
            r0.append(r2)
            K r2 = r1.a
            r0.append(r2)
            r2 = 58
            r0.append(r2)
            int r2 = r1.c()
            r0.append(r2)
            java.lang.String r2 = "}, "
            r0.append(r2)
            com.bumptech.glide.load.engine.bitmap_recycle.h$a<K, V> r1 = r1.c
            r2 = 1
            goto Lc
        L33:
            if (r2 == 0) goto L42
            int r1 = r0.length()
            int r1 = r1 + (-2)
            int r2 = r0.length()
            r0.delete(r1, r2)
        L42:
            java.lang.String r1 = " )"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
