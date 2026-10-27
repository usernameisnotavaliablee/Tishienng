package com.umeng.commonsdk.config;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class FieldManager {
    private static final java.lang.String a = "cfgfd";
    private static com.umeng.commonsdk.config.b b;
    private static boolean c;
    private static java.lang.Object d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.umeng.commonsdk.config.FieldManager$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a {
        private static final com.umeng.commonsdk.config.FieldManager a = null;

        static {
                com.umeng.commonsdk.config.FieldManager r0 = new com.umeng.commonsdk.config.FieldManager
                r1 = 0
                r0.<init>(r1)
                com.umeng.commonsdk.config.FieldManager.a.a = r0
                return
        }

        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ com.umeng.commonsdk.config.FieldManager a() {
                com.umeng.commonsdk.config.FieldManager r0 = com.umeng.commonsdk.config.FieldManager.a.a
                return r0
        }
    }

    static {
            com.umeng.commonsdk.config.b r0 = com.umeng.commonsdk.config.b.b()
            com.umeng.commonsdk.config.FieldManager.b = r0
            r0 = 0
            com.umeng.commonsdk.config.FieldManager.c = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.umeng.commonsdk.config.FieldManager.d = r0
            return
    }

    private FieldManager() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ FieldManager(com.umeng.commonsdk.config.FieldManager.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    private static android.util.Pair<java.lang.Long, java.lang.String> a(java.lang.String r4) {
            android.util.Pair r0 = new android.util.Pair
            r1 = -1
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 0
            r0.<init>(r1, r2)
            if (r4 == 0) goto L34
            int r1 = r4.length()
            r2 = 2
            if (r1 >= r2) goto L16
            goto L34
        L16:
            java.lang.String r1 = "@"
            java.lang.String[] r4 = r4.split(r1)
            int r1 = r4.length
            if (r1 >= r2) goto L20
            goto L34
        L20:
            r1 = 0
            r1 = r4[r1]     // Catch: java.lang.Throwable -> L34
            long r1 = java.lang.Long.parseLong(r1)     // Catch: java.lang.Throwable -> L34
            r3 = 1
            r4 = r4[r3]     // Catch: java.lang.Throwable -> L34
            android.util.Pair r3 = new android.util.Pair     // Catch: java.lang.Throwable -> L34
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L34
            r3.<init>(r1, r4)     // Catch: java.lang.Throwable -> L34
            return r3
        L34:
            return r0
    }

    public static com.umeng.commonsdk.config.FieldManager a() {
            com.umeng.commonsdk.config.FieldManager r0 = com.umeng.commonsdk.config.FieldManager.a.a()
            return r0
    }

    public static boolean allow(java.lang.String r2) {
            java.lang.Object r0 = com.umeng.commonsdk.config.FieldManager.d
            monitor-enter(r0)
            boolean r1 = com.umeng.commonsdk.config.FieldManager.c     // Catch: java.lang.Throwable -> La
            if (r1 != 0) goto Lc
            r2 = 0
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r2
        La:
            r2 = move-exception
            goto L12
        Lc:
            boolean r2 = com.umeng.commonsdk.config.b.a(r2)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r2
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r2
    }

    public static boolean b() {
            java.lang.Object r0 = com.umeng.commonsdk.config.FieldManager.d
            monitor-enter(r0)
            boolean r1 = com.umeng.commonsdk.config.FieldManager.c     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public void a(android.content.Context r11) {
            r10 = this;
            java.lang.String r0 = "1001@3749699455,2130669566,262139,1983"
            java.lang.Class<com.umeng.commonsdk.config.d$a> r1 = com.umeng.commonsdk.config.d.a.class
            java.lang.String r1 = r1.getName()
            java.lang.Class<com.umeng.commonsdk.config.d$b> r2 = com.umeng.commonsdk.config.d.b.class
            java.lang.String r2 = r2.getName()
            java.lang.Class<com.umeng.commonsdk.config.d$c> r3 = com.umeng.commonsdk.config.d.c.class
            java.lang.String r3 = r3.getName()
            java.lang.Class<com.umeng.commonsdk.config.d$d> r4 = com.umeng.commonsdk.config.d.EnumC0047d.class
            java.lang.String r4 = r4.getName()
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4}
            java.lang.String r2 = "cfgfd"
            java.lang.String r11 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r11, r2, r0)
            java.lang.Object r2 = com.umeng.commonsdk.config.FieldManager.d
            monitor-enter(r2)
            android.util.Pair r11 = a(r11)     // Catch: java.lang.Throwable -> L47
            java.lang.Object r3 = r11.first     // Catch: java.lang.Throwable -> L47
            java.lang.Long r3 = (java.lang.Long) r3     // Catch: java.lang.Throwable -> L47
            long r3 = r3.longValue()     // Catch: java.lang.Throwable -> L47
            r5 = 1000(0x3e8, double:4.94E-321)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L49
            java.lang.Object r11 = r11.second     // Catch: java.lang.Throwable -> L47
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L47
            if (r11 == 0) goto L49
            int r3 = r11.length()     // Catch: java.lang.Throwable -> L47
            if (r3 <= 0) goto L49
            r0 = r11
            goto L49
        L47:
            r11 = move-exception
            goto L7d
        L49:
            java.lang.String r11 = ","
            java.lang.String[] r11 = r0.split(r11)     // Catch: java.lang.Throwable -> L47
            int r0 = r11.length     // Catch: java.lang.Throwable -> L47
            if (r0 <= 0) goto L78
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L47
            r3.<init>()     // Catch: java.lang.Throwable -> L47
            com.umeng.commonsdk.config.g r4 = new com.umeng.commonsdk.config.g     // Catch: java.lang.Throwable -> L47
            r4.<init>()     // Catch: java.lang.Throwable -> L47
            r5 = 0
        L5d:
            if (r5 >= r0) goto L78
            r3.add(r4)     // Catch: java.lang.Throwable -> L47
            java.lang.Object r6 = r3.get(r5)     // Catch: java.lang.Throwable -> L47
            com.umeng.commonsdk.config.e r6 = (com.umeng.commonsdk.config.e) r6     // Catch: java.lang.Throwable -> L47
            r7 = r11[r5]     // Catch: java.lang.Throwable -> L47
            com.umeng.commonsdk.config.b r8 = com.umeng.commonsdk.config.FieldManager.b     // Catch: java.lang.Throwable -> L47
            r9 = r1[r5]     // Catch: java.lang.Throwable -> L47
            java.lang.String[] r9 = com.umeng.commonsdk.config.d.b(r9)     // Catch: java.lang.Throwable -> L47
            r6.a(r7, r8, r9)     // Catch: java.lang.Throwable -> L47
            int r5 = r5 + 1
            goto L5d
        L78:
            r11 = 1
            com.umeng.commonsdk.config.FieldManager.c = r11     // Catch: java.lang.Throwable -> L47
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L47
            return
        L7d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L47
            throw r11
    }

    public void a(android.content.Context r10, java.lang.String r11) {
            r9 = this;
            java.lang.String r10 = "1001@3749699455,2130669566,262139,1983"
            java.lang.Class<com.umeng.commonsdk.config.d$a> r0 = com.umeng.commonsdk.config.d.a.class
            java.lang.String r0 = r0.getName()
            java.lang.Class<com.umeng.commonsdk.config.d$b> r1 = com.umeng.commonsdk.config.d.b.class
            java.lang.String r1 = r1.getName()
            java.lang.Class<com.umeng.commonsdk.config.d$c> r2 = com.umeng.commonsdk.config.d.c.class
            java.lang.String r2 = r2.getName()
            java.lang.Class<com.umeng.commonsdk.config.d$d> r3 = com.umeng.commonsdk.config.d.EnumC0047d.class
            java.lang.String r3 = r3.getName()
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3}
            java.lang.Object r1 = com.umeng.commonsdk.config.FieldManager.d
            monitor-enter(r1)
            com.umeng.commonsdk.config.b r2 = com.umeng.commonsdk.config.FieldManager.b     // Catch: java.lang.Throwable -> L48
            r2.a()     // Catch: java.lang.Throwable -> L48
            if (r11 == 0) goto L4a
            android.util.Pair r11 = a(r11)     // Catch: java.lang.Throwable -> L48
            java.lang.Object r2 = r11.first     // Catch: java.lang.Throwable -> L48
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.Throwable -> L48
            long r2 = r2.longValue()     // Catch: java.lang.Throwable -> L48
            r4 = 1000(0x3e8, double:4.94E-321)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L4a
            java.lang.Object r11 = r11.second     // Catch: java.lang.Throwable -> L48
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L48
            if (r11 == 0) goto L4a
            int r2 = r11.length()     // Catch: java.lang.Throwable -> L48
            if (r2 <= 0) goto L4a
            r10 = r11
            goto L4a
        L48:
            r10 = move-exception
            goto L7e
        L4a:
            java.lang.String r11 = ","
            java.lang.String[] r10 = r10.split(r11)     // Catch: java.lang.Throwable -> L48
            int r11 = r10.length     // Catch: java.lang.Throwable -> L48
            if (r11 <= 0) goto L79
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L48
            r2.<init>()     // Catch: java.lang.Throwable -> L48
            com.umeng.commonsdk.config.g r3 = new com.umeng.commonsdk.config.g     // Catch: java.lang.Throwable -> L48
            r3.<init>()     // Catch: java.lang.Throwable -> L48
            r4 = 0
        L5e:
            if (r4 >= r11) goto L79
            r2.add(r3)     // Catch: java.lang.Throwable -> L48
            java.lang.Object r5 = r2.get(r4)     // Catch: java.lang.Throwable -> L48
            com.umeng.commonsdk.config.e r5 = (com.umeng.commonsdk.config.e) r5     // Catch: java.lang.Throwable -> L48
            r6 = r10[r4]     // Catch: java.lang.Throwable -> L48
            com.umeng.commonsdk.config.b r7 = com.umeng.commonsdk.config.FieldManager.b     // Catch: java.lang.Throwable -> L48
            r8 = r0[r4]     // Catch: java.lang.Throwable -> L48
            java.lang.String[] r8 = com.umeng.commonsdk.config.d.b(r8)     // Catch: java.lang.Throwable -> L48
            r5.a(r6, r7, r8)     // Catch: java.lang.Throwable -> L48
            int r4 = r4 + 1
            goto L5e
        L79:
            r10 = 1
            com.umeng.commonsdk.config.FieldManager.c = r10     // Catch: java.lang.Throwable -> L48
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L48
            return
        L7e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L48
            throw r10
    }
}
