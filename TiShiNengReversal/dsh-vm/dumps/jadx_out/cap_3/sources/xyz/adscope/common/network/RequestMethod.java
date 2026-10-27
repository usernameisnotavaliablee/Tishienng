package xyz.adscope.common.network;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public enum RequestMethod extends java.lang.Enum<xyz.adscope.common.network.RequestMethod> {
    public static final xyz.adscope.common.network.RequestMethod DELETE = null;
    public static final xyz.adscope.common.network.RequestMethod GET = null;
    public static final xyz.adscope.common.network.RequestMethod HEAD = null;
    public static final xyz.adscope.common.network.RequestMethod OPTIONS = null;
    public static final xyz.adscope.common.network.RequestMethod PATCH = null;
    public static final xyz.adscope.common.network.RequestMethod POST = null;
    public static final xyz.adscope.common.network.RequestMethod PUT = null;
    public static final xyz.adscope.common.network.RequestMethod TRACE = null;
    private static final /* synthetic */ xyz.adscope.common.network.RequestMethod[] b = null;
    private final java.lang.String a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: xyz.adscope.common.network.RequestMethod$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = null;

        static {
                xyz.adscope.common.network.RequestMethod[] r0 = xyz.adscope.common.network.RequestMethod.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                xyz.adscope.common.network.RequestMethod.AnonymousClass1.a = r0
                xyz.adscope.common.network.RequestMethod r1 = xyz.adscope.common.network.RequestMethod.POST     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = xyz.adscope.common.network.RequestMethod.AnonymousClass1.a     // Catch: java.lang.NoSuchFieldError -> L1d
                xyz.adscope.common.network.RequestMethod r1 = xyz.adscope.common.network.RequestMethod.PUT     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = xyz.adscope.common.network.RequestMethod.AnonymousClass1.a     // Catch: java.lang.NoSuchFieldError -> L28
                xyz.adscope.common.network.RequestMethod r1 = xyz.adscope.common.network.RequestMethod.PATCH     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = xyz.adscope.common.network.RequestMethod.AnonymousClass1.a     // Catch: java.lang.NoSuchFieldError -> L33
                xyz.adscope.common.network.RequestMethod r1 = xyz.adscope.common.network.RequestMethod.DELETE     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    static {
            xyz.adscope.common.network.RequestMethod r0 = new xyz.adscope.common.network.RequestMethod
            java.lang.String r1 = "GET"
            r2 = 0
            r0.<init>(r1, r2, r1)
            xyz.adscope.common.network.RequestMethod.GET = r0
            xyz.adscope.common.network.RequestMethod r0 = new xyz.adscope.common.network.RequestMethod
            java.lang.String r1 = "POST"
            r2 = 1
            r0.<init>(r1, r2, r1)
            xyz.adscope.common.network.RequestMethod.POST = r0
            xyz.adscope.common.network.RequestMethod r0 = new xyz.adscope.common.network.RequestMethod
            java.lang.String r1 = "PUT"
            r2 = 2
            r0.<init>(r1, r2, r1)
            xyz.adscope.common.network.RequestMethod.PUT = r0
            xyz.adscope.common.network.RequestMethod r0 = new xyz.adscope.common.network.RequestMethod
            java.lang.String r1 = "DELETE"
            r2 = 3
            r0.<init>(r1, r2, r1)
            xyz.adscope.common.network.RequestMethod.DELETE = r0
            xyz.adscope.common.network.RequestMethod r0 = new xyz.adscope.common.network.RequestMethod
            java.lang.String r1 = "HEAD"
            r2 = 4
            r0.<init>(r1, r2, r1)
            xyz.adscope.common.network.RequestMethod.HEAD = r0
            xyz.adscope.common.network.RequestMethod r0 = new xyz.adscope.common.network.RequestMethod
            java.lang.String r1 = "PATCH"
            r2 = 5
            r0.<init>(r1, r2, r1)
            xyz.adscope.common.network.RequestMethod.PATCH = r0
            xyz.adscope.common.network.RequestMethod r0 = new xyz.adscope.common.network.RequestMethod
            java.lang.String r1 = "OPTIONS"
            r2 = 6
            r0.<init>(r1, r2, r1)
            xyz.adscope.common.network.RequestMethod.OPTIONS = r0
            xyz.adscope.common.network.RequestMethod r0 = new xyz.adscope.common.network.RequestMethod
            java.lang.String r1 = "TRACE"
            r2 = 7
            r0.<init>(r1, r2, r1)
            xyz.adscope.common.network.RequestMethod.TRACE = r0
            xyz.adscope.common.network.RequestMethod[] r0 = a()
            xyz.adscope.common.network.RequestMethod.b = r0
            return
    }

    RequestMethod(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.a = r3
            return
    }

    private static /* synthetic */ xyz.adscope.common.network.RequestMethod[] a() {
            r0 = 8
            xyz.adscope.common.network.RequestMethod[] r0 = new xyz.adscope.common.network.RequestMethod[r0]
            xyz.adscope.common.network.RequestMethod r1 = xyz.adscope.common.network.RequestMethod.GET
            r2 = 0
            r0[r2] = r1
            xyz.adscope.common.network.RequestMethod r1 = xyz.adscope.common.network.RequestMethod.POST
            r2 = 1
            r0[r2] = r1
            xyz.adscope.common.network.RequestMethod r1 = xyz.adscope.common.network.RequestMethod.PUT
            r2 = 2
            r0[r2] = r1
            xyz.adscope.common.network.RequestMethod r1 = xyz.adscope.common.network.RequestMethod.DELETE
            r2 = 3
            r0[r2] = r1
            xyz.adscope.common.network.RequestMethod r1 = xyz.adscope.common.network.RequestMethod.HEAD
            r2 = 4
            r0[r2] = r1
            xyz.adscope.common.network.RequestMethod r1 = xyz.adscope.common.network.RequestMethod.PATCH
            r2 = 5
            r0[r2] = r1
            xyz.adscope.common.network.RequestMethod r1 = xyz.adscope.common.network.RequestMethod.OPTIONS
            r2 = 6
            r0[r2] = r1
            xyz.adscope.common.network.RequestMethod r1 = xyz.adscope.common.network.RequestMethod.TRACE
            r2 = 7
            r0[r2] = r1
            return r0
    }

    public static xyz.adscope.common.network.RequestMethod reverse(java.lang.String r2) {
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r2 = r2.toUpperCase(r0)
            r2.getClass()
            int r0 = r2.hashCode()
            r1 = -1
            switch(r0) {
                case -531492226: goto L60;
                case 70454: goto L55;
                case 79599: goto L4a;
                case 2213344: goto L3f;
                case 2461856: goto L34;
                case 75900968: goto L29;
                case 80083237: goto L1e;
                case 2012838315: goto L13;
                default: goto L11;
            }
        L11:
            goto L6a
        L13:
            java.lang.String r0 = "DELETE"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1c
            goto L6a
        L1c:
            r1 = 7
            goto L6a
        L1e:
            java.lang.String r0 = "TRACE"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L27
            goto L6a
        L27:
            r1 = 6
            goto L6a
        L29:
            java.lang.String r0 = "PATCH"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L32
            goto L6a
        L32:
            r1 = 5
            goto L6a
        L34:
            java.lang.String r0 = "POST"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L3d
            goto L6a
        L3d:
            r1 = 4
            goto L6a
        L3f:
            java.lang.String r0 = "HEAD"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L48
            goto L6a
        L48:
            r1 = 3
            goto L6a
        L4a:
            java.lang.String r0 = "PUT"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L53
            goto L6a
        L53:
            r1 = 2
            goto L6a
        L55:
            java.lang.String r0 = "GET"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L5e
            goto L6a
        L5e:
            r1 = 1
            goto L6a
        L60:
            java.lang.String r0 = "OPTIONS"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L69
            goto L6a
        L69:
            r1 = 0
        L6a:
            switch(r1) {
                case 0: goto L85;
                case 1: goto L82;
                case 2: goto L7f;
                case 3: goto L7c;
                case 4: goto L79;
                case 5: goto L76;
                case 6: goto L73;
                case 7: goto L70;
                default: goto L6d;
            }
        L6d:
            xyz.adscope.common.network.RequestMethod r2 = xyz.adscope.common.network.RequestMethod.GET
            return r2
        L70:
            xyz.adscope.common.network.RequestMethod r2 = xyz.adscope.common.network.RequestMethod.DELETE
            return r2
        L73:
            xyz.adscope.common.network.RequestMethod r2 = xyz.adscope.common.network.RequestMethod.TRACE
            return r2
        L76:
            xyz.adscope.common.network.RequestMethod r2 = xyz.adscope.common.network.RequestMethod.PATCH
            return r2
        L79:
            xyz.adscope.common.network.RequestMethod r2 = xyz.adscope.common.network.RequestMethod.POST
            return r2
        L7c:
            xyz.adscope.common.network.RequestMethod r2 = xyz.adscope.common.network.RequestMethod.HEAD
            return r2
        L7f:
            xyz.adscope.common.network.RequestMethod r2 = xyz.adscope.common.network.RequestMethod.PUT
            return r2
        L82:
            xyz.adscope.common.network.RequestMethod r2 = xyz.adscope.common.network.RequestMethod.GET
            return r2
        L85:
            xyz.adscope.common.network.RequestMethod r2 = xyz.adscope.common.network.RequestMethod.OPTIONS
            return r2
    }

    public static xyz.adscope.common.network.RequestMethod valueOf(java.lang.String r1) {
            java.lang.Class<xyz.adscope.common.network.RequestMethod> r0 = xyz.adscope.common.network.RequestMethod.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            xyz.adscope.common.network.RequestMethod r1 = (xyz.adscope.common.network.RequestMethod) r1
            return r1
    }

    public static xyz.adscope.common.network.RequestMethod[] values() {
            xyz.adscope.common.network.RequestMethod[] r0 = xyz.adscope.common.network.RequestMethod.b
            java.lang.Object r0 = r0.clone()
            xyz.adscope.common.network.RequestMethod[] r0 = (xyz.adscope.common.network.RequestMethod[]) r0
            return r0
    }

    public boolean allowBody() {
            r3 = this;
            int[] r0 = xyz.adscope.common.network.RequestMethod.AnonymousClass1.a
            int r1 = r3.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L16
            r2 = 2
            if (r0 == r2) goto L16
            r2 = 3
            if (r0 == r2) goto L16
            r2 = 4
            if (r0 == r2) goto L16
            r0 = 0
            return r0
        L16:
            return r1
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }
}
