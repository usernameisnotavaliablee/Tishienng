package com.zhy.view.flowlayout;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class TagFlowLayout extends com.zhy.view.flowlayout.FlowLayout implements com.zhy.view.flowlayout.b.a {

    /* renamed from: q, reason: collision with root package name */
    private static final java.lang.String f47q = "TagFlowLayout";
    private static final java.lang.String r = "key_choose_pos";
    private static final java.lang.String s = "key_default";
    private com.zhy.view.flowlayout.b j;
    private boolean k;
    private int l;
    private android.view.MotionEvent m;
    private java.util.Set<java.lang.Integer> n;
    private com.zhy.view.flowlayout.TagFlowLayout.a o;
    private com.zhy.view.flowlayout.TagFlowLayout.b p;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a(java.util.Set<java.lang.Integer> r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        boolean a(android.view.View r1, int r2, com.zhy.view.flowlayout.FlowLayout r3);
    }

    public TagFlowLayout(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public TagFlowLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public TagFlowLayout(android.content.Context r3, android.util.AttributeSet r4, int r5) {
            r2 = this;
            r2.<init>(r3, r4, r5)
            r5 = 1
            r2.k = r5
            r0 = -1
            r2.l = r0
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r2.n = r1
            int[] r1 = com.zhy.view.flowlayout.R.styleable.TagFlowLayout
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r1)
            int r4 = com.zhy.view.flowlayout.R.styleable.TagFlowLayout_auto_select_effect
            boolean r4 = r3.getBoolean(r4, r5)
            r2.k = r4
            int r4 = com.zhy.view.flowlayout.R.styleable.TagFlowLayout_max_select
            int r4 = r3.getInt(r4, r0)
            r2.l = r4
            r3.recycle()
            boolean r3 = r2.k
            if (r3 == 0) goto L30
            r2.setClickable(r5)
        L30:
            return
    }

    private void b() {
            r12 = this;
            r12.removeAllViews()
            com.zhy.view.flowlayout.b r0 = r12.j
            java.util.HashSet r1 = r0.c()
            r2 = 0
        La:
            int r3 = r0.a()
            if (r2 >= r3) goto L90
            java.lang.Object r3 = r0.b(r2)
            android.view.View r3 = r0.d(r12, r2, r3)
            com.zhy.view.flowlayout.TagView r4 = new com.zhy.view.flowlayout.TagView
            android.content.Context r5 = r12.getContext()
            r4.<init>(r5)
            r5 = 1
            r3.setDuplicateParentStateEnabled(r5)
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            if (r6 == 0) goto L33
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            r4.setLayoutParams(r6)
            goto L61
        L33:
            android.view.ViewGroup$MarginLayoutParams r6 = new android.view.ViewGroup$MarginLayoutParams
            r7 = -2
            r6.<init>(r7, r7)
            android.content.Context r7 = r12.getContext()
            r8 = 1084227584(0x40a00000, float:5.0)
            int r7 = c(r7, r8)
            android.content.Context r9 = r12.getContext()
            int r9 = c(r9, r8)
            android.content.Context r10 = r12.getContext()
            int r10 = c(r10, r8)
            android.content.Context r11 = r12.getContext()
            int r8 = c(r11, r8)
            r6.setMargins(r7, r9, r10, r8)
            r4.setLayoutParams(r6)
        L61:
            r4.addView(r3)
            r12.addView(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            boolean r3 = r1.contains(r3)
            if (r3 == 0) goto L74
            r4.setChecked(r5)
        L74:
            com.zhy.view.flowlayout.b r3 = r12.j
            java.lang.Object r6 = r0.b(r2)
            boolean r3 = r3.g(r2, r6)
            if (r3 == 0) goto L8c
            java.util.Set<java.lang.Integer> r3 = r12.n
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r3.add(r6)
            r4.setChecked(r5)
        L8c:
            int r2 = r2 + 1
            goto La
        L90:
            java.util.Set<java.lang.Integer> r0 = r12.n
            r0.addAll(r1)
            return
    }

    public static int c(android.content.Context r0, float r1) {
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            return r0
    }

    private void d(com.zhy.view.flowlayout.TagView r5, int r6) {
            r4 = this;
            boolean r0 = r4.k
            if (r0 == 0) goto L79
            boolean r0 = r5.isChecked()
            r1 = 0
            if (r0 != 0) goto L5f
            int r0 = r4.l
            r2 = 1
            if (r0 != r2) goto L43
            java.util.Set<java.lang.Integer> r0 = r4.n
            int r0 = r0.size()
            if (r0 != r2) goto L43
            java.util.Set<java.lang.Integer> r0 = r4.n
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = r0.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r3 = r0.intValue()
            android.view.View r3 = r4.getChildAt(r3)
            com.zhy.view.flowlayout.TagView r3 = (com.zhy.view.flowlayout.TagView) r3
            r3.setChecked(r1)
            r5.setChecked(r2)
            java.util.Set<java.lang.Integer> r5 = r4.n
            r5.remove(r0)
            java.util.Set<java.lang.Integer> r5 = r4.n
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5.add(r6)
            goto L6b
        L43:
            int r0 = r4.l
            if (r0 <= 0) goto L52
            java.util.Set<java.lang.Integer> r0 = r4.n
            int r0 = r0.size()
            int r1 = r4.l
            if (r0 < r1) goto L52
            goto L79
        L52:
            r5.setChecked(r2)
            java.util.Set<java.lang.Integer> r5 = r4.n
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5.add(r6)
            goto L6b
        L5f:
            r5.setChecked(r1)
            java.util.Set<java.lang.Integer> r5 = r4.n
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5.remove(r6)
        L6b:
            com.zhy.view.flowlayout.TagFlowLayout$a r5 = r4.o
            if (r5 == 0) goto L79
            java.util.HashSet r6 = new java.util.HashSet
            java.util.Set<java.lang.Integer> r0 = r4.n
            r6.<init>(r0)
            r5.a(r6)
        L79:
            return
    }

    private com.zhy.view.flowlayout.TagView e(int r6, int r7) {
            r5 = this;
            int r0 = r5.getChildCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L28
            android.view.View r2 = r5.getChildAt(r1)
            com.zhy.view.flowlayout.TagView r2 = (com.zhy.view.flowlayout.TagView) r2
            int r3 = r2.getVisibility()
            r4 = 8
            if (r3 != r4) goto L16
            goto L25
        L16:
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r2.getHitRect(r3)
            boolean r3 = r3.contains(r6, r7)
            if (r3 == 0) goto L25
            return r2
        L25:
            int r1 = r1 + 1
            goto L5
        L28:
            r6 = 0
            return r6
    }

    private int f(android.view.View r4) {
            r3 = this;
            int r0 = r3.getChildCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L11
            android.view.View r2 = r3.getChildAt(r1)
            if (r2 != r4) goto Le
            return r1
        Le:
            int r1 = r1 + 1
            goto L5
        L11:
            r4 = -1
            return r4
    }

    @Override // com.zhy.view.flowlayout.b.a
    public void a() {
            r1 = this;
            java.util.Set<java.lang.Integer> r0 = r1.n
            r0.clear()
            r1.b()
            return
    }

    public com.zhy.view.flowlayout.b getAdapter() {
            r1 = this;
            com.zhy.view.flowlayout.b r0 = r1.j
            return r0
    }

    public java.util.Set<java.lang.Integer> getSelectedList() {
            r2 = this;
            java.util.HashSet r0 = new java.util.HashSet
            java.util.Set<java.lang.Integer> r1 = r2.n
            r0.<init>(r1)
            return r0
    }

    @Override // com.zhy.view.flowlayout.FlowLayout, android.view.View
    protected void onMeasure(int r6, int r7) {
            r5 = this;
            int r0 = r5.getChildCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L26
            android.view.View r2 = r5.getChildAt(r1)
            com.zhy.view.flowlayout.TagView r2 = (com.zhy.view.flowlayout.TagView) r2
            int r3 = r2.getVisibility()
            r4 = 8
            if (r3 != r4) goto L16
            goto L23
        L16:
            android.view.View r3 = r2.getTagView()
            int r3 = r3.getVisibility()
            if (r3 != r4) goto L23
            r2.setVisibility(r4)
        L23:
            int r1 = r1 + 1
            goto L5
        L26:
            super.onMeasure(r6, r7)
            return
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable r7) {
            r6 = this;
            boolean r0 = r7 instanceof android.os.Bundle
            if (r0 == 0) goto L44
            android.os.Bundle r7 = (android.os.Bundle) r7
            java.lang.String r0 = "key_choose_pos"
            java.lang.String r0 = r7.getString(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L3a
            java.lang.String r1 = "\\|"
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r2 = 0
        L1a:
            if (r2 >= r1) goto L3a
            r3 = r0[r2]
            int r3 = java.lang.Integer.parseInt(r3)
            java.util.Set<java.lang.Integer> r4 = r6.n
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r4.add(r5)
            android.view.View r3 = r6.getChildAt(r3)
            com.zhy.view.flowlayout.TagView r3 = (com.zhy.view.flowlayout.TagView) r3
            if (r3 == 0) goto L37
            r4 = 1
            r3.setChecked(r4)
        L37:
            int r2 = r2 + 1
            goto L1a
        L3a:
            java.lang.String r0 = "key_default"
            android.os.Parcelable r7 = r7.getParcelable(r0)
            super.onRestoreInstanceState(r7)
            return
        L44:
            super.onRestoreInstanceState(r7)
            return
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
            r5 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "key_default"
            android.os.Parcelable r2 = super.onSaveInstanceState()
            r0.putParcelable(r1, r2)
            java.util.Set<java.lang.Integer> r1 = r5.n
            int r1 = r1.size()
            java.lang.String r2 = ""
            if (r1 <= 0) goto L4e
            java.util.Set<java.lang.Integer> r1 = r5.n
            java.util.Iterator r1 = r1.iterator()
        L1e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L43
            java.lang.Object r3 = r1.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = "|"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            goto L1e
        L43:
            int r1 = r2.length()
            int r1 = r1 + (-1)
            r3 = 0
            java.lang.String r2 = r2.substring(r3, r1)
        L4e:
            java.lang.String r1 = "key_choose_pos"
            r0.putString(r1, r2)
            return r0
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r3) {
            r2 = this;
            int r0 = r3.getAction()
            r1 = 1
            if (r0 != r1) goto Ld
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r3)
            r2.m = r0
        Ld:
            boolean r3 = super.onTouchEvent(r3)
            return r3
    }

    @Override // android.view.View
    public boolean performClick() {
            r3 = this;
            android.view.MotionEvent r0 = r3.m
            if (r0 != 0) goto L9
            boolean r0 = super.performClick()
            return r0
        L9:
            float r0 = r0.getX()
            int r0 = (int) r0
            android.view.MotionEvent r1 = r3.m
            float r1 = r1.getY()
            int r1 = (int) r1
            r2 = 0
            r3.m = r2
            com.zhy.view.flowlayout.TagView r0 = r3.e(r0, r1)
            int r1 = r3.f(r0)
            if (r0 == 0) goto L32
            r3.d(r0, r1)
            com.zhy.view.flowlayout.TagFlowLayout$b r2 = r3.p
            if (r2 == 0) goto L32
            android.view.View r0 = r0.getTagView()
            boolean r0 = r2.a(r0, r1, r3)
            return r0
        L32:
            r0 = 1
            return r0
    }

    public void setAdapter(com.zhy.view.flowlayout.b r1) {
            r0 = this;
            r0.j = r1
            r1.f(r0)
            java.util.Set<java.lang.Integer> r1 = r0.n
            r1.clear()
            r0.b()
            return
    }

    public void setMaxSelectCount(int r2) {
            r1 = this;
            java.util.Set<java.lang.Integer> r0 = r1.n
            int r0 = r0.size()
            if (r0 <= r2) goto Ld
            java.util.Set<java.lang.Integer> r0 = r1.n
            r0.clear()
        Ld:
            r1.l = r2
            return
    }

    public void setOnSelectListener(com.zhy.view.flowlayout.TagFlowLayout.a r1) {
            r0 = this;
            r0.o = r1
            if (r1 == 0) goto L8
            r1 = 1
            r0.setClickable(r1)
        L8:
            return
    }

    public void setOnTagClickListener(com.zhy.view.flowlayout.TagFlowLayout.b r1) {
            r0 = this;
            r0.p = r1
            if (r1 == 0) goto L8
            r1 = 1
            r0.setClickable(r1)
        L8:
            return
    }
}
