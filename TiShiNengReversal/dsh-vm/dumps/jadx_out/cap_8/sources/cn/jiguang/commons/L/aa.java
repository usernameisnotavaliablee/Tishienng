package cn.jiguang.commons.L;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class aa {
    private static final byte[] a = null;

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f851c = null;

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f852d = null;

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f853e = null;

    /* renamed from: f, reason: collision with root package name */
    private static final byte[] f854f = null;

    static {
            r0 = 17
            byte[] r0 = new byte[r0]
            r0 = {x002e: FILL_ARRAY_DATA , data: [90, 65, 111, 105, 56, 125, 81, 78, 126, 38, 68, 100, 94, 84, 112, 101, 115} // fill-array
            cn.jiguang.commons.L.aa.a = r0
            r0 = 10
            byte[] r0 = new byte[r0]
            r0 = {x003c: FILL_ARRAY_DATA , data: [118, 85, 84, 75, 125, 120, 101, 89, 77, 124} // fill-array
            cn.jiguang.commons.L.aa.f851c = r0
            r0 = 4
            byte[] r0 = new byte[r0]
            r0 = {x0046: FILL_ARRAY_DATA , data: [116, 72, 69, 122} // fill-array
            cn.jiguang.commons.L.aa.f852d = r0
            r0 = 14
            byte[] r0 = new byte[r0]
            r0 = {x004c: FILL_ARRAY_DATA , data: [39, 101, 104, 67, 84, 124, 101, 57, 115, 89, 78, 54, 123, 126} // fill-array
            cn.jiguang.commons.L.aa.f853e = r0
            r0 = 15
            byte[] r0 = new byte[r0]
            r0 = {x0058: FILL_ARRAY_DATA , data: [102, 124, 16, 76, 112, 123, 98, 49, 64, 65, 122, 99, 119, 118, 85} // fill-array
            cn.jiguang.commons.L.aa.f854f = r0
            return
    }

    public aa() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.Process a(java.lang.Object[] r8) {
            r0 = 0
            byte[] r1 = cn.jiguang.commons.L.aa.a     // Catch: java.lang.Throwable -> L38
            java.lang.String r1 = cn.jiguang.commons.L.n.c(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L38
            byte[] r2 = cn.jiguang.commons.L.aa.f851c     // Catch: java.lang.Throwable -> L38
            java.lang.String r2 = cn.jiguang.commons.L.n.c(r2)     // Catch: java.lang.Throwable -> L38
            java.lang.reflect.Method r2 = r1.getDeclaredMethod(r2, r0)     // Catch: java.lang.Throwable -> L38
            r3 = 1
            r2.setAccessible(r3)     // Catch: java.lang.Throwable -> L38
            java.lang.Object r2 = r2.invoke(r0, r0)     // Catch: java.lang.Throwable -> L38
            byte[] r4 = cn.jiguang.commons.L.aa.f852d     // Catch: java.lang.Throwable -> L38
            java.lang.String r4 = cn.jiguang.commons.L.n.c(r4)     // Catch: java.lang.Throwable -> L38
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L38
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r7 = 0
            r5[r7] = r6     // Catch: java.lang.Throwable -> L38
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r4, r5)     // Catch: java.lang.Throwable -> L38
            r1.setAccessible(r3)     // Catch: java.lang.Throwable -> L38
            java.lang.Object r8 = r1.invoke(r2, r8)     // Catch: java.lang.Throwable -> L38
            java.lang.Process r8 = (java.lang.Process) r8     // Catch: java.lang.Throwable -> L38
            return r8
        L38:
            return r0
    }

    public static java.util.List a() {
            byte[] r0 = cn.jiguang.commons.L.aa.f854f
            java.lang.String r0 = cn.jiguang.commons.L.n.c(r0)
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r1 = 1
            java.util.List r0 = a(r0, r1)
            if (r0 == 0) goto L4d
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L18
            goto L4d
        L18:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
        L1e:
            int r3 = r0.size()
            if (r2 >= r3) goto L4c
            java.lang.Object r3 = r0.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L49
            java.lang.String r4 = "package:"
            boolean r4 = r3.startsWith(r4)
            if (r4 != 0) goto L39
            goto L49
        L39:
            r4 = 8
            java.lang.String r3 = r3.substring(r4)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L46
            goto L49
        L46:
            r1.add(r3)
        L49:
            int r2 = r2 + 1
            goto L1e
        L4c:
            return r1
        L4d:
            r0 = 0
            return r0
    }

    public static java.util.List a(java.lang.String[] r8, int r9) {
            java.lang.String r0 = "executeCommand "
            java.lang.String r1 = "JCommonShellHelper"
            r2 = 0
            if (r9 == 0) goto Ld
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            goto Le
        Ld:
            r3 = r2
        Le:
            java.lang.Process r2 = a(r8)     // Catch: java.lang.Throwable -> L13
            goto L30
        L13:
            int r4 = r8.length     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L54
            r5 = 2
            int r4 = r4 + r5
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L54
            byte[] r6 = cn.jiguang.commons.L.aa.f853e     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L54
            java.lang.String r6 = cn.jiguang.commons.L.n.c(r6)     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L54
            java.lang.String r7 = "-c"
            java.lang.String[] r6 = new java.lang.String[]{r6, r7}     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L54
            r7 = 0
            java.lang.System.arraycopy(r6, r7, r4, r7, r5)     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L54
            int r6 = r8.length     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L54
            java.lang.System.arraycopy(r8, r7, r4, r5, r6)     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L54
            java.lang.Process r2 = a(r4)     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L54
        L30:
            if (r9 == 0) goto L5f
            if (r2 == 0) goto L5f
            java.io.BufferedReader r9 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L54
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L54
            java.io.InputStream r5 = r2.getInputStream()     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L54
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L54
            r9.<init>(r4)     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L54
        L42:
            java.lang.String r4 = r9.readLine()     // Catch: java.lang.Throwable -> L4c
            if (r4 == 0) goto L4e
            r3.add(r4)     // Catch: java.lang.Throwable -> L4c
            goto L42
        L4c:
            r4 = move-exception
            goto L56
        L4e:
            r9.close()     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L54
            goto L5f
        L52:
            r9 = move-exception
            goto L65
        L54:
            r9 = move-exception
            goto L8c
        L56:
            r9.close()     // Catch: java.lang.Throwable -> L5a
            goto L5e
        L5a:
            r9 = move-exception
            r4.addSuppressed(r9)     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L54
        L5e:
            throw r4     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L54
        L5f:
            if (r2 == 0) goto Lb4
        L61:
            r2.exitValue()     // Catch: java.lang.IllegalThreadStateException -> Lb1
            goto Lb4
        L65:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8a
            r4.<init>()     // Catch: java.lang.Throwable -> L8a
            r4.append(r0)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r8 = java.util.Arrays.toString(r8)     // Catch: java.lang.Throwable -> L8a
            r4.append(r8)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r8 = " throwable: "
            r4.append(r8)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r8 = r9.getMessage()     // Catch: java.lang.Throwable -> L8a
            r4.append(r8)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r8 = r4.toString()     // Catch: java.lang.Throwable -> L8a
            cn.jiguang.commons.w.a.f(r1, r8)     // Catch: java.lang.Throwable -> L8a
            if (r2 == 0) goto Lb4
            goto L61
        L8a:
            r8 = move-exception
            goto Lb5
        L8c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8a
            r4.<init>()     // Catch: java.lang.Throwable -> L8a
            r4.append(r0)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r8 = java.util.Arrays.toString(r8)     // Catch: java.lang.Throwable -> L8a
            r4.append(r8)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r8 = " exception: "
            r4.append(r8)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r8 = r9.getMessage()     // Catch: java.lang.Throwable -> L8a
            r4.append(r8)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r8 = r4.toString()     // Catch: java.lang.Throwable -> L8a
            cn.jiguang.commons.w.a.f(r1, r8)     // Catch: java.lang.Throwable -> L8a
            if (r2 == 0) goto Lb4
            goto L61
        Lb1:
            r2.destroy()
        Lb4:
            return r3
        Lb5:
            if (r2 == 0) goto Lbe
            r2.exitValue()     // Catch: java.lang.IllegalThreadStateException -> Lbb
            goto Lbe
        Lbb:
            r2.destroy()
        Lbe:
            throw r8
    }
}
