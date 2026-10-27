package com.kuaishou.weapon.p0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class dm {
    private static com.kuaishou.weapon.p0.dm.a a;

    public enum a extends java.lang.Enum<com.kuaishou.weapon.p0.dm.a> {
        public static final com.kuaishou.weapon.p0.dm.a a = null;
        public static final com.kuaishou.weapon.p0.dm.a b = null;
        public static final com.kuaishou.weapon.p0.dm.a c = null;
        private static final /* synthetic */ com.kuaishou.weapon.p0.dm.a[] d = null;

        static {
                com.kuaishou.weapon.p0.dm$a r0 = new com.kuaishou.weapon.p0.dm$a
                java.lang.String r1 = "UNKNOWN"
                r2 = 0
                r0.<init>(r1, r2)
                com.kuaishou.weapon.p0.dm.a.a = r0
                com.kuaishou.weapon.p0.dm$a r1 = new com.kuaishou.weapon.p0.dm$a
                java.lang.String r3 = "ARMEABI_V7A"
                r4 = 1
                r1.<init>(r3, r4)
                com.kuaishou.weapon.p0.dm.a.b = r1
                com.kuaishou.weapon.p0.dm$a r3 = new com.kuaishou.weapon.p0.dm$a
                java.lang.String r5 = "ARM64_V8A"
                r6 = 2
                r3.<init>(r5, r6)
                com.kuaishou.weapon.p0.dm.a.c = r3
                r5 = 3
                com.kuaishou.weapon.p0.dm$a[] r5 = new com.kuaishou.weapon.p0.dm.a[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                com.kuaishou.weapon.p0.dm.a.d = r5
                return
        }

        a(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.kuaishou.weapon.p0.dm.a valueOf(java.lang.String r1) {
                java.lang.Class<com.kuaishou.weapon.p0.dm$a> r0 = com.kuaishou.weapon.p0.dm.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.kuaishou.weapon.p0.dm$a r1 = (com.kuaishou.weapon.p0.dm.a) r1
                return r1
        }

        public static com.kuaishou.weapon.p0.dm.a[] values() {
                com.kuaishou.weapon.p0.dm$a[] r0 = com.kuaishou.weapon.p0.dm.a.d
                java.lang.Object r0 = r0.clone()
                com.kuaishou.weapon.p0.dm$a[] r0 = (com.kuaishou.weapon.p0.dm.a[]) r0
                return r0
        }
    }

    private dm() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(android.content.Context r0) {
            boolean r0 = b(r0)
            if (r0 == 0) goto L9
            java.lang.String r0 = "arm64-v8a"
            return r0
        L9:
            java.lang.String r0 = "armeabi-v7a"
            return r0
    }

    public static boolean b(android.content.Context r2) {
            r0 = 0
            com.kuaishou.weapon.p0.dm$a r2 = c(r2)     // Catch: java.lang.Throwable -> Lb
            com.kuaishou.weapon.p0.dm$a r1 = com.kuaishou.weapon.p0.dm.a.c     // Catch: java.lang.Throwable -> Lb
            if (r2 != r1) goto Lb
            r2 = 1
            return r2
        Lb:
            return r0
    }

    private static com.kuaishou.weapon.p0.dm.a c(android.content.Context r4) {
            com.kuaishou.weapon.p0.dm$a r0 = com.kuaishou.weapon.p0.dm.a
            if (r0 == 0) goto L5
            return r0
        L5:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L19
            boolean r4 = com.bytedance.pangle.up.a.a()
            if (r4 == 0) goto L14
            com.kuaishou.weapon.p0.dm$a r4 = com.kuaishou.weapon.p0.dm.a.c
            goto L16
        L14:
            com.kuaishou.weapon.p0.dm$a r4 = com.kuaishou.weapon.p0.dm.a.b
        L16:
            com.kuaishou.weapon.p0.dm.a = r4
            goto L60
        L19:
            java.lang.String r0 = "dalvik.system.VMRuntime"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = "getRuntime"
            r2 = 0
            java.lang.reflect.Method r1 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Throwable -> L44
            java.lang.String r3 = "is64Bit"
            java.lang.reflect.Method r3 = r0.getDeclaredMethod(r3, r2)     // Catch: java.lang.Throwable -> L44
            java.lang.Object r0 = r1.invoke(r0, r2)     // Catch: java.lang.Throwable -> L44
            java.lang.Object r0 = r3.invoke(r0, r2)     // Catch: java.lang.Throwable -> L44
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L44
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L3f
            com.kuaishou.weapon.p0.dm$a r0 = com.kuaishou.weapon.p0.dm.a.c     // Catch: java.lang.Throwable -> L44
            goto L41
        L3f:
            com.kuaishou.weapon.p0.dm$a r0 = com.kuaishou.weapon.p0.dm.a.b     // Catch: java.lang.Throwable -> L44
        L41:
            com.kuaishou.weapon.p0.dm.a = r0     // Catch: java.lang.Throwable -> L44
            goto L60
        L44:
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r4 = r4.nativeLibraryDir     // Catch: java.lang.Throwable -> L5c
            java.lang.String r0 = "arm64"
            boolean r4 = r4.contains(r0)     // Catch: java.lang.Throwable -> L5c
            if (r4 == 0) goto L57
            com.kuaishou.weapon.p0.dm$a r4 = com.kuaishou.weapon.p0.dm.a.c     // Catch: java.lang.Throwable -> L5c
            com.kuaishou.weapon.p0.dm.a = r4     // Catch: java.lang.Throwable -> L5c
            goto L60
        L57:
            com.kuaishou.weapon.p0.dm$a r4 = com.kuaishou.weapon.p0.dm.a.a     // Catch: java.lang.Throwable -> L5c
            com.kuaishou.weapon.p0.dm.a = r4     // Catch: java.lang.Throwable -> L5c
            goto L60
        L5c:
            com.kuaishou.weapon.p0.dm$a r4 = com.kuaishou.weapon.p0.dm.a.a
            com.kuaishou.weapon.p0.dm.a = r4
        L60:
            com.kuaishou.weapon.p0.dm$a r4 = com.kuaishou.weapon.p0.dm.a
            return r4
    }
}
