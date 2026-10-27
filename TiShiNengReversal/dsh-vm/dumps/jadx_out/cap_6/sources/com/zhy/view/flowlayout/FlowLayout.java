package com.zhy.view.flowlayout;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class FlowLayout extends android.view.ViewGroup {
    private static final java.lang.String f = "FlowLayout";
    private static final int g = -1;
    private static final int h = 0;
    private static final int i = 1;
    protected java.util.List<java.util.List<android.view.View>> a;
    protected java.util.List<java.lang.Integer> b;
    protected java.util.List<java.lang.Integer> c;
    private int d;
    private java.util.List<android.view.View> e;

    public FlowLayout(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public FlowLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public FlowLayout(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.a = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.b = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.c = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.e = r3
            int[] r3 = com.zhy.view.flowlayout.R.styleable.TagFlowLayout
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r2, r3)
            int r2 = com.zhy.view.flowlayout.R.styleable.TagFlowLayout_gravity
            r3 = -1
            int r2 = r1.getInt(r2, r3)
            r0.d = r2
            r1.recycle()
            return
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r2 = this;
            android.view.ViewGroup$MarginLayoutParams r0 = new android.view.ViewGroup$MarginLayoutParams
            r1 = -2
            r0.<init>(r1, r1)
            return r0
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            android.view.ViewGroup$MarginLayoutParams r0 = new android.view.ViewGroup$MarginLayoutParams
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            android.view.ViewGroup$MarginLayoutParams r0 = new android.view.ViewGroup$MarginLayoutParams
            r0.<init>(r2)
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
            r10 = this;
            java.util.List<java.util.List<android.view.View>> r11 = r10.a
            r11.clear()
            java.util.List<java.lang.Integer> r11 = r10.b
            r11.clear()
            java.util.List<java.lang.Integer> r11 = r10.c
            r11.clear()
            java.util.List<android.view.View> r11 = r10.e
            r11.clear()
            int r11 = r10.getWidth()
            int r12 = r10.getChildCount()
            r13 = 0
            r14 = 0
            r15 = 0
            r0 = 0
        L20:
            r1 = 8
            if (r14 >= r12) goto L92
            android.view.View r2 = r10.getChildAt(r14)
            int r3 = r2.getVisibility()
            if (r3 != r1) goto L2f
            goto L8f
        L2f:
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r3 = r2.getMeasuredWidth()
            int r4 = r2.getMeasuredHeight()
            int r5 = r3 + r0
            int r6 = r1.leftMargin
            int r5 = r5 + r6
            int r6 = r1.rightMargin
            int r5 = r5 + r6
            int r6 = r10.getPaddingLeft()
            int r6 = r11 - r6
            int r7 = r10.getPaddingRight()
            int r6 = r6 - r7
            if (r5 <= r6) goto L79
            java.util.List<java.lang.Integer> r5 = r10.b
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r5.add(r15)
            java.util.List<java.util.List<android.view.View>> r15 = r10.a
            java.util.List<android.view.View> r5 = r10.e
            r15.add(r5)
            java.util.List<java.lang.Integer> r15 = r10.c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r15.add(r0)
            int r15 = r1.topMargin
            int r15 = r15 + r4
            int r0 = r1.bottomMargin
            int r15 = r15 + r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.e = r0
            r0 = 0
        L79:
            int r5 = r1.leftMargin
            int r3 = r3 + r5
            int r5 = r1.rightMargin
            int r3 = r3 + r5
            int r0 = r0 + r3
            int r3 = r1.topMargin
            int r4 = r4 + r3
            int r1 = r1.bottomMargin
            int r4 = r4 + r1
            int r15 = java.lang.Math.max(r15, r4)
            java.util.List<android.view.View> r1 = r10.e
            r1.add(r2)
        L8f:
            int r14 = r14 + 1
            goto L20
        L92:
            java.util.List<java.lang.Integer> r12 = r10.b
            java.lang.Integer r14 = java.lang.Integer.valueOf(r15)
            r12.add(r14)
            java.util.List<java.lang.Integer> r12 = r10.c
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
            r12.add(r14)
            java.util.List<java.util.List<android.view.View>> r12 = r10.a
            java.util.List<android.view.View> r14 = r10.e
            r12.add(r14)
            int r12 = r10.getPaddingLeft()
            int r14 = r10.getPaddingTop()
            java.util.List<java.util.List<android.view.View>> r15 = r10.a
            int r15 = r15.size()
            r0 = 0
        Lba:
            if (r0 >= r15) goto L142
            java.util.List<java.util.List<android.view.View>> r2 = r10.a
            java.lang.Object r2 = r2.get(r0)
            java.util.List r2 = (java.util.List) r2
            r10.e = r2
            java.util.List<java.lang.Integer> r2 = r10.b
            java.lang.Object r2 = r2.get(r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.util.List<java.lang.Integer> r3 = r10.c
            java.lang.Object r3 = r3.get(r0)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r4 = r10.d
            r5 = -1
            if (r4 == r5) goto Lfa
            if (r4 == 0) goto Lf1
            r5 = 1
            if (r4 == r5) goto Le9
            goto Lfe
        Le9:
            int r12 = r11 - r3
            int r3 = r10.getPaddingLeft()
        Lef:
            int r12 = r12 + r3
            goto Lfe
        Lf1:
            int r12 = r11 - r3
            int r12 = r12 / 2
            int r3 = r10.getPaddingLeft()
            goto Lef
        Lfa:
            int r12 = r10.getPaddingLeft()
        Lfe:
            r3 = 0
        Lff:
            java.util.List<android.view.View> r4 = r10.e
            int r4 = r4.size()
            if (r3 >= r4) goto L13d
            java.util.List<android.view.View> r4 = r10.e
            java.lang.Object r4 = r4.get(r3)
            android.view.View r4 = (android.view.View) r4
            int r5 = r4.getVisibility()
            if (r5 != r1) goto L116
            goto L13a
        L116:
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            int r6 = r5.leftMargin
            int r6 = r6 + r12
            int r7 = r5.topMargin
            int r7 = r7 + r14
            int r8 = r4.getMeasuredWidth()
            int r8 = r8 + r6
            int r9 = r4.getMeasuredHeight()
            int r9 = r9 + r7
            r4.layout(r6, r7, r8, r9)
            int r4 = r4.getMeasuredWidth()
            int r6 = r5.leftMargin
            int r4 = r4 + r6
            int r5 = r5.rightMargin
            int r4 = r4 + r5
            int r12 = r12 + r4
        L13a:
            int r3 = r3 + 1
            goto Lff
        L13d:
            int r14 = r14 + r2
            int r0 = r0 + 1
            goto Lba
        L142:
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r19, int r20) {
            r18 = this;
            r0 = r18
            int r1 = android.view.View.MeasureSpec.getSize(r19)
            int r2 = android.view.View.MeasureSpec.getMode(r19)
            int r3 = android.view.View.MeasureSpec.getSize(r20)
            int r4 = android.view.View.MeasureSpec.getMode(r20)
            int r5 = r0.getChildCount()
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
        L1b:
            if (r6 >= r5) goto L87
            android.view.View r11 = r0.getChildAt(r6)
            int r12 = r11.getVisibility()
            r13 = 8
            if (r12 != r13) goto L39
            int r11 = r5 + (-1)
            if (r6 != r11) goto L32
            int r7 = java.lang.Math.max(r8, r7)
            int r10 = r10 + r9
        L32:
            r12 = r19
            r13 = r20
            r16 = r1
            goto L82
        L39:
            r12 = r19
            r13 = r20
            r0.measureChild(r11, r12, r13)
            android.view.ViewGroup$LayoutParams r14 = r11.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r14 = (android.view.ViewGroup.MarginLayoutParams) r14
            int r15 = r11.getMeasuredWidth()
            r16 = r1
            int r1 = r14.leftMargin
            int r15 = r15 + r1
            int r1 = r14.rightMargin
            int r15 = r15 + r1
            int r1 = r11.getMeasuredHeight()
            int r11 = r14.topMargin
            int r1 = r1 + r11
            int r11 = r14.bottomMargin
            int r1 = r1 + r11
            int r11 = r8 + r15
            int r14 = r0.getPaddingLeft()
            int r14 = r16 - r14
            int r17 = r0.getPaddingRight()
            int r14 = r14 - r17
            if (r11 <= r14) goto L72
            int r7 = java.lang.Math.max(r7, r8)
            int r10 = r10 + r9
            goto L77
        L72:
            int r1 = java.lang.Math.max(r9, r1)
            r15 = r11
        L77:
            int r8 = r5 + (-1)
            if (r6 != r8) goto L80
            int r7 = java.lang.Math.max(r15, r7)
            int r10 = r10 + r1
        L80:
            r9 = r1
            r8 = r15
        L82:
            int r6 = r6 + 1
            r1 = r16
            goto L1b
        L87:
            r16 = r1
            r1 = 1073741824(0x40000000, float:2.0)
            if (r2 != r1) goto L90
            r2 = r16
            goto L9a
        L90:
            int r2 = r0.getPaddingLeft()
            int r7 = r7 + r2
            int r2 = r0.getPaddingRight()
            int r2 = r2 + r7
        L9a:
            if (r4 != r1) goto L9d
            goto La8
        L9d:
            int r1 = r0.getPaddingTop()
            int r10 = r10 + r1
            int r1 = r0.getPaddingBottom()
            int r3 = r10 + r1
        La8:
            r0.setMeasuredDimension(r2, r3)
            return
    }
}
