package com.bxkj.student.v2.common.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class j {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.view.View.OnTouchListener {
        private int a;
        private int b;
        private float c;
        private float d;
        final /* synthetic */ int e;
        final /* synthetic */ android.app.Activity f;
        final /* synthetic */ com.bxkj.student.v2.common.view.j g;

        a(com.bxkj.student.v2.common.view.j r1, int r2, android.app.Activity r3) {
                r0 = this;
                r0.g = r1
                r0.e = r2
                r0.f = r3
                r0.<init>()
                return
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(android.view.View r5, android.view.MotionEvent r6) {
                r4 = this;
                int r0 = r6.getAction()
                r1 = 1
                if (r0 == 0) goto Lc5
                if (r0 == r1) goto L5d
                r2 = 2
                if (r0 == r2) goto Le
                r5 = 0
                return r5
            Le:
                android.view.ViewPropertyAnimator r0 = r5.animate()
                float r2 = r6.getRawX()
                int r3 = r4.a
                float r3 = (float) r3
                float r2 = r2 + r3
                android.view.ViewPropertyAnimator r0 = r0.x(r2)
                float r6 = r6.getRawY()
                int r2 = r4.b
                float r2 = (float) r2
                float r6 = r6 + r2
                android.view.ViewPropertyAnimator r6 = r0.y(r6)
                r2 = 0
                android.view.ViewPropertyAnimator r6 = r6.setDuration(r2)
                r6.start()
                float r6 = r5.getX()
                int r5 = r5.getWidth()
                float r5 = (float) r5
                float r6 = r6 + r5
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r0 = "移动 viewRightEdge="
                r5.append(r0)
                r5.append(r6)
                java.lang.String r6 = " screenWidth="
                r5.append(r6)
                int r6 = r4.e
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                com.orhanobut.logger.j.c(r5)
                goto Leb
            L5d:
                float r0 = r6.getRawX()
                float r2 = r4.c
                float r0 = r0 - r2
                float r0 = java.lang.Math.abs(r0)
                float r2 = r6.getRawY()
                float r3 = r4.d
                float r2 = r2 - r3
                float r2 = java.lang.Math.abs(r2)
                r3 = 0
                int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r0 != 0) goto L81
                int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r0 != 0) goto L81
                java.lang.String r0 = "提交反馈"
                com.orhanobut.logger.j.c(r0)
            L81:
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                android.app.Activity r2 = r4.f
                android.view.Window r2 = r2.getWindow()
                android.view.View r2 = r2.getDecorView()
                r2.getGlobalVisibleRect(r0)
                float r2 = r6.getRawX()
                int r2 = (int) r2
                float r6 = r6.getRawY()
                int r6 = (int) r6
                boolean r6 = r0.contains(r2, r6)
                if (r6 != 0) goto Leb
                android.view.ViewPropertyAnimator r5 = r5.animate()
                float r6 = r4.c
                int r0 = r4.a
                float r0 = (float) r0
                float r6 = r6 + r0
                android.view.ViewPropertyAnimator r5 = r5.x(r6)
                float r6 = r4.d
                int r0 = r4.b
                float r0 = (float) r0
                float r6 = r6 + r0
                android.view.ViewPropertyAnimator r5 = r5.y(r6)
                r2 = 300(0x12c, double:1.48E-321)
                android.view.ViewPropertyAnimator r5 = r5.setDuration(r2)
                r5.start()
                goto Leb
            Lc5:
                float r0 = r5.getX()
                int r0 = (int) r0
                float r2 = r6.getRawX()
                int r2 = (int) r2
                int r0 = r0 - r2
                r4.a = r0
                float r5 = r5.getY()
                int r5 = (int) r5
                float r0 = r6.getRawY()
                int r0 = (int) r0
                int r5 = r5 - r0
                r4.b = r5
                float r5 = r6.getRawX()
                r4.c = r5
                float r5 = r6.getRawY()
                r4.d = r5
            Leb:
                return r1
        }
    }

    j() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void a(android.view.View r0) {
            java.lang.String r0 = "提交反馈"
            com.orhanobut.logger.j.c(r0)
            return
    }

    private android.view.View b(android.app.Activity r6) {
            r5 = this;
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r6)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r2 = -1
            r1.<init>(r2, r2)
            r2 = 53
            r0.setGravity(r2)
            r2 = 1092616192(0x41200000, float:10.0)
            int r2 = cn.bluemobi.dylan.base.utils.u.a(r2, r6)
            r3 = 0
            r0.setPadding(r3, r3, r2, r3)
            r2 = 17170445(0x106000d, float:2.461195E-38)
            int r2 = androidx.core.content.ContextCompat.getColor(r6, r2)
            r0.setBackgroundColor(r2)
            r0.setLayoutParams(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r2 = -2
            r1.<init>(r2, r2)
            r2 = 1128792064(0x43480000, float:200.0)
            int r3 = cn.bluemobi.dylan.base.utils.u.a(r2, r6)
            r1.leftMargin = r3
            int r2 = cn.bluemobi.dylan.base.utils.u.a(r2, r6)
            r1.topMargin = r2
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r6)
            r3 = 2131493177(0x7f0c0139, float:1.8609827E38)
            r4 = 0
            android.view.View r2 = r2.inflate(r3, r4)
            r3 = 2131298051(0x7f090703, float:1.8214064E38)
            r2.findViewById(r3)
            r0.addView(r2, r1)
            android.view.Window r1 = r6.getWindow()
            android.view.View r1 = r1.getDecorView()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r1.addView(r0)
            android.content.res.Resources r1 = r6.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.widthPixels
            com.bxkj.student.v2.common.view.j$a r3 = new com.bxkj.student.v2.common.view.j$a
            r3.<init>(r5, r1, r6)
            r2.setOnTouchListener(r3)
            com.bxkj.student.v2.common.view.i r6 = new com.bxkj.student.v2.common.view.i
            r6.<init>()
            r2.setOnClickListener(r6)
            return r0
    }
}
