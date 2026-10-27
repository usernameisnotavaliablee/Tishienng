package com.bytedance.adsdk.ugeno.yoga.widget;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class YogaLayout extends android.view.ViewGroup implements com.bytedance.adsdk.ugeno.j.ae, com.bytedance.adsdk.ugeno.xt.xt {
    private com.bytedance.adsdk.ugeno.cw cw;
    private final java.util.Map<android.view.View, com.bytedance.adsdk.ugeno.yoga.oq> j;

    /* renamed from: r, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.j.tl f2055r;
    private final com.bytedance.adsdk.ugeno.yoga.oq xt;

    public static class j extends android.view.ViewGroup.LayoutParams {
        private float ae;
        private float av;
        private float az;
        private float cw;
        private float g;
        private float i;
        android.util.SparseArray<java.lang.Float> j;
        private float jy;

        /* renamed from: m, reason: collision with root package name */
        private float f2056m;
        private float mi;
        private float oq;
        private float qv;

        /* renamed from: r, reason: collision with root package name */
        private float f2057r;
        private float tl;
        private float up;
        private float vl;

        /* renamed from: w, reason: collision with root package name */
        private float f2058w;
        private float ws;
        android.util.SparseArray<java.lang.String> xt;

        public j(int r5, int r6) {
                r4 = this;
                r4.<init>(r5, r6)
                android.util.SparseArray r0 = new android.util.SparseArray
                r0.<init>()
                r4.j = r0
                android.util.SparseArray r0 = new android.util.SparseArray
                r0.<init>()
                r4.xt = r0
                r0 = -1
                r1 = -2
                if (r5 == r1) goto L19
                if (r5 == r0) goto L19
                if (r5 < 0) goto L25
            L19:
                android.util.SparseArray<java.lang.Float> r2 = r4.j
                float r5 = (float) r5
                java.lang.Float r5 = java.lang.Float.valueOf(r5)
                r3 = 15
                r2.put(r3, r5)
            L25:
                if (r6 == r1) goto L2d
                if (r6 == r0) goto L2d
                if (r6 < 0) goto L2c
                goto L2d
            L2c:
                return
            L2d:
                android.util.SparseArray<java.lang.Float> r5 = r4.j
                float r6 = (float) r6
                java.lang.Float r6 = java.lang.Float.valueOf(r6)
                r0 = 16
                r5.put(r0, r6)
                return
        }

        public j(android.view.ViewGroup.LayoutParams r4) {
                r3 = this;
                r3.<init>(r4)
                boolean r0 = r4 instanceof com.bytedance.adsdk.ugeno.yoga.widget.YogaLayout.j
                if (r0 == 0) goto L1a
                com.bytedance.adsdk.ugeno.yoga.widget.YogaLayout$j r4 = (com.bytedance.adsdk.ugeno.yoga.widget.YogaLayout.j) r4
                android.util.SparseArray<java.lang.Float> r0 = r4.j
                android.util.SparseArray r0 = r0.clone()
                r3.j = r0
                android.util.SparseArray<java.lang.String> r4 = r4.xt
                android.util.SparseArray r4 = r4.clone()
                r3.xt = r4
                return
            L1a:
                android.util.SparseArray r0 = new android.util.SparseArray
                r0.<init>()
                r3.j = r0
                android.util.SparseArray r0 = new android.util.SparseArray
                r0.<init>()
                r3.xt = r0
                int r0 = r4.width
                if (r0 < 0) goto L3a
                android.util.SparseArray<java.lang.Float> r0 = r3.j
                int r1 = r3.width
                float r1 = (float) r1
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                r2 = 15
                r0.put(r2, r1)
            L3a:
                int r4 = r4.height
                if (r4 < 0) goto L4c
                android.util.SparseArray<java.lang.Float> r4 = r3.j
                int r0 = r3.height
                float r0 = (float) r0
                java.lang.Float r0 = java.lang.Float.valueOf(r0)
                r1 = 16
                r4.put(r1, r0)
            L4c:
                return
        }

        public void ae(float r3) {
                r2 = this;
                r2.jy = r3
                android.util.SparseArray<java.lang.Float> r0 = r2.j
                r1 = 10
                java.lang.Float r3 = java.lang.Float.valueOf(r3)
                r0.put(r1, r3)
                return
        }

        public void av(float r3) {
                r2 = this;
                r2.f2058w = r3
                android.util.SparseArray<java.lang.Float> r0 = r2.j
                r1 = 27
                java.lang.Float r3 = java.lang.Float.valueOf(r3)
                r0.put(r1, r3)
                return
        }

        public void az(float r3) {
                r2 = this;
                r2.i = r3
                android.util.SparseArray<java.lang.Float> r0 = r2.j
                r1 = 25
                java.lang.Float r3 = java.lang.Float.valueOf(r3)
                r0.put(r1, r3)
                return
        }

        public void cw(float r3) {
                r2 = this;
                r2.g = r3
                android.util.SparseArray<java.lang.Float> r0 = r2.j
                r1 = 7
                java.lang.Float r3 = java.lang.Float.valueOf(r3)
                r0.put(r1, r3)
                return
        }

        public void g(float r3) {
                r2 = this;
                r2.az = r3
                android.util.SparseArray<java.lang.Float> r0 = r2.j
                r1 = 12
                java.lang.Float r3 = java.lang.Float.valueOf(r3)
                r0.put(r1, r3)
                return
        }

        public void i(float r3) {
                r2 = this;
                r2.mi = r3
                android.util.SparseArray<java.lang.Float> r0 = r2.j
                r1 = 28
                java.lang.Float r3 = java.lang.Float.valueOf(r3)
                r0.put(r1, r3)
                return
        }

        public void j(float r3) {
                r2 = this;
                r2.ae = r3
                android.util.SparseArray<java.lang.Float> r0 = r2.j
                r1 = 5
                java.lang.Float r3 = java.lang.Float.valueOf(r3)
                r0.put(r1, r3)
                return
        }

        public void jy(float r3) {
                r2 = this;
                r2.up = r3
                android.util.SparseArray<java.lang.Float> r0 = r2.j
                r1 = 19
                java.lang.Float r3 = java.lang.Float.valueOf(r3)
                r0.put(r1, r3)
                return
        }

        public void m(float r3) {
                r2 = this;
                r2.vl = r3
                android.util.SparseArray<java.lang.Float> r0 = r2.j
                r1 = 14
                java.lang.Float r3 = java.lang.Float.valueOf(r3)
                r0.put(r1, r3)
                return
        }

        public void oq(float r3) {
                r2 = this;
                r2.av = r3
                android.util.SparseArray<java.lang.Float> r0 = r2.j
                r1 = 13
                java.lang.Float r3 = java.lang.Float.valueOf(r3)
                r0.put(r1, r3)
                return
        }

        public void qv(float r3) {
                r2 = this;
                r2.cw = r3
                android.util.SparseArray<java.lang.Float> r0 = r2.j
                r1 = 17
                java.lang.Float r3 = java.lang.Float.valueOf(r3)
                r0.put(r1, r3)
                return
        }

        public void r(float r3) {
                r2 = this;
                r2.oq = r3
                android.util.SparseArray<java.lang.Float> r0 = r2.j
                r1 = 8
                java.lang.Float r3 = java.lang.Float.valueOf(r3)
                r0.put(r1, r3)
                return
        }

        public void tl(float r3) {
                r2 = this;
                r2.ws = r3
                android.util.SparseArray<java.lang.Float> r0 = r2.j
                r1 = 11
                java.lang.Float r3 = java.lang.Float.valueOf(r3)
                r0.put(r1, r3)
                return
        }

        public void up(float r3) {
                r2 = this;
                r2.qv = r3
                android.util.SparseArray<java.lang.Float> r0 = r2.j
                r1 = 9
                java.lang.Float r3 = java.lang.Float.valueOf(r3)
                r0.put(r1, r3)
                return
        }

        public void vl(float r3) {
                r2 = this;
                r2.f2057r = r3
                android.util.SparseArray<java.lang.Float> r0 = r2.j
                r1 = 18
                java.lang.Float r3 = java.lang.Float.valueOf(r3)
                r0.put(r1, r3)
                return
        }

        public void ws(float r3) {
                r2 = this;
                r2.f2056m = r3
                android.util.SparseArray<java.lang.Float> r0 = r2.j
                r1 = 20
                java.lang.Float r3 = java.lang.Float.valueOf(r3)
                r0.put(r1, r3)
                return
        }

        public void xt(float r3) {
                r2 = this;
                r2.tl = r3
                android.util.SparseArray<java.lang.Float> r0 = r2.j
                r1 = 6
                java.lang.Float r3 = java.lang.Float.valueOf(r3)
                r0.put(r1, r3)
                return
        }
    }

    public static class xt implements com.bytedance.adsdk.ugeno.yoga.ae {
        public xt() {
                r0 = this;
                r0.<init>()
                return
        }

        private int j(com.bytedance.adsdk.ugeno.yoga.tl r2) {
                r1 = this;
                com.bytedance.adsdk.ugeno.yoga.tl r0 = com.bytedance.adsdk.ugeno.yoga.tl.cw
                if (r2 != r0) goto L7
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                return r2
            L7:
                com.bytedance.adsdk.ugeno.yoga.tl r0 = com.bytedance.adsdk.ugeno.yoga.tl.xt
                if (r2 != r0) goto Le
                r2 = 1073741824(0x40000000, float:2.0)
                return r2
            Le:
                r2 = 0
                return r2
        }

        @Override // com.bytedance.adsdk.ugeno.yoga.ae
        public long j(com.bytedance.adsdk.ugeno.yoga.oq r2, float r3, com.bytedance.adsdk.ugeno.yoga.tl r4, float r5, com.bytedance.adsdk.ugeno.yoga.tl r6) {
                r1 = this;
                java.lang.Object r2 = r2.oq()
                android.view.View r2 = (android.view.View) r2
                if (r2 == 0) goto L2f
                boolean r0 = r2 instanceof com.bytedance.adsdk.ugeno.yoga.widget.YogaLayout
                if (r0 == 0) goto Ld
                goto L2f
            Ld:
                int r3 = (int) r3
                int r4 = r1.j(r4)
                int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r4)
                int r4 = (int) r5
                int r5 = r1.j(r6)
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r5)
                r2.measure(r3, r4)
                int r3 = r2.getMeasuredWidth()
                int r2 = r2.getMeasuredHeight()
                long r2 = com.bytedance.adsdk.ugeno.yoga.g.j(r3, r2)
                return r2
            L2f:
                r2 = 0
                long r2 = com.bytedance.adsdk.ugeno.yoga.g.j(r2, r2)
                return r2
        }
    }

    public YogaLayout(android.content.Context r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.<init>(r3, r0, r1)
            return
    }

    public YogaLayout(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            com.bytedance.adsdk.ugeno.j.tl r1 = new com.bytedance.adsdk.ugeno.j.tl
            r1.<init>(r0)
            r0.f2055r = r1
            com.bytedance.adsdk.ugeno.yoga.oq r1 = com.bytedance.adsdk.ugeno.yoga.qv.j()
            r0.xt = r1
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r0.j = r2
            r1.j(r0)
            com.bytedance.adsdk.ugeno.yoga.widget.YogaLayout$xt r2 = new com.bytedance.adsdk.ugeno.yoga.widget.YogaLayout$xt
            r2.<init>()
            r1.j(r2)
            android.view.ViewGroup$LayoutParams r2 = r0.generateDefaultLayoutParams()
            com.bytedance.adsdk.ugeno.yoga.widget.YogaLayout$j r2 = (com.bytedance.adsdk.ugeno.yoga.widget.YogaLayout.j) r2
            j(r2, r1, r0)
            return
    }

    private void j(int r6, int r7) {
            r5 = this;
            int r0 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getSize(r7)
            int r6 = android.view.View.MeasureSpec.getMode(r6)
            int r7 = android.view.View.MeasureSpec.getMode(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r7 != r2) goto L1a
            com.bytedance.adsdk.ugeno.yoga.oq r3 = r5.xt
            float r4 = (float) r1
            r3.m(r4)
        L1a:
            if (r6 != r2) goto L22
            com.bytedance.adsdk.ugeno.yoga.oq r2 = r5.xt
            float r3 = (float) r0
            r2.r(r3)
        L22:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 != r2) goto L2c
            com.bytedance.adsdk.ugeno.yoga.oq r7 = r5.xt
            float r1 = (float) r1
            r7.qv(r1)
        L2c:
            if (r6 != r2) goto L34
            com.bytedance.adsdk.ugeno.yoga.oq r6 = r5.xt
            float r7 = (float) r0
            r6.oq(r7)
        L34:
            com.bytedance.adsdk.ugeno.yoga.oq r6 = r5.xt
            r7 = 2143289344(0x7fc00000, float:NaN)
            r6.j(r7, r7)
            return
    }

    private void j(android.view.View r5, boolean r6) {
            r4 = this;
            java.util.Map<android.view.View, com.bytedance.adsdk.ugeno.yoga.oq> r0 = r4.j
            java.lang.Object r0 = r0.get(r5)
            com.bytedance.adsdk.ugeno.yoga.oq r0 = (com.bytedance.adsdk.ugeno.yoga.oq) r0
            if (r0 != 0) goto Lb
            goto L39
        Lb:
            com.bytedance.adsdk.ugeno.yoga.oq r1 = r0.xt()
            r2 = 0
        L10:
            int r3 = r1.j()
            if (r2 >= r3) goto L27
            com.bytedance.adsdk.ugeno.yoga.oq r3 = r1.j(r2)
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L24
            r1.xt(r2)
            goto L27
        L24:
            int r2 = r2 + 1
            goto L10
        L27:
            r1 = 0
            r0.j(r1)
            java.util.Map<android.view.View, com.bytedance.adsdk.ugeno.yoga.oq> r0 = r4.j
            r0.remove(r5)
            if (r6 == 0) goto L39
            com.bytedance.adsdk.ugeno.yoga.oq r5 = r4.xt
            r6 = 2143289344(0x7fc00000, float:NaN)
            r5.j(r6, r6)
        L39:
            return
    }

    private void j(com.bytedance.adsdk.ugeno.yoga.oq r2) {
            r1 = this;
            com.bytedance.adsdk.ugeno.yoga.oq r0 = r2.xt()
            if (r0 == 0) goto Le
            com.bytedance.adsdk.ugeno.yoga.oq r2 = r2.xt()
            r1.j(r2)
            return
        Le:
            r0 = 2143289344(0x7fc00000, float:NaN)
            r2.j(r0, r0)
            return
    }

    private void j(com.bytedance.adsdk.ugeno.yoga.oq r7, float r8, float r9) {
            r6 = this;
            java.lang.Object r0 = r7.oq()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L4f
            if (r0 == r6) goto L4f
            int r1 = r0.getVisibility()
            r2 = 8
            if (r1 != r2) goto L13
            goto L7c
        L13:
            float r1 = r7.m()
            float r1 = r1 + r8
            int r1 = java.lang.Math.round(r1)
            float r2 = r7.ae()
            float r2 = r2 + r9
            int r2 = java.lang.Math.round(r2)
            float r3 = r7.tl()
            int r3 = java.lang.Math.round(r3)
            r4 = 1073741824(0x40000000, float:2.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r4)
            float r5 = r7.g()
            int r5 = java.lang.Math.round(r5)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r4)
            r0.measure(r3, r4)
            int r3 = r0.getMeasuredWidth()
            int r3 = r3 + r1
            int r4 = r0.getMeasuredHeight()
            int r4 = r4 + r2
            r0.layout(r1, r2, r3, r4)
        L4f:
            int r1 = r7.j()
            r2 = 0
        L54:
            if (r2 >= r1) goto L7c
            boolean r3 = r6.equals(r0)
            if (r3 == 0) goto L64
            com.bytedance.adsdk.ugeno.yoga.oq r3 = r7.j(r2)
            r6.j(r3, r8, r9)
            goto L79
        L64:
            boolean r3 = r0 instanceof com.bytedance.adsdk.ugeno.yoga.widget.YogaLayout
            if (r3 != 0) goto L79
            com.bytedance.adsdk.ugeno.yoga.oq r3 = r7.j(r2)
            float r4 = r7.m()
            float r4 = r4 + r8
            float r5 = r7.ae()
            float r5 = r5 + r9
            r6.j(r3, r4, r5)
        L79:
            int r2 = r2 + 1
            goto L54
        L7c:
            return
    }

    private void j(com.bytedance.adsdk.ugeno.yoga.oq r2, int r3) {
            r1 = this;
            r0 = -1
            if (r3 != r0) goto L9
            r3 = 1120403456(0x42c80000, float:100.0)
            r2.up(r3)
            return
        L9:
            r0 = -2
            if (r3 != r0) goto L10
            r2.r()
            return
        L10:
            float r3 = (float) r3
            r2.r(r3)
            return
    }

    protected static void j(com.bytedance.adsdk.ugeno.yoga.widget.YogaLayout.j r7, com.bytedance.adsdk.ugeno.yoga.oq r8, android.view.View r9) {
            android.content.res.Resources r0 = r9.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.getLayoutDirection()
            r1 = 1
            if (r0 != r1) goto L14
            com.bytedance.adsdk.ugeno.yoga.cw r0 = com.bytedance.adsdk.ugeno.yoga.cw.cw
            r8.j(r0)
        L14:
            android.graphics.drawable.Drawable r9 = r9.getBackground()
            if (r9 == 0) goto L45
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            boolean r9 = r9.getPadding(r0)
            if (r9 == 0) goto L45
            com.bytedance.adsdk.ugeno.yoga.r r9 = com.bytedance.adsdk.ugeno.yoga.r.j
            int r2 = r0.left
            float r2 = (float) r2
            r8.xt(r9, r2)
            com.bytedance.adsdk.ugeno.yoga.r r9 = com.bytedance.adsdk.ugeno.yoga.r.xt
            int r2 = r0.top
            float r2 = (float) r2
            r8.xt(r9, r2)
            com.bytedance.adsdk.ugeno.yoga.r r9 = com.bytedance.adsdk.ugeno.yoga.r.cw
            int r2 = r0.right
            float r2 = (float) r2
            r8.xt(r9, r2)
            com.bytedance.adsdk.ugeno.yoga.r r9 = com.bytedance.adsdk.ugeno.yoga.r.f2051r
            int r0 = r0.bottom
            float r0 = (float) r0
            r8.xt(r9, r0)
        L45:
            r9 = 0
        L46:
            android.util.SparseArray<java.lang.Float> r0 = r7.j
            int r0 = r0.size()
            if (r9 >= r0) goto L1c7
            android.util.SparseArray<java.lang.Float> r0 = r7.j
            int r0 = r0.keyAt(r9)
            android.util.SparseArray<java.lang.Float> r2 = r7.j
            java.lang.Object r2 = r2.valueAt(r9)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r3 = 4
            if (r0 != r3) goto L70
            int r0 = java.lang.Math.round(r2)
            com.bytedance.adsdk.ugeno.yoga.j r0 = com.bytedance.adsdk.ugeno.yoga.j.j(r0)
            r8.cw(r0)
            goto L1c3
        L70:
            if (r0 != 0) goto L7f
            int r0 = java.lang.Math.round(r2)
            com.bytedance.adsdk.ugeno.yoga.j r0 = com.bytedance.adsdk.ugeno.yoga.j.j(r0)
            r8.j(r0)
            goto L1c3
        L7f:
            r3 = 9
            if (r0 != r3) goto L90
            int r0 = java.lang.Math.round(r2)
            com.bytedance.adsdk.ugeno.yoga.j r0 = com.bytedance.adsdk.ugeno.yoga.j.j(r0)
            r8.xt(r0)
            goto L1c3
        L90:
            r3 = 25
            if (r0 != r3) goto L99
            r8.vl(r2)
            goto L1c3
        L99:
            r3 = 8
            if (r0 != r3) goto Lac
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto La7
            r8.cw()
            goto L1c3
        La7:
            r8.cw(r2)
            goto L1c3
        Lac:
            if (r0 != r1) goto Lbb
            int r0 = java.lang.Math.round(r2)
            com.bytedance.adsdk.ugeno.yoga.up r0 = com.bytedance.adsdk.ugeno.yoga.up.j(r0)
            r8.j(r0)
            goto L1c3
        Lbb:
            r3 = 6
            if (r0 != r3) goto Lc3
            r8.j(r2)
            goto L1c3
        Lc3:
            r3 = 7
            if (r0 != r3) goto Lcb
            r8.xt(r2)
            goto L1c3
        Lcb:
            r3 = 16
            r4 = -1073741824(0xffffffffc0000000, float:-2.0)
            r5 = 1120403456(0x42c80000, float:100.0)
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 != r3) goto Lec
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 != 0) goto Lde
            r8.ae(r5)
            goto L1c3
        Lde:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto Le7
            r8.up()
            goto L1c3
        Le7:
            r8.m(r2)
            goto L1c3
        Lec:
            r3 = 18
            if (r0 != r3) goto Lf7
            com.bytedance.adsdk.ugeno.yoga.r r0 = com.bytedance.adsdk.ugeno.yoga.r.j
            r8.j(r0, r2)
            goto L1c3
        Lf7:
            r3 = 3
            if (r0 != r3) goto L107
            int r0 = java.lang.Math.round(r2)
            com.bytedance.adsdk.ugeno.yoga.m r0 = com.bytedance.adsdk.ugeno.yoga.m.j(r0)
            r8.j(r0)
            goto L1c3
        L107:
            r3 = 17
            if (r0 != r3) goto L112
            com.bytedance.adsdk.ugeno.yoga.r r0 = com.bytedance.adsdk.ugeno.yoga.r.xt
            r8.j(r0, r2)
            goto L1c3
        L112:
            r3 = 20
            if (r0 != r3) goto L11d
            com.bytedance.adsdk.ugeno.yoga.r r0 = com.bytedance.adsdk.ugeno.yoga.r.cw
            r8.j(r0, r2)
            goto L1c3
        L11d:
            r3 = 19
            if (r0 != r3) goto L128
            com.bytedance.adsdk.ugeno.yoga.r r0 = com.bytedance.adsdk.ugeno.yoga.r.f2051r
            r8.j(r0, r2)
            goto L1c3
        L128:
            r3 = 28
            if (r0 != r3) goto L131
            r8.g(r2)
            goto L1c3
        L131:
            r3 = 27
            if (r0 != r3) goto L13a
            r8.tl(r2)
            goto L1c3
        L13a:
            r3 = 22
            if (r0 != r3) goto L145
            com.bytedance.adsdk.ugeno.yoga.r r0 = com.bytedance.adsdk.ugeno.yoga.r.j
            r8.xt(r0, r2)
            goto L1c3
        L145:
            r3 = 21
            if (r0 != r3) goto L150
            com.bytedance.adsdk.ugeno.yoga.r r0 = com.bytedance.adsdk.ugeno.yoga.r.xt
            r8.xt(r0, r2)
            goto L1c3
        L150:
            r3 = 24
            if (r0 != r3) goto L15b
            com.bytedance.adsdk.ugeno.yoga.r r0 = com.bytedance.adsdk.ugeno.yoga.r.cw
            r8.xt(r0, r2)
            goto L1c3
        L15b:
            r3 = 23
            if (r0 != r3) goto L165
            com.bytedance.adsdk.ugeno.yoga.r r0 = com.bytedance.adsdk.ugeno.yoga.r.f2051r
            r8.xt(r0, r2)
            goto L1c3
        L165:
            r3 = 11
            if (r0 != r3) goto L16f
            com.bytedance.adsdk.ugeno.yoga.r r0 = com.bytedance.adsdk.ugeno.yoga.r.j
            r8.cw(r0, r2)
            goto L1c3
        L16f:
            r3 = 10
            if (r0 != r3) goto L179
            com.bytedance.adsdk.ugeno.yoga.r r0 = com.bytedance.adsdk.ugeno.yoga.r.xt
            r8.cw(r0, r2)
            goto L1c3
        L179:
            r3 = 13
            if (r0 != r3) goto L183
            com.bytedance.adsdk.ugeno.yoga.r r0 = com.bytedance.adsdk.ugeno.yoga.r.cw
            r8.cw(r0, r2)
            goto L1c3
        L183:
            r3 = 12
            if (r0 != r3) goto L18d
            com.bytedance.adsdk.ugeno.yoga.r r0 = com.bytedance.adsdk.ugeno.yoga.r.f2051r
            r8.cw(r0, r2)
            goto L1c3
        L18d:
            r3 = 14
            if (r0 != r3) goto L19d
            int r0 = java.lang.Math.round(r2)
            com.bytedance.adsdk.ugeno.yoga.jy r0 = com.bytedance.adsdk.ugeno.yoga.jy.j(r0)
            r8.j(r0)
            goto L1c3
        L19d:
            r3 = 15
            if (r0 != r3) goto L1b5
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 != 0) goto L1a9
            r8.up(r5)
            goto L1c3
        L1a9:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L1b1
            r8.r()
            goto L1c3
        L1b1:
            r8.r(r2)
            goto L1c3
        L1b5:
            r3 = 2
            if (r0 != r3) goto L1c3
            int r0 = java.lang.Math.round(r2)
            com.bytedance.adsdk.ugeno.yoga.ws r0 = com.bytedance.adsdk.ugeno.yoga.ws.j(r0)
            r8.j(r0)
        L1c3:
            int r9 = r9 + 1
            goto L46
        L1c7:
            return
    }

    private void xt(com.bytedance.adsdk.ugeno.yoga.oq r2, int r3) {
            r1 = this;
            r0 = -1
            if (r3 != r0) goto L9
            r3 = 1120403456(0x42c80000, float:100.0)
            r2.ae(r3)
            return
        L9:
            r0 = -2
            if (r3 != r0) goto L10
            r2.up()
            return
        L10:
            float r3 = (float) r3
            r2.m(r3)
            return
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View r3, int r4, android.view.ViewGroup.LayoutParams r5) {
            r2 = this;
            com.bytedance.adsdk.ugeno.yoga.oq r0 = r2.xt
            r1 = 0
            r0.j(r1)
            boolean r0 = r3 instanceof com.bytedance.adsdk.ugeno.yoga.widget.VirtualYogaLayout
            if (r0 == 0) goto L1d
            com.bytedance.adsdk.ugeno.yoga.widget.VirtualYogaLayout r3 = (com.bytedance.adsdk.ugeno.yoga.widget.VirtualYogaLayout) r3
            r3.j(r2)
            com.bytedance.adsdk.ugeno.yoga.oq r3 = r3.getYogaNode()
            com.bytedance.adsdk.ugeno.yoga.oq r4 = r2.xt
            int r5 = r4.j()
            r4.j(r3, r5)
            return
        L1d:
            super.addView(r3, r4, r5)
            java.util.Map<android.view.View, com.bytedance.adsdk.ugeno.yoga.oq> r4 = r2.j
            boolean r4 = r4.containsKey(r3)
            if (r4 == 0) goto L29
            return
        L29:
            boolean r4 = r3 instanceof com.bytedance.adsdk.ugeno.yoga.widget.YogaLayout
            if (r4 == 0) goto L35
            r4 = r3
            com.bytedance.adsdk.ugeno.yoga.widget.YogaLayout r4 = (com.bytedance.adsdk.ugeno.yoga.widget.YogaLayout) r4
            com.bytedance.adsdk.ugeno.yoga.oq r4 = r4.getYogaNode()
            goto L55
        L35:
            java.util.Map<android.view.View, com.bytedance.adsdk.ugeno.yoga.oq> r4 = r2.j
            boolean r4 = r4.containsKey(r3)
            if (r4 == 0) goto L46
            java.util.Map<android.view.View, com.bytedance.adsdk.ugeno.yoga.oq> r4 = r2.j
            java.lang.Object r4 = r4.get(r3)
            com.bytedance.adsdk.ugeno.yoga.oq r4 = (com.bytedance.adsdk.ugeno.yoga.oq) r4
            goto L4a
        L46:
            com.bytedance.adsdk.ugeno.yoga.oq r4 = com.bytedance.adsdk.ugeno.yoga.qv.j()
        L4a:
            r4.j(r3)
            com.bytedance.adsdk.ugeno.yoga.widget.YogaLayout$xt r5 = new com.bytedance.adsdk.ugeno.yoga.widget.YogaLayout$xt
            r5.<init>()
            r4.j(r5)
        L55:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            com.bytedance.adsdk.ugeno.yoga.widget.YogaLayout$j r5 = (com.bytedance.adsdk.ugeno.yoga.widget.YogaLayout.j) r5
            j(r5, r4, r3)
            java.util.Map<android.view.View, com.bytedance.adsdk.ugeno.yoga.oq> r5 = r2.j
            r5.put(r3, r4)
            int r5 = r3.getVisibility()
            r0 = 8
            if (r5 != r0) goto L7c
            com.bytedance.adsdk.ugeno.yoga.oq r4 = r2.xt
            int r4 = r4.j()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 151060224(0x900ff00, float:1.552734E-33)
            r3.setTag(r5, r4)
            return
        L7c:
            com.bytedance.adsdk.ugeno.yoga.oq r3 = r2.xt
            int r5 = r3.j()
            r3.j(r4, r5)
            return
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r1 = r1 instanceof com.bytedance.adsdk.ugeno.yoga.widget.YogaLayout.j
            return r1
    }

    @Override // com.bytedance.adsdk.ugeno.xt.xt
    public void cw(android.view.View r1, int r2) {
            r0 = this;
            r0.r(r1, r2)
            return
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r2 = this;
            com.bytedance.adsdk.ugeno.yoga.widget.YogaLayout$j r0 = new com.bytedance.adsdk.ugeno.yoga.widget.YogaLayout$j
            r1 = -1
            r0.<init>(r1, r1)
            return r0
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            com.bytedance.adsdk.ugeno.yoga.widget.YogaLayout$j r0 = new com.bytedance.adsdk.ugeno.yoga.widget.YogaLayout$j
            r0.<init>(r2)
            return r0
    }

    public float getBorderRadius() {
            r1 = this;
            com.bytedance.adsdk.ugeno.j.tl r0 = r1.f2055r
            float r0 = r0.j()
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.j.ae
    public float getRipple() {
            r1 = this;
            com.bytedance.adsdk.ugeno.j.tl r0 = r1.f2055r
            float r0 = r0.getRipple()
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.j.ae
    public float getRubIn() {
            r1 = this;
            com.bytedance.adsdk.ugeno.j.tl r0 = r1.f2055r
            float r0 = r0.getRubIn()
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.j.ae
    public float getShine() {
            r1 = this;
            com.bytedance.adsdk.ugeno.j.tl r0 = r1.f2055r
            float r0 = r0.getShine()
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.j.ae
    public float getStretch() {
            r1 = this;
            com.bytedance.adsdk.ugeno.j.tl r0 = r1.f2055r
            float r0 = r0.getStretch()
            return r0
    }

    public com.bytedance.adsdk.ugeno.yoga.oq getYogaNode() {
            r1 = this;
            com.bytedance.adsdk.ugeno.yoga.oq r0 = r1.xt
            return r0
    }

    public com.bytedance.adsdk.ugeno.yoga.oq j(android.view.View r2) {
            r1 = this;
            java.util.Map<android.view.View, com.bytedance.adsdk.ugeno.yoga.oq> r0 = r1.j
            java.lang.Object r2 = r0.get(r2)
            com.bytedance.adsdk.ugeno.yoga.oq r2 = (com.bytedance.adsdk.ugeno.yoga.oq) r2
            return r2
    }

    @Override // com.bytedance.adsdk.ugeno.xt.xt
    public void j(int r2) {
            r1 = this;
            com.bytedance.adsdk.ugeno.yoga.oq r0 = r1.xt
            if (r0 == 0) goto La
            r1.j(r0, r2)
            r1.requestLayout()
        La:
            return
    }

    @Override // com.bytedance.adsdk.ugeno.xt.xt
    public void j(android.view.View r2, int r3) {
            r1 = this;
            if (r2 != 0) goto L3
            goto L9
        L3:
            com.bytedance.adsdk.ugeno.yoga.oq r0 = r1.j(r2)
            if (r0 != 0) goto La
        L9:
            return
        La:
            r1.j(r0, r3)
            r2.requestLayout()
            return
    }

    public void j(android.view.View r2, com.bytedance.adsdk.ugeno.yoga.oq r3) {
            r1 = this;
            java.util.Map<android.view.View, com.bytedance.adsdk.ugeno.yoga.oq> r0 = r1.j
            r0.put(r2, r3)
            r1.addView(r2)
            return
    }

    public void j(com.bytedance.adsdk.ugeno.xt.cw r1) {
            r0 = this;
            r0.cw = r1
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            com.bytedance.adsdk.ugeno.cw r0 = r1.cw
            if (r0 == 0) goto La
            r0.up()
        La:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            com.bytedance.adsdk.ugeno.cw r0 = r1.cw
            if (r0 == 0) goto La
            r0.m()
        La:
            return
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r2) {
            r1 = this;
            super.onDraw(r2)
            com.bytedance.adsdk.ugeno.cw r0 = r1.cw
            if (r0 == 0) goto La
            r0.j(r2)
        La:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r3, int r4, int r5, int r6, int r7) {
            r2 = this;
            com.bytedance.adsdk.ugeno.cw r3 = r2.cw
            if (r3 == 0) goto L7
            r3.r()
        L7:
            android.view.ViewParent r3 = r2.getParent()
            boolean r3 = r3 instanceof com.bytedance.adsdk.ugeno.yoga.widget.YogaLayout
            if (r3 != 0) goto L20
            int r3 = r6 - r4
            r0 = 1073741824(0x40000000, float:2.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0)
            int r1 = r7 - r5
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            r2.j(r3, r0)
        L20:
            com.bytedance.adsdk.ugeno.yoga.oq r3 = r2.xt
            r0 = 0
            r2.j(r3, r0, r0)
            com.bytedance.adsdk.ugeno.cw r3 = r2.cw
            if (r3 == 0) goto L2d
            r3.j(r4, r5, r6, r7)
        L2d:
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r2, int r3) {
            r1 = this;
            android.view.ViewParent r0 = r1.getParent()
            boolean r0 = r0 instanceof com.bytedance.adsdk.ugeno.yoga.widget.YogaLayout
            if (r0 != 0) goto Lb
            r1.j(r2, r3)
        Lb:
            com.bytedance.adsdk.ugeno.cw r0 = r1.cw
            if (r0 == 0) goto L1d
            int[] r2 = r0.j(r2, r3)
            r3 = 0
            r3 = r2[r3]
            r0 = 1
            r2 = r2[r0]
            r1.setMeasuredDimension(r3, r2)
            goto L34
        L1d:
            com.bytedance.adsdk.ugeno.yoga.oq r2 = r1.xt
            float r2 = r2.tl()
            int r2 = java.lang.Math.round(r2)
            com.bytedance.adsdk.ugeno.yoga.oq r3 = r1.xt
            float r3 = r3.g()
            int r3 = java.lang.Math.round(r3)
            r1.setMeasuredDimension(r2, r3)
        L34:
            com.bytedance.adsdk.ugeno.cw r2 = r1.cw
            if (r2 == 0) goto L3b
            r2.cw()
        L3b:
            return
    }

    @Override // android.view.View
    protected void onSizeChanged(int r2, int r3, int r4, int r5) {
            r1 = this;
            super.onSizeChanged(r2, r3, r4, r5)
            com.bytedance.adsdk.ugeno.cw r0 = r1.cw
            if (r0 == 0) goto La
            r0.xt(r2, r3, r4, r5)
        La:
            return
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean r2) {
            r1 = this;
            super.onWindowFocusChanged(r2)
            com.bytedance.adsdk.ugeno.cw r0 = r1.cw
            if (r0 == 0) goto La
            r0.j(r2)
        La:
            return
    }

    public void r(android.view.View r5, int r6) {
            r4 = this;
            r5.setVisibility(r6)
            java.util.Map<android.view.View, com.bytedance.adsdk.ugeno.yoga.oq> r0 = r4.j     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> L71
            com.bytedance.adsdk.ugeno.yoga.oq r0 = (com.bytedance.adsdk.ugeno.yoga.oq) r0     // Catch: java.lang.Throwable -> L71
            r1 = 151060224(0x900ff00, float:1.552734E-33)
            java.lang.Object r2 = r5.getTag(r1)     // Catch: java.lang.Throwable -> L71
            r3 = -1
            if (r6 != 0) goto L54
            if (r2 == 0) goto L71
            com.bytedance.adsdk.ugeno.yoga.oq r6 = r4.xt     // Catch: java.lang.Throwable -> L71
            int r6 = r6.j(r0)     // Catch: java.lang.Throwable -> L71
            if (r6 != r3) goto L71
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L71
            int r6 = r2.intValue()     // Catch: java.lang.Throwable -> L71
            com.bytedance.adsdk.ugeno.yoga.oq r0 = r4.xt     // Catch: java.lang.Throwable -> L71
            int r0 = r0.j()     // Catch: java.lang.Throwable -> L71
            if (r6 >= r0) goto L3b
            com.bytedance.adsdk.ugeno.yoga.oq r0 = r4.xt     // Catch: java.lang.Throwable -> L71
            java.util.Map<android.view.View, com.bytedance.adsdk.ugeno.yoga.oq> r1 = r4.j     // Catch: java.lang.Throwable -> L71
            java.lang.Object r5 = r1.get(r5)     // Catch: java.lang.Throwable -> L71
            com.bytedance.adsdk.ugeno.yoga.oq r5 = (com.bytedance.adsdk.ugeno.yoga.oq) r5     // Catch: java.lang.Throwable -> L71
            r0.j(r5, r6)     // Catch: java.lang.Throwable -> L71
            goto L4e
        L3b:
            com.bytedance.adsdk.ugeno.yoga.oq r6 = r4.xt     // Catch: java.lang.Throwable -> L71
            java.util.Map<android.view.View, com.bytedance.adsdk.ugeno.yoga.oq> r0 = r4.j     // Catch: java.lang.Throwable -> L71
            java.lang.Object r5 = r0.get(r5)     // Catch: java.lang.Throwable -> L71
            com.bytedance.adsdk.ugeno.yoga.oq r5 = (com.bytedance.adsdk.ugeno.yoga.oq) r5     // Catch: java.lang.Throwable -> L71
            com.bytedance.adsdk.ugeno.yoga.oq r0 = r4.xt     // Catch: java.lang.Throwable -> L71
            int r0 = r0.j()     // Catch: java.lang.Throwable -> L71
            r6.j(r5, r0)     // Catch: java.lang.Throwable -> L71
        L4e:
            com.bytedance.adsdk.ugeno.yoga.oq r5 = r4.xt     // Catch: java.lang.Throwable -> L71
            r4.j(r5)     // Catch: java.lang.Throwable -> L71
            return
        L54:
            r2 = 8
            if (r6 != r2) goto L71
            com.bytedance.adsdk.ugeno.yoga.oq r6 = r4.xt     // Catch: java.lang.Throwable -> L71
            int r6 = r6.j(r0)     // Catch: java.lang.Throwable -> L71
            if (r6 == r3) goto L71
            com.bytedance.adsdk.ugeno.yoga.oq r0 = r4.xt     // Catch: java.lang.Throwable -> L71
            r0.xt(r6)     // Catch: java.lang.Throwable -> L71
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L71
            r5.setTag(r1, r6)     // Catch: java.lang.Throwable -> L71
            com.bytedance.adsdk.ugeno.yoga.oq r5 = r4.xt     // Catch: java.lang.Throwable -> L71
            r4.j(r5)     // Catch: java.lang.Throwable -> L71
        L71:
            return
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 0
            r2 = 0
        L6:
            if (r2 >= r0) goto L12
            android.view.View r3 = r4.getChildAt(r2)
            r4.j(r3, r1)
            int r2 = r2 + 1
            goto L6
        L12:
            super.removeAllViews()
            return
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L12
            android.view.View r2 = r4.getChildAt(r1)
            r3 = 1
            r4.j(r2, r3)
            int r1 = r1 + 1
            goto L5
        L12:
            super.removeAllViewsInLayout()
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(android.view.View r2) {
            r1 = this;
            r0 = 0
            r1.j(r2, r0)
            super.removeView(r2)
            return
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int r3) {
            r2 = this;
            android.view.View r0 = r2.getChildAt(r3)
            r1 = 0
            r2.j(r0, r1)
            super.removeViewAt(r3)
            return
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(android.view.View r2) {
            r1 = this;
            r0 = 1
            r1.j(r2, r0)
            super.removeViewInLayout(r2)
            return
    }

    @Override // android.view.ViewGroup
    public void removeViews(int r4, int r5) {
            r3 = this;
            r0 = r4
        L1:
            int r1 = r4 + r5
            if (r0 >= r1) goto L10
            android.view.View r1 = r3.getChildAt(r0)
            r2 = 0
            r3.j(r1, r2)
            int r0 = r0 + 1
            goto L1
        L10:
            super.removeViews(r4, r5)
            return
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int r4, int r5) {
            r3 = this;
            r0 = r4
        L1:
            int r1 = r4 + r5
            if (r0 >= r1) goto L10
            android.view.View r1 = r3.getChildAt(r0)
            r2 = 1
            r3.j(r1, r2)
            int r0 = r0 + 1
            goto L1
        L10:
            super.removeViewsInLayout(r4, r5)
            return
    }

    @Override // android.view.View
    public void setBackgroundColor(int r2) {
            r1 = this;
            com.bytedance.adsdk.ugeno.j.tl r0 = r1.f2055r
            r0.j(r2)
            return
    }

    public void setBorderRadius(float r2) {
            r1 = this;
            com.bytedance.adsdk.ugeno.j.tl r0 = r1.f2055r
            r0.j(r2)
            return
    }

    public void setRipple(float r2) {
            r1 = this;
            com.bytedance.adsdk.ugeno.j.tl r0 = r1.f2055r
            if (r0 == 0) goto L7
            r0.xt(r2)
        L7:
            return
    }

    public void setRubIn(float r2) {
            r1 = this;
            com.bytedance.adsdk.ugeno.j.tl r0 = r1.f2055r
            if (r0 == 0) goto L7
            r0.up(r2)
        L7:
            return
    }

    public void setShine(float r2) {
            r1 = this;
            com.bytedance.adsdk.ugeno.j.tl r0 = r1.f2055r
            if (r0 == 0) goto L7
            r0.cw(r2)
        L7:
            return
    }

    public void setStretch(float r2) {
            r1 = this;
            com.bytedance.adsdk.ugeno.j.tl r0 = r1.f2055r
            if (r0 == 0) goto L7
            r0.r(r2)
        L7:
            return
    }

    @Override // com.bytedance.adsdk.ugeno.xt.xt
    public void xt(int r2) {
            r1 = this;
            com.bytedance.adsdk.ugeno.yoga.oq r0 = r1.xt
            if (r0 == 0) goto La
            r1.xt(r0, r2)
            r1.requestLayout()
        La:
            return
    }

    @Override // com.bytedance.adsdk.ugeno.xt.xt
    public void xt(android.view.View r2, int r3) {
            r1 = this;
            if (r2 != 0) goto L3
            goto L9
        L3:
            com.bytedance.adsdk.ugeno.yoga.oq r0 = r1.j(r2)
            if (r0 != 0) goto La
        L9:
            return
        La:
            r1.xt(r0, r3)
            r2.requestLayout()
            return
    }
}
