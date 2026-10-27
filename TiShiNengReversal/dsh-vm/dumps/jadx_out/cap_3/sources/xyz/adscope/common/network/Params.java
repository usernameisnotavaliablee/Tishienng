package xyz.adscope.common.network;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class Params {
    private final java.util.Map<java.lang.String, java.util.List<java.lang.Object>> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: xyz.adscope.common.network.Params$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Builder {
        private java.util.Map<java.lang.String, java.util.List<java.lang.Object>> a;

        private Builder() {
                r1 = this;
                r1.<init>()
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>()
                r1.a = r0
                return
        }

        private Builder(java.util.Map<java.lang.String, java.util.List<java.lang.Object>> r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        /* synthetic */ Builder(java.util.Map r1, xyz.adscope.common.network.Params.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        /* synthetic */ Builder(xyz.adscope.common.network.Params.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ java.util.Map a(xyz.adscope.common.network.Params.Builder r0) {
                java.util.Map<java.lang.String, java.util.List<java.lang.Object>> r0 = r0.a
                return r0
        }

        private xyz.adscope.common.network.Params.Builder a(java.lang.String r4, java.lang.Object r5) {
                r3 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r4)
                if (r0 != 0) goto L34
                java.util.Map<java.lang.String, java.util.List<java.lang.Object>> r0 = r3.a
                boolean r0 = r0.containsKey(r4)
                if (r0 != 0) goto L19
                java.util.Map<java.lang.String, java.util.List<java.lang.Object>> r0 = r3.a
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = 1
                r1.<init>(r2)
                r0.put(r4, r1)
            L19:
                if (r5 != 0) goto L1d
                java.lang.String r5 = ""
            L1d:
                boolean r0 = r5 instanceof java.io.File
                if (r0 == 0) goto L29
                xyz.adscope.common.network.FileBinary r0 = new xyz.adscope.common.network.FileBinary
                java.io.File r5 = (java.io.File) r5
                r0.<init>(r5)
                r5 = r0
            L29:
                java.util.Map<java.lang.String, java.util.List<java.lang.Object>> r0 = r3.a
                java.lang.Object r4 = r0.get(r4)
                java.util.List r4 = (java.util.List) r4
                r4.add(r5)
            L34:
                return r3
        }

        public xyz.adscope.common.network.Params.Builder add(java.lang.String r1, char r2) {
                r0 = this;
                java.lang.String r2 = java.lang.String.valueOf(r2)
                xyz.adscope.common.network.Params$Builder r1 = r0.add(r1, r2)
                return r1
        }

        public xyz.adscope.common.network.Params.Builder add(java.lang.String r1, double r2) {
                r0 = this;
                java.lang.String r2 = java.lang.Double.toString(r2)
                xyz.adscope.common.network.Params$Builder r1 = r0.add(r1, r2)
                return r1
        }

        public xyz.adscope.common.network.Params.Builder add(java.lang.String r1, float r2) {
                r0 = this;
                java.lang.String r2 = java.lang.Float.toString(r2)
                xyz.adscope.common.network.Params$Builder r1 = r0.add(r1, r2)
                return r1
        }

        public xyz.adscope.common.network.Params.Builder add(java.lang.String r1, int r2) {
                r0 = this;
                java.lang.String r2 = java.lang.Integer.toString(r2)
                xyz.adscope.common.network.Params$Builder r1 = r0.add(r1, r2)
                return r1
        }

        public xyz.adscope.common.network.Params.Builder add(java.lang.String r1, long r2) {
                r0 = this;
                java.lang.String r2 = java.lang.Long.toString(r2)
                xyz.adscope.common.network.Params$Builder r1 = r0.add(r1, r2)
                return r1
        }

        public xyz.adscope.common.network.Params.Builder add(java.lang.String r1, java.lang.CharSequence r2) {
                r0 = this;
                xyz.adscope.common.network.Params$Builder r1 = r0.a(r1, r2)
                return r1
        }

        public xyz.adscope.common.network.Params.Builder add(java.lang.String r2, java.util.List<java.lang.String> r3) {
                r1 = this;
                java.util.Iterator r3 = r3.iterator()
            L4:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L14
                java.lang.Object r0 = r3.next()
                java.lang.String r0 = (java.lang.String) r0
                r1.add(r2, r0)
                goto L4
            L14:
                return r1
        }

        public xyz.adscope.common.network.Params.Builder add(java.lang.String r1, short r2) {
                r0 = this;
                java.lang.String r2 = java.lang.Integer.toString(r2)
                xyz.adscope.common.network.Params$Builder r1 = r0.add(r1, r2)
                return r1
        }

        public xyz.adscope.common.network.Params.Builder add(java.lang.String r1, boolean r2) {
                r0 = this;
                java.lang.String r2 = java.lang.Boolean.toString(r2)
                xyz.adscope.common.network.Params$Builder r1 = r0.add(r1, r2)
                return r1
        }

        public xyz.adscope.common.network.Params.Builder add(java.util.Map<java.lang.String, java.lang.String> r3) {
                r2 = this;
                java.util.Set r3 = r3.entrySet()
                java.util.Iterator r3 = r3.iterator()
            L8:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L24
                java.lang.Object r0 = r3.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getKey()
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r0 = r0.getValue()
                java.lang.String r0 = (java.lang.String) r0
                r2.add(r1, r0)
                goto L8
            L24:
                return r2
        }

        public xyz.adscope.common.network.Params.Builder add(xyz.adscope.common.network.Params r4) {
                r3 = this;
                java.util.Set r4 = r4.entrySet()
                java.util.Iterator r4 = r4.iterator()
            L8:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L32
                java.lang.Object r0 = r4.next()
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
                r3.a(r1, r2)
                goto L24
            L32:
                return r3
        }

        public xyz.adscope.common.network.Params.Builder binaries(java.lang.String r2, java.util.List<xyz.adscope.common.network.Binary> r3) {
                r1 = this;
                java.util.Iterator r3 = r3.iterator()
            L4:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L14
                java.lang.Object r0 = r3.next()
                xyz.adscope.common.network.Binary r0 = (xyz.adscope.common.network.Binary) r0
                r1.binary(r2, r0)
                goto L4
            L14:
                return r1
        }

        public xyz.adscope.common.network.Params.Builder binary(java.lang.String r1, xyz.adscope.common.network.Binary r2) {
                r0 = this;
                xyz.adscope.common.network.Params$Builder r1 = r0.a(r1, r2)
                return r1
        }

        public xyz.adscope.common.network.Params build() {
                r2 = this;
                xyz.adscope.common.network.Params r0 = new xyz.adscope.common.network.Params
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public xyz.adscope.common.network.Params.Builder clear() {
                r1 = this;
                java.util.Map<java.lang.String, java.util.List<java.lang.Object>> r0 = r1.a
                r0.clear()
                return r1
        }

        public xyz.adscope.common.network.Params.Builder file(java.lang.String r1, java.io.File r2) {
                r0 = this;
                xyz.adscope.common.network.Params$Builder r1 = r0.a(r1, r2)
                return r1
        }

        public xyz.adscope.common.network.Params.Builder files(java.lang.String r2, java.util.List<java.io.File> r3) {
                r1 = this;
                java.util.Iterator r3 = r3.iterator()
            L4:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L14
                java.lang.Object r0 = r3.next()
                java.io.File r0 = (java.io.File) r0
                r1.a(r2, r0)
                goto L4
            L14:
                return r1
        }

        public xyz.adscope.common.network.Params.Builder remove(java.lang.String r2) {
                r1 = this;
                java.util.Map<java.lang.String, java.util.List<java.lang.Object>> r0 = r1.a
                r0.remove(r2)
                return r1
        }

        public xyz.adscope.common.network.Params.Builder set(xyz.adscope.common.network.Params r2) {
                r1 = this;
                xyz.adscope.common.network.Params$Builder r0 = r1.clear()
                xyz.adscope.common.network.Params$Builder r2 = r0.add(r2)
                return r2
        }
    }

    private Params(xyz.adscope.common.network.Params.Builder r1) {
            r0 = this;
            r0.<init>()
            java.util.Map r1 = xyz.adscope.common.network.Params.Builder.a(r1)
            r0.a = r1
            return
    }

    /* synthetic */ Params(xyz.adscope.common.network.Params.Builder r1, xyz.adscope.common.network.Params.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static xyz.adscope.common.network.Params.Builder newBuilder() {
            xyz.adscope.common.network.Params$Builder r0 = new xyz.adscope.common.network.Params$Builder
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    public xyz.adscope.common.network.Params.Builder builder() {
            r5 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map<java.lang.String, java.util.List<java.lang.Object>> r1 = r5.a
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L30
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            java.lang.Object r2 = r2.getValue()
            java.util.Collection r2 = (java.util.Collection) r2
            r4.<init>(r2)
            r0.put(r3, r4)
            goto Lf
        L30:
            xyz.adscope.common.network.Params$Builder r1 = new xyz.adscope.common.network.Params$Builder
            r2 = 0
            r1.<init>(r0, r2)
            return r1
    }

    public boolean containsKey(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.util.List<java.lang.Object>> r0 = r1.a
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    public java.util.Set<java.util.Map.Entry<java.lang.String, java.util.List<java.lang.Object>>> entrySet() {
            r1 = this;
            java.util.Map<java.lang.String, java.util.List<java.lang.Object>> r0 = r1.a
            java.util.Set r0 = r0.entrySet()
            return r0
    }

    public java.util.List<java.lang.Object> get(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.util.List<java.lang.Object>> r0 = r1.a
            java.lang.Object r2 = r0.get(r2)
            java.util.List r2 = (java.util.List) r2
            return r2
    }

    public java.lang.Object getFirst(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.util.List<java.lang.Object>> r0 = r1.a
            java.lang.Object r2 = r0.get(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L16
            int r0 = r2.size()
            if (r0 <= 0) goto L16
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            return r2
        L16:
            r2 = 0
            return r2
    }

    public boolean hasBinary() {
            r3 = this;
            java.util.Set r0 = r3.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            int r2 = r1.size()
            if (r2 <= 0) goto L8
            java.util.Iterator r1 = r1.iterator()
        L24:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L8
            java.lang.Object r2 = r1.next()
            boolean r2 = r2 instanceof xyz.adscope.common.network.Binary
            if (r2 == 0) goto L24
            r0 = 1
            return r0
        L34:
            r0 = 0
            return r0
    }

    public boolean isEmpty() {
            r1 = this;
            java.util.Map<java.lang.String, java.util.List<java.lang.Object>> r0 = r1.a
            boolean r0 = r0.isEmpty()
            return r0
    }

    public java.util.Set<java.lang.String> keySet() {
            r1 = this;
            java.util.Map<java.lang.String, java.util.List<java.lang.Object>> r0 = r1.a
            java.util.Set r0 = r0.keySet()
            return r0
    }

    public xyz.adscope.common.network.FormBody toFormBody() {
            r1 = this;
            xyz.adscope.common.network.FormBody$Builder r0 = xyz.adscope.common.network.FormBody.newBuilder()
            xyz.adscope.common.network.FormBody$Builder r0 = r0.params(r1)
            xyz.adscope.common.network.FormBody r0 = r0.build()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            r0 = 0
            java.lang.String r0 = r1.toString(r0)
            return r0
    }

    public java.lang.String toString(boolean r7) {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Set r1 = r6.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4f
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.util.List r3 = r6.get(r2)
            java.util.Iterator r3 = r3.iterator()
        L21:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Ld
            java.lang.Object r4 = r3.next()
            boolean r5 = r4 instanceof java.lang.CharSequence
            if (r5 == 0) goto L21
            if (r7 == 0) goto L3a
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = android.net.Uri.encode(r4)
            goto L3e
        L3a:
            java.lang.String r4 = r4.toString()
        L3e:
            java.lang.String r5 = "&"
            r0.append(r5)
            r0.append(r2)
            java.lang.String r5 = "="
            r0.append(r5)
            r0.append(r4)
            goto L21
        L4f:
            int r7 = r0.length()
            if (r7 <= 0) goto L59
            r7 = 0
            r0.deleteCharAt(r7)
        L59:
            java.lang.String r7 = r0.toString()
            return r7
    }

    public xyz.adscope.common.network.UrlBody toUrlBody() {
            r1 = this;
            xyz.adscope.common.network.UrlBody$Builder r0 = xyz.adscope.common.network.UrlBody.newBuilder()
            xyz.adscope.common.network.UrlBody$Builder r0 = r0.params(r1)
            xyz.adscope.common.network.UrlBody r0 = r0.build()
            return r0
    }
}
