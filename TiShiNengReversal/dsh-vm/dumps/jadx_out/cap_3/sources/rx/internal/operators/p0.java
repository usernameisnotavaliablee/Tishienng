package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class p0<TLeft, TRight, TLeftDuration, TRightDuration, R> implements rx.e.a<R> {
    final rx.e<TLeft> a;
    final rx.e<TRight> b;
    final rx.functions.p<TLeft, rx.e<TLeftDuration>> c;
    final rx.functions.p<TRight, rx.e<TRightDuration>> d;
    final rx.functions.q<TLeft, TRight, R> e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a extends java.util.HashMap<java.lang.Integer, TLeft> {
        private static final long serialVersionUID = 3491669543549085380L;
        final rx.subscriptions.b a;
        final rx.l<? super R> b;
        boolean c;
        int d;
        boolean e;
        int f;
        final java.util.Map<java.lang.Integer, TRight> g;
        final /* synthetic */ rx.internal.operators.p0 h;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: rx.internal.operators.p0$a$a, reason: collision with other inner class name */
        final class C0020a extends rx.l<TLeft> {
            final /* synthetic */ rx.internal.operators.p0.a a;

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            /* renamed from: rx.internal.operators.p0$a$a$a, reason: collision with other inner class name */
            final class C0021a extends rx.l<TLeftDuration> {
                final int a;
                boolean b;
                final /* synthetic */ rx.internal.operators.p0.a.C0020a c;

                public C0021a(rx.internal.operators.p0.a.C0020a r1, int r2) {
                        r0 = this;
                        r0.c = r1
                        r0.<init>()
                        r1 = 1
                        r0.b = r1
                        r0.a = r2
                        return
                }

                public void onCompleted() {
                        r2 = this;
                        boolean r0 = r2.b
                        if (r0 == 0) goto Le
                        r0 = 0
                        r2.b = r0
                        rx.internal.operators.p0$a$a r0 = r2.c
                        int r1 = r2.a
                        r0.g(r1, r2)
                    Le:
                        return
                }

                public void onError(java.lang.Throwable r2) {
                        r1 = this;
                        rx.internal.operators.p0$a$a r0 = r1.c
                        r0.onError(r2)
                        return
                }

                public void onNext(TLeftDuration r1) {
                        r0 = this;
                        r0.onCompleted()
                        return
                }
            }

            C0020a(rx.internal.operators.p0.a r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            protected void g(int r3, rx.m r4) {
                    r2 = this;
                    rx.internal.operators.p0$a r0 = r2.a
                    monitor-enter(r0)
                    rx.internal.operators.p0$a r1 = r2.a     // Catch: java.lang.Throwable -> L27
                    java.util.HashMap r1 = r1.a()     // Catch: java.lang.Throwable -> L27
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L27
                    java.lang.Object r3 = r1.remove(r3)     // Catch: java.lang.Throwable -> L27
                    if (r3 == 0) goto L29
                    rx.internal.operators.p0$a r3 = r2.a     // Catch: java.lang.Throwable -> L27
                    java.util.HashMap r3 = r3.a()     // Catch: java.lang.Throwable -> L27
                    boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L27
                    if (r3 == 0) goto L29
                    rx.internal.operators.p0$a r3 = r2.a     // Catch: java.lang.Throwable -> L27
                    boolean r3 = r3.c     // Catch: java.lang.Throwable -> L27
                    if (r3 == 0) goto L29
                    r3 = 1
                    goto L2a
                L27:
                    r3 = move-exception
                    goto L44
                L29:
                    r3 = 0
                L2a:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
                    if (r3 == 0) goto L3c
                    rx.internal.operators.p0$a r3 = r2.a
                    rx.l<? super R> r3 = r3.b
                    r3.onCompleted()
                    rx.internal.operators.p0$a r3 = r2.a
                    rx.l<? super R> r3 = r3.b
                    r3.unsubscribe()
                    return
                L3c:
                    rx.internal.operators.p0$a r3 = r2.a
                    rx.subscriptions.b r3 = r3.a
                    r3.f(r4)
                    return
                L44:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
                    throw r3
            }

            public void onCompleted() {
                    r4 = this;
                    rx.internal.operators.p0$a r0 = r4.a
                    monitor-enter(r0)
                    rx.internal.operators.p0$a r1 = r4.a     // Catch: java.lang.Throwable -> L19
                    r2 = 1
                    r1.c = r2     // Catch: java.lang.Throwable -> L19
                    boolean r3 = r1.e     // Catch: java.lang.Throwable -> L19
                    if (r3 != 0) goto L1b
                    java.util.HashMap r1 = r1.a()     // Catch: java.lang.Throwable -> L19
                    boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L19
                    if (r1 == 0) goto L17
                    goto L1b
                L17:
                    r2 = 0
                    goto L1b
                L19:
                    r1 = move-exception
                    goto L35
                L1b:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                    if (r2 == 0) goto L2d
                    rx.internal.operators.p0$a r0 = r4.a
                    rx.l<? super R> r0 = r0.b
                    r0.onCompleted()
                    rx.internal.operators.p0$a r0 = r4.a
                    rx.l<? super R> r0 = r0.b
                    r0.unsubscribe()
                    return
                L2d:
                    rx.internal.operators.p0$a r0 = r4.a
                    rx.subscriptions.b r0 = r0.a
                    r0.f(r4)
                    return
                L35:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                    throw r1
            }

            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    rx.internal.operators.p0$a r0 = r1.a
                    rx.l<? super R> r0 = r0.b
                    r0.onError(r2)
                    rx.internal.operators.p0$a r2 = r1.a
                    rx.l<? super R> r2 = r2.b
                    r2.unsubscribe()
                    return
            }

            public void onNext(TLeft r7) {
                    r6 = this;
                    rx.internal.operators.p0$a r0 = r6.a
                    monitor-enter(r0)
                    rx.internal.operators.p0$a r1 = r6.a     // Catch: java.lang.Throwable -> L94
                    int r2 = r1.d     // Catch: java.lang.Throwable -> L94
                    int r3 = r2 + 1
                    r1.d = r3     // Catch: java.lang.Throwable -> L94
                    java.util.HashMap r1 = r1.a()     // Catch: java.lang.Throwable -> L94
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L94
                    r1.put(r3, r7)     // Catch: java.lang.Throwable -> L94
                    rx.internal.operators.p0$a r1 = r6.a     // Catch: java.lang.Throwable -> L94
                    int r3 = r1.f     // Catch: java.lang.Throwable -> L94
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L94
                    rx.internal.operators.p0 r0 = r1.h     // Catch: java.lang.Throwable -> L8b
                    rx.functions.p<TLeft, rx.e<TLeftDuration>> r0 = r0.c     // Catch: java.lang.Throwable -> L8b
                    java.lang.Object r0 = r0.call(r7)     // Catch: java.lang.Throwable -> L8b
                    rx.e r0 = (rx.e) r0     // Catch: java.lang.Throwable -> L8b
                    rx.internal.operators.p0$a$a$a r1 = new rx.internal.operators.p0$a$a$a     // Catch: java.lang.Throwable -> L8b
                    r1.<init>(r6, r2)     // Catch: java.lang.Throwable -> L8b
                    rx.internal.operators.p0$a r2 = r6.a     // Catch: java.lang.Throwable -> L8b
                    rx.subscriptions.b r2 = r2.a     // Catch: java.lang.Throwable -> L8b
                    r2.a(r1)     // Catch: java.lang.Throwable -> L8b
                    r0.J6(r1)     // Catch: java.lang.Throwable -> L8b
                    java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8b
                    r0.<init>()     // Catch: java.lang.Throwable -> L8b
                    rx.internal.operators.p0$a r1 = r6.a     // Catch: java.lang.Throwable -> L8b
                    monitor-enter(r1)     // Catch: java.lang.Throwable -> L8b
                    rx.internal.operators.p0$a r2 = r6.a     // Catch: java.lang.Throwable -> L68
                    java.util.Map<java.lang.Integer, TRight> r2 = r2.g     // Catch: java.lang.Throwable -> L68
                    java.util.Set r2 = r2.entrySet()     // Catch: java.lang.Throwable -> L68
                    java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L68
                L48:
                    boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L68
                    if (r4 == 0) goto L6a
                    java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L68
                    java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Throwable -> L68
                    java.lang.Object r5 = r4.getKey()     // Catch: java.lang.Throwable -> L68
                    java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> L68
                    int r5 = r5.intValue()     // Catch: java.lang.Throwable -> L68
                    if (r5 >= r3) goto L48
                    java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L68
                    r0.add(r4)     // Catch: java.lang.Throwable -> L68
                    goto L48
                L68:
                    r7 = move-exception
                    goto L8e
                L6a:
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L68
                    java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L8b
                L6f:
                    boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L8b
                    if (r1 == 0) goto L8d
                    java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L8b
                    rx.internal.operators.p0$a r2 = r6.a     // Catch: java.lang.Throwable -> L8b
                    rx.internal.operators.p0 r2 = r2.h     // Catch: java.lang.Throwable -> L8b
                    rx.functions.q<TLeft, TRight, R> r2 = r2.e     // Catch: java.lang.Throwable -> L8b
                    java.lang.Object r1 = r2.call(r7, r1)     // Catch: java.lang.Throwable -> L8b
                    rx.internal.operators.p0$a r2 = r6.a     // Catch: java.lang.Throwable -> L8b
                    rx.l<? super R> r2 = r2.b     // Catch: java.lang.Throwable -> L8b
                    r2.onNext(r1)     // Catch: java.lang.Throwable -> L8b
                    goto L6f
                L8b:
                    r7 = move-exception
                    goto L90
                L8d:
                    return
                L8e:
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L68
                    throw r7     // Catch: java.lang.Throwable -> L8b
                L90:
                    rx.exceptions.a.f(r7, r6)
                    return
                L94:
                    r7 = move-exception
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L94
                    throw r7
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        final class b extends rx.l<TRight> {
            final /* synthetic */ rx.internal.operators.p0.a a;

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            /* renamed from: rx.internal.operators.p0$a$b$a, reason: collision with other inner class name */
            final class C0022a extends rx.l<TRightDuration> {
                final int a;
                boolean b;
                final /* synthetic */ rx.internal.operators.p0.a.b c;

                public C0022a(rx.internal.operators.p0.a.b r1, int r2) {
                        r0 = this;
                        r0.c = r1
                        r0.<init>()
                        r1 = 1
                        r0.b = r1
                        r0.a = r2
                        return
                }

                public void onCompleted() {
                        r2 = this;
                        boolean r0 = r2.b
                        if (r0 == 0) goto Le
                        r0 = 0
                        r2.b = r0
                        rx.internal.operators.p0$a$b r0 = r2.c
                        int r1 = r2.a
                        r0.g(r1, r2)
                    Le:
                        return
                }

                public void onError(java.lang.Throwable r2) {
                        r1 = this;
                        rx.internal.operators.p0$a$b r0 = r1.c
                        r0.onError(r2)
                        return
                }

                public void onNext(TRightDuration r1) {
                        r0 = this;
                        r0.onCompleted()
                        return
                }
            }

            b(rx.internal.operators.p0.a r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            void g(int r3, rx.m r4) {
                    r2 = this;
                    rx.internal.operators.p0$a r0 = r2.a
                    monitor-enter(r0)
                    rx.internal.operators.p0$a r1 = r2.a     // Catch: java.lang.Throwable -> L23
                    java.util.Map<java.lang.Integer, TRight> r1 = r1.g     // Catch: java.lang.Throwable -> L23
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L23
                    java.lang.Object r3 = r1.remove(r3)     // Catch: java.lang.Throwable -> L23
                    if (r3 == 0) goto L25
                    rx.internal.operators.p0$a r3 = r2.a     // Catch: java.lang.Throwable -> L23
                    java.util.Map<java.lang.Integer, TRight> r3 = r3.g     // Catch: java.lang.Throwable -> L23
                    boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L23
                    if (r3 == 0) goto L25
                    rx.internal.operators.p0$a r3 = r2.a     // Catch: java.lang.Throwable -> L23
                    boolean r3 = r3.e     // Catch: java.lang.Throwable -> L23
                    if (r3 == 0) goto L25
                    r3 = 1
                    goto L26
                L23:
                    r3 = move-exception
                    goto L40
                L25:
                    r3 = 0
                L26:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
                    if (r3 == 0) goto L38
                    rx.internal.operators.p0$a r3 = r2.a
                    rx.l<? super R> r3 = r3.b
                    r3.onCompleted()
                    rx.internal.operators.p0$a r3 = r2.a
                    rx.l<? super R> r3 = r3.b
                    r3.unsubscribe()
                    return
                L38:
                    rx.internal.operators.p0$a r3 = r2.a
                    rx.subscriptions.b r3 = r3.a
                    r3.f(r4)
                    return
                L40:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
                    throw r3
            }

            public void onCompleted() {
                    r4 = this;
                    rx.internal.operators.p0$a r0 = r4.a
                    monitor-enter(r0)
                    rx.internal.operators.p0$a r1 = r4.a     // Catch: java.lang.Throwable -> L17
                    r2 = 1
                    r1.e = r2     // Catch: java.lang.Throwable -> L17
                    boolean r3 = r1.c     // Catch: java.lang.Throwable -> L17
                    if (r3 != 0) goto L19
                    java.util.Map<java.lang.Integer, TRight> r1 = r1.g     // Catch: java.lang.Throwable -> L17
                    boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L17
                    if (r1 == 0) goto L15
                    goto L19
                L15:
                    r2 = 0
                    goto L19
                L17:
                    r1 = move-exception
                    goto L33
                L19:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
                    if (r2 == 0) goto L2b
                    rx.internal.operators.p0$a r0 = r4.a
                    rx.l<? super R> r0 = r0.b
                    r0.onCompleted()
                    rx.internal.operators.p0$a r0 = r4.a
                    rx.l<? super R> r0 = r0.b
                    r0.unsubscribe()
                    return
                L2b:
                    rx.internal.operators.p0$a r0 = r4.a
                    rx.subscriptions.b r0 = r0.a
                    r0.f(r4)
                    return
                L33:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
                    throw r1
            }

            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    rx.internal.operators.p0$a r0 = r1.a
                    rx.l<? super R> r0 = r0.b
                    r0.onError(r2)
                    rx.internal.operators.p0$a r2 = r1.a
                    rx.l<? super R> r2 = r2.b
                    r2.unsubscribe()
                    return
            }

            public void onNext(TRight r7) {
                    r6 = this;
                    rx.internal.operators.p0$a r0 = r6.a
                    monitor-enter(r0)
                    rx.internal.operators.p0$a r1 = r6.a     // Catch: java.lang.Throwable -> La2
                    int r2 = r1.f     // Catch: java.lang.Throwable -> La2
                    int r3 = r2 + 1
                    r1.f = r3     // Catch: java.lang.Throwable -> La2
                    java.util.Map<java.lang.Integer, TRight> r1 = r1.g     // Catch: java.lang.Throwable -> La2
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> La2
                    r1.put(r3, r7)     // Catch: java.lang.Throwable -> La2
                    rx.internal.operators.p0$a r1 = r6.a     // Catch: java.lang.Throwable -> La2
                    int r1 = r1.d     // Catch: java.lang.Throwable -> La2
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> La2
                    rx.subscriptions.e r0 = new rx.subscriptions.e
                    r0.<init>()
                    rx.internal.operators.p0$a r3 = r6.a
                    rx.subscriptions.b r3 = r3.a
                    r3.a(r0)
                    rx.internal.operators.p0$a r0 = r6.a     // Catch: java.lang.Throwable -> L99
                    rx.internal.operators.p0 r0 = r0.h     // Catch: java.lang.Throwable -> L99
                    rx.functions.p<TRight, rx.e<TRightDuration>> r0 = r0.d     // Catch: java.lang.Throwable -> L99
                    java.lang.Object r0 = r0.call(r7)     // Catch: java.lang.Throwable -> L99
                    rx.e r0 = (rx.e) r0     // Catch: java.lang.Throwable -> L99
                    rx.internal.operators.p0$a$b$a r3 = new rx.internal.operators.p0$a$b$a     // Catch: java.lang.Throwable -> L99
                    r3.<init>(r6, r2)     // Catch: java.lang.Throwable -> L99
                    rx.internal.operators.p0$a r2 = r6.a     // Catch: java.lang.Throwable -> L99
                    rx.subscriptions.b r2 = r2.a     // Catch: java.lang.Throwable -> L99
                    r2.a(r3)     // Catch: java.lang.Throwable -> L99
                    r0.J6(r3)     // Catch: java.lang.Throwable -> L99
                    java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L99
                    r0.<init>()     // Catch: java.lang.Throwable -> L99
                    rx.internal.operators.p0$a r2 = r6.a     // Catch: java.lang.Throwable -> L99
                    monitor-enter(r2)     // Catch: java.lang.Throwable -> L99
                    rx.internal.operators.p0$a r3 = r6.a     // Catch: java.lang.Throwable -> L76
                    java.util.HashMap r3 = r3.a()     // Catch: java.lang.Throwable -> L76
                    java.util.Set r3 = r3.entrySet()     // Catch: java.lang.Throwable -> L76
                    java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L76
                L56:
                    boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L76
                    if (r4 == 0) goto L78
                    java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L76
                    java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Throwable -> L76
                    java.lang.Object r5 = r4.getKey()     // Catch: java.lang.Throwable -> L76
                    java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> L76
                    int r5 = r5.intValue()     // Catch: java.lang.Throwable -> L76
                    if (r5 >= r1) goto L56
                    java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L76
                    r0.add(r4)     // Catch: java.lang.Throwable -> L76
                    goto L56
                L76:
                    r7 = move-exception
                    goto L9c
                L78:
                    monitor-exit(r2)     // Catch: java.lang.Throwable -> L76
                    java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L99
                L7d:
                    boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L99
                    if (r1 == 0) goto L9b
                    java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L99
                    rx.internal.operators.p0$a r2 = r6.a     // Catch: java.lang.Throwable -> L99
                    rx.internal.operators.p0 r2 = r2.h     // Catch: java.lang.Throwable -> L99
                    rx.functions.q<TLeft, TRight, R> r2 = r2.e     // Catch: java.lang.Throwable -> L99
                    java.lang.Object r1 = r2.call(r1, r7)     // Catch: java.lang.Throwable -> L99
                    rx.internal.operators.p0$a r2 = r6.a     // Catch: java.lang.Throwable -> L99
                    rx.l<? super R> r2 = r2.b     // Catch: java.lang.Throwable -> L99
                    r2.onNext(r1)     // Catch: java.lang.Throwable -> L99
                    goto L7d
                L99:
                    r7 = move-exception
                    goto L9e
                L9b:
                    return
                L9c:
                    monitor-exit(r2)     // Catch: java.lang.Throwable -> L76
                    throw r7     // Catch: java.lang.Throwable -> L99
                L9e:
                    rx.exceptions.a.f(r7, r6)
                    return
                La2:
                    r7 = move-exception
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> La2
                    throw r7
            }
        }

        public a(rx.internal.operators.p0 r1, rx.l<? super R> r2) {
                r0 = this;
                r0.h = r1
                r0.<init>()
                r0.b = r2
                rx.subscriptions.b r1 = new rx.subscriptions.b
                r1.<init>()
                r0.a = r1
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                r0.g = r1
                return
        }

        java.util.HashMap<java.lang.Integer, TLeft> a() {
                r0 = this;
                return r0
        }

        public void b() {
                r3 = this;
                rx.l<? super R> r0 = r3.b
                rx.subscriptions.b r1 = r3.a
                r0.add(r1)
                rx.internal.operators.p0$a$a r0 = new rx.internal.operators.p0$a$a
                r0.<init>(r3)
                rx.internal.operators.p0$a$b r1 = new rx.internal.operators.p0$a$b
                r1.<init>(r3)
                rx.subscriptions.b r2 = r3.a
                r2.a(r0)
                rx.subscriptions.b r2 = r3.a
                r2.a(r1)
                rx.internal.operators.p0 r2 = r3.h
                rx.e<TLeft> r2 = r2.a
                r2.J6(r0)
                rx.internal.operators.p0 r0 = r3.h
                rx.e<TRight> r0 = r0.b
                r0.J6(r1)
                return
        }
    }

    public p0(rx.e<TLeft> r1, rx.e<TRight> r2, rx.functions.p<TLeft, rx.e<TLeftDuration>> r3, rx.functions.p<TRight, rx.e<TRightDuration>> r4, rx.functions.q<TLeft, TRight, R> r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            return
    }

    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            r0.call(r1)
            return
    }

    public void call(rx.l<? super R> r3) {
            r2 = this;
            rx.internal.operators.p0$a r0 = new rx.internal.operators.p0$a
            rx.observers.g r1 = new rx.observers.g
            r1.<init>(r3)
            r0.<init>(r2, r1)
            r0.b()
            return
    }
}
