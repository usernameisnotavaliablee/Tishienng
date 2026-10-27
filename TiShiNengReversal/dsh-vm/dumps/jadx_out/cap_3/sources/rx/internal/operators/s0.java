package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class s0<T> implements rx.e.a<T> {
    public static volatile boolean c;
    final rx.e.a<T> a;
    final java.lang.String b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<T> extends rx.l<T> {
        final rx.l<? super T> a;
        final java.lang.String b;

        public a(rx.l<? super T> r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1)
                r0.a = r1
                r0.b = r2
                return
        }

        public void onCompleted() {
                r1 = this;
                rx.l<? super T> r0 = r1.a
                r0.onCompleted()
                return
        }

        public void onError(java.lang.Throwable r3) {
                r2 = this;
                rx.exceptions.AssemblyStackTraceException r0 = new rx.exceptions.AssemblyStackTraceException
                java.lang.String r1 = r2.b
                r0.<init>(r1)
                r0.attachTo(r3)
                rx.l<? super T> r0 = r2.a
                r0.onError(r3)
                return
        }

        public void onNext(T r2) {
                r1 = this;
                rx.l<? super T> r0 = r1.a
                r0.onNext(r2)
                return
        }
    }

    public s0(rx.e.a<T> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            java.lang.String r1 = a()
            r0.b = r1
            return
    }

    static java.lang.String a() {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Assembly trace:"
            r1.<init>(r2)
            int r2 = r0.length
            r3 = 0
        L11:
            if (r3 >= r2) goto L8b
            r4 = r0[r3]
            java.lang.String r5 = r4.toString()
            boolean r6 = rx.internal.operators.s0.c
            if (r6 != 0) goto L80
            int r4 = r4.getLineNumber()
            r6 = 1
            if (r4 > r6) goto L26
            goto L88
        L26:
            java.lang.String r4 = "RxJavaHooks."
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L2f
            goto L88
        L2f:
            java.lang.String r4 = "OnSubscribeOnAssembly"
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L38
            goto L88
        L38:
            java.lang.String r4 = ".junit.runner"
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L41
            goto L88
        L41:
            java.lang.String r4 = ".junit4.runner"
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L4a
            goto L88
        L4a:
            java.lang.String r4 = ".junit.internal"
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L53
            goto L88
        L53:
            java.lang.String r4 = "sun.reflect"
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L5c
            goto L88
        L5c:
            java.lang.String r4 = "java.lang.Thread."
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L65
            goto L88
        L65:
            java.lang.String r4 = "ThreadPoolExecutor"
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L6e
            goto L88
        L6e:
            java.lang.String r4 = "org.apache.catalina."
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L77
            goto L88
        L77:
            java.lang.String r4 = "org.apache.tomcat."
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L80
            goto L88
        L80:
            java.lang.String r4 = "\n at "
            r1.append(r4)
            r1.append(r5)
        L88:
            int r3 = r3 + 1
            goto L11
        L8b:
            java.lang.String r0 = "\nOriginal exception:"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            r0.call(r1)
            return
    }

    public void call(rx.l<? super T> r4) {
            r3 = this;
            rx.e$a<T> r0 = r3.a
            rx.internal.operators.s0$a r1 = new rx.internal.operators.s0$a
            java.lang.String r2 = r3.b
            r1.<init>(r4, r2)
            r0.call(r1)
            return
    }
}
