package cn.jiguang.commons.F;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class c {
    private static final java.lang.Runnable a = null;

    /* renamed from: c, reason: collision with root package name */
    private static final java.lang.Object[] f784c = null;

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f785d = null;

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f786e = null;

    /* renamed from: f, reason: collision with root package name */
    private static final byte[] f787f = null;

    /* renamed from: g, reason: collision with root package name */
    private static final byte[] f788g = null;

    /* renamed from: h, reason: collision with root package name */
    private static final byte[] f789h = null;

    /* renamed from: i, reason: collision with root package name */
    private static final java.util.Set f790i = null;

    class a implements java.lang.Runnable {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r0 = this;
                cn.jiguang.commons.F.c.a()
                return
        }
    }

    static {
            cn.jiguang.commons.F.c$a r0 = new cn.jiguang.commons.F.c$a
            r0.<init>()
            cn.jiguang.commons.F.c.a = r0
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            cn.jiguang.commons.F.c.f784c = r0
            r0 = 15
            byte[] r0 = new byte[r0]
            r0 = {x005a: FILL_ARRAY_DATA , data: [102, 120, 94, 71, 57, 37, 117, 49, 1, 0, 52, 127, 54, 32, 16} // fill-array
            cn.jiguang.commons.F.c.f785d = r0
            r0 = 17
            byte[] r0 = new byte[r0]
            r0 = {x0066: FILL_ARRAY_DATA , data: [83, 65, 109, 40, 57, 97, 66, 79, 122, 39, 120, 116, 68, 15, 120, 122, 102} // fill-array
            cn.jiguang.commons.F.c.f786e = r0
            r0 = 16
            byte[] r0 = new byte[r0]
            r0 = {x0074: FILL_ARRAY_DATA , data: [120, 64, 0, 52, 60, 54, 127, 85, 73, 126, 96, 54, 98, 88, 79, 110} // fill-array
            cn.jiguang.commons.F.c.f787f = r0
            r0 = 30
            byte[] r0 = new byte[r0]
            cn.jiguang.commons.F.c.f788g = r0
            r1 = 65
            java.util.Arrays.fill(r0, r1)
            byte[] r0 = c()
            cn.jiguang.commons.F.c.f789h = r0
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r8 = "NOARP"
            java.lang.String r9 = "NONE"
            java.lang.String r1 = "REACHABLE"
            java.lang.String r2 = "STALE"
            java.lang.String r3 = "DELAY"
            java.lang.String r4 = "PROBE"
            java.lang.String r5 = "INCOMPLETE"
            java.lang.String r6 = "FAILED"
            java.lang.String r7 = "PERMANENT"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            cn.jiguang.commons.F.c.f790i = r0
            return
    }

    public c() {
            r1 = this;
            r1.<init>()
            return
    }

    private static java.lang.String a(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L22
            java.lang.String r0 = "0x"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L22
            r0 = 2
            java.lang.String r2 = r2.substring(r0)     // Catch: java.lang.NumberFormatException -> L22
            r1 = 16
            int r2 = java.lang.Integer.parseInt(r2, r1)     // Catch: java.lang.NumberFormatException -> L22
            r2 = r2 & r0
            if (r2 == 0) goto L1f
            java.lang.String r2 = "REACHABLE"
            return r2
        L1f:
            java.lang.String r2 = "STALE"
            return r2
        L22:
            java.lang.String r2 = "UNKNOWN"
            return r2
    }

    private static java.lang.String a(byte[] r8) {
            if (r8 == 0) goto L3c
            int r0 = r8.length
            r1 = 4
            if (r0 == r1) goto L7
            goto L3c
        L7:
            r0 = 0
            r2 = r8[r0]
            r2 = r2 & 255(0xff, float:3.57E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 1
            r4 = r8[r3]
            r4 = r4 & 255(0xff, float:3.57E-43)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 2
            r6 = r8[r5]
            r6 = r6 & 255(0xff, float:3.57E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 3
            r8 = r8[r7]
            r8 = r8 & 255(0xff, float:3.57E-43)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r2
            r1[r3] = r4
            r1[r5] = r6
            r1[r7] = r8
            java.lang.String r8 = "%d.%d.%d.%d"
            java.lang.String r8 = java.lang.String.format(r8, r1)
            return r8
        L3c:
            java.lang.String r8 = ""
            return r8
    }

    static /* synthetic */ void a() {
            d()
            return
    }

    public static void a(int r9) {
            r0 = r9 & (-256(0xffffffffffffff00, float:NaN))
            java.net.DatagramSocket r1 = new java.net.DatagramSocket     // Catch: java.io.IOException -> L53
            r1.<init>()     // Catch: java.io.IOException -> L53
            r2 = 1000(0x3e8, float:1.401E-42)
            r1.setSoTimeout(r2)     // Catch: java.lang.Throwable -> L41
            r2 = 0
            r3 = 0
        Le:
            r4 = 256(0x100, float:3.59E-43)
            if (r3 >= r4) goto L46
            r4 = r9 & 255(0xff, float:3.57E-43)
            if (r3 != r4) goto L17
            goto L43
        L17:
            int r4 = r0 >>> 24
            byte r4 = (byte) r4     // Catch: java.lang.Throwable -> L41
            int r5 = r0 >>> 16
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L41
            int r6 = r0 >>> 8
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L41
            byte r7 = (byte) r3     // Catch: java.lang.Throwable -> L41
            r8 = 4
            byte[] r8 = new byte[r8]     // Catch: java.lang.Throwable -> L41
            r8[r2] = r4     // Catch: java.lang.Throwable -> L41
            r4 = 1
            r8[r4] = r5     // Catch: java.lang.Throwable -> L41
            r4 = 2
            r8[r4] = r6     // Catch: java.lang.Throwable -> L41
            r4 = 3
            r8[r4] = r7     // Catch: java.lang.Throwable -> L41
            java.net.InetAddress r4 = java.net.InetAddress.getByAddress(r8)     // Catch: java.lang.Throwable -> L41
            java.net.DatagramPacket r5 = new java.net.DatagramPacket     // Catch: java.lang.Throwable -> L41
            byte[] r6 = cn.jiguang.commons.F.c.f789h     // Catch: java.lang.Throwable -> L41
            int r7 = r6.length     // Catch: java.lang.Throwable -> L41
            r8 = 137(0x89, float:1.92E-43)
            r5.<init>(r6, r7, r4, r8)     // Catch: java.lang.Throwable -> L41
            r1.send(r5)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L43
            goto L43
        L41:
            r9 = move-exception
            goto L4a
        L43:
            int r3 = r3 + 1
            goto Le
        L46:
            r1.close()     // Catch: java.io.IOException -> L53
            goto L53
        L4a:
            r1.close()     // Catch: java.lang.Throwable -> L4e
            goto L52
        L4e:
            r0 = move-exception
            r9.addSuppressed(r0)     // Catch: java.io.IOException -> L53
        L52:
            throw r9     // Catch: java.io.IOException -> L53
        L53:
            return
    }

    public static void a(java.lang.String r3, byte[] r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L2a
            if (r4 == 0) goto L2a
            int r0 = r4.length
            r1 = 4
            if (r0 == r1) goto Ld
            goto L2a
        Ld:
            java.lang.Object[] r0 = cn.jiguang.commons.F.c.f784c
            monitor-enter(r0)
            r2 = 0
            r0[r2] = r3     // Catch: java.lang.Throwable -> L27
            byte[] r3 = java.util.Arrays.copyOf(r4, r1)     // Catch: java.lang.Throwable -> L27
            r4 = 1
            r0[r4] = r3     // Catch: java.lang.Throwable -> L27
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            cn.jiguang.commons.C.a r3 = cn.jiguang.commons.C.a.c()
            java.lang.Runnable r4 = cn.jiguang.commons.F.c.a
            cn.jiguang.commons.C.a$g r0 = cn.jiguang.commons.C.a.g.f771d
            r3.a(r4, r0)
            return
        L27:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            throw r3
        L2a:
            java.lang.String r3 = "JArpUtils"
            java.lang.String r4 = "ping params invalid"
            cn.jiguang.commons.w.a.f(r3, r4)
            return
    }

    private static boolean a(cn.jiguang.commons.c.f r2) {
            java.lang.String r0 = r2.a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L26
            java.lang.String r0 = r2.f1016c
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L26
            java.lang.String r0 = r2.f1016c
            java.lang.String r1 = "00:00:00:00:00:00"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L26
            java.lang.String r2 = r2.f1016c
            java.lang.String r0 = "<incomplete>"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L26
            r2 = 1
            return r2
        L26:
            r2 = 0
            return r2
    }

    public static byte[] a(long r6) {
            r0 = 255(0xff, double:1.26E-321)
            long r2 = r6 & r0
            int r3 = (int) r2
            byte r2 = (byte) r3
            r3 = 8
            long r3 = r6 >> r3
            long r3 = r3 & r0
            int r4 = (int) r3
            byte r3 = (byte) r4
            r4 = 16
            long r4 = r6 >> r4
            long r4 = r4 & r0
            int r5 = (int) r4
            byte r4 = (byte) r5
            r5 = 24
            long r6 = r6 >> r5
            long r6 = r6 & r0
            int r7 = (int) r6
            byte r6 = (byte) r7
            r7 = 4
            byte[] r7 = new byte[r7]
            r0 = 0
            r7[r0] = r2
            r0 = 1
            r7[r0] = r3
            r0 = 2
            r7[r0] = r4
            r0 = 3
            r7[r0] = r6
            return r7
    }

    private static cn.jiguang.commons.c.f c(java.lang.String r8) {
            java.lang.String r8 = r8.trim()
            java.lang.String r0 = "\\s+"
            java.lang.String[] r8 = r8.split(r0)
            int r0 = r8.length
            r1 = 4
            if (r0 >= r1) goto L10
            r8 = 0
            return r8
        L10:
            cn.jiguang.commons.c.f r0 = new cn.jiguang.commons.c.f
            r0.<init>()
            java.lang.String r1 = "UNKNOWN"
            r0.f1018e = r1
            r2 = 0
            r2 = r8[r2]
            r0.a = r2
            int r2 = r8.length
            r3 = 1
            int r2 = r2 - r3
            r2 = r8[r2]
            r4 = 1
        L24:
            int r5 = r8.length
            if (r4 >= r5) goto L66
            r5 = r8[r4]
            java.lang.String r6 = "dev"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L3c
            int r6 = r4 + 1
            int r7 = r8.length
            if (r6 >= r7) goto L3c
            r4 = r8[r6]
            r0.f1017d = r4
        L3a:
            r4 = r6
            goto L64
        L3c:
            java.lang.String r6 = "lladdr"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L54
            int r6 = r4 + 1
            int r7 = r8.length
            if (r6 >= r7) goto L54
            r4 = r8[r6]
            java.util.Locale r5 = java.util.Locale.US
            java.lang.String r4 = r4.toUpperCase(r5)
            r0.f1016c = r4
            goto L3a
        L54:
            java.util.Locale r6 = java.util.Locale.US
            java.lang.String r5 = r5.toUpperCase(r6)
            java.util.Set r6 = cn.jiguang.commons.F.c.f790i
            boolean r6 = r6.contains(r5)
            if (r6 == 0) goto L64
            r0.f1018e = r5
        L64:
            int r4 = r4 + r3
            goto L24
        L66:
            java.lang.String r8 = r0.f1018e
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L7e
            java.util.Locale r8 = java.util.Locale.US
            java.lang.String r8 = r2.toUpperCase(r8)
            java.util.Set r1 = cn.jiguang.commons.F.c.f790i
            boolean r1 = r1.contains(r8)
            if (r1 == 0) goto L7e
            r0.f1018e = r8
        L7e:
            return r0
    }

    private static byte[] c() {
            r0 = 50
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r1 = 2116550656(0x7e280000, float:5.5827576E37)
            r0.putInt(r1)
            r1 = 0
            r0.putLong(r1)
            r1 = 3
            byte[] r1 = new byte[r1]
            r1 = {x002c: FILL_ARRAY_DATA , data: [32, 67, 75} // fill-array
            r0.put(r1)
            byte[] r1 = cn.jiguang.commons.F.c.f788g
            r0.put(r1)
            r1 = 5
            byte[] r1 = new byte[r1]
            r1 = {x0032: FILL_ARRAY_DATA , data: [0, 0, 33, 0, 1} // fill-array
            r0.put(r1)
            byte[] r0 = r0.array()
            return r0
    }

    private static void d() {
            java.lang.Object[] r0 = cn.jiguang.commons.F.c.f784c
            monitor-enter(r0)
            r1 = 0
            r2 = r0[r1]     // Catch: java.lang.Throwable -> L51
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L51
            r3 = 1
            r3 = r0[r3]     // Catch: java.lang.Throwable -> L51
            byte[] r3 = (byte[]) r3     // Catch: java.lang.Throwable -> L51
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L51
            r0 = 3
            byte[] r4 = java.util.Arrays.copyOf(r3, r0)     // Catch: java.lang.Exception -> L50
            r5 = 0
        L14:
            r6 = 255(0xff, float:3.57E-43)
            if (r5 > r6) goto L50
            r7 = r3[r0]     // Catch: java.lang.Exception -> L50
            r6 = r6 & r7
            if (r5 != r6) goto L1e
            goto L4d
        L1e:
            r6 = 4
            byte[] r6 = java.util.Arrays.copyOf(r4, r6)     // Catch: java.lang.Exception -> L50
            byte r7 = (byte) r5     // Catch: java.lang.Exception -> L50
            r6[r0] = r7     // Catch: java.lang.Exception -> L50
            java.lang.String r6 = a(r6)     // Catch: java.lang.Exception -> L50
            boolean r7 = r6.equals(r2)     // Catch: java.lang.Exception -> L50
            if (r7 == 0) goto L31
            goto L4d
        L31:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L50
            r7.<init>()     // Catch: java.lang.Exception -> L50
            byte[] r8 = cn.jiguang.commons.F.c.f785d     // Catch: java.lang.Exception -> L50
            java.lang.String r8 = cn.jiguang.commons.L.n.c(r8)     // Catch: java.lang.Exception -> L50
            r7.append(r8)     // Catch: java.lang.Exception -> L50
            r7.append(r6)     // Catch: java.lang.Exception -> L50
            java.lang.String r6 = r7.toString()     // Catch: java.lang.Exception -> L50
            java.lang.String[] r6 = new java.lang.String[]{r6}     // Catch: java.lang.Exception -> L50
            cn.jiguang.commons.L.aa.a(r6, r1)     // Catch: java.lang.Exception -> L50
        L4d:
            int r5 = r5 + 1
            goto L14
        L50:
            return
        L51:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L51
            throw r1
    }

    public static java.util.List e() {
            r0 = 3032(0xbd8, float:4.249E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "getArpFromCat called"
            java.lang.String r2 = "JArpUtils"
            cn.jiguang.commons.w.a.a(r2, r1)
            byte[] r1 = cn.jiguang.commons.F.c.f786e     // Catch: java.lang.Exception -> Lec
            java.lang.String r1 = cn.jiguang.commons.L.n.c(r1)     // Catch: java.lang.Exception -> Lec
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Exception -> Lec
            r3 = 1
            java.util.List r1 = cn.jiguang.commons.L.aa.a(r1, r3)     // Catch: java.lang.Exception -> Lec
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lec
            r4.<init>()     // Catch: java.lang.Exception -> Lec
            java.lang.String r5 = "arp cat lines: "
            r4.append(r5)     // Catch: java.lang.Exception -> Lec
            r5 = 0
            if (r1 == 0) goto L2e
            int r6 = r1.size()     // Catch: java.lang.Exception -> Lec
            goto L2f
        L2e:
            r6 = 0
        L2f:
            r4.append(r6)     // Catch: java.lang.Exception -> Lec
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> Lec
            cn.jiguang.commons.w.a.a(r2, r4)     // Catch: java.lang.Exception -> Lec
            if (r1 == 0) goto Ldd
            int r4 = r1.size()     // Catch: java.lang.Exception -> Lec
            if (r4 > r3) goto L43
            goto Ldd
        L43:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lec
            r4.<init>()     // Catch: java.lang.Exception -> Lec
            r6 = 1
            r7 = 0
        L4a:
            int r8 = r1.size()     // Catch: java.lang.Exception -> Lec
            if (r6 >= r8) goto La4
            java.lang.Object r8 = r1.get(r6)     // Catch: java.lang.Exception -> Lec
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> Lec
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Exception -> Lec
            if (r9 == 0) goto L5d
            goto La1
        L5d:
            java.lang.String r8 = r8.trim()     // Catch: java.lang.Exception -> Lec
            java.lang.String r9 = "\\s+"
            java.lang.String[] r8 = r8.split(r9)     // Catch: java.lang.Exception -> Lec
            int r9 = r8.length     // Catch: java.lang.Exception -> Lec
            r10 = 6
            if (r9 >= r10) goto L6c
            goto La1
        L6c:
            cn.jiguang.commons.c.f r9 = new cn.jiguang.commons.c.f     // Catch: java.lang.Exception -> Lec
            r9.<init>()     // Catch: java.lang.Exception -> Lec
            r10 = r8[r5]     // Catch: java.lang.Exception -> Lec
            r9.a = r10     // Catch: java.lang.Exception -> Lec
            r10 = r8[r3]     // Catch: java.lang.Exception -> Lec
            r9.f1019f = r10     // Catch: java.lang.Exception -> Lec
            r10 = 2
            r11 = r8[r10]     // Catch: java.lang.Exception -> Lec
            r9.f1020g = r11     // Catch: java.lang.Exception -> Lec
            r11 = 3
            r11 = r8[r11]     // Catch: java.lang.Exception -> Lec
            java.util.Locale r12 = java.util.Locale.US     // Catch: java.lang.Exception -> Lec
            java.lang.String r11 = r11.toUpperCase(r12)     // Catch: java.lang.Exception -> Lec
            r9.f1016c = r11     // Catch: java.lang.Exception -> Lec
            r11 = 5
            r11 = r8[r11]     // Catch: java.lang.Exception -> Lec
            r9.f1017d = r11     // Catch: java.lang.Exception -> Lec
            r8 = r8[r10]     // Catch: java.lang.Exception -> Lec
            java.lang.String r8 = a(r8)     // Catch: java.lang.Exception -> Lec
            r9.f1018e = r8     // Catch: java.lang.Exception -> Lec
            boolean r8 = a(r9)     // Catch: java.lang.Exception -> Lec
            if (r8 == 0) goto La1
            r4.add(r9)     // Catch: java.lang.Exception -> Lec
            int r7 = r7 + 1
        La1:
            int r6 = r6 + 1
            goto L4a
        La4:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lec
            r5.<init>()     // Catch: java.lang.Exception -> Lec
            java.lang.String r6 = "arp cat parsed, valid: "
            r5.append(r6)     // Catch: java.lang.Exception -> Lec
            r5.append(r7)     // Catch: java.lang.Exception -> Lec
            java.lang.String r6 = "/"
            r5.append(r6)     // Catch: java.lang.Exception -> Lec
            int r1 = r1.size()     // Catch: java.lang.Exception -> Lec
            int r1 = r1 - r3
            r5.append(r1)     // Catch: java.lang.Exception -> Lec
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Exception -> Lec
            cn.jiguang.commons.w.a.a(r2, r1)     // Catch: java.lang.Exception -> Lec
            if (r7 <= 0) goto Ld2
            cn.jiguang.commons.A.a r0 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Exception -> Lec
            r1 = 3031(0xbd7, float:4.247E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> Lec
            goto Ld9
        Ld2:
            cn.jiguang.commons.A.a r1 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Exception -> Lec
            r13 = r1
            r1 = r0
            r0 = r13
        Ld9:
            r0.e(r1)     // Catch: java.lang.Exception -> Lec
            return r4
        Ldd:
            java.lang.String r1 = "arp cat no data"
            cn.jiguang.commons.w.a.a(r2, r1)     // Catch: java.lang.Exception -> Lec
            cn.jiguang.commons.A.a r1 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Exception -> Lec
            r1.e(r0)     // Catch: java.lang.Exception -> Lec
            java.util.List r0 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Exception -> Lec
            return r0
        Lec:
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
    }

    public static java.util.List f() {
            r0 = 3034(0xbda, float:4.252E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "getArpFromNeigh called"
            java.lang.String r2 = "JArpUtils"
            cn.jiguang.commons.w.a.a(r2, r1)
            byte[] r1 = cn.jiguang.commons.F.c.f787f     // Catch: java.lang.Exception -> Lb2
            java.lang.String r1 = cn.jiguang.commons.L.n.c(r1)     // Catch: java.lang.Exception -> Lb2
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Exception -> Lb2
            r3 = 1
            java.util.List r1 = cn.jiguang.commons.L.aa.a(r1, r3)     // Catch: java.lang.Exception -> Lb2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lb2
            r3.<init>()     // Catch: java.lang.Exception -> Lb2
            java.lang.String r4 = "arp neigh lines: "
            r3.append(r4)     // Catch: java.lang.Exception -> Lb2
            r4 = 0
            if (r1 == 0) goto L2e
            int r5 = r1.size()     // Catch: java.lang.Exception -> Lb2
            goto L2f
        L2e:
            r5 = 0
        L2f:
            r3.append(r5)     // Catch: java.lang.Exception -> Lb2
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> Lb2
            cn.jiguang.commons.w.a.a(r2, r3)     // Catch: java.lang.Exception -> Lb2
            if (r1 == 0) goto La8
            boolean r3 = r1.isEmpty()     // Catch: java.lang.Exception -> Lb2
            if (r3 == 0) goto L42
            goto La8
        L42:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lb2
            r3.<init>()     // Catch: java.lang.Exception -> Lb2
            java.util.Iterator r5 = r1.iterator()     // Catch: java.lang.Exception -> Lb2
        L4b:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Exception -> Lb2
            if (r6 == 0) goto L70
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Exception -> Lb2
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> Lb2
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> Lb2
            if (r7 == 0) goto L5e
            goto L4b
        L5e:
            cn.jiguang.commons.c.f r6 = c(r6)     // Catch: java.lang.Exception -> Lb2
            if (r6 == 0) goto L4b
            boolean r7 = a(r6)     // Catch: java.lang.Exception -> Lb2
            if (r7 == 0) goto L4b
            r3.add(r6)     // Catch: java.lang.Exception -> Lb2
            int r4 = r4 + 1
            goto L4b
        L70:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lb2
            r5.<init>()     // Catch: java.lang.Exception -> Lb2
            java.lang.String r6 = "arp neigh parsed, valid: "
            r5.append(r6)     // Catch: java.lang.Exception -> Lb2
            r5.append(r4)     // Catch: java.lang.Exception -> Lb2
            java.lang.String r6 = "/"
            r5.append(r6)     // Catch: java.lang.Exception -> Lb2
            int r1 = r1.size()     // Catch: java.lang.Exception -> Lb2
            r5.append(r1)     // Catch: java.lang.Exception -> Lb2
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Exception -> Lb2
            cn.jiguang.commons.w.a.a(r2, r1)     // Catch: java.lang.Exception -> Lb2
            if (r4 <= 0) goto L9d
            cn.jiguang.commons.A.a r0 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Exception -> Lb2
            r1 = 3033(0xbd9, float:4.25E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> Lb2
            goto La4
        L9d:
            cn.jiguang.commons.A.a r1 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Exception -> Lb2
            r8 = r1
            r1 = r0
            r0 = r8
        La4:
            r0.e(r1)     // Catch: java.lang.Exception -> Lb2
            return r3
        La8:
            cn.jiguang.commons.A.a r1 = cn.jiguang.commons.A.a.f()     // Catch: java.lang.Exception -> Lb2
            r1.e(r0)     // Catch: java.lang.Exception -> Lb2
            java.util.List r0 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Exception -> Lb2
            return r0
        Lb2:
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
    }
}
