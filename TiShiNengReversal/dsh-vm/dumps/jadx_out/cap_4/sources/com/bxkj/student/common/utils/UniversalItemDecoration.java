package com.bxkj.student.common.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class UniversalItemDecoration extends androidx.recyclerview.widget.RecyclerView.ItemDecoration {
    private static final java.lang.String f = "UniversalItemDecoration";
    private java.util.Map<java.lang.Integer, com.bxkj.student.common.utils.UniversalItemDecoration.b> e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a extends com.bxkj.student.common.utils.UniversalItemDecoration.b {
        private android.graphics.Paint e;
        public int f;

        public a() {
                r2 = this;
                r2.<init>()
                r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                r2.f = r0
                android.graphics.Paint r0 = new android.graphics.Paint
                r1 = 1
                r0.<init>(r1)
                r2.e = r0
                android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
                r0.setStyle(r1)
                return
        }

        @Override // com.bxkj.student.common.utils.UniversalItemDecoration.b
        public void a(android.graphics.Canvas r9, int r10, int r11, int r12, int r13) {
                r8 = this;
                android.graphics.Paint r0 = r8.e
                int r1 = r8.f
                r0.setColor(r1)
                float r3 = (float) r10
                float r4 = (float) r11
                float r5 = (float) r12
                float r6 = (float) r13
                android.graphics.Paint r7 = r8.e
                r2 = r9
                r2.drawRect(r3, r4, r5, r6, r7)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class b {
        public int a;
        public int b;
        public int c;
        public int d;

        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract void a(android.graphics.Canvas r1, int r2, int r3, int r4, int r5);
    }

    public UniversalItemDecoration() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.e = r0
            return
    }

    public static int b(java.lang.String r0, int r1) {
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L5
            return r0
        L5:
            return r1
    }

    public abstract com.bxkj.student.common.utils.UniversalItemDecoration.b a(int r1);

    public void getItemOffsets(android.graphics.Rect r4, android.view.View r5, androidx.recyclerview.widget.RecyclerView r6, androidx.recyclerview.widget.RecyclerView.State r7) {
            r3 = this;
            super.getItemOffsets(r4, r5, r6, r7)
            int r6 = r6.getChildAdapterPosition(r5)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r5.setTag(r7)
            com.bxkj.student.common.utils.UniversalItemDecoration$b r5 = r3.a(r6)
            if (r5 == 0) goto L1f
            int r7 = r5.a
            int r0 = r5.c
            int r1 = r5.b
            int r2 = r5.d
            r4.set(r7, r0, r1, r2)
        L1f:
            java.util.Map<java.lang.Integer, com.bxkj.student.common.utils.UniversalItemDecoration$b> r4 = r3.e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r6, r5)
            return
    }

    public void onDraw(android.graphics.Canvas r13, androidx.recyclerview.widget.RecyclerView r14, androidx.recyclerview.widget.RecyclerView.State r15) {
            r12 = this;
            super.onDraw(r13, r14, r15)
            int r15 = r14.getChildCount()
            r0 = 0
            r1 = 0
        L9:
            if (r1 >= r15) goto L9a
            android.view.View r2 = r14.getChildAt(r1)
            java.lang.Object r3 = r2.getTag()
            java.lang.String r3 = r3.toString()
            int r3 = b(r3, r0)
            java.util.Map<java.lang.Integer, com.bxkj.student.common.utils.UniversalItemDecoration$b> r4 = r12.e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r4.get(r3)
            r4 = r3
            com.bxkj.student.common.utils.UniversalItemDecoration$b r4 = (com.bxkj.student.common.utils.UniversalItemDecoration.b) r4
            if (r4 != 0) goto L2d
            r5 = r13
            goto L95
        L2d:
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r3 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r3
            int r5 = r2.getBottom()
            int r6 = r3.bottomMargin
            int r9 = r5 + r6
            int r5 = r2.getLeft()
            int r6 = r3.leftMargin
            int r10 = r5 - r6
            int r5 = r2.getRight()
            int r6 = r3.rightMargin
            int r11 = r5 + r6
            int r2 = r2.getTop()
            int r3 = r3.topMargin
            int r2 = r2 - r3
            int r3 = r4.d
            if (r3 == 0) goto L67
            int r5 = r4.a
            int r6 = r10 - r5
            int r5 = r4.b
            int r8 = r11 + r5
            int r3 = r3 + r9
            r5 = r13
            r7 = r9
            r9 = r3
            r4.a(r5, r6, r7, r8, r9)
            r13 = r7
            goto L69
        L67:
            r5 = r13
            r13 = r9
        L69:
            int r3 = r4.c
            if (r3 == 0) goto L7d
            int r6 = r4.a
            int r6 = r10 - r6
            int r7 = r2 - r3
            int r3 = r4.b
            int r8 = r11 + r3
            r9 = r2
            r4.a(r5, r6, r7, r8, r9)
            r7 = r9
            goto L7e
        L7d:
            r7 = r2
        L7e:
            int r2 = r4.a
            if (r2 == 0) goto L8a
            int r6 = r10 - r2
            r9 = r13
            r8 = r10
            r4.a(r5, r6, r7, r8, r9)
            goto L8b
        L8a:
            r9 = r13
        L8b:
            int r13 = r4.b
            if (r13 == 0) goto L95
            int r8 = r11 + r13
            r6 = r11
            r4.a(r5, r6, r7, r8, r9)
        L95:
            int r1 = r1 + 1
            r13 = r5
            goto L9
        L9a:
            return
    }
}
