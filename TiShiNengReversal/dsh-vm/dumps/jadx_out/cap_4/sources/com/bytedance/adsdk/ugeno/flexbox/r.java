package com.bytedance.adsdk.ugeno.flexbox;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class r {
    static final /* synthetic */ boolean cw = true;
    int[] j;

    /* renamed from: m, reason: collision with root package name */
    private long[] f1946m;

    /* renamed from: r, reason: collision with root package name */
    private final com.bytedance.adsdk.ugeno.flexbox.j f1947r;
    private boolean[] up;
    long[] xt;

    /* renamed from: com.bytedance.adsdk.ugeno.flexbox.r$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    static class j {
        java.util.List<com.bytedance.adsdk.ugeno.flexbox.cw> j;
        int xt;

        j() {
                r0 = this;
                r0.<init>()
                return
        }

        void j() {
                r1 = this;
                r0 = 0
                r1.j = r0
                r0 = 0
                r1.xt = r0
                return
        }
    }

    private static class xt implements java.lang.Comparable<com.bytedance.adsdk.ugeno.flexbox.r.xt> {
        int j;
        int xt;

        private xt() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ xt(com.bytedance.adsdk.ugeno.flexbox.r.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.Comparable
        public /* synthetic */ int compareTo(com.bytedance.adsdk.ugeno.flexbox.r.xt r1) {
                r0 = this;
                com.bytedance.adsdk.ugeno.flexbox.r$xt r1 = (com.bytedance.adsdk.ugeno.flexbox.r.xt) r1
                int r1 = r0.j(r1)
                return r1
        }

        public int j(com.bytedance.adsdk.ugeno.flexbox.r.xt r3) {
                r2 = this;
                int r0 = r2.xt
                int r1 = r3.xt
                if (r0 == r1) goto L8
                int r0 = r0 - r1
                return r0
            L8:
                int r0 = r2.j
                int r3 = r3.j
                int r0 = r0 - r3
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Order{order="
                r0.<init>(r1)
                int r1 = r2.xt
                r0.append(r1)
                java.lang.String r1 = ", index="
                r0.append(r1)
                int r1 = r2.j
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            return
    }

    r(com.bytedance.adsdk.ugeno.flexbox.j r1) {
            r0 = this;
            r0.<init>()
            r0.f1947r = r1
            return
    }

    private int cw(com.bytedance.adsdk.ugeno.flexbox.xt r1, boolean r2) {
            r0 = this;
            if (r2 == 0) goto L7
            int r1 = r1.jy()
            return r1
        L7:
            int r1 = r1.ws()
            return r1
    }

    private int cw(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L9
            com.bytedance.adsdk.ugeno.flexbox.j r1 = r0.f1947r
            int r1 = r1.getPaddingTop()
            return r1
        L9:
            com.bytedance.adsdk.ugeno.flexbox.j r1 = r0.f1947r
            int r1 = r1.getPaddingStart()
            return r1
    }

    private void cw(int r3) {
            r2 = this;
            boolean[] r0 = r2.up
            if (r0 != 0) goto Lf
            r0 = 10
            int r3 = java.lang.Math.max(r3, r0)
            boolean[] r3 = new boolean[r3]
            r2.up = r3
            return
        Lf:
            int r1 = r0.length
            if (r1 >= r3) goto L1e
            int r0 = r0.length
            int r0 = r0 * 2
            int r3 = java.lang.Math.max(r0, r3)
            boolean[] r3 = new boolean[r3]
            r2.up = r3
            return
        L1e:
            r3 = 0
            java.util.Arrays.fill(r0, r3)
            return
    }

    private int j(int r4, com.bytedance.adsdk.ugeno.flexbox.xt r5, int r6) {
            r3 = this;
            com.bytedance.adsdk.ugeno.flexbox.j r0 = r3.f1947r
            int r1 = r0.getPaddingLeft()
            com.bytedance.adsdk.ugeno.flexbox.j r2 = r3.f1947r
            int r2 = r2.getPaddingRight()
            int r1 = r1 + r2
            int r2 = r5.jy()
            int r1 = r1 + r2
            int r2 = r5.az()
            int r1 = r1 + r2
            int r1 = r1 + r6
            int r6 = r5.j()
            int r4 = r0.j(r4, r1, r6)
            int r6 = android.view.View.MeasureSpec.getSize(r4)
            int r0 = r5.g()
            if (r6 <= r0) goto L37
            int r5 = r5.g()
            int r4 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r4)
            return r4
        L37:
            int r0 = r5.ae()
            if (r6 >= r0) goto L49
            int r5 = r5.ae()
            int r4 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r4)
        L49:
            return r4
    }

    private int j(android.view.View r1, boolean r2) {
            r0 = this;
            if (r2 == 0) goto L7
            int r1 = r1.getMeasuredWidth()
            return r1
        L7:
            int r1 = r1.getMeasuredHeight()
            return r1
    }

    private int j(com.bytedance.adsdk.ugeno.flexbox.xt r1, boolean r2) {
            r0 = this;
            if (r2 == 0) goto L7
            int r1 = r1.j()
            return r1
        L7:
            int r1 = r1.xt()
            return r1
    }

    private int j(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L9
            com.bytedance.adsdk.ugeno.flexbox.j r1 = r0.f1947r
            int r1 = r1.getPaddingStart()
            return r1
        L9:
            com.bytedance.adsdk.ugeno.flexbox.j r1 = r0.f1947r
            int r1 = r1.getPaddingTop()
            return r1
    }

    private java.util.List<com.bytedance.adsdk.ugeno.flexbox.cw> j(java.util.List<com.bytedance.adsdk.ugeno.flexbox.cw> r4, int r5, int r6) {
            r3 = this;
            int r5 = r5 - r6
            int r5 = r5 / 2
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            com.bytedance.adsdk.ugeno.flexbox.cw r0 = new com.bytedance.adsdk.ugeno.flexbox.cw
            r0.<init>()
            r0.ae = r5
            int r5 = r4.size()
            r1 = 0
        L14:
            if (r1 >= r5) goto L32
            if (r1 != 0) goto L1b
            r6.add(r0)
        L1b:
            java.lang.Object r2 = r4.get(r1)
            com.bytedance.adsdk.ugeno.flexbox.cw r2 = (com.bytedance.adsdk.ugeno.flexbox.cw) r2
            r6.add(r2)
            int r2 = r4.size()
            int r2 = r2 + (-1)
            if (r1 != r2) goto L2f
            r6.add(r0)
        L2f:
            int r1 = r1 + 1
            goto L14
        L32:
            return r6
    }

    private void j(int r2, int r3, int r4, android.view.View r5) {
            r1 = this;
            long[] r0 = r1.xt
            if (r0 == 0) goto La
            long r3 = r1.xt(r3, r4)
            r0[r2] = r3
        La:
            long[] r3 = r1.f1946m
            if (r3 == 0) goto L1c
            int r4 = r5.getMeasuredWidth()
            int r5 = r5.getMeasuredHeight()
            long r4 = r1.xt(r4, r5)
            r3[r2] = r4
        L1c:
            return
    }

    private void j(int r23, int r24, com.bytedance.adsdk.ugeno.flexbox.cw r25, int r26, int r27, boolean r28) {
            r22 = this;
            r0 = r22
            r3 = r25
            r4 = r26
            float r1 = r3.oq
            r2 = 0
            int r5 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r5 <= 0) goto L208
            int r5 = r3.up
            if (r4 >= r5) goto L13
            goto L208
        L13:
            int r6 = r4 - r5
            float r6 = (float) r6
            float r6 = r6 / r1
            int r1 = r3.f1943m
            int r1 = r27 + r1
            r3.up = r1
            if (r28 != 0) goto L23
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r3.ae = r1
        L23:
            r1 = 0
            r7 = 0
            r8 = 0
            r9 = 0
        L27:
            int r10 = r3.tl
            if (r1 >= r10) goto L1f5
            int r10 = r3.az
            int r10 = r10 + r1
            com.bytedance.adsdk.ugeno.flexbox.j r11 = r0.f1947r
            android.view.View r11 = r11.xt(r10)
            if (r11 == 0) goto L1e6
            int r12 = r11.getVisibility()
            r13 = 8
            if (r12 == r13) goto L1e6
            android.view.ViewGroup$LayoutParams r12 = r11.getLayoutParams()
            com.bytedance.adsdk.ugeno.flexbox.xt r12 = (com.bytedance.adsdk.ugeno.flexbox.xt) r12
            com.bytedance.adsdk.ugeno.flexbox.j r13 = r0.f1947r
            int r13 = r13.getFlexDirection()
            r17 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r19 = 0
            r2 = 1
            if (r13 == 0) goto L53
            if (r13 != r2) goto L5e
        L53:
            r14 = r23
            r15 = r6
            r16 = r7
            r28 = 1
            r20 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            goto L122
        L5e:
            int r13 = r11.getMeasuredHeight()
            r28 = 1
            long[] r2 = r0.f1946m
            r20 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            if (r2 == 0) goto L70
            r14 = r2[r10]
            int r13 = r0.xt(r14)
        L70:
            int r2 = r11.getMeasuredWidth()
            long[] r14 = r0.f1946m
            r15 = r6
            r16 = r7
            if (r14 == 0) goto L81
            r6 = r14[r10]
            int r2 = r0.j(r6)
        L81:
            boolean[] r6 = r0.up
            boolean r6 = r6[r10]
            if (r6 != 0) goto Lf6
            float r6 = r12.r()
            int r6 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
            if (r6 <= 0) goto Lf6
            float r2 = (float) r13
            float r6 = r12.r()
            float r6 = r6 * r15
            float r2 = r2 + r6
            int r6 = r3.tl
            int r6 = r6 + (-1)
            if (r1 != r6) goto L9f
            float r2 = r2 + r9
            r9 = 0
        L9f:
            int r6 = java.lang.Math.round(r2)
            int r7 = r12.oq()
            if (r6 <= r7) goto Lbc
            int r6 = r12.oq()
            boolean[] r2 = r0.up
            r2[r10] = r28
            float r2 = r3.oq
            float r7 = r12.r()
            float r2 = r2 - r7
            r3.oq = r2
            r7 = 1
            goto Ld6
        Lbc:
            float r7 = (float) r6
            float r2 = r2 - r7
            float r9 = r9 + r2
            double r13 = (double) r9
            int r2 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r2 <= 0) goto Lcd
            int r6 = r6 + 1
            double r13 = r13 - r17
        Lc8:
            float r2 = (float) r13
            r9 = r2
        Lca:
            r7 = r16
            goto Ld6
        Lcd:
            int r2 = (r13 > r20 ? 1 : (r13 == r20 ? 0 : -1))
            if (r2 >= 0) goto Lca
            int r6 = r6 + (-1)
            double r13 = r13 + r17
            goto Lc8
        Ld6:
            int r2 = r3.jy
            r14 = r23
            int r2 = r0.j(r14, r12, r2)
            r13 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r13)
            r11.measure(r2, r6)
            int r13 = r11.getMeasuredWidth()
            int r16 = r11.getMeasuredHeight()
            r0.j(r10, r2, r6, r11)
            r2 = r13
            r13 = r16
            goto Lfa
        Lf6:
            r14 = r23
            r7 = r16
        Lfa:
            int r6 = r12.jy()
            int r2 = r2 + r6
            int r6 = r12.az()
            int r2 = r2 + r6
            com.bytedance.adsdk.ugeno.flexbox.j r6 = r0.f1947r
            int r6 = r6.j(r11)
            int r2 = r2 + r6
            int r2 = java.lang.Math.max(r8, r2)
            int r6 = r3.up
            int r8 = r12.ws()
            int r13 = r13 + r8
            int r8 = r12.av()
            int r13 = r13 + r8
            int r6 = r6 + r13
            r3.up = r6
            r13 = r24
            goto L1dc
        L122:
            int r2 = r11.getMeasuredWidth()
            long[] r6 = r0.f1946m
            if (r6 == 0) goto L130
            r13 = r6[r10]
            int r2 = r0.j(r13)
        L130:
            int r6 = r11.getMeasuredHeight()
            long[] r7 = r0.f1946m
            if (r7 == 0) goto L13e
            r6 = r7[r10]
            int r6 = r0.xt(r6)
        L13e:
            boolean[] r7 = r0.up
            boolean r7 = r7[r10]
            if (r7 != 0) goto L1b3
            float r7 = r12.r()
            int r7 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
            if (r7 <= 0) goto L1b3
            float r2 = (float) r2
            float r6 = r12.r()
            float r6 = r6 * r15
            float r2 = r2 + r6
            int r6 = r3.tl
            int r6 = r6 + (-1)
            if (r1 != r6) goto L15c
            float r2 = r2 + r9
            r9 = 0
        L15c:
            int r6 = java.lang.Math.round(r2)
            int r7 = r12.g()
            if (r6 <= r7) goto L179
            int r6 = r12.g()
            boolean[] r2 = r0.up
            r2[r10] = r28
            float r2 = r3.oq
            float r7 = r12.r()
            float r2 = r2 - r7
            r3.oq = r2
            r7 = 1
            goto L193
        L179:
            float r7 = (float) r6
            float r2 = r2 - r7
            float r9 = r9 + r2
            double r13 = (double) r9
            int r2 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r2 <= 0) goto L18a
            int r6 = r6 + 1
            double r13 = r13 - r17
        L185:
            float r2 = (float) r13
            r9 = r2
        L187:
            r7 = r16
            goto L193
        L18a:
            int r2 = (r13 > r20 ? 1 : (r13 == r20 ? 0 : -1))
            if (r2 >= 0) goto L187
            int r6 = r6 + (-1)
            double r13 = r13 + r17
            goto L185
        L193:
            int r2 = r3.jy
            r13 = r24
            int r2 = r0.xt(r13, r12, r2)
            r14 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r14)
            r11.measure(r6, r2)
            int r14 = r11.getMeasuredWidth()
            int r16 = r11.getMeasuredHeight()
            r0.j(r10, r6, r2, r11)
            r2 = r14
            r6 = r16
            goto L1b7
        L1b3:
            r13 = r24
            r7 = r16
        L1b7:
            int r10 = r12.ws()
            int r6 = r6 + r10
            int r10 = r12.av()
            int r6 = r6 + r10
            com.bytedance.adsdk.ugeno.flexbox.j r10 = r0.f1947r
            int r10 = r10.j(r11)
            int r6 = r6 + r10
            int r6 = java.lang.Math.max(r8, r6)
            int r8 = r3.up
            int r10 = r12.jy()
            int r2 = r2 + r10
            int r10 = r12.az()
            int r2 = r2 + r10
            int r8 = r8 + r2
            r3.up = r8
            r2 = r6
        L1dc:
            int r6 = r3.ae
            int r6 = java.lang.Math.max(r6, r2)
            r3.ae = r6
            r8 = r2
            goto L1ef
        L1e6:
            r13 = r24
            r15 = r6
            r16 = r7
            r19 = 0
            r7 = r16
        L1ef:
            int r1 = r1 + 1
            r6 = r15
            r2 = 0
            goto L27
        L1f5:
            r13 = r24
            r16 = r7
            if (r16 == 0) goto L208
            int r1 = r3.up
            if (r5 == r1) goto L208
            r6 = 1
            r1 = r23
            r5 = r27
            r2 = r13
            r0.j(r1, r2, r3, r4, r5, r6)
        L208:
            return
    }

    private void j(android.view.View r7, int r8) {
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            com.bytedance.adsdk.ugeno.flexbox.xt r0 = (com.bytedance.adsdk.ugeno.flexbox.xt) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.ae()
            r4 = 1
            if (r1 >= r3) goto L1b
            int r1 = r0.ae()
        L19:
            r3 = 1
            goto L27
        L1b:
            int r3 = r0.g()
            if (r1 <= r3) goto L26
            int r1 = r0.g()
            goto L19
        L26:
            r3 = 0
        L27:
            int r5 = r0.tl()
            if (r2 >= r5) goto L32
            int r2 = r0.tl()
            goto L3e
        L32:
            int r5 = r0.oq()
            if (r2 <= r5) goto L3d
            int r2 = r0.oq()
            goto L3e
        L3d:
            r4 = r3
        L3e:
            if (r4 == 0) goto L50
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.j(r8, r1, r0, r7)
        L50:
            return
    }

    private void j(android.view.View r4, int r5, int r6) {
            r3 = this;
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            com.bytedance.adsdk.ugeno.flexbox.xt r0 = (com.bytedance.adsdk.ugeno.flexbox.xt) r0
            int r1 = r0.ws()
            int r5 = r5 - r1
            int r1 = r0.av()
            int r5 = r5 - r1
            com.bytedance.adsdk.ugeno.flexbox.j r1 = r3.f1947r
            int r1 = r1.j(r4)
            int r5 = r5 - r1
            int r1 = r0.tl()
            int r5 = java.lang.Math.max(r5, r1)
            int r0 = r0.oq()
            int r5 = java.lang.Math.min(r5, r0)
            long[] r0 = r3.f1946m
            if (r0 == 0) goto L32
            r1 = r0[r6]
            int r0 = r3.j(r1)
            goto L36
        L32:
            int r0 = r4.getMeasuredWidth()
        L36:
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
            r4.measure(r0, r5)
            r3.j(r6, r0, r5, r4)
            return
    }

    private void j(android.widget.CompoundButton r6) {
            r5 = this;
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            com.bytedance.adsdk.ugeno.flexbox.xt r0 = (com.bytedance.adsdk.ugeno.flexbox.xt) r0
            int r1 = r0.ae()
            int r2 = r0.tl()
            android.graphics.drawable.Drawable r6 = com.bytedance.adsdk.ugeno.m.up.j(r6)
            r3 = 0
            if (r6 != 0) goto L17
            r4 = 0
            goto L1b
        L17:
            int r4 = r6.getMinimumWidth()
        L1b:
            if (r6 != 0) goto L1e
            goto L22
        L1e:
            int r3 = r6.getMinimumHeight()
        L22:
            r6 = -1
            if (r1 != r6) goto L26
            r1 = r4
        L26:
            r0.j(r1)
            if (r2 != r6) goto L2c
            r2 = r3
        L2c:
            r0.xt(r2)
            return
    }

    private void j(java.util.List<com.bytedance.adsdk.ugeno.flexbox.cw> r1, com.bytedance.adsdk.ugeno.flexbox.cw r2, int r3, int r4) {
            r0 = this;
            r2.jy = r4
            com.bytedance.adsdk.ugeno.flexbox.j r4 = r0.f1947r
            r4.j(r2)
            r2.av = r3
            r1.add(r2)
            return
    }

    private boolean j(int r2, int r3, com.bytedance.adsdk.ugeno.flexbox.cw r4) {
            r1 = this;
            r0 = 1
            int r3 = r3 - r0
            if (r2 != r3) goto Lb
            int r2 = r4.xt()
            if (r2 == 0) goto Lb
            return r0
        Lb:
            r2 = 0
            return r2
    }

    private boolean j(android.view.View r3, int r4, int r5, int r6, int r7, com.bytedance.adsdk.ugeno.flexbox.xt r8, int r9, int r10, int r11) {
            r2 = this;
            com.bytedance.adsdk.ugeno.flexbox.j r0 = r2.f1947r
            int r0 = r0.getFlexWrap()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            boolean r8 = r8.qv()
            r0 = 1
            if (r8 == 0) goto L12
            return r0
        L12:
            if (r4 != 0) goto L15
            return r1
        L15:
            com.bytedance.adsdk.ugeno.flexbox.j r4 = r2.f1947r
            int r4 = r4.getMaxLine()
            r8 = -1
            if (r4 == r8) goto L22
            int r11 = r11 + r0
            if (r4 > r11) goto L22
            return r1
        L22:
            com.bytedance.adsdk.ugeno.flexbox.j r4 = r2.f1947r
            int r3 = r4.j(r3, r9, r10)
            if (r3 <= 0) goto L2b
            int r7 = r7 + r3
        L2b:
            int r6 = r6 + r7
            if (r5 >= r6) goto L2f
            return r0
        L2f:
            return r1
    }

    private int[] j(int r4, java.util.List<com.bytedance.adsdk.ugeno.flexbox.r.xt> r5, android.util.SparseIntArray r6) {
            r3 = this;
            java.util.Collections.sort(r5)
            r6.clear()
            int[] r4 = new int[r4]
            java.util.Iterator r5 = r5.iterator()
            r0 = 0
        Ld:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r5.next()
            com.bytedance.adsdk.ugeno.flexbox.r$xt r1 = (com.bytedance.adsdk.ugeno.flexbox.r.xt) r1
            int r2 = r1.j
            r4[r0] = r2
            int r1 = r1.xt
            r6.append(r2, r1)
            int r0 = r0 + 1
            goto Ld
        L25:
            return r4
    }

    private int m(com.bytedance.adsdk.ugeno.flexbox.xt r1, boolean r2) {
            r0 = this;
            if (r2 == 0) goto L7
            int r1 = r1.av()
            return r1
        L7:
            int r1 = r1.az()
            return r1
    }

    private int r(com.bytedance.adsdk.ugeno.flexbox.xt r1, boolean r2) {
            r0 = this;
            if (r2 == 0) goto L7
            int r1 = r1.az()
            return r1
        L7:
            int r1 = r1.av()
            return r1
    }

    private int r(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L9
            com.bytedance.adsdk.ugeno.flexbox.j r1 = r0.f1947r
            int r1 = r1.getPaddingBottom()
            return r1
        L9:
            com.bytedance.adsdk.ugeno.flexbox.j r1 = r0.f1947r
            int r1 = r1.getPaddingEnd()
            return r1
    }

    private int up(com.bytedance.adsdk.ugeno.flexbox.xt r1, boolean r2) {
            r0 = this;
            if (r2 == 0) goto L7
            int r1 = r1.ws()
            return r1
        L7:
            int r1 = r1.jy()
            return r1
    }

    private int xt(int r4, com.bytedance.adsdk.ugeno.flexbox.xt r5, int r6) {
            r3 = this;
            com.bytedance.adsdk.ugeno.flexbox.j r0 = r3.f1947r
            int r1 = r0.getPaddingTop()
            com.bytedance.adsdk.ugeno.flexbox.j r2 = r3.f1947r
            int r2 = r2.getPaddingBottom()
            int r1 = r1 + r2
            int r2 = r5.ws()
            int r1 = r1 + r2
            int r2 = r5.av()
            int r1 = r1 + r2
            int r1 = r1 + r6
            int r6 = r5.xt()
            int r4 = r0.xt(r4, r1, r6)
            int r6 = android.view.View.MeasureSpec.getSize(r4)
            int r0 = r5.oq()
            if (r6 <= r0) goto L37
            int r5 = r5.oq()
            int r4 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r4)
            return r4
        L37:
            int r0 = r5.tl()
            if (r6 >= r0) goto L49
            int r5 = r5.tl()
            int r4 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r4)
        L49:
            return r4
    }

    private int xt(android.view.View r1, boolean r2) {
            r0 = this;
            if (r2 == 0) goto L7
            int r1 = r1.getMeasuredHeight()
            return r1
        L7:
            int r1 = r1.getMeasuredWidth()
            return r1
    }

    private int xt(com.bytedance.adsdk.ugeno.flexbox.xt r1, boolean r2) {
            r0 = this;
            if (r2 == 0) goto L7
            int r1 = r1.xt()
            return r1
        L7:
            int r1 = r1.j()
            return r1
    }

    private int xt(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L9
            com.bytedance.adsdk.ugeno.flexbox.j r1 = r0.f1947r
            int r1 = r1.getPaddingEnd()
            return r1
        L9:
            com.bytedance.adsdk.ugeno.flexbox.j r1 = r0.f1947r
            int r1 = r1.getPaddingBottom()
            return r1
    }

    private java.util.List<com.bytedance.adsdk.ugeno.flexbox.r.xt> xt(int r6) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
            r1 = 0
        L6:
            if (r1 >= r6) goto L28
            com.bytedance.adsdk.ugeno.flexbox.j r2 = r5.f1947r
            android.view.View r2 = r2.j(r1)
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            com.bytedance.adsdk.ugeno.flexbox.xt r2 = (com.bytedance.adsdk.ugeno.flexbox.xt) r2
            com.bytedance.adsdk.ugeno.flexbox.r$xt r3 = new com.bytedance.adsdk.ugeno.flexbox.r$xt
            r4 = 0
            r3.<init>(r4)
            int r2 = r2.cw()
            r3.xt = r2
            r3.j = r1
            r0.add(r3)
            int r1 = r1 + 1
            goto L6
        L28:
            return r0
    }

    private void xt(int r24, int r25, com.bytedance.adsdk.ugeno.flexbox.cw r26, int r27, int r28, boolean r29) {
            r23 = this;
            r0 = r23
            r3 = r26
            r4 = r27
            int r1 = r3.up
            float r2 = r3.qv
            r5 = 0
            int r6 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r6 <= 0) goto L1fe
            if (r4 <= r1) goto L13
            goto L1fe
        L13:
            int r6 = r1 - r4
            float r6 = (float) r6
            float r6 = r6 / r2
            int r2 = r3.f1943m
            int r2 = r28 + r2
            r3.up = r2
            if (r29 != 0) goto L23
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3.ae = r2
        L23:
            r2 = 0
            r7 = 0
            r8 = 0
            r9 = 0
        L27:
            int r10 = r3.tl
            if (r2 >= r10) goto L1e9
            int r10 = r3.az
            int r10 = r10 + r2
            com.bytedance.adsdk.ugeno.flexbox.j r11 = r0.f1947r
            android.view.View r11 = r11.xt(r10)
            if (r11 == 0) goto L1da
            int r12 = r11.getVisibility()
            r13 = 8
            if (r12 == r13) goto L1da
            android.view.ViewGroup$LayoutParams r12 = r11.getLayoutParams()
            com.bytedance.adsdk.ugeno.flexbox.xt r12 = (com.bytedance.adsdk.ugeno.flexbox.xt) r12
            com.bytedance.adsdk.ugeno.flexbox.j r13 = r0.f1947r
            int r13 = r13.getFlexDirection()
            r17 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r19 = 1065353216(0x3f800000, float:1.0)
            r20 = 0
            r5 = 1
            if (r13 == 0) goto L55
            if (r13 != r5) goto L5d
        L55:
            r14 = r24
            r29 = 1
            r21 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            goto L117
        L5d:
            int r13 = r11.getMeasuredHeight()
            r29 = 1
            long[] r5 = r0.f1946m
            r21 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            if (r5 == 0) goto L6f
            r14 = r5[r10]
            int r13 = r0.xt(r14)
        L6f:
            int r5 = r11.getMeasuredWidth()
            long[] r14 = r0.f1946m
            if (r14 == 0) goto L7d
            r4 = r14[r10]
            int r5 = r0.j(r4)
        L7d:
            boolean[] r4 = r0.up
            boolean r4 = r4[r10]
            if (r4 != 0) goto Lec
            float r4 = r12.up()
            int r4 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r4 <= 0) goto Lec
            float r4 = (float) r13
            float r5 = r12.up()
            float r5 = r5 * r6
            float r4 = r4 - r5
            int r5 = r3.tl
            int r5 = r5 + (-1)
            if (r2 != r5) goto L9b
            float r4 = r4 + r9
            r9 = 0
        L9b:
            int r5 = java.lang.Math.round(r4)
            int r13 = r12.tl()
            if (r5 >= r13) goto Lb8
            int r5 = r12.tl()
            boolean[] r4 = r0.up
            r4[r10] = r29
            float r4 = r3.qv
            float r7 = r12.up()
            float r4 = r4 - r7
            r3.qv = r4
            r7 = 1
            goto Lcd
        Lb8:
            float r13 = (float) r5
            float r4 = r4 - r13
            float r9 = r9 + r4
            double r13 = (double) r9
            int r4 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r4 <= 0) goto Lc5
            int r5 = r5 + 1
            float r9 = r9 - r19
            goto Lcd
        Lc5:
            int r4 = (r13 > r21 ? 1 : (r13 == r21 ? 0 : -1))
            if (r4 >= 0) goto Lcd
            int r5 = r5 + (-1)
            float r9 = r9 + r19
        Lcd:
            int r4 = r3.jy
            r14 = r24
            int r4 = r0.j(r14, r12, r4)
            r13 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r13)
            r11.measure(r4, r5)
            int r13 = r11.getMeasuredWidth()
            int r15 = r11.getMeasuredHeight()
            r0.j(r10, r4, r5, r11)
            r5 = r13
            r13 = r15
            goto Lee
        Lec:
            r14 = r24
        Lee:
            int r4 = r12.jy()
            int r5 = r5 + r4
            int r4 = r12.az()
            int r5 = r5 + r4
            com.bytedance.adsdk.ugeno.flexbox.j r4 = r0.f1947r
            int r4 = r4.j(r11)
            int r5 = r5 + r4
            int r4 = java.lang.Math.max(r8, r5)
            int r5 = r3.up
            int r8 = r12.ws()
            int r13 = r13 + r8
            int r8 = r12.av()
            int r13 = r13 + r8
            int r5 = r5 + r13
            r3.up = r5
            r15 = r6
            r6 = r25
            goto L1d0
        L117:
            int r4 = r11.getMeasuredWidth()
            long[] r5 = r0.f1946m
            if (r5 == 0) goto L125
            r4 = r5[r10]
            int r4 = r0.j(r4)
        L125:
            int r5 = r11.getMeasuredHeight()
            long[] r13 = r0.f1946m
            r15 = r6
            if (r13 == 0) goto L134
            r5 = r13[r10]
            int r5 = r0.xt(r5)
        L134:
            boolean[] r6 = r0.up
            boolean r6 = r6[r10]
            if (r6 != 0) goto L1a9
            float r6 = r12.up()
            int r6 = (r6 > r20 ? 1 : (r6 == r20 ? 0 : -1))
            if (r6 <= 0) goto L1a9
            float r4 = (float) r4
            float r5 = r12.up()
            float r6 = r15 * r5
            float r4 = r4 - r6
            int r5 = r3.tl
            int r5 = r5 + (-1)
            if (r2 != r5) goto L152
            float r4 = r4 + r9
            r9 = 0
        L152:
            int r5 = java.lang.Math.round(r4)
            int r6 = r12.ae()
            if (r5 >= r6) goto L16f
            int r5 = r12.ae()
            boolean[] r4 = r0.up
            r4[r10] = r29
            float r4 = r3.qv
            float r6 = r12.up()
            float r4 = r4 - r6
            r3.qv = r4
            r7 = 1
            goto L189
        L16f:
            float r6 = (float) r5
            float r4 = r4 - r6
            float r9 = r9 + r4
            r29 = r5
            double r4 = (double) r9
            int r6 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r6 <= 0) goto L17e
            int r5 = r29 + 1
            float r9 = r9 - r19
            goto L189
        L17e:
            int r6 = (r4 > r21 ? 1 : (r4 == r21 ? 0 : -1))
            if (r6 >= 0) goto L187
            int r5 = r29 + (-1)
            float r9 = r9 + r19
            goto L189
        L187:
            r5 = r29
        L189:
            int r4 = r3.jy
            r6 = r25
            int r4 = r0.xt(r6, r12, r4)
            r13 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r13)
            r11.measure(r5, r4)
            int r13 = r11.getMeasuredWidth()
            int r16 = r11.getMeasuredHeight()
            r0.j(r10, r5, r4, r11)
            r4 = r13
            r5 = r16
            goto L1ab
        L1a9:
            r6 = r25
        L1ab:
            int r10 = r12.ws()
            int r5 = r5 + r10
            int r10 = r12.av()
            int r5 = r5 + r10
            com.bytedance.adsdk.ugeno.flexbox.j r10 = r0.f1947r
            int r10 = r10.j(r11)
            int r5 = r5 + r10
            int r5 = java.lang.Math.max(r8, r5)
            int r8 = r3.up
            int r10 = r12.jy()
            int r4 = r4 + r10
            int r10 = r12.az()
            int r4 = r4 + r10
            int r8 = r8 + r4
            r3.up = r8
            r4 = r5
        L1d0:
            int r5 = r3.ae
            int r5 = java.lang.Math.max(r5, r4)
            r3.ae = r5
            r8 = r4
            goto L1e1
        L1da:
            r14 = r24
            r15 = r6
            r20 = 0
            r6 = r25
        L1e1:
            int r2 = r2 + 1
            r4 = r27
            r6 = r15
            r5 = 0
            goto L27
        L1e9:
            r14 = r24
            r6 = r25
            if (r7 == 0) goto L1fe
            int r2 = r3.up
            if (r1 == r2) goto L1fe
            r6 = 1
            r2 = r25
            r4 = r27
            r5 = r28
            r1 = r14
            r0.xt(r1, r2, r3, r4, r5, r6)
        L1fe:
            return
    }

    private void xt(android.view.View r4, int r5, int r6) {
            r3 = this;
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            com.bytedance.adsdk.ugeno.flexbox.xt r0 = (com.bytedance.adsdk.ugeno.flexbox.xt) r0
            int r1 = r0.jy()
            int r5 = r5 - r1
            int r1 = r0.az()
            int r5 = r5 - r1
            com.bytedance.adsdk.ugeno.flexbox.j r1 = r3.f1947r
            int r1 = r1.j(r4)
            int r5 = r5 - r1
            int r1 = r0.ae()
            int r5 = java.lang.Math.max(r5, r1)
            int r0 = r0.g()
            int r5 = java.lang.Math.min(r5, r0)
            long[] r0 = r3.f1946m
            if (r0 == 0) goto L32
            r1 = r0[r6]
            int r0 = r3.xt(r1)
            goto L36
        L32:
            int r0 = r4.getMeasuredHeight()
        L36:
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
            r4.measure(r5, r0)
            r3.j(r6, r5, r0, r4)
            return
    }

    int j(long r1) {
            r0 = this;
            int r2 = (int) r1
            return r2
    }

    void j() {
            r1 = this;
            r0 = 0
            r1.j(r0)
            return
    }

    void j(int r17) {
            r16 = this;
            r0 = r16
            r1 = r17
            com.bytedance.adsdk.ugeno.flexbox.j r2 = r0.f1947r
            int r2 = r2.getFlexItemCount()
            if (r1 < r2) goto Le
            goto Lf8
        Le:
            com.bytedance.adsdk.ugeno.flexbox.j r2 = r0.f1947r
            int r2 = r2.getFlexDirection()
            com.bytedance.adsdk.ugeno.flexbox.j r3 = r0.f1947r
            int r3 = r3.getAlignItems()
            java.lang.String r4 = "Invalid flex direction: "
            r7 = 4
            r8 = 1
            if (r3 != r7) goto L97
            int[] r3 = r0.j
            if (r3 == 0) goto L27
            r1 = r3[r1]
            goto L28
        L27:
            r1 = 0
        L28:
            com.bytedance.adsdk.ugeno.flexbox.j r3 = r0.f1947r
            java.util.List r3 = r3.getFlexLinesInternal()
            int r10 = r3.size()
        L32:
            if (r1 >= r10) goto Lf8
            java.lang.Object r11 = r3.get(r1)
            com.bytedance.adsdk.ugeno.flexbox.cw r11 = (com.bytedance.adsdk.ugeno.flexbox.cw) r11
            int r12 = r11.tl
            r13 = 0
        L3d:
            if (r13 >= r12) goto L94
            int r14 = r11.az
            int r14 = r14 + r13
            com.bytedance.adsdk.ugeno.flexbox.j r15 = r0.f1947r
            int r15 = r15.getFlexItemCount()
            if (r13 >= r15) goto L91
            com.bytedance.adsdk.ugeno.flexbox.j r15 = r0.f1947r
            android.view.View r15 = r15.xt(r14)
            if (r15 == 0) goto L91
            int r9 = r15.getVisibility()
            r5 = 8
            if (r9 == r5) goto L91
            android.view.ViewGroup$LayoutParams r5 = r15.getLayoutParams()
            com.bytedance.adsdk.ugeno.flexbox.xt r5 = (com.bytedance.adsdk.ugeno.flexbox.xt) r5
            int r9 = r5.m()
            r6 = -1
            if (r9 == r6) goto L6d
            int r5 = r5.m()
            if (r5 != r7) goto L91
        L6d:
            if (r2 == 0) goto L8c
            if (r2 == r8) goto L8c
            r5 = 2
            if (r2 == r5) goto L86
            r5 = 3
            if (r2 != r5) goto L78
            goto L86
        L78:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = r4.concat(r2)
            r1.<init>(r2)
            throw r1
        L86:
            int r5 = r11.ae
            r0.xt(r15, r5, r14)
            goto L91
        L8c:
            int r5 = r11.ae
            r0.j(r15, r5, r14)
        L91:
            int r13 = r13 + 1
            goto L3d
        L94:
            int r1 = r1 + 1
            goto L32
        L97:
            com.bytedance.adsdk.ugeno.flexbox.j r1 = r0.f1947r
            java.util.List r1 = r1.getFlexLinesInternal()
            java.util.Iterator r1 = r1.iterator()
        La1:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lf8
            java.lang.Object r3 = r1.next()
            com.bytedance.adsdk.ugeno.flexbox.cw r3 = (com.bytedance.adsdk.ugeno.flexbox.cw) r3
            java.util.List<java.lang.Integer> r5 = r3.ws
            java.util.Iterator r5 = r5.iterator()
        Lb3:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto La1
            java.lang.Object r6 = r5.next()
            java.lang.Integer r6 = (java.lang.Integer) r6
            com.bytedance.adsdk.ugeno.flexbox.j r7 = r0.f1947r
            int r9 = r6.intValue()
            android.view.View r7 = r7.xt(r9)
            if (r2 == 0) goto Lec
            if (r2 == r8) goto Lec
            r9 = 2
            r10 = 3
            if (r2 == r9) goto Le2
            if (r2 != r10) goto Ld4
            goto Le2
        Ld4:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = r4.concat(r2)
            r1.<init>(r2)
            throw r1
        Le2:
            int r11 = r3.ae
            int r6 = r6.intValue()
            r0.xt(r7, r11, r6)
            goto Lb3
        Lec:
            r9 = 2
            r10 = 3
            int r11 = r3.ae
            int r6 = r6.intValue()
            r0.j(r7, r11, r6)
            goto Lb3
        Lf8:
            return
    }

    void j(int r2, int r3) {
            r1 = this;
            r0 = 0
            r1.j(r2, r3, r0)
            return
    }

    void j(int r10, int r11, int r12) {
            r9 = this;
            com.bytedance.adsdk.ugeno.flexbox.j r0 = r9.f1947r
            int r0 = r0.getFlexItemCount()
            r9.cw(r0)
            com.bytedance.adsdk.ugeno.flexbox.j r0 = r9.f1947r
            int r0 = r0.getFlexItemCount()
            if (r12 < r0) goto L13
            goto Lbe
        L13:
            com.bytedance.adsdk.ugeno.flexbox.j r0 = r9.f1947r
            int r0 = r0.getFlexDirection()
            com.bytedance.adsdk.ugeno.flexbox.j r1 = r9.f1947r
            int r1 = r1.getFlexDirection()
            r2 = 1073741824(0x40000000, float:2.0)
            if (r1 == 0) goto L5e
            r3 = 1
            if (r1 == r3) goto L5e
            r3 = 2
            if (r1 == r3) goto L3d
            r3 = 3
            if (r1 != r3) goto L2d
            goto L3d
        L2d:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Invalid flex direction: "
            java.lang.String r12 = java.lang.String.valueOf(r0)
            java.lang.String r11 = r11.concat(r12)
            r10.<init>(r11)
            throw r10
        L3d:
            int r0 = android.view.View.MeasureSpec.getMode(r11)
            int r1 = android.view.View.MeasureSpec.getSize(r11)
            if (r0 != r2) goto L48
            goto L4e
        L48:
            com.bytedance.adsdk.ugeno.flexbox.j r0 = r9.f1947r
            int r1 = r0.getLargestMainSize()
        L4e:
            com.bytedance.adsdk.ugeno.flexbox.j r0 = r9.f1947r
            int r0 = r0.getPaddingTop()
            com.bytedance.adsdk.ugeno.flexbox.j r2 = r9.f1947r
            int r2 = r2.getPaddingBottom()
        L5a:
            int r0 = r0 + r2
            r7 = r0
            r6 = r1
            goto L81
        L5e:
            int r0 = android.view.View.MeasureSpec.getMode(r10)
            int r1 = android.view.View.MeasureSpec.getSize(r10)
            com.bytedance.adsdk.ugeno.flexbox.j r3 = r9.f1947r
            int r3 = r3.getLargestMainSize()
            if (r0 != r2) goto L6f
            goto L74
        L6f:
            int r0 = java.lang.Math.min(r3, r1)
            r1 = r0
        L74:
            com.bytedance.adsdk.ugeno.flexbox.j r0 = r9.f1947r
            int r0 = r0.getPaddingLeft()
            com.bytedance.adsdk.ugeno.flexbox.j r2 = r9.f1947r
            int r2 = r2.getPaddingRight()
            goto L5a
        L81:
            int[] r0 = r9.j
            if (r0 == 0) goto L88
            r12 = r0[r12]
            goto L89
        L88:
            r12 = 0
        L89:
            com.bytedance.adsdk.ugeno.flexbox.j r0 = r9.f1947r
            java.util.List r0 = r0.getFlexLinesInternal()
            int r1 = r0.size()
        L93:
            if (r12 >= r1) goto Lbe
            java.lang.Object r2 = r0.get(r12)
            r5 = r2
            com.bytedance.adsdk.ugeno.flexbox.cw r5 = (com.bytedance.adsdk.ugeno.flexbox.cw) r5
            int r2 = r5.up
            if (r2 >= r6) goto Lac
            boolean r3 = r5.i
            if (r3 == 0) goto Lac
            r8 = 0
            r2 = r9
            r3 = r10
            r4 = r11
            r2.j(r3, r4, r5, r6, r7, r8)
            goto Lb9
        Lac:
            r3 = r10
            r4 = r11
            if (r2 <= r6) goto Lb9
            boolean r10 = r5.f1945w
            if (r10 == 0) goto Lb9
            r8 = 0
            r2 = r9
            r2.xt(r3, r4, r5, r6, r7, r8)
        Lb9:
            int r12 = r12 + 1
            r10 = r3
            r11 = r4
            goto L93
        Lbe:
            return
    }

    void j(android.view.View r6, com.bytedance.adsdk.ugeno.flexbox.cw r7, int r8, int r9, int r10, int r11) {
            r5 = this;
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            com.bytedance.adsdk.ugeno.flexbox.xt r0 = (com.bytedance.adsdk.ugeno.flexbox.xt) r0
            com.bytedance.adsdk.ugeno.flexbox.j r1 = r5.f1947r
            int r1 = r1.getAlignItems()
            int r2 = r0.m()
            r3 = -1
            if (r2 == r3) goto L17
            int r1 = r0.m()
        L17:
            int r2 = r7.ae
            r3 = 2
            if (r1 == 0) goto Lc2
            r4 = 1
            if (r1 == r4) goto L8b
            if (r1 == r3) goto L5f
            r2 = 3
            if (r1 == r2) goto L28
            r7 = 4
            if (r1 == r7) goto Lc2
            return
        L28:
            com.bytedance.adsdk.ugeno.flexbox.j r1 = r5.f1947r
            int r1 = r1.getFlexWrap()
            if (r1 == r3) goto L45
            int r7 = r7.vl
            int r1 = r6.getBaseline()
            int r7 = r7 - r1
            int r0 = r0.ws()
            int r7 = java.lang.Math.max(r7, r0)
            int r9 = r9 + r7
            int r11 = r11 + r7
            r6.layout(r8, r9, r10, r11)
            return
        L45:
            int r7 = r7.vl
            int r1 = r6.getMeasuredHeight()
            int r7 = r7 - r1
            int r1 = r6.getBaseline()
            int r7 = r7 + r1
            int r0 = r0.av()
            int r7 = java.lang.Math.max(r7, r0)
            int r9 = r9 - r7
            int r11 = r11 - r7
            r6.layout(r8, r9, r10, r11)
            return
        L5f:
            int r7 = r6.getMeasuredHeight()
            int r2 = r2 - r7
            int r7 = r0.ws()
            int r2 = r2 + r7
            int r7 = r0.av()
            int r2 = r2 - r7
            int r2 = r2 / r3
            com.bytedance.adsdk.ugeno.flexbox.j r7 = r5.f1947r
            int r7 = r7.getFlexWrap()
            if (r7 == r3) goto L81
            int r9 = r9 + r2
            int r7 = r6.getMeasuredHeight()
            int r7 = r7 + r9
            r6.layout(r8, r9, r10, r7)
            return
        L81:
            int r9 = r9 - r2
            int r7 = r6.getMeasuredHeight()
            int r7 = r7 + r9
            r6.layout(r8, r9, r10, r7)
            return
        L8b:
            com.bytedance.adsdk.ugeno.flexbox.j r7 = r5.f1947r
            int r7 = r7.getFlexWrap()
            if (r7 == r3) goto La8
            int r9 = r9 + r2
            int r7 = r6.getMeasuredHeight()
            int r7 = r9 - r7
            int r11 = r0.av()
            int r7 = r7 - r11
            int r11 = r0.av()
            int r9 = r9 - r11
            r6.layout(r8, r7, r10, r9)
            return
        La8:
            int r9 = r9 - r2
            int r7 = r6.getMeasuredHeight()
            int r9 = r9 + r7
            int r7 = r0.ws()
            int r9 = r9 + r7
            int r11 = r11 - r2
            int r7 = r6.getMeasuredHeight()
            int r11 = r11 + r7
            int r7 = r0.ws()
            int r11 = r11 + r7
            r6.layout(r8, r9, r10, r11)
            return
        Lc2:
            com.bytedance.adsdk.ugeno.flexbox.j r7 = r5.f1947r
            int r7 = r7.getFlexWrap()
            if (r7 == r3) goto Ld8
            int r7 = r0.ws()
            int r9 = r9 + r7
            int r7 = r0.ws()
            int r11 = r11 + r7
            r6.layout(r8, r9, r10, r11)
            return
        Ld8:
            int r7 = r0.av()
            int r9 = r9 - r7
            int r7 = r0.av()
            int r11 = r11 - r7
            r6.layout(r8, r9, r10, r11)
            return
    }

    void j(android.view.View r5, com.bytedance.adsdk.ugeno.flexbox.cw r6, boolean r7, int r8, int r9, int r10, int r11) {
            r4 = this;
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            com.bytedance.adsdk.ugeno.flexbox.xt r0 = (com.bytedance.adsdk.ugeno.flexbox.xt) r0
            com.bytedance.adsdk.ugeno.flexbox.j r1 = r4.f1947r
            int r1 = r1.getAlignItems()
            int r2 = r0.m()
            r3 = -1
            if (r2 == r3) goto L17
            int r1 = r0.m()
        L17:
            int r6 = r6.ae
            if (r1 == 0) goto L82
            r2 = 1
            if (r1 == r2) goto L4c
            r2 = 2
            if (r1 == r2) goto L28
            r6 = 3
            if (r1 == r6) goto L82
            r6 = 4
            if (r1 == r6) goto L82
            return
        L28:
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r1 = r5.getMeasuredWidth()
            int r6 = r6 - r1
            int r1 = com.bytedance.adsdk.ugeno.m.m.j(r0)
            int r6 = r6 + r1
            int r0 = com.bytedance.adsdk.ugeno.m.m.xt(r0)
            int r6 = r6 - r0
            int r6 = r6 / r2
            if (r7 != 0) goto L46
            int r8 = r8 + r6
            int r10 = r10 + r6
            r5.layout(r8, r9, r10, r11)
            return
        L46:
            int r8 = r8 - r6
            int r10 = r10 - r6
            r5.layout(r8, r9, r10, r11)
            return
        L4c:
            if (r7 != 0) goto L68
            int r8 = r8 + r6
            int r7 = r5.getMeasuredWidth()
            int r8 = r8 - r7
            int r7 = r0.az()
            int r8 = r8 - r7
            int r10 = r10 + r6
            int r6 = r5.getMeasuredWidth()
            int r10 = r10 - r6
            int r6 = r0.az()
            int r10 = r10 - r6
            r5.layout(r8, r9, r10, r11)
            return
        L68:
            int r8 = r8 - r6
            int r7 = r5.getMeasuredWidth()
            int r8 = r8 + r7
            int r7 = r0.jy()
            int r8 = r8 + r7
            int r10 = r10 - r6
            int r6 = r5.getMeasuredWidth()
            int r10 = r10 + r6
            int r6 = r0.jy()
            int r10 = r10 + r6
            r5.layout(r8, r9, r10, r11)
            return
        L82:
            if (r7 != 0) goto L92
            int r6 = r0.jy()
            int r8 = r8 + r6
            int r6 = r0.jy()
            int r10 = r10 + r6
            r5.layout(r8, r9, r10, r11)
            return
        L92:
            int r6 = r0.az()
            int r8 = r8 - r6
            int r6 = r0.az()
            int r10 = r10 - r6
            r5.layout(r8, r9, r10, r11)
            return
    }

    void j(com.bytedance.adsdk.ugeno.flexbox.r.j r9, int r10, int r11) {
            r8 = this;
            r6 = -1
            r7 = 0
            r4 = 2147483647(0x7fffffff, float:NaN)
            r5 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r0.j(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    void j(com.bytedance.adsdk.ugeno.flexbox.r.j r30, int r31, int r32, int r33, int r34, int r35, java.util.List<com.bytedance.adsdk.ugeno.flexbox.cw> r36) {
            r29 = this;
            r0 = r29
            r10 = r30
            r11 = r31
            r12 = r32
            r13 = r35
            com.bytedance.adsdk.ugeno.flexbox.j r1 = r0.f1947r
            boolean r14 = r1.j()
            int r2 = android.view.View.MeasureSpec.getMode(r11)
            int r3 = android.view.View.MeasureSpec.getSize(r11)
            if (r36 != 0) goto L21
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r15 = r1
            goto L23
        L21:
            r15 = r36
        L23:
            r10.j = r15
            r1 = -1
            if (r13 != r1) goto L2a
            r6 = 1
            goto L2b
        L2a:
            r6 = 0
        L2b:
            int r7 = r0.j(r14)
            int r8 = r0.xt(r14)
            int r16 = r0.cw(r14)
            int r17 = r0.r(r14)
            com.bytedance.adsdk.ugeno.flexbox.cw r9 = new com.bytedance.adsdk.ugeno.flexbox.cw
            r9.<init>()
            r1 = r34
            r9.az = r1
            int r7 = r7 + r8
            r9.up = r7
            com.bytedance.adsdk.ugeno.flexbox.j r8 = r0.f1947r
            int r8 = r8.getFlexItemCount()
            r18 = -2147483648(0xffffffff80000000, float:-0.0)
            r19 = r6
            r6 = r9
            r9 = 0
            r20 = 0
            r21 = 0
            r22 = -2147483648(0xffffffff80000000, float:-0.0)
        L59:
            if (r1 >= r8) goto L335
            com.bytedance.adsdk.ugeno.flexbox.j r5 = r0.f1947r
            android.view.View r5 = r5.xt(r1)
            if (r5 != 0) goto L71
            boolean r5 = r0.j(r1, r8, r6)
            if (r5 == 0) goto L6c
            r0.j(r15, r6, r1, r9)
        L6c:
            r25 = r7
            r24 = 1
            goto L92
        L71:
            r24 = 1
            int r4 = r5.getVisibility()
            r25 = r7
            r7 = 8
            if (r4 != r7) goto La2
            int r4 = r6.g
            int r4 = r4 + 1
            r6.g = r4
            int r4 = r6.tl
            int r4 = r4 + 1
            r6.tl = r4
            boolean r4 = r0.j(r1, r8, r6)
            if (r4 == 0) goto L92
            r0.j(r15, r6, r1, r9)
        L92:
            r7 = r1
            r27 = r2
            r1 = r8
            r11 = r9
            r8 = r14
            r10 = r25
            r14 = -1
            r23 = 0
            r9 = r6
            r6 = r33
            goto L325
        La2:
            boolean r4 = r5 instanceof android.widget.CompoundButton
            if (r4 == 0) goto Lac
            r4 = r5
            android.widget.CompoundButton r4 = (android.widget.CompoundButton) r4
            r0.j(r4)
        Lac:
            android.view.ViewGroup$LayoutParams r4 = r5.getLayoutParams()
            com.bytedance.adsdk.ugeno.flexbox.xt r4 = (com.bytedance.adsdk.ugeno.flexbox.xt) r4
            int r7 = r4.m()
            r26 = r8
            r8 = 4
            if (r7 != r8) goto Lc4
            java.util.List<java.lang.Integer> r7 = r6.ws
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            r7.add(r8)
        Lc4:
            int r7 = r0.j(r4, r14)
            float r8 = r4.vl()
            r27 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r8 = (r8 > r27 ? 1 : (r8 == r27 ? 0 : -1))
            if (r8 == 0) goto Le1
            r8 = 1073741824(0x40000000, float:2.0)
            if (r2 != r8) goto Le1
            float r7 = (float) r3
            float r8 = r4.vl()
            float r7 = r7 * r8
            int r7 = java.lang.Math.round(r7)
        Le1:
            if (r14 == 0) goto L11e
            com.bytedance.adsdk.ugeno.flexbox.j r8 = r0.f1947r
            r27 = r2
            r2 = 1
            int r24 = r0.cw(r4, r2)
            int r24 = r25 + r24
            int r28 = r0.r(r4, r2)
            int r2 = r24 + r28
            int r2 = r8.j(r11, r2, r7)
            com.bytedance.adsdk.ugeno.flexbox.j r7 = r0.f1947r
            int r8 = r16 + r17
            r24 = r3
            r3 = 1
            int r28 = r0.up(r4, r3)
            int r8 = r8 + r28
            int r28 = r0.m(r4, r3)
            int r8 = r8 + r28
            int r8 = r8 + r9
            r28 = r9
            int r9 = r0.xt(r4, r3)
            int r7 = r7.xt(r12, r8, r9)
            r5.measure(r2, r7)
            r0.j(r1, r2, r7, r5)
            r9 = 0
            goto L159
        L11e:
            r27 = r2
            r24 = r3
            r28 = r9
            r3 = 1
            com.bytedance.adsdk.ugeno.flexbox.j r2 = r0.f1947r
            int r8 = r16 + r17
            r9 = 0
            int r23 = r0.up(r4, r9)
            int r8 = r8 + r23
            int r23 = r0.m(r4, r9)
            int r8 = r8 + r23
            int r8 = r8 + r28
            int r3 = r0.xt(r4, r9)
            int r2 = r2.j(r12, r8, r3)
            com.bytedance.adsdk.ugeno.flexbox.j r3 = r0.f1947r
            int r8 = r0.cw(r4, r9)
            int r8 = r25 + r8
            int r23 = r0.r(r4, r9)
            int r8 = r8 + r23
            int r3 = r3.xt(r11, r8, r7)
            r5.measure(r2, r3)
            r0.j(r1, r2, r3, r5)
            r2 = r3
        L159:
            r0.j(r5, r1)
            int r3 = r5.getMeasuredState()
            r7 = r20
            int r20 = android.view.View.combineMeasuredStates(r7, r3)
            int r3 = r6.up
            int r7 = r0.j(r5, r14)
            int r8 = r0.cw(r4, r14)
            int r7 = r7 + r8
            int r8 = r0.r(r4, r14)
            int r7 = r7 + r8
            r23 = 0
            int r9 = r15.size()
            r34 = r7
            r7 = r1
            r1 = r5
            r5 = r34
            r13 = r2
            r34 = r6
            r8 = r21
            r10 = r25
            r2 = r27
            r11 = r28
            r6 = r4
            r21 = r14
            r14 = -1
            r4 = r3
            r3 = r24
            boolean r4 = r0.j(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r4 == 0) goto L21f
            int r2 = r34.xt()
            if (r2 <= 0) goto L1b1
            if (r7 <= 0) goto L1a7
            int r5 = r7 + (-1)
        L1a4:
            r9 = r34
            goto L1a9
        L1a7:
            r5 = 0
            goto L1a4
        L1a9:
            r0.j(r15, r9, r5, r11)
            int r2 = r9.ae
            int r9 = r11 + r2
            goto L1b2
        L1b1:
            r9 = r11
        L1b2:
            if (r21 == 0) goto L1e1
            int r2 = r6.xt()
            if (r2 != r14) goto L20d
            com.bytedance.adsdk.ugeno.flexbox.j r2 = r0.f1947r
            int r4 = r2.getPaddingTop()
            com.bytedance.adsdk.ugeno.flexbox.j r5 = r0.f1947r
            int r5 = r5.getPaddingBottom()
            int r4 = r4 + r5
            int r5 = r6.ws()
            int r4 = r4 + r5
            int r5 = r6.av()
            int r4 = r4 + r5
            int r4 = r4 + r9
            int r5 = r6.xt()
            int r2 = r2.xt(r12, r4, r5)
            r1.measure(r13, r2)
            r0.j(r1, r7)
            goto L20d
        L1e1:
            int r2 = r6.j()
            if (r2 != r14) goto L20d
            com.bytedance.adsdk.ugeno.flexbox.j r2 = r0.f1947r
            int r4 = r2.getPaddingLeft()
            com.bytedance.adsdk.ugeno.flexbox.j r5 = r0.f1947r
            int r5 = r5.getPaddingRight()
            int r4 = r4 + r5
            int r5 = r6.jy()
            int r4 = r4 + r5
            int r5 = r6.az()
            int r4 = r4 + r5
            int r4 = r4 + r9
            int r5 = r6.j()
            int r2 = r2.j(r12, r4, r5)
            r1.measure(r2, r13)
            r0.j(r1, r7)
        L20d:
            com.bytedance.adsdk.ugeno.flexbox.cw r2 = new com.bytedance.adsdk.ugeno.flexbox.cw
            r2.<init>()
            r4 = 1
            r2.tl = r4
            r2.up = r10
            r2.az = r7
            r11 = r9
            r5 = 0
            r9 = r2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L22b
        L21f:
            r9 = r34
            r4 = 1
            int r2 = r9.tl
            int r2 = r2 + r4
            r9.tl = r2
            int r5 = r8 + 1
            r2 = r22
        L22b:
            boolean r4 = r9.i
            float r8 = r6.r()
            r13 = 0
            int r8 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r8 == 0) goto L238
            r8 = 1
            goto L239
        L238:
            r8 = 0
        L239:
            r4 = r4 | r8
            r9.i = r4
            boolean r4 = r9.f1945w
            float r8 = r6.up()
            int r8 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r8 == 0) goto L248
            r8 = 1
            goto L249
        L248:
            r8 = 0
        L249:
            r4 = r4 | r8
            r9.f1945w = r4
            int[] r4 = r0.j
            if (r4 == 0) goto L256
            int r8 = r15.size()
            r4[r7] = r8
        L256:
            int r4 = r9.up
            r8 = r21
            int r13 = r0.j(r1, r8)
            int r21 = r0.cw(r6, r8)
            int r13 = r13 + r21
            int r21 = r0.r(r6, r8)
            int r13 = r13 + r21
            int r4 = r4 + r13
            r9.up = r4
            float r4 = r9.oq
            float r13 = r6.r()
            float r4 = r4 + r13
            r9.oq = r4
            float r4 = r9.qv
            float r13 = r6.up()
            float r4 = r4 + r13
            r9.qv = r4
            com.bytedance.adsdk.ugeno.flexbox.j r4 = r0.f1947r
            r4.j(r1, r7, r5, r9)
            int r4 = r0.xt(r1, r8)
            int r13 = r0.up(r6, r8)
            int r4 = r4 + r13
            int r13 = r0.m(r6, r8)
            int r4 = r4 + r13
            com.bytedance.adsdk.ugeno.flexbox.j r13 = r0.f1947r
            int r13 = r13.j(r1)
            int r4 = r4 + r13
            int r2 = java.lang.Math.max(r2, r4)
            int r4 = r9.ae
            int r4 = java.lang.Math.max(r4, r2)
            r9.ae = r4
            if (r8 == 0) goto L2c1
            com.bytedance.adsdk.ugeno.flexbox.j r4 = r0.f1947r
            int r4 = r4.getFlexWrap()
            r13 = 2
            if (r4 == r13) goto L2c4
            int r4 = r9.vl
            int r1 = r1.getBaseline()
            int r6 = r6.ws()
            int r1 = r1 + r6
            int r1 = java.lang.Math.max(r4, r1)
            r9.vl = r1
        L2c1:
            r1 = r26
            goto L2db
        L2c4:
            int r4 = r9.vl
            int r13 = r1.getMeasuredHeight()
            int r1 = r1.getBaseline()
            int r13 = r13 - r1
            int r1 = r6.av()
            int r13 = r13 + r1
            int r1 = java.lang.Math.max(r4, r13)
            r9.vl = r1
            goto L2c1
        L2db:
            boolean r4 = r0.j(r7, r1, r9)
            if (r4 == 0) goto L2e7
            r0.j(r15, r9, r7, r11)
            int r4 = r9.ae
            int r11 = r11 + r4
        L2e7:
            r13 = r35
            if (r13 == r14) goto L310
            int r4 = r15.size()
            if (r4 <= 0) goto L310
            int r4 = r15.size()
            r24 = 1
            int r4 = r4 + (-1)
            java.lang.Object r4 = r15.get(r4)
            com.bytedance.adsdk.ugeno.flexbox.cw r4 = (com.bytedance.adsdk.ugeno.flexbox.cw) r4
            int r4 = r4.av
            if (r4 < r13) goto L312
            if (r7 < r13) goto L312
            if (r19 != 0) goto L312
            int r4 = r9.j()
            int r11 = -r4
            r4 = 1
        L30d:
            r6 = r33
            goto L315
        L310:
            r24 = 1
        L312:
            r4 = r19
            goto L30d
        L315:
            if (r11 <= r6) goto L31f
            if (r4 != 0) goto L31a
            goto L31f
        L31a:
            r10 = r30
            r7 = r20
            goto L339
        L31f:
            r22 = r2
            r19 = r4
            r21 = r5
        L325:
            int r2 = r7 + 1
            r14 = r8
            r6 = r9
            r7 = r10
            r9 = r11
            r10 = r30
            r11 = r31
            r8 = r1
            r1 = r2
            r2 = r27
            goto L59
        L335:
            r7 = r20
            r10 = r30
        L339:
            r10.xt = r7
            return
    }

    int[] j(android.util.SparseIntArray r3) {
            r2 = this;
            com.bytedance.adsdk.ugeno.flexbox.j r0 = r2.f1947r
            int r0 = r0.getFlexItemCount()
            java.util.List r1 = r2.xt(r0)
            int[] r3 = r2.j(r0, r1, r3)
            return r3
    }

    int[] j(android.view.View r5, int r6, android.view.ViewGroup.LayoutParams r7, android.util.SparseIntArray r8) {
            r4 = this;
            com.bytedance.adsdk.ugeno.flexbox.j r0 = r4.f1947r
            int r0 = r0.getFlexItemCount()
            java.util.List r1 = r4.xt(r0)
            com.bytedance.adsdk.ugeno.flexbox.r$xt r2 = new com.bytedance.adsdk.ugeno.flexbox.r$xt
            r3 = 0
            r2.<init>(r3)
            r3 = 1
            if (r5 == 0) goto L20
            boolean r5 = r7 instanceof com.bytedance.adsdk.ugeno.flexbox.xt
            if (r5 == 0) goto L20
            com.bytedance.adsdk.ugeno.flexbox.xt r7 = (com.bytedance.adsdk.ugeno.flexbox.xt) r7
            int r5 = r7.cw()
            r2.xt = r5
            goto L22
        L20:
            r2.xt = r3
        L22:
            r5 = -1
            if (r6 == r5) goto L45
            if (r6 != r0) goto L28
            goto L45
        L28:
            com.bytedance.adsdk.ugeno.flexbox.j r5 = r4.f1947r
            int r5 = r5.getFlexItemCount()
            if (r6 >= r5) goto L42
            r2.j = r6
        L32:
            if (r6 >= r0) goto L47
            java.lang.Object r5 = r1.get(r6)
            com.bytedance.adsdk.ugeno.flexbox.r$xt r5 = (com.bytedance.adsdk.ugeno.flexbox.r.xt) r5
            int r7 = r5.j
            int r7 = r7 + r3
            r5.j = r7
            int r6 = r6 + 1
            goto L32
        L42:
            r2.j = r0
            goto L47
        L45:
            r2.j = r0
        L47:
            r1.add(r2)
            int r0 = r0 + r3
            int[] r5 = r4.j(r0, r1, r8)
            return r5
    }

    int xt(long r2) {
            r1 = this;
            r0 = 32
            long r2 = r2 >> r0
            int r3 = (int) r2
            return r3
    }

    long xt(int r5, int r6) {
            r4 = this;
            long r0 = (long) r6
            r6 = 32
            long r0 = r0 << r6
            long r5 = (long) r5
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r2
            long r5 = r5 | r0
            return r5
    }

    void xt(int r13, int r14, int r15) {
            r12 = this;
            com.bytedance.adsdk.ugeno.flexbox.j r0 = r12.f1947r
            int r0 = r0.getFlexDirection()
            r1 = 3
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L2b
            if (r0 == r3) goto L2b
            if (r0 == r2) goto L22
            if (r0 != r1) goto L12
            goto L22
        L12:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "Invalid flex direction: "
            java.lang.String r15 = java.lang.String.valueOf(r0)
            java.lang.String r14 = r14.concat(r15)
            r13.<init>(r14)
            throw r13
        L22:
            int r14 = android.view.View.MeasureSpec.getMode(r13)
            int r13 = android.view.View.MeasureSpec.getSize(r13)
            goto L36
        L2b:
            int r13 = android.view.View.MeasureSpec.getMode(r14)
            int r14 = android.view.View.MeasureSpec.getSize(r14)
            r11 = r14
            r14 = r13
            r13 = r11
        L36:
            com.bytedance.adsdk.ugeno.flexbox.j r0 = r12.f1947r
            java.util.List r0 = r0.getFlexLinesInternal()
            r4 = 1073741824(0x40000000, float:2.0)
            if (r14 != r4) goto L172
            com.bytedance.adsdk.ugeno.flexbox.j r14 = r12.f1947r
            int r14 = r14.getSumOfCrossSize()
            int r14 = r14 + r15
            int r4 = r0.size()
            r5 = 0
            if (r4 != r3) goto L58
            java.lang.Object r14 = r0.get(r5)
            com.bytedance.adsdk.ugeno.flexbox.cw r14 = (com.bytedance.adsdk.ugeno.flexbox.cw) r14
            int r13 = r13 - r15
            r14.ae = r13
            return
        L58:
            int r15 = r0.size()
            if (r15 < r2) goto L172
            com.bytedance.adsdk.ugeno.flexbox.j r15 = r12.f1947r
            int r15 = r15.getAlignContent()
            if (r15 == r3) goto L167
            if (r15 == r2) goto L15d
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r6 = 0
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r15 == r1) goto Lf6
            r1 = 4
            if (r15 == r1) goto Lb6
            r1 = 5
            if (r15 == r1) goto L77
            goto L172
        L77:
            if (r14 >= r13) goto L172
            int r13 = r13 - r14
            float r13 = (float) r13
            int r14 = r0.size()
            float r14 = (float) r14
            float r13 = r13 / r14
            int r14 = r0.size()
            r15 = 0
        L86:
            if (r5 >= r14) goto L172
            java.lang.Object r1 = r0.get(r5)
            com.bytedance.adsdk.ugeno.flexbox.cw r1 = (com.bytedance.adsdk.ugeno.flexbox.cw) r1
            int r2 = r1.ae
            float r2 = (float) r2
            float r2 = r2 + r13
            int r8 = r0.size()
            int r8 = r8 - r3
            if (r5 != r8) goto L9b
            float r2 = r2 + r15
            r15 = 0
        L9b:
            int r8 = java.lang.Math.round(r2)
            float r9 = (float) r8
            float r2 = r2 - r9
            float r15 = r15 + r2
            int r2 = (r15 > r7 ? 1 : (r15 == r7 ? 0 : -1))
            if (r2 <= 0) goto Laa
            int r8 = r8 + 1
            float r15 = r15 - r7
            goto Lb1
        Laa:
            int r2 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r2 >= 0) goto Lb1
            int r8 = r8 + (-1)
            float r15 = r15 + r7
        Lb1:
            r1.ae = r8
            int r5 = r5 + 1
            goto L86
        Lb6:
            if (r14 < r13) goto Lc2
            com.bytedance.adsdk.ugeno.flexbox.j r15 = r12.f1947r
            java.util.List r13 = r12.j(r0, r13, r14)
            r15.setFlexLines(r13)
            return
        Lc2:
            int r13 = r13 - r14
            int r14 = r0.size()
            int r14 = r14 * 2
            int r13 = r13 / r14
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            com.bytedance.adsdk.ugeno.flexbox.cw r15 = new com.bytedance.adsdk.ugeno.flexbox.cw
            r15.<init>()
            r15.ae = r13
            java.util.Iterator r13 = r0.iterator()
        Lda:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto Lf0
            java.lang.Object r0 = r13.next()
            com.bytedance.adsdk.ugeno.flexbox.cw r0 = (com.bytedance.adsdk.ugeno.flexbox.cw) r0
            r14.add(r15)
            r14.add(r0)
            r14.add(r15)
            goto Lda
        Lf0:
            com.bytedance.adsdk.ugeno.flexbox.j r13 = r12.f1947r
            r13.setFlexLines(r14)
            return
        Lf6:
            if (r14 >= r13) goto L172
            int r13 = r13 - r14
            float r13 = (float) r13
            int r14 = r0.size()
            int r14 = r14 - r3
            float r14 = (float) r14
            float r13 = r13 / r14
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            int r15 = r0.size()
            r1 = 0
        L10b:
            if (r5 >= r15) goto L157
            java.lang.Object r8 = r0.get(r5)
            com.bytedance.adsdk.ugeno.flexbox.cw r8 = (com.bytedance.adsdk.ugeno.flexbox.cw) r8
            r14.add(r8)
            int r8 = r0.size()
            int r8 = r8 - r3
            if (r5 == r8) goto L154
            com.bytedance.adsdk.ugeno.flexbox.cw r8 = new com.bytedance.adsdk.ugeno.flexbox.cw
            r8.<init>()
            int r9 = r0.size()
            int r9 = r9 - r2
            if (r5 != r9) goto L132
            float r1 = r1 + r13
            int r1 = java.lang.Math.round(r1)
            r8.ae = r1
            r1 = 0
            goto L138
        L132:
            int r9 = java.lang.Math.round(r13)
            r8.ae = r9
        L138:
            int r9 = r8.ae
            float r10 = (float) r9
            float r10 = r13 - r10
            float r1 = r1 + r10
            int r10 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r10 <= 0) goto L148
            int r9 = r9 + 1
            r8.ae = r9
            float r1 = r1 - r7
            goto L151
        L148:
            int r10 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r10 >= 0) goto L151
            int r9 = r9 + (-1)
            r8.ae = r9
            float r1 = r1 + r7
        L151:
            r14.add(r8)
        L154:
            int r5 = r5 + 1
            goto L10b
        L157:
            com.bytedance.adsdk.ugeno.flexbox.j r13 = r12.f1947r
            r13.setFlexLines(r14)
            return
        L15d:
            com.bytedance.adsdk.ugeno.flexbox.j r15 = r12.f1947r
            java.util.List r13 = r12.j(r0, r13, r14)
            r15.setFlexLines(r13)
            return
        L167:
            int r13 = r13 - r14
            com.bytedance.adsdk.ugeno.flexbox.cw r14 = new com.bytedance.adsdk.ugeno.flexbox.cw
            r14.<init>()
            r14.ae = r13
            r0.add(r5, r14)
        L172:
            return
    }

    void xt(com.bytedance.adsdk.ugeno.flexbox.r.j r9, int r10, int r11) {
            r8 = this;
            r6 = -1
            r7 = 0
            r4 = 2147483647(0x7fffffff, float:NaN)
            r5 = 0
            r0 = r8
            r1 = r9
            r3 = r10
            r2 = r11
            r0.j(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    boolean xt(android.util.SparseIntArray r7) {
            r6 = this;
            com.bytedance.adsdk.ugeno.flexbox.j r0 = r6.f1947r
            int r0 = r0.getFlexItemCount()
            int r1 = r7.size()
            r2 = 1
            if (r1 == r0) goto Le
            return r2
        Le:
            r1 = 0
            r3 = 0
        L10:
            if (r3 >= r0) goto L2e
            com.bytedance.adsdk.ugeno.flexbox.j r4 = r6.f1947r
            android.view.View r4 = r4.j(r3)
            if (r4 == 0) goto L2b
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            com.bytedance.adsdk.ugeno.flexbox.xt r4 = (com.bytedance.adsdk.ugeno.flexbox.xt) r4
            int r4 = r4.cw()
            int r5 = r7.get(r3)
            if (r4 == r5) goto L2b
            return r2
        L2b:
            int r3 = r3 + 1
            goto L10
        L2e:
            return r1
    }
}
