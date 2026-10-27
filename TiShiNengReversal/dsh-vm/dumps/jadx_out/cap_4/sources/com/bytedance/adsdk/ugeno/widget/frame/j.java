package com.bytedance.adsdk.ugeno.widget.frame;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j extends com.bytedance.adsdk.ugeno.xt.j<com.bytedance.adsdk.ugeno.widget.frame.UGFrameLayout> {
    private com.bytedance.adsdk.ugeno.widget.frame.UGFrameLayout ll;

    /* renamed from: com.bytedance.adsdk.ugeno.widget.frame.j$j, reason: collision with other inner class name */
    public static class C0193j extends com.bytedance.adsdk.ugeno.xt.j.C0196j {

        /* renamed from: s, reason: collision with root package name */
        protected int f2010s;

        public C0193j(com.bytedance.adsdk.ugeno.xt.j r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = -1
                r0.f2010s = r1
                return
        }

        private int j(java.lang.String r5) {
                r4 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r5)
                r1 = -1
                if (r0 == 0) goto L8
                return r1
            L8:
                java.lang.String r0 = "\\|"
                java.lang.String[] r5 = r5.split(r0)
                if (r5 == 0) goto L24
                int r0 = r5.length
                if (r0 > 0) goto L14
                goto L24
            L14:
                int r0 = r5.length
                r1 = 0
                r2 = 0
            L17:
                if (r1 >= r0) goto L23
                r3 = r5[r1]
                int r3 = r4.xt(r3)
                r2 = r2 | r3
                int r1 = r1 + 1
                goto L17
            L23:
                return r2
            L24:
                return r1
        }

        private int xt(java.lang.String r6) {
                r5 = this;
                r6.getClass()
                int r0 = r6.hashCode()
                r1 = 5
                r2 = 3
                r3 = 1
                r4 = -1
                switch(r0) {
                    case -1383228885: goto L52;
                    case -1364013995: goto L47;
                    case -348726240: goto L3c;
                    case 115029: goto L31;
                    case 3317767: goto L26;
                    case 108511772: goto L1b;
                    case 1063616078: goto L10;
                    default: goto Le;
                }
            Le:
                r6 = -1
                goto L5c
            L10:
                java.lang.String r0 = "center_horizontal"
                boolean r6 = r6.equals(r0)
                if (r6 != 0) goto L19
                goto Le
            L19:
                r6 = 6
                goto L5c
            L1b:
                java.lang.String r0 = "right"
                boolean r6 = r6.equals(r0)
                if (r6 != 0) goto L24
                goto Le
            L24:
                r6 = 5
                goto L5c
            L26:
                java.lang.String r0 = "left"
                boolean r6 = r6.equals(r0)
                if (r6 != 0) goto L2f
                goto Le
            L2f:
                r6 = 4
                goto L5c
            L31:
                java.lang.String r0 = "top"
                boolean r6 = r6.equals(r0)
                if (r6 != 0) goto L3a
                goto Le
            L3a:
                r6 = 3
                goto L5c
            L3c:
                java.lang.String r0 = "center_vertical"
                boolean r6 = r6.equals(r0)
                if (r6 != 0) goto L45
                goto Le
            L45:
                r6 = 2
                goto L5c
            L47:
                java.lang.String r0 = "center"
                boolean r6 = r6.equals(r0)
                if (r6 != 0) goto L50
                goto Le
            L50:
                r6 = 1
                goto L5c
            L52:
                java.lang.String r0 = "bottom"
                boolean r6 = r6.equals(r0)
                if (r6 != 0) goto L5b
                goto Le
            L5b:
                r6 = 0
            L5c:
                switch(r6) {
                    case 0: goto L6c;
                    case 1: goto L69;
                    case 2: goto L66;
                    case 3: goto L63;
                    case 4: goto L62;
                    case 5: goto L61;
                    case 6: goto L60;
                    default: goto L5f;
                }
            L5f:
                return r4
            L60:
                return r3
            L61:
                return r1
            L62:
                return r2
            L63:
                r6 = 48
                return r6
            L66:
                r6 = 16
                return r6
            L69:
                r6 = 17
                return r6
            L6c:
                r6 = 80
                return r6
        }

        @Override // com.bytedance.adsdk.ugeno.xt.j.C0196j
        public /* synthetic */ android.view.ViewGroup.LayoutParams j() {
                r1 = this;
                android.widget.FrameLayout$LayoutParams r0 = r1.xt()
                return r0
        }

        @Override // com.bytedance.adsdk.ugeno.xt.j.C0196j
        public void j(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
                r1 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r3)
                if (r0 == 0) goto L7
                goto L18
            L7:
                super.j(r2, r3, r4)
                java.lang.String r2 = "layoutGravity"
                boolean r2 = android.text.TextUtils.equals(r3, r2)
                if (r2 == 0) goto L18
                int r2 = r1.j(r4)
                r1.f2010s = r2
            L18:
                return
        }

        public android.widget.FrameLayout.LayoutParams xt() {
                r3 = this;
                android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
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
                int r1 = r3.f2010s
                r0.gravity = r1
                return r0
        }
    }

    public j(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.bytedance.adsdk.ugeno.xt.cw
    public /* synthetic */ android.view.View j() {
            r1 = this;
            com.bytedance.adsdk.ugeno.widget.frame.UGFrameLayout r0 = r1.qb()
            return r0
    }

    public com.bytedance.adsdk.ugeno.widget.frame.UGFrameLayout qb() {
            r2 = this;
            com.bytedance.adsdk.ugeno.widget.frame.UGFrameLayout r0 = new com.bytedance.adsdk.ugeno.widget.frame.UGFrameLayout
            android.content.Context r1 = r2.xt
            r0.<init>(r1)
            r2.ll = r0
            r0.j(r2)
            com.bytedance.adsdk.ugeno.widget.frame.UGFrameLayout r0 = r2.ll
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.xt.j
    public com.bytedance.adsdk.ugeno.xt.j.C0196j tl() {
            r1 = this;
            com.bytedance.adsdk.ugeno.widget.frame.j$j r0 = new com.bytedance.adsdk.ugeno.widget.frame.j$j
            r0.<init>(r1)
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.xt.j, com.bytedance.adsdk.ugeno.xt.cw
    public void xt() {
            r2 = this;
            com.bytedance.adsdk.ugeno.widget.frame.UGFrameLayout r0 = r2.ll
            java.util.Map<java.lang.Integer, com.bytedance.adsdk.ugeno.cw.av> r1 = r2.ka
            r0.setEventMap(r1)
            super.xt()
            return
    }
}
