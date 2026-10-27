package cn.jiguang.ac;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class l {
    private long a;

    /* renamed from: b, reason: collision with root package name */
    private long f368b;

    /* renamed from: c, reason: collision with root package name */
    private final java.util.Map<java.lang.String, android.util.Pair<java.util.LinkedHashSet<cn.jiguang.ab.g>, java.lang.Long>> f369c;

    /* renamed from: cn.jiguang.ac.l$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    static class a implements java.util.concurrent.Callable<java.util.LinkedHashSet<cn.jiguang.ab.g>> {
        private java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        private cn.jiguang.ac.l f370b;

        a(java.lang.String r1, cn.jiguang.ac.l r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.f370b = r2
                return
        }

        public java.util.LinkedHashSet<cn.jiguang.ab.g> a() {
                r6 = this;
                java.lang.String r0 = r6.a
                java.util.LinkedHashSet r0 = cn.jiguang.ac.l.a(r0)
                if (r0 == 0) goto L22
                int r1 = r0.size()
                if (r1 <= 0) goto L22
                cn.jiguang.ac.l r1 = r6.f370b
                java.lang.String r2 = r6.a
                android.util.Pair r3 = new android.util.Pair
                long r4 = java.lang.System.currentTimeMillis()
                java.lang.Long r4 = java.lang.Long.valueOf(r4)
                r3.<init>(r0, r4)
                cn.jiguang.ac.l.a(r1, r2, r3)
            L22:
                return r0
        }

        @Override // java.util.concurrent.Callable
        public /* synthetic */ java.util.LinkedHashSet<cn.jiguang.ab.g> call() {
                r1 = this;
                java.util.LinkedHashSet r0 = r1.a()
                return r0
        }
    }

    private static final class b {
        private static final cn.jiguang.ac.l a = null;

        static {
                cn.jiguang.ac.l r0 = new cn.jiguang.ac.l
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.ac.l.b.a = r0
                return
        }

        public b() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.ac.l a() {
                cn.jiguang.ac.l r0 = cn.jiguang.ac.l.b.a
                return r0
        }
    }

    private l() {
            r2 = this;
            r2.<init>()
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            r2.a = r0
            r0 = 1800000(0x1b7740, double:8.89318E-318)
            r2.f368b = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.f369c = r0
            return
    }

    /* synthetic */ l(cn.jiguang.ac.l.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    private android.util.Pair<java.util.LinkedHashSet<cn.jiguang.ab.g>, java.lang.Boolean> a(java.lang.String r14, long r15, long r17) {
            r13 = this;
            java.util.Map<java.lang.String, android.util.Pair<java.util.LinkedHashSet<cn.jiguang.ab.g>, java.lang.Long>> r0 = r13.f369c
            java.lang.Object r0 = r0.get(r14)
            android.util.Pair r0 = (android.util.Pair) r0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1b
            java.lang.Object r3 = r0.first
            if (r3 == 0) goto L1b
            java.util.LinkedHashSet r3 = (java.util.LinkedHashSet) r3
            int r3 = r3.size()
            if (r3 != 0) goto L19
            goto L1b
        L19:
            r3 = 0
            goto L1c
        L1b:
            r3 = 1
        L1c:
            r4 = 0
            if (r3 == 0) goto L2e
            cn.jiguang.e.a r5 = cn.jiguang.e.a.e(r14)
            java.lang.Object r5 = cn.jiguang.e.b.a(r4, r5)
        L27:
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            goto L31
        L2e:
            java.lang.Object r5 = r0.second
            goto L27
        L31:
            long r7 = java.lang.System.currentTimeMillis()
            long r9 = r5 + r15
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 <= 0) goto L3c
            return r4
        L3c:
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            if (r3 == 0) goto L84
            cn.jiguang.e.a r0 = cn.jiguang.e.a.d(r14)
            java.lang.Object r0 = cn.jiguang.e.b.a(r4, r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L89
            java.lang.String r3 = ","
            java.lang.String[] r0 = r0.split(r3)
            int r3 = r0.length
            r10 = 0
        L5b:
            if (r10 >= r3) goto L71
            r11 = r0[r10]
            cn.jiguang.ab.g r11 = cn.jiguang.ab.g.a(r11)
            if (r11 == 0) goto L6e
            boolean r12 = r11.a()
            if (r12 == 0) goto L6e
            r9.add(r11)
        L6e:
            int r10 = r10 + 1
            goto L5b
        L71:
            java.util.Map<java.lang.String, android.util.Pair<java.util.LinkedHashSet<cn.jiguang.ab.g>, java.lang.Long>> r0 = r13.f369c
            android.util.Pair r3 = new android.util.Pair
            long r10 = java.lang.System.currentTimeMillis()
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r3.<init>(r9, r10)
            r0.put(r14, r3)
            goto L89
        L84:
            java.lang.Object r14 = r0.first
            r9 = r14
            java.util.LinkedHashSet r9 = (java.util.LinkedHashSet) r9
        L89:
            boolean r14 = r9.isEmpty()
            if (r14 != 0) goto La1
            android.util.Pair r14 = new android.util.Pair
            long r5 = r5 + r17
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 <= 0) goto L98
            goto L99
        L98:
            r1 = 0
        L99:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r14.<init>(r9, r0)
            return r14
        La1:
            return r4
    }

    public static cn.jiguang.ac.l a() {
            cn.jiguang.ac.l r0 = cn.jiguang.ac.l.b.a()
            return r0
    }

    public static java.util.LinkedHashSet<cn.jiguang.ab.g> a(java.lang.String r15) {
            java.lang.String r1 = "SRVLoader"
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            r2 = 0
            if (r0 == 0) goto La
            return r2
        La:
            byte[] r3 = b(r15)     // Catch: java.io.IOException -> L148
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "srv host:"
            r0.append(r4)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            cn.jiguang.w.f.c(r1, r0)
            cn.jiguang.al.d r0 = cn.jiguang.al.d.a()
            java.lang.String r15 = r0.a(r15)
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            cn.jiguang.ac.k r0 = cn.jiguang.ac.k.b()     // Catch: java.lang.Throwable -> L5c
            java.lang.String[] r0 = r0.a()     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L147
            int r5 = r0.length     // Catch: java.lang.Throwable -> L5c
            if (r5 != 0) goto L3e
            goto L147
        L3e:
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L5c
            r5.<init>()     // Catch: java.lang.Throwable -> L5c
            cn.jiguang.ae.b r6 = cn.jiguang.ae.b.a()     // Catch: java.lang.Throwable -> L5c
            int r12 = r0.length     // Catch: java.lang.Throwable -> L5c
            r13 = 0
            r14 = 0
        L4a:
            if (r14 >= r12) goto L62
            r8 = r0[r14]     // Catch: java.lang.Throwable -> L5c
            r9 = 3000(0xbb8, double:1.482E-320)
            r11 = 0
            r7 = 0
            java.net.InetAddress r7 = r6.a(r7, r8, r9, r11)     // Catch: java.lang.Throwable -> L5c
            if (r7 == 0) goto L5f
            r5.add(r7)     // Catch: java.lang.Throwable -> L5c
            goto L5f
        L5c:
            r0 = move-exception
            goto L12b
        L5f:
            int r14 = r14 + 1
            goto L4a
        L62:
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L5c
        L66:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L123
            java.lang.Object r0 = r5.next()     // Catch: java.lang.Throwable -> L5c
            java.net.InetAddress r0 = (java.net.InetAddress) r0     // Catch: java.lang.Throwable -> L5c
            java.net.InetSocketAddress r6 = new java.net.InetSocketAddress     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L10c
            r7 = 53
            r6.<init>(r0, r7)     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L10c
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L10c
            r9 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 + r9
            byte[] r0 = cn.jiguang.ac.o.a(r2, r6, r3, r7)     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L10c
            cn.jiguang.ac.e r6 = new cn.jiguang.ac.e     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L10c
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L10c
            cn.jiguang.ac.i r0 = r6.a()     // Catch: java.lang.Throwable -> L5c
            if (r0 != 0) goto L91
            goto L123
        L91:
            r7 = 1
            cn.jiguang.ac.h[] r6 = r6.b(r7)     // Catch: java.lang.Throwable -> L5c
            int r8 = r6.length     // Catch: java.lang.Throwable -> L5c
            r9 = 0
        L98:
            if (r9 >= r8) goto L66
            r10 = r6[r9]     // Catch: java.lang.Throwable -> L5c
            int r11 = r10.d()     // Catch: java.lang.Throwable -> L5c
            int r12 = r0.g()     // Catch: java.lang.Throwable -> L5c
            if (r11 != r12) goto L109
            int r11 = r10.c()     // Catch: java.lang.Throwable -> L5c
            int r12 = r0.e()     // Catch: java.lang.Throwable -> L5c
            if (r11 != r12) goto L109
            cn.jiguang.ac.g r11 = r10.b()     // Catch: java.lang.Throwable -> L5c
            cn.jiguang.ac.g r12 = r0.d()     // Catch: java.lang.Throwable -> L5c
            boolean r11 = r11.equals(r12)     // Catch: java.lang.Throwable -> L5c
            if (r11 != 0) goto Lbf
            goto L109
        Lbf:
            java.util.Iterator r10 = r10.a()     // Catch: java.lang.Throwable -> L5c
        Lc3:
            boolean r11 = r10.hasNext()     // Catch: java.lang.Throwable -> L5c
            if (r11 == 0) goto L109
            java.lang.Object r11 = r10.next()     // Catch: java.lang.Throwable -> L5c
            cn.jiguang.ac.m r11 = (cn.jiguang.ac.m) r11     // Catch: java.lang.Throwable -> L5c
            int r12 = r11.j()     // Catch: java.lang.Throwable -> L5c
            if (r12 > 0) goto Ld6
            goto Lc3
        Ld6:
            cn.jiguang.ac.g r12 = r11.k()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L5c
            boolean r14 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Throwable -> L5c
            if (r14 == 0) goto Le5
            goto Lc3
        Le5:
            java.lang.String r14 = "."
            boolean r14 = r12.endsWith(r14)     // Catch: java.lang.Throwable -> L5c
            if (r14 == 0) goto Lf6
            int r14 = r12.length()     // Catch: java.lang.Throwable -> L5c
            int r14 = r14 - r7
            java.lang.String r12 = r12.substring(r13, r14)     // Catch: java.lang.Throwable -> L5c
        Lf6:
            cn.jiguang.ab.g r14 = new cn.jiguang.ab.g     // Catch: java.lang.Throwable -> L5c
            int r11 = r11.j()     // Catch: java.lang.Throwable -> L5c
            r14.<init>(r12, r11)     // Catch: java.lang.Throwable -> L5c
            boolean r11 = r14.a()     // Catch: java.lang.Throwable -> L5c
            if (r11 == 0) goto Lc3
            r4.add(r14)     // Catch: java.lang.Throwable -> L5c
            goto Lc3
        L109:
            int r9 = r9 + 1
            goto L98
        L10c:
            r0 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            r6.<init>()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r7 = "tcp send to  err:"
            r6.append(r7)     // Catch: java.lang.Throwable -> L5c
            r6.append(r0)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L5c
            cn.jiguang.w.f.i(r1, r0)     // Catch: java.lang.Throwable -> L5c
            goto L66
        L123:
            cn.jiguang.al.d r0 = cn.jiguang.al.d.a()     // Catch: java.lang.Throwable -> L5c
            r0.a(r15, r13)     // Catch: java.lang.Throwable -> L5c
            goto L147
        L12b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Get default ports error with Exception:"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            cn.jiguang.w.f.j(r1, r0)
            cn.jiguang.al.d r0 = cn.jiguang.al.d.a()
            r1 = 2
            r0.a(r15, r1)
        L147:
            return r4
        L148:
            r0 = move-exception
            r15 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "can't srv, create query:"
            r0.append(r3)
            r0.append(r15)
            java.lang.String r15 = r0.toString()
            cn.jiguang.w.f.i(r1, r15)
            return r2
    }

    static /* synthetic */ void a(cn.jiguang.ac.l r0, java.lang.String r1, android.util.Pair r2) {
            r0.a(r1, r2)
            return
    }

    private void a(java.lang.String r4, android.util.Pair<java.util.LinkedHashSet<cn.jiguang.ab.g>, java.lang.Long> r5) {
            r3 = this;
            java.lang.Object r0 = r5.first
            if (r0 == 0) goto L68
            java.util.LinkedHashSet r0 = (java.util.LinkedHashSet) r0
            int r0 = r0.size()
            if (r0 <= 0) goto L68
            java.lang.Object r0 = r5.second
            if (r0 == 0) goto L68
            java.util.Map<java.lang.String, android.util.Pair<java.util.LinkedHashSet<cn.jiguang.ab.g>, java.lang.Long>> r0 = r3.f369c
            r0.put(r4, r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r5.first
            java.util.LinkedHashSet r1 = (java.util.LinkedHashSet) r1
            java.util.Iterator r1 = r1.iterator()
        L22:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3b
            java.lang.Object r2 = r1.next()
            cn.jiguang.ab.g r2 = (cn.jiguang.ab.g) r2
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.String r2 = ","
            r0.append(r2)
            goto L22
        L3b:
            int r1 = r0.length()
            r2 = 1
            int r1 = r1 - r2
            r0.deleteCharAt(r1)
            cn.jiguang.e.a r1 = cn.jiguang.e.a.d(r4)
            java.lang.String r0 = r0.toString()
            cn.jiguang.e.a r0 = r1.a(r0)
            cn.jiguang.e.a r4 = cn.jiguang.e.a.e(r4)
            java.lang.Object r5 = r5.second
            java.lang.Long r5 = (java.lang.Long) r5
            cn.jiguang.e.a r4 = r4.a(r5)
            r5 = 2
            cn.jiguang.e.a[] r5 = new cn.jiguang.e.a[r5]
            r1 = 0
            r5[r1] = r0
            r5[r2] = r4
            r4 = 0
            cn.jiguang.e.b.a(r4, r5)
        L68:
            return
    }

    private static byte[] b(java.lang.String r2) {
            cn.jiguang.ac.g r2 = cn.jiguang.ac.g.a(r2)
            cn.jiguang.ac.g r0 = cn.jiguang.ac.g.a
            cn.jiguang.ac.g r2 = cn.jiguang.ac.g.a(r2, r0)
            r0 = 33
            r1 = 1
            cn.jiguang.ac.i r2 = cn.jiguang.ac.i.a(r2, r0, r1)
            cn.jiguang.ac.e r2 = cn.jiguang.ac.e.a(r2)
            r0 = 65535(0xffff, float:9.1834E-41)
            byte[] r2 = r2.c(r0)
            return r2
    }

    public java.util.LinkedHashSet<cn.jiguang.ab.g> a(java.lang.String r9, long r10) {
            r8 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            long r4 = r8.a
            long r6 = r8.f368b
            r2 = r8
            r3 = r9
            android.util.Pair r9 = r2.a(r3, r4, r6)
            if (r9 == 0) goto L33
            java.lang.Object r0 = r9.first
            if (r0 == 0) goto L25
            java.util.LinkedHashSet r0 = (java.util.LinkedHashSet) r0
            int r0 = r0.size()
            if (r0 <= 0) goto L25
            java.lang.Object r0 = r9.first
            java.util.LinkedHashSet r0 = (java.util.LinkedHashSet) r0
            goto L26
        L25:
            r0 = r1
        L26:
            java.lang.Object r9 = r9.second
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L31
            return r0
        L31:
            r9 = r0
            goto L34
        L33:
            r9 = r1
        L34:
            java.util.concurrent.FutureTask r0 = new java.util.concurrent.FutureTask
            cn.jiguang.ac.l$a r4 = new cn.jiguang.ac.l$a
            r4.<init>(r3, r8)
            r0.<init>(r4)
            cn.jiguang.z.b.d(r0)
            r3 = 0
            java.lang.String r5 = "use cache="
            java.lang.String r6 = "SRVLoader"
            int r7 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r7 != 0) goto L5e
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
        L50:
            r10.append(r5)
            r10.append(r9)
            java.lang.String r10 = r10.toString()
            cn.jiguang.w.f.c(r6, r10)
            return r9
        L5e:
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L68
            java.lang.Object r10 = r0.get(r10, r3)     // Catch: java.lang.Throwable -> L68
            java.util.LinkedHashSet r10 = (java.util.LinkedHashSet) r10     // Catch: java.lang.Throwable -> L68
            r1 = r10
            goto L7e
        L68:
            r0 = move-exception
            r10 = r0
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "run futureTask e:"
            r11.append(r0)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            cn.jiguang.w.f.i(r6, r10)
        L7e:
            if (r1 == 0) goto L9b
            int r10 = r1.size()
            if (r10 <= 0) goto L9b
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "use resolved result="
            r9.append(r10)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            cn.jiguang.w.f.c(r6, r9)
            return r1
        L9b:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            goto L50
    }
}
