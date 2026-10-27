package com.bytedance.msdk.core.tl;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class oq {
    private static final java.lang.String j = null;
    private com.bytedance.msdk.up.j.cw<com.bytedance.msdk.core.tl.g> cw;
    private java.util.Map<java.lang.String, com.bytedance.msdk.core.tl.g> xt;

    /* renamed from: com.bytedance.msdk.core.tl.oq$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private static class j {
        private static com.bytedance.msdk.core.tl.oq j;

        static {
                com.bytedance.msdk.core.tl.oq r0 = new com.bytedance.msdk.core.tl.oq
                r1 = 0
                r0.<init>(r1)
                com.bytedance.msdk.core.tl.oq.j.j = r0
                return
        }

        public j() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.bytedance.msdk.core.tl.oq j() {
                com.bytedance.msdk.core.tl.oq r0 = com.bytedance.msdk.core.tl.oq.j.j
                return r0
        }
    }

    static {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TTMediationSDK_"
            r0.<init>(r1)
            java.lang.Class<com.bytedance.msdk.core.tl.oq> r1 = com.bytedance.msdk.core.tl.oq.class
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.core.tl.oq.j = r0
            return
    }

    private oq() {
            r2 = this;
            r2.<init>()
            com.bytedance.msdk.up.j.r r0 = new com.bytedance.msdk.up.j.r
            android.content.Context r1 = com.bytedance.msdk.core.xt.getContext()
            r0.<init>(r1)
            r2.cw = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r2.xt = r0
            return
    }

    /* synthetic */ oq(com.bytedance.msdk.core.tl.oq.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.bytedance.msdk.core.tl.oq j() {
            com.bytedance.msdk.core.tl.oq r0 = com.bytedance.msdk.core.tl.oq.j.j()
            return r0
    }

    public void j(com.bytedance.msdk.core.tl.g r3) {
            r2 = this;
            com.bytedance.msdk.up.j.cw<com.bytedance.msdk.core.tl.g> r0 = r2.cw
            if (r0 == 0) goto L1e
            java.lang.String r0 = r3.oq()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1e
            java.util.Map<java.lang.String, com.bytedance.msdk.core.tl.g> r0 = r2.xt
            if (r0 == 0) goto L19
            java.lang.String r1 = r3.r()
            r0.put(r1, r3)
        L19:
            com.bytedance.msdk.up.j.cw<com.bytedance.msdk.core.tl.g> r0 = r2.cw
            r0.xt(r3)
        L1e:
            return
    }

    public void j(java.lang.String r2) {
            r1 = this;
            com.bytedance.msdk.up.j.cw<com.bytedance.msdk.core.tl.g> r0 = r1.cw
            if (r0 == 0) goto L10
            java.util.Map<java.lang.String, com.bytedance.msdk.core.tl.g> r0 = r1.xt
            if (r0 == 0) goto Lb
            r0.remove(r2)
        Lb:
            com.bytedance.msdk.up.j.cw<com.bytedance.msdk.core.tl.g> r0 = r1.cw
            r0.delete(r2)
        L10:
            return
    }

    public void j(java.lang.String r2, long r3) {
            r1 = this;
            com.bytedance.msdk.up.j.cw<com.bytedance.msdk.core.tl.g> r0 = r1.cw
            if (r0 == 0) goto L1a
            java.util.Map<java.lang.String, com.bytedance.msdk.core.tl.g> r0 = r1.xt
            if (r0 == 0) goto Lf
            java.lang.Object r0 = r0.get(r2)
            com.bytedance.msdk.core.tl.g r0 = (com.bytedance.msdk.core.tl.g) r0
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 == 0) goto L15
            r0.j(r3)
        L15:
            com.bytedance.msdk.up.j.cw<com.bytedance.msdk.core.tl.g> r0 = r1.cw
            r0.j(r2, r3)
        L1a:
            return
    }

    public void j(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            com.bytedance.msdk.up.j.cw<com.bytedance.msdk.core.tl.g> r0 = r3.cw
            if (r0 == 0) goto L24
            java.util.Map<java.lang.String, com.bytedance.msdk.core.tl.g> r0 = r3.xt
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
            com.bytedance.msdk.up.j.cw<com.bytedance.msdk.core.tl.g> r0 = r3.cw
            r0.delete(r4, r5)
        L24:
            return
    }

    public void j(java.lang.String r4, java.lang.String r5, long r6) {
            r3 = this;
            com.bytedance.msdk.up.j.cw<com.bytedance.msdk.core.tl.g> r0 = r3.cw
            if (r0 == 0) goto L2e
            java.util.Map<java.lang.String, com.bytedance.msdk.core.tl.g> r0 = r3.xt
            if (r0 == 0) goto L23
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r2 = "_"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.Object r0 = r0.get(r1)
            com.bytedance.msdk.core.tl.g r0 = (com.bytedance.msdk.core.tl.g) r0
            goto L24
        L23:
            r0 = 0
        L24:
            if (r0 == 0) goto L29
            r0.j(r6)
        L29:
            com.bytedance.msdk.up.j.cw<com.bytedance.msdk.core.tl.g> r0 = r3.cw
            r0.j(r4, r5, r6)
        L2e:
            return
    }

    public com.bytedance.msdk.core.tl.g xt(java.lang.String r3) {
            r2 = this;
            com.bytedance.msdk.up.j.cw<com.bytedance.msdk.core.tl.g> r0 = r2.cw
            r1 = 0
            if (r0 == 0) goto L27
            java.util.Map<java.lang.String, com.bytedance.msdk.core.tl.g> r0 = r2.xt
            if (r0 == 0) goto L10
            java.lang.Object r0 = r0.get(r3)
            r1 = r0
            com.bytedance.msdk.core.tl.g r1 = (com.bytedance.msdk.core.tl.g) r1
        L10:
            if (r1 == 0) goto L13
            return r1
        L13:
            com.bytedance.msdk.up.j.cw<com.bytedance.msdk.core.tl.g> r0 = r2.cw
            java.lang.Object r3 = r0.query(r3)
            com.bytedance.msdk.core.tl.g r3 = (com.bytedance.msdk.core.tl.g) r3
            if (r3 == 0) goto L26
            java.util.Map<java.lang.String, com.bytedance.msdk.core.tl.g> r0 = r2.xt
            java.lang.String r1 = r3.xt()
            r0.put(r1, r3)
        L26:
            return r3
        L27:
            return r1
    }

    public com.bytedance.msdk.core.tl.g xt(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            com.bytedance.msdk.up.j.cw<com.bytedance.msdk.core.tl.g> r0 = r3.cw
            r1 = 0
            if (r0 == 0) goto L3b
            java.util.Map<java.lang.String, com.bytedance.msdk.core.tl.g> r0 = r3.xt
            if (r0 == 0) goto L24
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r2 = "_"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.Object r0 = r0.get(r1)
            r1 = r0
            com.bytedance.msdk.core.tl.g r1 = (com.bytedance.msdk.core.tl.g) r1
        L24:
            if (r1 == 0) goto L27
            return r1
        L27:
            com.bytedance.msdk.up.j.cw<com.bytedance.msdk.core.tl.g> r0 = r3.cw
            java.lang.Object r4 = r0.query(r4, r5)
            com.bytedance.msdk.core.tl.g r4 = (com.bytedance.msdk.core.tl.g) r4
            if (r4 == 0) goto L3a
            java.util.Map<java.lang.String, com.bytedance.msdk.core.tl.g> r5 = r3.xt
            java.lang.String r0 = r4.r()
            r5.put(r0, r4)
        L3a:
            return r4
        L3b:
            return r1
    }
}
