package com.trello.rxlifecycle2.android;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b {
    private static final io.reactivex.functions.Function<com.trello.rxlifecycle2.android.ActivityEvent, com.trello.rxlifecycle2.android.ActivityEvent> a = null;
    private static final io.reactivex.functions.Function<com.trello.rxlifecycle2.android.FragmentEvent, com.trello.rxlifecycle2.android.FragmentEvent> b = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements io.reactivex.functions.Function<com.trello.rxlifecycle2.android.ActivityEvent, com.trello.rxlifecycle2.android.ActivityEvent> {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        public com.trello.rxlifecycle2.android.ActivityEvent a(com.trello.rxlifecycle2.android.ActivityEvent r4) throws java.lang.Exception {
                r3 = this;
                int[] r0 = com.trello.rxlifecycle2.android.b.c.a
                int r1 = r4.ordinal()
                r0 = r0[r1]
                switch(r0) {
                    case 1: goto L3b;
                    case 2: goto L38;
                    case 3: goto L35;
                    case 4: goto L32;
                    case 5: goto L2f;
                    case 6: goto L27;
                    default: goto Lb;
                }
            Lb:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Binding to "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = " not yet implemented"
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
            L27:
                com.trello.rxlifecycle2.OutsideLifecycleException r4 = new com.trello.rxlifecycle2.OutsideLifecycleException
                java.lang.String r0 = "Cannot bind to Activity lifecycle when outside of it."
                r4.<init>(r0)
                throw r4
            L2f:
                com.trello.rxlifecycle2.android.ActivityEvent r4 = com.trello.rxlifecycle2.android.ActivityEvent.DESTROY
                return r4
            L32:
                com.trello.rxlifecycle2.android.ActivityEvent r4 = com.trello.rxlifecycle2.android.ActivityEvent.STOP
                return r4
            L35:
                com.trello.rxlifecycle2.android.ActivityEvent r4 = com.trello.rxlifecycle2.android.ActivityEvent.PAUSE
                return r4
            L38:
                com.trello.rxlifecycle2.android.ActivityEvent r4 = com.trello.rxlifecycle2.android.ActivityEvent.STOP
                return r4
            L3b:
                com.trello.rxlifecycle2.android.ActivityEvent r4 = com.trello.rxlifecycle2.android.ActivityEvent.DESTROY
                return r4
        }

        public /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r1) throws java.lang.Exception {
                r0 = this;
                com.trello.rxlifecycle2.android.ActivityEvent r1 = (com.trello.rxlifecycle2.android.ActivityEvent) r1
                com.trello.rxlifecycle2.android.ActivityEvent r1 = r0.a(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.trello.rxlifecycle2.android.b$b, reason: collision with other inner class name */
    static class C0040b implements io.reactivex.functions.Function<com.trello.rxlifecycle2.android.FragmentEvent, com.trello.rxlifecycle2.android.FragmentEvent> {
        C0040b() {
                r0 = this;
                r0.<init>()
                return
        }

        public com.trello.rxlifecycle2.android.FragmentEvent a(com.trello.rxlifecycle2.android.FragmentEvent r4) throws java.lang.Exception {
                r3 = this;
                int[] r0 = com.trello.rxlifecycle2.android.b.c.b
                int r1 = r4.ordinal()
                r0 = r0[r1]
                switch(r0) {
                    case 1: goto L47;
                    case 2: goto L44;
                    case 3: goto L41;
                    case 4: goto L3e;
                    case 5: goto L3b;
                    case 6: goto L38;
                    case 7: goto L35;
                    case 8: goto L32;
                    case 9: goto L2f;
                    case 10: goto L27;
                    default: goto Lb;
                }
            Lb:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Binding to "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = " not yet implemented"
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
            L27:
                com.trello.rxlifecycle2.OutsideLifecycleException r4 = new com.trello.rxlifecycle2.OutsideLifecycleException
                java.lang.String r0 = "Cannot bind to Fragment lifecycle when outside of it."
                r4.<init>(r0)
                throw r4
            L2f:
                com.trello.rxlifecycle2.android.FragmentEvent r4 = com.trello.rxlifecycle2.android.FragmentEvent.DETACH
                return r4
            L32:
                com.trello.rxlifecycle2.android.FragmentEvent r4 = com.trello.rxlifecycle2.android.FragmentEvent.DESTROY
                return r4
            L35:
                com.trello.rxlifecycle2.android.FragmentEvent r4 = com.trello.rxlifecycle2.android.FragmentEvent.DESTROY_VIEW
                return r4
            L38:
                com.trello.rxlifecycle2.android.FragmentEvent r4 = com.trello.rxlifecycle2.android.FragmentEvent.STOP
                return r4
            L3b:
                com.trello.rxlifecycle2.android.FragmentEvent r4 = com.trello.rxlifecycle2.android.FragmentEvent.PAUSE
                return r4
            L3e:
                com.trello.rxlifecycle2.android.FragmentEvent r4 = com.trello.rxlifecycle2.android.FragmentEvent.STOP
                return r4
            L41:
                com.trello.rxlifecycle2.android.FragmentEvent r4 = com.trello.rxlifecycle2.android.FragmentEvent.DESTROY_VIEW
                return r4
            L44:
                com.trello.rxlifecycle2.android.FragmentEvent r4 = com.trello.rxlifecycle2.android.FragmentEvent.DESTROY
                return r4
            L47:
                com.trello.rxlifecycle2.android.FragmentEvent r4 = com.trello.rxlifecycle2.android.FragmentEvent.DETACH
                return r4
        }

        public /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r1) throws java.lang.Exception {
                r0 = this;
                com.trello.rxlifecycle2.android.FragmentEvent r1 = (com.trello.rxlifecycle2.android.FragmentEvent) r1
                com.trello.rxlifecycle2.android.FragmentEvent r1 = r0.a(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class c {
        static final /* synthetic */ int[] a = null;
        static final /* synthetic */ int[] b = null;

        static {
                com.trello.rxlifecycle2.android.FragmentEvent[] r0 = com.trello.rxlifecycle2.android.FragmentEvent.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.trello.rxlifecycle2.android.b.c.b = r0
                r1 = 1
                com.trello.rxlifecycle2.android.FragmentEvent r2 = com.trello.rxlifecycle2.android.FragmentEvent.ATTACH     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = com.trello.rxlifecycle2.android.b.c.b     // Catch: java.lang.NoSuchFieldError -> L1d
                com.trello.rxlifecycle2.android.FragmentEvent r3 = com.trello.rxlifecycle2.android.FragmentEvent.CREATE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                r2 = 3
                int[] r3 = com.trello.rxlifecycle2.android.b.c.b     // Catch: java.lang.NoSuchFieldError -> L28
                com.trello.rxlifecycle2.android.FragmentEvent r4 = com.trello.rxlifecycle2.android.FragmentEvent.CREATE_VIEW     // Catch: java.lang.NoSuchFieldError -> L28
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                r3 = 4
                int[] r4 = com.trello.rxlifecycle2.android.b.c.b     // Catch: java.lang.NoSuchFieldError -> L33
                com.trello.rxlifecycle2.android.FragmentEvent r5 = com.trello.rxlifecycle2.android.FragmentEvent.START     // Catch: java.lang.NoSuchFieldError -> L33
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r4[r5] = r3     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                r4 = 5
                int[] r5 = com.trello.rxlifecycle2.android.b.c.b     // Catch: java.lang.NoSuchFieldError -> L3e
                com.trello.rxlifecycle2.android.FragmentEvent r6 = com.trello.rxlifecycle2.android.FragmentEvent.RESUME     // Catch: java.lang.NoSuchFieldError -> L3e
                int r6 = r6.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r5[r6] = r4     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                r5 = 6
                int[] r6 = com.trello.rxlifecycle2.android.b.c.b     // Catch: java.lang.NoSuchFieldError -> L49
                com.trello.rxlifecycle2.android.FragmentEvent r7 = com.trello.rxlifecycle2.android.FragmentEvent.PAUSE     // Catch: java.lang.NoSuchFieldError -> L49
                int r7 = r7.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r6[r7] = r5     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r6 = com.trello.rxlifecycle2.android.b.c.b     // Catch: java.lang.NoSuchFieldError -> L54
                com.trello.rxlifecycle2.android.FragmentEvent r7 = com.trello.rxlifecycle2.android.FragmentEvent.STOP     // Catch: java.lang.NoSuchFieldError -> L54
                int r7 = r7.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r8 = 7
                r6[r7] = r8     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r6 = com.trello.rxlifecycle2.android.b.c.b     // Catch: java.lang.NoSuchFieldError -> L60
                com.trello.rxlifecycle2.android.FragmentEvent r7 = com.trello.rxlifecycle2.android.FragmentEvent.DESTROY_VIEW     // Catch: java.lang.NoSuchFieldError -> L60
                int r7 = r7.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r8 = 8
                r6[r7] = r8     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                int[] r6 = com.trello.rxlifecycle2.android.b.c.b     // Catch: java.lang.NoSuchFieldError -> L6c
                com.trello.rxlifecycle2.android.FragmentEvent r7 = com.trello.rxlifecycle2.android.FragmentEvent.DESTROY     // Catch: java.lang.NoSuchFieldError -> L6c
                int r7 = r7.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r8 = 9
                r6[r7] = r8     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                int[] r6 = com.trello.rxlifecycle2.android.b.c.b     // Catch: java.lang.NoSuchFieldError -> L78
                com.trello.rxlifecycle2.android.FragmentEvent r7 = com.trello.rxlifecycle2.android.FragmentEvent.DETACH     // Catch: java.lang.NoSuchFieldError -> L78
                int r7 = r7.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r8 = 10
                r6[r7] = r8     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                com.trello.rxlifecycle2.android.ActivityEvent[] r6 = com.trello.rxlifecycle2.android.ActivityEvent.values()
                int r6 = r6.length
                int[] r6 = new int[r6]
                com.trello.rxlifecycle2.android.b.c.a = r6
                com.trello.rxlifecycle2.android.ActivityEvent r7 = com.trello.rxlifecycle2.android.ActivityEvent.CREATE     // Catch: java.lang.NoSuchFieldError -> L89
                int r7 = r7.ordinal()     // Catch: java.lang.NoSuchFieldError -> L89
                r6[r7] = r1     // Catch: java.lang.NoSuchFieldError -> L89
            L89:
                int[] r1 = com.trello.rxlifecycle2.android.b.c.a     // Catch: java.lang.NoSuchFieldError -> L93
                com.trello.rxlifecycle2.android.ActivityEvent r6 = com.trello.rxlifecycle2.android.ActivityEvent.START     // Catch: java.lang.NoSuchFieldError -> L93
                int r6 = r6.ordinal()     // Catch: java.lang.NoSuchFieldError -> L93
                r1[r6] = r0     // Catch: java.lang.NoSuchFieldError -> L93
            L93:
                int[] r0 = com.trello.rxlifecycle2.android.b.c.a     // Catch: java.lang.NoSuchFieldError -> L9d
                com.trello.rxlifecycle2.android.ActivityEvent r1 = com.trello.rxlifecycle2.android.ActivityEvent.RESUME     // Catch: java.lang.NoSuchFieldError -> L9d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9d
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L9d
            L9d:
                int[] r0 = com.trello.rxlifecycle2.android.b.c.a     // Catch: java.lang.NoSuchFieldError -> La7
                com.trello.rxlifecycle2.android.ActivityEvent r1 = com.trello.rxlifecycle2.android.ActivityEvent.PAUSE     // Catch: java.lang.NoSuchFieldError -> La7
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La7
                r0[r1] = r3     // Catch: java.lang.NoSuchFieldError -> La7
            La7:
                int[] r0 = com.trello.rxlifecycle2.android.b.c.a     // Catch: java.lang.NoSuchFieldError -> Lb1
                com.trello.rxlifecycle2.android.ActivityEvent r1 = com.trello.rxlifecycle2.android.ActivityEvent.STOP     // Catch: java.lang.NoSuchFieldError -> Lb1
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb1
                r0[r1] = r4     // Catch: java.lang.NoSuchFieldError -> Lb1
            Lb1:
                int[] r0 = com.trello.rxlifecycle2.android.b.c.a     // Catch: java.lang.NoSuchFieldError -> Lbb
                com.trello.rxlifecycle2.android.ActivityEvent r1 = com.trello.rxlifecycle2.android.ActivityEvent.DESTROY     // Catch: java.lang.NoSuchFieldError -> Lbb
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lbb
                r0[r1] = r5     // Catch: java.lang.NoSuchFieldError -> Lbb
            Lbb:
                return
        }

        public c() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    static {
            com.trello.rxlifecycle2.android.b$a r0 = new com.trello.rxlifecycle2.android.b$a
            r0.<init>()
            com.trello.rxlifecycle2.android.b.a = r0
            com.trello.rxlifecycle2.android.b$b r0 = new com.trello.rxlifecycle2.android.b$b
            r0.<init>()
            com.trello.rxlifecycle2.android.b.b = r0
            return
    }

    private b() {
            r2 = this;
            r2.<init>()
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "No instances"
            r0.<init>(r1)
            throw r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public static <T> com.trello.rxlifecycle2.c<T> a(@androidx.annotation.NonNull io.reactivex.Observable<com.trello.rxlifecycle2.android.ActivityEvent> r1) {
            io.reactivex.functions.Function<com.trello.rxlifecycle2.android.ActivityEvent, com.trello.rxlifecycle2.android.ActivityEvent> r0 = com.trello.rxlifecycle2.android.b.a
            com.trello.rxlifecycle2.c r1 = com.trello.rxlifecycle2.d.b(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public static <T> com.trello.rxlifecycle2.c<T> b(@androidx.annotation.NonNull io.reactivex.Observable<com.trello.rxlifecycle2.android.FragmentEvent> r1) {
            io.reactivex.functions.Function<com.trello.rxlifecycle2.android.FragmentEvent, com.trello.rxlifecycle2.android.FragmentEvent> r0 = com.trello.rxlifecycle2.android.b.b
            com.trello.rxlifecycle2.c r1 = com.trello.rxlifecycle2.d.b(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public static <T> com.trello.rxlifecycle2.c<T> c(@androidx.annotation.NonNull android.view.View r1) {
            java.lang.String r0 = "view == null"
            z2.a.a(r1, r0)
            com.trello.rxlifecycle2.android.c r0 = new com.trello.rxlifecycle2.android.c
            r0.<init>(r1)
            io.reactivex.Observable r1 = io.reactivex.Observable.create(r0)
            com.trello.rxlifecycle2.c r1 = com.trello.rxlifecycle2.d.a(r1)
            return r1
    }
}
