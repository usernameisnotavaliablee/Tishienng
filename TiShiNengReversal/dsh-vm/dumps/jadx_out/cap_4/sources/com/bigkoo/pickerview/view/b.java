package com.bigkoo.pickerview.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class b<T> {
    private android.view.View a;
    private com.bigkoo.pickerview.lib.WheelView b;
    private com.bigkoo.pickerview.lib.WheelView c;
    private com.bigkoo.pickerview.lib.WheelView d;
    private java.util.List<T> e;
    private java.util.List<java.util.List<T>> f;
    private java.util.List<T> g;
    private java.util.List<java.util.List<java.util.List<T>>> h;
    private java.util.List<T> i;
    private boolean j;
    private o.c k;

    /* renamed from: l, reason: collision with root package name */
    private o.c f298l;

    /* renamed from: m, reason: collision with root package name */
    int f299m;

    /* renamed from: n, reason: collision with root package name */
    int f300n;

    /* renamed from: o, reason: collision with root package name */
    int f301o;

    /* renamed from: p, reason: collision with root package name */
    private com.bigkoo.pickerview.lib.WheelView.DividerType f302p;

    /* renamed from: q, reason: collision with root package name */
    float f303q;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements o.c {
        final /* synthetic */ com.bigkoo.pickerview.view.b a;

        a(com.bigkoo.pickerview.view.b r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // o.c
        public void a(int r5) {
                r4 = this;
                com.bigkoo.pickerview.view.b r0 = r4.a
                java.util.List r0 = com.bigkoo.pickerview.view.b.a(r0)
                if (r0 == 0) goto L5c
                com.bigkoo.pickerview.view.b r0 = r4.a
                com.bigkoo.pickerview.lib.WheelView r0 = com.bigkoo.pickerview.view.b.b(r0)
                int r0 = r0.getCurrentItem()
                com.bigkoo.pickerview.view.b r1 = r4.a
                java.util.List r1 = com.bigkoo.pickerview.view.b.a(r1)
                java.lang.Object r1 = r1.get(r5)
                java.util.List r1 = (java.util.List) r1
                int r1 = r1.size()
                int r1 = r1 + (-1)
                if (r0 < r1) goto L38
                com.bigkoo.pickerview.view.b r0 = r4.a
                java.util.List r0 = com.bigkoo.pickerview.view.b.a(r0)
                java.lang.Object r0 = r0.get(r5)
                java.util.List r0 = (java.util.List) r0
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L38:
                com.bigkoo.pickerview.view.b r1 = r4.a
                com.bigkoo.pickerview.lib.WheelView r1 = com.bigkoo.pickerview.view.b.b(r1)
                n.a r2 = new n.a
                com.bigkoo.pickerview.view.b r3 = r4.a
                java.util.List r3 = com.bigkoo.pickerview.view.b.a(r3)
                java.lang.Object r5 = r3.get(r5)
                java.util.List r5 = (java.util.List) r5
                r2.<init>(r5)
                r1.setAdapter(r2)
                com.bigkoo.pickerview.view.b r5 = r4.a
                com.bigkoo.pickerview.lib.WheelView r5 = com.bigkoo.pickerview.view.b.b(r5)
                r5.setCurrentItem(r0)
                goto L5d
            L5c:
                r0 = 0
            L5d:
                com.bigkoo.pickerview.view.b r5 = r4.a
                java.util.List r5 = com.bigkoo.pickerview.view.b.c(r5)
                if (r5 == 0) goto L6e
                com.bigkoo.pickerview.view.b r5 = r4.a
                o.c r5 = com.bigkoo.pickerview.view.b.d(r5)
                r5.a(r0)
            L6e:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.bigkoo.pickerview.view.b$b, reason: collision with other inner class name */
    class C0011b implements o.c {
        final /* synthetic */ com.bigkoo.pickerview.view.b a;

        C0011b(com.bigkoo.pickerview.view.b r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // o.c
        public void a(int r6) {
                r5 = this;
                com.bigkoo.pickerview.view.b r0 = r5.a
                java.util.List r0 = com.bigkoo.pickerview.view.b.c(r0)
                if (r0 == 0) goto Lc1
                com.bigkoo.pickerview.view.b r0 = r5.a
                com.bigkoo.pickerview.lib.WheelView r0 = com.bigkoo.pickerview.view.b.e(r0)
                int r0 = r0.getCurrentItem()
                com.bigkoo.pickerview.view.b r1 = r5.a
                java.util.List r1 = com.bigkoo.pickerview.view.b.c(r1)
                int r1 = r1.size()
                int r1 = r1 + (-1)
                if (r0 < r1) goto L2c
                com.bigkoo.pickerview.view.b r0 = r5.a
                java.util.List r0 = com.bigkoo.pickerview.view.b.c(r0)
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L2c:
                com.bigkoo.pickerview.view.b r1 = r5.a
                java.util.List r1 = com.bigkoo.pickerview.view.b.a(r1)
                java.lang.Object r1 = r1.get(r0)
                java.util.List r1 = (java.util.List) r1
                int r1 = r1.size()
                int r1 = r1 + (-1)
                if (r6 < r1) goto L52
                com.bigkoo.pickerview.view.b r6 = r5.a
                java.util.List r6 = com.bigkoo.pickerview.view.b.a(r6)
                java.lang.Object r6 = r6.get(r0)
                java.util.List r6 = (java.util.List) r6
                int r6 = r6.size()
                int r6 = r6 + (-1)
            L52:
                com.bigkoo.pickerview.view.b r1 = r5.a
                com.bigkoo.pickerview.lib.WheelView r1 = com.bigkoo.pickerview.view.b.f(r1)
                int r1 = r1.getCurrentItem()
                com.bigkoo.pickerview.view.b r2 = r5.a
                java.util.List r2 = com.bigkoo.pickerview.view.b.c(r2)
                java.lang.Object r2 = r2.get(r0)
                java.util.List r2 = (java.util.List) r2
                java.lang.Object r2 = r2.get(r6)
                java.util.List r2 = (java.util.List) r2
                int r2 = r2.size()
                int r2 = r2 + (-1)
                if (r1 < r2) goto L8e
                com.bigkoo.pickerview.view.b r1 = r5.a
                java.util.List r1 = com.bigkoo.pickerview.view.b.c(r1)
                java.lang.Object r0 = r1.get(r0)
                java.util.List r0 = (java.util.List) r0
                java.lang.Object r0 = r0.get(r6)
                java.util.List r0 = (java.util.List) r0
                int r0 = r0.size()
                int r1 = r0 + (-1)
            L8e:
                com.bigkoo.pickerview.view.b r0 = r5.a
                com.bigkoo.pickerview.lib.WheelView r0 = com.bigkoo.pickerview.view.b.f(r0)
                n.a r2 = new n.a
                com.bigkoo.pickerview.view.b r3 = r5.a
                java.util.List r3 = com.bigkoo.pickerview.view.b.c(r3)
                com.bigkoo.pickerview.view.b r4 = r5.a
                com.bigkoo.pickerview.lib.WheelView r4 = com.bigkoo.pickerview.view.b.e(r4)
                int r4 = r4.getCurrentItem()
                java.lang.Object r3 = r3.get(r4)
                java.util.List r3 = (java.util.List) r3
                java.lang.Object r6 = r3.get(r6)
                java.util.List r6 = (java.util.List) r6
                r2.<init>(r6)
                r0.setAdapter(r2)
                com.bigkoo.pickerview.view.b r6 = r5.a
                com.bigkoo.pickerview.lib.WheelView r6 = com.bigkoo.pickerview.view.b.f(r6)
                r6.setCurrentItem(r1)
            Lc1:
                return
        }
    }

    public b(android.view.View r2, java.lang.Boolean r3) {
            r1 = this;
            r1.<init>()
            r0 = 1070386381(0x3fcccccd, float:1.6)
            r1.f303q = r0
            boolean r3 = r3.booleanValue()
            r1.j = r3
            r1.a = r2
            int r3 = com.bigkoo.pickerview.R.id.options1
            android.view.View r3 = r2.findViewById(r3)
            com.bigkoo.pickerview.lib.WheelView r3 = (com.bigkoo.pickerview.lib.WheelView) r3
            r1.b = r3
            int r3 = com.bigkoo.pickerview.R.id.options2
            android.view.View r3 = r2.findViewById(r3)
            com.bigkoo.pickerview.lib.WheelView r3 = (com.bigkoo.pickerview.lib.WheelView) r3
            r1.c = r3
            int r3 = com.bigkoo.pickerview.R.id.options3
            android.view.View r2 = r2.findViewById(r3)
            com.bigkoo.pickerview.lib.WheelView r2 = (com.bigkoo.pickerview.lib.WheelView) r2
            r1.d = r2
            return
    }

    static /* synthetic */ java.util.List a(com.bigkoo.pickerview.view.b r0) {
            java.util.List<java.util.List<T>> r0 = r0.f
            return r0
    }

    static /* synthetic */ com.bigkoo.pickerview.lib.WheelView b(com.bigkoo.pickerview.view.b r0) {
            com.bigkoo.pickerview.lib.WheelView r0 = r0.c
            return r0
    }

    static /* synthetic */ java.util.List c(com.bigkoo.pickerview.view.b r0) {
            java.util.List<java.util.List<java.util.List<T>>> r0 = r0.h
            return r0
    }

    static /* synthetic */ o.c d(com.bigkoo.pickerview.view.b r0) {
            o.c r0 = r0.f298l
            return r0
    }

    static /* synthetic */ com.bigkoo.pickerview.lib.WheelView e(com.bigkoo.pickerview.view.b r0) {
            com.bigkoo.pickerview.lib.WheelView r0 = r0.b
            return r0
    }

    static /* synthetic */ com.bigkoo.pickerview.lib.WheelView f(com.bigkoo.pickerview.view.b r0) {
            com.bigkoo.pickerview.lib.WheelView r0 = r0.d
            return r0
    }

    private void i(int r4, int r5, int r6) {
            r3 = this;
            java.util.List<java.util.List<T>> r0 = r3.f
            if (r0 == 0) goto L19
            com.bigkoo.pickerview.lib.WheelView r1 = r3.c
            n.a r2 = new n.a
            java.lang.Object r0 = r0.get(r4)
            java.util.List r0 = (java.util.List) r0
            r2.<init>(r0)
            r1.setAdapter(r2)
            com.bigkoo.pickerview.lib.WheelView r0 = r3.c
            r0.setCurrentItem(r5)
        L19:
            java.util.List<java.util.List<java.util.List<T>>> r0 = r3.h
            if (r0 == 0) goto L38
            com.bigkoo.pickerview.lib.WheelView r1 = r3.d
            n.a r2 = new n.a
            java.lang.Object r4 = r0.get(r4)
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r4 = r4.get(r5)
            java.util.List r4 = (java.util.List) r4
            r2.<init>(r4)
            r1.setAdapter(r2)
            com.bigkoo.pickerview.lib.WheelView r4 = r3.d
            r4.setCurrentItem(r6)
        L38:
            return
    }

    private void m() {
            r2 = this;
            com.bigkoo.pickerview.lib.WheelView r0 = r2.b
            int r1 = r2.f301o
            r0.setDividerColor(r1)
            com.bigkoo.pickerview.lib.WheelView r0 = r2.c
            int r1 = r2.f301o
            r0.setDividerColor(r1)
            com.bigkoo.pickerview.lib.WheelView r0 = r2.d
            int r1 = r2.f301o
            r0.setDividerColor(r1)
            return
    }

    private void o() {
            r2 = this;
            com.bigkoo.pickerview.lib.WheelView r0 = r2.b
            com.bigkoo.pickerview.lib.WheelView$DividerType r1 = r2.f302p
            r0.setDividerType(r1)
            com.bigkoo.pickerview.lib.WheelView r0 = r2.c
            com.bigkoo.pickerview.lib.WheelView$DividerType r1 = r2.f302p
            r0.setDividerType(r1)
            com.bigkoo.pickerview.lib.WheelView r0 = r2.d
            com.bigkoo.pickerview.lib.WheelView$DividerType r1 = r2.f302p
            r0.setDividerType(r1)
            return
    }

    private void r() {
            r2 = this;
            com.bigkoo.pickerview.lib.WheelView r0 = r2.b
            float r1 = r2.f303q
            r0.setLineSpacingMultiplier(r1)
            com.bigkoo.pickerview.lib.WheelView r0 = r2.c
            float r1 = r2.f303q
            r0.setLineSpacingMultiplier(r1)
            com.bigkoo.pickerview.lib.WheelView r0 = r2.d
            float r1 = r2.f303q
            r0.setLineSpacingMultiplier(r1)
            return
    }

    private void v() {
            r2 = this;
            com.bigkoo.pickerview.lib.WheelView r0 = r2.b
            int r1 = r2.f300n
            r0.setTextColorCenter(r1)
            com.bigkoo.pickerview.lib.WheelView r0 = r2.c
            int r1 = r2.f300n
            r0.setTextColorCenter(r1)
            com.bigkoo.pickerview.lib.WheelView r0 = r2.d
            int r1 = r2.f300n
            r0.setTextColorCenter(r1)
            return
    }

    private void x() {
            r2 = this;
            com.bigkoo.pickerview.lib.WheelView r0 = r2.b
            int r1 = r2.f299m
            r0.setTextColorOut(r1)
            com.bigkoo.pickerview.lib.WheelView r0 = r2.c
            int r1 = r2.f299m
            r0.setTextColorOut(r1)
            com.bigkoo.pickerview.lib.WheelView r0 = r2.d
            int r1 = r2.f299m
            r0.setTextColorOut(r1)
            return
    }

    public void A(android.graphics.Typeface r2) {
            r1 = this;
            com.bigkoo.pickerview.lib.WheelView r0 = r1.b
            r0.setTypeface(r2)
            com.bigkoo.pickerview.lib.WheelView r0 = r1.c
            r0.setTypeface(r2)
            com.bigkoo.pickerview.lib.WheelView r0 = r1.d
            r0.setTypeface(r2)
            return
    }

    public void B(android.view.View r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public int[] g() {
            r7 = this;
            r0 = 3
            int[] r0 = new int[r0]
            com.bigkoo.pickerview.lib.WheelView r1 = r7.b
            int r1 = r1.getCurrentItem()
            r2 = 0
            r0[r2] = r1
            java.util.List<java.util.List<T>> r1 = r7.f
            r3 = 1
            if (r1 == 0) goto L39
            int r1 = r1.size()
            if (r1 <= 0) goto L39
            com.bigkoo.pickerview.lib.WheelView r1 = r7.c
            int r1 = r1.getCurrentItem()
            java.util.List<java.util.List<T>> r4 = r7.f
            r5 = r0[r2]
            java.lang.Object r4 = r4.get(r5)
            java.util.List r4 = (java.util.List) r4
            int r4 = r4.size()
            int r4 = r4 - r3
            if (r1 <= r4) goto L30
            r1 = 0
            goto L36
        L30:
            com.bigkoo.pickerview.lib.WheelView r1 = r7.c
            int r1 = r1.getCurrentItem()
        L36:
            r0[r3] = r1
            goto L41
        L39:
            com.bigkoo.pickerview.lib.WheelView r1 = r7.c
            int r1 = r1.getCurrentItem()
            r0[r3] = r1
        L41:
            java.util.List<java.util.List<java.util.List<T>>> r1 = r7.h
            r4 = 2
            if (r1 == 0) goto L75
            int r1 = r1.size()
            if (r1 <= 0) goto L75
            com.bigkoo.pickerview.lib.WheelView r1 = r7.d
            int r1 = r1.getCurrentItem()
            java.util.List<java.util.List<java.util.List<T>>> r5 = r7.h
            r6 = r0[r2]
            java.lang.Object r5 = r5.get(r6)
            java.util.List r5 = (java.util.List) r5
            r6 = r0[r3]
            java.lang.Object r5 = r5.get(r6)
            java.util.List r5 = (java.util.List) r5
            int r5 = r5.size()
            int r5 = r5 - r3
            if (r1 <= r5) goto L6c
            goto L72
        L6c:
            com.bigkoo.pickerview.lib.WheelView r1 = r7.d
            int r2 = r1.getCurrentItem()
        L72:
            r0[r4] = r2
            return r0
        L75:
            com.bigkoo.pickerview.lib.WheelView r1 = r7.d
            int r1 = r1.getCurrentItem()
            r0[r4] = r1
            return r0
    }

    public android.view.View h() {
            r1 = this;
            android.view.View r0 = r1.a
            return r0
    }

    public void j(int r2, int r3, int r4) {
            r1 = this;
            boolean r0 = r1.j
            if (r0 == 0) goto L7
            r1.i(r2, r3, r4)
        L7:
            com.bigkoo.pickerview.lib.WheelView r0 = r1.b
            r0.setCurrentItem(r2)
            com.bigkoo.pickerview.lib.WheelView r2 = r1.c
            r2.setCurrentItem(r3)
            com.bigkoo.pickerview.lib.WheelView r2 = r1.d
            r2.setCurrentItem(r4)
            return
    }

    public void k(boolean r2) {
            r1 = this;
            com.bigkoo.pickerview.lib.WheelView r0 = r1.b
            r0.setCyclic(r2)
            com.bigkoo.pickerview.lib.WheelView r0 = r1.c
            r0.setCyclic(r2)
            com.bigkoo.pickerview.lib.WheelView r0 = r1.d
            r0.setCyclic(r2)
            return
    }

    public void l(boolean r2, boolean r3, boolean r4) {
            r1 = this;
            com.bigkoo.pickerview.lib.WheelView r0 = r1.b
            r0.setCyclic(r2)
            com.bigkoo.pickerview.lib.WheelView r2 = r1.c
            r2.setCyclic(r3)
            com.bigkoo.pickerview.lib.WheelView r2 = r1.d
            r2.setCyclic(r4)
            return
    }

    public void n(int r1) {
            r0 = this;
            r0.f301o = r1
            r0.m()
            return
    }

    public void p(com.bigkoo.pickerview.lib.WheelView.DividerType r1) {
            r0 = this;
            r0.f302p = r1
            r0.o()
            return
    }

    public void q(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            if (r2 == 0) goto L7
            com.bigkoo.pickerview.lib.WheelView r0 = r1.b
            r0.setLabel(r2)
        L7:
            if (r3 == 0) goto Le
            com.bigkoo.pickerview.lib.WheelView r2 = r1.c
            r2.setLabel(r3)
        Le:
            if (r4 == 0) goto L15
            com.bigkoo.pickerview.lib.WheelView r2 = r1.d
            r2.setLabel(r4)
        L15:
            return
    }

    public void s(float r1) {
            r0 = this;
            r0.f303q = r1
            r0.r()
            return
    }

    public void t(java.util.List<T> r3, java.util.List<T> r4, java.util.List<T> r5) {
            r2 = this;
            r2.e = r3
            r2.g = r4
            r2.i = r5
            r0 = 8
            if (r5 != 0) goto Ld
            r5 = 8
            goto Le
        Ld:
            r5 = 4
        Le:
            if (r4 != 0) goto L12
            r5 = 12
        L12:
            com.bigkoo.pickerview.lib.WheelView r4 = r2.b
            n.a r1 = new n.a
            r1.<init>(r3, r5)
            r4.setAdapter(r1)
            com.bigkoo.pickerview.lib.WheelView r3 = r2.b
            r4 = 0
            r3.setCurrentItem(r4)
            java.util.List<T> r3 = r2.g
            if (r3 == 0) goto L30
            com.bigkoo.pickerview.lib.WheelView r4 = r2.c
            n.a r5 = new n.a
            r5.<init>(r3)
            r4.setAdapter(r5)
        L30:
            com.bigkoo.pickerview.lib.WheelView r3 = r2.c
            com.bigkoo.pickerview.lib.WheelView r4 = r2.b
            int r4 = r4.getCurrentItem()
            r3.setCurrentItem(r4)
            java.util.List<T> r3 = r2.i
            if (r3 == 0) goto L49
            com.bigkoo.pickerview.lib.WheelView r4 = r2.d
            n.a r5 = new n.a
            r5.<init>(r3)
            r4.setAdapter(r5)
        L49:
            com.bigkoo.pickerview.lib.WheelView r3 = r2.d
            int r4 = r3.getCurrentItem()
            r3.setCurrentItem(r4)
            com.bigkoo.pickerview.lib.WheelView r3 = r2.b
            r4 = 1
            r3.setIsOptions(r4)
            com.bigkoo.pickerview.lib.WheelView r3 = r2.c
            r3.setIsOptions(r4)
            com.bigkoo.pickerview.lib.WheelView r3 = r2.d
            r3.setIsOptions(r4)
            java.util.List<T> r3 = r2.g
            if (r3 != 0) goto L6b
            com.bigkoo.pickerview.lib.WheelView r3 = r2.c
            r3.setVisibility(r0)
        L6b:
            java.util.List<T> r3 = r2.i
            if (r3 != 0) goto L74
            com.bigkoo.pickerview.lib.WheelView r3 = r2.d
            r3.setVisibility(r0)
        L74:
            return
    }

    public void u(java.util.List<T> r5, java.util.List<java.util.List<T>> r6, java.util.List<java.util.List<java.util.List<T>>> r7) {
            r4 = this;
            r4.e = r5
            r4.f = r6
            r4.h = r7
            r0 = 8
            if (r7 != 0) goto Ld
            r1 = 8
            goto Le
        Ld:
            r1 = 4
        Le:
            if (r6 != 0) goto L12
            r1 = 12
        L12:
            com.bigkoo.pickerview.lib.WheelView r2 = r4.b
            n.a r3 = new n.a
            r3.<init>(r5, r1)
            r2.setAdapter(r3)
            com.bigkoo.pickerview.lib.WheelView r5 = r4.b
            r1 = 0
            r5.setCurrentItem(r1)
            java.util.List<java.util.List<T>> r5 = r4.f
            if (r5 == 0) goto L36
            com.bigkoo.pickerview.lib.WheelView r2 = r4.c
            n.a r3 = new n.a
            java.lang.Object r5 = r5.get(r1)
            java.util.List r5 = (java.util.List) r5
            r3.<init>(r5)
            r2.setAdapter(r3)
        L36:
            com.bigkoo.pickerview.lib.WheelView r5 = r4.c
            com.bigkoo.pickerview.lib.WheelView r2 = r4.b
            int r2 = r2.getCurrentItem()
            r5.setCurrentItem(r2)
            java.util.List<java.util.List<java.util.List<T>>> r5 = r4.h
            if (r5 == 0) goto L5b
            com.bigkoo.pickerview.lib.WheelView r2 = r4.d
            n.a r3 = new n.a
            java.lang.Object r5 = r5.get(r1)
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r5 = r5.get(r1)
            java.util.List r5 = (java.util.List) r5
            r3.<init>(r5)
            r2.setAdapter(r3)
        L5b:
            com.bigkoo.pickerview.lib.WheelView r5 = r4.d
            int r1 = r5.getCurrentItem()
            r5.setCurrentItem(r1)
            com.bigkoo.pickerview.lib.WheelView r5 = r4.b
            r1 = 1
            r5.setIsOptions(r1)
            com.bigkoo.pickerview.lib.WheelView r5 = r4.c
            r5.setIsOptions(r1)
            com.bigkoo.pickerview.lib.WheelView r5 = r4.d
            r5.setIsOptions(r1)
            java.util.List<java.util.List<T>> r5 = r4.f
            if (r5 != 0) goto L7d
            com.bigkoo.pickerview.lib.WheelView r5 = r4.c
            r5.setVisibility(r0)
        L7d:
            java.util.List<java.util.List<java.util.List<T>>> r5 = r4.h
            if (r5 != 0) goto L86
            com.bigkoo.pickerview.lib.WheelView r5 = r4.d
            r5.setVisibility(r0)
        L86:
            com.bigkoo.pickerview.view.b$a r5 = new com.bigkoo.pickerview.view.b$a
            r5.<init>(r4)
            r4.k = r5
            com.bigkoo.pickerview.view.b$b r5 = new com.bigkoo.pickerview.view.b$b
            r5.<init>(r4)
            r4.f298l = r5
            if (r6 == 0) goto La1
            boolean r5 = r4.j
            if (r5 == 0) goto La1
            com.bigkoo.pickerview.lib.WheelView r5 = r4.b
            o.c r6 = r4.k
            r5.setOnItemSelectedListener(r6)
        La1:
            if (r7 == 0) goto Lae
            boolean r5 = r4.j
            if (r5 == 0) goto Lae
            com.bigkoo.pickerview.lib.WheelView r5 = r4.c
            o.c r6 = r4.f298l
            r5.setOnItemSelectedListener(r6)
        Lae:
            return
    }

    public void w(int r1) {
            r0 = this;
            r0.f300n = r1
            r0.v()
            return
    }

    public void y(int r1) {
            r0 = this;
            r0.f299m = r1
            r0.x()
            return
    }

    public void z(int r2) {
            r1 = this;
            com.bigkoo.pickerview.lib.WheelView r0 = r1.b
            float r2 = (float) r2
            r0.setTextSize(r2)
            com.bigkoo.pickerview.lib.WheelView r0 = r1.c
            r0.setTextSize(r2)
            com.bigkoo.pickerview.lib.WheelView r0 = r1.d
            r0.setTextSize(r2)
            return
    }
}
