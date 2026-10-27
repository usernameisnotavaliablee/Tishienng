package com.bumptech.glide.load.engine.prefill;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class c {
    private final java.util.Map<com.bumptech.glide.load.engine.prefill.d, java.lang.Integer> a;
    private final java.util.List<com.bumptech.glide.load.engine.prefill.d> b;
    private int c;
    private int d;

    public c(java.util.Map<com.bumptech.glide.load.engine.prefill.d, java.lang.Integer> r3) {
            r2 = this;
            r2.<init>()
            r2.a = r3
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Set r1 = r3.keySet()
            r0.<init>(r1)
            r2.b = r0
            java.util.Collection r3 = r3.values()
            java.util.Iterator r3 = r3.iterator()
        L18:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r3.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r1 = r2.c
            int r0 = r0.intValue()
            int r1 = r1 + r0
            r2.c = r1
            goto L18
        L2e:
            return
    }

    public int a() {
            r1 = this;
            int r0 = r1.c
            return r0
    }

    public boolean b() {
            r1 = this;
            int r0 = r1.c
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public com.bumptech.glide.load.engine.prefill.d c() {
            r4 = this;
            java.util.List<com.bumptech.glide.load.engine.prefill.d> r0 = r4.b
            int r1 = r4.d
            java.lang.Object r0 = r0.get(r1)
            com.bumptech.glide.load.engine.prefill.d r0 = (com.bumptech.glide.load.engine.prefill.d) r0
            java.util.Map<com.bumptech.glide.load.engine.prefill.d, java.lang.Integer> r1 = r4.a
            java.lang.Object r1 = r1.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r2 = r1.intValue()
            r3 = 1
            if (r2 != r3) goto L26
            java.util.Map<com.bumptech.glide.load.engine.prefill.d, java.lang.Integer> r1 = r4.a
            r1.remove(r0)
            java.util.List<com.bumptech.glide.load.engine.prefill.d> r1 = r4.b
            int r2 = r4.d
            r1.remove(r2)
            goto L34
        L26:
            java.util.Map<com.bumptech.glide.load.engine.prefill.d, java.lang.Integer> r2 = r4.a
            int r1 = r1.intValue()
            int r1 = r1 - r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.put(r0, r1)
        L34:
            int r1 = r4.c
            int r1 = r1 - r3
            r4.c = r1
            java.util.List<com.bumptech.glide.load.engine.prefill.d> r1 = r4.b
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L43
            r1 = 0
            goto L4d
        L43:
            int r1 = r4.d
            int r1 = r1 + r3
            java.util.List<com.bumptech.glide.load.engine.prefill.d> r2 = r4.b
            int r2 = r2.size()
            int r1 = r1 % r2
        L4d:
            r4.d = r1
            return r0
    }
}
