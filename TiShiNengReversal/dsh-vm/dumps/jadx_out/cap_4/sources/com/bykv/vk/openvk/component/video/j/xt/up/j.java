package com.bykv.vk.openvk.component.video.j.xt.up;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class j {
    java.util.List<com.bykv.vk.openvk.component.video.j.xt.g.xt> j;
    com.bykv.vk.openvk.component.video.j.xt.up.up xt;

    public j() {
            r0 = this;
            r0.<init>()
            return
    }

    public com.bykv.vk.openvk.component.video.j.xt.up.up ae() {
            r1 = this;
            com.bykv.vk.openvk.component.video.j.xt.up.up r0 = r1.xt
            return r0
    }

    public abstract java.util.List<com.bykv.vk.openvk.component.video.j.xt.g.xt> cw();

    public abstract int j();

    protected com.bykv.vk.openvk.component.video.j.xt.g.xt j(java.lang.String r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.util.List<com.bykv.vk.openvk.component.video.j.xt.g$xt> r1 = r4.j
            if (r1 == 0) goto L29
            int r1 = r1.size()
            if (r1 <= 0) goto L29
            java.util.List<com.bykv.vk.openvk.component.video.j.xt.g$xt> r1 = r4.j
            java.util.Iterator r1 = r1.iterator()
        L14:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r1.next()
            com.bykv.vk.openvk.component.video.j.xt.g$xt r2 = (com.bykv.vk.openvk.component.video.j.xt.g.xt) r2
            java.lang.String r3 = r2.j
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L14
            return r2
        L29:
            return r0
    }

    protected java.lang.String j(int r1) {
            r0 = this;
            switch(r1) {
                case 200: goto L75;
                case 201: goto L72;
                case 202: goto L6f;
                case 203: goto L6c;
                case 204: goto L69;
                case 205: goto L66;
                case 206: goto L63;
                default: goto L3;
            }
        L3:
            switch(r1) {
                case 300: goto L60;
                case 301: goto L5d;
                case 302: goto L5a;
                case 303: goto L57;
                case 304: goto L54;
                case 305: goto L51;
                default: goto L6;
            }
        L6:
            switch(r1) {
                case 400: goto L4e;
                case 401: goto L4b;
                case 402: goto L48;
                case 403: goto L45;
                case 404: goto L42;
                case 405: goto L3f;
                case 406: goto L3c;
                case 407: goto L39;
                case 408: goto L36;
                case 409: goto L33;
                case 410: goto L30;
                case 411: goto L2d;
                case 412: goto L2a;
                case 413: goto L27;
                case 414: goto L24;
                case 415: goto L21;
                default: goto L9;
            }
        L9:
            switch(r1) {
                case 500: goto L1e;
                case 501: goto L1b;
                case 502: goto L18;
                case 503: goto L15;
                case 504: goto L12;
                case 505: goto Lf;
                default: goto Lc;
            }
        Lc:
            java.lang.String r1 = ""
            return r1
        Lf:
            java.lang.String r1 = "HTTP Version Not Supported"
            return r1
        L12:
            java.lang.String r1 = "Gateway Timeout"
            return r1
        L15:
            java.lang.String r1 = "Service Unavailable"
            return r1
        L18:
            java.lang.String r1 = "Bad Gateway"
            return r1
        L1b:
            java.lang.String r1 = "Not Implemented"
            return r1
        L1e:
            java.lang.String r1 = "Internal Server Error"
            return r1
        L21:
            java.lang.String r1 = "Unsupported Media Type"
            return r1
        L24:
            java.lang.String r1 = "Request-URI Too Large"
            return r1
        L27:
            java.lang.String r1 = "Request Entity Too Large"
            return r1
        L2a:
            java.lang.String r1 = "Precondition Failed"
            return r1
        L2d:
            java.lang.String r1 = "Length Required"
            return r1
        L30:
            java.lang.String r1 = "Gone"
            return r1
        L33:
            java.lang.String r1 = "Conflict"
            return r1
        L36:
            java.lang.String r1 = "Request Time-Out"
            return r1
        L39:
            java.lang.String r1 = "Proxy Authentication Required"
            return r1
        L3c:
            java.lang.String r1 = "Not Acceptable"
            return r1
        L3f:
            java.lang.String r1 = "Method Not Allowed"
            return r1
        L42:
            java.lang.String r1 = "Not Found"
            return r1
        L45:
            java.lang.String r1 = "Forbidden"
            return r1
        L48:
            java.lang.String r1 = "Payment Required"
            return r1
        L4b:
            java.lang.String r1 = "Unauthorized"
            return r1
        L4e:
            java.lang.String r1 = "Bad Request"
            return r1
        L51:
            java.lang.String r1 = "Use Proxy"
            return r1
        L54:
            java.lang.String r1 = "Not Modified"
            return r1
        L57:
            java.lang.String r1 = "See Other"
            return r1
        L5a:
            java.lang.String r1 = "Temporary Redirect"
            return r1
        L5d:
            java.lang.String r1 = "Moved Permanently"
            return r1
        L60:
            java.lang.String r1 = "Multiple Choices"
            return r1
        L63:
            java.lang.String r1 = "Partial Content"
            return r1
        L66:
            java.lang.String r1 = "Reset Content"
            return r1
        L69:
            java.lang.String r1 = "No Content"
            return r1
        L6c:
            java.lang.String r1 = "Non-Authoritative"
            return r1
        L6f:
            java.lang.String r1 = "Accepted"
            return r1
        L72:
            java.lang.String r1 = "Created"
            return r1
        L75:
            java.lang.String r1 = "OK"
            return r1
    }

    public abstract java.lang.String j(java.lang.String r1, java.lang.String r2);

    public abstract java.lang.String m();

    public abstract java.io.InputStream r();

    public abstract java.lang.String up();

    public abstract boolean xt();
}
