package com.bigkoo.pickerview.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class c {
    private static final int A = 12;
    private static final int B = 1;
    private static final int C = 31;

    /* renamed from: w, reason: collision with root package name */
    public static java.text.DateFormat f304w = null;

    /* renamed from: x, reason: collision with root package name */
    private static final int f305x = 1900;

    /* renamed from: y, reason: collision with root package name */
    private static final int f306y = 2100;

    /* renamed from: z, reason: collision with root package name */
    private static final int f307z = 1;
    private android.view.View a;
    private com.bigkoo.pickerview.lib.WheelView b;
    private com.bigkoo.pickerview.lib.WheelView c;
    private com.bigkoo.pickerview.lib.WheelView d;
    private com.bigkoo.pickerview.lib.WheelView e;
    private com.bigkoo.pickerview.lib.WheelView f;
    private com.bigkoo.pickerview.lib.WheelView g;
    private int h;
    private com.bigkoo.pickerview.TimePickerView.Type i;
    private int j;
    private int k;

    /* renamed from: l, reason: collision with root package name */
    private int f308l;

    /* renamed from: m, reason: collision with root package name */
    private int f309m;

    /* renamed from: n, reason: collision with root package name */
    private int f310n;

    /* renamed from: o, reason: collision with root package name */
    private int f311o;

    /* renamed from: p, reason: collision with root package name */
    private int f312p;

    /* renamed from: q, reason: collision with root package name */
    private int f313q;

    /* renamed from: r, reason: collision with root package name */
    int f314r;

    /* renamed from: s, reason: collision with root package name */
    int f315s;

    /* renamed from: t, reason: collision with root package name */
    int f316t;

    /* renamed from: u, reason: collision with root package name */
    float f317u;

    /* renamed from: v, reason: collision with root package name */
    private com.bigkoo.pickerview.lib.WheelView.DividerType f318v;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements o.c {
        final /* synthetic */ java.util.List a;
        final /* synthetic */ java.util.List b;
        final /* synthetic */ com.bigkoo.pickerview.view.c c;

        a(com.bigkoo.pickerview.view.c r1, java.util.List r2, java.util.List r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        @Override // o.c
        public void a(int r9) {
                r8 = this;
                com.bigkoo.pickerview.view.c r0 = r8.c
                int r0 = com.bigkoo.pickerview.view.c.a(r0)
                int r2 = r9 + r0
                com.bigkoo.pickerview.view.c r9 = r8.c
                com.bigkoo.pickerview.view.c.c(r9, r2)
                com.bigkoo.pickerview.view.c r9 = r8.c
                com.bigkoo.pickerview.lib.WheelView r9 = com.bigkoo.pickerview.view.c.d(r9)
                int r9 = r9.getCurrentItem()
                com.bigkoo.pickerview.view.c r0 = r8.c
                int r0 = com.bigkoo.pickerview.view.c.a(r0)
                com.bigkoo.pickerview.view.c r1 = r8.c
                int r1 = com.bigkoo.pickerview.view.c.e(r1)
                r3 = 1
                if (r0 != r1) goto Lb8
                com.bigkoo.pickerview.view.c r0 = r8.c
                com.bigkoo.pickerview.lib.WheelView r0 = com.bigkoo.pickerview.view.c.d(r0)
                n.b r1 = new n.b
                com.bigkoo.pickerview.view.c r4 = r8.c
                int r4 = com.bigkoo.pickerview.view.c.f(r4)
                com.bigkoo.pickerview.view.c r5 = r8.c
                int r5 = com.bigkoo.pickerview.view.c.g(r5)
                r1.<init>(r4, r5)
                r0.setAdapter(r1)
                com.bigkoo.pickerview.view.c r0 = r8.c
                com.bigkoo.pickerview.lib.WheelView r0 = com.bigkoo.pickerview.view.c.d(r0)
                n.c r0 = r0.getAdapter()
                int r0 = r0.a()
                int r0 = r0 - r3
                if (r9 <= r0) goto L69
                com.bigkoo.pickerview.view.c r9 = r8.c
                com.bigkoo.pickerview.lib.WheelView r9 = com.bigkoo.pickerview.view.c.d(r9)
                n.c r9 = r9.getAdapter()
                int r9 = r9.a()
                int r9 = r9 - r3
                com.bigkoo.pickerview.view.c r0 = r8.c
                com.bigkoo.pickerview.lib.WheelView r0 = com.bigkoo.pickerview.view.c.d(r0)
                r0.setCurrentItem(r9)
            L69:
                com.bigkoo.pickerview.view.c r0 = r8.c
                int r0 = com.bigkoo.pickerview.view.c.f(r0)
                int r3 = r9 + r0
                com.bigkoo.pickerview.view.c r9 = r8.c
                int r9 = com.bigkoo.pickerview.view.c.f(r9)
                com.bigkoo.pickerview.view.c r0 = r8.c
                int r0 = com.bigkoo.pickerview.view.c.g(r0)
                if (r9 != r0) goto L93
                com.bigkoo.pickerview.view.c r1 = r8.c
                int r4 = com.bigkoo.pickerview.view.c.h(r1)
                com.bigkoo.pickerview.view.c r9 = r8.c
                int r5 = com.bigkoo.pickerview.view.c.i(r9)
                java.util.List r6 = r8.a
                java.util.List r7 = r8.b
                com.bigkoo.pickerview.view.c.j(r1, r2, r3, r4, r5, r6, r7)
                return
            L93:
                com.bigkoo.pickerview.view.c r9 = r8.c
                int r9 = com.bigkoo.pickerview.view.c.f(r9)
                if (r3 != r9) goto Lab
                com.bigkoo.pickerview.view.c r1 = r8.c
                int r4 = com.bigkoo.pickerview.view.c.h(r1)
                java.util.List r6 = r8.a
                java.util.List r7 = r8.b
                r5 = 31
                com.bigkoo.pickerview.view.c.j(r1, r2, r3, r4, r5, r6, r7)
                return
            Lab:
                com.bigkoo.pickerview.view.c r1 = r8.c
                java.util.List r6 = r8.a
                java.util.List r7 = r8.b
                r4 = 1
                r5 = 31
                com.bigkoo.pickerview.view.c.j(r1, r2, r3, r4, r5, r6, r7)
                return
            Lb8:
                com.bigkoo.pickerview.view.c r0 = r8.c
                int r0 = com.bigkoo.pickerview.view.c.a(r0)
                r1 = 12
                if (r2 != r0) goto L12c
                com.bigkoo.pickerview.view.c r0 = r8.c
                com.bigkoo.pickerview.lib.WheelView r0 = com.bigkoo.pickerview.view.c.d(r0)
                n.b r4 = new n.b
                com.bigkoo.pickerview.view.c r5 = r8.c
                int r5 = com.bigkoo.pickerview.view.c.f(r5)
                r4.<init>(r5, r1)
                r0.setAdapter(r4)
                com.bigkoo.pickerview.view.c r0 = r8.c
                com.bigkoo.pickerview.lib.WheelView r0 = com.bigkoo.pickerview.view.c.d(r0)
                n.c r0 = r0.getAdapter()
                int r0 = r0.a()
                int r0 = r0 - r3
                if (r9 <= r0) goto Lff
                com.bigkoo.pickerview.view.c r9 = r8.c
                com.bigkoo.pickerview.lib.WheelView r9 = com.bigkoo.pickerview.view.c.d(r9)
                n.c r9 = r9.getAdapter()
                int r9 = r9.a()
                int r9 = r9 - r3
                com.bigkoo.pickerview.view.c r0 = r8.c
                com.bigkoo.pickerview.lib.WheelView r0 = com.bigkoo.pickerview.view.c.d(r0)
                r0.setCurrentItem(r9)
            Lff:
                com.bigkoo.pickerview.view.c r0 = r8.c
                int r0 = com.bigkoo.pickerview.view.c.f(r0)
                int r3 = r9 + r0
                com.bigkoo.pickerview.view.c r9 = r8.c
                int r9 = com.bigkoo.pickerview.view.c.f(r9)
                if (r3 != r9) goto L11f
                com.bigkoo.pickerview.view.c r1 = r8.c
                int r4 = com.bigkoo.pickerview.view.c.h(r1)
                java.util.List r6 = r8.a
                java.util.List r7 = r8.b
                r5 = 31
                com.bigkoo.pickerview.view.c.j(r1, r2, r3, r4, r5, r6, r7)
                return
            L11f:
                com.bigkoo.pickerview.view.c r1 = r8.c
                java.util.List r6 = r8.a
                java.util.List r7 = r8.b
                r4 = 1
                r5 = 31
                com.bigkoo.pickerview.view.c.j(r1, r2, r3, r4, r5, r6, r7)
                return
            L12c:
                com.bigkoo.pickerview.view.c r0 = r8.c
                int r0 = com.bigkoo.pickerview.view.c.e(r0)
                if (r2 != r0) goto L196
                com.bigkoo.pickerview.view.c r0 = r8.c
                com.bigkoo.pickerview.lib.WheelView r0 = com.bigkoo.pickerview.view.c.d(r0)
                n.b r1 = new n.b
                com.bigkoo.pickerview.view.c r4 = r8.c
                int r4 = com.bigkoo.pickerview.view.c.g(r4)
                r1.<init>(r3, r4)
                r0.setAdapter(r1)
                com.bigkoo.pickerview.view.c r0 = r8.c
                com.bigkoo.pickerview.lib.WheelView r0 = com.bigkoo.pickerview.view.c.d(r0)
                n.c r0 = r0.getAdapter()
                int r0 = r0.a()
                int r0 = r0 - r3
                if (r9 <= r0) goto L171
                com.bigkoo.pickerview.view.c r9 = r8.c
                com.bigkoo.pickerview.lib.WheelView r9 = com.bigkoo.pickerview.view.c.d(r9)
                n.c r9 = r9.getAdapter()
                int r9 = r9.a()
                int r9 = r9 - r3
                com.bigkoo.pickerview.view.c r0 = r8.c
                com.bigkoo.pickerview.lib.WheelView r0 = com.bigkoo.pickerview.view.c.d(r0)
                r0.setCurrentItem(r9)
            L171:
                int r3 = r3 + r9
                com.bigkoo.pickerview.view.c r9 = r8.c
                int r9 = com.bigkoo.pickerview.view.c.g(r9)
                if (r3 != r9) goto L189
                com.bigkoo.pickerview.view.c r1 = r8.c
                int r5 = com.bigkoo.pickerview.view.c.i(r1)
                java.util.List r6 = r8.a
                java.util.List r7 = r8.b
                r4 = 1
                com.bigkoo.pickerview.view.c.j(r1, r2, r3, r4, r5, r6, r7)
                return
            L189:
                com.bigkoo.pickerview.view.c r1 = r8.c
                java.util.List r6 = r8.a
                java.util.List r7 = r8.b
                r4 = 1
                r5 = 31
                com.bigkoo.pickerview.view.c.j(r1, r2, r3, r4, r5, r6, r7)
                return
            L196:
                com.bigkoo.pickerview.view.c r9 = r8.c
                com.bigkoo.pickerview.lib.WheelView r9 = com.bigkoo.pickerview.view.c.d(r9)
                n.b r0 = new n.b
                r0.<init>(r3, r1)
                r9.setAdapter(r0)
                com.bigkoo.pickerview.view.c r1 = r8.c
                com.bigkoo.pickerview.lib.WheelView r9 = com.bigkoo.pickerview.view.c.d(r1)
                int r9 = r9.getCurrentItem()
                int r3 = r3 + r9
                java.util.List r6 = r8.a
                java.util.List r7 = r8.b
                r4 = 1
                r5 = 31
                com.bigkoo.pickerview.view.c.j(r1, r2, r3, r4, r5, r6, r7)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements o.c {
        final /* synthetic */ java.util.List a;
        final /* synthetic */ java.util.List b;
        final /* synthetic */ com.bigkoo.pickerview.view.c c;

        b(com.bigkoo.pickerview.view.c r1, java.util.List r2, java.util.List r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        @Override // o.c
        public void a(int r19) {
                r18 = this;
                r0 = r18
                int r3 = r19 + 1
                com.bigkoo.pickerview.view.c r1 = r0.c
                int r1 = com.bigkoo.pickerview.view.c.a(r1)
                com.bigkoo.pickerview.view.c r2 = r0.c
                int r2 = com.bigkoo.pickerview.view.c.e(r2)
                if (r1 != r2) goto L8f
                com.bigkoo.pickerview.view.c r1 = r0.c
                int r1 = com.bigkoo.pickerview.view.c.f(r1)
                int r3 = r3 + r1
                int r6 = r3 + (-1)
                com.bigkoo.pickerview.view.c r1 = r0.c
                int r1 = com.bigkoo.pickerview.view.c.f(r1)
                com.bigkoo.pickerview.view.c r2 = r0.c
                int r2 = com.bigkoo.pickerview.view.c.g(r2)
                if (r1 != r2) goto L43
                com.bigkoo.pickerview.view.c r4 = r0.c
                int r5 = com.bigkoo.pickerview.view.c.b(r4)
                com.bigkoo.pickerview.view.c r1 = r0.c
                int r7 = com.bigkoo.pickerview.view.c.h(r1)
                com.bigkoo.pickerview.view.c r1 = r0.c
                int r8 = com.bigkoo.pickerview.view.c.i(r1)
                java.util.List r9 = r0.a
                java.util.List r10 = r0.b
                com.bigkoo.pickerview.view.c.j(r4, r5, r6, r7, r8, r9, r10)
                return
            L43:
                com.bigkoo.pickerview.view.c r1 = r0.c
                int r1 = com.bigkoo.pickerview.view.c.f(r1)
                if (r1 != r6) goto L61
                com.bigkoo.pickerview.view.c r4 = r0.c
                int r5 = com.bigkoo.pickerview.view.c.b(r4)
                com.bigkoo.pickerview.view.c r1 = r0.c
                int r7 = com.bigkoo.pickerview.view.c.h(r1)
                java.util.List r9 = r0.a
                java.util.List r10 = r0.b
                r8 = 31
                com.bigkoo.pickerview.view.c.j(r4, r5, r6, r7, r8, r9, r10)
                return
            L61:
                com.bigkoo.pickerview.view.c r1 = r0.c
                int r1 = com.bigkoo.pickerview.view.c.g(r1)
                if (r1 != r6) goto L7e
                com.bigkoo.pickerview.view.c r4 = r0.c
                int r5 = com.bigkoo.pickerview.view.c.b(r4)
                com.bigkoo.pickerview.view.c r1 = r0.c
                int r8 = com.bigkoo.pickerview.view.c.i(r1)
                java.util.List r9 = r0.a
                java.util.List r10 = r0.b
                r7 = 1
                com.bigkoo.pickerview.view.c.j(r4, r5, r6, r7, r8, r9, r10)
                return
            L7e:
                com.bigkoo.pickerview.view.c r4 = r0.c
                int r5 = com.bigkoo.pickerview.view.c.b(r4)
                java.util.List r9 = r0.a
                java.util.List r10 = r0.b
                r7 = 1
                r8 = 31
                com.bigkoo.pickerview.view.c.j(r4, r5, r6, r7, r8, r9, r10)
                return
            L8f:
                com.bigkoo.pickerview.view.c r1 = r0.c
                int r1 = com.bigkoo.pickerview.view.c.b(r1)
                com.bigkoo.pickerview.view.c r2 = r0.c
                int r2 = com.bigkoo.pickerview.view.c.a(r2)
                if (r1 != r2) goto Ld5
                com.bigkoo.pickerview.view.c r1 = r0.c
                int r1 = com.bigkoo.pickerview.view.c.f(r1)
                int r3 = r3 + r1
                int r6 = r3 + (-1)
                com.bigkoo.pickerview.view.c r1 = r0.c
                int r1 = com.bigkoo.pickerview.view.c.f(r1)
                if (r6 != r1) goto Lc4
                com.bigkoo.pickerview.view.c r4 = r0.c
                int r5 = com.bigkoo.pickerview.view.c.b(r4)
                com.bigkoo.pickerview.view.c r1 = r0.c
                int r7 = com.bigkoo.pickerview.view.c.h(r1)
                java.util.List r9 = r0.a
                java.util.List r10 = r0.b
                r8 = 31
                com.bigkoo.pickerview.view.c.j(r4, r5, r6, r7, r8, r9, r10)
                return
            Lc4:
                com.bigkoo.pickerview.view.c r4 = r0.c
                int r5 = com.bigkoo.pickerview.view.c.b(r4)
                java.util.List r9 = r0.a
                java.util.List r10 = r0.b
                r7 = 1
                r8 = 31
                com.bigkoo.pickerview.view.c.j(r4, r5, r6, r7, r8, r9, r10)
                return
            Ld5:
                com.bigkoo.pickerview.view.c r1 = r0.c
                int r1 = com.bigkoo.pickerview.view.c.b(r1)
                com.bigkoo.pickerview.view.c r2 = r0.c
                int r2 = com.bigkoo.pickerview.view.c.e(r2)
                if (r1 != r2) goto L12d
                com.bigkoo.pickerview.view.c r1 = r0.c
                int r1 = com.bigkoo.pickerview.view.c.g(r1)
                if (r3 != r1) goto L10c
                com.bigkoo.pickerview.view.c r4 = r0.c
                int r5 = com.bigkoo.pickerview.view.c.b(r4)
                com.bigkoo.pickerview.view.c r1 = r0.c
                com.bigkoo.pickerview.lib.WheelView r1 = com.bigkoo.pickerview.view.c.d(r1)
                int r1 = r1.getCurrentItem()
                int r6 = r1 + 1
                com.bigkoo.pickerview.view.c r1 = r0.c
                int r8 = com.bigkoo.pickerview.view.c.i(r1)
                java.util.List r9 = r0.a
                java.util.List r10 = r0.b
                r7 = 1
                com.bigkoo.pickerview.view.c.j(r4, r5, r6, r7, r8, r9, r10)
                return
            L10c:
                com.bigkoo.pickerview.view.c r11 = r0.c
                int r12 = com.bigkoo.pickerview.view.c.b(r11)
                com.bigkoo.pickerview.view.c r1 = r0.c
                com.bigkoo.pickerview.lib.WheelView r1 = com.bigkoo.pickerview.view.c.d(r1)
                int r1 = r1.getCurrentItem()
                int r13 = r1 + 1
                java.util.List r1 = r0.a
                java.util.List r2 = r0.b
                r14 = 1
                r15 = 31
                r16 = r1
                r17 = r2
                com.bigkoo.pickerview.view.c.j(r11, r12, r13, r14, r15, r16, r17)
                return
            L12d:
                com.bigkoo.pickerview.view.c r1 = r0.c
                int r2 = com.bigkoo.pickerview.view.c.b(r1)
                java.util.List r6 = r0.a
                java.util.List r7 = r0.b
                r4 = 1
                r5 = 31
                com.bigkoo.pickerview.view.c.j(r1, r2, r3, r4, r5, r6, r7)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.bigkoo.pickerview.view.c$c, reason: collision with other inner class name */
    static /* synthetic */ class C0012c {
        static final /* synthetic */ int[] a = null;

        static {
                com.bigkoo.pickerview.TimePickerView$Type[] r0 = com.bigkoo.pickerview.TimePickerView.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bigkoo.pickerview.view.c.C0012c.a = r0
                com.bigkoo.pickerview.TimePickerView$Type r1 = com.bigkoo.pickerview.TimePickerView.Type.ALL     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.bigkoo.pickerview.view.c.C0012c.a     // Catch: java.lang.NoSuchFieldError -> L1d
                com.bigkoo.pickerview.TimePickerView$Type r1 = com.bigkoo.pickerview.TimePickerView.Type.YEAR_MONTH_DAY     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.bigkoo.pickerview.view.c.C0012c.a     // Catch: java.lang.NoSuchFieldError -> L28
                com.bigkoo.pickerview.TimePickerView$Type r1 = com.bigkoo.pickerview.TimePickerView.Type.HOURS_MINS     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.bigkoo.pickerview.view.c.C0012c.a     // Catch: java.lang.NoSuchFieldError -> L33
                com.bigkoo.pickerview.TimePickerView$Type r1 = com.bigkoo.pickerview.TimePickerView.Type.MONTH_DAY_HOUR_MIN     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.bigkoo.pickerview.view.c.C0012c.a     // Catch: java.lang.NoSuchFieldError -> L3e
                com.bigkoo.pickerview.TimePickerView$Type r1 = com.bigkoo.pickerview.TimePickerView.Type.YEAR_MONTH     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.bigkoo.pickerview.view.c.C0012c.a     // Catch: java.lang.NoSuchFieldError -> L49
                com.bigkoo.pickerview.TimePickerView$Type r1 = com.bigkoo.pickerview.TimePickerView.Type.YEAR_MONTH_DAY_HOUR_MIN     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                return
        }

        public C0012c() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    static {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy-MM-dd HH:mm:ss"
            r0.<init>(r1)
            com.bigkoo.pickerview.view.c.f304w = r0
            return
    }

    public c(android.view.View r3) {
            r2 = this;
            r2.<init>()
            r0 = 1900(0x76c, float:2.662E-42)
            r2.j = r0
            r0 = 2100(0x834, float:2.943E-42)
            r2.k = r0
            r0 = 1
            r2.f308l = r0
            r1 = 12
            r2.f309m = r1
            r2.f310n = r0
            r0 = 31
            r2.f311o = r0
            r0 = 18
            r2.f313q = r0
            r0 = 1070386381(0x3fcccccd, float:1.6)
            r2.f317u = r0
            r2.a = r3
            com.bigkoo.pickerview.TimePickerView$Type r0 = com.bigkoo.pickerview.TimePickerView.Type.ALL
            r2.i = r0
            r2.H(r3)
            return
    }

    public c(android.view.View r3, com.bigkoo.pickerview.TimePickerView.Type r4, int r5, int r6) {
            r2 = this;
            r2.<init>()
            r0 = 1900(0x76c, float:2.662E-42)
            r2.j = r0
            r0 = 2100(0x834, float:2.943E-42)
            r2.k = r0
            r0 = 1
            r2.f308l = r0
            r1 = 12
            r2.f309m = r1
            r2.f310n = r0
            r0 = 31
            r2.f311o = r0
            r0 = 1070386381(0x3fcccccd, float:1.6)
            r2.f317u = r0
            r2.a = r3
            r2.i = r4
            r2.h = r5
            r2.f313q = r6
            r2.H(r3)
            return
    }

    private void B(int r3, int r4, int r5, int r6, java.util.List<java.lang.String> r7, java.util.List<java.lang.String> r8) {
            r2 = this;
            com.bigkoo.pickerview.lib.WheelView r0 = r2.d
            int r0 = r0.getCurrentItem()
            java.lang.String r1 = java.lang.String.valueOf(r4)
            boolean r7 = r7.contains(r1)
            if (r7 == 0) goto L21
            r3 = 31
            if (r6 <= r3) goto L16
            r6 = 31
        L16:
            com.bigkoo.pickerview.lib.WheelView r3 = r2.d
            n.b r4 = new n.b
            r4.<init>(r5, r6)
            r3.setAdapter(r4)
            goto L69
        L21:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            boolean r4 = r8.contains(r4)
            if (r4 == 0) goto L3c
            r3 = 30
            if (r6 <= r3) goto L31
            r6 = 30
        L31:
            com.bigkoo.pickerview.lib.WheelView r3 = r2.d
            n.b r4 = new n.b
            r4.<init>(r5, r6)
            r3.setAdapter(r4)
            goto L69
        L3c:
            int r4 = r3 % 4
            if (r4 != 0) goto L44
            int r4 = r3 % 100
            if (r4 != 0) goto L48
        L44:
            int r3 = r3 % 400
            if (r3 != 0) goto L59
        L48:
            r3 = 29
            if (r6 <= r3) goto L4e
            r6 = 29
        L4e:
            com.bigkoo.pickerview.lib.WheelView r3 = r2.d
            n.b r4 = new n.b
            r4.<init>(r5, r6)
            r3.setAdapter(r4)
            goto L69
        L59:
            r3 = 28
            if (r6 <= r3) goto L5f
            r6 = 28
        L5f:
            com.bigkoo.pickerview.lib.WheelView r3 = r2.d
            n.b r4 = new n.b
            r4.<init>(r5, r6)
            r3.setAdapter(r4)
        L69:
            com.bigkoo.pickerview.lib.WheelView r3 = r2.d
            n.c r3 = r3.getAdapter()
            int r3 = r3.a()
            int r3 = r3 + (-1)
            if (r0 <= r3) goto L88
            com.bigkoo.pickerview.lib.WheelView r3 = r2.d
            n.c r3 = r3.getAdapter()
            int r3 = r3.a()
            int r3 = r3 + (-1)
            com.bigkoo.pickerview.lib.WheelView r4 = r2.d
            r4.setCurrentItem(r3)
        L88:
            return
    }

    private void D() {
            r2 = this;
            com.bigkoo.pickerview.lib.WheelView r0 = r2.d
            int r1 = r2.f315s
            r0.setTextColorCenter(r1)
            com.bigkoo.pickerview.lib.WheelView r0 = r2.c
            int r1 = r2.f315s
            r0.setTextColorCenter(r1)
            com.bigkoo.pickerview.lib.WheelView r0 = r2.b
            int r1 = r2.f315s
            r0.setTextColorCenter(r1)
            com.bigkoo.pickerview.lib.WheelView r0 = r2.e
            int r1 = r2.f315s
            r0.setTextColorCenter(r1)
            com.bigkoo.pickerview.lib.WheelView r0 = r2.f
            int r1 = r2.f315s
            r0.setTextColorCenter(r1)
            com.bigkoo.pickerview.lib.WheelView r0 = r2.g
            int r1 = r2.f315s
            r0.setTextColorCenter(r1)
            return
    }

    private void F() {
            r2 = this;
            com.bigkoo.pickerview.lib.WheelView r0 = r2.d
            int r1 = r2.f314r
            r0.setTextColorOut(r1)
            com.bigkoo.pickerview.lib.WheelView r0 = r2.c
            int r1 = r2.f314r
            r0.setTextColorOut(r1)
            com.bigkoo.pickerview.lib.WheelView r0 = r2.b
            int r1 = r2.f314r
            r0.setTextColorOut(r1)
            com.bigkoo.pickerview.lib.WheelView r0 = r2.e
            int r1 = r2.f314r
            r0.setTextColorOut(r1)
            com.bigkoo.pickerview.lib.WheelView r0 = r2.f
            int r1 = r2.f314r
            r0.setTextColorOut(r1)
            com.bigkoo.pickerview.lib.WheelView r0 = r2.g
            int r1 = r2.f314r
            r0.setTextColorOut(r1)
            return
    }

    static /* synthetic */ int a(com.bigkoo.pickerview.view.c r0) {
            int r0 = r0.j
            return r0
    }

    static /* synthetic */ int b(com.bigkoo.pickerview.view.c r0) {
            int r0 = r0.f312p
            return r0
    }

    static /* synthetic */ int c(com.bigkoo.pickerview.view.c r0, int r1) {
            r0.f312p = r1
            return r1
    }

    static /* synthetic */ com.bigkoo.pickerview.lib.WheelView d(com.bigkoo.pickerview.view.c r0) {
            com.bigkoo.pickerview.lib.WheelView r0 = r0.c
            return r0
    }

    static /* synthetic */ int e(com.bigkoo.pickerview.view.c r0) {
            int r0 = r0.k
            return r0
    }

    static /* synthetic */ int f(com.bigkoo.pickerview.view.c r0) {
            int r0 = r0.f308l
            return r0
    }

    static /* synthetic */ int g(com.bigkoo.pickerview.view.c r0) {
            int r0 = r0.f309m
            return r0
    }

    static /* synthetic */ int h(com.bigkoo.pickerview.view.c r0) {
            int r0 = r0.f310n
            return r0
    }

    static /* synthetic */ int i(com.bigkoo.pickerview.view.c r0) {
            int r0 = r0.f311o
            return r0
    }

    static /* synthetic */ void j(com.bigkoo.pickerview.view.c r0, int r1, int r2, int r3, int r4, java.util.List r5, java.util.List r6) {
            r0.B(r1, r2, r3, r4, r5, r6)
            return
    }

    private void o() {
            r2 = this;
            com.bigkoo.pickerview.lib.WheelView r0 = r2.d
            int r1 = r2.f313q
            float r1 = (float) r1
            r0.setTextSize(r1)
            com.bigkoo.pickerview.lib.WheelView r0 = r2.c
            int r1 = r2.f313q
            float r1 = (float) r1
            r0.setTextSize(r1)
            com.bigkoo.pickerview.lib.WheelView r0 = r2.b
            int r1 = r2.f313q
            float r1 = (float) r1
            r0.setTextSize(r1)
            com.bigkoo.pickerview.lib.WheelView r0 = r2.e
            int r1 = r2.f313q
            float r1 = (float) r1
            r0.setTextSize(r1)
            com.bigkoo.pickerview.lib.WheelView r0 = r2.f
            int r1 = r2.f313q
            float r1 = (float) r1
            r0.setTextSize(r1)
            com.bigkoo.pickerview.lib.WheelView r0 = r2.g
            int r1 = r2.f313q
            float r1 = (float) r1
            r0.setTextSize(r1)
            return
    }

    private void q() {
            r2 = this;
            com.bigkoo.pickerview.lib.WheelView r0 = r2.d
            int r1 = r2.f316t
            r0.setDividerColor(r1)
            com.bigkoo.pickerview.lib.WheelView r0 = r2.c
            int r1 = r2.f316t
            r0.setDividerColor(r1)
            com.bigkoo.pickerview.lib.WheelView r0 = r2.b
            int r1 = r2.f316t
            r0.setDividerColor(r1)
            com.bigkoo.pickerview.lib.WheelView r0 = r2.e
            int r1 = r2.f316t
            r0.setDividerColor(r1)
            com.bigkoo.pickerview.lib.WheelView r0 = r2.f
            int r1 = r2.f316t
            r0.setDividerColor(r1)
            com.bigkoo.pickerview.lib.WheelView r0 = r2.g
            int r1 = r2.f316t
            r0.setDividerColor(r1)
            return
    }

    private void s() {
            r2 = this;
            com.bigkoo.pickerview.lib.WheelView r0 = r2.d
            com.bigkoo.pickerview.lib.WheelView$DividerType r1 = r2.f318v
            r0.setDividerType(r1)
            com.bigkoo.pickerview.lib.WheelView r0 = r2.c
            com.bigkoo.pickerview.lib.WheelView$DividerType r1 = r2.f318v
            r0.setDividerType(r1)
            com.bigkoo.pickerview.lib.WheelView r0 = r2.b
            com.bigkoo.pickerview.lib.WheelView$DividerType r1 = r2.f318v
            r0.setDividerType(r1)
            com.bigkoo.pickerview.lib.WheelView r0 = r2.e
            com.bigkoo.pickerview.lib.WheelView$DividerType r1 = r2.f318v
            r0.setDividerType(r1)
            com.bigkoo.pickerview.lib.WheelView r0 = r2.f
            com.bigkoo.pickerview.lib.WheelView$DividerType r1 = r2.f318v
            r0.setDividerType(r1)
            com.bigkoo.pickerview.lib.WheelView r0 = r2.g
            com.bigkoo.pickerview.lib.WheelView$DividerType r1 = r2.f318v
            r0.setDividerType(r1)
            return
    }

    private void w() {
            r2 = this;
            com.bigkoo.pickerview.lib.WheelView r0 = r2.d
            float r1 = r2.f317u
            r0.setLineSpacingMultiplier(r1)
            com.bigkoo.pickerview.lib.WheelView r0 = r2.c
            float r1 = r2.f317u
            r0.setLineSpacingMultiplier(r1)
            com.bigkoo.pickerview.lib.WheelView r0 = r2.b
            float r1 = r2.f317u
            r0.setLineSpacingMultiplier(r1)
            com.bigkoo.pickerview.lib.WheelView r0 = r2.e
            float r1 = r2.f317u
            r0.setLineSpacingMultiplier(r1)
            com.bigkoo.pickerview.lib.WheelView r0 = r2.f
            float r1 = r2.f317u
            r0.setLineSpacingMultiplier(r1)
            com.bigkoo.pickerview.lib.WheelView r0 = r2.g
            float r1 = r2.f317u
            r0.setLineSpacingMultiplier(r1)
            return
    }

    public void A(java.util.Calendar r5, java.util.Calendar r6) {
            r4 = this;
            r0 = 5
            r1 = 2
            r2 = 1
            if (r5 != 0) goto L39
            if (r6 == 0) goto L39
            int r5 = r6.get(r2)
            int r1 = r6.get(r1)
            int r1 = r1 + r2
            int r6 = r6.get(r0)
            int r0 = r4.j
            if (r5 <= r0) goto L1f
            r4.k = r5
            r4.f309m = r1
            r4.f311o = r6
            return
        L1f:
            if (r5 != r0) goto L99
            int r0 = r4.f308l
            if (r1 <= r0) goto L2c
            r4.k = r5
            r4.f309m = r1
            r4.f311o = r6
            return
        L2c:
            if (r1 != r0) goto L99
            int r0 = r4.f310n
            if (r1 <= r0) goto L99
            r4.k = r5
            r4.f309m = r1
            r4.f311o = r6
            return
        L39:
            if (r5 == 0) goto L6f
            if (r6 != 0) goto L6f
            int r6 = r5.get(r2)
            int r1 = r5.get(r1)
            int r1 = r1 + r2
            int r5 = r5.get(r0)
            int r0 = r4.k
            if (r6 >= r0) goto L55
            r4.f308l = r1
            r4.f310n = r5
            r4.j = r6
            return
        L55:
            if (r6 != r0) goto L99
            int r0 = r4.f309m
            if (r1 >= r0) goto L62
            r4.f308l = r1
            r4.f310n = r5
            r4.j = r6
            return
        L62:
            if (r1 != r0) goto L99
            int r0 = r4.f311o
            if (r5 >= r0) goto L99
            r4.f308l = r1
            r4.f310n = r5
            r4.j = r6
            return
        L6f:
            if (r5 == 0) goto L99
            if (r6 == 0) goto L99
            int r3 = r5.get(r2)
            r4.j = r3
            int r3 = r6.get(r2)
            r4.k = r3
            int r3 = r5.get(r1)
            int r3 = r3 + r2
            r4.f308l = r3
            int r1 = r6.get(r1)
            int r1 = r1 + r2
            r4.f309m = r1
            int r5 = r5.get(r0)
            r4.f310n = r5
            int r5 = r6.get(r0)
            r4.f311o = r5
        L99:
            return
    }

    public void C(int r1) {
            r0 = this;
            r0.j = r1
            return
    }

    public void E(int r1) {
            r0 = this;
            r0.f315s = r1
            r0.D()
            return
    }

    public void G(int r1) {
            r0 = this;
            r0.f314r = r1
            r0.F()
            return
    }

    public void H(android.view.View r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public int k() {
            r1 = this;
            int r0 = r1.k
            return r0
    }

    public int l() {
            r1 = this;
            int r0 = r1.j
            return r0
    }

    public java.lang.String m() {
            r6 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            int r1 = r6.f312p
            int r2 = r6.j
            java.lang.String r3 = " "
            java.lang.String r4 = ":"
            java.lang.String r5 = "-"
            if (r1 != r2) goto Lc4
            com.bigkoo.pickerview.lib.WheelView r1 = r6.c
            r1.getCurrentItem()
            java.io.PrintStream r1 = java.lang.System.out
            r1.getClass()
            com.bigkoo.pickerview.lib.WheelView r1 = r6.c
            int r1 = r1.getCurrentItem()
            int r2 = r6.f308l
            int r1 = r1 + r2
            if (r1 != r2) goto L76
            com.bigkoo.pickerview.lib.WheelView r1 = r6.b
            int r1 = r1.getCurrentItem()
            int r2 = r6.j
            int r1 = r1 + r2
            r0.append(r1)
            r0.append(r5)
            com.bigkoo.pickerview.lib.WheelView r1 = r6.c
            int r1 = r1.getCurrentItem()
            int r2 = r6.f308l
            int r1 = r1 + r2
            r0.append(r1)
            r0.append(r5)
            com.bigkoo.pickerview.lib.WheelView r1 = r6.d
            int r1 = r1.getCurrentItem()
            int r2 = r6.f310n
            int r1 = r1 + r2
            r0.append(r1)
            r0.append(r3)
            com.bigkoo.pickerview.lib.WheelView r1 = r6.e
            int r1 = r1.getCurrentItem()
            r0.append(r1)
            r0.append(r4)
            com.bigkoo.pickerview.lib.WheelView r1 = r6.f
            int r1 = r1.getCurrentItem()
            r0.append(r1)
            r0.append(r4)
            com.bigkoo.pickerview.lib.WheelView r1 = r6.g
            int r1 = r1.getCurrentItem()
            r0.append(r1)
            goto L110
        L76:
            com.bigkoo.pickerview.lib.WheelView r1 = r6.b
            int r1 = r1.getCurrentItem()
            int r2 = r6.j
            int r1 = r1 + r2
            r0.append(r1)
            r0.append(r5)
            com.bigkoo.pickerview.lib.WheelView r1 = r6.c
            int r1 = r1.getCurrentItem()
            int r2 = r6.f308l
            int r1 = r1 + r2
            r0.append(r1)
            r0.append(r5)
            com.bigkoo.pickerview.lib.WheelView r1 = r6.d
            int r1 = r1.getCurrentItem()
            int r1 = r1 + 1
            r0.append(r1)
            r0.append(r3)
            com.bigkoo.pickerview.lib.WheelView r1 = r6.e
            int r1 = r1.getCurrentItem()
            r0.append(r1)
            r0.append(r4)
            com.bigkoo.pickerview.lib.WheelView r1 = r6.f
            int r1 = r1.getCurrentItem()
            r0.append(r1)
            r0.append(r4)
            com.bigkoo.pickerview.lib.WheelView r1 = r6.g
            int r1 = r1.getCurrentItem()
            r0.append(r1)
            goto L110
        Lc4:
            com.bigkoo.pickerview.lib.WheelView r1 = r6.b
            int r1 = r1.getCurrentItem()
            int r2 = r6.j
            int r1 = r1 + r2
            r0.append(r1)
            r0.append(r5)
            com.bigkoo.pickerview.lib.WheelView r1 = r6.c
            int r1 = r1.getCurrentItem()
            int r1 = r1 + 1
            r0.append(r1)
            r0.append(r5)
            com.bigkoo.pickerview.lib.WheelView r1 = r6.d
            int r1 = r1.getCurrentItem()
            int r1 = r1 + 1
            r0.append(r1)
            r0.append(r3)
            com.bigkoo.pickerview.lib.WheelView r1 = r6.e
            int r1 = r1.getCurrentItem()
            r0.append(r1)
            r0.append(r4)
            com.bigkoo.pickerview.lib.WheelView r1 = r6.f
            int r1 = r1.getCurrentItem()
            r0.append(r1)
            r0.append(r4)
            com.bigkoo.pickerview.lib.WheelView r1 = r6.g
            int r1 = r1.getCurrentItem()
            r0.append(r1)
        L110:
            java.lang.String r0 = r0.toString()
            return r0
    }

    public android.view.View n() {
            r1 = this;
            android.view.View r0 = r1.a
            return r0
    }

    public void p(boolean r2) {
            r1 = this;
            com.bigkoo.pickerview.lib.WheelView r0 = r1.b
            r0.setCyclic(r2)
            com.bigkoo.pickerview.lib.WheelView r0 = r1.c
            r0.setCyclic(r2)
            com.bigkoo.pickerview.lib.WheelView r0 = r1.d
            r0.setCyclic(r2)
            com.bigkoo.pickerview.lib.WheelView r0 = r1.e
            r0.setCyclic(r2)
            com.bigkoo.pickerview.lib.WheelView r0 = r1.f
            r0.setCyclic(r2)
            com.bigkoo.pickerview.lib.WheelView r0 = r1.g
            r0.setCyclic(r2)
            return
    }

    public void r(int r1) {
            r0 = this;
            r0.f316t = r1
            r0.q()
            return
    }

    public void t(com.bigkoo.pickerview.lib.WheelView.DividerType r1) {
            r0 = this;
            r0.f318v = r1
            r0.s()
            return
    }

    public void u(int r1) {
            r0 = this;
            r0.k = r1
            return
    }

    public void v(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
            r2 = this;
            if (r3 == 0) goto L8
            com.bigkoo.pickerview.lib.WheelView r0 = r2.b
            r0.setLabel(r3)
            goto L19
        L8:
            com.bigkoo.pickerview.lib.WheelView r3 = r2.b
            android.view.View r0 = r2.a
            android.content.Context r0 = r0.getContext()
            int r1 = com.bigkoo.pickerview.R.string.pickerview_year
            java.lang.String r0 = r0.getString(r1)
            r3.setLabel(r0)
        L19:
            if (r4 == 0) goto L21
            com.bigkoo.pickerview.lib.WheelView r3 = r2.c
            r3.setLabel(r4)
            goto L32
        L21:
            com.bigkoo.pickerview.lib.WheelView r3 = r2.c
            android.view.View r4 = r2.a
            android.content.Context r4 = r4.getContext()
            int r0 = com.bigkoo.pickerview.R.string.pickerview_month
            java.lang.String r4 = r4.getString(r0)
            r3.setLabel(r4)
        L32:
            if (r5 == 0) goto L3a
            com.bigkoo.pickerview.lib.WheelView r3 = r2.d
            r3.setLabel(r5)
            goto L4b
        L3a:
            com.bigkoo.pickerview.lib.WheelView r3 = r2.d
            android.view.View r4 = r2.a
            android.content.Context r4 = r4.getContext()
            int r5 = com.bigkoo.pickerview.R.string.pickerview_day
            java.lang.String r4 = r4.getString(r5)
            r3.setLabel(r4)
        L4b:
            if (r6 == 0) goto L53
            com.bigkoo.pickerview.lib.WheelView r3 = r2.e
            r3.setLabel(r6)
            goto L64
        L53:
            com.bigkoo.pickerview.lib.WheelView r3 = r2.e
            android.view.View r4 = r2.a
            android.content.Context r4 = r4.getContext()
            int r5 = com.bigkoo.pickerview.R.string.pickerview_hours
            java.lang.String r4 = r4.getString(r5)
            r3.setLabel(r4)
        L64:
            if (r7 == 0) goto L6c
            com.bigkoo.pickerview.lib.WheelView r3 = r2.f
            r3.setLabel(r7)
            goto L7d
        L6c:
            com.bigkoo.pickerview.lib.WheelView r3 = r2.f
            android.view.View r4 = r2.a
            android.content.Context r4 = r4.getContext()
            int r5 = com.bigkoo.pickerview.R.string.pickerview_minutes
            java.lang.String r4 = r4.getString(r5)
            r3.setLabel(r4)
        L7d:
            if (r8 == 0) goto L85
            com.bigkoo.pickerview.lib.WheelView r3 = r2.g
            r3.setLabel(r8)
            return
        L85:
            com.bigkoo.pickerview.lib.WheelView r3 = r2.g
            android.view.View r4 = r2.a
            android.content.Context r4 = r4.getContext()
            int r5 = com.bigkoo.pickerview.R.string.pickerview_seconds
            java.lang.String r4 = r4.getString(r5)
            r3.setLabel(r4)
            return
    }

    public void x(float r1) {
            r0 = this;
            r0.f317u = r1
            r0.w()
            return
    }

    public void y(int r8, int r9, int r10) {
            r7 = this;
            r5 = 0
            r6 = 0
            r4 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r0.z(r1, r2, r3, r4, r5, r6)
            return
    }

    public void z(int r12, int r13, int r14, int r15, int r16, int r17) {
            r11 = this;
            java.lang.String r5 = "10"
            java.lang.String r6 = "12"
            java.lang.String r0 = "1"
            java.lang.String r1 = "3"
            java.lang.String r2 = "5"
            java.lang.String r3 = "7"
            java.lang.String r4 = "8"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6}
            java.lang.String r1 = "9"
            java.lang.String r2 = "11"
            java.lang.String r3 = "4"
            java.lang.String r4 = "6"
            java.lang.String[] r1 = new java.lang.String[]{r3, r4, r1, r2}
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.List r1 = java.util.Arrays.asList(r1)
            android.view.View r2 = r11.a
            r2.getContext()
            r11.f312p = r12
            android.view.View r2 = r11.a
            int r3 = com.bigkoo.pickerview.R.id.year
            android.view.View r2 = r2.findViewById(r3)
            com.bigkoo.pickerview.lib.WheelView r2 = (com.bigkoo.pickerview.lib.WheelView) r2
            r11.b = r2
            n.b r3 = new n.b
            int r4 = r11.j
            int r5 = r11.k
            r3.<init>(r4, r5)
            r2.setAdapter(r3)
            com.bigkoo.pickerview.lib.WheelView r2 = r11.b
            int r3 = r11.j
            int r3 = r12 - r3
            r2.setCurrentItem(r3)
            com.bigkoo.pickerview.lib.WheelView r2 = r11.b
            int r3 = r11.h
            r2.setGravity(r3)
            android.view.View r2 = r11.a
            int r3 = com.bigkoo.pickerview.R.id.month
            android.view.View r2 = r2.findViewById(r3)
            com.bigkoo.pickerview.lib.WheelView r2 = (com.bigkoo.pickerview.lib.WheelView) r2
            r11.c = r2
            int r3 = r11.j
            int r4 = r11.k
            r5 = 1
            if (r3 != r4) goto L7f
            n.b r3 = new n.b
            int r4 = r11.f308l
            int r6 = r11.f309m
            r3.<init>(r4, r6)
            r2.setAdapter(r3)
            com.bigkoo.pickerview.lib.WheelView r2 = r11.c
            int r3 = r13 + 1
            int r4 = r11.f308l
            int r3 = r3 - r4
            r2.setCurrentItem(r3)
            goto Lb7
        L7f:
            r6 = 12
            if (r12 != r3) goto L98
            n.b r3 = new n.b
            int r4 = r11.f308l
            r3.<init>(r4, r6)
            r2.setAdapter(r3)
            com.bigkoo.pickerview.lib.WheelView r2 = r11.c
            int r3 = r13 + 1
            int r4 = r11.f308l
            int r3 = r3 - r4
            r2.setCurrentItem(r3)
            goto Lb7
        L98:
            if (r12 != r4) goto Laa
            n.b r3 = new n.b
            int r4 = r11.f309m
            r3.<init>(r5, r4)
            r2.setAdapter(r3)
            com.bigkoo.pickerview.lib.WheelView r2 = r11.c
            r2.setCurrentItem(r13)
            goto Lb7
        Laa:
            n.b r3 = new n.b
            r3.<init>(r5, r6)
            r2.setAdapter(r3)
            com.bigkoo.pickerview.lib.WheelView r2 = r11.c
            r2.setCurrentItem(r13)
        Lb7:
            com.bigkoo.pickerview.lib.WheelView r2 = r11.c
            int r3 = r11.h
            r2.setGravity(r3)
            android.view.View r2 = r11.a
            int r3 = com.bigkoo.pickerview.R.id.day
            android.view.View r2 = r2.findViewById(r3)
            com.bigkoo.pickerview.lib.WheelView r2 = (com.bigkoo.pickerview.lib.WheelView) r2
            r11.d = r2
            int r2 = r11.j
            int r3 = r11.k
            r4 = 28
            r6 = 29
            r7 = 30
            r8 = 31
            if (r2 != r3) goto L15d
            int r9 = r11.f308l
            int r10 = r11.f309m
            if (r9 != r10) goto L15d
            int r13 = r13 + r5
            java.lang.String r2 = java.lang.String.valueOf(r13)
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto Lfe
            int r12 = r11.f311o
            if (r12 <= r8) goto Lef
            r11.f311o = r8
        Lef:
            com.bigkoo.pickerview.lib.WheelView r12 = r11.d
            n.b r13 = new n.b
            int r2 = r11.f310n
            int r3 = r11.f311o
            r13.<init>(r2, r3)
            r12.setAdapter(r13)
            goto L152
        Lfe:
            java.lang.String r13 = java.lang.String.valueOf(r13)
            boolean r13 = r1.contains(r13)
            if (r13 == 0) goto L11d
            int r12 = r11.f311o
            if (r12 <= r7) goto L10e
            r11.f311o = r7
        L10e:
            com.bigkoo.pickerview.lib.WheelView r12 = r11.d
            n.b r13 = new n.b
            int r2 = r11.f310n
            int r3 = r11.f311o
            r13.<init>(r2, r3)
            r12.setAdapter(r13)
            goto L152
        L11d:
            int r13 = r12 % 4
            if (r13 != 0) goto L125
            int r13 = r12 % 100
            if (r13 != 0) goto L129
        L125:
            int r12 = r12 % 400
            if (r12 != 0) goto L13e
        L129:
            int r12 = r11.f311o
            if (r12 <= r6) goto L12f
            r11.f311o = r6
        L12f:
            com.bigkoo.pickerview.lib.WheelView r12 = r11.d
            n.b r13 = new n.b
            int r2 = r11.f310n
            int r3 = r11.f311o
            r13.<init>(r2, r3)
            r12.setAdapter(r13)
            goto L152
        L13e:
            int r12 = r11.f311o
            if (r12 <= r4) goto L144
            r11.f311o = r4
        L144:
            com.bigkoo.pickerview.lib.WheelView r12 = r11.d
            n.b r13 = new n.b
            int r2 = r11.f310n
            int r3 = r11.f311o
            r13.<init>(r2, r3)
            r12.setAdapter(r13)
        L152:
            com.bigkoo.pickerview.lib.WheelView r12 = r11.d
            int r13 = r11.f310n
            int r13 = r14 - r13
            r12.setCurrentItem(r13)
            goto L291
        L15d:
            if (r12 != r2) goto L1c3
            int r2 = r13 + 1
            int r9 = r11.f308l
            if (r2 != r9) goto L1c3
            java.lang.String r13 = java.lang.String.valueOf(r2)
            boolean r13 = r0.contains(r13)
            if (r13 == 0) goto L17c
            com.bigkoo.pickerview.lib.WheelView r12 = r11.d
            n.b r13 = new n.b
            int r2 = r11.f310n
            r13.<init>(r2, r8)
            r12.setAdapter(r13)
            goto L1b8
        L17c:
            java.lang.String r13 = java.lang.String.valueOf(r2)
            boolean r13 = r1.contains(r13)
            if (r13 == 0) goto L193
            com.bigkoo.pickerview.lib.WheelView r12 = r11.d
            n.b r13 = new n.b
            int r2 = r11.f310n
            r13.<init>(r2, r7)
            r12.setAdapter(r13)
            goto L1b8
        L193:
            int r13 = r12 % 4
            if (r13 != 0) goto L19b
            int r13 = r12 % 100
            if (r13 != 0) goto L19f
        L19b:
            int r12 = r12 % 400
            if (r12 != 0) goto L1ac
        L19f:
            com.bigkoo.pickerview.lib.WheelView r12 = r11.d
            n.b r13 = new n.b
            int r2 = r11.f310n
            r13.<init>(r2, r6)
            r12.setAdapter(r13)
            goto L1b8
        L1ac:
            com.bigkoo.pickerview.lib.WheelView r12 = r11.d
            n.b r13 = new n.b
            int r2 = r11.f310n
            r13.<init>(r2, r4)
            r12.setAdapter(r13)
        L1b8:
            com.bigkoo.pickerview.lib.WheelView r12 = r11.d
            int r13 = r11.f310n
            int r13 = r14 - r13
            r12.setCurrentItem(r13)
            goto L291
        L1c3:
            if (r12 != r3) goto L23e
            int r2 = r13 + 1
            int r3 = r11.f309m
            if (r2 != r3) goto L23e
            java.lang.String r13 = java.lang.String.valueOf(r2)
            boolean r13 = r0.contains(r13)
            if (r13 == 0) goto L1e8
            int r12 = r11.f311o
            if (r12 <= r8) goto L1db
            r11.f311o = r8
        L1db:
            com.bigkoo.pickerview.lib.WheelView r12 = r11.d
            n.b r13 = new n.b
            int r2 = r11.f311o
            r13.<init>(r5, r2)
            r12.setAdapter(r13)
            goto L236
        L1e8:
            java.lang.String r13 = java.lang.String.valueOf(r2)
            boolean r13 = r1.contains(r13)
            if (r13 == 0) goto L205
            int r12 = r11.f311o
            if (r12 <= r7) goto L1f8
            r11.f311o = r7
        L1f8:
            com.bigkoo.pickerview.lib.WheelView r12 = r11.d
            n.b r13 = new n.b
            int r2 = r11.f311o
            r13.<init>(r5, r2)
            r12.setAdapter(r13)
            goto L236
        L205:
            int r13 = r12 % 4
            if (r13 != 0) goto L20d
            int r13 = r12 % 100
            if (r13 != 0) goto L211
        L20d:
            int r12 = r12 % 400
            if (r12 != 0) goto L224
        L211:
            int r12 = r11.f311o
            if (r12 <= r6) goto L217
            r11.f311o = r6
        L217:
            com.bigkoo.pickerview.lib.WheelView r12 = r11.d
            n.b r13 = new n.b
            int r2 = r11.f311o
            r13.<init>(r5, r2)
            r12.setAdapter(r13)
            goto L236
        L224:
            int r12 = r11.f311o
            if (r12 <= r4) goto L22a
            r11.f311o = r4
        L22a:
            com.bigkoo.pickerview.lib.WheelView r12 = r11.d
            n.b r13 = new n.b
            int r2 = r11.f311o
            r13.<init>(r5, r2)
            r12.setAdapter(r13)
        L236:
            com.bigkoo.pickerview.lib.WheelView r12 = r11.d
            int r13 = r14 + (-1)
            r12.setCurrentItem(r13)
            goto L291
        L23e:
            int r13 = r13 + r5
            java.lang.String r2 = java.lang.String.valueOf(r13)
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L254
            com.bigkoo.pickerview.lib.WheelView r12 = r11.d
            n.b r13 = new n.b
            r13.<init>(r5, r8)
            r12.setAdapter(r13)
            goto L28a
        L254:
            java.lang.String r13 = java.lang.String.valueOf(r13)
            boolean r13 = r1.contains(r13)
            if (r13 == 0) goto L269
            com.bigkoo.pickerview.lib.WheelView r12 = r11.d
            n.b r13 = new n.b
            r13.<init>(r5, r7)
            r12.setAdapter(r13)
            goto L28a
        L269:
            int r13 = r12 % 4
            if (r13 != 0) goto L271
            int r13 = r12 % 100
            if (r13 != 0) goto L275
        L271:
            int r12 = r12 % 400
            if (r12 != 0) goto L280
        L275:
            com.bigkoo.pickerview.lib.WheelView r12 = r11.d
            n.b r13 = new n.b
            r13.<init>(r5, r6)
            r12.setAdapter(r13)
            goto L28a
        L280:
            com.bigkoo.pickerview.lib.WheelView r12 = r11.d
            n.b r13 = new n.b
            r13.<init>(r5, r4)
            r12.setAdapter(r13)
        L28a:
            com.bigkoo.pickerview.lib.WheelView r12 = r11.d
            int r13 = r14 + (-1)
            r12.setCurrentItem(r13)
        L291:
            com.bigkoo.pickerview.lib.WheelView r12 = r11.d
            int r13 = r11.h
            r12.setGravity(r13)
            android.view.View r12 = r11.a
            int r13 = com.bigkoo.pickerview.R.id.hour
            android.view.View r12 = r12.findViewById(r13)
            com.bigkoo.pickerview.lib.WheelView r12 = (com.bigkoo.pickerview.lib.WheelView) r12
            r11.e = r12
            n.b r13 = new n.b
            r2 = 23
            r3 = 0
            r13.<init>(r3, r2)
            r12.setAdapter(r13)
            com.bigkoo.pickerview.lib.WheelView r12 = r11.e
            r12.setCurrentItem(r15)
            com.bigkoo.pickerview.lib.WheelView r12 = r11.e
            int r13 = r11.h
            r12.setGravity(r13)
            android.view.View r12 = r11.a
            int r13 = com.bigkoo.pickerview.R.id.min
            android.view.View r12 = r12.findViewById(r13)
            com.bigkoo.pickerview.lib.WheelView r12 = (com.bigkoo.pickerview.lib.WheelView) r12
            r11.f = r12
            n.b r13 = new n.b
            r2 = 59
            r13.<init>(r3, r2)
            r12.setAdapter(r13)
            com.bigkoo.pickerview.lib.WheelView r12 = r11.f
            r13 = r16
            r12.setCurrentItem(r13)
            com.bigkoo.pickerview.lib.WheelView r12 = r11.f
            int r13 = r11.h
            r12.setGravity(r13)
            android.view.View r12 = r11.a
            int r13 = com.bigkoo.pickerview.R.id.second
            android.view.View r12 = r12.findViewById(r13)
            com.bigkoo.pickerview.lib.WheelView r12 = (com.bigkoo.pickerview.lib.WheelView) r12
            r11.g = r12
            n.b r13 = new n.b
            r13.<init>(r3, r2)
            r12.setAdapter(r13)
            com.bigkoo.pickerview.lib.WheelView r12 = r11.g
            r13 = r17
            r12.setCurrentItem(r13)
            com.bigkoo.pickerview.lib.WheelView r12 = r11.g
            int r13 = r11.h
            r12.setGravity(r13)
            com.bigkoo.pickerview.view.c$a r12 = new com.bigkoo.pickerview.view.c$a
            r12.<init>(r11, r0, r1)
            com.bigkoo.pickerview.view.c$b r13 = new com.bigkoo.pickerview.view.c$b
            r13.<init>(r11, r0, r1)
            com.bigkoo.pickerview.lib.WheelView r0 = r11.b
            r0.setOnItemSelectedListener(r12)
            com.bigkoo.pickerview.lib.WheelView r12 = r11.c
            r12.setOnItemSelectedListener(r13)
            int[] r12 = com.bigkoo.pickerview.view.c.C0012c.a
            com.bigkoo.pickerview.TimePickerView$Type r13 = r11.i
            int r13 = r13.ordinal()
            r12 = r12[r13]
            r13 = 2
            r0 = 8
            if (r12 == r13) goto L36b
            r13 = 3
            if (r12 == r13) goto L356
            r13 = 4
            if (r12 == r13) goto L34b
            r13 = 5
            if (r12 == r13) goto L331
            r13 = 6
            if (r12 == r13) goto L345
            goto L37a
        L331:
            com.bigkoo.pickerview.lib.WheelView r12 = r11.d
            r12.setVisibility(r0)
            com.bigkoo.pickerview.lib.WheelView r12 = r11.e
            r12.setVisibility(r0)
            com.bigkoo.pickerview.lib.WheelView r12 = r11.f
            r12.setVisibility(r0)
            com.bigkoo.pickerview.lib.WheelView r12 = r11.g
            r12.setVisibility(r0)
        L345:
            com.bigkoo.pickerview.lib.WheelView r12 = r11.g
            r12.setVisibility(r0)
            goto L37a
        L34b:
            com.bigkoo.pickerview.lib.WheelView r12 = r11.b
            r12.setVisibility(r0)
            com.bigkoo.pickerview.lib.WheelView r12 = r11.g
            r12.setVisibility(r0)
            goto L37a
        L356:
            com.bigkoo.pickerview.lib.WheelView r12 = r11.b
            r12.setVisibility(r0)
            com.bigkoo.pickerview.lib.WheelView r12 = r11.c
            r12.setVisibility(r0)
            com.bigkoo.pickerview.lib.WheelView r12 = r11.d
            r12.setVisibility(r0)
            com.bigkoo.pickerview.lib.WheelView r12 = r11.g
            r12.setVisibility(r0)
            goto L37a
        L36b:
            com.bigkoo.pickerview.lib.WheelView r12 = r11.e
            r12.setVisibility(r0)
            com.bigkoo.pickerview.lib.WheelView r12 = r11.f
            r12.setVisibility(r0)
            com.bigkoo.pickerview.lib.WheelView r12 = r11.g
            r12.setVisibility(r0)
        L37a:
            r11.o()
            return
    }
}
