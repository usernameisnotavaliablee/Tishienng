package com.bxkj.base.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ExpandedLinearLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {

    /* renamed from: r, reason: collision with root package name */
    private static final int f571r = 0;

    /* renamed from: s, reason: collision with root package name */
    private static final int f572s = 1;

    /* renamed from: t, reason: collision with root package name */
    private static final int f573t = 100;

    /* renamed from: n, reason: collision with root package name */
    private final int[] f574n;

    /* renamed from: o, reason: collision with root package name */
    private int f575o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f576p;

    /* renamed from: q, reason: collision with root package name */
    private int[] f577q;

    public ExpandedLinearLayoutManager(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r2 = 2
            int[] r0 = new int[r2]
            r1.f574n = r0
            r0 = 100
            r1.f575o = r0
            int[] r2 = new int[r2]
            r1.f577q = r2
            return
    }

    public ExpandedLinearLayoutManager(android.content.Context r1, int r2, boolean r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 2
            int[] r2 = new int[r1]
            r0.f574n = r2
            r2 = 100
            r0.f575o = r2
            int[] r1 = new int[r1]
            r0.f577q = r1
            return
    }

    private void a(androidx.recyclerview.widget.RecyclerView.Recycler r4, int r5, int r6, int r7, int[] r8) {
            r3 = this;
            android.view.View r5 = r4.getViewForPosition(r5)
            if (r5 == 0) goto L3b
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r0 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r0
            int r1 = r3.getPaddingTop()
            int r2 = r3.getPaddingBottom()
            int r1 = r1 + r2
            int r2 = r0.height
            int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r1, r2)
            r5.measure(r6, r7)
            int r6 = r5.getMeasuredWidth()
            int r7 = r0.leftMargin
            int r6 = r6 + r7
            int r7 = r0.rightMargin
            int r6 = r6 + r7
            r7 = 0
            r8[r7] = r6
            int r6 = r5.getMeasuredHeight()
            int r7 = r0.bottomMargin
            int r6 = r6 + r7
            int r7 = r0.topMargin
            int r6 = r6 + r7
            r7 = 1
            r8[r7] = r6
            r4.recycleView(r5)
        L3b:
            return
    }

    public void onLayoutChildren(androidx.recyclerview.widget.RecyclerView.Recycler r1, androidx.recyclerview.widget.RecyclerView.State r2) {
            r0 = this;
            super.onLayoutChildren(r1, r2)
            return
    }

    public void onMeasure(androidx.recyclerview.widget.RecyclerView.Recycler r9, androidx.recyclerview.widget.RecyclerView.State r10, int r11, int r12) {
            r8 = this;
            android.view.View.MeasureSpec.getMode(r11)
            int r0 = android.view.View.MeasureSpec.getMode(r12)
            android.view.View.MeasureSpec.getSize(r11)
            int r12 = android.view.View.MeasureSpec.getSize(r12)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "state:"
            r1.append(r2)
            java.lang.String r10 = r10.toString()
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            com.orhanobut.logger.j.c(r10)
            r10 = 0
            r3 = 0
            r7 = 0
        L29:
            int r1 = r8.getItemCount()
            if (r3 >= r1) goto L60
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r10)     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            int[] r6 = r8.f577q     // Catch: java.lang.IndexOutOfBoundsException -> L3e
            r1 = r8
            r2 = r9
            r4 = r11
            r1.a(r2, r3, r4, r5, r6)     // Catch: java.lang.IndexOutOfBoundsException -> L3c
            goto L42
        L3c:
            goto L42
        L3e:
            r1 = r8
            r2 = r9
            r4 = r11
            goto L3c
        L42:
            int r9 = r8.getOrientation()
            r11 = 1
            if (r9 != 0) goto L52
            int[] r9 = r1.f577q
            r5 = r9[r10]
            if (r3 != 0) goto L5b
            r7 = r9[r11]
            goto L5b
        L52:
            int[] r9 = r1.f577q
            r11 = r9[r11]
            int r7 = r7 + r11
            if (r3 != 0) goto L5b
            r9 = r9[r10]
        L5b:
            int r3 = r3 + 1
            r9 = r2
            r11 = r4
            goto L29
        L60:
            r1 = r8
            r4 = r11
            r9 = 1073741824(0x40000000, float:2.0)
            if (r0 == r9) goto L67
            r12 = r7
        L67:
            r8.setMeasuredDimension(r4, r12)
            return
    }
}
