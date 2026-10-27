package v0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class a {
    private static v0.a.InterfaceC0028a a;
    private static boolean b;

    /* renamed from: v0.a$a, reason: collision with other inner class name */
    public interface InterfaceC0028a {
        boolean cw();

        boolean j();

        boolean xt();
    }

    static {
            return
    }

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    private static android.net.Uri a(java.lang.String r1, java.lang.String r2, int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            if (r2 == 0) goto L1e
            if (r1 == 0) goto L11
            r0.append(r1)
            java.lang.String r1 = "://"
            r0.append(r1)
        L11:
            r0.append(r2)
            if (r3 <= 0) goto L1e
            r1 = 58
            r0.append(r1)
            r0.append(r3)
        L1e:
            if (r4 == 0) goto L28
            java.lang.String r1 = "/"
            boolean r1 = r4.startsWith(r1)
            if (r1 != 0) goto L2d
        L28:
            r1 = 47
            r0.append(r1)
        L2d:
            if (r4 == 0) goto L32
            r0.append(r4)
        L32:
            if (r5 == 0) goto L3c
            r1 = 63
            r0.append(r1)
            r0.append(r5)
        L3c:
            if (r6 == 0) goto L46
            r1 = 35
            r0.append(r1)
            r0.append(r6)
        L46:
            java.lang.String r1 = r0.toString()
            android.net.Uri r1 = android.net.Uri.parse(r1)
            return r1
    }

    private static java.lang.String b(java.lang.String r0, java.lang.String r1) {
            if (r1 == 0) goto L3
            goto L5
        L3:
            java.lang.String r1 = "ISO-8859-1"
        L5:
            java.lang.String r0 = java.net.URLEncoder.encode(r0, r1)     // Catch: java.io.UnsupportedEncodingException -> La
            return r0
        La:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
    }

    public static java.lang.String c(java.lang.String r11, java.util.List<android.util.Pair<java.lang.String, java.lang.String>> r12) {
            java.lang.String r0 = "UTF-8"
            boolean r1 = android.text.TextUtils.isEmpty(r11)
            if (r1 == 0) goto L9
            goto L54
        L9:
            v0.a$a r1 = v0.a.a
            if (r1 != 0) goto Le
            goto L54
        Le:
            boolean r1 = v0.a.b
            if (r1 == 0) goto L13
            goto L54
        L13:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            android.net.Uri r2 = android.net.Uri.parse(r11)     // Catch: java.lang.Throwable -> L7a
            e(r2, r1)     // Catch: java.lang.Throwable -> L7a
            java.util.LinkedList r3 = new java.util.LinkedList     // Catch: java.lang.Throwable -> L7a
            r3.<init>()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r4 = "device_id"
            f(r1, r3, r4)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r4 = "device_type"
            f(r1, r3, r4)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r4 = "device_brand"
            f(r1, r3, r4)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r4 = "uuid"
            f(r1, r3, r4)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r4 = "openudid"
            f(r1, r3, r4)     // Catch: java.lang.Throwable -> L7a
            r4 = 0
            java.lang.String r3 = d(r3, r4, r0)     // Catch: java.lang.Throwable -> L7a
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L7a
            if (r4 == 0) goto L49
            goto L54
        L49:
            byte[] r3 = r3.getBytes()     // Catch: java.lang.Throwable -> L7a
            int r4 = r3.length     // Catch: java.lang.Throwable -> L7a
            byte[] r3 = com.bytedance.embedapplog.util.TTEncryptUtils.a(r3, r4)     // Catch: java.lang.Throwable -> L7a
            if (r3 != 0) goto L55
        L54:
            return r11
        L55:
            r4 = 2
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r4)     // Catch: java.lang.Throwable -> L7a
            java.util.LinkedList r4 = new java.util.LinkedList     // Catch: java.lang.Throwable -> L7a
            r4.<init>()     // Catch: java.lang.Throwable -> L7a
            v0.a$a r5 = v0.a.a     // Catch: java.lang.Throwable -> L7a
            boolean r5 = r5.j()     // Catch: java.lang.Throwable -> L7a
            if (r5 == 0) goto L7d
            java.util.LinkedList r5 = new java.util.LinkedList     // Catch: java.lang.Throwable -> L7a
            r5.<init>()     // Catch: java.lang.Throwable -> L7a
            r5.add(r3)     // Catch: java.lang.Throwable -> L7a
            android.util.Pair r6 = new android.util.Pair     // Catch: java.lang.Throwable -> L7a
            java.lang.String r7 = "ss_queries"
            r6.<init>(r7, r5)     // Catch: java.lang.Throwable -> L7a
            r4.add(r6)     // Catch: java.lang.Throwable -> L7a
            goto L7d
        L7a:
            r0 = move-exception
            r12 = r0
            goto Le4
        L7d:
            v0.a$a r5 = v0.a.a     // Catch: java.lang.Throwable -> L7a
            boolean r5 = r5.xt()     // Catch: java.lang.Throwable -> L7a
            if (r5 == 0) goto L95
            if (r12 == 0) goto L95
            android.util.Pair r5 = new android.util.Pair     // Catch: java.lang.Throwable -> L7a
            java.lang.String r6 = "X-SS-QUERIES"
            java.lang.String r3 = b(r3, r0)     // Catch: java.lang.Throwable -> L7a
            r5.<init>(r6, r3)     // Catch: java.lang.Throwable -> L7a
            r12.add(r5)     // Catch: java.lang.Throwable -> L7a
        L95:
            boolean r12 = r1.isEmpty()     // Catch: java.lang.Throwable -> L7a
            if (r12 != 0) goto Lc2
            java.util.Set r12 = r1.entrySet()     // Catch: java.lang.Throwable -> L7a
            java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.Throwable -> L7a
        La3:
            boolean r1 = r12.hasNext()     // Catch: java.lang.Throwable -> L7a
            if (r1 == 0) goto Lc2
            java.lang.Object r1 = r12.next()     // Catch: java.lang.Throwable -> L7a
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L7a
            if (r1 == 0) goto La3
            android.util.Pair r3 = new android.util.Pair     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r5 = r1.getKey()     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L7a
            r3.<init>(r5, r1)     // Catch: java.lang.Throwable -> L7a
            r4.add(r3)     // Catch: java.lang.Throwable -> L7a
            goto La3
        Lc2:
            r12 = 1
            java.lang.String r9 = d(r4, r12, r0)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r5 = r2.getScheme()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r6 = r2.getHost()     // Catch: java.lang.Throwable -> L7a
            int r7 = r2.getPort()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r8 = r2.getPath()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r10 = r2.getFragment()     // Catch: java.lang.Throwable -> L7a
            android.net.Uri r12 = a(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r11 = r12.toString()     // Catch: java.lang.Throwable -> L7a
            return r11
        Le4:
            com.bytedance.sdk.component.utils.vl.j(r12)
            return r11
    }

    private static java.lang.String d(java.util.List<android.util.Pair<java.lang.String, java.util.List<java.lang.String>>> r5, boolean r6, java.lang.String r7) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L9:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L60
            java.lang.Object r1 = r5.next()
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.Object r2 = r1.first
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            if (r6 == 0) goto L22
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = b(r2, r7)
        L22:
            java.lang.Object r1 = r1.second
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L9
            int r2 = r1.size()
            if (r2 <= 0) goto L9
            java.util.Iterator r1 = r1.iterator()
        L32:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L9
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            if (r6 == 0) goto L49
            if (r2 == 0) goto L47
            java.lang.String r2 = b(r2, r7)
            goto L49
        L47:
            java.lang.String r2 = ""
        L49:
            int r4 = r0.length()
            if (r4 <= 0) goto L54
            java.lang.String r4 = "&"
            r0.append(r4)
        L54:
            r0.append(r3)
            java.lang.String r4 = "="
            r0.append(r4)
            r0.append(r2)
            goto L32
        L60:
            java.lang.String r5 = r0.toString()
            return r5
    }

    public static void e(android.net.Uri r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10) throws java.io.IOException {
            java.lang.String r0 = "parseUrl url is null !!!"
            if (r9 == 0) goto L72
            if (r10 == 0) goto L71
            java.lang.String r9 = r9.getQuery()     // Catch: java.lang.Throwable -> L39
            if (r9 == 0) goto L71
            java.lang.String r1 = "&"
            java.lang.String[] r9 = r9.split(r1)     // Catch: java.lang.Throwable -> L39
            int r1 = r9.length     // Catch: java.lang.Throwable -> L39
            r2 = 0
            r3 = 0
        L15:
            if (r3 >= r1) goto L71
            r4 = r9[r3]     // Catch: java.lang.Throwable -> L39
            java.lang.String r5 = "="
            int r5 = r4.indexOf(r5)     // Catch: java.lang.Throwable -> L39
            java.lang.String r6 = "UTF-8"
            if (r5 < 0) goto L4c
            java.lang.String r7 = r4.substring(r2, r5)     // Catch: java.lang.Throwable -> L39
            java.lang.String r7 = java.net.URLDecoder.decode(r7, r6)     // Catch: java.lang.Throwable -> L39
            java.lang.Object r8 = r10.get(r7)     // Catch: java.lang.Throwable -> L39
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Throwable -> L39
            if (r8 != 0) goto L3b
            java.util.LinkedList r8 = new java.util.LinkedList     // Catch: java.lang.Throwable -> L39
            r8.<init>()     // Catch: java.lang.Throwable -> L39
            goto L3b
        L39:
            r9 = move-exception
            goto L68
        L3b:
            int r5 = r5 + 1
            java.lang.String r4 = r4.substring(r5)     // Catch: java.lang.Throwable -> L39
            java.lang.String r4 = java.net.URLDecoder.decode(r4, r6)     // Catch: java.lang.Throwable -> L39
            r8.add(r4)     // Catch: java.lang.Throwable -> L39
            r10.put(r7, r8)     // Catch: java.lang.Throwable -> L39
            goto L65
        L4c:
            java.lang.String r4 = java.net.URLDecoder.decode(r4, r6)     // Catch: java.lang.Throwable -> L39
            java.lang.Object r5 = r10.get(r4)     // Catch: java.lang.Throwable -> L39
            java.util.List r5 = (java.util.List) r5     // Catch: java.lang.Throwable -> L39
            if (r5 != 0) goto L5d
            java.util.LinkedList r5 = new java.util.LinkedList     // Catch: java.lang.Throwable -> L39
            r5.<init>()     // Catch: java.lang.Throwable -> L39
        L5d:
            java.lang.String r6 = ""
            r5.add(r6)     // Catch: java.lang.Throwable -> L39
            r10.put(r4, r5)     // Catch: java.lang.Throwable -> L39
        L65:
            int r3 = r3 + 1
            goto L15
        L68:
            com.bytedance.sdk.component.utils.vl.j(r9)
            java.io.IOException r9 = new java.io.IOException
            r9.<init>(r0)
            throw r9
        L71:
            return
        L72:
            java.io.IOException r9 = new java.io.IOException
            r9.<init>(r0)
            throw r9
    }

    private static boolean f(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r2, java.util.List<android.util.Pair<java.lang.String, java.util.List<java.lang.String>>> r3, java.lang.String r4) throws java.io.UnsupportedEncodingException {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            if (r3 != 0) goto Lb
            return r1
        Lb:
            boolean r0 = r2.containsKey(r4)
            if (r0 == 0) goto L2a
            android.util.Pair r0 = new android.util.Pair
            java.lang.Object r1 = r2.get(r4)
            r0.<init>(r4, r1)
            r3.add(r0)
            v0.a$a r3 = v0.a.a
            boolean r3 = r3.cw()
            if (r3 != 0) goto L28
            r2.remove(r4)
        L28:
            r2 = 1
            return r2
        L2a:
            return r1
    }
}
