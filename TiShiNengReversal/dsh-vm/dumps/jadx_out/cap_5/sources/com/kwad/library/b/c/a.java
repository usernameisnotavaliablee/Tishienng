package com.kwad.library.b.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a {
    private static final java.lang.String CLAZZ_NAME = "com.kwad.library.b.c.a";
    private static final java.lang.ThreadLocal<com.kwad.library.b.c.a.C0121a> sAutoUnWrapModelTL = null;
    private static final java.util.List<java.lang.String> sAutoUnWrapStackList = null;
    private static final java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.content.Context>> sResContextCache = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.library.b.c.a$a, reason: collision with other inner class name */
    static class C0121a {
        private java.lang.ref.WeakReference<android.content.Context> aqb;
        private int aqc;
        private java.lang.StackTraceElement[] aqd;
        private int aqe;
        private long aqf;

        private C0121a() {
                r2 = this;
                r2.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r1 = 0
                r0.<init>(r1)
                r2.aqb = r0
                r0 = 0
                r2.aqc = r0
                r2.aqd = r1
                r2.aqe = r0
                return
        }

        /* synthetic */ C0121a(byte r1) {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ long a(com.kwad.library.b.c.a.C0121a r0, long r1) {
                r0.aqf = r1
                return r1
        }

        static /* synthetic */ java.lang.ref.WeakReference a(com.kwad.library.b.c.a.C0121a r0) {
                java.lang.ref.WeakReference<android.content.Context> r0 = r0.aqb
                return r0
        }

        static /* synthetic */ java.lang.ref.WeakReference a(com.kwad.library.b.c.a.C0121a r0, java.lang.ref.WeakReference r1) {
                r0.aqb = r1
                return r1
        }

        static /* synthetic */ java.lang.StackTraceElement[] a(com.kwad.library.b.c.a.C0121a r0, java.lang.StackTraceElement[] r1) {
                r0.aqd = r1
                return r1
        }

        static /* synthetic */ long b(com.kwad.library.b.c.a.C0121a r2) {
                long r0 = r2.aqf
                return r0
        }

        static /* synthetic */ int c(com.kwad.library.b.c.a.C0121a r2) {
                int r0 = r2.aqc
                int r1 = r0 + 1
                r2.aqc = r1
                return r0
        }

        private void clear() {
                r2 = this;
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r1 = 0
                r0.<init>(r1)
                r2.aqb = r0
                r0 = 0
                r2.aqc = r0
                r2.aqd = r1
                r2.aqe = r0
                r0 = 0
                r2.aqf = r0
                return
        }

        static /* synthetic */ int d(com.kwad.library.b.c.a.C0121a r0) {
                int r0 = r0.aqc
                return r0
        }

        static /* synthetic */ void e(com.kwad.library.b.c.a.C0121a r0) {
                r0.clear()
                return
        }

        static /* synthetic */ java.lang.StackTraceElement[] f(com.kwad.library.b.c.a.C0121a r0) {
                java.lang.StackTraceElement[] r0 = r0.aqd
                return r0
        }

        static /* synthetic */ int g(com.kwad.library.b.c.a.C0121a r2) {
                int r0 = r2.aqe
                int r1 = r0 + 1
                r2.aqe = r1
                return r0
        }

        static /* synthetic */ int h(com.kwad.library.b.c.a.C0121a r0) {
                int r0 = r0.aqe
                return r0
        }
    }

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            com.kwad.library.b.c.a.sAutoUnWrapModelTL = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.kwad.library.b.c.a.sAutoUnWrapStackList = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.kwad.library.b.c.a.sResContextCache = r0
            return
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    private static android.content.Context a(java.lang.String r2, android.content.Context r3) {
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.content.Context>> r0 = com.kwad.library.b.c.a.sResContextCache
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            int r2 = java.lang.System.identityHashCode(r3)
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            java.lang.Object r2 = r0.get(r2)
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            if (r2 == 0) goto L24
            java.lang.Object r2 = r2.get()
            android.content.Context r2 = (android.content.Context) r2
            return r2
        L24:
            r2 = 0
            return r2
    }

    static android.content.res.Resources.Theme a(android.content.res.Resources.Theme r1, android.content.res.Resources.Theme r2, int r3, java.lang.String r4) {
            com.kwad.library.b.a r4 = bM(r4)
            if (r4 == 0) goto L1f
            boolean r0 = r4.isLoaded()
            if (r0 != 0) goto Ld
            goto L1f
        Ld:
            android.content.res.Resources r4 = r4.getResources()
            if (r4 == 0) goto L1f
            if (r2 != 0) goto L1e
            android.content.res.Resources$Theme r1 = r4.newTheme()
            r2 = 1
            r1.applyStyle(r3, r2)
            return r1
        L1e:
            return r2
        L1f:
            return r1
    }

    static android.content.res.Resources a(android.content.res.Resources r1, java.lang.String r2) {
            com.kwad.library.b.a r2 = bM(r2)
            if (r2 == 0) goto L18
            boolean r0 = r2.isLoaded()
            if (r0 != 0) goto Ld
            goto L18
        Ld:
            android.content.res.Resources r2 = r2.getResources()
            java.util.Objects.toString(r2)
            if (r2 == 0) goto L17
            return r2
        L17:
            return r1
        L18:
            java.util.Objects.toString(r2)
            return r1
    }

    public static android.view.LayoutInflater a(android.view.LayoutInflater r2, java.lang.String r3) {
            com.kwad.library.b.a r0 = bM(r3)
            if (r0 == 0) goto L21
            boolean r0 = r0.isLoaded()
            if (r0 != 0) goto Ld
            goto L21
        Ld:
            android.content.Context r0 = r2.getContext()
            boolean r1 = r0 instanceof com.kwad.library.b.c.b
            if (r1 != 0) goto L21
            android.content.Context r3 = j(r0, r3)
            boolean r0 = r3 instanceof com.kwad.library.b.c.b
            if (r0 == 0) goto L21
            android.view.LayoutInflater r2 = r2.cloneInContext(r3)
        L21:
            return r2
    }

    static java.lang.ClassLoader a(java.lang.ClassLoader r1, java.lang.String r2) {
            com.kwad.library.b.a r2 = bM(r2)
            if (r2 == 0) goto L14
            boolean r0 = r2.isLoaded()
            if (r0 != 0) goto Ld
            goto L14
        Ld:
            com.kwad.library.b.a.b r2 = r2.zI()
            if (r2 == 0) goto L14
            return r2
        L14:
            return r1
    }

    private static void a(java.lang.String r2, android.content.Context r3, android.content.Context r4) {
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.content.Context>> r0 = com.kwad.library.b.c.a.sResContextCache
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            int r2 = java.lang.System.identityHashCode(r3)
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r4)
            r0.put(r2, r3)
            return
    }

    private static boolean a(java.lang.String r8, android.content.Context r9, com.kwad.library.b.c.a.C0121a r10) {
            android.content.Context r8 = a(r8, r9)
            if (r8 == 0) goto Lf
            java.lang.Class r8 = r8.getClass()
            java.lang.String r8 = r8.getName()
            goto L11
        Lf:
            java.lang.String r8 = ""
        L11:
            java.lang.Thread r9 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r9 = r9.getStackTrace()
            java.lang.StackTraceElement[] r0 = com.kwad.library.b.c.a.C0121a.f(r10)
            boolean r0 = java.util.Arrays.equals(r9, r0)
            r1 = 5
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L34
            com.kwad.library.b.c.a.C0121a.g(r10)
            com.kwad.library.b.c.a.C0121a.a(r10, r9)
            int r8 = com.kwad.library.b.c.a.C0121a.h(r10)
            if (r8 < r1) goto L33
            return r2
        L33:
            return r3
        L34:
            java.lang.StackTraceElement[] r0 = com.kwad.library.b.c.a.C0121a.f(r10)
            if (r0 == 0) goto L3e
            com.kwad.library.b.c.a.C0121a.e(r10)
            return r3
        L3e:
            com.kwad.library.b.c.a.C0121a.a(r10, r9)
            r10 = 0
            r0 = 0
        L43:
            int r4 = r9.length
            if (r10 >= r4) goto L9d
            r4 = r9[r10]
            java.lang.String r5 = r4.getClassName()
            java.util.List r6 = getAutoUnWrapStackList()
            java.util.Iterator r6 = r6.iterator()
        L54:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L67
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            boolean r7 = r5.contains(r7)
            if (r7 == 0) goto L54
            return r2
        L67:
            java.lang.String r4 = r4.getMethodName()
            int r10 = r10 + 1
            int r6 = r9.length
            if (r10 >= r6) goto L43
            java.lang.String r6 = com.kwad.library.b.c.a.CLAZZ_NAME
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L43
            java.lang.String r5 = "wrapContextIfNeed"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L43
            r4 = r9[r10]
            java.lang.String r5 = r4.getClassName()
            boolean r5 = android.text.TextUtils.equals(r8, r5)
            if (r5 == 0) goto L43
            java.lang.String r5 = "getBaseContext"
            java.lang.String r4 = r4.getMethodName()
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L43
            int r0 = r0 + 1
            if (r0 < r1) goto L43
            return r2
        L9d:
            return r3
    }

    private static android.content.Context aM(android.content.Context r0) {
            com.kwad.library.b.c.b r0 = (com.kwad.library.b.c.b) r0
            android.content.Context r0 = r0.getDelegatedContext()
            return r0
    }

    private static boolean aN(android.content.Context r0) {
            boolean r0 = r0 instanceof com.kwad.library.b.c.b
            return r0
    }

    private static boolean b(java.lang.String r7, android.content.Context r8) {
            java.lang.ThreadLocal<com.kwad.library.b.c.a$a> r0 = com.kwad.library.b.c.a.sAutoUnWrapModelTL
            java.lang.Object r1 = r0.get()
            com.kwad.library.b.c.a$a r1 = (com.kwad.library.b.c.a.C0121a) r1
            r2 = 0
            if (r1 == 0) goto L57
            java.lang.ref.WeakReference r0 = com.kwad.library.b.c.a.C0121a.a(r1)
            java.lang.Object r0 = r0.get()
            if (r0 != r8) goto L44
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = com.kwad.library.b.c.a.C0121a.b(r1)
            long r3 = r3 - r5
            long r3 = java.lang.Math.abs(r3)
            r5 = 150(0x96, double:7.4E-322)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L44
            com.kwad.library.b.c.a.C0121a.c(r1)
            boolean r0 = r8 instanceof android.app.Application
            if (r0 == 0) goto L32
            r0 = 15
            goto L33
        L32:
            r0 = 5
        L33:
            int r3 = com.kwad.library.b.c.a.C0121a.d(r1)
            if (r3 < r0) goto L5f
            boolean r7 = a(r7, r8, r1)
            if (r7 == 0) goto L5f
            com.kwad.library.b.c.a.C0121a.e(r1)
            r7 = 1
            return r7
        L44:
            com.kwad.library.b.c.a.C0121a.e(r1)
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference
            r7.<init>(r8)
            com.kwad.library.b.c.a.C0121a.a(r1, r7)
            long r7 = java.lang.System.currentTimeMillis()
            com.kwad.library.b.c.a.C0121a.a(r1, r7)
            goto L5f
        L57:
            com.kwad.library.b.c.a$a r7 = new com.kwad.library.b.c.a$a
            r7.<init>(r2)
            r0.set(r7)
        L5f:
            return r2
    }

    private static com.kwad.library.b.a bM(java.lang.String r1) {
            r0 = 0
            com.kwad.library.b.a r1 = com.kwad.library.solder.a.a.k(r0, r1)
            return r1
    }

    private static java.util.List<java.lang.String> getAutoUnWrapStackList() {
            java.util.List<java.lang.String> r0 = com.kwad.library.b.c.a.sAutoUnWrapStackList
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Ld
            java.lang.String r1 = "com.sensorsdata.analytics.android.sdk"
            r0.add(r1)
        Ld:
            return r0
    }

    static int getThemeResId(android.content.Context r3) {
            boolean r0 = r3 instanceof android.view.ContextThemeWrapper
            r1 = 0
            if (r0 == 0) goto L17
            java.lang.String r0 = "android.view.ContextThemeWrapper"
            java.lang.String r2 = "getThemeResId"
            java.lang.Object r3 = com.kwad.sdk.utils.z.a(r3, r0, r2)
            if (r3 == 0) goto L16
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            return r3
        L16:
            return r1
        L17:
            boolean r0 = r3 instanceof androidx.appcompat.view.ContextThemeWrapper
            if (r0 == 0) goto L22
            androidx.appcompat.view.ContextThemeWrapper r3 = (androidx.appcompat.view.ContextThemeWrapper) r3
            int r3 = r3.getThemeResId()
            return r3
        L22:
            return r1
    }

    @androidx.annotation.NonNull
    public static android.content.Context j(android.content.Context r2, java.lang.String r3) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            com.kwad.library.b.a r0 = bM(r3)
            if (r0 == 0) goto L50
            boolean r0 = r0.isLoaded()
            if (r0 != 0) goto L11
            goto L50
        L11:
            boolean r0 = r2 instanceof com.kwad.library.b.c.b
            if (r0 != 0) goto L50
            boolean r0 = b(r3, r2)
            if (r0 == 0) goto L1c
            goto L50
        L1c:
            android.content.Context r0 = a(r3, r2)
            if (r0 == 0) goto L23
            return r0
        L23:
            boolean r0 = r2 instanceof android.view.ContextThemeWrapper
            if (r0 == 0) goto L30
            com.kwad.library.b.c.c r0 = new com.kwad.library.b.c.c
            r1 = r2
            android.view.ContextThemeWrapper r1 = (android.view.ContextThemeWrapper) r1
            r0.<init>(r1, r3)
            goto L4c
        L30:
            boolean r0 = r2 instanceof androidx.appcompat.view.ContextThemeWrapper
            if (r0 == 0) goto L3d
            com.kwad.library.b.c.d r0 = new com.kwad.library.b.c.d
            r1 = r2
            androidx.appcompat.view.ContextThemeWrapper r1 = (androidx.appcompat.view.ContextThemeWrapper) r1
            r0.<init>(r1, r3)
            goto L4c
        L3d:
            boolean r0 = r2 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L47
            com.kwad.library.b.c.e r0 = new com.kwad.library.b.c.e
            r0.<init>(r2, r3)
            goto L4c
        L47:
            com.kwad.library.b.c.e r0 = new com.kwad.library.b.c.e
            r0.<init>(r2, r3)
        L4c:
            a(r3, r2, r0)
            return r0
        L50:
            return r2
    }

    public static android.content.Context unwrapContextIfNeed(android.content.Context r2) {
            boolean r0 = aN(r2)
            if (r0 == 0) goto La
            android.content.Context r2 = aM(r2)
        La:
            boolean r0 = aN(r2)
            if (r0 != 0) goto L11
            return r2
        L11:
            r0 = 0
        L12:
            r1 = 10
            if (r0 >= r1) goto L24
            android.content.Context r2 = aM(r2)
            boolean r1 = aN(r2)
            if (r1 != 0) goto L21
            return r2
        L21:
            int r0 = r0 + 1
            goto L12
        L24:
            return r2
    }

    static java.lang.Object wrapSystemService(java.lang.Object r1, java.lang.String r2, android.content.Context r3) {
            java.lang.String r0 = "layout_inflater"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L1b
            boolean r2 = r1 instanceof android.view.LayoutInflater
            if (r2 == 0) goto L1b
            android.view.LayoutInflater r1 = (android.view.LayoutInflater) r1
            android.content.Context r2 = r1.getContext()
            boolean r2 = r2 instanceof com.kwad.library.b.c.b
            if (r2 == 0) goto L17
            return r1
        L17:
            android.view.LayoutInflater r1 = r1.cloneInContext(r3)
        L1b:
            return r1
    }
}
