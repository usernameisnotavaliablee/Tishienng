package cn.jiguang.u;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class d {
    private static final java.text.SimpleDateFormat a = null;

    static {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "EEE, d MMM yyyy HH:mm:ss z"
            java.util.Locale r2 = java.util.Locale.ENGLISH
            r0.<init>(r1, r2)
            cn.jiguang.u.d.a = r0
            return
    }

    public d() {
            r1 = this;
            r1.<init>()
            return
    }

    private static java.io.File a(java.lang.String r1, byte[] r2) {
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            java.io.File r1 = r0.getParentFile()
            boolean r1 = r1.exists()
            if (r1 != 0) goto L12
            r0.mkdirs()
        L12:
            boolean r1 = r0.exists()
            if (r1 == 0) goto L1b
            r0.delete()
        L1b:
            r0.createNewFile()
            java.io.FileOutputStream r1 = new java.io.FileOutputStream
            r1.<init>(r0)
            r1.write(r2)     // Catch: java.lang.Throwable -> L2d
            r1.flush()     // Catch: java.lang.Throwable -> L2d
            r1.close()
            return r0
        L2d:
            r2 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L32
            goto L36
        L32:
            r1 = move-exception
            r2.addSuppressed(r1)
        L36:
            throw r2
    }

    public static java.lang.String a(android.content.Context r6, java.lang.String r7, int r8, java.lang.String r9) {
            java.lang.String r0 = "httpPost:"
            java.lang.String r1 = "HttpUtils"
            r2 = 0
            boolean r3 = cn.jiguang.u.f.b(r6)     // Catch: java.lang.Throwable -> L25
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L25
            r4.<init>()     // Catch: java.lang.Throwable -> L25
            java.lang.String r5 = " https sdk continueBusiness="
            r4.append(r5)     // Catch: java.lang.Throwable -> L25
            r4.append(r3)     // Catch: java.lang.Throwable -> L25
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L25
            cn.jiguang.t.b.e(r1, r4)     // Catch: java.lang.Throwable -> L25
            if (r3 != 0) goto L27
            java.lang.String r6 = " https sdk limit"
            cn.jiguang.t.b.e(r1, r6)     // Catch: java.lang.Throwable -> L25
            return r2
        L25:
            r6 = move-exception
            goto L8f
        L27:
            java.net.HttpURLConnection r3 = a(r7)     // Catch: java.lang.Throwable -> L25
            java.lang.String r4 = "Content-Type"
            java.lang.String r5 = "application/json"
            r3.setRequestProperty(r4, r5)     // Catch: java.lang.Throwable -> L25
            r3.setConnectTimeout(r8)     // Catch: java.lang.Throwable -> L25
            r3.setReadTimeout(r8)     // Catch: java.lang.Throwable -> L25
            java.lang.String r8 = "POST"
            r3.setRequestMethod(r8)     // Catch: java.lang.Throwable -> L25
            r8 = 1
            r3.setDoOutput(r8)     // Catch: java.lang.Throwable -> L25
            r3.setDoInput(r8)     // Catch: java.lang.Throwable -> L25
            byte[] r8 = r9.getBytes()     // Catch: java.lang.Throwable -> L25
            java.io.OutputStream r9 = r3.getOutputStream()     // Catch: java.lang.Throwable -> L25
            r9.write(r8)     // Catch: java.lang.Throwable -> L25
            int r9 = r3.getResponseCode()     // Catch: java.lang.Throwable -> L25
            java.io.InputStream r3 = r3.getInputStream()     // Catch: java.lang.Throwable -> L25
            byte[] r3 = a(r3)     // Catch: java.lang.Throwable -> L25
            int r8 = r8.length     // Catch: java.lang.Throwable -> L25
            long r4 = (long) r8     // Catch: java.lang.Throwable -> L25
            if (r3 == 0) goto L61
            int r8 = r3.length     // Catch: java.lang.Throwable -> L25
            goto L62
        L61:
            r8 = 0
        L62:
            cn.jiguang.u.f.a(r6, r7, r4, r8)     // Catch: java.lang.Throwable -> L25
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L25
            r6.<init>()     // Catch: java.lang.Throwable -> L25
            r6.append(r0)     // Catch: java.lang.Throwable -> L25
            r6.append(r7)     // Catch: java.lang.Throwable -> L25
            java.lang.String r8 = " responseCode:"
            r6.append(r8)     // Catch: java.lang.Throwable -> L25
            r6.append(r9)     // Catch: java.lang.Throwable -> L25
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L25
            cn.jiguang.t.b.e(r1, r6)     // Catch: java.lang.Throwable -> L25
            r6 = 200(0xc8, float:2.8E-43)
            if (r6 == r9) goto L84
            return r2
        L84:
            if (r3 == 0) goto L8e
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L25
            java.lang.String r8 = "UTF-8"
            r6.<init>(r3, r8)     // Catch: java.lang.Throwable -> L25
            return r6
        L8e:
            return r2
        L8f:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r0)
            r8.append(r7)
            java.lang.String r7 = " fail."
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            cn.jiguang.t.b.a(r1, r7, r6)
            return r2
    }

    public static java.net.HttpURLConnection a(java.lang.String r1) {
            java.net.URL r0 = new java.net.URL
            r0.<init>(r1)
            java.net.URLConnection r1 = r0.openConnection()
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1
            return r1
    }

    public static byte[] a(java.io.InputStream r6) {
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L26
            r1.<init>()     // Catch: java.lang.Throwable -> L26
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L16
        La:
            int r3 = r6.read(r2)     // Catch: java.lang.Throwable -> L16
            r4 = -1
            if (r3 == r4) goto L18
            r4 = 0
            r1.write(r2, r4, r3)     // Catch: java.lang.Throwable -> L16
            goto La
        L16:
            r2 = move-exception
            goto L28
        L18:
            r1.flush()     // Catch: java.lang.Throwable -> L16
            byte[] r0 = r1.toByteArray()     // Catch: java.lang.Throwable -> L16
            r6.close()
            r1.close()
            return r0
        L26:
            r2 = move-exception
            r1 = r0
        L28:
            java.lang.String r3 = "HttpUtils"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4d
            r4.<init>()     // Catch: java.lang.Throwable -> L4d
            java.lang.String r5 = " readInputStream failed , error is : "
            r4.append(r5)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L4d
            r4.append(r2)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> L4d
            cn.jiguang.t.b.a(r3, r2)     // Catch: java.lang.Throwable -> L4d
            if (r6 == 0) goto L47
            r6.close()
        L47:
            if (r1 == 0) goto L4c
            r1.close()
        L4c:
            return r0
        L4d:
            r0 = move-exception
            if (r6 == 0) goto L53
            r6.close()
        L53:
            if (r1 == 0) goto L58
            r1.close()
        L58:
            throw r0
    }

    public static java.io.File b(android.content.Context r7, java.lang.String r8, int r9, java.lang.String r10) {
            java.lang.String r0 = "download:"
            java.lang.String r1 = "HttpUtils"
            r2 = 0
            boolean r3 = cn.jiguang.u.f.b(r7)     // Catch: java.lang.Throwable -> L25
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L25
            r4.<init>()     // Catch: java.lang.Throwable -> L25
            java.lang.String r5 = " https download continueBusiness="
            r4.append(r5)     // Catch: java.lang.Throwable -> L25
            r4.append(r3)     // Catch: java.lang.Throwable -> L25
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L25
            cn.jiguang.t.b.e(r1, r4)     // Catch: java.lang.Throwable -> L25
            if (r3 != 0) goto L27
            java.lang.String r7 = " https sdk limit"
            cn.jiguang.t.b.e(r1, r7)     // Catch: java.lang.Throwable -> L25
            return r2
        L25:
            r7 = move-exception
            goto L6b
        L27:
            java.net.HttpURLConnection r3 = a(r8)     // Catch: java.lang.Throwable -> L25
            r3.setConnectTimeout(r9)     // Catch: java.lang.Throwable -> L25
            r3.setReadTimeout(r9)     // Catch: java.lang.Throwable -> L25
            int r9 = r3.getResponseCode()     // Catch: java.lang.Throwable -> L25
            java.io.InputStream r3 = r3.getInputStream()     // Catch: java.lang.Throwable -> L25
            byte[] r3 = a(r3)     // Catch: java.lang.Throwable -> L25
            if (r3 == 0) goto L41
            int r4 = r3.length     // Catch: java.lang.Throwable -> L25
            goto L42
        L41:
            r4 = 0
        L42:
            r5 = 0
            cn.jiguang.u.f.a(r7, r8, r5, r4)     // Catch: java.lang.Throwable -> L25
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L25
            r7.<init>()     // Catch: java.lang.Throwable -> L25
            r7.append(r0)     // Catch: java.lang.Throwable -> L25
            r7.append(r8)     // Catch: java.lang.Throwable -> L25
            java.lang.String r4 = " responseCode:"
            r7.append(r4)     // Catch: java.lang.Throwable -> L25
            r7.append(r9)     // Catch: java.lang.Throwable -> L25
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L25
            cn.jiguang.t.b.e(r1, r7)     // Catch: java.lang.Throwable -> L25
            r7 = 200(0xc8, float:2.8E-43)
            if (r7 == r9) goto L66
            return r2
        L66:
            java.io.File r7 = a(r10, r3)     // Catch: java.lang.Throwable -> L25
            return r7
        L6b:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            r9.append(r8)
            java.lang.String r8 = " fail."
            r9.append(r8)
            java.lang.String r8 = r7.getMessage()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            cn.jiguang.t.b.a(r1, r8, r7)
            return r2
    }
}
