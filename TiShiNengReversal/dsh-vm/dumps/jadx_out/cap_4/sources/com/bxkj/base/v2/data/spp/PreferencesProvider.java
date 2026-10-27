package com.bxkj.base.v2.data.spp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class PreferencesProvider extends android.content.ContentProvider {
    public static java.lang.String i = "SPCOLUMNNAME";
    public static java.lang.String j = "authorities_key";
    public static java.lang.String k = "authorities_spname";

    /* renamed from: l, reason: collision with root package name */
    public static final int f614l = 100;

    /* renamed from: m, reason: collision with root package name */
    public static final int f615m = 101;

    /* renamed from: n, reason: collision with root package name */
    public static final int f616n = 102;

    /* renamed from: o, reason: collision with root package name */
    public static final int f617o = 104;

    /* renamed from: p, reason: collision with root package name */
    public static final int f618p = 105;

    /* renamed from: q, reason: collision with root package name */
    public static final int f619q = 106;

    /* renamed from: r, reason: collision with root package name */
    public static final int f620r = 107;
    private android.content.UriMatcher a;
    private java.lang.String b;
    private java.lang.String c;
    private java.lang.String d;
    private java.lang.String e;
    private java.lang.String f;
    private java.lang.String g;
    private java.lang.String h;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class a {
        private java.lang.String a;
        private java.lang.String b;
        private java.lang.Object c;
        final /* synthetic */ com.bxkj.base.v2.data.spp.PreferencesProvider d;

        private a(com.bxkj.base.v2.data.spp.PreferencesProvider r1) {
                r0 = this;
                r0.d = r1
                r0.<init>()
                return
        }

        /* synthetic */ a(com.bxkj.base.v2.data.spp.PreferencesProvider r1, com.bxkj.base.v2.data.spp.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public java.lang.Object a() {
                r1 = this;
                java.lang.Object r0 = r1.c
                return r0
        }

        public java.lang.String b() {
                r1 = this;
                java.lang.String r0 = r1.b
                return r0
        }

        public java.lang.String c() {
                r1 = this;
                java.lang.String r0 = r1.a
                return r0
        }

        public void d(java.lang.Object r1) {
                r0 = this;
                r0.c = r1
                return
        }

        public void e(java.lang.String r1) {
                r0 = this;
                r0.b = r1
                return
        }

        public void f(java.lang.String r1) {
                r0 = this;
                r0.a = r1
                return
        }
    }

    static {
            return
    }

    public PreferencesProvider() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "string/*/*/"
            r1.b = r0
            java.lang.String r0 = "integer/*/*/"
            r1.c = r0
            java.lang.String r0 = "long/*/*/"
            r1.d = r0
            java.lang.String r0 = "float/*/*/"
            r1.e = r0
            java.lang.String r0 = "boolean/*/*/"
            r1.f = r0
            java.lang.String r0 = "delete/*/*/"
            r1.g = r0
            java.lang.String r0 = "puts"
            r1.h = r0
            return
    }

    private android.database.Cursor a(android.content.Context r6, com.bxkj.base.v2.data.spp.PreferencesProvider.a r7, int r8) {
            r5 = this;
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r7.a()
            java.lang.String r2 = ""
            r3 = 0
            switch(r8) {
                case 100: goto L13b;
                case 101: goto Led;
                case 102: goto L9e;
                case 103: goto Lf;
                case 104: goto L65;
                case 105: goto L12;
                default: goto Lf;
            }
        Lf:
            r6 = r3
            goto L15a
        L12:
            if (r1 != 0) goto L31
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = r7.c()
            java.lang.String r7 = r7.b()
            boolean r6 = com.bxkj.base.v2.data.spp.c.a(r6, r0, r7)
            r8.append(r6)
            r8.append(r2)
            java.lang.String r6 = r8.toString()
            goto L15a
        L31:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = r7.c()
            java.lang.String r7 = r7.b()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r1 = r1.booleanValue()
            boolean r6 = com.bxkj.base.v2.data.spp.c.b(r6, r0, r7, r1)
            r8.append(r6)
            r8.append(r2)
            java.lang.String r6 = r8.toString()
            goto L15a
        L65:
            if (r1 != 0) goto L79
            java.lang.String r8 = r7.c()
            java.lang.String r7 = r7.b()
            float r6 = com.bxkj.base.v2.data.spp.c.d(r6, r8, r7)
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            goto L15a
        L79:
            java.lang.String r8 = r7.c()
            java.lang.String r7 = r7.b()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            float r0 = java.lang.Float.parseFloat(r0)
            float r6 = com.bxkj.base.v2.data.spp.c.e(r6, r8, r7, r0)
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            goto L15a
        L9e:
            if (r1 != 0) goto Lb2
            java.lang.String r8 = r7.c()
            java.lang.String r7 = r7.b()
            long r6 = com.bxkj.base.v2.data.spp.c.h(r6, r8, r7)
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            goto L15a
        Lb2:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r1)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            boolean r8 = android.text.TextUtils.isDigitsOnly(r8)
            if (r8 != 0) goto Lc8
            goto Lc9
        Lc8:
            r0 = r1
        Lc9:
            java.lang.String r8 = r7.c()
            java.lang.String r7 = r7.b()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            long r0 = java.lang.Long.parseLong(r0)
            long r6 = com.bxkj.base.v2.data.spp.c.i(r6, r8, r7, r0)
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            goto L15a
        Led:
            if (r1 != 0) goto L100
            java.lang.String r8 = r7.c()
            java.lang.String r7 = r7.b()
            int r6 = com.bxkj.base.v2.data.spp.c.f(r6, r8, r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L15a
        L100:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r1)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            boolean r8 = android.text.TextUtils.isDigitsOnly(r8)
            if (r8 != 0) goto L116
            goto L117
        L116:
            r0 = r1
        L117:
            java.lang.String r8 = r7.c()
            java.lang.String r7 = r7.b()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            int r0 = java.lang.Integer.parseInt(r0)
            int r6 = com.bxkj.base.v2.data.spp.c.g(r6, r8, r7, r0)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L15a
        L13b:
            if (r1 != 0) goto L14a
            java.lang.String r8 = r7.c()
            java.lang.String r7 = r7.b()
            java.lang.String r6 = com.bxkj.base.v2.data.spp.c.j(r6, r8, r7)
            goto L15a
        L14a:
            java.lang.String r8 = r7.c()
            java.lang.String r7 = r7.b()
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.String r6 = com.bxkj.base.v2.data.spp.c.k(r6, r8, r7, r0)
        L15a:
            if (r6 != 0) goto L15d
            return r3
        L15d:
            java.lang.String r7 = com.bxkj.base.v2.data.spp.PreferencesProvider.i
            java.lang.String[] r7 = new java.lang.String[]{r7}
            android.database.MatrixCursor r8 = new android.database.MatrixCursor
            r8.<init>(r7)
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r0 = 0
            r7[r0] = r6
            r8.addRow(r7)
            return r8
    }

    private com.bxkj.base.v2.data.spp.PreferencesProvider.a c(android.net.Uri r5) {
            r4 = this;
            r0 = 0
            com.bxkj.base.v2.data.spp.PreferencesProvider$a r1 = new com.bxkj.base.v2.data.spp.PreferencesProvider$a     // Catch: java.lang.Exception -> L43
            r1.<init>(r4, r0)     // Catch: java.lang.Exception -> L43
            java.util.List r2 = r5.getPathSegments()     // Catch: java.lang.Exception -> L43
            r3 = 1
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Exception -> L43
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L43
            r1.f(r2)     // Catch: java.lang.Exception -> L43
            java.util.List r2 = r5.getPathSegments()     // Catch: java.lang.Exception -> L43
            int r2 = r2.size()     // Catch: java.lang.Exception -> L43
            r3 = 2
            if (r2 <= r3) goto L2c
            java.util.List r2 = r5.getPathSegments()     // Catch: java.lang.Exception -> L43
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Exception -> L43
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L43
            r1.e(r2)     // Catch: java.lang.Exception -> L43
        L2c:
            java.util.List r2 = r5.getPathSegments()     // Catch: java.lang.Exception -> L43
            int r2 = r2.size()     // Catch: java.lang.Exception -> L43
            r3 = 3
            if (r2 <= r3) goto L42
            java.util.List r5 = r5.getPathSegments()     // Catch: java.lang.Exception -> L43
            java.lang.Object r5 = r5.get(r3)     // Catch: java.lang.Exception -> L43
            r1.d(r5)     // Catch: java.lang.Exception -> L43
        L42:
            return r1
        L43:
            return r0
    }

    private void delete(android.content.Context r2, com.bxkj.base.v2.data.spp.PreferencesProvider.a r3) {
            r1 = this;
            java.lang.String r0 = r3.c()
            android.content.SharedPreferences$Editor r2 = com.bxkj.base.v2.data.spp.c.c(r2, r0)
            java.lang.String r3 = r3.b()
            r2.remove(r3)
            r2.apply()
            return
    }

    private void insert(android.content.Context r5, android.content.ContentValues r6, com.bxkj.base.v2.data.spp.PreferencesProvider.a r7) {
            r4 = this;
            java.lang.String r7 = r7.c()
            android.content.SharedPreferences$Editor r5 = com.bxkj.base.v2.data.spp.c.c(r5, r7)
            java.util.Set r7 = r6.keySet()
            java.util.Iterator r7 = r7.iterator()
        L10:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Laa
            java.lang.Object r0 = r7.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r6.get(r0)
            boolean r2 = r1 instanceof java.lang.Integer
            java.lang.String r3 = ""
            if (r2 == 0) goto L3d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = r2.toString()
            int r1 = java.lang.Integer.parseInt(r1)
            r5.putInt(r0, r1)
            goto L10
        L3d:
            boolean r2 = r1 instanceof java.lang.Long
            if (r2 == 0) goto L58
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = r2.toString()
            long r1 = java.lang.Long.parseLong(r1)
            r5.putLong(r0, r1)
            goto L10
        L58:
            boolean r2 = r1 instanceof java.lang.Float
            if (r2 == 0) goto L73
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = r2.toString()
            float r1 = java.lang.Float.parseFloat(r1)
            r5.putFloat(r0, r1)
            goto L10
        L73:
            boolean r2 = r1 instanceof java.lang.Boolean
            if (r2 == 0) goto L93
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = r2.toString()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r1 = r1.booleanValue()
            r5.putBoolean(r0, r1)
            goto L10
        L93:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            if (r1 != 0) goto L9b
            r1 = r3
        L9b:
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = r2.toString()
            r5.putString(r0, r1)
            goto L10
        Laa:
            r5.apply()
            return
    }

    public abstract java.lang.String b();

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri r1, java.lang.String r2, java.lang.String[] r3) {
            r0 = this;
            com.bxkj.base.v2.data.spp.PreferencesProvider$a r2 = r0.c(r1)
            if (r2 != 0) goto L8
            r1 = -1
            return r1
        L8:
            android.content.UriMatcher r3 = r0.a
            int r1 = r3.match(r1)
            r3 = 100
            if (r1 == r3) goto L22
            r3 = 101(0x65, float:1.42E-43)
            if (r1 == r3) goto L22
            r3 = 102(0x66, float:1.43E-43)
            if (r1 == r3) goto L22
            r3 = 104(0x68, float:1.46E-43)
            if (r1 == r3) goto L22
            r3 = 105(0x69, float:1.47E-43)
            if (r1 != r3) goto L29
        L22:
            android.content.Context r1 = r0.getContext()
            r0.delete(r1, r2)
        L29:
            r1 = 0
            return r1
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri r4, android.content.ContentValues r5) {
            r3 = this;
            com.bxkj.base.v2.data.spp.PreferencesProvider$a r0 = r3.c(r4)
            if (r0 != 0) goto L8
            r4 = 0
            return r4
        L8:
            android.content.UriMatcher r1 = r3.a
            int r1 = r1.match(r4)
            r2 = 100
            if (r1 == r2) goto L28
            r2 = 101(0x65, float:1.42E-43)
            if (r1 == r2) goto L28
            r2 = 102(0x66, float:1.43E-43)
            if (r1 == r2) goto L28
            r2 = 104(0x68, float:1.46E-43)
            if (r1 == r2) goto L28
            r2 = 105(0x69, float:1.47E-43)
            if (r1 == r2) goto L28
            r2 = 107(0x6b, float:1.5E-43)
            if (r1 != r2) goto L27
            goto L28
        L27:
            return r4
        L28:
            android.content.Context r1 = r3.getContext()
            r3.insert(r1, r5, r0)
            return r4
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
            r6 = this;
            java.lang.String r0 = r6.b()
            android.content.Context r1 = r6.getContext()
            java.lang.String r2 = com.bxkj.base.v2.data.spp.PreferencesProvider.k
            java.lang.String r3 = com.bxkj.base.v2.data.spp.PreferencesProvider.j
            com.bxkj.base.v2.data.spp.c.p(r1, r2, r3, r0)
            android.content.UriMatcher r1 = new android.content.UriMatcher
            r2 = -1
            r1.<init>(r2)
            r6.a = r1
            java.lang.String r2 = r6.b
            r3 = 100
            r1.addURI(r0, r2, r3)
            android.content.UriMatcher r1 = r6.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = r6.b
            r2.append(r4)
            java.lang.String r4 = "*/"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.addURI(r0, r2, r3)
            android.content.UriMatcher r1 = r6.a
            java.lang.String r2 = r6.c
            r3 = 101(0x65, float:1.42E-43)
            r1.addURI(r0, r2, r3)
            android.content.UriMatcher r1 = r6.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = r6.c
            r2.append(r5)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.addURI(r0, r2, r3)
            android.content.UriMatcher r1 = r6.a
            java.lang.String r2 = r6.d
            r3 = 102(0x66, float:1.43E-43)
            r1.addURI(r0, r2, r3)
            android.content.UriMatcher r1 = r6.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = r6.d
            r2.append(r5)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.addURI(r0, r2, r3)
            android.content.UriMatcher r1 = r6.a
            java.lang.String r2 = r6.e
            r3 = 104(0x68, float:1.46E-43)
            r1.addURI(r0, r2, r3)
            android.content.UriMatcher r1 = r6.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = r6.e
            r2.append(r5)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.addURI(r0, r2, r3)
            android.content.UriMatcher r1 = r6.a
            java.lang.String r2 = r6.f
            r3 = 105(0x69, float:1.47E-43)
            r1.addURI(r0, r2, r3)
            android.content.UriMatcher r1 = r6.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = r6.f
            r2.append(r5)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.addURI(r0, r2, r3)
            android.content.UriMatcher r1 = r6.a
            java.lang.String r2 = r6.g
            r3 = 106(0x6a, float:1.49E-43)
            r1.addURI(r0, r2, r3)
            android.content.UriMatcher r1 = r6.a
            java.lang.String r2 = r6.h
            r3 = 107(0x6b, float:1.5E-43)
            r1.addURI(r0, r2, r3)
            r0 = 0
            return r0
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri r1, java.lang.String[] r2, java.lang.String r3, java.lang.String[] r4, java.lang.String r5) {
            r0 = this;
            com.bxkj.base.v2.data.spp.PreferencesProvider$a r2 = r0.c(r1)
            if (r2 != 0) goto L8
            r1 = 0
            return r1
        L8:
            android.content.UriMatcher r3 = r0.a
            int r1 = r3.match(r1)
            android.content.Context r3 = r0.getContext()
            android.database.Cursor r1 = r0.a(r3, r2, r1)
            return r1
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri r1, android.content.ContentValues r2, java.lang.String r3, java.lang.String[] r4) {
            r0 = this;
            com.bxkj.base.v2.data.spp.PreferencesProvider$a r3 = r0.c(r1)
            if (r3 != 0) goto L8
            r1 = -1
            return r1
        L8:
            android.content.UriMatcher r4 = r0.a
            int r1 = r4.match(r1)
            r4 = 100
            if (r1 == r4) goto L22
            r4 = 101(0x65, float:1.42E-43)
            if (r1 == r4) goto L22
            r4 = 102(0x66, float:1.43E-43)
            if (r1 == r4) goto L22
            r4 = 104(0x68, float:1.46E-43)
            if (r1 == r4) goto L22
            r4 = 105(0x69, float:1.47E-43)
            if (r1 != r4) goto L29
        L22:
            android.content.Context r1 = r0.getContext()
            r0.insert(r1, r2, r3)
        L29:
            r1 = 0
            return r1
    }
}
