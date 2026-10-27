package com.beizi.fusion.widget.dialog.dislike;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class FlowLayoutManager extends androidx.recyclerview.widget.RecyclerView.LayoutManager {
    private static final java.lang.String e = "FlowLayoutManager";
    final com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager a;
    protected int b;
    protected int c;
    protected int d;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager.b k;

    /* renamed from: l, reason: collision with root package name */
    private java.util.List<com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager.b> f124l;

    /* renamed from: m, reason: collision with root package name */
    private android.util.SparseArray<android.graphics.Rect> f125m;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a {
        int a;
        android.view.View b;
        android.graphics.Rect c;
        final /* synthetic */ com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager d;

        public a(com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager r1, int r2, android.view.View r3, android.graphics.Rect r4) {
                r0 = this;
                r0.d = r1
                r0.<init>()
                r0.a = r2
                r0.b = r3
                r0.c = r4
                return
        }

        public void a(android.graphics.Rect r1) {
                r0 = this;
                r0.c = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class b {
        float a;
        float b;
        java.util.List<com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager.a> c;
        final /* synthetic */ com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager d;

        public b(com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager r1) {
                r0 = this;
                r0.d = r1
                r0.<init>()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.c = r1
                return
        }

        public void a(float r1) {
                r0 = this;
                r0.a = r1
                return
        }

        public void a(com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager.a r2) {
                r1 = this;
                java.util.List<com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager$a> r0 = r1.c
                r0.add(r2)
                return
        }

        public void b(float r1) {
                r0 = this;
                r0.b = r1
                return
        }
    }

    static {
            return
    }

    public FlowLayoutManager() {
            r1 = this;
            r1.<init>()
            r1.a = r1
            r0 = 0
            r1.j = r0
            r1.d = r0
            com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager$b r0 = new com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager$b
            r0.<init>(r1)
            r1.k = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f124l = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1.f125m = r0
            return
    }

    private void a() {
            r13 = this;
            com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager$b r0 = r13.k
            java.util.List<com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager$a> r0 = r0.c
            r1 = 0
        L5:
            int r2 = r0.size()
            if (r1 >= r2) goto L9b
            java.lang.Object r2 = r0.get(r1)
            com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager$a r2 = (com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager.a) r2
            android.view.View r3 = r2.b
            int r4 = r13.getPosition(r3)
            android.util.SparseArray<android.graphics.Rect> r5 = r13.f125m
            java.lang.Object r5 = r5.get(r4)
            android.graphics.Rect r5 = (android.graphics.Rect) r5
            int r5 = r5.top
            float r5 = (float) r5
            com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager$b r6 = r13.k
            float r7 = r6.a
            float r6 = r6.b
            java.lang.Object r8 = r0.get(r1)
            com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager$a r8 = (com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager.a) r8
            int r8 = r8.a
            float r8 = (float) r8
            float r6 = r6 - r8
            r8 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r8
            float r7 = r7 + r6
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 >= 0) goto L97
            android.util.SparseArray<android.graphics.Rect> r5 = r13.f125m
            java.lang.Object r5 = r5.get(r4)
            android.graphics.Rect r5 = (android.graphics.Rect) r5
            if (r5 != 0) goto L49
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
        L49:
            android.util.SparseArray<android.graphics.Rect> r6 = r13.f125m
            java.lang.Object r6 = r6.get(r4)
            android.graphics.Rect r6 = (android.graphics.Rect) r6
            int r6 = r6.left
            com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager$b r7 = r13.k
            float r9 = r7.a
            float r7 = r7.b
            java.lang.Object r10 = r0.get(r1)
            com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager$a r10 = (com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager.a) r10
            int r10 = r10.a
            float r10 = (float) r10
            float r7 = r7 - r10
            float r7 = r7 / r8
            float r9 = r9 + r7
            int r7 = (int) r9
            android.util.SparseArray<android.graphics.Rect> r9 = r13.f125m
            java.lang.Object r9 = r9.get(r4)
            android.graphics.Rect r9 = (android.graphics.Rect) r9
            int r9 = r9.right
            com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager$b r10 = r13.k
            float r11 = r10.a
            float r10 = r10.b
            java.lang.Object r12 = r0.get(r1)
            com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager$a r12 = (com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager.a) r12
            int r12 = r12.a
            float r12 = (float) r12
            float r10 = r10 - r12
            float r10 = r10 / r8
            float r11 = r11 + r10
            int r3 = r13.getDecoratedMeasuredHeight(r3)
            float r3 = (float) r3
            float r11 = r11 + r3
            int r3 = (int) r11
            r5.set(r6, r7, r9, r3)
            android.util.SparseArray<android.graphics.Rect> r3 = r13.f125m
            r3.put(r4, r5)
            r2.a(r5)
            r0.set(r1, r2)
        L97:
            int r1 = r1 + 1
            goto L5
        L9b:
            com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager$b r1 = r13.k
            r1.c = r0
            java.util.List<com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager$b> r0 = r13.f124l
            r0.add(r1)
            com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager$b r0 = new com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager$b
            r0.<init>(r13)
            r13.k = r0
            return
    }

    private void a(androidx.recyclerview.widget.RecyclerView.Recycler r10, androidx.recyclerview.widget.RecyclerView.State r11) {
            r9 = this;
            boolean r10 = r11.isPreLayout()
            if (r10 != 0) goto L7d
            int r10 = r9.getItemCount()
            if (r10 != 0) goto Ld
            goto L7d
        Ld:
            android.graphics.Rect r10 = new android.graphics.Rect
            int r11 = r9.getPaddingLeft()
            int r0 = r9.getPaddingTop()
            int r1 = r9.j
            int r0 = r0 + r1
            int r1 = r9.getWidth()
            int r2 = r9.getPaddingRight()
            int r1 = r1 - r2
            int r2 = r9.j
            int r3 = r9.getHeight()
            int r4 = r9.getPaddingBottom()
            int r3 = r3 - r4
            int r2 = r2 + r3
            r10.<init>(r11, r0, r1, r2)
            r10 = 0
            r11 = 0
        L34:
            java.util.List<com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager$b> r0 = r9.f124l
            int r0 = r0.size()
            if (r11 >= r0) goto L7d
            java.util.List<com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager$b> r0 = r9.f124l
            java.lang.Object r0 = r0.get(r11)
            com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager$b r0 = (com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager.b) r0
            float r1 = r0.a
            java.util.List<com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager$a> r0 = r0.c
            r1 = 0
        L49:
            int r2 = r0.size()
            if (r1 >= r2) goto L7a
            java.lang.Object r2 = r0.get(r1)
            com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager$a r2 = (com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager.a) r2
            android.view.View r4 = r2.b
            r9.measureChildWithMargins(r4, r10, r10)
            r9.addView(r4)
            java.lang.Object r2 = r0.get(r1)
            com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager$a r2 = (com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager.a) r2
            android.graphics.Rect r2 = r2.c
            int r5 = r2.left
            int r3 = r2.top
            int r6 = r9.j
            int r3 = r3 - r6
            int r7 = r2.right
            int r2 = r2.bottom
            int r8 = r2 - r6
            r6 = r3
            r3 = r9
            r3.layoutDecoratedWithMargins(r4, r5, r6, r7, r8)
            int r1 = r1 + 1
            goto L49
        L7a:
            int r11 = r11 + 1
            goto L34
        L7d:
            return
    }

    private int b() {
            r2 = this;
            com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager r0 = r2.a
            int r0 = r0.getHeight()
            com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager r1 = r2.a
            int r1 = r1.getPaddingBottom()
            int r0 = r0 - r1
            com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager r1 = r2.a
            int r1 = r1.getPaddingTop()
            int r0 = r0 - r1
            return r0
    }

    public boolean canScrollVertically() {
            r1 = this;
            r0 = 1
            return r0
    }

    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateDefaultLayoutParams() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutParams r0 = new androidx.recyclerview.widget.RecyclerView$LayoutParams
            r1 = -2
            r0.<init>(r1, r1)
            return r0
    }

    public boolean isAutoMeasureEnabled() {
            r1 = this;
            r0 = 1
            return r0
    }

    public void onLayoutChildren(androidx.recyclerview.widget.RecyclerView.Recycler r12, androidx.recyclerview.widget.RecyclerView.State r13) {
            r11 = this;
            r0 = 0
            r11.d = r0
            int r1 = r11.g
            com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager$b r2 = new com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager$b
            r2.<init>(r11)
            r11.k = r2
            java.util.List<com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager$b> r2 = r11.f124l
            r2.clear()
            android.util.SparseArray<android.graphics.Rect> r2 = r11.f125m
            r2.clear()
            r11.removeAllViews()
            int r2 = r11.getItemCount()
            if (r2 != 0) goto L25
            r11.detachAndScrapAttachedViews(r12)
            r11.j = r0
            return
        L25:
            int r2 = r11.getChildCount()
            if (r2 != 0) goto L32
            boolean r2 = r13.isPreLayout()
            if (r2 == 0) goto L32
            return
        L32:
            r11.detachAndScrapAttachedViews(r12)
            int r2 = r11.getChildCount()
            if (r2 != 0) goto L63
            int r2 = r11.getWidth()
            r11.b = r2
            int r2 = r11.getHeight()
            r11.c = r2
            int r2 = r11.getPaddingLeft()
            r11.f = r2
            int r2 = r11.getPaddingRight()
            r11.h = r2
            int r2 = r11.getPaddingTop()
            r11.g = r2
            int r2 = r11.b
            int r3 = r11.f
            int r2 = r2 - r3
            int r3 = r11.h
            int r2 = r2 - r3
            r11.i = r2
        L63:
            r2 = 0
            r3 = 0
            r4 = 0
        L66:
            int r5 = r11.getItemCount()
            if (r2 >= r5) goto L116
            android.view.View r5 = r12.getViewForPosition(r2)
            r6 = 8
            int r7 = r5.getVisibility()
            if (r6 != r7) goto L7a
            goto L112
        L7a:
            r11.measureChildWithMargins(r5, r0, r0)
            int r6 = r11.getDecoratedMeasuredWidth(r5)
            int r7 = r11.getDecoratedMeasuredHeight(r5)
            int r8 = r3 + r6
            int r9 = r11.i
            if (r8 > r9) goto Lc4
            int r9 = r11.f
            int r9 = r9 + r3
            android.util.SparseArray<android.graphics.Rect> r3 = r11.f125m
            java.lang.Object r3 = r3.get(r2)
            android.graphics.Rect r3 = (android.graphics.Rect) r3
            if (r3 != 0) goto L9d
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
        L9d:
            int r6 = r6 + r9
            int r10 = r1 + r7
            r3.set(r9, r1, r6, r10)
            android.util.SparseArray<android.graphics.Rect> r6 = r11.f125m
            r6.put(r2, r3)
            int r4 = java.lang.Math.max(r4, r7)
            com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager$b r6 = r11.k
            com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager$a r9 = new com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager$a
            r9.<init>(r11, r7, r5, r3)
            r6.a(r9)
            com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager$b r3 = r11.k
            float r5 = (float) r1
            r3.a(r5)
            com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager$b r3 = r11.k
            float r5 = (float) r4
            r3.b(r5)
            r3 = r8
            goto L102
        Lc4:
            r11.a()
            int r1 = r1 + r4
            int r3 = r11.d
            int r3 = r3 + r4
            r11.d = r3
            int r3 = r11.f
            android.util.SparseArray<android.graphics.Rect> r4 = r11.f125m
            java.lang.Object r4 = r4.get(r2)
            android.graphics.Rect r4 = (android.graphics.Rect) r4
            if (r4 != 0) goto Lde
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
        Lde:
            int r8 = r3 + r6
            int r9 = r1 + r7
            r4.set(r3, r1, r8, r9)
            android.util.SparseArray<android.graphics.Rect> r3 = r11.f125m
            r3.put(r2, r4)
            com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager$b r3 = r11.k
            com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager$a r8 = new com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager$a
            r8.<init>(r11, r7, r5, r4)
            r3.a(r8)
            com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager$b r3 = r11.k
            float r4 = (float) r1
            r3.a(r4)
            com.beizi.fusion.widget.dialog.dislike.FlowLayoutManager$b r3 = r11.k
            float r4 = (float) r7
            r3.b(r4)
            r3 = r6
            r4 = r7
        L102:
            int r5 = r11.getItemCount()
            int r5 = r5 + (-1)
            if (r2 != r5) goto L112
            r11.a()
            int r5 = r11.d
            int r5 = r5 + r4
            r11.d = r5
        L112:
            int r2 = r2 + 1
            goto L66
        L116:
            int r0 = r11.d
            int r1 = r11.b()
            int r0 = java.lang.Math.max(r0, r1)
            r11.d = r0
            r11.a(r12, r13)
            return
    }

    public int scrollVerticallyBy(int r4, androidx.recyclerview.widget.RecyclerView.Recycler r5, androidx.recyclerview.widget.RecyclerView.State r6) {
            r3 = this;
            int r0 = r3.j
            int r1 = r0 + r4
            if (r1 >= 0) goto L8
            int r4 = -r0
            goto L1c
        L8:
            int r0 = r0 + r4
            int r1 = r3.d
            int r2 = r3.b()
            int r1 = r1 - r2
            if (r0 <= r1) goto L1c
            int r4 = r3.d
            int r0 = r3.b()
            int r4 = r4 - r0
            int r0 = r3.j
            int r4 = r4 - r0
        L1c:
            int r0 = r3.j
            int r0 = r0 + r4
            r3.j = r0
            int r0 = -r4
            r3.offsetChildrenVertical(r0)
            r3.a(r5, r6)
            return r4
    }
}
