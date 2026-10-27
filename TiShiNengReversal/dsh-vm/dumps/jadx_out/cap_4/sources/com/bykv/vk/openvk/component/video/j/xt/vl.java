package com.bykv.vk.openvk.component.video.j.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class vl {
    private static final java.util.Set<java.lang.String> j = null;
    private static final java.util.Set<java.lang.String> xt = null;
    private final int ae;
    private final java.util.ArrayList<com.bykv.vk.openvk.component.video.j.xt.vl.j> cw;

    /* renamed from: m, reason: collision with root package name */
    private int f1729m;

    /* renamed from: r, reason: collision with root package name */
    private final int f1730r;
    private int up;

    public class j {
        final /* synthetic */ com.bykv.vk.openvk.component.video.j.xt.vl cw;
        final java.lang.String j;
        int xt;

        j(com.bykv.vk.openvk.component.video.j.xt.vl r1, java.lang.String r2) {
                r0 = this;
                r0.cw = r1
                r0.<init>()
                r0.j = r2
                return
        }

        void j() {
                r2 = this;
                java.util.Set r0 = com.bykv.vk.openvk.component.video.j.xt.vl.cw()
                java.lang.String r1 = r2.j
                r0.add(r1)
                return
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = r1.j
                return r0
        }

        void xt() {
                r2 = this;
                java.util.Set r0 = com.bykv.vk.openvk.component.video.j.xt.vl.r()
                java.lang.String r1 = r2.j
                r0.add(r1)
                return
        }
    }

    static {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            com.bykv.vk.openvk.component.video.j.xt.vl.j = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            com.bykv.vk.openvk.component.video.j.xt.vl.xt = r0
            return
    }

    vl(java.lang.String r4) {
            r3 = this;
            r3.<init>()
            r0 = -1
            r3.up = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 1
            r0.<init>(r1)
            r3.cw = r0
            com.bykv.vk.openvk.component.video.j.xt.vl$j r2 = new com.bykv.vk.openvk.component.video.j.xt.vl$j
            r2.<init>(r3, r4)
            r0.add(r2)
            r3.f1730r = r1
            r3.ae = r1
            return
    }

    vl(java.util.List<java.lang.String> r6) {
            r5 = this;
            r5.<init>()
            r0 = -1
            r5.up = r0
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L85
            int r0 = r6.size()
            r5.f1730r = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r5.cw = r1
            java.util.Iterator r6 = r6.iterator()
            r0 = 0
            r1 = r0
        L1f:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L5c
            java.lang.Object r2 = r6.next()
            java.lang.String r2 = (java.lang.String) r2
            com.bykv.vk.openvk.component.video.j.xt.vl$j r3 = new com.bykv.vk.openvk.component.video.j.xt.vl$j
            r3.<init>(r5, r2)
            java.util.Set<java.lang.String> r4 = com.bykv.vk.openvk.component.video.j.xt.vl.j
            boolean r4 = r4.contains(r2)
            if (r4 == 0) goto L43
            if (r1 != 0) goto L3f
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L3f:
            r1.add(r3)
            goto L1f
        L43:
            java.util.Set<java.lang.String> r4 = com.bykv.vk.openvk.component.video.j.xt.vl.xt
            boolean r2 = r4.contains(r2)
            if (r2 == 0) goto L56
            if (r0 != 0) goto L52
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L52:
            r0.add(r3)
            goto L1f
        L56:
            java.util.ArrayList<com.bykv.vk.openvk.component.video.j.xt.vl$j> r2 = r5.cw
            r2.add(r3)
            goto L1f
        L5c:
            if (r0 == 0) goto L63
            java.util.ArrayList<com.bykv.vk.openvk.component.video.j.xt.vl$j> r6 = r5.cw
            r6.addAll(r0)
        L63:
            if (r1 == 0) goto L6a
            java.util.ArrayList<com.bykv.vk.openvk.component.video.j.xt.vl$j> r6 = r5.cw
            r6.addAll(r1)
        L6a:
            java.lang.Integer r6 = com.bykv.vk.openvk.component.video.j.xt.up.g
            if (r6 == 0) goto L7a
            int r0 = r6.intValue()
            if (r0 > 0) goto L75
            goto L7a
        L75:
            int r6 = r6.intValue()
            goto L82
        L7a:
            int r6 = r5.f1730r
            r0 = 2
            if (r6 < r0) goto L81
            r6 = 1
            goto L82
        L81:
            r6 = 2
        L82:
            r5.ae = r6
            return
        L85:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "urls can't be empty"
            r6.<init>(r0)
            throw r6
    }

    static /* synthetic */ java.util.Set cw() {
            java.util.Set<java.lang.String> r0 = com.bykv.vk.openvk.component.video.j.xt.vl.j
            return r0
    }

    static /* synthetic */ java.util.Set r() {
            java.util.Set<java.lang.String> r0 = com.bykv.vk.openvk.component.video.j.xt.vl.xt
            return r0
    }

    boolean j() {
            r2 = this;
            int r0 = r2.f1729m
            int r1 = r2.ae
            if (r0 >= r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    com.bykv.vk.openvk.component.video.j.xt.vl.j xt() {
            r3 = this;
            boolean r0 = r3.j()
            if (r0 == 0) goto L30
            int r0 = r3.up
            int r0 = r0 + 1
            int r1 = r3.f1730r
            int r1 = r1 + (-1)
            if (r0 < r1) goto L1a
            r1 = -1
            r3.up = r1
            int r1 = r3.f1729m
            int r1 = r1 + 1
            r3.f1729m = r1
            goto L1c
        L1a:
            r3.up = r0
        L1c:
            java.util.ArrayList<com.bykv.vk.openvk.component.video.j.xt.vl$j> r1 = r3.cw
            java.lang.Object r0 = r1.get(r0)
            com.bykv.vk.openvk.component.video.j.xt.vl$j r0 = (com.bykv.vk.openvk.component.video.j.xt.vl.j) r0
            int r1 = r3.f1729m
            int r2 = r3.f1730r
            int r1 = r1 * r2
            int r2 = r3.up
            int r1 = r1 + r2
            r0.xt = r1
            return r0
        L30:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }
}
