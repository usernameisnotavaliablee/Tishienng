package cn.jiguang.commons.L;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class ad {
    private static java.lang.Class a;

    /* renamed from: c, reason: collision with root package name */
    private static java.lang.reflect.Method f858c;

    public ad() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L7
            return r3
        L7:
            char[] r3 = r3.toCharArray()
            r0 = 0
        Lc:
            int r1 = r3.length
            if (r0 >= r1) goto L1b
            char r1 = r3[r0]
            r2 = 498753498(0x1dba5fda, float:4.93329E-21)
            r1 = r1 ^ r2
            char r1 = (char) r1
            r3[r0] = r1
            int r0 = r0 + 1
            goto Lc
        L1b:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
            return r0
    }

    public static java.lang.String a(java.lang.String r7, java.lang.String r8) {
            java.lang.Class r0 = cn.jiguang.commons.L.ad.a     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto Lc
            java.lang.String r0 = "android.os.SystemProperties"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L35
            cn.jiguang.commons.L.ad.a = r0     // Catch: java.lang.Throwable -> L35
        Lc:
            java.lang.reflect.Method r0 = cn.jiguang.commons.L.ad.f858c     // Catch: java.lang.Throwable -> L35
            r1 = 1
            r2 = 0
            r3 = 2
            if (r0 != 0) goto L25
            java.lang.Class r0 = cn.jiguang.commons.L.ad.a     // Catch: java.lang.Throwable -> L35
            java.lang.String r4 = "get"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r2] = r6     // Catch: java.lang.Throwable -> L35
            r5[r1] = r6     // Catch: java.lang.Throwable -> L35
            java.lang.reflect.Method r0 = r0.getMethod(r4, r5)     // Catch: java.lang.Throwable -> L35
            cn.jiguang.commons.L.ad.f858c = r0     // Catch: java.lang.Throwable -> L35
        L25:
            java.lang.reflect.Method r0 = cn.jiguang.commons.L.ad.f858c     // Catch: java.lang.Throwable -> L35
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L35
            r3[r2] = r7     // Catch: java.lang.Throwable -> L35
            r3[r1] = r8     // Catch: java.lang.Throwable -> L35
            r7 = 0
            java.lang.Object r7 = r0.invoke(r7, r3)     // Catch: java.lang.Throwable -> L35
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L35
            return r7
        L35:
            return r8
    }

    public static java.lang.String a(java.lang.String r2, boolean r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r1 = ""
            if (r0 == 0) goto L9
            return r1
        L9:
            r0 = 2
            byte[] r2 = android.util.Base64.decode(r2, r0)     // Catch: java.lang.Throwable -> L21
            if (r3 == 0) goto L14
            byte[] r2 = a(r2)     // Catch: java.lang.Throwable -> L21
        L14:
            java.lang.String r3 = cn.jiguang.commons.a.d.c.f959d     // Catch: java.lang.Throwable -> L21
            r0 = 0
            byte[] r2 = cn.jiguang.commons.L.z.a(r2, r3, r3, r0)     // Catch: java.lang.Throwable -> L21
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L21
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L21
            return r3
        L21:
            return r1
    }

    public static java.util.ArrayList a(org.json.JSONArray r8) {
            r0 = 0
            if (r8 == 0) goto L5d
            int r1 = r8.length()
            if (r1 != 0) goto La
            goto L5d
        La:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L5d
            r1.<init>()     // Catch: java.lang.Throwable -> L5d
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5d
            r2.<init>()     // Catch: java.lang.Throwable -> L5d
            r3 = 0
            r4 = 0
        L16:
            int r5 = r8.length()     // Catch: java.lang.Throwable -> L5d
            if (r3 >= r5) goto L53
            org.json.JSONObject r5 = r8.optJSONObject(r3)     // Catch: java.lang.Throwable -> L5d
            if (r5 == 0) goto L50
            int r6 = r5.length()     // Catch: java.lang.Throwable -> L5d
            if (r6 != 0) goto L29
            goto L50
        L29:
            java.lang.String r6 = r5.toString()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r7 = "UTF-8"
            byte[] r6 = r6.getBytes(r7)     // Catch: java.lang.Throwable -> L5d
            int r6 = r6.length     // Catch: java.lang.Throwable -> L5d
            int r4 = r4 + r6
            r7 = 102400(0x19000, float:1.43493E-40)
            if (r4 <= r7) goto L4d
            int r4 = r1.length()     // Catch: java.lang.Throwable -> L5d
            if (r4 <= 0) goto L43
            r2.add(r1)     // Catch: java.lang.Throwable -> L5d
        L43:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L5d
            r1.<init>()     // Catch: java.lang.Throwable -> L5d
            r1.put(r5)     // Catch: java.lang.Throwable -> L5d
            r4 = r6
            goto L50
        L4d:
            r1.put(r5)     // Catch: java.lang.Throwable -> L5d
        L50:
            int r3 = r3 + 1
            goto L16
        L53:
            int r8 = r1.length()     // Catch: java.lang.Throwable -> L5d
            if (r8 <= 0) goto L5c
            r2.add(r1)     // Catch: java.lang.Throwable -> L5d
        L5c:
            return r2
        L5d:
            return r0
    }

    public static java.util.Map a(org.json.JSONObject r4) {
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Iterator r1 = r4.keys()     // Catch: org.json.JSONException -> L23
        Ld:
            boolean r2 = r1.hasNext()     // Catch: org.json.JSONException -> L23
            if (r2 == 0) goto L23
            java.lang.Object r2 = r1.next()     // Catch: org.json.JSONException -> L23
            java.lang.String r2 = (java.lang.String) r2     // Catch: org.json.JSONException -> L23
            java.lang.Object r3 = r4.get(r2)     // Catch: org.json.JSONException -> L23
            java.lang.String r3 = (java.lang.String) r3     // Catch: org.json.JSONException -> L23
            r0.put(r2, r3)     // Catch: org.json.JSONException -> L23
            goto Ld
        L23:
            return r0
    }

    public static void a(java.io.Closeable r0) {
            if (r0 == 0) goto L5
            r0.close()     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public static boolean a(java.lang.Object r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof java.util.Collection
            r2 = 1
            if (r1 == 0) goto L11
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
        Lf:
            r3 = r3 ^ r2
            return r3
        L11:
            boolean r1 = r3 instanceof java.util.Map
            if (r1 == 0) goto L1c
            java.util.Map r3 = (java.util.Map) r3
            boolean r3 = r3.isEmpty()
            goto Lf
        L1c:
            boolean r1 = r3 instanceof org.json.JSONObject
            if (r1 == 0) goto L2a
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            int r3 = r3.length()
            if (r3 <= 0) goto L29
            return r2
        L29:
            return r0
        L2a:
            boolean r1 = r3 instanceof org.json.JSONArray
            if (r1 == 0) goto L38
            org.json.JSONArray r3 = (org.json.JSONArray) r3
            int r3 = r3.length()
            if (r3 <= 0) goto L37
            return r2
        L37:
            return r0
        L38:
            boolean r1 = r3 instanceof java.lang.String
            if (r1 == 0) goto L43
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            goto Lf
        L43:
            java.lang.Class r1 = r3.getClass()
            boolean r1 = r1.isArray()
            if (r1 == 0) goto Lb0
            boolean r1 = r3 instanceof java.lang.Object[]
            if (r1 == 0) goto L58
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            int r3 = r3.length
            if (r3 <= 0) goto L57
            return r2
        L57:
            return r0
        L58:
            boolean r1 = r3 instanceof int[]
            if (r1 == 0) goto L63
            int[] r3 = (int[]) r3
            int r3 = r3.length
            if (r3 <= 0) goto L62
            return r2
        L62:
            return r0
        L63:
            boolean r1 = r3 instanceof long[]
            if (r1 == 0) goto L6e
            long[] r3 = (long[]) r3
            int r3 = r3.length
            if (r3 <= 0) goto L6d
            return r2
        L6d:
            return r0
        L6e:
            boolean r1 = r3 instanceof double[]
            if (r1 == 0) goto L79
            double[] r3 = (double[]) r3
            int r3 = r3.length
            if (r3 <= 0) goto L78
            return r2
        L78:
            return r0
        L79:
            boolean r1 = r3 instanceof float[]
            if (r1 == 0) goto L84
            float[] r3 = (float[]) r3
            int r3 = r3.length
            if (r3 <= 0) goto L83
            return r2
        L83:
            return r0
        L84:
            boolean r1 = r3 instanceof boolean[]
            if (r1 == 0) goto L8f
            boolean[] r3 = (boolean[]) r3
            int r3 = r3.length
            if (r3 <= 0) goto L8e
            return r2
        L8e:
            return r0
        L8f:
            boolean r1 = r3 instanceof byte[]
            if (r1 == 0) goto L9a
            byte[] r3 = (byte[]) r3
            int r3 = r3.length
            if (r3 <= 0) goto L99
            return r2
        L99:
            return r0
        L9a:
            boolean r1 = r3 instanceof char[]
            if (r1 == 0) goto La5
            char[] r3 = (char[]) r3
            int r3 = r3.length
            if (r3 <= 0) goto La4
            return r2
        La4:
            return r0
        La5:
            boolean r1 = r3 instanceof short[]
            if (r1 == 0) goto Lb0
            short[] r3 = (short[]) r3
            int r3 = r3.length
            if (r3 <= 0) goto Laf
            return r2
        Laf:
            return r0
        Lb0:
            return r2
    }

    public static byte[] a(byte[] r6) {
            if (r6 == 0) goto L44
            int r0 = r6.length
            if (r0 != 0) goto L6
            goto L44
        L6:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r6)
            r6 = 0
            java.util.zip.GZIPInputStream r2 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L39
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L39
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
            goto L35
        L27:
            byte[] r6 = r0.toByteArray()     // Catch: java.lang.Throwable -> L25
            a(r0)
            a(r1)
            a(r2)
            return r6
        L35:
            r5 = r2
            r2 = r6
            r6 = r5
            goto L3a
        L39:
            r2 = move-exception
        L3a:
            a(r0)
            a(r1)
            a(r6)
            throw r2
        L44:
            return r6
    }

    public static java.lang.String c(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r1 = ""
            if (r0 == 0) goto L9
            return r1
        L9:
            java.lang.String r0 = "[^\\w#$@\\-一-龥]+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.util.regex.Matcher r2 = r0.matcher(r2)
            java.lang.String r2 = r2.replaceAll(r1)
            return r2
    }

    public static java.lang.String c(java.lang.String r1, boolean r2) {
            java.lang.String r0 = "UTF-8"
            byte[] r1 = r1.getBytes(r0)     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto Lc
            byte[] r1 = c(r1)     // Catch: java.lang.Throwable -> L19
        Lc:
            java.lang.String r2 = cn.jiguang.commons.a.d.c.f959d     // Catch: java.lang.Throwable -> L19
            r0 = 1
            byte[] r1 = cn.jiguang.commons.L.z.a(r1, r2, r2, r0)     // Catch: java.lang.Throwable -> L19
            r2 = 2
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r2)     // Catch: java.lang.Throwable -> L19
            return r1
        L19:
            java.lang.String r1 = ""
            return r1
    }

    public static byte[] c(byte[] r3) {
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

    public static java.lang.String d(java.lang.String r1) {
            java.lang.String r0 = cn.jiguang.commons.a.d.c.f959d
            java.lang.String r1 = cn.jiguang.commons.L.z.a(r1, r0)
            return r1
    }

    public static java.lang.String e(java.lang.String r1) {
            java.lang.String r0 = cn.jiguang.commons.a.d.c.f959d
            java.lang.String r1 = cn.jiguang.commons.L.z.c(r1, r0)
            return r1
    }

    public static java.lang.String f(java.lang.String r1) {
            java.lang.String r0 = ""
            java.lang.String r1 = a(r1, r0)
            return r1
    }

    public static boolean g(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.String r0 = "([A-Fa-f0-9]{2}[-:]){5,}[A-Fa-f0-9]{2}"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch: java.lang.Throwable -> L17
            java.util.regex.Matcher r1 = r0.matcher(r1)     // Catch: java.lang.Throwable -> L17
            boolean r1 = r1.matches()     // Catch: java.lang.Throwable -> L17
            return r1
        L17:
            r1 = 1
            return r1
    }
}
