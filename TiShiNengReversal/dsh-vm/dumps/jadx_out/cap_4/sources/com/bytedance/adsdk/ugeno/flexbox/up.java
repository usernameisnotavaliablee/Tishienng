package com.bytedance.adsdk.ugeno.flexbox;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class up extends com.bytedance.adsdk.ugeno.xt.j<com.bytedance.adsdk.ugeno.flexbox.FlexboxLayout> {
    private int ll;
    private int oy;
    private int px;
    private int qe;
    private int yl;

    public static class j extends com.bytedance.adsdk.ugeno.xt.j.C0196j {
        public float a;
        public int gq;
        public float h;

        /* renamed from: l, reason: collision with root package name */
        public float f1948l;
        public int la;

        /* renamed from: p, reason: collision with root package name */
        public int f1949p;
        public int rn;

        /* renamed from: s, reason: collision with root package name */
        public int f1950s;
        public int wq;

        public j(com.bytedance.adsdk.ugeno.xt.j r2) {
                r1 = this;
                r1.<init>(r2)
                r2 = 1
                r1.f1950s = r2
                r2 = 0
                r1.a = r2
                r1.f1948l = r2
                r2 = -1
                r1.f1949p = r2
                r0 = -1082130432(0xffffffffbf800000, float:-1.0)
                r1.h = r0
                r1.la = r2
                r1.gq = r2
                r2 = 16777215(0xffffff, float:2.3509886E-38)
                r1.rn = r2
                r1.wq = r2
                return
        }

        private float cw(java.lang.String r1) {
                r0 = this;
                float r1 = java.lang.Float.parseFloat(r1)     // Catch: java.lang.Exception -> L5
                return r1
            L5:
                r1 = move-exception
                com.bytedance.sdk.component.utils.vl.j(r1)
                r1 = 0
                return r1
        }

        private int j(java.lang.String r1) {
                r0 = this;
                int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L5
                return r1
            L5:
                r1 = move-exception
                com.bytedance.sdk.component.utils.vl.j(r1)
                r1 = 1
                return r1
        }

        private float r(java.lang.String r1) {
                r0 = this;
                float r1 = java.lang.Float.parseFloat(r1)     // Catch: java.lang.Exception -> L5
                return r1
            L5:
                r1 = move-exception
                com.bytedance.sdk.component.utils.vl.j(r1)
                r1 = -1082130432(0xffffffffbf800000, float:-1.0)
                return r1
        }

        private int up(java.lang.String r8) {
                r7 = this;
                r8.getClass()
                int r0 = r8.hashCode()
                r1 = 4
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                r6 = -1
                switch(r0) {
                    case -1881872635: goto L3e;
                    case -1720785339: goto L33;
                    case -1364013995: goto L28;
                    case 1384876188: goto L1d;
                    case 1744442261: goto L12;
                    default: goto L10;
                }
            L10:
                r8 = -1
                goto L48
            L12:
                java.lang.String r0 = "flex_end"
                boolean r8 = r8.equals(r0)
                if (r8 != 0) goto L1b
                goto L10
            L1b:
                r8 = 4
                goto L48
            L1d:
                java.lang.String r0 = "flex_start"
                boolean r8 = r8.equals(r0)
                if (r8 != 0) goto L26
                goto L10
            L26:
                r8 = 3
                goto L48
            L28:
                java.lang.String r0 = "center"
                boolean r8 = r8.equals(r0)
                if (r8 != 0) goto L31
                goto L10
            L31:
                r8 = 2
                goto L48
            L33:
                java.lang.String r0 = "baseline"
                boolean r8 = r8.equals(r0)
                if (r8 != 0) goto L3c
                goto L10
            L3c:
                r8 = 1
                goto L48
            L3e:
                java.lang.String r0 = "stretch"
                boolean r8 = r8.equals(r0)
                if (r8 != 0) goto L47
                goto L10
            L47:
                r8 = 0
            L48:
                switch(r8) {
                    case 0: goto L50;
                    case 1: goto L4f;
                    case 2: goto L4e;
                    case 3: goto L4d;
                    case 4: goto L4c;
                    default: goto L4b;
                }
            L4b:
                return r6
            L4c:
                return r4
            L4d:
                return r5
            L4e:
                return r3
            L4f:
                return r2
            L50:
                return r1
        }

        private float xt(java.lang.String r1) {
                r0 = this;
                float r1 = java.lang.Float.parseFloat(r1)     // Catch: java.lang.Exception -> L5
                return r1
            L5:
                r1 = move-exception
                com.bytedance.sdk.component.utils.vl.j(r1)
                r1 = 0
                return r1
        }

        @Override // com.bytedance.adsdk.ugeno.xt.j.C0196j
        public /* synthetic */ android.view.ViewGroup.LayoutParams j() {
                r1 = this;
                com.bytedance.adsdk.ugeno.flexbox.FlexboxLayout$j r0 = r1.xt()
                return r0
        }

        @Override // com.bytedance.adsdk.ugeno.xt.j.C0196j
        public void j(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
                r1 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r3)
                if (r0 == 0) goto L7
                goto L4f
            L7:
                super.j(r2, r3, r4)
                r3.getClass()
                int r2 = r3.hashCode()
                r0 = -1
                switch(r2) {
                    case -1962496832: goto L42;
                    case 106006350: goto L37;
                    case 1031115618: goto L2c;
                    case 1743739820: goto L21;
                    case 1767100401: goto L16;
                    default: goto L15;
                }
            L15:
                goto L4c
            L16:
                java.lang.String r2 = "alignSelf"
                boolean r2 = r3.equals(r2)
                if (r2 != 0) goto L1f
                goto L4c
            L1f:
                r0 = 4
                goto L4c
            L21:
                java.lang.String r2 = "flexGrow"
                boolean r2 = r3.equals(r2)
                if (r2 != 0) goto L2a
                goto L4c
            L2a:
                r0 = 3
                goto L4c
            L2c:
                java.lang.String r2 = "flexShrink"
                boolean r2 = r3.equals(r2)
                if (r2 != 0) goto L35
                goto L4c
            L35:
                r0 = 2
                goto L4c
            L37:
                java.lang.String r2 = "order"
                boolean r2 = r3.equals(r2)
                if (r2 != 0) goto L40
                goto L4c
            L40:
                r0 = 1
                goto L4c
            L42:
                java.lang.String r2 = "flexBasisPercent"
                boolean r2 = r3.equals(r2)
                if (r2 != 0) goto L4b
                goto L4c
            L4b:
                r0 = 0
            L4c:
                switch(r0) {
                    case 0: goto L6c;
                    case 1: goto L65;
                    case 2: goto L5e;
                    case 3: goto L57;
                    case 4: goto L50;
                    default: goto L4f;
                }
            L4f:
                return
            L50:
                int r2 = r1.up(r4)
                r1.f1949p = r2
                return
            L57:
                float r2 = r1.xt(r4)
                r1.a = r2
                return
            L5e:
                float r2 = r1.cw(r4)
                r1.f1948l = r2
                return
            L65:
                int r2 = r1.j(r4)
                r1.f1950s = r2
                return
            L6c:
                float r2 = r1.r(r4)
                r1.h = r2
                return
        }

        @Override // com.bytedance.adsdk.ugeno.xt.j.C0196j
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
                java.lang.String r1 = ", mOrder="
                r0.append(r1)
                int r1 = r2.f1950s
                r0.append(r1)
                java.lang.String r1 = ", mFlexGrow="
                r0.append(r1)
                float r1 = r2.a
                r0.append(r1)
                java.lang.String r1 = ", mFlexShrink="
                r0.append(r1)
                float r1 = r2.f1948l
                r0.append(r1)
                java.lang.String r1 = ", mAlignSelf="
                r0.append(r1)
                int r1 = r2.f1949p
                r0.append(r1)
                java.lang.String r1 = ", mFlexBasisPercent="
                r0.append(r1)
                float r1 = r2.h
                r0.append(r1)
                java.lang.String r1 = ", mMinWidth="
                r0.append(r1)
                int r1 = r2.la
                r0.append(r1)
                java.lang.String r1 = ", mMinHeight="
                r0.append(r1)
                int r1 = r2.gq
                r0.append(r1)
                java.lang.String r1 = ", mMaxWidth="
                r0.append(r1)
                int r1 = r2.rn
                r0.append(r1)
                java.lang.String r1 = ", mMaxHeight="
                r0.append(r1)
                int r1 = r2.wq
                r0.append(r1)
                java.lang.String r1 = "} "
                r0.append(r1)
                java.lang.String r1 = super.toString()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        public com.bytedance.adsdk.ugeno.flexbox.FlexboxLayout.j xt() {
                r3 = this;
                com.bytedance.adsdk.ugeno.flexbox.FlexboxLayout$j r0 = new com.bytedance.adsdk.ugeno.flexbox.FlexboxLayout$j
                float r1 = r3.j
                int r1 = (int) r1
                float r2 = r3.xt
                int r2 = (int) r2
                r0.<init>(r1, r2)
                float r1 = r3.f2035m
                int r1 = (int) r1
                r0.leftMargin = r1
                float r1 = r3.ae
                int r1 = (int) r1
                r0.rightMargin = r1
                float r1 = r3.tl
                int r1 = (int) r1
                r0.topMargin = r1
                float r1 = r3.g
                int r1 = (int) r1
                r0.bottomMargin = r1
                int r1 = r3.f1950s
                r0.cw(r1)
                int r1 = r3.f1949p
                r0.r(r1)
                float r1 = r3.a
                r0.j(r1)
                float r1 = r3.f1948l
                r0.xt(r1)
                float r1 = r3.h
                r0.cw(r1)
                return r0
        }
    }

    public up(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private int az(java.lang.String r2) {
            r1 = this;
            int r0 = r2.hashCode()
            switch(r0) {
                case -1881872635: goto L3a;
                case -1364013995: goto L30;
                case -932331738: goto L26;
                case 1384876188: goto L1c;
                case 1682480591: goto L12;
                case 1744442261: goto L8;
                default: goto L7;
            }
        L7:
            goto L3f
        L8:
            java.lang.String r0 = "flex_end"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L3f
            r2 = 1
            return r2
        L12:
            java.lang.String r0 = "space_between"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L3f
            r2 = 3
            return r2
        L1c:
            java.lang.String r0 = "flex_start"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L3f
            r2 = 0
            return r2
        L26:
            java.lang.String r0 = "space_around"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L3f
            r2 = 4
            return r2
        L30:
            java.lang.String r0 = "center"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L3f
            r2 = 2
            return r2
        L3a:
            java.lang.String r0 = "stretch"
            r2.equals(r0)
        L3f:
            r2 = 5
            return r2
    }

    private int jy(java.lang.String r7) {
            r6 = this;
            r7.getClass()
            int r0 = r7.hashCode()
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            r5 = -1
            switch(r0) {
                case -1364013995: goto L31;
                case -932331738: goto L26;
                case 1682480591: goto L1b;
                case 1744442261: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L3b
        L10:
            java.lang.String r0 = "flex_end"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L19
            goto L3b
        L19:
            r5 = 3
            goto L3b
        L1b:
            java.lang.String r0 = "space_between"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L24
            goto L3b
        L24:
            r5 = 2
            goto L3b
        L26:
            java.lang.String r0 = "space_around"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L2f
            goto L3b
        L2f:
            r5 = 1
            goto L3b
        L31:
            java.lang.String r0 = "center"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L3a
            goto L3b
        L3a:
            r5 = 0
        L3b:
            switch(r5) {
                case 0: goto L43;
                case 1: goto L41;
                case 2: goto L40;
                case 3: goto L3f;
                default: goto L3e;
            }
        L3e:
            return r4
        L3f:
            return r3
        L40:
            return r1
        L41:
            r7 = 4
            return r7
        L43:
            return r2
    }

    private int vl(java.lang.String r2) {
            r1 = this;
            r2.getClass()
            java.lang.String r0 = "wrap"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Ld
            r2 = 0
            return r2
        Ld:
            r2 = 1
            return r2
    }

    private int ws(java.lang.String r2) {
            r1 = this;
            int r0 = r2.hashCode()
            switch(r0) {
                case -1881872635: goto L30;
                case -1720785339: goto L26;
                case -1364013995: goto L1c;
                case 1384876188: goto L12;
                case 1744442261: goto L8;
                default: goto L7;
            }
        L7:
            goto L35
        L8:
            java.lang.String r0 = "flex_end"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L35
            r2 = 1
            return r2
        L12:
            java.lang.String r0 = "flex_start"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L35
            r2 = 0
            return r2
        L1c:
            java.lang.String r0 = "center"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L35
            r2 = 2
            return r2
        L26:
            java.lang.String r0 = "baseline"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L35
            r2 = 3
            return r2
        L30:
            java.lang.String r0 = "stretch"
            r2.equals(r0)
        L35:
            r2 = 4
            return r2
    }

    @Override // com.bytedance.adsdk.ugeno.xt.cw
    public /* synthetic */ android.view.View j() {
            r1 = this;
            com.bytedance.adsdk.ugeno.flexbox.FlexboxLayout r0 = r1.qb()
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.xt.cw
    public void j(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L7
            goto L4f
        L7:
            super.j(r3, r4)
            r3.getClass()
            int r0 = r3.hashCode()
            r1 = -1
            switch(r0) {
                case -1063257157: goto L42;
                case -975171706: goto L37;
                case -752601676: goto L2c;
                case 1744216035: goto L21;
                case 1860657097: goto L16;
                default: goto L15;
            }
        L15:
            goto L4c
        L16:
            java.lang.String r0 = "justifyContent"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L1f
            goto L4c
        L1f:
            r1 = 4
            goto L4c
        L21:
            java.lang.String r0 = "flexWrap"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L2a
            goto L4c
        L2a:
            r1 = 3
            goto L4c
        L2c:
            java.lang.String r0 = "alignContent"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L35
            goto L4c
        L35:
            r1 = 2
            goto L4c
        L37:
            java.lang.String r0 = "flexDirection"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L40
            goto L4c
        L40:
            r1 = 1
            goto L4c
        L42:
            java.lang.String r0 = "alignItems"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L4b
            goto L4c
        L4b:
            r1 = 0
        L4c:
            switch(r1) {
                case 0: goto L6c;
                case 1: goto L65;
                case 2: goto L5e;
                case 3: goto L57;
                case 4: goto L50;
                default: goto L4f;
            }
        L4f:
            return
        L50:
            int r3 = r2.jy(r4)
            r2.yl = r3
            return
        L57:
            int r3 = r2.vl(r4)
            r2.oy = r3
            return
        L5e:
            int r3 = r2.az(r4)
            r2.px = r3
            return
        L65:
            int r3 = r2.qv(r4)
            r2.ll = r3
            return
        L6c:
            int r3 = r2.ws(r4)
            r2.qe = r3
            return
    }

    public com.bytedance.adsdk.ugeno.flexbox.FlexboxLayout qb() {
            r2 = this;
            com.bytedance.adsdk.ugeno.flexbox.FlexboxLayout r0 = new com.bytedance.adsdk.ugeno.flexbox.FlexboxLayout
            android.content.Context r1 = r2.xt
            r0.<init>(r1)
            r0.j(r2)
            return r0
    }

    int qv(java.lang.String r6) {
            r5 = this;
            r6.getClass()
            int r0 = r6.hashCode()
            r1 = 2
            r2 = 1
            r3 = 0
            r4 = -1
            switch(r0) {
                case -1781065991: goto L25;
                case -1354837162: goto L1a;
                case -207799939: goto Lf;
                default: goto Le;
            }
        Le:
            goto L2f
        Lf:
            java.lang.String r0 = "row_reverse"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L18
            goto L2f
        L18:
            r4 = 2
            goto L2f
        L1a:
            java.lang.String r0 = "column"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L23
            goto L2f
        L23:
            r4 = 1
            goto L2f
        L25:
            java.lang.String r0 = "column_reverse"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L2e
            goto L2f
        L2e:
            r4 = 0
        L2f:
            switch(r4) {
                case 0: goto L35;
                case 1: goto L34;
                case 2: goto L33;
                default: goto L32;
            }
        L32:
            return r3
        L33:
            return r2
        L34:
            return r1
        L35:
            r6 = 3
            return r6
    }

    @Override // com.bytedance.adsdk.ugeno.xt.j
    public com.bytedance.adsdk.ugeno.xt.j.C0196j tl() {
            r1 = this;
            com.bytedance.adsdk.ugeno.flexbox.up$j r0 = new com.bytedance.adsdk.ugeno.flexbox.up$j
            r0.<init>(r1)
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.xt.j, com.bytedance.adsdk.ugeno.xt.cw
    public void xt() {
            r2 = this;
            super.xt()
            T extends android.view.View r0 = r2.up
            com.bytedance.adsdk.ugeno.flexbox.FlexboxLayout r0 = (com.bytedance.adsdk.ugeno.flexbox.FlexboxLayout) r0
            int r1 = r2.ll
            r0.setFlexDirection(r1)
            T extends android.view.View r0 = r2.up
            com.bytedance.adsdk.ugeno.flexbox.FlexboxLayout r0 = (com.bytedance.adsdk.ugeno.flexbox.FlexboxLayout) r0
            int r1 = r2.oy
            r0.setFlexWrap(r1)
            T extends android.view.View r0 = r2.up
            com.bytedance.adsdk.ugeno.flexbox.FlexboxLayout r0 = (com.bytedance.adsdk.ugeno.flexbox.FlexboxLayout) r0
            int r1 = r2.yl
            r0.setJustifyContent(r1)
            T extends android.view.View r0 = r2.up
            com.bytedance.adsdk.ugeno.flexbox.FlexboxLayout r0 = (com.bytedance.adsdk.ugeno.flexbox.FlexboxLayout) r0
            int r1 = r2.qe
            r0.setAlignItems(r1)
            T extends android.view.View r0 = r2.up
            com.bytedance.adsdk.ugeno.flexbox.FlexboxLayout r0 = (com.bytedance.adsdk.ugeno.flexbox.FlexboxLayout) r0
            int r1 = r2.px
            r0.setAlignContent(r1)
            return
    }
}
