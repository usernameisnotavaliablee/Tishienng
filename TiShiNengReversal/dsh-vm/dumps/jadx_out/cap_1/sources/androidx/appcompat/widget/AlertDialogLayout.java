package androidx.appcompat.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class AlertDialogLayout extends androidx.appcompat.widget.LinearLayoutCompat {
    public AlertDialogLayout(@androidx.annotation.Nullable android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public AlertDialogLayout(@androidx.annotation.Nullable android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private void forceUniformWidth(int r10, int r11) {
            r9 = this;
            int r0 = r9.getMeasuredWidth()
            r1 = 1073741824(0x40000000, float:2.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r0 = 0
        Lb:
            if (r0 >= r10) goto L3b
            android.view.View r3 = r9.getChildAt(r0)
            int r1 = r3.getVisibility()
            r2 = 8
            if (r1 == r2) goto L36
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r1 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r1
            int r2 = r1.width
            r5 = -1
            if (r2 != r5) goto L36
            int r8 = r1.height
            int r2 = r3.getMeasuredHeight()
            r1.height = r2
            r5 = 0
            r7 = 0
            r2 = r9
            r6 = r11
            r2.measureChildWithMargins(r3, r4, r5, r6, r7)
            r1.height = r8
            goto L37
        L36:
            r6 = r11
        L37:
            int r0 = r0 + 1
            r11 = r6
            goto Lb
        L3b:
            return
    }

    private static int resolveMinimumHeight(android.view.View r3) {
            int r0 = androidx.core.view.ViewCompat.getMinimumHeight(r3)
            if (r0 <= 0) goto L7
            return r0
        L7:
            boolean r0 = r3 instanceof android.view.ViewGroup
            r1 = 0
            if (r0 == 0) goto L1e
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r0 = r3.getChildCount()
            r2 = 1
            if (r0 != r2) goto L1e
            android.view.View r3 = r3.getChildAt(r1)
            int r3 = resolveMinimumHeight(r3)
            return r3
        L1e:
            return r1
    }

    private void setChildFrame(android.view.View r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            int r4 = r4 + r2
            int r5 = r5 + r3
            r1.layout(r2, r3, r4, r5)
            return
    }

    private boolean tryOnMeasure(int r17, int r18) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            int r3 = r0.getChildCount()
            r4 = 0
            r5 = 0
            r6 = r4
            r7 = r6
            r8 = 0
        Lf:
            r9 = 8
            if (r8 >= r3) goto L3f
            android.view.View r10 = r0.getChildAt(r8)
            int r11 = r10.getVisibility()
            if (r11 != r9) goto L1e
            goto L3c
        L1e:
            int r9 = r10.getId()
            int r11 = androidx.appcompat.R.id.topPanel
            if (r9 != r11) goto L28
            r4 = r10
            goto L3c
        L28:
            int r11 = androidx.appcompat.R.id.buttonPanel
            if (r9 != r11) goto L2e
            r6 = r10
            goto L3c
        L2e:
            int r11 = androidx.appcompat.R.id.contentPanel
            if (r9 == r11) goto L38
            int r11 = androidx.appcompat.R.id.customPanel
            if (r9 != r11) goto L37
            goto L38
        L37:
            return r5
        L38:
            if (r7 == 0) goto L3b
            return r5
        L3b:
            r7 = r10
        L3c:
            int r8 = r8 + 1
            goto Lf
        L3f:
            int r8 = android.view.View.MeasureSpec.getMode(r2)
            int r10 = android.view.View.MeasureSpec.getSize(r2)
            int r11 = android.view.View.MeasureSpec.getMode(r1)
            int r12 = r0.getPaddingTop()
            int r13 = r0.getPaddingBottom()
            int r12 = r12 + r13
            if (r4 == 0) goto L67
            r4.measure(r1, r5)
            int r13 = r4.getMeasuredHeight()
            int r12 = r12 + r13
            int r4 = r4.getMeasuredState()
            int r4 = android.view.View.combineMeasuredStates(r5, r4)
            goto L68
        L67:
            r4 = 0
        L68:
            if (r6 == 0) goto L80
            r6.measure(r1, r5)
            int r13 = resolveMinimumHeight(r6)
            int r14 = r6.getMeasuredHeight()
            int r14 = r14 - r13
            int r12 = r12 + r13
            int r15 = r6.getMeasuredState()
            int r4 = android.view.View.combineMeasuredStates(r4, r15)
            goto L82
        L80:
            r13 = 0
            r14 = 0
        L82:
            if (r7 == 0) goto La3
            if (r8 != 0) goto L88
            r15 = 0
            goto L92
        L88:
            int r15 = r10 - r12
            int r15 = java.lang.Math.max(r5, r15)
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r8)
        L92:
            r7.measure(r1, r15)
            int r15 = r7.getMeasuredHeight()
            int r12 = r12 + r15
            int r5 = r7.getMeasuredState()
            int r4 = android.view.View.combineMeasuredStates(r4, r5)
            goto La4
        La3:
            r15 = 0
        La4:
            int r10 = r10 - r12
            r5 = 1073741824(0x40000000, float:2.0)
            if (r6 == 0) goto Lc6
            int r12 = r12 - r13
            int r14 = java.lang.Math.min(r10, r14)
            if (r14 <= 0) goto Lb2
            int r10 = r10 - r14
            int r13 = r13 + r14
        Lb2:
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r5)
            r6.measure(r1, r13)
            int r13 = r6.getMeasuredHeight()
            int r12 = r12 + r13
            int r6 = r6.getMeasuredState()
            int r4 = android.view.View.combineMeasuredStates(r4, r6)
        Lc6:
            if (r7 == 0) goto Le0
            if (r10 <= 0) goto Le0
            int r12 = r12 - r15
            int r15 = r15 + r10
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r8)
            r7.measure(r1, r6)
            int r6 = r7.getMeasuredHeight()
            int r12 = r12 + r6
            int r6 = r7.getMeasuredState()
            int r4 = android.view.View.combineMeasuredStates(r4, r6)
        Le0:
            r6 = 0
            r7 = 0
        Le2:
            if (r6 >= r3) goto Lf9
            android.view.View r8 = r0.getChildAt(r6)
            int r10 = r8.getVisibility()
            if (r10 == r9) goto Lf6
            int r8 = r8.getMeasuredWidth()
            int r7 = java.lang.Math.max(r7, r8)
        Lf6:
            int r6 = r6 + 1
            goto Le2
        Lf9:
            int r6 = r0.getPaddingLeft()
            int r8 = r0.getPaddingRight()
            int r6 = r6 + r8
            int r7 = r7 + r6
            int r1 = android.view.View.resolveSizeAndState(r7, r1, r4)
            r4 = 0
            int r4 = android.view.View.resolveSizeAndState(r12, r2, r4)
            r0.setMeasuredDimension(r1, r4)
            if (r11 == r5) goto L114
            r0.forceUniformWidth(r3, r2)
        L114:
            r1 = 1
            return r1
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
            r10 = this;
            int r11 = r10.getPaddingLeft()
            int r14 = r14 - r12
            int r12 = r10.getPaddingRight()
            int r12 = r14 - r12
            int r14 = r14 - r11
            int r0 = r10.getPaddingRight()
            int r14 = r14 - r0
            int r0 = r10.getMeasuredHeight()
            int r1 = r10.getChildCount()
            int r2 = r10.getGravity()
            r3 = r2 & 112(0x70, float:1.57E-43)
            r4 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r4
            r4 = 16
            if (r3 == r4) goto L39
            r4 = 80
            if (r3 == r4) goto L30
            int r13 = r10.getPaddingTop()
            goto L43
        L30:
            int r3 = r10.getPaddingTop()
            int r3 = r3 + r15
            int r3 = r3 - r13
            int r13 = r3 - r0
            goto L43
        L39:
            int r3 = r10.getPaddingTop()
            int r15 = r15 - r13
            int r15 = r15 - r0
            int r15 = r15 / 2
            int r13 = r3 + r15
        L43:
            android.graphics.drawable.Drawable r15 = r10.getDividerDrawable()
            r0 = 0
            if (r15 != 0) goto L4c
            r15 = 0
            goto L50
        L4c:
            int r15 = r15.getIntrinsicHeight()
        L50:
            if (r0 >= r1) goto Lb1
            android.view.View r4 = r10.getChildAt(r0)
            if (r4 == 0) goto Lae
            int r3 = r4.getVisibility()
            r5 = 8
            if (r3 == r5) goto Lae
            int r7 = r4.getMeasuredWidth()
            int r8 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r3 = r4.getLayoutParams()
            r9 = r3
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r9 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r9
            int r3 = r9.gravity
            if (r3 >= 0) goto L74
            r3 = r2
        L74:
            int r5 = androidx.core.view.ViewCompat.getLayoutDirection(r10)
            int r3 = androidx.core.view.GravityCompat.getAbsoluteGravity(r3, r5)
            r3 = r3 & 7
            r5 = 1
            if (r3 == r5) goto L8f
            r5 = 5
            if (r3 == r5) goto L89
            int r3 = r9.leftMargin
            int r3 = r3 + r11
        L87:
            r5 = r3
            goto L9a
        L89:
            int r3 = r12 - r7
            int r5 = r9.rightMargin
        L8d:
            int r3 = r3 - r5
            goto L87
        L8f:
            int r3 = r14 - r7
            int r3 = r3 / 2
            int r3 = r3 + r11
            int r5 = r9.leftMargin
            int r3 = r3 + r5
            int r5 = r9.rightMargin
            goto L8d
        L9a:
            boolean r3 = r10.hasDividerBeforeChildAt(r0)
            if (r3 == 0) goto La1
            int r13 = r13 + r15
        La1:
            int r3 = r9.topMargin
            int r6 = r13 + r3
            r3 = r10
            r3.setChildFrame(r4, r5, r6, r7, r8)
            int r13 = r9.bottomMargin
            int r8 = r8 + r13
            int r6 = r6 + r8
            r13 = r6
        Lae:
            int r0 = r0 + 1
            goto L50
        Lb1:
            return
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int r2, int r3) {
            r1 = this;
            boolean r0 = r1.tryOnMeasure(r2, r3)
            if (r0 != 0) goto L9
            super.onMeasure(r2, r3)
        L9:
            return
    }
}
