package com.bxkj.student.v2.common.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class CardGridMenuItemDecoration extends androidx.recyclerview.widget.RecyclerView.ItemDecoration {
    private final float e;
    private final int f;

    public CardGridMenuItemDecoration() {
            r3 = this;
            r3.<init>()
            com.bxkj.student.App$a r0 = com.bxkj.student.App.d
            com.bxkj.student.App r1 = r0.a()
            r2 = 1092616192(0x41200000, float:10.0)
            int r1 = cn.bluemobi.dylan.base.utils.u.a(r2, r1)
            float r1 = (float) r1
            r3.e = r1
            r1 = 1097859072(0x41700000, float:15.0)
            com.bxkj.student.App r0 = r0.a()
            int r0 = cn.bluemobi.dylan.base.utils.u.a(r1, r0)
            r3.f = r0
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
            float r5 = r11.e
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
            float r7 = r11.e
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
            float r7 = r11.e
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

    private final boolean b(androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup r4, int r5, int r6) {
            r3 = this;
            r0 = 1
            if (r0 > r6) goto L13
            r1 = 1
        L4:
            int r2 = r5 - r1
            int r2 = r4.getSpanSize(r2)
            if (r2 == r0) goto Le
            r4 = 0
            return r4
        Le:
            if (r1 == r6) goto L13
            int r1 = r1 + 1
            goto L4
        L13:
            return r0
    }

    private final boolean c(androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup r6, int r7, int r8) {
            r5 = this;
            int r0 = r6.getSpanGroupIndex(r7, r8)
            r1 = 1
            if (r1 > r8) goto L1e
            r2 = 1
        L8:
            int r3 = r7 + r2
            int r4 = r6.getSpanGroupIndex(r3, r8)
            if (r4 == r0) goto L19
            int r6 = r6.getSpanSize(r3)
            if (r6 != r1) goto L17
            return r1
        L17:
            r6 = 0
            return r6
        L19:
            if (r2 == r8) goto L1e
            int r2 = r2 + 1
            goto L8
        L1e:
            return r1
    }

    public void getItemOffsets(@org.jetbrains.annotations.NotNull android.graphics.Rect r3, @org.jetbrains.annotations.NotNull android.view.View r4, @org.jetbrains.annotations.NotNull androidx.recyclerview.widget.RecyclerView r5, @org.jetbrains.annotations.NotNull androidx.recyclerview.widget.RecyclerView.State r6) {
            r2 = this;
            java.lang.String r0 = "outRect"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "view"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "state"
            kotlin.jvm.internal.g0.p(r6, r0)
            super.getItemOffsets(r3, r4, r5, r6)
            int r4 = r5.getChildAdapterPosition(r4)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r5 = r5.getLayoutManager()
            java.lang.String r6 = "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager"
            kotlin.jvm.internal.g0.n(r5, r6)
            androidx.recyclerview.widget.GridLayoutManager r5 = (androidx.recyclerview.widget.GridLayoutManager) r5
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r6 = r5.getSpanSizeLookup()
            int r0 = r6.getSpanSize(r4)
            r1 = 1
            if (r0 == r1) goto L32
            goto L4d
        L32:
            int r5 = r5.getSpanCount()
            kotlin.jvm.internal.g0.m(r6)
            boolean r0 = r2.b(r6, r4, r5)
            boolean r4 = r2.c(r6, r4, r5)
            if (r0 != 0) goto L47
            int r5 = r2.f
            r3.top = r5
        L47:
            if (r4 != 0) goto L4d
            int r4 = r2.f
            r3.bottom = r4
        L4d:
            return
    }

    public void onDraw(@org.jetbrains.annotations.NotNull android.graphics.Canvas r11, @org.jetbrains.annotations.NotNull androidx.recyclerview.widget.RecyclerView r12, @org.jetbrains.annotations.NotNull androidx.recyclerview.widget.RecyclerView.State r13) {
            r10 = this;
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "state"
            kotlin.jvm.internal.g0.p(r13, r0)
            int r13 = r12.getChildCount()
            r0 = 0
            r1 = 0
        L15:
            if (r1 >= r13) goto L8b
            android.view.View r2 = r12.getChildAt(r1)
            int r3 = r12.getChildAdapterPosition(r2)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r4 = r12.getLayoutManager()
            java.lang.String r5 = "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager"
            kotlin.jvm.internal.g0.n(r4, r5)
            androidx.recyclerview.widget.GridLayoutManager r4 = (androidx.recyclerview.widget.GridLayoutManager) r4
            int r5 = r4.getSpanCount()
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r4 = r4.getSpanSizeLookup()
            int r6 = r4.getSpanSize(r3)
            int r7 = r4.getSpanIndex(r3, r5)
            r8 = 1
            if (r6 != r8) goto L88
            if (r7 == 0) goto L40
            goto L88
        L40:
            kotlin.jvm.internal.g0.m(r4)
            boolean r6 = r10.c(r4, r3, r5)
            boolean r3 = r10.b(r4, r3, r5)
            if (r3 == 0) goto L53
            if (r6 == 0) goto L51
            r8 = 2
            goto L57
        L51:
            r8 = 3
            goto L57
        L53:
            if (r6 == 0) goto L56
            goto L57
        L56:
            r8 = 0
        L57:
            android.graphics.drawable.GradientDrawable r4 = r10.a(r8)
            int r7 = r2.getLeft()
            if (r3 == 0) goto L66
            int r3 = r2.getTop()
            goto L6d
        L66:
            int r3 = r2.getTop()
            int r8 = r10.f
            int r3 = r3 - r8
        L6d:
            int r8 = r2.getLeft()
            int r9 = r2.getWidth()
            int r9 = r9 * r5
            int r8 = r8 + r9
            int r2 = r2.getBottom()
            if (r6 == 0) goto L7f
            goto L82
        L7f:
            int r5 = r10.f
            int r2 = r2 + r5
        L82:
            r4.setBounds(r7, r3, r8, r2)
            r4.draw(r11)
        L88:
            int r1 = r1 + 1
            goto L15
        L8b:
            return
    }
}
