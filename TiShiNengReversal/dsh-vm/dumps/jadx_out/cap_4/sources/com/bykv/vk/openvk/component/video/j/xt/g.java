package com.bykv.vk.openvk.component.video.j.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class g {
    public final com.bykv.vk.openvk.component.video.j.xt.g.j cw;
    public final com.bykv.vk.openvk.component.video.j.xt.g.cw j;
    public final java.util.List<com.bykv.vk.openvk.component.video.j.xt.g.xt> xt;

    static final class cw {
        final java.lang.String cw;
        final java.lang.String j;
        final java.lang.String xt;

        private cw(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
                r0 = this;
                r0.<init>()
                r0.j = r1
                r0.xt = r2
                r0.cw = r3
                return
        }

        static com.bykv.vk.openvk.component.video.j.xt.g.cw j(java.lang.String r5) throws com.bykv.vk.openvk.component.video.j.xt.g.r {
                r0 = 32
                int r1 = r5.indexOf(r0)
                r2 = -1
                java.lang.String r3 = "request line format error, line: "
                if (r1 == r2) goto L5a
                int r0 = r5.lastIndexOf(r0)
                if (r0 <= r1) goto L50
                r2 = 0
                java.lang.String r2 = r5.substring(r2, r1)
                java.lang.String r2 = r2.trim()
                int r1 = r1 + 1
                java.lang.String r1 = r5.substring(r1, r0)
                java.lang.String r1 = r1.trim()
                int r0 = r0 + 1
                java.lang.String r0 = r5.substring(r0)
                java.lang.String r0 = r0.trim()
                int r4 = r2.length()
                if (r4 == 0) goto L46
                int r4 = r1.length()
                if (r4 == 0) goto L46
                int r4 = r0.length()
                if (r4 == 0) goto L46
                com.bykv.vk.openvk.component.video.j.xt.g$cw r5 = new com.bykv.vk.openvk.component.video.j.xt.g$cw
                r5.<init>(r2, r1, r0)
                return r5
            L46:
                com.bykv.vk.openvk.component.video.j.xt.g$r r0 = new com.bykv.vk.openvk.component.video.j.xt.g$r
                java.lang.String r5 = r3.concat(r5)
                r0.<init>(r5)
                throw r0
            L50:
                com.bykv.vk.openvk.component.video.j.xt.g$r r0 = new com.bykv.vk.openvk.component.video.j.xt.g$r
                java.lang.String r5 = r3.concat(r5)
                r0.<init>(r5)
                throw r0
            L5a:
                com.bykv.vk.openvk.component.video.j.xt.g$r r0 = new com.bykv.vk.openvk.component.video.j.xt.g$r
                java.lang.String r5 = r3.concat(r5)
                r0.<init>(r5)
                throw r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "RequestLine{method='"
                r0.<init>(r1)
                java.lang.String r1 = r3.j
                r0.append(r1)
                r1 = 39
                r0.append(r1)
                java.lang.String r2 = ", path='"
                r0.append(r2)
                java.lang.String r2 = r3.xt
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", version='"
                r0.append(r2)
                java.lang.String r2 = r3.cw
                r0.append(r2)
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static final class j {
        final java.util.List<java.lang.String> ae;
        final java.lang.String cw;
        final int j;

        /* renamed from: m, reason: collision with root package name */
        final java.lang.String f1709m;

        /* renamed from: r, reason: collision with root package name */
        final int f1710r;
        final int up;
        final java.lang.String xt;

        private j(int r1, java.lang.String r2, java.lang.String r3, int r4, int r5, java.lang.String r6, java.util.List<java.lang.String> r7) {
                r0 = this;
                r0.<init>()
                r0.j = r1
                r0.xt = r2
                r0.cw = r3
                r0.f1710r = r4
                r0.up = r5
                r0.f1709m = r6
                r0.ae = r7
                return
        }

        static com.bykv.vk.openvk.component.video.j.xt.g.j j(com.bykv.vk.openvk.component.video.j.xt.g.cw r14, java.util.List<com.bykv.vk.openvk.component.video.j.xt.g.xt> r15) throws com.bykv.vk.openvk.component.video.j.xt.g.r {
                java.lang.String r0 = r14.xt
                java.lang.String r1 = "?"
                int r0 = r0.indexOf(r1)
                r1 = -1
                if (r0 == r1) goto L1c6
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                java.lang.String r2 = r14.xt
                r3 = 1
                int r0 = r0 + r3
                java.lang.String r0 = r2.substring(r0)
                java.lang.String r2 = "&"
                java.lang.String[] r0 = r0.split(r2)
                int r2 = r0.length
                r4 = 0
                r5 = 0
                r5 = r4
                r7 = r5
                r3 = 0
                r6 = 0
                r8 = 1
                r10 = 0
            L27:
                java.lang.String r11 = "="
                if (r6 >= r2) goto L81
                r12 = r0[r6]
                java.lang.String[] r11 = r12.split(r11)
                int r12 = r11.length
                r13 = 2
                if (r12 != r13) goto L7e
                java.lang.String r12 = "rk"
                r13 = r11[r10]
                boolean r12 = r12.equals(r13)
                if (r12 == 0) goto L46
                r4 = r11[r8]
                java.lang.String r4 = android.net.Uri.decode(r4)
                goto L7e
            L46:
                java.lang.String r12 = "k"
                r13 = r11[r10]
                boolean r12 = r12.equals(r13)
                if (r12 == 0) goto L57
                r5 = r11[r8]
                java.lang.String r5 = android.net.Uri.decode(r5)
                goto L7e
            L57:
                r12 = r11[r10]
                java.lang.String r13 = "u"
                boolean r12 = r12.startsWith(r13)
                if (r12 == 0) goto L6b
                r11 = r11[r8]
                java.lang.String r11 = android.net.Uri.decode(r11)
                r9.add(r11)
                goto L7e
            L6b:
                java.lang.String r12 = "f"
                r13 = r11[r10]
                boolean r12 = r12.equals(r13)
                if (r12 == 0) goto L7e
                r11 = r11[r8]
                int r11 = com.bykv.vk.openvk.component.video.j.cw.j.xt(r11)
                if (r11 != r8) goto L7e
                r3 = 1
            L7e:
                int r6 = r6 + 1
                goto L27
            L81:
                boolean r0 = android.text.TextUtils.isEmpty(r4)
                if (r0 != 0) goto L1b0
                boolean r0 = android.text.TextUtils.isEmpty(r5)
                if (r0 != 0) goto L1b0
                if (r15 == 0) goto L18b
                java.util.Iterator r15 = r15.iterator()
                r0 = 0
                r2 = 0
            L95:
                boolean r6 = r15.hasNext()
                if (r6 == 0) goto L187
                java.lang.Object r6 = r15.next()
                com.bykv.vk.openvk.component.video.j.xt.g$xt r6 = (com.bykv.vk.openvk.component.video.j.xt.g.xt) r6
                if (r6 == 0) goto L95
                java.lang.String r8 = "Range"
                java.lang.String r12 = r6.j
                boolean r8 = r8.equalsIgnoreCase(r12)
                if (r8 == 0) goto L95
                java.lang.String r7 = r6.xt
                int r7 = r7.indexOf(r11)
                java.lang.String r8 = "Range format error, Range: "
                if (r7 == r1) goto L173
                java.lang.String r12 = r6.xt
                java.lang.String r12 = r12.substring(r10, r7)
                java.lang.String r12 = r12.trim()
                java.lang.String r13 = "bytes"
                boolean r12 = r13.equalsIgnoreCase(r12)
                if (r12 == 0) goto L15f
                java.lang.String r12 = r6.xt
                int r7 = r7 + 1
                java.lang.String r7 = r12.substring(r7)
                java.lang.String r12 = ","
                boolean r12 = r7.contains(r12)
                if (r12 != 0) goto L14b
                java.lang.String r12 = "-"
                int r12 = r7.indexOf(r12)
                if (r12 == r1) goto L137
                java.lang.String r13 = r7.substring(r10, r12)
                java.lang.String r13 = r13.trim()
                int r12 = r12 + 1
                java.lang.String r7 = r7.substring(r12)
                java.lang.String r7 = r7.trim()
                int r12 = r13.length()     // Catch: java.lang.NumberFormatException -> L123
                if (r12 <= 0) goto Lfd
                int r0 = java.lang.Integer.parseInt(r13)     // Catch: java.lang.NumberFormatException -> L123
            Lfd:
                int r12 = r7.length()     // Catch: java.lang.NumberFormatException -> L123
                if (r12 <= 0) goto L11e
                int r2 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.NumberFormatException -> L123
                if (r0 > r2) goto L10a
                goto L11e
            L10a:
                com.bykv.vk.openvk.component.video.j.xt.g$r r14 = new com.bykv.vk.openvk.component.video.j.xt.g$r     // Catch: java.lang.NumberFormatException -> L123
                java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L123
                r15.<init>(r8)     // Catch: java.lang.NumberFormatException -> L123
                java.lang.String r0 = r6.xt     // Catch: java.lang.NumberFormatException -> L123
                r15.append(r0)     // Catch: java.lang.NumberFormatException -> L123
                java.lang.String r15 = r15.toString()     // Catch: java.lang.NumberFormatException -> L123
                r14.<init>(r15)     // Catch: java.lang.NumberFormatException -> L123
                throw r14     // Catch: java.lang.NumberFormatException -> L123
            L11e:
                java.lang.String r6 = r6.xt
                r7 = r6
                goto L95
            L123:
                com.bykv.vk.openvk.component.video.j.xt.g$r r14 = new com.bykv.vk.openvk.component.video.j.xt.g$r
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>(r8)
                java.lang.String r0 = r6.xt
                r15.append(r0)
                java.lang.String r15 = r15.toString()
                r14.<init>(r15)
                throw r14
            L137:
                com.bykv.vk.openvk.component.video.j.xt.g$r r14 = new com.bykv.vk.openvk.component.video.j.xt.g$r
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>(r8)
                java.lang.String r0 = r6.xt
                r15.append(r0)
                java.lang.String r15 = r15.toString()
                r14.<init>(r15)
                throw r14
            L14b:
                com.bykv.vk.openvk.component.video.j.xt.g$r r14 = new com.bykv.vk.openvk.component.video.j.xt.g$r
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>(r8)
                java.lang.String r0 = r6.xt
                r15.append(r0)
                java.lang.String r15 = r15.toString()
                r14.<init>(r15)
                throw r14
            L15f:
                com.bykv.vk.openvk.component.video.j.xt.g$r r14 = new com.bykv.vk.openvk.component.video.j.xt.g$r
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>(r8)
                java.lang.String r0 = r6.xt
                r15.append(r0)
                java.lang.String r15 = r15.toString()
                r14.<init>(r15)
                throw r14
            L173:
                com.bykv.vk.openvk.component.video.j.xt.g$r r14 = new com.bykv.vk.openvk.component.video.j.xt.g$r
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>(r8)
                java.lang.String r0 = r6.xt
                r15.append(r0)
                java.lang.String r15 = r15.toString()
                r14.<init>(r15)
                throw r14
            L187:
                r6 = r0
                r8 = r7
                r7 = r2
                goto L18e
            L18b:
                r8 = r7
                r6 = 0
                r7 = 0
            L18e:
                boolean r15 = r9.isEmpty()
                if (r15 != 0) goto L19a
                com.bykv.vk.openvk.component.video.j.xt.g$j r2 = new com.bykv.vk.openvk.component.video.j.xt.g$j
                r2.<init>(r3, r4, r5, r6, r7, r8, r9)
                return r2
            L19a:
                com.bykv.vk.openvk.component.video.j.xt.g$r r15 = new com.bykv.vk.openvk.component.video.j.xt.g$r
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "no url found: path: "
                r0.<init>(r1)
                java.lang.String r14 = r14.xt
                r0.append(r14)
                java.lang.String r14 = r0.toString()
                r15.<init>(r14)
                throw r15
            L1b0:
                com.bykv.vk.openvk.component.video.j.xt.g$r r15 = new com.bykv.vk.openvk.component.video.j.xt.g$r
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "rawKey or key is empty, path: "
                r0.<init>(r1)
                java.lang.String r14 = r14.xt
                r0.append(r14)
                java.lang.String r14 = r0.toString()
                r15.<init>(r14)
                throw r15
            L1c6:
                com.bykv.vk.openvk.component.video.j.xt.g$r r15 = new com.bykv.vk.openvk.component.video.j.xt.g$r
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "path format error, path: "
                r0.<init>(r1)
                java.lang.String r14 = r14.xt
                r0.append(r14)
                java.lang.String r14 = r0.toString()
                r15.<init>(r14)
                throw r15
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Extra{flag="
                r0.<init>(r1)
                int r1 = r3.j
                r0.append(r1)
                java.lang.String r1 = ", rawKey='"
                r0.append(r1)
                java.lang.String r1 = r3.xt
                r0.append(r1)
                r1 = 39
                r0.append(r1)
                java.lang.String r2 = ", key='"
                r0.append(r2)
                java.lang.String r2 = r3.cw
                r0.append(r2)
                r0.append(r1)
                java.lang.String r1 = ", from="
                r0.append(r1)
                int r1 = r3.f1710r
                r0.append(r1)
                java.lang.String r1 = ", to="
                r0.append(r1)
                int r1 = r3.up
                r0.append(r1)
                java.lang.String r1 = ", urls="
                r0.append(r1)
                java.util.List<java.lang.String> r1 = r3.ae
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static final class r extends java.lang.Exception {
        r(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    public static final class xt {
        public final java.lang.String j;
        public final java.lang.String xt;

        public xt(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.j = r1
                r0.xt = r2
                return
        }

        static com.bykv.vk.openvk.component.video.j.xt.g.xt j(java.lang.String r4) throws com.bykv.vk.openvk.component.video.j.xt.g.r {
                java.lang.String r0 = ":"
                int r0 = r4.indexOf(r0)
                r1 = -1
                java.lang.String r2 = "request header format error, header: "
                if (r0 == r1) goto L3a
                r1 = 0
                java.lang.String r1 = r4.substring(r1, r0)
                java.lang.String r1 = r1.trim()
                int r0 = r0 + 1
                java.lang.String r0 = r4.substring(r0)
                java.lang.String r0 = r0.trim()
                int r3 = r1.length()
                if (r3 == 0) goto L30
                int r3 = r0.length()
                if (r3 == 0) goto L30
                com.bykv.vk.openvk.component.video.j.xt.g$xt r4 = new com.bykv.vk.openvk.component.video.j.xt.g$xt
                r4.<init>(r1, r0)
                return r4
            L30:
                com.bykv.vk.openvk.component.video.j.xt.g$r r0 = new com.bykv.vk.openvk.component.video.j.xt.g$r
                java.lang.String r4 = r2.concat(r4)
                r0.<init>(r4)
                throw r0
            L3a:
                com.bykv.vk.openvk.component.video.j.xt.g$r r0 = new com.bykv.vk.openvk.component.video.j.xt.g$r
                java.lang.String r4 = r2.concat(r4)
                r0.<init>(r4)
                throw r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Header{name='"
                r0.<init>(r1)
                java.lang.String r1 = r3.j
                r0.append(r1)
                r1 = 39
                r0.append(r1)
                java.lang.String r2 = ", value='"
                r0.append(r2)
                java.lang.String r2 = r3.xt
                r0.append(r2)
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public g(com.bykv.vk.openvk.component.video.j.xt.g.cw r1, java.util.List<com.bykv.vk.openvk.component.video.j.xt.g.xt> r2, com.bykv.vk.openvk.component.video.j.xt.g.j r3) {
            r0 = this;
            r0.<init>()
            r0.j = r1
            r0.xt = r2
            r0.cw = r3
            return
    }

    public static com.bykv.vk.openvk.component.video.j.xt.g j(java.io.InputStream r4) throws java.io.IOException, com.bykv.vk.openvk.component.video.j.xt.g.r {
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.nio.charset.Charset r2 = com.bykv.vk.openvk.component.video.j.cw.j.j
            r1.<init>(r4, r2)
            r0.<init>(r1)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r1 = 0
        L12:
            java.lang.String r2 = r0.readLine()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L2f
            java.lang.String r2 = r2.trim()
            if (r1 != 0) goto L27
            com.bykv.vk.openvk.component.video.j.xt.g$cw r1 = com.bykv.vk.openvk.component.video.j.xt.g.cw.j(r2)
            goto L12
        L27:
            com.bykv.vk.openvk.component.video.j.xt.g$xt r2 = com.bykv.vk.openvk.component.video.j.xt.g.xt.j(r2)
            r4.add(r2)
            goto L12
        L2f:
            if (r1 == 0) goto L3b
            com.bykv.vk.openvk.component.video.j.xt.g r0 = new com.bykv.vk.openvk.component.video.j.xt.g
            com.bykv.vk.openvk.component.video.j.xt.g$j r2 = com.bykv.vk.openvk.component.video.j.xt.g.j.j(r1, r4)
            r0.<init>(r1, r4, r2)
            return r0
        L3b:
            com.bykv.vk.openvk.component.video.j.xt.g$r r4 = new com.bykv.vk.openvk.component.video.j.xt.g$r
            java.lang.String r0 = "request line is null"
            r4.<init>(r0)
            throw r4
    }

    static java.lang.String j(java.lang.String r5, java.lang.String r6, java.util.List<java.lang.String> r7) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 512(0x200, float:7.17E-43)
            r0.<init>(r1)
            r1 = 0
            r2 = r1
        L9:
            if (r2 == 0) goto L1b
            int r2 = r7.size()
            r3 = 1
            if (r2 != r3) goto L13
            return r1
        L13:
            int r2 = r7.size()
            int r2 = r2 - r3
            r7.remove(r2)
        L1b:
            java.lang.String r2 = j(r0, r5, r6, r7)
            int r3 = r2.length()
            r4 = 3072(0xc00, float:4.305E-42)
            if (r3 > r4) goto L9
            return r2
    }

    private static java.lang.String j(java.lang.StringBuilder r2, java.lang.String r3, java.lang.String r4, java.util.List<java.lang.String> r5) {
            int r0 = r2.length()
            r1 = 0
            r2.delete(r1, r0)
            java.lang.String r0 = "rk="
            r2.append(r0)
            java.lang.String r3 = android.net.Uri.encode(r3)
            r2.append(r3)
            java.lang.String r3 = "&k="
            r2.append(r3)
            java.lang.String r3 = android.net.Uri.encode(r4)
            r2.append(r3)
            int r3 = r5.size()
        L24:
            if (r1 >= r3) goto L43
            java.lang.String r4 = "&u"
            r2.append(r4)
            r2.append(r1)
            java.lang.String r4 = "="
            r2.append(r4)
            java.lang.Object r4 = r5.get(r1)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = android.net.Uri.encode(r4)
            r2.append(r4)
            int r1 = r1 + 1
            goto L24
        L43:
            java.lang.String r2 = r2.toString()
            return r2
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Request{requestLine="
            r0.<init>(r1)
            com.bykv.vk.openvk.component.video.j.xt.g$cw r1 = r2.j
            r0.append(r1)
            java.lang.String r1 = ", headers="
            r0.append(r1)
            java.util.List<com.bykv.vk.openvk.component.video.j.xt.g$xt> r1 = r2.xt
            r0.append(r1)
            java.lang.String r1 = ", extra="
            r0.append(r1)
            com.bykv.vk.openvk.component.video.j.xt.g$j r1 = r2.cw
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
