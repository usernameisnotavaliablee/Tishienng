package t4;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class b implements master.flame.danmaku.danmaku.parser.b<org.json.JSONArray> {
    private org.json.JSONArray d;
    private java.io.InputStream e;

    public b(android.net.Uri r3) throws java.io.IOException, org.json.JSONException {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = r3.getScheme()
            java.lang.String r1 = "http"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 != 0) goto L2d
            java.lang.String r1 = "https"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L18
            goto L2d
        L18:
            java.lang.String r1 = "file"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L2c
            java.io.FileInputStream r0 = new java.io.FileInputStream
            java.lang.String r3 = r3.getPath()
            r0.<init>(r3)
            r2.b(r0)
        L2c:
            return
        L2d:
            java.net.URL r0 = new java.net.URL
            java.lang.String r3 = r3.getPath()
            r0.<init>(r3)
            java.io.InputStream r3 = r0.openStream()
            r2.b(r3)
            return
    }

    public b(java.io.File r2) throws java.io.FileNotFoundException, org.json.JSONException {
            r1 = this;
            r1.<init>()
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r2)
            r1.b(r0)
            return
    }

    public b(java.io.InputStream r1) throws org.json.JSONException {
            r0 = this;
            r0.<init>()
            r0.b(r1)
            return
    }

    public b(java.lang.String r1) throws org.json.JSONException {
            r0 = this;
            r0.<init>()
            r0.c(r1)
            return
    }

    public b(java.net.URL r1) throws org.json.JSONException, java.io.IOException {
            r0 = this;
            java.io.InputStream r1 = r1.openStream()
            r0.<init>(r1)
            return
    }

    private void b(java.io.InputStream r2) throws org.json.JSONException {
            r1 = this;
            if (r2 == 0) goto Lc
            r1.e = r2
            java.lang.String r2 = v4.b.d(r2)
            r1.c(r2)
            return
        Lc:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "input stream cannot be null!"
            r2.<init>(r0)
            throw r2
    }

    private void c(java.lang.String r2) throws org.json.JSONException {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto Ld
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>(r2)
            r1.d = r0
        Ld:
            return
    }

    public org.json.JSONArray a() {
            r1 = this;
            org.json.JSONArray r0 = r1.d
            return r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object data() {
            r1 = this;
            org.json.JSONArray r0 = r1.a()
            return r0
    }

    public void release() {
            r1 = this;
            java.io.InputStream r0 = r1.e
            v4.b.a(r0)
            r0 = 0
            r1.e = r0
            r1.d = r0
            return
    }
}
