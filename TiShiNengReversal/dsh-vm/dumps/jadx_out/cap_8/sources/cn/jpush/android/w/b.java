package cn.jpush.android.w;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b {
    public static final java.lang.String a = null;

    /* renamed from: b, reason: collision with root package name */
    private static final java.lang.String f1985b = null;

    /* renamed from: c, reason: collision with root package name */
    private static java.util.HashMap<java.lang.String, java.lang.String> f1986c;

    static {
            r0 = 10
            byte[] r0 = new byte[r0]
            r0 = {x0022: FILL_ARRAY_DATA , data: [32, 0, 14, 41, 38, 38, 63, 1, 23, 43} // fill-array
            java.lang.String r0 = cn.jpush.android.ad.d.b(r0)
            cn.jpush.android.w.b.a = r0
            r0 = 32
            byte[] r0 = new byte[r0]
            r0 = {x002c: FILL_ARRAY_DATA , data: [62, 82, 38, 113, 19, 93, 73, 85, 84, 2, 23, 92, 58, 34, 40, 115, 19, 47, 78, 84, 32, 3, 19, 40, 57, 83, 32, 114, 23, 93, 49, 82} // fill-array
            java.lang.String r0 = cn.jpush.android.ad.d.b(r0)
            cn.jpush.android.w.b.f1985b = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            cn.jpush.android.w.b.f1986c = r0
            return
    }

    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(android.content.Context r17, java.lang.String r18, java.lang.String r19, int r20, long r21) {
            r2 = r18
            r0 = r20
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "action:httpSimpleGet - "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r7 = "HttpManager"
            cn.jpush.android.helper.Logger.d(r7, r1)
            boolean r1 = cn.jpush.android.helper.JCoreHelper.isContinueBusiness(r17)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = " https sdk continueBusiness="
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            cn.jpush.android.helper.Logger.w(r7, r3)
            r8 = 0
            if (r1 != 0) goto L3b
            java.lang.String r0 = " https sdk limit"
            cn.jpush.android.helper.Logger.w(r7, r0)
            return r8
        L3b:
            r1 = 1
            if (r0 < r1) goto L45
            r3 = 10
            if (r0 <= r3) goto L43
            goto L45
        L43:
            r9 = r0
            goto L46
        L45:
            r9 = 1
        L46:
            r0 = 200(0xc8, double:9.9E-322)
            int r3 = (r21 > r0 ? 1 : (r21 == r0 ? 0 : -1))
            if (r3 < 0) goto L57
            r0 = 60000(0xea60, double:2.9644E-319)
            int r3 = (r21 > r0 ? 1 : (r21 == r0 ? 0 : -1))
            if (r3 <= 0) goto L54
            goto L57
        L54:
            r10 = r21
            goto L5a
        L57:
            r0 = 2000(0x7d0, double:9.88E-321)
            r10 = r0
        L5a:
            r0 = 0
            r1 = -1
            r13 = r8
            r12 = 0
        L5e:
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> Ldc
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Ldc
            java.net.URLConnection r0 = r0.openConnection()     // Catch: java.lang.Throwable -> Ldc
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch: java.lang.Throwable -> Ldc
            java.lang.String r3 = "Connection"
            java.lang.String r4 = "Close"
            r0.setRequestProperty(r3, r4)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r3 = "Accept-Encoding"
            java.lang.String r4 = "identity"
            r0.setRequestProperty(r3, r4)     // Catch: java.lang.Throwable -> Ld6
            int r14 = r0.getResponseCode()     // Catch: java.lang.Throwable -> Ld6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc3
            r1.<init>()     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r3 = "statusCode:"
            r1.append(r3)     // Catch: java.lang.Throwable -> Lc3
            r1.append(r14)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lc3
            cn.jpush.android.helper.Logger.v(r7, r1)     // Catch: java.lang.Throwable -> Lc3
            r1 = 200(0xc8, float:2.8E-43)
            if (r14 != r1) goto Lc9
            java.io.InputStream r15 = r0.getInputStream()     // Catch: java.lang.Throwable -> Lc3
            byte[] r1 = a(r15)     // Catch: java.lang.Throwable -> Lc0
            int r6 = r1.length     // Catch: java.lang.Throwable -> Lc0
            r4 = 0
            r3 = r19
            r16 = r8
            r8 = r1
            r1 = r17
            cn.jpush.android.helper.JCoreHelper.netMonitor(r1, r2, r3, r4, r6)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r2 = "UTF-8"
            r1.<init>(r8, r2)     // Catch: java.lang.Throwable -> Lbe
            r0.disconnect()     // Catch: java.lang.Throwable -> Lb2
        Lb2:
            cn.jpush.android.ad.m.a(r15)     // Catch: java.lang.AssertionError -> Lb6 java.lang.Exception -> Lba
            return r1
        Lb6:
            r0 = move-exception
            r13 = r1
            goto L112
        Lba:
            r0 = move-exception
            r13 = r1
            goto L12b
        Lbe:
            r1 = r0
            goto Le2
        Lc0:
            r16 = r8
            goto Lbe
        Lc3:
            r16 = r8
            r1 = r0
            r15 = r16
            goto Le2
        Lc9:
            r16 = r8
            r0.disconnect()     // Catch: java.lang.Throwable -> Lce
        Lce:
            cn.jpush.android.ad.m.a(r16)     // Catch: java.lang.AssertionError -> Ld2 java.lang.Exception -> Ld4
            goto L106
        Ld2:
            r0 = move-exception
            goto L112
        Ld4:
            r0 = move-exception
            goto L12b
        Ld6:
            r16 = r8
            r14 = r1
            r15 = r16
            goto Lbe
        Ldc:
            r16 = r8
            r14 = r1
            r1 = r16
            r15 = r1
        Le2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L108
            r0.<init>()     // Catch: java.lang.Throwable -> L108
            java.lang.String r2 = "httpSimpleGet failed,retriedCount:"
            r0.append(r2)     // Catch: java.lang.Throwable -> L108
            r0.append(r12)     // Catch: java.lang.Throwable -> L108
            java.lang.String r2 = ",statusCode:"
            r0.append(r2)     // Catch: java.lang.Throwable -> L108
            r0.append(r14)     // Catch: java.lang.Throwable -> L108
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L108
            cn.jpush.android.helper.Logger.d(r7, r0)     // Catch: java.lang.Throwable -> L108
            if (r1 == 0) goto L103
            r1.disconnect()     // Catch: java.lang.Throwable -> L103
        L103:
            cn.jpush.android.ad.m.a(r15)     // Catch: java.lang.AssertionError -> Ld2 java.lang.Exception -> Ld4
        L106:
            r1 = r14
            goto L144
        L108:
            r0 = move-exception
            if (r1 == 0) goto L10e
            r1.disconnect()     // Catch: java.lang.Throwable -> L10e
        L10e:
            cn.jpush.android.ad.m.a(r15)     // Catch: java.lang.AssertionError -> Ld2 java.lang.Exception -> Ld4
            throw r0     // Catch: java.lang.AssertionError -> Ld2 java.lang.Exception -> Ld4
        L112:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Catch AssertionError to avoid http close crash - "
            r1.append(r2)
            java.lang.String r0 = r0.toString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            cn.jpush.android.helper.Logger.e(r7, r0)
            goto L106
        L12b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "http client execute error:"
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            cn.jpush.android.helper.Logger.d(r7, r0)
            goto L106
        L144:
            if (r12 < r9) goto L147
            return r13
        L147:
            int r12 = r12 + 1
            java.lang.Thread.sleep(r10)     // Catch: java.lang.InterruptedException -> L14c
        L14c:
            r2 = r18
            r8 = r16
            goto L5e
    }

    public static java.lang.String a(java.lang.String r1) {
            java.util.HashMap<java.lang.String, java.lang.String> r0 = cn.jpush.android.w.b.f1986c
            if (r0 == 0) goto L1b
            int r0 = r0.size()
            if (r0 <= 0) goto L1b
            java.util.HashMap<java.lang.String, java.lang.String> r0 = cn.jpush.android.w.b.f1986c
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L1b
            java.util.HashMap<java.lang.String, java.lang.String> r0 = cn.jpush.android.w.b.f1986c
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            return r1
        L1b:
            r1 = 0
            return r1
    }

    public static byte[] a(android.content.Context r6, java.lang.String r7, java.lang.String r8, int r9, int r10) {
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            byte[] r6 = a(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static byte[] a(android.content.Context r2, java.lang.String r3, java.lang.String r4, int r5, int r6, boolean r7) {
            r0 = 0
            r1 = 0
        L2:
            if (r1 >= r5) goto Le
            byte[] r0 = a(r2, r3, r4, r6, r7)
            if (r0 == 0) goto Lb
            return r0
        Lb:
            int r1 = r1 + 1
            goto L2
        Le:
            return r0
    }

    public static byte[] a(android.content.Context r2, java.lang.String r3, java.lang.String r4, int r5, long r6, int r8) {
            r0 = 0
            r1 = 0
        L2:
            if (r1 >= r8) goto Le
            byte[] r0 = b(r2, r3, r4, r5, r6)
            if (r0 == 0) goto Lb
            return r0
        Lb:
            int r1 = r1 + 1
            goto L2
        Le:
            return r0
    }

    private static byte[] a(android.content.Context r13, java.lang.String r14, java.lang.String r15, int r16, boolean r17) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "action:httpGetIconBytes-"
            r0.append(r1)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "HttpManager"
            cn.jpush.android.helper.Logger.d(r1, r0)
            boolean r0 = cn.jpush.android.helper.JCoreHelper.isContinueBusiness(r13)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = " https sdk continueBusiness="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            cn.jpush.android.helper.Logger.w(r1, r2)
            r2 = 0
            if (r0 != 0) goto L37
            java.lang.String r13 = " https sdk limit"
            cn.jpush.android.helper.Logger.w(r1, r13)
            return r2
        L37:
            r0 = 30720(0x7800, float:4.3048E-41)
            r3 = r16
            if (r3 <= r0) goto L3e
            r0 = r3
        L3e:
            java.net.URL r3 = new java.net.URL     // Catch: java.lang.Throwable -> L130 java.lang.Throwable -> L135
            r3.<init>(r14)     // Catch: java.lang.Throwable -> L130 java.lang.Throwable -> L135
            java.net.URLConnection r3 = r3.openConnection()     // Catch: java.lang.Throwable -> L130 java.lang.Throwable -> L135
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch: java.lang.Throwable -> L130 java.lang.Throwable -> L135
            java.lang.String r4 = "Accept-Encoding"
            java.lang.String r5 = "identity"
            r3.setRequestProperty(r4, r5)     // Catch: java.lang.Throwable -> Ld4 java.lang.Throwable -> Ld9
            java.lang.String r4 = "Connection"
            java.lang.String r5 = "Close"
            r3.addRequestProperty(r4, r5)     // Catch: java.lang.Throwable -> Ld4 java.lang.Throwable -> Ld9
            r4 = 30000(0x7530, float:4.2039E-41)
            r3.setConnectTimeout(r4)     // Catch: java.lang.Throwable -> Ld4 java.lang.Throwable -> Ld9
            r4 = 5000(0x1388, float:7.006E-42)
            r3.setReadTimeout(r4)     // Catch: java.lang.Throwable -> Ld4 java.lang.Throwable -> Ld9
            int r4 = r3.getResponseCode()     // Catch: java.lang.Throwable -> Ld4 java.lang.Throwable -> Ld9
            r5 = 200(0xc8, float:2.8E-43)
            if (r4 != r5) goto Ldd
            int r4 = r3.getContentLength()     // Catch: java.lang.Throwable -> Ld4 java.lang.Throwable -> Ld9
            java.io.InputStream r5 = r3.getInputStream()     // Catch: java.lang.Throwable -> Ld4 java.lang.Throwable -> Ld9
            if (r5 == 0) goto L83
            byte[] r6 = a(r5)     // Catch: java.lang.Throwable -> L78 java.lang.Throwable -> L7e
            goto L84
        L78:
            r0 = move-exception
            r13 = r0
            r6 = r2
        L7b:
            r2 = r3
            goto L139
        L7e:
            r6 = r2
        L80:
            r2 = r3
            goto L15f
        L83:
            r6 = r2
        L84:
            int r12 = r6.length     // Catch: java.lang.Throwable -> L9d java.lang.Throwable -> La0
            r10 = 0
            r7 = r13
            r8 = r14
            r9 = r15
            cn.jpush.android.helper.JCoreHelper.netMonitor(r7, r8, r9, r10, r12)     // Catch: java.lang.Throwable -> L9d java.lang.Throwable -> La0
            if (r4 != 0) goto La2
            java.lang.String r13 = "httpGetIconBytes - Unexpected: downloaded bytes content length is 0"
            cn.jpush.android.helper.Logger.d(r1, r13)     // Catch: java.lang.Throwable -> L9d java.lang.Throwable -> La0
            if (r5 == 0) goto L99
            r5.close()     // Catch: java.lang.Throwable -> L9c
        L99:
            r3.disconnect()     // Catch: java.lang.Throwable -> L9c
        L9c:
            return r2
        L9d:
            r0 = move-exception
            r13 = r0
            goto L7b
        La0:
            goto L80
        La2:
            if (r4 <= r0) goto Lc1
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9d java.lang.Throwable -> La0 java.lang.Throwable -> La0
            r13.<init>()     // Catch: java.lang.Throwable -> L9d java.lang.Throwable -> La0 java.lang.Throwable -> La0
            java.lang.String r15 = "httpGetIconBytes - Unexpected:icon  size too big,max size is"
            r13.append(r15)     // Catch: java.lang.Throwable -> L9d java.lang.Throwable -> La0 java.lang.Throwable -> La0
            r13.append(r0)     // Catch: java.lang.Throwable -> L9d java.lang.Throwable -> La0 java.lang.Throwable -> La0
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L9d java.lang.Throwable -> La0 java.lang.Throwable -> La0
            cn.jpush.android.helper.Logger.d(r1, r13)     // Catch: java.lang.Throwable -> L9d java.lang.Throwable -> La0 java.lang.Throwable -> La0
            if (r5 == 0) goto Lbd
            r5.close()     // Catch: java.lang.Throwable -> Lc0
        Lbd:
            r3.disconnect()     // Catch: java.lang.Throwable -> Lc0
        Lc0:
            return r2
        Lc1:
            int r13 = r6.length     // Catch: java.lang.Throwable -> L9d java.lang.Throwable -> La0 java.lang.Throwable -> La0
            if (r13 >= r4) goto Ld2
            java.lang.String r13 = "httpGetIconBytes - Download bytes failed. Got bytes len < header content length."
            cn.jpush.android.helper.Logger.d(r1, r13)     // Catch: java.lang.Throwable -> L9d java.lang.Throwable -> La0 java.lang.Throwable -> La0
            if (r5 == 0) goto Lce
            r5.close()     // Catch: java.lang.Throwable -> Ld1
        Lce:
            r3.disconnect()     // Catch: java.lang.Throwable -> Ld1
        Ld1:
            return r2
        Ld2:
            r2 = r5
            goto L127
        Ld4:
            r0 = move-exception
            r13 = r0
            r5 = r2
            r6 = r5
            goto L7b
        Ld9:
            r5 = r2
            r6 = r5
            goto L80
        Ldd:
            r13 = 400(0x190, float:5.6E-43)
            if (r13 != r4) goto Lf6
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld4 java.lang.Throwable -> Ld9 java.lang.Throwable -> Ld9
            r13.<init>()     // Catch: java.lang.Throwable -> Ld4 java.lang.Throwable -> Ld9 java.lang.Throwable -> Ld9
            java.lang.String r15 = "httpGetIconBytes - server response failure - "
            r13.append(r15)     // Catch: java.lang.Throwable -> Ld4 java.lang.Throwable -> Ld9 java.lang.Throwable -> Ld9
            r13.append(r14)     // Catch: java.lang.Throwable -> Ld4 java.lang.Throwable -> Ld9 java.lang.Throwable -> Ld9
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> Ld4 java.lang.Throwable -> Ld9 java.lang.Throwable -> Ld9
        Lf2:
            cn.jpush.android.helper.Logger.d(r1, r13)     // Catch: java.lang.Throwable -> Ld4 java.lang.Throwable -> Ld9 java.lang.Throwable -> Ld9
            goto L126
        Lf6:
            r13 = 404(0x194, float:5.66E-43)
            if (r13 != r4) goto L10c
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld4 java.lang.Throwable -> Ld9 java.lang.Throwable -> Ld9
            r13.<init>()     // Catch: java.lang.Throwable -> Ld4 java.lang.Throwable -> Ld9 java.lang.Throwable -> Ld9
            java.lang.String r15 = "httpGetIconBytes - Request path does not exist: 404 - "
            r13.append(r15)     // Catch: java.lang.Throwable -> Ld4 java.lang.Throwable -> Ld9 java.lang.Throwable -> Ld9
            r13.append(r14)     // Catch: java.lang.Throwable -> Ld4 java.lang.Throwable -> Ld9 java.lang.Throwable -> Ld9
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> Ld4 java.lang.Throwable -> Ld9 java.lang.Throwable -> Ld9
            goto Lf2
        L10c:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld4 java.lang.Throwable -> Ld9 java.lang.Throwable -> Ld9
            r13.<init>()     // Catch: java.lang.Throwable -> Ld4 java.lang.Throwable -> Ld9 java.lang.Throwable -> Ld9
            java.lang.String r15 = "httpGetIconBytes - Other wrong response status - "
            r13.append(r15)     // Catch: java.lang.Throwable -> Ld4 java.lang.Throwable -> Ld9 java.lang.Throwable -> Ld9
            r13.append(r4)     // Catch: java.lang.Throwable -> Ld4 java.lang.Throwable -> Ld9 java.lang.Throwable -> Ld9
            java.lang.String r15 = ", url:"
            r13.append(r15)     // Catch: java.lang.Throwable -> Ld4 java.lang.Throwable -> Ld9 java.lang.Throwable -> Ld9
            r13.append(r14)     // Catch: java.lang.Throwable -> Ld4 java.lang.Throwable -> Ld9 java.lang.Throwable -> Ld9
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> Ld4 java.lang.Throwable -> Ld9 java.lang.Throwable -> Ld9
            goto Lf2
        L126:
            r6 = r2
        L127:
            if (r2 == 0) goto L12c
            r2.close()     // Catch: java.lang.Throwable -> L17c
        L12c:
            r3.disconnect()     // Catch: java.lang.Throwable -> L17c
            goto L17c
        L130:
            r0 = move-exception
            r13 = r0
            r5 = r2
            r6 = r5
            goto L139
        L135:
            r5 = r2
            r6 = r5
            goto L15f
        L139:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L15c
            r14.<init>()     // Catch: java.lang.Throwable -> L15c
            java.lang.String r15 = "httpGetIconBytes failed:"
            r14.append(r15)     // Catch: java.lang.Throwable -> L15c
            java.lang.String r13 = r13.getMessage()     // Catch: java.lang.Throwable -> L15c
            r14.append(r13)     // Catch: java.lang.Throwable -> L15c
            java.lang.String r13 = r14.toString()     // Catch: java.lang.Throwable -> L15c
            cn.jpush.android.helper.Logger.w(r1, r13)     // Catch: java.lang.Throwable -> L15c
            if (r5 == 0) goto L156
            r5.close()     // Catch: java.lang.Throwable -> L17c
        L156:
            if (r2 == 0) goto L17c
        L158:
            r2.disconnect()     // Catch: java.lang.Throwable -> L17c
            goto L17c
        L15c:
            r0 = move-exception
            r13 = r0
            goto L169
        L15f:
            if (r17 == 0) goto L174
            java.util.HashMap<java.lang.String, java.lang.String> r13 = cn.jpush.android.w.b.f1986c     // Catch: java.lang.Throwable -> L15c
            java.lang.String r15 = "1000"
            r13.put(r14, r15)     // Catch: java.lang.Throwable -> L15c
            goto L174
        L169:
            if (r5 == 0) goto L16e
            r5.close()     // Catch: java.lang.Throwable -> L173
        L16e:
            if (r2 == 0) goto L173
            r2.disconnect()     // Catch: java.lang.Throwable -> L173
        L173:
            throw r13
        L174:
            if (r5 == 0) goto L179
            r5.close()     // Catch: java.lang.Throwable -> L17c
        L179:
            if (r2 == 0) goto L17c
            goto L158
        L17c:
            return r6
    }

    public static byte[] a(java.io.InputStream r0) {
            byte[] r0 = cn.jpush.android.ad.m.b(r0)
            return r0
    }

    public static void b(java.lang.String r1) {
            java.util.HashMap<java.lang.String, java.lang.String> r0 = cn.jpush.android.w.b.f1986c     // Catch: java.lang.Throwable -> L7
            if (r0 == 0) goto L7
            r0.remove(r1)     // Catch: java.lang.Throwable -> L7
        L7:
            return
    }

    public static byte[] b(android.content.Context r15, java.lang.String r16, java.lang.String r17, int r18, long r19) {
            r2 = r16
            r0 = r18
            boolean r1 = cn.jpush.android.helper.JCoreHelper.isContinueBusiness(r15)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = " https sdk continueBusiness="
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r7 = "HttpManager"
            cn.jpush.android.helper.Logger.w(r7, r3)
            r8 = 0
            if (r1 != 0) goto L27
            java.lang.String r15 = " https sdk limit"
            cn.jpush.android.helper.Logger.w(r7, r15)
            return r8
        L27:
            r1 = 1
            if (r0 < r1) goto L30
            r3 = 10
            if (r0 <= r3) goto L2f
            goto L30
        L2f:
            r1 = r0
        L30:
            r3 = 200(0xc8, double:9.9E-322)
            int r0 = (r19 > r3 ? 1 : (r19 == r3 ? 0 : -1))
            if (r0 < 0) goto L41
            r3 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r19 > r3 ? 1 : (r19 == r3 ? 0 : -1))
            if (r0 <= 0) goto L3e
            goto L41
        L3e:
            r3 = r19
            goto L43
        L41:
            r3 = 2000(0x7d0, double:9.88E-321)
        L43:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "action:httpGet - "
            r0.append(r5)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            cn.jpush.android.helper.Logger.d(r7, r0)
            r5 = 0
            r0 = -1
            r9 = r8
            r11 = r9
            r6 = -1
            r10 = 0
            r12 = 0
        L5e:
            r13 = 200(0xc8, float:2.8E-43)
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> Lc7 java.lang.Exception -> Lcb javax.net.ssl.SSLHandshakeException -> Lcd javax.net.ssl.SSLPeerUnverifiedException -> L1a8
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lc7 java.lang.Exception -> Lcb javax.net.ssl.SSLHandshakeException -> Lcd javax.net.ssl.SSLPeerUnverifiedException -> L1a8
            java.net.URLConnection r0 = r0.openConnection()     // Catch: java.lang.Throwable -> Lc7 java.lang.Exception -> Lcb javax.net.ssl.SSLHandshakeException -> Lcd javax.net.ssl.SSLPeerUnverifiedException -> L1a8
            r14 = r0
            java.net.HttpURLConnection r14 = (java.net.HttpURLConnection) r14     // Catch: java.lang.Throwable -> Lc7 java.lang.Exception -> Lcb javax.net.ssl.SSLHandshakeException -> Lcd javax.net.ssl.SSLPeerUnverifiedException -> L1a8
            java.lang.String r0 = "Accept-Encoding"
            java.lang.String r11 = "identity"
            r14.setRequestProperty(r0, r11)     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La8 javax.net.ssl.SSLHandshakeException -> Lab javax.net.ssl.SSLPeerUnverifiedException -> Lae
            java.lang.String r0 = "Connection"
            java.lang.String r11 = "Close"
            r14.addRequestProperty(r0, r11)     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La8 javax.net.ssl.SSLHandshakeException -> Lab javax.net.ssl.SSLPeerUnverifiedException -> Lae
            int r6 = r14.getResponseCode()     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La8 javax.net.ssl.SSLHandshakeException -> Lab javax.net.ssl.SSLPeerUnverifiedException -> Lae
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La8 javax.net.ssl.SSLHandshakeException -> Lab javax.net.ssl.SSLPeerUnverifiedException -> Lae
            r0.<init>()     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La8 javax.net.ssl.SSLHandshakeException -> Lab javax.net.ssl.SSLPeerUnverifiedException -> Lae
            java.lang.String r11 = "statusCode:"
            r0.append(r11)     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La8 javax.net.ssl.SSLHandshakeException -> Lab javax.net.ssl.SSLPeerUnverifiedException -> Lae
            r0.append(r6)     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La8 javax.net.ssl.SSLHandshakeException -> Lab javax.net.ssl.SSLPeerUnverifiedException -> Lae
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La8 javax.net.ssl.SSLHandshakeException -> Lab javax.net.ssl.SSLPeerUnverifiedException -> Lae
            cn.jpush.android.helper.Logger.v(r7, r0)     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La8 javax.net.ssl.SSLHandshakeException -> Lab javax.net.ssl.SSLPeerUnverifiedException -> Lae
            if (r6 != r13) goto Lbc
            int r12 = r14.getContentLength()     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La8 javax.net.ssl.SSLHandshakeException -> Lab javax.net.ssl.SSLPeerUnverifiedException -> Lae
            java.io.InputStream r9 = r14.getInputStream()     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La8 javax.net.ssl.SSLHandshakeException -> Lab javax.net.ssl.SSLPeerUnverifiedException -> Lae
            if (r9 == 0) goto Lb1
            byte[] r0 = a(r9)     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La8 javax.net.ssl.SSLHandshakeException -> Lab javax.net.ssl.SSLPeerUnverifiedException -> Lae
            goto Lb2
        La3:
            r0 = move-exception
            r15 = r0
            r11 = r14
            goto L1c5
        La8:
            r0 = move-exception
            r11 = r14
            goto Lcf
        Lab:
            r0 = move-exception
            r11 = r14
            goto Lf5
        Lae:
            r11 = r14
            goto L1a8
        Lb1:
            r0 = r8
        Lb2:
            if (r9 == 0) goto Lb7
            r9.close()     // Catch: java.io.IOException -> Lb7
        Lb7:
            r14.disconnect()
        Lba:
            r9 = r6
            goto L11b
        Lbc:
            if (r9 == 0) goto Lc1
            r9.close()     // Catch: java.io.IOException -> Lc1
        Lc1:
            r14.disconnect()
            r11 = r14
            goto L1b8
        Lc7:
            r0 = move-exception
            r15 = r0
            goto L1c5
        Lcb:
            r0 = move-exception
            goto Lcf
        Lcd:
            r0 = move-exception
            goto Lf5
        Lcf:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc7
            r13.<init>()     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r14 = "http client execute error:"
            r13.append(r14)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> Lc7
            r13.append(r0)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r0 = r13.toString()     // Catch: java.lang.Throwable -> Lc7
            cn.jpush.android.helper.Logger.d(r7, r0)     // Catch: java.lang.Throwable -> Lc7
            if (r9 == 0) goto Lee
            r9.close()     // Catch: java.io.IOException -> Led
            goto Lee
        Led:
        Lee:
            if (r11 == 0) goto L1b8
        Lf0:
            r11.disconnect()
            goto L1b8
        Lf5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc7
            r1.<init>()     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r3 = "Catch SSLHandshakeException, http client execute error!"
            r1.append(r3)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> Lc7
            r1.append(r0)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> Lc7
            cn.jpush.android.helper.Logger.dd(r7, r0)     // Catch: java.lang.Throwable -> Lc7
            if (r9 == 0) goto L114
            r9.close()     // Catch: java.io.IOException -> L113
            goto L114
        L113:
        L114:
            if (r11 == 0) goto L119
            r11.disconnect()
        L119:
            r0 = r8
            goto Lba
        L11b:
            if (r0 == 0) goto L120
            int r5 = r0.length
            r6 = r5
            goto L121
        L120:
            r6 = 0
        L121:
            r4 = 0
            r1 = r15
            r3 = r17
            cn.jpush.android.helper.JCoreHelper.netMonitor(r1, r2, r3, r4, r6)
            if (r13 != r9) goto L159
            if (r12 != 0) goto L136
            java.lang.String r15 = "Unexpected: downloaded bytes content length is 0"
            cn.jpush.android.helper.Logger.d(r7, r15)     // Catch: java.lang.Exception -> L133
            return r8
        L133:
            r0 = move-exception
            r15 = r0
            goto L140
        L136:
            int r15 = r0.length     // Catch: java.lang.Exception -> L133
            if (r15 >= r12) goto L13f
            java.lang.String r15 = "Download bytes failed. Got bytes len < header content length."
            cn.jpush.android.helper.Logger.d(r7, r15)     // Catch: java.lang.Exception -> L133
            return r8
        L13f:
            return r0
        L140:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "parse response error:"
            r0.append(r1)
            java.lang.String r15 = r15.getMessage()
            r0.append(r15)
            java.lang.String r15 = r0.toString()
            cn.jpush.android.helper.Logger.d(r7, r15)
            return r8
        L159:
            r15 = 400(0x190, float:5.6E-43)
            if (r15 != r9) goto L172
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = "server response failure - "
            r15.append(r0)
            r15.append(r2)
            java.lang.String r15 = r15.toString()
            cn.jpush.android.helper.Logger.d(r7, r15)
            return r8
        L172:
            r15 = 404(0x194, float:5.66E-43)
            if (r15 != r9) goto L18b
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = "Request path does not exist: 404 - "
            r15.append(r0)
            r15.append(r2)
            java.lang.String r15 = r15.toString()
            cn.jpush.android.helper.Logger.d(r7, r15)
            return r8
        L18b:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = "Other wrong response status - "
            r15.append(r0)
            r15.append(r9)
            java.lang.String r0 = ", url:"
            r15.append(r0)
            r15.append(r2)
            java.lang.String r15 = r15.toString()
            cn.jpush.android.helper.Logger.d(r7, r15)
            return r8
        L1a8:
            java.lang.String r0 = "Catch SSLPeerUnverifiedException, http client execute error!"
            cn.jpush.android.helper.Logger.ee(r7, r0)     // Catch: java.lang.Throwable -> Lc7
            if (r9 == 0) goto L1b4
            r9.close()     // Catch: java.io.IOException -> L1b3
            goto L1b4
        L1b3:
        L1b4:
            if (r11 == 0) goto L1b8
            goto Lf0
        L1b8:
            if (r10 < r1) goto L1bb
            return r8
        L1bb:
            int r10 = r10 + 1
            long r13 = (long) r10
            long r13 = r13 * r3
            java.lang.Thread.sleep(r13)     // Catch: java.lang.InterruptedException -> L5e
            goto L5e
        L1c5:
            if (r9 == 0) goto L1cc
            r9.close()     // Catch: java.io.IOException -> L1cb
            goto L1cc
        L1cb:
        L1cc:
            if (r11 == 0) goto L1d1
            r11.disconnect()
        L1d1:
            throw r15
    }
}
