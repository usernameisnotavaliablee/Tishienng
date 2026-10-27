package com.bykv.vk.openvk.component.video.j.cw;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class j {
    public static final java.nio.charset.Charset j = null;
    private static final android.os.Handler xt = null;

    /* renamed from: com.bykv.vk.openvk.component.video.j.cw.j$1, reason: invalid class name */
    static class AnonymousClass1 implements java.io.FilenameFilter {
        private java.util.regex.Pattern j;

        AnonymousClass1() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "^cpu[0-9]+$"
                java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
                r1.j = r0
                return
        }

        @Override // java.io.FilenameFilter
        public boolean accept(java.io.File r1, java.lang.String r2) {
                r0 = this;
                java.util.regex.Pattern r1 = r0.j
                java.util.regex.Matcher r1 = r1.matcher(r2)
                boolean r1 = r1.matches()
                return r1
        }
    }

    static {
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.bykv.vk.openvk.component.video.j.cw.j.xt = r0
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            com.bykv.vk.openvk.component.video.j.cw.j.j = r0
            return
    }

    public j() {
            r1 = this;
            r1.<init>()
            return
    }

    public static boolean cw(java.lang.String r1) {
            if (r1 == 0) goto L1c
            java.lang.String r0 = "video/"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L1a
            java.lang.String r0 = "application/octet-stream"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1a
            java.lang.String r0 = "binary/octet-stream"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L1c
        L1a:
            r1 = 1
            return r1
        L1c:
            r1 = 0
            return r1
    }

    public static int j() {
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            r1 = 1
            int r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    public static int j(com.bykv.vk.openvk.component.video.j.xt.up.j r4) {
            r0 = -1
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r4.j()
            r2 = 200(0xc8, float:2.8E-43)
            r3 = 0
            if (r1 != r2) goto L18
            java.lang.String r1 = "Content-Length"
            java.lang.String r4 = r4.j(r1, r3)
            int r4 = j(r4, r0)
            return r4
        L18:
            int r1 = r4.j()
            r2 = 206(0xce, float:2.89E-43)
            if (r1 != r2) goto L47
            java.lang.String r1 = "Content-Range"
            java.lang.String r4 = r4.j(r1, r3)
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L47
            java.lang.String r1 = "/"
            int r1 = r4.lastIndexOf(r1)
            if (r1 < 0) goto L47
            int r2 = r4.length()
            int r2 = r2 + (-1)
            if (r1 >= r2) goto L47
            int r1 = r1 + 1
            java.lang.String r4 = r4.substring(r1)
            int r4 = j(r4, r0)
            return r4
        L47:
            return r0
    }

    public static int j(java.lang.String r1, int r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L7
            return r2
        L7:
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> Lc
            return r1
        Lc:
            return r2
    }

    public static com.bykv.vk.openvk.component.video.j.xt.xt.j j(com.bykv.vk.openvk.component.video.j.xt.up.j r7, com.bykv.vk.openvk.component.video.j.xt.xt.cw r8, java.lang.String r9, int r10) {
            com.bykv.vk.openvk.component.video.j.xt.xt.j r0 = r8.query(r9, r10)
            if (r0 != 0) goto L58
            int r4 = j(r7)
            java.lang.String r1 = "Content-Type"
            r2 = 0
            java.lang.String r3 = r7.j(r1, r2)
            if (r4 <= 0) goto L58
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L58
            com.bykv.vk.openvk.component.video.j.xt.up.up r0 = r7.ae()
            java.lang.String r1 = ""
            if (r0 == 0) goto L2a
            java.lang.String r2 = r0.xt
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.up
            java.lang.String r0 = xt(r0)
            goto L2c
        L2a:
            r0 = r1
            r2 = r0
        L2c:
            java.util.List r7 = r7.cw()
            java.lang.String r7 = xt(r7)
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L4c
            r5.<init>()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r6 = "requestUrl"
            r5.put(r6, r2)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r2 = "requestHeaders"
            r5.put(r2, r0)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = "responseHeaders"
            r5.put(r0, r7)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Throwable -> L4c
        L4c:
            r6 = r1
            com.bykv.vk.openvk.component.video.j.xt.xt.j r1 = new com.bykv.vk.openvk.component.video.j.xt.xt.j
            r2 = r9
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            r8.insert(r1)
            return r1
        L58:
            return r0
    }

    public static java.lang.String j(int r1, int r2) {
            java.lang.String r1 = xt(r1, r2)
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "bytes="
            r2.<init>(r0)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            return r1
    }

    public static java.lang.String j(com.bykv.vk.openvk.component.video.j.xt.up.j r10, int r11) {
            if (r10 == 0) goto Lf2
            boolean r0 = r10.xt()
            if (r0 != 0) goto La
            goto Lf2
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r10.up()
            java.lang.String r1 = r1.toUpperCase()
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            int r2 = r10.j()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = r10.m()
            r0.append(r1)
            java.lang.String r1 = "\r\n"
            r0.append(r1)
            boolean r2 = com.bykv.vk.openvk.component.video.j.xt.up.cw
            if (r2 == 0) goto L68
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r10.up()
            java.lang.String r3 = r3.toUpperCase()
            r2.append(r3)
            java.lang.String r3 = " "
            r2.append(r3)
            int r4 = r10.j()
            r2.append(r4)
            r2.append(r3)
            java.lang.String r3 = r10.m()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "TAG_PROXY_headers"
            com.bytedance.sdk.component.utils.vl.j(r3, r2)
        L68:
            java.util.List r2 = r10.cw()
            java.util.List r2 = j(r2)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto Lb3
            int r5 = r2.size()
            r6 = 0
        L79:
            if (r6 >= r5) goto Lb3
            java.lang.Object r7 = r2.get(r6)
            com.bykv.vk.openvk.component.video.j.xt.g$xt r7 = (com.bykv.vk.openvk.component.video.j.xt.g.xt) r7
            if (r7 == 0) goto Lb0
            java.lang.String r8 = r7.j
            java.lang.String r7 = r7.xt
            r0.append(r8)
            java.lang.String r9 = ": "
            r0.append(r9)
            r0.append(r7)
            r0.append(r1)
            java.lang.String r9 = "Content-Range"
            boolean r9 = r9.equalsIgnoreCase(r8)
            if (r9 == 0) goto L9f
        L9d:
            r3 = 0
            goto Lb0
        L9f:
            java.lang.String r9 = "Accept-Ranges"
            boolean r8 = r9.equalsIgnoreCase(r8)
            if (r8 == 0) goto Lb0
            java.lang.String r8 = "bytes"
            boolean r7 = r8.equalsIgnoreCase(r7)
            if (r7 == 0) goto Lb0
            goto L9d
        Lb0:
            int r6 = r6 + 1
            goto L79
        Lb3:
            if (r3 == 0) goto Ldc
            int r10 = j(r10)
            if (r10 <= 0) goto Ldc
            java.lang.String r2 = "Content-Range: bytes "
            r0.append(r2)
            int r11 = java.lang.Math.max(r11, r4)
            r0.append(r11)
            java.lang.String r11 = "-"
            r0.append(r11)
            int r11 = r10 + (-1)
            r0.append(r11)
            java.lang.String r11 = "/"
            r0.append(r11)
            r0.append(r10)
            r0.append(r1)
        Ldc:
            java.lang.String r10 = "Connection: close\r\n"
            r0.append(r10)
            r0.append(r1)
            java.lang.String r10 = r0.toString()
            boolean r11 = com.bykv.vk.openvk.component.video.j.xt.up.cw
            if (r11 == 0) goto Lf1
            java.lang.String r11 = "TAG_PROXY_WRITE_TO_MP"
            com.bytedance.sdk.component.utils.vl.j(r11, r10)
        Lf1:
            return r10
        Lf2:
            r10 = 0
            return r10
    }

    public static java.lang.String j(com.bykv.vk.openvk.component.video.j.xt.up.j r4, boolean r5, boolean r6) {
            java.lang.String r0 = "TAG_PROXY_Response"
            if (r4 != 0) goto Le
            boolean r4 = com.bykv.vk.openvk.component.video.j.xt.up.cw
            java.lang.String r5 = "response null"
            if (r4 == 0) goto Ld
            com.bytedance.sdk.component.utils.vl.r(r0, r5)
        Ld:
            return r5
        Le:
            boolean r1 = r4.xt()
            if (r1 != 0) goto L3e
            boolean r5 = com.bykv.vk.openvk.component.video.j.xt.up.cw
            java.lang.String r6 = "response code: "
            if (r5 == 0) goto L2d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r6)
            int r1 = r4.j()
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            com.bytedance.sdk.component.utils.vl.r(r0, r5)
        L2d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r6)
            int r4 = r4.j()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            return r4
        L3e:
            java.lang.String r1 = "Content-Type"
            r2 = 0
            java.lang.String r1 = r4.j(r1, r2)
            boolean r3 = cw(r1)
            if (r3 != 0) goto L6d
            boolean r4 = com.bykv.vk.openvk.component.video.j.xt.up.cw
            java.lang.String r5 = "Content-Type: "
            if (r4 == 0) goto L60
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            com.bytedance.sdk.component.utils.vl.r(r0, r4)
        L60:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            return r4
        L6d:
            int r1 = j(r4)
            if (r1 > 0) goto L95
            boolean r4 = com.bykv.vk.openvk.component.video.j.xt.up.cw
            java.lang.String r5 = "Content-Length: "
            if (r4 == 0) goto L88
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            com.bytedance.sdk.component.utils.vl.r(r0, r4)
        L88:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            return r4
        L95:
            if (r5 == 0) goto Lc9
            java.lang.String r5 = "Accept-Ranges"
            java.lang.String r5 = r4.j(r5, r2)
            if (r5 == 0) goto La7
            java.lang.String r1 = "bytes"
            boolean r1 = r5.contains(r1)
            if (r1 != 0) goto Lc9
        La7:
            boolean r4 = com.bykv.vk.openvk.component.video.j.xt.up.cw
            java.lang.String r6 = "Accept-Ranges: "
            if (r4 == 0) goto Lbc
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r6)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.bytedance.sdk.component.utils.vl.r(r0, r4)
        Lbc:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r6)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            return r4
        Lc9:
            if (r6 == 0) goto Ldb
            java.io.InputStream r4 = r4.r()
            if (r4 != 0) goto Ldb
            boolean r4 = com.bykv.vk.openvk.component.video.j.xt.up.cw
            java.lang.String r5 = "response body null"
            if (r4 == 0) goto Lda
            com.bytedance.sdk.component.utils.vl.r(r0, r5)
        Lda:
            return r5
        Ldb:
            return r2
    }

    public static java.lang.String j(com.bykv.vk.openvk.component.video.j.xt.xt.j r4, int r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            if (r5 > 0) goto Ld
            java.lang.String r1 = "HTTP/1.1 200 OK\r\n"
            r0.append(r1)
            goto L12
        Ld:
            java.lang.String r1 = "HTTP/1.1 206 Partial Content\r\n"
            r0.append(r1)
        L12:
            java.lang.String r1 = "Accept-Ranges: bytes\r\n"
            r0.append(r1)
            java.lang.String r1 = "Content-Type: "
            r0.append(r1)
            java.lang.String r1 = r4.xt
            r0.append(r1)
            java.lang.String r1 = "\r\n"
            r0.append(r1)
            java.lang.String r2 = "Content-Length: "
            if (r5 > 0) goto L36
            r0.append(r2)
            int r4 = r4.cw
            r0.append(r4)
            r0.append(r1)
            goto L63
        L36:
            java.lang.String r3 = "Content-Range: bytes "
            r0.append(r3)
            r0.append(r5)
            java.lang.String r3 = "-"
            r0.append(r3)
            int r3 = r4.cw
            int r3 = r3 + (-1)
            r0.append(r3)
            java.lang.String r3 = "/"
            r0.append(r3)
            int r3 = r4.cw
            r0.append(r3)
            r0.append(r1)
            r0.append(r2)
            int r4 = r4.cw
            int r4 = r4 - r5
            r0.append(r4)
            r0.append(r1)
        L63:
            java.lang.String r4 = "Connection: close\r\n"
            r0.append(r4)
            r0.append(r1)
            java.lang.String r4 = r0.toString()
            boolean r5 = com.bykv.vk.openvk.component.video.j.xt.up.cw
            if (r5 == 0) goto L78
            java.lang.String r5 = "TAG_PROXY_WRITE_TO_MP"
            com.bytedance.sdk.component.utils.vl.j(r5, r4)
        L78:
            return r4
    }

    public static java.util.List<com.bykv.vk.openvk.component.video.j.xt.g.xt> j(java.util.List<com.bykv.vk.openvk.component.video.j.xt.g.xt> r7) {
            if (r7 == 0) goto Lb3
            int r0 = r7.size()
            if (r0 != 0) goto La
            goto Lb3
        La:
            boolean r0 = com.bykv.vk.openvk.component.video.j.xt.up.cw
            java.lang.String r1 = ": "
            r2 = 0
            if (r0 == 0) goto L3e
            int r0 = r7.size()
            r3 = 0
        L16:
            if (r3 >= r0) goto L3e
            java.lang.Object r4 = r7.get(r3)
            com.bykv.vk.openvk.component.video.j.xt.g$xt r4 = (com.bykv.vk.openvk.component.video.j.xt.g.xt) r4
            if (r4 == 0) goto L3b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r4.j
            r5.append(r6)
            r5.append(r1)
            java.lang.String r4 = r4.j
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "TAG_PROXY_PRE_FILTER"
            com.bytedance.sdk.component.utils.vl.j(r5, r4)
        L3b:
            int r3 = r3 + 1
            goto L16
        L3e:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r7.iterator()
        L47:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L7f
            java.lang.Object r4 = r3.next()
            com.bykv.vk.openvk.component.video.j.xt.g$xt r4 = (com.bykv.vk.openvk.component.video.j.xt.g.xt) r4
            java.lang.String r5 = "Host"
            java.lang.String r6 = r4.j
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L7b
            java.lang.String r5 = "Keep-Alive"
            java.lang.String r6 = r4.j
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L7b
            java.lang.String r5 = "Connection"
            java.lang.String r6 = r4.j
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L7b
            java.lang.String r5 = "Proxy-Connection"
            java.lang.String r6 = r4.j
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L47
        L7b:
            r0.add(r4)
            goto L47
        L7f:
            r7.removeAll(r0)
            boolean r0 = com.bykv.vk.openvk.component.video.j.xt.up.cw
            if (r0 == 0) goto Lb2
            int r0 = r7.size()
        L8a:
            if (r2 >= r0) goto Lb2
            java.lang.Object r3 = r7.get(r2)
            com.bykv.vk.openvk.component.video.j.xt.g$xt r3 = (com.bykv.vk.openvk.component.video.j.xt.g.xt) r3
            if (r3 == 0) goto Laf
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r3.j
            r4.append(r5)
            r4.append(r1)
            java.lang.String r3 = r3.xt
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "TAG_PROXY_POST_FILTER"
            com.bytedance.sdk.component.utils.vl.j(r4, r3)
        Laf:
            int r2 = r2 + 1
            goto L8a
        Lb2:
            return r7
        Lb3:
            r7 = 0
            return r7
    }

    public static java.util.List<com.bykv.vk.openvk.component.video.j.xt.g.xt> j(java.util.Map<java.lang.String, java.lang.String> r5) {
            r0 = 0
            if (r5 == 0) goto L3e
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto La
            goto L3e
        La:
            java.util.Set r5 = r5.entrySet()     // Catch: java.lang.Throwable -> L38
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L38
            r1.<init>()     // Catch: java.lang.Throwable -> L38
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L38
        L17:
            boolean r2 = r5.hasNext()     // Catch: java.lang.Throwable -> L38
            if (r2 == 0) goto L3a
            java.lang.Object r2 = r5.next()     // Catch: java.lang.Throwable -> L38
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L38
            com.bykv.vk.openvk.component.video.j.xt.g$xt r3 = new com.bykv.vk.openvk.component.video.j.xt.g$xt     // Catch: java.lang.Throwable -> L38
            java.lang.Object r4 = r2.getKey()     // Catch: java.lang.Throwable -> L38
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L38
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L38
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L38
            r3.<init>(r4, r2)     // Catch: java.lang.Throwable -> L38
            r1.add(r3)     // Catch: java.lang.Throwable -> L38
            goto L17
        L38:
            r5 = move-exception
            goto L3b
        L3a:
            return r1
        L3b:
            com.bytedance.sdk.component.utils.vl.j(r5)
        L3e:
            return r0
    }

    public static java.util.List<java.lang.String> j(java.lang.String... r6) {
            r0 = 0
            if (r6 == 0) goto L27
            int r1 = r6.length
            if (r1 != 0) goto L7
            goto L27
        L7:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r6.length
            r1.<init>(r2)
            int r2 = r6.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L1f
            r4 = r6[r3]
            boolean r5 = j(r4)
            if (r5 == 0) goto L1c
            r1.add(r4)
        L1c:
            int r3 = r3 + 1
            goto Lf
        L1f:
            boolean r6 = r1.isEmpty()
            if (r6 == 0) goto L26
            return r0
        L26:
            return r1
        L27:
            return r0
    }

    public static void j(com.bytedance.sdk.component.oq.g r2) {
            if (r2 == 0) goto L23
            boolean r0 = xt()
            java.lang.String r1 = "TAG_PROXY_UTIL"
            if (r0 == 0) goto L17
            com.bytedance.sdk.component.oq.ae.xt(r2)
            boolean r2 = com.bykv.vk.openvk.component.video.j.xt.up.cw
            if (r2 == 0) goto L23
            java.lang.String r2 = "invoke in pool thread"
            com.bytedance.sdk.component.utils.vl.r(r1, r2)
            return
        L17:
            r2.run()
            boolean r2 = com.bykv.vk.openvk.component.video.j.xt.up.cw
            if (r2 == 0) goto L23
            java.lang.String r2 = "invoke calling thread"
            com.bytedance.sdk.component.utils.vl.r(r1, r2)
        L23:
            return
    }

    public static void j(java.io.Closeable r0) {
            if (r0 == 0) goto L5
            r0.close()     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public static void j(java.io.RandomAccessFile r1) {
            if (r1 == 0) goto Lc
            java.io.FileDescriptor r0 = r1.getFD()     // Catch: java.lang.Throwable -> Lc
            r0.sync()     // Catch: java.lang.Throwable -> Lc
            r1.close()     // Catch: java.lang.Throwable -> Lc
        Lc:
            return
    }

    public static void j(java.lang.Runnable r1) {
            if (r1 == 0) goto L11
            boolean r0 = xt()
            if (r0 == 0) goto Lc
            r1.run()
            return
        Lc:
            android.os.Handler r0 = com.bykv.vk.openvk.component.video.j.cw.j.xt
            r0.post(r1)
        L11:
            return
    }

    public static void j(java.net.ServerSocket r0) {
            if (r0 == 0) goto L5
            r0.close()     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public static void j(java.net.Socket r0) {
            if (r0 == 0) goto L5
            r0.close()     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public static boolean j(java.lang.String r1) {
            if (r1 == 0) goto L14
            java.lang.String r0 = "http://"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L12
            java.lang.String r0 = "https://"
            boolean r1 = r1.startsWith(r0)
            if (r1 == 0) goto L14
        L12:
            r1 = 1
            return r1
        L14:
            r1 = 0
            return r1
    }

    public static int xt(java.lang.String r1) {
            r0 = 0
            int r1 = j(r1, r0)
            return r1
    }

    public static java.lang.String xt(int r2, int r3) {
            java.lang.String r0 = "-"
            if (r2 < 0) goto L19
            if (r3 <= 0) goto L19
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r0)
            r1.append(r3)
            java.lang.String r2 = r1.toString()
            return r2
        L19:
            if (r2 <= 0) goto L2b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r0)
            java.lang.String r2 = r3.toString()
            return r2
        L2b:
            if (r2 >= 0) goto L3c
            if (r3 <= 0) goto L3c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            return r2
        L3c:
            r2 = 0
            return r2
    }

    public static java.lang.String xt(java.util.List<com.bykv.vk.openvk.component.video.j.xt.g.xt> r6) {
            if (r6 == 0) goto L3a
            int r0 = r6.size()
            if (r0 != 0) goto L9
            goto L3a
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r6.size()
            r2 = 0
            r3 = 0
        L14:
            if (r3 >= r1) goto L35
            java.lang.Object r4 = r6.get(r2)
            com.bykv.vk.openvk.component.video.j.xt.g$xt r4 = (com.bykv.vk.openvk.component.video.j.xt.g.xt) r4
            if (r4 == 0) goto L32
            java.lang.String r5 = r4.j
            r0.append(r5)
            java.lang.String r5 = ": "
            r0.append(r5)
            java.lang.String r4 = r4.xt
            r0.append(r4)
            java.lang.String r4 = "\r\n"
            r0.append(r4)
        L32:
            int r3 = r3 + 1
            goto L14
        L35:
            java.lang.String r6 = r0.toString()
            return r6
        L3a:
            java.lang.String r6 = ""
            return r6
    }

    public static java.lang.String xt(java.util.Map<java.lang.String, java.lang.String> r3) {
            if (r3 == 0) goto L40
            int r0 = r3.size()
            if (r0 != 0) goto L9
            goto L40
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L16:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r3.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            r0.append(r2)
            java.lang.String r2 = ": "
            r0.append(r2)
            java.lang.Object r1 = r1.getValue()
            r0.append(r1)
            java.lang.String r1 = "\r\n"
            r0.append(r1)
            goto L16
        L3b:
            java.lang.String r3 = r0.toString()
            return r3
        L40:
            java.lang.String r3 = ""
            return r3
    }

    public static boolean xt() {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            java.lang.Thread r1 = r1.getThread()
            if (r0 != r1) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }
}
