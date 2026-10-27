package cn.jiguang.commons.L;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class v {
    private static final byte[] a = null;

    /* renamed from: c, reason: collision with root package name */
    private static final java.util.regex.Pattern f928c = null;

    static {
            r0 = 2
            byte[] r0 = new byte[r0]
            r0 = {x0012: FILL_ARRAY_DATA , data: [120, 101} // fill-array
            cn.jiguang.commons.L.v.a = r0
            java.lang.String r0 = "^zygote[0-9]*$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            cn.jiguang.commons.L.v.f928c = r0
            return
    }

    public v() {
            r1 = this;
            r1.<init>()
            return
    }

    private static int a(java.util.LinkedList r2, java.lang.String r3, int r4) {
            int r0 = r2.indexOf(r3)
            r1 = -1
            if (r0 != r1) goto L11
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r3 = r3.toLowerCase(r0)
            int r0 = r2.indexOf(r3)
        L11:
            if (r0 != r1) goto L14
            return r4
        L14:
            return r0
    }

    private static cn.jiguang.commons.c.l a(java.lang.String r4, java.util.Map r5) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r0 = "\\s+"
            java.lang.String[] r4 = r4.split(r0)
            int r0 = r4.length
            r2 = 3
            if (r0 >= r2) goto L13
            return r1
        L13:
            cn.jiguang.commons.c.l r2 = new cn.jiguang.commons.c.l     // Catch: java.lang.Throwable -> L75
            r2.<init>()     // Catch: java.lang.Throwable -> L75
            if (r5 == 0) goto L60
            boolean r3 = r5.isEmpty()     // Catch: java.lang.Throwable -> L75
            if (r3 == 0) goto L21
            goto L60
        L21:
            java.lang.String r0 = "USER"
            java.lang.Object r0 = r5.get(r0)     // Catch: java.lang.Throwable -> L75
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L75
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L75
            r0 = r4[r0]     // Catch: java.lang.Throwable -> L75
            r2.a = r0     // Catch: java.lang.Throwable -> L75
            java.lang.String r0 = "PID"
            java.lang.Object r0 = r5.get(r0)     // Catch: java.lang.Throwable -> L75
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L75
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L75
            r0 = r4[r0]     // Catch: java.lang.Throwable -> L75
            r2.f1058c = r0     // Catch: java.lang.Throwable -> L75
            java.lang.String r0 = "PPID"
            java.lang.Object r0 = r5.get(r0)     // Catch: java.lang.Throwable -> L75
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L75
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L75
            r0 = r4[r0]     // Catch: java.lang.Throwable -> L75
            r2.f1059d = r0     // Catch: java.lang.Throwable -> L75
            java.lang.String r0 = "NAME"
            java.lang.Object r5 = r5.get(r0)     // Catch: java.lang.Throwable -> L75
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> L75
            int r5 = r5.intValue()     // Catch: java.lang.Throwable -> L75
            r4 = r4[r5]     // Catch: java.lang.Throwable -> L75
            goto L72
        L60:
            r5 = 0
            r5 = r4[r5]     // Catch: java.lang.Throwable -> L75
            r2.a = r5     // Catch: java.lang.Throwable -> L75
            r5 = 1
            r3 = r4[r5]     // Catch: java.lang.Throwable -> L75
            r2.f1058c = r3     // Catch: java.lang.Throwable -> L75
            r3 = 2
            r3 = r4[r3]     // Catch: java.lang.Throwable -> L75
            r2.f1059d = r3     // Catch: java.lang.Throwable -> L75
            int r0 = r0 - r5
            r4 = r4[r0]     // Catch: java.lang.Throwable -> L75
        L72:
            r2.f1060e = r4     // Catch: java.lang.Throwable -> L75
            return r2
        L75:
            return r1
    }

    public static java.util.List a(int r9) {
            r0 = 0
            byte[] r1 = cn.jiguang.commons.L.v.a     // Catch: java.lang.Throwable -> L7d
            java.lang.String r1 = cn.jiguang.commons.L.n.c(r1)     // Catch: java.lang.Throwable -> L7d
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L7d
            r2 = 1
            java.util.List r1 = cn.jiguang.commons.L.aa.a(r1, r2)     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L7d
            boolean r3 = r1.isEmpty()     // Catch: java.lang.Throwable -> L7d
            if (r3 == 0) goto L19
            goto L7d
        L19:
            java.util.HashSet r3 = new java.util.HashSet     // Catch: java.lang.Throwable -> L7d
            r3.<init>()     // Catch: java.lang.Throwable -> L7d
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L7d
            r4.<init>()     // Catch: java.lang.Throwable -> L7d
            r5 = 0
            java.lang.Object r5 = r1.remove(r5)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L7d
            java.util.Map r5 = d(r5)     // Catch: java.lang.Throwable -> L7d
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L7d
        L32:
            boolean r6 = r1.hasNext()     // Catch: java.lang.Throwable -> L7d
            if (r6 == 0) goto L6f
            java.lang.Object r6 = r1.next()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L7d
            cn.jiguang.commons.c.l r6 = a(r6, r5)     // Catch: java.lang.Throwable -> L7d
            if (r6 == 0) goto L32
            r7 = 3
            if (r9 == r7) goto L5d
            java.lang.String r7 = r6.f1059d     // Catch: java.lang.Throwable -> L7d
            boolean r7 = a(r7)     // Catch: java.lang.Throwable -> L7d
            if (r7 == 0) goto L5d
            java.lang.String r7 = r6.f1060e     // Catch: java.lang.Throwable -> L7d
            boolean r7 = c(r7)     // Catch: java.lang.Throwable -> L7d
            if (r7 == 0) goto L32
            java.lang.String r6 = r6.f1058c     // Catch: java.lang.Throwable -> L7d
            r3.add(r6)     // Catch: java.lang.Throwable -> L7d
            goto L32
        L5d:
            java.lang.String r7 = "ps"
            java.lang.String r8 = r6.f1060e     // Catch: java.lang.Throwable -> L7d
            boolean r7 = r7.equals(r8)     // Catch: java.lang.Throwable -> L7d
            if (r7 == 0) goto L68
            goto L32
        L68:
            a(r6)     // Catch: java.lang.Throwable -> L7d
            r4.add(r6)     // Catch: java.lang.Throwable -> L7d
            goto L32
        L6f:
            if (r9 != r2) goto L7c
            boolean r9 = r3.isEmpty()     // Catch: java.lang.Throwable -> L7d
            if (r9 != 0) goto L7c
            java.util.List r9 = a(r4, r3)     // Catch: java.lang.Throwable -> L7d
            return r9
        L7c:
            return r4
        L7d:
            return r0
    }

    private static java.util.List a(java.util.List r6, java.util.HashSet r7) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = 0
        L7:
            if (r2 != 0) goto L31
            java.util.Iterator r2 = r6.iterator()
            r3 = 1
        Le:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L2f
            java.lang.Object r4 = r2.next()
            cn.jiguang.commons.c.l r4 = (cn.jiguang.commons.c.l) r4
            java.lang.String r5 = r4.f1059d
            boolean r5 = r7.contains(r5)
            if (r5 == 0) goto Le
            r0.add(r4)
            java.lang.String r3 = r4.f1058c
            r7.add(r3)
            r2.remove()
            r3 = 0
            goto Le
        L2f:
            r2 = r3
            goto L7
        L31:
            return r0
    }

    private static void a(cn.jiguang.commons.c.l r8) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 >= r1) goto Ld8
            if (r8 != 0) goto La
            goto Ld8
        La:
            java.lang.String r0 = r8.f1058c     // Catch: java.lang.Throwable -> Ld8
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> Ld8
            cn.jiguang.commons.bean.AndroidAppProcess r1 = new cn.jiguang.commons.bean.AndroidAppProcess     // Catch: java.lang.Throwable -> Ld8
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Ld8
            boolean r0 = r1.f965d     // Catch: java.lang.Throwable -> Ld8
            r8.f1061f = r0     // Catch: java.lang.Throwable -> Ld8
            cn.jiguang.commons.bean.Stat r0 = r1.f()     // Catch: java.lang.Throwable -> Ld8
            char r0 = r0.j()     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> Ld8
            r8.f1062g = r0     // Catch: java.lang.Throwable -> Ld8
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Ld8
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> Ld8
            long r2 = r2 - r4
            long r2 = java.lang.Math.abs(r2)     // Catch: java.lang.Throwable -> Ld8
            cn.jiguang.commons.bean.Stat r0 = r1.f()     // Catch: java.lang.Throwable -> Ld8
            long r4 = r0.i()     // Catch: java.lang.Throwable -> Ld8
            r6 = 10
            long r4 = r4 * r6
            long r2 = r2 + r4
            r8.f1063h = r2     // Catch: java.lang.Throwable -> Ld8
            cn.jiguang.commons.bean.Stat r0 = r1.f()     // Catch: java.lang.Throwable -> Ld8
            long r2 = r0.g()     // Catch: java.lang.Throwable -> Ld8
            r8.f1064i = r2     // Catch: java.lang.Throwable -> Ld8
            cn.jiguang.commons.bean.Stat r0 = r1.f()     // Catch: java.lang.Throwable -> Ld8
            long r2 = r0.e()     // Catch: java.lang.Throwable -> Ld8
            r8.f1065j = r2     // Catch: java.lang.Throwable -> Ld8
            cn.jiguang.commons.bean.Stat r0 = r1.f()     // Catch: java.lang.Throwable -> Ld8
            long r2 = r0.n()     // Catch: java.lang.Throwable -> Ld8
            r8.f1066k = r2     // Catch: java.lang.Throwable -> Ld8
            cn.jiguang.commons.bean.Stat r0 = r1.f()     // Catch: java.lang.Throwable -> Ld8
            int r0 = r0.l()     // Catch: java.lang.Throwable -> Ld8
            r8.l = r0     // Catch: java.lang.Throwable -> Ld8
            cn.jiguang.commons.bean.Cgroup r0 = r1.a()     // Catch: java.lang.Throwable -> L93
            java.lang.String r2 = "cpuacct"
            cn.jiguang.commons.bean.ControlGroup r0 = r0.c(r2)     // Catch: java.lang.Throwable -> L93
            cn.jiguang.commons.bean.Cgroup r2 = r1.a()     // Catch: java.lang.Throwable -> L93
            java.lang.String r3 = "cpu"
            cn.jiguang.commons.bean.ControlGroup r2 = r2.c(r3)     // Catch: java.lang.Throwable -> L93
            java.lang.String r3 = ""
            if (r0 == 0) goto L88
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L93
            goto L89
        L88:
            r0 = r3
        L89:
            r8.m = r0     // Catch: java.lang.Throwable -> L93
            if (r2 == 0) goto L91
            java.lang.String r3 = r2.toString()     // Catch: java.lang.Throwable -> L93
        L91:
            r8.n = r3     // Catch: java.lang.Throwable -> L93
        L93:
            cn.jiguang.commons.bean.Stat r0 = r1.f()
            long r2 = r0.m()
            r8.o = r2
            cn.jiguang.commons.bean.Stat r0 = r1.f()
            long r2 = r0.k()
            r8.p = r2
            cn.jiguang.commons.bean.Stat r0 = r1.f()
            long r2 = r0.c()
            r8.q = r2
            cn.jiguang.commons.bean.Stat r0 = r1.f()
            long r2 = r0.a()
            r8.r = r2
            cn.jiguang.commons.bean.Stat r0 = r1.f()
            int r0 = r0.h()
            long r2 = (long) r0
            r8.s = r2
            int r0 = r1.d()
            r8.t = r0
            int r0 = r1.c()
            r8.u = r0
            int r0 = r1.e()
            r8.v = r0
        Ld8:
            return
    }

    private static boolean a(java.lang.String r1) {
            java.lang.String r0 = "0"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1b
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1b
            java.lang.String r0 = "2"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L19
            goto L1b
        L19:
            r1 = 0
            return r1
        L1b:
            r1 = 1
            return r1
    }

    private static boolean c(java.lang.String r1) {
            java.util.regex.Pattern r0 = cn.jiguang.commons.L.v.f928c
            java.util.regex.Matcher r1 = r0.matcher(r1)
            boolean r1 = r1.matches()
            return r1
    }

    private static java.util.Map d(java.lang.String r12) {
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.lang.String r2 = "\\s+"
            java.lang.String[] r12 = r12.split(r2)
            java.util.Collections.addAll(r0, r12)
            int r12 = r0.size()
            r2 = 1
            int r12 = r12 - r2
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r4 = 0
            java.lang.String r5 = "USER"
            int r4 = a(r0, r5, r4)
            java.lang.String r6 = "PID"
            int r7 = a(r0, r6, r2)
            java.lang.String r8 = "PPID"
            r9 = 2
            int r10 = a(r0, r8, r9)
            java.lang.String r11 = "NAME"
            int r0 = a(r0, r11, r12)
            if (r4 != 0) goto L44
            if (r7 != r2) goto L44
            if (r10 != r9) goto L44
            if (r0 != r12) goto L44
            return r1
        L44:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r4)
            r3.put(r5, r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
            r3.put(r6, r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            r3.put(r8, r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            r3.put(r11, r12)
            return r3
    }
}
