package com.bxkj.student.v2.common.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class CardListMenuItemDecoration extends androidx.recyclerview.widget.RecyclerView.ItemDecoration {

    @org.jetbrains.annotations.NotNull
    private final android.graphics.Paint e;
    private final int f;
    private final float g;
    private int h;
    private final int i;
    private final int j;
    private final int k;

    public CardListMenuItemDecoration() {
            r4 = this;
            r4.<init>()
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 1
            r0.<init>(r1)
            r4.e = r0
            com.bxkj.student.App$a r0 = com.bxkj.student.App.d
            com.bxkj.student.App r1 = r0.a()
            r2 = 1092616192(0x41200000, float:10.0)
            int r1 = cn.bluemobi.dylan.base.utils.u.a(r2, r1)
            r4.f = r1
            com.bxkj.student.App r1 = r0.a()
            int r1 = cn.bluemobi.dylan.base.utils.u.a(r2, r1)
            float r1 = (float) r1
            r4.g = r1
            r1 = 2131099756(0x7f06006c, float:1.7811874E38)
            r4.h = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            com.bxkj.student.App r3 = r0.a()
            int r1 = cn.bluemobi.dylan.base.utils.u.a(r1, r3)
            r4.i = r1
            r1 = 1113325568(0x425c0000, float:55.0)
            com.bxkj.student.App r3 = r0.a()
            int r1 = cn.bluemobi.dylan.base.utils.u.a(r1, r3)
            r4.j = r1
            com.bxkj.student.App r0 = r0.a()
            int r0 = cn.bluemobi.dylan.base.utils.u.a(r2, r0)
            r4.k = r0
            return
    }

    private final android.graphics.drawable.GradientDrawable a(int r12) {
            r11 = this;
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            r1 = 7
            r2 = 6
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 0
            r7 = 8
            r8 = 2
            r9 = 1
            if (r12 == 0) goto L53
            r10 = 0
            if (r12 == r9) goto L3e
            if (r12 == r8) goto L2b
            float[] r12 = new float[r7]
            r12[r6] = r10
            r12[r9] = r10
            r12[r8] = r10
            r12[r5] = r10
            float r5 = r11.g
            r12[r4] = r5
            r12[r3] = r5
            r12[r2] = r5
            r12[r1] = r5
            goto L67
        L2b:
            float[] r12 = new float[r7]
            r12[r6] = r10
            r12[r9] = r10
            r12[r8] = r10
            r12[r5] = r10
            r12[r4] = r10
            r12[r3] = r10
            r12[r2] = r10
            r12[r1] = r10
            goto L67
        L3e:
            float[] r12 = new float[r7]
            float r7 = r11.g
            r12[r6] = r7
            r12[r9] = r7
            r12[r8] = r7
            r12[r5] = r7
            r12[r4] = r10
            r12[r3] = r10
            r12[r2] = r10
            r12[r1] = r10
            goto L67
        L53:
            float[] r12 = new float[r7]
            float r7 = r11.g
            r12[r6] = r7
            r12[r9] = r7
            r12[r8] = r7
            r12[r5] = r7
            r12[r4] = r7
            r12[r3] = r7
            r12[r2] = r7
            r12[r1] = r7
        L67:
            r0.setCornerRadii(r12)
            r12 = -1
            r0.setColor(r12)
            return r0
    }

    private final boolean b(androidx.recyclerview.widget.RecyclerView r4, int r5) {
            r3 = this;
            r0 = 1
            if (r5 != 0) goto L4
            return r0
        L4:
            androidx.recyclerview.widget.RecyclerView$Adapter r1 = r4.getAdapter()
            r2 = 0
            if (r1 == 0) goto L14
            int r1 = r1.getItemViewType(r5)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L15
        L14:
            r1 = r2
        L15:
            androidx.recyclerview.widget.RecyclerView$Adapter r4 = r4.getAdapter()
            if (r4 == 0) goto L24
            int r5 = r5 - r0
            int r4 = r4.getItemViewType(r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
        L24:
            boolean r4 = kotlin.jvm.internal.g0.g(r1, r2)
            r4 = r4 ^ r0
            return r4
    }

    private final boolean c(androidx.recyclerview.widget.RecyclerView r4, int r5) {
            r3 = this;
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r4.getAdapter()
            r1 = 1
            if (r0 == 0) goto Ld
            int r0 = r0.getItemCount()
            int r0 = r0 - r1
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r5 != r0) goto L11
            return r1
        L11:
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r4.getAdapter()
            r2 = 0
            if (r0 == 0) goto L21
            int r0 = r0.getItemViewType(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L22
        L21:
            r0 = r2
        L22:
            androidx.recyclerview.widget.RecyclerView$Adapter r4 = r4.getAdapter()
            if (r4 == 0) goto L31
            int r5 = r5 + r1
            int r4 = r4.getItemViewType(r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
        L31:
            boolean r4 = kotlin.jvm.internal.g0.g(r0, r2)
            r4 = r4 ^ r1
            return r4
    }

    public void getItemOffsets(@org.jetbrains.annotations.NotNull android.graphics.Rect r2, @org.jetbrains.annotations.NotNull android.view.View r3, @org.jetbrains.annotations.NotNull androidx.recyclerview.widget.RecyclerView r4, @org.jetbrains.annotations.NotNull androidx.recyclerview.widget.RecyclerView.State r5) {
            r1 = this;
            java.lang.String r0 = "outRect"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "view"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "state"
            kotlin.jvm.internal.g0.p(r5, r0)
            super.getItemOffsets(r2, r3, r4, r5)
            int r3 = r4.getChildAdapterPosition(r3)
            androidx.recyclerview.widget.RecyclerView$Adapter r5 = r4.getAdapter()
            if (r5 == 0) goto L28
            int r5 = r5.getItemViewType(r3)
            if (r5 != 0) goto L28
            return
        L28:
            boolean r5 = r1.b(r4, r3)
            boolean r3 = r1.c(r4, r3)
            if (r5 == 0) goto L36
            int r4 = r1.f
            r2.top = r4
        L36:
            if (r3 == 0) goto L3d
            int r3 = r1.f
            r2.bottom = r3
            return
        L3d:
            int r3 = r1.i
            r2.bottom = r3
            return
    }

    public void onDraw(@org.jetbrains.annotations.NotNull android.graphics.Canvas r12, @org.jetbrains.annotations.NotNull androidx.recyclerview.widget.RecyclerView r13, @org.jetbrains.annotations.NotNull androidx.recyclerview.widget.RecyclerView.State r14) {
            r11 = this;
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.g0.p(r13, r0)
            java.lang.String r0 = "state"
            kotlin.jvm.internal.g0.p(r14, r0)
            super.onDraw(r12, r13, r14)
            int r14 = r13.getChildCount()
            r0 = 0
            r1 = 0
        L18:
            if (r1 >= r14) goto Lca
            androidx.recyclerview.widget.RecyclerView$Adapter r2 = r13.getAdapter()
            if (r2 == 0) goto L29
            int r2 = r2.getItemViewType(r1)
            if (r2 != 0) goto L29
        L26:
            r5 = r12
            goto Lc5
        L29:
            android.view.View r2 = r13.getChildAt(r1)
            int r3 = r13.getChildAdapterPosition(r2)
            boolean r4 = r11.b(r13, r3)
            boolean r3 = r11.c(r13, r3)
            if (r4 == 0) goto L3f
            if (r3 == 0) goto L3f
            r5 = 0
            goto L4c
        L3f:
            if (r4 == 0) goto L45
            if (r3 != 0) goto L45
            r5 = 1
            goto L4c
        L45:
            if (r3 == 0) goto L4b
            if (r4 != 0) goto L4b
            r5 = 3
            goto L4c
        L4b:
            r5 = 2
        L4c:
            android.graphics.drawable.GradientDrawable r5 = r11.a(r5)
            int r6 = r2.getLeft()
            if (r4 != 0) goto L5b
            int r4 = r2.getTop()
            goto L62
        L5b:
            int r4 = r2.getTop()
            int r7 = r11.f
            int r4 = r4 - r7
        L62:
            int r7 = r2.getLeft()
            int r8 = r2.getWidth()
            int r7 = r7 + r8
            int r8 = r2.getBottom()
            if (r3 != 0) goto L75
            int r9 = r11.i
        L73:
            int r8 = r8 + r9
            goto L78
        L75:
            int r9 = r11.f
            goto L73
        L78:
            r5.setBounds(r6, r4, r7, r8)
            r5.draw(r12)
            if (r3 != 0) goto L26
            android.graphics.Paint r3 = r11.e
            android.content.Context r4 = r13.getContext()
            int r5 = r11.h
            int r4 = androidx.core.content.ContextCompat.getColor(r4, r5)
            r3.setColor(r4)
            android.graphics.Paint r3 = r11.e
            int r4 = r11.i
            float r4 = (float) r4
            r3.setStrokeWidth(r4)
            int r3 = r2.getLeft()
            float r3 = (float) r3
            int r4 = r11.j
            float r4 = (float) r4
            float r6 = r3 + r4
            int r3 = r2.getBottom()
            float r3 = (float) r3
            int r4 = r11.i
            float r4 = (float) r4
            float r7 = r3 + r4
            int r3 = r2.getRight()
            float r3 = (float) r3
            int r4 = r11.k
            float r4 = (float) r4
            float r8 = r3 - r4
            int r2 = r2.getBottom()
            float r2 = (float) r2
            int r3 = r11.i
            float r3 = (float) r3
            float r9 = r2 + r3
            android.graphics.Paint r10 = r11.e
            r5 = r12
            r5.drawLine(r6, r7, r8, r9, r10)
        Lc5:
            int r1 = r1 + 1
            r12 = r5
            goto L18
        Lca:
            return
    }
}
