package cn.jiguang.ab;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class e {
    private static final java.util.Comparator<cn.jiguang.ab.d> a = null;


    static {
            cn.jiguang.ab.e$1 r0 = new cn.jiguang.ab.e$1
            r0.<init>()
            cn.jiguang.ab.e.a = r0
            return
    }

    public e() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.util.LinkedHashSet<cn.jiguang.ab.g> a(android.content.Context r9, java.util.LinkedHashSet<cn.jiguang.ab.g> r10, long r11) {
            r0 = 0
            if (r10 == 0) goto L8
            int r1 = r10.size()
            goto L9
        L8:
            r1 = 0
        L9:
            if (r1 != 0) goto L11
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            return r9
        L11:
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            java.util.Iterator r10 = r10.iterator()
            r2 = 1
            r3 = 1
        L1c:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L7d
            java.lang.Object r4 = r10.next()
            cn.jiguang.ab.g r4 = (cn.jiguang.ab.g) r4
            boolean r5 = r4.a()
            if (r5 != 0) goto L2f
            goto L1c
        L2f:
            java.lang.String r5 = r4.toString()
            cn.jiguang.e.a r5 = cn.jiguang.e.a.f(r5)
            java.lang.String r6 = r4.toString()
            cn.jiguang.e.a r6 = cn.jiguang.e.a.g(r6)
            java.lang.Object r7 = cn.jiguang.e.b.a(r9, r6)
            java.lang.String r7 = (java.lang.String) r7
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 == 0) goto L52
            java.lang.Object r5 = cn.jiguang.e.b.a(r9, r5)
            r7 = r5
            java.lang.String r7 = (java.lang.String) r7
        L52:
            cn.jiguang.ab.d r5 = cn.jiguang.ab.d.a(r7)
            if (r5 != 0) goto L5d
            cn.jiguang.ab.d r5 = new cn.jiguang.ab.d
            r5.<init>(r4)
        L5d:
            if (r3 == 0) goto L62
            r5.f267e = r2
            r3 = 0
        L62:
            r7 = 0
            int r4 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r4 <= 0) goto L79
            r5.f265c = r11
            java.lang.String r4 = r5.a()
            cn.jiguang.e.a r4 = r6.a(r4)
            cn.jiguang.e.a[] r6 = new cn.jiguang.e.a[r2]
            r6[r0] = r4
            cn.jiguang.e.b.a(r9, r6)
        L79:
            r1.add(r5)
            goto L1c
        L7d:
            java.util.Comparator<cn.jiguang.ab.d> r10 = cn.jiguang.ab.e.a
            java.util.LinkedList r10 = a(r1, r10)
            java.util.LinkedHashSet r9 = a(r9, r10)
            return r9
    }

    public static java.util.LinkedHashSet<cn.jiguang.ab.g> a(android.content.Context r7, java.util.LinkedList<java.util.LinkedList<cn.jiguang.ab.d>> r8) {
            boolean r7 = cn.jiguang.av.b.e(r7)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r8 = r8.iterator()
        L17:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L47
            java.lang.Object r3 = r8.next()
            java.util.LinkedList r3 = (java.util.LinkedList) r3
            java.util.Iterator r3 = r3.iterator()
        L27:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L17
            java.lang.Object r4 = r3.next()
            cn.jiguang.ab.d r4 = (cn.jiguang.ab.d) r4
            cn.jiguang.ab.g r4 = r4.a
            java.lang.String r5 = r4.a
            java.lang.String r6 = ":"
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L43
            r1.add(r4)
            goto L27
        L43:
            r2.add(r4)
            goto L27
        L47:
            r0.clear()
            if (r7 == 0) goto L53
            r0.addAll(r1)
            r0.addAll(r2)
            return r0
        L53:
            r0.addAll(r2)
            r0.addAll(r1)
            return r0
    }

    private static <T> java.util.LinkedList<java.util.LinkedList<T>> a(java.util.Collection<T> r8, java.util.Comparator<T> r9) {
            r0 = 0
            if (r8 == 0) goto L8
            int r1 = r8.size()
            goto L9
        L8:
            r1 = 0
        L9:
            if (r1 != 0) goto L11
            java.util.LinkedList r8 = new java.util.LinkedList
            r8.<init>()
            return r8
        L11:
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            r3 = 1
            if (r1 != r3) goto L22
            java.util.LinkedList r9 = new java.util.LinkedList
            r9.<init>(r8)
            r2.add(r9)
            return r2
        L22:
            java.security.SecureRandom r1 = new java.security.SecureRandom
            r1.<init>()
            java.util.Iterator r8 = r8.iterator()
        L2b:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L76
            java.lang.Object r4 = r8.next()
            r5 = 0
        L36:
            int r6 = r2.size()
            if (r5 >= r6) goto L6a
            java.lang.Object r6 = r2.get(r5)
            java.util.LinkedList r6 = (java.util.LinkedList) r6
            java.lang.Object r7 = r6.get(r0)
            int r7 = r9.compare(r4, r7)
            if (r7 != 0) goto L59
            int r5 = r6.size()
            int r5 = r5 + r3
            int r5 = r1.nextInt(r5)
            r6.add(r5, r4)
            goto L2b
        L59:
            if (r7 >= 0) goto L67
            java.util.LinkedList r6 = new java.util.LinkedList
            r6.<init>()
            r6.add(r4)
            r2.add(r5, r6)
            goto L2b
        L67:
            int r5 = r5 + 1
            goto L36
        L6a:
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            r5.add(r4)
            r2.add(r5)
            goto L2b
        L76:
            return r2
    }

    public static void a(android.content.Context r4, cn.jiguang.ab.g r5, int r6, long r7) {
            if (r5 == 0) goto L45
            java.lang.String r0 = r5.toString()
            cn.jiguang.e.a r0 = cn.jiguang.e.a.f(r0)
            java.lang.String r1 = r5.toString()
            cn.jiguang.e.a r1 = cn.jiguang.e.a.g(r1)
            java.lang.Object r2 = cn.jiguang.e.b.a(r4, r1)
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L25
            java.lang.Object r0 = cn.jiguang.e.b.a(r4, r0)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
        L25:
            cn.jiguang.ab.d r0 = cn.jiguang.ab.d.a(r2)
            if (r0 != 0) goto L30
            cn.jiguang.ab.d r0 = new cn.jiguang.ab.d
            r0.<init>(r5)
        L30:
            r0.f266d = r7
            r0.f264b = r6
            java.lang.String r5 = r0.a()
            cn.jiguang.e.a r5 = r1.a(r5)
            r6 = 1
            cn.jiguang.e.a[] r6 = new cn.jiguang.e.a[r6]
            r7 = 0
            r6[r7] = r5
            cn.jiguang.e.b.a(r4, r6)
        L45:
            return
    }
}
