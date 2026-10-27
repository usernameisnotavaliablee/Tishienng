package xyz.adscope.common.network;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class Url {
    private final java.lang.String a;
    private final java.lang.String b;
    private final int c;
    private final java.lang.String d;
    private final java.lang.String e;
    private final java.lang.String f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: xyz.adscope.common.network.Url$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Builder {
        private java.lang.String a;
        private java.lang.String b;
        private int c;
        private java.util.List<java.lang.String> d;
        private xyz.adscope.common.network.Params.Builder e;
        private java.lang.String f;

        private Builder(java.lang.String r2) {
                r1 = this;
                r1.<init>()
                java.net.URI r2 = java.net.URI.create(r2)
                java.lang.String r0 = r2.getScheme()
                r1.a = r0
                java.lang.String r0 = r2.getHost()
                r1.b = r0
                int r0 = r2.getPort()
                int r0 = xyz.adscope.common.network.Url.a(r0)
                r1.c = r0
                java.lang.String r0 = r2.getPath()
                java.util.List r0 = xyz.adscope.common.network.Url.a(r0)
                r1.d = r0
                java.lang.String r0 = r2.getQuery()
                xyz.adscope.common.network.Params r0 = xyz.adscope.common.network.Url.b(r0)
                xyz.adscope.common.network.Params$Builder r0 = r0.builder()
                r1.e = r0
                java.lang.String r2 = r2.getFragment()
                r1.f = r2
                return
        }

        /* synthetic */ Builder(java.lang.String r1, xyz.adscope.common.network.Url.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        static /* synthetic */ java.lang.String a(xyz.adscope.common.network.Url.Builder r0) {
                java.lang.String r0 = r0.a
                return r0
        }

        static /* synthetic */ java.lang.String b(xyz.adscope.common.network.Url.Builder r0) {
                java.lang.String r0 = r0.b
                return r0
        }

        static /* synthetic */ int c(xyz.adscope.common.network.Url.Builder r0) {
                int r0 = r0.c
                return r0
        }

        static /* synthetic */ java.util.List d(xyz.adscope.common.network.Url.Builder r0) {
                java.util.List<java.lang.String> r0 = r0.d
                return r0
        }

        static /* synthetic */ xyz.adscope.common.network.Params.Builder e(xyz.adscope.common.network.Url.Builder r0) {
                xyz.adscope.common.network.Params$Builder r0 = r0.e
                return r0
        }

        static /* synthetic */ java.lang.String f(xyz.adscope.common.network.Url.Builder r0) {
                java.lang.String r0 = r0.f
                return r0
        }

        public xyz.adscope.common.network.Url.Builder addPath(char r1) {
                r0 = this;
                java.lang.String r1 = java.lang.String.valueOf(r1)
                xyz.adscope.common.network.Url$Builder r1 = r0.addPath(r1)
                return r1
        }

        public xyz.adscope.common.network.Url.Builder addPath(double r1) {
                r0 = this;
                java.lang.String r1 = java.lang.Double.toString(r1)
                xyz.adscope.common.network.Url$Builder r1 = r0.addPath(r1)
                return r1
        }

        public xyz.adscope.common.network.Url.Builder addPath(float r1) {
                r0 = this;
                java.lang.String r1 = java.lang.Float.toString(r1)
                xyz.adscope.common.network.Url$Builder r1 = r0.addPath(r1)
                return r1
        }

        public xyz.adscope.common.network.Url.Builder addPath(int r1) {
                r0 = this;
                java.lang.String r1 = java.lang.Integer.toString(r1)
                xyz.adscope.common.network.Url$Builder r1 = r0.addPath(r1)
                return r1
        }

        public xyz.adscope.common.network.Url.Builder addPath(long r1) {
                r0 = this;
                java.lang.String r1 = java.lang.Long.toString(r1)
                xyz.adscope.common.network.Url$Builder r1 = r0.addPath(r1)
                return r1
        }

        public xyz.adscope.common.network.Url.Builder addPath(java.lang.String r2) {
                r1 = this;
                java.util.List<java.lang.String> r0 = r1.d
                r0.add(r2)
                return r1
        }

        public xyz.adscope.common.network.Url.Builder addPath(boolean r1) {
                r0 = this;
                java.lang.String r1 = java.lang.Boolean.toString(r1)
                xyz.adscope.common.network.Url$Builder r1 = r0.addPath(r1)
                return r1
        }

        public xyz.adscope.common.network.Url.Builder addQuery(java.lang.String r1, char r2) {
                r0 = this;
                java.lang.String r2 = java.lang.String.valueOf(r2)
                xyz.adscope.common.network.Url$Builder r1 = r0.addQuery(r1, r2)
                return r1
        }

        public xyz.adscope.common.network.Url.Builder addQuery(java.lang.String r1, double r2) {
                r0 = this;
                java.lang.String r2 = java.lang.Double.toString(r2)
                xyz.adscope.common.network.Url$Builder r1 = r0.addQuery(r1, r2)
                return r1
        }

        public xyz.adscope.common.network.Url.Builder addQuery(java.lang.String r1, float r2) {
                r0 = this;
                java.lang.String r2 = java.lang.Float.toString(r2)
                xyz.adscope.common.network.Url$Builder r1 = r0.addQuery(r1, r2)
                return r1
        }

        public xyz.adscope.common.network.Url.Builder addQuery(java.lang.String r1, int r2) {
                r0 = this;
                java.lang.String r2 = java.lang.Integer.toString(r2)
                xyz.adscope.common.network.Url$Builder r1 = r0.addQuery(r1, r2)
                return r1
        }

        public xyz.adscope.common.network.Url.Builder addQuery(java.lang.String r1, long r2) {
                r0 = this;
                java.lang.String r2 = java.lang.Long.toString(r2)
                xyz.adscope.common.network.Url$Builder r1 = r0.addQuery(r1, r2)
                return r1
        }

        public xyz.adscope.common.network.Url.Builder addQuery(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                xyz.adscope.common.network.Params$Builder r0 = r1.e
                r0.add(r2, r3)
                return r1
        }

        public xyz.adscope.common.network.Url.Builder addQuery(java.lang.String r2, java.util.List<java.lang.String> r3) {
                r1 = this;
                java.util.Iterator r3 = r3.iterator()
            L4:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L14
                java.lang.Object r0 = r3.next()
                java.lang.String r0 = (java.lang.String) r0
                r1.addQuery(r2, r0)
                goto L4
            L14:
                return r1
        }

        public xyz.adscope.common.network.Url.Builder addQuery(java.lang.String r1, short r2) {
                r0 = this;
                java.lang.String r2 = java.lang.Integer.toString(r2)
                xyz.adscope.common.network.Url$Builder r1 = r0.addQuery(r1, r2)
                return r1
        }

        public xyz.adscope.common.network.Url.Builder addQuery(java.lang.String r1, boolean r2) {
                r0 = this;
                java.lang.String r2 = java.lang.Boolean.toString(r2)
                xyz.adscope.common.network.Url$Builder r1 = r0.addQuery(r1, r2)
                return r1
        }

        public xyz.adscope.common.network.Url.Builder addQuery(xyz.adscope.common.network.Params r5) {
                r4 = this;
                java.util.Set r5 = r5.entrySet()
                java.util.Iterator r5 = r5.iterator()
            L8:
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto L3a
                java.lang.Object r0 = r5.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getKey()
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r0 = r0.getValue()
                java.util.List r0 = (java.util.List) r0
                java.util.Iterator r0 = r0.iterator()
            L24:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L8
                java.lang.Object r2 = r0.next()
                boolean r3 = r2 instanceof java.lang.CharSequence
                if (r3 == 0) goto L24
                java.lang.String r2 = r2.toString()
                r4.addQuery(r1, r2)
                goto L24
            L3a:
                return r4
        }

        public xyz.adscope.common.network.Url build() {
                r2 = this;
                xyz.adscope.common.network.Url r0 = new xyz.adscope.common.network.Url
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public xyz.adscope.common.network.Url.Builder clearPath() {
                r1 = this;
                java.util.List<java.lang.String> r0 = r1.d
                r0.clear()
                return r1
        }

        public xyz.adscope.common.network.Url.Builder clearQuery() {
                r1 = this;
                xyz.adscope.common.network.Params$Builder r0 = r1.e
                r0.clear()
                return r1
        }

        public xyz.adscope.common.network.Url.Builder removeQuery(java.lang.String r2) {
                r1 = this;
                xyz.adscope.common.network.Params$Builder r0 = r1.e
                r0.remove(r2)
                return r1
        }

        public xyz.adscope.common.network.Url.Builder setFragment(java.lang.String r1) {
                r0 = this;
                r0.f = r1
                return r0
        }

        public xyz.adscope.common.network.Url.Builder setHost(java.lang.String r1) {
                r0 = this;
                r0.b = r1
                return r0
        }

        public xyz.adscope.common.network.Url.Builder setPath(java.lang.String r1) {
                r0 = this;
                java.util.List r1 = xyz.adscope.common.network.Url.a(r1)
                r0.d = r1
                return r0
        }

        public xyz.adscope.common.network.Url.Builder setPort(int r1) {
                r0 = this;
                r0.c = r1
                return r0
        }

        public xyz.adscope.common.network.Url.Builder setQuery(java.lang.String r1) {
                r0 = this;
                xyz.adscope.common.network.Params r1 = xyz.adscope.common.network.Url.b(r1)
                xyz.adscope.common.network.Params$Builder r1 = r1.builder()
                r0.e = r1
                return r0
        }

        public xyz.adscope.common.network.Url.Builder setQuery(xyz.adscope.common.network.Params r1) {
                r0 = this;
                xyz.adscope.common.network.Params$Builder r1 = r1.builder()
                r0.e = r1
                return r0
        }

        public xyz.adscope.common.network.Url.Builder setScheme(java.lang.String r1) {
                r0 = this;
                r0.a = r1
                return r0
        }
    }

    private Url(xyz.adscope.common.network.Url.Builder r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = xyz.adscope.common.network.Url.Builder.a(r3)
            r2.a = r0
            java.lang.String r0 = xyz.adscope.common.network.Url.Builder.b(r3)
            r2.b = r0
            int r0 = xyz.adscope.common.network.Url.Builder.c(r3)
            r2.c = r0
            java.util.List r0 = xyz.adscope.common.network.Url.Builder.d(r3)
            r1 = 0
            java.lang.String r0 = a(r0, r1)
            r2.d = r0
            xyz.adscope.common.network.Params$Builder r0 = xyz.adscope.common.network.Url.Builder.e(r3)
            xyz.adscope.common.network.Params r0 = r0.build()
            java.lang.String r0 = r0.toString(r1)
            r2.e = r0
            java.lang.String r3 = xyz.adscope.common.network.Url.Builder.f(r3)
            r2.f = r3
            return
    }

    /* synthetic */ Url(xyz.adscope.common.network.Url.Builder r1, xyz.adscope.common.network.Url.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    static /* synthetic */ int a(int r0) {
            int r0 = b(r0)
            return r0
    }

    private static java.lang.String a(java.lang.String r1, boolean r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L9
            java.lang.String r1 = ""
            return r1
        L9:
            if (r2 == 0) goto Lf
            java.lang.String r1 = android.net.Uri.encode(r1)
        Lf:
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "#%s"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            return r1
    }

    private static java.lang.String a(java.util.List<java.lang.String> r3, boolean r4) {
            boolean r0 = r3.isEmpty()
            java.lang.String r1 = "/"
            if (r0 == 0) goto L9
            return r1
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L12:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L2b
            java.lang.Object r2 = r3.next()
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r1)
            if (r4 == 0) goto L27
            java.lang.String r2 = android.net.Uri.encode(r2)
        L27:
            r0.append(r2)
            goto L12
        L2b:
            java.lang.String r3 = r0.toString()
            return r3
    }

    private static java.lang.String a(xyz.adscope.common.network.Params r1, boolean r2) {
            java.lang.String r1 = r1.toString(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto Ld
            java.lang.String r1 = ""
            return r1
        Ld:
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "?%s"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            return r1
    }

    static /* synthetic */ java.util.List a(java.lang.String r0) {
            java.util.List r0 = c(r0)
            return r0
    }

    private static int b(int r0) {
            if (r0 <= 0) goto L3
            return r0
        L3:
            r0 = 80
            return r0
    }

    static /* synthetic */ xyz.adscope.common.network.Params b(java.lang.String r0) {
            xyz.adscope.common.network.Params r0 = d(r0)
            return r0
    }

    private static java.lang.String c(int r3) {
            if (r3 <= 0) goto L1c
            r0 = 80
            if (r3 != r0) goto L7
            goto L1c
        L7:
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            java.lang.String r3 = ":%d"
            java.lang.String r3 = java.lang.String.format(r0, r3, r1)
            return r3
        L1c:
            java.lang.String r3 = ""
            return r3
    }

    private static java.util.List<java.lang.String> c(java.lang.String r5) {
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 != 0) goto L31
        Lb:
            java.lang.String r1 = "/"
            boolean r2 = r5.startsWith(r1)
            r3 = 1
            if (r2 == 0) goto L19
            java.lang.String r5 = r5.substring(r3)
            goto Lb
        L19:
            boolean r2 = r5.endsWith(r1)
            if (r2 == 0) goto L2a
            int r2 = r5.length()
            int r2 = r2 - r3
            r4 = 0
            java.lang.String r5 = r5.substring(r4, r2)
            goto L19
        L2a:
            java.lang.String[] r5 = r5.split(r1)
            java.util.Collections.addAll(r0, r5)
        L31:
            return r0
    }

    private static xyz.adscope.common.network.Params d(java.lang.String r10) {
            xyz.adscope.common.network.Params$Builder r0 = xyz.adscope.common.network.Params.newBuilder()
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            if (r1 != 0) goto L46
            java.lang.String r1 = "?"
            boolean r1 = r10.startsWith(r1)
            r2 = 1
            if (r1 == 0) goto L17
            java.lang.String r10 = r10.substring(r2)
        L17:
            java.lang.String r1 = "&"
            java.lang.String[] r10 = r10.split(r1)
            int r1 = r10.length
            r3 = 0
            r4 = 0
        L20:
            if (r4 >= r1) goto L46
            r5 = r10[r4]
            java.lang.String r6 = "="
            int r6 = r5.indexOf(r6)
            java.lang.String r7 = ""
            if (r6 <= 0) goto L40
            java.lang.String r8 = r5.substring(r3, r6)
            int r9 = r5.length()
            int r9 = r9 - r2
            if (r6 >= r9) goto L3f
            int r6 = r6 + 1
            java.lang.String r7 = r5.substring(r6)
        L3f:
            r5 = r8
        L40:
            r0.add(r5, r7)
            int r4 = r4 + 1
            goto L20
        L46:
            xyz.adscope.common.network.Params r10 = r0.build()
            return r10
    }

    public static xyz.adscope.common.network.Url.Builder newBuilder(java.lang.String r2) {
            xyz.adscope.common.network.Url$Builder r0 = new xyz.adscope.common.network.Url$Builder
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public xyz.adscope.common.network.Url.Builder builder() {
            r1 = this;
            java.lang.String r0 = r1.toString()
            xyz.adscope.common.network.Url$Builder r0 = newBuilder(r0)
            return r0
    }

    public java.util.List<java.lang.String> copyPath() {
            r1 = this;
            java.lang.String r0 = r1.d
            java.util.List r0 = c(r0)
            return r0
    }

    @java.lang.Deprecated
    public xyz.adscope.common.network.Params copyQuery() {
            r1 = this;
            xyz.adscope.common.network.Params r0 = r1.getParams()
            return r0
    }

    public java.lang.String getFragment() {
            r1 = this;
            java.lang.String r0 = r1.f
            return r0
    }

    public java.lang.String getHost() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }

    public xyz.adscope.common.network.Params getParams() {
            r1 = this;
            java.lang.String r0 = r1.e
            xyz.adscope.common.network.Params r0 = d(r0)
            return r0
    }

    public java.lang.String getPath() {
            r1 = this;
            java.lang.String r0 = r1.d
            return r0
    }

    public int getPort() {
            r1 = this;
            int r0 = r1.c
            return r0
    }

    public java.lang.String getQuery() {
            r1 = this;
            java.lang.String r0 = r1.e
            return r0
    }

    public java.lang.String getScheme() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public xyz.adscope.common.network.Url location(java.lang.String r7) {
            r6 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L8
            r7 = 0
            return r7
        L8:
            boolean r0 = android.webkit.URLUtil.isNetworkUrl(r7)
            if (r0 == 0) goto L17
            xyz.adscope.common.network.Url$Builder r7 = newBuilder(r7)
            xyz.adscope.common.network.Url r7 = r7.build()
            return r7
        L17:
            java.net.URI r0 = java.net.URI.create(r7)
            java.lang.String r1 = "/"
            boolean r2 = r7.startsWith(r1)
            if (r2 == 0) goto L44
            xyz.adscope.common.network.Url$Builder r7 = r6.builder()
            java.lang.String r1 = r0.getPath()
            xyz.adscope.common.network.Url$Builder r7 = r7.setPath(r1)
            java.lang.String r1 = r0.getQuery()
            xyz.adscope.common.network.Url$Builder r7 = r7.setQuery(r1)
            java.lang.String r0 = r0.getFragment()
            xyz.adscope.common.network.Url$Builder r7 = r7.setFragment(r0)
            xyz.adscope.common.network.Url r7 = r7.build()
            return r7
        L44:
            java.lang.String r2 = "../"
            boolean r7 = r7.contains(r2)
            if (r7 == 0) goto Lc3
            java.lang.String r7 = r6.getPath()
            java.util.List r7 = c(r7)
            java.lang.String r2 = r0.getPath()
            java.util.List r2 = c(r2)
            java.lang.String r3 = ".."
            int r3 = r2.lastIndexOf(r3)
            int r4 = r3 + 1
            int r5 = r2.size()
            java.util.List r2 = r2.subList(r4, r5)
            boolean r4 = r7.isEmpty()
            if (r4 != 0) goto La2
            int r4 = r7.size()
            int r4 = r4 - r3
            int r4 = r4 + (-2)
            r3 = 0
            java.util.List r7 = r7.subList(r3, r4)
            r7.addAll(r2)
            java.lang.String r7 = android.text.TextUtils.join(r1, r7)
            xyz.adscope.common.network.Url$Builder r1 = r6.builder()
            xyz.adscope.common.network.Url$Builder r7 = r1.setPath(r7)
            java.lang.String r1 = r0.getQuery()
            xyz.adscope.common.network.Url$Builder r7 = r7.setQuery(r1)
            java.lang.String r0 = r0.getFragment()
            xyz.adscope.common.network.Url$Builder r7 = r7.setFragment(r0)
            xyz.adscope.common.network.Url r7 = r7.build()
            return r7
        La2:
            java.lang.String r7 = android.text.TextUtils.join(r1, r2)
            xyz.adscope.common.network.Url$Builder r1 = r6.builder()
            xyz.adscope.common.network.Url$Builder r7 = r1.setPath(r7)
            java.lang.String r1 = r0.getQuery()
            xyz.adscope.common.network.Url$Builder r7 = r7.setQuery(r1)
            java.lang.String r0 = r0.getFragment()
            xyz.adscope.common.network.Url$Builder r7 = r7.setFragment(r0)
            xyz.adscope.common.network.Url r7 = r7.build()
            return r7
        Lc3:
            java.lang.String r7 = r6.getPath()
            java.util.List r7 = c(r7)
            java.lang.String r2 = r0.getPath()
            java.util.List r2 = c(r2)
            r7.addAll(r2)
            java.lang.String r7 = android.text.TextUtils.join(r1, r7)
            xyz.adscope.common.network.Url$Builder r1 = r6.builder()
            xyz.adscope.common.network.Url$Builder r7 = r1.setPath(r7)
            java.lang.String r1 = r0.getQuery()
            xyz.adscope.common.network.Url$Builder r7 = r7.setQuery(r1)
            java.lang.String r0 = r0.getFragment()
            xyz.adscope.common.network.Url$Builder r7 = r7.setFragment(r0)
            xyz.adscope.common.network.Url r7 = r7.build()
            return r7
    }

    public java.lang.String toString() {
            r1 = this;
            r0 = 0
            java.lang.String r0 = r1.toString(r0)
            return r0
    }

    public java.lang.String toString(boolean r5) {
            r4 = this;
            java.lang.String r0 = r4.d
            java.util.List r0 = c(r0)
            java.lang.String r0 = a(r0, r5)
            java.lang.String r1 = r4.e
            xyz.adscope.common.network.Params r1 = d(r1)
            java.lang.String r1 = a(r1, r5)
            java.lang.String r2 = r4.f
            java.lang.String r5 = a(r2, r5)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r4.a
            r2.append(r3)
            java.lang.String r3 = "://"
            r2.append(r3)
            java.lang.String r3 = r4.b
            r2.append(r3)
            int r3 = r4.c
            java.lang.String r3 = c(r3)
            r2.append(r3)
            r2.append(r0)
            r2.append(r1)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            return r5
    }
}
