package retrofit2.adapter.rxjava;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class e<T> {

    @javax.annotation.Nullable
    private final retrofit2.c0<T> a;

    @javax.annotation.Nullable
    private final java.lang.Throwable b;

    private e(@javax.annotation.Nullable retrofit2.c0<T> r1, @javax.annotation.Nullable java.lang.Throwable r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public static <T> retrofit2.adapter.rxjava.e<T> b(java.lang.Throwable r2) {
            if (r2 == 0) goto L9
            retrofit2.adapter.rxjava.e r0 = new retrofit2.adapter.rxjava.e
            r1 = 0
            r0.<init>(r1, r2)
            return r0
        L9:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "error == null"
            r2.<init>(r0)
            throw r2
    }

    public static <T> retrofit2.adapter.rxjava.e<T> e(retrofit2.c0<T> r2) {
            if (r2 == 0) goto L9
            retrofit2.adapter.rxjava.e r0 = new retrofit2.adapter.rxjava.e
            r1 = 0
            r0.<init>(r2, r1)
            return r0
        L9:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "response == null"
            r2.<init>(r0)
            throw r2
    }

    @javax.annotation.Nullable
    public java.lang.Throwable a() {
            r1 = this;
            java.lang.Throwable r0 = r1.b
            return r0
    }

    public boolean c() {
            r1 = this;
            java.lang.Throwable r0 = r1.b
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @javax.annotation.Nullable
    public retrofit2.c0<T> d() {
            r1 = this;
            retrofit2.c0<T> r0 = r1.a
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.Throwable r0 = r2.b
            if (r0 == 0) goto L1d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Result{isError=true, error=\""
            r0.append(r1)
            java.lang.Throwable r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = "\"}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L1d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Result{isError=false, response="
            r0.append(r1)
            retrofit2.c0<T> r1 = r2.a
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
