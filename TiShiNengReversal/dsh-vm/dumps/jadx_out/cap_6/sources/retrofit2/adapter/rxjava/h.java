package retrofit2.adapter.rxjava;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class h extends retrofit2.c.a {

    @javax.annotation.Nullable
    private final rx.h a;
    private final boolean b;

    private h(@javax.annotation.Nullable rx.h r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public static retrofit2.adapter.rxjava.h d() {
            retrofit2.adapter.rxjava.h r0 = new retrofit2.adapter.rxjava.h
            r1 = 0
            r2 = 0
            r0.<init>(r1, r2)
            return r0
    }

    public static retrofit2.adapter.rxjava.h e() {
            retrofit2.adapter.rxjava.h r0 = new retrofit2.adapter.rxjava.h
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2)
            return r0
    }

    public static retrofit2.adapter.rxjava.h f(rx.h r2) {
            if (r2 == 0) goto L9
            retrofit2.adapter.rxjava.h r0 = new retrofit2.adapter.rxjava.h
            r1 = 0
            r0.<init>(r2, r1)
            return r0
        L9:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "scheduler == null"
            r2.<init>(r0)
            throw r2
    }

    @Override // retrofit2.c.a
    @javax.annotation.Nullable
    public retrofit2.c<?, ?> a(java.lang.reflect.Type r11, java.lang.annotation.Annotation[] r12, retrofit2.d0 r13) {
            r10 = this;
            java.lang.Class r12 = retrofit2.c.a.c(r11)
            java.lang.Class<rx.i> r13 = rx.i.class
            r0 = 1
            r1 = 0
            if (r12 != r13) goto Lc
            r8 = 1
            goto Ld
        Lc:
            r8 = 0
        Ld:
            java.lang.Class<rx.b> r13 = rx.b.class
            if (r12 != r13) goto L13
            r13 = 1
            goto L14
        L13:
            r13 = 0
        L14:
            java.lang.Class<rx.e> r2 = rx.e.class
            if (r12 == r2) goto L1e
            if (r8 != 0) goto L1e
            if (r13 != 0) goto L1e
            r11 = 0
            return r11
        L1e:
            if (r13 == 0) goto L30
            retrofit2.adapter.rxjava.g r0 = new retrofit2.adapter.rxjava.g
            rx.h r2 = r10.a
            boolean r3 = r10.b
            r6 = 0
            r7 = 1
            java.lang.Class<java.lang.Void> r1 = java.lang.Void.class
            r4 = 0
            r5 = 1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
        L30:
            boolean r12 = r11 instanceof java.lang.reflect.ParameterizedType
            if (r12 != 0) goto L62
            if (r8 == 0) goto L39
            java.lang.String r11 = "Single"
            goto L3b
        L39:
            java.lang.String r11 = "Observable"
        L3b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r11)
            java.lang.String r0 = " return type must be parameterized as "
            r13.append(r0)
            r13.append(r11)
            java.lang.String r0 = "<Foo> or "
            r13.append(r0)
            r13.append(r11)
            java.lang.String r11 = "<? extends Foo>"
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            r12.<init>(r11)
            throw r12
        L62:
            java.lang.reflect.ParameterizedType r11 = (java.lang.reflect.ParameterizedType) r11
            java.lang.reflect.Type r11 = retrofit2.c.a.b(r1, r11)
            java.lang.Class r12 = retrofit2.c.a.c(r11)
            java.lang.Class<retrofit2.c0> r13 = retrofit2.c0.class
            if (r12 != r13) goto L86
            boolean r12 = r11 instanceof java.lang.reflect.ParameterizedType
            if (r12 == 0) goto L7e
            java.lang.reflect.ParameterizedType r11 = (java.lang.reflect.ParameterizedType) r11
            java.lang.reflect.Type r11 = retrofit2.c.a.b(r1, r11)
            r3 = r11
            r6 = 0
        L7c:
            r7 = 0
            goto La2
        L7e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Response must be parameterized as Response<Foo> or Response<? extends Foo>"
            r11.<init>(r12)
            throw r11
        L86:
            java.lang.Class<retrofit2.adapter.rxjava.e> r13 = retrofit2.adapter.rxjava.e.class
            if (r12 != r13) goto L9f
            boolean r12 = r11 instanceof java.lang.reflect.ParameterizedType
            if (r12 == 0) goto L97
            java.lang.reflect.ParameterizedType r11 = (java.lang.reflect.ParameterizedType) r11
            java.lang.reflect.Type r11 = retrofit2.c.a.b(r1, r11)
            r3 = r11
            r6 = 1
            goto L7c
        L97:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Result must be parameterized as Result<Foo> or Result<? extends Foo>"
            r11.<init>(r12)
            throw r11
        L9f:
            r3 = r11
            r6 = 0
            r7 = 1
        La2:
            retrofit2.adapter.rxjava.g r2 = new retrofit2.adapter.rxjava.g
            rx.h r4 = r10.a
            boolean r5 = r10.b
            r9 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r2
    }
}
