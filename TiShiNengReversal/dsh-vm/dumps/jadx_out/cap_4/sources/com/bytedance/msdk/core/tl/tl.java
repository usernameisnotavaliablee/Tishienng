package com.bytedance.msdk.core.tl;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class tl {
    private static final java.lang.String j = null;
    private com.bytedance.msdk.up.j.j<com.bytedance.msdk.core.tl.ae> cw;
    private java.util.Map<java.lang.String, com.bytedance.msdk.core.tl.ae> xt;

    /* renamed from: com.bytedance.msdk.core.tl.tl$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private static class j {
        private static com.bytedance.msdk.core.tl.tl j;

        static {
                com.bytedance.msdk.core.tl.tl r0 = new com.bytedance.msdk.core.tl.tl
                r1 = 0
                r0.<init>(r1)
                com.bytedance.msdk.core.tl.tl.j.j = r0
                return
        }

        public j() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.bytedance.msdk.core.tl.tl j() {
                com.bytedance.msdk.core.tl.tl r0 = com.bytedance.msdk.core.tl.tl.j.j
                return r0
        }
    }

    static {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TTMediationSDK_"
            r0.<init>(r1)
            java.lang.Class<com.bytedance.msdk.core.tl.tl> r1 = com.bytedance.msdk.core.tl.tl.class
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.core.tl.tl.j = r0
            return
    }

    private tl() {
            r2 = this;
            r2.<init>()
            com.bytedance.msdk.up.j.xt r0 = new com.bytedance.msdk.up.j.xt
            android.content.Context r1 = com.bytedance.msdk.core.xt.getContext()
            r0.<init>(r1)
            r2.cw = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r2.xt = r0
            return
    }

    /* synthetic */ tl(com.bytedance.msdk.core.tl.tl.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.bytedance.msdk.core.tl.tl j() {
            com.bytedance.msdk.core.tl.tl r0 = com.bytedance.msdk.core.tl.tl.j.j()
            return r0
    }

    public void j(com.bytedance.msdk.core.tl.ae r5) {
            r4 = this;
            boolean r0 = r5.j()
            if (r0 == 0) goto L13
            java.lang.String r0 = r5.xt()
            java.lang.String r1 = r5.cw()
            com.bytedance.msdk.core.tl.ae r0 = r4.xt(r0, r1)
            goto L1b
        L13:
            java.lang.String r0 = r5.xt()
            com.bytedance.msdk.core.tl.ae r0 = r4.xt(r0)
        L1b:
            if (r0 != 0) goto L32
            com.bytedance.msdk.up.j.j<com.bytedance.msdk.core.tl.ae> r0 = r4.cw
            if (r0 == 0) goto L31
            java.util.Map<java.lang.String, com.bytedance.msdk.core.tl.ae> r0 = r4.xt
            if (r0 == 0) goto L2c
            java.lang.String r1 = r5.r()
            r0.put(r1, r5)
        L2c:
            com.bytedance.msdk.up.j.j<com.bytedance.msdk.core.tl.ae> r0 = r4.cw
            r0.xt(r5)
        L31:
            return
        L32:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.List r0 = r0.qv()
            java.util.Iterator r0 = r0.iterator()
        L3f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L53
            java.lang.Object r2 = r0.next()
            com.bytedance.msdk.core.tl.up r2 = (com.bytedance.msdk.core.tl.up) r2
            java.lang.String r3 = r2.cw()
            r1.put(r3, r2)
            goto L3f
        L53:
            java.util.List r0 = r5.qv()
            java.util.Iterator r0 = r0.iterator()
        L5b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L81
            java.lang.Object r2 = r0.next()
            com.bytedance.msdk.core.tl.up r2 = (com.bytedance.msdk.core.tl.up) r2
            java.lang.String r3 = r2.cw()
            boolean r3 = r1.containsKey(r3)
            if (r3 == 0) goto L5b
            java.lang.String r3 = r2.cw()
            java.lang.Object r3 = r1.get(r3)
            com.bytedance.msdk.core.tl.up r3 = (com.bytedance.msdk.core.tl.up) r3
            if (r3 == 0) goto L5b
            r2.j(r3)
            goto L5b
        L81:
            java.util.Map<java.lang.String, com.bytedance.msdk.core.tl.ae> r0 = r4.xt
            if (r0 == 0) goto L8c
            java.lang.String r1 = r5.r()
            r0.put(r1, r5)
        L8c:
            r4.xt(r5)
            return
    }

    public void j(com.bytedance.msdk.core.tl.ae r2, java.lang.String r3, int r4) {
            r1 = this;
            com.bytedance.msdk.up.j.j<com.bytedance.msdk.core.tl.ae> r0 = r1.cw
            if (r0 == 0) goto L17
            r2.j(r3, r4)
            java.util.Map<java.lang.String, com.bytedance.msdk.core.tl.ae> r3 = r1.xt
            if (r3 == 0) goto L12
            java.lang.String r4 = r2.r()
            r3.put(r4, r2)
        L12:
            com.bytedance.msdk.up.j.j<com.bytedance.msdk.core.tl.ae> r3 = r1.cw
            r3.j(r2)
        L17:
            return
    }

    public void j(com.bytedance.msdk.core.tl.ae r2, java.lang.String r3, long r4) {
            r1 = this;
            com.bytedance.msdk.up.j.j<com.bytedance.msdk.core.tl.ae> r0 = r1.cw
            if (r0 == 0) goto L17
            r2.j(r3, r4)
            java.util.Map<java.lang.String, com.bytedance.msdk.core.tl.ae> r3 = r1.xt
            if (r3 == 0) goto L12
            java.lang.String r4 = r2.r()
            r3.put(r4, r2)
        L12:
            com.bytedance.msdk.up.j.j<com.bytedance.msdk.core.tl.ae> r3 = r1.cw
            r3.j(r2)
        L17:
            return
    }

    public void j(java.lang.String r2) {
            r1 = this;
            com.bytedance.msdk.up.j.j<com.bytedance.msdk.core.tl.ae> r0 = r1.cw
            if (r0 == 0) goto L10
            java.util.Map<java.lang.String, com.bytedance.msdk.core.tl.ae> r0 = r1.xt
            if (r0 == 0) goto Lb
            r0.remove(r2)
        Lb:
            com.bytedance.msdk.up.j.j<com.bytedance.msdk.core.tl.ae> r0 = r1.cw
            r0.delete(r2)
        L10:
            return
    }

    public void j(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            com.bytedance.msdk.up.j.j<com.bytedance.msdk.core.tl.ae> r0 = r3.cw
            if (r0 == 0) goto L24
            java.util.Map<java.lang.String, com.bytedance.msdk.core.tl.ae> r0 = r3.xt
            if (r0 == 0) goto L1f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r2 = "_"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.remove(r1)
        L1f:
            com.bytedance.msdk.up.j.j<com.bytedance.msdk.core.tl.ae> r0 = r3.cw
            r0.delete(r4, r5)
        L24:
            return
    }

    public com.bytedance.msdk.core.tl.ae xt(java.lang.String r3) {
            r2 = this;
            com.bytedance.msdk.up.j.j<com.bytedance.msdk.core.tl.ae> r0 = r2.cw
            r1 = 0
            if (r0 == 0) goto L2a
            java.util.Map<java.lang.String, com.bytedance.msdk.core.tl.ae> r0 = r2.xt
            if (r0 == 0) goto L10
            java.lang.Object r0 = r0.get(r3)
            com.bytedance.msdk.core.tl.ae r0 = (com.bytedance.msdk.core.tl.ae) r0
            goto L11
        L10:
            r0 = r1
        L11:
            if (r0 == 0) goto L14
            return r0
        L14:
            com.bytedance.msdk.up.j.j<com.bytedance.msdk.core.tl.ae> r0 = r2.cw
            java.lang.Object r3 = r0.query(r3)
            com.bytedance.msdk.core.tl.ae r3 = (com.bytedance.msdk.core.tl.ae) r3
            if (r3 == 0) goto L2a
            java.util.Map<java.lang.String, com.bytedance.msdk.core.tl.ae> r0 = r2.xt
            if (r0 == 0) goto L29
            java.lang.String r1 = r3.r()
            r0.put(r1, r3)
        L29:
            return r3
        L2a:
            return r1
    }

    public com.bytedance.msdk.core.tl.ae xt(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            com.bytedance.msdk.up.j.j<com.bytedance.msdk.core.tl.ae> r0 = r4.cw
            r1 = 0
            if (r0 == 0) goto L3e
            java.util.Map<java.lang.String, com.bytedance.msdk.core.tl.ae> r0 = r4.xt
            if (r0 == 0) goto L24
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            java.lang.String r3 = "_"
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            java.lang.Object r0 = r0.get(r2)
            com.bytedance.msdk.core.tl.ae r0 = (com.bytedance.msdk.core.tl.ae) r0
            goto L25
        L24:
            r0 = r1
        L25:
            if (r0 == 0) goto L28
            return r0
        L28:
            com.bytedance.msdk.up.j.j<com.bytedance.msdk.core.tl.ae> r0 = r4.cw
            java.lang.Object r5 = r0.query(r5, r6)
            com.bytedance.msdk.core.tl.ae r5 = (com.bytedance.msdk.core.tl.ae) r5
            if (r5 == 0) goto L3e
            java.util.Map<java.lang.String, com.bytedance.msdk.core.tl.ae> r6 = r4.xt
            if (r6 == 0) goto L3d
            java.lang.String r0 = r5.r()
            r6.put(r0, r5)
        L3d:
            return r5
        L3e:
            return r1
    }

    public void xt(com.bytedance.msdk.core.tl.ae r3) {
            r2 = this;
            com.bytedance.msdk.up.j.j<com.bytedance.msdk.core.tl.ae> r0 = r2.cw
            if (r0 == 0) goto L14
            java.util.Map<java.lang.String, com.bytedance.msdk.core.tl.ae> r0 = r2.xt
            if (r0 == 0) goto Lf
            java.lang.String r1 = r3.r()
            r0.put(r1, r3)
        Lf:
            com.bytedance.msdk.up.j.j<com.bytedance.msdk.core.tl.ae> r0 = r2.cw
            r0.j(r3)
        L14:
            return
    }
}
