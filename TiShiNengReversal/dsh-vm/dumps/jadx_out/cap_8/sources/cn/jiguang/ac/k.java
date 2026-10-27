package cn.jiguang.ac;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class k {

    /* renamed from: d, reason: collision with root package name */
    private static cn.jiguang.ac.k f365d;
    private java.lang.String[] a;

    /* renamed from: b, reason: collision with root package name */
    private cn.jiguang.ac.g[] f366b;

    /* renamed from: c, reason: collision with root package name */
    private int f367c;

    static {
            c()
            return
    }

    public k() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.a = r0
            r3.f366b = r0
            r0 = -1
            r3.f367c = r0
            boolean r1 = r3.d()
            if (r1 == 0) goto L12
            goto L22
        L12:
            boolean r1 = r3.e()
            if (r1 == 0) goto L19
            goto L22
        L19:
            java.lang.String[] r1 = r3.a
            if (r1 == 0) goto L23
            cn.jiguang.ac.g[] r1 = r3.f366b
            if (r1 != 0) goto L22
            goto L23
        L22:
            return
        L23:
            java.lang.String r1 = "java.vendor"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            java.lang.String r2 = "Android"
            int r1 = r1.indexOf(r2)
            if (r1 == r0) goto L35
            r3.g()
            return
        L35:
            r3.f()
            return
    }

    private void a(int r2) {
            r1 = this;
            int r0 = r1.f367c
            if (r0 >= 0) goto L8
            if (r2 <= 0) goto L8
            r1.f367c = r2
        L8:
            return
    }

    private void a(java.lang.String r2, java.util.List r3) {
            r1 = this;
            boolean r0 = r3.contains(r2)
            if (r0 == 0) goto L7
            return
        L7:
            r3.add(r2)
            return
    }

    private void a(java.util.List r3, java.util.List r4) {
            r2 = this;
            java.lang.String[] r0 = r2.a
            r1 = 0
            if (r0 != 0) goto L15
            int r0 = r3.size()
            if (r0 <= 0) goto L15
            java.lang.String[] r0 = new java.lang.String[r1]
            java.lang.Object[] r3 = r3.toArray(r0)
            java.lang.String[] r3 = (java.lang.String[]) r3
            r2.a = r3
        L15:
            cn.jiguang.ac.g[] r3 = r2.f366b
            if (r3 != 0) goto L29
            int r3 = r4.size()
            if (r3 <= 0) goto L29
            cn.jiguang.ac.g[] r3 = new cn.jiguang.ac.g[r1]
            java.lang.Object[] r3 = r4.toArray(r3)
            cn.jiguang.ac.g[] r3 = (cn.jiguang.ac.g[]) r3
            r2.f366b = r3
        L29:
            return
    }

    private int b(java.lang.String r2) {
            r1 = this;
            r0 = 6
            java.lang.String r2 = r2.substring(r0)
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> Lc
            if (r2 < 0) goto Lc
            return r2
        Lc:
            r2 = -1
            return r2
    }

    public static synchronized cn.jiguang.ac.k b() {
            java.lang.Class<cn.jiguang.ac.k> r0 = cn.jiguang.ac.k.class
            monitor-enter(r0)
            cn.jiguang.ac.k r1 = cn.jiguang.ac.k.f365d     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    private void b(java.lang.String r2, java.util.List r3) {
            r1 = this;
            cn.jiguang.ac.g r0 = cn.jiguang.ac.g.a     // Catch: java.lang.Exception -> L10
            cn.jiguang.ac.g r2 = cn.jiguang.ac.g.a(r2, r0)     // Catch: java.lang.Exception -> L10
            boolean r0 = r3.contains(r2)
            if (r0 == 0) goto Ld
            goto L10
        Ld:
            r3.add(r2)
        L10:
            return
    }

    public static void c() {
            cn.jiguang.ac.k r0 = new cn.jiguang.ac.k
            r0.<init>()
            java.lang.Class<cn.jiguang.ac.k> r1 = cn.jiguang.ac.k.class
            monitor-enter(r1)
            cn.jiguang.ac.k.f365d = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            throw r0
    }

    private boolean d() {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 0
            r0.<init>(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            java.lang.String r3 = "dns.server"
            java.lang.String r3 = java.lang.System.getProperty(r3)
            java.lang.String r4 = ","
            if (r3 == 0) goto L28
            java.util.StringTokenizer r5 = new java.util.StringTokenizer
            r5.<init>(r3, r4)
        L1a:
            boolean r3 = r5.hasMoreTokens()
            if (r3 == 0) goto L28
            java.lang.String r3 = r5.nextToken()
            r6.a(r3, r0)
            goto L1a
        L28:
            java.lang.String r3 = "dns.search"
            java.lang.String r3 = java.lang.System.getProperty(r3)
            if (r3 == 0) goto L43
            java.util.StringTokenizer r5 = new java.util.StringTokenizer
            r5.<init>(r3, r4)
        L35:
            boolean r3 = r5.hasMoreTokens()
            if (r3 == 0) goto L43
            java.lang.String r3 = r5.nextToken()
            r6.b(r3, r2)
            goto L35
        L43:
            r6.a(r0, r2)
            java.lang.String[] r0 = r6.a
            if (r0 == 0) goto L50
            cn.jiguang.ac.g[] r0 = r6.f366b
            if (r0 == 0) goto L50
            r0 = 1
            return r0
        L50:
            return r1
    }

    private boolean e() {
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 0
            r0.<init>(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            java.lang.String r3 = "sun.net.dns.ResolverConfiguration"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Exception -> L74
            java.lang.String r4 = "open"
            r5 = 0
            java.lang.reflect.Method r4 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.Exception -> L74
            java.lang.Object r4 = r4.invoke(r5, r5)     // Catch: java.lang.Exception -> L74
            java.lang.String r6 = "nameservers"
            java.lang.reflect.Method r6 = r3.getMethod(r6, r5)     // Catch: java.lang.Exception -> L74
            java.lang.Object r6 = r6.invoke(r4, r5)     // Catch: java.lang.Exception -> L74
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Exception -> L74
            java.lang.String r7 = "searchlist"
            java.lang.reflect.Method r3 = r3.getMethod(r7, r5)     // Catch: java.lang.Exception -> L74
            java.lang.Object r3 = r3.invoke(r4, r5)     // Catch: java.lang.Exception -> L74
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Exception -> L74
            int r4 = r6.size()
            if (r4 != 0) goto L3b
            return r1
        L3b:
            int r1 = r6.size()
            if (r1 <= 0) goto L55
            java.util.Iterator r1 = r6.iterator()
        L45:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L55
            java.lang.Object r4 = r1.next()
            java.lang.String r4 = (java.lang.String) r4
            r8.a(r4, r0)
            goto L45
        L55:
            int r1 = r3.size()
            if (r1 <= 0) goto L6f
            java.util.Iterator r1 = r3.iterator()
        L5f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L6f
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            r8.b(r3, r2)
            goto L5f
        L6f:
            r8.a(r0, r2)
            r0 = 1
            return r0
        L74:
            return r1
    }

    private void f() {
            r1 = this;
            java.lang.String r0 = "/etc/resolv.conf"
            r1.a(r0)
            return
    }

    private void g() {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = "net.dns3"
            java.lang.String r3 = "net.dns4"
            java.lang.String r4 = "net.dns1"
            java.lang.String r5 = "net.dns2"
            java.lang.String[] r2 = new java.lang.String[]{r4, r5, r2, r3}
            r3 = 0
        L17:
            r4 = 4
            if (r3 >= r4) goto L44
            r4 = r2[r3]
            java.lang.String r5 = ""
            java.lang.String r4 = cn.jiguang.av.v.a(r4, r5)
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L41
            java.lang.String r5 = "^\\d+(\\.\\d+){3}$"
            boolean r5 = r4.matches(r5)
            if (r5 != 0) goto L38
            java.lang.String r5 = "^[0-9a-f]+(:[0-9a-f]*)+:[0-9a-f]+$"
            boolean r5 = r4.matches(r5)
            if (r5 == 0) goto L41
        L38:
            boolean r5 = r0.contains(r4)
            if (r5 != 0) goto L41
            r0.add(r4)
        L41:
            int r3 = r3 + 1
            goto L17
        L44:
            r6.a(r0, r1)
            return
    }

    public void a(java.lang.String r7) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = -1
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.io.IOException -> Lb4 java.io.FileNotFoundException -> Lba
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.io.IOException -> Lb4 java.io.FileNotFoundException -> Lba
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.io.IOException -> Lb4 java.io.FileNotFoundException -> Lba
            r5.<init>(r7)     // Catch: java.io.IOException -> Lb4 java.io.FileNotFoundException -> Lba
            r4.<init>(r5)     // Catch: java.io.IOException -> Lb4 java.io.FileNotFoundException -> Lba
            r3.<init>(r4)     // Catch: java.io.IOException -> Lb4 java.io.FileNotFoundException -> Lba
        L1a:
            java.lang.String r7 = r3.readLine()     // Catch: java.lang.Throwable -> L38
            if (r7 == 0) goto La7
            java.lang.String r4 = "nameserver"
            boolean r4 = r7.startsWith(r4)     // Catch: java.lang.Throwable -> L38
            if (r4 == 0) goto L3b
            java.util.StringTokenizer r4 = new java.util.StringTokenizer     // Catch: java.lang.Throwable -> L38
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L38
            r4.nextToken()     // Catch: java.lang.Throwable -> L38
            java.lang.String r7 = r4.nextToken()     // Catch: java.lang.Throwable -> L38
            r6.a(r7, r0)     // Catch: java.lang.Throwable -> L38
            goto L1a
        L38:
            r7 = move-exception
            goto Lab
        L3b:
            java.lang.String r4 = "domain"
            boolean r4 = r7.startsWith(r4)     // Catch: java.lang.Throwable -> L38
            if (r4 == 0) goto L5f
            java.util.StringTokenizer r4 = new java.util.StringTokenizer     // Catch: java.lang.Throwable -> L38
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L38
            r4.nextToken()     // Catch: java.lang.Throwable -> L38
            boolean r7 = r4.hasMoreTokens()     // Catch: java.lang.Throwable -> L38
            if (r7 == 0) goto L1a
            boolean r7 = r1.isEmpty()     // Catch: java.lang.Throwable -> L38
            if (r7 == 0) goto L1a
            java.lang.String r7 = r4.nextToken()     // Catch: java.lang.Throwable -> L38
            r6.b(r7, r1)     // Catch: java.lang.Throwable -> L38
            goto L1a
        L5f:
            java.lang.String r4 = "search"
            boolean r4 = r7.startsWith(r4)     // Catch: java.lang.Throwable -> L38
            if (r4 == 0) goto L80
            r1.clear()     // Catch: java.lang.Throwable -> L38
            java.util.StringTokenizer r4 = new java.util.StringTokenizer     // Catch: java.lang.Throwable -> L38
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L38
            r4.nextToken()     // Catch: java.lang.Throwable -> L38
        L72:
            boolean r7 = r4.hasMoreTokens()     // Catch: java.lang.Throwable -> L38
            if (r7 == 0) goto L1a
            java.lang.String r7 = r4.nextToken()     // Catch: java.lang.Throwable -> L38
            r6.b(r7, r1)     // Catch: java.lang.Throwable -> L38
            goto L72
        L80:
            java.lang.String r4 = "options"
            boolean r4 = r7.startsWith(r4)     // Catch: java.lang.Throwable -> L38
            if (r4 == 0) goto L1a
            java.util.StringTokenizer r4 = new java.util.StringTokenizer     // Catch: java.lang.Throwable -> L38
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L38
            r4.nextToken()     // Catch: java.lang.Throwable -> L38
        L90:
            boolean r7 = r4.hasMoreTokens()     // Catch: java.lang.Throwable -> L38
            if (r7 == 0) goto L1a
            java.lang.String r7 = r4.nextToken()     // Catch: java.lang.Throwable -> L38
            java.lang.String r5 = "ndots:"
            boolean r5 = r7.startsWith(r5)     // Catch: java.lang.Throwable -> L38
            if (r5 == 0) goto L90
            int r2 = r6.b(r7)     // Catch: java.lang.Throwable -> L38
            goto L90
        La7:
            r3.close()     // Catch: java.io.IOException -> Lb4 java.io.FileNotFoundException -> Lba
            goto Lb4
        Lab:
            r3.close()     // Catch: java.lang.Throwable -> Laf
            goto Lb3
        Laf:
            r3 = move-exception
            r7.addSuppressed(r3)     // Catch: java.io.IOException -> Lb4 java.io.FileNotFoundException -> Lba
        Lb3:
            throw r7     // Catch: java.io.IOException -> Lb4 java.io.FileNotFoundException -> Lba
        Lb4:
            r6.a(r0, r1)
            r6.a(r2)
        Lba:
            return
    }

    public java.lang.String[] a() {
            r1 = this;
            java.lang.String[] r0 = r1.a
            return r0
    }
}
