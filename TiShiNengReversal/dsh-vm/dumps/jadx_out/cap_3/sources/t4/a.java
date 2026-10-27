package t4;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class a implements master.flame.danmaku.danmaku.parser.b<java.io.InputStream> {
    private java.io.InputStream d;

    public a(android.net.Uri r1) {
            r0 = this;
            r0.<init>()
            r0.d(r1)
            return
    }

    public a(java.io.File r1) {
            r0 = this;
            r0.<init>()
            r0.b(r1)
            return
    }

    public a(java.io.InputStream r1) {
            r0 = this;
            r0.<init>()
            r0.d = r1
            return
    }

    public a(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            r1.b(r0)
            return
    }

    public java.io.InputStream a() {
            r1 = this;
            java.io.InputStream r0 = r1.d
            return r0
    }

    public void b(java.io.File r3) {
            r2 = this;
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch: java.io.FileNotFoundException -> Lc
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> Lc
            r1.<init>(r3)     // Catch: java.io.FileNotFoundException -> Lc
            r0.<init>(r1)     // Catch: java.io.FileNotFoundException -> Lc
            r2.d = r0     // Catch: java.io.FileNotFoundException -> Lc
        Lc:
            return
    }

    public void c(android.net.Uri r2) {
            r1 = this;
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> L17
            java.lang.String r2 = r2.getPath()     // Catch: java.lang.Throwable -> L17
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L17
            r0.openConnection()     // Catch: java.lang.Throwable -> L17
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L17
            java.io.InputStream r0 = r0.openStream()     // Catch: java.lang.Throwable -> L17
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L17
            r1.d = r2     // Catch: java.lang.Throwable -> L17
        L17:
            return
    }

    public void d(android.net.Uri r3) {
            r2 = this;
            java.lang.String r0 = r3.getScheme()
            java.lang.String r1 = "http"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 != 0) goto L2a
            java.lang.String r1 = "https"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L15
            goto L2a
        L15:
            java.lang.String r1 = "file"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L29
            java.io.File r0 = new java.io.File
            java.lang.String r3 = r3.getPath()
            r0.<init>(r3)
            r2.b(r0)
        L29:
            return
        L2a:
            r2.c(r3)
            return
    }

    public /* bridge */ /* synthetic */ java.lang.Object data() {
            r1 = this;
            java.io.InputStream r0 = r1.a()
            return r0
    }

    public void release() {
            r1 = this;
            java.io.InputStream r0 = r1.d
            v4.b.a(r0)
            r0 = 0
            r1.d = r0
            return
    }
}
