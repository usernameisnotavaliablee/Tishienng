package retrofit2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class q extends retrofit2.g.a {
    static final retrofit2.g.a a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
    static final class a<T> implements retrofit2.g<okhttp3.ResponseBody, java.util.Optional<T>> {
        final retrofit2.g<okhttp3.ResponseBody, T> a;

        a(retrofit2.g<okhttp3.ResponseBody, T> r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        public java.util.Optional<T> a(okhttp3.ResponseBody r2) throws java.io.IOException {
                r1 = this;
                retrofit2.g<okhttp3.ResponseBody, T> r0 = r1.a
                java.lang.Object r2 = r0.convert(r2)
                java.util.Optional r2 = retrofit2.p.a(r2)
                return r2
        }

        @Override // retrofit2.g
        public /* bridge */ /* synthetic */ java.lang.Object convert(okhttp3.ResponseBody r1) throws java.io.IOException {
                r0 = this;
                okhttp3.ResponseBody r1 = (okhttp3.ResponseBody) r1
                java.util.Optional r1 = r0.a(r1)
                return r1
        }
    }

    static {
            retrofit2.q r0 = new retrofit2.q
            r0.<init>()
            retrofit2.q.a = r0
            return
    }

    q() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // retrofit2.g.a
    @javax.annotation.Nullable
    public retrofit2.g<okhttp3.ResponseBody, ?> responseBodyConverter(java.lang.reflect.Type r3, java.lang.annotation.Annotation[] r4, retrofit2.d0 r5) {
            r2 = this;
            java.lang.Class r0 = retrofit2.g.a.getRawType(r3)
            java.lang.Class r1 = retrofit2.o.a()
            if (r0 == r1) goto Lc
            r3 = 0
            return r3
        Lc:
            r0 = 0
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            java.lang.reflect.Type r3 = retrofit2.g.a.getParameterUpperBound(r0, r3)
            retrofit2.g r3 = r5.n(r3, r4)
            retrofit2.q$a r4 = new retrofit2.q$a
            r4.<init>(r3)
            return r4
    }
}
