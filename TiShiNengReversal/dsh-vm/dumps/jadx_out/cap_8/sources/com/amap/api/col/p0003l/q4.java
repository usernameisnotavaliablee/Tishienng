package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class q4 {
    private static final java.lang.String[] a = null;

    /* renamed from: b, reason: collision with root package name */
    private static final java.lang.String[] f3825b = null;

    /* renamed from: c, reason: collision with root package name */
    static java.lang.String f3826c;

    static {
            java.lang.String r0 = "arm64-v8a"
            java.lang.String r1 = "x86_64"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            com.amap.api.col.p0003l.q4.a = r0
            java.lang.String r0 = "arm"
            java.lang.String r1 = "x86"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            com.amap.api.col.p0003l.q4.f3825b = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
        L1a:
            r2 = 80
            if (r1 >= r2) goto L26
            java.lang.String r2 = "="
            r0.append(r2)
            int r1 = r1 + 1
            goto L1a
        L26:
            java.lang.String r0 = r0.toString()
            com.amap.api.col.p0003l.q4.f3826c = r0
            return
    }

    public q4() {
            r1 = this;
            r1.<init>()
            return
    }

    static java.lang.String A(byte[] r2) {
            java.lang.String r2 = E(r2)     // Catch: java.lang.Throwable -> L5
            return r2
        L5:
            r2 = move-exception
            java.lang.String r0 = "ut"
            java.lang.String r1 = "h2s"
            com.amap.api.col.p0003l.r5.e(r2, r0, r1)
            r2 = 0
            return r2
    }

    public static boolean B(java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r3 = com.amap.api.col.p0003l.j4.a(r3)     // Catch: java.lang.Throwable -> L24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L24
            r0.<init>()     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> L24
            r0.append(r2)     // Catch: java.lang.Throwable -> L24
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L24
            r0.append(r2)     // Catch: java.lang.Throwable -> L24
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L24
            boolean r3 = r3.contains(r0)     // Catch: java.lang.Throwable -> L24
            return r3
        L24:
            return r1
    }

    private static java.lang.String C(java.lang.String r8) {
            java.lang.String r0 = "&"
            boolean r1 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto Ld
            java.lang.String r8 = ""
            return r8
        Lb:
            r0 = move-exception
            goto L47
        Ld:
            java.lang.String[] r1 = r8.split(r0)     // Catch: java.lang.Throwable -> Lb
            java.util.Arrays.sort(r1)     // Catch: java.lang.Throwable -> Lb
            java.lang.StringBuffer r2 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> Lb
            r2.<init>()     // Catch: java.lang.Throwable -> Lb
            int r3 = r1.length     // Catch: java.lang.Throwable -> Lb
            r4 = 0
            r5 = 0
        L1c:
            if (r5 >= r3) goto L2f
            r6 = r1[r5]     // Catch: java.lang.Throwable -> Lb
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> Lb
            if (r7 != 0) goto L2c
            r2.append(r6)     // Catch: java.lang.Throwable -> Lb
            r2.append(r0)     // Catch: java.lang.Throwable -> Lb
        L2c:
            int r5 = r5 + 1
            goto L1c
        L2f:
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> Lb
            int r1 = r0.length()     // Catch: java.lang.Throwable -> Lb
            r2 = 1
            if (r1 <= r2) goto L46
            int r1 = r0.length()     // Catch: java.lang.Throwable -> Lb
            int r1 = r1 - r2
            java.lang.CharSequence r0 = r0.subSequence(r4, r1)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> Lb
            return r0
        L46:
            return r8
        L47:
            java.lang.String r1 = "ut"
            java.lang.String r2 = "sPa"
            com.amap.api.col.p0003l.r5.e(r0, r1, r2)
            return r8
    }

    static java.lang.String D(byte[] r2) {
            java.lang.String r2 = E(r2)     // Catch: java.lang.Throwable -> L5
            return r2
        L5:
            r2 = move-exception
            java.lang.String r0 = "ut"
            java.lang.String r1 = "csb2h"
            com.amap.api.col.p0003l.r5.e(r2, r0, r1)
            r2 = 0
            return r2
    }

    public static java.lang.String E(byte[] r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            if (r5 != 0) goto L9
            r5 = 0
            return r5
        L9:
            r1 = 0
        La:
            int r2 = r5.length
            if (r1 >= r2) goto L28
            r2 = r5[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            int r3 = r2.length()
            r4 = 1
            if (r3 != r4) goto L22
            java.lang.String r3 = "0"
            java.lang.String r2 = r3.concat(r2)
        L22:
            r0.append(r2)
            int r1 = r1 + 1
            goto La
        L28:
            java.lang.String r5 = r0.toString()
            return r5
    }

    private static void F(java.lang.String r3) {
        L0:
            int r0 = r3.length()
            r1 = 0
            r2 = 78
            if (r0 >= r2) goto L15
        L9:
            int r0 = r3.length()
            int r0 = 78 - r0
            if (r1 >= r0) goto L14
            int r1 = r1 + 1
            goto L9
        L14:
            return
        L15:
            r3.substring(r1, r2)
            java.lang.String r3 = r3.substring(r2)
            goto L0
    }

    private static byte[] G(byte[] r3) throws java.io.IOException, java.lang.Throwable {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L24
            r1.<init>()     // Catch: java.lang.Throwable -> L24
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L22
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L22
            r2.write(r3)     // Catch: java.lang.Throwable -> L1f
            r2.finish()     // Catch: java.lang.Throwable -> L1f
            byte[] r3 = r1.toByteArray()     // Catch: java.lang.Throwable -> L1f
            r2.close()
            r1.close()
            return r3
        L1f:
            r3 = move-exception
            r0 = r2
            goto L26
        L22:
            r3 = move-exception
            goto L26
        L24:
            r3 = move-exception
            r1 = r0
        L26:
            throw r3     // Catch: java.lang.Throwable -> L27
        L27:
            r3 = move-exception
            if (r0 == 0) goto L2d
            r0.close()
        L2d:
            if (r1 == 0) goto L32
            r1.close()
        L32:
            throw r3
    }

    public static com.amap.api.col.p0003l.p4 a() throws com.amap.api.col.p0003l.fk {
            com.amap.api.col.3l.p4$a r0 = new com.amap.api.col.3l.p4$a
            java.lang.String r1 = "1.0"
            java.lang.String r2 = "AMap_collection_1.0"
            java.lang.String r3 = "collection"
            r0.<init>(r3, r1, r2)
            java.lang.String r1 = "com.amap.api.collection"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            com.amap.api.col.3l.p4$a r0 = r0.b(r1)
            com.amap.api.col.3l.p4 r0 = r0.c()
            return r0
    }

    public static java.lang.String b(long r1) {
            java.lang.String r0 = "yyyyMMdd HH:mm:ss:SSS"
            java.lang.String r1 = c(r1, r0)
            return r1
    }

    public static java.lang.String c(long r2, java.lang.String r4) {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L11
            java.util.Locale r1 = java.util.Locale.CHINA     // Catch: java.lang.Throwable -> L11
            r0.<init>(r4, r1)     // Catch: java.lang.Throwable -> L11
            java.util.Date r4 = new java.util.Date     // Catch: java.lang.Throwable -> L11
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = r0.format(r4)     // Catch: java.lang.Throwable -> L11
            return r2
        L11:
            r2 = move-exception
            java.lang.String r3 = "ut"
            java.lang.String r4 = "ctt"
            com.amap.api.col.p0003l.r5.e(r2, r3, r4)
            r2 = 0
            return r2
    }

    public static java.lang.String d(android.content.Context r8) {
            java.lang.Class<android.os.Build> r0 = android.os.Build.class
            int r1 = android.os.Build.VERSION.SDK_INT
            java.lang.String r2 = "ut"
            r3 = 1
            r4 = 28
            if (r1 >= r4) goto L2f
            android.content.pm.ApplicationInfo r1 = r8.getApplicationInfo()     // Catch: java.lang.Throwable -> L29
            java.lang.Class<android.content.pm.ApplicationInfo> r5 = android.content.pm.ApplicationInfo.class
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> L29
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L29
            java.lang.String r6 = "primaryCpuAbi"
            java.lang.reflect.Field r5 = r5.getDeclaredField(r6)     // Catch: java.lang.Throwable -> L29
            r5.setAccessible(r3)     // Catch: java.lang.Throwable -> L29
            java.lang.Object r1 = r5.get(r1)     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L29
            goto L31
        L29:
            r1 = move-exception
            java.lang.String r5 = "gct"
            com.amap.api.col.p0003l.r5.e(r1, r2, r5)
        L2f:
            java.lang.String r1 = ""
        L31:
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 < r4) goto L9c
            java.lang.String r4 = "SUPPORTED_ABIS"
            java.lang.reflect.Field r4 = r0.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L4b
            r5 = 0
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Throwable -> L4b
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch: java.lang.Throwable -> L4b
            r6 = 0
            if (r4 == 0) goto L4d
            int r7 = r4.length     // Catch: java.lang.Throwable -> L4b
            if (r7 <= 0) goto L4d
            r1 = r4[r6]     // Catch: java.lang.Throwable -> L4b
            goto L4d
        L4b:
            r8 = move-exception
            goto L97
        L4d:
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L4b
            if (r4 != 0) goto L9c
            java.lang.String[] r4 = com.amap.api.col.p0003l.q4.a     // Catch: java.lang.Throwable -> L4b
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: java.lang.Throwable -> L4b
            boolean r4 = r4.contains(r1)     // Catch: java.lang.Throwable -> L4b
            if (r4 == 0) goto L9c
            android.content.pm.ApplicationInfo r8 = r8.getApplicationInfo()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r8 = r8.nativeLibraryDir     // Catch: java.lang.Throwable -> L4b
            boolean r4 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L4b
            if (r4 != 0) goto L9c
            java.lang.String r4 = java.io.File.separator     // Catch: java.lang.Throwable -> L4b
            int r4 = r8.lastIndexOf(r4)     // Catch: java.lang.Throwable -> L4b
            int r4 = r4 + r3
            java.lang.String r8 = r8.substring(r4)     // Catch: java.lang.Throwable -> L4b
            java.lang.String[] r3 = com.amap.api.col.p0003l.q4.f3825b     // Catch: java.lang.Throwable -> L4b
            java.util.List r3 = java.util.Arrays.asList(r3)     // Catch: java.lang.Throwable -> L4b
            boolean r8 = r3.contains(r8)     // Catch: java.lang.Throwable -> L4b
            if (r8 == 0) goto L9c
            java.lang.String r8 = "SUPPORTED_32_BIT_ABIS"
            java.lang.reflect.Field r8 = r0.getDeclaredField(r8)     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r8 = r8.get(r5)     // Catch: java.lang.Throwable -> L4b
            java.lang.String[] r8 = (java.lang.String[]) r8     // Catch: java.lang.Throwable -> L4b
            if (r8 == 0) goto L9c
            int r0 = r8.length     // Catch: java.lang.Throwable -> L4b
            if (r0 <= 0) goto L9c
            r8 = r8[r6]     // Catch: java.lang.Throwable -> L4b
            r1 = r8
            goto L9c
        L97:
            java.lang.String r0 = "gct_p"
            com.amap.api.col.p0003l.r5.e(r8, r2, r0)
        L9c:
            boolean r8 = android.text.TextUtils.isEmpty(r1)
            if (r8 == 0) goto La4
            java.lang.String r1 = android.os.Build.CPU_ABI
        La4:
            return r1
    }

    public static java.lang.String e(java.lang.Throwable r3) {
            r0 = 0
            java.io.StringWriter r1 = new java.io.StringWriter     // Catch: java.lang.Throwable -> L29
            r1.<init>()     // Catch: java.lang.Throwable -> L29
            java.io.PrintWriter r2 = new java.io.PrintWriter     // Catch: java.lang.Throwable -> L26
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L26
            r3.getClass()     // Catch: java.lang.Throwable -> L19
            java.lang.Throwable r3 = r3.getCause()     // Catch: java.lang.Throwable -> L19
        L12:
            if (r3 == 0) goto L1b
            java.lang.Throwable r3 = r3.getCause()     // Catch: java.lang.Throwable -> L19
            goto L12
        L19:
            goto L2c
        L1b:
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L19
            r1.close()     // Catch: java.lang.Throwable -> L22
        L22:
            r2.close()     // Catch: java.lang.Throwable -> L25
        L25:
            return r3
        L26:
            r2 = r0
            goto L2c
        L29:
            r1 = r0
            r2 = r1
        L2c:
            if (r1 == 0) goto L33
            r1.close()     // Catch: java.lang.Throwable -> L32
            goto L33
        L32:
        L33:
            if (r2 == 0) goto L38
            r2.close()     // Catch: java.lang.Throwable -> L38
        L38:
            return r0
    }

    public static java.lang.String f(java.util.Map<java.lang.String, java.lang.String> r5) {
            int r0 = r5.size()
            if (r0 != 0) goto L8
            r5 = 0
            return r5
        L8:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.util.Set r5 = r5.entrySet()     // Catch: java.lang.Throwable -> L3d
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L3d
            r1 = 1
        L16:
            boolean r2 = r5.hasNext()     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto L61
            java.lang.Object r2 = r5.next()     // Catch: java.lang.Throwable -> L3d
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L3d
            java.lang.String r3 = "="
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r2.getKey()     // Catch: java.lang.Throwable -> L3d
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L3d
            r0.append(r1)     // Catch: java.lang.Throwable -> L3d
            r0.append(r3)     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r1 = r2.getValue()     // Catch: java.lang.Throwable -> L3d
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L3d
            r0.append(r1)     // Catch: java.lang.Throwable -> L3d
            r1 = 0
            goto L16
        L3d:
            r5 = move-exception
            goto L5a
        L3f:
            java.lang.String r4 = "&"
            r0.append(r4)     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r4 = r2.getKey()     // Catch: java.lang.Throwable -> L3d
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L3d
            r0.append(r4)     // Catch: java.lang.Throwable -> L3d
            r0.append(r3)     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L3d
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L3d
            r0.append(r2)     // Catch: java.lang.Throwable -> L3d
            goto L16
        L5a:
            java.lang.String r1 = "ut"
            java.lang.String r2 = "abP"
            com.amap.api.col.p0003l.r5.e(r5, r1, r2)
        L61:
            java.lang.String r5 = r0.toString()
            return r5
    }

    public static java.lang.String g(byte[] r2) {
            if (r2 == 0) goto L14
            int r0 = r2.length
            if (r0 != 0) goto L6
            goto L14
        L6:
            java.lang.String r0 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> Le
            java.lang.String r1 = "UTF-8"
            r0.<init>(r2, r1)     // Catch: java.io.UnsupportedEncodingException -> Le
            return r0
        Le:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            return r0
        L14:
            java.lang.String r2 = ""
            return r2
    }

    public static java.util.Calendar h(java.lang.String r9, java.lang.String r10) {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch: java.text.ParseException -> L3b
            java.util.Locale r1 = java.util.Locale.CHINA     // Catch: java.text.ParseException -> L3b
            r0.<init>(r10, r1)     // Catch: java.text.ParseException -> L3b
            java.util.Calendar r2 = java.util.Calendar.getInstance()     // Catch: java.text.ParseException -> L3b
            java.util.Calendar r10 = java.util.Calendar.getInstance()     // Catch: java.text.ParseException -> L3b
            java.util.Date r9 = r0.parse(r9)     // Catch: java.text.ParseException -> L3b
            r10.setTime(r9)     // Catch: java.text.ParseException -> L3b
            r9 = 1
            int r3 = r2.get(r9)     // Catch: java.text.ParseException -> L3b
            r9 = 2
            int r4 = r2.get(r9)     // Catch: java.text.ParseException -> L3b
            r9 = 5
            int r5 = r2.get(r9)     // Catch: java.text.ParseException -> L3b
            r9 = 11
            int r6 = r10.get(r9)     // Catch: java.text.ParseException -> L3b
            r9 = 12
            int r7 = r10.get(r9)     // Catch: java.text.ParseException -> L3b
            r9 = 13
            int r8 = r10.get(r9)     // Catch: java.text.ParseException -> L3b
            r2.set(r3, r4, r5, r6, r7, r8)     // Catch: java.text.ParseException -> L3b
            return r2
        L3b:
            r0 = move-exception
            r9 = r0
            java.lang.String r10 = "ut"
            java.lang.String r0 = "ctt"
            com.amap.api.col.p0003l.r5.e(r9, r10, r0)
            r9 = 0
            return r9
    }

    public static void i(android.content.Context r8, java.lang.String r9, java.lang.String r10, org.json.JSONObject r11) {
            java.lang.String r0 = "key"
            java.lang.String r1 = "sec_code_debug"
            java.lang.String r2 = "sec_code"
            java.lang.String r3 = "info"
            java.lang.String r4 = com.amap.api.col.p0003l.f4.i(r8)
            java.lang.String r5 = com.amap.api.col.p0003l.m4.d(r4)
            java.lang.String r8 = com.amap.api.col.p0003l.f4.a(r8)
            boolean r6 = r11.has(r3)     // Catch: java.lang.Throwable -> L75
            java.lang.String r7 = ""
            if (r6 == 0) goto L21
            java.lang.String r3 = r11.getString(r3)     // Catch: java.lang.Throwable -> L75
            goto L22
        L21:
            r3 = r7
        L22:
            java.lang.String r6 = "INVALID_USER_SCODE"
            boolean r6 = r6.equals(r3)     // Catch: java.lang.Throwable -> L75
            if (r6 == 0) goto L52
            boolean r0 = r11.has(r2)     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L35
            java.lang.String r0 = r11.getString(r2)     // Catch: java.lang.Throwable -> L75
            goto L36
        L35:
            r0 = r7
        L36:
            boolean r2 = r11.has(r1)     // Catch: java.lang.Throwable -> L75
            if (r2 == 0) goto L40
            java.lang.String r7 = r11.getString(r1)     // Catch: java.lang.Throwable -> L75
        L40:
            boolean r0 = r5.equals(r0)     // Catch: java.lang.Throwable -> L75
            if (r0 != 0) goto L4c
            boolean r0 = r5.equals(r7)     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L75
        L4c:
            java.lang.String r0 = "C6K+35Zyo6auY5b635byA5pS+5bmz5Y+w5a6Y572R5Lit5pCc57Si"
            u(r0)     // Catch: java.lang.Throwable -> L75
            goto L75
        L52:
            java.lang.String r1 = "INVALID_USER_KEY"
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> L75
            if (r1 == 0) goto L75
            boolean r1 = r11.has(r0)     // Catch: java.lang.Throwable -> L75
            if (r1 == 0) goto L64
            java.lang.String r7 = r11.getString(r0)     // Catch: java.lang.Throwable -> L75
        L64:
            int r0 = r7.length()     // Catch: java.lang.Throwable -> L75
            if (r0 <= 0) goto L75
            boolean r0 = r8.equals(r7)     // Catch: java.lang.Throwable -> L75
            if (r0 != 0) goto L75
            java.lang.String r0 = "C6K+35Zyo6auY5b635byA5pS+5bmz5Y+w5a6Y572R5LiK5Y+R6LW35oqA5pyv5ZKo6K+i5bel5Y2V4oCUPui0puWPt+S4jktleemXrumimO+8jOWSqOivoklOVkFMSURfVVNFUl9LRVnlpoLkvZXop6PlhrM="
            u(r0)     // Catch: java.lang.Throwable -> L75
        L75:
            java.lang.String r0 = "SHA1Package:"
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r0 = r0.concat(r1)
            F(r0)
            java.lang.String r0 = "key:"
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r8 = r0.concat(r8)
            F(r8)
            java.lang.String r8 = "csid:"
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r8 = r8.concat(r9)
            F(r8)
            java.lang.String r8 = "gsid:"
            java.lang.String r9 = java.lang.String.valueOf(r10)
            java.lang.String r8 = r8.concat(r9)
            F(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "json:"
            r8.<init>(r9)
            java.lang.String r9 = r11.toString()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            F(r8)
            return
    }

    public static void j(java.io.ByteArrayOutputStream r2, byte r3, byte[] r4) {
            r0 = 1
            byte[] r0 = new byte[r0]     // Catch: java.io.IOException -> L1a
            r1 = 0
            r0[r1] = r3     // Catch: java.io.IOException -> L1a
            r2.write(r0)     // Catch: java.io.IOException -> L1a
            r0 = 255(0xff, float:3.57E-43)
            r3 = r3 & r0
            if (r3 >= r0) goto L14
            if (r3 <= 0) goto L14
            r2.write(r4)     // Catch: java.io.IOException -> L1a
            return
        L14:
            if (r3 != r0) goto L19
            r2.write(r4, r1, r0)     // Catch: java.io.IOException -> L1a
        L19:
            return
        L1a:
            r2 = move-exception
            java.lang.String r3 = "ut"
            java.lang.String r4 = "wFie"
            com.amap.api.col.p0003l.r5.e(r2, r3, r4)
            return
    }

    public static void k(java.io.ByteArrayOutputStream r2, java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L19
            r3 = 1
            byte[] r3 = new byte[r3]     // Catch: java.io.IOException -> L10
            r0 = 0
            r3[r0] = r0     // Catch: java.io.IOException -> L10
            r2.write(r3)     // Catch: java.io.IOException -> L10
            return
        L10:
            r2 = move-exception
            java.lang.String r3 = "ut"
            java.lang.String r0 = "wsf"
            com.amap.api.col.p0003l.r5.e(r2, r3, r0)
            return
        L19:
            int r0 = r3.length()
            r1 = 255(0xff, float:3.57E-43)
            if (r0 <= r1) goto L23
            r0 = 255(0xff, float:3.57E-43)
        L23:
            byte r0 = (byte) r0
            byte[] r3 = o(r3)
            j(r2, r0, r3)
            return
    }

    public static boolean l(android.content.Context r6, java.lang.String r7) {
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            int r1 = r6.checkCallingOrSelfPermission(r7)
            if (r1 == 0) goto Lb
            return r0
        Lb:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 1
            r3 = 23
            if (r1 < r3) goto L43
            android.content.pm.ApplicationInfo r1 = r6.getApplicationInfo()
            int r1 = r1.targetSdkVersion
            if (r1 < r3) goto L43
            java.lang.Class r1 = r6.getClass()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r3 = "checkSelfPermission"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L3b
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r0] = r5     // Catch: java.lang.Throwable -> L3b
            java.lang.reflect.Method r1 = r1.getMethod(r3, r4)     // Catch: java.lang.Throwable -> L3b
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L3b
            r3[r0] = r7     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r6 = r1.invoke(r6, r3)     // Catch: java.lang.Throwable -> L3b
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.Throwable -> L3b
            int r6 = r6.intValue()     // Catch: java.lang.Throwable -> L3b
            if (r6 == 0) goto L43
            return r0
        L3b:
            r6 = move-exception
            java.lang.String r7 = "ut"
            java.lang.String r0 = "cpm"
            com.amap.api.col.p0003l.r5.e(r6, r7, r0)
        L43:
            return r2
    }

    public static boolean m(org.json.JSONObject r0, java.lang.String r1) {
            if (r0 == 0) goto La
            boolean r0 = r0.has(r1)
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public static byte[] n(int r3) {
            int r0 = r3 / 256
            byte r0 = (byte) r0
            int r3 = r3 % 256
            byte r3 = (byte) r3
            r1 = 2
            byte[] r1 = new byte[r1]
            r2 = 0
            r1[r2] = r0
            r0 = 1
            r1[r0] = r3
            return r1
    }

    public static byte[] o(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto La
            r1 = 0
            byte[] r1 = new byte[r1]
            return r1
        La:
            java.lang.String r0 = "UTF-8"
            byte[] r1 = r1.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L11
            return r1
        L11:
            byte[] r1 = r1.getBytes()
            return r1
    }

    public static com.amap.api.col.p0003l.p4 p() throws com.amap.api.col.p0003l.fk {
            com.amap.api.col.3l.p4$a r0 = new com.amap.api.col.3l.p4$a
            java.lang.String r1 = "1.0.0"
            java.lang.String r2 = "AMap_co_1.0.0"
            java.lang.String r3 = "co"
            r0.<init>(r3, r1, r2)
            java.lang.String r1 = "com.amap.opensdk.co"
            java.lang.String r2 = "com.amap.location"
            java.lang.String r3 = "com.amap.co"
            java.lang.String[] r1 = new java.lang.String[]{r3, r1, r2}
            com.amap.api.col.3l.p4$a r0 = r0.b(r1)
            com.amap.api.col.3l.p4 r0 = r0.c()
            return r0
    }

    public static java.lang.String q(java.lang.String r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            byte[] r2 = o(r2)
            java.lang.String r2 = com.amap.api.col.p0003l.j4.i(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L25
            r0.<init>()     // Catch: java.lang.Throwable -> L25
            int r1 = r2.length()     // Catch: java.lang.Throwable -> L25
            int r1 = r1 % 26
            int r1 = r1 + 65
            char r1 = (char) r1     // Catch: java.lang.Throwable -> L25
            r0.append(r1)     // Catch: java.lang.Throwable -> L25
            r0.append(r2)     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = r0.toString()     // Catch: java.lang.Throwable -> L25
            return r2
        L25:
            r2 = move-exception
            java.lang.String r0 = "ut"
            java.lang.String r1 = "tsfb64"
            com.amap.api.col.p0003l.r5.e(r2, r0, r1)
            java.lang.String r2 = ""
            return r2
    }

    public static java.lang.String r(java.util.Map<java.lang.String, java.lang.String> r3) {
            if (r3 == 0) goto L43
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        Lf:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r3.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            int r2 = r0.length()
            if (r2 <= 0) goto L26
            java.lang.String r2 = "&"
            r0.append(r2)
        L26:
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            java.lang.String r2 = "="
            r0.append(r2)
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            goto Lf
        L3e:
            java.lang.String r3 = r0.toString()
            goto L44
        L43:
            r3 = 0
        L44:
            java.lang.String r3 = C(r3)
            return r3
    }

    public static boolean s(android.content.Context r0) {
            boolean r0 = com.amap.api.col.p0003l.p5.a(r0)
            return r0
    }

    public static byte[] t(byte[] r2) {
            byte[] r2 = G(r2)     // Catch: java.lang.Throwable -> L5
            return r2
        L5:
            r2 = move-exception
            java.lang.String r0 = "ut"
            java.lang.String r1 = "gZp"
            com.amap.api.col.p0003l.r5.e(r2, r0, r1)
            r2 = 0
            byte[] r2 = new byte[r2]
            return r2
    }

    public static java.lang.String u(java.lang.String r2) {
            int r0 = r2.length()
            r1 = 2
            if (r0 >= r1) goto La
            java.lang.String r2 = ""
            return r2
        La:
            r0 = 1
            java.lang.String r2 = r2.substring(r0)
            java.lang.String r2 = com.amap.api.col.p0003l.j4.a(r2)
            return r2
    }

    public static byte[] v() {
            java.lang.String r0 = ","
            java.lang.String r1 = "16,16,18,77,15,911,121,77,121,911,38,77,911,99,86,67,611,96,48,77,84,911,38,67,021,301,86,67,611,98,48,77,511,77,48,97,511,58,48,97,511,84,501,87,511,96,48,77,221,911,38,77,121,37,86,67,25,301,86,67,021,96,86,67,021,701,86,67,35,56,86,67,611,37,221,87"
            java.lang.StringBuffer r2 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L59
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L59
            java.lang.StringBuffer r1 = r2.reverse()     // Catch: java.lang.Throwable -> L59
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L59
            java.lang.String[] r1 = r1.split(r0)     // Catch: java.lang.Throwable -> L59
            int r2 = r1.length     // Catch: java.lang.Throwable -> L59
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L59
            r3 = 0
            r4 = 0
        L1a:
            int r5 = r1.length     // Catch: java.lang.Throwable -> L59
            if (r4 >= r5) goto L28
            r5 = r1[r4]     // Catch: java.lang.Throwable -> L59
            byte r5 = java.lang.Byte.parseByte(r5)     // Catch: java.lang.Throwable -> L59
            r2[r4] = r5     // Catch: java.lang.Throwable -> L59
            int r4 = r4 + 1
            goto L1a
        L28:
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L59
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L59
            byte[] r1 = com.amap.api.col.p0003l.j4.g(r1)     // Catch: java.lang.Throwable -> L59
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L59
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L59
            java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L59
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L59
            java.lang.StringBuffer r1 = r1.reverse()     // Catch: java.lang.Throwable -> L59
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L59
            java.lang.String[] r0 = r1.split(r0)     // Catch: java.lang.Throwable -> L59
            int r1 = r0.length     // Catch: java.lang.Throwable -> L59
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L59
        L4a:
            int r2 = r0.length     // Catch: java.lang.Throwable -> L59
            if (r3 >= r2) goto L58
            r2 = r0[r3]     // Catch: java.lang.Throwable -> L59
            byte r2 = java.lang.Byte.parseByte(r2)     // Catch: java.lang.Throwable -> L59
            r1[r3] = r2     // Catch: java.lang.Throwable -> L59
            int r3 = r3 + 1
            goto L4a
        L58:
            return r1
        L59:
            r0 = move-exception
            java.lang.String r1 = "ut"
            java.lang.String r2 = "gIV"
            com.amap.api.col.p0003l.r5.e(r0, r1, r2)
            r0 = 16
            byte[] r0 = new byte[r0]
            return r0
    }

    public static byte[] w(byte[] r8) {
            java.lang.String r0 = "zp2"
            java.lang.String r1 = "zp1"
            java.lang.String r2 = "ut"
            r3 = 0
            if (r8 == 0) goto L71
            int r4 = r8.length
            if (r4 != 0) goto Le
            goto L71
        Le:
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L45
            r4.<init>()     // Catch: java.lang.Throwable -> L45
            java.util.zip.ZipOutputStream r5 = new java.util.zip.ZipOutputStream     // Catch: java.lang.Throwable -> L42
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L42
            java.util.zip.ZipEntry r6 = new java.util.zip.ZipEntry     // Catch: java.lang.Throwable -> L40
            java.lang.String r7 = "log"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L40
            r5.putNextEntry(r6)     // Catch: java.lang.Throwable -> L40
            r5.write(r8)     // Catch: java.lang.Throwable -> L40
            r5.closeEntry()     // Catch: java.lang.Throwable -> L40
            r5.finish()     // Catch: java.lang.Throwable -> L40
            byte[] r3 = r4.toByteArray()     // Catch: java.lang.Throwable -> L40
            r5.close()     // Catch: java.lang.Throwable -> L33
            goto L37
        L33:
            r8 = move-exception
            com.amap.api.col.p0003l.r5.e(r8, r2, r1)
        L37:
            r4.close()     // Catch: java.lang.Throwable -> L3b
            goto L5a
        L3b:
            r8 = move-exception
            com.amap.api.col.p0003l.r5.e(r8, r2, r0)
            goto L5a
        L40:
            r8 = move-exception
            goto L48
        L42:
            r8 = move-exception
            r5 = r3
            goto L48
        L45:
            r8 = move-exception
            r4 = r3
            r5 = r4
        L48:
            java.lang.String r6 = "zp"
            com.amap.api.col.p0003l.r5.e(r8, r2, r6)     // Catch: java.lang.Throwable -> L5b
            if (r5 == 0) goto L57
            r5.close()     // Catch: java.lang.Throwable -> L53
            goto L57
        L53:
            r8 = move-exception
            com.amap.api.col.p0003l.r5.e(r8, r2, r1)
        L57:
            if (r4 == 0) goto L5a
            goto L37
        L5a:
            return r3
        L5b:
            r8 = move-exception
            if (r5 == 0) goto L66
            r5.close()     // Catch: java.lang.Throwable -> L62
            goto L66
        L62:
            r3 = move-exception
            com.amap.api.col.p0003l.r5.e(r3, r2, r1)
        L66:
            if (r4 == 0) goto L70
            r4.close()     // Catch: java.lang.Throwable -> L6c
            goto L70
        L6c:
            r1 = move-exception
            com.amap.api.col.p0003l.r5.e(r1, r2, r0)
        L70:
            throw r8
        L71:
            return r3
    }

    static java.security.PublicKey x() throws java.security.cert.CertificateException, java.security.spec.InvalidKeySpecException, java.security.NoSuchAlgorithmException, java.lang.NullPointerException, java.io.IOException {
            java.lang.String r0 = "MIICnjCCAgegAwIBAgIJAJ0Pdzos7ZfYMA0GCSqGSIb3DQEBBQUAMGgxCzAJBgNVBAYTAkNOMRMwEQYDVQQIDApTb21lLVN0YXRlMRAwDgYDVQQHDAdCZWlqaW5nMREwDwYDVQQKDAhBdXRvbmF2aTEfMB0GA1UEAwwWY29tLmF1dG9uYXZpLmFwaXNlcnZlcjAeFw0xMzA4MTUwNzU2NTVaFw0yMzA4MTMwNzU2NTVaMGgxCzAJBgNVBAYTAkNOMRMwEQYDVQQIDApTb21lLVN0YXRlMRAwDgYDVQQHDAdCZWlqaW5nMREwDwYDVQQKDAhBdXRvbmF2aTEfMB0GA1UEAwwWY29tLmF1dG9uYXZpLmFwaXNlcnZlcjCBnzANBgkqhkiG9w0BAQEFAAOBjQAwgYkCgYEA8eWAyHbFPoFPfdx5AD+D4nYFq4dbJ1p7SIKt19Oz1oivF/6H43v5Fo7s50pD1UF8+Qu4JoUQxlAgOt8OCyQ8DYdkaeB74XKb1wxkIYg/foUwN1CMHPZ9O9ehgna6K4EJXZxR7Y7XVZnbjHZIVn3VpPU/Rdr2v37LjTw+qrABJxMCAwEAAaNQME4wHQYDVR0OBBYEFOM/MLGP8xpVFuVd+3qZkw7uBvOTMB8GA1UdIwQYMBaAFOM/MLGP8xpVFuVd+3qZkw7uBvOTMAwGA1UdEwQFMAMBAf8wDQYJKoZIhvcNAQEFBQADgYEA4LY3g8aAD8JkxAOqUXDDyLuCCGOc2pTIhn0TwMNaVdH4hZlpTeC/wuRD5LJ0z3j+IQ0vLvuQA5uDjVyEOlBrvVIGwSem/1XGUo13DfzgAJ5k1161S5l+sFUo5TxpHOXr8Z5nqJMjieXmhnE/I99GFyHpQmw4cC6rhYUhdhtg+Zk="
            r1 = 0
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L44
            byte[] r0 = com.amap.api.col.p0003l.j4.g(r0)     // Catch: java.lang.Throwable -> L44
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L44
            java.lang.String r0 = "IWC41MDk"
            java.lang.String r0 = u(r0)     // Catch: java.lang.Throwable -> L3e
            java.security.cert.CertificateFactory r0 = java.security.cert.CertificateFactory.getInstance(r0)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r3 = "EUlNB"
            java.lang.String r3 = u(r3)     // Catch: java.lang.Throwable -> L3e
            java.security.KeyFactory r3 = java.security.KeyFactory.getInstance(r3)     // Catch: java.lang.Throwable -> L3e
            java.security.cert.Certificate r0 = r0.generateCertificate(r2)     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L40
            if (r3 != 0) goto L29
            goto L40
        L29:
            java.security.spec.X509EncodedKeySpec r4 = new java.security.spec.X509EncodedKeySpec     // Catch: java.lang.Throwable -> L3e
            java.security.PublicKey r0 = r0.getPublicKey()     // Catch: java.lang.Throwable -> L3e
            byte[] r0 = r0.getEncoded()     // Catch: java.lang.Throwable -> L3e
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L3e
            java.security.PublicKey r0 = r3.generatePublic(r4)     // Catch: java.lang.Throwable -> L3e
            r2.close()     // Catch: java.lang.Throwable -> L3d
        L3d:
            return r0
        L3e:
            goto L46
        L40:
            r2.close()     // Catch: java.lang.Throwable -> L43
        L43:
            return r1
        L44:
            r2 = r1
        L46:
            if (r2 == 0) goto L4b
            r2.close()     // Catch: java.lang.Throwable -> L4b
        L4b:
            return r1
    }

    public static byte[] y(java.lang.String r5) {
            int r0 = r5.length()
            int r0 = r0 % 2
            if (r0 == 0) goto Le
            java.lang.String r0 = "0"
            java.lang.String r5 = r0.concat(r5)
        Le:
            int r0 = r5.length()
            int r0 = r0 / 2
            byte[] r1 = new byte[r0]
            r2 = 0
        L17:
            if (r2 >= r0) goto L2d
            int r3 = r2 * 2
            int r4 = r3 + 2
            java.lang.String r3 = r5.substring(r3, r4)
            r4 = 16
            int r3 = java.lang.Integer.parseInt(r3, r4)
            byte r3 = (byte) r3
            r1[r2] = r3
            int r2 = r2 + 1
            goto L17
        L2d:
            return r1
    }

    public static byte[] z(byte[] r0) {
            byte[] r0 = G(r0)     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = 0
            byte[] r0 = new byte[r0]
            return r0
    }
}
