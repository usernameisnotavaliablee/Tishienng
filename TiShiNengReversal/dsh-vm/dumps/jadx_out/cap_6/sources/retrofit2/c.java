package retrofit2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface c<R, T> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class a {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        protected static java.lang.reflect.Type b(int r0, java.lang.reflect.ParameterizedType r1) {
                java.lang.reflect.Type r0 = retrofit2.f0.g(r0, r1)
                return r0
        }

        protected static java.lang.Class<?> c(java.lang.reflect.Type r0) {
                java.lang.Class r0 = retrofit2.f0.h(r0)
                return r0
        }

        @javax.annotation.Nullable
        public abstract retrofit2.c<?, ?> a(java.lang.reflect.Type r1, java.lang.annotation.Annotation[] r2, retrofit2.d0 r3);
    }

    java.lang.reflect.Type a();

    T b(retrofit2.b<R> r1);
}
