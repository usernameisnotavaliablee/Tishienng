package xyz.adscope.common.network;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class FormBody extends xyz.adscope.common.network.BaseContent<xyz.adscope.common.network.FormBody> implements xyz.adscope.common.network.RequestBody {
    private final java.nio.charset.Charset b;
    private final java.lang.String c;
    private final xyz.adscope.common.network.Params d;
    private java.lang.String e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: xyz.adscope.common.network.FormBody$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Builder {
        private java.nio.charset.Charset a;
        private java.lang.String b;
        private xyz.adscope.common.network.Params.Builder c;

        private Builder() {
                r1 = this;
                r1.<init>()
                xyz.adscope.common.network.Params$Builder r0 = xyz.adscope.common.network.Params.newBuilder()
                r1.c = r0
                return
        }

        /* synthetic */ Builder(xyz.adscope.common.network.FormBody.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ java.nio.charset.Charset a(xyz.adscope.common.network.FormBody.Builder r0) {
                java.nio.charset.Charset r0 = r0.a
                return r0
        }

        static /* synthetic */ java.lang.String b(xyz.adscope.common.network.FormBody.Builder r0) {
                java.lang.String r0 = r0.b
                return r0
        }

        static /* synthetic */ xyz.adscope.common.network.Params.Builder c(xyz.adscope.common.network.FormBody.Builder r0) {
                xyz.adscope.common.network.Params$Builder r0 = r0.c
                return r0
        }

        public xyz.adscope.common.network.FormBody.Builder binaries(java.lang.String r2, java.util.List<xyz.adscope.common.network.Binary> r3) {
                r1 = this;
                xyz.adscope.common.network.Params$Builder r0 = r1.c
                r0.binaries(r2, r3)
                return r1
        }

        public xyz.adscope.common.network.FormBody.Builder binary(java.lang.String r2, xyz.adscope.common.network.Binary r3) {
                r1 = this;
                xyz.adscope.common.network.Params$Builder r0 = r1.c
                r0.binary(r2, r3)
                return r1
        }

        public xyz.adscope.common.network.FormBody build() {
                r2 = this;
                xyz.adscope.common.network.FormBody r0 = new xyz.adscope.common.network.FormBody
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public xyz.adscope.common.network.FormBody.Builder charset(java.nio.charset.Charset r1) {
                r0 = this;
                r0.a = r1
                return r0
        }

        public xyz.adscope.common.network.FormBody.Builder clearParams() {
                r1 = this;
                xyz.adscope.common.network.Params$Builder r0 = r1.c
                r0.clear()
                return r1
        }

        public xyz.adscope.common.network.FormBody.Builder contentType(java.lang.String r1) {
                r0 = this;
                r0.b = r1
                return r0
        }

        public xyz.adscope.common.network.FormBody.Builder file(java.lang.String r2, java.io.File r3) {
                r1 = this;
                xyz.adscope.common.network.Params$Builder r0 = r1.c
                r0.file(r2, r3)
                return r1
        }

        public xyz.adscope.common.network.FormBody.Builder files(java.lang.String r2, java.util.List<java.io.File> r3) {
                r1 = this;
                xyz.adscope.common.network.Params$Builder r0 = r1.c
                r0.files(r2, r3)
                return r1
        }

        public xyz.adscope.common.network.FormBody.Builder param(java.lang.String r2, char r3) {
                r1 = this;
                xyz.adscope.common.network.Params$Builder r0 = r1.c
                r0.add(r2, r3)
                return r1
        }

        public xyz.adscope.common.network.FormBody.Builder param(java.lang.String r2, double r3) {
                r1 = this;
                xyz.adscope.common.network.Params$Builder r0 = r1.c
                r0.add(r2, r3)
                return r1
        }

        public xyz.adscope.common.network.FormBody.Builder param(java.lang.String r2, float r3) {
                r1 = this;
                xyz.adscope.common.network.Params$Builder r0 = r1.c
                r0.add(r2, r3)
                return r1
        }

        public xyz.adscope.common.network.FormBody.Builder param(java.lang.String r2, int r3) {
                r1 = this;
                xyz.adscope.common.network.Params$Builder r0 = r1.c
                r0.add(r2, r3)
                return r1
        }

        public xyz.adscope.common.network.FormBody.Builder param(java.lang.String r2, long r3) {
                r1 = this;
                xyz.adscope.common.network.Params$Builder r0 = r1.c
                r0.add(r2, r3)
                return r1
        }

        public xyz.adscope.common.network.FormBody.Builder param(java.lang.String r2, java.lang.CharSequence r3) {
                r1 = this;
                xyz.adscope.common.network.Params$Builder r0 = r1.c
                r0.add(r2, r3)
                return r1
        }

        public xyz.adscope.common.network.FormBody.Builder param(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                xyz.adscope.common.network.Params$Builder r0 = r1.c
                r0.add(r2, r3)
                return r1
        }

        public xyz.adscope.common.network.FormBody.Builder param(java.lang.String r2, java.util.List<java.lang.String> r3) {
                r1 = this;
                xyz.adscope.common.network.Params$Builder r0 = r1.c
                r0.add(r2, r3)
                return r1
        }

        public xyz.adscope.common.network.FormBody.Builder param(java.lang.String r2, short r3) {
                r1 = this;
                xyz.adscope.common.network.Params$Builder r0 = r1.c
                r0.add(r2, r3)
                return r1
        }

        public xyz.adscope.common.network.FormBody.Builder param(java.lang.String r2, boolean r3) {
                r1 = this;
                xyz.adscope.common.network.Params$Builder r0 = r1.c
                r0.add(r2, r3)
                return r1
        }

        public xyz.adscope.common.network.FormBody.Builder params(xyz.adscope.common.network.Params r2) {
                r1 = this;
                xyz.adscope.common.network.Params$Builder r0 = r1.c
                r0.add(r2)
                return r1
        }

        public xyz.adscope.common.network.FormBody.Builder removeParam(java.lang.String r2) {
                r1 = this;
                xyz.adscope.common.network.Params$Builder r0 = r1.c
                r0.remove(r2)
                return r1
        }
    }

    private FormBody(xyz.adscope.common.network.FormBody.Builder r2) {
            r1 = this;
            r1.<init>()
            java.nio.charset.Charset r0 = xyz.adscope.common.network.FormBody.Builder.a(r2)
            if (r0 != 0) goto L12
            xyz.adscope.common.network.KalleConfig r0 = xyz.adscope.common.network.Kalle.getConfig()
            java.nio.charset.Charset r0 = r0.getCharset()
            goto L16
        L12:
            java.nio.charset.Charset r0 = xyz.adscope.common.network.FormBody.Builder.a(r2)
        L16:
            r1.b = r0
            java.lang.String r0 = xyz.adscope.common.network.FormBody.Builder.b(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L25
            java.lang.String r0 = "multipart/form-data"
            goto L29
        L25:
            java.lang.String r0 = xyz.adscope.common.network.FormBody.Builder.b(r2)
        L29:
            r1.c = r0
            xyz.adscope.common.network.Params$Builder r2 = xyz.adscope.common.network.FormBody.Builder.c(r2)
            xyz.adscope.common.network.Params r2 = r2.build()
            r1.d = r2
            java.lang.String r2 = a()
            r1.e = r2
            return
    }

    /* synthetic */ FormBody(xyz.adscope.common.network.FormBody.Builder r1, xyz.adscope.common.network.FormBody.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private static java.lang.String a() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "-------FormBoundary"
            r0.<init>(r1)
            r1 = 1
        L8:
            r2 = 12
            if (r1 >= r2) goto L42
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = (long) r1
            long r2 = r2 + r4
            r4 = 3
            long r4 = r2 % r4
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L24
            int r3 = (int) r2
            char r2 = (char) r3
            int r2 = r2 % 9
            r0.append(r2)
            goto L3f
        L24:
            r6 = 1
            r8 = 26
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 != 0) goto L36
            long r2 = r2 % r8
            r4 = 65
            long r2 = r2 + r4
            int r3 = (int) r2
            char r2 = (char) r3
            r0.append(r2)
            goto L3f
        L36:
            long r2 = r2 % r8
            r4 = 97
            long r2 = r2 + r4
            int r3 = (int) r2
            char r2 = (char) r3
            r0.append(r2)
        L3f:
            int r1 = r1 + 1
            goto L8
        L42:
            java.lang.String r0 = r0.toString()
            return r0
    }

    private void a(java.io.OutputStream r4, java.lang.String r5, java.lang.String r6) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "--"
            r0.append(r1)
            java.lang.String r1 = r3.e
            r0.append(r1)
            java.lang.String r1 = "\r\n"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.nio.charset.Charset r2 = r3.b
            xyz.adscope.common.network.util.IOUtils.write(r4, r0, r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Content-Disposition: form-data; name=\""
            r0.append(r2)
            r0.append(r5)
            java.lang.String r5 = "\""
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.nio.charset.Charset r0 = r3.b
            xyz.adscope.common.network.util.IOUtils.write(r4, r5, r0)
            java.nio.charset.Charset r5 = r3.b
            java.lang.String r0 = "\r\n\r\n"
            xyz.adscope.common.network.util.IOUtils.write(r4, r0, r5)
            java.nio.charset.Charset r5 = r3.b
            xyz.adscope.common.network.util.IOUtils.write(r4, r6, r5)
            java.nio.charset.Charset r5 = r3.b
            xyz.adscope.common.network.util.IOUtils.write(r4, r1, r5)
            return
    }

    private void a(java.io.OutputStream r5, java.lang.String r6, xyz.adscope.common.network.Binary r7) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "--"
            r0.append(r1)
            java.lang.String r1 = r4.e
            r0.append(r1)
            java.lang.String r1 = "\r\n"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.nio.charset.Charset r2 = r4.b
            xyz.adscope.common.network.util.IOUtils.write(r5, r0, r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Content-Disposition: form-data; name=\""
            r0.append(r2)
            r0.append(r6)
            java.lang.String r6 = "\""
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.nio.charset.Charset r2 = r4.b
            xyz.adscope.common.network.util.IOUtils.write(r5, r0, r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "; filename=\""
            r0.append(r2)
            java.lang.String r2 = r7.name()
            r0.append(r2)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.nio.charset.Charset r0 = r4.b
            xyz.adscope.common.network.util.IOUtils.write(r5, r6, r0)
            java.nio.charset.Charset r6 = r4.b
            xyz.adscope.common.network.util.IOUtils.write(r5, r1, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Content-Type: "
            r6.append(r0)
            java.lang.String r0 = r7.contentType()
            r6.append(r0)
            java.lang.String r0 = "\r\n\r\n"
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.nio.charset.Charset r0 = r4.b
            xyz.adscope.common.network.util.IOUtils.write(r5, r6, r0)
            boolean r6 = r5 instanceof xyz.adscope.common.network.util.LengthOutputStream
            if (r6 == 0) goto L88
            r6 = r5
            xyz.adscope.common.network.util.LengthOutputStream r6 = (xyz.adscope.common.network.util.LengthOutputStream) r6
            long r2 = r7.contentLength()
            r6.write(r2)
            goto L8b
        L88:
            r7.writeTo(r5)
        L8b:
            java.nio.charset.Charset r6 = r4.b
            xyz.adscope.common.network.util.IOUtils.write(r5, r1, r6)
            return
    }

    public static xyz.adscope.common.network.FormBody.Builder newBuilder() {
            xyz.adscope.common.network.FormBody$Builder r0 = new xyz.adscope.common.network.FormBody$Builder
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    @Override // xyz.adscope.common.network.BaseContent
    protected void a(java.io.OutputStream r6) {
            r5 = this;
            xyz.adscope.common.network.Params r0 = r5.d
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            xyz.adscope.common.network.Params r2 = r5.d
            java.util.List r2 = r2.get(r1)
            java.util.Iterator r2 = r2.iterator()
        L20:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto La
            java.lang.Object r3 = r2.next()
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L34
            java.lang.String r3 = (java.lang.String) r3
            r5.a(r6, r1, r3)
            goto L20
        L34:
            boolean r4 = r3 instanceof xyz.adscope.common.network.Binary
            if (r4 == 0) goto L20
            xyz.adscope.common.network.Binary r3 = (xyz.adscope.common.network.Binary) r3
            r5.a(r6, r1, r3)
            goto L20
        L3e:
            java.nio.charset.Charset r0 = r5.b
            java.lang.String r1 = "\r\n"
            xyz.adscope.common.network.util.IOUtils.write(r6, r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "--"
            r0.append(r1)
            java.lang.String r1 = r5.e
            r0.append(r1)
            java.lang.String r1 = "--\r\n"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.nio.charset.Charset r1 = r5.b
            xyz.adscope.common.network.util.IOUtils.write(r6, r0, r1)
            return
    }

    @Override // xyz.adscope.common.network.Content
    public long contentLength() {
            r2 = this;
            xyz.adscope.common.network.util.LengthOutputStream r0 = new xyz.adscope.common.network.util.LengthOutputStream
            r0.<init>()
            r2.a(r0)     // Catch: java.io.IOException -> L8
        L8:
            long r0 = r0.getLength()
            return r0
    }

    @Override // xyz.adscope.common.network.Content
    public java.lang.String contentType() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = "; boundary="
            r0.append(r1)
            java.lang.String r1 = r2.e
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public xyz.adscope.common.network.Params copyParams() {
            r1 = this;
            xyz.adscope.common.network.Params r0 = r1.d
            return r0
    }
}
