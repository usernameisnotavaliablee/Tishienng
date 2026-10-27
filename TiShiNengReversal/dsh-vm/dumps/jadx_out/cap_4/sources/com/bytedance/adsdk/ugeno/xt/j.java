package com.bytedance.adsdk.ugeno.xt;

import android.view.ViewGroup;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j<E extends android.view.ViewGroup> extends com.bytedance.adsdk.ugeno.xt.cw {
    protected java.util.List<com.bytedance.adsdk.ugeno.xt.cw<android.view.View>> j;

    /* renamed from: com.bytedance.adsdk.ugeno.xt.j$j, reason: collision with other inner class name */
    public static class C0196j {
        protected float ae;
        protected boolean av;
        protected boolean az;
        protected com.bytedance.adsdk.ugeno.xt.j ch;
        protected float cw;
        protected boolean f;
        protected float g;
        protected boolean i;
        protected float j;
        protected float jy;
        protected boolean kt;

        /* renamed from: m, reason: collision with root package name */
        protected float f2035m;
        protected boolean mi;
        protected float oq;
        protected float qv;

        /* renamed from: r, reason: collision with root package name */
        protected float f2036r;
        protected boolean tj;
        protected float tl;
        protected float up;

        /* renamed from: v, reason: collision with root package name */
        protected boolean f2037v;
        protected float vl;

        /* renamed from: w, reason: collision with root package name */
        protected boolean f2038w;
        protected float ws;

        /* renamed from: x, reason: collision with root package name */
        protected android.view.ViewGroup.LayoutParams f2039x;
        protected float xt;

        public C0196j(com.bytedance.adsdk.ugeno.xt.j r2) {
                r1 = this;
                r1.<init>()
                r0 = -1073741824(0xffffffffc0000000, float:-2.0)
                r1.j = r0
                r1.xt = r0
                r0 = 0
                r1.cw = r0
                r1.f2036r = r0
                r1.ch = r2
                return
        }

        public android.view.ViewGroup.LayoutParams j() {
                r3 = this;
                android.view.ViewGroup$MarginLayoutParams r0 = new android.view.ViewGroup$MarginLayoutParams
                float r1 = r3.j
                int r1 = (int) r1
                float r2 = r3.xt
                int r2 = (int) r2
                r0.<init>(r1, r2)
                boolean r1 = r3.kt
                if (r1 == 0) goto L13
                float r1 = r3.f2035m
            L11:
                int r1 = (int) r1
                goto L16
            L13:
                float r1 = r3.up
                goto L11
            L16:
                r0.leftMargin = r1
                boolean r1 = r3.tj
                if (r1 == 0) goto L20
                float r1 = r3.ae
            L1e:
                int r1 = (int) r1
                goto L23
            L20:
                float r1 = r3.up
                goto L1e
            L23:
                r0.rightMargin = r1
                boolean r1 = r3.f
                if (r1 == 0) goto L2d
                float r1 = r3.tl
            L2b:
                int r1 = (int) r1
                goto L30
            L2d:
                float r1 = r3.up
                goto L2b
            L30:
                r0.topMargin = r1
                boolean r1 = r3.f2037v
                if (r1 == 0) goto L3a
                float r1 = r3.g
            L38:
                int r1 = (int) r1
                goto L3d
            L3a:
                float r1 = r3.up
                goto L38
            L3d:
                r0.bottomMargin = r1
                return r0
        }

        public void j(android.content.Context r6, java.lang.String r7, java.lang.String r8) {
                r5 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r7)
                if (r0 == 0) goto L8
                goto Lcc
            L8:
                r7.getClass()
                int r0 = r7.hashCode()
                r1 = 1
                r2 = -1
                switch(r0) {
                    case -1501175880: goto Lb7;
                    case -1375815020: goto Lac;
                    case -1221029593: goto La1;
                    case -1081309778: goto L96;
                    case -1044792121: goto L8b;
                    case -806339567: goto L80;
                    case -289173127: goto L75;
                    case -133587431: goto L6a;
                    case 90130308: goto L5c;
                    case 113126854: goto L4e;
                    case 202355100: goto L40;
                    case 713848971: goto L32;
                    case 975087886: goto L24;
                    case 1970934485: goto L16;
                    default: goto L14;
                }
            L14:
                goto Lc1
            L16:
                java.lang.String r0 = "marginLeft"
                boolean r7 = r7.equals(r0)
                if (r7 != 0) goto L20
                goto Lc1
            L20:
                r2 = 13
                goto Lc1
            L24:
                java.lang.String r0 = "marginRight"
                boolean r7 = r7.equals(r0)
                if (r7 != 0) goto L2e
                goto Lc1
            L2e:
                r2 = 12
                goto Lc1
            L32:
                java.lang.String r0 = "paddingRight"
                boolean r7 = r7.equals(r0)
                if (r7 != 0) goto L3c
                goto Lc1
            L3c:
                r2 = 11
                goto Lc1
            L40:
                java.lang.String r0 = "paddingBottom"
                boolean r7 = r7.equals(r0)
                if (r7 != 0) goto L4a
                goto Lc1
            L4a:
                r2 = 10
                goto Lc1
            L4e:
                java.lang.String r0 = "width"
                boolean r7 = r7.equals(r0)
                if (r7 != 0) goto L58
                goto Lc1
            L58:
                r2 = 9
                goto Lc1
            L5c:
                java.lang.String r0 = "paddingTop"
                boolean r7 = r7.equals(r0)
                if (r7 != 0) goto L66
                goto Lc1
            L66:
                r2 = 8
                goto Lc1
            L6a:
                java.lang.String r0 = "minHeight"
                boolean r7 = r7.equals(r0)
                if (r7 != 0) goto L73
                goto Lc1
            L73:
                r2 = 7
                goto Lc1
            L75:
                java.lang.String r0 = "marginBottom"
                boolean r7 = r7.equals(r0)
                if (r7 != 0) goto L7e
                goto Lc1
            L7e:
                r2 = 6
                goto Lc1
            L80:
                java.lang.String r0 = "padding"
                boolean r7 = r7.equals(r0)
                if (r7 != 0) goto L89
                goto Lc1
            L89:
                r2 = 5
                goto Lc1
            L8b:
                java.lang.String r0 = "marginTop"
                boolean r7 = r7.equals(r0)
                if (r7 != 0) goto L94
                goto Lc1
            L94:
                r2 = 4
                goto Lc1
            L96:
                java.lang.String r0 = "margin"
                boolean r7 = r7.equals(r0)
                if (r7 != 0) goto L9f
                goto Lc1
            L9f:
                r2 = 3
                goto Lc1
            La1:
                java.lang.String r0 = "height"
                boolean r7 = r7.equals(r0)
                if (r7 != 0) goto Laa
                goto Lc1
            Laa:
                r2 = 2
                goto Lc1
            Lac:
                java.lang.String r0 = "minWidth"
                boolean r7 = r7.equals(r0)
                if (r7 != 0) goto Lb5
                goto Lc1
            Lb5:
                r2 = 1
                goto Lc1
            Lb7:
                java.lang.String r0 = "paddingLeft"
                boolean r7 = r7.equals(r0)
                if (r7 != 0) goto Lc0
                goto Lc1
            Lc0:
                r2 = 0
            Lc1:
                r7 = -1073741824(0xffffffffc0000000, float:-2.0)
                java.lang.String r0 = "wrap_content"
                r3 = -1082130432(0xffffffffbf800000, float:-1.0)
                java.lang.String r4 = "match_parent"
                switch(r2) {
                    case 0: goto L15c;
                    case 1: goto L155;
                    case 2: goto L13c;
                    case 3: goto L135;
                    case 4: goto L12c;
                    case 5: goto L123;
                    case 6: goto L11a;
                    case 7: goto L113;
                    case 8: goto L10a;
                    case 9: goto Lf1;
                    case 10: goto Le8;
                    case 11: goto Ldf;
                    case 12: goto Ld6;
                    case 13: goto Lcd;
                    default: goto Lcc;
                }
            Lcc:
                return
            Lcd:
                float r6 = com.bytedance.adsdk.ugeno.m.tl.j(r6, r8)
                r5.f2035m = r6
                r5.kt = r1
                return
            Ld6:
                float r6 = com.bytedance.adsdk.ugeno.m.tl.j(r6, r8)
                r5.ae = r6
                r5.tj = r1
                return
            Ldf:
                float r6 = com.bytedance.adsdk.ugeno.m.tl.j(r6, r8)
                r5.jy = r6
                r5.i = r1
                return
            Le8:
                float r6 = com.bytedance.adsdk.ugeno.m.tl.j(r6, r8)
                r5.ws = r6
                r5.mi = r1
                return
            Lf1:
                boolean r1 = android.text.TextUtils.equals(r8, r4)
                if (r1 == 0) goto Lfa
                r5.j = r3
                return
            Lfa:
                boolean r0 = android.text.TextUtils.equals(r8, r0)
                if (r0 == 0) goto L103
                r5.j = r7
                return
            L103:
                float r6 = com.bytedance.adsdk.ugeno.m.tl.j(r6, r8)
                r5.j = r6
                return
            L10a:
                float r6 = com.bytedance.adsdk.ugeno.m.tl.j(r6, r8)
                r5.vl = r6
                r5.f2038w = r1
                return
            L113:
                float r6 = com.bytedance.adsdk.ugeno.m.tl.j(r6, r8)
                r5.f2036r = r6
                return
            L11a:
                float r6 = com.bytedance.adsdk.ugeno.m.tl.j(r6, r8)
                r5.g = r6
                r5.f2037v = r1
                return
            L123:
                float r6 = com.bytedance.adsdk.ugeno.m.tl.j(r6, r8)
                r5.oq = r6
                r5.az = r1
                return
            L12c:
                float r6 = com.bytedance.adsdk.ugeno.m.tl.j(r6, r8)
                r5.tl = r6
                r5.f = r1
                return
            L135:
                float r6 = com.bytedance.adsdk.ugeno.m.tl.j(r6, r8)
                r5.up = r6
                return
            L13c:
                boolean r1 = android.text.TextUtils.equals(r8, r4)
                if (r1 == 0) goto L145
                r5.xt = r3
                return
            L145:
                boolean r0 = android.text.TextUtils.equals(r8, r0)
                if (r0 == 0) goto L14e
                r5.xt = r7
                return
            L14e:
                float r6 = com.bytedance.adsdk.ugeno.m.tl.j(r6, r8)
                r5.xt = r6
                return
            L155:
                float r6 = com.bytedance.adsdk.ugeno.m.tl.j(r6, r8)
                r5.cw = r6
                return
            L15c:
                float r6 = com.bytedance.adsdk.ugeno.m.tl.j(r6, r8)
                r5.qv = r6
                r5.av = r1
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "LayoutParams{mWidth="
                r0.<init>(r1)
                float r1 = r2.j
                r0.append(r1)
                java.lang.String r1 = ", mHeight="
                r0.append(r1)
                float r1 = r2.xt
                r0.append(r1)
                java.lang.String r1 = ", mMargin="
                r0.append(r1)
                float r1 = r2.up
                r0.append(r1)
                java.lang.String r1 = ", mMarginLeft="
                r0.append(r1)
                float r1 = r2.f2035m
                r0.append(r1)
                java.lang.String r1 = ", mMarginRight="
                r0.append(r1)
                float r1 = r2.ae
                r0.append(r1)
                java.lang.String r1 = ", mMarginTop="
                r0.append(r1)
                float r1 = r2.tl
                r0.append(r1)
                java.lang.String r1 = ", mMarginBottom="
                r0.append(r1)
                float r1 = r2.g
                r0.append(r1)
                java.lang.String r1 = ", mParams="
                r0.append(r1)
                android.view.ViewGroup$LayoutParams r1 = r2.f2039x
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public j(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public j(android.content.Context r1, com.bytedance.adsdk.ugeno.xt.j r2) {
            r0 = this;
            r0.<init>(r1, r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.j = r1
            return
    }

    public java.util.List<com.bytedance.adsdk.ugeno.xt.cw<android.view.View>> ae() {
            r1 = this;
            java.util.List<com.bytedance.adsdk.ugeno.xt.cw<android.view.View>> r0 = r1.j
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.xt.cw
    protected com.bytedance.adsdk.ugeno.xt.cw cw(java.lang.String r3) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto Ld
            com.bytedance.adsdk.ugeno.j.j r0 = r2.oq(r3)
            if (r0 == 0) goto Ld
            return r2
        Ld:
            java.util.List<com.bytedance.adsdk.ugeno.xt.cw<android.view.View>> r0 = r2.j
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r0.next()
            com.bytedance.adsdk.ugeno.xt.cw r1 = (com.bytedance.adsdk.ugeno.xt.cw) r1
            if (r1 == 0) goto L13
            com.bytedance.adsdk.ugeno.xt.cw r1 = r1.m(r3)
            if (r1 == 0) goto L13
            return r1
        L28:
            r3 = 0
            return r3
    }

    @Override // com.bytedance.adsdk.ugeno.xt.cw
    public com.bytedance.adsdk.ugeno.xt.cw j(java.lang.String r3) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto Lf
            java.lang.String r0 = r2.qv
            boolean r0 = android.text.TextUtils.equals(r3, r0)
            if (r0 == 0) goto Lf
            return r2
        Lf:
            java.util.List<com.bytedance.adsdk.ugeno.xt.cw<android.view.View>> r0 = r2.j
            java.util.Iterator r0 = r0.iterator()
        L15:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r0.next()
            com.bytedance.adsdk.ugeno.xt.cw r1 = (com.bytedance.adsdk.ugeno.xt.cw) r1
            if (r1 == 0) goto L15
            com.bytedance.adsdk.ugeno.xt.cw r1 = r1.r(r3)
            if (r1 == 0) goto L15
            return r1
        L2a:
            r3 = 0
            return r3
    }

    public void j(com.bytedance.adsdk.ugeno.xt.cw r2) {
            r1 = this;
            if (r2 != 0) goto L3
            goto L15
        L3:
            java.util.List<com.bytedance.adsdk.ugeno.xt.cw<android.view.View>> r0 = r1.j
            r0.add(r2)
            android.view.View r2 = r2.g()
            if (r2 == 0) goto L15
            T extends android.view.View r0 = r1.up
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.addView(r2)
        L15:
            return
    }

    public void j(com.bytedance.adsdk.ugeno.xt.cw r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            if (r2 != 0) goto L3
            goto L15
        L3:
            java.util.List<com.bytedance.adsdk.ugeno.xt.cw<android.view.View>> r0 = r1.j
            r0.add(r2)
            android.view.View r2 = r2.g()
            if (r2 == 0) goto L15
            T extends android.view.View r0 = r1.up
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.addView(r2, r3)
        L15:
            return
    }

    public com.bytedance.adsdk.ugeno.xt.j.C0196j tl() {
            r1 = this;
            com.bytedance.adsdk.ugeno.xt.j$j r0 = new com.bytedance.adsdk.ugeno.xt.j$j
            r0.<init>(r1)
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.xt.cw
    public com.bytedance.adsdk.ugeno.xt.cw xt(java.lang.String r3) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto Lf
            java.lang.String r0 = r2.vl
            boolean r0 = android.text.TextUtils.equals(r3, r0)
            if (r0 == 0) goto Lf
            return r2
        Lf:
            java.util.List<com.bytedance.adsdk.ugeno.xt.cw<android.view.View>> r0 = r2.j
            java.util.Iterator r0 = r0.iterator()
        L15:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r0.next()
            com.bytedance.adsdk.ugeno.xt.cw r1 = (com.bytedance.adsdk.ugeno.xt.cw) r1
            if (r1 == 0) goto L15
            com.bytedance.adsdk.ugeno.xt.cw r1 = r1.up(r3)
            if (r1 == 0) goto L15
            return r1
        L2a:
            r3 = 0
            return r3
    }

    @Override // com.bytedance.adsdk.ugeno.xt.cw
    public void xt() {
            r0 = this;
            super.xt()
            return
    }
}
