package cn.jiguang.ac;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class e implements java.lang.Cloneable {

    /* renamed from: d, reason: collision with root package name */
    private static cn.jiguang.ac.i[] f339d;

    /* renamed from: e, reason: collision with root package name */
    private static cn.jiguang.ac.h[] f340e;
    private cn.jiguang.ac.d a;

    /* renamed from: b, reason: collision with root package name */
    private java.util.List[] f341b;

    /* renamed from: c, reason: collision with root package name */
    private int f342c;

    static {
            r0 = 0
            cn.jiguang.ac.i[] r1 = new cn.jiguang.ac.i[r0]
            cn.jiguang.ac.e.f339d = r1
            cn.jiguang.ac.h[] r0 = new cn.jiguang.ac.h[r0]
            cn.jiguang.ac.e.f340e = r0
            return
    }

    public e() {
            r1 = this;
            cn.jiguang.ac.d r0 = new cn.jiguang.ac.d
            r0.<init>()
            r1.<init>(r0)
            return
    }

    e(cn.jiguang.ac.b r7) {
            r6 = this;
            cn.jiguang.ac.d r0 = new cn.jiguang.ac.d
            r0.<init>(r7)
            r6.<init>(r0)
            r0 = 0
            r1 = 0
        La:
            r2 = 4
            if (r1 >= r2) goto L32
            cn.jiguang.ac.d r2 = r6.a
            int r2 = r2.c(r1)
            if (r2 <= 0) goto L1e
            java.util.List[] r3 = r6.f341b
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r2)
            r3[r1] = r4
        L1e:
            r3 = 0
        L1f:
            if (r3 >= r2) goto L2f
            cn.jiguang.ac.i r4 = cn.jiguang.ac.i.a(r7, r1)
            java.util.List[] r5 = r6.f341b
            r5 = r5[r1]
            r5.add(r4)
            int r3 = r3 + 1
            goto L1f
        L2f:
            int r1 = r1 + 1
            goto La
        L32:
            int r7 = r7.a()
            r6.f342c = r7
            return
    }

    private e(cn.jiguang.ac.d r2) {
            r1 = this;
            r1.<init>()
            r0 = 4
            java.util.List[] r0 = new java.util.List[r0]
            r1.f341b = r0
            r1.a = r2
            return
    }

    public e(byte[] r2) {
            r1 = this;
            cn.jiguang.ac.b r0 = new cn.jiguang.ac.b
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    private int a(cn.jiguang.ac.c r9, int r10, cn.jiguang.ac.a r11, int r12) {
            r8 = this;
            java.util.List[] r0 = r8.f341b
            r0 = r0[r10]
            int r0 = r0.size()
            int r1 = r9.a()
            r2 = 0
            r3 = 0
            r5 = r3
            r3 = 0
            r4 = 0
        L11:
            if (r2 >= r0) goto L43
            java.util.List[] r6 = r8.f341b
            r6 = r6[r10]
            java.lang.Object r6 = r6.get(r2)
            cn.jiguang.ac.i r6 = (cn.jiguang.ac.i) r6
            r7 = 3
            if (r10 != r7) goto L23
            int r3 = r3 + 1
            goto L40
        L23:
            if (r5 == 0) goto L30
            boolean r5 = a(r6, r5)
            if (r5 != 0) goto L30
            int r1 = r9.a()
            r4 = r2
        L30:
            r6.a(r9, r10, r11)
            int r5 = r9.a()
            if (r5 <= r12) goto L3f
            r9.a(r1)
            int r0 = r0 - r4
            int r0 = r0 + r3
            return r0
        L3f:
            r5 = r6
        L40:
            int r2 = r2 + 1
            goto L11
        L43:
            return r3
    }

    public static cn.jiguang.ac.e a(cn.jiguang.ac.i r2) {
            cn.jiguang.ac.e r0 = new cn.jiguang.ac.e
            r0.<init>()
            r1 = 0
            r0.a(r2, r1)
            return r0
    }

    private boolean a(cn.jiguang.ac.c r4, int r5) {
            r3 = this;
            r0 = 12
            r1 = 0
            if (r5 >= r0) goto L6
            return r1
        L6:
            r4.a()
            cn.jiguang.ac.d r0 = r3.a
            r0.a(r4)
            cn.jiguang.ac.a r0 = new cn.jiguang.ac.a
            r0.<init>()
            cn.jiguang.ac.d r2 = r3.a
            r2.c()
        L18:
            r2 = 4
            if (r1 >= r2) goto L28
            java.util.List[] r2 = r3.f341b
            r2 = r2[r1]
            if (r2 != 0) goto L22
            goto L25
        L22:
            r3.a(r4, r1, r0, r5)
        L25:
            int r1 = r1 + 1
            goto L18
        L28:
            r4 = 1
            return r4
    }

    private static boolean a(cn.jiguang.ac.i r2, cn.jiguang.ac.i r3) {
            int r0 = r2.f()
            int r1 = r3.f()
            if (r0 != r1) goto L24
            int r0 = r2.g()
            int r1 = r3.g()
            if (r0 != r1) goto L24
            cn.jiguang.ac.g r2 = r2.d()
            cn.jiguang.ac.g r3 = r3.d()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L24
            r2 = 1
            return r2
        L24:
            r2 = 0
            return r2
    }

    public cn.jiguang.ac.i a() {
            r3 = this;
            java.util.List[] r0 = r3.f341b
            r1 = 0
            r0 = r0[r1]
            if (r0 == 0) goto L15
            int r2 = r0.size()
            if (r2 != 0) goto Le
            goto L15
        Le:
            java.lang.Object r0 = r0.get(r1)
            cn.jiguang.ac.i r0 = (cn.jiguang.ac.i) r0
            return r0
        L15:
            r0 = 0
            return r0
    }

    public void a(cn.jiguang.ac.i r3, int r4) {
            r2 = this;
            java.util.List[] r0 = r2.f341b
            r1 = r0[r4]
            if (r1 != 0) goto Ld
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r0[r4] = r1
        Ld:
            cn.jiguang.ac.d r0 = r2.a
            r0.b(r4)
            java.util.List[] r0 = r2.f341b
            r4 = r0[r4]
            r4.add(r3)
            return
    }

    public cn.jiguang.ac.i[] a(int r2) {
            r1 = this;
            java.util.List[] r0 = r1.f341b
            r2 = r0[r2]
            if (r2 != 0) goto L9
            cn.jiguang.ac.i[] r2 = cn.jiguang.ac.e.f339d
            return r2
        L9:
            int r0 = r2.size()
            cn.jiguang.ac.i[] r0 = new cn.jiguang.ac.i[r0]
            java.lang.Object[] r2 = r2.toArray(r0)
            cn.jiguang.ac.i[] r2 = (cn.jiguang.ac.i[]) r2
            return r2
    }

    public cn.jiguang.ac.h[] b(int r9) {
            r8 = this;
            java.util.List[] r0 = r8.f341b
            r0 = r0[r9]
            if (r0 != 0) goto L9
            cn.jiguang.ac.h[] r9 = cn.jiguang.ac.e.f340e
            return r9
        L9:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            cn.jiguang.ac.i[] r9 = r8.a(r9)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r2 = 0
        L18:
            int r3 = r9.length
            if (r2 >= r3) goto L70
            r3 = r9[r2]
            cn.jiguang.ac.g r3 = r3.d()
            boolean r4 = r1.contains(r3)
            if (r4 == 0) goto L60
            int r4 = r0.size()
            int r4 = r4 + (-1)
        L2d:
            if (r4 < 0) goto L60
            java.lang.Object r5 = r0.get(r4)
            cn.jiguang.ac.h r5 = (cn.jiguang.ac.h) r5
            int r6 = r5.c()
            r7 = r9[r2]
            int r7 = r7.f()
            if (r6 != r7) goto L5d
            int r6 = r5.d()
            r7 = r9[r2]
            int r7 = r7.g()
            if (r6 != r7) goto L5d
            cn.jiguang.ac.g r6 = r5.b()
            boolean r6 = r6.equals(r3)
            if (r6 == 0) goto L5d
            r3 = r9[r2]
            r5.a(r3)
            goto L6d
        L5d:
            int r4 = r4 + (-1)
            goto L2d
        L60:
            cn.jiguang.ac.h r4 = new cn.jiguang.ac.h
            r5 = r9[r2]
            r4.<init>(r5)
            r0.add(r4)
            r1.add(r3)
        L6d:
            int r2 = r2 + 1
            goto L18
        L70:
            int r9 = r0.size()
            cn.jiguang.ac.h[] r9 = new cn.jiguang.ac.h[r9]
            java.lang.Object[] r9 = r0.toArray(r9)
            cn.jiguang.ac.h[] r9 = (cn.jiguang.ac.h[]) r9
            return r9
    }

    public byte[] c(int r2) {
            r1 = this;
            cn.jiguang.ac.c r0 = new cn.jiguang.ac.c
            r0.<init>()
            r1.a(r0, r2)
            int r2 = r0.a()
            r1.f342c = r2
            byte[] r2 = r0.b()
            return r2
    }

    public java.lang.Object clone() {
            r5 = this;
            cn.jiguang.ac.e r0 = new cn.jiguang.ac.e
            r0.<init>()
            r1 = 0
        L6:
            java.util.List[] r2 = r5.f341b
            int r3 = r2.length
            if (r1 >= r3) goto L1f
            r2 = r2[r1]
            if (r2 == 0) goto L1c
            java.util.List[] r2 = r0.f341b
            java.util.LinkedList r3 = new java.util.LinkedList
            java.util.List[] r4 = r5.f341b
            r4 = r4[r1]
            r3.<init>(r4)
            r2[r1] = r3
        L1c:
            int r1 = r1 + 1
            goto L6
        L1f:
            cn.jiguang.ac.d r1 = r5.a
            java.lang.Object r1 = r1.clone()
            cn.jiguang.ac.d r1 = (cn.jiguang.ac.d) r1
            r0.a = r1
            int r1 = r5.f342c
            r0.f342c = r1
            return r0
    }
}
