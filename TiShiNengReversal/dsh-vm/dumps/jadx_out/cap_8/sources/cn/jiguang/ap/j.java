package cn.jiguang.ap;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class j extends cn.jiguang.ap.k {
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f607b;

    /* renamed from: c, reason: collision with root package name */
    private int f608c;

    /* renamed from: d, reason: collision with root package name */
    private int f609d;

    public j(android.content.Context r2) {
            r1 = this;
            java.lang.String r0 = "NET_HTTP"
            r1.<init>(r2, r0)
            return
    }

    public void a(cn.jiguang.net.HttpRequest r2, boolean r3) {
            r1 = this;
            if (r3 == 0) goto L5
            java.lang.String r0 = "POST"
            goto L7
        L5:
            java.lang.String r0 = "GET"
        L7:
            r1.a = r0
            if (r3 == 0) goto L19
            java.lang.String r3 = r2.getUrl()
            r1.f607b = r3
            byte[] r2 = r2.getParas()
            int r2 = r2.length
        L16:
            r1.f608c = r2
            goto L34
        L19:
            java.lang.String r2 = r2.getUrl()
            java.lang.String r3 = " \\?"
            java.lang.String[] r2 = r2.split(r3)
            r3 = 0
            r3 = r2[r3]
            r1.f607b = r3
            int r3 = r2.length
            r0 = 1
            if (r3 <= r0) goto L34
            r2 = r2[r0]
            byte[] r2 = r2.getBytes()
            int r2 = r2.length
            goto L16
        L34:
            r1.e()
            return
    }

    public void a(cn.jiguang.net.HttpResponse r3) {
            r2 = this;
            r2.f()
            int r0 = r3.getStatusCode()
            r2.d(r0)
            int r0 = r3.getStatusCode()
            r1 = -1
            if (r0 != r1) goto L18
            int r0 = r3.getResponseCode()
            r2.c(r0)
        L18:
            java.lang.String r0 = r3.getResponseBody()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2d
            java.lang.String r3 = r3.getResponseBody()
            byte[] r3 = r3.getBytes()
            int r3 = r3.length
            r2.f609d = r3
        L2d:
            return
    }

    @Override // cn.jiguang.ap.k
    org.json.JSONObject d() {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "method"
            java.lang.String r2 = r3.a
            r0.put(r1, r2)
            java.lang.String r1 = "url"
            java.lang.String r2 = r3.f607b
            r0.put(r1, r2)
            java.lang.String r1 = "request_byte"
            int r2 = r3.f608c
            r0.put(r1, r2)
            java.lang.String r1 = "response_byte"
            int r2 = r3.f609d
            r0.put(r1, r2)
            return r0
    }
}
