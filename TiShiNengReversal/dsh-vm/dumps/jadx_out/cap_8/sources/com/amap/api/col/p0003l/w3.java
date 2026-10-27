package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class w3 extends android.view.ContextThemeWrapper {

    /* renamed from: f, reason: collision with root package name */
    private static final java.lang.String[] f4084f = null;
    private android.content.res.Resources a;

    /* renamed from: b, reason: collision with root package name */
    private android.view.LayoutInflater f4085b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.ClassLoader f4086c;

    /* renamed from: d, reason: collision with root package name */
    private com.amap.api.col.3l.w3.b f4087d;

    /* renamed from: e, reason: collision with root package name */
    private android.view.LayoutInflater.Factory f4088e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a implements android.view.LayoutInflater.Factory {
        final /* synthetic */ com.amap.api.col.p0003l.w3 a;

        a(com.amap.api.col.p0003l.w3 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.LayoutInflater.Factory
        public final android.view.View onCreateView(java.lang.String r2, android.content.Context r3, android.util.AttributeSet r4) {
                r1 = this;
                com.amap.api.col.3l.w3 r0 = r1.a
                android.view.View r2 = com.amap.api.col.p0003l.w3.a(r0, r2, r3, r4)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class b {
        public java.util.HashSet<java.lang.String> a;

        /* renamed from: b, reason: collision with root package name */
        public java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<?>> f4089b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.amap.api.col.p0003l.w3 f4090c;

        public b(com.amap.api.col.p0003l.w3 r1) {
                r0 = this;
                r0.f4090c = r1
                r0.<init>()
                java.util.HashSet r1 = new java.util.HashSet
                r1.<init>()
                r0.a = r1
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                r0.f4089b = r1
                return
        }
    }

    static {
            java.lang.String r0 = "android.webkit"
            java.lang.String r1 = "android.app"
            java.lang.String r2 = "android.widget"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            com.amap.api.col.p0003l.w3.f4084f = r0
            return
    }

    public w3(android.content.Context r1, int r2, java.lang.ClassLoader r3) {
            r0 = this;
            r0.<init>(r1, r2)
            com.amap.api.col.3l.w3$b r1 = new com.amap.api.col.3l.w3$b
            r1.<init>(r0)
            r0.f4087d = r1
            com.amap.api.col.3l.w3$a r1 = new com.amap.api.col.3l.w3$a
            r1.<init>(r0)
            r0.f4088e = r1
            android.content.res.Resources r1 = com.amap.api.col.p0003l.x3.b()
            r0.a = r1
            r0.f4086c = r3
            return
    }

    static /* synthetic */ android.view.View a(com.amap.api.col.p0003l.w3 r0, java.lang.String r1, android.content.Context r2, android.util.AttributeSet r3) {
            android.view.View r0 = r0.b(r1, r2, r3)
            return r0
    }

    private final android.view.View b(java.lang.String r12, android.content.Context r13, android.util.AttributeSet r14) {
            r11 = this;
            com.amap.api.col.3l.w3$b r0 = r11.f4087d
            java.util.HashSet<java.lang.String> r0 = r0.a
            boolean r0 = r0.contains(r12)
            r1 = 0
            if (r0 == 0) goto Lc
            return r1
        Lc:
            com.amap.api.col.3l.w3$b r0 = r11.f4087d
            java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<?>> r0 = r0.f4089b
            java.lang.Object r0 = r0.get(r12)
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
            r2 = 2
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L8b
            java.lang.String r5 = "api.navi"
            boolean r5 = r12.contains(r5)     // Catch: java.lang.Throwable -> L2a
            if (r5 == 0) goto L2c
            java.lang.ClassLoader r5 = r11.f4086c     // Catch: java.lang.Throwable -> L2a
            java.lang.Class r5 = r5.loadClass(r12)     // Catch: java.lang.Throwable -> L2a
            goto L53
        L2a:
            goto L68
        L2c:
            java.lang.String[] r5 = com.amap.api.col.p0003l.w3.f4084f     // Catch: java.lang.Throwable -> L2a
            int r6 = r5.length     // Catch: java.lang.Throwable -> L2a
            r7 = 0
        L30:
            if (r7 >= r6) goto L52
            r8 = r5[r7]     // Catch: java.lang.Throwable -> L2a
            java.lang.ClassLoader r9 = r11.f4086c     // Catch: java.lang.Throwable -> L4f
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            r10.<init>()     // Catch: java.lang.Throwable -> L4f
            r10.append(r8)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r8 = "."
            r10.append(r8)     // Catch: java.lang.Throwable -> L4f
            r10.append(r12)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r8 = r10.toString()     // Catch: java.lang.Throwable -> L4f
            java.lang.Class r5 = r9.loadClass(r8)     // Catch: java.lang.Throwable -> L4f
            goto L53
        L4f:
            int r7 = r7 + 1
            goto L30
        L52:
            r5 = r1
        L53:
            if (r5 != 0) goto L56
            goto L66
        L56:
            java.lang.Class<android.view.ViewStub> r6 = android.view.ViewStub.class
            if (r5 == r6) goto L66
            java.lang.ClassLoader r6 = r5.getClassLoader()     // Catch: java.lang.Throwable -> L65
            java.lang.ClassLoader r7 = r11.f4086c     // Catch: java.lang.Throwable -> L65
            if (r6 == r7) goto L63
            goto L66
        L63:
            r6 = 1
            goto L6a
        L65:
        L66:
            r6 = 0
            goto L6a
        L68:
            r5 = r1
            goto L66
        L6a:
            if (r6 != 0) goto L74
            com.amap.api.col.3l.w3$b r13 = r11.f4087d
            java.util.HashSet<java.lang.String> r13 = r13.a
            r13.add(r12)
            return r1
        L74:
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L8a
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r4] = r7     // Catch: java.lang.Throwable -> L8a
            java.lang.Class<android.util.AttributeSet> r7 = android.util.AttributeSet.class
            r6[r3] = r7     // Catch: java.lang.Throwable -> L8a
            java.lang.reflect.Constructor r0 = r5.getConstructor(r6)     // Catch: java.lang.Throwable -> L8a
            com.amap.api.col.3l.w3$b r5 = r11.f4087d     // Catch: java.lang.Throwable -> L8a
            java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<?>> r5 = r5.f4089b     // Catch: java.lang.Throwable -> L8a
            r5.put(r12, r0)     // Catch: java.lang.Throwable -> L8a
            goto L8b
        L8a:
        L8b:
            if (r0 == 0) goto L9b
            java.lang.Object[] r12 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L9b
            r12[r4] = r13     // Catch: java.lang.Throwable -> L9b
            r12[r3] = r14     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r12 = r0.newInstance(r12)     // Catch: java.lang.Throwable -> L9b
            android.view.View r12 = (android.view.View) r12     // Catch: java.lang.Throwable -> L9b
            r1 = r12
        L9b:
            return r1
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final android.content.res.Resources getResources() {
            r1 = this;
            android.content.res.Resources r0 = r1.a
            if (r0 == 0) goto L5
            return r0
        L5:
            android.content.res.Resources r0 = super.getResources()
            return r0
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final java.lang.Object getSystemService(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "layout_inflater"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L2c
            android.view.LayoutInflater r0 = r1.f4085b
            if (r0 != 0) goto L29
            java.lang.Object r2 = super.getSystemService(r2)
            android.view.LayoutInflater r2 = (android.view.LayoutInflater) r2
            if (r2 == 0) goto L1a
            android.view.LayoutInflater r2 = r2.cloneInContext(r1)
            r1.f4085b = r2
        L1a:
            android.view.LayoutInflater r2 = r1.f4085b
            android.view.LayoutInflater$Factory r0 = r1.f4088e
            r2.setFactory(r0)
            android.view.LayoutInflater r2 = r1.f4085b
            android.view.LayoutInflater r2 = r2.cloneInContext(r1)
            r1.f4085b = r2
        L29:
            android.view.LayoutInflater r2 = r1.f4085b
            return r2
        L2c:
            java.lang.Object r2 = super.getSystemService(r2)
            return r2
    }
}
