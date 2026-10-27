package cn.jiguang.av;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class x {
    private static final java.lang.Object a = null;

    /* renamed from: b, reason: collision with root package name */
    private static java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ThreadLocal<java.text.SimpleDateFormat>> f733b;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            cn.jiguang.av.x.a = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            cn.jiguang.av.x.f733b = r0
            return
    }

    public x() {
            r1 = this;
            r1.<init>()
            return
    }

    public static long a() {
            long r0 = java.lang.System.currentTimeMillis()
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            r2.setTimeInMillis(r0)
            r0 = 11
            r1 = 0
            r2.set(r0, r1)
            r0 = 12
            r2.set(r0, r1)
            r0 = 13
            r2.set(r0, r1)
            r0 = 14
            r2.set(r0, r1)
            long r0 = r2.getTimeInMillis()
            return r0
    }

    public static java.lang.String a(java.lang.String r2) {
            java.lang.String r0 = new java.lang.String
            byte[] r2 = r2.getBytes()
            r1 = 2
            byte[] r2 = android.util.Base64.decode(r2, r1)
            r0.<init>(r2)
            return r0
    }

    public static java.util.LinkedHashSet<java.lang.String> a(android.content.Context r4, java.util.LinkedHashSet<java.lang.String> r5) {
            boolean r4 = cn.jiguang.av.b.e(r4)
            if (r4 == 0) goto L39
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r5.iterator()
        L14:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L30
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "ipv6"
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L2c
            r4.add(r2)
            goto L14
        L2c:
            r0.add(r2)
            goto L14
        L30:
            r5.clear()
            r5.addAll(r4)
            r5.addAll(r0)
        L39:
            return r5
    }

    public static java.util.LinkedList<java.net.InetAddress> a(android.content.Context r4, java.util.LinkedList<java.net.InetAddress> r5) {
            boolean r4 = cn.jiguang.av.b.e(r4)
            if (r4 != 0) goto L7
            return r5
        L7:
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.Iterator r1 = r5.iterator()
        L15:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L31
            java.lang.Object r2 = r1.next()
            java.net.InetAddress r2 = (java.net.InetAddress) r2
            boolean r3 = r2 instanceof java.net.Inet6Address
            if (r3 == 0) goto L29
            r4.add(r2)
            goto L15
        L29:
            boolean r3 = r2 instanceof java.net.Inet4Address
            if (r3 == 0) goto L15
            r0.add(r2)
            goto L15
        L31:
            r5.clear()
            r5.addAll(r4)
            r5.addAll(r0)
            return r5
    }

    public static <T> java.util.LinkedList<T> a(java.util.Collection<T> r6) {
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1 = 0
            if (r6 == 0) goto Ld
            int r2 = r6.size()
            goto Le
        Ld:
            r2 = 0
        Le:
            if (r2 != 0) goto L11
            goto L34
        L11:
            r3 = 1
            if (r2 != r3) goto L18
            r0.addAll(r6)
            return r0
        L18:
            java.security.SecureRandom r2 = new java.security.SecureRandom
            r2.<init>()
            java.util.Iterator r6 = r6.iterator()
        L21:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L34
            java.lang.Object r4 = r6.next()
            int r1 = r1 + r3
            int r5 = r2.nextInt(r1)
            r0.add(r5, r4)
            goto L21
        L34:
            return r0
    }

    public static java.util.List<cn.jiguang.ab.g> a(java.util.List<cn.jiguang.ab.g> r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
        Lb:
            int r3 = r6.size()
            int r3 = r3 + (-1)
            if (r2 >= r3) goto L2d
            java.lang.Object r3 = r6.get(r2)
            cn.jiguang.ab.g r3 = (cn.jiguang.ab.g) r3
            java.lang.String r4 = r3.a
            java.lang.String r5 = "ipv6"
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L27
            r0.add(r3)
            goto L2a
        L27:
            r1.add(r3)
        L2a:
            int r2 = r2 + 1
            goto Lb
        L2d:
            r6.clear()
            r6.addAll(r0)
            r6.addAll(r1)
            return r6
    }

    public static void a(java.io.Closeable r0) {
            if (r0 == 0) goto L5
            r0.close()     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public static void a(java.lang.String r2, java.lang.String r3) {
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r3)
            java.util.zip.ZipOutputStream r3 = new java.util.zip.ZipOutputStream     // Catch: java.lang.Throwable -> L20
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L20
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L22
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = r1.getName()     // Catch: java.lang.Throwable -> L22
            a(r3, r1, r2)     // Catch: java.lang.Throwable -> L22
            r3.flush()     // Catch: java.lang.Throwable -> L22
            r3.close()     // Catch: java.lang.Throwable -> L20
            r0.close()
            return
        L20:
            r2 = move-exception
            goto L2c
        L22:
            r2 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L27
            goto L2b
        L27:
            r3 = move-exception
            r2.addSuppressed(r3)     // Catch: java.lang.Throwable -> L20
        L2b:
            throw r2     // Catch: java.lang.Throwable -> L20
        L2c:
            r0.close()     // Catch: java.lang.Throwable -> L30
            goto L34
        L30:
            r3 = move-exception
            r2.addSuppressed(r3)
        L34:
            throw r2
    }

    private static void a(java.util.zip.ZipOutputStream r5, java.io.File r6, java.lang.String r7) {
            boolean r0 = r6.isDirectory()
            r1 = 0
            if (r0 == 0) goto L2f
            java.io.File[] r6 = r6.listFiles()
            int r0 = r6.length
        Lc:
            if (r1 >= r0) goto L2e
            r2 = r6[r1]
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            java.lang.String r4 = "/"
            r3.append(r4)
            java.lang.String r4 = r2.getName()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            a(r5, r2, r3)
            int r1 = r1 + 1
            goto Lc
        L2e:
            return
        L2f:
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r6)
            java.util.zip.ZipEntry r6 = new java.util.zip.ZipEntry     // Catch: java.lang.Throwable -> L4a
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L4a
            r5.putNextEntry(r6)     // Catch: java.lang.Throwable -> L4a
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> L4a
        L40:
            int r7 = r0.read(r6)     // Catch: java.lang.Throwable -> L4a
            if (r7 < 0) goto L4c
            r5.write(r6, r1, r7)     // Catch: java.lang.Throwable -> L4a
            goto L40
        L4a:
            r5 = move-exception
            goto L53
        L4c:
            r0.close()
            r5.closeEntry()
            return
        L53:
            r0.close()     // Catch: java.lang.Throwable -> L57
            goto L5b
        L57:
            r6 = move-exception
            r5.addSuppressed(r6)
        L5b:
            throw r5
    }

    public static boolean a(long r3, long r5) {
            r0 = 1
            java.util.Calendar r1 = java.util.Calendar.getInstance()     // Catch: java.lang.Throwable -> L31
            java.util.Calendar r2 = java.util.Calendar.getInstance()     // Catch: java.lang.Throwable -> L31
            r1.setTimeInMillis(r3)     // Catch: java.lang.Throwable -> L31
            r2.setTimeInMillis(r5)     // Catch: java.lang.Throwable -> L31
            r3 = 0
            int r4 = r1.get(r3)     // Catch: java.lang.Throwable -> L31
            int r5 = r2.get(r3)     // Catch: java.lang.Throwable -> L31
            if (r4 != r5) goto L30
            int r4 = r1.get(r0)     // Catch: java.lang.Throwable -> L31
            int r5 = r2.get(r0)     // Catch: java.lang.Throwable -> L31
            if (r4 != r5) goto L30
            r4 = 6
            int r5 = r1.get(r4)     // Catch: java.lang.Throwable -> L31
            int r4 = r2.get(r4)     // Catch: java.lang.Throwable -> L31
            if (r5 != r4) goto L30
            return r0
        L30:
            return r3
        L31:
            return r0
    }

    public static byte[] a(java.io.InputStream r4) {
            if (r4 == 0) goto L28
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L23
            r1.<init>()     // Catch: java.lang.Throwable -> L23
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L18
        Lc:
            int r2 = r4.read(r0)     // Catch: java.lang.Throwable -> L18
            r3 = -1
            if (r2 == r3) goto L1b
            r3 = 0
            r1.write(r0, r3, r2)     // Catch: java.lang.Throwable -> L18
            goto Lc
        L18:
            r4 = move-exception
            r0 = r1
            goto L24
        L1b:
            byte[] r4 = r1.toByteArray()     // Catch: java.lang.Throwable -> L18
            a(r1)
            return r4
        L23:
            r4 = move-exception
        L24:
            a(r0)
            throw r4
        L28:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r0 = "InputStream is null"
            r4.<init>(r0)
            throw r4
    }

    public static byte[] a(byte[] r3) {
            if (r3 == 0) goto L2d
            int r0 = r3.length
            if (r0 != 0) goto L6
            goto L2d
        L6:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 0
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L25
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L25
            r2.write(r3)     // Catch: java.lang.Throwable -> L22
            r2.close()     // Catch: java.lang.Throwable -> L22
            byte[] r3 = r0.toByteArray()     // Catch: java.lang.Throwable -> L22
            a(r0)
            a(r2)
            return r3
        L22:
            r3 = move-exception
            r1 = r2
            goto L26
        L25:
            r3 = move-exception
        L26:
            a(r0)
            a(r1)
            throw r3
        L2d:
            return r3
    }

    public static java.lang.String b(java.lang.String r1) {
            byte[] r1 = r1.getBytes()
            r0 = 2
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)
            return r1
    }

    public static boolean b(long r6, long r8) {
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 <= 0) goto L1d
            long r2 = android.os.SystemClock.elapsedRealtime()
            r4 = 1
            int r5 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r5 > 0) goto L10
            return r4
        L10:
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 > 0) goto L15
            return r4
        L15:
            long r6 = r6 + r8
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 <= 0) goto L1b
            return r4
        L1b:
            r6 = 0
            return r6
        L1d:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            r6.<init>()
            throw r6
    }

    public static byte[] b(byte[] r6) {
            if (r6 == 0) goto L43
            int r0 = r6.length
            if (r0 != 0) goto L6
            goto L43
        L6:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r6)
            r6 = 0
            java.util.zip.GZIPInputStream r2 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L35
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L35
            r6 = 256(0x100, float:3.59E-43)
            byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> L25
        L1a:
            int r3 = r2.read(r6)     // Catch: java.lang.Throwable -> L25
            if (r3 < 0) goto L27
            r4 = 0
            r0.write(r6, r4, r3)     // Catch: java.lang.Throwable -> L25
            goto L1a
        L25:
            r6 = move-exception
            goto L39
        L27:
            byte[] r6 = r0.toByteArray()     // Catch: java.lang.Throwable -> L25
            a(r0)
            a(r1)
            a(r2)
            return r6
        L35:
            r2 = move-exception
            r5 = r2
            r2 = r6
            r6 = r5
        L39:
            a(r0)
            a(r1)
            a(r2)
            throw r6
        L43:
            return r6
    }

    public static short c(byte[] r3) {
            if (r3 == 0) goto L1c
            int r0 = r3.length
            if (r0 == 0) goto L1c
            int r0 = r3.length
            r1 = 0
            r2 = 1
            if (r0 != r2) goto Le
            r3 = r3[r1]
        Lc:
            short r3 = (short) r3
            return r3
        Le:
            r0 = r3[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            short r0 = (short) r0
            r3 = r3[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            short r3 = (short) r3
            r3 = r3 | r0
            goto Lc
        L1c:
            java.lang.Exception r3 = new java.lang.Exception
            java.lang.String r0 = "byte could not be empty"
            r3.<init>(r0)
            throw r3
    }
}
