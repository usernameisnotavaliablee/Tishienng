package com.bytedance.adsdk.lottie.j.j;

@android.annotation.TargetApi(19)
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class vl implements com.bytedance.adsdk.lottie.j.j.jy, com.bytedance.adsdk.lottie.j.j.oq {
    private final android.graphics.Path cw;
    private final android.graphics.Path j;

    /* renamed from: m, reason: collision with root package name */
    private final com.bytedance.adsdk.lottie.model.xt.g f1790m;

    /* renamed from: r, reason: collision with root package name */
    private final java.lang.String f1791r;
    private final java.util.List<com.bytedance.adsdk.lottie.j.j.jy> up;
    private final android.graphics.Path xt;

    /* renamed from: com.bytedance.adsdk.lottie.j.j.vl$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] j = null;

        static {
                com.bytedance.adsdk.lottie.model.xt.g$j[] r0 = com.bytedance.adsdk.lottie.model.xt.g.j.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.adsdk.lottie.j.j.vl.AnonymousClass1.j = r0
                com.bytedance.adsdk.lottie.model.xt.g$j r1 = com.bytedance.adsdk.lottie.model.xt.g.j.j     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.bytedance.adsdk.lottie.j.j.vl.AnonymousClass1.j     // Catch: java.lang.NoSuchFieldError -> L1d
                com.bytedance.adsdk.lottie.model.xt.g$j r1 = com.bytedance.adsdk.lottie.model.xt.g.j.xt     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.bytedance.adsdk.lottie.j.j.vl.AnonymousClass1.j     // Catch: java.lang.NoSuchFieldError -> L28
                com.bytedance.adsdk.lottie.model.xt.g$j r1 = com.bytedance.adsdk.lottie.model.xt.g.j.cw     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.bytedance.adsdk.lottie.j.j.vl.AnonymousClass1.j     // Catch: java.lang.NoSuchFieldError -> L33
                com.bytedance.adsdk.lottie.model.xt.g$j r1 = com.bytedance.adsdk.lottie.model.xt.g.j.f1864r     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.bytedance.adsdk.lottie.j.j.vl.AnonymousClass1.j     // Catch: java.lang.NoSuchFieldError -> L3e
                com.bytedance.adsdk.lottie.model.xt.g$j r1 = com.bytedance.adsdk.lottie.model.xt.g.j.up     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    public vl(com.bytedance.adsdk.lottie.model.xt.g r2) {
            r1 = this;
            r1.<init>()
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r1.j = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r1.xt = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r1.cw = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.up = r0
            java.lang.String r0 = r2.j()
            r1.f1791r = r0
            r1.f1790m = r2
            return
    }

    private void j() {
            r3 = this;
            r0 = 0
        L1:
            java.util.List<com.bytedance.adsdk.lottie.j.j.jy> r1 = r3.up
            int r1 = r1.size()
            if (r0 >= r1) goto L1d
            android.graphics.Path r1 = r3.cw
            java.util.List<com.bytedance.adsdk.lottie.j.j.jy> r2 = r3.up
            java.lang.Object r2 = r2.get(r0)
            com.bytedance.adsdk.lottie.j.j.jy r2 = (com.bytedance.adsdk.lottie.j.j.jy) r2
            android.graphics.Path r2 = r2.r()
            r1.addPath(r2)
            int r0 = r0 + 1
            goto L1
        L1d:
            return
    }

    @android.annotation.TargetApi(19)
    private void j(android.graphics.Path.Op r7) {
            r6 = this;
            android.graphics.Path r0 = r6.xt
            r0.reset()
            android.graphics.Path r0 = r6.j
            r0.reset()
            java.util.List<com.bytedance.adsdk.lottie.j.j.jy> r0 = r6.up
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L12:
            if (r0 <= 0) goto L53
            java.util.List<com.bytedance.adsdk.lottie.j.j.jy> r1 = r6.up
            java.lang.Object r1 = r1.get(r0)
            com.bytedance.adsdk.lottie.j.j.jy r1 = (com.bytedance.adsdk.lottie.j.j.jy) r1
            boolean r2 = r1 instanceof com.bytedance.adsdk.lottie.j.j.r
            if (r2 == 0) goto L47
            com.bytedance.adsdk.lottie.j.j.r r1 = (com.bytedance.adsdk.lottie.j.j.r) r1
            java.util.List r2 = r1.xt()
            int r3 = r2.size()
            int r3 = r3 + (-1)
        L2c:
            if (r3 < 0) goto L50
            java.lang.Object r4 = r2.get(r3)
            com.bytedance.adsdk.lottie.j.j.jy r4 = (com.bytedance.adsdk.lottie.j.j.jy) r4
            android.graphics.Path r4 = r4.r()
            android.graphics.Matrix r5 = r1.cw()
            r4.transform(r5)
            android.graphics.Path r5 = r6.xt
            r5.addPath(r4)
            int r3 = r3 + (-1)
            goto L2c
        L47:
            android.graphics.Path r2 = r6.xt
            android.graphics.Path r1 = r1.r()
            r2.addPath(r1)
        L50:
            int r0 = r0 + (-1)
            goto L12
        L53:
            java.util.List<com.bytedance.adsdk.lottie.j.j.jy> r0 = r6.up
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.bytedance.adsdk.lottie.j.j.jy r0 = (com.bytedance.adsdk.lottie.j.j.jy) r0
            boolean r2 = r0 instanceof com.bytedance.adsdk.lottie.j.j.r
            if (r2 == 0) goto L85
            com.bytedance.adsdk.lottie.j.j.r r0 = (com.bytedance.adsdk.lottie.j.j.r) r0
            java.util.List r2 = r0.xt()
        L66:
            int r3 = r2.size()
            if (r1 >= r3) goto L8e
            java.lang.Object r3 = r2.get(r1)
            com.bytedance.adsdk.lottie.j.j.jy r3 = (com.bytedance.adsdk.lottie.j.j.jy) r3
            android.graphics.Path r3 = r3.r()
            android.graphics.Matrix r4 = r0.cw()
            r3.transform(r4)
            android.graphics.Path r4 = r6.j
            r4.addPath(r3)
            int r1 = r1 + 1
            goto L66
        L85:
            android.graphics.Path r1 = r6.j
            android.graphics.Path r0 = r0.r()
            r1.set(r0)
        L8e:
            android.graphics.Path r0 = r6.cw
            android.graphics.Path r1 = r6.j
            android.graphics.Path r2 = r6.xt
            r0.op(r1, r2, r7)
            return
    }

    @Override // com.bytedance.adsdk.lottie.j.j.cw
    public void j(java.util.List<com.bytedance.adsdk.lottie.j.j.cw> r3, java.util.List<com.bytedance.adsdk.lottie.j.j.cw> r4) {
            r2 = this;
            r0 = 0
        L1:
            java.util.List<com.bytedance.adsdk.lottie.j.j.jy> r1 = r2.up
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            java.util.List<com.bytedance.adsdk.lottie.j.j.jy> r1 = r2.up
            java.lang.Object r1 = r1.get(r0)
            com.bytedance.adsdk.lottie.j.j.jy r1 = (com.bytedance.adsdk.lottie.j.j.jy) r1
            r1.j(r3, r4)
            int r0 = r0 + 1
            goto L1
        L17:
            return
    }

    @Override // com.bytedance.adsdk.lottie.j.j.oq
    public void j(java.util.ListIterator<com.bytedance.adsdk.lottie.j.j.cw> r3) {
            r2 = this;
        L0:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto Lc
            java.lang.Object r0 = r3.previous()
            if (r0 != r2) goto L0
        Lc:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L27
            java.lang.Object r0 = r3.previous()
            com.bytedance.adsdk.lottie.j.j.cw r0 = (com.bytedance.adsdk.lottie.j.j.cw) r0
            boolean r1 = r0 instanceof com.bytedance.adsdk.lottie.j.j.jy
            if (r1 == 0) goto Lc
            java.util.List<com.bytedance.adsdk.lottie.j.j.jy> r1 = r2.up
            com.bytedance.adsdk.lottie.j.j.jy r0 = (com.bytedance.adsdk.lottie.j.j.jy) r0
            r1.add(r0)
            r3.remove()
            goto Lc
        L27:
            return
    }

    @Override // com.bytedance.adsdk.lottie.j.j.jy
    public android.graphics.Path r() {
            r2 = this;
            android.graphics.Path r0 = r2.cw
            r0.reset()
            com.bytedance.adsdk.lottie.model.xt.g r0 = r2.f1790m
            boolean r0 = r0.cw()
            if (r0 == 0) goto L10
            android.graphics.Path r0 = r2.cw
            return r0
        L10:
            int[] r0 = com.bytedance.adsdk.lottie.j.j.vl.AnonymousClass1.j
            com.bytedance.adsdk.lottie.model.xt.g r1 = r2.f1790m
            com.bytedance.adsdk.lottie.model.xt.g$j r1 = r1.xt()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L46
            r1 = 2
            if (r0 == r1) goto L40
            r1 = 3
            if (r0 == r1) goto L3a
            r1 = 4
            if (r0 == r1) goto L34
            r1 = 5
            if (r0 == r1) goto L2e
            goto L49
        L2e:
            android.graphics.Path$Op r0 = android.graphics.Path.Op.XOR
            r2.j(r0)
            goto L49
        L34:
            android.graphics.Path$Op r0 = android.graphics.Path.Op.INTERSECT
            r2.j(r0)
            goto L49
        L3a:
            android.graphics.Path$Op r0 = android.graphics.Path.Op.REVERSE_DIFFERENCE
            r2.j(r0)
            goto L49
        L40:
            android.graphics.Path$Op r0 = android.graphics.Path.Op.UNION
            r2.j(r0)
            goto L49
        L46:
            r2.j()
        L49:
            android.graphics.Path r0 = r2.cw
            return r0
    }
}
